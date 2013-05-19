package sneakers;

import static org.junit.Assert.*;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import sneakers.SneakersParser.prog_return;

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
  
  @Test
  public void test() {
    Object t = parse("a = 1;");
    System.out.println(t);
    assertEquals(true, true);
  }
  
}
