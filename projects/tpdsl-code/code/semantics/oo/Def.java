/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g 2009-09-23 17:37:47

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Def extends TreeFilter {
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


        public Def(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Def(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Def.tokenNames; }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g"; }


        SymbolTable symtab;
        Scope currentScope;
        MethodSymbol currentMethod;
        public Def(TreeNodeStream input, SymbolTable symtab) {
            this(input);
            this.symtab = symtab;
            currentScope = symtab.globals;
        }



    // $ANTLR start "topdown"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:20:1: topdown : ( enterBlock | enterMethod | enterClass | atoms | varDeclaration | ret );
    public final void topdown() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:21:5: ( enterBlock | enterMethod | enterClass | atoms | varDeclaration | ret )
            int alt1=6;
            switch ( input.LA(1) ) {
            case BLOCK:
                {
                alt1=1;
                }
                break;
            case METHOD_DECL:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case ID:
                {
                alt1=4;
                }
                break;
            case ARG_DECL:
            case VAR_DECL:
            case FIELD_DECL:
                {
                alt1=5;
                }
                break;
            case 43:
                {
                alt1=6;
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
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:21:9: enterBlock
                    {
                    pushFollow(FOLLOW_enterBlock_in_topdown56);
                    enterBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:22:9: enterMethod
                    {
                    pushFollow(FOLLOW_enterMethod_in_topdown66);
                    enterMethod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:23:9: enterClass
                    {
                    pushFollow(FOLLOW_enterClass_in_topdown76);
                    enterClass();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:24:9: atoms
                    {
                    pushFollow(FOLLOW_atoms_in_topdown86);
                    atoms();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:25:9: varDeclaration
                    {
                    pushFollow(FOLLOW_varDeclaration_in_topdown96);
                    varDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:26:9: ret
                    {
                    pushFollow(FOLLOW_ret_in_topdown106);
                    ret();

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
    // $ANTLR end "topdown"


    // $ANTLR start "bottomup"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:29:1: bottomup : ( exitBlock | exitMethod | exitClass );
    public final void bottomup() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:30:5: ( exitBlock | exitMethod | exitClass )
            int alt2=3;
            switch ( input.LA(1) ) {
            case BLOCK:
                {
                alt2=1;
                }
                break;
            case METHOD_DECL:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:30:9: exitBlock
                    {
                    pushFollow(FOLLOW_exitBlock_in_bottomup125);
                    exitBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:31:9: exitMethod
                    {
                    pushFollow(FOLLOW_exitMethod_in_bottomup135);
                    exitMethod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:32:9: exitClass
                    {
                    pushFollow(FOLLOW_exitClass_in_bottomup145);
                    exitClass();

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


    // $ANTLR start "enterBlock"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:37:1: enterBlock : BLOCK ;
    public final void enterBlock() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:38:5: ( BLOCK )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:38:9: BLOCK
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_enterBlock166); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              currentScope = new LocalScope(currentScope);
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
    // $ANTLR end "enterBlock"


    // $ANTLR start "exitBlock"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:40:1: exitBlock : BLOCK ;
    public final void exitBlock() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:41:5: ( BLOCK )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:41:9: BLOCK
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_exitBlock187); if (state.failed) return ;
            if ( state.backtracking==1 ) {

                      //System.out.println("locals: "+currentScope);
                      currentScope = currentScope.getEnclosingScope();    // pop scope
                      
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
    // $ANTLR end "exitBlock"


    // $ANTLR start "enterClass"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:49:1: enterClass : ^( 'class' name= ID ( ^( ':' sup= ID ) )? . ) ;
    public final void enterClass() throws RecognitionException {
        CymbolAST name=null;
        CymbolAST sup=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:50:5: ( ^( 'class' name= ID ( ^( ':' sup= ID ) )? . ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:50:9: ^( 'class' name= ID ( ^( ':' sup= ID ) )? . )
            {
            match(input,26,FOLLOW_26_in_enterClass218); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            name=(CymbolAST)match(input,ID,FOLLOW_ID_in_enterClass222); if (state.failed) return ;
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:50:27: ( ^( ':' sup= ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==30) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==ID) ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==UP) ) {
                            int LA3_5 = input.LA(5);

                            if ( ((LA3_5>=METHOD_DECL && LA3_5<=58)) ) {
                                alt3=1;
                            }
                        }
                    }
                }
            }
            switch (alt3) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:50:28: ^( ':' sup= ID )
                    {
                    match(input,30,FOLLOW_30_in_enterClass226); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(CymbolAST)match(input,ID,FOLLOW_ID_in_enterClass230); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;

                    }
                    break;

            }

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {
               // Def class but leave superclass blank until ref phase
                      ClassSymbol superclass = null;
                      if ( sup!=null ) { // can only ref classes above in file
                          superclass = (ClassSymbol)currentScope.resolve((sup!=null?sup.getText():null)); // find superclass
                          sup.symbol = superclass;
                      }
                      ClassSymbol cs = new ClassSymbol((name!=null?name.getText():null), currentScope, superclass);
                      cs.def = name;           // point from symbol table into AST
                      name.symbol = cs;        // point from AST into symbol table
                      currentScope.define(cs);  // def struct in current scope
                      currentScope = cs;        // set current scope to struct scope
                      
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
    // $ANTLR end "enterClass"


    // $ANTLR start "exitClass"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:66:1: exitClass : 'class' ;
    public final void exitClass() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:67:5: ( 'class' )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:67:9: 'class'
            {
            match(input,26,FOLLOW_26_in_exitClass266); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              currentScope = currentScope.getEnclosingScope();
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
    // $ANTLR end "exitClass"


    // $ANTLR start "enterMethod"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:70:1: enterMethod : ^( METHOD_DECL type ID ( . )* ) ;
    public final void enterMethod() throws RecognitionException {
        CymbolAST ID1=null;
        Type type2 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:71:5: ( ^( METHOD_DECL type ID ( . )* ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:71:9: ^( METHOD_DECL type ID ( . )* )
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_enterMethod291); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_enterMethod293);
            type2=type();

            state._fsp--;
            if (state.failed) return ;
            ID1=(CymbolAST)match(input,ID,FOLLOW_ID_in_enterMethod295); if (state.failed) return ;
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:71:31: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=METHOD_DECL && LA4_0<=58)) ) {
                    alt4=1;
                }
                else if ( (LA4_0==UP) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:71:31: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {

                      //System.out.println("line "+ID1.getLine()+": def method "+(ID1!=null?ID1.getText():null));
                      MethodSymbol ms = new MethodSymbol((ID1!=null?ID1.getText():null),type2,currentScope);
                      currentMethod = ms;
                      ms.def = ID1;            // track AST location of def's ID
                      ID1.symbol = ms;         // track in AST
                      currentScope.define(ms); // def method in globals
                      currentScope = ms;       // set current scope to method scope
                      
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
    // $ANTLR end "enterMethod"

    public static class ret_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "ret"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:83:1: ret : ^( 'return' . ) ;
    public final Def.ret_return ret() throws RecognitionException {
        Def.ret_return retval = new Def.ret_return();
        retval.start = input.LT(1);

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:84:5: ( ^( 'return' . ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:84:9: ^( 'return' . )
            {
            match(input,43,FOLLOW_43_in_ret328); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            matchAny(input); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==1 ) {
              ((CymbolAST)retval.start).symbol = currentMethod;
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


    // $ANTLR start "exitMethod"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:87:1: exitMethod : METHOD_DECL ;
    public final void exitMethod() throws RecognitionException {
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:88:5: ( METHOD_DECL )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:88:9: METHOD_DECL
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_exitMethod356); if (state.failed) return ;
            if ( state.backtracking==1 ) {

                      currentScope = currentScope.getEnclosingScope();    // pop method scope
                      
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
    // $ANTLR end "exitMethod"


    // $ANTLR start "atoms"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:97:1: atoms : {...}? ID ;
    public final void atoms() throws RecognitionException {
        CymbolAST t = (CymbolAST)input.LT(1);
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:100:5: ({...}? ID )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:100:8: {...}? ID
            {
            if ( !((t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "atoms", "t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN)");
            }
            match(input,ID,FOLLOW_ID_in_atoms396); if (state.failed) return ;
            if ( state.backtracking==1 ) {
              t.scope = currentScope;
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
    // $ANTLR end "atoms"


    // $ANTLR start "varDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:106:1: varDeclaration : ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) ;
    public final void varDeclaration() throws RecognitionException {
        CymbolAST ID3=null;
        Type type4 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:107:5: ( ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:107:9: ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? )
            {
            if ( input.LA(1)==ARG_DECL||(input.LA(1)>=VAR_DECL && input.LA(1)<=FIELD_DECL) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_varDeclaration436);
            type4=type();

            state._fsp--;
            if (state.failed) return ;
            ID3=(CymbolAST)match(input,ID,FOLLOW_ID_in_varDeclaration438); if (state.failed) return ;
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:107:50: ( . )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=METHOD_DECL && LA5_0<=58)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:107:50: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==1 ) {

                      //System.out.println("line "+ID3.getLine()+": def "+(ID3!=null?ID3.getText():null));
                      VariableSymbol vs = new VariableSymbol((ID3!=null?ID3.getText():null),type4);
                      vs.def = ID3;            // track AST location of def's ID
                      ID3.symbol = vs;         // track in AST
                      currentScope.define(vs);
                      
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
    // $ANTLR end "varDeclaration"


    // $ANTLR start "type"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:118:1: type returns [Type type] : ( ^( '*' typeElement ) | typeElement );
    public final Type type() throws RecognitionException {
        Type type = null;

        Type typeElement5 = null;

        Type typeElement6 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:121:5: ( ^( '*' typeElement ) | typeElement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            else if ( (LA6_0==ID||(LA6_0>=36 && LA6_0<=40)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:121:9: ^( '*' typeElement )
                    {
                    match(input,35,FOLLOW_35_in_type480); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_typeElement_in_type482);
                    typeElement5=typeElement();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;
                    if ( state.backtracking==1 ) {
                      type = new PointerType(typeElement5);
                    }

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:122:9: typeElement
                    {
                    pushFollow(FOLLOW_typeElement_in_type496);
                    typeElement6=typeElement();

                    state._fsp--;
                    if (state.failed) return type;
                    if ( state.backtracking==1 ) {
                      type = typeElement6;
                    }

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
        return type;
    }
    // $ANTLR end "type"


    // $ANTLR start "typeElement"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:126:1: typeElement returns [Type type] : ( 'float' | 'int' | 'char' | 'boolean' | 'void' | ID );
    public final Type typeElement() throws RecognitionException {
        Type type = null;

        CymbolAST t = (CymbolAST)input.LT(1);
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:134:5: ( 'float' | 'int' | 'char' | 'boolean' | 'void' | ID )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Def.g:
            {
            if ( input.LA(1)==ID||(input.LA(1)>=36 && input.LA(1)<=40) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return type;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            if ( state.backtracking==1 ) {

                  t.symbol = currentScope.resolve(t.getText()); // return Type
                  t.scope = currentScope;
                  type = (Type)t.symbol;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "typeElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_enterBlock_in_topdown56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterMethod_in_topdown66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterClass_in_topdown76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atoms_in_topdown86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_topdown96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ret_in_topdown106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitBlock_in_bottomup125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitMethod_in_bottomup135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitClass_in_bottomup145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_enterBlock166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_exitBlock187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_enterClass218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass222 = new BitSet(new long[]{0x07FFFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_30_in_enterClass226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_exitClass266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_DECL_in_enterMethod291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_enterMethod293 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_enterMethod295 = new BitSet(new long[]{0x07FFFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_43_in_ret328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_METHOD_DECL_in_exitMethod356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atoms396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_varDeclaration428 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_varDeclaration436 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration438 = new BitSet(new long[]{0x07FFFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_35_in_type480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeElement_in_type482 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeElement_in_type496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeElement0 = new BitSet(new long[]{0x0000000000000002L});

}
