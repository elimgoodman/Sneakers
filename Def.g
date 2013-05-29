tree grammar Def;

options {
  tokenVocab = Sneakers;
  ASTLabelType = SneakersAST;
  filter = true;
}

@header { package sneakers; }

@members {
    SymbolTable symtab;
    Scope currentScope;
    public Def(TreeNodeStream input, SymbolTable symtab) {
        this(input);
        this.symtab = symtab;
        currentScope = symtab.globals;
    }
}
// END: header

topdown
    :   enterBlock
    //| 	enterMethod
    |	enterClass
    |   varDeclaration
    |   atoms
    ;

bottomup
    :   exitBlock
    |   exitMethod
    |   exitClass
    ;

// S C O P E S

enterBlock
    :   BLOCK 
    	{
    		System.out.println("enter block");
    		System.out.println("PUSH SCOPE");
    		currentScope = new LocalScope(currentScope);
    	} // push scope
    ;
exitBlock
    :   BLOCK
        {
        	System.out.println("OUT OF BLOCK");
        	System.out.println("locals: "+currentScope);
        	System.out.println("POP SCOPE");
	        currentScope = currentScope.getEnclosingScope();    // pop scope
        }
    ;

// START: class
enterClass
    :   ^('class' name=TYPEID .*)
        { // def class but leave superclass blank until ref phase
        System.out.println("line "+$name.getLine()+
                           ": def class "+$name.text);
        // record scope in AST for next pass
        ClassSymbol cs = new ClassSymbol($name.text,currentScope,null);
        cs.def = $name;           // point from symbol table into AST
        $name.symbol = cs;        // point from AST into symbol table
        currentScope.define(cs);  // def class in current scope
        System.out.println("PUSH SCOPE");
        currentScope = cs;        // set current scope to class scope
        }
    ;
// END: class*/

exitClass
    :   CLASSDEF
        {
        System.out.println("OUT OF CLASS");
        System.out.println("members: "+currentScope);
        System.out.println("POP SCOPE");
        currentScope = currentScope.getEnclosingScope();    // pop scope
        }
    ;


exitMethod
    :   FNDECL
        {
        System.out.println("OUT OF METHOD");
        System.out.println("args: "+currentScope);
        System.out.println("POP SCOPE");
        currentScope = currentScope.getEnclosingScope();    // pop arg scope
        }
    ;

// START: atoms
/** Set scope for any identifiers in expressions or assignments */
atoms
@init {SneakersAST t = (SneakersAST)input.LT(1);}
    :  {t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN)}? ('this'|ID|TYPEID)
       {t.scope = currentScope;}
    ;
//END: atoms

// START: var
varDeclaration // global, parameter, or local variable
	:	^('=' ID ^(FNDECL TYPEID .*))
	{
		System.out.println("line "+$ID.getLine()+": def "+$ID.text);
        
        	MethodSymbol ms = new MethodSymbol($ID.text,null,currentScope);
        	
        	$TYPEID.scope = currentScope;
        	ms.def = $ID;            // track AST location of def's ID
	        $ID.symbol = ms;         // track in AST
        	currentScope.define(ms); // def method in globals
        	
        	System.out.println("PUSH SCOPE");
	        currentScope = ms;       // set current scope to method scope
	}
    	|   	^('=' ID ~(FNDECL)* )
        {
        	System.out.println("line "+$ID.getLine()+": def "+$ID.text);
        
	        VariableSymbol vs = new VariableSymbol($ID.text,null);
	        vs.scope = currentScope;
        	vs.def = $ID;            // track AST location of def's ID
	        $ID.symbol = vs;         // track in AST
        	currentScope.define(vs);
        }
        |	^(FNPARAM ID TYPEID)
        {
        	System.out.println("fn param line "+$ID.getLine()+": def "+$ID.text);
        
	        VariableSymbol vs = new VariableSymbol($ID.text,null);
	        
	        $TYPEID.scope = currentScope;
	        vs.scope = currentScope;
        	vs.def = $ID;            // track AST location of def's ID
	        $ID.symbol = vs;         // track in AST
        	currentScope.define(vs);
        }
        |	^(FIELDDEF KEYWORD ^(~FNDECL .*))
        {
        	System.out.println("class var line "+$KEYWORD.getLine()+": def "+$KEYWORD.text);
        	
        	String text = $KEYWORD.text.substring(1);
	        VariableSymbol vs = new VariableSymbol(text, null);
	        
	        vs.scope = currentScope;
        	vs.def = $KEYWORD;            // track AST location of def's ID
	        $KEYWORD.symbol = vs;         // track in AST
        	currentScope.define(vs);
        }
        |	^(FIELDDEF KEYWORD ^(FNDECL .+))
        {
        	System.out.println("class method line "+$KEYWORD.getLine()+": def "+$KEYWORD.text);
        	
        	String text = $KEYWORD.text.substring(1);
        	MethodSymbol ms = new MethodSymbol(text,null,currentScope);
	        
	        ms.scope = currentScope;
        	ms.def = $KEYWORD;            // track AST location of def's ID
	        $KEYWORD.symbol = ms;         // track in AST
        	currentScope.define(ms);
        	
        	System.out.println("PUSH SCOPE");
	        currentScope = ms;
        }
    ;
// END: field
