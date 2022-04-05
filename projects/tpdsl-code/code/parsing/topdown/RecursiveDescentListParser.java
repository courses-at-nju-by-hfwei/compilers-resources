/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class RecursiveDescentListParser {
    public static final char EOF = (char)-1; //  represent end of file char
    String input; // input string
    int i = 0;    // index into input of current character
    char c;       // current character

    public RecursiveDescentListParser(String input) {
        this.input = input;
        c = input.charAt(i); // prime lookahead
    }
 
    /** Move to next non-whitespace character */
    public void consume() { advance(); WS(); }

    /** Move one character; detect "end of file" */
    public void advance() {
        i++;
        if ( i>= input.length() ) c = EOF;
        else c = input.charAt(i);
    }

    /** Ensure x is next character on the input stream */
    public void match(char x) {
        if ( c == x) consume();
        else throw new Error("expecting "+x+"; found "+c);
    }

    boolean isLETTER() { return c>='a'&&c<='z' || c>='A'&&c<='Z'; }

    /** list : '[' elements ']' ; // match bracketed list */
    public void list() {
        match('['); elements(); match(']');
    }

    /** elements : element (',' element)* ; // match comma-separated list */
    void elements() {
        element(); while ( c==',' ) { match(','); element(); }
    }

    /** element : name | list ; // element is name or nested list */
    void element() {
        if ( isLETTER() ) name();
        else if ( c=='[' ) list();
        else throw new Error("expecting name or list; found "+c);
    }

    /** name : LETTER+ ; // name is sequence of >=1 letter */
    void name() { do LETTER(); while ( isLETTER() ); }

    /** LETTER   : 'a'..'z'|'A'..'Z'; // define what a letter is (\w) */
    void LETTER() {
        if ( isLETTER() ) consume();
        else throw new Error("expecting LETTER; found "+c);
    }
    
    /** WS : (' '|'\t'|'\n'|'\r')* ; // ignore any whitespace */
    void WS() {
        while ( c==' ' || c=='\t' || c=='\n' || c=='\r' ) advance();
    }

    public static void main(String[] args) {
        RecursiveDescentListParser p = new RecursiveDescentListParser(args[0]);
        p.list();
    }
}
