/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

import java.util.ArrayDeque;

public class CPPLexer extends CPPBaseLexer {
	protected ArrayDeque<Token> buffer = new ArrayDeque<Token>();

	public CPPLexer(CharStream input) { super(input); }

	@Override
	public Token nextToken() {
		if ( buffer.size()>0 ) {
			return buffer.removeFirst();
		}
		else {
			// matched rule adds at least one to buffer via emit(t)
			super.nextToken(); // ignore return value; we use buffer
			return buffer.removeFirst();
		}
	}

	@Override
	public Token getToken() {
		return buffer.peek();
	}

	@Override
	public void emit(Token token) {
		super.emit(token);
		buffer.add(token);
	}
}
