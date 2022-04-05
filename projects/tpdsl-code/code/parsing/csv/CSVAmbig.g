grammar CSVAmbig;
options {language=Python;} // which target?

file : header row+ EOF ;
header: row ;
row : STRING (',' STRING)* '\n'  // general row (matches STRING \n) too
	| STRING '\n' // handle single string rows (dead code)
    ;

/** Match \" or anything but " in ".." */
STRING : '"' ('\\' '"'|~'"')* '"' ;
CMT: '#' ~'\n'+ '\n' {self.skip();} ;
WS : ' '+ {self.skip();} ;
