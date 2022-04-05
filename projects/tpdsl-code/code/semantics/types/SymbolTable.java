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
    // types in increasing order of complexity ("wideness")
    public static final int tUSER = 0; // user-defined type
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

    /** arithmetic types defined in order of least to most 'complex' */
    public static final Type[] indexToType = {
        null, _boolean, _char, _int, _float, _void
    };

    GlobalScope globals = new GlobalScope();

    public SymbolTable() { initTypeSystem(); }
    
    protected void initTypeSystem() {
        for (Type t : indexToType) {
            if ( t!=null ) globals.define((BuiltInTypeSymbol)t);
        }
    }
    
    public Type bop(CymbolAST a, CymbolAST b)   { return a.evalType; }
    public Type relop(CymbolAST a, CymbolAST b) { return _boolean; }
    public Type eqop(CymbolAST a, CymbolAST b)  { return _boolean; }

    public Type uminus(CymbolAST a) { return a.evalType; }
    public Type unot(CymbolAST a)   { return _boolean; }

    public Type arrayIndex(CymbolAST id, CymbolAST index) {
        Symbol s = id.scope.resolve(id.getText());
        VariableSymbol vs = (VariableSymbol)s;
        id.symbol = vs;
        return ((ArrayType)vs.type).elementType;
    }

    public Type call(CymbolAST id, List args) {
        Symbol s = id.scope.resolve(id.getText());
        MethodSymbol ms = (MethodSymbol)s;
        id.symbol = ms;
        return ms.type;
    }

    public Type member(CymbolAST expr, CymbolAST field) {
        StructSymbol scope=(StructSymbol)expr.evalType; // get scope of expr
        Symbol s = scope.resolveMember(field.getText());// resolve ID in scope
        field.symbol = s;  // make AST point into symbol table
        return s.type;     // return ID's type
    }

    public String toString() { return globals.toString(); }
}
