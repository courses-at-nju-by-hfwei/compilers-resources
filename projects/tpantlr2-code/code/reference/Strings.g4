lexer grammar Strings;
LQUOTE : '"' -> more, mode(STR) ;
WS     : [ \r\t\n]+ -> skip ;

mode STR;

STRING : '"' -> mode(DEFAULT_MODE) ; // token we want parser to see
TEXT   : .   -> more ;               // collect more text for string
