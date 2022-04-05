grammar ELang;
stat : (expr ';')+ ;
expr : ID ;
WS   : [ \r\t\n]+ -> skip ;
ID   : [a-z]+ ;
