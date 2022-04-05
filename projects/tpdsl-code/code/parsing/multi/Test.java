/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class Test {
    public static void main(String[] args) {
        LookaheadLexer lexer = new LookaheadLexer(args[0]); // parse arg
        LookaheadParser parser = new LookaheadParser(lexer, 2);
        parser.list(); // begin parsing at rule list
    }
}
