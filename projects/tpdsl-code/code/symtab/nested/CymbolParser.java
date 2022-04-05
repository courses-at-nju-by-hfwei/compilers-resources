/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g 2009-09-23 17:37:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class CymbolParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "METHOD_DECL", "ARG_DECL", "BLOCK", "VAR_DECL", "CALL", "ELIST", "EXPR", "ID", "INT", "LETTER", "WS", "SL_COMMENT", "'('", "')'", "','", "'float'", "'int'", "'void'", "'{'", "'}'", "'='", "';'", "'return'", "'+'"
    };
    public static final int LETTER=13;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int EXPR=10;
    public static final int ARG_DECL=5;
    public static final int WS=14;
    public static final int T__21=21;
    public static final int T__19=19;
    public static final int T__22=22;
    public static final int BLOCK=6;
    public static final int T__17=17;
    public static final int INT=12;
    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int T__16=16;
    public static final int CALL=8;
    public static final int T__24=24;
    public static final int METHOD_DECL=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int VAR_DECL=7;
    public static final int SL_COMMENT=15;
    public static final int ELIST=9;
    public static final int T__18=18;
    public static final int ID=11;

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
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g"; }


    public static class compilationUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:17:1: compilationUnit : ( methodDeclaration | varDeclaration )+ ;
    public final CymbolParser.compilationUnit_return compilationUnit() throws RecognitionException {
        CymbolParser.compilationUnit_return retval = new CymbolParser.compilationUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CymbolParser.methodDeclaration_return methodDeclaration1 = null;

        CymbolParser.varDeclaration_return varDeclaration2 = null;



        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:18:5: ( ( methodDeclaration | varDeclaration )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:18:9: ( methodDeclaration | varDeclaration )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:18:9: ( methodDeclaration | varDeclaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=19 && LA1_0<=21)) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==ID) ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3==16) ) {
                            alt1=1;
                        }
                        else if ( ((LA1_3>=24 && LA1_3<=25)) ) {
                            alt1=2;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:18:10: methodDeclaration
            	    {
            	    pushFollow(FOLLOW_methodDeclaration_in_compilationUnit111);
            	    methodDeclaration1=methodDeclaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, methodDeclaration1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:18:30: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_compilationUnit115);
            	    varDeclaration2=varDeclaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, varDeclaration2.getTree());

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

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:22:1: methodDeclaration : type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) ;
    public final CymbolParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        CymbolParser.methodDeclaration_return retval = new CymbolParser.methodDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID4=null;
        Token char_literal5=null;
        Token char_literal7=null;
        CymbolParser.type_return type3 = null;

        CymbolParser.formalParameters_return formalParameters6 = null;

        CymbolParser.block_return block8 = null;


        CommonTree ID4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree char_literal7_tree=null;
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:23:5: ( type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:23:9: type ID '(' ( formalParameters )? ')' block
            {
            pushFollow(FOLLOW_type_in_methodDeclaration137);
            type3=type();

            state._fsp--;

            stream_type.add(type3.getTree());
            ID4=(Token)match(input,ID,FOLLOW_ID_in_methodDeclaration139);  
            stream_ID.add(ID4);

            char_literal5=(Token)match(input,16,FOLLOW_16_in_methodDeclaration141);  
            stream_16.add(char_literal5);

            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:23:21: ( formalParameters )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=19 && LA2_0<=21)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:23:21: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration143);
                    formalParameters6=formalParameters();

                    state._fsp--;

                    stream_formalParameters.add(formalParameters6.getTree());

                    }
                    break;

            }

            char_literal7=(Token)match(input,17,FOLLOW_17_in_methodDeclaration146);  
            stream_17.add(char_literal7);

            pushFollow(FOLLOW_block_in_methodDeclaration148);
            block8=block();

            state._fsp--;

            stream_block.add(block8.getTree());


            // AST REWRITE
            // elements: formalParameters, ID, block, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 24:9: -> ^( METHOD_DECL type ID ( formalParameters )? block )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:24:12: ^( METHOD_DECL type ID ( formalParameters )? block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:24:34: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:28:1: formalParameters : type ID ( ',' type ID )* -> ( ^( ARG_DECL type ID ) )+ ;
    public final CymbolParser.formalParameters_return formalParameters() throws RecognitionException {
        CymbolParser.formalParameters_return retval = new CymbolParser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID10=null;
        Token char_literal11=null;
        Token ID13=null;
        CymbolParser.type_return type9 = null;

        CymbolParser.type_return type12 = null;


        CommonTree ID10_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree ID13_tree=null;
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:29:5: ( type ID ( ',' type ID )* -> ( ^( ARG_DECL type ID ) )+ )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:29:9: type ID ( ',' type ID )*
            {
            pushFollow(FOLLOW_type_in_formalParameters191);
            type9=type();

            state._fsp--;

            stream_type.add(type9.getTree());
            ID10=(Token)match(input,ID,FOLLOW_ID_in_formalParameters193);  
            stream_ID.add(ID10);

            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:29:17: ( ',' type ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:29:18: ',' type ID
            	    {
            	    char_literal11=(Token)match(input,18,FOLLOW_18_in_formalParameters196);  
            	    stream_18.add(char_literal11);

            	    pushFollow(FOLLOW_type_in_formalParameters198);
            	    type12=type();

            	    state._fsp--;

            	    stream_type.add(type12.getTree());
            	    ID13=(Token)match(input,ID,FOLLOW_ID_in_formalParameters200);  
            	    stream_ID.add(ID13);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);



            // AST REWRITE
            // elements: ID, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 29:32: -> ( ^( ARG_DECL type ID ) )+
            {
                if ( !(stream_ID.hasNext()||stream_type.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext()||stream_type.hasNext() ) {
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:29:35: ^( ARG_DECL type ID )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_ID.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ID.reset();
                stream_type.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:32:1: type : ( 'float' | 'int' | 'void' );
    public final CymbolParser.type_return type() throws RecognitionException {
        CymbolParser.type_return retval = new CymbolParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set14=null;

        CommonTree set14_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:32:5: ( 'float' | 'int' | 'void' )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set14=(Token)input.LT(1);
            if ( (input.LA(1)>=19 && input.LA(1)<=21) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set14));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:38:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final CymbolParser.block_return block() throws RecognitionException {
        CymbolParser.block_return retval = new CymbolParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal15=null;
        Token char_literal17=null;
        CymbolParser.statement_return statement16 = null;


        CommonTree char_literal15_tree=null;
        CommonTree char_literal17_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:39:5: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:39:9: '{' ( statement )* '}'
            {
            char_literal15=(Token)match(input,22,FOLLOW_22_in_block265);  
            stream_22.add(char_literal15);

            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:39:13: ( statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=ID && LA4_0<=INT)||LA4_0==16||(LA4_0>=19 && LA4_0<=22)||LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:39:13: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block267);
            	    statement16=statement();

            	    state._fsp--;

            	    stream_statement.add(statement16.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            char_literal17=(Token)match(input,23,FOLLOW_23_in_block270);  
            stream_23.add(char_literal17);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 39:28: -> ^( BLOCK ( statement )* )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:39:31: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:39:39: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:44:1: varDeclaration : type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) ;
    public final CymbolParser.varDeclaration_return varDeclaration() throws RecognitionException {
        CymbolParser.varDeclaration_return retval = new CymbolParser.varDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID19=null;
        Token char_literal20=null;
        Token char_literal22=null;
        CymbolParser.type_return type18 = null;

        CymbolParser.expression_return expression21 = null;


        CommonTree ID19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree char_literal22_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:45:5: ( type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:45:9: type ID ( '=' expression )? ';'
            {
            pushFollow(FOLLOW_type_in_varDeclaration300);
            type18=type();

            state._fsp--;

            stream_type.add(type18.getTree());
            ID19=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration302);  
            stream_ID.add(ID19);

            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:45:17: ( '=' expression )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:45:18: '=' expression
                    {
                    char_literal20=(Token)match(input,24,FOLLOW_24_in_varDeclaration305);  
                    stream_24.add(char_literal20);

                    pushFollow(FOLLOW_expression_in_varDeclaration307);
                    expression21=expression();

                    state._fsp--;

                    stream_expression.add(expression21.getTree());

                    }
                    break;

            }

            char_literal22=(Token)match(input,25,FOLLOW_25_in_varDeclaration311);  
            stream_25.add(char_literal22);



            // AST REWRITE
            // elements: type, expression, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 45:39: -> ^( VAR_DECL type ID ( expression )? )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:45:42: ^( VAR_DECL type ID ( expression )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:45:61: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:49:1: statement : ( block | varDeclaration | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | postfixExpression ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) ) ';' );
    public final CymbolParser.statement_return statement() throws RecognitionException {
        CymbolParser.statement_return retval = new CymbolParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal25=null;
        Token char_literal27=null;
        Token char_literal29=null;
        Token char_literal31=null;
        CymbolParser.block_return block23 = null;

        CymbolParser.varDeclaration_return varDeclaration24 = null;

        CymbolParser.expression_return expression26 = null;

        CymbolParser.postfixExpression_return postfixExpression28 = null;

        CymbolParser.expression_return expression30 = null;


        CommonTree string_literal25_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree char_literal31_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:50:5: ( block | varDeclaration | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | postfixExpression ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) ) ';' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 19:
            case 20:
            case 21:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case ID:
            case INT:
            case 16:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:50:9: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement344);
                    block23=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block23.getTree());

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:51:7: varDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_statement352);
                    varDeclaration24=varDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, varDeclaration24.getTree());

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:52:9: 'return' ( expression )? ';'
                    {
                    string_literal25=(Token)match(input,26,FOLLOW_26_in_statement362);  
                    stream_26.add(string_literal25);

                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:52:18: ( expression )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=ID && LA6_0<=INT)||LA6_0==16) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:52:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement364);
                            expression26=expression();

                            state._fsp--;

                            stream_expression.add(expression26.getTree());

                            }
                            break;

                    }

                    char_literal27=(Token)match(input,25,FOLLOW_25_in_statement367);  
                    stream_25.add(char_literal27);



                    // AST REWRITE
                    // elements: 26, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 52:34: -> ^( 'return' ( expression )? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:52:37: ^( 'return' ( expression )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_26.nextNode(), root_1);

                        // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:52:48: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:53:9: postfixExpression ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) ) ';'
                    {
                    pushFollow(FOLLOW_postfixExpression_in_statement386);
                    postfixExpression28=postfixExpression();

                    state._fsp--;

                    stream_postfixExpression.add(postfixExpression28.getTree());
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:54:9: ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==24) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==25) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:54:13: '=' expression
                            {
                            char_literal29=(Token)match(input,24,FOLLOW_24_in_statement401);  
                            stream_24.add(char_literal29);

                            pushFollow(FOLLOW_expression_in_statement403);
                            expression30=expression();

                            state._fsp--;

                            stream_expression.add(expression30.getTree());


                            // AST REWRITE
                            // elements: 24, postfixExpression, expression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 54:28: -> ^( '=' postfixExpression expression )
                            {
                                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:54:31: ^( '=' postfixExpression expression )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(stream_24.nextNode(), root_1);

                                adaptor.addChild(root_1, stream_postfixExpression.nextTree());
                                adaptor.addChild(root_1, stream_expression.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:55:13: 
                            {

                            // AST REWRITE
                            // elements: postfixExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 55:13: -> ^( EXPR postfixExpression )
                            {
                                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:55:16: ^( EXPR postfixExpression )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

                                adaptor.addChild(root_1, stream_postfixExpression.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }

                    char_literal31=(Token)match(input,25,FOLLOW_25_in_statement453);  
                    stream_25.add(char_literal31);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class expressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:60:1: expressionList : ( expression ( ',' expression )* -> ^( ELIST ( expression )+ ) | -> ELIST );
    public final CymbolParser.expressionList_return expressionList() throws RecognitionException {
        CymbolParser.expressionList_return retval = new CymbolParser.expressionList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal33=null;
        CymbolParser.expression_return expression32 = null;

        CymbolParser.expression_return expression34 = null;


        CommonTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:61:5: ( expression ( ',' expression )* -> ^( ELIST ( expression )+ ) | -> ELIST )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=ID && LA10_0<=INT)||LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:61:9: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_expressionList479);
                    expression32=expression();

                    state._fsp--;

                    stream_expression.add(expression32.getTree());
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:61:20: ( ',' expression )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:61:21: ',' expression
                    	    {
                    	    char_literal33=(Token)match(input,18,FOLLOW_18_in_expressionList482);  
                    	    stream_18.add(char_literal33);

                    	    pushFollow(FOLLOW_expression_in_expressionList484);
                    	    expression34=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 61:38: -> ^( ELIST ( expression )+ )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:61:41: ^( ELIST ( expression )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELIST, "ELIST"), root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:62:9: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 62:9: -> ELIST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ELIST, "ELIST"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:65:1: expression : addExpression -> ^( EXPR addExpression ) ;
    public final CymbolParser.expression_return expression() throws RecognitionException {
        CymbolParser.expression_return retval = new CymbolParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CymbolParser.addExpression_return addExpression35 = null;


        RewriteRuleSubtreeStream stream_addExpression=new RewriteRuleSubtreeStream(adaptor,"rule addExpression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:66:5: ( addExpression -> ^( EXPR addExpression ) )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:66:9: addExpression
            {
            pushFollow(FOLLOW_addExpression_in_expression526);
            addExpression35=addExpression();

            state._fsp--;

            stream_addExpression.add(addExpression35.getTree());


            // AST REWRITE
            // elements: addExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 66:23: -> ^( EXPR addExpression )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:66:26: ^( EXPR addExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);

                adaptor.addChild(root_1, stream_addExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class addExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:69:1: addExpression : postfixExpression ( '+' postfixExpression )* ;
    public final CymbolParser.addExpression_return addExpression() throws RecognitionException {
        CymbolParser.addExpression_return retval = new CymbolParser.addExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal37=null;
        CymbolParser.postfixExpression_return postfixExpression36 = null;

        CymbolParser.postfixExpression_return postfixExpression38 = null;


        CommonTree char_literal37_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:70:2: ( postfixExpression ( '+' postfixExpression )* )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:70:4: postfixExpression ( '+' postfixExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_postfixExpression_in_addExpression552);
            postfixExpression36=postfixExpression();

            state._fsp--;

            adaptor.addChild(root_0, postfixExpression36.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:70:22: ( '+' postfixExpression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:70:23: '+' postfixExpression
            	    {
            	    char_literal37=(Token)match(input,27,FOLLOW_27_in_addExpression555); 
            	    char_literal37_tree = (CommonTree)adaptor.create(char_literal37);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal37_tree, root_0);

            	    pushFollow(FOLLOW_postfixExpression_in_addExpression558);
            	    postfixExpression38=postfixExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, postfixExpression38.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "addExpression"

    public static class postfixExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpression"
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:74:1: postfixExpression : primary (lp= '(' expressionList ')' )* ;
    public final CymbolParser.postfixExpression_return postfixExpression() throws RecognitionException {
        CymbolParser.postfixExpression_return retval = new CymbolParser.postfixExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lp=null;
        Token char_literal41=null;
        CymbolParser.primary_return primary39 = null;

        CymbolParser.expressionList_return expressionList40 = null;


        CommonTree lp_tree=null;
        CommonTree char_literal41_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:75:5: ( primary (lp= '(' expressionList ')' )* )
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:75:9: primary (lp= '(' expressionList ')' )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_primary_in_postfixExpression577);
            primary39=primary();

            state._fsp--;

            adaptor.addChild(root_0, primary39.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:75:17: (lp= '(' expressionList ')' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:75:19: lp= '(' expressionList ')'
            	    {
            	    lp=(Token)match(input,16,FOLLOW_16_in_postfixExpression583); 
            	    lp_tree = (CommonTree)adaptor.create(lp);
            	    root_0 = (CommonTree)adaptor.becomeRoot(lp_tree, root_0);

            	    pushFollow(FOLLOW_expressionList_in_postfixExpression586);
            	    expressionList40=expressionList();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expressionList40.getTree());
            	    char_literal41=(Token)match(input,17,FOLLOW_17_in_postfixExpression588); 
            	    lp.setType(CALL);

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:79:1: primary : ( ID | INT | '(' expression ')' -> expression );
    public final CymbolParser.primary_return primary() throws RecognitionException {
        CymbolParser.primary_return retval = new CymbolParser.primary_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID42=null;
        Token INT43=null;
        Token char_literal44=null;
        Token char_literal46=null;
        CymbolParser.expression_return expression45 = null;


        CommonTree ID42_tree=null;
        CommonTree INT43_tree=null;
        CommonTree char_literal44_tree=null;
        CommonTree char_literal46_tree=null;
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:80:5: ( ID | INT | '(' expression ')' -> expression )
            int alt13=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt13=1;
                }
                break;
            case INT:
                {
                alt13=2;
                }
                break;
            case 16:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:80:9: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ID42=(Token)match(input,ID,FOLLOW_ID_in_primary614); 
                    ID42_tree = (CommonTree)adaptor.create(ID42);
                    adaptor.addChild(root_0, ID42_tree);


                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:81:9: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT43=(Token)match(input,INT,FOLLOW_INT_in_primary624); 
                    INT43_tree = (CommonTree)adaptor.create(INT43);
                    adaptor.addChild(root_0, INT43_tree);


                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/symtab/nested/Cymbol.g:82:9: '(' expression ')'
                    {
                    char_literal44=(Token)match(input,16,FOLLOW_16_in_primary634);  
                    stream_16.add(char_literal44);

                    pushFollow(FOLLOW_expression_in_primary636);
                    expression45=expression();

                    state._fsp--;

                    stream_expression.add(expression45.getTree());
                    char_literal46=(Token)match(input,17,FOLLOW_17_in_primary638);  
                    stream_17.add(char_literal46);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 82:28: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    // Delegated rules


 

    public static final BitSet FOLLOW_methodDeclaration_in_compilationUnit111 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_varDeclaration_in_compilationUnit115 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_type_in_methodDeclaration137 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_methodDeclaration139 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_methodDeclaration141 = new BitSet(new long[]{0x00000000003A0000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration143 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_methodDeclaration146 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_block_in_methodDeclaration148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameters191 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_formalParameters193 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_formalParameters196 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_type_in_formalParameters198 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_formalParameters200 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_block265 = new BitSet(new long[]{0x0000000004F91800L});
    public static final BitSet FOLLOW_statement_in_block267 = new BitSet(new long[]{0x0000000004F91800L});
    public static final BitSet FOLLOW_23_in_block270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDeclaration300 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_varDeclaration302 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_varDeclaration305 = new BitSet(new long[]{0x0000000004791800L});
    public static final BitSet FOLLOW_expression_in_varDeclaration307 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_varDeclaration311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_statement352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_statement362 = new BitSet(new long[]{0x0000000006791800L});
    public static final BitSet FOLLOW_expression_in_statement364 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_statement386 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_statement401 = new BitSet(new long[]{0x0000000004791800L});
    public static final BitSet FOLLOW_expression_in_statement403 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList479 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_expressionList482 = new BitSet(new long[]{0x0000000004791800L});
    public static final BitSet FOLLOW_expression_in_expressionList484 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_addExpression_in_expression526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_addExpression552 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_addExpression555 = new BitSet(new long[]{0x0000000004791800L});
    public static final BitSet FOLLOW_postfixExpression_in_addExpression558 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_primary_in_postfixExpression577 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_postfixExpression583 = new BitSet(new long[]{0x00000000047B1800L});
    public static final BitSet FOLLOW_expressionList_in_postfixExpression586 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_postfixExpression588 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ID_in_primary614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_primary634 = new BitSet(new long[]{0x0000000004791800L});
    public static final BitSet FOLLOW_expression_in_primary636 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_primary638 = new BitSet(new long[]{0x0000000000000002L});

}