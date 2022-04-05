/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;

public class LinkViz {
    StringTemplateGroup templates;

    List<Link> links = new ArrayList<Link>();
    public static class Link {
        String from;
        String to;
        public Link(String from, String to) {this.from = from; this.to = to;}
    }
    

    public LinkViz() throws IOException {
        FileReader fr = new FileReader("DOT.stg");
        templates = new StringTemplateGroup(fr);
        fr.close();
    }

    public void addLink(String from, String to) {
        links.add(new Link(from,to));
    }

    public String toString() {
        StringTemplate fileST = templates.getInstanceOf("file");
        fileST.setAttribute("gname", "testgraph");
        for (Link x : links) {
            StringTemplate edgeST = templates.getInstanceOf("edge");
            edgeST.setAttribute("from", x.from);
            edgeST.setAttribute("to",   x.to);
            fileST.setAttribute("edges", edgeST);            
        }
        return fileST.toString(); // render (eval) template to text
    }
}
