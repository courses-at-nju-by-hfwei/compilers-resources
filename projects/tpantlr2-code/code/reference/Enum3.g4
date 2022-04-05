lexer grammar Enum3;
ENUM:   [a-z]+ {getText().equals("enum")}?
        {System.out.println("enum!");}
    ;
ID  :   [a-z]+ {System.out.println("ID "+getText());} ;
WS  :   [ \n] -> skip ;
