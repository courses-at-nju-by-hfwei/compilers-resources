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

bottomup // match subexpressions innermost to outermost
    :   exprRoot
    |	decl
    |	ret
    |	assignment
    |	ifstat
    ;

// promotion and type checking

// START: ifstat
ifstat : ^('if' cond=. s=. e=.?) {symtab.ifstat($cond);} ;
// END: ifstat

decl:   ^(VAR_DECL . ID (init=.)?) // call declinit if we have init expr
        {if ( $init!=null && $init.evalType!=null )
             symtab.declinit($ID, $init);}
    ;    

ret :   ^('return' v=.) {symtab.ret((MethodSymbol)$start.symbol, $v);} ;

assignment // don't walk expressions, just examine types
    :   ^('=' lhs=. rhs=.) {symtab.assign($lhs, $rhs);}
    ;

// type computations and checking

exprRoot // invoke type computation rule after matching EXPR
    :   ^(EXPR expr) {$EXPR.evalType = $expr.type;} // annotate AST
    ;

expr returns [Type type]
@after { $start.evalType = $type; }
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

binaryOps returns [Type type]
@after { $start.evalType = $type; }
	:	(	^(bop a=expr b=expr)    {$type=symtab.bop($a.start, $b.start);}
		|	^(relop a=expr b=expr)  {$type=symtab.relop($a.start, $b.start);}
		|	^(eqop a=expr b=expr)   {$type=symtab.eqop($a.start, $b.start);}
		)
	;

arrayRef returns [Type type]
	:	^(INDEX ID expr)
		{
		$type = symtab.arrayIndex($ID, $expr.start);
        $start.evalType = $type;
		}
	;

call returns [Type type]
@init {List args = new ArrayList();}
	:	^(CALL ID ^(ELIST (expr {args.add($expr.start);})*))
		{
		$type = symtab.call($ID, args);
		$start.evalType = $type;
		}
    ;

member returns [Type type]
	:	^('.' expr ID)	
		{
		$type = symtab.member($expr.start, $ID);
		$start.evalType = $type;
		}
    ;

bop	:	'+' | '-' | '*' | '/' ;

relop:	'<' | '>' | '<=' | '>=' ;

eqop:	'!=' | '==' ;
