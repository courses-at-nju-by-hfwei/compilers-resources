/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class TestSimpleList {
    public static void main(String[] args) {
        String input = "  [ a , b,c ]\n";
        input = input.trim();  // remove whitespace from around brackets
        String names = "(.*)"; // capture anything
        String regex = "\\["+names+"\\]"; // capture anything inside brackets
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        m.matches();                // see if input matches regex
        String inside = m.group(1); // get list of names inside brackets
        inside = inside.trim();     // remove whitespace before and after
        String[] values = inside.split("\\s*,\\s*"); // split around commas
        System.out.println(Arrays.asList(values));   // print resulting list
    }
}
