grammar Expr;

stat: expr ';' ;

expr:   expr '*' expr       // precedence 4
    |   expr '+' expr       // precedence 3
    |   INT                 // primary (precedence 2)
    |   ID                  // primary (precedence 1)
    ;

ID  :   [a-zA-Z]+ ;
INT :   [0-9]+ ;
WS  :   [ \t\n\r]+ -> skip ;
