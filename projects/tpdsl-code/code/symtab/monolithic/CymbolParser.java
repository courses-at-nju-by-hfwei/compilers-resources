/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g 2009-09-23 17:37:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CymbolParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "LETTER", "WS", "SL_COMMENT", "'float'", "'int'", "'='", "';'", "'+'", "'('", "')'"
    };
    public static final int LETTER=6;
    public static final int T__12=12;
    public static final int INT=5;
    public static final int WS=7;
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int T__14=14;
    public static final int T__9=9;
    public static final int T__11=11;
    public static final int SL_COMMENT=8;
    public static final int T__15=15;
    public static final int ID=4;

    // delegates
    // delegators


        public CymbolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CymbolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CymbolParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g"; }

    SymbolTable symtab;


    // $ANTLR start "compilationUnit"
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:5:1: compilationUnit[SymbolTable symtab] : ( varDeclaration )+ ;
    public final void compilationUnit(SymbolTable symtab) throws RecognitionException {
        this.symtab = symtab;
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:7:5: ( ( varDeclaration )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:7:9: ( varDeclaration )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:7:9: ( varDeclaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=9 && LA1_0<=10)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:7:9: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_compilationUnit37);
            	    varDeclaration();

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
    // $ANTLR end "compilationUnit"

    public static class type_return extends ParserRuleReturnScope {
        public Type tsym;
    };

    // $ANTLR start "type"
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:12:1: type returns [Type tsym] : ( 'float' | 'int' );
    public final CymbolParser.type_return type() throws RecognitionException {
        CymbolParser.type_return retval = new CymbolParser.type_return();
        retval.start = input.LT(1);

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:16:5: ( 'float' | 'int' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==9) ) {
                alt2=1;
            }
            else if ( (LA2_0==10) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:16:9: 'float'
                    {
                    match(input,9,FOLLOW_9_in_type69); 
                    retval.tsym = (Type)symtab.resolve("float");

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:17:9: 'int'
                    {
                    match(input,10,FOLLOW_10_in_type81); 
                    retval.tsym = (Type)symtab.resolve("int");

                    }
                    break;

            }
            retval.stop = input.LT(-1);

             // ((Token)retval.start) is the first tree node matched by this rule
                System.out.println("line "+((Token)retval.start).getLine()+": ref "+retval.tsym.getName());

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


    // $ANTLR start "varDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:22:1: varDeclaration : type ID ( '=' expression )? ';' ;
    public final void varDeclaration() throws RecognitionException {
        Token ID1=null;
        CymbolParser.type_return type2 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:23:5: ( type ID ( '=' expression )? ';' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:23:9: type ID ( '=' expression )? ';'
            {
            pushFollow(FOLLOW_type_in_varDeclaration106);
            type2=type();

            state._fsp--;

            ID1=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration108); 
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:23:17: ( '=' expression )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:23:18: '=' expression
                    {
                    match(input,11,FOLLOW_11_in_varDeclaration111); 
                    pushFollow(FOLLOW_expression_in_varDeclaration113);
                    expression();

                    state._fsp--;


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_varDeclaration117); 

                    System.out.println("line "+ID1.getLine()+": def "+(ID1!=null?ID1.getText():null));
                	VariableSymbol vs = new VariableSymbol((ID1!=null?ID1.getText():null),(type2!=null?type2.tsym:null));
                	symtab.define(vs);
                	

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
    // $ANTLR end "varDeclaration"


    // $ANTLR start "expression"
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:32:1: expression : primary ( '+' primary )* ;
    public final void expression() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:33:5: ( primary ( '+' primary )* )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:33:9: primary ( '+' primary )*
            {
            pushFollow(FOLLOW_primary_in_expression145);
            primary();

            state._fsp--;

            // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:33:17: ( '+' primary )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:33:18: '+' primary
            	    {
            	    match(input,13,FOLLOW_13_in_expression148); 
            	    pushFollow(FOLLOW_primary_in_expression150);
            	    primary();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
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
    // $ANTLR end "expression"


    // $ANTLR start "primary"
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:37:1: primary : ( ID | INT | '(' expression ')' );
    public final void primary() throws RecognitionException {
        Token ID3=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:38:5: ( ID | INT | '(' expression ')' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt5=1;
                }
                break;
            case INT:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:38:9: ID
                    {
                    ID3=(Token)match(input,ID,FOLLOW_ID_in_primary172); 
                    System.out.println("line "+ID3.getLine()+": ref to "+
                        	 symtab.resolve((ID3!=null?ID3.getText():null)));

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:41:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primary190); 

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/monolithic/Cymbol.g:42:9: '(' expression ')'
                    {
                    match(input,14,FOLLOW_14_in_primary200); 
                    pushFollow(FOLLOW_expression_in_primary202);
                    expression();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_primary204); 

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
    // $ANTLR end "primary"

    // Delegated rules


 

    public static final BitSet FOLLOW_varDeclaration_in_compilationUnit37 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_9_in_type69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_type81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_varDeclaration108 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11_in_varDeclaration111 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_expression_in_varDeclaration113 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_varDeclaration117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_expression145 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_expression148 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_primary_in_expression150 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ID_in_primary172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_primary200 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_expression_in_primary202 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_primary204 = new BitSet(new long[]{0x0000000000000002L});

}