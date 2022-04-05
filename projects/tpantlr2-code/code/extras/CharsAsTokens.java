/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.codegen.Target;
import org.antlr.v4.misc.CharSupport;
import org.antlr.v4.runtime.WritableToken;
import org.antlr.v4.tool.Grammar;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharsAsTokens implements TokenSource {
    CharStream input;
    String[] tokenNames;
    int line=1;
    int charPosInLine;
    Map<Integer, Integer> charToTokenType = new LinkedHashMap<Integer, Integer>();

    public CharsAsTokens(CharStream input, String[] tokenNames) {
        this.input = input;
        this.tokenNames = tokenNames;
        int ttype = 0;
        for (String tname : tokenNames) {
            if ( tname!=null && tname.charAt(0)=='\'' ) {
				int charVal = CharSupport.getCharValueFromGrammarCharLiteral(tname);
				charToTokenType.put(charVal, ttype);
            }
            ttype++;
        }
//        System.out.println(charToTokenType);
    }

	public Token nextToken() {
		WritableToken t = null;
        consumeUnknown();
        int c = input.LA(1);
        int i = input.index();
        if ( c == CharStream.EOF ) {
			t = new CommonToken(new Pair<TokenSource, CharStream>(this, input), 
							    Token.EOF, Token.DEFAULT_CHANNEL, i, i-1);
        }
        else {
            Integer ttypeI = charToTokenType.get(c);
			t = new CommonToken(new Pair<TokenSource, CharStream>(this, input), 
            					ttypeI, Token.DEFAULT_CHANNEL, i,  i);
        }
        t.setLine(line);
        t.setCharPositionInLine(charPosInLine);
//		System.out.println(t.getText());
        if ( t.getType()!=Token.EOF ) consume();
        return t;
    }

    protected void consumeUnknown() {
        int c = input.LA(1);
        Integer ttypeI = charToTokenType.get(c);
        while ( ttypeI==null && c != CharStream.EOF ) {
            System.err.println("no token type for char '"+(char)c+"'");
            c = consume();
            ttypeI = charToTokenType.get(c);
        }
    }

    protected int consume() {
        int c = input.LA(1);
        input.consume();
        if ( c == '\n' ) { charPosInLine = 0; line++; }
        charPosInLine++;
        return input.LA(1);
    }

    public String getSourceName() {
        return null;
    }

	@Override
	public TokenFactory<?> getTokenFactory() { return null; }

	@Override
	public int getCharPositionInLine() {
		return 0;
	}

	@Override
	public int getLine() {
		return 0;
	}

	@Override
	public CharStream getInputStream() { return input; }

	@Override
	public void setTokenFactory(TokenFactory<?> factory) {
	}
}
