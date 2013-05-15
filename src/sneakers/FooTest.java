package sneakers;

import static org.junit.Assert.*;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

public class FooTest {
  
  public void parse(String text) {
    CharStream cs = new ANTLRStringStream(text);
    SneakersLexer lexer = new SneakersLexer(cs);
    CommonTokenStream tokens = new CommonTokenStream();
    tokens.setTokenSource(lexer);
    SneakersParser parser = new SneakersParser(tokens);
    try {
      parser.expr();
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
  }
  
  @Test
  public void test() {
    parse("1");
    assertEquals(true, true);
  }
  
}
