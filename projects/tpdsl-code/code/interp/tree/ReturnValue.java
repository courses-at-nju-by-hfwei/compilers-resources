/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
/** Unchecked exception used to pass Pie return value all the way out
 *  of deeply nested java method call chain.
 */
public class ReturnValue extends Error {
    public Object value;
    public ReturnValue() { super(""); }
}
