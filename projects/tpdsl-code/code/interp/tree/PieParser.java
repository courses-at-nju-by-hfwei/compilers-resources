/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g 2009-09-23 17:37:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

/** A simple dynamically-typed language that smacks of Python.
 *  This builds a tree, then we'll interpret it with a tree grammar
 *  Build a convential symbol table while parsing.  Save
 *  symbol ptrs in AST nodes.
 */
public class PieParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGS", "FIELDS", "BLOCK", "CALL", "IF", "ASSIGN", "PRINT", "WHILE", "RETURN", "DEF", "ADD", "SUB", "MUL", "EQ", "LT", "STRUCT", "DOT", "NEW", "ID", "NL", "INT", "CHAR", "FLOAT", "STRING", "LETTER", "WS", "SL_COMMENT", "'{'", "','", "'}'", "'('", "')'", "':'", "'else'"
    };
    public static final int LETTER=28;
    public static final int T__35=35;
    public static final int ARGS=4;
    public static final int DEF=13;
    public static final int T__36=36;
    public static final int WHILE=11;
    public static final int WS=29;
    public static final int CHAR=25;
    public static final int STRING=27;
    public static final int NEW=21;
    public static final int EQ=17;
    public static final int FLOAT=26;
    public static final int LT=18;
    public static final int T__33=33;
    public static final int DOT=20;
    public static final int BLOCK=6;
    public static final int MUL=16;
    public static final int NL=23;
    public static final int PRINT=10;
    public static final int RETURN=12;
    public static final int INT=24;
    public static final int T__31=31;
    public static final int IF=8;
    public static final int EOF=-1;
    public static final int STRUCT=19;
    public static final int T__32=32;
    public static final int ASSIGN=9;
    public static final int CALL=7;
    public static final int T__37=37;
    public static final int SUB=15;
    public static final int T__34=34;
    public static final int SL_COMMENT=30;
    public static final int ADD=14;
    public static final int ID=22;
    public static final int FIELDS=5;

    // delegates
    // delegators


        public PieParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PieParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return PieParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g"; }


        Interpreter interp;
        Scope currentScope;
        public PieParser(TokenStream input, Interpreter interp) {
            this(input);
            this.interp = interp;
            currentScope = interp.globalScope;
        }


    public static class program_return extends ParserRuleReturnScope {
        PieAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:25:1: program : ( functionDefinition | statement )+ EOF -> ^( BLOCK ( statement )+ ) ;
    public final PieParser.program_return program() throws RecognitionException {
        PieParser.program_return retval = new PieParser.program_return();
        retval.start = input.LT(1);

        PieAST root_0 = null;

        Token EOF3=null;
        PieParser.functionDefinition_return functionDefinition1 = null;

        PieParser.statement_return statement2 = null;


        PieAST EOF3_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_functionDefinition=new RewriteRuleSubtreeStream(adaptor,"rule functionDefinition");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:26:2: ( ( functionDefinition | statement )+ EOF -> ^( BLOCK ( statement )+ ) )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:26:4: ( functionDefinition | statement )+ EOF
            {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:26:4: ( functionDefinition | statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DEF) ) {
                    alt1=1;
                }
                else if ( (LA1_0==IF||(LA1_0>=PRINT && LA1_0<=RETURN)||LA1_0==STRUCT||(LA1_0>=ID && LA1_0<=NL)) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:26:6: functionDefinition
            	    {
            	    pushFollow(FOLLOW_functionDefinition_in_program124);
            	    functionDefinition1=functionDefinition();

            	    state._fsp--;

            	    stream_functionDefinition.add(functionDefinition1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:26:27: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program128);
            	    statement2=statement();

            	    state._fsp--;

            	    stream_statement.add(statement2.getTree());

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

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program133);  
            stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (PieAST)adaptor.nil();
            // 27:3: -> ^( BLOCK ( statement )+ )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:27:6: ^( BLOCK ( statement )+ )
                {
                PieAST root_1 = (PieAST)adaptor.nil();
                root_1 = (PieAST)adaptor.becomeRoot((PieAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                if ( !(stream_statement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
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

            retval.tree = (PieAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (PieAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class structDefinition_return extends ParserRuleReturnScope {
        PieAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structDefinition"
    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:30:1: structDefinition : 'struct' name= ID '{' vardef ( ',' vardef )* '}' NL ->;
    public final PieParser.structDefinition_return structDefinition() throws RecognitionException {
        PieParser.structDefinition_return retval = new PieParser.structDefinition_return();
        retval.start = input.LT(1);

        PieAST root_0 = null;

        Token name=null;
        Token string_literal4=null;
        Token char_literal5=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token NL10=null;
        PieParser.vardef_return vardef6 = null;

        PieParser.vardef_return vardef8 = null;


        PieAST name_tree=null;
        PieAST string_literal4_tree=null;
        PieAST char_literal5_tree=null;
        PieAST char_literal7_tree=null;
        PieAST char_literal9_tree=null;
        PieAST NL10_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_STRUCT=new RewriteRuleTokenStream(adaptor,"token STRUCT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_vardef=new RewriteRuleSubtreeStream(adaptor,"rule vardef");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:31:5: ( 'struct' name= ID '{' vardef ( ',' vardef )* '}' NL ->)
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:31:9: 'struct' name= ID '{' vardef ( ',' vardef )* '}' NL
            {
            string_literal4=(Token)match(input,STRUCT,FOLLOW_STRUCT_in_structDefinition162);  
            stream_STRUCT.add(string_literal4);

            name=(Token)match(input,ID,FOLLOW_ID_in_structDefinition166);  
            stream_ID.add(name);

            char_literal5=(Token)match(input,31,FOLLOW_31_in_structDefinition168);  
            stream_31.add(char_literal5);


                	StructSymbol ss = new StructSymbol((name!=null?name.getText():null), currentScope);
                    currentScope.define(ss); // def struct in current scope
                    currentScope = ss;       // set current scope to struct scope
            		
            pushFollow(FOLLOW_vardef_in_structDefinition180);
            vardef6=vardef();

            state._fsp--;

            stream_vardef.add(vardef6.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:37:10: ( ',' vardef )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==32) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:37:11: ',' vardef
            	    {
            	    char_literal7=(Token)match(input,32,FOLLOW_32_in_structDefinition183);  
            	    stream_32.add(char_literal7);

            	    pushFollow(FOLLOW_vardef_in_structDefinition185);
            	    vardef8=vardef();

            	    state._fsp--;

            	    stream_vardef.add(vardef8.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            char_literal9=(Token)match(input,33,FOLLOW_33_in_structDefinition189);  
            stream_33.add(char_literal9);

            NL10=(Token)match(input,NL,FOLLOW_NL_in_structDefinition191);  
            stream_NL.add(NL10);

            currentScope = currentScope.getEnclosingScope();


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (PieAST)adaptor.nil();
            // 39:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (PieAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (PieAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "structDefinition"

    public static class functionDefinition_return extends ParserRuleReturnScope {
        PieAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDefinition"
    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:42:1: functionDefinition : 'def' ID '(' ( vardef ( ',' vardef )* )? ')' slist ->;
    public final PieParser.functionDefinition_return functionDefinition() throws RecognitionException {
        PieParser.functionDefinition_return retval = new PieParser.functionDefinition_return();
        retval.start = input.LT(1);

        PieAST root_0 = null;

        Token string_literal11=null;
        Token ID12=null;
        Token char_literal13=null;
        Token char_literal15=null;
        Token char_literal17=null;
        PieParser.vardef_return vardef14 = null;

        PieParser.vardef_return vardef16 = null;

        PieParser.slist_return slist18 = null;


        PieAST string_literal11_tree=null;
        PieAST ID12_tree=null;
        PieAST char_literal13_tree=null;
        PieAST char_literal15_tree=null;
        PieAST char_literal17_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_DEF=new RewriteRuleTokenStream(adaptor,"token DEF");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_vardef=new RewriteRuleSubtreeStream(adaptor,"rule vardef");
        RewriteRuleSubtreeStream stream_slist=new RewriteRuleSubtreeStream(adaptor,"rule slist");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:43:2: ( 'def' ID '(' ( vardef ( ',' vardef )* )? ')' slist ->)
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:43:4: 'def' ID '(' ( vardef ( ',' vardef )* )? ')' slist
            {
            string_literal11=(Token)match(input,DEF,FOLLOW_DEF_in_functionDefinition214);  
            stream_DEF.add(string_literal11);

            ID12=(Token)match(input,ID,FOLLOW_ID_in_functionDefinition216);  
            stream_ID.add(ID12);


                    FunctionSymbol fs = new FunctionSymbol((ID12!=null?ID12.getText():null),currentScope);
                    currentScope.define(fs); // def method in globals
                    currentScope = fs;       // set current scope to method scope
                    
            char_literal13=(Token)match(input,34,FOLLOW_34_in_functionDefinition231);  
            stream_34.add(char_literal13);

            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:49:13: ( vardef ( ',' vardef )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:49:14: vardef ( ',' vardef )*
                    {
                    pushFollow(FOLLOW_vardef_in_functionDefinition234);
                    vardef14=vardef();

                    state._fsp--;

                    stream_vardef.add(vardef14.getTree());
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:49:21: ( ',' vardef )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==32) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:49:22: ',' vardef
                    	    {
                    	    char_literal15=(Token)match(input,32,FOLLOW_32_in_functionDefinition237);  
                    	    stream_32.add(char_literal15);

                    	    pushFollow(FOLLOW_vardef_in_functionDefinition239);
                    	    vardef16=vardef();

                    	    state._fsp--;

                    	    stream_vardef.add(vardef16.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal17=(Token)match(input,35,FOLLOW_35_in_functionDefinition246);  
            stream_35.add(char_literal17);

            currentScope = new LocalScope(fs);
            pushFollow(FOLLOW_slist_in_functionDefinition254);
            slist18=slist();

            state._fsp--;

            stream_slist.add(slist18.getTree());

            		fs.blockAST = (slist18!=null?((PieAST)slist18.tree):null);
            		currentScope = currentScope.getEnclosingScope();
            		currentScope = currentScope.getEnclosingScope();
            		


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (PieAST)adaptor.nil();
            // 57:3: ->
            {
                root_0 = null;
            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (PieAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (PieAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionDefinition"

    public static class slist_return extends ParserRuleReturnScope {
        PieAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slist"
    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:60:1: slist : ( ':' NL ( statement )+ '.' NL -> ^( BLOCK ( statement )+ ) | statement -> ^( BLOCK statement ) );
    public final PieParser.slist_return slist() throws RecognitionException {
        PieParser.slist_return retval = new PieParser.slist_return();
        retval.start = input.LT(1);

        PieAST root_0 = null;

        Token char_literal19=null;
        Token NL20=null;
        Token char_literal22=null;
        Token NL23=null;
        PieParser.statement_return statement21 = null;

        PieParser.statement_return statement24 = null;


        PieAST char_literal19_tree=null;
        PieAST NL20_tree=null;
        PieAST char_literal22_tree=null;
        PieAST NL23_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:61:2: ( ':' NL ( statement )+ '.' NL -> ^( BLOCK ( statement )+ ) | statement -> ^( BLOCK statement ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==36) ) {
                alt6=1;
            }
            else if ( (LA6_0==IF||(LA6_0>=PRINT && LA6_0<=RETURN)||LA6_0==STRUCT||(LA6_0>=ID && LA6_0<=NL)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:61:4: ':' NL ( statement )+ '.' NL
                    {
                    char_literal19=(Token)match(input,36,FOLLOW_36_in_slist274);  
                    stream_36.add(char_literal19);

                    NL20=(Token)match(input,NL,FOLLOW_NL_in_slist276);  
                    stream_NL.add(NL20);

                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:61:11: ( statement )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==IF||(LA5_0>=PRINT && LA5_0<=RETURN)||LA5_0==STRUCT||(LA5_0>=ID && LA5_0<=NL)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:61:11: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_slist278);
                    	    statement21=statement();

                    	    state._fsp--;

                    	    stream_statement.add(statement21.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    char_literal22=(Token)match(input,DOT,FOLLOW_DOT_in_slist281);  
                    stream_DOT.add(char_literal22);

                    NL23=(Token)match(input,NL,FOLLOW_NL_in_slist283);  
                    stream_NL.add(NL23);



                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (PieAST)adaptor.nil();
                    // 61:29: -> ^( BLOCK ( statement )+ )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:61:32: ^( BLOCK ( statement )+ )
                        {
                        PieAST root_1 = (PieAST)adaptor.nil();
                        root_1 = (PieAST)adaptor.becomeRoot((PieAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                        if ( !(stream_statement.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:62:4: statement
                    {
                    pushFollow(FOLLOW_statement_in_slist297);
                    statement24=statement();

                    state._fsp--;

                    stream_statement.add(statement24.getTree());


                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (PieAST)adaptor.nil();
                    // 62:18: -> ^( BLOCK statement )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:62:21: ^( BLOCK statement )
                        {
                        PieAST root_1 = (PieAST)adaptor.nil();
                        root_1 = (PieAST)adaptor.becomeRoot((PieAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (PieAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (PieAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "slist"

    public static class statement_return extends ParserRuleReturnScope {
        PieAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:65:1: statement : ( structDefinition | qid '=' expr NL -> ^( '=' qid expr ) | 'return' expr NL -> ^( 'return' expr ) | 'print' expr NL -> ^( 'print' expr ) | 'if' expr c= slist ( 'else' el= slist )? -> ^( 'if' expr $c ( $el)? ) | 'while' expr slist -> ^( 'while' expr slist ) | call NL -> call | NL ->);
    public final PieParser.statement_return statement() throws RecognitionException {
        PieParser.statement_return retval = new PieParser.statement_return();
        retval.start = input.LT(1);

        PieAST root_0 = null;

        Token char_literal27=null;
        Token NL29=null;
        Token string_literal30=null;
        Token NL32=null;
        Token string_literal33=null;
        Token NL35=null;
        Token string_literal36=null;
        Token string_literal38=null;
        Token string_literal39=null;
        Token NL43=null;
        Token NL44=null;
        PieParser.slist_return c = null;

        PieParser.slist_return el = null;

        PieParser.structDefinition_return structDefinition25 = null;

        PieParser.qid_return qid26 = null;

        PieParser.expr_return expr28 = null;

        PieParser.expr_return expr31 = null;

        PieParser.expr_return expr34 = null;

        PieParser.expr_return expr37 = null;

        PieParser.expr_return expr40 = null;

        PieParser.slist_return slist41 = null;

        PieParser.call_return call42 = null;


        PieAST char_literal27_tree=null;
        PieAST NL29_tree=null;
        PieAST string_literal30_tree=null;
        PieAST NL32_tree=null;
        PieAST string_literal33_tree=null;
        PieAST NL35_tree=null;
        PieAST string_literal36_tree=null;
        PieAST string_literal38_tree=null;
        PieAST string_literal39_tree=null;
        PieAST NL43_tree=null;
        PieAST NL44_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_qid=new RewriteRuleSubtreeStream(adaptor,"rule qid");
        RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_slist=new RewriteRuleSubtreeStream(adaptor,"rule slist");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:66:2: ( structDefinition | qid '=' expr NL -> ^( '=' qid expr ) | 'return' expr NL -> ^( 'return' expr ) | 'print' expr NL -> ^( 'print' expr ) | 'if' expr c= slist ( 'else' el= slist )? -> ^( 'if' expr $c ( $el)? ) | 'while' expr slist -> ^( 'while' expr slist ) | call NL -> call | NL ->)
            int alt8=8;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:66:4: structDefinition
                    {
                    root_0 = (PieAST)adaptor.nil();

                    pushFollow(FOLLOW_structDefinition_in_statement320);
                    structDefinition25=structDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, structDefinition25.getTree());

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:67:4: qid '=' expr NL
                    {
                    pushFollow(FOLLOW_qid_in_statement325);
                    qid26=qid();

                    state._fsp--;

                    stream_qid.add(qid26.getTree());
                    char_literal27=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement327);  
                    stream_ASSIGN.add(char_literal27);

                    pushFollow(FOLLOW_expr_in_statement329);
                    expr28=expr();

                    state._fsp--;

                    stream_expr.add(expr28.getTree());
                    NL29=(Token)match(input,NL,FOLLOW_NL_in_statement331);  
                    stream_NL.add(NL29);



                    // AST REWRITE
                    // elements: ASSIGN, qid, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (PieAST)adaptor.nil();
                    // 67:23: -> ^( '=' qid expr )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:67:26: ^( '=' qid expr )
                        {
                        PieAST root_1 = (PieAST)adaptor.nil();
                        root_1 = (PieAST)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_qid.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:68:4: 'return' expr NL
                    {
                    string_literal30=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement349);  
                    stream_RETURN.add(string_literal30);

                    pushFollow(FOLLOW_expr_in_statement351);
                    expr31=expr();

                    state._fsp--;

                    stream_expr.add(expr31.getTree());
                    NL32=(Token)match(input,NL,FOLLOW_NL_in_statement353);  
                    stream_NL.add(NL32);



                    // AST REWRITE
                    // elements: expr, RETURN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (PieAST)adaptor.nil();
                    // 68:25: -> ^( 'return' expr )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:68:28: ^( 'return' expr )
                        {
                        PieAST root_1 = (PieAST)adaptor.nil();
                        root_1 = (PieAST)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:69:4: 'print' expr NL
                    {
                    string_literal33=(Token)match(input,PRINT,FOLLOW_PRINT_in_statement370);  
                    stream_PRINT.add(string_literal33);

                    pushFollow(FOLLOW_expr_in_statement372);
                    expr34=expr();

                    state._fsp--;

                    stream_expr.add(expr34.getTree());
                    NL35=(Token)match(input,NL,FOLLOW_NL_in_statement374);  
                    stream_NL.add(NL35);



                    // AST REWRITE
                    // elements: PRINT, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (PieAST)adaptor.nil();
                    // 69:24: -> ^( 'print' expr )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:69:27: ^( 'print' expr )
                        {
                        PieAST root_1 = (PieAST)adaptor.nil();
                        root_1 = (PieAST)adaptor.becomeRoot(stream_PRINT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:70:4: 'if' expr c= slist ( 'else' el= slist )?
                    {
                    string_literal36=(Token)match(input,IF,FOLLOW_IF_in_statement391);  
                    stream_IF.add(string_literal36);

                    pushFollow(FOLLOW_expr_in_statement393);
                    expr37=expr();

                    state._fsp--;

                    stream_expr.add(expr37.getTree());
                    pushFollow(FOLLOW_slist_in_statement397);
                    c=slist();

                    state._fsp--;

                    stream_slist.add(c.getTree());
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:70:22: ( 'else' el= slist )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==37) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:70:23: 'else' el= slist
                            {
                            string_literal38=(Token)match(input,37,FOLLOW_37_in_statement400);  
                            stream_37.add(string_literal38);

                            pushFollow(FOLLOW_slist_in_statement404);
                            el=slist();

                            state._fsp--;

                            stream_slist.add(el.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: c, expr, el, IF
                    // token labels: 
                    // rule labels: el, c, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_el=new RewriteRuleSubtreeStream(adaptor,"rule el",el!=null?el.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (PieAST)adaptor.nil();
                    // 70:41: -> ^( 'if' expr $c ( $el)? )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:70:44: ^( 'if' expr $c ( $el)? )
                        {
                        PieAST root_1 = (PieAST)adaptor.nil();
                        root_1 = (PieAST)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        adaptor.addChild(root_1, stream_c.nextTree());
                        // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:70:59: ( $el)?
                        if ( stream_el.hasNext() ) {
                            adaptor.addChild(root_1, stream_el.nextTree());

                        }
                        stream_el.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:71:4: 'while' expr slist
                    {
                    string_literal39=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement426);  
                    stream_WHILE.add(string_literal39);

                    pushFollow(FOLLOW_expr_in_statement428);
                    expr40=expr();

                    state._fsp--;

                    stream_expr.add(expr40.getTree());
                    pushFollow(FOLLOW_slist_in_statement430);
                    slist41=slist();

                    state._fsp--;

                    stream_slist.add(slist41.getTree());


                    // AST REWRITE
                    // elements: slist, expr, WHILE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (PieAST)adaptor.nil();
                    // 71:25: -> ^( 'while' expr slist )
                    {
                        // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:71:28: ^( 'while' expr slist )
                        {
                        PieAST root_1 = (PieAST)adaptor.nil();
                        root_1 = (PieAST)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        adaptor.addChild(root_1, stream_slist.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:72:4: call NL
                    {
                    pushFollow(FOLLOW_call_in_statement447);
                    call42=call();

                    state._fsp--;

                    stream_call.add(call42.getTree());
                    NL43=(Token)match(input,NL,FOLLOW_NL_in_statement449);  
                    stream_NL.add(NL43);



                    // AST REWRITE
                    // elements: call
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (PieAST)adaptor.nil();
                    // 72:17: -> call
                    {
                        adaptor.addChild(root_0, stream_call.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:73:4: NL
                    {
                    NL44=(Token)match(input,NL,FOLLOW_NL_in_statement463);  
                    stream_NL.add(NL44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (PieAST)adaptor.nil();
                    // 73:13: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (PieAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (PieAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class call_return extends ParserRuleReturnScope {
        PieAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:76:1: call : name= ID '(' ( expr ( ',' expr )* )? ')' -> ^( CALL ID ( expr )* ) ;
    public final PieParser.call_return call() throws RecognitionException {
        PieParser.call_return retval = new PieParser.call_return();
        retval.start = input.LT(1);

        PieAST root_0 = null;

        Token name=null;
        Token char_literal45=null;
        Token char_literal47=null;
        Token char_literal49=null;
        PieParser.expr_return expr46 = null;

        PieParser.expr_return expr48 = null;


        PieAST name_tree=null;
        PieAST char_literal45_tree=null;
        PieAST char_literal47_tree=null;
        PieAST char_literal49_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:81:2: (name= ID '(' ( expr ( ',' expr )* )? ')' -> ^( CALL ID ( expr )* ) )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:81:4: name= ID '(' ( expr ( ',' expr )* )? ')'
            {
            name=(Token)match(input,ID,FOLLOW_ID_in_call489);  
            stream_ID.add(name);

            char_literal45=(Token)match(input,34,FOLLOW_34_in_call491);  
            stream_34.add(char_literal45);

            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:81:16: ( expr ( ',' expr )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=NEW && LA10_0<=ID)||(LA10_0>=INT && LA10_0<=STRING)||LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:81:17: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_call494);
                    expr46=expr();

                    state._fsp--;

                    stream_expr.add(expr46.getTree());
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:81:22: ( ',' expr )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==32) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:81:23: ',' expr
                    	    {
                    	    char_literal47=(Token)match(input,32,FOLLOW_32_in_call497);  
                    	    stream_32.add(char_literal47);

                    	    pushFollow(FOLLOW_expr_in_call499);
                    	    expr48=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr48.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal49=(Token)match(input,35,FOLLOW_35_in_call506);  
            stream_35.add(char_literal49);



            // AST REWRITE
            // elements: expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (PieAST)adaptor.nil();
            // 81:41: -> ^( CALL ID ( expr )* )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:81:44: ^( CALL ID ( expr )* )
                {
                PieAST root_1 = (PieAST)adaptor.nil();
                root_1 = (PieAST)adaptor.becomeRoot((PieAST)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:81:54: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (PieAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            	((PieAST)retval.tree).scope = currentScope;
            	//((PieAST)retval.tree).symbol = currentScope.resolve((name!=null?name.getText():null));

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (PieAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class expr_return extends ParserRuleReturnScope {
        PieAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:83:1: expr : addexpr ( ( '==' | '<' ) addexpr )? ;
    public final PieParser.expr_return expr() throws RecognitionException {
        PieParser.expr_return retval = new PieParser.expr_return();
        retval.start = input.LT(1);

        PieAST root_0 = null;

        Token set51=null;
        PieParser.addexpr_return addexpr50 = null;

        PieParser.addexpr_return addexpr52 = null;


        PieAST set51_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:83:5: ( addexpr ( ( '==' | '<' ) addexpr )? )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:83:7: addexpr ( ( '==' | '<' ) addexpr )?
            {
            root_0 = (PieAST)adaptor.nil();

            pushFollow(FOLLOW_addexpr_in_expr525);
            addexpr50=addexpr();

            state._fsp--;

            adaptor.addChild(root_0, addexpr50.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:83:15: ( ( '==' | '<' ) addexpr )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=EQ && LA11_0<=LT)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:83:16: ( '==' | '<' ) addexpr
                    {
                    set51=(Token)input.LT(1);
                    set51=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQ && input.LA(1)<=LT) ) {
                        input.consume();
                        root_0 = (PieAST)adaptor.becomeRoot((PieAST)adaptor.create(set51), root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_addexpr_in_expr535);
                    addexpr52=addexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, addexpr52.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (PieAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (PieAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class addexpr_return extends ParserRuleReturnScope {
        PieAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addexpr"
    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:85:1: addexpr : mulexpr ( ( '+' | '-' ) mulexpr )* ;
    public final PieParser.addexpr_return addexpr() throws RecognitionException {
        PieParser.addexpr_return retval = new PieParser.addexpr_return();
        retval.start = input.LT(1);

        PieAST root_0 = null;

        Token set54=null;
        PieParser.mulexpr_return mulexpr53 = null;

        PieParser.mulexpr_return mulexpr55 = null;


        PieAST set54_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:86:2: ( mulexpr ( ( '+' | '-' ) mulexpr )* )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:86:4: mulexpr ( ( '+' | '-' ) mulexpr )*
            {
            root_0 = (PieAST)adaptor.nil();

            pushFollow(FOLLOW_mulexpr_in_addexpr547);
            mulexpr53=mulexpr();

            state._fsp--;

            adaptor.addChild(root_0, mulexpr53.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:86:12: ( ( '+' | '-' ) mulexpr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=ADD && LA12_0<=SUB)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:86:13: ( '+' | '-' ) mulexpr
            	    {
            	    set54=(Token)input.LT(1);
            	    set54=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        root_0 = (PieAST)adaptor.becomeRoot((PieAST)adaptor.create(set54), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mulexpr_in_addexpr557);
            	    mulexpr55=mulexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mulexpr55.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (PieAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (PieAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addexpr"

    public static class mulexpr_return extends ParserRuleReturnScope {
        PieAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mulexpr"
    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:89:1: mulexpr : atom ( '*' atom )* ;
    public final PieParser.mulexpr_return mulexpr() throws RecognitionException {
        PieParser.mulexpr_return retval = new PieParser.mulexpr_return();
        retval.start = input.LT(1);

        PieAST root_0 = null;

        Token char_literal57=null;
        PieParser.atom_return atom56 = null;

        PieParser.atom_return atom58 = null;


        PieAST char_literal57_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:90:2: ( atom ( '*' atom )* )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:90:4: atom ( '*' atom )*
            {
            root_0 = (PieAST)adaptor.nil();

            pushFollow(FOLLOW_atom_in_mulexpr571);
            atom56=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom56.getTree());
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:90:9: ( '*' atom )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==MUL) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:90:10: '*' atom
            	    {
            	    char_literal57=(Token)match(input,MUL,FOLLOW_MUL_in_mulexpr574); 
            	    char_literal57_tree = (PieAST)adaptor.create(char_literal57);
            	    root_0 = (PieAST)adaptor.becomeRoot(char_literal57_tree, root_0);

            	    pushFollow(FOLLOW_atom_in_mulexpr577);
            	    atom58=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom58.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (PieAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (PieAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mulexpr"

    public static class atom_return extends ParserRuleReturnScope {
        PieAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:93:1: atom : ( INT | CHAR | FLOAT | STRING | qid | call | instance | '(' expr ')' -> expr );
    public final PieParser.atom_return atom() throws RecognitionException {
        PieParser.atom_return retval = new PieParser.atom_return();
        retval.start = input.LT(1);

        PieAST root_0 = null;

        Token INT59=null;
        Token CHAR60=null;
        Token FLOAT61=null;
        Token STRING62=null;
        Token char_literal66=null;
        Token char_literal68=null;
        PieParser.qid_return qid63 = null;

        PieParser.call_return call64 = null;

        PieParser.instance_return instance65 = null;

        PieParser.expr_return expr67 = null;


        PieAST INT59_tree=null;
        PieAST CHAR60_tree=null;
        PieAST FLOAT61_tree=null;
        PieAST STRING62_tree=null;
        PieAST char_literal66_tree=null;
        PieAST char_literal68_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:94:2: ( INT | CHAR | FLOAT | STRING | qid | call | instance | '(' expr ')' -> expr )
            int alt14=8;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:94:4: INT
                    {
                    root_0 = (PieAST)adaptor.nil();

                    INT59=(Token)match(input,INT,FOLLOW_INT_in_atom591); 
                    INT59_tree = (PieAST)adaptor.create(INT59);
                    adaptor.addChild(root_0, INT59_tree);


                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:95:4: CHAR
                    {
                    root_0 = (PieAST)adaptor.nil();

                    CHAR60=(Token)match(input,CHAR,FOLLOW_CHAR_in_atom602); 
                    CHAR60_tree = (PieAST)adaptor.create(CHAR60);
                    adaptor.addChild(root_0, CHAR60_tree);


                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:96:4: FLOAT
                    {
                    root_0 = (PieAST)adaptor.nil();

                    FLOAT61=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom612); 
                    FLOAT61_tree = (PieAST)adaptor.create(FLOAT61);
                    adaptor.addChild(root_0, FLOAT61_tree);


                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:97:4: STRING
                    {
                    root_0 = (PieAST)adaptor.nil();

                    STRING62=(Token)match(input,STRING,FOLLOW_STRING_in_atom622); 
                    STRING62_tree = (PieAST)adaptor.create(STRING62);
                    adaptor.addChild(root_0, STRING62_tree);


                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:98:4: qid
                    {
                    root_0 = (PieAST)adaptor.nil();

                    pushFollow(FOLLOW_qid_in_atom632);
                    qid63=qid();

                    state._fsp--;

                    adaptor.addChild(root_0, qid63.getTree());

                    }
                    break;
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:99:4: call
                    {
                    root_0 = (PieAST)adaptor.nil();

                    pushFollow(FOLLOW_call_in_atom643);
                    call64=call();

                    state._fsp--;

                    adaptor.addChild(root_0, call64.getTree());

                    }
                    break;
                case 7 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:100:4: instance
                    {
                    root_0 = (PieAST)adaptor.nil();

                    pushFollow(FOLLOW_instance_in_atom648);
                    instance65=instance();

                    state._fsp--;

                    adaptor.addChild(root_0, instance65.getTree());

                    }
                    break;
                case 8 :
                    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:101:4: '(' expr ')'
                    {
                    char_literal66=(Token)match(input,34,FOLLOW_34_in_atom653);  
                    stream_34.add(char_literal66);

                    pushFollow(FOLLOW_expr_in_atom655);
                    expr67=expr();

                    state._fsp--;

                    stream_expr.add(expr67.getTree());
                    char_literal68=(Token)match(input,35,FOLLOW_35_in_atom657);  
                    stream_35.add(char_literal68);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (PieAST)adaptor.nil();
                    // 101:17: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (PieAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (PieAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class instance_return extends ParserRuleReturnScope {
        PieAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instance"
    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:104:1: instance : 'new' sname= ID -> ^( 'new' ID ) ;
    public final PieParser.instance_return instance() throws RecognitionException {
        PieParser.instance_return retval = new PieParser.instance_return();
        retval.start = input.LT(1);

        PieAST root_0 = null;

        Token sname=null;
        Token string_literal69=null;

        PieAST sname_tree=null;
        PieAST string_literal69_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:109:2: ( 'new' sname= ID -> ^( 'new' ID ) )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:109:4: 'new' sname= ID
            {
            string_literal69=(Token)match(input,NEW,FOLLOW_NEW_in_instance677);  
            stream_NEW.add(string_literal69);

            sname=(Token)match(input,ID,FOLLOW_ID_in_instance681);  
            stream_ID.add(sname);



            // AST REWRITE
            // elements: ID, NEW
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (PieAST)adaptor.nil();
            // 110:3: -> ^( 'new' ID )
            {
                // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:110:6: ^( 'new' ID )
                {
                PieAST root_1 = (PieAST)adaptor.nil();
                root_1 = (PieAST)adaptor.becomeRoot(stream_NEW.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (PieAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            	PieAST nameNode = (PieAST)((PieAST)retval.tree).getChild(0);
            	nameNode.scope = currentScope;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (PieAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instance"

    public static class qid_return extends ParserRuleReturnScope {
        PieAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qid"
    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:113:1: qid : ID ( '.' ID )* ;
    public final PieParser.qid_return qid() throws RecognitionException {
        PieParser.qid_return retval = new PieParser.qid_return();
        retval.start = input.LT(1);

        PieAST root_0 = null;

        Token ID70=null;
        Token char_literal71=null;
        Token ID72=null;

        PieAST ID70_tree=null;
        PieAST char_literal71_tree=null;
        PieAST ID72_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:113:5: ( ID ( '.' ID )* )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:113:7: ID ( '.' ID )*
            {
            root_0 = (PieAST)adaptor.nil();

            ID70=(Token)match(input,ID,FOLLOW_ID_in_qid701); 
            ID70_tree = (PieAST)adaptor.create(ID70);
            adaptor.addChild(root_0, ID70_tree);

            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:113:10: ( '.' ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==DOT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:113:11: '.' ID
            	    {
            	    char_literal71=(Token)match(input,DOT,FOLLOW_DOT_in_qid704); 
            	    char_literal71_tree = (PieAST)adaptor.create(char_literal71);
            	    root_0 = (PieAST)adaptor.becomeRoot(char_literal71_tree, root_0);

            	    ID72=(Token)match(input,ID,FOLLOW_ID_in_qid707); 
            	    ID72_tree = (PieAST)adaptor.create(ID72);
            	    adaptor.addChild(root_0, ID72_tree);


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (PieAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (PieAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "qid"

    public static class vardef_return extends ParserRuleReturnScope {
        PieAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vardef"
    // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:115:1: vardef : ID ;
    public final PieParser.vardef_return vardef() throws RecognitionException {
        PieParser.vardef_return retval = new PieParser.vardef_return();
        retval.start = input.LT(1);

        PieAST root_0 = null;

        Token ID73=null;

        PieAST ID73_tree=null;

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:116:2: ( ID )
            // /Users/parrt/research/book/TPDSL/Book/code/interp/tree/Pie.g:116:4: ID
            {
            root_0 = (PieAST)adaptor.nil();

            ID73=(Token)match(input,ID,FOLLOW_ID_in_vardef721); 
            ID73_tree = (PieAST)adaptor.create(ID73);
            adaptor.addChild(root_0, ID73_tree);


            		ID73_tree.scope = currentScope;
            		VariableSymbol vs = new VariableSymbol((ID73!=null?ID73.getText():null));
            		currentScope.define(vs);
            		

            }

            retval.stop = input.LT(-1);

            retval.tree = (PieAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (PieAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vardef"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\12\uffff";
    static final String DFA8_minS =
        "\1\10\1\uffff\1\11\7\uffff";
    static final String DFA8_maxS =
        "\1\27\1\uffff\1\42\7\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\10\1\7\1\2";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\5\1\uffff\1\4\1\6\1\3\6\uffff\1\1\2\uffff\1\2\1\7",
            "",
            "\1\11\12\uffff\1\11\15\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "65:1: statement : ( structDefinition | qid '=' expr NL -> ^( '=' qid expr ) | 'return' expr NL -> ^( 'return' expr ) | 'print' expr NL -> ^( 'print' expr ) | 'if' expr c= slist ( 'else' el= slist )? -> ^( 'if' expr $c ( $el)? ) | 'while' expr slist -> ^( 'while' expr slist ) | call NL -> call | NL ->);";
        }
    }
    static final String DFA14_eotS =
        "\12\uffff";
    static final String DFA14_eofS =
        "\12\uffff";
    static final String DFA14_minS =
        "\1\25\4\uffff\1\10\4\uffff";
    static final String DFA14_maxS =
        "\1\42\4\uffff\1\44\4\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\6\1\5";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\6\1\5\1\uffff\1\1\1\2\1\3\1\4\6\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\11\1\uffff\3\11\1\uffff\7\11\1\uffff\2\11\10\uffff\1\11"+
            "\1\uffff\1\10\2\11",
            "",
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
            return "93:1: atom : ( INT | CHAR | FLOAT | STRING | qid | call | instance | '(' expr ')' -> expr );";
        }
    }
 

    public static final BitSet FOLLOW_functionDefinition_in_program124 = new BitSet(new long[]{0x0000000000C83D00L});
    public static final BitSet FOLLOW_statement_in_program128 = new BitSet(new long[]{0x0000000000C83D00L});
    public static final BitSet FOLLOW_EOF_in_program133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCT_in_structDefinition162 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_structDefinition166 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_structDefinition168 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_vardef_in_structDefinition180 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_structDefinition183 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_vardef_in_structDefinition185 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_structDefinition189 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NL_in_structDefinition191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_functionDefinition214 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_functionDefinition216 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_functionDefinition231 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_vardef_in_functionDefinition234 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_32_in_functionDefinition237 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_vardef_in_functionDefinition239 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_35_in_functionDefinition246 = new BitSet(new long[]{0x0000001000C83D00L});
    public static final BitSet FOLLOW_slist_in_functionDefinition254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_slist274 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NL_in_slist276 = new BitSet(new long[]{0x0000000000C83D00L});
    public static final BitSet FOLLOW_statement_in_slist278 = new BitSet(new long[]{0x0000000000D83D00L});
    public static final BitSet FOLLOW_DOT_in_slist281 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NL_in_slist283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_slist297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structDefinition_in_statement320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qid_in_statement325 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGN_in_statement327 = new BitSet(new long[]{0x000000040F600000L});
    public static final BitSet FOLLOW_expr_in_statement329 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NL_in_statement331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement349 = new BitSet(new long[]{0x000000040F600000L});
    public static final BitSet FOLLOW_expr_in_statement351 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NL_in_statement353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_statement370 = new BitSet(new long[]{0x000000040F600000L});
    public static final BitSet FOLLOW_expr_in_statement372 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NL_in_statement374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement391 = new BitSet(new long[]{0x000000040F600000L});
    public static final BitSet FOLLOW_expr_in_statement393 = new BitSet(new long[]{0x0000001000C83D00L});
    public static final BitSet FOLLOW_slist_in_statement397 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_statement400 = new BitSet(new long[]{0x0000001000C83D00L});
    public static final BitSet FOLLOW_slist_in_statement404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement426 = new BitSet(new long[]{0x000000040F600000L});
    public static final BitSet FOLLOW_expr_in_statement428 = new BitSet(new long[]{0x0000001000C83D00L});
    public static final BitSet FOLLOW_slist_in_statement430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_statement447 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NL_in_statement449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_statement463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_call489 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_call491 = new BitSet(new long[]{0x0000000C0F600000L});
    public static final BitSet FOLLOW_expr_in_call494 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_32_in_call497 = new BitSet(new long[]{0x000000040F600000L});
    public static final BitSet FOLLOW_expr_in_call499 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_35_in_call506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addexpr_in_expr525 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_expr528 = new BitSet(new long[]{0x000000040F600000L});
    public static final BitSet FOLLOW_addexpr_in_expr535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mulexpr_in_addexpr547 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_set_in_addexpr550 = new BitSet(new long[]{0x000000040F600000L});
    public static final BitSet FOLLOW_mulexpr_in_addexpr557 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_atom_in_mulexpr571 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_MUL_in_mulexpr574 = new BitSet(new long[]{0x000000040F600000L});
    public static final BitSet FOLLOW_atom_in_mulexpr577 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_INT_in_atom591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_atom602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qid_in_atom632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_atom643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_in_atom648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_atom653 = new BitSet(new long[]{0x000000040F600000L});
    public static final BitSet FOLLOW_expr_in_atom655 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_atom657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_instance677 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_instance681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_qid701 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_DOT_in_qid704 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_qid707 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ID_in_vardef721 = new BitSet(new long[]{0x0000000000000002L});

}