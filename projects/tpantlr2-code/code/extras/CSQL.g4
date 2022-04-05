parser grammar CSQL;

options {tokenVocab=CharVocab;}

@header {
import java.util.Set;
import java.util.HashSet;
}

@members {
public static Set<String> keywords = new HashSet<String>() {{
    add("void");
    add("int");
    add("return");
}};
boolean notLetterOrDigit(int la) {
    return !Character.isLetterOrDigit(_input.LA(la));
}
}

// parser rules

prog:	ws? (var|func)+ EOF ;

type:	kint | kvoid | id ;

var	:	type id (ass expr)? semi ;

func:	type id lp args? rp body ;

args:	arg (',' arg)* ;

arg	:	type id ;

body:	lc stat+ rc ;

stat:	var
	|	kreturn expr semi
    |	id ass expr semi
    |	id colon
    ;

expr:	expr (eq|neq) expr
	|	expr star expr
	|	expr plus expr
	|	integer
	|	cchar
	|	id
	|	sqlselect
	;

// SQL

sqlselect
	:	kselect (star|idlist) kfrom sqlexpr (kwhere condition)?
	;

condition
	:	condition kand condition
	|	id sqlneq sqlexpr
	|	id sqleq sqlexpr
	;

kselect
	:	{notLetterOrDigit(7)}?
		('s'|'S') ('e'|'E') ('l'|'L') ('e'|'E') ('c'|'C') ('t'|'T')
		ws?
	;
kfrom
	:	{notLetterOrDigit(5)}?
		('f'|'F') ('r'|'R') ('o'|'O') ('m'|'M')
		ws?
	;

kwhere
	:	{notLetterOrDigit(6)}?
		('w'|'W') ('h'|'H') ('e'|'E') ('r'|'R') ('e'|'E')
		ws?
	;

kand:	{notLetterOrDigit(4)}? ('a'|'A') ('n'|'N') ('d'|'D') ws? ;

idlist
	:	id (',' id)*
	;

sqlexpr
	:	sqlstring
	|	id
	|	integer
	;

sqlstring
	:	squote ~'\''+ squote ws?
	;

sqleq : '=' ws? ;
sqlneq : '<' '>' ws? ;

// lexical rules

id  :   letter+ {!keywords.contains($text)}? ws? ;

// can ref '{' in grammar but no ws? after

squote:	'\'' ws? ;
lc	:	'{' ws? ;
rc	:	'}' ws? ;
lp	:	'(' ws? ;
rp	:	')' ws? ;
star:	'*' ws? ;
plus:	'+' ws? ;
ass :   '=' ws? ;
eq  :   '=' '=' ws? ;
neq :   '!' '=' ws? ;
colon:  ':' ws? ;
semi:   ';' ws? ;

kint:		{notLetterOrDigit(4)}? 'i' 'n' 't' ws? ;
kvoid:		{notLetterOrDigit(5)}? 'v' 'o' 'i' 'd' ws? ;
kreturn:	{notLetterOrDigit(7)}? 'r' 'e' 't' 'u' 'r' 'n' ws? ;

cchar:	squote . squote ws?
	;

integer : digit+ ws? ;

digit
    :   '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
    ;

letter
    :   'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j'
    |   'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't'
    |   'u' | 'v' | 'w' | 'x' | 'y' | 'z'
	|	'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J'
	|	'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T'
	|	'U' | 'V' | 'W' | 'X' | 'Y' | 'Z'
;

ws  :   (' ' | '\t' | '\n' | comment)+ ;
comment : '/' '/' ~('\r'|'\n')* '\r'? '\n' ;
