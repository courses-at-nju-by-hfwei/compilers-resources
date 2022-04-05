grammar CDecl;

decl: 'int' declarator ';' ;  

declarator
    :   declarator '[' expr ']'
    |   declarator '[' ']'
    |   declarator '(' ')'
    |   '*' declarator
    |   '(' declarator ')'
    |   ID
    ;

expr:   INT ;

ID  :   [a-zA-Z]+ ;
INT :   [0-9]+ ;
WS  :   [ \t\n\r]+ -> skip ;
