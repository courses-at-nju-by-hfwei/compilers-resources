/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.misc.Pair;

public class CToken extends CommonToken {
	public String filename;

	public CToken(int type, String text) {
		super(type, text);
	}

	public CToken(Pair<TokenSource, CharStream> source,
                  int type, int channel, int start, int stop)
    {
		super(source, type, channel, start, stop);
	}

	@Override
	public String toString() {
		String t = super.toString();
		return filename+":"+t;
	}
}
