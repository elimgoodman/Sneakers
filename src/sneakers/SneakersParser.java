// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-16 08:41:54
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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "TYPEID", 
		"WS", "'('", "')'", "'):'", "'->'", "'.'", "':'", "'='", "'['", "']'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "fncall", "prog", "fnparam", "nested_id", "stat", "fndecl", 
		"param", "keyword", "fnname", "array", "expr"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(6, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:7: ( ( stat )+ )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:9: ( stat )+
			{
			dbg.location(6,9);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:9: ( stat )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)||LA1_0==9||LA1_0==14||LA1_0==16) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:9: stat
					{
					dbg.location(6,9);
					pushFollow(FOLLOW_stat_in_prog28);
					stat();
					state._fsp--;

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
		dbg.location(6, 13);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:1: stat : ( ID '=' fncall NEWLINE | ID '=' expr NEWLINE | expr NEWLINE | NEWLINE );
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(8, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:6: ( ID '=' fncall NEWLINE | ID '=' expr NEWLINE | expr NEWLINE | NEWLINE )
			int alt2=4;
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:8: ID '=' fncall NEWLINE
					{
					dbg.location(8,8);
					match(input,ID,FOLLOW_ID_in_stat37); dbg.location(8,11);
					match(input,15,FOLLOW_15_in_stat39); dbg.location(8,15);
					pushFollow(FOLLOW_fncall_in_stat41);
					fncall();
					state._fsp--;
					dbg.location(8,22);
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat43); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:9:4: ID '=' expr NEWLINE
					{
					dbg.location(9,4);
					match(input,ID,FOLLOW_ID_in_stat48); dbg.location(9,7);
					match(input,15,FOLLOW_15_in_stat50); dbg.location(9,11);
					pushFollow(FOLLOW_expr_in_stat52);
					expr();
					state._fsp--;
					dbg.location(9,16);
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat54); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:10:4: expr NEWLINE
					{
					dbg.location(10,4);
					pushFollow(FOLLOW_expr_in_stat59);
					expr();
					state._fsp--;
					dbg.location(10,9);
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat61); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:4: NEWLINE
					{
					dbg.location(11,4);
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat66); 
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
		dbg.location(12, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stat"



	// $ANTLR start "nested_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:1: nested_id : ID ( '.' ID )* ;
	public final void nested_id() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "nested_id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:11: ( ID ( '.' ID )* )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:13: ID ( '.' ID )*
			{
			dbg.location(14,13);
			match(input,ID,FOLLOW_ID_in_nested_id76); dbg.location(14,16);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:16: ( '.' ID )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==13) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:17: '.' ID
					{
					dbg.location(14,17);
					match(input,13,FOLLOW_13_in_nested_id79); dbg.location(14,21);
					match(input,ID,FOLLOW_ID_in_nested_id81); 
					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(15, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "nested_id");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "nested_id"



	// $ANTLR start "fnname"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:17:1: fnname : ( nested_id | keyword );
	public final void fnname() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "fnname");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:17:8: ( nested_id | keyword )
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==ID) ) {
				alt4=1;
			}
			else if ( (LA4_0==14) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:17:10: nested_id
					{
					dbg.location(17,10);
					pushFollow(FOLLOW_nested_id_in_fnname94);
					nested_id();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:4: keyword
					{
					dbg.location(18,4);
					pushFollow(FOLLOW_keyword_in_fnname99);
					keyword();
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
		dbg.location(19, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fnname");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "fnname"



	// $ANTLR start "fncall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:1: fncall : fnname ( param )+ ;
	public final void fncall() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "fncall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(21, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:8: ( fnname ( param )+ )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:10: fnname ( param )+
			{
			dbg.location(21,10);
			pushFollow(FOLLOW_fnname_in_fncall109);
			fnname();
			state._fsp--;
			dbg.location(21,17);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:17: ( param )+
			int cnt5=0;
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= ID && LA5_0 <= INT)||LA5_0==9||LA5_0==14||LA5_0==16) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:17: param
					{
					dbg.location(21,17);
					pushFollow(FOLLOW_param_in_fncall111);
					param();
					state._fsp--;

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt5++;
			}
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(22, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fncall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "fncall"



	// $ANTLR start "param"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:24:1: param : ( ID ':' expr | expr );
	public final void param() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "param");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:24:7: ( ID ':' expr | expr )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==14) ) {
					int LA6_3 = input.LA(3);
					if ( ((LA6_3 >= ID && LA6_3 <= INT)||LA6_3==9||LA6_3==14||LA6_3==16) ) {
						alt6=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 3, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( ((LA6_1 >= ID && LA6_1 <= NEWLINE)||(LA6_1 >= 9 && LA6_1 <= 10)||LA6_1==13||LA6_1==16) ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA6_0==INT||LA6_0==9||LA6_0==14||LA6_0==16) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:24:9: ID ':' expr
					{
					dbg.location(24,9);
					match(input,ID,FOLLOW_ID_in_param122); dbg.location(24,12);
					match(input,14,FOLLOW_14_in_param124); dbg.location(24,16);
					pushFollow(FOLLOW_expr_in_param126);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:25:4: expr
					{
					dbg.location(25,4);
					pushFollow(FOLLOW_expr_in_param131);
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
		dbg.location(26, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "param");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "param"



	// $ANTLR start "fnparam"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:28:1: fnparam : ID ':' TYPEID ;
	public final void fnparam() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "fnparam");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:28:9: ( ID ':' TYPEID )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:28:11: ID ':' TYPEID
			{
			dbg.location(28,11);
			match(input,ID,FOLLOW_ID_in_fnparam141); dbg.location(28,14);
			match(input,14,FOLLOW_14_in_fnparam143); dbg.location(28,18);
			match(input,TYPEID,FOLLOW_TYPEID_in_fnparam145); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(29, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fnparam");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "fnparam"



	// $ANTLR start "fndecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:1: fndecl : '(' ( fnparam )* '):' TYPEID '->' ;
	public final void fndecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "fndecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:8: ( '(' ( fnparam )* '):' TYPEID '->' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:10: '(' ( fnparam )* '):' TYPEID '->'
			{
			dbg.location(31,10);
			match(input,9,FOLLOW_9_in_fndecl155); dbg.location(31,14);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:14: ( fnparam )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==ID) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:14: fnparam
					{
					dbg.location(31,14);
					pushFollow(FOLLOW_fnparam_in_fndecl157);
					fnparam();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(31,23);
			match(input,11,FOLLOW_11_in_fndecl160); dbg.location(31,28);
			match(input,TYPEID,FOLLOW_TYPEID_in_fndecl162); dbg.location(31,35);
			match(input,12,FOLLOW_12_in_fndecl164); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(32, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fndecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "fndecl"



	// $ANTLR start "expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:34:1: expr : ( fndecl | '(' fncall ')' | nested_id | array | keyword | INT );
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:34:6: ( fndecl | '(' fncall ')' | nested_id | array | keyword | INT )
			int alt8=6;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case 9:
				{
				switch ( input.LA(2) ) {
				case ID:
					{
					int LA8_6 = input.LA(3);
					if ( (LA8_6==14) ) {
						int LA8_9 = input.LA(4);
						if ( (LA8_9==TYPEID) ) {
							alt8=1;
						}
						else if ( (LA8_9==ID) ) {
							alt8=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 9, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( ((LA8_6 >= ID && LA8_6 <= INT)||LA8_6==9||LA8_6==13||LA8_6==16) ) {
						alt8=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 6, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 11:
					{
					alt8=1;
					}
					break;
				case 14:
					{
					alt8=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ID:
				{
				alt8=3;
				}
				break;
			case 16:
				{
				alt8=4;
				}
				break;
			case 14:
				{
				alt8=5;
				}
				break;
			case INT:
				{
				alt8=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:34:8: fndecl
					{
					dbg.location(34,8);
					pushFollow(FOLLOW_fndecl_in_expr174);
					fndecl();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:35:4: '(' fncall ')'
					{
					dbg.location(35,4);
					match(input,9,FOLLOW_9_in_expr179); dbg.location(35,8);
					pushFollow(FOLLOW_fncall_in_expr181);
					fncall();
					state._fsp--;
					dbg.location(35,15);
					match(input,10,FOLLOW_10_in_expr183); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:36:4: nested_id
					{
					dbg.location(36,4);
					pushFollow(FOLLOW_nested_id_in_expr188);
					nested_id();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:37:4: array
					{
					dbg.location(37,4);
					pushFollow(FOLLOW_array_in_expr193);
					array();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:38:4: keyword
					{
					dbg.location(38,4);
					pushFollow(FOLLOW_keyword_in_expr198);
					keyword();
					state._fsp--;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:39:4: INT
					{
					dbg.location(39,4);
					match(input,INT,FOLLOW_INT_in_expr203); 
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
		dbg.location(40, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "array"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:42:1: array : '[' ( expr )* ']' ;
	public final void array() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "array");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(42, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:42:7: ( '[' ( expr )* ']' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:42:9: '[' ( expr )* ']'
			{
			dbg.location(42,9);
			match(input,16,FOLLOW_16_in_array213); dbg.location(42,13);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:42:13: ( expr )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= ID && LA9_0 <= INT)||LA9_0==9||LA9_0==14||LA9_0==16) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:42:13: expr
					{
					dbg.location(42,13);
					pushFollow(FOLLOW_expr_in_array215);
					expr();
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(42,19);
			match(input,17,FOLLOW_17_in_array218); 
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
			dbg.exitRule(getGrammarFileName(), "array");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "array"



	// $ANTLR start "keyword"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:1: keyword : ':' ID ;
	public final void keyword() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "keyword");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:9: ( ':' ID )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:11: ':' ID
			{
			dbg.location(45,11);
			match(input,14,FOLLOW_14_in_keyword228); dbg.location(45,15);
			match(input,ID,FOLLOW_ID_in_keyword230); 
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
			dbg.exitRule(getGrammarFileName(), "keyword");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "keyword"

	// Delegated rules


	protected DFA2 dfa2 = new DFA2(this);
	static final String DFA2_eotS =
		"\14\uffff";
	static final String DFA2_eofS =
		"\14\uffff";
	static final String DFA2_minS =
		"\1\4\1\6\2\uffff\3\4\1\uffff\1\4\1\uffff\2\4";
	static final String DFA2_maxS =
		"\1\20\1\17\2\uffff\2\20\1\4\1\uffff\1\4\1\uffff\2\20";
	static final String DFA2_acceptS =
		"\2\uffff\1\3\1\4\3\uffff\1\2\1\uffff\1\1\2\uffff";
	static final String DFA2_specialS =
		"\14\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\1\1\2\1\3\2\uffff\1\2\4\uffff\1\2\1\uffff\1\2",
			"\1\2\6\uffff\1\2\1\uffff\1\4",
			"",
			"",
			"\1\5\1\7\3\uffff\1\7\4\uffff\1\6\1\uffff\1\7",
			"\2\11\1\7\2\uffff\1\11\3\uffff\1\10\1\11\1\uffff\1\11",
			"\1\12",
			"",
			"\1\13",
			"",
			"\2\11\1\7\2\uffff\1\11\4\uffff\1\11\1\uffff\1\11",
			"\2\11\1\7\2\uffff\1\11\3\uffff\1\10\1\11\1\uffff\1\11"
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
			return "8:1: stat : ( ID '=' fncall NEWLINE | ID '=' expr NEWLINE | expr NEWLINE | NEWLINE );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_stat_in_prog28 = new BitSet(new long[]{0x0000000000014272L});
	public static final BitSet FOLLOW_ID_in_stat37 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stat39 = new BitSet(new long[]{0x0000000000004010L});
	public static final BitSet FOLLOW_fncall_in_stat41 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_stat43 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stat48 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stat50 = new BitSet(new long[]{0x0000000000014230L});
	public static final BitSet FOLLOW_expr_in_stat52 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_stat54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_stat59 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_stat61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_stat66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_nested_id76 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_nested_id79 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_nested_id81 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_nested_id_in_fnname94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyword_in_fnname99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fnname_in_fncall109 = new BitSet(new long[]{0x0000000000014230L});
	public static final BitSet FOLLOW_param_in_fncall111 = new BitSet(new long[]{0x0000000000014232L});
	public static final BitSet FOLLOW_ID_in_param122 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_param124 = new BitSet(new long[]{0x0000000000014230L});
	public static final BitSet FOLLOW_expr_in_param126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_param131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fnparam141 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_fnparam143 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_TYPEID_in_fnparam145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_fndecl155 = new BitSet(new long[]{0x0000000000000810L});
	public static final BitSet FOLLOW_fnparam_in_fndecl157 = new BitSet(new long[]{0x0000000000000810L});
	public static final BitSet FOLLOW_11_in_fndecl160 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_TYPEID_in_fndecl162 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_fndecl164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_expr174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_expr179 = new BitSet(new long[]{0x0000000000004010L});
	public static final BitSet FOLLOW_fncall_in_expr181 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_expr183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_expr188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_expr193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyword_in_expr198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_array213 = new BitSet(new long[]{0x0000000000034230L});
	public static final BitSet FOLLOW_expr_in_array215 = new BitSet(new long[]{0x0000000000034230L});
	public static final BitSet FOLLOW_17_in_array218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_keyword228 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_keyword230 = new BitSet(new long[]{0x0000000000000002L});
}
