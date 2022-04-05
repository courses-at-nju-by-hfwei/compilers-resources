/** A simple dynamically-typed language that smacks of Python.
 *  This builds a tree, then we'll interpret it with a tree grammar
 *  Build a convential symbol table while parsing.  Save
 *  symbol ptrs in AST nodes.
 */
grammar Pie;
options {output=AST; ASTLabelType=PieAST;}

tokens {
	ARGS; FIELDS; BLOCK; CALL; IF='if'; ASSIGN='='; PRINT='print';
	WHILE='while'; RETURN='return'; DEF='def'; ADD='+'; SUB='-';
	MUL='*'; EQ='=='; LT='<'; STRUCT='struct'; DOT='.'; NEW='new';
	}

@members {
    Interpreter interp;
    Scope currentScope;
    public PieParser(TokenStream input, Interpreter interp) {
        this(input);
        this.interp = interp;
        currentScope = interp.globalScope;
    }
}

program
	:	( functionDefinition | statement )+ EOF 
		-> ^(BLOCK statement+)
	;
	
structDefinition
    :   'struct' name=ID '{' 
    	{
    	StructSymbol ss = new StructSymbol($name.text, currentScope);
        currentScope.define(ss); // def struct in current scope
        currentScope = ss;       // set current scope to struct scope
		}
		vardef (',' vardef)* '}' NL
		{currentScope = currentScope.getEnclosingScope();}
		-> // pass nothing to interpreter
    ;

functionDefinition
	:	'def' ID 
		{
        FunctionSymbol fs = new FunctionSymbol($ID.text,currentScope);
        currentScope.define(fs); // def method in globals
        currentScope = fs;       // set current scope to method scope
        }
        '(' (vardef (',' vardef)* )? ')'
		{currentScope = new LocalScope(fs);}
		slist
		{
		fs.blockAST = $slist.tree;
		currentScope = currentScope.getEnclosingScope();
		currentScope = currentScope.getEnclosingScope();
		}
		-> // pass nothing to interpreter
	;

slist
	:	':' NL statement+ '.' NL	-> ^(BLOCK statement+)
	|	statement					-> ^(BLOCK statement)
	;

statement
	:	structDefinition
	|	qid '=' expr NL				-> ^('=' qid expr)
	|	'return' expr NL  			-> ^('return' expr)
	|	'print' expr NL	 			-> ^('print' expr)
	|	'if' expr c=slist ('else' el=slist)? -> ^('if' expr $c $el?)
	|	'while' expr slist			-> ^('while' expr slist)
	|	call NL						-> call
	|	NL							->
	;

call
@after {
	$call.tree.scope = currentScope;
	//$call.tree.symbol = currentScope.resolve($name.text);
}
	:	name=ID '(' (expr (',' expr )*)? ')' -> ^(CALL ID expr*) ;

expr:	addexpr (('=='|'<')^ addexpr)? ;

addexpr
	:	mulexpr (('+'|'-')^ mulexpr)*
	;

mulexpr 
	:	atom ('*'^ atom)*
	;

atom 
	:	INT		    
	|	CHAR	    
	|	FLOAT	    
	|	STRING	    
	|	qid		    
	|	call
	|	instance
	|	'(' expr ')' -> expr
	;

instance
@after {
	PieAST nameNode = (PieAST)$instance.tree.getChild(0);
	nameNode.scope = currentScope;
}
	:	'new' sname=ID
		-> ^('new' ID)
	;

qid :	ID ('.'^ ID)* ;  // CAN'T RESOLVE TIL RUNTIME!

vardef
	:	ID
		{
		$ID.tree.scope = currentScope;
		VariableSymbol vs = new VariableSymbol($ID.text);
		currentScope.define(vs);
		}
	;

// L e x i c a l  R u l e s

NL	:	'\r'? '\n' ;

ID  :   LETTER (LETTER | '0'..'9')*  ;

fragment
LETTER
	:   ('a'..'z' | 'A'..'Z')
    ;

CHAR:	'\'' . '\'' ;

STRING:	'\"' .* '\"' ;

INT :   '0'..'9'+ ;
    
FLOAT
	:	INT '.' INT*
	|	'.' INT+
	;

WS  :   (' '|'\t') {$channel=HIDDEN;} ;

SL_COMMENT
    :   '#' ~('\r'|'\n')* {$channel=HIDDEN;}
    ;