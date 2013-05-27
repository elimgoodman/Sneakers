grammar Sneakers;

options {
	output=AST;
	//ASTLabelType=SneakersAST;
	ASTLabelType=CommonTree;
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
	PARAMTYPEMUT;
	ARRAY;
	DICT;
	ANONFN;
	FIELDDEF;
	ASSIGN='=';
	CLASSDEF='class';
	EXPR;
}

@parser::header { package sneakers; }
@lexer::header { package sneakers; }

@parser::members {
  @Override
  public void reportError(RecognitionException e) {
    //throw new ParseException(e); 
  }
}

@lexer::members {
  @Override
  public void reportError(RecognitionException e) {
    //throw new LexException(e); 
  }
}

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

classdef:	'{' (fielddef)? (',' fielddef)* '}' -> fielddef*
	;

assignment
	:	ID '=' 'class' classdef -> ^('class' ID classdef)
	|	newclass=ID '=' oldclass=ID '.' 'extend' classdef -> ^('extend' $newclass $oldclass classdef)
	|	any_id '=' expr -> ^('=' any_id expr)
	|	any_id '=' fncall -> ^('=' any_id fncall)
	;


defable	:	paramtype
	|	fndecl
	|	mutdecl
	;

fielddef	
	:	KEYWORD '=>' defable -> ^(FIELDDEF KEYWORD defable)
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

blockparamtype 
	:	'(' ID (',' ID)* ')' ':' ID -> ID+
	|	'(' ')' ':' ID -> ID
	;

paramtype : 	ID
	|	'#' blockparamtype -> ^(PARAMTYPEFN blockparamtype)
	|	'@' blockparamtype -> ^(PARAMTYPEMUT blockparamtype)
	;	

fnparam	:	ID ':' paramtype -> ^(FNPARAM ID paramtype)
	;

anonfn	:	'#' '[' fncall ']' -> ^(ANONFN fncall)
	|	'#' '[' nested_id ']' -> ^(ANONFN nested_id)
	;

blockdecl
	:	'(' ')' (':' ID)? contained_block -> ID? contained_block
	|	'(' fnparam (','? fnparam)* ')' (':' ID)? contained_block -> fnparam* ID? contained_block
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

ID  :   LETTER (LETTER | '0' .. '9')*
    ;

fragment
LETTER  :   ('a'..'z' | 'A'..'Z')
    ;

MUTID	:	'@' ID
	;

any_id
	:	ID
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
- ifstat can be an expression
- 'this' keyword
- !!! HOW IS EXPR SUPPOSED TO BE USED?? !!!!
*/
