grammar Sneakers;

@parser::header { package sneakers; }
@lexer::header { package sneakers; }

prog	:	block;

block 	:	(stat ';')+;

stat	:	assignment
	|	ifstat
	|	'return' fncall
	|	'return' expr
	|	mutcall
	|	'pass'
	;

ifstat	:	'if' expr contained_block ('elseif' expr contained_block)* ('else' contained_block)?;

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
	:	(any_id | ANONVAR) ('.' any_id)*
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
	|	'#' '[' nested_id ']'
	;

blockdecl
	:	'(' ')' (':' TYPEID)? contained_block
	|	'(' fnparam (','? fnparam)* ')' (':' TYPEID)? contained_block
	;

fndecl	:	'#' blockdecl
	;

mutdecl	:	'@' blockdecl
	;

expr	:	index_expr
	|	dict
	|	fndecl
	|	mutdecl
	|	anonfn
	|	array
	;

standalone_fncall
	:	'(' fncall ')'
	;

mutcall	:	'<' nested_id '>'
	|	'<' fncall '>'
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

contained_block
	:	'[' block ']'
	;

array	:	'[' expr? (',' expr)* ']'
	;


ANONVAR	:	'$' INT?
	;

KEYWORD	:	':' ID
	;

ID  :	('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'| '_'|'-' | '!' | '?' | '=' | '>' | '<')*
    ;

TYPEID	:	('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	;

MUTID	:	'@' ID
	;

any_id
	:	ID
	|	TYPEID
	|	MUTID
	;

INT :	'0'..'9'+
    ;


WS	:	(' ' | '\t' | '\n') {skip();}
	;

STRING
    :  '"' ~('"')* '"'
    ;

/*TODO:
- loops
- if statements
- expressions that yield function symbols ie ((fn...) 1 2)
*/
