grammar Sneakers;

@parser::header { package sneakers; }
@lexer::header { package sneakers; }

prog 	:	stat+;

stat	:	ID '=' expr NEWLINE
	|	fncall NEWLINE;

fncall	:	ID (expr)+
	|	'(' ID ')';

expr	:	INT;	

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

NEWLINE	:	'\n';

WS	:	' ' {skip();};

