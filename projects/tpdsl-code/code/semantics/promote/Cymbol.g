grammar Cymbol;
options {
  output = AST;              // build trees
  ASTLabelType = CymbolAST;  // use custom tree nodes
}

tokens {
  METHOD_DECL; // function definition
  ARG_DECL;    // parameter
  BLOCK;
  VAR_DECL;
  FIELD_DECL;
  CALL;
  ELIST;       // expression list
  EXPR; 	   // root of an expression
  UNARY_MINUS;
  UNARY_NOT;
  ASSIGN='=';
  INDEX;
}

compilationUnit
@after {$tree.setUnknownTokenBoundaries();}
    :   (	// hard to distinguish alts from left edge so backtrack
    		options {backtrack=true;} 
		:	structDeclaration | methodDeclaration | varDeclaration
		)+
    ;

structDeclaration
	:	'struct' ID '{' structMember+ '}' ';' -> ^('struct' ID structMember+) 
	;
	
structMember
	:	type ID ';'			-> ^(FIELD_DECL type ID)
	|	type ID '[]' ';'	-> ^(FIELD_DECL ^('[]' type) ID)
	|	structDeclaration
	;

// START: method
methodDeclaration
    :   type ID '(' formalParameters? ')' block
        -> ^(METHOD_DECL type ID formalParameters? block)
    ;
// END: method

formalParameters
    :   parameter (',' parameter)* -> parameter+
    ;
    
parameter
	:	type ID		 -> ^(ARG_DECL type ID)
	|	type ID '[]' -> ^(ARG_DECL ^('[]' type) ID)
	;

type:	primitiveType
    |	'struct' ID -> ID
	;

primitiveType
	:   'float'
    |   'int'
    |	'char'
    |	'boolean'
    |	'void'
    ;

// START: block
block
    :   '{' statement* '}' -> ^(BLOCK statement*)
    ;
// END: block

// START: var
varDeclaration
    :   type ID ('=' expression)? ';' 	   -> ^(VAR_DECL type ID expression?)
   	|	type ID '[]' ('=' expression)? ';' -> ^(VAR_DECL ^('[]' type) ID expression?)
	;
// END: var

statement
options {backtrack=true;} // hard to distinguish struct from var from left
    :   block
    |	structDeclaration
    |	varDeclaration
    |	'if' '(' expression ')' s=statement ('else' e=statement)?
    	-> ^('if' expression $s $e?)
    |   'return' expression? ';' -> ^('return' expression?)
    |	lhs '=' expression ';' -> ^('=' lhs expression)
    |   a=postfixExpression ';' // handles function calls like f(i);
    		-> ^(EXPR postfixExpression)
    ;

lhs :	postfixExpression -> ^(EXPR postfixExpression)
	;
	
expressionList
    :   expr (',' expr)* -> ^(ELIST expr+)
    |   -> ELIST
    ;

expression
    :   expr -> ^(EXPR expr)
    ;

expr:	equalityExpression
	;
	
equalityExpression
	:	relationalExpression (('!='^ | '=='^) relationalExpression)*
	;

relationalExpression
	:	additiveExpression
		(	(	(	'<'^
				|	'>'^
				|	'<='^
				|	'>='^
				)
				additiveExpression
			)*
		)
	;

additiveExpression
	:	multiplicativeExpression (('+'^ | '-'^) multiplicativeExpression)*
	;

multiplicativeExpression
	:	unaryExpression (('*'^ | '/'^) unaryExpression)*
	;

unaryExpression
	:	op='-' unaryExpression -> ^(UNARY_MINUS[$op] unaryExpression)
	|	op='!' unaryExpression -> ^(UNARY_NOT[$op] unaryExpression)
	|	postfixExpression
	;

// START: call
postfixExpression
    :   primary
    	(
    		(	r='('^ expressionList ')'!	{$r.setType(CALL);}
	    	|	r='['^ expr ']'!			{$r.setType(INDEX);}
    		|	r='.'^ ID
    		)
    	)*
    ;
// END: call

primary
    :   ID
    |   INT
    |	FLOAT
    |	CHAR
    |	'true'
    |	'false'
    |   '(' expression ')' -> expression
    ;

// LEXER RULES

ID  :   LETTER (LETTER | '0'..'9')*
    ;

fragment
LETTER
	:   ('a'..'z' | 'A'..'Z')
    ;

CHAR:	'\'' . '\'' ;

INT :   '0'..'9'+ ;
    
FLOAT
	:	INT '.' INT*
	|	'.' INT+
	;

WS  :   (' '|'\r'|'\t'|'\n') {$channel=HIDDEN;}
    ;

SL_COMMENT
    :   '//' ~('\r'|'\n')* '\r'? '\n' {$channel=HIDDEN;}
    ;
