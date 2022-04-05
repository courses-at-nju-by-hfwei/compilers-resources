// START: header
grammar VecMathHetero;
options {output=AST;} // we want to create ASTs
tokens {
	VEC;         // define imaginary token for vector literal
	ASSIGN='='; //
	PRINT='print';
	PLUS='+';
	MULT='*';
	DOT='.';
}
// END: header

// START: stat
prog: stat+ ;                         // builds list of stat trees
stat: ID '=' expr  -> ^('=' ID<VarNode> expr)  // '=' is operator subtree root
    | 'print' expr -> ^('print' expr) // 'print' is subtree root
    ;
// END: stat

// START: expr
expr:   multExpr ('+'<AddNode>^ multExpr)* ;        // '+' is root node
multExpr: primary (('*'<MultNode>^|'.'<DotProductNode>^) primary)* ; // '*', '.' are roots
primary
    :   INT<IntNode>
    |   ID<VarNode>
    |   '[' expr (',' expr)* ']' -> ^(VEC<VectorNode> expr+)
    ;
// END: expr

ID  :   'a'..'z'+ ;
INT :   '0'..'9'+ ;
WS  :   (' '|'\r'|'\n')+ {skip();} ;
