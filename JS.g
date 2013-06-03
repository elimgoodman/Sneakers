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

expr	:	^((FNDECL | MUTDECL) ret=TYPEID params+=param* ^(BLOCK stats+=stat+)) 
			-> fndecl(params={$params}, stats={$stats})
	|	^(FNCALL names+=ID+ params+=fncallparam*) -> fncall(names={$names},params={$params})
	|	^(INSTANCE types+=any_id+ d=dict)
			-> instance(types={$types}, attrs={$d.st})
	|	i=INT -> identity(o={$i})
	|	i=ID -> identity(o={$i})
	|	s=STRING -> identity(o={$s})
	|	d=dict -> identity(o={$d.st})
	|	^(ARRAY exs+=expr*) -> array(exs={$exs})
	;

dict	:	^(DICT attrs+=dict_pair*) -> dict(attrs={$attrs})
	;

dict_pair:	^(DICT_PAIR key=. value=.) -> dict_pair(key={$key}, value={$value})
	;

fncallparam
	:	^(PARAM ex=expr) -> identity(o={$ex.st})
	;

any_id
	:	(i=ID | i=MUTID | i=TYPEID) -> identity(o={$i})
	;
	
param	:	^(FNPARAM name=ID type=TYPEID) -> identity(o={$name})
	;