grammar CppExpr;

/** Distinguish between alts 1, 2 using idealized predicates as demo */
expr:   {isfunc(ID)}? ID '(' expr ')' // func call with 1 arg
    |   {istype(ID)}? ID '(' expr ')' // ctor-style type cast of expr
    |   INT                       // integer literal
    |   ID                        // identifier
    ;

ID  :   [a-zA-Z]+ ;
INT :   [0-9]+ ;
WS  :   [ \t\n\r]+ -> skip ;