/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import org.antlr.stringtemplate.AttributeRenderer;

/** Render Java Class objects in templates using getSimpleName() not
 *  the fully qualified name (getName()). For type int, template expression
 *    <type> yields "int"
 *    <type; format="capitalized"> yields "Int"
 */
public class TypeRenderer implements AttributeRenderer {
    public String toString(Object o) { return ((Class)o).getSimpleName(); }
    public String toString(Object o, String formatName) {
        if ( formatName.equals("capitalized") ) {
            return capitalize(((Class)o).getSimpleName());
        }
        return toString(o);
    }
    
    public static String capitalize(String s) {
        s = Character.toUpperCase(s.charAt(0))+s.substring(1);
        return s;
    }
}
