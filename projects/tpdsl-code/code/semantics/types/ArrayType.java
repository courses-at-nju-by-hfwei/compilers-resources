/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
/** A symbol to represent arrays with a single element type */
public class ArrayType extends Symbol implements Type {
	Type elementType;
    public ArrayType(Type elementType) {
        super(elementType+"[]");
        this.elementType = elementType;
    }
    public int getTypeIndex() { return 0; }
}
