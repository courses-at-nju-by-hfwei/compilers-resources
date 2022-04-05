/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.Trees;

public class TestComment {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        CommentLexer lexer = new CommentLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CommentParser parser = new CommentParser(tokens);
        parser.setBuildParseTree(true);
        parser.file();
    }
}
