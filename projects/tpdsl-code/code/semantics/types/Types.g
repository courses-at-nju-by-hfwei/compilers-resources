// START: header
tree grammar Types;
options {
  tokenVocab = Cymbol;
  ASTLabelType = CymbolAST;
  filter = true;
}
@members {
    SymbolTable symtab;
    public Types(TreeNodeStream input, SymbolTable symtab) {
        this(input);
        this.symtab = symtab;
    }
}
// END: header

// START: root
bottomup // match subexpressions innermost to outermost
    :   exprRoot // only match the start of expressions (root EXPR)
    ;

exprRoot // invoke type computation rule after matching EXPR
    :   ^(EXPR expr) {$EXPR.evalType = $expr.type;} // annotate AST
    ;
// END: root

// START: expr
expr returns [Type type]
@after { $start.evalType = $type; } // do after any alternative
    :   'true'      {$type = SymbolTable._boolean;}
    |   'false'     {$type = SymbolTable._boolean;}
    |   CHAR        {$type = SymbolTable._char;}
    |   INT         {$type = SymbolTable._int;}
    |   FLOAT       {$type = SymbolTable._float;}
    |   ID {VariableSymbol s=(VariableSymbol)$ID.scope.resolve($ID.text);
            $ID.symbol = s; $type = s.type;}
    |   ^(UNARY_MINUS a=expr)   {$type=symtab.uminus($a.start);}
    |   ^(UNARY_NOT a=expr)     {$type=symtab.unot($a.start);}
    |   member      {$type = $member.type;}
    |   arrayRef    {$type = $arrayRef.type;}
    |   call        {$type = $call.type;}
    |   binaryOps   {$type = $binaryOps.type;}
    ;
// END: expr

// START: binaryOps
binaryOps returns [Type type]
@after { $start.evalType = $type; }
    :   ^(bop a=expr b=expr)   {$type=symtab.bop($a.start, $b.start);}
    |   ^(relop a=expr b=expr) {$type=symtab.relop($a.start, $b.start);}
    |   ^(eqop a=expr b=expr)  {$type=symtab.eqop($a.start, $b.start);}
    ;
// END: binaryOps

// START: arrayRef
arrayRef returns [Type type]
    :   ^(INDEX ID expr)
        {
        $type = symtab.arrayIndex($ID, $expr.start);
        $start.evalType = $type; // save computed type
        }
    ;
// END: arrayRef

// START: call
call returns [Type type]
@init {List args = new ArrayList();}
    :   ^(CALL ID ^(ELIST (expr {args.add($expr.start);})*))
        {
        $type = symtab.call($ID, args);
        $start.evalType = $type;
        }
    ;
// END: call

// START: member
member returns [Type type]
    :   ^('.' expr ID)           // match expr.ID subtrees
        { // $expr.start is root of tree matched by expr rule
        $type = symtab.member($expr.start, $ID); 
        $start.evalType = $type; // save computed type
        }
    ;
// END: member

bop :   '+' | '-' | '*' | '/' ;

relop:  '<' | '>' | '<=' | '>=' ;

eqop:   '!=' | '==' ;
