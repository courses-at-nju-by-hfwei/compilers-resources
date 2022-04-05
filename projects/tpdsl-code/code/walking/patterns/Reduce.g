tree grammar Reduce;
options {
    tokenVocab=VecMath;      // use tokens from VecMath.g
    ASTLabelType=CommonTree; // we're using CommonTree nodes
    output=AST;              // build new ASTs from input AST
    filter=true;             // tree pattern matching mode
    backtrack=true;          // allow backtracking if it's needed
}

// START: strategy
bottomup // match these rules bottom-up
    :  xPlusx
    |  multBy2
    |  combineShifts
    ;
// END: strategy

// START: xPlusx
// x+x -> 2*x  (notation INT["2"] creates an INT node with text "2")
xPlusx: ^('+' i=INT j=INT {$i.int==$j.int}?) -> ^(MULT["*"] INT["2"] $j);
// END: xPlusx

// START: multBy2
// 2*x to be x<<1
multBy2
    :   ^('*' x=INT {$x.int==2}? y=.) -> ^(SHIFT["<<"] $y INT["1"])
    |   ^('*' a=. b=INT {$b.int==2}?) -> ^(SHIFT["<<"] $a INT["1"])
    ;
// END: multBy2

// START: combineShifts
combineShifts // x<<n<<m to be x<<(n+m)
    :  ^(SHIFT ^(SHIFT e=. n=INT) m=INT)
       -> ^(SHIFT["<<"] $e INT[String.valueOf($n.int+$m.int)])
	;
// END: combineShifts
