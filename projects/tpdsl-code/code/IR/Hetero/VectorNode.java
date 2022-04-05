/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.*;
public class VectorNode extends ExprNode {
    List<ExprNode> elements = new ArrayList<ExprNode>();
    public VectorNode(Token t, List<ExprNode> elements) {
        super(t); // track vector token; most likely it's an imaginary token
        this.elements = elements;
    }
}
