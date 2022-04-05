grammar FigNoActions;

// START: file
file : object+ ; // a file is 1-or-more objects

object
    :   type ID '{' property* '}' // 0-or-more properties
    ;

type:   ID ('.' ID)* ; // qualified ID like java.util.List
// END: file

// START: property
property
    :   ID '=' expr ';'
    ;
    
expr:   STRING
    |   INT
    |   '$' ID // reference to a previous instance
    |   list
    ;

list:   '[' expr (',' expr)* ']' // list of expressions
    |   '[' ']' // empty list
    ;
// END: property

// START: lex
INT :   '0'..'9'+ ; // 1-or-more digits
/** An ID must start with letter or _ but can have digit beyond first */
ID  :   ('_'|'a'..'z'|'A'..'Z') ('_'|'a'..'z'|'A'..'Z'|'0'..'9')* ;
STRING : '"' .* '"' ; // anything in quotes
WS  :   (' '|'\n'|'\t')+   {skip();} ; // skip whitespace and comments
SLCMT:  '//' .* '\r'? '\n' {skip();} ; // match '//' then scarf til \n
CMT :   '/*' .* '*/'       {skip();} ; // match anything in '/*' and '*/'
// END: lex
