grammar Sneakers;

@parser::header { package sneakers; }
@lexer::header { package sneakers; }

prog 	:	stat+;

stat	:	assignment ENDCAP
	|	fncall ENDCAP
	;

assignment
	:	ID '=' fncall
	|	ID '=' expr
	|	TYPEID '=' objdef
	;

objdef	:	'object' '{' NEWLINE? (defdecl NEWLINE?)* '}'
	;

defable	:	TYPEID
	|	fndecl NEWLINE? stat+
	;

defdecl	:	KEYWORD '=>' defable
	;
	
nested_id	:	ID ('.' ID)*
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

expr	:	fndecl
	|	'(' fncall ')'
	|	nested_id
//	|	ARRAY
	|	KEYWORD
	|	INT
	|	STRING
	;

/*ARRAY	:	'[' expr* ']'
	;*/

KEYWORD	:	':' ID
	;

ID  :	('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'| '_'|'-')*
    ;

TYPEID	:	('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	;

INT :	'0'..'9'+
    ;

NEWLINE	:	'\n';

ENDCAP	:	(NEWLINE | ';')
	;

WS	:	(' ' | ',') {skip();};

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

/*TODO:
- expressions that yield function symbols ie ((fn...) 1 2)
- ending with newlines...?
- param is still fucked up...
*/
