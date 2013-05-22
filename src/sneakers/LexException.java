package sneakers;

import org.antlr.runtime.RecognitionException;

public class LexException extends RuntimeException {

    public LexException(RecognitionException e) {
	super(e);
    }
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

}
