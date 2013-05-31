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
	:	^('=' name=ID value=.) 
		-> assignment(name={$name}, value={$value})
	;
