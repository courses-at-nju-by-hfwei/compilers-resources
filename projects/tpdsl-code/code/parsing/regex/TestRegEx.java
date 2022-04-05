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
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class TestRegEx {
    public static void CSV() {
        String input = "a, b, c";
        String[] values = input.split(",");
        System.out.println(Arrays.asList(values));
    }

    public static void CSV_StripSpace() {
        String input = "a, b, c";
        String[] values = input.split("\\s*,\\s*");
        System.out.println(Arrays.asList(values));
    }

    public static void CSV_Brackets() {
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

    public static void CSV_List() {
        String input = "  [ a , b,c ]\n";
        input = input.trim(); // remove whitespace from around brackets
        String name = "\\w+";  // 1-or-more word char (letters)
        String space = "\\s*"; // 0-or-more whitespace char
        String names = "("+space+name+"("+space+","+space+name+")*"+space+")"; 
        // regex is \[(\s*\w+(\s*,\s*\w+)*\s*)\]
        String regex = "\\["+names+"\\]"; // capture list inside brackets
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        m.matches();                // see if input matches regex
        String inside = m.group(1); // get list of names inside brackets
        inside = inside.trim();     // remove whitespace before and after
        String[] values = inside.split("\\s*,\\s*"); // split around commas
        System.out.println(Arrays.asList(values));   // print resulting list
    }

    public static void className() throws IOException {
        // match complete lines like "public class TestRegEx {"
        String modifier = "(public)?"; // optional "public" string
        String space = "\\s*";         // 0-or-more whitespace char
        String captureName = "(\\w+)"; // 1-or-more word char (letters)
        String ignore = ".*";          // 0-or-more any char
        // Full regex: "(public)?\s*class\s*(\w+).*"
        String regex = modifier+space+"class"+space+captureName+ignore;
        FileReader fr = new FileReader("TestRegEx.java"); // open this file
        BufferedReader br = new BufferedReader(fr);
        Pattern p = Pattern.compile(regex);
        String line = br.readLine();      // read input line by line
        while ( line!=null ) {
            Matcher m = p.matcher(line);
            if ( m.matches() ) {          // did we find the line with name
                String name = m.group(2); // extract text after class from regex
                System.out.println("class name is "+name); // found it!
                break;                    // don't bother with the rest of file
            }
            line = br.readLine();         // move to next line
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        //CSV_Brackets();
        className();
        CSV_List();
    }
}
