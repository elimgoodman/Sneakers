tree grammar JS;

options {
  tokenVocab = Sneakers;
  ASTLabelType = SneakersAST;
  output = template;
}

compilationUnit
    :   ( d+=assignment)+
        -> file(stats={$d})
    ;

assignment
	:	^('=' name=ID value=.) 
		-> assignment(name={$name.text}, value={$value.text})
	;
