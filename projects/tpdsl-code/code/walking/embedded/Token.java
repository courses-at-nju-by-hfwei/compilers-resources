/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class Token {
    public static final int INVALID_TOKEN_TYPE = 0;
    public static final int PLUS = 1; // token types
    public static final int MULT = 2;
    public static final int DOT = 3;
    public static final int INT = 4;
    public static final int VEC = 5;
    public static final int ID = 6;
    public static final int ASSIGN = 7;
    public static final int PRINT = 8;
    public static final int STAT_LIST = 9;

    public int type;
    public String text;
    public Token(int type, String text) { this.type = type; this.text = text; }
    public Token(int type) { this.type = type; }
    public String toString() { return text; }
}
