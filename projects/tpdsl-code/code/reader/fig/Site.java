/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.*;
public class Site { // can refer to Site in a Fig file
    public int port;
    protected String answers; // set with setAnswers
    public List<String> aliases;

    /** The reflection support code looks for setters first then fields */
    public void setAnswers(String answers) { this.answers = answers; }

    public String toString() {
        return "<Site "+answers+":"+port+
               (aliases==null?"":(",aliases="+aliases))+">";
    }
}
