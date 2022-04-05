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

public class Test2 {
    public static void main(String[] args) throws Exception {
        CharStream input = null;
        if ( args.length>0 ) {
            input = new ANTLRStringStream(args[0]);
        }
        else {
            input = new ANTLRInputStream(System.in);
        }
        // Create lexer/parser to build trees from stdin
        VecMathLexer lex = new VecMathLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        VecMathParser p = new VecMathParser(tokens);
	RuleReturnScope r = p.prog();   // launch parser by calling start rule
        CommonTree t = (CommonTree)r.getTree();   // get tree result

        System.out.println("Original tree: "+t.toStringTree());
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        Reduce red = new Reduce(nodes);
        t = (CommonTree)red.downup(t, true); // walk t, trace transforms
        System.out.println("Simplified tree: "+t.toStringTree());
    }
}
