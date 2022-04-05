/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.List;
/** A flat tree ==  tree with nil root: (nil child1 child2 ...) */
public class ListNode extends ExprNode {
    public ListNode(Token t, List<ExprNode> elements) {
        super(t); // track vector token; most likely it's an imaginary token
        evalType = tVECTOR;
        for (ExprNode e : elements) { addChild(e); } // all elements as kids
    }
}
