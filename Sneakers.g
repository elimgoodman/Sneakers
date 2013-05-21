grammar Sneakers;

options {
	output=AST;
	ASTLabelType=SneakersAST;
}



tokens {
	BLOCK;
	FNCALL;
	PARAM;
	RET;
	FNDECL;
	MUTDECL;
	BLOCKDECL;
	FNPARAM;
	PARAMTYPEFN;
	ARRAY;
	DICT;
	ANONFN;
}

@parser::header { package sneakers; }
@lexer::header { package sneakers; }

prog	:	block
	;

block 	:	(stat ';')+ -> ^(BLOCK stat+);

stat	:	assignment
	|	ifstat
	|	returnstat
	|	mutcall
	|	'pass'
	;

returnstat
	:	'return' fncall -> ^(RET fncall)
	|	'return' expr -> ^(RET expr)
	;

ifstat	:	'if' ifexpr=expr ifblock=contained_block 
		('elseif' elifexpr+=expr elifblock+=contained_block)* 
		('else' elseblock=contained_block)?
		-> ^('if' $ifexpr $ifblock ($elifexpr $elifblock)* $elseblock?);

assignment
	:	any_id '=' expr -> ^('=' any_id expr)
	|	any_id '=' fncall -> ^('=' any_id fncall)
	;


defable	:	TYPEID
	|	fndecl stat+
	;

defdecl	:	KEYWORD '=>' defable
	;


nested_id	
	:	ANONVAR ('.' any_id)* -> ANONVAR any_id*
	|	any_id ('.' any_id)* -> any_id*
	;

fncall	:	nested_id param (','? param)* -> ^(FNCALL nested_id param*)
	;

param	:	ID ':' expr -> ^(PARAM ID expr)
	|	expr -> ^(PARAM expr)
	;

paramtype : 	TYPEID
	|	'(' TYPEID (',' TYPEID)* ')' ':' TYPEID -> ^(PARAMTYPEFN TYPEID+)
	|	'(' ')' ':' TYPEID -> ^(PARAMTYPEFN TYPEID)
	;	

fnparam	:	ID ':' paramtype -> ^(FNPARAM ID paramtype)
	;

anonfn	:	'#' '[' fncall ']' -> ^(ANONFN fncall)
	|	'#' '[' nested_id ']' -> ^(ANONFN nested_id)
	;

blockdecl
	:	'(' ')' (':' TYPEID)? contained_block -> ^(BLOCKDECL TYPEID? contained_block)
	|	'(' fnparam (','? fnparam)* ')' (':' TYPEID)? contained_block -> ^(BLOCKDECL fnparam* TYPEID? contained_block)
	;

fndecl	:	'#' blockdecl -> ^(FNDECL blockdecl)
	;

mutdecl	:	'@' blockdecl -> ^(MUTDECL blockdecl)
	;

expr	:	index_expr
	|	dict
	|	fndecl
	|	mutdecl
	|	anonfn
	|	array
	;

standalone_fncall
	:	'(' fncall ')' -> fncall
	;

mutcall	:	'<' nested_id '>' -> nested_id
	|	'<' fncall '>' -> fncall
	;

index_expr
	:	KEYWORD
	|	INT
	|	STRING
	|	nested_id
	|	standalone_fncall
	;

dict_pair 
	:	index_expr '=>' expr -> index_expr expr
	;

dict	:	'{' (dict_pair)? (',' dict_pair)* '}' -> ^(DICT dict_pair*)
	;  

contained_block
	:	'[' block ']' -> block
	;

array	:	'[' expr? (',' expr)* ']' -> ^(ARRAY expr*)
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
- expressions that yield function symbols ie ((fn...) 1 2)
- exceptions
- overloaded fns
- member mutators (ie, things that are elements of a class but modify member variables)
- parameterized types
*/
