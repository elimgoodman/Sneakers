// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-16 08:41:54
 package sneakers; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SneakersLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int ID=4;
	public static final int INT=5;
	public static final int NEWLINE=6;
	public static final int TYPEID=7;
	public static final int WS=8;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public SneakersLexer() {} 
	public SneakersLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public SneakersLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/eli/dev/Sneakers-Java/Sneakers.g"; }

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:4:6: ( '(' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:4:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:5:7: ( ')' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:5:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:7: ( '):' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:9: '):'
			{
			match("):"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:7:7: ( '->' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:7:9: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:7: ( '.' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:9:7: ( ':' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:9:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:10:7: ( '=' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:10:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:7: ( '[' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:7: ( ']' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:5: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:7: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "TYPEID"
	public final void mTYPEID() throws RecognitionException {
		try {
			int _type = TYPEID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:8: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:10: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPEID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:54:5: ( ( '0' .. '9' )+ )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:54:7: ( '0' .. '9' )+
			{
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:54:7: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:9: ( '\\n' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:11: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:59:4: ( ( ' ' | ',' ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:59:6: ( ' ' | ',' )
			{
			if ( input.LA(1)==' '||input.LA(1)==',' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | ID | TYPEID | INT | NEWLINE | WS )
		int alt4=14;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt4=1;
			}
			break;
		case ')':
			{
			int LA4_2 = input.LA(2);
			if ( (LA4_2==':') ) {
				alt4=3;
			}

			else {
				alt4=2;
			}

			}
			break;
		case '-':
			{
			alt4=4;
			}
			break;
		case '.':
			{
			alt4=5;
			}
			break;
		case ':':
			{
			alt4=6;
			}
			break;
		case '=':
			{
			alt4=7;
			}
			break;
		case '[':
			{
			alt4=8;
			}
			break;
		case ']':
			{
			alt4=9;
			}
			break;
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=10;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			{
			alt4=11;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=12;
			}
			break;
		case '\n':
			{
			alt4=13;
			}
			break;
		case ' ':
		case ',':
			{
			alt4=14;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:10: T__9
				{
				mT__9(); 

				}
				break;
			case 2 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:15: T__10
				{
				mT__10(); 

				}
				break;
			case 3 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:21: T__11
				{
				mT__11(); 

				}
				break;
			case 4 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:27: T__12
				{
				mT__12(); 

				}
				break;
			case 5 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:33: T__13
				{
				mT__13(); 

				}
				break;
			case 6 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:39: T__14
				{
				mT__14(); 

				}
				break;
			case 7 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:45: T__15
				{
				mT__15(); 

				}
				break;
			case 8 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:51: T__16
				{
				mT__16(); 

				}
				break;
			case 9 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:57: T__17
				{
				mT__17(); 

				}
				break;
			case 10 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:63: ID
				{
				mID(); 

				}
				break;
			case 11 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:66: TYPEID
				{
				mTYPEID(); 

				}
				break;
			case 12 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:73: INT
				{
				mINT(); 

				}
				break;
			case 13 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:77: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 14 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:85: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
