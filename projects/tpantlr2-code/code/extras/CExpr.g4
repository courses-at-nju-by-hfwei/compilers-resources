grammar CExpr;

stat:   expr ';' ;

expr:   expr '.' ID                 // suffix operator, precedence 11
    |   expr '[' expr ']'           // suffix operator, precedence 10
    |   '-' expr                    // prefix operator, precedence 9
    |   expr ('*'|'/') expr         // binary operator, precedence 8
    |   expr ('+'|'-') expr         // binary operator, precedence 7
    |   expr '&' expr               // binary operator, precedence 6
    |   expr '?' expr ':' expr      // ternary operator, precedence 5
    |   expr '='<assoc=right> expr  // binary right-associative op, prec 4
    |   ID                          // primary
    |   INT                         // primary
    |   '(' expr ')'                // primary
    ;

ID  :   [a-zA-Z]+ ;
INT :   [0-9]+ ;
WS  :   [ \t\n\r]+ -> skip ;
