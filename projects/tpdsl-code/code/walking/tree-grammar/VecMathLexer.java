/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g 2009-09-23 17:38:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class VecMathLexer extends Lexer {
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

    public VecMathLexer() {;} 
    public VecMathLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public VecMathLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:3:6: ( '=' )
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:3:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:4:6: ( 'print' )
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:4:8: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:5:7: ( '+' )
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:5:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:6:7: ( '*' )
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:6:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:7:7: ( '.' )
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:7:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:8:7: ( '[' )
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:8:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:9:7: ( ',' )
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:10:7: ( ']' )
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:10:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:28:5: ( ( 'a' .. 'z' )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:28:9: ( 'a' .. 'z' )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:28:9: ( 'a' .. 'z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:28:9: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:29:5: ( ( '0' .. '9' )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:29:9: ( '0' .. '9' )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:29:9: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:29:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:30:5: ( ( ' ' | '\\r' | '\\n' )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:30:9: ( ' ' | '\\r' | '\\n' )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:30:9: ( ' ' | '\\r' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n'||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | ID | INT | WS )
        int alt4=11;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:1:56: ID
                {
                mID(); 

                }
                break;
            case 10 :
                // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:1:59: INT
                {
                mINT(); 

                }
                break;
            case 11 :
                // /Users/parrt/research/book/TPDSL/Book/code/walking/tree-grammar/VecMath.g:1:63: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\2\uffff\1\11\11\uffff\3\11\1\20\1\uffff";
    static final String DFA4_eofS =
        "\21\uffff";
    static final String DFA4_minS =
        "\1\12\1\uffff\1\162\11\uffff\1\151\1\156\1\164\1\141\1\uffff";
    static final String DFA4_maxS =
        "\1\172\1\uffff\1\162\11\uffff\1\151\1\156\1\164\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\4\uffff"+
        "\1\2";
    static final String DFA4_specialS =
        "\21\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\13\2\uffff\1\13\22\uffff\1\13\11\uffff\1\4\1\3\1\7\1\uffff"+
            "\1\5\1\uffff\12\12\3\uffff\1\1\35\uffff\1\6\1\uffff\1\10\3\uffff"+
            "\17\11\1\2\12\11",
            "",
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\32\11",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | ID | INT | WS );";
        }
    }
 

}