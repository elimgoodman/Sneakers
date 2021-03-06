// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-06-02 21:31:20
 package sneakers; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SneakersLexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int ANONFN=4;
	public static final int ANONVAR=5;
	public static final int ARRAY=6;
	public static final int ASSIGN=7;
	public static final int BLOCK=8;
	public static final int BLOCKDECL=9;
	public static final int CLASSDEF=10;
	public static final int DICT=11;
	public static final int DICT_PAIR=12;
	public static final int EXPR=13;
	public static final int FIELDDEF=14;
	public static final int FNCALL=15;
	public static final int FNDECL=16;
	public static final int FNPARAM=17;
	public static final int ID=18;
	public static final int INSTANCE=19;
	public static final int INT=20;
	public static final int KEYWORD=21;
	public static final int METHODDEF=22;
	public static final int MUTDECL=23;
	public static final int MUTID=24;
	public static final int PARAM=25;
	public static final int PARAMTYPEFN=26;
	public static final int PARAMTYPEMUT=27;
	public static final int RET=28;
	public static final int SL_COMMENT=29;
	public static final int STRING=30;
	public static final int TYPEID=31;
	public static final int WS=32;

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

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:10:8: ( '=' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:10:10: '='
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
	// $ANTLR end "ASSIGN"

	// $ANTLR start "CLASSDEF"
	public final void mCLASSDEF() throws RecognitionException {
		try {
			int _type = CLASSDEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:10: ( 'class' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:12: 'class'
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
	// $ANTLR end "CLASSDEF"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:7: ( '#' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:9: '#'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:13:7: ( '(' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:13:9: '('
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:7: ( ')' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:9: ')'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:15:7: ( ',' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:15:9: ','
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:16:7: ( '.' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:16:9: '.'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:17:7: ( ':' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:17:9: ':'
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:7: ( ';' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:9: ';'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:19:7: ( '<' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:19:9: '<'
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:20:7: ( '=>' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:20:9: '=>'
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:7: ( '>' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:9: '>'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:7: ( '@' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:9: '@'
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:23:7: ( '[' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:23:9: '['
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:24:7: ( ']' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:24:9: ']'
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
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
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
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
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:7: ( 'new' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:9: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:7: ( 'pass' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:9: 'pass'
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
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:7: ( 'return' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:9: 'return'
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
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:32:7: ( '{' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:32:9: '{'
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
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:33:7: ( '}' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:33:9: '}'
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
	// $ANTLR end "T__54"

	// $ANTLR start "ANONVAR"
	public final void mANONVAR() throws RecognitionException {
		try {
			int _type = ANONVAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:176:9: ( '$' ( INT )? )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:176:11: '$' ( INT )?
			{
			match('$'); 
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:176:15: ( INT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:176:15: INT
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:179:9: ( ':' ID )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:179:11: ':' ID
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:182:5: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '!' | '?' )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:182:7: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '!' | '?' )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:182:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '!' | '?' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='!'||LA2_0=='-'||(LA2_0 >= '0' && LA2_0 <= '9')||LA2_0=='?'||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:185:8: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:185:10: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:185:21: ( 'a' .. 'z' | 'A' .. 'Z' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:188:7: ( '@' ID )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:188:9: '@' ID
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:197:5: ( ( '0' .. '9' )+ )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:197:7: ( '0' .. '9' )+
			{
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:197:7: ( '0' .. '9' )+
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:201:4: ( ( ' ' | '\\t' | '\\n' ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:201:6: ( ' ' | '\\t' | '\\n' )
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:205:5: ( '\"' (~ ( '\"' ) )* '\"' )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:205:8: '\"' (~ ( '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:205:12: (~ ( '\"' ) )*
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

	// $ANTLR start "SL_COMMENT"
	public final void mSL_COMMENT() throws RecognitionException {
		try {
			int _type = SL_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:209:5: ( '//' (~ ( '\\r' | '\\n' ) )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:209:9: '//' (~ ( '\\r' | '\\n' ) )*
			{
			match("//"); 

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:209:14: (~ ( '\\r' | '\\n' ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
					break loop6;
				}
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SL_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:8: ( ASSIGN | CLASSDEF | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | ANONVAR | KEYWORD | ID | TYPEID | MUTID | INT | WS | STRING | SL_COMMENT )
		int alt7=33;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:10: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 2 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:17: CLASSDEF
				{
				mCLASSDEF(); 

				}
				break;
			case 3 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:26: T__33
				{
				mT__33(); 

				}
				break;
			case 4 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:32: T__34
				{
				mT__34(); 

				}
				break;
			case 5 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:38: T__35
				{
				mT__35(); 

				}
				break;
			case 6 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:44: T__36
				{
				mT__36(); 

				}
				break;
			case 7 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:50: T__37
				{
				mT__37(); 

				}
				break;
			case 8 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:56: T__38
				{
				mT__38(); 

				}
				break;
			case 9 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:62: T__39
				{
				mT__39(); 

				}
				break;
			case 10 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:68: T__40
				{
				mT__40(); 

				}
				break;
			case 11 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:74: T__41
				{
				mT__41(); 

				}
				break;
			case 12 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:80: T__42
				{
				mT__42(); 

				}
				break;
			case 13 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:86: T__43
				{
				mT__43(); 

				}
				break;
			case 14 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:92: T__44
				{
				mT__44(); 

				}
				break;
			case 15 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:98: T__45
				{
				mT__45(); 

				}
				break;
			case 16 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:104: T__46
				{
				mT__46(); 

				}
				break;
			case 17 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:110: T__47
				{
				mT__47(); 

				}
				break;
			case 18 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:116: T__48
				{
				mT__48(); 

				}
				break;
			case 19 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:122: T__49
				{
				mT__49(); 

				}
				break;
			case 20 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:128: T__50
				{
				mT__50(); 

				}
				break;
			case 21 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:134: T__51
				{
				mT__51(); 

				}
				break;
			case 22 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:140: T__52
				{
				mT__52(); 

				}
				break;
			case 23 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:146: T__53
				{
				mT__53(); 

				}
				break;
			case 24 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:152: T__54
				{
				mT__54(); 

				}
				break;
			case 25 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:158: ANONVAR
				{
				mANONVAR(); 

				}
				break;
			case 26 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:166: KEYWORD
				{
				mKEYWORD(); 

				}
				break;
			case 27 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:174: ID
				{
				mID(); 

				}
				break;
			case 28 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:177: TYPEID
				{
				mTYPEID(); 

				}
				break;
			case 29 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:184: MUTID
				{
				mMUTID(); 

				}
				break;
			case 30 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:190: INT
				{
				mINT(); 

				}
				break;
			case 31 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:194: WS
				{
				mWS(); 

				}
				break;
			case 32 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:197: STRING
				{
				mSTRING(); 

				}
				break;
			case 33 :
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:1:204: SL_COMMENT
				{
				mSL_COMMENT(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\1\uffff\1\36\1\27\5\uffff\1\40\3\uffff\1\42\2\uffff\5\27\13\uffff\1\27"+
		"\4\uffff\2\27\1\55\6\27\1\uffff\1\64\3\27\1\71\1\27\1\uffff\1\73\1\27"+
		"\1\75\1\27\1\uffff\1\27\1\uffff\1\27\1\uffff\1\101\1\102\1\103\3\uffff";
	static final String DFA7_eofS =
		"\104\uffff";
	static final String DFA7_minS =
		"\1\11\1\76\1\154\5\uffff\1\141\3\uffff\1\141\2\uffff\1\154\1\146\1\145"+
		"\1\141\1\145\13\uffff\1\141\4\uffff\1\163\1\164\1\41\1\167\1\163\1\164"+
		"\1\163\2\145\1\uffff\1\41\1\163\1\165\1\163\1\41\1\156\1\uffff\1\41\1"+
		"\162\1\41\1\146\1\uffff\1\144\1\uffff\1\156\1\uffff\3\41\3\uffff";
	static final String DFA7_maxS =
		"\1\175\1\76\1\154\5\uffff\1\172\3\uffff\1\172\2\uffff\1\170\1\146\1\145"+
		"\1\141\1\145\13\uffff\1\141\4\uffff\1\163\1\164\1\172\1\167\1\163\1\164"+
		"\1\163\2\145\1\uffff\1\172\1\163\1\165\1\163\1\172\1\156\1\uffff\1\172"+
		"\1\162\1\172\1\146\1\uffff\1\144\1\uffff\1\156\1\uffff\3\172\3\uffff";
	static final String DFA7_acceptS =
		"\3\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\1\14\1\uffff\1\16\1\17"+
		"\5\uffff\1\27\1\30\1\31\1\33\1\34\1\36\1\37\1\40\1\41\1\13\1\1\1\uffff"+
		"\1\10\1\32\1\15\1\35\11\uffff\1\23\6\uffff\1\24\4\uffff\1\20\1\uffff\1"+
		"\25\1\uffff\1\2\3\uffff\1\21\1\22\1\26";
	static final String DFA7_specialS =
		"\104\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\32\25\uffff\1\32\1\uffff\1\33\1\3\1\26\3\uffff\1\4\1\5\2\uffff\1\6"+
			"\1\uffff\1\7\1\34\12\31\1\10\1\11\1\12\1\1\1\13\1\uffff\1\14\32\30\1"+
			"\15\1\uffff\1\16\3\uffff\2\27\1\2\1\27\1\17\3\27\1\20\4\27\1\21\1\27"+
			"\1\22\1\27\1\23\10\27\1\24\1\uffff\1\25",
			"\1\35",
			"\1\37",
			"",
			"",
			"",
			"",
			"",
			"\32\41",
			"",
			"",
			"",
			"\32\43",
			"",
			"",
			"\1\44\13\uffff\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
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
			"\1\52",
			"",
			"",
			"",
			"",
			"\1\53",
			"\1\54",
			"\1\27\13\uffff\1\27\2\uffff\12\27\5\uffff\1\27\1\uffff\32\27\4\uffff"+
			"\1\27\1\uffff\32\27",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"",
			"\1\27\13\uffff\1\27\2\uffff\12\27\5\uffff\1\27\1\uffff\32\27\4\uffff"+
			"\1\27\1\uffff\32\27",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\27\13\uffff\1\27\2\uffff\12\27\5\uffff\1\27\1\uffff\32\27\4\uffff"+
			"\1\27\1\uffff\10\27\1\70\21\27",
			"\1\72",
			"",
			"\1\27\13\uffff\1\27\2\uffff\12\27\5\uffff\1\27\1\uffff\32\27\4\uffff"+
			"\1\27\1\uffff\32\27",
			"\1\74",
			"\1\27\13\uffff\1\27\2\uffff\12\27\5\uffff\1\27\1\uffff\32\27\4\uffff"+
			"\1\27\1\uffff\32\27",
			"\1\76",
			"",
			"\1\77",
			"",
			"\1\100",
			"",
			"\1\27\13\uffff\1\27\2\uffff\12\27\5\uffff\1\27\1\uffff\32\27\4\uffff"+
			"\1\27\1\uffff\32\27",
			"\1\27\13\uffff\1\27\2\uffff\12\27\5\uffff\1\27\1\uffff\32\27\4\uffff"+
			"\1\27\1\uffff\32\27",
			"\1\27\13\uffff\1\27\2\uffff\12\27\5\uffff\1\27\1\uffff\32\27\4\uffff"+
			"\1\27\1\uffff\32\27",
			"",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( ASSIGN | CLASSDEF | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | ANONVAR | KEYWORD | ID | TYPEID | MUTID | INT | WS | STRING | SL_COMMENT );";
		}
	}

}
