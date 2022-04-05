/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class TestLEvaluatorWithProps {
    /** Sample "calculator" using property of nodes */
    public static class EvaluatorWithProps extends LExprBaseListener {
        /** maps nodes to integers with Map<ParseTree,Integer> */
        ParseTreeProperty<Integer> values = new ParseTreeProperty<Integer>();

        /** Need to pass e's value out of rule s : e ; */
        public void exitS(LExprParser.SContext ctx) {
            setValue(ctx, getValue(ctx.e())); // like: int s() { return e(); }
        }

        public void exitMult(LExprParser.MultContext ctx) {
            int left = getValue(ctx.e(0));  // e '*' e   # Mult
            int right = getValue(ctx.e(1));
            setValue(ctx, left * right);
        }

        public void exitAdd(LExprParser.AddContext ctx) {
            int left = getValue(ctx.e(0)); // e '+' e   # Add
            int right = getValue(ctx.e(1));
            setValue(ctx, left + right);
        }

        public void exitInt(LExprParser.IntContext ctx) {
            String intText = ctx.INT().getText(); // INT   # Int
            setValue(ctx, Integer.valueOf(intText));
        }

        public void setValue(ParseTree node, int value) { values.put(node, value); }
        public int getValue(ParseTree node) { return values.get(node); }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        LExprLexer lexer = new LExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LExprParser parser = new LExprParser(tokens);
        parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
        ParseTree tree = parser.s(); // parse
        // show tree in text form
        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        EvaluatorWithProps evalProp = new EvaluatorWithProps();
        walker.walk(evalProp, tree);
        System.out.println("properties result = " +evalProp.getValue(tree));
    }
}
