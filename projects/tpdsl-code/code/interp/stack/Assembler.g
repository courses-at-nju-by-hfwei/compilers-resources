/** A generic bytecode assembler whose instructions take 0..3 operands.
 *  Instruction set is dictated externally with a String[].  Implement
 *  specifics by subclassing and defining gen() methods. Comments start
 *  with ';' and all instructions end with '\n'.  Handles both register (rN)
 *  and stack-based assembly instructions.  Labels are "ID:".  "main:" label
 *  is where we start execution.  Use .globals and .def for global data
 *  and function definitions, respectively.
 */
grammar Assembler;

// START: members
@members {
    // Define the functionality required by the parser for code generation
    protected void gen(Token instrToken) {;}
    protected void gen(Token instrToken, Token operandToken) {;}
    protected void gen(Token instrToken, Token oToken1, Token oToken2) {;}
    protected void gen(Token instrToken, Token oToken1, Token oToken2, Token oToken3) {;}
    protected void checkForUnresolvedReferences() {;}
    protected void defineFunction(Token idToken, int nargs, int nlocals) {;}
    protected void defineDataSize(int n) {;}
    protected void defineLabel(Token idToken) {;}
}
// END: members

program
    :   globals?
        ( functionDeclaration | instr | label | NEWLINE )+
        {checkForUnresolvedReferences();}
    ;
   
// how much data space
// START: data
globals : NEWLINE* '.globals' INT NEWLINE {defineDataSize($INT.int);} ;
// END: data

//  .def fact: args=1, locals=0
// START: func
functionDeclaration
    :   '.def' name=ID ':' 'args' '=' a=INT ',' 'locals' '=' lo=INT NEWLINE
        {defineFunction($name, $a.int, $lo.int);}
    ;
// END: func

// START: instr
instr
    :   ID NEWLINE                         {gen($ID);}
    |   ID operand NEWLINE                 {gen($ID,$operand.start);}
    |   ID a=operand ',' b=operand NEWLINE {gen($ID,$a.start,$b.start);}
    |   ID a=operand ',' b=operand ',' c=operand NEWLINE
        {gen($ID,$a.start,$b.start,$c.start);}
    ;
// END: instr

// START: operand
operand
    :   ID   // basic code label; E.g., "loop"
    |   REG  // register name; E.g., "r0"
    |   FUNC // function label; E.g., "f()"
    |   INT
// ...
// END: operand
    |   CHAR
    |   STRING
    |   FLOAT
    ;

label
    :   ID ':' {defineLabel($ID);}
    ;

REG :   'r' INT ;

ID  :   LETTER (LETTER | '0'..'9')* ;

FUNC:   ID '()' {setText($ID.text);} ;

fragment
LETTER
    :   ('a'..'z' | 'A'..'Z')
    ;
    
INT :   '-'? '0'..'9'+ ;

CHAR:   '\'' . '\'' ;

STRING: '\"' STR_CHARS '\"' {setText($STR_CHARS.text);} ;

fragment STR_CHARS : ~'"'* ;

FLOAT
    :   INT '.' INT*
    |   '.' INT+
    ;

WS  :   (' '|'\t')+ {skip();} ;

NEWLINE
    :   (';' .*)? '\r'? '\n'  // optional comment followed by newline
    ;
