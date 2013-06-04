package sneakers;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.junit.Ignore;
import org.junit.Test;
import org.stringtemplate.v4.gui.JTreeScopeStackModel.StringTree;

import sneakers.SneakersParser.prog_return;
import sneakers.SneakersParser.returnstat_return;

public class ParseTests {
    
    public SneakersAST getTree(String text) {
	JSEmitter emitter = new JSEmitter();
	return (SneakersAST) emitter.getNodes(text).tree;
    }
    
    public ParseResult getNodes(String text) {
	JSEmitter emitter = new JSEmitter();
	return emitter.getNodes(text);
    }
    
    public String getJS(String text) {
	JSEmitter emitter = new JSEmitter();
	return emitter.getJS(text, true);
    }
    
    @Test
    public void testReturn() {
        SneakersAST tree = this.getTree("return 1;");
        
        assertEquals("BLOCK", tree.token.getText());
        assertEquals("RET", tree.getChild(0).getText());
        assertEquals("1", tree.getChild(0).getChild(0).getText());
    }

    @Test
    public void testAssignInt() {
        SneakersAST tree = this.getTree("a = 1;");
        
        assertEquals("=", tree.getChild(0).getText());
        assertEquals("a", tree.getChild(0).getChild(0).getText());
        assertEquals("1", tree.getChild(0).getChild(1).getText());
    }
    
    @Test
    public void testAssignFnCall() {
        SneakersAST tree = this.getTree("a = add 1 2;");
        
        assertEquals("=", tree.getChild(0).getText());
        assertEquals("a", tree.getChild(0).getChild(0).getText());
        assertEquals("FNCALL", tree.getChild(0).getChild(1).getText());
        assertEquals("add", tree.getChild(0).getChild(1).getChild(0).getText());
        assertEquals("PARAM", tree.getChild(0).getChild(1).getChild(1).getText());
        assertEquals("1", tree.getChild(0).getChild(1).getChild(1).getChild(0).getText());
        assertEquals("PARAM", tree.getChild(0).getChild(1).getChild(2).getText());
        assertEquals("2", tree.getChild(0).getChild(1).getChild(2).getChild(0).getText());
    }
      
    @Test
    public void testIfStat() {
        SneakersAST tree = this.getTree("if a [return 1;];");
        
        assertEquals("if", tree.getChild(0).getText());
        assertEquals("a", tree.getChild(0).getChild(0).getText());
    }  
    
    @Test
    public void testFnDef() {
        SneakersAST tree = this.getTree("a = #(x:Int, y:String):Int [return 1;];");
        
        //printTree(tree, 4);
        assertEquals("FNDECL", tree.getChild(0).getChild(1).getText());
    }  
    
    @Test
    public void testFnAsParam() {
        SneakersAST tree = this.getTree("a = #(x:#(Int, Int):Int, y:String):Int [return 1;];");
    }  
    
    @Test
    public void testMutAsParam() {
        SneakersAST tree = this.getTree("a = #(x:@(Int, Int):Int, y:String):Int [return 1;];");
       // printTree(tree, 4);
    } 
    
    @Test
    public void testMutVar() {
        SneakersAST tree = this.getTree("@a = {};");
       // printTree(tree, 4);
    } 
    
    @Test
    public void testMutAssign() {
        SneakersAST tree = this.getTree("a = @(x:Int):None [return 1;];");
       // printTree(tree, 4);
    } 
    
    @Test
    public void testPass() {
        SneakersAST tree = this.getTree("pass;");
       // printTree(tree, 4);
    } 
    
    @Test
    public void testMutCall() {
        SneakersAST tree = this.getTree("<print! \"hello\">;");
       // printTree(tree, 4);
    }  
    
    @Test
    public void testArray() {
        SneakersAST tree = this.getTree("a = [1, 2, 3];");
       // printTree(tree, 4);
    }  
    
    @Test
    public void testDict() {
        SneakersAST tree = this.getTree("a = {:foo => 2};");
       // printTree(tree, 4);
    }
    
    @Test
    public void testDottedMethod() {
        SneakersAST tree = this.getTree("a = b.c 1 2 3;");
       // printTree(tree, 4);
    }
    
    @Test
    public void testClassDef() {
        SneakersAST tree = this.getTree("Person = class {a => Int, b => #(Int):None, c => #():None [return 1;]};");
       //printTree(tree, 4);
    }
    
    @Test
    public void testClassExtend() {
        SneakersAST tree = this.getTree("Student = Person.extend {a => Int};");
        //printTree(tree, 4);
    }
    
    @Test
    public void testClassInstance() {
        SneakersAST tree = this.getTree("p = new Person {age => 26, weight => 160};");
        //printTree(tree, 4);
    }
    
    @Test
    public void testMultipleFnCallParams() {
        SneakersAST tree = this.getTree("a = do_something a b c;");
        printTree(tree);
    }
    
    public void printTree(CommonTree t) {
	JSEmitter emitter = new JSEmitter();
	emitter.printTree(t, 4);
    }
    
    public void p(Object o) {
	System.out.println(o);
    }
    
    @Test
    @Ignore
    public void testSimpleAssign() {
	ParseResult result = getNodes("a = 1;b = 2;");
	SymbolTable symtab = new SymbolTable();
	Def def = new Def(result.stream, symtab);
	def.downup(result.tree);
	SneakersAST s = (SneakersAST) result.tree.getChild(0).getChild(0);
	assertEquals(s.symbol.name, "a");
    }
    
    @Test
    @Ignore
    public void testFnScope() {
	ParseResult result = getNodes("f = #(x:Int):Int [a = 1;];");
	SymbolTable symtab = new SymbolTable();
	Def def = new Def(result.stream, symtab);
	def.downup(result.tree);
	SneakersAST s = (SneakersAST) result.tree.getChild(0).getChild(0);
	assertEquals(s.symbol.name, "f");
    }
    
    @Test
    @Ignore
    public void testClassScope() {
	ParseResult result = getNodes("Person = class {a => Int};");
	//printTree(result.tree, 4);
	SymbolTable symtab = new SymbolTable();
	Def def = new Def(result.stream, symtab);
	def.downup(result.tree);
	SneakersAST s = (SneakersAST) result.tree.getChild(0).getChild(0);
	assertEquals(s.symbol.name, "Person");
    } 
    
    @Test
    @Ignore
    public void testClassScopeComplex() {
	ParseResult result = getNodes("Person = class {a => Int, b => String, foo => #(Int):String, bar => #(x:Int, y:String):String[pass;]};");
//printTree(result.tree, 4);
	SymbolTable symtab = new SymbolTable();
	Def def = new Def(result.stream, symtab);
	def.downup(result.tree);
	SneakersAST s = (SneakersAST) result.tree.getChild(0).getChild(0);
	assertEquals(s.symbol.name, "Person");
    } 
    
    @Test
    //@Ignore
    public void testSimpleRef() {
	ParseResult result = getNodes("a = 1;");
	//printTree(result.tree, 4);
	SymbolTable symtab = new SymbolTable();
	Def def = new Def(result.stream, symtab);
	def.downup(result.tree);
    
	result.stream.reset();
	
	Ref ref = new Ref(result.stream, symtab);
	ref.downup(result.tree);
	
	assertEquals(true, true);
	//SneakersAST s = (SneakersAST) result.tree.getChild(0).getChild(0);
	//assertEquals(s.symbol.name, "Person");
    } 
    
    @Test(expected=ParseException.class)
    public void testParseError() {
        this.getTree("a = ");
    }  
    
    
    public String strip(String text) {
	return text.replace("\n", "").replace("\t", "");
    }
    
    public void assertJS(String js, String sneakers) {
	String realJS =  "(function() {\n\t" + js + "\n})();";
	assertEquals(strip(realJS), strip(getJS(sneakers)));
    }
    
    @Test
    public void testJSAssign() {
	assertJS("var a = 1;", "a = 1;");
    }
    
    @Test
    public void testJSMultiAssign() {
	assertJS("var c = 1;var b = 2;", "c = 1;b = 2;");
    }
    
    @Test
    public void testJSFn() {
	assertJS("var f = function() {};", "f = #():None [pass;];");
    }
    
    @Test
    public void testJSFnStats() {
	assertJS("var f = function() {var a = 1;var b = 2;};", "f = #():None [a = 1; b = 2;];");
    }
    
    @Test
    public void testJSFnParams() {
	assertJS("var f = function(a,b,c) {\n\t};", "f = #(a:Int, b:Int, c:Int):None [pass;];");
    }
    
    @Test
    public void testJSFnCallNoParams() {
	assertJS("var a = do_something();", "a = (do_something);");
    }
    
    @Test
    public void testJSFnCallParams() {
	assertJS("var a = do_something(a,b,c);", "a = do_something a b c;");
    }
    
    @Test
    public void testJSClassOnlyAttrs() {
	assertJS("var Person = new Sneakers.Class([\"a\"], {});", "Person = class {a => Int};");
    }
    
    @Test
    public void testJSClassOnlyMethods() {
	assertJS("var Person = new Sneakers.Class([], {a: function(x) {}});", "Person = class {a => #(x:Int):None [pass;]};");
    }
    
    @Test
    public void testJSClassInstance() {
	assertJS("var p = Person.new({age: 27,weight: 160});", "p = new Person {age => 27, weight => 160};");
    }
    
    @Test
    public void testJSReturn() {
	assertJS("var f = function() {return 1;};", "f = #():None [return 1;];");
    }
    
    @Test
    public void testJSDottedMethod() {
	assertJS("var x = math.sqrt(25);", "x = math.sqrt 25;");
    }
    
    @Test
    public void testJSNewDotted() {
	assertJS("var x = pkg.Foo.new({a: 1});", "x = new pkg.Foo {a => 1};");
    }
    
    @Test
    public void testJSString() {
	assertJS("var x = \"Hello\";", "x = \"Hello\";");
    }
    
    @Test
    public void testJSDict() {
	assertJS("var x = {\"foo\": 2,\"bar\": \"hi\"};", "x = {\"foo\" => 2, \"bar\" => \"hi\"};");
    }

    @Test
    public void testJSArray() {
	assertJS("var x = [1,2,3];", "x = [1, 2, 3];");
    }
    
    @Test
    public void testJSMutDecl() {
	assertJS("var m = function() {};", "m = @():None [pass;];");
    }
    
    @Test
    public void testJSStaticMethod() {
	assertJS("var m = Foo.bar(1,2);", "m = Foo.bar 1 2;");
    }
    
    @Test
    //TODO: should strip the @
    public void testJSMutable() {
	assertJS("var @m = {};", "@m = {};");
    }
    
    @Test
    //TODO: should strip the @
    public void testJSMutDeclInDict() {
	assertJS("var x = {\"f\": function() {}};", "x = {\"f\" => @():None[pass;]};");
    }
}
