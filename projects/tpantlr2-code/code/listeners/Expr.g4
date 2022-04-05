grammar Expr;
s : e ;
e : e op=MULT e    // MULT is '*'
  | e op=ADD e     // ADD is '+'
  | INT
  ;

MULT: '*' ;
ADD : '+' ;
INT : [0-9]+ ;
WS : [ \t\n]+ -> skip ;
