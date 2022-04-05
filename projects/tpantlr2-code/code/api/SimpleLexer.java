/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;

/** Match ID, INT, and SEMI tokens and toss out whitespace */
public class SimpleLexer implements TokenSource {
    public static final int ID = 1; // Token.MIN_USER_TOKEN_TYPE;
    public static final int INT = 2;
    public static final int SEMI = 3;

    CharStream input;
    TokenFactory<?> factory = CommonTokenFactory.DEFAULT;

    int line = 1;
    int charPositionInLine = 0;

    /** When we start token, track initial coordinates so we can properly
     *  build token objects.
     */
    int startCharIndex;
    int startLine;
    int startCharPositionInLine;
    char c;        // current character

    public SimpleLexer(CharStream input) {
        this.input = input;
        c = (char)input.LA(1); // prime lookahead
    }

    @Override
    public Token nextToken() {
        while (true) {
            if ( c==(char)CharStream.EOF ) return createToken(Token.EOF);
            while ( Character.isWhitespace(c) ) consume(); // toss out whitespace
            startCharIndex = input.index();
            startLine = getLine();
            startCharPositionInLine = getCharPositionInLine();
            if ( c==';' ) {
                consume();
                return createToken(SEMI);
            }
            else if ( c>='0' && c<='9' ) {
                while ( c>='0' && c<='9' ) consume();
                return createToken(INT);
            }
            else if ( c>='a' && c<='z' ) { // VERY simple ID
                while ( c>='a' && c<='z' ) consume();
                return createToken(ID);
            }
            // error; consume and try again
            consume();
        }
    }

    protected Token createToken(int ttype) {
        String text = null; // we use start..stop indexes in input
		Pair<TokenSource, CharStream> source =
			new Pair<TokenSource, CharStream>(this, input);
        return factory.create(source, ttype, text, Token.DEFAULT_CHANNEL,
                              startCharIndex, input.index()-1,
                              startLine, startCharPositionInLine);
    }

    protected void consume() {
        if ( c=='\n' ) {
            line++;  // \r comes back as a char, but \n means line++
            charPositionInLine = 0;
        }
        if ( c!=(char)CharStream.EOF ) input.consume();
        c = (char)input.LA(1);
        charPositionInLine++;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getCharPositionInLine() {
        return charPositionInLine;
    }

    @Override
    public CharStream getInputStream() {
        return input;
    }

    @Override
    public String getSourceName() {
        return input.getSourceName();
    }

    @Override
    public void setTokenFactory(TokenFactory<?> factory) {
        this.factory = factory;
    }

    @Override
    public TokenFactory<?> getTokenFactory() {
        return factory;
    }
}
