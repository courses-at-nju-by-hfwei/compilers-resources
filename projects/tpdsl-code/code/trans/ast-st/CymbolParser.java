/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g 2009-09-23 17:38:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CymbolParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASS_DECL", "METHOD_DECL", "ARG_DECL", "BLOCK", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "UNARY_MINUS", "UNARY_NOT", "ASSIGN", "ADDR", "DEREF", "ADD", "MEMBER", "ID", "INT", "FLOAT", "CHAR", "LETTER", "WS", "SL_COMMENT", "'{'", "'}'", "';'", "':'", "'('", "')'", "','", "'[]'", "'*'", "'float'", "'int'", "'char'", "'boolean'", "'void'", "'if'", "'else'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'-'", "'/'", "'!'", "'&'", "'['", "']'", "'->'", "'true'", "'false'"
    };
    public static final int T__42=42;
    public static final int T__28=28;
    public static final int T__57=57;
    public static final int EXPR=12;
    public static final int T__51=51;
    public static final int T__47=47;
    public static final int FLOAT=22;
    public static final int T__50=50;
    public static final int FIELD_DECL=9;
    public static final int BLOCK=7;
    public static final int T__39=39;
    public static final int T__30=30;
    public static final int T__46=46;
    public static final int T__52=52;
    public static final int UNARY_MINUS=13;
    public static final int INT=21;
    public static final int UNARY_NOT=14;
    public static final int T__27=27;
    public static final int ASSIGN=15;
    public static final int T__49=49;
    public static final int METHOD_DECL=5;
    public static final int T__48=48;
    public static final int T__54=54;
    public static final int MEMBER=19;
    public static final int T__34=34;
    public static final int SL_COMMENT=26;
    public static final int ELIST=11;
    public static final int T__56=56;
    public static final int ID=20;
    public static final int LETTER=24;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int ARG_DECL=6;
    public static final int WS=25;
    public static final int CHAR=23;
    public static final int T__58=58;
    public static final int T__44=44;
    public static final int T__33=33;
    public static final int T__29=29;
    public static final int T__45=45;
    public static final int T__55=55;
    public static final int CLASS_DECL=4;
    public static final int ADDR=16;
    public static final int T__43=43;
    public static final int T__31=31;
    public static final int T__40=40;
    public static final int EOF=-1;
    public static final int T__53=53;
    public static final int T__32=32;
    public static final int T__38=38;
    public static final int CALL=10;
    public static final int T__37=37;
    public static final int DEREF=17;
    public static final int VAR_DECL=8;
    public static final int ADD=18;
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
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g"; }


    public static class compilationUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:26:1: compilationUnit : ( classDeclaration | methodDeclaration | varDeclaration )+ ;
    public final CymbolParser.compilationUnit_return compilationUnit() throws RecognitionException {
        CymbolParser.compilationUnit_return retval = new CymbolParser.compilationUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CymbolParser.classDeclaration_return classDeclaration1 = null;

        CymbolParser.methodDeclaration_return methodDeclaration2 = null;

        CymbolParser.varDeclaration_return varDeclaration3 = null;



        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:28:5: ( ( classDeclaration | methodDeclaration | varDeclaration )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:28:9: ( classDeclaration | methodDeclaration | varDeclaration )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:28:9: ( classDeclaration | methodDeclaration | varDeclaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case CLASS_DECL:
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
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:28:13: classDeclaration
            	    {
            	    pushFollow(FOLLOW_classDeclaration_in_compilationUnit193);
            	    classDeclaration1=classDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:28:32: methodDeclaration
            	    {
            	    pushFollow(FOLLOW_methodDeclaration_in_compilationUnit197);
            	    methodDeclaration2=methodDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration2.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:28:52: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_compilationUnit201);
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              ((CommonTree)retval.tree).setUnknownTokenBoundaries();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compilationUnit"

    public static class classDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:32:1: classDeclaration : 'class' ID ( superClass )? '{' ( classMember )+ '}' ';' -> ^( 'class' ID ( superClass )? ( classMember )+ ) ;
    public final CymbolParser.classDeclaration_return classDeclaration() throws RecognitionException {
        CymbolParser.classDeclaration_return retval = new CymbolParser.classDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal4=null;
        Token ID5=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token char_literal10=null;
        CymbolParser.superClass_return superClass6 = null;

        CymbolParser.classMember_return classMember8 = null;


        CommonTree string_literal4_tree=null;
        CommonTree ID5_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree char_literal9_tree=null;
        CommonTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_CLASS_DECL=new RewriteRuleTokenStream(adaptor,"token CLASS_DECL");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        RewriteRuleSubtreeStream stream_superClass=new RewriteRuleSubtreeStream(adaptor,"rule superClass");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:33:5: ( 'class' ID ( superClass )? '{' ( classMember )+ '}' ';' -> ^( 'class' ID ( superClass )? ( classMember )+ ) )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:33:9: 'class' ID ( superClass )? '{' ( classMember )+ '}' ';'
            {
            string_literal4=(Token)match(input,CLASS_DECL,FOLLOW_CLASS_DECL_in_classDeclaration231); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS_DECL.add(string_literal4);

            ID5=(Token)match(input,ID,FOLLOW_ID_in_classDeclaration233); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID5);

            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:33:20: ( superClass )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:33:20: superClass
                    {
                    pushFollow(FOLLOW_superClass_in_classDeclaration235);
                    superClass6=superClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_superClass.add(superClass6.getTree());

                    }
                    break;

            }

            char_literal7=(Token)match(input,27,FOLLOW_27_in_classDeclaration238); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal7);

            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:33:36: ( classMember )+
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
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:33:36: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classDeclaration240);
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

            char_literal9=(Token)match(input,28,FOLLOW_28_in_classDeclaration243); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal9);

            char_literal10=(Token)match(input,29,FOLLOW_29_in_classDeclaration245); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal10);



            // AST REWRITE
            // elements: superClass, classMember, CLASS_DECL, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 34:9: -> ^( 'class' ID ( superClass )? ( classMember )+ )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:34:12: ^( 'class' ID ( superClass )? ( classMember )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CLASS_DECL.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:34:25: ( superClass )?
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"

    public static class superClass_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "superClass"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:36:1: superClass : ':' ID -> ^( ':' ID ) ;
    public final CymbolParser.superClass_return superClass() throws RecognitionException {
        CymbolParser.superClass_return retval = new CymbolParser.superClass_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal11=null;
        Token ID12=null;

        CommonTree char_literal11_tree=null;
        CommonTree ID12_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:37:5: ( ':' ID -> ^( ':' ID ) )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:37:9: ':' ID
            {
            char_literal11=(Token)match(input,30,FOLLOW_30_in_superClass285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(char_literal11);

            ID12=(Token)match(input,ID,FOLLOW_ID_in_superClass287); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID12);



            // AST REWRITE
            // elements: ID, 30
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 37:16: -> ^( ':' ID )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:37:19: ^( ':' ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_30.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "superClass"

    public static class classMember_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMember"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:40:1: classMember : ( varDeclaration | methodDeclaration );
    public final CymbolParser.classMember_return classMember() throws RecognitionException {
        CymbolParser.classMember_return retval = new CymbolParser.classMember_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CymbolParser.varDeclaration_return varDeclaration13 = null;

        CymbolParser.methodDeclaration_return methodDeclaration14 = null;



        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:41:5: ( varDeclaration | methodDeclaration )
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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:41:9: varDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_classMember314);
                    varDeclaration13=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration13.getTree());

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:42:9: methodDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_methodDeclaration_in_classMember324);
                    methodDeclaration14=methodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration14.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classMember"

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:46:1: methodDeclaration : type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) ;
    public final CymbolParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        CymbolParser.methodDeclaration_return retval = new CymbolParser.methodDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID16=null;
        Token char_literal17=null;
        Token char_literal19=null;
        CymbolParser.type_return type15 = null;

        CymbolParser.formalParameters_return formalParameters18 = null;

        CymbolParser.block_return block20 = null;


        CommonTree ID16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree char_literal19_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:47:5: ( type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:47:9: type ID '(' ( formalParameters )? ')' block
            {
            pushFollow(FOLLOW_type_in_methodDeclaration347);
            type15=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type15.getTree());
            ID16=(Token)match(input,ID,FOLLOW_ID_in_methodDeclaration349); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID16);

            char_literal17=(Token)match(input,31,FOLLOW_31_in_methodDeclaration351); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_31.add(char_literal17);

            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:47:21: ( formalParameters )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID||(LA5_0>=36 && LA5_0<=40)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:47:21: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration353);
                    formalParameters18=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters18.getTree());

                    }
                    break;

            }

            char_literal19=(Token)match(input,32,FOLLOW_32_in_methodDeclaration356); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal19);

            pushFollow(FOLLOW_block_in_methodDeclaration358);
            block20=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block20.getTree());


            // AST REWRITE
            // elements: ID, block, type, formalParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 48:9: -> ^( METHOD_DECL type ID ( formalParameters )? block )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:48:12: ^( METHOD_DECL type ID ( formalParameters )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:48:34: ( formalParameters )?
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodDeclaration"

    public static class formalParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:52:1: formalParameters : parameter ( ',' parameter )* -> ( parameter )+ ;
    public final CymbolParser.formalParameters_return formalParameters() throws RecognitionException {
        CymbolParser.formalParameters_return retval = new CymbolParser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal22=null;
        CymbolParser.parameter_return parameter21 = null;

        CymbolParser.parameter_return parameter23 = null;


        CommonTree char_literal22_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:53:5: ( parameter ( ',' parameter )* -> ( parameter )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:53:9: parameter ( ',' parameter )*
            {
            pushFollow(FOLLOW_parameter_in_formalParameters401);
            parameter21=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(parameter21.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:53:19: ( ',' parameter )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:53:20: ',' parameter
            	    {
            	    char_literal22=(Token)match(input,33,FOLLOW_33_in_formalParameters404); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_33.add(char_literal22);

            	    pushFollow(FOLLOW_parameter_in_formalParameters406);
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

            root_0 = (CommonTree)adaptor.nil();
            // 53:36: -> ( parameter )+
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class parameter_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:56:1: parameter : ( type ID -> ^( ARG_DECL type ID ) | type ID '[]' -> ^( ARG_DECL ^( '*' type ) ID ) | type '*' ID -> ^( ARG_DECL ^( '*' type ) ID ) );
    public final CymbolParser.parameter_return parameter() throws RecognitionException {
        CymbolParser.parameter_return retval = new CymbolParser.parameter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID25=null;
        Token ID27=null;
        Token string_literal28=null;
        Token char_literal30=null;
        Token ID31=null;
        CymbolParser.type_return type24 = null;

        CymbolParser.type_return type26 = null;

        CymbolParser.type_return type29 = null;


        CommonTree ID25_tree=null;
        CommonTree ID27_tree=null;
        CommonTree string_literal28_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree ID31_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:57:5: ( type ID -> ^( ARG_DECL type ID ) | type ID '[]' -> ^( ARG_DECL ^( '*' type ) ID ) | type '*' ID -> ^( ARG_DECL ^( '*' type ) ID ) )
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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:57:9: type ID
                    {
                    pushFollow(FOLLOW_type_in_parameter436);
                    type24=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type24.getTree());
                    ID25=(Token)match(input,ID,FOLLOW_ID_in_parameter438); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID25);



                    // AST REWRITE
                    // elements: type, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 57:22: -> ^( ARG_DECL type ID )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:57:25: ^( ARG_DECL type ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:58:9: type ID '[]'
                    {
                    pushFollow(FOLLOW_type_in_parameter463);
                    type26=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type26.getTree());
                    ID27=(Token)match(input,ID,FOLLOW_ID_in_parameter465); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID27);

                    string_literal28=(Token)match(input,34,FOLLOW_34_in_parameter467); if (state.failed) return retval; 
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

                    root_0 = (CommonTree)adaptor.nil();
                    // 58:22: -> ^( ARG_DECL ^( '*' type ) ID )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:58:25: ^( ARG_DECL ^( '*' type ) ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:58:36: ^( '*' type )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(35, "35"), root_2);

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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:59:9: type '*' ID
                    {
                    pushFollow(FOLLOW_type_in_parameter491);
                    type29=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type29.getTree());
                    char_literal30=(Token)match(input,35,FOLLOW_35_in_parameter493); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal30);

                    ID31=(Token)match(input,ID,FOLLOW_ID_in_parameter495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID31);



                    // AST REWRITE
                    // elements: 35, ID, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 59:22: -> ^( ARG_DECL ^( '*' type ) ID )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:59:25: ^( ARG_DECL ^( '*' type ) ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:59:36: ^( '*' type )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_35.nextNode(), root_2);

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:62:1: type : ( primitiveType | ID );
    public final CymbolParser.type_return type() throws RecognitionException {
        CymbolParser.type_return retval = new CymbolParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID33=null;
        CymbolParser.primitiveType_return primitiveType32 = null;


        CommonTree ID33_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:62:5: ( primitiveType | ID )
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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:62:9: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type524);
                    primitiveType32=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType32.getTree());

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:63:9: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ID33=(Token)match(input,ID,FOLLOW_ID_in_type534); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID33_tree = (CommonTree)adaptor.create(ID33);
                    adaptor.addChild(root_0, ID33_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class primitiveType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:66:1: primitiveType : ( 'float' | 'int' | 'char' | 'boolean' | 'void' );
    public final CymbolParser.primitiveType_return primitiveType() throws RecognitionException {
        CymbolParser.primitiveType_return retval = new CymbolParser.primitiveType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set34=null;

        CommonTree set34_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:67:5: ( 'float' | 'int' | 'char' | 'boolean' | 'void' )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set34=(Token)input.LT(1);
            if ( (input.LA(1)>=36 && input.LA(1)<=40) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set34));
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:75:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final CymbolParser.block_return block() throws RecognitionException {
        CymbolParser.block_return retval = new CymbolParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal35=null;
        Token char_literal37=null;
        CymbolParser.statement_return statement36 = null;


        CommonTree char_literal35_tree=null;
        CommonTree char_literal37_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:76:5: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:76:9: '{' ( statement )* '}'
            {
            char_literal35=(Token)match(input,27,FOLLOW_27_in_block613); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal35);

            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:76:13: ( statement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=ID && LA9_0<=CHAR)||LA9_0==27||LA9_0==31||(LA9_0>=35 && LA9_0<=41)||LA9_0==43||LA9_0==50||(LA9_0>=52 && LA9_0<=53)||(LA9_0>=57 && LA9_0<=58)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:76:13: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block615);
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

            char_literal37=(Token)match(input,28,FOLLOW_28_in_block618); if (state.failed) return retval; 
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

            root_0 = (CommonTree)adaptor.nil();
            // 76:28: -> ^( BLOCK ( statement )* )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:76:31: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:76:39: ( statement )*
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class varDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:81:1: varDeclaration : ( type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) | type ID '[]' ( '=' expression )? ';' -> ^( VAR_DECL ^( '*' type ) ID ( expression )? ) | type '*' ID ( '=' expression )? ';' -> ^( VAR_DECL ^( '*' type ) ID ( expression )? ) );
    public final CymbolParser.varDeclaration_return varDeclaration() throws RecognitionException {
        CymbolParser.varDeclaration_return retval = new CymbolParser.varDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree ID39_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree ID44_tree=null;
        CommonTree string_literal45_tree=null;
        CommonTree char_literal46_tree=null;
        CommonTree char_literal48_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree ID51_tree=null;
        CommonTree char_literal52_tree=null;
        CommonTree char_literal54_tree=null;
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:82:5: ( type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) | type ID '[]' ( '=' expression )? ';' -> ^( VAR_DECL ^( '*' type ) ID ( expression )? ) | type '*' ID ( '=' expression )? ';' -> ^( VAR_DECL ^( '*' type ) ID ( expression )? ) )
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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:82:9: type ID ( '=' expression )? ';'
                    {
                    pushFollow(FOLLOW_type_in_varDeclaration648);
                    type38=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type38.getTree());
                    ID39=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration650); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID39);

                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:82:17: ( '=' expression )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ASSIGN) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:82:18: '=' expression
                            {
                            char_literal40=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration653); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal40);

                            pushFollow(FOLLOW_expression_in_varDeclaration655);
                            expression41=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression41.getTree());

                            }
                            break;

                    }

                    char_literal42=(Token)match(input,29,FOLLOW_29_in_varDeclaration659); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal42);



                    // AST REWRITE
                    // elements: type, expression, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:30: -> ^( VAR_DECL type ID ( expression )? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:83:33: ^( VAR_DECL type ID ( expression )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:83:52: ( expression )?
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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:84:9: type ID '[]' ( '=' expression )? ';'
                    {
                    pushFollow(FOLLOW_type_in_varDeclaration711);
                    type43=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type43.getTree());
                    ID44=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID44);

                    string_literal45=(Token)match(input,34,FOLLOW_34_in_varDeclaration715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(string_literal45);

                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:84:22: ( '=' expression )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ASSIGN) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:84:23: '=' expression
                            {
                            char_literal46=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration718); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal46);

                            pushFollow(FOLLOW_expression_in_varDeclaration720);
                            expression47=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression47.getTree());

                            }
                            break;

                    }

                    char_literal48=(Token)match(input,29,FOLLOW_29_in_varDeclaration724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal48);



                    // AST REWRITE
                    // elements: ID, type, 35, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 85:30: -> ^( VAR_DECL ^( '*' type ) ID ( expression )? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:85:33: ^( VAR_DECL ^( '*' type ) ID ( expression )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:85:44: ^( '*' type )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(35, "35"), root_2);

                        adaptor.addChild(root_2, stream_type.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:85:59: ( expression )?
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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:86:9: type '*' ID ( '=' expression )? ';'
                    {
                    pushFollow(FOLLOW_type_in_varDeclaration780);
                    type49=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type49.getTree());
                    char_literal50=(Token)match(input,35,FOLLOW_35_in_varDeclaration782); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal50);

                    ID51=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID51);

                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:86:21: ( '=' expression )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ASSIGN) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:86:22: '=' expression
                            {
                            char_literal52=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration787); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal52);

                            pushFollow(FOLLOW_expression_in_varDeclaration789);
                            expression53=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression53.getTree());

                            }
                            break;

                    }

                    char_literal54=(Token)match(input,29,FOLLOW_29_in_varDeclaration793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal54);



                    // AST REWRITE
                    // elements: expression, 35, ID, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 87:30: -> ^( VAR_DECL ^( '*' type ) ID ( expression )? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:87:33: ^( VAR_DECL ^( '*' type ) ID ( expression )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:87:44: ^( '*' type )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_35.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_type.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:87:59: ( expression )?
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDeclaration"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:91:1: statement options {backtrack=true; } : ( block | varDeclaration | 'if' '(' expression ')' s= statement ( 'else' e= statement )? -> ^( 'if' expression $s ( $e)? ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) );
    public final CymbolParser.statement_return statement() throws RecognitionException {
        CymbolParser.statement_return retval = new CymbolParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree string_literal57_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree string_literal61_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree char_literal64_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree char_literal69_tree=null;
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
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:93:5: ( block | varDeclaration | 'if' '(' expression ')' s= statement ( 'else' e= statement )? -> ^( 'if' expression $s ( $e)? ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) )
            int alt16=6;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:93:9: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement866);
                    block55=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block55.getTree());

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:94:9: varDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_statement876);
                    varDeclaration56=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration56.getTree());

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:95:9: 'if' '(' expression ')' s= statement ( 'else' e= statement )?
                    {
                    string_literal57=(Token)match(input,41,FOLLOW_41_in_statement886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal57);

                    char_literal58=(Token)match(input,31,FOLLOW_31_in_statement888); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal58);

                    pushFollow(FOLLOW_expression_in_statement890);
                    expression59=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());
                    char_literal60=(Token)match(input,32,FOLLOW_32_in_statement892); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(char_literal60);

                    pushFollow(FOLLOW_statement_in_statement896);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s.getTree());
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:95:45: ( 'else' e= statement )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==42) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:95:46: 'else' e= statement
                            {
                            string_literal61=(Token)match(input,42,FOLLOW_42_in_statement899); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_42.add(string_literal61);

                            pushFollow(FOLLOW_statement_in_statement903);
                            e=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(e.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 41, expression, e, s
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

                    root_0 = (CommonTree)adaptor.nil();
                    // 96:9: -> ^( 'if' expression $s ( $e)? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:96:12: ^( 'if' expression $s ( $e)? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_41.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_s.nextTree());
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:96:33: ( $e)?
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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:97:9: 'return' ( expression )? ';'
                    {
                    string_literal62=(Token)match(input,43,FOLLOW_43_in_statement938); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_43.add(string_literal62);

                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:97:18: ( expression )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=ID && LA15_0<=CHAR)||LA15_0==31||LA15_0==35||LA15_0==50||(LA15_0>=52 && LA15_0<=53)||(LA15_0>=57 && LA15_0<=58)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:97:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement940);
                            expression63=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression63.getTree());

                            }
                            break;

                    }

                    char_literal64=(Token)match(input,29,FOLLOW_29_in_statement943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal64);



                    // AST REWRITE
                    // elements: expression, 43
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 97:34: -> ^( 'return' ( expression )? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:97:37: ^( 'return' ( expression )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_43.nextNode(), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:97:48: ( expression )?
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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:98:9: lhs '=' expression ';'
                    {
                    pushFollow(FOLLOW_lhs_in_statement962);
                    lhs65=lhs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lhs.add(lhs65.getTree());
                    char_literal66=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement964); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal66);

                    pushFollow(FOLLOW_expression_in_statement966);
                    expression67=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression67.getTree());
                    char_literal68=(Token)match(input,29,FOLLOW_29_in_statement968); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal68);



                    // AST REWRITE
                    // elements: lhs, expression, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 98:32: -> ^( '=' lhs expression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:98:35: ^( '=' lhs expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_lhs.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:99:9: a= postfixExpression ';'
                    {
                    pushFollow(FOLLOW_postfixExpression_in_statement990);
                    a=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfixExpression.add(a.getTree());
                    char_literal69=(Token)match(input,29,FOLLOW_29_in_statement992); if (state.failed) return retval; 
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

                    root_0 = (CommonTree)adaptor.nil();
                    // 100:13: -> ^( EXPR postfixExpression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:100:16: ^( EXPR postfixExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class lhs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lhs"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:103:1: lhs : unaryExpression -> ^( EXPR unaryExpression ) ;
    public final CymbolParser.lhs_return lhs() throws RecognitionException {
        CymbolParser.lhs_return retval = new CymbolParser.lhs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CymbolParser.unaryExpression_return unaryExpression70 = null;


        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:103:5: ( unaryExpression -> ^( EXPR unaryExpression ) )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:103:9: unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_lhs1028);
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

            root_0 = (CommonTree)adaptor.nil();
            // 103:25: -> ^( EXPR unaryExpression )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:103:28: ^( EXPR unaryExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

                adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lhs"

    public static class expressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:105:1: expressionList : ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST );
    public final CymbolParser.expressionList_return expressionList() throws RecognitionException {
        CymbolParser.expressionList_return retval = new CymbolParser.expressionList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal72=null;
        CymbolParser.expr_return expr71 = null;

        CymbolParser.expr_return expr73 = null;


        CommonTree char_literal72_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:106:5: ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST )
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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:106:9: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_expressionList1055);
                    expr71=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr71.getTree());
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:106:14: ( ',' expr )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==33) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:106:15: ',' expr
                    	    {
                    	    char_literal72=(Token)match(input,33,FOLLOW_33_in_expressionList1058); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_33.add(char_literal72);

                    	    pushFollow(FOLLOW_expr_in_expressionList1060);
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

                    root_0 = (CommonTree)adaptor.nil();
                    // 106:26: -> ^( ELIST ( expr )+ )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:106:29: ^( ELIST ( expr )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELIST, "ELIST"), root_1);

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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:107:9: 
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

                    root_0 = (CommonTree)adaptor.nil();
                    // 107:9: -> ELIST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ELIST, "ELIST"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:110:1: expression : expr -> ^( EXPR expr ) ;
    public final CymbolParser.expression_return expression() throws RecognitionException {
        CymbolParser.expression_return retval = new CymbolParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CymbolParser.expr_return expr74 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:111:5: ( expr -> ^( EXPR expr ) )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:111:9: expr
            {
            pushFollow(FOLLOW_expr_in_expression1102);
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

            root_0 = (CommonTree)adaptor.nil();
            // 111:14: -> ^( EXPR expr )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:111:17: ^( EXPR expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:114:1: expr : equalityExpression ;
    public final CymbolParser.expr_return expr() throws RecognitionException {
        CymbolParser.expr_return retval = new CymbolParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CymbolParser.equalityExpression_return equalityExpression75 = null;



        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:114:5: ( equalityExpression )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:114:9: equalityExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_expr1124);
            equalityExpression75=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression75.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:117:1: equalityExpression : relationalExpression ( ( '!=' | '==' ) relationalExpression )* ;
    public final CymbolParser.equalityExpression_return equalityExpression() throws RecognitionException {
        CymbolParser.equalityExpression_return retval = new CymbolParser.equalityExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal77=null;
        Token string_literal78=null;
        CymbolParser.relationalExpression_return relationalExpression76 = null;

        CymbolParser.relationalExpression_return relationalExpression79 = null;


        CommonTree string_literal77_tree=null;
        CommonTree string_literal78_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:118:5: ( relationalExpression ( ( '!=' | '==' ) relationalExpression )* )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:118:9: relationalExpression ( ( '!=' | '==' ) relationalExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1147);
            relationalExpression76=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression76.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:118:30: ( ( '!=' | '==' ) relationalExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=44 && LA20_0<=45)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:118:31: ( '!=' | '==' ) relationalExpression
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:118:31: ( '!=' | '==' )
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
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:118:32: '!='
            	            {
            	            string_literal77=(Token)match(input,44,FOLLOW_44_in_equalityExpression1151); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal77_tree = (CommonTree)adaptor.create(string_literal77);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal77_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:118:40: '=='
            	            {
            	            string_literal78=(Token)match(input,45,FOLLOW_45_in_equalityExpression1156); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal78_tree = (CommonTree)adaptor.create(string_literal78);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal78_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1160);
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:121:1: relationalExpression : additiveExpression ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* ) ;
    public final CymbolParser.relationalExpression_return relationalExpression() throws RecognitionException {
        CymbolParser.relationalExpression_return retval = new CymbolParser.relationalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal81=null;
        Token char_literal82=null;
        Token string_literal83=null;
        Token string_literal84=null;
        CymbolParser.additiveExpression_return additiveExpression80 = null;

        CymbolParser.additiveExpression_return additiveExpression85 = null;


        CommonTree char_literal81_tree=null;
        CommonTree char_literal82_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree string_literal84_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:122:5: ( additiveExpression ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* ) )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:122:9: additiveExpression ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1181);
            additiveExpression80=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression80.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:123:9: ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:123:13: ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:123:13: ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=46 && LA22_0<=49)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:123:17: ( '<' | '>' | '<=' | '>=' ) additiveExpression
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:123:17: ( '<' | '>' | '<=' | '>=' )
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
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:123:21: '<'
            	            {
            	            char_literal81=(Token)match(input,46,FOLLOW_46_in_relationalExpression1203); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal81_tree = (CommonTree)adaptor.create(char_literal81);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal81_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:124:21: '>'
            	            {
            	            char_literal82=(Token)match(input,47,FOLLOW_47_in_relationalExpression1226); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal82_tree = (CommonTree)adaptor.create(char_literal82);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal82_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:125:21: '<='
            	            {
            	            string_literal83=(Token)match(input,48,FOLLOW_48_in_relationalExpression1249); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal83_tree = (CommonTree)adaptor.create(string_literal83);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal83_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:126:21: '>='
            	            {
            	            string_literal84=(Token)match(input,49,FOLLOW_49_in_relationalExpression1272); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal84_tree = (CommonTree)adaptor.create(string_literal84);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal84_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1309);
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:133:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final CymbolParser.additiveExpression_return additiveExpression() throws RecognitionException {
        CymbolParser.additiveExpression_return retval = new CymbolParser.additiveExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal87=null;
        Token char_literal88=null;
        CymbolParser.multiplicativeExpression_return multiplicativeExpression86 = null;

        CymbolParser.multiplicativeExpression_return multiplicativeExpression89 = null;


        CommonTree char_literal87_tree=null;
        CommonTree char_literal88_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:134:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:134:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1353);
            multiplicativeExpression86=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression86.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:134:34: ( ( '+' | '-' ) multiplicativeExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ADD||LA24_0==50) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:134:35: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:134:35: ( '+' | '-' )
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
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:134:36: '+'
            	            {
            	            char_literal87=(Token)match(input,ADD,FOLLOW_ADD_in_additiveExpression1357); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal87_tree = (CommonTree)adaptor.create(char_literal87);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal87_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:134:43: '-'
            	            {
            	            char_literal88=(Token)match(input,50,FOLLOW_50_in_additiveExpression1362); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal88_tree = (CommonTree)adaptor.create(char_literal88);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal88_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1366);
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:137:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' ) unaryExpression )* ;
    public final CymbolParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        CymbolParser.multiplicativeExpression_return retval = new CymbolParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal91=null;
        Token char_literal92=null;
        CymbolParser.unaryExpression_return unaryExpression90 = null;

        CymbolParser.unaryExpression_return unaryExpression93 = null;


        CommonTree char_literal91_tree=null;
        CommonTree char_literal92_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:138:5: ( unaryExpression ( ( '*' | '/' ) unaryExpression )* )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:138:9: unaryExpression ( ( '*' | '/' ) unaryExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1387);
            unaryExpression90=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression90.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:138:25: ( ( '*' | '/' ) unaryExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35||LA26_0==51) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:138:26: ( '*' | '/' ) unaryExpression
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:138:26: ( '*' | '/' )
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
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:138:27: '*'
            	            {
            	            char_literal91=(Token)match(input,35,FOLLOW_35_in_multiplicativeExpression1391); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal91_tree = (CommonTree)adaptor.create(char_literal91);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal91_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:138:34: '/'
            	            {
            	            char_literal92=(Token)match(input,51,FOLLOW_51_in_multiplicativeExpression1396); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal92_tree = (CommonTree)adaptor.create(char_literal92);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal92_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1400);
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:141:1: unaryExpression : (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | op= '&' unaryExpression -> ^( ADDR[$op] unaryExpression ) | op= '*' unaryExpression -> ^( DEREF[$op] unaryExpression ) | postfixExpression );
    public final CymbolParser.unaryExpression_return unaryExpression() throws RecognitionException {
        CymbolParser.unaryExpression_return retval = new CymbolParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        CymbolParser.unaryExpression_return unaryExpression94 = null;

        CymbolParser.unaryExpression_return unaryExpression95 = null;

        CymbolParser.unaryExpression_return unaryExpression96 = null;

        CymbolParser.unaryExpression_return unaryExpression97 = null;

        CymbolParser.postfixExpression_return postfixExpression98 = null;


        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:142:5: (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | op= '&' unaryExpression -> ^( ADDR[$op] unaryExpression ) | op= '*' unaryExpression -> ^( DEREF[$op] unaryExpression ) | postfixExpression )
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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:142:9: op= '-' unaryExpression
                    {
                    op=(Token)match(input,50,FOLLOW_50_in_unaryExpression1423); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1425);
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

                    root_0 = (CommonTree)adaptor.nil();
                    // 142:32: -> ^( UNARY_MINUS[$op] unaryExpression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:142:35: ^( UNARY_MINUS[$op] unaryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_MINUS, op), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:143:9: op= '!' unaryExpression
                    {
                    op=(Token)match(input,52,FOLLOW_52_in_unaryExpression1446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1448);
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

                    root_0 = (CommonTree)adaptor.nil();
                    // 143:32: -> ^( UNARY_NOT[$op] unaryExpression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:143:35: ^( UNARY_NOT[$op] unaryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_NOT, op), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:144:9: op= '&' unaryExpression
                    {
                    op=(Token)match(input,53,FOLLOW_53_in_unaryExpression1469); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1471);
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

                    root_0 = (CommonTree)adaptor.nil();
                    // 144:32: -> ^( ADDR[$op] unaryExpression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:144:35: ^( ADDR[$op] unaryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ADDR, op), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:145:9: op= '*' unaryExpression
                    {
                    op=(Token)match(input,35,FOLLOW_35_in_unaryExpression1492); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1494);
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

                    root_0 = (CommonTree)adaptor.nil();
                    // 145:32: -> ^( DEREF[$op] unaryExpression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:145:35: ^( DEREF[$op] unaryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEREF, op), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:146:9: postfixExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1513);
                    postfixExpression98=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression98.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class postfixExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:150:1: postfixExpression : ( primary -> primary ) ( ( '(' expressionList ')' -> ^( CALL[\"CALL\"] $postfixExpression expressionList ) | r= '[' expr ']' -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | r= '->' ID -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID ) ) )* ;
    public final CymbolParser.postfixExpression_return postfixExpression() throws RecognitionException {
        CymbolParser.postfixExpression_return retval = new CymbolParser.postfixExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree r_tree=null;
        CommonTree char_literal100_tree=null;
        CommonTree char_literal102_tree=null;
        CommonTree char_literal104_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree ID106_tree=null;
        CommonTree ID107_tree=null;
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
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:151:5: ( ( primary -> primary ) ( ( '(' expressionList ')' -> ^( CALL[\"CALL\"] $postfixExpression expressionList ) | r= '[' expr ']' -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | r= '->' ID -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID ) ) )* )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:151:9: ( primary -> primary ) ( ( '(' expressionList ')' -> ^( CALL[\"CALL\"] $postfixExpression expressionList ) | r= '[' expr ']' -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | r= '->' ID -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID ) ) )*
            {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:151:9: ( primary -> primary )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:151:10: primary
            {
            pushFollow(FOLLOW_primary_in_postfixExpression1534);
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

            root_0 = (CommonTree)adaptor.nil();
            // 151:17: -> primary
            {
                adaptor.addChild(root_0, stream_primary.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:152:9: ( ( '(' expressionList ')' -> ^( CALL[\"CALL\"] $postfixExpression expressionList ) | r= '[' expr ']' -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | r= '->' ID -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==MEMBER||LA29_0==31||LA29_0==54||LA29_0==56) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:153:13: ( '(' expressionList ')' -> ^( CALL[\"CALL\"] $postfixExpression expressionList ) | r= '[' expr ']' -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | r= '->' ID -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID ) )
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:153:13: ( '(' expressionList ')' -> ^( CALL[\"CALL\"] $postfixExpression expressionList ) | r= '[' expr ']' -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) ) | '.' ID -> ^( '.' $postfixExpression ID ) | r= '->' ID -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID ) )
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
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:153:17: '(' expressionList ')'
            	            {
            	            char_literal100=(Token)match(input,31,FOLLOW_31_in_postfixExpression1565); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_31.add(char_literal100);

            	            pushFollow(FOLLOW_expressionList_in_postfixExpression1567);
            	            expressionList101=expressionList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expressionList.add(expressionList101.getTree());
            	            char_literal102=(Token)match(input,32,FOLLOW_32_in_postfixExpression1569); if (state.failed) return retval; 
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

            	            root_0 = (CommonTree)adaptor.nil();
            	            // 154:17: -> ^( CALL[\"CALL\"] $postfixExpression expressionList )
            	            {
            	                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:154:20: ^( CALL[\"CALL\"] $postfixExpression expressionList )
            	                {
            	                CommonTree root_1 = (CommonTree)adaptor.nil();
            	                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_expressionList.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;}
            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:155:17: r= '[' expr ']'
            	            {
            	            r=(Token)match(input,54,FOLLOW_54_in_postfixExpression1617); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_54.add(r);

            	            pushFollow(FOLLOW_expr_in_postfixExpression1619);
            	            expr103=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expr.add(expr103.getTree());
            	            char_literal104=(Token)match(input,55,FOLLOW_55_in_postfixExpression1621); if (state.failed) return retval; 
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

            	            root_0 = (CommonTree)adaptor.nil();
            	            // 156:17: -> ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) )
            	            {
            	                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:156:20: ^( DEREF[$r,\"*\"] ^( ADD[\"+\"] $postfixExpression expr ) )
            	                {
            	                CommonTree root_1 = (CommonTree)adaptor.nil();
            	                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEREF, r, "*"), root_1);

            	                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:156:36: ^( ADD[\"+\"] $postfixExpression expr )
            	                {
            	                CommonTree root_2 = (CommonTree)adaptor.nil();
            	                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ADD, "+"), root_2);

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
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:157:17: '.' ID
            	            {
            	            char_literal105=(Token)match(input,MEMBER,FOLLOW_MEMBER_in_postfixExpression1673); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_MEMBER.add(char_literal105);

            	            ID106=(Token)match(input,ID,FOLLOW_ID_in_postfixExpression1675); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_ID.add(ID106);



            	            // AST REWRITE
            	            // elements: MEMBER, postfixExpression, ID
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            if ( state.backtracking==0 ) {
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (CommonTree)adaptor.nil();
            	            // 158:17: -> ^( '.' $postfixExpression ID )
            	            {
            	                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:158:20: ^( '.' $postfixExpression ID )
            	                {
            	                CommonTree root_1 = (CommonTree)adaptor.nil();
            	                root_1 = (CommonTree)adaptor.becomeRoot(stream_MEMBER.nextNode(), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_ID.nextNode());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;}
            	            }
            	            break;
            	        case 4 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:159:17: r= '->' ID
            	            {
            	            r=(Token)match(input,56,FOLLOW_56_in_postfixExpression1722); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_56.add(r);

            	            ID107=(Token)match(input,ID,FOLLOW_ID_in_postfixExpression1724); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_ID.add(ID107);



            	            // AST REWRITE
            	            // elements: ID, postfixExpression
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            if ( state.backtracking==0 ) {
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (CommonTree)adaptor.nil();
            	            // 160:17: -> ^( MEMBER[$r] ^( DEREF $postfixExpression) ID )
            	            {
            	                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:160:20: ^( MEMBER[$r] ^( DEREF $postfixExpression) ID )
            	                {
            	                CommonTree root_1 = (CommonTree)adaptor.nil();
            	                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMBER, r), root_1);

            	                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:160:33: ^( DEREF $postfixExpression)
            	                {
            	                CommonTree root_2 = (CommonTree)adaptor.nil();
            	                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEREF, "DEREF"), root_2);

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfixExpression"

    public static class primary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:166:1: primary : ( ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expr ')' -> expr );
    public final CymbolParser.primary_return primary() throws RecognitionException {
        CymbolParser.primary_return retval = new CymbolParser.primary_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID108=null;
        Token INT109=null;
        Token FLOAT110=null;
        Token CHAR111=null;
        Token string_literal112=null;
        Token string_literal113=null;
        Token char_literal114=null;
        Token char_literal116=null;
        CymbolParser.expr_return expr115 = null;


        CommonTree ID108_tree=null;
        CommonTree INT109_tree=null;
        CommonTree FLOAT110_tree=null;
        CommonTree CHAR111_tree=null;
        CommonTree string_literal112_tree=null;
        CommonTree string_literal113_tree=null;
        CommonTree char_literal114_tree=null;
        CommonTree char_literal116_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:167:5: ( ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expr ')' -> expr )
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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:167:9: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ID108=(Token)match(input,ID,FOLLOW_ID_in_primary1830); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID108_tree = (CommonTree)adaptor.create(ID108);
                    adaptor.addChild(root_0, ID108_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:168:9: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT109=(Token)match(input,INT,FOLLOW_INT_in_primary1840); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT109_tree = (CommonTree)adaptor.create(INT109);
                    adaptor.addChild(root_0, INT109_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:169:9: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FLOAT110=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primary1850); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT110_tree = (CommonTree)adaptor.create(FLOAT110);
                    adaptor.addChild(root_0, FLOAT110_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:170:9: CHAR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHAR111=(Token)match(input,CHAR,FOLLOW_CHAR_in_primary1860); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR111_tree = (CommonTree)adaptor.create(CHAR111);
                    adaptor.addChild(root_0, CHAR111_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:171:9: 'true'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal112=(Token)match(input,57,FOLLOW_57_in_primary1870); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal112_tree = (CommonTree)adaptor.create(string_literal112);
                    adaptor.addChild(root_0, string_literal112_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:172:9: 'false'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal113=(Token)match(input,58,FOLLOW_58_in_primary1880); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal113_tree = (CommonTree)adaptor.create(string_literal113);
                    adaptor.addChild(root_0, string_literal113_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:173:9: '(' expr ')'
                    {
                    char_literal114=(Token)match(input,31,FOLLOW_31_in_primary1890); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal114);

                    pushFollow(FOLLOW_expr_in_primary1892);
                    expr115=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr115.getTree());
                    char_literal116=(Token)match(input,32,FOLLOW_32_in_primary1894); if (state.failed) return retval; 
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

                    root_0 = (CommonTree)adaptor.nil();
                    // 173:22: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primary"

    // $ANTLR start synpred2_Cymbol
    public final void synpred2_Cymbol_fragment() throws RecognitionException {   
        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:94:9: ( varDeclaration )
        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:94:9: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred2_Cymbol876);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Cymbol

    // $ANTLR start synpred5_Cymbol
    public final void synpred5_Cymbol_fragment() throws RecognitionException {   
        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:98:9: ( lhs '=' expression ';' )
        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Cymbol.g:98:9: lhs '=' expression ';'
        {
        pushFollow(FOLLOW_lhs_in_synpred5_Cymbol962);
        lhs();

        state._fsp--;
        if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred5_Cymbol964); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred5_Cymbol966);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,29,FOLLOW_29_in_synpred5_Cymbol968); if (state.failed) return ;

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
        "\1\24\2\uffff\1\0\6\uffff\6\0\1\uffff";
    static final String DFA16_maxS =
        "\1\72\2\uffff\1\0\6\uffff\6\0\1\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\11\uffff\1\6";
    static final String DFA16_specialS =
        "\3\uffff\1\0\6\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\3\1\12\1\13\1\14\3\uffff\1\1\3\uffff\1\17\3\uffff\1\6\5\2"+
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
            return "91:1: statement options {backtrack=true; } : ( block | varDeclaration | 'if' '(' expression ')' s= statement ( 'else' e= statement )? -> ^( 'if' expression $s ( $e)? ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) );";
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
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit193 = new BitSet(new long[]{0x000001F000100012L});
    public static final BitSet FOLLOW_methodDeclaration_in_compilationUnit197 = new BitSet(new long[]{0x000001F000100012L});
    public static final BitSet FOLLOW_varDeclaration_in_compilationUnit201 = new BitSet(new long[]{0x000001F000100012L});
    public static final BitSet FOLLOW_CLASS_DECL_in_classDeclaration231 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_classDeclaration233 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_superClass_in_classDeclaration235 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_classDeclaration238 = new BitSet(new long[]{0x000001F000100010L});
    public static final BitSet FOLLOW_classMember_in_classDeclaration240 = new BitSet(new long[]{0x000001F010100010L});
    public static final BitSet FOLLOW_28_in_classDeclaration243 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_classDeclaration245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_superClass285 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_superClass287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_classMember314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_classMember324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_methodDeclaration347 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_methodDeclaration349 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_methodDeclaration351 = new BitSet(new long[]{0x000001F100100000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration353 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_methodDeclaration356 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_block_in_methodDeclaration358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_formalParameters401 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_formalParameters404 = new BitSet(new long[]{0x000001F000100000L});
    public static final BitSet FOLLOW_parameter_in_formalParameters406 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_type_in_parameter436 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_parameter438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter463 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_parameter465 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parameter467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter491 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parameter493 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_parameter495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_block613 = new BitSet(new long[]{0x06340BF898F00010L});
    public static final BitSet FOLLOW_statement_in_block615 = new BitSet(new long[]{0x06340BF898F00010L});
    public static final BitSet FOLLOW_28_in_block618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration648 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration650 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration653 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_expression_in_varDeclaration655 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_varDeclaration659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration711 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration713 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_varDeclaration715 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration718 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_expression_in_varDeclaration720 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_varDeclaration724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration780 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_varDeclaration782 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration784 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration787 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_expression_in_varDeclaration789 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_varDeclaration793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_statement876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_statement886 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_statement888 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_expression_in_statement890 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_statement892 = new BitSet(new long[]{0x06340BF888F00010L});
    public static final BitSet FOLLOW_statement_in_statement896 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_statement899 = new BitSet(new long[]{0x06340BF888F00010L});
    public static final BitSet FOLLOW_statement_in_statement903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_statement938 = new BitSet(new long[]{0x06340008A0F00000L});
    public static final BitSet FOLLOW_expression_in_statement940 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_statement962 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_statement964 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_expression_in_statement966 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_statement990 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_lhs1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expressionList1055 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_expressionList1058 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_expr_in_expressionList1060 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_expr_in_expression1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_expr1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1147 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_44_in_equalityExpression1151 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_45_in_equalityExpression1156 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1160 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1181 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_46_in_relationalExpression1203 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_47_in_relationalExpression1226 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_48_in_relationalExpression1249 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_49_in_relationalExpression1272 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1309 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1353 = new BitSet(new long[]{0x0004000000040002L});
    public static final BitSet FOLLOW_ADD_in_additiveExpression1357 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_50_in_additiveExpression1362 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1366 = new BitSet(new long[]{0x0004000000040002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1387 = new BitSet(new long[]{0x0008000800000002L});
    public static final BitSet FOLLOW_35_in_multiplicativeExpression1391 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_51_in_multiplicativeExpression1396 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1400 = new BitSet(new long[]{0x0008000800000002L});
    public static final BitSet FOLLOW_50_in_unaryExpression1423 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_unaryExpression1446 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_unaryExpression1469 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_unaryExpression1492 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfixExpression1534 = new BitSet(new long[]{0x0140000080080002L});
    public static final BitSet FOLLOW_31_in_postfixExpression1565 = new BitSet(new long[]{0x0634000980F00000L});
    public static final BitSet FOLLOW_expressionList_in_postfixExpression1567 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_postfixExpression1569 = new BitSet(new long[]{0x0140000080080002L});
    public static final BitSet FOLLOW_54_in_postfixExpression1617 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_expr_in_postfixExpression1619 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_postfixExpression1621 = new BitSet(new long[]{0x0140000080080002L});
    public static final BitSet FOLLOW_MEMBER_in_postfixExpression1673 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_postfixExpression1675 = new BitSet(new long[]{0x0140000080080002L});
    public static final BitSet FOLLOW_56_in_postfixExpression1722 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_postfixExpression1724 = new BitSet(new long[]{0x0140000080080002L});
    public static final BitSet FOLLOW_ID_in_primary1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primary1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primary1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_primary1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_primary1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_primary1890 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_expr_in_primary1892 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_primary1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred2_Cymbol876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_synpred5_Cymbol962 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred5_Cymbol964 = new BitSet(new long[]{0x0634000880F00000L});
    public static final BitSet FOLLOW_expression_in_synpred5_Cymbol966 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred5_Cymbol968 = new BitSet(new long[]{0x0000000000000002L});

}