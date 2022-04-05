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
    /** An adaptor that tells ANTLR to build CymbolAST nodes */
    public static TreeAdaptor CymbolAdaptor = new CommonTreeAdaptor() {
        public Object create(Token token) {
            return new CymbolAST(token);
        }
        public Object dupNode(Object t) {
            if ( t==null ) {
                return null;
            }
            return create(((CymbolAST)t).token);
        }

        public Object errorNode(TokenStream input,
                                Token start,
                                Token stop,
                                RecognitionException e)
        {
            return new CymbolErrorNode(input,start,stop,e);
        }
    };

    public static void main(String[] args) throws Exception {
        CharStream input = null;
        if ( args.length>0 ) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);
        // CREATE PARSER AND BUILD AST
        CymbolLexer lex = new CymbolLexer(input);
        final TokenRewriteStream tokens = new TokenRewriteStream(lex);
        CymbolParser p = new CymbolParser(tokens);
        p.setTreeAdaptor(CymbolAdaptor);  // create CymbolAST nodes
        RuleReturnScope r = p.compilationUnit();   // launch parser
        CommonTree t = (CommonTree)r.getTree();    // get tree result

        // CREATE TREE NODE STREAM FOR TREE PARSERS
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        nodes.setTokenStream(tokens);        // where to find tokens
        nodes.setTreeAdaptor(CymbolAdaptor); 
        SymbolTable symtab = new SymbolTable();
        // DEFINE SYMBOLS
        Def def = new Def(nodes, symtab); // pass symtab to walker
        def.downup(t); // trigger define actions upon certain subtrees
        // RESOLVE SYMBOLS, COMPUTE EXPRESSION TYPES
        nodes.reset();
        Types typeComp = new Types(nodes, symtab);
        typeComp.downup(t); // trigger resolve/type computation actions

        // WALK TREE TO DUMP SUBTREE TYPES
        TreeVisitor v = new TreeVisitor(new CommonTreeAdaptor());
        TreeVisitorAction actions = new TreeVisitorAction() {
            public Object pre(Object t) { return t; }
            public Object post(Object t)  {
                showTypes((CymbolAST)t, tokens);
                return t;
            }
        };
        v.visit(t, actions); // walk in postorder, showing types

        //System.out.println("tree: "+t.toStringTree());
    }

    static void showTypes(CymbolAST t, TokenRewriteStream tokens) {
        if ( t.evalType!=null && t.getType()!=CymbolParser.EXPR ) {
            System.out.printf("%-17s",
                              tokens.toString(t.getTokenStartIndex(),
                                              t.getTokenStopIndex()));
            String ts = t.evalType.toString();
            System.out.printf(" type %-8s\n", ts);
        }
    }
}
