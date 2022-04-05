// START: header
tree grammar Gen;
options {
  tokenVocab = Cymbol;
  ASTLabelType = CommonTree;
  output = template;
}
// END: header

// START: compilationUnit
compilationUnit
    :   ( d+=classDeclaration | d+=methodDeclaration | d+=varDeclaration )+
        -> file(defs={$d})
    ;
// END: compilationUnit

// START: class
classDeclaration
    :   ^('class' name=ID (^(':' sup=ID))? m+=classMember+)
        -> class(name={$name.text}, sup={$sup.text}, members={$m})
    ;
// END: class

classMember
    :   varDeclaration      -> {$varDeclaration.st}
    |   methodDeclaration   -> {$methodDeclaration.st}
    ;   

methodDeclaration
    :   ^(METHOD_DECL type ID a+=parameter* block)
        -> method(name={$ID.text}, retType={$type.st}, args={$a}, block={$block.st})
    ;

parameter
    :   ^(ARG_DECL (^(p='*' t=type)|t=type) ID)
        -> arg(name={$ID.text}, type={$t.st}, ptr={p!=null?"*":null})
    ;

// START: type
type:   primitiveType   -> {$primitiveType.st}
    |   ID              -> {%{$ID.text}}
    ;
// END: type

// START: primitiveType
primitiveType
@after {$st = %{$text};}
    :   'float'
    |   'int'
    |   'char'
    |   'boolean'
    |   'void'
    ;
// END: primitiveType

// START: block
block
    :   ^(BLOCK s+=statement*) -> block(stats={$s})
    ;
// END: block

// START: var
varDeclaration
    :   ^(VAR_DECL ^(p='*' type) ID expression?)
        -> var(name={$ID.text}, type={$type.st}, init={$expression.st}, ptr={$p})
    |   ^(VAR_DECL type ID expression?)
        -> var(name={$ID.text}, type={$type.st}, init={$expression.st})
    ;
// END: var

statement
    :   block           -> {$block.st}
    |   varDeclaration  -> {$varDeclaration.st}
    |   ^('if' expression s1=statement s2=statement?)
                        -> if(cond={$expression.st}, stat1={$s1.st}, stat2={$s2.st})
    |   ^('return' expression?)
                        -> return(v={$expression.st})
// START: assign
    |   ^('=' a=expression b=expression) -> assign(a={$a.st}, b={$b.st})
// END: assign
    |   ^( EXPR ^(CALL ID ^(ELIST p+=expr*)) )
                        -> callstat(name={$ID.text}, args={$p})
    ;

expression
    :   ^(EXPR expr) -> {$expr.st}
    ;

expr
options {backtrack=true;}
    :   atom                        -> {$atom.st}
    |   ^(UNARY_MINUS v=expr)       -> unary_minus(v={$v.st})
    |   ^(UNARY_NOT v=expr)         -> unary_not(v={$v.st})
    |   ^(ADDR v=expr)              -> addr(v={$v.st})     
    |   ^(DEREF ^('+' ID v=expr))   -> index(array={$ID.text}, i={$v.st})
    |   ^(DEREF v=expr)             -> deref(v={$v.st})
    |   ^('.' o=expr ID)            -> member(obj={$o.st}, name={$ID.text})
    |   ^(CALL ID ^(ELIST a+=expr*))-> call(name={$ID.text}, args={$a})
    |   ^(op x=expr y=expr)         -> operation(op={$op.st}, x={$x.st}, y={$y.st})
    ;

atom
@after {$st = %{$text};}
    :   'true'
    |   'false'
    |   CHAR 
    |   INT         
    |   FLOAT       
    |   ID
    ;

// START: op
op
// Text of operator is $start.getText(); $start is root token for op
@after {$st = %operator(o={$start.getText()});}
    :   bop | relop | eqop
    ; 
// END: op

bop :   '+' | '-' | '*' | '/' ;

relop:  '<' | '>' | '<=' | '>=' ; // '<' is start of tag in st oops.

eqop:   '!=' | '==' ;
