/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static IntNode I(int i) {
        return new IntNode(new Token(Token.INT, String.valueOf(i)));
    }
    public static void main(String[] args) {
        // x = 3+4
        List<StatNode> stats = new ArrayList<StatNode>();
        AddNode a = new AddNode(I(3),new Token(Token.PLUS), I(4));
        VarNode x = new VarNode(new Token(Token.ID,"x"));
        AssignNode assign = new AssignNode(x, new Token(Token.ASSIGN,"="), a);
        stats.add(assign);
        // print x * [2, 3, 4]
        Token mult = new Token(Token.MULT,"*");
        List<ExprNode> elements = new ArrayList<ExprNode>();
        elements.add(I(2));
        elements.add(I(3));
        elements.add(I(4));
        VectorNode v = new VectorNode(new Token(Token.VEC), elements);
        VarNode xref = new VarNode(new Token(Token.ID,"x"));
        ExprNode pv = new MultNode(xref, mult, v);
        PrintNode p = new PrintNode(new Token(Token.PRINT,"print"), pv);
        stats.add(p);
        StatListNode statlist = new StatListNode(stats);
        statlist.print(); // Launch embedded walker
    }
}
