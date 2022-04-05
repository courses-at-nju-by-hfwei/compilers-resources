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

import java.io.FileReader;
import java.io.IOException;

public class ASTViz {
    StringTemplateGroup templates;
    int counter = 1; // used to make unique names
    Tree root;

    public ASTViz(Tree root) throws IOException {
        this.root = root;
        FileReader fr = new FileReader("DOT.stg");
        templates = new StringTemplateGroup(fr);
        fr.close();
    }

    public String toString() {
        StringTemplate fileST = templates.getInstanceOf("file");
        fileST.setAttribute("gname", "testgraph");
        counter = 1;
        walk(root, fileST);
        return fileST.toString();
    }

    /** Fill fileST with nodes and edges; return subtree root's ST */
    protected StringTemplate walk(Tree tree, StringTemplate fileST) {
        StringTemplate parentST = getNodeST(tree);
        fileST.setAttribute("nodes", parentST); // define subtree root
        if ( tree.getChildCount()==0 ) return parentST;
        // for each child, create nodes/edges and inject into fileST
        for (Tree child : tree.children) {
            StringTemplate childST = walk(child, fileST);
            Object from = parentST.getAttribute("name");
            Object to   = childST.getAttribute("name");
            StringTemplate edgeST = getEdgeST(from, to);
            fileST.setAttribute("edges", edgeST);
        }
        return parentST;
    }

    protected StringTemplate getEdgeST(Object from, Object to) {
        StringTemplate edgeST = templates.getInstanceOf("edge");
        edgeST.setAttribute("from", from);
        edgeST.setAttribute("to",   to);
        return edgeST;
    }

    protected StringTemplate getNodeST(Tree t) {
        StringTemplate nodeST = templates.getInstanceOf("node");
        String uniqueName = "node"+counter++; // use counter for unique name
        nodeST.setAttribute("name", uniqueName);
        nodeST.setAttribute("text", t.payload);
        return nodeST;
    }
}
