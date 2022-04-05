/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
/** A symbol to represent pointers to and arrays of types. */
public class PointerType extends Symbol implements Type {
	Type targetType;
    public PointerType(Type targetType) {
        super(targetType+"*");
        this.targetType = targetType;
    }
    public int getTypeIndex() { return SymbolTable.tPTR; }

    /** Can we assign this type to destination type?  destType must be 
     *  pointer and to same type unless object ptr.  Then, we have to do a
     *  polymorphic check. [Ha! This method is a perfect example of
     *  static typing getting in the way. Look at all those type casts!]
     */
    public boolean canAssignTo(Type destType) {
        // if not a pointer, return false
        if ( !(destType instanceof PointerType) ) return false;
        // What type is the target pointing at?
        Type destTargetType = ((PointerType)destType).targetType;
        Type srcTargetType = this.targetType;
        // if this and target are object pointers, check polymorphism
        if ( destTargetType instanceof ClassSymbol &&
             this.targetType instanceof ClassSymbol )
        {
            ClassSymbol thisClass   = (ClassSymbol)srcTargetType;
            ClassSymbol targetClass = (ClassSymbol)destTargetType;
            // Finally!  Here it is: the polymorphic type check :)
            return thisClass.isInstanceof(targetClass);
        }
        // not comparing object pointers; types we point at must be the same
        // For example: int *p; int *q; p = q;
        return srcTargetType == destTargetType;
    }
}
