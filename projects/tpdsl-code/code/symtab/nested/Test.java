/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Test {
    public static void main(String[] args) throws Exception {
        CharStream input = null;
        if ( args.length>0 ) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);
        CymbolLexer lex = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        CymbolParser p = new CymbolParser(tokens);
        RuleReturnScope r = p.compilationUnit();   // launch parser
        //System.out.println("tree: "+t.toStringTree());

        CommonTree t = (CommonTree)r.getTree(); // get tree result from parser
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        nodes.setTokenStream(tokens);
        SymbolTable symtab = new SymbolTable(); // make global scope, types
        DefRef def = new DefRef(nodes, symtab); // use custom constructor
        def.downup(t); // trigger symtab actions upon certain subtrees 
        System.out.println("globals: "+symtab.globals);
    }
}
