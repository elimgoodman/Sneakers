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
    
    private void print(String s) {
    	//System.out.println(s);
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
    		print("enter block");
    		print("PUSH SCOPE");
    		currentScope = new LocalScope(currentScope);
    	} // push scope
    ;
exitBlock
    :   BLOCK
        {
        	print("OUT OF BLOCK");
        	print("locals: "+currentScope);
        	print("POP SCOPE");
	        currentScope = currentScope.getEnclosingScope();    // pop scope
        }
    ;

// START: class
enterClass
    :   ^('class' name=TYPEID .*)
        { // def class but leave superclass blank until ref phase
        print("line "+$name.getLine()+
                           ": def class "+$name.text);
        // record scope in AST for next pass
        ClassSymbol cs = new ClassSymbol($name.text,currentScope,null);
        cs.def = $name;           // point from symbol table into AST
        $name.symbol = cs;        // point from AST into symbol table
        currentScope.define(cs);  // def class in current scope
        print("PUSH SCOPE");
        currentScope = cs;        // set current scope to class scope
        }
    ;
// END: class*/

exitClass
    :   CLASSDEF
        {
        print("OUT OF CLASS");
        print("members: "+currentScope);
        print("POP SCOPE");
        currentScope = currentScope.getEnclosingScope();    // pop scope
        }
    ;


exitMethod
    :   FNDECL
        {
        print("OUT OF METHOD");
        print("args: "+currentScope);
        print("POP SCOPE");
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
		print("line "+$ID.getLine()+": def "+$ID.text);
        
        	MethodSymbol ms = new MethodSymbol($ID.text,null,currentScope);
        	
        	$TYPEID.scope = currentScope;
        	ms.def = $ID;            // track AST location of def's ID
	        $ID.symbol = ms;         // track in AST
        	currentScope.define(ms); // def method in globals
        	
        	print("PUSH SCOPE");
	        currentScope = ms;       // set current scope to method scope
	}
    	|   	^('=' ID ~(FNDECL)* )
        {
        	print("line "+$ID.getLine()+": def "+$ID.text);
        
	        VariableSymbol vs = new VariableSymbol($ID.text,null);
	        vs.scope = currentScope;
        	vs.def = $ID;            // track AST location of def's ID
	        $ID.symbol = vs;         // track in AST
        	currentScope.define(vs);
        }
        |	^(FNPARAM ID TYPEID)
        {
        	print("fn param line "+$ID.getLine()+": def "+$ID.text);
        
	        VariableSymbol vs = new VariableSymbol($ID.text,null);
	        
	        $TYPEID.scope = currentScope;
	        vs.scope = currentScope;
        	vs.def = $ID;            // track AST location of def's ID
	        $ID.symbol = vs;         // track in AST
        	currentScope.define(vs);
        }
        |	^(FIELDDEF KEYWORD ^(~FNDECL .*))
        {
        	print("class var line "+$KEYWORD.getLine()+": def "+$KEYWORD.text);
        	
        	String text = $KEYWORD.text.substring(1);
	        VariableSymbol vs = new VariableSymbol(text, null);
	        
	        vs.scope = currentScope;
        	vs.def = $KEYWORD;            // track AST location of def's ID
	        $KEYWORD.symbol = vs;         // track in AST
        	currentScope.define(vs);
        }
        |	^(FIELDDEF KEYWORD ^(FNDECL .+))
        {
        	print("class method line "+$KEYWORD.getLine()+": def "+$KEYWORD.text);
        	
        	String text = $KEYWORD.text.substring(1);
        	MethodSymbol ms = new MethodSymbol(text,null,currentScope);
	        
	        ms.scope = currentScope;
        	ms.def = $KEYWORD;            // track AST location of def's ID
	        $KEYWORD.symbol = ms;         // track in AST
        	currentScope.define(ms);
        	
        	print("PUSH SCOPE");
	        currentScope = ms;
        }
    ;
// END: field
