grammar PredKeyword;

prog: stat+ ;

stat: keyIF expr stat
    | keyCALL ID ';'
    | ';'
    ;

expr: ID
    ;

keyIF : {_input.LT(1).getText().equals("if")}? ID ;

keyCALL : {_input.LT(1).getText().equals("call")}? ID ;

ID : 'a'..'z'+ ;
WS : (' '|'\n')+ {setChannel(HIDDEN);} ;
