/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class GenDOT {
    public static void main(String[] args) throws Exception {
        Tree t = new Tree("VAR");
        t.addChild( new Tree("int") );
        t.addChild( new Tree("x") );
        Tree m = new Tree("+");
        m.addChild( new Tree("3") );
        m.addChild( new Tree("4") );
        t.addChild( m );
        ASTViz viz = new ASTViz(t);
        System.out.println(viz.toString());
    }

}