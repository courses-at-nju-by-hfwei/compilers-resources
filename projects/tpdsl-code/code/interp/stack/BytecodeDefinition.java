/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class BytecodeDefinition {
    // operand types
    public static final int REG = AssemblerParser.REG;
    public static final int FUNC = AssemblerParser.FUNC;
    public static final int INT = AssemblerParser.INT;
    public static final int POOL = 1000; // unique imaginary token

    public static class Instruction {
        String name; // E.g., "iadd", "call"
        int[] type = new int[3];
        int n = 0;
        public Instruction(String name) { this(name,0,0,0); n=0; }
        public Instruction(String name, int a) { this(name,a,0,0); n=1; }
        public Instruction(String name, int a, int b) { this(name,a,b,0); n=2; }
        public Instruction(String name, int a, int b, int c) {
            this.name = name;
            type[0] = a;
            type[1] = b;
            type[2] = c;
            n = 3;
        }
    }

    // INSTRUCTION BYTECODES (byte is signed; use a short to keep 0..255)
    public static final short INSTR_IADD = 1;    // int add
    public static final short INSTR_ISUB = 2;
    public static final short INSTR_IMUL = 3;
    public static final short INSTR_ILT = 4;     // int less than
    public static final short INSTR_IEQ = 5;     // int equal
    public static final short INSTR_FADD = 6;    // float add
    public static final short INSTR_FSUB = 7;
    public static final short INSTR_FMUL = 8;
    public static final short INSTR_FLT = 9;     // float less than
    public static final short INSTR_FEQ = 10;
    public static final short INSTR_ITOF = 11;   // int to float
    public static final short INSTR_CALL = 12;
    public static final short INSTR_RET = 13;    // return with/without value
    public static final short INSTR_BR = 14;     // branch
    public static final short INSTR_BRT = 15;    // branch if true
    public static final short INSTR_BRF = 16;    // branch if true
    public static final short INSTR_CCONST = 17; // push constant char
    public static final short INSTR_ICONST = 18; // push constant integer
    public static final short INSTR_FCONST = 19; // push constant float
    public static final short INSTR_SCONST = 20; // push constant string
    public static final short INSTR_LOAD = 21;   // load from local context
    public static final short INSTR_GLOAD = 22;  // load from global memory
    public static final short INSTR_FLOAD = 23;  // field load
    public static final short INSTR_STORE = 24;  // storein local context
    public static final short INSTR_GSTORE = 25; // store in global memory
    public static final short INSTR_FSTORE = 26; // field store
    public static final short INSTR_PRINT = 27;  // print stack top
    public static final short INSTR_STRUCT = 28; // push new struct on stack
    public static final short INSTR_NULL = 29;   // push null onto stack
    public static final short INSTR_POP = 30;    // throw away top of stack
    public static final short INSTR_HALT = 31;

    public static Instruction[] instructions = new Instruction[] {
        null, // <INVALID>
        new Instruction("iadd"), // index is the opcode
        new Instruction("isub"),
        new Instruction("imul"),
        new Instruction("ilt"),
        new Instruction("ieq"),
        new Instruction("fadd"),
        new Instruction("fsub"),
        new Instruction("fmul"),
        new Instruction("flt"),
        new Instruction("feq"),
        new Instruction("itof"),
        new Instruction("call", FUNC),
        new Instruction("ret"),
        new Instruction("br", INT),
        new Instruction("brt", INT),
        new Instruction("brf", INT),
        new Instruction("cconst", INT),
        new Instruction("iconst", INT),
        new Instruction("fconst", POOL),
        new Instruction("sconst", POOL),
        new Instruction("load", INT),
        new Instruction("gload", INT),
        new Instruction("fload", INT),
        new Instruction("store", INT),
        new Instruction("gstore", INT),
        new Instruction("fstore", INT),
        new Instruction("print"),
        new Instruction("struct", INT),
        new Instruction("null"),
        new Instruction("pop"),
        new Instruction("halt") 
    };
}
