grammar Sneakers;

options {output=AST;}
//tokens {STAT;}

@parser::header { package sneakers; }
@lexer::header { package sneakers; }

prog 	:	stat+;

stat	:	assignment ';'
	;

assignment
	:	any_id '=' expr
	|	any_id '=' fncall
	;


defable	:	TYPEID
	|	fndecl stat+
	;

defdecl	:	KEYWORD '=>' defable
	;


nested_id	
	:	any_id ('.' any_id)*
		;

fnname	:	nested_id
	|	KEYWORD
	;

fncall	:	fnname param+
	;

param	:	ID ':' expr
	|	expr
	;

fnparam	:	ID (':' TYPEID)?
	;

fndecl	:	'(' fnparam* ')' (':' TYPEID)? '->'
	;

expr	:	INT
	|	KEYWORD
	|	STRING
	|	dict
	|	nested_id
	|	fndecl
	|	standalone_fncall
//	|	ARRAY
	;

standalone_fncall
	:	'(' fncall ')'
	;

index_expr	
	:	KEYWORD
	|	INT
	|	STRING
	|	nested_id
	|	standalone_fncall
	;

dict_pair 
	:	index_expr '=>' expr
	;

dict	:	'{' (dict_pair)? (',' dict_pair)* '}'
	;  

/*ARRAY	:	'[' expr* ']'
	;*/

KEYWORD	:	':' ID
	;

ID  :	('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'| '_'|'-')*
    ;

TYPEID	:	('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	;

any_id
	:	ID
	|	TYPEID
	;

INT :	'0'..'9'+
    ;


WS	:	(' ' | '\t' | '\n') {skip();}
	;

STRING
    :  '"' ~('"')* '"'
    ;

/*TODO:
- expressions that yield function symbols ie ((fn...) 1 2)
- ending with newlines...?
- param is still fucked up...
*/
