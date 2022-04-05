/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.List;
import java.util.ArrayList;

/** A flat tree ==  tree with nil root: (nil child1 child2 ...) */
public class StatListNode extends VecMathNode {
    List<StatNode> elements = new ArrayList<StatNode>();
    public StatListNode(List<StatNode> elements) {
        super(new Token(Token.STAT_LIST)); // create imaginary token
        this.elements = elements;
    }
    public void visit(VecMathVisitor visitor) { visitor.visit(this); }    
}
