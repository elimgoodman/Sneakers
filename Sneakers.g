grammar Sneakers;

@parser::header { package sneakers; }
@lexer::header { package sneakers; }

prog 	:	(stat | NEWLINE)+;

endcap	:	(NEWLINE | ';')
	;

stat	:	assignment endcap
	|	fncall endcap
	;

assignment
	:	ID '=' fncall
	|	ID '=' expr
	|	TYPEID '=' objdef
	|	TYPEID '=' fncall
	;

objdef	:	'object' '{' NEWLINE? (defdecl NEWLINE?)* '}'
	;

defable	:	TYPEID
	|	fndecl NEWLINE? stat+
	;

defdecl	:	KEYWORD '=>' defable
	;

indexable
	:	(ID | TYPEID)
	;

nested_id	
	:	indexable ('.' indexable)*
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
	|	standalone_fncall
	|	STRING
	|	nested_id
//	|	ARRAY
	|	KEYWORD
	|	INT
	|	dict
	;

standalone_fncall
	:	'(' fncall ')'
	;

index_expr	:	KEYWORD
	|	INT
	|	STRING
	|	nested_id
	|	standalone_fncall
	;

dict	:	'{' NEWLINE* (index_expr '=>' expr NEWLINE*)* NEWLINE* '}'
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

/*ENDCAP	:	(NEWLINE | ';' )
	;
^^^WTF doesn't this work */


WS	:	(' ' | ',' | '\t' ) {skip();};

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
