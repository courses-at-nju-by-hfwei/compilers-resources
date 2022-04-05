/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g 2009-09-23 17:38:02

import java.util.*;
import java.io.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Wiki extends Lexer {
    public static final int ITALICS=8;
    public static final int ELSE=18;
    public static final int TABLE=12;
    public static final int SECTION=11;
    public static final int UL=10;
    public static final int LI=9;
    public static final int SEC_TAIL=14;
    public static final int EOF=-1;
    public static final int TABLE_CONTENT=17;
    public static final int COL=16;
    public static final int LINK=7;
    public static final int TITLE=5;
    public static final int BOLD=6;
    public static final int TAIL=4;
    public static final int BLANK_LINE=13;
    public static final int ROW=15;

    PrintStream out;
    Stack<String> context = new Stack<String>();
    void closeList() {
        if ( context.size()==0 ) return;
        String list = context.pop();
        out.println("</"+list+">");
    }
    boolean upcomingEndOfCol() {
        return input.LA(1)=='|' ||
               (input.LA(1)=='\n'&&
                (input.LA(2)=='-'&&input.LA(3)=='-')||input.LA(2)==']');
    }
    public Wiki(CharStream input, PrintStream out) {
        this(input);
        this.out = out;
    }


    // delegates
    // delegators

    public Wiki() {;} 
    public Wiki(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Wiki(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g"; }

    public Token nextToken() {
        while (true) {
            if ( input.LA(1)==CharStream.EOF ) {
                return Token.EOF_TOKEN;
            }
            state.token = null;
    	state.channel = Token.DEFAULT_CHANNEL;
            state.tokenStartCharIndex = input.index();
            state.tokenStartCharPositionInLine = input.getCharPositionInLine();
            state.tokenStartLine = input.getLine();
    	state.text = null;
            try {
                int m = input.mark();
                state.backtracking=1; 
                state.failed=false;
                mTokens();
                state.backtracking=0;

                if ( state.failed ) {
                    input.rewind(m);
                    input.consume(); 
                }
                else {
                    emit();
                    return state.token;
                }
            }
            catch (RecognitionException re) {
                // shouldn't happen in backtracking mode, but...
                reportError(re);
                recover(re);
            }
        }
    }

    public void memoize(IntStream input,
    		int ruleIndex,
    		int ruleStartIndex)
    {
    if ( state.backtracking>1 ) super.memoize(input, ruleIndex, ruleStartIndex);
    }

    public boolean alreadyParsedRule(IntStream input, int ruleIndex) {
    if ( state.backtracking>1 ) return super.alreadyParsedRule(input, ruleIndex);
    return false;
    }// $ANTLR start "TITLE"
    public final void mTITLE() throws RecognitionException {
        try {
            int _type = TITLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken TAIL1=null;

            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:36:5: ({...}? => TAIL )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:36:9: {...}? => TAIL
            {
            if ( !((getLine()==1)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "TITLE", "getLine()==1");
            }
            int TAIL1Start43 = getCharIndex();
            mTAIL(); if (state.failed) return ;
            TAIL1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, TAIL1Start43, getCharIndex()-1);
            if ( state.backtracking==1 ) {
              out.println("<title>"+(TAIL1!=null?TAIL1.getText():null)+"</title>");
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TITLE"

    // $ANTLR start "BOLD"
    public final void mBOLD() throws RecognitionException {
        try {
            int _type = BOLD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:42:5: ({...}? => '*' (c=~ '*' )+ '*' )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:42:9: {...}? => '*' (c=~ '*' )+ '*'
            {
            if ( !((getCharPositionInLine()>0)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "BOLD", "getCharPositionInLine()>0");
            }
            match('*'); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              out.print("<b>");
            }
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:44:9: (c=~ '*' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:44:10: c=~ '*'
            	    {
            	    c= input.LA(1);
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    if ( state.backtracking==1 ) {
            	      out.print((char)c);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('*'); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              out.print("</b>");
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOLD"

    // $ANTLR start "LINK"
    public final void mLINK() throws RecognitionException {
        try {
            int _type = LINK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:49:5: ( '@' (c=~ ( '|' | '@' ) )+ ( '|' (c=~ '@' )+ )? '@' )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:49:9: '@' (c=~ ( '|' | '@' ) )+ ( '|' (c=~ '@' )+ )? '@'
            {
            match('@'); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              out.print("<a href=");
            }
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:50:9: (c=~ ( '|' | '@' ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='?')||(LA2_0>='A' && LA2_0<='{')||(LA2_0>='}' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:50:10: c=~ ( '|' | '@' )
            	    {
            	    c= input.LA(1);
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    if ( state.backtracking==1 ) {
            	      out.print((char)c);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:51:9: ( '|' (c=~ '@' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='|') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:51:13: '|' (c=~ '@' )+
                    {
                    match('|'); if (state.failed) return ;
                    if ( state.backtracking==1 ) {
                      out.print(">");
                    }
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:52:13: (c=~ '@' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='?')||(LA3_0>='A' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:52:14: c=~ '@'
                    	    {
                    	    c= input.LA(1);
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}

                    	    if ( state.backtracking==1 ) {
                    	      out.print((char)c);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }

            match('@'); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              out.print("</a>");
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINK"

    // $ANTLR start "ITALICS"
    public final void mITALICS() throws RecognitionException {
        try {
            int _type = ITALICS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:58:5: ( '_' (c=~ '_' )+ '_' )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:58:9: '_' (c=~ '_' )+ '_'
            {
            match('_'); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              out.print("<i>");
            }
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:59:9: (c=~ '_' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='^')||(LA5_0>='`' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:59:10: c=~ '_'
            	    {
            	    c= input.LA(1);
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='^')||(input.LA(1)>='`' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    if ( state.backtracking==1 ) {
            	      out.print((char)c);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            match('_'); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              out.print("</i>");
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ITALICS"

    // $ANTLR start "LI"
    public final void mLI() throws RecognitionException {
        try {
            int _type = LI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:64:3: ({...}? => '* ' )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:64:5: {...}? => '* '
            {
            if ( !((getCharPositionInLine()==0)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "LI", "getCharPositionInLine()==0");
            }
            match("* "); if (state.failed) return ;

            if ( state.backtracking==1 ) {
              out.print("<li>");
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LI"

    // $ANTLR start "BLANK_LINE"
    public final void mBLANK_LINE() throws RecognitionException {
        try {
            int _type = BLANK_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:69:5: ( '\\n\\n' ( UL | SECTION | TABLE | ) )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:69:9: '\\n\\n' ( UL | SECTION | TABLE | )
            {
            match("\n\n"); if (state.failed) return ;

            if ( state.backtracking==1 ) {
              out.println("\n"); closeList(); 
            }
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:70:9: ( UL | SECTION | TABLE | )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='*') ) {
                alt6=1;
            }
            else if ( (LA6_0=='#') && ((getCharPositionInLine()==0))) {
                alt6=2;
            }
            else if ( (LA6_0=='[') ) {
                alt6=3;
            }
            else {
                alt6=4;}
            switch (alt6) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:70:13: UL
                    {
                    mUL(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:71:13: SECTION
                    {
                    mSECTION(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:72:13: TABLE
                    {
                    mTABLE(); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:73:30: 
                    {
                    if ( state.backtracking==1 ) {
                      out.println("<p>");
                    }

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLANK_LINE"

    // $ANTLR start "UL"
    public final void mUL() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:80:3: ( '* ' )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:80:5: '* '
            {
            match("* "); if (state.failed) return ;

            if ( state.backtracking==1 ) {
              out.print("<ul>\n<li>"); context.push("ul");
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end "UL"

    // $ANTLR start "SECTION"
    public final void mSECTION() throws RecognitionException {
        try {
            CommonToken SEC_TAIL2=null;

            String h=null;
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:86:5: ({...}? => ( '###' | '##' | '#' ) SEC_TAIL )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:86:9: {...}? => ( '###' | '##' | '#' ) SEC_TAIL
            {
            if ( !((getCharPositionInLine()==0)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "SECTION", "getCharPositionInLine()==0");
            }
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:87:9: ( '###' | '##' | '#' )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='#') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='#') ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2=='#') ) {
                        alt7=1;
                    }
                    else if ( ((LA7_2>='\u0000' && LA7_2<='\t')||(LA7_2>='\u000B' && LA7_2<='\"')||(LA7_2>='$' && LA7_2<='\uFFFF')) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA7_1>='\u0000' && LA7_1<='\t')||(LA7_1>='\u000B' && LA7_1<='\"')||(LA7_1>='$' && LA7_1<='\uFFFF')) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:87:13: '###'
                    {
                    match("###"); if (state.failed) return ;

                    if ( state.backtracking==1 ) {
                      h = "h1";
                    }

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:88:13: '##'
                    {
                    match("##"); if (state.failed) return ;

                    if ( state.backtracking==1 ) {
                      h = "h2";
                    }

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:89:13: '#'
                    {
                    match('#'); if (state.failed) return ;
                    if ( state.backtracking==1 ) {
                      h = "h3";
                    }

                    }
                    break;

            }

            int SEC_TAIL2Start582 = getCharIndex();
            mSEC_TAIL(); if (state.failed) return ;
            SEC_TAIL2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, SEC_TAIL2Start582, getCharIndex()-1);
            if ( state.backtracking==1 ) {
              out.println("<"+h+">"+(SEC_TAIL2!=null?SEC_TAIL2.getText():null)+"</"+h+">");
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end "SECTION"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:98:5: ( '[' ROW ( '\\n--\\n' ROW )* '\\n' ']' )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:98:9: '[' ROW ( '\\n--\\n' ROW )* '\\n' ']'
            {
            match('['); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              out.print("<table border=1>\n");
            }
            mROW(); if (state.failed) return ;
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:99:13: ( '\\n--\\n' ROW )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\n') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='-') ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:99:14: '\\n--\\n' ROW
            	    {
            	    match("\n--\n"); if (state.failed) return ;

            	    mROW(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\n'); if (state.failed) return ;
            match(']'); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              out.print("\n</table>");
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "ROW"
    public final void mROW() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:105:5: ( COL ( '|' COL )* )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:105:9: COL ( '|' COL )*
            {
            if ( state.backtracking==1 ) {
              out.print("<tr>\n");
            }
            mCOL(); if (state.failed) return ;
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:106:13: ( '|' COL )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='|') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:106:14: '|' COL
            	    {
            	    match('|'); if (state.failed) return ;
            	    mCOL(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==1 ) {
              out.print("\n</tr>\n");
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end "ROW"

    // $ANTLR start "COL"
    public final void mCOL() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:111:5: ( ( TABLE_CONTENT )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:111:9: ( TABLE_CONTENT )+
            {
            if ( state.backtracking==1 ) {
              out.print("<td>");
            }
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:112:9: ( TABLE_CONTENT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='[') ) {
                    alt10=1;
                }
                else if ( (LA10_0=='*') && (((!upcomingEndOfCol())||(getCharPositionInLine()>0)))) {
                    alt10=1;
                }
                else if ( (LA10_0=='_') ) {
                    alt10=1;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='Z')||(LA10_0>='\\' && LA10_0<='^')||(LA10_0>='`' && LA10_0<='\uFFFF')) && ((!upcomingEndOfCol()))) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:112:9: TABLE_CONTENT
            	    {
            	    mTABLE_CONTENT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( state.backtracking==1 ) {
              out.print("</td>");
            }

            }

        }
        finally {
        }
    }
    // $ANTLR end "COL"

    // $ANTLR start "TABLE_CONTENT"
    public final void mTABLE_CONTENT() throws RecognitionException {
        try {
            int c;

            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:119:5: ( TABLE | BOLD | ITALICS | {...}? =>c= . )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='[') ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1>='\u0000' && LA11_1<='\uFFFF')) ) {
                    alt11=1;
                }
                else {
                    alt11=4;}
            }
            else if ( (LA11_0=='*') && (((!upcomingEndOfCol())||(getCharPositionInLine()>0)))) {
                int LA11_2 = input.LA(2);

                if ( ((LA11_2>='\u0000' && LA11_2<=')')||(LA11_2>='+' && LA11_2<='\uFFFF')) && ((getCharPositionInLine()>0))) {
                    alt11=2;
                }
                else {
                    alt11=4;}
            }
            else if ( (LA11_0=='_') ) {
                int LA11_3 = input.LA(2);

                if ( ((LA11_3>='\u0000' && LA11_3<='^')||(LA11_3>='`' && LA11_3<='\uFFFF')) ) {
                    alt11=3;
                }
                else {
                    alt11=4;}
            }
            else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='Z')||(LA11_0>='\\' && LA11_0<='^')||(LA11_0>='`' && LA11_0<='\uFFFF')) && ((!upcomingEndOfCol()))) {
                alt11=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:119:9: TABLE
                    {
                    mTABLE(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:120:9: BOLD
                    {
                    mBOLD(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:121:9: ITALICS
                    {
                    mITALICS(); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:122:9: {...}? =>c= .
                    {
                    if ( !((!upcomingEndOfCol())) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "TABLE_CONTENT", "!upcomingEndOfCol()");
                    }
                    c = input.LA(1);
                    matchAny(); if (state.failed) return ;
                    if ( state.backtracking==1 ) {
                      out.print((char)c);
                    }

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "TABLE_CONTENT"

    // $ANTLR start "TAIL"
    public final void mTAIL() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:128:6: ( (~ '\\n' )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:128:8: (~ '\\n' )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:128:8: (~ '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:128:8: ~ '\\n'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "TAIL"

    // $ANTLR start "SEC_TAIL"
    public final void mSEC_TAIL() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:132:10: ( (~ ( '\\n' | '#' ) )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:132:12: (~ ( '\\n' | '#' ) )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:132:12: (~ ( '\\n' | '#' ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\"')||(LA13_0>='$' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:132:12: ~ ( '\\n' | '#' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "SEC_TAIL"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:135:5: (c= . )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:135:9: c= .
            {
            c = input.LA(1);
            matchAny(); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              out.print((char)c);
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    public void mTokens() throws RecognitionException {
        // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:39: ( TITLE | BOLD | LINK | ITALICS | LI | BLANK_LINE | ELSE )
        int alt14=7;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:41: TITLE
                {
                mTITLE(); if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:47: BOLD
                {
                mBOLD(); if (state.failed) return ;

                }
                break;
            case 3 :
                // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:52: LINK
                {
                mLINK(); if (state.failed) return ;

                }
                break;
            case 4 :
                // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:57: ITALICS
                {
                mITALICS(); if (state.failed) return ;

                }
                break;
            case 5 :
                // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:65: LI
                {
                mLI(); if (state.failed) return ;

                }
                break;
            case 6 :
                // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:68: BLANK_LINE
                {
                mBLANK_LINE(); if (state.failed) return ;

                }
                break;
            case 7 :
                // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:79: ELSE
                {
                mELSE(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Wiki
    public final void synpred1_Wiki_fragment() throws RecognitionException {   
        // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:41: ( TITLE )
        // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:41: TITLE
        {
        mTITLE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Wiki

    // $ANTLR start synpred2_Wiki
    public final void synpred2_Wiki_fragment() throws RecognitionException {   
        // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:47: ( BOLD )
        // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:47: BOLD
        {
        mBOLD(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Wiki

    // $ANTLR start synpred3_Wiki
    public final void synpred3_Wiki_fragment() throws RecognitionException {   
        // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:52: ( LINK )
        // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:52: LINK
        {
        mLINK(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Wiki

    // $ANTLR start synpred4_Wiki
    public final void synpred4_Wiki_fragment() throws RecognitionException {   
        // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:57: ( ITALICS )
        // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:57: ITALICS
        {
        mITALICS(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Wiki

    // $ANTLR start synpred5_Wiki
    public final void synpred5_Wiki_fragment() throws RecognitionException {   
        // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:65: ( LI )
        // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:65: LI
        {
        mLI(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Wiki

    // $ANTLR start synpred6_Wiki
    public final void synpred6_Wiki_fragment() throws RecognitionException {   
        // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:68: ( BLANK_LINE )
        // /Users/parrt/research/book/TPDSL/Book/code/trans/wiki/Wiki.g:1:68: BLANK_LINE
        {
        mBLANK_LINE(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Wiki

    public final boolean synpred6_Wiki() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Wiki_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Wiki() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Wiki_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Wiki() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Wiki_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Wiki() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Wiki_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Wiki() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Wiki_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Wiki() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Wiki_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\15\uffff";
    static final String DFA14_eofS =
        "\15\uffff";
    static final String DFA14_minS =
        "\6\0\7\uffff";
    static final String DFA14_maxS =
        "\1\uffff\5\0\7\uffff";
    static final String DFA14_acceptS =
        "\6\uffff\1\1\1\2\1\5\1\7\1\3\1\4\1\6";
    static final String DFA14_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\7\uffff}>";
    static final String[] DFA14_transitionS = {
            "\12\4\1\5\37\4\1\1\25\4\1\2\36\4\1\3\uffa0\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens options {k=1; backtrack=true; } : ( TITLE | BOLD | LINK | ITALICS | LI | BLANK_LINE | ELSE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='*') ) {s = 1;}

                        else if ( (LA14_0=='@') ) {s = 2;}

                        else if ( (LA14_0=='_') ) {s = 3;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='?')||(LA14_0>='A' && LA14_0<='^')||(LA14_0>='`' && LA14_0<='\uFFFF')) ) {s = 4;}

                        else if ( (LA14_0=='\n') ) {s = 5;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred1_Wiki()&&(getLine()==1))) ) {s = 6;}

                        else if ( ((synpred2_Wiki()&&(getCharPositionInLine()>0))) ) {s = 7;}

                        else if ( ((synpred5_Wiki()&&(getCharPositionInLine()==0))) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred1_Wiki()&&(getLine()==1))) ) {s = 6;}

                        else if ( (synpred3_Wiki()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred1_Wiki()&&(getLine()==1))) ) {s = 6;}

                        else if ( (synpred4_Wiki()) ) {s = 11;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred1_Wiki()&&(getLine()==1))) ) {s = 6;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Wiki()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}