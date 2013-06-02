package sneakers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.stringtemplate.StringTemplateGroup;

public class JSEmitter {
    public String getJS(String text) {
	FileReader fr;
	try {
	    fr = new FileReader("JS.stg");
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	    return null;
	} 
	StringTemplateGroup templates = new StringTemplateGroup(fr); 
	try {
	    fr.close();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	    return null;
	}
    
	ParseResult result = getNodes(text);
	JS js = new JS(result.stream);
	js.setTemplateLib(templates);
	JS.compilationUnit_return ret;
	try {
	    ret = js.compilationUnit();
	} catch (RecognitionException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	    return null;
	}
	return ret.getTemplate().toString();
    }
    
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
}
