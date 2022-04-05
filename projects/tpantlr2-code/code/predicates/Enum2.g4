grammar Enum2;
@lexer::members {public static boolean java5 = false;}

prog:   (   stat 
        |   enumDecl
        )+
    ;

stat:   ID '=' expr ';' {System.out.println($ID.text+"="+$expr.text);} ;

expr:   ID
    |   INT
    ;

// No predicate needed here because 'enum' token undefined if !java5
enumDecl
    :   'enum' name=ID '{' ID (',' ID)* '}'
        {System.out.println("enum "+$name.text);}
    ;

ENUM:   'enum' {java5}? ; // must be before ID
ID  :   [a-zA-Z]+ ;


INT :   [0-9]+ ;
WS  :   [ \t\r\n]+ -> skip ;
