grammar ExprLR;

expr : expr '^'<assoc=right> expr
     | expr '*' expr  // match subexpressions joined with '*' operator
     | expr '+' expr  // match subexpressions joined with '+' operator
     | INT            // matches simple integer atom
     ;

INT : '0'..'9'+ ;
WS  : [ \n]+ -> skip ;
