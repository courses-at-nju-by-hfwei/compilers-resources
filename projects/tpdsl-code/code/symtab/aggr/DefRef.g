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
    |   enterStruct
    |   varDeclaration
    |   resolveExpr
    |   assignment
    ;

bottomup
    :   exitBlock
    |   exitMethod
    |   exitStruct
    ;

// S C O P E S

enterBlock
    :   BLOCK {currentScope = new LocalScope(currentScope);} // push scope
    ;
exitBlock
    :   BLOCK
        {
        System.out.println("locals: "+currentScope);
        currentScope = currentScope.getEnclosingScope();    // pop scope
        }
    ;

// START: struct
enterStruct // match as we discover struct nodes (on the way down)
    : ^('struct' ID .+)
      {
      System.out.println("line "+$ID.getLine()+": def struct "+$ID.text);
      StructSymbol ss = new StructSymbol($ID.text, currentScope);
      currentScope.define(ss); // def struct in current scope
      currentScope = ss;       // set current scope to struct scope
      }
    ;
exitStruct // match as we finish struct nodes (on the way up)
    :   'struct' // don't care about children, just trigger upon struct
        {
        System.out.println("fields: "+currentScope);
        currentScope = currentScope.getEnclosingScope();    // pop scope
        }
    ;
// END: struct

enterMethod
    :   ^(METHOD_DECL type ID .*) // match method subtree with 0-or-more args
        {
        System.out.println("line "+$ID.getLine()+": def method "+$ID.text);
        MethodSymbol ms = new MethodSymbol($ID.text,$type.tsym,currentScope);
        currentScope.define(ms); // def method in globals
        currentScope = ms;       // set current scope to method scope
        }
    ;
exitMethod
    :   METHOD_DECL
        {
        System.out.println("args: "+currentScope);
        currentScope = currentScope.getEnclosingScope();    // pop method scope
        }
    ;

// D e f i n e  s y m b o l s

// START: var
varDeclaration // global, parameter, or local variable
    :   ^((FIELD_DECL|VAR_DECL|ARG_DECL) type ID .?)
        {
        System.out.println("line "+$ID.getLine()+": def "+$ID.text);
        VariableSymbol vs = new VariableSymbol($ID.text,$type.tsym);
        currentScope.define(vs);
        }
    ;
// END: field

/** Not included in tree pattern matching directly.  Needed by declarations */
type returns [Type tsym]
@after {$tsym = (Type)currentScope.resolve($text);} // return Type
    :   'float'
    |   'int'
    |   'void'
    |   ID // struct name
    ;
    
// R e s o l v e  I D s

assignment
    :   ^( eq='=' member . )
        {
        System.out.println("line "+$eq.getLine()+": assign to type "+
                           $member.type.getName());
        }
    ;

resolveExpr : ^(EXPR member) ;

// START: member
member returns [Type type] // expr.x; E.g., "a", "a.b", "a.b.c", ...
    : ^('.' m=member ID)
      {
      StructSymbol scope=(StructSymbol)$m.type;// get scope of expr
      Symbol s = scope.resolveMember($ID.text);// resolve ID in scope
      System.out.println("line "+$ID.getLine()+": ref "+
                         $m.type.getName()+"."+$ID.text+"="+s);
      if ( s!=null ) $type = s.type;           // return ID's type
      }
    | ID                                       // resolve, return type
      {
      Symbol s = currentScope.resolve($ID.text);
      System.out.println("line "+$ID.getLine()+": ref "+$ID.text+"="+s);
      if ( s!=null ) $type = s.type;
      }
    ;
// END: member
