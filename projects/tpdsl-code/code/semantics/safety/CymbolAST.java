/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.Token;
public class CymbolAST extends CommonTree {
    public Scope scope;   // set by Def.g; ID lives in which scope?
    public Symbol symbol; // set by Types.g; point at def in symbol table
    
    /** We often know the type of an expression; set by Types.g. */
    public Type evalType;

	/** During analysis we sometimes find that known types like int must
	 *  be promoted to float etc...  Set by Types.g.
	 */
	public Type promoteToType;

    public CymbolAST() { }
    
    public CymbolAST(Token t) { super(t); }

    public String toString() {
        String s = super.toString();
        if ( evalType !=null ) {
            String annot = evalType.getName();
            if ( promoteToType !=null ) {
                annot += ":"+promoteToType.getName();
            }
            return s+'<'+annot+'>';
        }
        return s;
    }
}
