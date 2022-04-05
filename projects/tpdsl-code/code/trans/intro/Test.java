/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
public class Test {
    public static void main(String[] args) {
    	String assign = "<left> = <right>;"; 
    	StringTemplate st = new StringTemplate(assign,
    	                                       AngleBracketTemplateLexer.class);
    	st.setAttribute("left", "x");   // attribute left is a string
    	st.setAttribute("right", 99);   // attribute right is an integer
    	String output = st.toString();  // render template to text
    	System.out.println(output);
    }
}
