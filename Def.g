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
    :   BLOCK {currentScope = new LocalScope(currentScope);} // push scope
    ;
exitBlock
    :   BLOCK
        {
        System.out.println("locals: "+currentScope);
        currentScope = currentScope.getEnclosingScope();    // pop scope
        }
    ;

// START: class
enterClass
    :   ^('class' name=ID .)
        { // def class but leave superclass blank until ref phase
        System.out.println("line "+$name.getLine()+
                           ": def class "+$name.text);
        // record scope in AST for next pass
        ClassSymbol cs = new ClassSymbol($name.text,currentScope,null);
        cs.def = $name;           // point from symbol table into AST
        $name.symbol = cs;        // point from AST into symbol table
        currentScope.define(cs);  // def class in current scope
        currentScope = cs;        // set current scope to class scope
        }
    ;
// END: class*/

exitClass
    :   CLASSDEF
        {
        System.out.println("OUT OF CLASS");
        System.out.println("members: "+currentScope);
        currentScope = currentScope.getEnclosingScope();    // pop scope
        }
    ;


exitMethod
    :   FNDECL
        {
        System.out.println("OUT OF METHOD");
        System.out.println("args: "+currentScope);
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
	:	^('=' ID ^(FNDECL .*))
	{
		System.out.println("line "+$ID.getLine()+": def "+$ID.text);
        
        	MethodSymbol ms = new MethodSymbol($ID.text,null,currentScope);
        	ms.def = $ID;            // track AST location of def's ID
	        $ID.symbol = ms;         // track in AST
        	currentScope.define(ms); // def method in globals
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
    ;
// END: field
