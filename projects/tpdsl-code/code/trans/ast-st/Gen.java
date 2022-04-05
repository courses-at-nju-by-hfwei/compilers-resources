/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g 2009-09-23 17:38:00

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class Gen extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASS_DECL", "METHOD_DECL", "ARG_DECL", "BLOCK", "VAR_DECL", "FIELD_DECL", "CALL", "ELIST", "EXPR", "UNARY_MINUS", "UNARY_NOT", "ASSIGN", "ADDR", "DEREF", "ADD", "MEMBER", "ID", "INT", "FLOAT", "CHAR", "LETTER", "WS", "SL_COMMENT", "'{'", "'}'", "';'", "':'", "'('", "')'", "','", "'[]'", "'*'", "'float'", "'int'", "'char'", "'boolean'", "'void'", "'if'", "'else'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'-'", "'/'", "'!'", "'&'", "'['", "']'", "'->'", "'true'", "'false'"
    };
    public static final int T__42=42;
    public static final int T__28=28;
    public static final int T__57=57;
    public static final int T__51=51;
    public static final int EXPR=12;
    public static final int T__47=47;
    public static final int FLOAT=22;
    public static final int T__50=50;
    public static final int FIELD_DECL=9;
    public static final int BLOCK=7;
    public static final int T__39=39;
    public static final int T__30=30;
    public static final int T__52=52;
    public static final int T__46=46;
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
    public static final int T__55=55;
    public static final int T__29=29;
    public static final int T__45=45;
    public static final int CLASS_DECL=4;
    public static final int ADDR=16;
    public static final int T__43=43;
    public static final int T__31=31;
    public static final int T__40=40;
    public static final int EOF=-1;
    public static final int T__53=53;
    public static final int T__32=32;
    public static final int CALL=10;
    public static final int T__38=38;
    public static final int T__37=37;
    public static final int VAR_DECL=8;
    public static final int DEREF=17;
    public static final int T__41=41;
    public static final int ADD=18;

    // delegates
    // delegators


        public Gen(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Gen(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("GenTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return Gen.tokenNames; }
    public String getGrammarFileName() { return "/Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g"; }


    public static class compilationUnit_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "compilationUnit"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:11:1: compilationUnit : (d+= classDeclaration | d+= methodDeclaration | d+= varDeclaration )+ -> file(defs=$d);
    public final Gen.compilationUnit_return compilationUnit() throws RecognitionException {
        Gen.compilationUnit_return retval = new Gen.compilationUnit_return();
        retval.start = input.LT(1);

        List list_d=null;
        RuleReturnScope d = null;
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:12:5: ( (d+= classDeclaration | d+= methodDeclaration | d+= varDeclaration )+ -> file(defs=$d))
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:12:9: (d+= classDeclaration | d+= methodDeclaration | d+= varDeclaration )+
            {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:12:9: (d+= classDeclaration | d+= methodDeclaration | d+= varDeclaration )+
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
                case METHOD_DECL:
                    {
                    alt1=2;
                    }
                    break;
                case VAR_DECL:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:12:11: d+= classDeclaration
            	    {
            	    pushFollow(FOLLOW_classDeclaration_in_compilationUnit56);
            	    d=classDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_d==null) list_d=new ArrayList();
            	    list_d.add(d.getTemplate());


            	    }
            	    break;
            	case 2 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:12:33: d+= methodDeclaration
            	    {
            	    pushFollow(FOLLOW_methodDeclaration_in_compilationUnit62);
            	    d=methodDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_d==null) list_d=new ArrayList();
            	    list_d.add(d.getTemplate());


            	    }
            	    break;
            	case 3 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:12:56: d+= varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_compilationUnit68);
            	    d=varDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_d==null) list_d=new ArrayList();
            	    list_d.add(d.getTemplate());


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



            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 13:9: -> file(defs=$d)
              {
                  retval.st = templateLib.getInstanceOf("file",
                new STAttrMap().put("defs", list_d));
              }

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
    // $ANTLR end "compilationUnit"

    public static class classDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:18:1: classDeclaration : ^( 'class' name= ID ( ^( ':' sup= ID ) )? (m+= classMember )+ ) -> class(name=$name.textsup=$sup.textmembers=$m);
    public final Gen.classDeclaration_return classDeclaration() throws RecognitionException {
        Gen.classDeclaration_return retval = new Gen.classDeclaration_return();
        retval.start = input.LT(1);

        CommonTree name=null;
        CommonTree sup=null;
        List list_m=null;
        RuleReturnScope m = null;
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:19:5: ( ^( 'class' name= ID ( ^( ':' sup= ID ) )? (m+= classMember )+ ) -> class(name=$name.textsup=$sup.textmembers=$m))
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:19:9: ^( 'class' name= ID ( ^( ':' sup= ID ) )? (m+= classMember )+ )
            {
            match(input,CLASS_DECL,FOLLOW_CLASS_DECL_in_classDeclaration110); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            name=(CommonTree)match(input,ID,FOLLOW_ID_in_classDeclaration114); if (state.failed) return retval;
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:19:27: ( ^( ':' sup= ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:19:28: ^( ':' sup= ID )
                    {
                    match(input,30,FOLLOW_30_in_classDeclaration118); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    sup=(CommonTree)match(input,ID,FOLLOW_ID_in_classDeclaration122); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }

            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:19:45: (m+= classMember )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==METHOD_DECL||LA3_0==VAR_DECL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:19:45: m+= classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classDeclaration129);
            	    m=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_m==null) list_m=new ArrayList();
            	    list_m.add(m.getTemplate());


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


            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 20:9: -> class(name=$name.textsup=$sup.textmembers=$m)
              {
                  retval.st = templateLib.getInstanceOf("class",
                new STAttrMap().put("name", (name!=null?name.getText():null)).put("sup", (sup!=null?sup.getText():null)).put("members", list_m));
              }

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
    // $ANTLR end "classDeclaration"

    public static class classMember_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classMember"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:24:1: classMember : ( varDeclaration -> {$varDeclaration.st} | methodDeclaration -> {$methodDeclaration.st});
    public final Gen.classMember_return classMember() throws RecognitionException {
        Gen.classMember_return retval = new Gen.classMember_return();
        retval.start = input.LT(1);

        Gen.varDeclaration_return varDeclaration1 = null;

        Gen.methodDeclaration_return methodDeclaration2 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:25:5: ( varDeclaration -> {$varDeclaration.st} | methodDeclaration -> {$methodDeclaration.st})
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VAR_DECL) ) {
                alt4=1;
            }
            else if ( (LA4_0==METHOD_DECL) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:25:9: varDeclaration
                    {
                    pushFollow(FOLLOW_varDeclaration_in_classMember178);
                    varDeclaration1=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 25:29: -> {$varDeclaration.st}
                      {
                          retval.st = (varDeclaration1!=null?varDeclaration1.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:26:9: methodDeclaration
                    {
                    pushFollow(FOLLOW_methodDeclaration_in_classMember197);
                    methodDeclaration2=methodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 26:29: -> {$methodDeclaration.st}
                      {
                          retval.st = (methodDeclaration2!=null?methodDeclaration2.st:null);
                      }

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
        return retval;
    }
    // $ANTLR end "classMember"

    public static class methodDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "methodDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:29:1: methodDeclaration : ^( METHOD_DECL type ID (a+= parameter )* block ) -> method(name=$ID.textretType=$type.stargs=$ablock=$block.st);
    public final Gen.methodDeclaration_return methodDeclaration() throws RecognitionException {
        Gen.methodDeclaration_return retval = new Gen.methodDeclaration_return();
        retval.start = input.LT(1);

        CommonTree ID3=null;
        List list_a=null;
        Gen.type_return type4 = null;

        Gen.block_return block5 = null;

        RuleReturnScope a = null;
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:30:5: ( ^( METHOD_DECL type ID (a+= parameter )* block ) -> method(name=$ID.textretType=$type.stargs=$ablock=$block.st))
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:30:9: ^( METHOD_DECL type ID (a+= parameter )* block )
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_methodDeclaration226); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_methodDeclaration228);
            type4=type();

            state._fsp--;
            if (state.failed) return retval;
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_methodDeclaration230); if (state.failed) return retval;
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:30:32: (a+= parameter )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ARG_DECL) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:30:32: a+= parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_methodDeclaration234);
            	    a=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_a==null) list_a=new ArrayList();
            	    list_a.add(a.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            pushFollow(FOLLOW_block_in_methodDeclaration237);
            block5=block();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 31:9: -> method(name=$ID.textretType=$type.stargs=$ablock=$block.st)
              {
                  retval.st = templateLib.getInstanceOf("method",
                new STAttrMap().put("name", (ID3!=null?ID3.getText():null)).put("retType", (type4!=null?type4.st:null)).put("args", list_a).put("block", (block5!=null?block5.st:null)));
              }

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
    // $ANTLR end "methodDeclaration"

    public static class parameter_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "parameter"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:34:1: parameter : ^( ARG_DECL ( ^(p= '*' t= type ) | t= type ) ID ) -> arg(name=$ID.texttype=$t.stptr=p!=null?\"*\":null);
    public final Gen.parameter_return parameter() throws RecognitionException {
        Gen.parameter_return retval = new Gen.parameter_return();
        retval.start = input.LT(1);

        CommonTree p=null;
        CommonTree ID6=null;
        Gen.type_return t = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:35:5: ( ^( ARG_DECL ( ^(p= '*' t= type ) | t= type ) ID ) -> arg(name=$ID.texttype=$t.stptr=p!=null?\"*\":null))
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:35:9: ^( ARG_DECL ( ^(p= '*' t= type ) | t= type ) ID )
            {
            match(input,ARG_DECL,FOLLOW_ARG_DECL_in_parameter290); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:35:20: ( ^(p= '*' t= type ) | t= type )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            else if ( (LA6_0==ID||(LA6_0>=36 && LA6_0<=40)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:35:21: ^(p= '*' t= type )
                    {
                    p=(CommonTree)match(input,35,FOLLOW_35_in_parameter296); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_parameter300);
                    t=type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:35:37: t= type
                    {
                    pushFollow(FOLLOW_type_in_parameter305);
                    t=type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_parameter308); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 36:9: -> arg(name=$ID.texttype=$t.stptr=p!=null?\"*\":null)
              {
                  retval.st = templateLib.getInstanceOf("arg",
                new STAttrMap().put("name", (ID6!=null?ID6.getText():null)).put("type", (t!=null?t.st:null)).put("ptr", p!=null?"*":null));
              }

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
    // $ANTLR end "parameter"

    public static class type_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:40:1: type : ( primitiveType -> {$primitiveType.st} | ID -> {%{$ID.text}});
    public final Gen.type_return type() throws RecognitionException {
        Gen.type_return retval = new Gen.type_return();
        retval.start = input.LT(1);

        CommonTree ID8=null;
        Gen.primitiveType_return primitiveType7 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:40:5: ( primitiveType -> {$primitiveType.st} | ID -> {%{$ID.text}})
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=36 && LA7_0<=40)) ) {
                alt7=1;
            }
            else if ( (LA7_0==ID) ) {
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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:40:9: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type351);
                    primitiveType7=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 40:25: -> {$primitiveType.st}
                      {
                          retval.st = (primitiveType7!=null?primitiveType7.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:41:9: ID
                    {
                    ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_type367); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 41:25: -> {%{$ID.text}}
                      {
                          retval.st = new StringTemplate(templateLib,(ID8!=null?ID8.getText():null));
                      }

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
        return retval;
    }
    // $ANTLR end "type"

    public static class primitiveType_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primitiveType"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:46:1: primitiveType : ( 'float' | 'int' | 'char' | 'boolean' | 'void' );
    public final Gen.primitiveType_return primitiveType() throws RecognitionException {
        Gen.primitiveType_return retval = new Gen.primitiveType_return();
        retval.start = input.LT(1);

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:48:5: ( 'float' | 'int' | 'char' | 'boolean' | 'void' )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:
            {
            if ( (input.LA(1)>=36 && input.LA(1)<=40) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            if ( state.backtracking==0 ) {
              retval.st = new StringTemplate(templateLib,input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(retval.start),
                input.getTreeAdaptor().getTokenStopIndex(retval.start)));
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
    // $ANTLR end "primitiveType"

    public static class block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:57:1: block : ^( BLOCK (s+= statement )* ) -> block(stats=$s);
    public final Gen.block_return block() throws RecognitionException {
        Gen.block_return retval = new Gen.block_return();
        retval.start = input.LT(1);

        List list_s=null;
        RuleReturnScope s = null;
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:58:5: ( ^( BLOCK (s+= statement )* ) -> block(stats=$s))
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:58:9: ^( BLOCK (s+= statement )* )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block472); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:58:18: (s+= statement )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=BLOCK && LA8_0<=VAR_DECL)||LA8_0==EXPR||LA8_0==ASSIGN||LA8_0==41||LA8_0==43) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:58:18: s+= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_block476);
                	    s=statement();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if (list_s==null) list_s=new ArrayList();
                	    list_s.add(s.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 58:32: -> block(stats=$s)
              {
                  retval.st = templateLib.getInstanceOf("block",
                new STAttrMap().put("stats", list_s));
              }

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
    // $ANTLR end "block"

    public static class varDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "varDeclaration"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:63:1: varDeclaration : ( ^( VAR_DECL ^(p= '*' type ) ID ( expression )? ) -> var(name=$ID.texttype=$type.stinit=$expression.stptr=$p) | ^( VAR_DECL type ID ( expression )? ) -> var(name=$ID.texttype=$type.stinit=$expression.st));
    public final Gen.varDeclaration_return varDeclaration() throws RecognitionException {
        Gen.varDeclaration_return retval = new Gen.varDeclaration_return();
        retval.start = input.LT(1);

        CommonTree p=null;
        CommonTree ID9=null;
        CommonTree ID12=null;
        Gen.type_return type10 = null;

        Gen.expression_return expression11 = null;

        Gen.type_return type13 = null;

        Gen.expression_return expression14 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:64:5: ( ^( VAR_DECL ^(p= '*' type ) ID ( expression )? ) -> var(name=$ID.texttype=$type.stinit=$expression.stptr=$p) | ^( VAR_DECL type ID ( expression )? ) -> var(name=$ID.texttype=$type.stinit=$expression.st))
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==VAR_DECL) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==DOWN) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==35) ) {
                        alt11=1;
                    }
                    else if ( (LA11_2==ID||(LA11_2>=36 && LA11_2<=40)) ) {
                        alt11=2;
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
                        new NoViableAltException("", 11, 1, input);

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
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:64:9: ^( VAR_DECL ^(p= '*' type ) ID ( expression )? )
                    {
                    match(input,VAR_DECL,FOLLOW_VAR_DECL_in_varDeclaration509); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    p=(CommonTree)match(input,35,FOLLOW_35_in_varDeclaration514); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_varDeclaration516);
                    type10=type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_varDeclaration519); if (state.failed) return retval;
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:64:37: ( expression )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==EXPR) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:64:37: expression
                            {
                            pushFollow(FOLLOW_expression_in_varDeclaration521);
                            expression11=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 65:9: -> var(name=$ID.texttype=$type.stinit=$expression.stptr=$p)
                      {
                          retval.st = templateLib.getInstanceOf("var",
                        new STAttrMap().put("name", (ID9!=null?ID9.getText():null)).put("type", (type10!=null?type10.st:null)).put("init", (expression11!=null?expression11.st:null)).put("ptr", p));
                      }

                    }
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:66:9: ^( VAR_DECL type ID ( expression )? )
                    {
                    match(input,VAR_DECL,FOLLOW_VAR_DECL_in_varDeclaration566); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_varDeclaration568);
                    type13=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    ID12=(CommonTree)match(input,ID,FOLLOW_ID_in_varDeclaration570); if (state.failed) return retval;
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:66:28: ( expression )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==EXPR) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:66:28: expression
                            {
                            pushFollow(FOLLOW_expression_in_varDeclaration572);
                            expression14=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 67:9: -> var(name=$ID.texttype=$type.stinit=$expression.st)
                      {
                          retval.st = templateLib.getInstanceOf("var",
                        new STAttrMap().put("name", (ID12!=null?ID12.getText():null)).put("type", (type13!=null?type13.st:null)).put("init", (expression14!=null?expression14.st:null)));
                      }

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
        return retval;
    }
    // $ANTLR end "varDeclaration"

    public static class statement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:71:1: statement : ( block -> {$block.st} | varDeclaration -> {$varDeclaration.st} | ^( 'if' expression s1= statement (s2= statement )? ) -> if(cond=$expression.ststat1=$s1.ststat2=$s2.st) | ^( 'return' ( expression )? ) -> return(v=$expression.st) | ^( '=' a= expression b= expression ) -> assign(a=$a.stb=$b.st) | ^( EXPR ^( CALL ID ^( ELIST (p+= expr )* ) ) ) -> callstat(name=$ID.textargs=$p));
    public final Gen.statement_return statement() throws RecognitionException {
        Gen.statement_return retval = new Gen.statement_return();
        retval.start = input.LT(1);

        CommonTree ID19=null;
        List list_p=null;
        Gen.statement_return s1 = null;

        Gen.statement_return s2 = null;

        Gen.expression_return a = null;

        Gen.expression_return b = null;

        Gen.block_return block15 = null;

        Gen.varDeclaration_return varDeclaration16 = null;

        Gen.expression_return expression17 = null;

        Gen.expression_return expression18 = null;

        RuleReturnScope p = null;
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:72:5: ( block -> {$block.st} | varDeclaration -> {$varDeclaration.st} | ^( 'if' expression s1= statement (s2= statement )? ) -> if(cond=$expression.ststat1=$s1.ststat2=$s2.st) | ^( 'return' ( expression )? ) -> return(v=$expression.st) | ^( '=' a= expression b= expression ) -> assign(a=$a.stb=$b.st) | ^( EXPR ^( CALL ID ^( ELIST (p+= expr )* ) ) ) -> callstat(name=$ID.textargs=$p))
            int alt15=6;
            switch ( input.LA(1) ) {
            case BLOCK:
                {
                alt15=1;
                }
                break;
            case VAR_DECL:
                {
                alt15=2;
                }
                break;
            case 41:
                {
                alt15=3;
                }
                break;
            case 43:
                {
                alt15=4;
                }
                break;
            case ASSIGN:
                {
                alt15=5;
                }
                break;
            case EXPR:
                {
                alt15=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:72:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement621);
                    block15=block();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 72:25: -> {$block.st}
                      {
                          retval.st = (block15!=null?block15.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:73:9: varDeclaration
                    {
                    pushFollow(FOLLOW_varDeclaration_in_statement645);
                    varDeclaration16=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 73:25: -> {$varDeclaration.st}
                      {
                          retval.st = (varDeclaration16!=null?varDeclaration16.st:null);
                      }

                    }
                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:74:9: ^( 'if' expression s1= statement (s2= statement )? )
                    {
                    match(input,41,FOLLOW_41_in_statement661); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement663);
                    expression17=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement667);
                    s1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:74:42: (s2= statement )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=BLOCK && LA12_0<=VAR_DECL)||LA12_0==EXPR||LA12_0==ASSIGN||LA12_0==41||LA12_0==43) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:74:42: s2= statement
                            {
                            pushFollow(FOLLOW_statement_in_statement671);
                            s2=statement();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 75:25: -> if(cond=$expression.ststat1=$s1.ststat2=$s2.st)
                      {
                          retval.st = templateLib.getInstanceOf("if",
                        new STAttrMap().put("cond", (expression17!=null?expression17.st:null)).put("stat1", (s1!=null?s1.st:null)).put("stat2", (s2!=null?s2.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:76:9: ^( 'return' ( expression )? )
                    {
                    match(input,43,FOLLOW_43_in_statement727); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:76:20: ( expression )?
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==EXPR) ) {
                            alt13=1;
                        }
                        switch (alt13) {
                            case 1 :
                                // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:76:20: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement729);
                                expression18=expression();

                                state._fsp--;
                                if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 77:25: -> return(v=$expression.st)
                      {
                          retval.st = templateLib.getInstanceOf("return",
                        new STAttrMap().put("v", (expression18!=null?expression18.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:79:9: ^( '=' a= expression b= expression )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_statement776); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement780);
                    a=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement784);
                    b=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 79:42: -> assign(a=$a.stb=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("assign",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:81:9: ^( EXPR ^( CALL ID ^( ELIST (p+= expr )* ) ) )
                    {
                    match(input,EXPR,FOLLOW_EXPR_in_statement812); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,CALL,FOLLOW_CALL_in_statement815); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    ID19=(CommonTree)match(input,ID,FOLLOW_ID_in_statement817); if (state.failed) return retval;
                    match(input,ELIST,FOLLOW_ELIST_in_statement820); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:81:36: (p+= expr )*
                        loop14:
                        do {
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==CALL||(LA14_0>=UNARY_MINUS && LA14_0<=UNARY_NOT)||(LA14_0>=ADDR && LA14_0<=CHAR)||LA14_0==35||(LA14_0>=44 && LA14_0<=51)||(LA14_0>=57 && LA14_0<=58)) ) {
                                alt14=1;
                            }


                            switch (alt14) {
                        	case 1 :
                        	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:81:36: p+= expr
                        	    {
                        	    pushFollow(FOLLOW_expr_in_statement824);
                        	    p=expr();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if (list_p==null) list_p=new ArrayList();
                        	    list_p.add(p.getTemplate());


                        	    }
                        	    break;

                        	default :
                        	    break loop14;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    match(input, Token.UP, null); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 82:25: -> callstat(name=$ID.textargs=$p)
                      {
                          retval.st = templateLib.getInstanceOf("callstat",
                        new STAttrMap().put("name", (ID19!=null?ID19.getText():null)).put("args", list_p));
                      }

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
        return retval;
    }
    // $ANTLR end "statement"

    public static class expression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:85:1: expression : ^( EXPR expr ) -> {$expr.st};
    public final Gen.expression_return expression() throws RecognitionException {
        Gen.expression_return retval = new Gen.expression_return();
        retval.start = input.LT(1);

        Gen.expr_return expr20 = null;


        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:86:5: ( ^( EXPR expr ) -> {$expr.st})
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:86:9: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression887); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_expression889);
            expr20=expr();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 86:22: -> {$expr.st}
              {
                  retval.st = (expr20!=null?expr20.st:null);
              }

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
    // $ANTLR end "expression"

    public static class expr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:89:1: expr options {backtrack=true; } : ( atom -> {$atom.st} | ^( UNARY_MINUS v= expr ) -> unary_minus(v=$v.st) | ^( UNARY_NOT v= expr ) -> unary_not(v=$v.st) | ^( ADDR v= expr ) -> addr(v=$v.st) | ^( DEREF ^( '+' ID v= expr ) ) -> index(array=$ID.texti=$v.st) | ^( DEREF v= expr ) -> deref(v=$v.st) | ^( '.' o= expr ID ) -> member(obj=$o.stname=$ID.text) | ^( CALL ID ^( ELIST (a+= expr )* ) ) -> call(name=$ID.textargs=$a) | ^( op x= expr y= expr ) -> operation(op=$op.stx=$x.sty=$y.st));
    public final Gen.expr_return expr() throws RecognitionException {
        Gen.expr_return retval = new Gen.expr_return();
        retval.start = input.LT(1);

        CommonTree ID22=null;
        CommonTree ID23=null;
        CommonTree ID24=null;
        List list_a=null;
        Gen.expr_return v = null;

        Gen.expr_return o = null;

        Gen.expr_return x = null;

        Gen.expr_return y = null;

        Gen.atom_return atom21 = null;

        Gen.op_return op25 = null;

        RuleReturnScope a = null;
        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:91:5: ( atom -> {$atom.st} | ^( UNARY_MINUS v= expr ) -> unary_minus(v=$v.st) | ^( UNARY_NOT v= expr ) -> unary_not(v=$v.st) | ^( ADDR v= expr ) -> addr(v=$v.st) | ^( DEREF ^( '+' ID v= expr ) ) -> index(array=$ID.texti=$v.st) | ^( DEREF v= expr ) -> deref(v=$v.st) | ^( '.' o= expr ID ) -> member(obj=$o.stname=$ID.text) | ^( CALL ID ^( ELIST (a+= expr )* ) ) -> call(name=$ID.textargs=$a) | ^( op x= expr y= expr ) -> operation(op=$op.stx=$x.sty=$y.st))
            int alt17=9;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:91:9: atom
                    {
                    pushFollow(FOLLOW_atom_in_expr920);
                    atom21=atom();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 91:37: -> {$atom.st}
                      {
                          retval.st = (atom21!=null?atom21.st:null);
                      }

                    }
                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:92:9: ^( UNARY_MINUS v= expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr958); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr962);
                    v=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 92:37: -> unary_minus(v=$v.st)
                      {
                          retval.st = templateLib.getInstanceOf("unary_minus",
                        new STAttrMap().put("v", (v!=null?v.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:93:9: ^( UNARY_NOT v= expr )
                    {
                    match(input,UNARY_NOT,FOLLOW_UNARY_NOT_in_expr989); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr993);
                    v=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 93:37: -> unary_not(v=$v.st)
                      {
                          retval.st = templateLib.getInstanceOf("unary_not",
                        new STAttrMap().put("v", (v!=null?v.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:94:9: ^( ADDR v= expr )
                    {
                    match(input,ADDR,FOLLOW_ADDR_in_expr1022); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1026);
                    v=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 94:37: -> addr(v=$v.st)
                      {
                          retval.st = templateLib.getInstanceOf("addr",
                        new STAttrMap().put("v", (v!=null?v.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:95:9: ^( DEREF ^( '+' ID v= expr ) )
                    {
                    match(input,DEREF,FOLLOW_DEREF_in_expr1065); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,ADD,FOLLOW_ADD_in_expr1068); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    ID22=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1070); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1074);
                    v=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 95:37: -> index(array=$ID.texti=$v.st)
                      {
                          retval.st = templateLib.getInstanceOf("index",
                        new STAttrMap().put("array", (ID22!=null?ID22.getText():null)).put("i", (v!=null?v.st:null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:96:9: ^( DEREF v= expr )
                    {
                    match(input,DEREF,FOLLOW_DEREF_in_expr1103); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1107);
                    v=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 96:37: -> deref(v=$v.st)
                      {
                          retval.st = templateLib.getInstanceOf("deref",
                        new STAttrMap().put("v", (v!=null?v.st:null)));
                      }

                    }
                    }
                    break;
                case 7 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:97:9: ^( '.' o= expr ID )
                    {
                    match(input,MEMBER,FOLLOW_MEMBER_in_expr1140); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1144);
                    o=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    ID23=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1146); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 97:37: -> member(obj=$o.stname=$ID.text)
                      {
                          retval.st = templateLib.getInstanceOf("member",
                        new STAttrMap().put("obj", (o!=null?o.st:null)).put("name", (ID23!=null?ID23.getText():null)));
                      }

                    }
                    }
                    break;
                case 8 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:98:9: ^( CALL ID ^( ELIST (a+= expr )* ) )
                    {
                    match(input,CALL,FOLLOW_CALL_in_expr1183); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    ID24=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1185); if (state.failed) return retval;
                    match(input,ELIST,FOLLOW_ELIST_in_expr1188); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:98:28: (a+= expr )*
                        loop16:
                        do {
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==CALL||(LA16_0>=UNARY_MINUS && LA16_0<=UNARY_NOT)||(LA16_0>=ADDR && LA16_0<=CHAR)||LA16_0==35||(LA16_0>=44 && LA16_0<=51)||(LA16_0>=57 && LA16_0<=58)) ) {
                                alt16=1;
                            }


                            switch (alt16) {
                        	case 1 :
                        	    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:98:28: a+= expr
                        	    {
                        	    pushFollow(FOLLOW_expr_in_expr1192);
                        	    a=expr();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if (list_a==null) list_a=new ArrayList();
                        	    list_a.add(a.getTemplate());


                        	    }
                        	    break;

                        	default :
                        	    break loop16;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 98:37: -> call(name=$ID.textargs=$a)
                      {
                          retval.st = templateLib.getInstanceOf("call",
                        new STAttrMap().put("name", (ID24!=null?ID24.getText():null)).put("args", list_a));
                      }

                    }
                    }
                    break;
                case 9 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:99:9: ^( op x= expr y= expr )
                    {
                    pushFollow(FOLLOW_op_in_expr1219);
                    op25=op();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1223);
                    x=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1227);
                    y=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 99:37: -> operation(op=$op.stx=$x.sty=$y.st)
                      {
                          retval.st = templateLib.getInstanceOf("operation",
                        new STAttrMap().put("op", (op25!=null?op25.st:null)).put("x", (x!=null?x.st:null)).put("y", (y!=null?y.st:null)));
                      }

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
        return retval;
    }
    // $ANTLR end "expr"

    public static class atom_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "atom"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:102:1: atom : ( 'true' | 'false' | CHAR | INT | FLOAT | ID );
    public final Gen.atom_return atom() throws RecognitionException {
        Gen.atom_return retval = new Gen.atom_return();
        retval.start = input.LT(1);

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:104:5: ( 'true' | 'false' | CHAR | INT | FLOAT | ID )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:
            {
            if ( (input.LA(1)>=ID && input.LA(1)<=CHAR)||(input.LA(1)>=57 && input.LA(1)<=58) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            if ( state.backtracking==0 ) {
              retval.st = new StringTemplate(templateLib,input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(retval.start),
                input.getTreeAdaptor().getTokenStopIndex(retval.start)));
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
    // $ANTLR end "atom"

    public static class op_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "op"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:113:1: op : ( bop | relop | eqop );
    public final Gen.op_return op() throws RecognitionException {
        Gen.op_return retval = new Gen.op_return();
        retval.start = input.LT(1);

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:116:5: ( bop | relop | eqop )
            int alt18=3;
            switch ( input.LA(1) ) {
            case ADD:
            case 35:
            case 50:
            case 51:
                {
                alt18=1;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt18=2;
                }
                break;
            case 44:
            case 45:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:116:9: bop
                    {
                    pushFollow(FOLLOW_bop_in_op1372);
                    bop();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:116:15: relop
                    {
                    pushFollow(FOLLOW_relop_in_op1376);
                    relop();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:116:23: eqop
                    {
                    pushFollow(FOLLOW_eqop_in_op1380);
                    eqop();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            if ( state.backtracking==0 ) {
              retval.st = templateLib.getInstanceOf("operator",
                new STAttrMap().put("o", ((CommonTree)retval.start).getText()));
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
    // $ANTLR end "op"

    public static class bop_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bop"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:120:1: bop : ( '+' | '-' | '*' | '/' );
    public final Gen.bop_return bop() throws RecognitionException {
        Gen.bop_return retval = new Gen.bop_return();
        retval.start = input.LT(1);

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:120:5: ( '+' | '-' | '*' | '/' )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:
            {
            if ( input.LA(1)==ADD||input.LA(1)==35||(input.LA(1)>=50 && input.LA(1)<=51) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
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
        return retval;
    }
    // $ANTLR end "bop"

    public static class relop_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relop"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:122:1: relop : ( '<' | '>' | '<=' | '>=' );
    public final Gen.relop_return relop() throws RecognitionException {
        Gen.relop_return retval = new Gen.relop_return();
        retval.start = input.LT(1);

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:122:6: ( '<' | '>' | '<=' | '>=' )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:
            {
            if ( (input.LA(1)>=46 && input.LA(1)<=49) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
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
        return retval;
    }
    // $ANTLR end "relop"

    public static class eqop_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "eqop"
    // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:124:1: eqop : ( '!=' | '==' );
    public final Gen.eqop_return eqop() throws RecognitionException {
        Gen.eqop_return retval = new Gen.eqop_return();
        retval.start = input.LT(1);

        try {
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:124:5: ( '!=' | '==' )
            // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:
            {
            if ( (input.LA(1)>=44 && input.LA(1)<=45) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
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
        return retval;
    }
    // $ANTLR end "eqop"

    // $ANTLR start synpred5_Gen
    public final void synpred5_Gen_fragment() throws RecognitionException {   
        Gen.expr_return v = null;


        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:95:9: ( ^( DEREF ^( '+' ID v= expr ) ) )
        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:95:9: ^( DEREF ^( '+' ID v= expr ) )
        {
        match(input,DEREF,FOLLOW_DEREF_in_synpred5_Gen1065); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,ADD,FOLLOW_ADD_in_synpred5_Gen1068); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        match(input,ID,FOLLOW_ID_in_synpred5_Gen1070); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred5_Gen1074);
        v=expr();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Gen

    // $ANTLR start synpred6_Gen
    public final void synpred6_Gen_fragment() throws RecognitionException {   
        Gen.expr_return v = null;


        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:96:9: ( ^( DEREF v= expr ) )
        // /Users/parrt/research/book/TPDSL/Book/code/trans/ast-st/Gen.g:96:9: ^( DEREF v= expr )
        {
        match(input,DEREF,FOLLOW_DEREF_in_synpred6_Gen1103); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred6_Gen1107);
        v=expr();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Gen

    // Delegated rules

    public final boolean synpred5_Gen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Gen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Gen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Gen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\15\uffff";
    static final String DFA17_eofS =
        "\15\uffff";
    static final String DFA17_minS =
        "\1\12\4\uffff\1\0\7\uffff";
    static final String DFA17_maxS =
        "\1\72\4\uffff\1\0\7\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\11\2\uffff\1\5\1\6";
    static final String DFA17_specialS =
        "\5\uffff\1\0\7\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\7\2\uffff\1\2\1\3\1\uffff\1\4\1\5\1\10\1\6\4\1\13\uffff\1"+
            "\10\10\uffff\10\10\5\uffff\2\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "89:1: expr options {backtrack=true; } : ( atom -> {$atom.st} | ^( UNARY_MINUS v= expr ) -> unary_minus(v=$v.st) | ^( UNARY_NOT v= expr ) -> unary_not(v=$v.st) | ^( ADDR v= expr ) -> addr(v=$v.st) | ^( DEREF ^( '+' ID v= expr ) ) -> index(array=$ID.texti=$v.st) | ^( DEREF v= expr ) -> deref(v=$v.st) | ^( '.' o= expr ID ) -> member(obj=$o.stname=$ID.text) | ^( CALL ID ^( ELIST (a+= expr )* ) ) -> call(name=$ID.textargs=$a) | ^( op x= expr y= expr ) -> operation(op=$op.stx=$x.sty=$y.st));";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Gen()) ) {s = 11;}

                        else if ( (synpred6_Gen()) ) {s = 12;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit56 = new BitSet(new long[]{0x0000000000000132L});
    public static final BitSet FOLLOW_methodDeclaration_in_compilationUnit62 = new BitSet(new long[]{0x0000000000000132L});
    public static final BitSet FOLLOW_varDeclaration_in_compilationUnit68 = new BitSet(new long[]{0x0000000000000132L});
    public static final BitSet FOLLOW_CLASS_DECL_in_classDeclaration110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_classDeclaration114 = new BitSet(new long[]{0x0000000040000130L});
    public static final BitSet FOLLOW_30_in_classDeclaration118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_classDeclaration122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classMember_in_classDeclaration129 = new BitSet(new long[]{0x0000000040000138L});
    public static final BitSet FOLLOW_varDeclaration_in_classMember178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_classMember197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_DECL_in_methodDeclaration226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_methodDeclaration228 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_methodDeclaration230 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_parameter_in_methodDeclaration234 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_block_in_methodDeclaration237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_DECL_in_parameter290 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_35_in_parameter296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameter300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_parameter305 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_parameter308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_type351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_block476 = new BitSet(new long[]{0x00000A00000091F8L});
    public static final BitSet FOLLOW_VAR_DECL_in_varDeclaration509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_35_in_varDeclaration514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_varDeclaration516 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_varDeclaration519 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_expression_in_varDeclaration521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECL_in_varDeclaration566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_varDeclaration568 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration570 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_expression_in_varDeclaration572 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_statement621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_statement645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_statement661 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement663 = new BitSet(new long[]{0x00000A00000091F8L});
    public static final BitSet FOLLOW_statement_in_statement667 = new BitSet(new long[]{0x00000A00000091F8L});
    public static final BitSet FOLLOW_statement_in_statement671 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_43_in_statement727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement729 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_statement776 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement780 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_expression_in_statement784 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_in_statement812 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CALL_in_statement815 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_statement817 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ELIST_in_statement820 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_statement824 = new BitSet(new long[]{0x060FF00800FF6408L});
    public static final BitSet FOLLOW_EXPR_in_expression887 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression889 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_expr920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr962 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_NOT_in_expr989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr993 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADDR_in_expr1022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1026 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEREF_in_expr1065 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_expr1068 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr1070 = new BitSet(new long[]{0x060FF00800FF6408L});
    public static final BitSet FOLLOW_expr_in_expr1074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEREF_in_expr1103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEMBER_in_expr1140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1144 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_expr1146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_expr1183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr1185 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ELIST_in_expr1188 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1192 = new BitSet(new long[]{0x060FF00800FF6408L});
    public static final BitSet FOLLOW_op_in_expr1219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1223 = new BitSet(new long[]{0x060FF00800FF6408L});
    public static final BitSet FOLLOW_expr_in_expr1227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_atom0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bop_in_op1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relop_in_op1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eqop_in_op1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_eqop0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEREF_in_synpred5_Gen1065 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_synpred5_Gen1068 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_synpred5_Gen1070 = new BitSet(new long[]{0x060FF00800FF6408L});
    public static final BitSet FOLLOW_expr_in_synpred5_Gen1074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEREF_in_synpred6_Gen1103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_synpred6_Gen1107 = new BitSet(new long[]{0x0000000000000008L});

}