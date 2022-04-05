grammar CSV;
options {language=Python;} // which target?

file : header row+ EOF ;
header: row ;
row : STRING (',' STRING)* '\n' ;

/** Match \" or anything but " in ".." */
STRING : '"' ('\\' '"'|~'"')* '"' ;
CMT: '#' ~'\n'+ '\n' {self.skip();} ;
WS : ' '+ {self.skip();} ;
