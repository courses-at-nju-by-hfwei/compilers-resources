/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.1.4-SNAPSHOT Apr 22, 2009 17:39:25 VecMath.g 2009-05-13 17:21:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class VecMathParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MULT", "SHIFT", "VEC", "ID", "INT", "WS", "'='", "'print'", "'+'", "'.'", "'['", "','", "']'", "'('", "')'"
    };
    public static final int VEC=6;
    public static final int WS=9;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int SHIFT=5;
    public static final int INT=8;
    public static final int MULT=4;
    public static final int ID=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public VecMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public VecMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return VecMathParser.tokenNames; }
    public String getGrammarFileName() { return "VecMath.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // VecMath.g:12:1: prog : ( stat )+ ;
    public final VecMathParser.prog_return prog() throws RecognitionException {
        VecMathParser.prog_return retval = new VecMathParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        VecMathParser.stat_return stat1 = null;



        try {
            // VecMath.g:12:5: ( ( stat )+ )
            // VecMath.g:12:7: ( stat )+
            {
            root_0 = (Object)adaptor.nil();

            // VecMath.g:12:7: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // VecMath.g:12:7: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog57);
            	    stat1=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat1.getTree());

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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class stat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stat"
    // VecMath.g:13:1: stat : ( ID '=' expr -> ^( '=' ID expr ) | 'print' expr -> ^( 'print' expr ) );
    public final VecMathParser.stat_return stat() throws RecognitionException {
        VecMathParser.stat_return retval = new VecMathParser.stat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID2=null;
        Token char_literal3=null;
        Token string_literal5=null;
        VecMathParser.expr_return expr4 = null;

        VecMathParser.expr_return expr6 = null;


        Object ID2_tree=null;
        Object char_literal3_tree=null;
        Object string_literal5_tree=null;
        RewriteRuleTokenStream stream_10=new RewriteRuleTokenStream(adaptor,"token 10");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_11=new RewriteRuleTokenStream(adaptor,"token 11");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // VecMath.g:13:5: ( ID '=' expr -> ^( '=' ID expr ) | 'print' expr -> ^( 'print' expr ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // VecMath.g:13:7: ID '=' expr
                    {
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_stat90);  
                    stream_ID.add(ID2);

                    char_literal3=(Token)match(input,10,FOLLOW_10_in_stat92);  
                    stream_10.add(char_literal3);

                    pushFollow(FOLLOW_expr_in_stat94);
                    expr4=expr();

                    state._fsp--;

                    stream_expr.add(expr4.getTree());


                    // AST REWRITE
                    // elements: ID, expr, 10
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 13:20: -> ^( '=' ID expr )
                    {
                        // VecMath.g:13:23: ^( '=' ID expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_10.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // VecMath.g:14:7: 'print' expr
                    {
                    string_literal5=(Token)match(input,11,FOLLOW_11_in_stat115);  
                    stream_11.add(string_literal5);

                    pushFollow(FOLLOW_expr_in_stat117);
                    expr6=expr();

                    state._fsp--;

                    stream_expr.add(expr6.getTree());


                    // AST REWRITE
                    // elements: expr, 11
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 14:20: -> ^( 'print' expr )
                    {
                        // VecMath.g:14:23: ^( 'print' expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_11.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stat"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // VecMath.g:19:1: expr : multExpr ( '+' multExpr )* ;
    public final VecMathParser.expr_return expr() throws RecognitionException {
        VecMathParser.expr_return retval = new VecMathParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal8=null;
        VecMathParser.multExpr_return multExpr7 = null;

        VecMathParser.multExpr_return multExpr9 = null;


        Object char_literal8_tree=null;

        try {
            // VecMath.g:19:5: ( multExpr ( '+' multExpr )* )
            // VecMath.g:19:7: multExpr ( '+' multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_expr140);
            multExpr7=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr7.getTree());
            // VecMath.g:19:16: ( '+' multExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // VecMath.g:19:17: '+' multExpr
            	    {
            	    char_literal8=(Token)match(input,12,FOLLOW_12_in_expr143); 
            	    char_literal8_tree = (Object)adaptor.create(char_literal8);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal8_tree, root_0);

            	    pushFollow(FOLLOW_multExpr_in_expr146);
            	    multExpr9=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr9.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // VecMath.g:21:1: multExpr : primary ( ( '*' | '.' ) primary )* ;
    public final VecMathParser.multExpr_return multExpr() throws RecognitionException {
        VecMathParser.multExpr_return retval = new VecMathParser.multExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal11=null;
        Token char_literal12=null;
        VecMathParser.primary_return primary10 = null;

        VecMathParser.primary_return primary13 = null;


        Object char_literal11_tree=null;
        Object char_literal12_tree=null;

        try {
            // VecMath.g:22:5: ( primary ( ( '*' | '.' ) primary )* )
            // VecMath.g:22:9: primary ( ( '*' | '.' ) primary )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_primary_in_multExpr168);
            primary10=primary();

            state._fsp--;

            adaptor.addChild(root_0, primary10.getTree());
            // VecMath.g:22:17: ( ( '*' | '.' ) primary )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==MULT||LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // VecMath.g:22:18: ( '*' | '.' ) primary
            	    {
            	    // VecMath.g:22:18: ( '*' | '.' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==MULT) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==13) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // VecMath.g:22:19: '*'
            	            {
            	            char_literal11=(Token)match(input,MULT,FOLLOW_MULT_in_multExpr172); 
            	            char_literal11_tree = (Object)adaptor.create(char_literal11);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal11_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // VecMath.g:22:24: '.'
            	            {
            	            char_literal12=(Token)match(input,13,FOLLOW_13_in_multExpr175); 
            	            char_literal12_tree = (Object)adaptor.create(char_literal12);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal12_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_primary_in_multExpr179);
            	    primary13=primary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, primary13.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class primary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary"
    // VecMath.g:25:1: primary : ( INT | ID | '[' expr ( ',' expr )* ']' -> ^( VEC ( expr )+ ) | '(' expr ')' -> expr );
    public final VecMathParser.primary_return primary() throws RecognitionException {
        VecMathParser.primary_return retval = new VecMathParser.primary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT14=null;
        Token ID15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token char_literal23=null;
        VecMathParser.expr_return expr17 = null;

        VecMathParser.expr_return expr19 = null;

        VecMathParser.expr_return expr22 = null;


        Object INT14_tree=null;
        Object ID15_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        Object char_literal20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // VecMath.g:26:5: ( INT | ID | '[' expr ( ',' expr )* ']' -> ^( VEC ( expr )+ ) | '(' expr ')' -> expr )
            int alt7=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt7=1;
                }
                break;
            case ID:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // VecMath.g:26:9: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT14=(Token)match(input,INT,FOLLOW_INT_in_primary206); 
                    INT14_tree = (Object)adaptor.create(INT14);
                    adaptor.addChild(root_0, INT14_tree);


                    }
                    break;
                case 2 :
                    // VecMath.g:27:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID15=(Token)match(input,ID,FOLLOW_ID_in_primary216); 
                    ID15_tree = (Object)adaptor.create(ID15);
                    adaptor.addChild(root_0, ID15_tree);


                    }
                    break;
                case 3 :
                    // VecMath.g:28:9: '[' expr ( ',' expr )* ']'
                    {
                    char_literal16=(Token)match(input,14,FOLLOW_14_in_primary226);  
                    stream_14.add(char_literal16);

                    pushFollow(FOLLOW_expr_in_primary228);
                    expr17=expr();

                    state._fsp--;

                    stream_expr.add(expr17.getTree());
                    // VecMath.g:28:18: ( ',' expr )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // VecMath.g:28:19: ',' expr
                    	    {
                    	    char_literal18=(Token)match(input,15,FOLLOW_15_in_primary231);  
                    	    stream_15.add(char_literal18);

                    	    pushFollow(FOLLOW_expr_in_primary233);
                    	    expr19=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr19.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    char_literal20=(Token)match(input,16,FOLLOW_16_in_primary237);  
                    stream_16.add(char_literal20);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 28:34: -> ^( VEC ( expr )+ )
                    {
                        // VecMath.g:28:37: ^( VEC ( expr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VEC, "VEC"), root_1);

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

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // VecMath.g:29:7: '(' expr ')'
                    {
                    char_literal21=(Token)match(input,17,FOLLOW_17_in_primary254);  
                    stream_17.add(char_literal21);

                    pushFollow(FOLLOW_expr_in_primary256);
                    expr22=expr();

                    state._fsp--;

                    stream_expr.add(expr22.getTree());
                    char_literal23=(Token)match(input,18,FOLLOW_18_in_primary258);  
                    stream_18.add(char_literal23);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 29:32: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primary"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog57 = new BitSet(new long[]{0x0000000000000882L});
    public static final BitSet FOLLOW_ID_in_stat90 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_stat92 = new BitSet(new long[]{0x0000000000024180L});
    public static final BitSet FOLLOW_expr_in_stat94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_stat115 = new BitSet(new long[]{0x0000000000024180L});
    public static final BitSet FOLLOW_expr_in_stat117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr140 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_expr143 = new BitSet(new long[]{0x0000000000024180L});
    public static final BitSet FOLLOW_multExpr_in_expr146 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_primary_in_multExpr168 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_MULT_in_multExpr172 = new BitSet(new long[]{0x0000000000024180L});
    public static final BitSet FOLLOW_13_in_multExpr175 = new BitSet(new long[]{0x0000000000024180L});
    public static final BitSet FOLLOW_primary_in_multExpr179 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_INT_in_primary206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_primary226 = new BitSet(new long[]{0x0000000000024180L});
    public static final BitSet FOLLOW_expr_in_primary228 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_primary231 = new BitSet(new long[]{0x0000000000024180L});
    public static final BitSet FOLLOW_expr_in_primary233 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_primary237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_primary254 = new BitSet(new long[]{0x0000000000024180L});
    public static final BitSet FOLLOW_expr_in_primary256 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_primary258 = new BitSet(new long[]{0x0000000000000002L});

}