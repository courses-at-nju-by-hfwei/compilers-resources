/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class BytecodeDefinition {
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

    // INSTRUCTION BYTECODES
    public static final int INSTR_ADD = 1;
    // ...

    /** Used for assembly/disassembly; describes instruction set */
    public static Instruction[] instructions = new Instruction[] {
        null, // <INVALID>
        new Instruction("iadd",REG,REG,REG), // index is the opcode
    };
}
