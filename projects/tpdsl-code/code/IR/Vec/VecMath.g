grammar VecMath;

// START: stat
statlist : stat+ ;    // match multiple statements
stat: ID '=' expr     // match an assignment like "x=3+4"
    | 'print' expr    // match a print statement like "print 4"
    ;
// END: stat

// START: expr
expr:   multExpr ('+' multExpr)* ;       // E.g., "3*4 + 9"
multExpr: primary (('*'|'.') primary)* ; // E.g., "3*4"
primary
    :   INT                              // any integer
    |   ID                               // any variable name
    |   '[' expr (',' expr)* ']'        // vector literal; E.g. "[1,2,3]"
    ;
// END: expr

ID  :   'a'..'z'+ ;
INT :   '0'..'9'+ ;
WS  :   (' '|'\r'|'\n')+ {skip();} ;
