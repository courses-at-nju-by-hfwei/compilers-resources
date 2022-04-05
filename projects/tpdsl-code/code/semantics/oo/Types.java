/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g 2009-09-23 17:37:47

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Types extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "UNARY_MINUS", "UNARY_NOT", "ASSIGN", "ADDR", "DEREF", "ADD", "MEMBER", "ID", "INT", "FLOAT", "CHAR", "LETTER", "WS", "SL_COMMENT", "'class'", "'{'", "'}'", "';'", "':'", "'('", "')'", "','", "'[]'", "'*'", "'float'", "'int'", "'char'", "'boolean'", "'void'", "'if'", "'else'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'-'", "'/'", "'!'", "'&'", "'['", "']'", "'->'", "'true'", "'false'"
    };
    public static final int T__42=42;
    public static final int T__28=28;
    public static final int T__57=57;
    public static final int T__51=51;
    public static final int EXPR=11;
    public static final int T__47=47;
    public static final int FLOAT=21;
    public static final int T__50=50;
    public static final int FIELD_DECL=8;
    public static final int BLOCK=6;
    public static final int T__39=39;
    public static final int T__30=30;
    public static final int T__52=52;
    public static final int T__46=46;
    public static final int UNARY_MINUS=12;
    public static final int INT=20;
    public static final int UNARY_NOT=13;
    public static final int T__27=27;
    public static final int ASSIGN=14;
    public static final int T__49=49;
    public static final int METHOD_DECL=4;
    public static final int T__48=48;
    public static final int T__54=54;
    public static final int MEMBER=18;
    public static final int T__34=34;
    public static final int SL_COMMENT=25;
    public static final int ELIST=10;
    public static final int T__56=56;
    public static final int ID=19;
    public static final int LETTER=23;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int ARG_DECL=5;
    public static final int WS=24;
    public static final int CHAR=22;
    public static final int T__58=58;
    public static final int T__44=44;
    public static final int T__33=33;
    public static final int T__55=55;
    public static final int T__29=29;
    public static final int T__45=45;
    public static final int ADDR=15;
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
    public static final int VAR_DECL=7;
    public static final int DEREF=16;
    public static final int T__41=41;
    public static final int ADD=17;

    // delegates
    // delegators


        public Types(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Types(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Types.tokenNames; }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g"; }


        SymbolTable symtab;
        public Types(TreeNodeStream input, SymbolTable symtab) {
            this(input);
            this.symtab = symtab;
        }



    // $ANTLR start "bottomup"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:17:1: bottomup : ( exprRoot | decl | ret | assignment | ifstat );
    public final void bottomup() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:18:5: ( exprRoot | decl | ret | assignment | ifstat )
            int alt1=5;
            switch ( input.LA(1) ) {
            case EXPR:
                {
                alt1=1;
                }
                break;
            case VAR_DECL:
                {
                alt1=2;
                }
                break;
            case 43:
                {
                alt1=3;
                }
                break;
            case ASSIGN:
                {
                alt1=4;
                }
                break;
            case 41:
                {
                alt1=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:18:9: exprRoot
                    {
                    pushFollow(FOLLOW_exprRoot_in_bottomup57);
                    exprRoot();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:19:7: decl
                    {
                    pushFollow(FOLLOW_decl_in_bottomup65);
                    decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:20:7: ret
                    {
                    pushFollow(FOLLOW_ret_in_bottomup73);
                    ret();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:21:7: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_bottomup81);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:22:7: ifstat
                    {
                    pushFollow(FOLLOW_ifstat_in_bottomup89);
                    ifstat();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "bottomup"


    // $ANTLR start "ifstat"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:28:1: ifstat : ^( 'if' cond= . s= . (e= . )? ) ;
    public final void ifstat() throws RecognitionException {
        CymbolAST cond=null;
        CymbolAST s=null;
        CymbolAST e=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:28:8: ( ^( 'if' cond= . s= . (e= . )? ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:28:10: ^( 'if' cond= . s= . (e= . )? )
            {
            match(input,41,FOLLOW_41_in_ifstat106); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            cond=(CymbolAST)input.LT(1);
            matchAny(input); if (state.failed) return ;
            s=(CymbolAST)input.LT(1);
            matchAny(input); if (state.failed) return ;
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:28:29: (e= . )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=METHOD_DECL && LA2_0<=58)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:28:29: e= .
                    {
                    e=(CymbolAST)input.LT(1);
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              symtab.ifstat(cond);
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
    // $ANTLR end "ifstat"


    // $ANTLR start "decl"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:31:1: decl : ^( VAR_DECL . ID (init= . )? ) ;
    public final void decl() throws RecognitionException {
        CymbolAST ID1=null;
        CymbolAST init=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:31:5: ( ^( VAR_DECL . ID (init= . )? ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:31:9: ^( VAR_DECL . ID (init= . )? )
            {
            match(input,VAR_DECL,FOLLOW_VAR_DECL_in_decl134); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            matchAny(input); if (state.failed) return ;
            ID1=(CymbolAST)match(input,ID,FOLLOW_ID_in_decl138); if (state.failed) return ;
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:31:25: (init= . )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=METHOD_DECL && LA3_0<=58)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:31:26: init= .
                    {
                    init=(CymbolAST)input.LT(1);
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              if ( init!=null && init.evalType!=null )
                           symtab.declinit(ID1, init);
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
    // $ANTLR end "decl"

    public static class ret_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "ret"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:36:1: ret : ^( 'return' v= . ) ;
    public final Types.ret_return ret() throws RecognitionException {
        Types.ret_return retval = new Types.ret_return();
        retval.start = input.LT(1);

        CymbolAST v=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:36:5: ( ^( 'return' v= . ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:36:9: ^( 'return' v= . )
            {
            match(input,43,FOLLOW_43_in_ret177); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            v=(CymbolAST)input.LT(1);
            matchAny(input); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {
              symtab.ret((MethodSymbol)((CymbolAST)retval.start).symbol, v);
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
    // $ANTLR end "ret"


    // $ANTLR start "assignment"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:38:1: assignment : ^( '=' lhs= . rhs= . ) ;
    public final void assignment() throws RecognitionException {
        CymbolAST lhs=null;
        CymbolAST rhs=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:39:5: ( ^( '=' lhs= . rhs= . ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:39:9: ^( '=' lhs= . rhs= . )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment201); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            lhs=(CymbolAST)input.LT(1);
            matchAny(input); if (state.failed) return ;
            rhs=(CymbolAST)input.LT(1);
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              symtab.assign(lhs, rhs);
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
    // $ANTLR end "assignment"


    // $ANTLR start "exprRoot"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:44:1: exprRoot : ^( EXPR expr ) ;
    public final void exprRoot() throws RecognitionException {
        CymbolAST EXPR2=null;
        Types.expr_return expr3 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:45:5: ( ^( EXPR expr ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:45:9: ^( EXPR expr )
            {
            EXPR2=(CymbolAST)match(input,EXPR,FOLLOW_EXPR_in_exprRoot235); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_exprRoot237);
            expr3=expr();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              EXPR2.evalType = (expr3!=null?expr3.type:null);
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:48:1: expr returns [Type type] : ( 'true' | 'false' | CHAR | INT | FLOAT | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_NOT a= expr ) | ^( ADDR a= expr ) | ^( DEREF a= expr ) | member | call | binaryOps );
    public final Types.expr_return expr() throws RecognitionException {
        Types.expr_return retval = new Types.expr_return();
        retval.start = input.LT(1);

        CymbolAST ID4=null;
        Types.expr_return a = null;

        Types.member_return member5 = null;

        Types.call_return call6 = null;

        Types.binaryOps_return binaryOps7 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:50:5: ( 'true' | 'false' | CHAR | INT | FLOAT | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_NOT a= expr ) | ^( ADDR a= expr ) | ^( DEREF a= expr ) | member | call | binaryOps )
            int alt4=13;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt4=1;
                }
                break;
            case 58:
                {
                alt4=2;
                }
                break;
            case CHAR:
                {
                alt4=3;
                }
                break;
            case INT:
                {
                alt4=4;
                }
                break;
            case FLOAT:
                {
                alt4=5;
                }
                break;
            case ID:
                {
                alt4=6;
                }
                break;
            case UNARY_MINUS:
                {
                alt4=7;
                }
                break;
            case UNARY_NOT:
                {
                alt4=8;
                }
                break;
            case ADDR:
                {
                alt4=9;
                }
                break;
            case DEREF:
                {
                alt4=10;
                }
                break;
            case MEMBER:
                {
                alt4=11;
                }
                break;
            case CALL:
                {
                alt4=12;
                }
                break;
            case ADD:
            case 35:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt4=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:50:9: 'true'
                    {
                    match(input,57,FOLLOW_57_in_expr269); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._boolean;
                    }

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:51:9: 'false'
                    {
                    match(input,58,FOLLOW_58_in_expr286); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._boolean;
                    }

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:52:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_expr302); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._char;
                    }

                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:53:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_expr321); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._int;
                    }

                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:54:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_expr341); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = SymbolTable._float;
                    }

                    }
                    break;
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:55:9: ID
                    {
                    ID4=(CymbolAST)match(input,ID,FOLLOW_ID_in_expr359); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      VariableSymbol s=(VariableSymbol)ID4.scope.resolve((ID4!=null?ID4.getText():null));
                                  ID4.symbol = s; retval.type = s.type;
                    }

                    }
                    break;
                case 7 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:57:9: ^( UNARY_MINUS a= expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr372); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr376);
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
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:58:9: ^( UNARY_NOT a= expr )
                    {
                    match(input,UNARY_NOT,FOLLOW_UNARY_NOT_in_expr392); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr396);
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
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:60:9: ^( ADDR a= expr )
                    {
                    match(input,ADDR,FOLLOW_ADDR_in_expr415); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr419);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type =new PointerType((a!=null?a.type:null));
                    }

                    }
                    break;
                case 10 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:61:9: ^( DEREF a= expr )
                    {
                    match(input,DEREF,FOLLOW_DEREF_in_expr442); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr446);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type =symtab.ptrDeref((a!=null?((CymbolAST)a.start):null));
                    }

                    }
                    break;
                case 11 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:63:9: member
                    {
                    pushFollow(FOLLOW_member_in_expr468);
                    member5=member();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (member5!=null?member5.type:null);
                    }

                    }
                    break;
                case 12 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:64:9: call
                    {
                    pushFollow(FOLLOW_call_in_expr485);
                    call6=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) {
                      retval.type = (call6!=null?call6.type:null);
                    }

                    }
                    break;
                case 13 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:65:9: binaryOps
                    {
                    pushFollow(FOLLOW_binaryOps_in_expr504);
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:68:1: binaryOps returns [Type type] : ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) ) ;
    public final Types.binaryOps_return binaryOps() throws RecognitionException {
        Types.binaryOps_return retval = new Types.binaryOps_return();
        retval.start = input.LT(1);

        Types.expr_return a = null;

        Types.expr_return b = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:70:2: ( ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:70:4: ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) )
            {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:70:4: ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case ADD:
            case 35:
            case 50:
            case 51:
                {
                alt5=1;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt5=2;
                }
                break;
            case 44:
            case 45:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:70:6: ^( bop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_bop_in_binaryOps534);
                    bop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps538);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps542);
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
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:71:5: ^( relop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_relop_in_binaryOps554);
                    relop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps558);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps562);
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
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:72:5: ^( eqop a= expr b= expr )
                    {
                    pushFollow(FOLLOW_eqop_in_binaryOps572);
                    eqop();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps576);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_binaryOps580);
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

    public static class call_return extends TreeRuleReturnScope {
        public Type type;
    };

    // $ANTLR start "call"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:76:1: call returns [Type type] : ^( CALL ID ^( ELIST ( expr )* ) ) ;
    public final Types.call_return call() throws RecognitionException {
        Types.call_return retval = new Types.call_return();
        retval.start = input.LT(1);

        CymbolAST ID9=null;
        Types.expr_return expr8 = null;


        List args = new ArrayList();
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:78:2: ( ^( CALL ID ^( ELIST ( expr )* ) ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:78:4: ^( CALL ID ^( ELIST ( expr )* ) )
            {
            match(input,CALL,FOLLOW_CALL_in_call609); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID9=(CymbolAST)match(input,ID,FOLLOW_ID_in_call611); if (state.failed) return retval;
            match(input,ELIST,FOLLOW_ELIST_in_call614); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:78:22: ( expr )*
                loop6:
                do {
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==CALL||(LA6_0>=UNARY_MINUS && LA6_0<=UNARY_NOT)||(LA6_0>=ADDR && LA6_0<=CHAR)||LA6_0==35||(LA6_0>=44 && LA6_0<=51)||(LA6_0>=57 && LA6_0<=58)) ) {
                        alt6=1;
                    }


                    switch (alt6) {
                	case 1 :
                	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:78:23: expr
                	    {
                	    pushFollow(FOLLOW_expr_in_call617);
                	    expr8=expr();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==1 ) {
                	      args.add((expr8!=null?((CymbolAST)expr8.start):null));
                	    }

                	    }
                	    break;

                	default :
                	    break loop6;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {

              		retval.type = symtab.call(ID9, args);
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:85:1: member returns [Type type] : ^( '.' expr ID ) ;
    public final Types.member_return member() throws RecognitionException {
        Types.member_return retval = new Types.member_return();
        retval.start = input.LT(1);

        CymbolAST ID11=null;
        Types.expr_return expr10 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:86:2: ( ^( '.' expr ID ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:86:4: ^( '.' expr ID )
            {
            match(input,MEMBER,FOLLOW_MEMBER_in_member646); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_member648);
            expr10=expr();

            state._fsp--;
            if (state.failed) return retval;
            ID11=(CymbolAST)match(input,ID,FOLLOW_ID_in_member650); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {

              		retval.type = symtab.member((expr10!=null?((CymbolAST)expr10.start):null), ID11);
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
    // $ANTLR end "member"


    // $ANTLR start "bop"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:93:1: bop : ( '+' | '-' | '*' | '/' );
    public final void bop() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:93:5: ( '+' | '-' | '*' | '/' )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:
            {
            if ( input.LA(1)==ADD||input.LA(1)==35||(input.LA(1)>=50 && input.LA(1)<=51) ) {
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:95:1: relop : ( '<' | '>' | '<=' | '>=' );
    public final void relop() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:95:6: ( '<' | '>' | '<=' | '>=' )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:
            {
            if ( (input.LA(1)>=46 && input.LA(1)<=49) ) {
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:97:1: eqop : ( '!=' | '==' );
    public final void eqop() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:97:5: ( '!=' | '==' )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Types.g:
            {
            if ( (input.LA(1)>=44 && input.LA(1)<=45) ) {
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


 

    public static final BitSet FOLLOW_exprRoot_in_bottomup57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_bottomup65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ret_in_bottomup73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_bottomup81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstat_in_bottomup89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ifstat106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_DECL_in_decl134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_decl138 = new BitSet(new long[]{0x07FFFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_43_in_ret177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXPR_in_exprRoot235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_exprRoot237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_57_in_expr269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_expr286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_expr302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_expr341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_NOT_in_expr392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADDR_in_expr415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr419 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEREF_in_expr442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr446 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_member_in_expr468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binaryOps_in_expr504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bop_in_binaryOps534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps538 = new BitSet(new long[]{0x060FF008007FB200L});
    public static final BitSet FOLLOW_expr_in_binaryOps542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relop_in_binaryOps554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps558 = new BitSet(new long[]{0x060FF008007FB200L});
    public static final BitSet FOLLOW_expr_in_binaryOps562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eqop_in_binaryOps572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_binaryOps576 = new BitSet(new long[]{0x060FF008007FB200L});
    public static final BitSet FOLLOW_expr_in_binaryOps580 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_call609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_call611 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ELIST_in_call614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_call617 = new BitSet(new long[]{0x060FF008007FB208L});
    public static final BitSet FOLLOW_MEMBER_in_member646 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_member648 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_member650 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_bop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_eqop0 = new BitSet(new long[]{0x0000000000000002L});

}