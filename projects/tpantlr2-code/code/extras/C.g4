grammar C;

file:	(func | var)+ ;

func:	type ID '(' ')' '{' '}' ;

var :	'extern'? type ID ';' ;

type:	'int'
	|	'void'
	;

ID	:	[a-zA-Z]+ ;

INT :   [0-9]+ ;

WS  :   [ \t\n\r]+ -> channel(HIDDEN) ;

SL_COMMENT
    :   '//' .*? '\r'? '\n' -> channel(HIDDEN)
    ;
