grammar Ambig;

stat: expr ';'        // expression statement
    | ID '(' ')' ';'  // function call statement
    ;

expr: ID '(' ')'
    | INT
    ;

INT :   [0-9]+ ;
ID  :   [a-zA-Z]+ ;
WS  :   [ \t\r\n]+ -> skip ; 
