/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g 2009-09-23 17:37:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FigLexer extends Lexer {
    public static final int T__12=12;
    public static final int T__17=17;
    public static final int INT=6;
    public static final int SLCMT=8;
    public static final int WS=7;
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__16=16;
    public static final int STRING=5;
    public static final int T__10=10;
    public static final int CMT=9;
    public static final int T__14=14;
    public static final int T__11=11;
    public static final int T__18=18;
    public static final int T__15=15;
    public static final int ID=4;

    // delegates
    // delegators

    public FigLexer() {;} 
    public FigLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FigLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:3:7: ( '{' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:3:9: '{'
            {
            match('{'); 

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
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:4:7: ( '}' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:4:9: '}'
            {
            match('}'); 

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
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:5:7: ( '.' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:5:9: '.'
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
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:6:7: ( '=' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:6:9: '='
            {
            match('='); 

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
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:7:7: ( ';' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:7:9: ';'
            {
            match(';'); 

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
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:8:7: ( '$' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:8:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:9:7: ( '[' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:9:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:10:7: ( ',' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:10:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:11:7: ( ']' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:11:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:67:5: ( ( '0' .. '9' )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:67:9: ( '0' .. '9' )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:67:9: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:67:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:68:5: ( ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:68:9: ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:68:33: ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:69:8: ( '\"' ( . )* '\"' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:69:10: '\"' ( . )* '\"'
            {
            match('\"'); 
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:69:14: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\"') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:69:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:70:5: ( ( ' ' | '\\n' | '\\t' )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:70:9: ( ' ' | '\\n' | '\\t' )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:70:9: ( ' ' | '\\n' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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

    // $ANTLR start "SLCMT"
    public final void mSLCMT() throws RecognitionException {
        try {
            int _type = SLCMT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:71:6: ( '//' ( . )* ( '\\r' )? '\\n' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:71:9: '//' ( . )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:71:14: ( . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\r') ) {
                    alt5=2;
                }
                else if ( (LA5_0=='\n') ) {
                    alt5=2;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:71:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:71:17: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:71:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLCMT"

    // $ANTLR start "CMT"
    public final void mCMT() throws RecognitionException {
        try {
            int _type = CMT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:72:5: ( '/*' ( . )* '*/' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:72:9: '/*' ( . )* '*/'
            {
            match("/*"); 

            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:72:14: ( . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:72:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CMT"

    public void mTokens() throws RecognitionException {
        // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | INT | ID | STRING | WS | SLCMT | CMT )
        int alt8=15;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:64: INT
                {
                mINT(); 

                }
                break;
            case 11 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:68: ID
                {
                mID(); 

                }
                break;
            case 12 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:71: STRING
                {
                mSTRING(); 

                }
                break;
            case 13 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:78: WS
                {
                mWS(); 

                }
                break;
            case 14 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:81: SLCMT
                {
                mSLCMT(); 

                }
                break;
            case 15 :
                // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:1:87: CMT
                {
                mCMT(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\21\uffff";
    static final String DFA8_eofS =
        "\21\uffff";
    static final String DFA8_minS =
        "\1\11\15\uffff\1\52\2\uffff";
    static final String DFA8_maxS =
        "\1\175\15\uffff\1\57\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\uffff\1\16\1\17";
    static final String DFA8_specialS =
        "\21\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\15\25\uffff\1\15\1\uffff\1\14\1\uffff\1\6\7\uffff\1\10\1"+
            "\uffff\1\3\1\16\12\12\1\uffff\1\5\1\uffff\1\4\3\uffff\32\13"+
            "\1\7\1\uffff\1\11\1\uffff\1\13\1\uffff\32\13\1\1\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\4\uffff\1\17",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | INT | ID | STRING | WS | SLCMT | CMT );";
        }
    }
 

}