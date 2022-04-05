grammar Pred;

assign
    : ID '=' v=INT {$v.int>0}? ';'
      {System.out.println("assign "+$ID.text+" to ");}
    ;

INT :   [0-9]+ ;
ID  :   [a-zA-Z]+ ;
WS  :   [ \t\r\n]+ -> skip ;

