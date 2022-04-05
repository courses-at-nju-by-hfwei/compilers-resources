grammar Actions;

s : (ACTION1|ACTION2|ACTION3)* ;

ACTION1 : '{' ( STRING | . )*? '}' ;    // Allows {"foo}
ACTION2 : '[' ( STRING | ~'"' )*? ']' ; // Doesn't allow ["foo]; nongreedy *?
ACTION3 : '<' ( STRING | ~[">] )* '>' ; // Doesn't allow <"foo>; greedy *
STRING : '"' ( '\\"' | . )*? '"' ;
WS     : [ \r\t\n]+ -> skip ;
