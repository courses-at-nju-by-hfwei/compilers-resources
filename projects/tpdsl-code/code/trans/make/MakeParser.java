/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.1.4-SNAPSHOT Sep 03, 2009 16:28:07 Make.g 2009-09-21 17:42:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MakeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ITEM", "ACTION", "COMMENT", "WS", "':'", "'\\n'"
    };
    public static final int WS=7;
    public static final int ITEM=4;
    public static final int COMMENT=6;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int ACTION=5;

    // delegates
    // delegators


        public MakeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MakeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return MakeParser.tokenNames; }
    public String getGrammarFileName() { return "Make.g"; }


    MakeGenerator gen;
    public MakeParser(TokenStream input, MakeGenerator gen) {
        super(input);
        this.gen = gen;
    }



    // $ANTLR start "rules"
    // Make.g:14:1: rules : ( rule )+ ;
    public final void rules() throws RecognitionException {
        try {
            // Make.g:15:5: ( ( rule )+ )
            // Make.g:15:9: ( rule )+
            {
            gen.start();
            // Make.g:15:24: ( rule )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ITEM||LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Make.g:15:24: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_rules27);
            	    rule();

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

            gen.finish();

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
    // $ANTLR end "rules"


    // $ANTLR start "rule"
    // Make.g:20:1: rule : (target= ITEM ':' (i= ITEM )* '\\n' ( ACTION )+ | '\\n' );
    public final void rule() throws RecognitionException {
        Token target=null;
        Token i=null;
        Token ACTION1=null;

        try {
            // Make.g:21:5: (target= ITEM ':' (i= ITEM )* '\\n' ( ACTION )+ | '\\n' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ITEM) ) {
                alt4=1;
            }
            else if ( (LA4_0==9) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // Make.g:21:9: target= ITEM ':' (i= ITEM )* '\\n' ( ACTION )+
                    {
                    target=(Token)match(input,ITEM,FOLLOW_ITEM_in_rule53); 
                    match(input,8,FOLLOW_8_in_rule55); 
                    gen.target((target!=null?target.getText():null));
                    // Make.g:22:9: (i= ITEM )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==ITEM) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Make.g:22:10: i= ITEM
                    	    {
                    	    i=(Token)match(input,ITEM,FOLLOW_ITEM_in_rule74); 
                    	    gen.dependency((i!=null?i.getText():null));

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match(input,9,FOLLOW_9_in_rule80); 
                    // Make.g:23:9: ( ACTION )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==ACTION) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Make.g:23:10: ACTION
                    	    {
                    	    ACTION1=(Token)match(input,ACTION,FOLLOW_ACTION_in_rule91); 
                    	    gen.action((ACTION1!=null?ACTION1.getText():null));

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

                    gen.endTarget((target!=null?target.getText():null));

                    }
                    break;
                case 2 :
                    // Make.g:25:9: '\\n'
                    {
                    match(input,9,FOLLOW_9_in_rule135); 

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
    // $ANTLR end "rule"

    // Delegated rules


 

    public static final BitSet FOLLOW_rule_in_rules27 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_ITEM_in_rule53 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_rule55 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ITEM_in_rule74 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_9_in_rule80 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ACTION_in_rule91 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9_in_rule135 = new BitSet(new long[]{0x0000000000000002L});

}