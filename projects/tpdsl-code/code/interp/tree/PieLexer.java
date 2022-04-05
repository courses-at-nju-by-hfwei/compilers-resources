/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g 2009-09-23 17:37:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PieLexer extends Lexer {
    public static final int ARGS=4;
    public static final int T__35=35;
    public static final int LETTER=28;
    public static final int DEF=13;
    public static final int T__36=36;
    public static final int WHILE=11;
    public static final int WS=29;
    public static final int CHAR=25;
    public static final int STRING=27;
    public static final int NEW=21;
    public static final int EQ=17;
    public static final int FLOAT=26;
    public static final int LT=18;
    public static final int T__33=33;
    public static final int DOT=20;
    public static final int BLOCK=6;
    public static final int MUL=16;
    public static final int NL=23;
    public static final int PRINT=10;
    public static final int RETURN=12;
    public static final int IF=8;
    public static final int T__31=31;
    public static final int INT=24;
    public static final int EOF=-1;
    public static final int STRUCT=19;
    public static final int ASSIGN=9;
    public static final int T__32=32;
    public static final int CALL=7;
    public static final int T__37=37;
    public static final int T__34=34;
    public static final int SUB=15;
    public static final int SL_COMMENT=30;
    public static final int ADD=14;
    public static final int FIELDS=5;
    public static final int ID=22;

    // delegates
    // delegators

    public PieLexer() {;} 
    public PieLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PieLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g"; }

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:3:4: ( 'if' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:3:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:4:8: ( '=' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:4:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:5:7: ( 'print' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:5:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:6:7: ( 'while' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:6:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:7:8: ( 'return' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:7:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:8:5: ( 'def' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:8:7: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:9:5: ( '+' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:9:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:10:5: ( '-' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:10:7: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:11:5: ( '*' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:11:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:12:4: ( '==' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:12:6: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:13:4: ( '<' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:13:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "STRUCT"
    public final void mSTRUCT() throws RecognitionException {
        try {
            int _type = STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:14:8: ( 'struct' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:14:10: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRUCT"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:15:5: ( '.' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:15:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:16:5: ( 'new' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:16:7: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:17:7: ( '{' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:18:7: ( ',' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:19:7: ( '}' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:20:7: ( '(' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:21:7: ( ')' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:22:7: ( ':' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:22:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:23:7: ( 'else' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:23:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:126:4: ( ( '\\r' )? '\\n' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:126:6: ( '\\r' )? '\\n'
            {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:126:6: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:126:6: '\\r'
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
    // $ANTLR end "NL"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:128:5: ( LETTER ( LETTER | '0' .. '9' )* )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:128:9: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:128:16: ( LETTER | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:
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

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:132:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:132:6: ( 'a' .. 'z' | 'A' .. 'Z' )
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

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:135:5: ( '\\'' . '\\'' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:135:7: '\\'' . '\\''
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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:137:7: ( '\\\"' ( . )* '\\\"' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:137:9: '\\\"' ( . )* '\\\"'
            {
            match('\"'); 
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:137:14: ( . )*
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
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:137:14: .
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:139:5: ( ( '0' .. '9' )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:139:9: ( '0' .. '9' )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:139:9: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:139:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:142:2: ( INT '.' ( INT )* | '.' ( INT )+ )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
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
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:142:4: INT '.' ( INT )*
                    {
                    mINT(); 
                    match('.'); 
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:142:12: ( INT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:142:12: INT
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
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:143:4: '.' ( INT )+
                    {
                    match('.'); 
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:143:8: ( INT )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:143:8: INT
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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:146:5: ( ( ' ' | '\\t' ) )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:146:9: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:149:5: ( '#' (~ ( '\\r' | '\\n' ) )* )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:149:9: '#' (~ ( '\\r' | '\\n' ) )*
            {
            match('#'); 
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:149:13: (~ ( '\\r' | '\\n' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:149:13: ~ ( '\\r' | '\\n' )
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
            	    break loop8;
                }
            } while (true);

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
        // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:8: ( IF | ASSIGN | PRINT | WHILE | RETURN | DEF | ADD | SUB | MUL | EQ | LT | STRUCT | DOT | NEW | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | NL | ID | CHAR | STRING | INT | FLOAT | WS | SL_COMMENT )
        int alt9=29;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:10: IF
                {
                mIF(); 

                }
                break;
            case 2 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:13: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 3 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:20: PRINT
                {
                mPRINT(); 

                }
                break;
            case 4 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:26: WHILE
                {
                mWHILE(); 

                }
                break;
            case 5 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:32: RETURN
                {
                mRETURN(); 

                }
                break;
            case 6 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:39: DEF
                {
                mDEF(); 

                }
                break;
            case 7 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:43: ADD
                {
                mADD(); 

                }
                break;
            case 8 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:47: SUB
                {
                mSUB(); 

                }
                break;
            case 9 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:51: MUL
                {
                mMUL(); 

                }
                break;
            case 10 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:55: EQ
                {
                mEQ(); 

                }
                break;
            case 11 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:58: LT
                {
                mLT(); 

                }
                break;
            case 12 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:61: STRUCT
                {
                mSTRUCT(); 

                }
                break;
            case 13 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:68: DOT
                {
                mDOT(); 

                }
                break;
            case 14 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:72: NEW
                {
                mNEW(); 

                }
                break;
            case 15 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:118: NL
                {
                mNL(); 

                }
                break;
            case 23 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:121: ID
                {
                mID(); 

                }
                break;
            case 24 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:124: CHAR
                {
                mCHAR(); 

                }
                break;
            case 25 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:129: STRING
                {
                mSTRING(); 

                }
                break;
            case 26 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:136: INT
                {
                mINT(); 

                }
                break;
            case 27 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:140: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 28 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:146: WS
                {
                mWS(); 

                }
                break;
            case 29 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:1:149: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\26\1\36\4\26\4\uffff\1\26\1\45\1\26\6\uffff\1\26\4\uffff"+
        "\1\50\2\uffff\1\51\2\uffff\5\26\2\uffff\2\26\2\uffff\3\26\1\64\1"+
        "\26\1\66\4\26\1\uffff\1\26\1\uffff\1\74\1\75\1\76\2\26\3\uffff\1"+
        "\101\1\102\2\uffff";
    static final String DFA9_eofS =
        "\103\uffff";
    static final String DFA9_minS =
        "\1\11\1\146\1\75\1\162\1\150\2\145\4\uffff\1\164\1\60\1\145\6\uffff"+
        "\1\154\4\uffff\1\56\2\uffff\1\60\2\uffff\2\151\1\164\1\146\1\162"+
        "\2\uffff\1\167\1\163\2\uffff\1\156\1\154\1\165\1\60\1\165\1\60\1"+
        "\145\1\164\1\145\1\162\1\uffff\1\143\1\uffff\3\60\1\156\1\164\3"+
        "\uffff\2\60\2\uffff";
    static final String DFA9_maxS =
        "\1\175\1\146\1\75\1\162\1\150\2\145\4\uffff\1\164\1\71\1\145\6\uffff"+
        "\1\154\4\uffff\1\71\2\uffff\1\172\2\uffff\2\151\1\164\1\146\1\162"+
        "\2\uffff\1\167\1\163\2\uffff\1\156\1\154\1\165\1\172\1\165\1\172"+
        "\1\145\1\164\1\145\1\162\1\uffff\1\143\1\uffff\3\172\1\156\1\164"+
        "\3\uffff\2\172\2\uffff";
    static final String DFA9_acceptS =
        "\7\uffff\1\7\1\10\1\11\1\13\3\uffff\1\17\1\20\1\21\1\22\1\23\1\24"+
        "\1\uffff\1\26\1\27\1\30\1\31\1\uffff\1\34\1\35\1\uffff\1\12\1\2"+
        "\5\uffff\1\33\1\15\2\uffff\1\32\1\1\12\uffff\1\6\1\uffff\1\16\5"+
        "\uffff\1\25\1\3\1\4\2\uffff\1\5\1\14";
    static final String DFA9_specialS =
        "\103\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\32\1\25\2\uffff\1\25\22\uffff\1\32\1\uffff\1\30\1\33\3\uffff"+
            "\1\27\1\21\1\22\1\11\1\7\1\17\1\10\1\14\1\uffff\12\31\1\23\1"+
            "\uffff\1\12\1\2\3\uffff\32\26\6\uffff\3\26\1\6\1\24\3\26\1\1"+
            "\4\26\1\15\1\26\1\3\1\26\1\5\1\13\3\26\1\4\3\26\1\16\1\uffff"+
            "\1\20",
            "\1\34",
            "\1\35",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "",
            "",
            "",
            "\1\43",
            "\12\44",
            "\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\47",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\31",
            "",
            "",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "\1\57",
            "\1\60",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\65",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\1\73",
            "",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\1\77",
            "\1\100",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "\12\26\7\uffff\32\26\6\uffff\32\26",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( IF | ASSIGN | PRINT | WHILE | RETURN | DEF | ADD | SUB | MUL | EQ | LT | STRUCT | DOT | NEW | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | NL | ID | CHAR | STRING | INT | FLOAT | WS | SL_COMMENT );";
        }
    }
 

}