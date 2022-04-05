// START: header
tree grammar Def;
options {
  tokenVocab = Cymbol;
  ASTLabelType = CymbolAST;
  filter = true;
}
@members {
    SymbolTable symtab;
    Scope currentScope;
    MethodSymbol currentMethod;
    public Def(TreeNodeStream input, SymbolTable symtab) {
        this(input);
        this.symtab = symtab;
        currentScope = symtab.globals;
    }
}
// END: header

topdown
    :   enterBlock
    |   enterMethod
    |   enterClass
    |   atoms
    |   varDeclaration
    |   ret
    ;

bottomup
    :   exitBlock
    |   exitMethod
    |   exitClass
    ;

// S C O P E S

enterBlock
    :   BLOCK {currentScope = new LocalScope(currentScope);} // push scope
    ;
exitBlock
    :   BLOCK
        {
        //System.out.println("locals: "+currentScope);
        currentScope = currentScope.getEnclosingScope();    // pop scope
        }
    ;

// START: class
enterClass
    :   ^('class' name=ID (^(':' sup=ID))? .)
        { // Def class but leave superclass blank until ref phase
        ClassSymbol superclass = null;
        if ( $sup!=null ) { // can only ref classes above in file
            superclass = (ClassSymbol)currentScope.resolve($sup.text); // find superclass
            $sup.symbol = superclass;
        }
        ClassSymbol cs = new ClassSymbol($name.text, currentScope, superclass);
        cs.def = $name;           // point from symbol table into AST
        $name.symbol = cs;        // point from AST into symbol table
        currentScope.define(cs);  // def struct in current scope
        currentScope = cs;        // set current scope to struct scope
        }
    ;
// END: class

exitClass
    :   'class' {currentScope = currentScope.getEnclosingScope();}   // pop scope
    ;

enterMethod
    :   ^(METHOD_DECL type ID .*) // match method subtree with 0-or-more args
        {
        //System.out.println("line "+$ID.getLine()+": def method "+$ID.text);
        MethodSymbol ms = new MethodSymbol($ID.text,$type.type,currentScope);
        currentMethod = ms;
        ms.def = $ID;            // track AST location of def's ID
        $ID.symbol = ms;         // track in AST
        currentScope.define(ms); // def method in globals
        currentScope = ms;       // set current scope to method scope
        }
    ;

/** Track method associated with this return. */
ret :   ^('return' .) {$ret.start.symbol = currentMethod;}
    ;
    
exitMethod
    :   METHOD_DECL
        {
        currentScope = currentScope.getEnclosingScope();    // pop method scope
        }
    ;

// D e f i n e  s y m b o l s

// START: atoms
/** Set scope for any identifiers in expressions or assignments */
atoms
@init {CymbolAST t = (CymbolAST)input.LT(1);}
    :  {t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN)}? ID
       {t.scope = currentScope;}
    ;
//END: atoms

// START: var
varDeclaration // global, parameter, or local variable
    :   ^((FIELD_DECL|VAR_DECL|ARG_DECL) type ID .?)
        {
        //System.out.println("line "+$ID.getLine()+": def "+$ID.text);
        VariableSymbol vs = new VariableSymbol($ID.text,$type.type);
        vs.def = $ID;            // track AST location of def's ID
        $ID.symbol = vs;         // track in AST
        currentScope.define(vs);
        }
    ;
// END: field

/** Not included in tree pattern matching directly.  Needed by declarations */
// START: type
type returns [Type type]
    :   ^('*' typeElement)  {$type = new PointerType($typeElement.type);}
    |   typeElement         {$type = $typeElement.type;}
    ;
// END: type

/** Not included in tree pattern matching directly.  Needed by declarations */
typeElement returns [Type type]
@init {CymbolAST t = (CymbolAST)input.LT(1);}
@after {
    t.symbol = currentScope.resolve(t.getText()); // return Type
    t.scope = currentScope;
    $type = (Type)t.symbol;
}
    :   'float'
    |   'int'
    |   'char'
    |   'boolean'
    |   'void'
    |   ID // class name
    ;
