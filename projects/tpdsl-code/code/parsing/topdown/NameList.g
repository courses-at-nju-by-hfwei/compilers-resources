grammar NameList;                 // header needed by ANTLR

// parser syntactic rules
list     : '[' elements ']' ;     // list is a bracketed element list
elements : NAME (',' NAME)* ;     // match comma-separated name list

// lexer lexical rules (must start with uppercase letter for ANTLR)
NAME     : ('a'..'z'|'A'..'Z')+ ; // name is sequence of >=1 letter

