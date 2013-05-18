// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-18 18:12:06
 package sneakers; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SneakersLexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int ANONVAR=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int KEYWORD=7;
	public static final int MUTID=8;
	public static final int STRING=9;
	public static final int TYPEID=10;
	public static final int WS=11;

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

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:7: ( '<' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:9: '<'
			{
			match('<'); 
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:7: ( '=' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:9: '='
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:13:7: ( '=>' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:13:9: '=>'
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:7: ( '>' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:9: '>'
			{
			match('>'); 
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:15:7: ( '@' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:15:9: '@'
			{
			match('@'); 
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:16:7: ( '[' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:16:9: '['
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:17:7: ( ']' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:17:9: ']'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:7: ( 'else' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:19:7: ( 'elseif' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:19:9: 'elseif'
			{
			match("elseif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:20:7: ( 'if' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:20:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:7: ( 'pass' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:9: 'pass'
			{
			match("pass"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:7: ( 'return' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:9: 'return'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:23:7: ( '{' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:23:9: '{'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:24:7: ( '}' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:24:9: '}'
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
	// $ANTLR end "T__32"

	// $ANTLR start "ANONVAR"
	public final void mANONVAR() throws RecognitionException {
		try {
			int _type = ANONVAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:9: ( '$' ( INT )? )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:11: '$' ( INT )?
			{
			match('$'); 
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:15: ( INT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:15: INT
					{
					mINT(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANONVAR"

	// $ANTLR start "KEYWORD"
	public final void mKEYWORD() throws RecognitionException {
		try {
			int _type = KEYWORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:9: ( ':' ID )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:11: ':' ID
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:5: ( ( 'a' .. 'z' | '=' | '>' | '<' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '!' | '?' | '=' | '>' | '<' )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:7: ( 'a' .. 'z' | '=' | '>' | '<' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '!' | '?' | '=' | '>' | '<' )*
			{
			if ( (input.LA(1) >= '<' && input.LA(1) <= '>')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '!' | '?' | '=' | '>' | '<' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='!'||LA2_0=='-'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= '<' && LA2_0 <= '?')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "ID"

	// $ANTLR start "TYPEID"
	public final void mTYPEID() throws RecognitionException {
		try {
			int _type = TYPEID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:115:8: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:115:10: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:115:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
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
					break loop3;
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

	// $ANTLR start "MUTID"
	public final void mMUTID() throws RecognitionException {
		try {
			int _type = MUTID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:7: ( '@' ID )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:9: '@' ID
			{
			match('@'); 
			mID(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUTID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:5: ( ( '0' .. '9' )+ )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:7: ( '0' .. '9' )+
			{
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:7: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:4: ( ( ' ' | '\\t' | '\\n' ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:6: ( ' ' | '\\t' | '\\n' )
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:135:5: ( '\"' (~ ( '\"' ) )* '\"' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:135:8: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:135:12: (~ ( '\"' ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
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
					break loop5;
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
		// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | ANONVAR | KEYWORD | ID | TYPEID | MUTID | INT | WS | STRING )
		int alt6=29;
		switch ( input.LA(1) ) {
		case '#':
			{
			alt6=1;
			}
			break;
		case '(':
			{
			alt6=2;
			}
			break;
		case ')':
			{
			alt6=3;
			}
			break;
		case ',':
			{
			alt6=4;
			}
			break;
		case '.':
			{
			alt6=5;
			}
			break;
		case ':':
			{
			int LA6_6 = input.LA(2);
			if ( ((LA6_6 >= '<' && LA6_6 <= '>')||(LA6_6 >= 'a' && LA6_6 <= 'z')) ) {
				alt6=23;
			}

			else {
				alt6=6;
			}

			}
			break;
		case ';':
			{
			alt6=7;
			}
			break;
		case '<':
			{
			int LA6_8 = input.LA(2);
			if ( (LA6_8=='!'||LA6_8=='-'||(LA6_8 >= '0' && LA6_8 <= '9')||(LA6_8 >= '<' && LA6_8 <= '?')||(LA6_8 >= 'A' && LA6_8 <= 'Z')||LA6_8=='_'||(LA6_8 >= 'a' && LA6_8 <= 'z')) ) {
				alt6=24;
			}

			else {
				alt6=8;
			}

			}
			break;
		case '=':
			{
			switch ( input.LA(2) ) {
			case '>':
				{
				int LA6_29 = input.LA(3);
				if ( (LA6_29=='!'||LA6_29=='-'||(LA6_29 >= '0' && LA6_29 <= '9')||(LA6_29 >= '<' && LA6_29 <= '?')||(LA6_29 >= 'A' && LA6_29 <= 'Z')||LA6_29=='_'||(LA6_29 >= 'a' && LA6_29 <= 'z')) ) {
					alt6=24;
				}

				else {
					alt6=10;
				}

				}
				break;
			case '!':
			case '-':
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
			case '<':
			case '=':
			case '?':
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
			case '_':
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
				alt6=24;
				}
				break;
			default:
				alt6=9;
			}
			}
			break;
		case '>':
			{
			int LA6_10 = input.LA(2);
			if ( (LA6_10=='!'||LA6_10=='-'||(LA6_10 >= '0' && LA6_10 <= '9')||(LA6_10 >= '<' && LA6_10 <= '?')||(LA6_10 >= 'A' && LA6_10 <= 'Z')||LA6_10=='_'||(LA6_10 >= 'a' && LA6_10 <= 'z')) ) {
				alt6=24;
			}

			else {
				alt6=11;
			}

			}
			break;
		case '@':
			{
			int LA6_11 = input.LA(2);
			if ( ((LA6_11 >= '<' && LA6_11 <= '>')||(LA6_11 >= 'a' && LA6_11 <= 'z')) ) {
				alt6=26;
			}

			else {
				alt6=12;
			}

			}
			break;
		case '[':
			{
			alt6=13;
			}
			break;
		case ']':
			{
			alt6=14;
			}
			break;
		case 'e':
			{
			int LA6_14 = input.LA(2);
			if ( (LA6_14=='l') ) {
				int LA6_34 = input.LA(3);
				if ( (LA6_34=='s') ) {
					int LA6_39 = input.LA(4);
					if ( (LA6_39=='e') ) {
						switch ( input.LA(5) ) {
						case 'i':
							{
							int LA6_46 = input.LA(6);
							if ( (LA6_46=='f') ) {
								int LA6_50 = input.LA(7);
								if ( (LA6_50=='!'||LA6_50=='-'||(LA6_50 >= '0' && LA6_50 <= '9')||(LA6_50 >= '<' && LA6_50 <= '?')||(LA6_50 >= 'A' && LA6_50 <= 'Z')||LA6_50=='_'||(LA6_50 >= 'a' && LA6_50 <= 'z')) ) {
									alt6=24;
								}

								else {
									alt6=16;
								}

							}

							else {
								alt6=24;
							}

							}
							break;
						case '!':
						case '-':
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
						case '<':
						case '=':
						case '>':
						case '?':
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
						case '_':
						case 'a':
						case 'b':
						case 'c':
						case 'd':
						case 'e':
						case 'f':
						case 'g':
						case 'h':
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
							alt6=24;
							}
							break;
						default:
							alt6=15;
						}
					}

					else {
						alt6=24;
					}

				}

				else {
					alt6=24;
				}

			}

			else {
				alt6=24;
			}

			}
			break;
		case 'i':
			{
			int LA6_15 = input.LA(2);
			if ( (LA6_15=='f') ) {
				int LA6_35 = input.LA(3);
				if ( (LA6_35=='!'||LA6_35=='-'||(LA6_35 >= '0' && LA6_35 <= '9')||(LA6_35 >= '<' && LA6_35 <= '?')||(LA6_35 >= 'A' && LA6_35 <= 'Z')||LA6_35=='_'||(LA6_35 >= 'a' && LA6_35 <= 'z')) ) {
					alt6=24;
				}

				else {
					alt6=17;
				}

			}

			else {
				alt6=24;
			}

			}
			break;
		case 'p':
			{
			int LA6_16 = input.LA(2);
			if ( (LA6_16=='a') ) {
				int LA6_36 = input.LA(3);
				if ( (LA6_36=='s') ) {
					int LA6_41 = input.LA(4);
					if ( (LA6_41=='s') ) {
						int LA6_44 = input.LA(5);
						if ( (LA6_44=='!'||LA6_44=='-'||(LA6_44 >= '0' && LA6_44 <= '9')||(LA6_44 >= '<' && LA6_44 <= '?')||(LA6_44 >= 'A' && LA6_44 <= 'Z')||LA6_44=='_'||(LA6_44 >= 'a' && LA6_44 <= 'z')) ) {
							alt6=24;
						}

						else {
							alt6=18;
						}

					}

					else {
						alt6=24;
					}

				}

				else {
					alt6=24;
				}

			}

			else {
				alt6=24;
			}

			}
			break;
		case 'r':
			{
			int LA6_17 = input.LA(2);
			if ( (LA6_17=='e') ) {
				int LA6_37 = input.LA(3);
				if ( (LA6_37=='t') ) {
					int LA6_42 = input.LA(4);
					if ( (LA6_42=='u') ) {
						int LA6_45 = input.LA(5);
						if ( (LA6_45=='r') ) {
							int LA6_49 = input.LA(6);
							if ( (LA6_49=='n') ) {
								int LA6_51 = input.LA(7);
								if ( (LA6_51=='!'||LA6_51=='-'||(LA6_51 >= '0' && LA6_51 <= '9')||(LA6_51 >= '<' && LA6_51 <= '?')||(LA6_51 >= 'A' && LA6_51 <= 'Z')||LA6_51=='_'||(LA6_51 >= 'a' && LA6_51 <= 'z')) ) {
									alt6=24;
								}

								else {
									alt6=19;
								}

							}

							else {
								alt6=24;
							}

						}

						else {
							alt6=24;
						}

					}

					else {
						alt6=24;
					}

				}

				else {
					alt6=24;
				}

			}

			else {
				alt6=24;
			}

			}
			break;
		case '{':
			{
			alt6=20;
			}
			break;
		case '}':
			{
			alt6=21;
			}
			break;
		case '$':
			{
			alt6=22;
			}
			break;
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
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
			alt6=24;
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
			alt6=25;
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
			alt6=27;
			}
			break;
		case '\t':
		case '\n':
		case ' ':
			{
			alt6=28;
			}
			break;
		case '\"':
			{
			alt6=29;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 6, 0, input);
			throw nvae;
		}
		switch (alt6) {
			case 1 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:10: T__12
				{
				mT__12(); 

				}
				break;
			case 2 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:16: T__13
				{
				mT__13(); 

				}
				break;
			case 3 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:22: T__14
				{
				mT__14(); 

				}
				break;
			case 4 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:28: T__15
				{
				mT__15(); 

				}
				break;
			case 5 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:34: T__16
				{
				mT__16(); 

				}
				break;
			case 6 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:40: T__17
				{
				mT__17(); 

				}
				break;
			case 7 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:46: T__18
				{
				mT__18(); 

				}
				break;
			case 8 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:52: T__19
				{
				mT__19(); 

				}
				break;
			case 9 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:58: T__20
				{
				mT__20(); 

				}
				break;
			case 10 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:64: T__21
				{
				mT__21(); 

				}
				break;
			case 11 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:70: T__22
				{
				mT__22(); 

				}
				break;
			case 12 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:76: T__23
				{
				mT__23(); 

				}
				break;
			case 13 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:82: T__24
				{
				mT__24(); 

				}
				break;
			case 14 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:88: T__25
				{
				mT__25(); 

				}
				break;
			case 15 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:94: T__26
				{
				mT__26(); 

				}
				break;
			case 16 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:100: T__27
				{
				mT__27(); 

				}
				break;
			case 17 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:106: T__28
				{
				mT__28(); 

				}
				break;
			case 18 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:112: T__29
				{
				mT__29(); 

				}
				break;
			case 19 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:118: T__30
				{
				mT__30(); 

				}
				break;
			case 20 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:124: T__31
				{
				mT__31(); 

				}
				break;
			case 21 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:130: T__32
				{
				mT__32(); 

				}
				break;
			case 22 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:136: ANONVAR
				{
				mANONVAR(); 

				}
				break;
			case 23 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:144: KEYWORD
				{
				mKEYWORD(); 

				}
				break;
			case 24 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:152: ID
				{
				mID(); 

				}
				break;
			case 25 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:155: TYPEID
				{
				mTYPEID(); 

				}
				break;
			case 26 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:162: MUTID
				{
				mMUTID(); 

				}
				break;
			case 27 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:168: INT
				{
				mINT(); 

				}
				break;
			case 28 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:172: WS
				{
				mWS(); 

				}
				break;
			case 29 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:175: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}



}
