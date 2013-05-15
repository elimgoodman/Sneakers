grammar Sneakers;

@parser::header { package sneakers; }
@lexer::header { package sneakers; }

prog 	:	stat+;

stat	:	ID '=' expr NEWLINE
	|	fncall NEWLINE
	|	NEWLINE
	;

fncall	:	ID param+
	|	'(' ID ')'
	;

param	:	expr
	|	ID
	|	ID ':' TYPEID
	;

expr	:	INT
	|	fncall
	;

ID  :	('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'| '_'|'-')*
    ;

TYPEID	:	('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	;

INT :	'0'..'9'+
    ;

NEWLINE	:	'\n';

WS	:	' ' {skip();};

