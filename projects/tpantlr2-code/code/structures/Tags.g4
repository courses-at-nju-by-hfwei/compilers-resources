lexer grammar Tags;

TAG_START : '<' {pushMode(ISLAND); more();} ;
TEXT : ~'<'+ ;

mode ISLAND;

TAG_STOP : '>'     {popMode();} ;
TAG_STUFF : ~'>'+  {more();} ;
