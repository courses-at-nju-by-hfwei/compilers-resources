grammar Keywords;
@lexer::header {    // place this header action only in lexer, not the parser
import java.util.*;
}

// explicitly define keyword token types to avoid implicit def warnings
tokens { BEGIN, END, IF, THEN, WHILE }

@lexer::members {   // place this class member only in lexer
Map<String,Integer> keywords = new HashMap<String,Integer>() {{
    put("begin", KeywordsParser.BEGIN);
    put("end",   KeywordsParser.END);
    put("if",    KeywordsParser.IF);
    put("then",  KeywordsParser.THEN);
    put("while", KeywordsParser.WHILE);
}};
}

stat:   BEGIN stat* END 
    |   IF expr THEN stat
    |   WHILE expr stat
    |   ID '=' expr ';'
	;

expr:   INT | CHAR ;

ID  :   [a-zA-Z]+
        {
        if ( keywords.containsKey(getText()) ) {
            setType(keywords.get(getText())); // reset token type
        }
        }
    ;

/** Convert 3-char 'x' input sequence to string x */
CHAR:   '\'' . '\'' {setText( String.valueOf(getText().charAt(1)) );} ;

INT :   [0-9]+ ;

WS  :   [ \t\n\r]+ -> skip ;
