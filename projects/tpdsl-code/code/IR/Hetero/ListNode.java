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
public class ListNode extends HeteroAST {
    List<HeteroAST> elements = new ArrayList<HeteroAST>();
    public ListNode(List<HeteroAST> elements) {
    	this.elements = elements;
    }
    public String toStringTree() {
        if ( elements==null || elements.size()==0 ) return this.toString();
        StringBuilder buf = new StringBuilder();
        for (int i = 0; elements!=null && i < elements.size(); i++) {
            HeteroAST t = (HeteroAST)elements.get(i);
            if ( i>0 ) buf.append(' ');
            buf.append(t.toStringTree());
        }
        return buf.toString();
    }
}
