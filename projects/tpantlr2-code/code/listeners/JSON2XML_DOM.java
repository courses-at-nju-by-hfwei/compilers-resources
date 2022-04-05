/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.*;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/*
{
    "description" : "An imaginary server config file",
    "logs" : {"level":"verbose", "dir":"/var/log"},
    "host" : "antlr.org",
    "admin": ["parrt", "tombu"]
    "aliases": []
}

to

(root
    (description "An imaginary server config file")
    ...
)

to

<description>An imaginary server config file</description>
<logs>
    <level>verbose</level>
    <dir>/var/log</dir>
</logs>
<host>antlr.org</host>
<admin>
    <element>parrt</element> <!-- inexact -->
    <element>tombu</element>
</admin>
<aliases></aliases>
 */

public class JSON2XML_DOM {
//  static {
//      try {
//          DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//          DocumentBuilder db = dbf.newDocumentBuilder();
//          Document document = db.newDocument();
//          Element root = document.createElement("object");
//          document.appendChild(root);
//          root.appendChild( document.createTextNode("foo") );
//
//          TransformerFactory tf = TransformerFactory.newInstance();
//          Transformer transformer = tf.newTransformer();
//
//          DOMSource source = new DOMSource(document);
//          StreamResult result = new StreamResult(System.out);
//
//          transformer.transform(source, result);
//      }
//      catch (Exception e) {
//          System.out.println(e);
//      }
//  }

    public static class Node {
    }

    public static class Element extends Node {
        String name;
        List<Node> children = new ArrayList<Node>();
        public Element(String name) { this.name = name; }
        public String toString() {
            String content = Utils.join(children.iterator(), "");
            if ( name==null ) return content;
            return XMLEmitter.tag(name, content);
        }
    }

    public static class TextNode extends Node {
        String content;
        public TextNode(String content) { this.content = content; }
        public String toString() { return content; }
    }

    public static class XMLEmitter extends JSONBaseListener {
        ParseTreeProperty<Node> nodes = new ParseTreeProperty<Node>();

        @Override
        public void exitJson(JSONParser.JsonContext ctx) {
            nodes.put(ctx, nodes.get(ctx.getChild(0)));
        }

        @Override
        public void exitAnObject(JSONParser.AnObjectContext ctx) {
            Element o = new Element(null);
            for (JSONParser.PairContext pctx : ctx.pair()) {
                o.children.add(nodes.get(pctx));
            }
            nodes.put(ctx, o);
        }

        @Override
        public void exitArrayOfValues(JSONParser.ArrayOfValuesContext ctx) {
            Element a = new Element(null);
            for (JSONParser.ValueContext vctx : ctx.value()) {
                a.children.add(nodes.get(vctx));
            }
            nodes.put(ctx, a);
        }

        @Override
        public void exitPair(JSONParser.PairContext ctx) {
            String name = stripQuotes(ctx.STRING().getText());
            JSONParser.ValueContext vctx = ctx.value();
            Element p = new Element(name);
            Node value = nodes.get(vctx);
            if ( value!=null ) {
                if ( value instanceof Element && ((Element)value).name==null ) {
                    // if null content, must be object or array, copy in elements
                    p.children.addAll(((Element)value).children);
                }
                else {
                    p.children.add(value);
                }
            }
            nodes.put(ctx, p);
        }

        @Override
        public void exitObjectValue(JSONParser.ObjectValueContext ctx) {
            nodes.put(ctx, nodes.get(ctx.object()));
        }

        @Override
        public void exitArrayValue(JSONParser.ArrayValueContext ctx) {
            JSONParser.ArrayContext array = ctx.array();
            nodes.put(ctx, nodes.get(array));
        }

        @Override
        public void exitString(JSONParser.StringContext ctx) {
            TextNode text = new TextNode(stripQuotes(ctx.start.getText()));
            if ( ctx.parent instanceof JSONParser.ArrayContext ) {
                Element implicitTag = new Element("element");
                implicitTag.children.add( new TextNode(ctx.start.getText()) );
                nodes.put(ctx, implicitTag);
            }
            else {
                nodes.put(ctx, text);
            }
        }

        @Override
        public void exitAtom(JSONParser.AtomContext ctx) {
            TextNode text = new TextNode(ctx.start.getText());
            if ( ctx.parent instanceof JSONParser.ArrayContext ) {
                Element implicitTag = new Element("element");
                implicitTag.children.add( new TextNode(ctx.start.getText()) );
                nodes.put(ctx, implicitTag);
            }
            else {
                nodes.put(ctx, text);
            }
        }

        public static String stripQuotes(String s) {
            if ( s==null || s.charAt(0)!='"' ) return s;
            return s.substring(1, s.length()-1);
        }

        public static String tag(String name, String content) {
            StringBuilder buf = new StringBuilder();
            buf.append('<'+name+'>');
            buf.append(content);
            buf.append("</"+name+'>');
            return buf.toString();
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        JSONLexer lexer = new JSONLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.json();
        // show tree in text form
        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        XMLEmitter converter = new XMLEmitter();
        walker.walk(converter, tree);
        System.out.println(converter.nodes.get(tree));
    }
}
