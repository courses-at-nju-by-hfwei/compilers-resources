/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g 2009-09-23 17:37:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CymbolLexer extends Lexer {
    public static final int LETTER=13;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int EXPR=10;
    public static final int ARG_DECL=5;
    public static final int WS=14;
    public static final int T__21=21;
    public static final int T__19=19;
    public static final int T__22=22;
    public static final int BLOCK=6;
    public static final int T__17=17;
    public static final int INT=12;
    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int T__16=16;
    public static final int CALL=8;
    public static final int T__24=24;
    public static final int METHOD_DECL=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int VAR_DECL=7;
    public static final int SL_COMMENT=15;
    public static final int T__18=18;
    public static final int ELIST=9;
    public static final int ID=11;

    // delegates
    // delegators

    public CymbolLexer() {;} 
    public CymbolLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CymbolLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:3:7: ( '(' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:3:9: '('
            {
            match('('); 

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
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:4:7: ( ')' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:4:9: ')'
            {
            match(')'); 

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
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:5:7: ( ',' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:5:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:6:7: ( 'float' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:6:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:7:7: ( 'int' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:7:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:8:7: ( 'void' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:8:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:9:7: ( '{' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:9:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:10:7: ( '}' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:10:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:11:7: ( '=' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:12:7: ( ';' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:13:7: ( 'return' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:13:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:14:7: ( '+' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:14:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:87:5: ( LETTER ( LETTER | '0' .. '9' )* )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:87:9: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:87:16: ( LETTER | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
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

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:91:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:91:13: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:94:5: ( ( '0' .. '9' )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:94:9: ( '0' .. '9' )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:94:9: ( '0' .. '9' )+
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
            	    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:94:9: '0' .. '9'
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
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:97:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:97:9: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:101:5: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:101:9: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:101:14: (~ ( '\\r' | '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:101:14: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:101:28: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:101:28: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    public void mTokens() throws RecognitionException {
        // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | ID | INT | WS | SL_COMMENT )
        int alt5=16;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:82: ID
                {
                mID(); 

                }
                break;
            case 14 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:85: INT
                {
                mINT(); 

                }
                break;
            case 15 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:89: WS
                {
                mWS(); 

                }
                break;
            case 16 :
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:1:92: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\4\uffff\3\15\4\uffff\1\15\5\uffff\5\15\1\32\3\15\1\uffff\1\36\1"+
        "\15\1\40\1\uffff\1\15\1\uffff\1\42\1\uffff";
    static final String DFA5_eofS =
        "\43\uffff";
    static final String DFA5_minS =
        "\1\11\3\uffff\1\154\1\156\1\157\4\uffff\1\145\5\uffff\1\157\1\164"+
        "\1\151\1\164\1\141\1\60\1\144\1\165\1\164\1\uffff\1\60\1\162\1\60"+
        "\1\uffff\1\156\1\uffff\1\60\1\uffff";
    static final String DFA5_maxS =
        "\1\175\3\uffff\1\154\1\156\1\157\4\uffff\1\145\5\uffff\1\157\1\164"+
        "\1\151\1\164\1\141\1\172\1\144\1\165\1\164\1\uffff\1\172\1\162\1"+
        "\172\1\uffff\1\156\1\uffff\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\7\1\10\1\11\1\12\1\uffff\1\14\1\15"+
        "\1\16\1\17\1\20\11\uffff\1\5\3\uffff\1\6\1\uffff\1\4\1\uffff\1\13";
    static final String DFA5_specialS =
        "\43\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\17\2\uffff\1\17\22\uffff\1\17\7\uffff\1\1\1\2\1\uffff\1\14"+
            "\1\3\2\uffff\1\20\12\16\1\uffff\1\12\1\uffff\1\11\3\uffff\32"+
            "\15\6\uffff\5\15\1\4\2\15\1\5\10\15\1\13\3\15\1\6\4\15\1\7\1"+
            "\uffff\1\10",
            "",
            "",
            "",
            "\1\21",
            "\1\22",
            "\1\23",
            "",
            "",
            "",
            "",
            "\1\24",
            "",
            "",
            "",
            "",
            "",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\12\15\7\uffff\32\15\6\uffff\32\15",
            "\1\33",
            "\1\34",
            "\1\35",
            "",
            "\12\15\7\uffff\32\15\6\uffff\32\15",
            "\1\37",
            "\12\15\7\uffff\32\15\6\uffff\32\15",
            "",
            "\1\41",
            "",
            "\12\15\7\uffff\32\15\6\uffff\32\15",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | ID | INT | WS | SL_COMMENT );";
        }
    }
 

}