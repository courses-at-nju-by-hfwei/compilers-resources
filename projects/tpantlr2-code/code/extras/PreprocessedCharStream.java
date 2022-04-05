/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// don't copy / concat text from tokens, pull char by char in sequence
public class PreprocessedCharStream extends UnbufferedCharStream {
	protected List<CPPToken> tokens;
	protected List<Interval> tokenCharIntervals;

	protected int tp;       // which token are we processing in tokens?
	protected int c = -1;   // which char within token text is LA(1)?

	protected String text;  // text of current token

	public PreprocessedCharStream(List<CPPToken> tokens) {
		this.tokens = tokens;
		text = tokens.get(0).getText();
		computeTokenCharRanges(tokens);
		computeTokenLineRanges(tokens);
	}

	@Override
	protected int nextChar() throws IOException {
		if ( tp>=tokens.size() ) return CharStream.EOF;
		c++;
		if ( c == text.length() ) {
			tp++;
			if ( tp==tokens.size() ) return CharStream.EOF;
			c = 0;
			CPPToken t = tokens.get(tp);
			text = t.getText();
			super.name = t.filename;
		}
		return text.charAt(c);
	}

	public String getFilenameFromCharIndex(int ci) {
		int ti = getTokenIndexFromCharIndex(ci);
		if ( ti!=-1 ) return tokens.get(ti).filename;
		return null;
	}

	public int getTokenIndexFromCharIndex(int ci) {
		return intervalFor(tokenCharIntervals, ci);
	}

	public int getLineFromCharIndex(int ci) {
		int ti = getTokenIndexFromCharIndex(ci);
		if ( ti==-1 ) return -1;
		CPPToken t = tokens.get(ti);
		int iv = intervalFor(t.lineIntervals, ci); // gives line num from 0
		return iv+t.getLine(); // add starting line number of entire preprocessed token
	}

	protected void computeTokenCharRanges(List<CPPToken> tokens) {
		tokenCharIntervals = new ArrayList<Interval>();
		int absCharIndex = 0;
		for (CPPToken t : tokens) {
			int n = t.getText().length();
			tokenCharIntervals.add(Interval.of(absCharIndex, absCharIndex + n - 1));
			absCharIndex += n;
		}
		System.out.println(tokenCharIntervals);
	}

	protected void computeTokenLineRanges(List<CPPToken> tokens) {
		int absCharIndex = 0;
		for (CPPToken t : tokens) {
			t.lineIntervals = new ArrayList<Interval>();
			String text = t.getText();
			int n = text.length();
			int intervalStart = 0;
			for (int c=0; c<n; c++) {
				if ( text.charAt(c)=='\n' ) {
					t.lineIntervals.add(Interval.of(absCharIndex+intervalStart, absCharIndex+c));
					intervalStart = c+1;
				}
			}
			if ( t.lineIntervals.size()==0 ) {
				t.lineIntervals.add(Interval.of(0,n-1));
			}
			System.out.println("LINE INTERVALS "+t+":");
			System.out.println("\t"+Utils.join(t.lineIntervals.iterator(), "\n\t"));
			absCharIndex += n;
		}
	}

	protected int intervalFor(List<Interval> intervals, int ci) {
		int ti = 0;
		for (Interval iv : intervals) {
			if ( iv.a <= ci && ci <= iv.b ) {
				return ti;
			}
			ti++;
		}
		return -1;
	}
}
