grammar Call;

stat:   fcall ';' ;
fcall
    :   ID '(' expr ')'
    |   ID '(' expr ')' ')' {notifyErrorListeners("Too many parentheses");}
    |   ID '(' expr         {notifyErrorListeners("Missing closing ')'");}
    ;

expr:   '(' expr ')'
    |   INT
    ;

INT :   [0-9]+ ;
ID  :   [a-zA-Z]+ ;
WS  :   [ \t\r\n]+ -> skip ; 
