/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 Graphics.g 2009-09-23 17:38:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GraphicsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "WS", "'line'", "'from'", "'to'", "','"
    };
    public static final int WS=5;
    public static final int INT=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;

    // delegates
    // delegators


        public GraphicsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GraphicsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GraphicsParser.tokenNames; }
    public String getGrammarFileName() { return "Graphics.g"; }



    // $ANTLR start "file"
    // Graphics.g:4:1: file : ( command )+ ;
    public final void file() throws RecognitionException {
        try {
            // Graphics.g:4:6: ( ( command )+ )
            // Graphics.g:4:8: ( command )+
            {
            // Graphics.g:4:8: ( command )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==6) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Graphics.g:4:8: command
            	    {
            	    pushFollow(FOLLOW_command_in_file11);
            	    command();

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
    // $ANTLR end "file"


    // $ANTLR start "command"
    // Graphics.g:6:1: command : 'line' 'from' point 'to' point ;
    public final void command() throws RecognitionException {
        try {
            // Graphics.g:6:9: ( 'line' 'from' point 'to' point )
            // Graphics.g:6:11: 'line' 'from' point 'to' point
            {
            match(input,6,FOLLOW_6_in_command22); 
            match(input,7,FOLLOW_7_in_command24); 
            pushFollow(FOLLOW_point_in_command26);
            point();

            state._fsp--;

            match(input,8,FOLLOW_8_in_command28); 
            pushFollow(FOLLOW_point_in_command30);
            point();

            state._fsp--;


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
    // $ANTLR end "command"


    // $ANTLR start "point"
    // Graphics.g:8:1: point : INT ',' INT ;
    public final void point() throws RecognitionException {
        try {
            // Graphics.g:8:7: ( INT ',' INT )
            // Graphics.g:8:9: INT ',' INT
            match(input,INT,FOLLOW_INT_in_point39); 
            match(input,9,FOLLOW_9_in_point41); 
            match(input,INT,FOLLOW_INT_in_point43); 

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "point"

    // Delegated rules


 

    public static final BitSet FOLLOW_command_in_file11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6_in_command22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_command24 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_point_in_command26 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_command28 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_point_in_command30 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_point39 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_point41 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_point43 = new BitSet(new long[]{0x0000000000000002L});

}
