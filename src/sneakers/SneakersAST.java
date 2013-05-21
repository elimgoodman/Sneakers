package sneakers;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/

public class SneakersAST extends CommonTree {
    //public Scope scope;   // set by Def.g; ID lives in which scope?
    //public Symbol symbol; // set by Ref.g; point at def in symbol table 
    public SneakersAST(Token t) { super(t); }
}

