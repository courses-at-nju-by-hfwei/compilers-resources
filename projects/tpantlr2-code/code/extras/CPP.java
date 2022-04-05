/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.UnbufferedCharStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CPP {
	static final CPPTokenFactory tokenFactory = new CPPTokenFactory();

	public static List<CPPToken> include(String includeCommand) {
		System.out.print("process " + includeCommand);
		int l = includeCommand.indexOf('"');
		int r = includeCommand.lastIndexOf('"');
		String filename = includeCommand.substring(l+1, r);
		tokenFactory.pushFilename(filename);
		List<CPPToken> tokens = load(filename);
		tokenFactory.popFileName();
		return tokens;
	}

	static List<CPPToken> load(String filename) {
		System.out.println("opening " + filename);
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			// don't buffer since we're copying. these buffers disappear
			// so we must copy
			UnbufferedCharStream input = new UnbufferedCharStream(br);
			CPPLexer lexer = new CPPLexer(input);
			lexer.setTokenFactory(tokenFactory); // force creation of CPPTokens
			return (List<CPPToken>)lexer.getAllTokens();
		}
		catch (IOException ioe) {
			System.err.println("Can't load "+filename);
		}
		return null;
	}

	public static void main(String[] args) throws IOException {
		String filename = args[0];
		tokenFactory.pushFilename(filename);
		final List<CPPToken> tokens = load(filename);
		System.out.println(tokens);

		PreprocessedCharStream cinput = new PreprocessedCharStream(tokens);
		CLexer clexer = new CLexer(cinput);
		// force creation of CPPTokensm set file,line
		clexer.setTokenFactory(new CTokenFactory(cinput));
		CommonTokenStream ctokens = new CommonTokenStream(clexer);
		CParser cparser = new CParser(ctokens);
		cparser.removeErrorListeners();
		cparser.addErrorListener(new CErrorListener());
		ParseTree t = cparser.file();
		System.out.println("C TOKENS:");
		System.out.println(ctokens.getTokens());
		System.out.println(t.toStringTree(cparser));
	}

}
