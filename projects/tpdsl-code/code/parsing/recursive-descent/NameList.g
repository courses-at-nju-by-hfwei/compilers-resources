grammar NameList;

// START: parser
list     : '[' elements ']' ;        // match bracketed list
elements : element (',' element)* ;  // match comma-separated list
element  : NAME | list ;             // element is name or nested list
// END: parser

// START: lexer
NAME     : LETTER+ ;                 // name is sequence of >=1 letter
LETTER   : 'a'..'z'|'A'..'Z';        // define what a letter is
WS       : (' '|'\t'|'\n'|'\r')+ {skip();} ; // throw out whitespace
// END: lexer
