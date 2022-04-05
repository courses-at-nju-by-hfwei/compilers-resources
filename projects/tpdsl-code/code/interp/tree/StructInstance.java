/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
/** A scope holding fields of a struct instance.  There can be
 *  multiple struct instances but only one StructSymbol (definition).
 */
public class StructInstance extends MemorySpace {
    StructSymbol def; // what kind of struct am I?

    public StructInstance(StructSymbol struct) {
		super(struct.name+" instance");
        this.def = struct;
	}
    
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("{");
        boolean first = true;
        for (String fieldName : def.fields.keySet()) {
            Object v = members.get(fieldName);
            if ( !first ) buf.append(", ");
            else first = false;
            buf.append(fieldName);
            buf.append('=');
            buf.append(v);
        }
        buf.append("}");
        return buf.toString();
    }
}
