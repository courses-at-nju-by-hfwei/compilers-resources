grammar NestedNameList;
list     : '[' elements ']' ;        // match bracketed list
elements : element (',' element)* ;  // match comma-separated list
element  : NAME | list ;             // element is name or nested list
NAME     : ('a'..'z'|'A'..'Z')+ ;    // NAME is sequence of >=1 letter
