// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-18 18:12:06
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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANONVAR", "ID", "INT", "KEYWORD", 
		"MUTID", "STRING", "TYPEID", "WS", "'#'", "'('", "')'", "','", "'.'", 
		"':'", "';'", "'<'", "'='", "'=>'", "'>'", "'@'", "'['", "']'", "'else'", 
		"'elseif'", "'if'", "'pass'", "'return'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "dict_pair", "dict", "paramtype", "stat", "mutcall", "block", 
		"expr", "contained_block", "assignment", "blockdecl", "array", "fndecl", 
		"anonfn", "any_id", "mutdecl", "defable", "param", "defdecl", "fnparam", 
		"nested_id", "standalone_fncall", "index_expr", "fncall", "prog", "ifstat"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:1: prog : block ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(6, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:6: ( block )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:8: block
			{
			dbg.location(6,8);
			pushFollow(FOLLOW_block_in_prog27);
			block();
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
		dbg.location(6, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "block"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:1: block : ( stat ';' )+ ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(8, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:8: ( ( stat ';' )+ )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:10: ( stat ';' )+
			{
			dbg.location(8,10);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:10: ( stat ';' )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==MUTID||LA1_0==TYPEID||LA1_0==19||(LA1_0 >= 28 && LA1_0 <= 30)) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:11: stat ';'
					{
					dbg.location(8,11);
					pushFollow(FOLLOW_stat_in_block37);
					stat();
					state._fsp--;
					dbg.location(8,16);
					match(input,18,FOLLOW_18_in_block39); 
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
		dbg.location(8, 20);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "stat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:10:1: stat : ( assignment | ifstat | 'return' fncall | 'return' expr | mutcall | 'pass' );
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(10, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:10:6: ( assignment | ifstat | 'return' fncall | 'return' expr | mutcall | 'pass' )
			int alt2=6;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			try {
				isCyclicDecision = true;
				alt2 = dfa2.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:10:8: assignment
					{
					dbg.location(10,8);
					pushFollow(FOLLOW_assignment_in_stat49);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:4: ifstat
					{
					dbg.location(11,4);
					pushFollow(FOLLOW_ifstat_in_stat54);
					ifstat();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:4: 'return' fncall
					{
					dbg.location(12,4);
					match(input,30,FOLLOW_30_in_stat59); dbg.location(12,13);
					pushFollow(FOLLOW_fncall_in_stat61);
					fncall();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:13:4: 'return' expr
					{
					dbg.location(13,4);
					match(input,30,FOLLOW_30_in_stat66); dbg.location(13,13);
					pushFollow(FOLLOW_expr_in_stat68);
					expr();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:4: mutcall
					{
					dbg.location(14,4);
					pushFollow(FOLLOW_mutcall_in_stat73);
					mutcall();
					state._fsp--;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:15:4: 'pass'
					{
					dbg.location(15,4);
					match(input,29,FOLLOW_29_in_stat78); 
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
		dbg.location(16, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stat"



	// $ANTLR start "ifstat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:1: ifstat : 'if' expr contained_block ( 'elseif' expr contained_block )* ( 'else' contained_block )? ;
	public final void ifstat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ifstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(18, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:8: ( 'if' expr contained_block ( 'elseif' expr contained_block )* ( 'else' contained_block )? )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:10: 'if' expr contained_block ( 'elseif' expr contained_block )* ( 'else' contained_block )?
			{
			dbg.location(18,10);
			match(input,28,FOLLOW_28_in_ifstat88); dbg.location(18,15);
			pushFollow(FOLLOW_expr_in_ifstat90);
			expr();
			state._fsp--;
			dbg.location(18,20);
			pushFollow(FOLLOW_contained_block_in_ifstat92);
			contained_block();
			state._fsp--;
			dbg.location(18,36);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:36: ( 'elseif' expr contained_block )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==27) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:37: 'elseif' expr contained_block
					{
					dbg.location(18,37);
					match(input,27,FOLLOW_27_in_ifstat95); dbg.location(18,46);
					pushFollow(FOLLOW_expr_in_ifstat97);
					expr();
					state._fsp--;
					dbg.location(18,51);
					pushFollow(FOLLOW_contained_block_in_ifstat99);
					contained_block();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(18,69);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:69: ( 'else' contained_block )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==26) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:70: 'else' contained_block
					{
					dbg.location(18,70);
					match(input,26,FOLLOW_26_in_ifstat104); dbg.location(18,77);
					pushFollow(FOLLOW_contained_block_in_ifstat106);
					contained_block();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(18, 93);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifstat"



	// $ANTLR start "assignment"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:20:1: assignment : ( any_id '=' expr | any_id '=' fncall );
	public final void assignment() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "assignment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:2: ( any_id '=' expr | any_id '=' fncall )
			int alt5=2;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			try {
				isCyclicDecision = true;
				alt5 = dfa5.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:4: any_id '=' expr
					{
					dbg.location(21,4);
					pushFollow(FOLLOW_any_id_in_assignment117);
					any_id();
					state._fsp--;
					dbg.location(21,11);
					match(input,20,FOLLOW_20_in_assignment119); dbg.location(21,15);
					pushFollow(FOLLOW_expr_in_assignment121);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:4: any_id '=' fncall
					{
					dbg.location(22,4);
					pushFollow(FOLLOW_any_id_in_assignment126);
					any_id();
					state._fsp--;
					dbg.location(22,11);
					match(input,20,FOLLOW_20_in_assignment128); dbg.location(22,15);
					pushFollow(FOLLOW_fncall_in_assignment130);
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
		dbg.location(23, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assignment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assignment"



	// $ANTLR start "defable"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:26:1: defable : ( TYPEID | fndecl ( stat )+ );
	public final void defable() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "defable");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:26:9: ( TYPEID | fndecl ( stat )+ )
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==TYPEID) ) {
				alt7=1;
			}
			else if ( (LA7_0==12) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:26:11: TYPEID
					{
					dbg.location(26,11);
					match(input,TYPEID,FOLLOW_TYPEID_in_defable141); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:27:4: fndecl ( stat )+
					{
					dbg.location(27,4);
					pushFollow(FOLLOW_fndecl_in_defable146);
					fndecl();
					state._fsp--;
					dbg.location(27,11);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:27:11: ( stat )+
					int cnt6=0;
					try { dbg.enterSubRule(6);

					loop6:
					while (true) {
						int alt6=2;
						try { dbg.enterDecision(6, decisionCanBacktrack[6]);

						int LA6_0 = input.LA(1);
						if ( (LA6_0==ID||LA6_0==MUTID||LA6_0==TYPEID||LA6_0==19||(LA6_0 >= 28 && LA6_0 <= 30)) ) {
							alt6=1;
						}

						} finally {dbg.exitDecision(6);}

						switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:27:11: stat
							{
							dbg.location(27,11);
							pushFollow(FOLLOW_stat_in_defable148);
							stat();
							state._fsp--;

							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt6++;
					}
					} finally {dbg.exitSubRule(6);}

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
		dbg.location(28, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "defable");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "defable"



	// $ANTLR start "defdecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:1: defdecl : KEYWORD '=>' defable ;
	public final void defdecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "defdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:9: ( KEYWORD '=>' defable )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:11: KEYWORD '=>' defable
			{
			dbg.location(30,11);
			match(input,KEYWORD,FOLLOW_KEYWORD_in_defdecl159); dbg.location(30,19);
			match(input,21,FOLLOW_21_in_defdecl161); dbg.location(30,24);
			pushFollow(FOLLOW_defable_in_defdecl163);
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
		dbg.location(31, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "defdecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "defdecl"



	// $ANTLR start "nested_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:34:1: nested_id : ( any_id | ANONVAR ) ( '.' any_id )* ;
	public final void nested_id() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "nested_id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:35:2: ( ( any_id | ANONVAR ) ( '.' any_id )* )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:35:4: ( any_id | ANONVAR ) ( '.' any_id )*
			{
			dbg.location(35,4);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:35:4: ( any_id | ANONVAR )
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID||LA8_0==MUTID||LA8_0==TYPEID) ) {
				alt8=1;
			}
			else if ( (LA8_0==ANONVAR) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:35:5: any_id
					{
					dbg.location(35,5);
					pushFollow(FOLLOW_any_id_in_nested_id177);
					any_id();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:35:14: ANONVAR
					{
					dbg.location(35,14);
					match(input,ANONVAR,FOLLOW_ANONVAR_in_nested_id181); 
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(35,23);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:35:23: ( '.' any_id )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( (LA9_0==16) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:35:24: '.' any_id
					{
					dbg.location(35,24);
					match(input,16,FOLLOW_16_in_nested_id185); dbg.location(35,28);
					pushFollow(FOLLOW_any_id_in_nested_id187);
					any_id();
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}
			} finally {dbg.exitSubRule(9);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "nested_id");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "nested_id"



	// $ANTLR start "fncall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:38:1: fncall : nested_id param ( ( ',' )? param )* ;
	public final void fncall() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "fncall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:38:8: ( nested_id param ( ( ',' )? param )* )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:38:10: nested_id param ( ( ',' )? param )*
			{
			dbg.location(38,10);
			pushFollow(FOLLOW_nested_id_in_fncall199);
			nested_id();
			state._fsp--;
			dbg.location(38,20);
			pushFollow(FOLLOW_param_in_fncall201);
			param();
			state._fsp--;
			dbg.location(38,26);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:38:26: ( ( ',' )? param )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				switch ( input.LA(1) ) {
				case ID:
					{
					int LA11_2 = input.LA(2);
					if ( (LA11_2==EOF||(LA11_2 >= ANONVAR && LA11_2 <= TYPEID)||(LA11_2 >= 12 && LA11_2 <= 19)||(LA11_2 >= 22 && LA11_2 <= 25)||(LA11_2 >= 28 && LA11_2 <= 31)) ) {
						alt11=1;
					}

					}
					break;
				case ANONVAR:
				case INT:
				case KEYWORD:
				case STRING:
				case 12:
				case 13:
				case 15:
				case 23:
				case 24:
				case 31:
					{
					alt11=1;
					}
					break;
				case MUTID:
				case TYPEID:
					{
					int LA11_4 = input.LA(2);
					if ( (LA11_4==EOF||(LA11_4 >= ANONVAR && LA11_4 <= TYPEID)||(LA11_4 >= 12 && LA11_4 <= 16)||(LA11_4 >= 18 && LA11_4 <= 19)||(LA11_4 >= 22 && LA11_4 <= 25)||(LA11_4 >= 28 && LA11_4 <= 31)) ) {
						alt11=1;
					}

					}
					break;
				}
				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:38:27: ( ',' )? param
					{
					dbg.location(38,27);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:38:27: ( ',' )?
					int alt10=2;
					try { dbg.enterSubRule(10);
					try { dbg.enterDecision(10, decisionCanBacktrack[10]);

					int LA10_0 = input.LA(1);
					if ( (LA10_0==15) ) {
						alt10=1;
					}
					} finally {dbg.exitDecision(10);}

					switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:38:27: ','
							{
							dbg.location(38,27);
							match(input,15,FOLLOW_15_in_fncall204); 
							}
							break;

					}
					} finally {dbg.exitSubRule(10);}
					dbg.location(38,32);
					pushFollow(FOLLOW_param_in_fncall207);
					param();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}
			} finally {dbg.exitSubRule(11);}

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
			dbg.exitRule(getGrammarFileName(), "fncall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "fncall"



	// $ANTLR start "param"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:41:1: param : ( ID ':' expr | expr );
	public final void param() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "param");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:41:7: ( ID ':' expr | expr )
			int alt12=2;
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==ID) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==17) ) {
					alt12=1;
				}
				else if ( (LA12_1==EOF||(LA12_1 >= ANONVAR && LA12_1 <= TYPEID)||(LA12_1 >= 12 && LA12_1 <= 16)||(LA12_1 >= 18 && LA12_1 <= 19)||(LA12_1 >= 22 && LA12_1 <= 25)||(LA12_1 >= 28 && LA12_1 <= 31)) ) {
					alt12=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA12_0==ANONVAR||(LA12_0 >= INT && LA12_0 <= TYPEID)||(LA12_0 >= 12 && LA12_0 <= 13)||(LA12_0 >= 23 && LA12_0 <= 24)||LA12_0==31) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:41:9: ID ':' expr
					{
					dbg.location(41,9);
					match(input,ID,FOLLOW_ID_in_param219); dbg.location(41,12);
					match(input,17,FOLLOW_17_in_param221); dbg.location(41,16);
					pushFollow(FOLLOW_expr_in_param223);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:42:4: expr
					{
					dbg.location(42,4);
					pushFollow(FOLLOW_expr_in_param228);
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
		dbg.location(43, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "param");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "param"



	// $ANTLR start "paramtype"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:1: paramtype : ( TYPEID | '(' ( TYPEID )* ')' ':' TYPEID );
	public final void paramtype() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "paramtype");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:11: ( TYPEID | '(' ( TYPEID )* ')' ':' TYPEID )
			int alt14=2;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==TYPEID) ) {
				alt14=1;
			}
			else if ( (LA14_0==13) ) {
				alt14=2;
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:14: TYPEID
					{
					dbg.location(45,14);
					match(input,TYPEID,FOLLOW_TYPEID_in_paramtype239); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:4: '(' ( TYPEID )* ')' ':' TYPEID
					{
					dbg.location(46,4);
					match(input,13,FOLLOW_13_in_paramtype244); dbg.location(46,8);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:8: ( TYPEID )*
					try { dbg.enterSubRule(13);

					loop13:
					while (true) {
						int alt13=2;
						try { dbg.enterDecision(13, decisionCanBacktrack[13]);

						int LA13_0 = input.LA(1);
						if ( (LA13_0==TYPEID) ) {
							alt13=1;
						}

						} finally {dbg.exitDecision(13);}

						switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:8: TYPEID
							{
							dbg.location(46,8);
							match(input,TYPEID,FOLLOW_TYPEID_in_paramtype246); 
							}
							break;

						default :
							break loop13;
						}
					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(46,16);
					match(input,14,FOLLOW_14_in_paramtype249); dbg.location(46,20);
					match(input,17,FOLLOW_17_in_paramtype251); dbg.location(46,24);
					match(input,TYPEID,FOLLOW_TYPEID_in_paramtype253); 
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
		dbg.location(47, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramtype");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paramtype"



	// $ANTLR start "fnparam"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:1: fnparam : ID ':' paramtype ;
	public final void fnparam() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "fnparam");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:9: ( ID ':' paramtype )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:11: ID ':' paramtype
			{
			dbg.location(49,11);
			match(input,ID,FOLLOW_ID_in_fnparam264); dbg.location(49,14);
			match(input,17,FOLLOW_17_in_fnparam266); dbg.location(49,18);
			pushFollow(FOLLOW_paramtype_in_fnparam268);
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
		dbg.location(50, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fnparam");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "fnparam"



	// $ANTLR start "anonfn"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:52:1: anonfn : ( '#' '[' fncall ']' | '#' '[' nested_id ']' );
	public final void anonfn() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "anonfn");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:52:8: ( '#' '[' fncall ']' | '#' '[' nested_id ']' )
			int alt15=2;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			try {
				isCyclicDecision = true;
				alt15 = dfa15.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:52:10: '#' '[' fncall ']'
					{
					dbg.location(52,10);
					match(input,12,FOLLOW_12_in_anonfn278); dbg.location(52,14);
					match(input,24,FOLLOW_24_in_anonfn280); dbg.location(52,18);
					pushFollow(FOLLOW_fncall_in_anonfn282);
					fncall();
					state._fsp--;
					dbg.location(52,25);
					match(input,25,FOLLOW_25_in_anonfn284); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:4: '#' '[' nested_id ']'
					{
					dbg.location(53,4);
					match(input,12,FOLLOW_12_in_anonfn289); dbg.location(53,8);
					match(input,24,FOLLOW_24_in_anonfn291); dbg.location(53,12);
					pushFollow(FOLLOW_nested_id_in_anonfn293);
					nested_id();
					state._fsp--;
					dbg.location(53,22);
					match(input,25,FOLLOW_25_in_anonfn295); 
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
		dbg.location(54, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "anonfn");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "anonfn"



	// $ANTLR start "blockdecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:56:1: blockdecl : ( '(' ')' ( ':' TYPEID )? contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block );
	public final void blockdecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "blockdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:2: ( '(' ')' ( ':' TYPEID )? contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block )
			int alt20=2;
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==13) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==14) ) {
					alt20=1;
				}
				else if ( (LA20_1==ID) ) {
					alt20=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:4: '(' ')' ( ':' TYPEID )? contained_block
					{
					dbg.location(57,4);
					match(input,13,FOLLOW_13_in_blockdecl306); dbg.location(57,8);
					match(input,14,FOLLOW_14_in_blockdecl308); dbg.location(57,12);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:12: ( ':' TYPEID )?
					int alt16=2;
					try { dbg.enterSubRule(16);
					try { dbg.enterDecision(16, decisionCanBacktrack[16]);

					int LA16_0 = input.LA(1);
					if ( (LA16_0==17) ) {
						alt16=1;
					}
					} finally {dbg.exitDecision(16);}

					switch (alt16) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:13: ':' TYPEID
							{
							dbg.location(57,13);
							match(input,17,FOLLOW_17_in_blockdecl311); dbg.location(57,17);
							match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl313); 
							}
							break;

					}
					} finally {dbg.exitSubRule(16);}
					dbg.location(57,26);
					pushFollow(FOLLOW_contained_block_in_blockdecl317);
					contained_block();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:4: '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block
					{
					dbg.location(58,4);
					match(input,13,FOLLOW_13_in_blockdecl322); dbg.location(58,8);
					pushFollow(FOLLOW_fnparam_in_blockdecl324);
					fnparam();
					state._fsp--;
					dbg.location(58,16);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:16: ( ( ',' )? fnparam )*
					try { dbg.enterSubRule(18);

					loop18:
					while (true) {
						int alt18=2;
						try { dbg.enterDecision(18, decisionCanBacktrack[18]);

						int LA18_0 = input.LA(1);
						if ( (LA18_0==ID||LA18_0==15) ) {
							alt18=1;
						}

						} finally {dbg.exitDecision(18);}

						switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:17: ( ',' )? fnparam
							{
							dbg.location(58,17);
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:17: ( ',' )?
							int alt17=2;
							try { dbg.enterSubRule(17);
							try { dbg.enterDecision(17, decisionCanBacktrack[17]);

							int LA17_0 = input.LA(1);
							if ( (LA17_0==15) ) {
								alt17=1;
							}
							} finally {dbg.exitDecision(17);}

							switch (alt17) {
								case 1 :
									dbg.enterAlt(1);

									// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:17: ','
									{
									dbg.location(58,17);
									match(input,15,FOLLOW_15_in_blockdecl327); 
									}
									break;

							}
							} finally {dbg.exitSubRule(17);}
							dbg.location(58,22);
							pushFollow(FOLLOW_fnparam_in_blockdecl330);
							fnparam();
							state._fsp--;

							}
							break;

						default :
							break loop18;
						}
					}
					} finally {dbg.exitSubRule(18);}
					dbg.location(58,32);
					match(input,14,FOLLOW_14_in_blockdecl334); dbg.location(58,36);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:36: ( ':' TYPEID )?
					int alt19=2;
					try { dbg.enterSubRule(19);
					try { dbg.enterDecision(19, decisionCanBacktrack[19]);

					int LA19_0 = input.LA(1);
					if ( (LA19_0==17) ) {
						alt19=1;
					}
					} finally {dbg.exitDecision(19);}

					switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:37: ':' TYPEID
							{
							dbg.location(58,37);
							match(input,17,FOLLOW_17_in_blockdecl337); dbg.location(58,41);
							match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl339); 
							}
							break;

					}
					} finally {dbg.exitSubRule(19);}
					dbg.location(58,50);
					pushFollow(FOLLOW_contained_block_in_blockdecl343);
					contained_block();
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
		dbg.location(59, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "blockdecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "blockdecl"



	// $ANTLR start "fndecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:1: fndecl : '#' blockdecl ;
	public final void fndecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "fndecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:8: ( '#' blockdecl )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:10: '#' blockdecl
			{
			dbg.location(61,10);
			match(input,12,FOLLOW_12_in_fndecl353); dbg.location(61,14);
			pushFollow(FOLLOW_blockdecl_in_fndecl355);
			blockdecl();
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
		dbg.location(62, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fndecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "fndecl"



	// $ANTLR start "mutdecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:1: mutdecl : '@' blockdecl ;
	public final void mutdecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "mutdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:9: ( '@' blockdecl )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:11: '@' blockdecl
			{
			dbg.location(64,11);
			match(input,23,FOLLOW_23_in_mutdecl365); dbg.location(64,15);
			pushFollow(FOLLOW_blockdecl_in_mutdecl367);
			blockdecl();
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
		dbg.location(65, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mutdecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "mutdecl"



	// $ANTLR start "expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:1: expr : ( index_expr | dict | fndecl | mutdecl | anonfn | array );
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:6: ( index_expr | dict | fndecl | mutdecl | anonfn | array )
			int alt21=6;
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			switch ( input.LA(1) ) {
			case ANONVAR:
			case ID:
			case INT:
			case KEYWORD:
			case MUTID:
			case STRING:
			case TYPEID:
			case 13:
				{
				alt21=1;
				}
				break;
			case 31:
				{
				alt21=2;
				}
				break;
			case 12:
				{
				int LA21_3 = input.LA(2);
				if ( (LA21_3==24) ) {
					alt21=5;
				}
				else if ( (LA21_3==13) ) {
					alt21=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 23:
				{
				alt21=4;
				}
				break;
			case 24:
				{
				alt21=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:8: index_expr
					{
					dbg.location(67,8);
					pushFollow(FOLLOW_index_expr_in_expr377);
					index_expr();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:68:4: dict
					{
					dbg.location(68,4);
					pushFollow(FOLLOW_dict_in_expr382);
					dict();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:4: fndecl
					{
					dbg.location(69,4);
					pushFollow(FOLLOW_fndecl_in_expr387);
					fndecl();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:4: mutdecl
					{
					dbg.location(70,4);
					pushFollow(FOLLOW_mutdecl_in_expr392);
					mutdecl();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:71:4: anonfn
					{
					dbg.location(71,4);
					pushFollow(FOLLOW_anonfn_in_expr397);
					anonfn();
					state._fsp--;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:4: array
					{
					dbg.location(72,4);
					pushFollow(FOLLOW_array_in_expr402);
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
		dbg.location(73, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "standalone_fncall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:1: standalone_fncall : '(' fncall ')' ;
	public final void standalone_fncall() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "standalone_fncall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:2: ( '(' fncall ')' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:4: '(' fncall ')'
			{
			dbg.location(76,4);
			match(input,13,FOLLOW_13_in_standalone_fncall413); dbg.location(76,8);
			pushFollow(FOLLOW_fncall_in_standalone_fncall415);
			fncall();
			state._fsp--;
			dbg.location(76,15);
			match(input,14,FOLLOW_14_in_standalone_fncall417); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(77, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "standalone_fncall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "standalone_fncall"



	// $ANTLR start "mutcall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:79:1: mutcall : ( '<' nested_id '>' | '<' fncall '>' );
	public final void mutcall() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "mutcall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:79:9: ( '<' nested_id '>' | '<' fncall '>' )
			int alt22=2;
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			try {
				isCyclicDecision = true;
				alt22 = dfa22.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:79:11: '<' nested_id '>'
					{
					dbg.location(79,11);
					match(input,19,FOLLOW_19_in_mutcall427); dbg.location(79,15);
					pushFollow(FOLLOW_nested_id_in_mutcall429);
					nested_id();
					state._fsp--;
					dbg.location(79,25);
					match(input,22,FOLLOW_22_in_mutcall431); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:80:4: '<' fncall '>'
					{
					dbg.location(80,4);
					match(input,19,FOLLOW_19_in_mutcall436); dbg.location(80,8);
					pushFollow(FOLLOW_fncall_in_mutcall438);
					fncall();
					state._fsp--;
					dbg.location(80,15);
					match(input,22,FOLLOW_22_in_mutcall440); 
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
		dbg.location(81, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mutcall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "mutcall"



	// $ANTLR start "index_expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:1: index_expr : ( KEYWORD | INT | STRING | nested_id | standalone_fncall );
	public final void index_expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "index_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:2: ( KEYWORD | INT | STRING | nested_id | standalone_fncall )
			int alt23=5;
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

			switch ( input.LA(1) ) {
			case KEYWORD:
				{
				alt23=1;
				}
				break;
			case INT:
				{
				alt23=2;
				}
				break;
			case STRING:
				{
				alt23=3;
				}
				break;
			case ANONVAR:
			case ID:
			case MUTID:
			case TYPEID:
				{
				alt23=4;
				}
				break;
			case 13:
				{
				alt23=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(23);}

			switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:4: KEYWORD
					{
					dbg.location(84,4);
					match(input,KEYWORD,FOLLOW_KEYWORD_in_index_expr452); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:85:4: INT
					{
					dbg.location(85,4);
					match(input,INT,FOLLOW_INT_in_index_expr457); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:4: STRING
					{
					dbg.location(86,4);
					match(input,STRING,FOLLOW_STRING_in_index_expr462); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:4: nested_id
					{
					dbg.location(87,4);
					pushFollow(FOLLOW_nested_id_in_index_expr467);
					nested_id();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:4: standalone_fncall
					{
					dbg.location(88,4);
					pushFollow(FOLLOW_standalone_fncall_in_index_expr472);
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
		dbg.location(89, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "index_expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "index_expr"



	// $ANTLR start "dict_pair"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:1: dict_pair : index_expr '=>' expr ;
	public final void dict_pair() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "dict_pair");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(91, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:2: ( index_expr '=>' expr )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:4: index_expr '=>' expr
			{
			dbg.location(92,4);
			pushFollow(FOLLOW_index_expr_in_dict_pair484);
			index_expr();
			state._fsp--;
			dbg.location(92,15);
			match(input,21,FOLLOW_21_in_dict_pair486); dbg.location(92,20);
			pushFollow(FOLLOW_expr_in_dict_pair488);
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
		dbg.location(93, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dict_pair");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "dict_pair"



	// $ANTLR start "dict"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:1: dict : '{' ( dict_pair )? ( ',' dict_pair )* '}' ;
	public final void dict() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "dict");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(95, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:6: ( '{' ( dict_pair )? ( ',' dict_pair )* '}' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:8: '{' ( dict_pair )? ( ',' dict_pair )* '}'
			{
			dbg.location(95,8);
			match(input,31,FOLLOW_31_in_dict498); dbg.location(95,12);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:12: ( dict_pair )?
			int alt24=2;
			try { dbg.enterSubRule(24);
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( ((LA24_0 >= ANONVAR && LA24_0 <= TYPEID)||LA24_0==13) ) {
				alt24=1;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:13: dict_pair
					{
					dbg.location(95,13);
					pushFollow(FOLLOW_dict_pair_in_dict501);
					dict_pair();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(24);}
			dbg.location(95,25);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:25: ( ',' dict_pair )*
			try { dbg.enterSubRule(25);

			loop25:
			while (true) {
				int alt25=2;
				try { dbg.enterDecision(25, decisionCanBacktrack[25]);

				int LA25_0 = input.LA(1);
				if ( (LA25_0==15) ) {
					alt25=1;
				}

				} finally {dbg.exitDecision(25);}

				switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:26: ',' dict_pair
					{
					dbg.location(95,26);
					match(input,15,FOLLOW_15_in_dict506); dbg.location(95,30);
					pushFollow(FOLLOW_dict_pair_in_dict508);
					dict_pair();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}
			} finally {dbg.exitSubRule(25);}
			dbg.location(95,42);
			match(input,32,FOLLOW_32_in_dict512); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(96, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dict");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "dict"



	// $ANTLR start "contained_block"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:98:1: contained_block : '[' block ']' ;
	public final void contained_block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "contained_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(98, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:2: ( '[' block ']' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:4: '[' block ']'
			{
			dbg.location(99,4);
			match(input,24,FOLLOW_24_in_contained_block525); dbg.location(99,8);
			pushFollow(FOLLOW_block_in_contained_block527);
			block();
			state._fsp--;
			dbg.location(99,14);
			match(input,25,FOLLOW_25_in_contained_block529); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(100, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "contained_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "contained_block"



	// $ANTLR start "array"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:102:1: array : '[' ( expr )? ( ',' expr )* ']' ;
	public final void array() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "array");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:102:7: ( '[' ( expr )? ( ',' expr )* ']' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:102:9: '[' ( expr )? ( ',' expr )* ']'
			{
			dbg.location(102,9);
			match(input,24,FOLLOW_24_in_array539); dbg.location(102,13);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:102:13: ( expr )?
			int alt26=2;
			try { dbg.enterSubRule(26);
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( ((LA26_0 >= ANONVAR && LA26_0 <= TYPEID)||(LA26_0 >= 12 && LA26_0 <= 13)||(LA26_0 >= 23 && LA26_0 <= 24)||LA26_0==31) ) {
				alt26=1;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:102:13: expr
					{
					dbg.location(102,13);
					pushFollow(FOLLOW_expr_in_array541);
					expr();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(26);}
			dbg.location(102,19);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:102:19: ( ',' expr )*
			try { dbg.enterSubRule(27);

			loop27:
			while (true) {
				int alt27=2;
				try { dbg.enterDecision(27, decisionCanBacktrack[27]);

				int LA27_0 = input.LA(1);
				if ( (LA27_0==15) ) {
					alt27=1;
				}

				} finally {dbg.exitDecision(27);}

				switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:102:20: ',' expr
					{
					dbg.location(102,20);
					match(input,15,FOLLOW_15_in_array545); dbg.location(102,24);
					pushFollow(FOLLOW_expr_in_array547);
					expr();
					state._fsp--;

					}
					break;

				default :
					break loop27;
				}
			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(102,31);
			match(input,25,FOLLOW_25_in_array551); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(103, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "array");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "array"



	// $ANTLR start "any_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:1: any_id : ( ID | TYPEID | MUTID );
	public final void any_id() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "any_id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:2: ( ID | TYPEID | MUTID )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:
			{
			dbg.location(122,2);
			if ( input.LA(1)==ID||input.LA(1)==MUTID||input.LA(1)==TYPEID ) {
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
		dbg.location(125, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "any_id");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "any_id"

	// Delegated rules


	protected DFA2 dfa2 = new DFA2(this);
	protected DFA5 dfa5 = new DFA5(this);
	protected DFA15 dfa15 = new DFA15(this);
	protected DFA22 dfa22 = new DFA22(this);
	static final String DFA2_eotS =
		"\16\uffff";
	static final String DFA2_eofS =
		"\6\uffff\2\10\2\uffff\1\13\1\uffff\1\13\1\10";
	static final String DFA2_minS =
		"\1\5\2\uffff\1\4\2\uffff\2\4\1\uffff\1\5\1\4\1\uffff\2\4";
	static final String DFA2_maxS =
		"\1\36\2\uffff\1\37\2\uffff\2\37\1\uffff\1\12\1\37\1\uffff\2\37";
	static final String DFA2_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\5\1\6\2\uffff\1\4\2\uffff\1\3\2\uffff";
	static final String DFA2_specialS =
		"\16\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\1\2\uffff\1\1\1\uffff\1\1\10\uffff\1\4\10\uffff\1\2\1\5\1\3",
			"",
			"",
			"\1\7\1\6\2\10\1\6\1\10\1\6\1\uffff\2\10\11\uffff\2\10\6\uffff\1\10",
			"",
			"",
			"\1\13\1\12\2\13\1\14\1\13\1\14\1\uffff\2\13\2\uffff\1\11\1\uffff\2\10"+
			"\3\uffff\2\13\3\uffff\3\10\1\13",
			"\1\13\1\12\2\13\1\14\1\13\1\14\1\uffff\2\13\2\uffff\1\11\1\uffff\2\10"+
			"\3\uffff\2\13\3\uffff\3\10\1\13",
			"",
			"\1\15\2\uffff\1\15\1\uffff\1\15",
			"\7\13\1\uffff\2\13\1\uffff\5\13\1\10\2\uffff\2\13\3\uffff\4\13",
			"",
			"\7\13\1\uffff\2\13\1\uffff\2\13\1\uffff\2\13\1\10\2\uffff\2\13\3\uffff"+
			"\4\13",
			"\1\13\1\12\2\13\1\14\1\13\1\14\1\uffff\2\13\2\uffff\1\11\1\uffff\2\10"+
			"\3\uffff\2\13\3\uffff\3\10\1\13"
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "10:1: stat : ( assignment | ifstat | 'return' fncall | 'return' expr | mutcall | 'pass' );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA5_eotS =
		"\13\uffff";
	static final String DFA5_eofS =
		"\4\uffff\2\3\1\uffff\2\11\1\uffff\1\3";
	static final String DFA5_minS =
		"\1\5\1\24\1\4\1\uffff\2\4\1\5\2\4\1\uffff\1\4";
	static final String DFA5_maxS =
		"\1\12\1\24\1\37\1\uffff\2\37\1\12\2\37\1\uffff\1\37";
	static final String DFA5_acceptS =
		"\3\uffff\1\1\5\uffff\1\2\1\uffff";
	static final String DFA5_specialS =
		"\13\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\1\2\uffff\1\1\1\uffff\1\1",
			"\1\2",
			"\1\5\1\4\2\3\1\4\1\3\1\4\1\uffff\2\3\11\uffff\2\3\6\uffff\1\3",
			"",
			"\1\11\1\7\2\11\1\10\1\11\1\10\1\uffff\2\11\2\uffff\1\6\1\uffff\2\3\3"+
			"\uffff\2\11\3\uffff\3\3\1\11",
			"\1\11\1\7\2\11\1\10\1\11\1\10\1\uffff\2\11\2\uffff\1\6\1\uffff\2\3\3"+
			"\uffff\2\11\3\uffff\3\3\1\11",
			"\1\12\2\uffff\1\12\1\uffff\1\12",
			"\7\11\1\uffff\2\11\1\uffff\5\11\1\3\2\uffff\2\11\3\uffff\4\11",
			"\7\11\1\uffff\2\11\1\uffff\2\11\1\uffff\2\11\1\3\2\uffff\2\11\3\uffff"+
			"\4\11",
			"",
			"\1\11\1\7\2\11\1\10\1\11\1\10\1\uffff\2\11\2\uffff\1\6\1\uffff\2\3\3"+
			"\uffff\2\11\3\uffff\3\3\1\11"
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "20:1: assignment : ( any_id '=' expr | any_id '=' fncall );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA15_eotS =
		"\11\uffff";
	static final String DFA15_eofS =
		"\11\uffff";
	static final String DFA15_minS =
		"\1\14\1\30\3\4\1\5\2\uffff\1\4";
	static final String DFA15_maxS =
		"\1\14\1\30\1\12\2\37\1\12\2\uffff\1\37";
	static final String DFA15_acceptS =
		"\6\uffff\1\1\1\2\1\uffff";
	static final String DFA15_specialS =
		"\11\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\1",
			"\1\2",
			"\1\4\1\3\2\uffff\1\3\1\uffff\1\3",
			"\7\6\1\uffff\2\6\2\uffff\1\5\6\uffff\2\6\1\7\5\uffff\1\6",
			"\7\6\1\uffff\2\6\2\uffff\1\5\6\uffff\2\6\1\7\5\uffff\1\6",
			"\1\10\2\uffff\1\10\1\uffff\1\10",
			"",
			"",
			"\7\6\1\uffff\2\6\2\uffff\1\5\6\uffff\2\6\1\7\5\uffff\1\6"
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "52:1: anonfn : ( '#' '[' fncall ']' | '#' '[' nested_id ']' );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA22_eotS =
		"\10\uffff";
	static final String DFA22_eofS =
		"\10\uffff";
	static final String DFA22_minS =
		"\1\23\3\4\1\5\2\uffff\1\4";
	static final String DFA22_maxS =
		"\1\23\1\12\2\37\1\12\2\uffff\1\37";
	static final String DFA22_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA22_specialS =
		"\10\uffff}>";
	static final String[] DFA22_transitionS = {
			"\1\1",
			"\1\3\1\2\2\uffff\1\2\1\uffff\1\2",
			"\7\6\1\uffff\2\6\2\uffff\1\4\5\uffff\1\5\2\6\6\uffff\1\6",
			"\7\6\1\uffff\2\6\2\uffff\1\4\5\uffff\1\5\2\6\6\uffff\1\6",
			"\1\7\2\uffff\1\7\1\uffff\1\7",
			"",
			"",
			"\7\6\1\uffff\2\6\2\uffff\1\4\5\uffff\1\5\2\6\6\uffff\1\6"
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "79:1: mutcall : ( '<' nested_id '>' | '<' fncall '>' );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_block_in_prog27 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_block37 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_block39 = new BitSet(new long[]{0x0000000070080522L});
	public static final BitSet FOLLOW_assignment_in_stat49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_stat59 = new BitSet(new long[]{0x0000000000000530L});
	public static final BitSet FOLLOW_fncall_in_stat61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_stat66 = new BitSet(new long[]{0x00000000818037F0L});
	public static final BitSet FOLLOW_expr_in_stat68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutcall_in_stat73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_stat78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_ifstat88 = new BitSet(new long[]{0x00000000818037F0L});
	public static final BitSet FOLLOW_expr_in_ifstat90 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat92 = new BitSet(new long[]{0x000000000C000002L});
	public static final BitSet FOLLOW_27_in_ifstat95 = new BitSet(new long[]{0x00000000818037F0L});
	public static final BitSet FOLLOW_expr_in_ifstat97 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat99 = new BitSet(new long[]{0x000000000C000002L});
	public static final BitSet FOLLOW_26_in_ifstat104 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment117 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_assignment119 = new BitSet(new long[]{0x00000000818037F0L});
	public static final BitSet FOLLOW_expr_in_assignment121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment126 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_assignment128 = new BitSet(new long[]{0x0000000000000530L});
	public static final BitSet FOLLOW_fncall_in_assignment130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_defable141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_defable146 = new BitSet(new long[]{0x0000000070080520L});
	public static final BitSet FOLLOW_stat_in_defable148 = new BitSet(new long[]{0x0000000070080522L});
	public static final BitSet FOLLOW_KEYWORD_in_defdecl159 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_defdecl161 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_defable_in_defdecl163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_nested_id177 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_ANONVAR_in_nested_id181 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_nested_id185 = new BitSet(new long[]{0x0000000000000520L});
	public static final BitSet FOLLOW_any_id_in_nested_id187 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_nested_id_in_fncall199 = new BitSet(new long[]{0x00000000818037F0L});
	public static final BitSet FOLLOW_param_in_fncall201 = new BitSet(new long[]{0x000000008180B7F2L});
	public static final BitSet FOLLOW_15_in_fncall204 = new BitSet(new long[]{0x00000000818037F0L});
	public static final BitSet FOLLOW_param_in_fncall207 = new BitSet(new long[]{0x000000008180B7F2L});
	public static final BitSet FOLLOW_ID_in_param219 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_param221 = new BitSet(new long[]{0x00000000818037F0L});
	public static final BitSet FOLLOW_expr_in_param223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_param228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_paramtype244 = new BitSet(new long[]{0x0000000000004400L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype246 = new BitSet(new long[]{0x0000000000004400L});
	public static final BitSet FOLLOW_14_in_paramtype249 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_paramtype251 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fnparam264 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_fnparam266 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_paramtype_in_fnparam268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_anonfn278 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_anonfn280 = new BitSet(new long[]{0x0000000000000530L});
	public static final BitSet FOLLOW_fncall_in_anonfn282 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_anonfn284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_anonfn289 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_anonfn291 = new BitSet(new long[]{0x0000000000000530L});
	public static final BitSet FOLLOW_nested_id_in_anonfn293 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_anonfn295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_blockdecl306 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_blockdecl308 = new BitSet(new long[]{0x0000000001020000L});
	public static final BitSet FOLLOW_17_in_blockdecl311 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl313 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_blockdecl322 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl324 = new BitSet(new long[]{0x000000000000C020L});
	public static final BitSet FOLLOW_15_in_blockdecl327 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl330 = new BitSet(new long[]{0x000000000000C020L});
	public static final BitSet FOLLOW_14_in_blockdecl334 = new BitSet(new long[]{0x0000000001020000L});
	public static final BitSet FOLLOW_17_in_blockdecl337 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl339 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_fndecl353 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_blockdecl_in_fndecl355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_mutdecl365 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_blockdecl_in_mutdecl367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_expr377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_expr387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutdecl_in_expr392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anonfn_in_expr397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_expr402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_standalone_fncall413 = new BitSet(new long[]{0x0000000000000530L});
	public static final BitSet FOLLOW_fncall_in_standalone_fncall415 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_standalone_fncall417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_mutcall427 = new BitSet(new long[]{0x0000000000000530L});
	public static final BitSet FOLLOW_nested_id_in_mutcall429 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_mutcall431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_mutcall436 = new BitSet(new long[]{0x0000000000000530L});
	public static final BitSet FOLLOW_fncall_in_mutcall438 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_mutcall440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_index_expr452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_index_expr457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_index_expr462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_index_expr467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standalone_fncall_in_index_expr472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_dict_pair484 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_dict_pair486 = new BitSet(new long[]{0x00000000818037F0L});
	public static final BitSet FOLLOW_expr_in_dict_pair488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_dict498 = new BitSet(new long[]{0x000000010000A7F0L});
	public static final BitSet FOLLOW_dict_pair_in_dict501 = new BitSet(new long[]{0x0000000100008000L});
	public static final BitSet FOLLOW_15_in_dict506 = new BitSet(new long[]{0x00000000000027F0L});
	public static final BitSet FOLLOW_dict_pair_in_dict508 = new BitSet(new long[]{0x0000000100008000L});
	public static final BitSet FOLLOW_32_in_dict512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_contained_block525 = new BitSet(new long[]{0x0000000070080520L});
	public static final BitSet FOLLOW_block_in_contained_block527 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_contained_block529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_array539 = new BitSet(new long[]{0x000000008380B7F0L});
	public static final BitSet FOLLOW_expr_in_array541 = new BitSet(new long[]{0x0000000002008000L});
	public static final BitSet FOLLOW_15_in_array545 = new BitSet(new long[]{0x00000000818037F0L});
	public static final BitSet FOLLOW_expr_in_array547 = new BitSet(new long[]{0x0000000002008000L});
	public static final BitSet FOLLOW_25_in_array551 = new BitSet(new long[]{0x0000000000000002L});
}
