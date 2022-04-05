grammar NameList;

// String list = "\\["+elements+"\\]";
list     : '[' elements ']' ;        // match bracketed list

// String elements = space+element+
//                   "("+space+","+space+element+")*"+space;
elements : element (',' element)* ;  // match comma-separated list

// String element = "("+list+"|"+name+")";
element  : name | list ;             // element is name or nested list

// String name = "\\w+";
name     : LETTER+ ;                 // name is sequence of >=1 letter

LETTER   : 'a'..'z'|'A'..'Z';        // define what a letter is (\w)
WS       : (' '|'\t'|'\n'|'\r')+ {skip();} ; // throw out whitespace
