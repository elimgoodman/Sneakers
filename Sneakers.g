grammar Sneakers;

@parser::header { package sneakers; }
@lexer::header { package sneakers; }

prog 	:	stat+;

stat	:	ID '=' fncall NEWLINE
	|	ID '=' expr NEWLINE
	|	TYPEID '=' objdef
	|	fncall NEWLINE
	|	NEWLINE
	;

objdef	:	'object' '{' NEWLINE? (defdecl NEWLINE?)* '}'
	;

defdecl	:	keyword '=>' TYPEID
	;
	
nested_id	:	ID ('.' ID)*
		;

fnname	:	nested_id
	|	keyword
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

expr	:	fndecl
	|	'(' fncall ')'
	|	nested_id
	|	array
	|	keyword
	|	INT
	;

array	:	'[' expr* ']'
	;

keyword	:	':' ID
	;

ID  :	('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'| '_'|'-')*
    ;

TYPEID	:	('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	;

INT :	'0'..'9'+
    ;

NEWLINE	:	'\n';

WS	:	(' ' | ',') {skip();};

/*TODO:
- expressions that yield function symbols ie ((fn...) 1 2)
- ending with newlines...?
- param is still fucked up...
*/
