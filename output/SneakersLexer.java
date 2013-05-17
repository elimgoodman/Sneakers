// $ANTLR 3.5 /Users/egoodman/dev/Sneakers/Sneakers.g 2013-05-16 18:21:01
 package sneakers; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SneakersLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int ESC_SEQ=4;
	public static final int HEX_DIGIT=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int KEYWORD=8;
	public static final int NEWLINE=9;
	public static final int OCTAL_ESC=10;
	public static final int STRING=11;
	public static final int TYPEID=12;
	public static final int UNICODE_ESC=13;
	public static final int WS=14;

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
	@Override public String getGrammarFileName() { return "/Users/egoodman/dev/Sneakers/Sneakers.g"; }

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/egoodman/dev/Sneakers/Sneakers.g:4:7: ( '(' )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:4:9: '('
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/egoodman/dev/Sneakers/Sneakers.g:5:7: ( ')' )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:5:9: ')'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/egoodman/dev/Sneakers/Sneakers.g:6:7: ( '->' )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:6:9: '->'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/egoodman/dev/Sneakers/Sneakers.g:7:7: ( '.' )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:7:9: '.'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/egoodman/dev/Sneakers/Sneakers.g:8:7: ( ':' )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:8:9: ':'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/egoodman/dev/Sneakers/Sneakers.g:9:7: ( '=' )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:9:9: '='
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/egoodman/dev/Sneakers/Sneakers.g:10:7: ( '=>' )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:10:9: '=>'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/egoodman/dev/Sneakers/Sneakers.g:11:7: ( 'object' )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:11:9: 'object'
			{
			match("object"); 

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
			// /Users/egoodman/dev/Sneakers/Sneakers.g:12:7: ( '{' )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:12:9: '{'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/egoodman/dev/Sneakers/Sneakers.g:13:7: ( '}' )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:13:9: '}'
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
	// $ANTLR end "T__24"

	// $ANTLR start "KEYWORD"
	public final void mKEYWORD() throws RecognitionException {
		try {
			int _type = KEYWORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/egoodman/dev/Sneakers/Sneakers.g:60:9: ( ':' ID )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:60:11: ':' ID
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
			// /Users/egoodman/dev/Sneakers/Sneakers.g:63:5: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:63:7: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/egoodman/dev/Sneakers/Sneakers.g:63:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/egoodman/dev/Sneakers/Sneakers.g:
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
			// /Users/egoodman/dev/Sneakers/Sneakers.g:66:8: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:66:10: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/egoodman/dev/Sneakers/Sneakers.g:66:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/egoodman/dev/Sneakers/Sneakers.g:
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
			// /Users/egoodman/dev/Sneakers/Sneakers.g:69:5: ( ( '0' .. '9' )+ )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:69:7: ( '0' .. '9' )+
			{
			// /Users/egoodman/dev/Sneakers/Sneakers.g:69:7: ( '0' .. '9' )+
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
					// /Users/egoodman/dev/Sneakers/Sneakers.g:
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
			// /Users/egoodman/dev/Sneakers/Sneakers.g:72:9: ( '\\n' )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:72:11: '\\n'
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
			// /Users/egoodman/dev/Sneakers/Sneakers.g:79:4: ( ( ' ' | ',' | '\\t' ) )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:79:6: ( ' ' | ',' | '\\t' )
			{
			if ( input.LA(1)=='\t'||input.LA(1)==' '||input.LA(1)==',' ) {
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
			// /Users/egoodman/dev/Sneakers/Sneakers.g:82:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:82:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/egoodman/dev/Sneakers/Sneakers.g:82:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\\') ) {
					alt4=1;
				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '[')||(LA4_0 >= ']' && LA4_0 <= '\uFFFF')) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// /Users/egoodman/dev/Sneakers/Sneakers.g:82:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/egoodman/dev/Sneakers/Sneakers.g:82:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// /Users/egoodman/dev/Sneakers/Sneakers.g:87:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// /Users/egoodman/dev/Sneakers/Sneakers.g:91:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt5=3;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt5=1;
					}
					break;
				case 'u':
					{
					alt5=2;
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
					{
					alt5=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/egoodman/dev/Sneakers/Sneakers.g:91:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /Users/egoodman/dev/Sneakers/Sneakers.g:92:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// /Users/egoodman/dev/Sneakers/Sneakers.g:93:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// /Users/egoodman/dev/Sneakers/Sneakers.g:98:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt6=3;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='\\') ) {
				int LA6_1 = input.LA(2);
				if ( ((LA6_1 >= '0' && LA6_1 <= '3')) ) {
					int LA6_2 = input.LA(3);
					if ( ((LA6_2 >= '0' && LA6_2 <= '7')) ) {
						int LA6_4 = input.LA(4);
						if ( ((LA6_4 >= '0' && LA6_4 <= '7')) ) {
							alt6=1;
						}

						else {
							alt6=2;
						}

					}

					else {
						alt6=3;
					}

				}
				else if ( ((LA6_1 >= '4' && LA6_1 <= '7')) ) {
					int LA6_3 = input.LA(3);
					if ( ((LA6_3 >= '0' && LA6_3 <= '7')) ) {
						alt6=2;
					}

					else {
						alt6=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/egoodman/dev/Sneakers/Sneakers.g:98:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /Users/egoodman/dev/Sneakers/Sneakers.g:99:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// /Users/egoodman/dev/Sneakers/Sneakers.g:100:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// /Users/egoodman/dev/Sneakers/Sneakers.g:105:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// /Users/egoodman/dev/Sneakers/Sneakers.g:105:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/egoodman/dev/Sneakers/Sneakers.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | KEYWORD | ID | TYPEID | INT | NEWLINE | WS | STRING )
		int alt7=17;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt7=1;
			}
			break;
		case ')':
			{
			alt7=2;
			}
			break;
		case '-':
			{
			alt7=3;
			}
			break;
		case '.':
			{
			alt7=4;
			}
			break;
		case ':':
			{
			int LA7_5 = input.LA(2);
			if ( ((LA7_5 >= 'a' && LA7_5 <= 'z')) ) {
				alt7=11;
			}

			else {
				alt7=5;
			}

			}
			break;
		case '=':
			{
			int LA7_6 = input.LA(2);
			if ( (LA7_6=='>') ) {
				alt7=7;
			}

			else {
				alt7=6;
			}

			}
			break;
		case 'o':
			{
			int LA7_7 = input.LA(2);
			if ( (LA7_7=='b') ) {
				int LA7_20 = input.LA(3);
				if ( (LA7_20=='j') ) {
					int LA7_21 = input.LA(4);
					if ( (LA7_21=='e') ) {
						int LA7_22 = input.LA(5);
						if ( (LA7_22=='c') ) {
							int LA7_23 = input.LA(6);
							if ( (LA7_23=='t') ) {
								int LA7_24 = input.LA(7);
								if ( (LA7_24=='-'||(LA7_24 >= '0' && LA7_24 <= '9')||(LA7_24 >= 'A' && LA7_24 <= 'Z')||LA7_24=='_'||(LA7_24 >= 'a' && LA7_24 <= 'z')) ) {
									alt7=12;
								}

								else {
									alt7=8;
								}

							}

							else {
								alt7=12;
							}

						}

						else {
							alt7=12;
						}

					}

					else {
						alt7=12;
					}

				}

				else {
					alt7=12;
				}

			}

			else {
				alt7=12;
			}

			}
			break;
		case '{':
			{
			alt7=9;
			}
			break;
		case '}':
			{
			alt7=10;
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
			alt7=12;
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
			alt7=13;
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
			alt7=14;
			}
			break;
		case '\n':
			{
			alt7=15;
			}
			break;
		case '\t':
		case ' ':
		case ',':
			{
			alt7=16;
			}
			break;
		case '\"':
			{
			alt7=17;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 7, 0, input);
			throw nvae;
		}
		switch (alt7) {
			case 1 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:10: T__15
				{
				mT__15(); 

				}
				break;
			case 2 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:16: T__16
				{
				mT__16(); 

				}
				break;
			case 3 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:22: T__17
				{
				mT__17(); 

				}
				break;
			case 4 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:28: T__18
				{
				mT__18(); 

				}
				break;
			case 5 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:34: T__19
				{
				mT__19(); 

				}
				break;
			case 6 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:40: T__20
				{
				mT__20(); 

				}
				break;
			case 7 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:46: T__21
				{
				mT__21(); 

				}
				break;
			case 8 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:52: T__22
				{
				mT__22(); 

				}
				break;
			case 9 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:58: T__23
				{
				mT__23(); 

				}
				break;
			case 10 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:64: T__24
				{
				mT__24(); 

				}
				break;
			case 11 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:70: KEYWORD
				{
				mKEYWORD(); 

				}
				break;
			case 12 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:78: ID
				{
				mID(); 

				}
				break;
			case 13 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:81: TYPEID
				{
				mTYPEID(); 

				}
				break;
			case 14 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:88: INT
				{
				mINT(); 

				}
				break;
			case 15 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:92: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 16 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:100: WS
				{
				mWS(); 

				}
				break;
			case 17 :
				// /Users/egoodman/dev/Sneakers/Sneakers.g:1:103: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}



}
