import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import sneakers.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SneakersLexer lex = new SneakersLexer(new ANTLRFileStream("/Users/egoodman/dev/Sneakers/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SneakersParser g = new SneakersParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}