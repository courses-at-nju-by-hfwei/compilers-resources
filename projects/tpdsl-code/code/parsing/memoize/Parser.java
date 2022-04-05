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
import java.util.Map;

public abstract class Parser {
    public static final int FAILED = -1;  // parsing failed on last attempt

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
            clearMemo();       // clear any rule_memo dictionaries
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
    
    /** Actual parser implements to clear any rule_memo dictionaries */
    public abstract void clearMemo();
    
    public int mark() {
        markers.add(p);
        return p;
    }
    public void release() {
        int marker = markers.get(markers.size()-1);
        markers.remove(markers.size()-1);
        seek(marker);
    }
    public void seek(int index) { p = index; }
    public boolean isSpeculating() { return markers.size() > 0; }

    /** Have we parsed a particular rule before at this input position?
     *  If no memoization value, we've never parsed here before.
     *  If memoization value is FAILED, we parsed and failed before.
     *  If value >= 0, it is an index into the token buffer.  It indicates
     *  a previous successful parse.  This method has a side effect:
     *  it seeks ahead in the token buffer to avoid reparsing.
     */
    public boolean alreadyParsedRule(Map<Integer, Integer> memoization)
        throws PreviousParseFailedException
    {
        Integer memoI = memoization.get(index());
        if ( memoI==null ) return false;
        int memo = memoI.intValue();
        System.out.println("parsed list before at index "+index()+
                           "; skip ahead to token index "+memo+": "+
                           lookahead.get(memo).text);
        if ( memo==FAILED ) throw new PreviousParseFailedException();
        // else skip ahead, pretending we parsed this rule ok
        seek(memo);
        return true;
    }
    /** While backtracking, record partial parsing results.
     *  If invoking rule method failed, record that fact.
     *  If it succeeded, record the token position we should skip to
     *  next time we attempt this rule for this input position.
     */
    public void memoize(Map<Integer, Integer> memoization,
                        int startTokenIndex, boolean failed)
    {
        // record token just after last in rule if success
        int stopTokenIndex = failed ? FAILED : index();
        memoization.put(startTokenIndex, stopTokenIndex);
    }
    public int index() { return p; } // return current input position
}
