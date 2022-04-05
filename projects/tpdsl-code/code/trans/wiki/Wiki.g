// START: header
lexer grammar Wiki;
options {filter=true;}
// END: header

@header {
import java.util.*;
import java.io.*;
}

@members {
PrintStream out;
// START: stack
Stack<String> context = new Stack<String>();
void closeList() {
    if ( context.size()==0 ) return;
    String list = context.pop();
    out.println("</"+list+">");
}
// END: stack
// START: ctx
boolean upcomingEndOfCol() {
    return input.LA(1)=='|' ||
           (input.LA(1)=='\n'&&
            (input.LA(2)=='-'&&input.LA(3)=='-')||input.LA(2)==']');
}
// END: ctx
public Wiki(CharStream input, PrintStream out) {
    this(input);
    this.out = out;
}
}

// START: TITLE
TITLE
    :   {getLine()==1}?=> TAIL
        {out.println("<title>"+$TAIL.text+"</title>");}
    ;
// END: TITLE

// START: BOLD
BOLD:   {getCharPositionInLine()>0}?=>
        '*'                              {out.print("<b>");}
        (c=~'*' {out.print((char)$c);})+
        '*'                              {out.print("</b>");}
    ;
// END: BOLD

LINK:   '@'             {out.print("<a href=");}
        (c=~('|'|'@')   {out.print((char)$c);})+
        (   '|'         {out.print(">");}
            (c=~'@' {out.print((char)$c);})+
        )?
        '@' {out.print("</a>");}
    ;

ITALICS
    :   '_' {out.print("<i>");}
        (c=~'_' {out.print((char)$c);})+
        '_' {out.print("</i>");}
    ;

// START: LI
LI: {getCharPositionInLine()==0}?=>'* '  {out.print("<li>");} ;
// END: LI

// START: BLANK_LINE
BLANK_LINE
    :   '\n\n'               {out.println("\n"); closeList(); }
        (   UL
        |   SECTION
        |   TABLE
        |   /* paragraph */  {out.println("<p>");}
        )
    ;
// END: BLANK_LINE

// START: UL
fragment
UL: '* ' {out.print("<ul>\n<li>"); context.push("ul");} ;
// END: UL

fragment
SECTION
@init {String h=null;}
    :   {getCharPositionInLine()==0}?=>
        (   '###'   {h = "h1";}
        |   '##'    {h = "h2";}
        |   '#'     {h = "h3";}
        )
        SEC_TAIL
        {out.println("<"+h+">"+$SEC_TAIL.text+"</"+h+">");}
    ;

// START: TABLE
fragment
TABLE
    :   '['                     {out.print("<table border=1>\n");}
        ROW ('\n--\n' ROW)* '\n'
        ']'                     {out.print("\n</table>");}
    ;
// END: TABLE

fragment
ROW :   {out.print("<tr>\n");}
        COL ('|' COL)*
        {out.print("\n</tr>\n");}
    ;

fragment
COL :   {out.print("<td>");}
        TABLE_CONTENT+
        {out.print("</td>");}
    ;

// START: TABLE_CONTENT
fragment
TABLE_CONTENT
    :   TABLE
    |   BOLD
    |   ITALICS
    |   {!upcomingEndOfCol()}?=> c=. {out.print((char)$c);}
    ;
// END: TABLE_CONTENT

// START: TAIL    
fragment
TAIL : ~'\n'+ ;
// END: TAIL

fragment
SEC_TAIL : ~('\n'|'#')+ ;

// START: ELSE
ELSE:   c=. {out.print((char)$c);} ; // match any char and emit
// END: ELSE
