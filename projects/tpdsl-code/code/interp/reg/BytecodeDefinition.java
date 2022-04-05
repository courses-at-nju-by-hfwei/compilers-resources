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
    public static final short INSTR_BRF = 16;    // branch if false
    public static final short INSTR_CCONST = 17;  // load constant char
    public static final short INSTR_ICONST = 18;  // load constant integer
    public static final short INSTR_FCONST = 19;  // load constant float
    public static final short INSTR_SCONST = 20;  // load constant string
    public static final short INSTR_GLOAD = 21;   // load from global memory
    public static final short INSTR_GSTORE = 22;  // store in global memory
    public static final short INSTR_FLOAD = 23;   // field load
    public static final short INSTR_FSTORE = 24;  // store field
    public static final short INSTR_MOVE = 25;   // reg to reg move
    public static final short INSTR_PRINT =26;   // print reg
    public static final short INSTR_STRUCT = 27; // create new struct
    public static final short INSTR_NULL = 28;   // load null into register
    public static final short INSTR_HALT = 29;

    public static Instruction[] instructions = new Instruction[] {
        null, // <INVALID>
        new Instruction("iadd", REG,REG,REG), // index is the opcode
        new Instruction("isub", REG,REG,REG),
        new Instruction("imul", REG,REG,REG),
        new Instruction("ilt", REG,REG,REG),
        new Instruction("ieq", REG,REG,REG),
        new Instruction("fadd", REG,REG,REG),
        new Instruction("fsub", REG,REG,REG),
        new Instruction("fmul", REG,REG,REG),
        new Instruction("flt", REG,REG,REG),
        new Instruction("feq", REG,REG,REG),
        new Instruction("itof", REG,REG),
        new Instruction("call", FUNC,REG),
        new Instruction("ret"),
        new Instruction("br", INT),
        new Instruction("brt", REG,INT),
        new Instruction("brf", REG,INT),
        new Instruction("cconst", REG,INT),
        new Instruction("iconst", REG,INT),
        new Instruction("fconst", REG,POOL),
        new Instruction("sconst", REG,POOL),
        new Instruction("gload", REG,INT),
        new Instruction("gstore", REG,INT),
        new Instruction("fload", REG,REG,INT),
        new Instruction("fstore", REG,REG,INT),
        new Instruction("move", REG,REG),
        new Instruction("print", REG),
        new Instruction("struct", REG,INT),
        new Instruction("null", REG), 
        new Instruction("halt")
    };
}
