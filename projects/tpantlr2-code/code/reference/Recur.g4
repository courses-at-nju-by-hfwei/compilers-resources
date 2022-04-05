lexer grammar Recur;

ACTION : '{' ( ACTION | ~[{}] )* '}' ;

WS     : [ \r\t\n]+ -> skip ;
