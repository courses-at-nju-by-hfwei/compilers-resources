grammar F;
group
    : '[' expr ']'      // Tokens following ref to expr: {']'}
    | '(' expr ')'      // Tokens following ref to expr: {')'}
    ;
expr: atom '^' INT ;    // Tokens following ref to atom: {'^'}
atom: ID
    | INT
    ;

INT :   [0-9]+ ;
ID  :   [a-zA-Z]+ ;
WS  :   [ \t\r\n]+ -> skip ;
