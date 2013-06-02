package sneakers;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class ParseResult {
    public CommonTreeNodeStream stream;
    public CommonTree tree;

    public ParseResult(CommonTreeNodeStream stream, CommonTree tree) {
	this.stream = stream;
	this.tree = tree;
    }
}
