grammar PredCppStat;

@parser::header {
import java.util.*;
}

@parser::members {
Set<String> types = new HashSet<String>() {{add("T");}};
boolean istype() { return types.contains(getCurrentToken().getText()); }
}

stat:   decl ';'  {System.out.println("decl "+$decl.text);}
    |   expr ';'  {System.out.println("expr "+$expr.text);}
    ;

decl:   ID ID                         // E.g., "Point p"
    |   {istype()}? ID '(' ID ')'     // E.g., "Point (p)", same as ID ID
    ;

expr:   INT                           // integer literal
    |   ID                            // identifier
    |   {!istype()}? ID '(' expr ')'  // function call
    ;

ID  :   [a-zA-Z]+ ;
INT :   [0-9]+ ;
WS  :   [ \t\n\r]+ -> skip ;