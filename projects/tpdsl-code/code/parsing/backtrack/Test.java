/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class Test {
    public static void main(String[] args) throws RecognitionException {
        BacktrackLexer lexer = new BacktrackLexer(args[0]); // parse arg
        BacktrackParser parser = new BacktrackParser(lexer);
        //System.out.println(parser.LT(11)); // can look far ahead
        parser.stat(); // begin parsing at rule stat
    }
}
