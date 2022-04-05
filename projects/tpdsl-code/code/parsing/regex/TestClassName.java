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

public class TestClassName {
    public static void main(String[] args) throws IOException {
        // match complete lines like "public class TestClassName {"
        String modifier = "(public)?"; // optional "public" string
        String space = "\\s*";         // 0-or-more whitespace char
        String captureName = "(\\w+)"; // 1-or-more word char (letters)
        String ignore = ".*";          // 0-or-more any char
        // Full regex: "(public)?\s*class\s*(\w+).*"
        String regex = modifier+space+"class"+space+captureName+ignore;
        FileReader fr = new FileReader("TestClassName.java"); // open this file
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
}
