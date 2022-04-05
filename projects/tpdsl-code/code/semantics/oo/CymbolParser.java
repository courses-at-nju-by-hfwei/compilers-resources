/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g 2009-09-23 17:37:46

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CymbolParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "UNARY_MINUS", "UNARY_NOT", "ASSIGN", "ADDR", "DEREF", "ADD", "MEMBER", "ID", "INT", "FLOAT", "CHAR", "LETTER", "WS", "SL_COMMENT", "'class'", "'{'", "'}'", "';'", "':'", "'('", "')'", "','", "'[]'", "'*'", "'float'", "'int'", "'char'", "'boolean'", "'void'", "'if'", "'else'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'-'", "'/'", "'!'", "'&'", "'['", "']'", "'->'", "'true'", "'false'"
    };
    public static final int T__42=42;
    public static final int T__28=28;
    public static final int T__57=57;
    public static final int EXPR=11;
    public static final int T__51=51;
    public static final int T__47=47;
    public static final int FLOAT=21;
    public static final int T__50=50;
    public static final int FIELD_DECL=8;
    public static final int BLOCK=6;
    public static final int T__39=39;
    public static final int T__30=30;
    public static final int T__46=46;
    public static final int T__52=52;
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
    public static final int T__29=29;
    public static final int T__45=45;
    public static final int T__55=55;
    public static final int ADDR=15;
    public static final int T__43=43;
    public static final int T__31=31;
    public static final int T__40=40;
    public static final int EOF=-1;
    public static final int T__53=53;
    public static final int T__32=32;
    public static final int T__38=38;
    public static final int CALL=9;
    public static final int T__37=37;
    public static final int T__26=26;
    public static final int DEREF=16;
    public static final int VAR_DECL=7;
    public static final int ADD=17;
    public static final int T__41=41;

    // delegates
    // delegators


        public CymbolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CymbolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CymbolParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g"; }


    public static class compilationUnit_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:25:1: compilationUnit : ( classDeclaration | methodDeclaration | varDeclaration )+ ;
    public final CymbolParser.compilationUnit_return compilationUnit() throws RecognitionException {
        CymbolParser.compilationUnit_return retval = new CymbolParser.compilationUnit_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        CymbolParser.classDeclaration_return classDeclaration1 = null;

        CymbolParser.methodDeclaration_return methodDeclaration2 = null;

        CymbolParser.varDeclaration_return varDeclaration3 = null;



        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:27:5: ( ( classDeclaration | methodDeclaration | varDeclaration )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:27:9: ( classDeclaration | methodDeclaration | varDeclaration )+
            {
            root_0 = (CymbolAST)adaptor.nil();

            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:27:9: ( classDeclaration | methodDeclaration | varDeclaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt1=1;
                    }
                    break;
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                    {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==35) ) {
                        alt1=3;
                    }
                    else if ( (LA1_3==ID) ) {
                        int LA1_6 = input.LA(3);

                        if ( (LA1_6==31) ) {
                            alt1=2;
                        }
                        else if ( (LA1_6==ASSIGN||LA1_6==29||LA1_6==34) ) {
                            alt1=3;
                        }


                    }


                    }
                    break;
                case ID:
                    {
                    int LA1_4 = input.LA(2);

                    if ( (LA1_4==ID) ) {
                        int LA1_6 = input.LA(3);

                        if ( (LA1_6==31) ) {
                            alt1=2;
                        }
                        else if ( (LA1_6==ASSIGN||LA1_6==29||LA1_6==34) ) {
                            alt1=3;
                        }


                    }
                    else if ( (LA1_4==35) ) {
                        alt1=3;
                    }


                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:27:13: classDeclaration
            	    {
            	    pushFollow(FOLLOW_classDeclaration_in_compilationUnit188);
            	    classDeclaration1=classDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:27:32: methodDeclaration
            	    {
            	    pushFollow(FOLLOW_methodDeclaration_in_compilationUnit192);
            	    methodDeclaration2=methodDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration2.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:27:52: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_compilationUnit196);
            	    varDeclaration3=varDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              ((CymbolAST)retval.tree).setUnknownTokenBoundaries();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compilationUnit"

    public static class classDeclaration_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:31:1: classDeclaration : 'class' ID ( superClass )? '{' ( classMember )+ '}' ';' -> ^( 'class' ID ( superClass )? ( classMember )+ ) ;
    public final CymbolParser.classDeclaration_return classDeclaration() throws RecognitionException {
        CymbolParser.classDeclaration_return retval = new CymbolParser.classDeclaration_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token string_literal4=null;
        Token ID5=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token char_literal10=null;
        CymbolParser.superClass_return superClass6 = null;

        CymbolParser.classMember_return classMember8 = null;


        CymbolAST string_literal4_tree=null;
        CymbolAST ID5_tree=null;
        CymbolAST char_literal7_tree=null;
        CymbolAST char_literal9_tree=null;
        CymbolAST char_literal10_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        RewriteRuleSubtreeStream stream_superClass=new RewriteRuleSubtreeStream(adaptor,"rule superClass");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:32:5: ( 'class' ID ( superClass )? '{' ( classMember )+ '}' ';' -> ^( 'class' ID ( superClass )? ( classMember )+ ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:32:9: 'class' ID ( superClass )? '{' ( classMember )+ '}' ';'
            {
            string_literal4=(Token)match(input,26,FOLLOW_26_in_classDeclaration226); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(string_literal4);

            ID5=(Token)match(input,ID,FOLLOW_ID_in_classDeclaration228); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID5);

            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:32:20: ( superClass )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:32:20: superClass
                    {
                    pushFollow(FOLLOW_superClass_in_classDeclaration230);
                    superClass6=superClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_superClass.add(superClass6.getTree());

                    }
                    break;

            }

            char_literal7=(Token)match(input,27,FOLLOW_27_in_classDeclaration233); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal7);

            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:32:36: ( classMember )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||(LA3_0>=36 && LA3_0<=40)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:32:36: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classDeclaration235);
            	    classMember8=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember8.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            char_literal9=(Token)match(input,28,FOLLOW_28_in_classDeclaration238); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal9);

            char_literal10=(Token)match(input,29,FOLLOW_29_in_classDeclaration240); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal10);



            // AST REWRITE
            // elements: 26, superClass, ID, classMember
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CymbolAST)adaptor.nil();
            // 33:9: -> ^( 'class' ID ( superClass )? ( classMember )+ )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:33:12: ^( 'class' ID ( superClass )? ( classMember )+ )
                {
                CymbolAST root_1 = (CymbolAST)adaptor.nil();
                root_1 = (CymbolAST)adaptor.becomeRoot(stream_26.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:33:25: ( superClass )?
                if ( stream_superClass.hasNext() ) {
                    adaptor.addChild(root_1, stream_superClass.nextTree());

                }
                stream_superClass.reset();
                if ( !(stream_classMember.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_classMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_classMember.nextTree());

                }
                stream_classMember.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"

    public static class superClass_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "superClass"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:35:1: superClass : ':' ID -> ^( ':' ID ) ;
    public final CymbolParser.superClass_return superClass() throws RecognitionException {
        CymbolParser.superClass_return retval = new CymbolParser.superClass_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token char_literal11=null;
        Token ID12=null;

        CymbolAST char_literal11_tree=null;
        CymbolAST ID12_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:36:5: ( ':' ID -> ^( ':' ID ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:36:9: ':' ID
            {
            char_literal11=(Token)match(input,30,FOLLOW_30_in_superClass280); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(char_literal11);

            ID12=(Token)match(input,ID,FOLLOW_ID_in_superClass282); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID12);



            // AST REWRITE
            // elements: 30, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CymbolAST)adaptor.nil();
            // 36:16: -> ^( ':' ID )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:36:19: ^( ':' ID )
                {
                CymbolAST root_1 = (CymbolAST)adaptor.nil();
                root_1 = (CymbolAST)adaptor.becomeRoot(stream_30.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "superClass"

    public static class classMember_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMember"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:39:1: classMember : ( varDeclaration | methodDeclaration );
    public final CymbolParser.classMember_return classMember() throws RecognitionException {
        CymbolParser.classMember_return retval = new CymbolParser.classMember_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        CymbolParser.varDeclaration_return varDeclaration13 = null;

        CymbolParser.methodDeclaration_return methodDeclaration14 = null;



        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:40:5: ( varDeclaration | methodDeclaration )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=36 && LA4_0<=40)) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==ID) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==31) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==ASSIGN||LA4_3==29||LA4_3==34) ) {
                        alt4=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==35) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==ID) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==31) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==ASSIGN||LA4_3==29||LA4_3==34) ) {
                        alt4=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_2==35) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:40:9: varDeclaration
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_classMember309);
                    varDeclaration13=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration13.getTree());

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:41:9: methodDeclaration
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    pushFollow(FOLLOW_methodDeclaration_in_classMember319);
                    methodDeclaration14=methodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration14.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classMember"

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:45:1: methodDeclaration : type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) ;
    public final CymbolParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        CymbolParser.methodDeclaration_return retval = new CymbolParser.methodDeclaration_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token ID16=null;
        Token char_literal17=null;
        Token char_literal19=null;
        CymbolParser.type_return type15 = null;

        CymbolParser.formalParameters_return formalParameters18 = null;

        CymbolParser.block_return block20 = null;


        CymbolAST ID16_tree=null;
        CymbolAST char_literal17_tree=null;
        CymbolAST char_literal19_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:46:5: ( type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:46:9: type ID '(' ( formalParameters )? ')' block
            {
            pushFollow(FOLLOW_type_in_methodDeclaration342);
            type15=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type15.getTree());
            ID16=(Token)match(input,ID,FOLLOW_ID_in_methodDeclaration344); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID16);

            char_literal17=(Token)match(input,31,FOLLOW_31_in_methodDeclaration346); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_31.add(char_literal17);

            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:46:21: ( formalParameters )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID||(LA5_0>=36 && LA5_0<=40)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:46:21: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration348);
                    formalParameters18=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters18.getTree());

                    }
                    break;

            }

            char_literal19=(Token)match(input,32,FOLLOW_32_in_methodDeclaration351); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal19);

            pushFollow(FOLLOW_block_in_methodDeclaration353);
            block20=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block20.getTree());


            // AST REWRITE
            // elements: ID, formalParameters, block, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CymbolAST)adaptor.nil();
            // 47:9: -> ^( METHOD_DECL type ID ( formalParameters )? block )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:47:12: ^( METHOD_DECL type ID ( formalParameters )? block )
                {
                CymbolAST root_1 = (CymbolAST)adaptor.nil();
                root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:47:34: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodDeclaration"

    public static class formalParameters_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:51:1: formalParameters : parameter ( ',' parameter )* -> ( parameter )+ ;
    public final CymbolParser.formalParameters_return formalParameters() throws RecognitionException {
        CymbolParser.formalParameters_return retval = new CymbolParser.formalParameters_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token char_literal22=null;
        CymbolParser.parameter_return parameter21 = null;

        CymbolParser.parameter_return parameter23 = null;


        CymbolAST char_literal22_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:52:5: ( parameter ( ',' parameter )* -> ( parameter )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:52:9: parameter ( ',' parameter )*
            {
            pushFollow(FOLLOW_parameter_in_formalParameters396);
            parameter21=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(parameter21.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:52:19: ( ',' parameter )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:52:20: ',' parameter
            	    {
            	    char_literal22=(Token)match(input,33,FOLLOW_33_in_formalParameters399); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_33.add(char_literal22);

            	    pushFollow(FOLLOW_parameter_in_formalParameters401);
            	    parameter23=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter.add(parameter23.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



            // AST REWRITE
            // elements: parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CymbolAST)adaptor.nil();
            // 52:36: -> ( parameter )+
            {
                if ( !(stream_parameter.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_0, stream_parameter.nextTree());

                }
                stream_parameter.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class parameter_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:55:1: parameter : ( type ID -> ^( ARG_DECL type ID ) | type ID '[]' -> ^( ARG_DECL ^( '*' type ) ID ) | type '*' ID -> ^( ARG_DECL ^( '*' type ) ID ) );
    public final CymbolParser.parameter_return parameter() throws RecognitionException {
        CymbolParser.parameter_return retval = new CymbolParser.parameter_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token ID25=null;
        Token ID27=null;
        Token string_literal28=null;
        Token char_literal30=null;
        Token ID31=null;
        CymbolParser.type_return type24 = null;

        CymbolParser.type_return type26 = null;

        CymbolParser.type_return type29 = null;


        CymbolAST ID25_tree=null;
        CymbolAST ID27_tree=null;
        CymbolAST string_literal28_tree=null;
        CymbolAST char_literal30_tree=null;
        CymbolAST ID31_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:56:5: ( type ID -> ^( ARG_DECL type ID ) | type ID '[]' -> ^( ARG_DECL ^( '*' type ) ID ) | type '*' ID -> ^( ARG_DECL ^( '*' type ) ID ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=36 && LA7_0<=40)) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==34) ) {
                        alt7=2;
                    }
                    else if ( ((LA7_3>=32 && LA7_3<=33)) ) {
                        alt7=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==35) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==ID) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==35) ) {
                    alt7=3;
                }
                else if ( (LA7_2==ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==34) ) {
                        alt7=2;
                    }
                    else if ( ((LA7_3>=32 && LA7_3<=33)) ) {
                        alt7=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:56:9: type ID
                    {
                    pushFollow(FOLLOW_type_in_parameter431);
                    type24=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type24.getTree());
                    ID25=(Token)match(input,ID,FOLLOW_ID_in_parameter433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID25);



                    // AST REWRITE
                    // elements: ID, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 56:22: -> ^( ARG_DECL type ID )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:56:25: ^( ARG_DECL type ID )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:57:9: type ID '[]'
                    {
                    pushFollow(FOLLOW_type_in_parameter458);
                    type26=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type26.getTree());
                    ID27=(Token)match(input,ID,FOLLOW_ID_in_parameter460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID27);

                    string_literal28=(Token)match(input,34,FOLLOW_34_in_parameter462); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(string_literal28);



                    // AST REWRITE
                    // elements: type, ID, 35
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 57:22: -> ^( ARG_DECL ^( '*' type ) ID )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:57:25: ^( ARG_DECL ^( '*' type ) ID )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:57:36: ^( '*' type )
                        {
                        CymbolAST root_2 = (CymbolAST)adaptor.nil();
                        root_2 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(35, "35"), root_2);

                        adaptor.addChild(root_2, stream_type.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:58:9: type '*' ID
                    {
                    pushFollow(FOLLOW_type_in_parameter486);
                    type29=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type29.getTree());
                    char_literal30=(Token)match(input,35,FOLLOW_35_in_parameter488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal30);

                    ID31=(Token)match(input,ID,FOLLOW_ID_in_parameter490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID31);



                    // AST REWRITE
                    // elements: type, ID, 35
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 58:22: -> ^( ARG_DECL ^( '*' type ) ID )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:58:25: ^( ARG_DECL ^( '*' type ) ID )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:58:36: ^( '*' type )
                        {
                        CymbolAST root_2 = (CymbolAST)adaptor.nil();
                        root_2 = (CymbolAST)adaptor.becomeRoot(stream_35.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_type.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class type_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:61:1: type : ( primitiveType | ID );
    public final CymbolParser.type_return type() throws RecognitionException {
        CymbolParser.type_return retval = new CymbolParser.type_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token ID33=null;
        CymbolParser.primitiveType_return primitiveType32 = null;


        CymbolAST ID33_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:61:5: ( primitiveType | ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=36 && LA8_0<=40)) ) {
                alt8=1;
            }
            else if ( (LA8_0==ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:61:9: primitiveType
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type519);
                    primitiveType32=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType32.getTree());

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:62:9: ID
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    ID33=(Token)match(input,ID,FOLLOW_ID_in_type529); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID33_tree = (CymbolAST)adaptor.create(ID33);
                    adaptor.addChild(root_0, ID33_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class primitiveType_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:65:1: primitiveType : ( 'float' | 'int' | 'char' | 'boolean' | 'void' );
    public final CymbolParser.primitiveType_return primitiveType() throws RecognitionException {
        CymbolParser.primitiveType_return retval = new CymbolParser.primitiveType_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token set34=null;

        CymbolAST set34_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:66:5: ( 'float' | 'int' | 'char' | 'boolean' | 'void' )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:
            {
            root_0 = (CymbolAST)adaptor.nil();

            set34=(Token)input.LT(1);
            if ( (input.LA(1)>=36 && input.LA(1)<=40) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CymbolAST)adaptor.create(set34));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class block_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:74:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final CymbolParser.block_return block() throws RecognitionException {
        CymbolParser.block_return retval = new CymbolParser.block_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token char_literal35=null;
        Token char_literal37=null;
        CymbolParser.statement_return statement36 = null;


        CymbolAST char_literal35_tree=null;
        CymbolAST char_literal37_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:75:5: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:75:9: '{' ( statement )* '}'
            {
            char_literal35=(Token)match(input,27,FOLLOW_27_in_block608); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal35);

            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:75:13: ( statement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=ID && LA9_0<=CHAR)||LA9_0==27||LA9_0==31||(LA9_0>=35 && LA9_0<=41)||LA9_0==43||LA9_0==50||(LA9_0>=52 && LA9_0<=53)||(LA9_0>=57 && LA9_0<=58)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:75:13: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block610);
            	    statement36=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement36.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            char_literal37=(Token)match(input,28,FOLLOW_28_in_block613); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal37);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CymbolAST)adaptor.nil();
            // 75:28: -> ^( BLOCK ( statement )* )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:75:31: ^( BLOCK ( statement )* )
                {
                CymbolAST root_1 = (CymbolAST)adaptor.nil();
                root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:75:39: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class varDeclaration_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:80:1: varDeclaration : ( type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) | type ID '[]' ( '=' expression )? ';' -> ^( VAR_DECL ^( '*' type ) ID ( expression )? ) | type '*' ID ( '=' expression )? ';' -> ^( VAR_DECL ^( '*' type ) ID ( expression )? ) );
    public final CymbolParser.varDeclaration_return varDeclaration() throws RecognitionException {
        CymbolParser.varDeclaration_return retval = new CymbolParser.varDeclaration_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token ID39=null;
        Token char_literal40=null;
        Token char_literal42=null;
        Token ID44=null;
        Token string_literal45=null;
        Token char_literal46=null;
        Token char_literal48=null;
        Token char_literal50=null;
        Token ID51=null;
        Token char_literal52=null;
        Token char_literal54=null;
        CymbolParser.type_return type38 = null;

        CymbolParser.expression_return expression41 = null;

        CymbolParser.type_return type43 = null;

        CymbolParser.expression_return expression47 = null;

        CymbolParser.type_return type49 = null;

        CymbolParser.expression_return expression53 = null;


        CymbolAST ID39_tree=null;
        CymbolAST char_literal40_tree=null;
        CymbolAST char_literal42_tree=null;
        CymbolAST ID44_tree=null;
        CymbolAST string_literal45_tree=null;
        CymbolAST char_literal46_tree=null;
        CymbolAST char_literal48_tree=null;
        CymbolAST char_literal50_tree=null;
        CymbolAST ID51_tree=null;
        CymbolAST char_literal52_tree=null;
        CymbolAST char_literal54_tree=null;
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:81:5: ( type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) | type ID '[]' ( '=' expression )? ';' -> ^( VAR_DECL ^( '*' type ) ID ( expression )? ) | type '*' ID ( '=' expression )? ';' -> ^( VAR_DECL ^( '*' type ) ID ( expression )? ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=36 && LA13_0<=40)) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==35) ) {
                    alt13=3;
                }
                else if ( (LA13_1==ID) ) {
                    int LA13_4 = input.LA(3);

                    if ( (LA13_4==34) ) {
                        alt13=2;
                    }
                    else if ( (LA13_4==ASSIGN||LA13_4==29) ) {
                        alt13=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==ID) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==35) ) {
                    alt13=3;
                }
                else if ( (LA13_2==ID) ) {
                    int LA13_4 = input.LA(3);

                    if ( (LA13_4==34) ) {
                        alt13=2;
                    }
                    else if ( (LA13_4==ASSIGN||LA13_4==29) ) {
                        alt13=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:81:9: type ID ( '=' expression )? ';'
                    {
                    pushFollow(FOLLOW_type_in_varDeclaration643);
                    type38=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type38.getTree());
                    ID39=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID39);

                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:81:17: ( '=' expression )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ASSIGN) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:81:18: '=' expression
                            {
                            char_literal40=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration648); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal40);

                            pushFollow(FOLLOW_expression_in_varDeclaration650);
                            expression41=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression41.getTree());

                            }
                            break;

                    }

                    char_literal42=(Token)match(input,29,FOLLOW_29_in_varDeclaration654); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal42);



                    // AST REWRITE
                    // elements: ID, type, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 82:13: -> ^( VAR_DECL type ID ( expression )? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:82:16: ^( VAR_DECL type ID ( expression )? )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:82:35: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:83:9: type ID '[]' ( '=' expression )? ';'
                    {
                    pushFollow(FOLLOW_type_in_varDeclaration689);
                    type43=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type43.getTree());
                    ID44=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration691); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID44);

                    string_literal45=(Token)match(input,34,FOLLOW_34_in_varDeclaration693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(string_literal45);

                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:83:22: ( '=' expression )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ASSIGN) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:83:23: '=' expression
                            {
                            char_literal46=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration696); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal46);

                            pushFollow(FOLLOW_expression_in_varDeclaration698);
                            expression47=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression47.getTree());

                            }
                            break;

                    }

                    char_literal48=(Token)match(input,29,FOLLOW_29_in_varDeclaration702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal48);



                    // AST REWRITE
                    // elements: 35, expression, type, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 84:13: -> ^( VAR_DECL ^( '*' type ) ID ( expression )? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:84:16: ^( VAR_DECL ^( '*' type ) ID ( expression )? )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:84:27: ^( '*' type )
                        {
                        CymbolAST root_2 = (CymbolAST)adaptor.nil();
                        root_2 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(35, "35"), root_2);

                        adaptor.addChild(root_2, stream_type.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:84:42: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:85:9: type '*' ID ( '=' expression )? ';'
                    {
                    pushFollow(FOLLOW_type_in_varDeclaration741);
                    type49=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type49.getTree());
                    char_literal50=(Token)match(input,35,FOLLOW_35_in_varDeclaration743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal50);

                    ID51=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID51);

                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:85:21: ( '=' expression )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ASSIGN) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:85:22: '=' expression
                            {
                            char_literal52=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration748); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal52);

                            pushFollow(FOLLOW_expression_in_varDeclaration750);
                            expression53=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression53.getTree());

                            }
                            break;

                    }

                    char_literal54=(Token)match(input,29,FOLLOW_29_in_varDeclaration754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal54);



                    // AST REWRITE
                    // elements: expression, ID, type, 35
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 86:13: -> ^( VAR_DECL ^( '*' type ) ID ( expression )? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:86:16: ^( VAR_DECL ^( '*' type ) ID ( expression )? )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:86:27: ^( '*' type )
                        {
                        CymbolAST root_2 = (CymbolAST)adaptor.nil();
                        root_2 = (CymbolAST)adaptor.becomeRoot(stream_35.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_type.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:86:42: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDeclaration"

    public static class statement_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:90:1: statement options {backtrack=true; } : ( block | varDeclaration | 'if' '(' expression ')' s= statement ( 'else' e= statement )? -> ^( 'if' expression $s ( $e)? ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) );
    public final CymbolParser.statement_return statement() throws RecognitionException {
        CymbolParser.statement_return retval = new CymbolParser.statement_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token string_literal57=null;
        Token char_literal58=null;
        Token char_literal60=null;
        Token string_literal61=null;
        Token string_literal62=null;
        Token char_literal64=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token char_literal69=null;
        CymbolParser.statement_return s = null;

        CymbolParser.statement_return e = null;

        CymbolParser.postfixExpression_return a = null;

        CymbolParser.block_return block55 = null;

        CymbolParser.varDeclaration_return varDeclaration56 = null;

        CymbolParser.expression_return expression59 = null;

        CymbolParser.expression_return expression63 = null;

        CymbolParser.lhs_return lhs65 = null;

        CymbolParser.expression_return expression67 = null;


        CymbolAST string_literal57_tree=null;
        CymbolAST char_literal58_tree=null;
        CymbolAST char_literal60_tree=null;
        CymbolAST string_literal61_tree=null;
        CymbolAST string_literal62_tree=null;
        CymbolAST char_literal64_tree=null;
        CymbolAST char_literal66_tree=null;
        CymbolAST char_literal68_tree=null;
        CymbolAST char_literal69_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:92:5: ( block | varDeclaration | 'if' '(' expression ')' s= statement ( 'else' e= statement )? -> ^( 'if' expression $s ( $e)? ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) )
            int alt16=6;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:92:9: block
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement810);
                    block55=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block55.getTree());

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:93:9: varDeclaration
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_statement820);
                    varDeclaration56=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration56.getTree());

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:94:9: 'if' '(' expression ')' s= statement ( 'else' e= statement )?
                    {
                    string_literal57=(Token)match(input,41,FOLLOW_41_in_statement830); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal57);

                    char_literal58=(Token)match(input,31,FOLLOW_31_in_statement832); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal58);

                    pushFollow(FOLLOW_expression_in_statement834);
                    expression59=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());
                    char_literal60=(Token)match(input,32,FOLLOW_32_in_statement836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal60);

                    pushFollow(FOLLOW_statement_in_statement840);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s.getTree());
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:94:45: ( 'else' e= statement )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==42) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:94:46: 'else' e= statement
                            {
                            string_literal61=(Token)match(input,42,FOLLOW_42_in_statement843); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_42.add(string_literal61);

                            pushFollow(FOLLOW_statement_in_statement847);
                            e=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(e.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 41, s, e, expression
                    // token labels: 
                    // rule labels: retval, s, e
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);
                    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 95:9: -> ^( 'if' expression $s ( $e)? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:95:12: ^( 'if' expression $s ( $e)? )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot(stream_41.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_s.nextTree());
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:95:33: ( $e)?
                        if ( stream_e.hasNext() ) {
                            adaptor.addChild(root_1, stream_e.nextTree());

                        }
                        stream_e.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:96:9: 'return' ( expression )? ';'
                    {
                    string_literal62=(Token)match(input,43,FOLLOW_43_in_statement882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_43.add(string_literal62);

                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:96:18: ( expression )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=ID && LA15_0<=CHAR)||LA15_0==31||LA15_0==35||LA15_0==50||(LA15_0>=52 && LA15_0<=53)||(LA15_0>=57 && LA15_0<=58)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:96:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement884);
                            expression63=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression63.getTree());

                            }
                            break;

                    }

                    char_literal64=(Token)match(input,29,FOLLOW_29_in_statement887); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal64);



                    // AST REWRITE
                    // elements: 43, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 96:34: -> ^( 'return' ( expression )? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:96:37: ^( 'return' ( expression )? )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot(stream_43.nextNode(), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:96:48: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:97:9: lhs '=' expression ';'
                    {
                    pushFollow(FOLLOW_lhs_in_statement906);
                    lhs65=lhs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lhs.add(lhs65.getTree());
                    char_literal66=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal66);

                    pushFollow(FOLLOW_expression_in_statement910);
                    expression67=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression67.getTree());
                    char_literal68=(Token)match(input,29,FOLLOW_29_in_statement912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal68);



                    // AST REWRITE
                    // elements: lhs, ASSIGN, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 97:32: -> ^( '=' lhs expression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:97:35: ^( '=' lhs expression )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_lhs.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:98:9: a= postfixExpression ';'
                    {
                    pushFollow(FOLLOW_postfixExpression_in_statement934);
                    a=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfixExpression.add(a.getTree());
                    char_literal69=(Token)match(input,29,FOLLOW_29_in_statement936); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal69);



                    // AST REWRITE
                    // elements: postfixExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 99:13: -> ^( EXPR postfixExpression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:99:16: ^( EXPR postfixExpression )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(EXPR, "EXPR"), root_1);

                        adaptor.addChild(root_1, stream_postfixExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class lhs_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lhs"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:102:1: lhs : unaryExpression -> ^( EXPR unaryExpression ) ;
    public final CymbolParser.lhs_return lhs() throws RecognitionException {
        CymbolParser.lhs_return retval = new CymbolParser.lhs_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        CymbolParser.unaryExpression_return unaryExpression70 = null;


        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:102:5: ( unaryExpression -> ^( EXPR unaryExpression ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:102:9: unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_lhs972);
            unaryExpression70=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression70.getTree());


            // AST REWRITE
            // elements: unaryExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CymbolAST)adaptor.nil();
            // 102:25: -> ^( EXPR unaryExpression )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:102:28: ^( EXPR unaryExpression )
                {
                CymbolAST root_1 = (CymbolAST)adaptor.nil();
                root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(EXPR, "EXPR"), root_1);

                adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lhs"

    public static class expressionList_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:104:1: expressionList : ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST );
    public final CymbolParser.expressionList_return expressionList() throws RecognitionException {
        CymbolParser.expressionList_return retval = new CymbolParser.expressionList_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token char_literal72=null;
        CymbolParser.expr_return expr71 = null;

        CymbolParser.expr_return expr73 = null;


        CymbolAST char_literal72_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:105:5: ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=ID && LA18_0<=CHAR)||LA18_0==31||LA18_0==35||LA18_0==50||(LA18_0>=52 && LA18_0<=53)||(LA18_0>=57 && LA18_0<=58)) ) {
                alt18=1;
            }
            else if ( (LA18_0==32) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:105:9: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_expressionList999);
                    expr71=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr71.getTree());
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:105:14: ( ',' expr )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==33) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:105:15: ',' expr
                    	    {
                    	    char_literal72=(Token)match(input,33,FOLLOW_33_in_expressionList1002); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_33.add(char_literal72);

                    	    pushFollow(FOLLOW_expr_in_expressionList1004);
                    	    expr73=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr73.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 105:26: -> ^( ELIST ( expr )+ )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:105:29: ^( ELIST ( expr )+ )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(ELIST, "ELIST"), root_1);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:106:9: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 106:9: -> ELIST
                    {
                        adaptor.addChild(root_0, (CymbolAST)adaptor.create(ELIST, "ELIST"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class expression_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:109:1: expression : expr -> ^( EXPR expr ) ;
    public final CymbolParser.expression_return expression() throws RecognitionException {
        CymbolParser.expression_return retval = new CymbolParser.expression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        CymbolParser.expr_return expr74 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:110:5: ( expr -> ^( EXPR expr ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:110:9: expr
            {
            pushFollow(FOLLOW_expr_in_expression1046);
            expr74=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr74.getTree());


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CymbolAST)adaptor.nil();
            // 110:14: -> ^( EXPR expr )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:110:17: ^( EXPR expr )
                {
                CymbolAST root_1 = (CymbolAST)adaptor.nil();
                root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(EXPR, "EXPR"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expr_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:113:1: expr : equalityExpression ;
    public final CymbolParser.expr_return expr() throws RecognitionException {
        CymbolParser.expr_return retval = new CymbolParser.expr_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        CymbolParser.equalityExpression_return equalityExpression75 = null;



        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:113:5: ( equalityExpression )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:113:9: equalityExpression
            {
            root_0 = (CymbolAST)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_expr1068);
            equalityExpression75=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression75.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:116:1: equalityExpression : relationalExpression ( ( '!=' | '==' ) relationalExpression )* ;
    public final CymbolParser.equalityExpression_return equalityExpression() throws RecognitionException {
        CymbolParser.equalityExpression_return retval = new CymbolParser.equalityExpression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token string_literal77=null;
        Token string_literal78=null;
        CymbolParser.relationalExpression_return relationalExpression76 = null;

        CymbolParser.relationalExpression_return relationalExpression79 = null;


        CymbolAST string_literal77_tree=null;
        CymbolAST string_literal78_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:117:5: ( relationalExpression ( ( '!=' | '==' ) relationalExpression )* )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:117:9: relationalExpression ( ( '!=' | '==' ) relationalExpression )*
            {
            root_0 = (CymbolAST)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1091);
            relationalExpression76=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression76.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:117:30: ( ( '!=' | '==' ) relationalExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=44 && LA20_0<=45)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:117:31: ( '!=' | '==' ) relationalExpression
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:117:31: ( '!=' | '==' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==44) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==45) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:117:32: '!='
            	            {
            	            string_literal77=(Token)match(input,44,FOLLOW_44_in_equalityExpression1095); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal77_tree = (CymbolAST)adaptor.create(string_literal77);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(string_literal77_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:117:40: '=='
            	            {
            	            string_literal78=(Token)match(input,45,FOLLOW_45_in_equalityExpression1100); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal78_tree = (CymbolAST)adaptor.create(string_literal78);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(string_literal78_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1104);
            	    relationalExpression79=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression79.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:120:1: relationalExpression : additiveExpression ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* ) ;
    public final CymbolParser.relationalExpression_return relationalExpression() throws RecognitionException {
        CymbolParser.relationalExpression_return retval = new CymbolParser.relationalExpression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token char_literal81=null;
        Token char_literal82=null;
        Token string_literal83=null;
        Token string_literal84=null;
        CymbolParser.additiveExpression_return additiveExpression80 = null;

        CymbolParser.additiveExpression_return additiveExpression85 = null;


        CymbolAST char_literal81_tree=null;
        CymbolAST char_literal82_tree=null;
        CymbolAST string_literal83_tree=null;
        CymbolAST string_literal84_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:121:5: ( additiveExpression ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:121:9: additiveExpression ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* )
            {
            root_0 = (CymbolAST)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1125);
            additiveExpression80=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression80.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:122:9: ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:122:13: ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:122:13: ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=46 && LA22_0<=49)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:122:17: ( '<' | '>' | '<=' | '>=' ) additiveExpression
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:122:17: ( '<' | '>' | '<=' | '>=' )
            	    int alt21=4;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:122:21: '<'
            	            {
            	            char_literal81=(Token)match(input,46,FOLLOW_46_in_relationalExpression1147); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal81_tree = (CymbolAST)adaptor.create(char_literal81);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(char_literal81_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:123:21: '>'
            	            {
            	            char_literal82=(Token)match(input,47,FOLLOW_47_in_relationalExpression1170); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal82_tree = (CymbolAST)adaptor.create(char_literal82);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(char_literal82_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:124:21: '<='
            	            {
            	            string_literal83=(Token)match(input,48,FOLLOW_48_in_relationalExpression1193); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal83_tree = (CymbolAST)adaptor.create(string_literal83);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(string_literal83_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:125:21: '>='
            	            {
            	            string_literal84=(Token)match(input,49,FOLLOW_49_in_relationalExpression1216); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal84_tree = (CymbolAST)adaptor.create(string_literal84);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(string_literal84_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1253);
            	    additiveExpression85=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression85.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:132:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final CymbolParser.additiveExpression_return additiveExpression() throws RecognitionException {
        CymbolParser.additiveExpression_return retval = new CymbolParser.additiveExpression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token char_literal87=null;
        Token char_literal88=null;
        CymbolParser.multiplicativeExpression_return multiplicativeExpression86 = null;

        CymbolParser.multiplicativeExpression_return multiplicativeExpression89 = null;


        CymbolAST char_literal87_tree=null;
        CymbolAST char_literal88_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:133:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:133:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (CymbolAST)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1297);
            multiplicativeExpression86=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression86.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:133:34: ( ( '+' | '-' ) multiplicativeExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ADD||LA24_0==50) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:133:35: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:133:35: ( '+' | '-' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==ADD) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==50) ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:133:36: '+'
            	            {
            	            char_literal87=(Token)match(input,ADD,FOLLOW_ADD_in_additiveExpression1301); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal87_tree = (CymbolAST)adaptor.create(char_literal87);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(char_literal87_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:133:43: '-'
            	            {
            	            char_literal88=(Token)match(input,50,FOLLOW_50_in_additiveExpression1306); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal88_tree = (CymbolAST)adaptor.create(char_literal88);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(char_literal88_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1310);
            	    multiplicativeExpression89=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression89.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:136:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' ) unaryExpression )* ;
    public final CymbolParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        CymbolParser.multiplicativeExpression_return retval = new CymbolParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token char_literal91=null;
        Token char_literal92=null;
        CymbolParser.unaryExpression_return unaryExpression90 = null;

        CymbolParser.unaryExpression_return unaryExpression93 = null;


        CymbolAST char_literal91_tree=null;
        CymbolAST char_literal92_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:137:5: ( unaryExpression ( ( '*' | '/' ) unaryExpression )* )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:137:9: unaryExpression ( ( '*' | '/' ) unaryExpression )*
            {
            root_0 = (CymbolAST)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1331);
            unaryExpression90=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression90.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:137:25: ( ( '*' | '/' ) unaryExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35||LA26_0==51) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:137:26: ( '*' | '/' ) unaryExpression
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:137:26: ( '*' | '/' )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==35) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==51) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:137:27: '*'
            	            {
            	            char_literal91=(Token)match(input,35,FOLLOW_35_in_multiplicativeExpression1335); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal91_tree = (CymbolAST)adaptor.create(char_literal91);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(char_literal91_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:137:34: '/'
            	            {
            	            char_literal92=(Token)match(input,51,FOLLOW_51_in_multiplicativeExpression1340); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal92_tree = (CymbolAST)adaptor.create(char_literal92);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(char_literal92_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1344);
            	    unaryExpression93=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression93.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:140:1: unaryExpression : (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | op= '&' unaryExpression -> ^( ADDR[$op] unaryExpression ) | op= '*' unaryExpression -> ^( DEREF[$op] unaryExpression ) | postfixExpression );
    public final CymbolParser.unaryExpression_return unaryExpression() throws RecognitionException {
        CymbolParser.unaryExpression_return retval = new CymbolParser.unaryExpression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token op=null;
        CymbolParser.unaryExpression_return unaryExpression94 = null;

        CymbolParser.unaryExpression_return unaryExpression95 = null;

        CymbolParser.unaryExpression_return unaryExpression96 = null;

        CymbolParser.unaryExpression_return unaryExpression97 = null;

        CymbolParser.postfixExpression_return postfixExpression98 = null;


        CymbolAST op_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:141:5: (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | op= '&' unaryExpression -> ^( ADDR[$op] unaryExpression ) | op= '*' unaryExpression -> ^( DEREF[$op] unaryExpression ) | postfixExpression )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt27=1;
                }
                break;
            case 52:
                {
                alt27=2;
                }
                break;
            case 53:
                {
                alt27=3;
                }
                break;
            case 35:
                {
                alt27=4;
                }
                break;
            case ID:
            case INT:
            case FLOAT:
            case CHAR:
            case 31:
            case 57:
            case 58:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:141:9: op= '-' unaryExpression
                    {
                    op=(Token)match(input,50,FOLLOW_50_in_unaryExpression1367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1369);
                    unaryExpression94=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression94.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 141:32: -> ^( UNARY_MINUS[$op] unaryExpression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:141:35: ^( UNARY_MINUS[$op] unaryExpression )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(UNARY_MINUS, op), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:142:9: op= '!' unaryExpression
                    {
                    op=(Token)match(input,52,FOLLOW_52_in_unaryExpression1390); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1392);
                    unaryExpression95=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression95.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 142:32: -> ^( UNARY_NOT[$op] unaryExpression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:142:35: ^( UNARY_NOT[$op] unaryExpression )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(UNARY_NOT, op), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:143:9: op= '&' unaryExpression
                    {
                    op=(Token)match(input,53,FOLLOW_53_in_unaryExpression1413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1415);
                    unaryExpression96=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression96.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 143:32: -> ^( ADDR[$op] unaryExpression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:143:35: ^( ADDR[$op] unaryExpression )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(ADDR, op), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:144:9: op= '*' unaryExpression
                    {
                    op=(Token)match(input,35,FOLLOW_35_in_unaryExpression1436); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1438);
                    unaryExpression97=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression97.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 144:32: -> ^( DEREF[$op] unaryExpression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:144:35: ^( DEREF[$op] unaryExpression )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(DEREF, op), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:145:9: postfixExpression
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1457);
                    postfixExpression98=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression98.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class postfixExpression_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:149:1: postfixExpression : ( primary -> primary ) ( ( '(' expressionList ')' -> ^( CALL[\"CALL\"] $postfixExpression expressionList ) | r= '[' expr ']' -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | r= '->' ID -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID ) ) )* ;
    public final CymbolParser.postfixExpression_return postfixExpression() throws RecognitionException {
        CymbolParser.postfixExpression_return retval = new CymbolParser.postfixExpression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token r=null;
        Token char_literal100=null;
        Token char_literal102=null;
        Token char_literal104=null;
        Token char_literal105=null;
        Token ID106=null;
        Token ID107=null;
        CymbolParser.primary_return primary99 = null;

        CymbolParser.expressionList_return expressionList101 = null;

        CymbolParser.expr_return expr103 = null;


        CymbolAST r_tree=null;
        CymbolAST char_literal100_tree=null;
        CymbolAST char_literal102_tree=null;
        CymbolAST char_literal104_tree=null;
        CymbolAST char_literal105_tree=null;
        CymbolAST ID106_tree=null;
        CymbolAST ID107_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_MEMBER=new RewriteRuleTokenStream(adaptor,"token MEMBER");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:150:5: ( ( primary -> primary ) ( ( '(' expressionList ')' -> ^( CALL[\"CALL\"] $postfixExpression expressionList ) | r= '[' expr ']' -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | r= '->' ID -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID ) ) )* )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:150:9: ( primary -> primary ) ( ( '(' expressionList ')' -> ^( CALL[\"CALL\"] $postfixExpression expressionList ) | r= '[' expr ']' -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | r= '->' ID -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID ) ) )*
            {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:150:9: ( primary -> primary )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:150:10: primary
            {
            pushFollow(FOLLOW_primary_in_postfixExpression1478);
            primary99=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary.add(primary99.getTree());


            // AST REWRITE
            // elements: primary
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CymbolAST)adaptor.nil();
            // 150:17: -> primary
            {
                adaptor.addChild(root_0, stream_primary.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:151:9: ( ( '(' expressionList ')' -> ^( CALL[\"CALL\"] $postfixExpression expressionList ) | r= '[' expr ']' -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | r= '->' ID -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==MEMBER||LA29_0==31||LA29_0==54||LA29_0==56) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:152:13: ( '(' expressionList ')' -> ^( CALL[\"CALL\"] $postfixExpression expressionList ) | r= '[' expr ']' -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | r= '->' ID -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID ) )
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:152:13: ( '(' expressionList ')' -> ^( CALL[\"CALL\"] $postfixExpression expressionList ) | r= '[' expr ']' -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | r= '->' ID -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID ) )
            	    int alt28=4;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case MEMBER:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt28=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:152:17: '(' expressionList ')'
            	            {
            	            char_literal100=(Token)match(input,31,FOLLOW_31_in_postfixExpression1509); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_31.add(char_literal100);

            	            pushFollow(FOLLOW_expressionList_in_postfixExpression1511);
            	            expressionList101=expressionList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expressionList.add(expressionList101.getTree());
            	            char_literal102=(Token)match(input,32,FOLLOW_32_in_postfixExpression1513); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_32.add(char_literal102);



            	            // AST REWRITE
            	            // elements: postfixExpression, expressionList
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            if ( state.backtracking==0 ) {
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (CymbolAST)adaptor.nil();
            	            // 153:17: -> ^( CALL[\"CALL\"] $postfixExpression expressionList )
            	            {
            	                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:153:20: ^( CALL[\"CALL\"] $postfixExpression expressionList )
            	                {
            	                CymbolAST root_1 = (CymbolAST)adaptor.nil();
            	                root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(CALL, "CALL"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_expressionList.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;}
            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:154:17: r= '[' expr ']'
            	            {
            	            r=(Token)match(input,54,FOLLOW_54_in_postfixExpression1561); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_54.add(r);

            	            pushFollow(FOLLOW_expr_in_postfixExpression1563);
            	            expr103=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expr.add(expr103.getTree());
            	            char_literal104=(Token)match(input,55,FOLLOW_55_in_postfixExpression1565); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_55.add(char_literal104);



            	            // AST REWRITE
            	            // elements: expr, postfixExpression
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            if ( state.backtracking==0 ) {
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (CymbolAST)adaptor.nil();
            	            // 155:17: -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) )
            	            {
            	                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:155:20: ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) )
            	                {
            	                CymbolAST root_1 = (CymbolAST)adaptor.nil();
            	                root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(DEREF, r, "*"), root_1);

            	                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:155:36: ^( ADD[\"+\"] $postfixExpression expr )
            	                {
            	                CymbolAST root_2 = (CymbolAST)adaptor.nil();
            	                root_2 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(ADD, "+"), root_2);

            	                adaptor.addChild(root_2, stream_retval.nextTree());
            	                adaptor.addChild(root_2, stream_expr.nextTree());

            	                adaptor.addChild(root_1, root_2);
            	                }

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;}
            	            }
            	            break;
            	        case 3 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:156:17: '.' ID
            	            {
            	            char_literal105=(Token)match(input,MEMBER,FOLLOW_MEMBER_in_postfixExpression1617); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_MEMBER.add(char_literal105);

            	            ID106=(Token)match(input,ID,FOLLOW_ID_in_postfixExpression1619); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_ID.add(ID106);



            	            // AST REWRITE
            	            // elements: postfixExpression, ID, MEMBER
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            if ( state.backtracking==0 ) {
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (CymbolAST)adaptor.nil();
            	            // 157:17: -> ^( '.' $postfixExpression ID )
            	            {
            	                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:157:20: ^( '.' $postfixExpression ID )
            	                {
            	                CymbolAST root_1 = (CymbolAST)adaptor.nil();
            	                root_1 = (CymbolAST)adaptor.becomeRoot(stream_MEMBER.nextNode(), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_ID.nextNode());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;}
            	            }
            	            break;
            	        case 4 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:158:17: r= '->' ID
            	            {
            	            r=(Token)match(input,56,FOLLOW_56_in_postfixExpression1666); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_56.add(r);

            	            ID107=(Token)match(input,ID,FOLLOW_ID_in_postfixExpression1668); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_ID.add(ID107);



            	            // AST REWRITE
            	            // elements: postfixExpression, ID
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            if ( state.backtracking==0 ) {
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (CymbolAST)adaptor.nil();
            	            // 159:17: -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID )
            	            {
            	                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:159:20: ^( MEMBER[$r] ^( DEREF $postfixExpression) ID )
            	                {
            	                CymbolAST root_1 = (CymbolAST)adaptor.nil();
            	                root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(MEMBER, r), root_1);

            	                // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:159:33: ^( DEREF $postfixExpression)
            	                {
            	                CymbolAST root_2 = (CymbolAST)adaptor.nil();
            	                root_2 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(DEREF, "DEREF"), root_2);

            	                adaptor.addChild(root_2, stream_retval.nextTree());

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_ID.nextNode());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;}
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfixExpression"

    public static class primary_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:165:1: primary : ( ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expr ')' -> expr );
    public final CymbolParser.primary_return primary() throws RecognitionException {
        CymbolParser.primary_return retval = new CymbolParser.primary_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token ID108=null;
        Token INT109=null;
        Token FLOAT110=null;
        Token CHAR111=null;
        Token string_literal112=null;
        Token string_literal113=null;
        Token char_literal114=null;
        Token char_literal116=null;
        CymbolParser.expr_return expr115 = null;


        CymbolAST ID108_tree=null;
        CymbolAST INT109_tree=null;
        CymbolAST FLOAT110_tree=null;
        CymbolAST CHAR111_tree=null;
        CymbolAST string_literal112_tree=null;
        CymbolAST string_literal113_tree=null;
        CymbolAST char_literal114_tree=null;
        CymbolAST char_literal116_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:166:5: ( ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expr ')' -> expr )
            int alt30=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt30=1;
                }
                break;
            case INT:
                {
                alt30=2;
                }
                break;
            case FLOAT:
                {
                alt30=3;
                }
                break;
            case CHAR:
                {
                alt30=4;
                }
                break;
            case 57:
                {
                alt30=5;
                }
                break;
            case 58:
                {
                alt30=6;
                }
                break;
            case 31:
                {
                alt30=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:166:9: ID
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    ID108=(Token)match(input,ID,FOLLOW_ID_in_primary1774); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID108_tree = (CymbolAST)adaptor.create(ID108);
                    adaptor.addChild(root_0, ID108_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:167:9: INT
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    INT109=(Token)match(input,INT,FOLLOW_INT_in_primary1784); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT109_tree = (CymbolAST)adaptor.create(INT109);
                    adaptor.addChild(root_0, INT109_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:168:9: FLOAT
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    FLOAT110=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primary1794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT110_tree = (CymbolAST)adaptor.create(FLOAT110);
                    adaptor.addChild(root_0, FLOAT110_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:169:9: CHAR
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    CHAR111=(Token)match(input,CHAR,FOLLOW_CHAR_in_primary1804); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR111_tree = (CymbolAST)adaptor.create(CHAR111);
                    adaptor.addChild(root_0, CHAR111_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:170:9: 'true'
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    string_literal112=(Token)match(input,57,FOLLOW_57_in_primary1814); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal112_tree = (CymbolAST)adaptor.create(string_literal112);
                    adaptor.addChild(root_0, string_literal112_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:171:9: 'false'
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    string_literal113=(Token)match(input,58,FOLLOW_58_in_primary1824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal113_tree = (CymbolAST)adaptor.create(string_literal113);
                    adaptor.addChild(root_0, string_literal113_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:172:9: '(' expr ')'
                    {
                    char_literal114=(Token)match(input,31,FOLLOW_31_in_primary1834); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal114);

                    pushFollow(FOLLOW_expr_in_primary1836);
                    expr115=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr115.getTree());
                    char_literal116=(Token)match(input,32,FOLLOW_32_in_primary1838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal116);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 172:22: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CymbolAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CymbolAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primary"

    // $ANTLR start synpred2_Cymbol
    public final void synpred2_Cymbol_fragment() throws RecognitionException {   
        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:93:9: ( varDeclaration )
        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:93:9: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred2_Cymbol820);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Cymbol

    // $ANTLR start synpred5_Cymbol
    public final void synpred5_Cymbol_fragment() throws RecognitionException {   
        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:97:9: ( lhs '=' expression ';' )
        // /Users/parrt/research/book/TPDSL/Book/code/semantics/oo/Cymbol.g:97:9: lhs '=' expression ';'
        {
        pushFollow(FOLLOW_lhs_in_synpred5_Cymbol906);
        lhs();

        state._fsp--;
        if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred5_Cymbol908); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred5_Cymbol910);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,29,FOLLOW_29_in_synpred5_Cymbol912); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Cymbol

    // Delegated rules

    public final boolean synpred2_Cymbol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Cymbol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Cymbol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Cymbol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\21\uffff";
    static final String DFA16_eofS =
        "\21\uffff";
    static final String DFA16_minS =
        "\1\23\2\uffff\1\0\6\uffff\6\0\1\uffff";
    static final String DFA16_maxS =
        "\1\72\2\uffff\1\0\6\uffff\6\0\1\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\11\uffff\1\6";
    static final String DFA16_specialS =
        "\3\uffff\1\0\6\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\3\1\12\1\13\1\14\4\uffff\1\1\3\uffff\1\17\3\uffff\1\6\5\2"+
            "\1\4\1\uffff\1\5\6\uffff\1\6\1\uffff\2\6\3\uffff\1\15\1\16",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "90:1: statement options {backtrack=true; } : ( block | varDeclaration | 'if' '(' expression ')' s= statement ( 'else' e= statement )? -> ^( 'if' expression $s ( $e)? ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Cymbol()) ) {s = 2;}

                        else if ( (synpred5_Cymbol()) ) {s = 6;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_10 = input.LA(1);

                         
                        int index16_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cymbol()) ) {s = 6;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index16_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_11 = input.LA(1);

                         
                        int index16_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cymbol()) ) {s = 6;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index16_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_12 = input.LA(1);

                         
                        int index16_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cymbol()) ) {s = 6;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index16_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_13 = input.LA(1);

                         
                        int index16_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cymbol()) ) {s = 6;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index16_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_14 = input.LA(1);

                         
                        int index16_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cymbol()) ) {s = 6;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index16_14);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_15 = input.LA(1);

                         
                        int index16_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cymbol()) ) {s = 6;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index16_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit188 = new BitSet(new long[]{0x000001F004080002L});
    public static final BitSet FOLLOW_methodDeclaration_in_compilationUnit192 = new BitSet(new long[]{0x000001F004080002L});
    public static final BitSet FOLLOW_varDeclaration_in_compilationUnit196 = new BitSet(new long[]{0x000001F004080002L});
    public static final BitSet FOLLOW_26_in_classDeclaration226 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_classDeclaration228 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_superClass_in_classDeclaration230 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_classDeclaration233 = new BitSet(new long[]{0x000001F004080000L});
    public static final BitSet FOLLOW_classMember_in_classDeclaration235 = new BitSet(new long[]{0x000001F014080000L});
    public static final BitSet FOLLOW_28_in_classDeclaration238 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_classDeclaration240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_superClass280 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_superClass282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_classMember309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_classMember319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_methodDeclaration342 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_methodDeclaration344 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_methodDeclaration346 = new BitSet(new long[]{0x000001F100080000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration348 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_methodDeclaration351 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_block_in_methodDeclaration353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_formalParameters396 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_formalParameters399 = new BitSet(new long[]{0x000001F000080000L});
    public static final BitSet FOLLOW_parameter_in_formalParameters401 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_type_in_parameter431 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_parameter433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter458 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_parameter460 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parameter462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter486 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parameter488 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_parameter490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_block608 = new BitSet(new long[]{0x06340BF89C780000L});
    public static final BitSet FOLLOW_statement_in_block610 = new BitSet(new long[]{0x06340BF89C780000L});
    public static final BitSet FOLLOW_28_in_block613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration643 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration645 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration648 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_expression_in_varDeclaration650 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_varDeclaration654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration689 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration691 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_varDeclaration693 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration696 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_expression_in_varDeclaration698 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_varDeclaration702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration741 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_varDeclaration743 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration745 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration748 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_expression_in_varDeclaration750 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_varDeclaration754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_statement820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_statement830 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_statement832 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_expression_in_statement834 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_statement836 = new BitSet(new long[]{0x06340BF88C780000L});
    public static final BitSet FOLLOW_statement_in_statement840 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_statement843 = new BitSet(new long[]{0x06340BF88C780000L});
    public static final BitSet FOLLOW_statement_in_statement847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_statement882 = new BitSet(new long[]{0x06340008A0780000L});
    public static final BitSet FOLLOW_expression_in_statement884 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_statement906 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ASSIGN_in_statement908 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_expression_in_statement910 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_statement934 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_lhs972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expressionList999 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_expressionList1002 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_expr_in_expressionList1004 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_expr_in_expression1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_expr1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1091 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_44_in_equalityExpression1095 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_45_in_equalityExpression1100 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1104 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1125 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_46_in_relationalExpression1147 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_47_in_relationalExpression1170 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_48_in_relationalExpression1193 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_49_in_relationalExpression1216 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1253 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1297 = new BitSet(new long[]{0x0004000000020002L});
    public static final BitSet FOLLOW_ADD_in_additiveExpression1301 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_50_in_additiveExpression1306 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1310 = new BitSet(new long[]{0x0004000000020002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1331 = new BitSet(new long[]{0x0008000800000002L});
    public static final BitSet FOLLOW_35_in_multiplicativeExpression1335 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_51_in_multiplicativeExpression1340 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1344 = new BitSet(new long[]{0x0008000800000002L});
    public static final BitSet FOLLOW_50_in_unaryExpression1367 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_unaryExpression1390 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_unaryExpression1413 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_unaryExpression1436 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfixExpression1478 = new BitSet(new long[]{0x0140000080040002L});
    public static final BitSet FOLLOW_31_in_postfixExpression1509 = new BitSet(new long[]{0x0634000980780000L});
    public static final BitSet FOLLOW_expressionList_in_postfixExpression1511 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_postfixExpression1513 = new BitSet(new long[]{0x0140000080040002L});
    public static final BitSet FOLLOW_54_in_postfixExpression1561 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_expr_in_postfixExpression1563 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_postfixExpression1565 = new BitSet(new long[]{0x0140000080040002L});
    public static final BitSet FOLLOW_MEMBER_in_postfixExpression1617 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_postfixExpression1619 = new BitSet(new long[]{0x0140000080040002L});
    public static final BitSet FOLLOW_56_in_postfixExpression1666 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_postfixExpression1668 = new BitSet(new long[]{0x0140000080040002L});
    public static final BitSet FOLLOW_ID_in_primary1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primary1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primary1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_primary1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_primary1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_primary1834 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_expr_in_primary1836 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_primary1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred2_Cymbol820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_synpred5_Cymbol906 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred5_Cymbol908 = new BitSet(new long[]{0x0634000880780000L});
    public static final BitSet FOLLOW_expression_in_synpred5_Cymbol910 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred5_Cymbol912 = new BitSet(new long[]{0x0000000000000002L});

}