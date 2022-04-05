/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class HeteroAST {// Heterogeneous AST node type
    Token token;        // This node created from which token?
    public HeteroAST()        { ; }
    public HeteroAST(Token t) { this.token = t; }
    public String toString()  { return token.toString(); }
}
