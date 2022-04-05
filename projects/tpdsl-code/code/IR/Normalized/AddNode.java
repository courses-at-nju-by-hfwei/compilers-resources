/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class AddNode extends ExprNode {
    public AddNode(ExprNode left, Token addToken, ExprNode right) {
        super(addToken);
        addChild(left);
        addChild(right);
    }
    public int getEvalType() { // ...
        ExprNode left = (ExprNode)children.get(0);
        ExprNode right = (ExprNode)children.get(1);
        if ( left.getEvalType()==tINTEGER && right.getEvalType()==tINTEGER ) {
            return tINTEGER;
        }
        if ( left.getEvalType()==tVECTOR && right.getEvalType()==tVECTOR ) {
            return tVECTOR;
        }
        return tINVALID;
    }
}
