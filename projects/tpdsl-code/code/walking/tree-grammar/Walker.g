/** Template without actions for walking VecMath trees */
tree grammar Walker;
options {
    tokenVocab=VecMath;
    ASTLabelType=VecMathNode;
}

// START: prog
prog:   stat+ ;
// END: prog

// START: stat
stat:   ^('=' ID expr)  // match assignment subtree like (= x (+ 1 2))
    |   ^('print' expr) // match print subtree ilke (print (+ 1 2))
    ;
// END: stat

// START: expr
expr:   ^('+' expr expr)
    |   ^('*' expr expr)
    |   ^('.' expr expr)
    |   ^(VEC expr+)
    |   INT
    |   ID
    ;
// END: expr
