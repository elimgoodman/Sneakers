// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-27 11:07:40
 package sneakers; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SneakersLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int ANONFN=4;
	public static final int ANONVAR=5;
	public static final int ARRAY=6;
	public static final int BLOCK=7;
	public static final int BLOCKDECL=8;
	public static final int DICT=9;
	public static final int FIELDDEF=10;
	public static final int FNCALL=11;
	public static final int FNDECL=12;
	public static final int FNPARAM=13;
	public static final int ID=14;
	public static final int INT=15;
	public static final int KEYWORD=16;
	public static final int MUTDECL=17;
	public static final int MUTID=18;
	public static final int PARAM=19;
	public static final int PARAMTYPEFN=20;
	public static final int PARAMTYPEMUT=21;
	public static final int RET=22;
	public static final int STRING=23;
	public static final int TYPEID=24;
	public static final int WS=25;

	  @Override
	  public void reportError(RecognitionException e) {
	    throw new LexException(e); 
	  }


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

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:10:7: ( '#' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:10:9: '#'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:7: ( '(' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:9: '('
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:7: ( ')' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:9: ')'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:13:7: ( ',' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:13:9: ','
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:7: ( '.' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:9: '.'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:15:7: ( ':' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:15:9: ':'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:16:7: ( ';' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:16:9: ';'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:17:7: ( '<' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:17:9: '<'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:7: ( '=' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:9: '='
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:19:7: ( '=>' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:19:9: '=>'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:20:7: ( '>' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:20:9: '>'
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:7: ( '@' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:9: '@'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:7: ( '[' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:9: '['
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:23:7: ( ']' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:23:9: ']'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:24:7: ( 'class' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:24:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:25:7: ( 'else' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:25:9: 'else'
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:26:7: ( 'elseif' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:26:9: 'elseif'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:27:7: ( 'extend' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:27:9: 'extend'
			{
			match("extend"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:28:7: ( 'if' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:28:9: 'if'
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:7: ( 'pass' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:9: 'pass'
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:7: ( 'return' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:9: 'return'
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:7: ( '{' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:9: '{'
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:32:7: ( '}' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:32:9: '}'
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
	// $ANTLR end "T__48"

	// $ANTLR start "ANONVAR"
	public final void mANONVAR() throws RecognitionException {
		try {
			int _type = ANONVAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:166:9: ( '$' ( INT )? )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:166:11: '$' ( INT )?
			{
			match('$'); 
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:166:15: ( INT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:166:15: INT
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:169:9: ( ':' ID )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:169:11: ':' ID
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:172:5: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '!' | '?' | '=' | '>' | '<' )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:172:7: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '!' | '?' | '=' | '>' | '<' )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:172:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '!' | '?' | '=' | '>' | '<' )*
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:175:8: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:175:10: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:175:21: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:178:7: ( '@' ID )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:178:9: '@' ID
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:187:5: ( ( '0' .. '9' )+ )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:187:7: ( '0' .. '9' )+
			{
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:187:7: ( '0' .. '9' )+
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:191:4: ( ( ' ' | '\\t' | '\\n' ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:191:6: ( ' ' | '\\t' | '\\n' )
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:195:5: ( '\"' (~ ( '\"' ) )* '\"' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:195:8: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:195:12: (~ ( '\"' ) )*
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
		// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:8: ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | ANONVAR | KEYWORD | ID | TYPEID | MUTID | INT | WS | STRING )
		int alt6=31;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:10: T__26
				{
				mT__26(); 

				}
				break;
			case 2 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:16: T__27
				{
				mT__27(); 

				}
				break;
			case 3 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:22: T__28
				{
				mT__28(); 

				}
				break;
			case 4 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:28: T__29
				{
				mT__29(); 

				}
				break;
			case 5 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:34: T__30
				{
				mT__30(); 

				}
				break;
			case 6 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:40: T__31
				{
				mT__31(); 

				}
				break;
			case 7 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:46: T__32
				{
				mT__32(); 

				}
				break;
			case 8 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:52: T__33
				{
				mT__33(); 

				}
				break;
			case 9 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:58: T__34
				{
				mT__34(); 

				}
				break;
			case 10 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:64: T__35
				{
				mT__35(); 

				}
				break;
			case 11 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:70: T__36
				{
				mT__36(); 

				}
				break;
			case 12 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:76: T__37
				{
				mT__37(); 

				}
				break;
			case 13 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:82: T__38
				{
				mT__38(); 

				}
				break;
			case 14 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:88: T__39
				{
				mT__39(); 

				}
				break;
			case 15 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:94: T__40
				{
				mT__40(); 

				}
				break;
			case 16 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:100: T__41
				{
				mT__41(); 

				}
				break;
			case 17 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:106: T__42
				{
				mT__42(); 

				}
				break;
			case 18 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:112: T__43
				{
				mT__43(); 

				}
				break;
			case 19 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:118: T__44
				{
				mT__44(); 

				}
				break;
			case 20 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:124: T__45
				{
				mT__45(); 

				}
				break;
			case 21 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:130: T__46
				{
				mT__46(); 

				}
				break;
			case 22 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:136: T__47
				{
				mT__47(); 

				}
				break;
			case 23 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:142: T__48
				{
				mT__48(); 

				}
				break;
			case 24 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:148: ANONVAR
				{
				mANONVAR(); 

				}
				break;
			case 25 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:156: KEYWORD
				{
				mKEYWORD(); 

				}
				break;
			case 26 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:164: ID
				{
				mID(); 

				}
				break;
			case 27 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:167: TYPEID
				{
				mTYPEID(); 

				}
				break;
			case 28 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:174: MUTID
				{
				mMUTID(); 

				}
				break;
			case 29 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:180: INT
				{
				mINT(); 

				}
				break;
			case 30 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:184: WS
				{
				mWS(); 

				}
				break;
			case 31 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:187: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\6\uffff\1\33\2\uffff\1\36\1\uffff\1\37\2\uffff\5\26\16\uffff\3\26\1\52"+
		"\5\26\1\uffff\3\26\1\64\1\26\1\66\1\26\1\70\1\26\1\uffff\1\26\1\uffff"+
		"\1\26\1\uffff\1\74\1\75\1\76\3\uffff";
	static final String DFA6_eofS =
		"\77\uffff";
	static final String DFA6_minS =
		"\1\11\5\uffff\1\141\2\uffff\1\76\1\uffff\1\141\2\uffff\2\154\1\146\1\141"+
		"\1\145\16\uffff\1\141\1\163\1\164\1\41\1\163\1\164\1\163\2\145\1\uffff"+
		"\1\163\1\165\1\163\1\41\1\156\1\41\1\162\1\41\1\146\1\uffff\1\144\1\uffff"+
		"\1\156\1\uffff\3\41\3\uffff";
	static final String DFA6_maxS =
		"\1\175\5\uffff\1\172\2\uffff\1\76\1\uffff\1\172\2\uffff\1\154\1\170\1"+
		"\146\1\141\1\145\16\uffff\1\141\1\163\1\164\1\172\1\163\1\164\1\163\2"+
		"\145\1\uffff\1\163\1\165\1\163\1\172\1\156\1\172\1\162\1\172\1\146\1\uffff"+
		"\1\144\1\uffff\1\156\1\uffff\3\172\3\uffff";
	static final String DFA6_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\uffff\1\13\1\uffff\1\15"+
		"\1\16\5\uffff\1\26\1\27\1\30\1\32\1\33\1\35\1\36\1\37\1\6\1\31\1\12\1"+
		"\11\1\14\1\34\11\uffff\1\23\11\uffff\1\20\1\uffff\1\24\1\uffff\1\17\3"+
		"\uffff\1\21\1\22\1\25";
	static final String DFA6_specialS =
		"\77\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\31\25\uffff\1\31\1\uffff\1\32\1\1\1\25\3\uffff\1\2\1\3\2\uffff\1\4"+
			"\1\uffff\1\5\1\uffff\12\30\1\6\1\7\1\10\1\11\1\12\1\uffff\1\13\32\27"+
			"\1\14\1\uffff\1\15\3\uffff\2\26\1\16\1\26\1\17\3\26\1\20\6\26\1\21\1"+
			"\26\1\22\10\26\1\23\1\uffff\1\24",
			"",
			"",
			"",
			"",
			"",
			"\32\34",
			"",
			"",
			"\1\35",
			"",
			"\32\40",
			"",
			"",
			"\1\41",
			"\1\42\13\uffff\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\26\13\uffff\1\26\2\uffff\12\26\2\uffff\4\26\1\uffff\32\26\4\uffff"+
			"\1\26\1\uffff\32\26",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\26\13\uffff\1\26\2\uffff\12\26\2\uffff\4\26\1\uffff\32\26\4\uffff"+
			"\1\26\1\uffff\10\26\1\63\21\26",
			"\1\65",
			"\1\26\13\uffff\1\26\2\uffff\12\26\2\uffff\4\26\1\uffff\32\26\4\uffff"+
			"\1\26\1\uffff\32\26",
			"\1\67",
			"\1\26\13\uffff\1\26\2\uffff\12\26\2\uffff\4\26\1\uffff\32\26\4\uffff"+
			"\1\26\1\uffff\32\26",
			"\1\71",
			"",
			"\1\72",
			"",
			"\1\73",
			"",
			"\1\26\13\uffff\1\26\2\uffff\12\26\2\uffff\4\26\1\uffff\32\26\4\uffff"+
			"\1\26\1\uffff\32\26",
			"\1\26\13\uffff\1\26\2\uffff\12\26\2\uffff\4\26\1\uffff\32\26\4\uffff"+
			"\1\26\1\uffff\32\26",
			"\1\26\13\uffff\1\26\2\uffff\12\26\2\uffff\4\26\1\uffff\32\26\4\uffff"+
			"\1\26\1\uffff\32\26",
			"",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | ANONVAR | KEYWORD | ID | TYPEID | MUTID | INT | WS | STRING );";
		}
	}

}
