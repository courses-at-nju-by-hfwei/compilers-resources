/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class StackFrame {
    FunctionSymbol sym;
    int returnAddress;
    Object[] registers;
    public StackFrame(FunctionSymbol sym, int returnAddress) {
        this.sym = sym;
        this.returnAddress = returnAddress;
        // Allocate space for registers; 1 extra for r0 reserved reg
        registers = new Object[sym.nargs+sym.nlocals+1];
    }
}
