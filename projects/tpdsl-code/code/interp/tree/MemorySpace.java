/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.Map;
import java.util.HashMap;

/** A scope of variable:value pairs */
public class MemorySpace {
    String name; // mainly for debugging purposes
    Map<String, Object> members = new HashMap<String, Object>();

    public MemorySpace(String name) { this.name = name; }

    public Object get(String id) { return members.get(id); }

    public void put(String id, Object value) { members.put(id, value); }

    public String toString() { return name+":"+members; }
}
