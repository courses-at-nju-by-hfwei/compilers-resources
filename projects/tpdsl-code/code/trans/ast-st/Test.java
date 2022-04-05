/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.io.FileReader;

public class Test {
    public static void main(String[] args) throws Exception {
        CharStream input = null;
        if ( args.length>0 ) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);
        CymbolLexer lex = new CymbolLexer(input);
        final TokenRewriteStream tokens = new TokenRewriteStream(lex);
        CymbolParser p = new CymbolParser(tokens);
        RuleReturnScope r = p.compilationUnit();   // launch parser
        CommonTree tree = (CommonTree)r.getTree();    // get tree result
        //System.out.println("tree: "+tree.toStringTree());

        // LOAD TEMPLATES (via classpath)
        FileReader fr = new FileReader("Cymbol.stg");
        StringTemplateGroup templates = new StringTemplateGroup(fr);
        fr.close();
        //  CREATE TREE NODE STREAM FOR TREE PARSERS
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        nodes.setTokenStream(tokens);        // where to find tokens
        Gen gen = new Gen(nodes);
        gen.setTemplateLib(templates);
        Gen.compilationUnit_return ret = gen.compilationUnit();
        System.out.println(ret.getTemplate());
    }

}
