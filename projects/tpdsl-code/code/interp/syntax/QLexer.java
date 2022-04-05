/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g 2009-09-23 17:37:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class QLexer extends Lexer {
    public static final int T__12=12;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int WS=8;
    public static final int T__13=13;
    public static final int STRING=6;
    public static final int T__21=21;
    public static final int COMMENT=7;
    public static final int T__19=19;
    public static final int T__9=9;
    public static final int T__14=14;
    public static final int T__11=11;
    public static final int T__22=22;
    public static final int T__17=17;
    public static final int INT=5;
    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__24=24;
    public static final int T__10=10;
    public static final int T__18=18;
    public static final int T__15=15;
    public static final int ID=4;

    // delegates
    // delegators

    public QLexer() {;} 
    public QLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public QLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:3:6: ( 'print' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:3:8: 'print'
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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:4:7: ( ';' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:4:9: ';'
            {
            match(';'); 

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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:5:7: ( 'create' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:5:9: 'create'
            {
            match("create"); 


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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:6:7: ( 'table' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:6:9: 'table'
            {
            match("table"); 


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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:7:7: ( '(' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:7:9: '('
            {
            match('('); 

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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:8:7: ( 'primary' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:8:9: 'primary'
            {
            match("primary"); 


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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:9:7: ( 'key' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:9:9: 'key'
            {
            match("key"); 


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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:10:7: ( ',' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:10:9: ','
            {
            match(','); 

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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:11:7: ( ')' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:11:9: ')'
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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:12:7: ( '=' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:12:9: '='
            {
            match('='); 

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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:13:7: ( 'insert' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:13:9: 'insert'
            {
            match("insert"); 


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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:14:7: ( 'into' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:14:9: 'into'
            {
            match("into"); 


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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:15:7: ( 'set' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:15:9: 'set'
            {
            match("set"); 


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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:16:7: ( 'select' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:16:9: 'select'
            {
            match("select"); 


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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:17:7: ( 'from' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:17:9: 'from'
            {
            match("from"); 


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
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:18:7: ( 'where' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:18:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:72:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:72:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:72:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:74:5: ( ( '0' .. '9' )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:74:9: ( '0' .. '9' )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:74:9: ( '0' .. '9' )+
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
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:74:9: '0' .. '9'
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:77:5: ( '\\'' (~ '\\'' )* '\\'' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:77:9: '\\'' (~ '\\'' )* '\\''
            {
            match('\''); 
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:77:14: (~ '\\'' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:77:14: ~ '\\''
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
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

            match('\''); 
            setText(getText().substring(1, getText().length()-1));

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:82:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:82:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:82:14: (~ ( '\\n' | '\\r' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:82:14: ~ ( '\\n' | '\\r' )
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
            	    break loop4;
                }
            } while (true);

            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:82:28: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:82:28: '\\r'
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
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:85:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:85:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    public void mTokens() throws RecognitionException {
        // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | ID | INT | STRING | COMMENT | WS )
        int alt6=21;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:105: ID
                {
                mID(); 

                }
                break;
            case 18 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:108: INT
                {
                mINT(); 

                }
                break;
            case 19 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:112: STRING
                {
                mSTRING(); 

                }
                break;
            case 20 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:119: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 21 :
                // /Users/parrt/research/book/TPDSL/Book/code/interp/syntax/Q.g:1:127: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\16\1\uffff\2\16\1\uffff\1\16\3\uffff\4\16\5\uffff\13"+
        "\16\1\51\2\16\1\54\7\16\1\uffff\1\16\1\65\1\uffff\1\16\1\67\1\16"+
        "\1\71\2\16\1\74\1\16\1\uffff\1\16\1\uffff\1\77\1\uffff\1\16\1\101"+
        "\1\uffff\1\102\1\103\1\uffff\1\104\4\uffff";
    static final String DFA6_eofS =
        "\105\uffff";
    static final String DFA6_minS =
        "\1\11\1\162\1\uffff\1\162\1\141\1\uffff\1\145\3\uffff\1\156\1\145"+
        "\1\162\1\150\5\uffff\1\151\1\145\1\142\1\171\1\163\1\154\1\157\1"+
        "\145\1\155\1\141\1\154\1\60\1\145\1\157\1\60\1\145\1\155\1\162\1"+
        "\164\1\141\1\164\1\145\1\uffff\1\162\1\60\1\uffff\1\143\1\60\1\145"+
        "\1\60\1\162\1\145\1\60\1\164\1\uffff\1\164\1\uffff\1\60\1\uffff"+
        "\1\171\1\60\1\uffff\2\60\1\uffff\1\60\4\uffff";
    static final String DFA6_maxS =
        "\1\172\1\162\1\uffff\1\162\1\141\1\uffff\1\145\3\uffff\1\156\1\145"+
        "\1\162\1\150\5\uffff\1\151\1\145\1\142\1\171\2\164\1\157\1\145\1"+
        "\156\1\141\1\154\1\172\1\145\1\157\1\172\1\145\1\155\1\162\1\164"+
        "\1\141\1\164\1\145\1\uffff\1\162\1\172\1\uffff\1\143\1\172\1\145"+
        "\1\172\1\162\1\145\1\172\1\164\1\uffff\1\164\1\uffff\1\172\1\uffff"+
        "\1\171\1\172\1\uffff\2\172\1\uffff\1\172\4\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\1\uffff\1\10\1\11\1\12\4\uffff\1\21\1\22"+
        "\1\23\1\24\1\25\26\uffff\1\7\2\uffff\1\15\10\uffff\1\14\1\uffff"+
        "\1\17\1\uffff\1\1\2\uffff\1\4\2\uffff\1\20\1\uffff\1\3\1\13\1\16"+
        "\1\6";
    static final String DFA6_specialS =
        "\105\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\22\2\uffff\1\22\22\uffff\1\22\6\uffff\1\20\1\5\1\10\2\uffff"+
            "\1\7\2\uffff\1\21\12\17\1\uffff\1\2\1\uffff\1\11\3\uffff\32"+
            "\16\4\uffff\1\16\1\uffff\2\16\1\3\2\16\1\14\2\16\1\12\1\16\1"+
            "\6\4\16\1\1\2\16\1\13\1\4\2\16\1\15\3\16",
            "\1\23",
            "",
            "\1\24",
            "\1\25",
            "",
            "\1\26",
            "",
            "",
            "",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "",
            "",
            "",
            "",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37\1\40",
            "\1\42\7\uffff\1\41",
            "\1\43",
            "\1\44",
            "\1\46\1\45",
            "\1\47",
            "\1\50",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\52",
            "\1\53",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "\1\64",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\66",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\70",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\72",
            "\1\73",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\75",
            "",
            "\1\76",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\100",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | ID | INT | STRING | COMMENT | WS );";
        }
    }
 

}