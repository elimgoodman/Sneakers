package sneakers;

import static org.junit.Assert.*;

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
import org.junit.Ignore;
import org.junit.Test;

import sneakers.SneakersParser.prog_return;
import sneakers.SneakersParser.returnstat_return;

public class ParseTests {
    
    public static TreeAdaptor sneakersAdaptor = new CommonTreeAdaptor() {
	public Object create(Token token) {
	    return new SneakersAST(token);
	}
	public Object dupNode(Object t) {
	    if ( t==null ) {
		return null;
	    }
	    return create(((SneakersAST)t).token);
	}
	public Object errorNode(TokenStream input, Token start, Token stop,
		RecognitionException e)
	{
	    SneakersErrorNode t = new SneakersErrorNode(input, start, stop, e);
	    //System.out.println("returning error node '"+t+"' @index="+input.index());
	    return t;
	}
    };
    
    private class ParseResult {
	public CommonTreeNodeStream stream;
	public CommonTree tree;
	
	public ParseResult(CommonTreeNodeStream stream, CommonTree tree) {
	    this.stream = stream;
	    this.tree = tree;
	}
    }
    
    public ParseResult getNodes(String text) {
        CharStream cs = new ANTLRStringStream(text);
	SneakersLexer lex = new SneakersLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        SneakersParser p = new SneakersParser(tokens);
        p.setTreeAdaptor(sneakersAdaptor);
        RuleReturnScope r = null;
	try {
	    r = p.prog();
	} catch (RecognitionException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}   // launch parser by calling start rule
        CommonTree t = (CommonTree)r.getTree();    // get tree result

        CommonTreeNodeStream nodes = new CommonTreeNodeStream(sneakersAdaptor, t);
        nodes.setTokenStream(tokens);
        return new ParseResult(nodes, t);
    }
    
    public SneakersAST getTree(String text) {
        CharStream cs = new ANTLRStringStream(text);
        SneakersLexer lex = new SneakersLexer(cs);
        TokenRewriteStream tokens = new TokenRewriteStream(lex);
        SneakersParser grammar = new SneakersParser(tokens);

        grammar.setTreeAdaptor(sneakersAdaptor);
        SneakersParser.prog_return ret = null;
        try {
            ret = grammar.prog();
        } catch (RecognitionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
        return ret.getTree();
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
        SneakersAST tree = this.getTree("Person = class {:a => Int, :b => #(Int):None, :c => #():None [return 1;]};");
       //printTree(tree, 4);
    }
    
    @Test
    public void testClassExtend() {
        SneakersAST tree = this.getTree("Student = Person.extend {:a => Int};");
        //printTree(tree, 4);
    }
    
    public void p(Object o) {
	System.out.println(o);
    }
    
    @Test
    //@Ignore
    public void testSimpleAssign() {
	ParseResult result = getNodes("a = 1;b = 2;");
	SymbolTable symtab = new SymbolTable();
	Def def = new Def(result.stream, symtab);
	def.downup(result.tree);
	SneakersAST s = (SneakersAST) result.tree.getChild(0).getChild(0);
	assertEquals(s.symbol.name, "a");
    }
    
    @Test
    //@Ignore
    public void testFnScope() {
	ParseResult result = getNodes("f = #(x:Int):Int [a = 1;];");
	SymbolTable symtab = new SymbolTable();
	Def def = new Def(result.stream, symtab);
	def.downup(result.tree);
	SneakersAST s = (SneakersAST) result.tree.getChild(0).getChild(0);
	assertEquals(s.symbol.name, "f");
    }
    
    @Test
    //@Ignore
    public void testClassScope() {
	ParseResult result = getNodes("Person = class {:a => Int};");
	//printTree(result.tree, 4);
	SymbolTable symtab = new SymbolTable();
	Def def = new Def(result.stream, symtab);
	def.downup(result.tree);
	SneakersAST s = (SneakersAST) result.tree.getChild(0).getChild(0);
	assertEquals(s.symbol.name, "Person");
    } 
    
    @Test
    public void testClassScopeComplex() {
	ParseResult result = getNodes("Person = class {:a => Int, :b => String, :foo => #(Int):String, :bar => #(x:Int, y:String):String[pass;]};");
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
    
    public void printTree(CommonTree t, int indent) {
        if ( t != null ) {
            StringBuffer sb = new StringBuffer(indent);

            if (t.getParent() == null){
                System.out.println(sb.toString() + t.getText().toString());
            }
            for ( int i = 0; i < indent; i++ )
                sb = sb.append("   ");
            for ( int i = 0; i < t.getChildCount(); i++ ) {
                System.out.println(sb.toString() + t.getChild(i).toString());
                printTree((CommonTree)t.getChild(i), indent+1);
            }
        }
    }

}
