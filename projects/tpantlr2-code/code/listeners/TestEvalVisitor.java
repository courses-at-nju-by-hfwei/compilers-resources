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

public class TestEvalVisitor {
    // a4 -visitor LExpr.g4
    /** Visitor "calculator" */
    public static class EvalVisitor extends ExprBaseVisitor<Integer> {
        public Integer visitE(ExprParser.EContext ctx) {
            if ( ctx.getChildCount()==3 ) { // operations have 3 children
                if ( ctx.op.getType()==ExprParser.MULT ) {
                    return visit(ctx.e(0)) * visit(ctx.e(1));
                }
                else {
                    return visit(ctx.e(0)) + visit(ctx.e(1)); // must be add
                }
            }
            return visitChildren(ctx);   // must be e above INT
        }

        @Override
        public Integer visitTerminal(TerminalNode node) {
            if ( node.getSymbol().getType()==ExprParser.INT ) {
                return Integer.valueOf(node.getText());
            }
            return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
        ParseTree tree = parser.s(); // parse
        // show tree in text form
        System.out.println(tree.toStringTree(parser));

        EvalVisitor evalVisitor = new EvalVisitor();
        int result = evalVisitor.visit(tree);
        System.out.println("visitor result = "+result);
    }
}
