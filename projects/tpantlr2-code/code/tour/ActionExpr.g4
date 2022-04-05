grammar ActionExpr;

@parser::header {
import java.util.*;
}
@parser::members {
    Map<String, Integer> memory = new HashMap<String, Integer>();
}

/** The start rule; begin parsing here. */
prog:   stat+ ; 

stat:   expr NEWLINE               {System.out.println($expr.v);}
    |   ID '=' expr NEWLINE        {
                                   String id = $ID.getText();
                                   memory.put(id, $expr.v);
                                   }
    |   NEWLINE                   
    ;

expr returns [int v]
    :   a=expr op=('*'|'/') b=expr {
                                   if ( $op.getType()==MUL ) $v = $a.v * $b.v;
                                   else $v = $a.v / $b.v;
                                   }
    |   a=expr op=('+'|'-') b=expr {
                                   if ( $op.getType()==ADD ) $v = $a.v + $b.v;
                                   else $v = $a.v - $b.v;
                                   }        
    |   INT                        {$v = Integer.valueOf($INT.getText());}         
    |   ID                         {
                                   String id = $ID.getText();
                                   if ( memory.containsKey(id) ) {
                                       $v = memory.get(id);
                                   }
                                   }
    |   '(' e=expr ')'             {$v = $e.v;}
    ;

MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace
