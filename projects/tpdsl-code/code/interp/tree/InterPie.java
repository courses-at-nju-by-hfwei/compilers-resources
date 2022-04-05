/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import java.io.InputStream;
import java.io.FileInputStream;

public class InterPie {
    /** An adaptor that tells ANTLR to build PieAST nodes */
    public static TreeAdaptor pieAdaptor = new CommonTreeAdaptor() {
        public Object create(Token token) {
            return new PieAST(token);
        }
        public Object dupNode(Object t) {
            if ( t==null ) {
                return null;
            }
            return create(((PieAST)t).token);
        }
        public Object errorNode(TokenStream input, Token start, Token stop,
                                RecognitionException e)
        {
            return new PieErrorNode(input, start, stop, e);
        }
    };

    public static void main(String[] args) throws Exception {
        InputStream input = null;
        if ( args.length>0 ) input = new FileInputStream(args[0]);
        else input = System.in;
        Interpreter interp = new Interpreter();
        interp.interp(input);
    }
}
