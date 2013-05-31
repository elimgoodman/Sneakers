tree grammar JS;

options {
  tokenVocab = Sneakers;
  ASTLabelType = SneakersAST;
  output = template;
}

@header {
package sneakers;
}

/*compilationUnit
	: ^(BLOCK stats+=stat+) -> file(stats={$stats})
	;*/
	
compilationUnit
	: ^(BLOCK stats+=stat+) -> file(stats={$stats})
	;

stat	
	:	^('=' name=ID value=expr) 
		-> assignment(name={$name}, value={$value.st})
	|	^(CLASSDEF name=TYPEID (methods+=method | fields+=field)* ) 
		-> classdef(name={$name}, fields={$fields}, methods={$methods})
	|	'pass' -> pass()
	|	^(RET e=expr) -> return(expr={$e.st})
	;

field	:	^(FIELDDEF name=ID type=TYPEID) -> identity(o={$name})
	;

method	:	^(METHODDEF name=ID ^(FNDECL ret=TYPEID params+=param* ^(BLOCK stats+=stat+))) 
		-> method(name={$name}, params={$params}, stats={$stats})
	;

expr	:	^(FNDECL ret=TYPEID params+=param* ^(BLOCK stats+=stat+)) 
		-> fndecl(params={$params}, stats={$stats})
	|	^(FNCALL name=ID params+=expr*) -> fncall(name={$name},params={$params})
	|	^(PARAM name=ID) -> identity(o={$name})
	|	^(INSTANCE type=TYPEID ^(DICT attrs+=dict_pair+))
		-> instance(type={$type}, attrs={$attrs})
	|	i=INT -> identity(o={$i})
	;

dict_pair:	^(DICT_PAIR key=. value=.) -> dict_pair(key={$key}, value={$value})
	;

param	:	^(FNPARAM name=ID type=TYPEID) -> identity(o={$name})
	;