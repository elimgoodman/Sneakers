// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-18 17:07:20
 package sneakers; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SneakersLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int ID=4;
	public static final int INT=5;
	public static final int KEYWORD=6;
	public static final int STRING=7;
	public static final int TYPEID=8;
	public static final int WS=9;

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

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:4:7: ( '#' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:4:9: '#'
			{
			match('#'); 
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:5:7: ( '(' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:5:9: '('
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:7: ( ')' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:9: ')'
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:7:7: ( ',' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:7:9: ','
			{
			match(','); 
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:10:7: ( ';' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:10:9: ';'
			{
			match(';'); 
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:7: ( '=' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:9: '='
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:7: ( '=>' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:9: '=>'
			{
			match("=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:13:7: ( '[' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:13:9: '['
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:7: ( ']' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:9: ']'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:15:7: ( 'return' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:15:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:16:7: ( '{' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:16:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:17:7: ( '}' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:17:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "KEYWORD"
	public final void mKEYWORD() throws RecognitionException {
		try {
			int _type = KEYWORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:9: ( ':' ID )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:11: ':' ID
			{
			match(':'); 
			mID(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:80:5: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:80:7: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:80:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:8: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:10: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:5: ( ( '0' .. '9' )+ )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:7: ( '0' .. '9' )+
			{
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:7: ( '0' .. '9' )+
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:4: ( ( ' ' | '\\t' | '\\n' ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:6: ( ' ' | '\\t' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)==' ' ) {
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

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:5: ( '\"' (~ ( '\"' ) )* '\"' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:8: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:12: (~ ( '\"' ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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
					break loop4;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | KEYWORD | ID | TYPEID | INT | WS | STRING )
		int alt5=20;
		switch ( input.LA(1) ) {
		case '#':
			{
			alt5=1;
			}
			break;
		case '(':
			{
			alt5=2;
			}
			break;
		case ')':
			{
			alt5=3;
			}
			break;
		case ',':
			{
			alt5=4;
			}
			break;
		case '.':
			{
			alt5=5;
			}
			break;
		case ':':
			{
			int LA5_6 = input.LA(2);
			if ( ((LA5_6 >= 'a' && LA5_6 <= 'z')) ) {
				alt5=15;
			}

			else {
				alt5=6;
			}

			}
			break;
		case ';':
			{
			alt5=7;
			}
			break;
		case '=':
			{
			int LA5_8 = input.LA(2);
			if ( (LA5_8=='>') ) {
				alt5=9;
			}

			else {
				alt5=8;
			}

			}
			break;
		case '[':
			{
			alt5=10;
			}
			break;
		case ']':
			{
			alt5=11;
			}
			break;
		case 'r':
			{
			int LA5_11 = input.LA(2);
			if ( (LA5_11=='e') ) {
				int LA5_23 = input.LA(3);
				if ( (LA5_23=='t') ) {
					int LA5_24 = input.LA(4);
					if ( (LA5_24=='u') ) {
						int LA5_25 = input.LA(5);
						if ( (LA5_25=='r') ) {
							int LA5_26 = input.LA(6);
							if ( (LA5_26=='n') ) {
								int LA5_27 = input.LA(7);
								if ( (LA5_27=='-'||(LA5_27 >= '0' && LA5_27 <= '9')||(LA5_27 >= 'A' && LA5_27 <= 'Z')||LA5_27=='_'||(LA5_27 >= 'a' && LA5_27 <= 'z')) ) {
									alt5=16;
								}

								else {
									alt5=12;
								}

							}

							else {
								alt5=16;
							}

						}

						else {
							alt5=16;
						}

					}

					else {
						alt5=16;
					}

				}

				else {
					alt5=16;
				}

			}

			else {
				alt5=16;
			}

			}
			break;
		case '{':
			{
			alt5=13;
			}
			break;
		case '}':
			{
			alt5=14;
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
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=16;
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
			alt5=17;
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
			alt5=18;
			}
			break;
		case '\t':
		case '\n':
		case ' ':
			{
			alt5=19;
			}
			break;
		case '\"':
			{
			alt5=20;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:64: T__19
				{
				mT__19(); 

				}
				break;
			case 11 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:70: T__20
				{
				mT__20(); 

				}
				break;
			case 12 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:76: T__21
				{
				mT__21(); 

				}
				break;
			case 13 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:82: T__22
				{
				mT__22(); 

				}
				break;
			case 14 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:88: T__23
				{
				mT__23(); 

				}
				break;
			case 15 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:94: KEYWORD
				{
				mKEYWORD(); 

				}
				break;
			case 16 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:102: ID
				{
				mID(); 

				}
				break;
			case 17 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:105: TYPEID
				{
				mTYPEID(); 

				}
				break;
			case 18 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:112: INT
				{
				mINT(); 

				}
				break;
			case 19 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:116: WS
				{
				mWS(); 

				}
				break;
			case 20 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:119: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}



}
