/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g 2009-09-23 17:37:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CymbolParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "UNARY_MINUS", "UNARY_NOT", "ASSIGN", "INDEX", "ID", "INT", "FLOAT", "CHAR", "LETTER", "WS", "SL_COMMENT", "'struct'", "'{'", "'}'", "';'", "'[]'", "'('", "')'", "','", "'float'", "'int'", "'char'", "'boolean'", "'void'", "'if'", "'else'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'!'", "'['", "']'", "'.'", "'true'", "'false'"
    };
    public static final int INDEX=15;
    public static final int T__42=42;
    public static final int T__28=28;
    public static final int T__23=23;
    public static final int T__51=51;
    public static final int EXPR=11;
    public static final int T__47=47;
    public static final int FLOAT=18;
    public static final int T__50=50;
    public static final int FIELD_DECL=8;
    public static final int BLOCK=6;
    public static final int T__39=39;
    public static final int T__30=30;
    public static final int T__46=46;
    public static final int T__52=52;
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
    public static final int T__38=38;
    public static final int CALL=9;
    public static final int T__37=37;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int VAR_DECL=7;
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
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g"; }


    public static class compilationUnit_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:22:1: compilationUnit : ( options {backtrack=true; } : structDeclaration | methodDeclaration | varDeclaration )+ ;
    public final CymbolParser.compilationUnit_return compilationUnit() throws RecognitionException {
        CymbolParser.compilationUnit_return retval = new CymbolParser.compilationUnit_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        CymbolParser.structDeclaration_return structDeclaration1 = null;

        CymbolParser.methodDeclaration_return methodDeclaration2 = null;

        CymbolParser.varDeclaration_return varDeclaration3 = null;



        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:24:5: ( ( options {backtrack=true; } : structDeclaration | methodDeclaration | varDeclaration )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:24:9: ( options {backtrack=true; } : structDeclaration | methodDeclaration | varDeclaration )+
            {
            root_0 = (CymbolAST)adaptor.nil();

            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:24:9: ( options {backtrack=true; } : structDeclaration | methodDeclaration | varDeclaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==ID) ) {
                        int LA1_4 = input.LA(3);

                        if ( (LA1_4==24) ) {
                            alt1=1;
                        }
                        else if ( (LA1_4==ID) ) {
                            int LA1_5 = input.LA(4);

                            if ( (LA1_5==ASSIGN||(LA1_5>=26 && LA1_5<=27)) ) {
                                alt1=3;
                            }
                            else if ( (LA1_5==28) ) {
                                alt1=2;
                            }


                        }


                    }


                }
                else if ( ((LA1_0>=31 && LA1_0<=35)) ) {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==ID) ) {
                        int LA1_5 = input.LA(3);

                        if ( (LA1_5==ASSIGN||(LA1_5>=26 && LA1_5<=27)) ) {
                            alt1=3;
                        }
                        else if ( (LA1_5==28) ) {
                            alt1=2;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:26:5: structDeclaration
            	    {
            	    pushFollow(FOLLOW_structDeclaration_in_compilationUnit164);
            	    structDeclaration1=structDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, structDeclaration1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:26:25: methodDeclaration
            	    {
            	    pushFollow(FOLLOW_methodDeclaration_in_compilationUnit168);
            	    methodDeclaration2=methodDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration2.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:26:45: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_compilationUnit172);
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

    public static class structDeclaration_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:30:1: structDeclaration : 'struct' ID '{' ( structMember )+ '}' ';' -> ^( 'struct' ID ( structMember )+ ) ;
    public final CymbolParser.structDeclaration_return structDeclaration() throws RecognitionException {
        CymbolParser.structDeclaration_return retval = new CymbolParser.structDeclaration_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token string_literal4=null;
        Token ID5=null;
        Token char_literal6=null;
        Token char_literal8=null;
        Token char_literal9=null;
        CymbolParser.structMember_return structMember7 = null;


        CymbolAST string_literal4_tree=null;
        CymbolAST ID5_tree=null;
        CymbolAST char_literal6_tree=null;
        CymbolAST char_literal8_tree=null;
        CymbolAST char_literal9_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_structMember=new RewriteRuleSubtreeStream(adaptor,"rule structMember");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:31:2: ( 'struct' ID '{' ( structMember )+ '}' ';' -> ^( 'struct' ID ( structMember )+ ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:31:4: 'struct' ID '{' ( structMember )+ '}' ';'
            {
            string_literal4=(Token)match(input,23,FOLLOW_23_in_structDeclaration191); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_23.add(string_literal4);

            ID5=(Token)match(input,ID,FOLLOW_ID_in_structDeclaration193); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID5);

            char_literal6=(Token)match(input,24,FOLLOW_24_in_structDeclaration195); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_24.add(char_literal6);

            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:31:20: ( structMember )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23||(LA2_0>=31 && LA2_0<=35)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:31:20: structMember
            	    {
            	    pushFollow(FOLLOW_structMember_in_structDeclaration197);
            	    structMember7=structMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_structMember.add(structMember7.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            char_literal8=(Token)match(input,25,FOLLOW_25_in_structDeclaration200); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(char_literal8);

            char_literal9=(Token)match(input,26,FOLLOW_26_in_structDeclaration202); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal9);



            // AST REWRITE
            // elements: ID, structMember, 23
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CymbolAST)adaptor.nil();
            // 31:42: -> ^( 'struct' ID ( structMember )+ )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:31:45: ^( 'struct' ID ( structMember )+ )
                {
                CymbolAST root_1 = (CymbolAST)adaptor.nil();
                root_1 = (CymbolAST)adaptor.becomeRoot(stream_23.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                if ( !(stream_structMember.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_structMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_structMember.nextTree());

                }
                stream_structMember.reset();

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
    // $ANTLR end "structDeclaration"

    public static class structMember_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structMember"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:34:1: structMember : ( type ID ';' -> ^( FIELD_DECL type ID ) | type ID '[]' ';' -> ^( FIELD_DECL ^( '[]' type ) ID ) | structDeclaration );
    public final CymbolParser.structMember_return structMember() throws RecognitionException {
        CymbolParser.structMember_return retval = new CymbolParser.structMember_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token ID11=null;
        Token char_literal12=null;
        Token ID14=null;
        Token string_literal15=null;
        Token char_literal16=null;
        CymbolParser.type_return type10 = null;

        CymbolParser.type_return type13 = null;

        CymbolParser.structDeclaration_return structDeclaration17 = null;


        CymbolAST ID11_tree=null;
        CymbolAST char_literal12_tree=null;
        CymbolAST ID14_tree=null;
        CymbolAST string_literal15_tree=null;
        CymbolAST char_literal16_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:35:2: ( type ID ';' -> ^( FIELD_DECL type ID ) | type ID '[]' ';' -> ^( FIELD_DECL ^( '[]' type ) ID ) | structDeclaration )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=31 && LA3_0<=35)) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==ID) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==27) ) {
                        alt3=2;
                    }
                    else if ( (LA3_3==26) ) {
                        alt3=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==23) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==ID) ) {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==24) ) {
                        alt3=3;
                    }
                    else if ( (LA3_4==ID) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==27) ) {
                            alt3=2;
                        }
                        else if ( (LA3_3==26) ) {
                            alt3=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:35:4: type ID ';'
                    {
                    pushFollow(FOLLOW_type_in_structMember226);
                    type10=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type10.getTree());
                    ID11=(Token)match(input,ID,FOLLOW_ID_in_structMember228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID11);

                    char_literal12=(Token)match(input,26,FOLLOW_26_in_structMember230); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal12);



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

                    root_0 = (CymbolAST)adaptor.nil();
                    // 35:18: -> ^( FIELD_DECL type ID )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:35:21: ^( FIELD_DECL type ID )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(FIELD_DECL, "FIELD_DECL"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:36:4: type ID '[]' ';'
                    {
                    pushFollow(FOLLOW_type_in_structMember247);
                    type13=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type13.getTree());
                    ID14=(Token)match(input,ID,FOLLOW_ID_in_structMember249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID14);

                    string_literal15=(Token)match(input,27,FOLLOW_27_in_structMember251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(string_literal15);

                    char_literal16=(Token)match(input,26,FOLLOW_26_in_structMember253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal16);



                    // AST REWRITE
                    // elements: type, ID, 27
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 36:21: -> ^( FIELD_DECL ^( '[]' type ) ID )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:36:24: ^( FIELD_DECL ^( '[]' type ) ID )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(FIELD_DECL, "FIELD_DECL"), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:36:37: ^( '[]' type )
                        {
                        CymbolAST root_2 = (CymbolAST)adaptor.nil();
                        root_2 = (CymbolAST)adaptor.becomeRoot(stream_27.nextNode(), root_2);

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
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:37:4: structDeclaration
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    pushFollow(FOLLOW_structDeclaration_in_structMember272);
                    structDeclaration17=structDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, structDeclaration17.getTree());

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
    // $ANTLR end "structMember"

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:41:1: methodDeclaration : type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) ;
    public final CymbolParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        CymbolParser.methodDeclaration_return retval = new CymbolParser.methodDeclaration_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token ID19=null;
        Token char_literal20=null;
        Token char_literal22=null;
        CymbolParser.type_return type18 = null;

        CymbolParser.formalParameters_return formalParameters21 = null;

        CymbolParser.block_return block23 = null;


        CymbolAST ID19_tree=null;
        CymbolAST char_literal20_tree=null;
        CymbolAST char_literal22_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:42:5: ( type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:42:9: type ID '(' ( formalParameters )? ')' block
            {
            pushFollow(FOLLOW_type_in_methodDeclaration289);
            type18=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type18.getTree());
            ID19=(Token)match(input,ID,FOLLOW_ID_in_methodDeclaration291); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID19);

            char_literal20=(Token)match(input,28,FOLLOW_28_in_methodDeclaration293); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal20);

            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:42:21: ( formalParameters )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23||(LA4_0>=31 && LA4_0<=35)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:42:21: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration295);
                    formalParameters21=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters21.getTree());

                    }
                    break;

            }

            char_literal22=(Token)match(input,29,FOLLOW_29_in_methodDeclaration298); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal22);

            pushFollow(FOLLOW_block_in_methodDeclaration300);
            block23=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block23.getTree());


            // AST REWRITE
            // elements: type, block, ID, formalParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CymbolAST)adaptor.nil();
            // 43:9: -> ^( METHOD_DECL type ID ( formalParameters )? block )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:43:12: ^( METHOD_DECL type ID ( formalParameters )? block )
                {
                CymbolAST root_1 = (CymbolAST)adaptor.nil();
                root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:43:34: ( formalParameters )?
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:47:1: formalParameters : parameter ( ',' parameter )* -> ( parameter )+ ;
    public final CymbolParser.formalParameters_return formalParameters() throws RecognitionException {
        CymbolParser.formalParameters_return retval = new CymbolParser.formalParameters_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token char_literal25=null;
        CymbolParser.parameter_return parameter24 = null;

        CymbolParser.parameter_return parameter26 = null;


        CymbolAST char_literal25_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:48:5: ( parameter ( ',' parameter )* -> ( parameter )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:48:9: parameter ( ',' parameter )*
            {
            pushFollow(FOLLOW_parameter_in_formalParameters343);
            parameter24=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(parameter24.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:48:19: ( ',' parameter )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:48:20: ',' parameter
            	    {
            	    char_literal25=(Token)match(input,30,FOLLOW_30_in_formalParameters346); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_30.add(char_literal25);

            	    pushFollow(FOLLOW_parameter_in_formalParameters348);
            	    parameter26=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter.add(parameter26.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // 48:36: -> ( parameter )+
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:51:1: parameter : ( type ID -> ^( ARG_DECL type ID ) | type ID '[]' -> ^( ARG_DECL ^( '[]' type ) ID ) );
    public final CymbolParser.parameter_return parameter() throws RecognitionException {
        CymbolParser.parameter_return retval = new CymbolParser.parameter_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token ID28=null;
        Token ID30=null;
        Token string_literal31=null;
        CymbolParser.type_return type27 = null;

        CymbolParser.type_return type29 = null;


        CymbolAST ID28_tree=null;
        CymbolAST ID30_tree=null;
        CymbolAST string_literal31_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:52:2: ( type ID -> ^( ARG_DECL type ID ) | type ID '[]' -> ^( ARG_DECL ^( '[]' type ) ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=31 && LA6_0<=35)) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==ID) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==27) ) {
                        alt6=2;
                    }
                    else if ( ((LA6_3>=29 && LA6_3<=30)) ) {
                        alt6=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==23) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==ID) ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==ID) ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==27) ) {
                            alt6=2;
                        }
                        else if ( ((LA6_3>=29 && LA6_3<=30)) ) {
                            alt6=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:52:4: type ID
                    {
                    pushFollow(FOLLOW_type_in_parameter373);
                    type27=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type27.getTree());
                    ID28=(Token)match(input,ID,FOLLOW_ID_in_parameter375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID28);



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

                    root_0 = (CymbolAST)adaptor.nil();
                    // 52:14: -> ^( ARG_DECL type ID )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:52:17: ^( ARG_DECL type ID )
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
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:53:4: type ID '[]'
                    {
                    pushFollow(FOLLOW_type_in_parameter392);
                    type29=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type29.getTree());
                    ID30=(Token)match(input,ID,FOLLOW_ID_in_parameter394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID30);

                    string_literal31=(Token)match(input,27,FOLLOW_27_in_parameter396); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(string_literal31);



                    // AST REWRITE
                    // elements: ID, 27, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 53:17: -> ^( ARG_DECL ^( '[]' type ) ID )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:53:20: ^( ARG_DECL ^( '[]' type ) ID )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:53:31: ^( '[]' type )
                        {
                        CymbolAST root_2 = (CymbolAST)adaptor.nil();
                        root_2 = (CymbolAST)adaptor.becomeRoot(stream_27.nextNode(), root_2);

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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:56:1: type : ( primitiveType | 'struct' ID -> ID );
    public final CymbolParser.type_return type() throws RecognitionException {
        CymbolParser.type_return retval = new CymbolParser.type_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token string_literal33=null;
        Token ID34=null;
        CymbolParser.primitiveType_return primitiveType32 = null;


        CymbolAST string_literal33_tree=null;
        CymbolAST ID34_tree=null;
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:56:5: ( primitiveType | 'struct' ID -> ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=31 && LA7_0<=35)) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:56:7: primitiveType
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type419);
                    primitiveType32=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType32.getTree());

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:57:7: 'struct' ID
                    {
                    string_literal33=(Token)match(input,23,FOLLOW_23_in_type427); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_23.add(string_literal33);

                    ID34=(Token)match(input,ID,FOLLOW_ID_in_type429); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID34);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 57:19: -> ID
                    {
                        adaptor.addChild(root_0, stream_ID.nextNode());

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
    // $ANTLR end "type"

    public static class primitiveType_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:60:1: primitiveType : ( 'float' | 'int' | 'char' | 'boolean' | 'void' );
    public final CymbolParser.primitiveType_return primitiveType() throws RecognitionException {
        CymbolParser.primitiveType_return retval = new CymbolParser.primitiveType_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token set35=null;

        CymbolAST set35_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:61:2: ( 'float' | 'int' | 'char' | 'boolean' | 'void' )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:
            {
            root_0 = (CymbolAST)adaptor.nil();

            set35=(Token)input.LT(1);
            if ( (input.LA(1)>=31 && input.LA(1)<=35) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CymbolAST)adaptor.create(set35));
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:69:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final CymbolParser.block_return block() throws RecognitionException {
        CymbolParser.block_return retval = new CymbolParser.block_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token char_literal36=null;
        Token char_literal38=null;
        CymbolParser.statement_return statement37 = null;


        CymbolAST char_literal36_tree=null;
        CymbolAST char_literal38_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:70:5: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:70:9: '{' ( statement )* '}'
            {
            char_literal36=(Token)match(input,24,FOLLOW_24_in_block500); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_24.add(char_literal36);

            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:70:13: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=ID && LA8_0<=CHAR)||(LA8_0>=23 && LA8_0<=24)||LA8_0==28||(LA8_0>=31 && LA8_0<=36)||LA8_0==38||(LA8_0>=53 && LA8_0<=54)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:70:13: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block502);
            	    statement37=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement37.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal38=(Token)match(input,25,FOLLOW_25_in_block505); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(char_literal38);



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
            // 70:28: -> ^( BLOCK ( statement )* )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:70:31: ^( BLOCK ( statement )* )
                {
                CymbolAST root_1 = (CymbolAST)adaptor.nil();
                root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:70:39: ( statement )*
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:75:1: varDeclaration : ( type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) | type ID '[]' ( '=' expression )? ';' -> ^( VAR_DECL ^( '[]' type ) ID ( expression )? ) );
    public final CymbolParser.varDeclaration_return varDeclaration() throws RecognitionException {
        CymbolParser.varDeclaration_return retval = new CymbolParser.varDeclaration_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token ID40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        Token ID45=null;
        Token string_literal46=null;
        Token char_literal47=null;
        Token char_literal49=null;
        CymbolParser.type_return type39 = null;

        CymbolParser.expression_return expression42 = null;

        CymbolParser.type_return type44 = null;

        CymbolParser.expression_return expression48 = null;


        CymbolAST ID40_tree=null;
        CymbolAST char_literal41_tree=null;
        CymbolAST char_literal43_tree=null;
        CymbolAST ID45_tree=null;
        CymbolAST string_literal46_tree=null;
        CymbolAST char_literal47_tree=null;
        CymbolAST char_literal49_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:76:5: ( type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) | type ID '[]' ( '=' expression )? ';' -> ^( VAR_DECL ^( '[]' type ) ID ( expression )? ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=31 && LA11_0<=35)) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==ID) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==27) ) {
                        alt11=2;
                    }
                    else if ( (LA11_3==ASSIGN||LA11_3==26) ) {
                        alt11=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==23) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==ID) ) {
                    int LA11_4 = input.LA(3);

                    if ( (LA11_4==ID) ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==27) ) {
                            alt11=2;
                        }
                        else if ( (LA11_3==ASSIGN||LA11_3==26) ) {
                            alt11=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:76:9: type ID ( '=' expression )? ';'
                    {
                    pushFollow(FOLLOW_type_in_varDeclaration535);
                    type39=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type39.getTree());
                    ID40=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID40);

                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:76:17: ( '=' expression )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ASSIGN) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:76:18: '=' expression
                            {
                            char_literal41=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration540); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal41);

                            pushFollow(FOLLOW_expression_in_varDeclaration542);
                            expression42=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression42.getTree());

                            }
                            break;

                    }

                    char_literal43=(Token)match(input,26,FOLLOW_26_in_varDeclaration546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal43);



                    // AST REWRITE
                    // elements: ID, expression, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 76:43: -> ^( VAR_DECL type ID ( expression )? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:76:46: ^( VAR_DECL type ID ( expression )? )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:76:65: ( expression )?
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
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:77:7: type ID '[]' ( '=' expression )? ';'
                    {
                    pushFollow(FOLLOW_type_in_varDeclaration571);
                    type44=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type44.getTree());
                    ID45=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID45);

                    string_literal46=(Token)match(input,27,FOLLOW_27_in_varDeclaration575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(string_literal46);

                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:77:20: ( '=' expression )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ASSIGN) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:77:21: '=' expression
                            {
                            char_literal47=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration578); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal47);

                            pushFollow(FOLLOW_expression_in_varDeclaration580);
                            expression48=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression48.getTree());

                            }
                            break;

                    }

                    char_literal49=(Token)match(input,26,FOLLOW_26_in_varDeclaration584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal49);



                    // AST REWRITE
                    // elements: 27, ID, expression, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 77:42: -> ^( VAR_DECL ^( '[]' type ) ID ( expression )? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:77:45: ^( VAR_DECL ^( '[]' type ) ID ( expression )? )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:77:56: ^( '[]' type )
                        {
                        CymbolAST root_2 = (CymbolAST)adaptor.nil();
                        root_2 = (CymbolAST)adaptor.becomeRoot(stream_27.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_type.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:77:72: ( expression )?
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:81:1: statement options {backtrack=true; } : ( block | structDeclaration | varDeclaration | 'if' '(' expression ')' s= statement ( 'else' e= statement )? -> ^( 'if' expression $s ( $e)? ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) );
    public final CymbolParser.statement_return statement() throws RecognitionException {
        CymbolParser.statement_return retval = new CymbolParser.statement_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token string_literal53=null;
        Token char_literal54=null;
        Token char_literal56=null;
        Token string_literal57=null;
        Token string_literal58=null;
        Token char_literal60=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token char_literal65=null;
        CymbolParser.statement_return s = null;

        CymbolParser.statement_return e = null;

        CymbolParser.postfixExpression_return a = null;

        CymbolParser.block_return block50 = null;

        CymbolParser.structDeclaration_return structDeclaration51 = null;

        CymbolParser.varDeclaration_return varDeclaration52 = null;

        CymbolParser.expression_return expression55 = null;

        CymbolParser.expression_return expression59 = null;

        CymbolParser.lhs_return lhs61 = null;

        CymbolParser.expression_return expression63 = null;


        CymbolAST string_literal53_tree=null;
        CymbolAST char_literal54_tree=null;
        CymbolAST char_literal56_tree=null;
        CymbolAST string_literal57_tree=null;
        CymbolAST string_literal58_tree=null;
        CymbolAST char_literal60_tree=null;
        CymbolAST char_literal62_tree=null;
        CymbolAST char_literal64_tree=null;
        CymbolAST char_literal65_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:83:5: ( block | structDeclaration | varDeclaration | 'if' '(' expression ')' s= statement ( 'else' e= statement )? -> ^( 'if' expression $s ( $e)? ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:83:9: block
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement626);
                    block50=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block50.getTree());

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:84:7: structDeclaration
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    pushFollow(FOLLOW_structDeclaration_in_statement634);
                    structDeclaration51=structDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, structDeclaration51.getTree());

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:85:7: varDeclaration
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_statement642);
                    varDeclaration52=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration52.getTree());

                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:86:7: 'if' '(' expression ')' s= statement ( 'else' e= statement )?
                    {
                    string_literal53=(Token)match(input,36,FOLLOW_36_in_statement650); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(string_literal53);

                    char_literal54=(Token)match(input,28,FOLLOW_28_in_statement652); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal54);

                    pushFollow(FOLLOW_expression_in_statement654);
                    expression55=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression55.getTree());
                    char_literal56=(Token)match(input,29,FOLLOW_29_in_statement656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal56);

                    pushFollow(FOLLOW_statement_in_statement660);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s.getTree());
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:86:43: ( 'else' e= statement )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==37) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:86:44: 'else' e= statement
                            {
                            string_literal57=(Token)match(input,37,FOLLOW_37_in_statement663); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_37.add(string_literal57);

                            pushFollow(FOLLOW_statement_in_statement667);
                            e=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(e.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: e, 36, s, expression
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
                    // 87:6: -> ^( 'if' expression $s ( $e)? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:87:9: ^( 'if' expression $s ( $e)? )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot(stream_36.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_s.nextTree());
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:87:30: ( $e)?
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
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:88:9: 'return' ( expression )? ';'
                    {
                    string_literal58=(Token)match(input,38,FOLLOW_38_in_statement699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal58);

                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:88:18: ( expression )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=ID && LA13_0<=CHAR)||LA13_0==28||LA13_0==46||LA13_0==49||(LA13_0>=53 && LA13_0<=54)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:88:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement701);
                            expression59=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());

                            }
                            break;

                    }

                    char_literal60=(Token)match(input,26,FOLLOW_26_in_statement704); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal60);



                    // AST REWRITE
                    // elements: 38, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 88:34: -> ^( 'return' ( expression )? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:88:37: ^( 'return' ( expression )? )
                        {
                        CymbolAST root_1 = (CymbolAST)adaptor.nil();
                        root_1 = (CymbolAST)adaptor.becomeRoot(stream_38.nextNode(), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:88:48: ( expression )?
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
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:89:7: lhs '=' expression ';'
                    {
                    pushFollow(FOLLOW_lhs_in_statement721);
                    lhs61=lhs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lhs.add(lhs61.getTree());
                    char_literal62=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal62);

                    pushFollow(FOLLOW_expression_in_statement725);
                    expression63=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression63.getTree());
                    char_literal64=(Token)match(input,26,FOLLOW_26_in_statement727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal64);



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
                    // 89:30: -> ^( '=' lhs expression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:89:33: ^( '=' lhs expression )
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
                case 7 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:90:9: a= postfixExpression ';'
                    {
                    pushFollow(FOLLOW_postfixExpression_in_statement749);
                    a=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfixExpression.add(a.getTree());
                    char_literal65=(Token)match(input,26,FOLLOW_26_in_statement751); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal65);



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
                    // 91:7: -> ^( EXPR postfixExpression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:91:10: ^( EXPR postfixExpression )
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:94:1: lhs : postfixExpression -> ^( EXPR postfixExpression ) ;
    public final CymbolParser.lhs_return lhs() throws RecognitionException {
        CymbolParser.lhs_return retval = new CymbolParser.lhs_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        CymbolParser.postfixExpression_return postfixExpression66 = null;


        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:94:5: ( postfixExpression -> ^( EXPR postfixExpression ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:94:7: postfixExpression
            {
            pushFollow(FOLLOW_postfixExpression_in_lhs779);
            postfixExpression66=postfixExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_postfixExpression.add(postfixExpression66.getTree());


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
            // 94:25: -> ^( EXPR postfixExpression )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:94:28: ^( EXPR postfixExpression )
                {
                CymbolAST root_1 = (CymbolAST)adaptor.nil();
                root_1 = (CymbolAST)adaptor.becomeRoot((CymbolAST)adaptor.create(EXPR, "EXPR"), root_1);

                adaptor.addChild(root_1, stream_postfixExpression.nextTree());

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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:97:1: expressionList : ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST );
    public final CymbolParser.expressionList_return expressionList() throws RecognitionException {
        CymbolParser.expressionList_return retval = new CymbolParser.expressionList_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token char_literal68=null;
        CymbolParser.expr_return expr67 = null;

        CymbolParser.expr_return expr69 = null;


        CymbolAST char_literal68_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:98:5: ( expr ( ',' expr )* -> ^( ELIST ( expr )+ ) | -> ELIST )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=ID && LA16_0<=CHAR)||LA16_0==28||LA16_0==46||LA16_0==49||(LA16_0>=53 && LA16_0<=54)) ) {
                alt16=1;
            }
            else if ( (LA16_0==29) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:98:9: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_expressionList804);
                    expr67=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr67.getTree());
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:98:14: ( ',' expr )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==30) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:98:15: ',' expr
                    	    {
                    	    char_literal68=(Token)match(input,30,FOLLOW_30_in_expressionList807); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_30.add(char_literal68);

                    	    pushFollow(FOLLOW_expr_in_expressionList809);
                    	    expr69=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr69.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
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
                    // 98:26: -> ^( ELIST ( expr )+ )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:98:29: ^( ELIST ( expr )+ )
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
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:99:9: 
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
                    // 99:9: -> ELIST
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:102:1: expression : expr -> ^( EXPR expr ) ;
    public final CymbolParser.expression_return expression() throws RecognitionException {
        CymbolParser.expression_return retval = new CymbolParser.expression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        CymbolParser.expr_return expr70 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:103:5: ( expr -> ^( EXPR expr ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:103:9: expr
            {
            pushFollow(FOLLOW_expr_in_expression851);
            expr70=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr70.getTree());


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
            // 103:14: -> ^( EXPR expr )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:103:17: ^( EXPR expr )
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:106:1: expr : equalityExpression ;
    public final CymbolParser.expr_return expr() throws RecognitionException {
        CymbolParser.expr_return retval = new CymbolParser.expr_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        CymbolParser.equalityExpression_return equalityExpression71 = null;



        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:106:5: ( equalityExpression )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:106:7: equalityExpression
            {
            root_0 = (CymbolAST)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_expr871);
            equalityExpression71=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression71.getTree());

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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:109:1: equalityExpression : relationalExpression ( ( '!=' | '==' ) relationalExpression )* ;
    public final CymbolParser.equalityExpression_return equalityExpression() throws RecognitionException {
        CymbolParser.equalityExpression_return retval = new CymbolParser.equalityExpression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token string_literal73=null;
        Token string_literal74=null;
        CymbolParser.relationalExpression_return relationalExpression72 = null;

        CymbolParser.relationalExpression_return relationalExpression75 = null;


        CymbolAST string_literal73_tree=null;
        CymbolAST string_literal74_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:110:2: ( relationalExpression ( ( '!=' | '==' ) relationalExpression )* )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:110:4: relationalExpression ( ( '!=' | '==' ) relationalExpression )*
            {
            root_0 = (CymbolAST)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression883);
            relationalExpression72=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression72.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:110:25: ( ( '!=' | '==' ) relationalExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=39 && LA18_0<=40)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:110:26: ( '!=' | '==' ) relationalExpression
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:110:26: ( '!=' | '==' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==39) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==40) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:110:27: '!='
            	            {
            	            string_literal73=(Token)match(input,39,FOLLOW_39_in_equalityExpression887); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal73_tree = (CymbolAST)adaptor.create(string_literal73);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(string_literal73_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:110:35: '=='
            	            {
            	            string_literal74=(Token)match(input,40,FOLLOW_40_in_equalityExpression892); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal74_tree = (CymbolAST)adaptor.create(string_literal74);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(string_literal74_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression896);
            	    relationalExpression75=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression75.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:113:1: relationalExpression : additiveExpression ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* ) ;
    public final CymbolParser.relationalExpression_return relationalExpression() throws RecognitionException {
        CymbolParser.relationalExpression_return retval = new CymbolParser.relationalExpression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token char_literal77=null;
        Token char_literal78=null;
        Token string_literal79=null;
        Token string_literal80=null;
        CymbolParser.additiveExpression_return additiveExpression76 = null;

        CymbolParser.additiveExpression_return additiveExpression81 = null;


        CymbolAST char_literal77_tree=null;
        CymbolAST char_literal78_tree=null;
        CymbolAST string_literal79_tree=null;
        CymbolAST string_literal80_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:114:2: ( additiveExpression ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* ) )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:114:4: additiveExpression ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* )
            {
            root_0 = (CymbolAST)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression909);
            additiveExpression76=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression76.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:115:3: ( ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:115:5: ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:115:5: ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=41 && LA20_0<=44)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:115:7: ( '<' | '>' | '<=' | '>=' ) additiveExpression
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:115:7: ( '<' | '>' | '<=' | '>=' )
            	    int alt19=4;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:115:9: '<'
            	            {
            	            char_literal77=(Token)match(input,41,FOLLOW_41_in_relationalExpression919); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal77_tree = (CymbolAST)adaptor.create(char_literal77);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(char_literal77_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:116:7: '>'
            	            {
            	            char_literal78=(Token)match(input,42,FOLLOW_42_in_relationalExpression928); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal78_tree = (CymbolAST)adaptor.create(char_literal78);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(char_literal78_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:117:7: '<='
            	            {
            	            string_literal79=(Token)match(input,43,FOLLOW_43_in_relationalExpression937); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal79_tree = (CymbolAST)adaptor.create(string_literal79);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(string_literal79_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:118:7: '>='
            	            {
            	            string_literal80=(Token)match(input,44,FOLLOW_44_in_relationalExpression946); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal80_tree = (CymbolAST)adaptor.create(string_literal80);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(string_literal80_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression959);
            	    additiveExpression81=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression81.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:125:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final CymbolParser.additiveExpression_return additiveExpression() throws RecognitionException {
        CymbolParser.additiveExpression_return retval = new CymbolParser.additiveExpression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token char_literal83=null;
        Token char_literal84=null;
        CymbolParser.multiplicativeExpression_return multiplicativeExpression82 = null;

        CymbolParser.multiplicativeExpression_return multiplicativeExpression85 = null;


        CymbolAST char_literal83_tree=null;
        CymbolAST char_literal84_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:126:2: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:126:4: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (CymbolAST)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression980);
            multiplicativeExpression82=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression82.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:126:29: ( ( '+' | '-' ) multiplicativeExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=45 && LA22_0<=46)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:126:30: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:126:30: ( '+' | '-' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==45) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==46) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:126:31: '+'
            	            {
            	            char_literal83=(Token)match(input,45,FOLLOW_45_in_additiveExpression984); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal83_tree = (CymbolAST)adaptor.create(char_literal83);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(char_literal83_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:126:38: '-'
            	            {
            	            char_literal84=(Token)match(input,46,FOLLOW_46_in_additiveExpression989); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal84_tree = (CymbolAST)adaptor.create(char_literal84);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(char_literal84_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression993);
            	    multiplicativeExpression85=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression85.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:129:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' ) unaryExpression )* ;
    public final CymbolParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        CymbolParser.multiplicativeExpression_return retval = new CymbolParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token char_literal87=null;
        Token char_literal88=null;
        CymbolParser.unaryExpression_return unaryExpression86 = null;

        CymbolParser.unaryExpression_return unaryExpression89 = null;


        CymbolAST char_literal87_tree=null;
        CymbolAST char_literal88_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:130:2: ( unaryExpression ( ( '*' | '/' ) unaryExpression )* )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:130:4: unaryExpression ( ( '*' | '/' ) unaryExpression )*
            {
            root_0 = (CymbolAST)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1006);
            unaryExpression86=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression86.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:130:20: ( ( '*' | '/' ) unaryExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=47 && LA24_0<=48)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:130:21: ( '*' | '/' ) unaryExpression
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:130:21: ( '*' | '/' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==47) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==48) ) {
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
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:130:22: '*'
            	            {
            	            char_literal87=(Token)match(input,47,FOLLOW_47_in_multiplicativeExpression1010); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal87_tree = (CymbolAST)adaptor.create(char_literal87);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(char_literal87_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:130:29: '/'
            	            {
            	            char_literal88=(Token)match(input,48,FOLLOW_48_in_multiplicativeExpression1015); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal88_tree = (CymbolAST)adaptor.create(char_literal88);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(char_literal88_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1019);
            	    unaryExpression89=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression89.getTree());

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
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        CymbolAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:133:1: unaryExpression : (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | postfixExpression );
    public final CymbolParser.unaryExpression_return unaryExpression() throws RecognitionException {
        CymbolParser.unaryExpression_return retval = new CymbolParser.unaryExpression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token op=null;
        CymbolParser.unaryExpression_return unaryExpression90 = null;

        CymbolParser.unaryExpression_return unaryExpression91 = null;

        CymbolParser.postfixExpression_return postfixExpression92 = null;


        CymbolAST op_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:134:2: (op= '-' unaryExpression -> ^( UNARY_MINUS[$op] unaryExpression ) | op= '!' unaryExpression -> ^( UNARY_NOT[$op] unaryExpression ) | postfixExpression )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt25=1;
                }
                break;
            case 49:
                {
                alt25=2;
                }
                break;
            case ID:
            case INT:
            case FLOAT:
            case CHAR:
            case 28:
            case 53:
            case 54:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:134:4: op= '-' unaryExpression
                    {
                    op=(Token)match(input,46,FOLLOW_46_in_unaryExpression1034); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_46.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1036);
                    unaryExpression90=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression90.getTree());


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
                    // 134:27: -> ^( UNARY_MINUS[$op] unaryExpression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:134:30: ^( UNARY_MINUS[$op] unaryExpression )
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
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:135:4: op= '!' unaryExpression
                    {
                    op=(Token)match(input,49,FOLLOW_49_in_unaryExpression1052); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(op);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1054);
                    unaryExpression91=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression91.getTree());


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
                    // 135:27: -> ^( UNARY_NOT[$op] unaryExpression )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:135:30: ^( UNARY_NOT[$op] unaryExpression )
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
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:136:4: postfixExpression
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1068);
                    postfixExpression92=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression92.getTree());

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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:140:1: postfixExpression : primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )* ;
    public final CymbolParser.postfixExpression_return postfixExpression() throws RecognitionException {
        CymbolParser.postfixExpression_return retval = new CymbolParser.postfixExpression_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token r=null;
        Token char_literal95=null;
        Token char_literal97=null;
        Token ID98=null;
        CymbolParser.primary_return primary93 = null;

        CymbolParser.expressionList_return expressionList94 = null;

        CymbolParser.expr_return expr96 = null;


        CymbolAST r_tree=null;
        CymbolAST char_literal95_tree=null;
        CymbolAST char_literal97_tree=null;
        CymbolAST ID98_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:141:5: ( primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )* )
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:141:9: primary ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )*
            {
            root_0 = (CymbolAST)adaptor.nil();

            pushFollow(FOLLOW_primary_in_postfixExpression1085);
            primary93=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary93.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:142:6: ( (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==28||LA27_0==50||LA27_0==52) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:143:7: (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID )
            	    {
            	    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:143:7: (r= '(' expressionList ')' | r= '[' expr ']' | r= '.' ID )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:143:9: r= '(' expressionList ')'
            	            {
            	            r=(Token)match(input,28,FOLLOW_28_in_postfixExpression1104); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CymbolAST)adaptor.create(r);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            pushFollow(FOLLOW_expressionList_in_postfixExpression1107);
            	            expressionList94=expressionList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList94.getTree());
            	            char_literal95=(Token)match(input,29,FOLLOW_29_in_postfixExpression1109); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              r.setType(CALL);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:144:9: r= '[' expr ']'
            	            {
            	            r=(Token)match(input,50,FOLLOW_50_in_postfixExpression1124); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CymbolAST)adaptor.create(r);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            pushFollow(FOLLOW_expr_in_postfixExpression1127);
            	            expr96=expr();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr96.getTree());
            	            char_literal97=(Token)match(input,51,FOLLOW_51_in_postfixExpression1129); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              r.setType(INDEX);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:145:9: r= '.' ID
            	            {
            	            r=(Token)match(input,52,FOLLOW_52_in_postfixExpression1146); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            r_tree = (CymbolAST)adaptor.create(r);
            	            root_0 = (CymbolAST)adaptor.becomeRoot(r_tree, root_0);
            	            }
            	            ID98=(Token)match(input,ID,FOLLOW_ID_in_postfixExpression1149); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ID98_tree = (CymbolAST)adaptor.create(ID98);
            	            adaptor.addChild(root_0, ID98_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:151:1: primary : ( ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expression ')' -> expression );
    public final CymbolParser.primary_return primary() throws RecognitionException {
        CymbolParser.primary_return retval = new CymbolParser.primary_return();
        retval.start = input.LT(1);

        CymbolAST root_0 = null;

        Token ID99=null;
        Token INT100=null;
        Token FLOAT101=null;
        Token CHAR102=null;
        Token string_literal103=null;
        Token string_literal104=null;
        Token char_literal105=null;
        Token char_literal107=null;
        CymbolParser.expression_return expression106 = null;


        CymbolAST ID99_tree=null;
        CymbolAST INT100_tree=null;
        CymbolAST FLOAT101_tree=null;
        CymbolAST CHAR102_tree=null;
        CymbolAST string_literal103_tree=null;
        CymbolAST string_literal104_tree=null;
        CymbolAST char_literal105_tree=null;
        CymbolAST char_literal107_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:152:5: ( ID | INT | FLOAT | CHAR | 'true' | 'false' | '(' expression ')' -> expression )
            int alt28=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt28=1;
                }
                break;
            case INT:
                {
                alt28=2;
                }
                break;
            case FLOAT:
                {
                alt28=3;
                }
                break;
            case CHAR:
                {
                alt28=4;
                }
                break;
            case 53:
                {
                alt28=5;
                }
                break;
            case 54:
                {
                alt28=6;
                }
                break;
            case 28:
                {
                alt28=7;
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
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:152:9: ID
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    ID99=(Token)match(input,ID,FOLLOW_ID_in_primary1185); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID99_tree = (CymbolAST)adaptor.create(ID99);
                    adaptor.addChild(root_0, ID99_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:153:9: INT
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    INT100=(Token)match(input,INT,FOLLOW_INT_in_primary1195); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT100_tree = (CymbolAST)adaptor.create(INT100);
                    adaptor.addChild(root_0, INT100_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:154:7: FLOAT
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    FLOAT101=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primary1203); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT101_tree = (CymbolAST)adaptor.create(FLOAT101);
                    adaptor.addChild(root_0, FLOAT101_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:155:7: CHAR
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    CHAR102=(Token)match(input,CHAR,FOLLOW_CHAR_in_primary1211); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR102_tree = (CymbolAST)adaptor.create(CHAR102);
                    adaptor.addChild(root_0, CHAR102_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:156:7: 'true'
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    string_literal103=(Token)match(input,53,FOLLOW_53_in_primary1219); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal103_tree = (CymbolAST)adaptor.create(string_literal103);
                    adaptor.addChild(root_0, string_literal103_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:157:7: 'false'
                    {
                    root_0 = (CymbolAST)adaptor.nil();

                    string_literal104=(Token)match(input,54,FOLLOW_54_in_primary1227); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal104_tree = (CymbolAST)adaptor.create(string_literal104);
                    adaptor.addChild(root_0, string_literal104_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:158:9: '(' expression ')'
                    {
                    char_literal105=(Token)match(input,28,FOLLOW_28_in_primary1237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal105);

                    pushFollow(FOLLOW_expression_in_primary1239);
                    expression106=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression106.getTree());
                    char_literal107=(Token)match(input,29,FOLLOW_29_in_primary1241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal107);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CymbolAST)adaptor.nil();
                    // 158:28: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

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

    // $ANTLR start synpred5_Cymbol
    public final void synpred5_Cymbol_fragment() throws RecognitionException {   
        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:84:7: ( structDeclaration )
        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:84:7: structDeclaration
        {
        pushFollow(FOLLOW_structDeclaration_in_synpred5_Cymbol634);
        structDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Cymbol

    // $ANTLR start synpred6_Cymbol
    public final void synpred6_Cymbol_fragment() throws RecognitionException {   
        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:85:7: ( varDeclaration )
        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:85:7: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred6_Cymbol642);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Cymbol

    // $ANTLR start synpred9_Cymbol
    public final void synpred9_Cymbol_fragment() throws RecognitionException {   
        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:89:7: ( lhs '=' expression ';' )
        // /Users/parrt/research/book/TPDSL/Book/code/semantics/types/Cymbol.g:89:7: lhs '=' expression ';'
        {
        pushFollow(FOLLOW_lhs_in_synpred9_Cymbol721);
        lhs();

        state._fsp--;
        if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred9_Cymbol723); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred9_Cymbol725);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,26,FOLLOW_26_in_synpred9_Cymbol727); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Cymbol

    // Delegated rules

    public final boolean synpred9_Cymbol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Cymbol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Cymbol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Cymbol_fragment(); // can never throw exception
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


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\20\uffff";
    static final String DFA14_eofS =
        "\20\uffff";
    static final String DFA14_minS =
        "\1\20\1\uffff\1\0\3\uffff\7\0\3\uffff";
    static final String DFA14_maxS =
        "\1\66\1\uffff\1\0\3\uffff\7\0\3\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\7\uffff\1\2\1\6\1\7";
    static final String DFA14_specialS =
        "\2\uffff\1\0\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\6\1\7\1\10\1\11\3\uffff\1\2\1\1\3\uffff\1\14\2\uffff\5\3"+
            "\1\4\1\uffff\1\5\16\uffff\1\12\1\13",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "81:1: statement options {backtrack=true; } : ( block | structDeclaration | varDeclaration | 'if' '(' expression ')' s= statement ( 'else' e= statement )? -> ^( 'if' expression $s ( $e)? ) | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | lhs '=' expression ';' -> ^( '=' lhs expression ) | a= postfixExpression ';' -> ^( EXPR postfixExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Cymbol()) ) {s = 13;}

                        else if ( (synpred6_Cymbol()) ) {s = 3;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Cymbol()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Cymbol()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Cymbol()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_9 = input.LA(1);

                         
                        int index14_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Cymbol()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index14_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_10 = input.LA(1);

                         
                        int index14_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Cymbol()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index14_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_11 = input.LA(1);

                         
                        int index14_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Cymbol()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index14_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_12 = input.LA(1);

                         
                        int index14_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Cymbol()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index14_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_structDeclaration_in_compilationUnit164 = new BitSet(new long[]{0x0000000F80800002L});
    public static final BitSet FOLLOW_methodDeclaration_in_compilationUnit168 = new BitSet(new long[]{0x0000000F80800002L});
    public static final BitSet FOLLOW_varDeclaration_in_compilationUnit172 = new BitSet(new long[]{0x0000000F80800002L});
    public static final BitSet FOLLOW_23_in_structDeclaration191 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_structDeclaration193 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_structDeclaration195 = new BitSet(new long[]{0x0000000F80800000L});
    public static final BitSet FOLLOW_structMember_in_structDeclaration197 = new BitSet(new long[]{0x0000000F82800000L});
    public static final BitSet FOLLOW_25_in_structDeclaration200 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_structDeclaration202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_structMember226 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_structMember228 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_structMember230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_structMember247 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_structMember249 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_structMember251 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_structMember253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structDeclaration_in_structMember272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_methodDeclaration289 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_methodDeclaration291 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_methodDeclaration293 = new BitSet(new long[]{0x0000000FA0800000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration295 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_methodDeclaration298 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_block_in_methodDeclaration300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_formalParameters343 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_formalParameters346 = new BitSet(new long[]{0x0000000F80800000L});
    public static final BitSet FOLLOW_parameter_in_formalParameters348 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_type_in_parameter373 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_parameter375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter392 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_parameter394 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parameter396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_type427 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_type429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_block500 = new BitSet(new long[]{0x0060005F938F0000L});
    public static final BitSet FOLLOW_statement_in_block502 = new BitSet(new long[]{0x0060005F938F0000L});
    public static final BitSet FOLLOW_25_in_block505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration535 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration537 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration540 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_expression_in_varDeclaration542 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_varDeclaration546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration571 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration573 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_varDeclaration575 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_ASSIGN_in_varDeclaration578 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_expression_in_varDeclaration580 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_varDeclaration584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structDeclaration_in_statement634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_statement642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_statement650 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_statement652 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_expression_in_statement654 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement656 = new BitSet(new long[]{0x0060005F918F0000L});
    public static final BitSet FOLLOW_statement_in_statement660 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_statement663 = new BitSet(new long[]{0x0060005F918F0000L});
    public static final BitSet FOLLOW_statement_in_statement667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_statement699 = new BitSet(new long[]{0x00624000140F0000L});
    public static final BitSet FOLLOW_expression_in_statement701 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_statement721 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ASSIGN_in_statement723 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_expression_in_statement725 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_statement749 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_lhs779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expressionList804 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_expressionList807 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_expr_in_expressionList809 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_expr_in_expression851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_expr871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression883 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_equalityExpression887 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_40_in_equalityExpression892 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression896 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression909 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_41_in_relationalExpression919 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_42_in_relationalExpression928 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_43_in_relationalExpression937 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_44_in_relationalExpression946 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression959 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression980 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_additiveExpression984 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_46_in_additiveExpression989 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression993 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1006 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_47_in_multiplicativeExpression1010 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_48_in_multiplicativeExpression1015 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1019 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_46_in_unaryExpression1034 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_unaryExpression1052 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfixExpression1085 = new BitSet(new long[]{0x0014000010000002L});
    public static final BitSet FOLLOW_28_in_postfixExpression1104 = new BitSet(new long[]{0x00624000300F0000L});
    public static final BitSet FOLLOW_expressionList_in_postfixExpression1107 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_postfixExpression1109 = new BitSet(new long[]{0x0014000010000002L});
    public static final BitSet FOLLOW_50_in_postfixExpression1124 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_expr_in_postfixExpression1127 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_postfixExpression1129 = new BitSet(new long[]{0x0014000010000002L});
    public static final BitSet FOLLOW_52_in_postfixExpression1146 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_postfixExpression1149 = new BitSet(new long[]{0x0014000010000002L});
    public static final BitSet FOLLOW_ID_in_primary1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primary1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primary1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_primary1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_primary1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_primary1237 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_expression_in_primary1239 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_primary1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structDeclaration_in_synpred5_Cymbol634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred6_Cymbol642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lhs_in_synpred9_Cymbol721 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred9_Cymbol723 = new BitSet(new long[]{0x00624000100F0000L});
    public static final BitSet FOLLOW_expression_in_synpred9_Cymbol725 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred9_Cymbol727 = new BitSet(new long[]{0x0000000000000002L});

}