/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import org.antlr.runtime.TokenStream;

import java.util.List;

public class SymbolTable {
    // arithmetic types defined in order from narrowest to widest
    public static final int tUSER = 0; // user-defined type (struct)
    public static final int tBOOLEAN = 1;
    public static final int tCHAR = 2;
    public static final int tINT = 3;
    public static final int tFLOAT = 4;
    public static final int tVOID = 5;

    public static final BuiltInTypeSymbol _boolean =
        new BuiltInTypeSymbol("boolean", tBOOLEAN);
    public static final BuiltInTypeSymbol _char =
        new BuiltInTypeSymbol("char", tCHAR);
    public static final BuiltInTypeSymbol _int =
        new BuiltInTypeSymbol("int", tINT);
    public static final BuiltInTypeSymbol _float =
        new BuiltInTypeSymbol("float", tFLOAT);
    public static final BuiltInTypeSymbol _void =
        new BuiltInTypeSymbol("void", tVOID);

    public CymbolListener listener =
        new CymbolListener() {
            public void info(String msg) { System.out.println(msg); }
            public void error(String msg) { System.err.println(msg); }
        };

    /** arithmetic types defined in order from narrowest to widest */
    public static final Type[] indexToType = {
        // 0, 1,        2,     3,    4,      5
        null, _boolean, _char, _int, _float, _void
    };

    /** Map t1 op t2 to result type (_void implies illegal) */
    public static final Type[][] arithmeticResultType = new Type[][] {
        /*          struct  boolean  char    int     float,   void */
        /*struct*/  {_void, _void,   _void,  _void,  _void,   _void},
        /*boolean*/ {_void, _void,   _void,  _void,  _void,   _void},
        /*char*/    {_void, _void,   _char,  _int,   _float,  _void},
        /*int*/     {_void, _void,   _int,   _int,   _float,  _void},
        /*float*/   {_void, _void,   _float, _float, _float,  _void},
        /*void*/    {_void, _void,   _void,  _void,  _void,   _void}
    };

    public static final Type[][] relationalResultType = new Type[][] {
        /*          struct  boolean char      int       float,    void */
        /*struct*/  {_void, _void,  _void,    _void,    _void,    _void},
        /*boolean*/ {_void, _void,  _void,    _void,    _void,    _void},
        /*char*/    {_void, _void,  _boolean, _boolean, _boolean, _void},
        /*int*/     {_void, _void,  _boolean, _boolean, _boolean, _void},
        /*float*/   {_void, _void,  _boolean, _boolean, _boolean, _void},
        /*void*/    {_void, _void,  _void,    _void,    _void,    _void}
    };

    public static final Type[][] equalityResultType = new Type[][] {
        /*           struct boolean   char      int       float,    void */
        /*struct*/  {_void, _void,    _void,    _void,    _void,    _void},
        /*boolean*/ {_void, _boolean, _void,    _void,    _void,    _void},
        /*char*/    {_void, _void,    _boolean, _boolean, _boolean, _void},
        /*int*/     {_void, _void,    _boolean, _boolean, _boolean, _void},
        /*float*/   {_void, _void,    _boolean, _boolean, _boolean, _void},
        /*void*/    {_void, _void,    _void,    _void,    _void,    _void}
    };

    /** Indicate whether a type needs a promotion to a wider type.
     *  If not null, implies promotion required.  Null does NOT imply
     *  error--it implies no promotion.  This works for
     *  arithmetic, equality, and relational operators in Cymbol.
     */
    public static final Type[][] promoteFromTo = new Type[][] {
        /*          struct  boolean  char    int     float,   void */
        /*struct*/  {null,  null,    null,   null,   null,    null},
        /*boolean*/ {null,  null,    null,   null,   null,    null},
        /*char*/    {null,  null,    null,   _int,   _float,  null},
        /*int*/     {null,  null,    null,   null,   _float,  null},
        /*float*/   {null,  null,    null,   null,    null,   null},
        /*void*/    {null,  null,    null,   null,    null,   null}
    };

    GlobalScope globals = new GlobalScope();

    public SymbolTable() { initTypeSystem(); }

    protected void initTypeSystem() {
        for (Type t : indexToType) {
            if ( t!=null ) globals.define((BuiltInTypeSymbol)t);
        }
    }

    public Type getResultType(Type[][] typeTable, CymbolAST a, CymbolAST b) {
        int ta = a.evalType.getTypeIndex(); // type index of left operand
        int tb = b.evalType.getTypeIndex(); // type index of right operand
        Type result = typeTable[ta][tb];    // operation result type
        // promote operand types to result type
        a.promoteToType = promoteFromTo[ta][result];
        b.promoteToType = promoteFromTo[tb][result];
        return result;
    }

    public Type bop(CymbolAST a, CymbolAST b) {
        return getResultType(arithmeticResultType, a, b);
    }
	
    public Type relop(CymbolAST a, CymbolAST b) {
        return getResultType(relationalResultType, a, b);
    }
	
    public Type eqop(CymbolAST a, CymbolAST b) {
        return getResultType(equalityResultType, a, b);
    }

    public Type uminus(CymbolAST a) { return a.evalType; }
    public Type unot(CymbolAST a)   { return _boolean; }

    public Type arrayIndex(CymbolAST id, CymbolAST index) {
        Symbol s = id.scope.resolve(id.getText()); // resolve variable
        VariableSymbol vs = (VariableSymbol)s;
        id.symbol = vs;                            // annotate AST
        Type t = ((ArrayType)vs.type).elementType; // get element type
        int texpr = index.evalType.getTypeIndex();
        index.promoteToType = promoteFromTo[texpr][tINT]; // promote index?
        return t;
    }

    /** For g('q',10), promote 'q' to int, 10 to float
     *  Given int g(int x, float y) {...} */
    public Type call(CymbolAST id, List args) {
        Symbol s = id.scope.resolve(id.getText());
        MethodSymbol ms = (MethodSymbol)s;
        id.symbol = ms;
        int i=0;
        for (Symbol a : ms.orderedArgs.values() ) { // for each arg
            CymbolAST argAST = (CymbolAST)args.get(i++);
			
            // get argument expression type and expected type
            Type actualArgType = argAST.evalType;
            Type formalArgType = ((VariableSymbol)a).type;
            int targ = actualArgType.getTypeIndex();
            int tformal = formalArgType.getTypeIndex();
			
            // do we need to promote argument type to defined type?
            argAST.promoteToType = promoteFromTo[targ][tformal];
        }
        return ms.type;
    }

    public Type member(CymbolAST expr, CymbolAST field) {
        StructSymbol scope=(StructSymbol)expr.evalType;// get scope of left
        Symbol s = scope.resolveMember(field.getText());// resolve ID in scope
        field.symbol = s;
        return s.type;           // return ID's type
    }

    // assignnment stuff (arg assignment in call())

    public void declinit(CymbolAST id, CymbolAST init) {
        int te = init.evalType.getTypeIndex(); //promote expr to decl type?
        int tdecl = id.symbol.type.getTypeIndex();
        init.promoteToType = promoteFromTo[te][tdecl];
    }
    public void ret(MethodSymbol ms, CymbolAST expr) {
        Type retType = ms.type; //promote return expr to function decl type?
        Type exprType = expr.evalType;
        int texpr = exprType.getTypeIndex();
        int tret = retType.getTypeIndex(); 
        expr.promoteToType = promoteFromTo[texpr][tret];
    }
    public void assign(CymbolAST lhs, CymbolAST rhs) {
        int tlhs = lhs.evalType.getTypeIndex(); // promote right to left?
        int trhs = rhs.evalType.getTypeIndex();
        rhs.promoteToType = promoteFromTo[trhs][tlhs];
    }

    public String toString() { return globals.toString(); }
}
