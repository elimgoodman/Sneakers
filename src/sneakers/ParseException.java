package sneakers;

import org.antlr.runtime.RecognitionException;

public class ParseException extends RuntimeException {

    public ParseException(RecognitionException e) {
	super(e);
    }
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

}
