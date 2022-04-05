/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public abstract class Parser {
    Lexer input;       // from where do we get tokens?
    Token[] lookahead; // circular lookahead buffer
    int k;             // how many lookahead symbols
    int p = 0;         // circular index of next token position to fill
    public Parser(Lexer input, int k) {
        this.input = input;
        this.k = k;
        lookahead = new Token[k];           // make lookahead buffer
        for (int i=1; i<=k; i++) consume(); // prime buffer with k lookahead
    }
    public void consume() {
        lookahead[p] = input.nextToken();   // fill next position with token
        p = (p+1) % k;                      // increment circular index
    }
    public Token LT(int i) {return lookahead[(p+i-1) % k];} // circular fetch
    public int LA(int i) { return LT(i).type; }
    public void match(int x) {
        if ( LA(1) == x ) consume();
        else throw new Error("expecting "+input.getTokenName(x)+
                             "; found "+LT(1));
    }
}
