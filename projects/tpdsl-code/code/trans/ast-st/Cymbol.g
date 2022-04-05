grammar Cymbol;
options {
  output = AST;              // build trees
  ASTLabelType = CommonTree;
}

tokens {
  CLASS_DECL='class';
  METHOD_DECL; // function definition
  ARG_DECL;    // parameter
  BLOCK;
  VAR_DECL;
  FIELD_DECL;
  CALL;
  ELIST;       // expression list
  EXPR;        // root of an expression
  UNARY_MINUS;
  UNARY_NOT;
  ASSIGN='=';
  ADDR;        // addr of
  DEREF;           // *p dereference pointer
  ADD='+';
  MEMBER='.';
}

compilationUnit
@after {$tree.setUnknownTokenBoundaries();}
    :   (   classDeclaration | methodDeclaration | varDeclaration
        )+
    ;

classDeclaration
    :   'class' ID superClass? '{' classMember+ '}' ';'
        -> ^('class' ID superClass? classMember+)
    ;
superClass
    :   ':' ID -> ^(':' ID)
    ;

classMember
    :   varDeclaration
    |   methodDeclaration
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
    :   type ID      -> ^(ARG_DECL type ID)
    |   type ID '[]' -> ^(ARG_DECL ^('*' type) ID)
    |   type '*' ID  -> ^(ARG_DECL ^('*' type) ID)
    ;

type:   primitiveType
    |   ID
    ;

primitiveType
    :   'float'
    |   'int'
    |   'char'
    |   'boolean'
    |   'void'
    ;

// START: block
block
    :   '{' statement* '}' -> ^(BLOCK statement*)
    ;
// END: block

// START: var
varDeclaration
    :   type ID ('=' expression)? ';'
                             -> ^(VAR_DECL type ID expression?)
    |   type ID '[]' ('=' expression)? ';'
                             -> ^(VAR_DECL ^('*' type) ID expression?)
    |   type '*' ID ('=' expression)? ';'
                             -> ^(VAR_DECL ^('*' type) ID expression?)
    ;
// END: var

statement
options {backtrack=true;}
    :   block
    |   varDeclaration
    |   'if' '(' expression ')' s=statement ('else' e=statement)?
        -> ^('if' expression $s $e?)
    |   'return' expression? ';' -> ^('return' expression?)
    |   lhs '=' expression ';' -> ^('=' lhs expression)
    |   a=postfixExpression ';' // handles function calls like f(i);
            -> ^(EXPR postfixExpression)
    ;

lhs :   unaryExpression -> ^(EXPR unaryExpression) ;
    
expressionList
    :   expr (',' expr)* -> ^(ELIST expr+)
    |   -> ELIST
    ;

expression
    :   expr -> ^(EXPR expr)
    ;

expr:   equalityExpression
    ;
    
equalityExpression
    :   relationalExpression (('!='^ | '=='^) relationalExpression)*
    ;

relationalExpression
    :   additiveExpression
        (   (   (   '<'^
                |   '>'^
                |   '<='^
                |   '>='^
                )
                additiveExpression
            )*
        )
    ;

additiveExpression
    :   multiplicativeExpression (('+'^ | '-'^) multiplicativeExpression)*
    ;

multiplicativeExpression
    :   unaryExpression (('*'^ | '/'^) unaryExpression)*
    ;

unaryExpression
    :   op='-' unaryExpression -> ^(UNARY_MINUS[$op] unaryExpression)
    |   op='!' unaryExpression -> ^(UNARY_NOT[$op] unaryExpression)
    |   op='&' unaryExpression -> ^(ADDR[$op] unaryExpression)
    |   op='*' unaryExpression -> ^(DEREF[$op] unaryExpression)
    |   postfixExpression
    ;

// START: postfixExpression
postfixExpression
    :   (primary->primary)
        (
            (   '(' expressionList ')'
                -> ^(CALL["CALL"] $postfixExpression expressionList)
            |   r='[' expr ']' // convert a[i] to *(a+i)
                -> ^(DEREF[$r,"*"] ^(ADD["+"] $postfixExpression expr))
            |   '.' ID
                -> ^('.' $postfixExpression ID)
            |   r='->' ID // convert p->x to (*p).x
                -> ^(MEMBER[$r] ^(DEREF $postfixExpression) ID)
            )   
        )*              
    ;           
// END: postfixExpression

primary
    :   ID
    |   INT
    |   FLOAT
    |   CHAR
    |   'true'
    |   'false'
    |   '(' expr ')' -> expr
    ;

// LEXER RULES

ID  :   LETTER (LETTER | '0'..'9')*
    ;

fragment
LETTER
    :   ('a'..'z' | 'A'..'Z')
    ;

CHAR:   '\'' . '\'' ;

INT :   '0'..'9'+ ;
    
FLOAT
    :   INT '.' INT*
    |   '.' INT+
    ;

WS  :   (' '|'\r'|'\t'|'\n') {$channel=HIDDEN;}
    ;

SL_COMMENT
    :   '//' ~('\r'|'\n')* '\r'? '\n' {$channel=HIDDEN;}
    ;
