grammar Sneakers;

@parser::header { package sneakers; }
@lexer::header { package sneakers; }

prog	:	block;

block 	:	(stat ';')+;

stat	:	assignment
	|	'return' expr
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

fncall	:	nested_id param (','? param)*
	;

param	:	ID ':' expr
	|	expr
	;

paramtype : 	TYPEID
	|	'(' TYPEID* ')' ':' TYPEID
	;	

fnparam	:	ID ':' paramtype
	;

anonfn	:	'#' '[' fncall ']'
	;

fndecl	:	'#' '(' ')' ':' TYPEID array //how can I avoid having to do this?
	|	'#' '(' fnparam (','? fnparam)* ')' ':' TYPEID array
	;

expr	:	index_expr
	|	dict
	|	fndecl
	|	anonfn
	|	array
	;

standalone_fncall
	:	'(' fncall ')'
	;

index_expr	
	:	KEYWORD
	|	INT
	|	STRING
	|	ANONVAR
	|	nested_id
	|	standalone_fncall
	;

dict_pair 
	:	index_expr '=>' expr
	;

dict	:	'{' (dict_pair)? (',' dict_pair)* '}'
	;  

array	:	'[' expr? (',' expr)* ']'
	|	'[' block ']'
	;


ANONVAR	:	'$' INT?
	;

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
*/
