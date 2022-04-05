/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class ListLexer extends Lexer {
    public static int NAME = 2;
    public static int COMMA = 3;
    public static int LBRACK = 4;
    public static int RBRACK = 5;
    public static String[] tokenNames =
        { "n/a", "<EOF>", "NAME", "COMMA", "LBRACK", "RBRACK" };
    public String getTokenName(int x) { return tokenNames[x]; }

    public ListLexer(String input) { super(input); }
    boolean isLETTER() { return c>='a'&&c<='z' || c>='A'&&c<='Z'; }

    public Token nextToken() {
        while ( c!=EOF ) {
            switch ( c ) {
                case ' ': case '\t': case '\n': case '\r': WS(); continue;
                case ',' : consume(); return new Token(COMMA, ",");
                case '[' : consume(); return new Token(LBRACK, "[");
                case ']' : consume(); return new Token(RBRACK, "]");
                default:
                    if ( isLETTER() ) return NAME();
                    throw new Error("invalid character: "+c);
            }
        }
        return new Token(EOF_TYPE,"<EOF>");
    }

    /** NAME : ('a'..'z'|'A'..'Z')+; // NAME is sequence of >=1 letter */
    Token NAME() {
        StringBuilder buf = new StringBuilder();
        do { buf.append(c); consume(); } while ( isLETTER() );
        return new Token(NAME, buf.toString());
    }

    /** WS : (' '|'\t'|'\n'|'\r')* ; // ignore any whitespace */
    void WS() {
        while ( c==' ' || c=='\t' || c=='\n' || c=='\r' ) consume();
    }
}
