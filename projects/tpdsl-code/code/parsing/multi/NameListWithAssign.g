grammar NameListWithAssign;

list     : '[' elements ']' ;        // match bracketed list
elements : element (',' element)* ;  // match comma-separated list
element  : NAME '=' NAME             // match assignment such as a=b
         | NAME
         | list
         ;
NAME     : LETTER+ ;                 // NAME is sequence of >=1 letter
LETTER   : 'a'..'z'|'A'..'Z';        // define what a letter is (\w)
WS       : (' '|'\t'|'\n'|'\r')+ {skip();} ; // throw out whitespace
