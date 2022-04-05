/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g 2009-09-23 17:38:03

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/** Template without actions for walking VecMath trees */
public class Walker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VEC", "ID", "INT", "WS", "'='", "'print'", "'+'", "'*'", "'.'", "'['", "','", "']'"
    };
    public static final int VEC=4;
    public static final int T__12=12;
    public static final int INT=6;
    public static final int T__8=8;
    public static final int WS=7;
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__14=14;
    public static final int T__11=11;
    public static final int T__15=15;
    public static final int ID=5;

    // delegates
    // delegators


        public Walker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Walker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Walker.tokenNames; }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g"; }



    // $ANTLR start "prog"
    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:9:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:9:5: ( ( stat )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:9:9: ( stat )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:9:9: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=8 && LA1_0<=9)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:9:9: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog38);
            	    stat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "stat"
    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:13:1: stat : ( ^( '=' ID expr ) | ^( 'print' expr ) );
    public final void stat() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:13:5: ( ^( '=' ID expr ) | ^( 'print' expr ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==8) ) {
                alt2=1;
            }
            else if ( (LA2_0==9) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:13:9: ^( '=' ID expr )
                    {
                    match(input,8,FOLLOW_8_in_stat52); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_stat54); 
                    pushFollow(FOLLOW_expr_in_stat56);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:14:9: ^( 'print' expr )
                    {
                    match(input,9,FOLLOW_9_in_stat70); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_stat72);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "stat"


    // $ANTLR start "expr"
    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:19:1: expr : ( ^( '+' expr expr ) | ^( '*' expr expr ) | ^( '.' expr expr ) | ^( VEC ( expr )+ ) | INT | ID );
    public final void expr() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:19:5: ( ^( '+' expr expr ) | ^( '*' expr expr ) | ^( '.' expr expr ) | ^( VEC ( expr )+ ) | INT | ID )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 10:
                {
                alt4=1;
                }
                break;
            case 11:
                {
                alt4=2;
                }
                break;
            case 12:
                {
                alt4=3;
                }
                break;
            case VEC:
                {
                alt4=4;
                }
                break;
            case INT:
                {
                alt4=5;
                }
                break;
            case ID:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:19:9: ^( '+' expr expr )
                    {
                    match(input,10,FOLLOW_10_in_expr91); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr93);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr95);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:20:9: ^( '*' expr expr )
                    {
                    match(input,11,FOLLOW_11_in_expr107); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr109);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr111);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:21:9: ^( '.' expr expr )
                    {
                    match(input,12,FOLLOW_12_in_expr123); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr125);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr127);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:22:9: ^( VEC ( expr )+ )
                    {
                    match(input,VEC,FOLLOW_VEC_in_expr139); 

                    match(input, Token.DOWN, null); 
                    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:22:15: ( expr )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=VEC && LA3_0<=INT)||(LA3_0>=10 && LA3_0<=12)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:22:15: expr
                    	    {
                    	    pushFollow(FOLLOW_expr_in_expr141);
                    	    expr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:23:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_expr153); 

                    }
                    break;
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/Walker.g:24:9: ID
                    {
                    match(input,ID,FOLLOW_ID_in_expr163); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog38 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_8_in_stat52 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_stat54 = new BitSet(new long[]{0x0000000000001C70L});
    public static final BitSet FOLLOW_expr_in_stat56 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_9_in_stat70 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_stat72 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_10_in_expr91 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr93 = new BitSet(new long[]{0x0000000000001C70L});
    public static final BitSet FOLLOW_expr_in_expr95 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_11_in_expr107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr109 = new BitSet(new long[]{0x0000000000001C70L});
    public static final BitSet FOLLOW_expr_in_expr111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_12_in_expr123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr125 = new BitSet(new long[]{0x0000000000001C70L});
    public static final BitSet FOLLOW_expr_in_expr127 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VEC_in_expr139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr141 = new BitSet(new long[]{0x0000000000001C78L});
    public static final BitSet FOLLOW_INT_in_expr153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr163 = new BitSet(new long[]{0x0000000000000002L});

}