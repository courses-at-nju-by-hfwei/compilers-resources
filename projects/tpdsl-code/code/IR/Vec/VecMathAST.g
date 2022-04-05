// START: header
grammar VecMathAST;
options {output=AST;} // we want to create ASTs
tokens {VEC;} // define imaginary token for vector literal
// END: header

// START: stat
statlist : stat+ ;                    // builds list of stat trees
stat: ID '=' expr  -> ^('=' ID expr)  // '=' is operator subtree root
    | 'print' expr -> ^('print' expr) // 'print' is subtree root
    ;
// END: stat

// START: expr
expr:   multExpr ('+'^ multExpr)* ;        // '+' is root node
multExpr: primary (('*'^|'.'^) primary)* ; // '*', '.' are roots
primary
    :   INT   // automatically create AST node from INT's text
    |   ID    // automatically create AST node from ID's text
    |   '[' expr (',' expr)* ']' -> ^(VEC expr+)
    ;
// END: expr

ID  :   'a'..'z'+ ;
INT :   '0'..'9'+ ;
WS  :   (' '|'\r'|'\n')+ {skip();} ;
