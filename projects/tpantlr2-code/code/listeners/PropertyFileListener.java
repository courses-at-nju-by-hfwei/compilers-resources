/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface PropertyFileListener extends ParseTreeListener {
	void enterFile(PropertyFileParser.FileContext ctx);
	void exitFile(PropertyFileParser.FileContext ctx);
	void enterProp(PropertyFileParser.PropContext ctx);
	void exitProp(PropertyFileParser.PropContext ctx);
}