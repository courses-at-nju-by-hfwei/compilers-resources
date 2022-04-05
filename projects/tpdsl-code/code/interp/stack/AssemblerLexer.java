/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g 2009-09-23 17:37:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class AssemblerLexer extends Lexer {
    public static final int LETTER=12;
    public static final int T__20=20;
    public static final int WS=14;
    public static final int CHAR=9;
    public static final int STRING=10;
    public static final int FLOAT=11;
    public static final int T__21=21;
    public static final int T__19=19;
    public static final int NEWLINE=4;
    public static final int T__17=17;
    public static final int INT=5;
    public static final int EOF=-1;
    public static final int FUNC=8;
    public static final int T__16=16;
    public static final int STR_CHARS=13;
    public static final int REG=7;
    public static final int T__18=18;
    public static final int T__15=15;
    public static final int ID=6;

    // delegates
    // delegators

    public AssemblerLexer() {;} 
    public AssemblerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AssemblerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:3:7: ( '.globals' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:3:9: '.globals'
            {
            match(".globals"); 


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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:4:7: ( '.def' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:4:9: '.def'
            {
            match(".def"); 


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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:5:7: ( ':' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:5:9: ':'
            {
            match(':'); 

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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:6:7: ( 'args' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:6:9: 'args'
            {
            match("args"); 


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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:7:7: ( '=' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:7:9: '='
            {
            match('='); 

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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:8:7: ( ',' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:8:9: ','
            {
            match(','); 

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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:9:7: ( 'locals' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:9:9: 'locals'
            {
            match("locals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "REG"
    public final void mREG() throws RecognitionException {
        try {
            int _type = REG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:71:5: ( 'r' INT )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:71:9: 'r' INT
            {
            match('r'); 
            mINT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REG"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:73:5: ( LETTER ( LETTER | '0' .. '9' )* )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:73:9: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:73:16: ( LETTER | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:
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

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken ID1=null;

            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:75:5: ( ID '()' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:75:9: ID '()'
            {
            int ID1Start109 = getCharIndex();
            mID(); 
            ID1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, ID1Start109, getCharIndex()-1);
            match("()"); 

            setText((ID1!=null?ID1.getText():null));

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:79:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:79:9: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:82:5: ( ( '-' )? ( '0' .. '9' )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:82:9: ( '-' )? ( '0' .. '9' )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:82:9: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:82:9: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:82:14: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:82:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:84:5: ( '\\'' . '\\'' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:84:9: '\\'' . '\\''
            {
            match('\''); 
            matchAny(); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken STR_CHARS2=null;

            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:86:7: ( '\\\"' STR_CHARS '\\\"' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:86:9: '\\\"' STR_CHARS '\\\"'
            {
            match('\"'); 
            int STR_CHARS2Start193 = getCharIndex();
            mSTR_CHARS(); 
            STR_CHARS2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, STR_CHARS2Start193, getCharIndex()-1);
            match('\"'); 
            setText((STR_CHARS2!=null?STR_CHARS2.getText():null));

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "STR_CHARS"
    public final void mSTR_CHARS() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:88:20: ( (~ '\"' )* )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:88:22: (~ '\"' )*
            {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:88:22: (~ '\"' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:88:22: ~ '\"'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "STR_CHARS"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:91:5: ( INT '.' ( INT )* | '.' ( INT )+ )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-'||(LA7_0>='0' && LA7_0<='9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='.') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:91:9: INT '.' ( INT )*
                    {
                    mINT(); 
                    match('.'); 
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:91:17: ( INT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='-'||(LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:91:17: INT
                    	    {
                    	    mINT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:92:9: '.' ( INT )+
                    {
                    match('.'); 
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:92:13: ( INT )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='-'||(LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:92:13: INT
                    	    {
                    	    mINT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:95:5: ( ( ' ' | '\\t' )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:95:9: ( ' ' | '\\t' )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:95:9: ( ' ' | '\\t' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\t'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:98:5: ( ( ';' ( . )* )? ( '\\r' )? '\\n' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:98:9: ( ';' ( . )* )? ( '\\r' )? '\\n'
            {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:98:9: ( ';' ( . )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==';') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:98:10: ';' ( . )*
                    {
                    match(';'); 
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:98:14: ( . )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\r') ) {
                            alt9=2;
                        }
                        else if ( (LA9_0=='\n') ) {
                            alt9=2;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:98:14: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:98:19: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:98:19: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | REG | ID | FUNC | INT | CHAR | STRING | FLOAT | WS | NEWLINE )
        int alt12=16;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:52: REG
                {
                mREG(); 

                }
                break;
            case 9 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:56: ID
                {
                mID(); 

                }
                break;
            case 10 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:59: FUNC
                {
                mFUNC(); 

                }
                break;
            case 11 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:64: INT
                {
                mINT(); 

                }
                break;
            case 12 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:68: CHAR
                {
                mCHAR(); 

                }
                break;
            case 13 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:73: STRING
                {
                mSTRING(); 

                }
                break;
            case 14 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:80: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 15 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:86: WS
                {
                mWS(); 

                }
                break;
            case 16 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/stack/Assembler.g:1:89: NEWLINE
                {
                mNEWLINE(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\3\uffff\1\23\2\uffff\3\23\1\uffff\1\31\7\uffff\1\23\1\uffff\1\23"+
        "\1\uffff\1\23\1\uffff\1\27\1\uffff\2\23\1\36\1\23\1\uffff\1\23\1"+
        "\41\1\uffff";
    static final String DFA12_eofS =
        "\42\uffff";
    static final String DFA12_minS =
        "\1\11\1\55\1\uffff\1\50\2\uffff\3\50\1\60\1\56\7\uffff\1\50\1\uffff"+
        "\1\50\1\uffff\1\50\1\uffff\1\50\1\uffff\4\50\1\uffff\2\50\1\uffff";
    static final String DFA12_maxS =
        "\1\172\1\147\1\uffff\1\172\2\uffff\3\172\2\71\7\uffff\1\172\1\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\4\172\1\uffff\2\172\1"+
        "\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\3\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\17\1\20\1\1\1\2"+
        "\1\16\1\uffff\1\11\1\uffff\1\12\1\uffff\1\10\1\uffff\1\13\4\uffff"+
        "\1\4\2\uffff\1\7";
    static final String DFA12_specialS =
        "\42\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\15\1\16\2\uffff\1\16\22\uffff\1\15\1\uffff\1\14\4\uffff\1"+
            "\13\4\uffff\1\5\1\11\1\1\1\uffff\12\12\1\2\1\16\1\uffff\1\4"+
            "\3\uffff\32\10\6\uffff\1\3\12\10\1\6\5\10\1\7\10\10",
            "\1\21\2\uffff\12\21\52\uffff\1\20\2\uffff\1\17",
            "",
            "\1\25\7\uffff\12\24\7\uffff\32\24\6\uffff\21\24\1\22\10\24",
            "",
            "",
            "\1\25\7\uffff\12\24\7\uffff\32\24\6\uffff\16\24\1\26\13\24",
            "\1\25\4\uffff\1\27\2\uffff\12\30\7\uffff\32\24\6\uffff\32\24",
            "\1\25\7\uffff\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\12",
            "\1\21\1\uffff\12\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\7\uffff\12\24\7\uffff\32\24\6\uffff\6\24\1\32\23\24",
            "",
            "\1\25\7\uffff\12\24\7\uffff\32\24\6\uffff\32\24",
            "",
            "\1\25\7\uffff\12\24\7\uffff\32\24\6\uffff\2\24\1\33\27\24",
            "",
            "\1\25\7\uffff\12\30\7\uffff\32\24\6\uffff\32\24",
            "",
            "\1\25\7\uffff\12\24\7\uffff\32\24\6\uffff\22\24\1\34\7\24",
            "\1\25\7\uffff\12\24\7\uffff\32\24\6\uffff\1\35\31\24",
            "\1\25\7\uffff\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\25\7\uffff\12\24\7\uffff\32\24\6\uffff\13\24\1\37\16\24",
            "",
            "\1\25\7\uffff\12\24\7\uffff\32\24\6\uffff\22\24\1\40\7\24",
            "\1\25\7\uffff\12\24\7\uffff\32\24\6\uffff\32\24",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | REG | ID | FUNC | INT | CHAR | STRING | FLOAT | WS | NEWLINE );";
        }
    }
 

}