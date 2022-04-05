/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.List;
import java.util.ArrayList;

public abstract class Parser {
    Lexer input;           // from where do we get tokens?
    List<Integer> markers; // stack of index markers into lookahead buffer
    List<Token> lookahead; // dynamically-sized lookahead buffer
    int p = 0;             // index of current lookahead token;
                           // LT(1) returns lookahead[p]

    public Parser(Lexer input) {
        this.input = input;
        markers = new ArrayList<Integer>(); // make marker stack
        lookahead = new ArrayList<Token>(); // make lookahead buffer
        sync(1); // prime buffer with at least 1 token
    }

    public void consume() {
        p++;
        // have we hit end of buffer when not backtracking?
        if ( p==lookahead.size() && !isSpeculating() ) {
            // if so, it's an opportunity to start filling at index 0 again
            p = 0;
            lookahead.clear(); // size goes to 0, but retains memory
        }
        sync(1); // get another to replace consumed token
    }

    /** Make sure we have i tokens from current position p */
    public void sync(int i) {
        if ( p+i-1 > (lookahead.size()-1) ) {       // out of tokens?
            int n = (p+i-1) - (lookahead.size()-1); // get n tokens
            fill(n);            
        }
    }
    public void fill(int n) { // add n tokens
        for (int i=1; i<=n; i++) { lookahead.add(input.nextToken()); }
    }

    public Token LT(int i) { sync(i); return lookahead.get(p+i-1); }
    public int LA(int i) { return LT(i).type; }
    public void match(int x) throws MismatchedTokenException {
        if ( LA(1) == x ) consume();
        else throw new MismatchedTokenException("expecting "+
                       input.getTokenName(x)+" found "+LT(1));
    }
    
    public int mark() { markers.add(p); return p; }
    public void release() {
        int marker = markers.get(markers.size()-1);
        markers.remove(markers.size()-1);
        seek(marker);
    }
    public void seek(int index) { p = index; }
    public boolean isSpeculating() { return markers.size() > 0; }
}
