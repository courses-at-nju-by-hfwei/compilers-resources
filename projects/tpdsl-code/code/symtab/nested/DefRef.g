// START: header
tree grammar DefRef;
options {
  tokenVocab = Cymbol;
  ASTLabelType = CommonTree;
  filter = true;
}
@members {
    SymbolTable symtab;
    Scope currentScope;
    public DefRef(TreeNodeStream input, SymbolTable symtab) {
        this(input);
        this.symtab = symtab;
        currentScope = symtab.globals;
    }
}
// END: header

topdown
    :   enterBlock
    |   enterMethod
    |   varDeclaration
    ;

bottomup
    :   exitBlock
    |   exitMethod
    |   assignment
    |   idref
    ;

// S C O P E S

// START: block
enterBlock
    :   BLOCK {currentScope = new LocalScope(currentScope);}// push scope
    ;
exitBlock
    :   BLOCK
        {
        System.out.println("locals: "+currentScope);
        currentScope = currentScope.getEnclosingScope();    // pop scope
        }
    ;
// END: block

// START: method
enterMethod // match method subtree with 0-or-more args
    :   ^(METHOD_DECL type ID .*) 
        {
        System.out.println("line "+$ID.getLine()+": def method "+
                           $ID.text);
        Type retType = $type.tsym; // rule type returns a Type symbol
        MethodSymbol ms = new MethodSymbol($ID.text,retType,
                                           currentScope);
        currentScope.define(ms); // def method in globals
        currentScope = ms;       // set current scope to method scope
        }
    ;
exitMethod
    :   METHOD_DECL
        {
        System.out.println("args: "+currentScope);
        currentScope = currentScope.getEnclosingScope();// pop method scope
        }
    ;
// END: method

// D e f i n e  s y m b o l s

// START: var
varDeclaration // global, parameter, or local variable
    :   ^((ARG_DECL|VAR_DECL) type ID .?) 
        {
        System.out.println("line "+$ID.getLine()+": def "+$ID.text);
        VariableSymbol vs = new VariableSymbol($ID.text,$type.tsym);
        currentScope.define(vs);
        }
    ;
// END: var

/** Not included in tree pattern matching directly.  Needed by declarations */
type returns [Type tsym]
@after {$tsym = (Type)currentScope.resolve($text);} // return Type
    :   'float'
    |   'int'
    |   'void'
    ;

// R e s o l v e  I D s

assignment
    :   ^('=' ID .)
        {
        VariableSymbol vs = (VariableSymbol)currentScope.resolve($ID.text);
        System.out.println("line "+$ID.getLine()+": assign to "+vs);
        }
    ;

// START: idref
idref
    :   {$start.hasAncestor(EXPR)}? ID
        {
        Symbol s = currentScope.resolve($ID.text);
        System.out.println("line "+$ID.getLine()+": ref "+s);
        }
    ;
// END: idref
