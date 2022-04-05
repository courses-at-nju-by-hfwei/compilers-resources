/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import org.antlr.runtime.*;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) throws Exception {
        CharStream input = null;
        // Pick an input stream (filename from commandline or stdin)
        if ( args.length>0 ) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);
        // Create the lexer
        GraphicsLexer lex = new GraphicsLexer(input);
        // Create a buffer of tokens between lexer and parser
        CommonTokenStream tokens = new CommonTokenStream(lex);
        // Create the parser, attaching it to the token buffer
        GraphicsParser p = new GraphicsParser(tokens);
        p.file();   // launch parser at rule file
    }
}
