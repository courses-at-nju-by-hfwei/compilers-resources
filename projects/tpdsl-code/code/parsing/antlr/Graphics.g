// START: grammar
grammar Graphics;

file : command+ ; // a file is a list of commands

command : 'line' 'from' point 'to' point ;

point : INT ',' INT ; // E.g., "0,10"
// END: grammar

// START: lex
INT : '0'..'9'+ ; // lexer rule to match 1-or-more digits

/** Skip whitespace */
WS : (' ' | '\t' | '\r' | '\n') {skip();} ;
// END: lex

