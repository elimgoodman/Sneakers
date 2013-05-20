package sneakers;

import static org.junit.Assert.*;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;
import org.junit.Test;

import sneakers.SneakersParser.prog_return;
import sneakers.SneakersParser.returnstat_return;

public class FooTest {

    public Object parse(String text) {
        CharStream cs = new ANTLRStringStream(text);
        SneakersLexer lexer = new SneakersLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(lexer);
        SneakersParser parser = new SneakersParser(tokens);
        try {
            prog_return p = parser.prog();
            return p.tree;
        } catch (RecognitionException e) {
            System.out.println("here?");
            e.printStackTrace();
        }

        return null;
    }
  
  /*
  @Test
  public void test() {
    Object t = parse("a = 1;");
    System.out.println(t);
    assertEquals(true, true);
  }*/

    public CommonTree getTree(String text) {
        CharStream cs = new ANTLRStringStream(text);
        SneakersLexer lex = new SneakersLexer(cs);
        TokenRewriteStream tokens = new TokenRewriteStream(lex);
        SneakersParser grammar = new SneakersParser(tokens);

        TreeAdaptor adaptor = new CommonTreeAdaptor() {
            public Object create(Token payload) {
                return new CommonTree(payload);
            }
        };

        grammar.setTreeAdaptor(adaptor);
        SneakersParser.prog_return ret = null;
        try {
            ret = grammar.prog();
        } catch (RecognitionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
        return (CommonTree)ret.getTree();
    }

    @Test
    public void test2() {
        CommonTree tree = this.getTree("return 1;");
        this.printTree(tree, 4);
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
