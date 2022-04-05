grammar T;
stat: expr ';'        // expression statement
    | ID '(' ')' ';'  // function call statement
    ;
expr: ID '(' ')'
    | INT
    ;
INT : [0-9]+ ;
ID: 'a'..'z'+ ;
WS: (' '|'\n'|'\r')+   {$channel=HIDDEN;} ; // ignore whitespace
