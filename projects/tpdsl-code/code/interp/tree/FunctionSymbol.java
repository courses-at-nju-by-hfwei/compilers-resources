/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.Map;
import java.util.LinkedHashMap;

public class FunctionSymbol extends ScopedSymbol {
    Map<String, Symbol> formalArgs = new LinkedHashMap<String, Symbol>();
    PieAST blockAST;

    public FunctionSymbol(String name, Scope parent) {
        super(name, parent);
    }

    public Map<String, Symbol> getMembers() { return formalArgs; }

    public String getName() {
        return name+"("+ formalArgs.keySet().toString()+")";
    }
}
