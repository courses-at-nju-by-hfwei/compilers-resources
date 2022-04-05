// START: header
tree grammar Printer; // this grammar is a tree grammar called Printer
options {
    tokenVocab=VecMath;      // use token vocabulary from VecMath.g
    ASTLabelType=CommonTree; // use homogeneous CommonTree for $ID, etc.
}
@members { void print(String s) { System.out.print(s); } }
// END: header

// START: prog
prog:   stat+ ; // match list of statement subtrees
// match trees like ('=' x 1) and ('print' ('+' 3 4))
stat:   ^('=' ID  {print($ID.text+" = ");} expr) {print("\n");}
    |   ^('print' {print("print ");}       expr) {print("\n");}
    ;
// END: prog

// START: expr
expr:   ^('+' expr {print("+");} expr)
    |   ^('*' expr {print("*");} expr)
    |   ^('.' expr {print(".");} expr)
    |   ^(VEC {print("[");} expr ({print(", ");} expr)* {print("]");})
    |   INT {print($INT.text);}
    |   ID  {print($ID.text);}
    ;
// END: expr
