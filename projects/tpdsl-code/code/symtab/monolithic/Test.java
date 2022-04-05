/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import org.antlr.runtime.*;

public class Test {
    public static void main(String[] args) throws Exception {
        CharStream input = null; // read from filename or stdin
        if ( args.length>0 ) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);
        CymbolLexer lex = new CymbolLexer(input);  // create lexer
        CommonTokenStream tokens = new CommonTokenStream(lex);
        CymbolParser p = new CymbolParser(tokens); // create parser
        SymbolTable symtab = new SymbolTable();    // create symbol table
        p.compilationUnit(symtab);                 // launch parser
        System.out.println("globals: "+symtab.symbols);
    }
}
