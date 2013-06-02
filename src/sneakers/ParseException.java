package sneakers;

import org.antlr.runtime.RecognitionException;

import sneakers.SneakersParser.returnstat_return;

public class ParseException extends RuntimeException {
    
    private RecognitionException exception;
    
    public ParseException(RecognitionException e) {
	super(e);
	this.exception = e;
    }
    
    public String toString() {
	return this.exception.toString() + " at " + this.exception.line + ":" + this.exception.charPositionInLine;
    }
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

}
