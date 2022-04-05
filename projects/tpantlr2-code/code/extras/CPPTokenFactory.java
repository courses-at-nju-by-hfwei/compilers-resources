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
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayDeque;
import java.util.Deque;

public class CPPTokenFactory implements TokenFactory<CPPToken> {
	/** Stack of include files */
	Deque<String> stack = new ArrayDeque<String>();

	public void pushFilename(String filename) {
		stack.push(filename);
	}

	public void popFileName() { stack.pop(); }

	@Override
	public CPPToken create(Pair<TokenSource, CharStream> source, int type, String text,
						   int channel, int start, int stop, int line,
						   int charPositionInLine)
	{
		CPPToken t = new CPPToken(source, type, channel, start, stop);
		t.setLine(line);
		t.setCharPositionInLine(charPositionInLine);
		CharStream input = source.b;
		t.setText(input.getText(Interval.of(start,stop)));
		t.filename = stack.peek();
		return t;
	}

	@Override
	public CPPToken create(int type, String text) {
		return new CPPToken(type, text);
	}
}
