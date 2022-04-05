/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g 2009-09-23 17:37:45

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FigParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "STRING", "INT", "WS", "SLCMT", "CMT", "'{'", "'}'", "'.'", "'='", "';'", "'$'", "'['", "','", "']'"
    };
    public static final int T__12=12;
    public static final int T__17=17;
    public static final int INT=6;
    public static final int SLCMT=8;
    public static final int WS=7;
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int STRING=5;
    public static final int T__16=16;
    public static final int CMT=9;
    public static final int T__10=10;
    public static final int T__14=14;
    public static final int T__11=11;
    public static final int T__18=18;
    public static final int T__15=15;
    public static final int ID=4;

    // delegates
    // delegators


        public FigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return FigParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g"; }


    /** Map object names to their instances */
    public Map<String,Object> instances = new HashMap<String,Object>();



    // $ANTLR start "file"
    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:19:1: file returns [Map<String,Object> instances] : ( object )+ ;
    public final Map<String,Object> file() throws RecognitionException {
        Map<String,Object> instances = null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:20:5: ( ( object )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:20:9: ( object )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:20:9: ( object )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:20:9: object
            	    {
            	    pushFollow(FOLLOW_object_in_file37);
            	    object();

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

            instances = this.instances;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return instances;
    }
    // $ANTLR end "file"


    // $ANTLR start "object"
    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:25:1: object returns [Object o] : type v= ID '{' ( property[$o] )* '}' ;
    public final Object object() throws RecognitionException {
        Object o = null;

        Token v=null;
        FigParser.type_return type1 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:26:5: ( type v= ID '{' ( property[$o] )* '}' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:26:9: type v= ID '{' ( property[$o] )* '}'
            {
            pushFollow(FOLLOW_type_in_object68);
            type1=type();

            state._fsp--;

            v=(Token)match(input,ID,FOLLOW_ID_in_object72); 

                    o = RunFig.newInstance((type1!=null?input.toString(type1.start,type1.stop):null)); // simulate "new type()"
                    instances.put((v!=null?v.getText():null), o); // track in instances dictionary
                    
            match(input,10,FOLLOW_10_in_object92); 
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:31:13: ( property[$o] )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:31:13: property[$o]
            	    {
            	    pushFollow(FOLLOW_property_in_object94);
            	    property(o);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_object98); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return o;
    }
    // $ANTLR end "object"

    public static class type_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "type"
    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:35:1: type : ID ( '.' ID )* ;
    public final FigParser.type_return type() throws RecognitionException {
        FigParser.type_return retval = new FigParser.type_return();
        retval.start = input.LT(1);

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:35:5: ( ID ( '.' ID )* )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:35:9: ID ( '.' ID )*
            {
            match(input,ID,FOLLOW_ID_in_type120); 
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:35:12: ( '.' ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:35:13: '.' ID
            	    {
            	    match(input,12,FOLLOW_12_in_type123); 
            	    match(input,ID,FOLLOW_ID_in_type125); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"


    // $ANTLR start "property"
    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:38:1: property[Object o] : ID '=' expr ';' ;
    public final void property(Object o) throws RecognitionException {
        Token ID2=null;
        Object expr3 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:39:5: ( ID '=' expr ';' )
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:39:9: ID '=' expr ';'
            {
            ID2=(Token)match(input,ID,FOLLOW_ID_in_property154); 
            match(input,13,FOLLOW_13_in_property156); 
            pushFollow(FOLLOW_expr_in_property158);
            expr3=expr();

            state._fsp--;

            match(input,14,FOLLOW_14_in_property160); 
            RunFig.setObjectProperty(o,(ID2!=null?ID2.getText():null),expr3);

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
    // $ANTLR end "property"


    // $ANTLR start "expr"
    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:46:1: expr returns [Object value] : ( STRING | INT | '$' ID | list );
    public final Object expr() throws RecognitionException {
        Object value = null;

        Token STRING4=null;
        Token INT5=null;
        Token ID6=null;
        List<Object> list7 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:47:5: ( STRING | INT | '$' ID | list )
            int alt4=4;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt4=1;
                }
                break;
            case INT:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:47:9: STRING
                    {
                    STRING4=(Token)match(input,STRING,FOLLOW_STRING_in_expr204); 
                    String s = (STRING4!=null?STRING4.getText():null); // get string value
                                     value = s.substring(1, s.length()-1);

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:49:9: INT
                    {
                    INT5=(Token)match(input,INT,FOLLOW_INT_in_expr218); 
                    value = Integer.valueOf((INT5!=null?INT5.getText():null));

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:50:9: '$' ID
                    {
                    match(input,15,FOLLOW_15_in_expr234); 
                    ID6=(Token)match(input,ID,FOLLOW_ID_in_expr236); 
                    value = instances.get((ID6!=null?ID6.getText():null));

                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:51:9: list
                    {
                    pushFollow(FOLLOW_list_in_expr250);
                    list7=list();

                    state._fsp--;

                    value = list7;

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
        return value;
    }
    // $ANTLR end "expr"


    // $ANTLR start "list"
    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:56:1: list returns [List<Object> elements] : ( '[' e= expr ( ',' e= expr )* ']' | '[' ']' );
    public final List<Object> list() throws RecognitionException {
        List<Object> elements = null;

        Object e = null;



            elements = new ArrayList<Object>(); // init return value

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:60:5: ( '[' e= expr ( ',' e= expr )* ']' | '[' ']' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==18) ) {
                    alt6=2;
                }
                else if ( ((LA6_1>=STRING && LA6_1<=INT)||(LA6_1>=15 && LA6_1<=16)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:60:9: '[' e= expr ( ',' e= expr )* ']'
                    {
                    match(input,16,FOLLOW_16_in_list286); 
                    pushFollow(FOLLOW_expr_in_list290);
                    e=expr();

                    state._fsp--;

                    elements.add(e);
                    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:61:13: ( ',' e= expr )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:61:14: ',' e= expr
                    	    {
                    	    match(input,17,FOLLOW_17_in_list307); 
                    	    pushFollow(FOLLOW_expr_in_list311);
                    	    e=expr();

                    	    state._fsp--;

                    	    elements.add(e);

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_list325); 

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/reader/fig/Fig.g:63:9: '[' ']'
                    {
                    match(input,16,FOLLOW_16_in_list335); 
                    match(input,18,FOLLOW_18_in_list337); 

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
        return elements;
    }
    // $ANTLR end "list"

    // Delegated rules


 

    public static final BitSet FOLLOW_object_in_file37 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_type_in_object68 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_object72 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_object92 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_property_in_object94 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_11_in_object98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type120 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_type123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_type125 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ID_in_property154 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_property156 = new BitSet(new long[]{0x0000000000018060L});
    public static final BitSet FOLLOW_expr_in_property158 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_property160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_expr234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_expr236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_expr250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_list286 = new BitSet(new long[]{0x0000000000018060L});
    public static final BitSet FOLLOW_expr_in_list290 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_list307 = new BitSet(new long[]{0x0000000000018060L});
    public static final BitSet FOLLOW_expr_in_list311 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_list325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_list335 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_list337 = new BitSet(new long[]{0x0000000000000002L});

}