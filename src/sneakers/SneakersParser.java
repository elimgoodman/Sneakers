// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-18 17:07:20
 package sneakers; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class SneakersParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "KEYWORD", "STRING", 
		"TYPEID", "WS", "'#'", "'('", "')'", "','", "'.'", "':'", "';'", "'='", 
		"'=>'", "'['", "']'", "'return'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "defdecl", "prog", "defable", "expr", "dict_pair", "assignment", 
		"fndecl", "fncall", "paramtype", "nested_id", "array", "standalone_fncall", 
		"any_id", "param", "fnparam", "stat", "dict", "index_expr"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public SneakersParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public SneakersParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public SneakersParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return SneakersParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/eli/dev/Sneakers-Java/Sneakers.g"; }



	// $ANTLR start "prog"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:1: prog : ( stat ';' )+ ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(6, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:7: ( ( stat ';' )+ )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:9: ( stat ';' )+
			{
			dbg.location(6,9);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:9: ( stat ';' )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==TYPEID||LA1_0==21) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:10: stat ';'
					{
					dbg.location(6,10);
					pushFollow(FOLLOW_stat_in_prog29);
					stat();
					state._fsp--;
					dbg.location(6,15);
					match(input,16,FOLLOW_16_in_prog31); 
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(6, 19);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:1: stat : ( assignment | 'return' expr );
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(8, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:6: ( assignment | 'return' expr )
			int alt2=2;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==ID||LA2_0==TYPEID) ) {
				alt2=1;
			}
			else if ( (LA2_0==21) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:8: assignment
					{
					dbg.location(8,8);
					pushFollow(FOLLOW_assignment_in_stat41);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:9:4: 'return' expr
					{
					dbg.location(9,4);
					match(input,21,FOLLOW_21_in_stat46); dbg.location(9,13);
					pushFollow(FOLLOW_expr_in_stat48);
					expr();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(10, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stat"



	// $ANTLR start "assignment"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:1: assignment : ( any_id '=' expr | any_id '=' fncall );
	public final void assignment() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "assignment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:13:2: ( any_id '=' expr | any_id '=' fncall )
			int alt3=2;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			try {
				isCyclicDecision = true;
				alt3 = dfa3.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:13:4: any_id '=' expr
					{
					dbg.location(13,4);
					pushFollow(FOLLOW_any_id_in_assignment59);
					any_id();
					state._fsp--;
					dbg.location(13,11);
					match(input,17,FOLLOW_17_in_assignment61); dbg.location(13,15);
					pushFollow(FOLLOW_expr_in_assignment63);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:4: any_id '=' fncall
					{
					dbg.location(14,4);
					pushFollow(FOLLOW_any_id_in_assignment68);
					any_id();
					state._fsp--;
					dbg.location(14,11);
					match(input,17,FOLLOW_17_in_assignment70); dbg.location(14,15);
					pushFollow(FOLLOW_fncall_in_assignment72);
					fncall();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(15, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assignment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assignment"



	// $ANTLR start "defable"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:1: defable : ( TYPEID | fndecl ( stat )+ );
	public final void defable() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "defable");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(18, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:9: ( TYPEID | fndecl ( stat )+ )
			int alt5=2;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==TYPEID) ) {
				alt5=1;
			}
			else if ( (LA5_0==10) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:11: TYPEID
					{
					dbg.location(18,11);
					match(input,TYPEID,FOLLOW_TYPEID_in_defable83); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:19:4: fndecl ( stat )+
					{
					dbg.location(19,4);
					pushFollow(FOLLOW_fndecl_in_defable88);
					fndecl();
					state._fsp--;
					dbg.location(19,11);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:19:11: ( stat )+
					int cnt4=0;
					try { dbg.enterSubRule(4);

					loop4:
					while (true) {
						int alt4=2;
						try { dbg.enterDecision(4, decisionCanBacktrack[4]);

						int LA4_0 = input.LA(1);
						if ( (LA4_0==ID||LA4_0==TYPEID||LA4_0==21) ) {
							alt4=1;
						}

						} finally {dbg.exitDecision(4);}

						switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:19:11: stat
							{
							dbg.location(19,11);
							pushFollow(FOLLOW_stat_in_defable90);
							stat();
							state._fsp--;

							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt4++;
					}
					} finally {dbg.exitSubRule(4);}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(20, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "defable");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "defable"



	// $ANTLR start "defdecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:1: defdecl : KEYWORD '=>' defable ;
	public final void defdecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "defdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(22, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:9: ( KEYWORD '=>' defable )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:11: KEYWORD '=>' defable
			{
			dbg.location(22,11);
			match(input,KEYWORD,FOLLOW_KEYWORD_in_defdecl101); dbg.location(22,19);
			match(input,18,FOLLOW_18_in_defdecl103); dbg.location(22,24);
			pushFollow(FOLLOW_defable_in_defdecl105);
			defable();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(23, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "defdecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "defdecl"



	// $ANTLR start "nested_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:26:1: nested_id : any_id ( '.' any_id )* ;
	public final void nested_id() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "nested_id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:27:2: ( any_id ( '.' any_id )* )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:27:4: any_id ( '.' any_id )*
			{
			dbg.location(27,4);
			pushFollow(FOLLOW_any_id_in_nested_id118);
			any_id();
			state._fsp--;
			dbg.location(27,11);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:27:11: ( '.' any_id )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==14) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:27:12: '.' any_id
					{
					dbg.location(27,12);
					match(input,14,FOLLOW_14_in_nested_id121); dbg.location(27,16);
					pushFollow(FOLLOW_any_id_in_nested_id123);
					any_id();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(28, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "nested_id");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "nested_id"



	// $ANTLR start "fncall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:1: fncall : nested_id param ( ( ',' )? param )* ;
	public final void fncall() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "fncall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:8: ( nested_id param ( ( ',' )? param )* )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:10: nested_id param ( ( ',' )? param )*
			{
			dbg.location(30,10);
			pushFollow(FOLLOW_nested_id_in_fncall135);
			nested_id();
			state._fsp--;
			dbg.location(30,20);
			pushFollow(FOLLOW_param_in_fncall137);
			param();
			state._fsp--;
			dbg.location(30,26);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:26: ( ( ',' )? param )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				switch ( input.LA(1) ) {
				case ID:
					{
					int LA8_2 = input.LA(2);
					if ( (LA8_2==EOF||(LA8_2 >= ID && LA8_2 <= TYPEID)||(LA8_2 >= 10 && LA8_2 <= 16)||(LA8_2 >= 19 && LA8_2 <= 22)) ) {
						alt8=1;
					}

					}
					break;
				case INT:
				case KEYWORD:
				case STRING:
				case 10:
				case 11:
				case 13:
				case 19:
				case 22:
					{
					alt8=1;
					}
					break;
				case TYPEID:
					{
					int LA8_4 = input.LA(2);
					if ( (LA8_4==EOF||(LA8_4 >= ID && LA8_4 <= TYPEID)||(LA8_4 >= 10 && LA8_4 <= 14)||LA8_4==16||(LA8_4 >= 19 && LA8_4 <= 22)) ) {
						alt8=1;
					}

					}
					break;
				}
				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:27: ( ',' )? param
					{
					dbg.location(30,27);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:27: ( ',' )?
					int alt7=2;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					int LA7_0 = input.LA(1);
					if ( (LA7_0==13) ) {
						alt7=1;
					}
					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:27: ','
							{
							dbg.location(30,27);
							match(input,13,FOLLOW_13_in_fncall140); 
							}
							break;

					}
					} finally {dbg.exitSubRule(7);}
					dbg.location(30,32);
					pushFollow(FOLLOW_param_in_fncall143);
					param();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(31, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fncall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "fncall"



	// $ANTLR start "param"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:33:1: param : ( ID ':' expr | expr );
	public final void param() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "param");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:33:7: ( ID ':' expr | expr )
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==15) ) {
					alt9=1;
				}
				else if ( (LA9_1==EOF||(LA9_1 >= ID && LA9_1 <= TYPEID)||(LA9_1 >= 10 && LA9_1 <= 14)||LA9_1==16||(LA9_1 >= 19 && LA9_1 <= 22)) ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( ((LA9_0 >= INT && LA9_0 <= TYPEID)||(LA9_0 >= 10 && LA9_0 <= 11)||LA9_0==19||LA9_0==22) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:33:9: ID ':' expr
					{
					dbg.location(33,9);
					match(input,ID,FOLLOW_ID_in_param155); dbg.location(33,12);
					match(input,15,FOLLOW_15_in_param157); dbg.location(33,16);
					pushFollow(FOLLOW_expr_in_param159);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:34:4: expr
					{
					dbg.location(34,4);
					pushFollow(FOLLOW_expr_in_param164);
					expr();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(35, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "param");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "param"



	// $ANTLR start "paramtype"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:37:1: paramtype : ( TYPEID | '(' ( TYPEID )* ')' ':' TYPEID );
	public final void paramtype() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "paramtype");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:37:11: ( TYPEID | '(' ( TYPEID )* ')' ':' TYPEID )
			int alt11=2;
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==TYPEID) ) {
				alt11=1;
			}
			else if ( (LA11_0==11) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:37:14: TYPEID
					{
					dbg.location(37,14);
					match(input,TYPEID,FOLLOW_TYPEID_in_paramtype175); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:38:4: '(' ( TYPEID )* ')' ':' TYPEID
					{
					dbg.location(38,4);
					match(input,11,FOLLOW_11_in_paramtype180); dbg.location(38,8);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:38:8: ( TYPEID )*
					try { dbg.enterSubRule(10);

					loop10:
					while (true) {
						int alt10=2;
						try { dbg.enterDecision(10, decisionCanBacktrack[10]);

						int LA10_0 = input.LA(1);
						if ( (LA10_0==TYPEID) ) {
							alt10=1;
						}

						} finally {dbg.exitDecision(10);}

						switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:38:8: TYPEID
							{
							dbg.location(38,8);
							match(input,TYPEID,FOLLOW_TYPEID_in_paramtype182); 
							}
							break;

						default :
							break loop10;
						}
					}
					} finally {dbg.exitSubRule(10);}
					dbg.location(38,16);
					match(input,12,FOLLOW_12_in_paramtype185); dbg.location(38,20);
					match(input,15,FOLLOW_15_in_paramtype187); dbg.location(38,24);
					match(input,TYPEID,FOLLOW_TYPEID_in_paramtype189); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(39, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramtype");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramtype"



	// $ANTLR start "fnparam"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:41:1: fnparam : ID ':' paramtype ;
	public final void fnparam() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "fnparam");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:41:9: ( ID ':' paramtype )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:41:11: ID ':' paramtype
			{
			dbg.location(41,11);
			match(input,ID,FOLLOW_ID_in_fnparam200); dbg.location(41,14);
			match(input,15,FOLLOW_15_in_fnparam202); dbg.location(41,18);
			pushFollow(FOLLOW_paramtype_in_fnparam204);
			paramtype();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(42, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fnparam");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "fnparam"



	// $ANTLR start "fndecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:44:1: fndecl : ( '#' '(' ')' ':' TYPEID array | '#' '(' fnparam ( ( ',' )? fnparam )* ')' ':' TYPEID array );
	public final void fndecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "fndecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:44:8: ( '#' '(' ')' ':' TYPEID array | '#' '(' fnparam ( ( ',' )? fnparam )* ')' ':' TYPEID array )
			int alt14=2;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==10) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==11) ) {
					int LA14_2 = input.LA(3);
					if ( (LA14_2==12) ) {
						alt14=1;
					}
					else if ( (LA14_2==ID) ) {
						alt14=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 14, 2, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:44:10: '#' '(' ')' ':' TYPEID array
					{
					dbg.location(44,10);
					match(input,10,FOLLOW_10_in_fndecl214); dbg.location(44,14);
					match(input,11,FOLLOW_11_in_fndecl216); dbg.location(44,18);
					match(input,12,FOLLOW_12_in_fndecl218); dbg.location(44,22);
					match(input,15,FOLLOW_15_in_fndecl220); dbg.location(44,26);
					match(input,TYPEID,FOLLOW_TYPEID_in_fndecl222); dbg.location(44,33);
					pushFollow(FOLLOW_array_in_fndecl224);
					array();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:4: '#' '(' fnparam ( ( ',' )? fnparam )* ')' ':' TYPEID array
					{
					dbg.location(45,4);
					match(input,10,FOLLOW_10_in_fndecl230); dbg.location(45,8);
					match(input,11,FOLLOW_11_in_fndecl232); dbg.location(45,12);
					pushFollow(FOLLOW_fnparam_in_fndecl234);
					fnparam();
					state._fsp--;
					dbg.location(45,20);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:20: ( ( ',' )? fnparam )*
					try { dbg.enterSubRule(13);

					loop13:
					while (true) {
						int alt13=2;
						try { dbg.enterDecision(13, decisionCanBacktrack[13]);

						int LA13_0 = input.LA(1);
						if ( (LA13_0==ID||LA13_0==13) ) {
							alt13=1;
						}

						} finally {dbg.exitDecision(13);}

						switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:21: ( ',' )? fnparam
							{
							dbg.location(45,21);
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:21: ( ',' )?
							int alt12=2;
							try { dbg.enterSubRule(12);
							try { dbg.enterDecision(12, decisionCanBacktrack[12]);

							int LA12_0 = input.LA(1);
							if ( (LA12_0==13) ) {
								alt12=1;
							}
							} finally {dbg.exitDecision(12);}

							switch (alt12) {
								case 1 :
									dbg.enterAlt(1);

									// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:21: ','
									{
									dbg.location(45,21);
									match(input,13,FOLLOW_13_in_fndecl237); 
									}
									break;

							}
							} finally {dbg.exitSubRule(12);}
							dbg.location(45,26);
							pushFollow(FOLLOW_fnparam_in_fndecl240);
							fnparam();
							state._fsp--;

							}
							break;

						default :
							break loop13;
						}
					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(45,36);
					match(input,12,FOLLOW_12_in_fndecl244); dbg.location(45,40);
					match(input,15,FOLLOW_15_in_fndecl246); dbg.location(45,44);
					match(input,TYPEID,FOLLOW_TYPEID_in_fndecl248); dbg.location(45,51);
					pushFollow(FOLLOW_array_in_fndecl250);
					array();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(46, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fndecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "fndecl"



	// $ANTLR start "expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:1: expr : ( index_expr | dict | fndecl | array );
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:6: ( index_expr | dict | fndecl | array )
			int alt15=4;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			switch ( input.LA(1) ) {
			case ID:
			case INT:
			case KEYWORD:
			case STRING:
			case TYPEID:
			case 11:
				{
				alt15=1;
				}
				break;
			case 22:
				{
				alt15=2;
				}
				break;
			case 10:
				{
				alt15=3;
				}
				break;
			case 19:
				{
				alt15=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:8: index_expr
					{
					dbg.location(48,8);
					pushFollow(FOLLOW_index_expr_in_expr260);
					index_expr();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:4: dict
					{
					dbg.location(49,4);
					pushFollow(FOLLOW_dict_in_expr265);
					dict();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:50:4: fndecl
					{
					dbg.location(50,4);
					pushFollow(FOLLOW_fndecl_in_expr270);
					fndecl();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:4: array
					{
					dbg.location(51,4);
					pushFollow(FOLLOW_array_in_expr275);
					array();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(52, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "standalone_fncall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:54:1: standalone_fncall : '(' fncall ')' ;
	public final void standalone_fncall() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "standalone_fncall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:55:2: ( '(' fncall ')' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:55:4: '(' fncall ')'
			{
			dbg.location(55,4);
			match(input,11,FOLLOW_11_in_standalone_fncall286); dbg.location(55,8);
			pushFollow(FOLLOW_fncall_in_standalone_fncall288);
			fncall();
			state._fsp--;
			dbg.location(55,15);
			match(input,12,FOLLOW_12_in_standalone_fncall290); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "standalone_fncall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "standalone_fncall"



	// $ANTLR start "index_expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:1: index_expr : ( KEYWORD | INT | STRING | nested_id | standalone_fncall );
	public final void index_expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "index_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:59:2: ( KEYWORD | INT | STRING | nested_id | standalone_fncall )
			int alt16=5;
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			switch ( input.LA(1) ) {
			case KEYWORD:
				{
				alt16=1;
				}
				break;
			case INT:
				{
				alt16=2;
				}
				break;
			case STRING:
				{
				alt16=3;
				}
				break;
			case ID:
			case TYPEID:
				{
				alt16=4;
				}
				break;
			case 11:
				{
				alt16=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:59:4: KEYWORD
					{
					dbg.location(59,4);
					match(input,KEYWORD,FOLLOW_KEYWORD_in_index_expr302); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:60:4: INT
					{
					dbg.location(60,4);
					match(input,INT,FOLLOW_INT_in_index_expr307); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:4: STRING
					{
					dbg.location(61,4);
					match(input,STRING,FOLLOW_STRING_in_index_expr312); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:4: nested_id
					{
					dbg.location(62,4);
					pushFollow(FOLLOW_nested_id_in_index_expr317);
					nested_id();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:4: standalone_fncall
					{
					dbg.location(63,4);
					pushFollow(FOLLOW_standalone_fncall_in_index_expr322);
					standalone_fncall();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(64, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "index_expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "index_expr"



	// $ANTLR start "dict_pair"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:1: dict_pair : index_expr '=>' expr ;
	public final void dict_pair() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "dict_pair");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:2: ( index_expr '=>' expr )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:4: index_expr '=>' expr
			{
			dbg.location(67,4);
			pushFollow(FOLLOW_index_expr_in_dict_pair334);
			index_expr();
			state._fsp--;
			dbg.location(67,15);
			match(input,18,FOLLOW_18_in_dict_pair336); dbg.location(67,20);
			pushFollow(FOLLOW_expr_in_dict_pair338);
			expr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(68, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dict_pair");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "dict_pair"



	// $ANTLR start "dict"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:1: dict : '{' ( dict_pair )? ( ',' dict_pair )* '}' ;
	public final void dict() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "dict");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:6: ( '{' ( dict_pair )? ( ',' dict_pair )* '}' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:8: '{' ( dict_pair )? ( ',' dict_pair )* '}'
			{
			dbg.location(70,8);
			match(input,22,FOLLOW_22_in_dict348); dbg.location(70,12);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:12: ( dict_pair )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= ID && LA17_0 <= TYPEID)||LA17_0==11) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:13: dict_pair
					{
					dbg.location(70,13);
					pushFollow(FOLLOW_dict_pair_in_dict351);
					dict_pair();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(17);}
			dbg.location(70,25);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:25: ( ',' dict_pair )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==13) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:26: ',' dict_pair
					{
					dbg.location(70,26);
					match(input,13,FOLLOW_13_in_dict356); dbg.location(70,30);
					pushFollow(FOLLOW_dict_pair_in_dict358);
					dict_pair();
					state._fsp--;

					}
					break;

				default :
					break loop18;
				}
			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(70,42);
			match(input,23,FOLLOW_23_in_dict362); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(71, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dict");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "dict"



	// $ANTLR start "array"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:1: array : ( '[' ( expr )? ( ',' expr )* ']' | '[' ( stat )+ ']' );
	public final void array() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "array");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:7: ( '[' ( expr )? ( ',' expr )* ']' | '[' ( stat )+ ']' )
			int alt22=2;
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==19) ) {
				switch ( input.LA(2) ) {
				case INT:
				case KEYWORD:
				case STRING:
				case 10:
				case 11:
				case 13:
				case 19:
				case 20:
				case 22:
					{
					alt22=1;
					}
					break;
				case ID:
				case TYPEID:
					{
					int LA22_3 = input.LA(3);
					if ( ((LA22_3 >= 13 && LA22_3 <= 14)||LA22_3==20) ) {
						alt22=1;
					}
					else if ( (LA22_3==17) ) {
						alt22=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 3, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 21:
					{
					alt22=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:9: '[' ( expr )? ( ',' expr )* ']'
					{
					dbg.location(73,9);
					match(input,19,FOLLOW_19_in_array374); dbg.location(73,13);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:13: ( expr )?
					int alt19=2;
					try { dbg.enterSubRule(19);
					try { dbg.enterDecision(19, decisionCanBacktrack[19]);

					int LA19_0 = input.LA(1);
					if ( ((LA19_0 >= ID && LA19_0 <= TYPEID)||(LA19_0 >= 10 && LA19_0 <= 11)||LA19_0==19||LA19_0==22) ) {
						alt19=1;
					}
					} finally {dbg.exitDecision(19);}

					switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:13: expr
							{
							dbg.location(73,13);
							pushFollow(FOLLOW_expr_in_array376);
							expr();
							state._fsp--;

							}
							break;

					}
					} finally {dbg.exitSubRule(19);}
					dbg.location(73,19);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:19: ( ',' expr )*
					try { dbg.enterSubRule(20);

					loop20:
					while (true) {
						int alt20=2;
						try { dbg.enterDecision(20, decisionCanBacktrack[20]);

						int LA20_0 = input.LA(1);
						if ( (LA20_0==13) ) {
							alt20=1;
						}

						} finally {dbg.exitDecision(20);}

						switch (alt20) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:20: ',' expr
							{
							dbg.location(73,20);
							match(input,13,FOLLOW_13_in_array380); dbg.location(73,24);
							pushFollow(FOLLOW_expr_in_array382);
							expr();
							state._fsp--;

							}
							break;

						default :
							break loop20;
						}
					}
					} finally {dbg.exitSubRule(20);}
					dbg.location(73,31);
					match(input,20,FOLLOW_20_in_array386); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:4: '[' ( stat )+ ']'
					{
					dbg.location(74,4);
					match(input,19,FOLLOW_19_in_array391); dbg.location(74,8);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:8: ( stat )+
					int cnt21=0;
					try { dbg.enterSubRule(21);

					loop21:
					while (true) {
						int alt21=2;
						try { dbg.enterDecision(21, decisionCanBacktrack[21]);

						int LA21_0 = input.LA(1);
						if ( (LA21_0==ID||LA21_0==TYPEID||LA21_0==21) ) {
							alt21=1;
						}

						} finally {dbg.exitDecision(21);}

						switch (alt21) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:8: stat
							{
							dbg.location(74,8);
							pushFollow(FOLLOW_stat_in_array393);
							stat();
							state._fsp--;

							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							EarlyExitException eee = new EarlyExitException(21, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt21++;
					}
					} finally {dbg.exitSubRule(21);}
					dbg.location(74,14);
					match(input,20,FOLLOW_20_in_array396); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(75, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "array");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "array"



	// $ANTLR start "any_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:1: any_id : ( ID | TYPEID );
	public final void any_id() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "any_id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:2: ( ID | TYPEID )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:
			{
			dbg.location(87,2);
			if ( input.LA(1)==ID||input.LA(1)==TYPEID ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(89, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "any_id");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "any_id"

	// Delegated rules


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\12\uffff";
	static final String DFA3_eofS =
		"\4\uffff\1\3\1\uffff\2\10\1\uffff\1\3";
	static final String DFA3_minS =
		"\1\4\1\21\1\4\1\uffff\4\4\1\uffff\1\4";
	static final String DFA3_maxS =
		"\1\10\1\21\1\26\1\uffff\1\26\1\10\2\26\1\uffff\1\26";
	static final String DFA3_acceptS =
		"\3\uffff\1\1\4\uffff\1\2\1\uffff";
	static final String DFA3_specialS =
		"\12\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1\3\uffff\1\1",
			"\1\2",
			"\1\4\3\3\1\4\1\uffff\2\3\7\uffff\1\3\2\uffff\1\3",
			"",
			"\1\6\3\10\1\7\1\uffff\2\10\2\uffff\1\5\1\uffff\1\3\2\uffff\1\10\2\3"+
			"\1\10",
			"\1\11\3\uffff\1\11",
			"\5\10\1\uffff\2\10\1\uffff\4\10\1\3\1\uffff\4\10",
			"\5\10\1\uffff\2\10\1\uffff\2\10\1\uffff\1\10\1\3\1\uffff\4\10",
			"",
			"\1\6\3\10\1\7\1\uffff\2\10\2\uffff\1\5\1\uffff\1\3\2\uffff\1\10\2\3"+
			"\1\10"
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "12:1: assignment : ( any_id '=' expr | any_id '=' fncall );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_stat_in_prog29 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_prog31 = new BitSet(new long[]{0x0000000000200112L});
	public static final BitSet FOLLOW_assignment_in_stat41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_stat46 = new BitSet(new long[]{0x0000000000480DF0L});
	public static final BitSet FOLLOW_expr_in_stat48 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment59 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_assignment61 = new BitSet(new long[]{0x0000000000480DF0L});
	public static final BitSet FOLLOW_expr_in_assignment63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment68 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_assignment70 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_fncall_in_assignment72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_defable83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_defable88 = new BitSet(new long[]{0x0000000000200110L});
	public static final BitSet FOLLOW_stat_in_defable90 = new BitSet(new long[]{0x0000000000200112L});
	public static final BitSet FOLLOW_KEYWORD_in_defdecl101 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_defdecl103 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_defable_in_defdecl105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_nested_id118 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_nested_id121 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_any_id_in_nested_id123 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_nested_id_in_fncall135 = new BitSet(new long[]{0x0000000000480DF0L});
	public static final BitSet FOLLOW_param_in_fncall137 = new BitSet(new long[]{0x0000000000482DF2L});
	public static final BitSet FOLLOW_13_in_fncall140 = new BitSet(new long[]{0x0000000000480DF0L});
	public static final BitSet FOLLOW_param_in_fncall143 = new BitSet(new long[]{0x0000000000482DF2L});
	public static final BitSet FOLLOW_ID_in_param155 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_param157 = new BitSet(new long[]{0x0000000000480DF0L});
	public static final BitSet FOLLOW_expr_in_param159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_param164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_paramtype180 = new BitSet(new long[]{0x0000000000001100L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype182 = new BitSet(new long[]{0x0000000000001100L});
	public static final BitSet FOLLOW_12_in_paramtype185 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_paramtype187 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fnparam200 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_fnparam202 = new BitSet(new long[]{0x0000000000000900L});
	public static final BitSet FOLLOW_paramtype_in_fnparam204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_fndecl214 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_fndecl216 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_fndecl218 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_fndecl220 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TYPEID_in_fndecl222 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_array_in_fndecl224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_fndecl230 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_fndecl232 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_fnparam_in_fndecl234 = new BitSet(new long[]{0x0000000000003010L});
	public static final BitSet FOLLOW_13_in_fndecl237 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_fnparam_in_fndecl240 = new BitSet(new long[]{0x0000000000003010L});
	public static final BitSet FOLLOW_12_in_fndecl244 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_fndecl246 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TYPEID_in_fndecl248 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_array_in_fndecl250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_expr260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_expr270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_expr275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_standalone_fncall286 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_fncall_in_standalone_fncall288 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_standalone_fncall290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_index_expr302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_index_expr307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_index_expr312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_index_expr317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standalone_fncall_in_index_expr322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_dict_pair334 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_dict_pair336 = new BitSet(new long[]{0x0000000000480DF0L});
	public static final BitSet FOLLOW_expr_in_dict_pair338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_dict348 = new BitSet(new long[]{0x00000000008029F0L});
	public static final BitSet FOLLOW_dict_pair_in_dict351 = new BitSet(new long[]{0x0000000000802000L});
	public static final BitSet FOLLOW_13_in_dict356 = new BitSet(new long[]{0x00000000000009F0L});
	public static final BitSet FOLLOW_dict_pair_in_dict358 = new BitSet(new long[]{0x0000000000802000L});
	public static final BitSet FOLLOW_23_in_dict362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_array374 = new BitSet(new long[]{0x0000000000582DF0L});
	public static final BitSet FOLLOW_expr_in_array376 = new BitSet(new long[]{0x0000000000102000L});
	public static final BitSet FOLLOW_13_in_array380 = new BitSet(new long[]{0x0000000000480DF0L});
	public static final BitSet FOLLOW_expr_in_array382 = new BitSet(new long[]{0x0000000000102000L});
	public static final BitSet FOLLOW_20_in_array386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_array391 = new BitSet(new long[]{0x0000000000200110L});
	public static final BitSet FOLLOW_stat_in_array393 = new BitSet(new long[]{0x0000000000300110L});
	public static final BitSet FOLLOW_20_in_array396 = new BitSet(new long[]{0x0000000000000002L});
}
