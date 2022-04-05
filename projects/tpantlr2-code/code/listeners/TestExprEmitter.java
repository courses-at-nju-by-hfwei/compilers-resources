/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Stack;

public class TestExprEmitter {
    /** Sample "emitter" */
    public static class LeafListener extends ExprBaseListener {
        public void visitTerminal(TerminalNode node) {
            System.out.println(node.getText());
        }
    }

    /** Sample "emitter" that relies on order of enter/exit.
     *  1+2*3 => (1+(2*3))
     */
    public static class Printer extends ExprBaseListener {
        public void enterE(ExprParser.EContext ctx) {
            if ( ctx.getChildCount()>1 ) System.out.print("(");
        }

        public void exitE(ExprParser.EContext ctx) {
            if ( ctx.getChildCount()>1 ) System.out.print(")");
        }

        public void visitTerminal(TerminalNode node) {
            System.out.print(node.getText());
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.s(); // parse
        // show tree in text form
        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LeafListener(), tree);

        walker.walk(new Printer(), tree);
        System.out.println();
    }
}
