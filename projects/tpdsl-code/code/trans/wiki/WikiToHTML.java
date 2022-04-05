/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.io.FileReader;
import java.io.PrintStream;

import org.antlr.runtime.*;

public class WikiToHTML {
    public static void main(String args[]) throws Exception {
        String wikiFilename = args[0];
        FileReader fr = new FileReader(wikiFilename);
        PrintStream out = System.out;
        header(out);
        Wiki lex = new Wiki(new ANTLRReaderStream(fr), out);
        try {
            Token t = lex.nextToken();
            while ( t.getType() != Token.EOF ) t=lex.nextToken();
        }
        finally { fr.close(); }
        trailer(out);
    }
    
    static void header(PrintStream out) {
        out.println(
            "<HTML>\n"+
            "<HEAD>\n"+
            "<meta http-equiv=content-type content=\"text/html; charset=utf-8\"/>\n"+
            "<link rel=stylesheet href=http://www.cs.usfca.edu/~parrt/lecture-wiki.css "+
                "type=\"text/css\"/>\n"+
            "</HEAD>\n"+
            "<BODY>\n");
    }

    static void trailer(PrintStream out) {
        out.println("</BODY>");
        out.println("</HTML>");
    }
}

