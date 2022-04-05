grammar Make;

// START: ctor
@members {
MakeGenerator gen;
public MakeParser(TokenStream input, MakeGenerator gen) {
    super(input);
    this.gen = gen;
}
}
// END: ctor

// START: rules
rules
    :   {gen.start();} rule+ {gen.finish();}
    ;
// END: rules

// START: rule
rule
    :   target=ITEM ':'     {gen.target($target.text);}
        (i=ITEM {gen.dependency($i.text);})* '\n'
        (ACTION {gen.action($ACTION.text);})+
                            {gen.endTarget($target.text);}
    |   '\n' // ignore blank lines
    ;
// END: rule

ITEM:   ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'.'|'-'|'/')+
    ;

ACTION
    :   {getCharPositionInLine()==0}?=> (' '|'\t') ~'\n'+ '\n'
    ;
    
COMMENT
    :   '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

WS  :   (' '|'\t')+ {$channel=HIDDEN;} ;