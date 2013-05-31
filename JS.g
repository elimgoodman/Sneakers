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
	|	^(CLASSDEF name=TYPEID members+=member*) 
		-> classdef(name={$name}, members={$members})
	|	'pass' -> pass()
	;

member	:	^(FIELDDEF name=KEYWORD type=TYPEID) -> identity(o={$name})
	|	^(METHODDEF name=KEYWORD ^(FNDECL ret=TYPEID params+=param* ^(BLOCK stats+=stat+))) 
		-> method(name={$name}, params={$params}, stats={$stats})
	;

expr	:	^(FNDECL ret=TYPEID params+=param* ^(BLOCK stats+=stat+)) 
		-> fndecl(params={$params}, stats={$stats})
	|	^(FNCALL name=ID params+=expr*) -> fncall(name={$name},params={$params})
	|	^(PARAM name=ID) -> identity(o={$name})
	|	i=INT -> identity(o={$i})
	;

param	:	^(FNPARAM name=ID type=TYPEID) -> identity(o={$name})
	;