grammar Enum;
@parser::members {public static boolean java5;}

prog:   (   stat 
        |   enumDecl
        )+
    ;

stat:   id '=' expr ';' {System.out.println($id.text+"="+$expr.text);} ;

expr
    :   id
    |   INT
    ;

enumDecl
    :   {java5}? 'enum' name=id '{' id (',' id)* '}'
        {System.out.println("enum "+$name.text);}
    ;

id  :   ID
    |   {!java5}? 'enum'
    ;
    
ID  :   [a-zA-Z]+ ;
INT :   [0-9]+ ;
WS  :   [ \t\r\n]+ -> skip ;
