/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g 2009-09-23 17:37:53

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Types extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "UNARY_MINUS", "UNARY_NOT", "ASSIGN", "INDEX", "ID", "INT", "FLOAT", "CHAR", "LETTER", "WS", "SL_COMMENT", "'struct'", "'{'", "'}'", "';'", "'[]'", "'('", "')'", "','", "'float'", "'int'", "'char'", "'boolean'", "'void'", "'if'", "'else'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", "'['", "']'", "'.'", "'true'", "'false'"
    };
    public static final int INDEX=15;
    public static final int T__42=42;
    public static final int T__28=28;
    public static final int T__23=23;
    public static final int EXPR=11;
    public static final int T__51=51;
    public static final int T__47=47;
    public static final int FLOAT=18;
    public static final int T__50=50;
    public static final int FIELD_DECL=8;
    public static final int BLOCK=6;
    public static final int T__39=39;
    public static final int T__30=30;
    public static final int T__52=52;
    public static final int T__46=46;
    public static final int UNARY_MINUS=12;
    public static final int INT=17;
    public static final int UNARY_NOT=13;
    public static final int T__27=27;
    public static final int ASSIGN=14;
    public static final int T__24=24;
    public static final int T__49=49;
    public static final int METHOD_DECL=4;
    public static final int T__48=48;
    public static final int T__54=54;
    public static final int T__34=34;
    public static final int SL_COMMENT=22;
    public static final int ELIST=10;
    public static final int ID=16;
    public static final int LETTER=20;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int ARG_DECL=5;
    public static final int WS=21;
    public static final int CHAR=19;
    public static final int T__44=44;
    public static final int T__33=33;
    public static final int T__29=29;
    public static final int T__45=45;
    public static final int T__43=43;
    public static final int T__31=31;
    public static final int T__40=40;
    public static final int EOF=-1;
    public static final int T__53=53;
    public static final int T__32=32;
    public static final int CALL=9;
    public static final int T__38=38;
    public static final int T__37=37;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int VAR_DECL=7;
    public static final int T__41=41;

    // delegates
    // delegators


        public Types(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Types(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Types.tokenNames; }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g"; }


        SymbolTable symtab;
        public Types(TreeNodeStream input, SymbolTable symtab) {
            this(input);
            this.symtab = symtab;
        }



    // $ANTLR start "bottomup"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:18:1: bottomup : exprRoot ;
    public final void bottomup() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:19:5: ( exprRoot )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:19:9: exprRoot
            {
            pushFollow(FOLLOW_exprRoot_in_bottomup58);
            exprRoot();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "bottomup"


    // $ANTLR start "exprRoot"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:22:1: exprRoot : ^( EXPR expr ) ;
    public final void exprRoot() throws RecognitionException {
        CymbolAST EXPR1=null;
        Types.expr_return expr2 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:23:5: ( ^( EXPR expr ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:23:9: ^( EXPR expr )
            {
            EXPR1=(CymbolAST)match(input,EXPR,FOLLOW_EXPR_in_exprRoot80); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_exprRoot82);
            expr2=expr();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              EXPR1.evalType = (expr2!=null?expr2.type:null);
            }

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
    // $ANTLR end "exprRoot"

    public static class expr_return extends TreeRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "expr"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:28:1: expr returns [Type type] : ( 'true' | 'false' | CHAR | INT | FLOAT | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_NOT a= expr ) | member | arrayRef | call | binaryOps );
    public final Types.expr_return expr() throws RecognitionException {
        Types.expr_return retval = new Types.expr_return();
        retval.start = input.LT(1);

        CymbolAST ID3=null;
        Types.expr_return a = null;

        Types.member_return member4 = null;

        Types.arrayRef_return arrayRef5 = null;

        Types.call_return call6 = null;

        Types.binaryOps_return binaryOps7 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:30:5: ( 'true' | 'false' | CHAR | INT | FLOAT | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_NOT a= expr ) | member | arrayRef | call | binaryOps )
            int alt1=12;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt1=1;
                }
                break;
            case 54:
                {
                alt1=2;
                }
                break;
            case CHAR:
                {
                alt1=3;
                }
                break;
            case INT:
                {
                alt1=4;
                }
                break;
            case FLOAT:
                {
                alt1=5;
                }
                break;
            case ID:
                {
                alt1=6;
                }
                break;
            case UNARY_MINUS:
                {
                alt1=7;
                }
                break;
            case UNARY_NOT:
                {
                alt1=8;
                }
                break;
            case 52:
                {
                alt1=9;
                }
                break;
            case INDEX:
                {
                alt1=10;
                }
                break;
            case CALL:
                {
                alt1=11;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt1=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:30:9: 'true'
                    {
                    match(input,53,FOLLOW_53_in_expr117); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._boolean;
                    }

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:31:9: 'false'
                    {
                    match(input,54,FOLLOW_54_in_expr134); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._boolean;
                    }

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:32:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_expr150); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._char;
                    }

                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:33:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_expr169); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._int;
                    }

                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:34:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_expr189); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._float;
                    }

                    }
                    break;
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:35:9: ID
                    {
                    ID3=(CymbolAST)match(input,ID,FOLLOW_ID_in_expr207); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      VariableSymbol s=(VariableSymbol)ID3.scope.resolve((ID3!=null?ID3.getText():null));
                                  ID3.symbol = s; retval.type = s.type;
                    }

                    }
                    break;
                case 7 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:37:9: ^( UNARY_MINUS a= expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr220); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr224);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type =symtab.uminus((a!=null?((CymbolAST)a.start):null));
                    }

                    }
                    break;
                case 8 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:38:9: ^( UNARY_NOT a= expr )
                    {
                    match(input,UNARY_NOT,FOLLOW_UNARY_NOT_in_expr240); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr244);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type =symtab.unot((a!=null?((CymbolAST)a.start):null));
                    }

                    }
                    break;
                case 9 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:39:9: member
                    {
                    pushFollow(FOLLOW_member_in_expr261);
                    member4=member();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (member4!=null?member4.type:null);
                    }

                    }
                    break;
                case 10 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:40:9: arrayRef
                    {
                    pushFollow(FOLLOW_arrayRef_in_expr278);
                    arrayRef5=arrayRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (arrayRef5!=null?arrayRef5.type:null);
                    }

                    }
                    break;
                case 11 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:41:9: call
                    {
                    pushFollow(FOLLOW_call_in_expr293);
                    call6=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (call6!=null?call6.type:null);
                    }

                    }
                    break;
                case 12 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:42:9: binaryOps
                    {
                    pushFollow(FOLLOW_binaryOps_in_expr312);
                    binaryOps7=binaryOps();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (binaryOps7!=null?binaryOps7.type:null);
                    }

                    }
                    break;

            }
            if ( state.backtracking==1 ) {
               ((CymbolAST)retval.start).evalType = retval.type; 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class binaryOps_return extends TreeRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "binaryOps"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:47:1: binaryOps returns [Type type] : ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) );
    public final Types.binaryOps_return binaryOps() throws RecognitionException {
        Types.binaryOps_return retval = new Types.binaryOps_return();
        retval.start = input.LT(1);

        Types.expr_return a = null;

        Types.expr_return b = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:49:5: ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt2=1;
                }
                break;
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt2=2;
                }
                break;
            case 39:
            case 40:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:49:9: ^( bop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_bop_in_binaryOps347);
                    bop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps351);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps355);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type =symtab.bop((a!=null?((CymbolAST)a.start):null), (b!=null?((CymbolAST)b.start):null));
                    }

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:50:9: ^( relop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_relop_in_binaryOps371);
                    relop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps375);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps379);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type =symtab.relop((a!=null?((CymbolAST)a.start):null), (b!=null?((CymbolAST)b.start):null));
                    }

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:51:9: ^( eqop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_eqop_in_binaryOps393);
                    eqop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps397);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps401);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type =symtab.eqop((a!=null?((CymbolAST)a.start):null), (b!=null?((CymbolAST)b.start):null));
                    }

                    }
                    break;

            }
            if ( state.backtracking==1 ) {
               ((CymbolAST)retval.start).evalType = retval.type; 
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binaryOps"

    public static class arrayRef_return extends TreeRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "arrayRef"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:56:1: arrayRef returns [Type type] : ^( INDEX ID expr ) ;
    public final Types.arrayRef_return arrayRef() throws RecognitionException {
        Types.arrayRef_return retval = new Types.arrayRef_return();
        retval.start = input.LT(1);

        CymbolAST ID8=null;
        Types.expr_return expr9 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:57:5: ( ^( INDEX ID expr ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:57:9: ^( INDEX ID expr )
            {
            match(input,INDEX,FOLLOW_INDEX_in_arrayRef431); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID8=(CymbolAST)match(input,ID,FOLLOW_ID_in_arrayRef433); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_arrayRef435);
            expr9=expr();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {

                      retval.type = symtab.arrayIndex(ID8, (expr9!=null?((CymbolAST)expr9.start):null));
                      ((CymbolAST)retval.start).evalType = retval.type; // save computed type
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayRef"

    public static class call_return extends TreeRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "call"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:66:1: call returns [Type type] : ^( CALL ID ^( ELIST ( expr )* ) ) ;
    public final Types.call_return call() throws RecognitionException {
        Types.call_return retval = new Types.call_return();
        retval.start = input.LT(1);

        CymbolAST ID11=null;
        Types.expr_return expr10 = null;


        List args = new ArrayList();
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:68:5: ( ^( CALL ID ^( ELIST ( expr )* ) ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:68:9: ^( CALL ID ^( ELIST ( expr )* ) )
            {
            match(input,CALL,FOLLOW_CALL_in_call477); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID11=(CymbolAST)match(input,ID,FOLLOW_ID_in_call479); if (state.failed) return retval;
            match(input,ELIST,FOLLOW_ELIST_in_call482); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:68:27: ( expr )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==CALL||(LA3_0>=UNARY_MINUS && LA3_0<=UNARY_NOT)||(LA3_0>=INDEX && LA3_0<=CHAR)||(LA3_0>=39 && LA3_0<=48)||(LA3_0>=52 && LA3_0<=54)) ) {
                        alt3=1;
                    }


                    switch (alt3) {
                	case 1 :
                	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:68:28: expr
                	    {
                	    pushFollow(FOLLOW_expr_in_call485);
                	    expr10=expr();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==1 ) {
                	      args.add((expr10!=null?((CymbolAST)expr10.start):null));
                	    }

                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {

                      retval.type = symtab.call(ID11, args);
                      ((CymbolAST)retval.start).evalType = retval.type;
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class member_return extends TreeRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "member"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:77:1: member returns [Type type] : ^( '.' expr ID ) ;
    public final Types.member_return member() throws RecognitionException {
        Types.member_return retval = new Types.member_return();
        retval.start = input.LT(1);

        CymbolAST ID13=null;
        Types.expr_return expr12 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:78:5: ( ^( '.' expr ID ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:78:9: ^( '.' expr ID )
            {
            match(input,52,FOLLOW_52_in_member527); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_member529);
            expr12=expr();

            state._fsp--;
            if (state.failed) return retval;
            ID13=(CymbolAST)match(input,ID,FOLLOW_ID_in_member531); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {
               // (expr12!=null?((CymbolAST)expr12.start):null) is root of tree matched by expr rule
                      retval.type = symtab.member((expr12!=null?((CymbolAST)expr12.start):null), ID13); 
                      ((CymbolAST)retval.start).evalType = retval.type; // save computed type
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "member"


    // $ANTLR start "bop"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:86:1: bop : ( '+' | '-' | '*' | '/' );
    public final void bop() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:86:5: ( '+' | '-' | '*' | '/' )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:
            {
            if ( (input.LA(1)>=45 && input.LA(1)<=48) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "bop"


    // $ANTLR start "relop"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:88:1: relop : ( '<' | '>' | '<=' | '>=' );
    public final void relop() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:88:6: ( '<' | '>' | '<=' | '>=' )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:
            {
            if ( (input.LA(1)>=41 && input.LA(1)<=44) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "relop"


    // $ANTLR start "eqop"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:90:1: eqop : ( '!=' | '==' );
    public final void eqop() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:90:5: ( '!=' | '==' )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Types.g:
            {
            if ( (input.LA(1)>=39 && input.LA(1)<=40) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "eqop"

    // Delegated rules


 

    public static final BitSet FOLLOW_exprRoot_in_bottomup58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPR_in_exprRoot80 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_exprRoot82 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_53_in_expr117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_expr134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_expr150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_expr189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_NOT_in_expr240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_member_in_expr261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayRef_in_expr278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binaryOps_in_expr312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bop_in_binaryOps347 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps351 = new BitSet(new long[]{0x0071FF80000FB200L});
    public static final BitSet FOLLOW_expr_in_binaryOps355 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relop_in_binaryOps371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps375 = new BitSet(new long[]{0x0071FF80000FB200L});
    public static final BitSet FOLLOW_expr_in_binaryOps379 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eqop_in_binaryOps393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps397 = new BitSet(new long[]{0x0071FF80000FB200L});
    public static final BitSet FOLLOW_expr_in_binaryOps401 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_in_arrayRef431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_arrayRef433 = new BitSet(new long[]{0x0071FF80000FB200L});
    public static final BitSet FOLLOW_expr_in_arrayRef435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_call477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_call479 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ELIST_in_call482 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_call485 = new BitSet(new long[]{0x0071FF80000FB208L});
    public static final BitSet FOLLOW_52_in_member527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_member529 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_member531 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_bop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_eqop0 = new BitSet(new long[]{0x0000000000000002L});

}