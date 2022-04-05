/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.1.4-SNAPSHOT Apr 22, 2009 17:39:25 Simplify.g 2009-05-13 17:21:46

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Simplify extends TreeRewriter {
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


        public Simplify(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Simplify(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Simplify.tokenNames; }
    public String getGrammarFileName() { return "Simplify.g"; }


    public static class topdown_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topdown"
    // Simplify.g:11:1: topdown : scalarVectorMult ;
    public final Simplify.topdown_return topdown() throws RecognitionException {
        Simplify.topdown_return retval = new Simplify.topdown_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        Simplify.scalarVectorMult_return scalarVectorMult1 = null;



        try {
            // Simplify.g:11:9: ( scalarVectorMult )
            // Simplify.g:11:11: scalarVectorMult
            {
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_scalarVectorMult_in_topdown103);
            scalarVectorMult1=scalarVectorMult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==1 ) 
             
            if ( _first_0==null ) _first_0 = scalarVectorMult1.tree;

            if ( state.backtracking==1 ) {
            retval.tree = (CommonTree)_first_0;
            if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
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
    // $ANTLR end "topdown"

    public static class bottomup_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bottomup"
    // Simplify.g:12:1: bottomup : ( zeroX | xZero );
    public final Simplify.bottomup_return bottomup() throws RecognitionException {
        Simplify.bottomup_return retval = new Simplify.bottomup_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        Simplify.zeroX_return zeroX2 = null;

        Simplify.xZero_return xZero3 = null;



        try {
            // Simplify.g:12:9: ( zeroX | xZero )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==MULT) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==INT) ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3==INT) ) {
                            int LA1_4 = input.LA(5);

                            if ( (LA1_4==UP) ) {
                                int LA1_5 = input.LA(6);

                                if ( (synpred1_Simplify()) ) {
                                    alt1=1;
                                }
                                else if ( (true) ) {
                                    alt1=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // Simplify.g:12:11: zeroX
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_zeroX_in_bottomup111);
                    zeroX2=zeroX();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = zeroX2.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 2 :
                    // Simplify.g:12:19: xZero
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_xZero_in_bottomup115);
                    xZero3=xZero();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = xZero3.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
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
        return retval;
    }
    // $ANTLR end "bottomup"

    public static class scalarVectorMult_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scalarVectorMult"
    // Simplify.g:16:1: scalarVectorMult : ^( '*' INT ^( VEC (e+= . )+ ) ) -> ^( VEC ( ^( '*' INT $e) )+ ) ;
    public final Simplify.scalarVectorMult_return scalarVectorMult() throws RecognitionException {
        Simplify.scalarVectorMult_return retval = new Simplify.scalarVectorMult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree char_literal4=null;
        CommonTree INT5=null;
        CommonTree VEC6=null;
        CommonTree e=null;
        List list_e=null;

        CommonTree char_literal4_tree=null;
        CommonTree INT5_tree=null;
        CommonTree VEC6_tree=null;
        CommonTree e_tree=null;
        RewriteRuleNodeStream stream_VEC=new RewriteRuleNodeStream(adaptor,"token VEC");
        RewriteRuleNodeStream stream_INT=new RewriteRuleNodeStream(adaptor,"token INT");
        RewriteRuleNodeStream stream_MULT=new RewriteRuleNodeStream(adaptor,"token MULT");

        try {
            // Simplify.g:16:18: ( ^( '*' INT ^( VEC (e+= . )+ ) ) -> ^( VEC ( ^( '*' INT $e) )+ ) )
            // Simplify.g:16:20: ^( '*' INT ^( VEC (e+= . )+ ) )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            char_literal4=(CommonTree)match(input,MULT,FOLLOW_MULT_in_scalarVectorMult127); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_MULT.add(char_literal4);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = char_literal4;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_scalarVectorMult129); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_INT.add(INT5);

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            _last = (CommonTree)input.LT(1);
            VEC6=(CommonTree)match(input,VEC,FOLLOW_VEC_in_scalarVectorMult132); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_VEC.add(VEC6);


            if ( state.backtracking==1 )
            if ( _first_1==null ) _first_1 = VEC6;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Simplify.g:16:36: (e+= . )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=MULT && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Simplify.g:16:37: e+= .
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    e=(CommonTree)input.LT(1);
            	    matchAny(input); if (state.failed) return retval;
            	     
            	    if ( state.backtracking==1 )
            	    if ( _first_2==null ) _first_2 = e;
            	    if (list_e==null) list_e=new ArrayList();
            	    list_e.add(e);


            	    if ( state.backtracking==1 ) {
            	    retval.tree = (CommonTree)_first_0;
            	    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
            	        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
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


            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
            }


            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
            }



            // AST REWRITE
            // elements: e, MULT, VEC, INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: e
            if ( state.backtracking==1 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"wildcard e",list_e);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 16:46: -> ^( VEC ( ^( '*' INT $e) )+ )
            {
                // Simplify.g:16:49: ^( VEC ( ^( '*' INT $e) )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_VEC.nextNode(), root_1);

                if ( !(stream_e.hasNext()||stream_MULT.hasNext()||stream_INT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_e.hasNext()||stream_MULT.hasNext()||stream_INT.hasNext() ) {
                    // Simplify.g:16:55: ^( '*' INT $e)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_MULT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_INT.nextNode());
                    adaptor.addChild(root_2, stream_e.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_e.reset();
                stream_MULT.reset();
                stream_INT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);}
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
    // $ANTLR end "scalarVectorMult"

    public static class zeroX_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zeroX"
    // Simplify.g:20:1: zeroX : ^( '*' a= INT b= INT {...}?) -> $a;
    public final Simplify.zeroX_return zeroX() throws RecognitionException {
        Simplify.zeroX_return retval = new Simplify.zeroX_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree a=null;
        CommonTree b=null;
        CommonTree char_literal7=null;

        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree char_literal7_tree=null;
        RewriteRuleNodeStream stream_INT=new RewriteRuleNodeStream(adaptor,"token INT");
        RewriteRuleNodeStream stream_MULT=new RewriteRuleNodeStream(adaptor,"token MULT");

        try {
            // Simplify.g:20:7: ( ^( '*' a= INT b= INT {...}?) -> $a)
            // Simplify.g:20:9: ^( '*' a= INT b= INT {...}?)
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            char_literal7=(CommonTree)match(input,MULT,FOLLOW_MULT_in_zeroX169); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_MULT.add(char_literal7);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = char_literal7;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            a=(CommonTree)match(input,INT,FOLLOW_INT_in_zeroX173); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_INT.add(a);

            _last = (CommonTree)input.LT(1);
            b=(CommonTree)match(input,INT,FOLLOW_INT_in_zeroX177); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_INT.add(b);

            if ( !(((a!=null?Integer.valueOf(a.getText()):0)==0)) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "zeroX", "$a.int==0");
            }

            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
            }



            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==1 ) {
            retval.tree = root_0;
            RewriteRuleNodeStream stream_a=new RewriteRuleNodeStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 20:41: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);}
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
    // $ANTLR end "zeroX"

    public static class xZero_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xZero"
    // Simplify.g:21:1: xZero : ^( '*' a= INT b= INT {...}?) -> $b;
    public final Simplify.xZero_return xZero() throws RecognitionException {
        Simplify.xZero_return retval = new Simplify.xZero_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree a=null;
        CommonTree b=null;
        CommonTree char_literal8=null;

        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree char_literal8_tree=null;
        RewriteRuleNodeStream stream_INT=new RewriteRuleNodeStream(adaptor,"token INT");
        RewriteRuleNodeStream stream_MULT=new RewriteRuleNodeStream(adaptor,"token MULT");

        try {
            // Simplify.g:21:7: ( ^( '*' a= INT b= INT {...}?) -> $b)
            // Simplify.g:21:9: ^( '*' a= INT b= INT {...}?)
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            char_literal8=(CommonTree)match(input,MULT,FOLLOW_MULT_in_xZero195); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_MULT.add(char_literal8);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = char_literal8;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            a=(CommonTree)match(input,INT,FOLLOW_INT_in_xZero199); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_INT.add(a);

            _last = (CommonTree)input.LT(1);
            b=(CommonTree)match(input,INT,FOLLOW_INT_in_xZero203); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_INT.add(b);

            if ( !(((b!=null?Integer.valueOf(b.getText()):0)==0)) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "xZero", "$b.int==0");
            }

            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
            }



            // AST REWRITE
            // elements: b
            // token labels: b
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==1 ) {
            retval.tree = root_0;
            RewriteRuleNodeStream stream_b=new RewriteRuleNodeStream(adaptor,"token b",b);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 21:41: -> $b
            {
                adaptor.addChild(root_0, stream_b.nextNode());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);}
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
    // $ANTLR end "xZero"

    // $ANTLR start synpred1_Simplify
    public final void synpred1_Simplify_fragment() throws RecognitionException {   
        // Simplify.g:12:11: ( zeroX )
        // Simplify.g:12:11: zeroX
        {
        pushFollow(FOLLOW_zeroX_in_synpred1_Simplify111);
        zeroX();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Simplify

    // Delegated rules

    public final boolean synpred1_Simplify() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Simplify_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_scalarVectorMult_in_topdown103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_zeroX_in_bottomup111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xZero_in_bottomup115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULT_in_scalarVectorMult127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_scalarVectorMult129 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_VEC_in_scalarVectorMult132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MULT_in_zeroX169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_zeroX173 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INT_in_zeroX177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULT_in_xZero195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_xZero199 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INT_in_xZero203 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_zeroX_in_synpred1_Simplify111 = new BitSet(new long[]{0x0000000000000002L});

}