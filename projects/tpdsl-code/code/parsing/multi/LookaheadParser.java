/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
/** */
public class LookaheadParser extends Parser {
    public LookaheadParser(Lexer input, int k) { super(input, k); }
    
    /** list : '[' elements ']' ; // match bracketed list */
    public void list() {
        match(LookaheadLexer.LBRACK); elements(); match(LookaheadLexer.RBRACK);
    }

    /** elements : element (',' element)* ; // match comma-separated list */
    void elements() {
        element(); while ( LA(1)==LookaheadLexer.COMMA ) { match(LookaheadLexer.COMMA); element(); }
    }

    /** element : NAME '=' NAME | NAME | list ; assignment, NAME or list */
    void element() {
        if ( LA(1)==LookaheadLexer.NAME && LA(2)==LookaheadLexer.EQUALS ) {
            match(LookaheadLexer.NAME);
            match(LookaheadLexer.EQUALS);
            match(LookaheadLexer.NAME);
        }
        else if ( LA(1)==LookaheadLexer.NAME ) match(LookaheadLexer.NAME);
        else if ( LA(1)==LookaheadLexer.LBRACK ) list();
        else throw new Error("expecting name or list; found "+LT(1));
    }
}
