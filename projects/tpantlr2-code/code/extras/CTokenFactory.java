/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.misc.Interval;

public class CTokenFactory implements TokenFactory<CToken> {
	private final PreprocessedCharStream cinput;

	public CTokenFactory(PreprocessedCharStream cinput) {
		this.cinput = cinput;
	}

	@Override
	public CToken create(int type, String text) {
		return new CToken(type, text);
	}

	@Override
	public CToken create(Pair<TokenSource, CharStream> source, int type, String text,
						 int channel, int start, int stop, int line,
						 int charPositionInLine)
	{
		CToken t = new CToken(source, type, channel, start, stop);
		t.setLine(line);
		t.setCharPositionInLine(charPositionInLine);
		CharStream input = source.b;
		t.setText(input.getText(Interval.of(start, stop)));
		t.filename = cinput.getFilenameFromCharIndex(start);
		t.setLine(cinput.getLineFromCharIndex(start));
		return t;
	}
}
