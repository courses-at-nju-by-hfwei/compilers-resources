/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class PrintNode extends StatNode {
    ExprNode value;
    public PrintNode(Token t, ExprNode value) {
        super(t); this.value = value;
    }
    public void visit(VecMathVisitor visitor) { visitor.visit(this); }
}
