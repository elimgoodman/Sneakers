// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-18 10:33:43
 package sneakers; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class SneakersParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "KEYWORD", "STRING", 
		"TYPEID", "WS", "'('", "')'", "','", "'->'", "'.'", "':'", "';'", "'='", 
		"'=>'", "'{'", "'}'"
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
		"invalidRule", "index_expr", "nested_id", "standalone_fncall", "dict", 
		"assignment", "expr", "defable", "prog", "fncall", "fndecl", "dict_pair", 
		"defdecl", "fnparam", "param", "fnname", "stat", "any_id"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false
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
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public SneakersParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return SneakersParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/eli/dev/Sneakers-Java/Sneakers.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:9:1: prog : ( stat )+ ;
	public final SneakersParser.prog_return prog() throws RecognitionException {
		SneakersParser.prog_return retval = new SneakersParser.prog_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat1 =null;


		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(9, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:9:7: ( ( stat )+ )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:9:9: ( stat )+
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(9,9);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:9:9: ( stat )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==TYPEID) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:9:9: stat
					{
					dbg.location(9,9);
					pushFollow(FOLLOW_stat_in_prog37);
					stat1=stat();
					state._fsp--;

					adaptor.addChild(root_0, stat1.getTree());

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

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(9, 13);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "prog"


	public static class stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:1: stat : assignment ';' ;
	public final SneakersParser.stat_return stat() throws RecognitionException {
		SneakersParser.stat_return retval = new SneakersParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal3=null;
		ParserRuleReturnScope assignment2 =null;

		Object char_literal3_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(11, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:6: ( assignment ';' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:8: assignment ';'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(11,8);
			pushFollow(FOLLOW_assignment_in_stat46);
			assignment2=assignment();
			state._fsp--;

			adaptor.addChild(root_0, assignment2.getTree());
			dbg.location(11,19);
			char_literal3=(Token)match(input,16,FOLLOW_16_in_stat48); 
			char_literal3_tree = (Object)adaptor.create(char_literal3);
			adaptor.addChild(root_0, char_literal3_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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

		return retval;
	}
	// $ANTLR end "stat"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:1: assignment : ( any_id '=' expr | any_id '=' fncall );
	public final SneakersParser.assignment_return assignment() throws RecognitionException {
		SneakersParser.assignment_return retval = new SneakersParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal5=null;
		Token char_literal8=null;
		ParserRuleReturnScope any_id4 =null;
		ParserRuleReturnScope expr6 =null;
		ParserRuleReturnScope any_id7 =null;
		ParserRuleReturnScope fncall9 =null;

		Object char_literal5_tree=null;
		Object char_literal8_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "assignment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:15:2: ( any_id '=' expr | any_id '=' fncall )
			int alt2=2;
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:15:4: any_id '=' expr
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(15,4);
					pushFollow(FOLLOW_any_id_in_assignment59);
					any_id4=any_id();
					state._fsp--;

					adaptor.addChild(root_0, any_id4.getTree());
					dbg.location(15,11);
					char_literal5=(Token)match(input,17,FOLLOW_17_in_assignment61); 
					char_literal5_tree = (Object)adaptor.create(char_literal5);
					adaptor.addChild(root_0, char_literal5_tree);
					dbg.location(15,15);
					pushFollow(FOLLOW_expr_in_assignment63);
					expr6=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr6.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:16:4: any_id '=' fncall
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(16,4);
					pushFollow(FOLLOW_any_id_in_assignment68);
					any_id7=any_id();
					state._fsp--;

					adaptor.addChild(root_0, any_id7.getTree());
					dbg.location(16,11);
					char_literal8=(Token)match(input,17,FOLLOW_17_in_assignment70); 
					char_literal8_tree = (Object)adaptor.create(char_literal8);
					adaptor.addChild(root_0, char_literal8_tree);
					dbg.location(16,15);
					pushFollow(FOLLOW_fncall_in_assignment72);
					fncall9=fncall();
					state._fsp--;

					adaptor.addChild(root_0, fncall9.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(17, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assignment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "assignment"


	public static class defable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defable"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:20:1: defable : ( TYPEID | fndecl ( stat )+ );
	public final SneakersParser.defable_return defable() throws RecognitionException {
		SneakersParser.defable_return retval = new SneakersParser.defable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TYPEID10=null;
		ParserRuleReturnScope fndecl11 =null;
		ParserRuleReturnScope stat12 =null;

		Object TYPEID10_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "defable");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:20:9: ( TYPEID | fndecl ( stat )+ )
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==TYPEID) ) {
				alt4=1;
			}
			else if ( (LA4_0==10) ) {
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:20:11: TYPEID
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(20,11);
					TYPEID10=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_defable83); 
					TYPEID10_tree = (Object)adaptor.create(TYPEID10);
					adaptor.addChild(root_0, TYPEID10_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:4: fndecl ( stat )+
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(21,4);
					pushFollow(FOLLOW_fndecl_in_defable88);
					fndecl11=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl11.getTree());
					dbg.location(21,11);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:11: ( stat )+
					int cnt3=0;
					try { dbg.enterSubRule(3);

					loop3:
					while (true) {
						int alt3=2;
						try { dbg.enterDecision(3, decisionCanBacktrack[3]);

						int LA3_0 = input.LA(1);
						if ( (LA3_0==ID||LA3_0==TYPEID) ) {
							alt3=1;
						}

						} finally {dbg.exitDecision(3);}

						switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:21:11: stat
							{
							dbg.location(21,11);
							pushFollow(FOLLOW_stat_in_defable90);
							stat12=stat();
							state._fsp--;

							adaptor.addChild(root_0, stat12.getTree());

							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt3++;
					}
					} finally {dbg.exitSubRule(3);}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(22, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "defable");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "defable"


	public static class defdecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "defdecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:24:1: defdecl : KEYWORD '=>' defable ;
	public final SneakersParser.defdecl_return defdecl() throws RecognitionException {
		SneakersParser.defdecl_return retval = new SneakersParser.defdecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token KEYWORD13=null;
		Token string_literal14=null;
		ParserRuleReturnScope defable15 =null;

		Object KEYWORD13_tree=null;
		Object string_literal14_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "defdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:24:9: ( KEYWORD '=>' defable )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:24:11: KEYWORD '=>' defable
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(24,11);
			KEYWORD13=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_defdecl101); 
			KEYWORD13_tree = (Object)adaptor.create(KEYWORD13);
			adaptor.addChild(root_0, KEYWORD13_tree);
			dbg.location(24,19);
			string_literal14=(Token)match(input,18,FOLLOW_18_in_defdecl103); 
			string_literal14_tree = (Object)adaptor.create(string_literal14);
			adaptor.addChild(root_0, string_literal14_tree);
			dbg.location(24,24);
			pushFollow(FOLLOW_defable_in_defdecl105);
			defable15=defable();
			state._fsp--;

			adaptor.addChild(root_0, defable15.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(25, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "defdecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "defdecl"


	public static class nested_id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nested_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:28:1: nested_id : any_id ( '.' any_id )* ;
	public final SneakersParser.nested_id_return nested_id() throws RecognitionException {
		SneakersParser.nested_id_return retval = new SneakersParser.nested_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal17=null;
		ParserRuleReturnScope any_id16 =null;
		ParserRuleReturnScope any_id18 =null;

		Object char_literal17_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "nested_id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:2: ( any_id ( '.' any_id )* )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:4: any_id ( '.' any_id )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(29,4);
			pushFollow(FOLLOW_any_id_in_nested_id118);
			any_id16=any_id();
			state._fsp--;

			adaptor.addChild(root_0, any_id16.getTree());
			dbg.location(29,11);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:11: ( '.' any_id )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==14) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:12: '.' any_id
					{
					dbg.location(29,12);
					char_literal17=(Token)match(input,14,FOLLOW_14_in_nested_id121); 
					char_literal17_tree = (Object)adaptor.create(char_literal17);
					adaptor.addChild(root_0, char_literal17_tree);
					dbg.location(29,16);
					pushFollow(FOLLOW_any_id_in_nested_id123);
					any_id18=any_id();
					state._fsp--;

					adaptor.addChild(root_0, any_id18.getTree());

					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(30, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "nested_id");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "nested_id"


	public static class fnname_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fnname"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:32:1: fnname : ( nested_id | KEYWORD );
	public final SneakersParser.fnname_return fnname() throws RecognitionException {
		SneakersParser.fnname_return retval = new SneakersParser.fnname_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token KEYWORD20=null;
		ParserRuleReturnScope nested_id19 =null;

		Object KEYWORD20_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "fnname");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(32, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:32:8: ( nested_id | KEYWORD )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID||LA6_0==TYPEID) ) {
				alt6=1;
			}
			else if ( (LA6_0==KEYWORD) ) {
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:32:10: nested_id
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(32,10);
					pushFollow(FOLLOW_nested_id_in_fnname136);
					nested_id19=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id19.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:33:4: KEYWORD
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(33,4);
					KEYWORD20=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_fnname141); 
					KEYWORD20_tree = (Object)adaptor.create(KEYWORD20);
					adaptor.addChild(root_0, KEYWORD20_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(34, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fnname");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fnname"


	public static class fncall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fncall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:36:1: fncall : fnname ( param )+ ;
	public final SneakersParser.fncall_return fncall() throws RecognitionException {
		SneakersParser.fncall_return retval = new SneakersParser.fncall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope fnname21 =null;
		ParserRuleReturnScope param22 =null;


		try { dbg.enterRule(getGrammarFileName(), "fncall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:36:8: ( fnname ( param )+ )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:36:10: fnname ( param )+
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(36,10);
			pushFollow(FOLLOW_fnname_in_fncall151);
			fnname21=fnname();
			state._fsp--;

			adaptor.addChild(root_0, fnname21.getTree());
			dbg.location(36,17);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:36:17: ( param )+
			int cnt7=0;
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= ID && LA7_0 <= TYPEID)||LA7_0==10||LA7_0==19) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:36:17: param
					{
					dbg.location(36,17);
					pushFollow(FOLLOW_param_in_fncall153);
					param22=param();
					state._fsp--;

					adaptor.addChild(root_0, param22.getTree());

					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt7++;
			}
			} finally {dbg.exitSubRule(7);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(37, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fncall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fncall"


	public static class param_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:39:1: param : ( ID ':' expr | expr );
	public final SneakersParser.param_return param() throws RecognitionException {
		SneakersParser.param_return retval = new SneakersParser.param_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID23=null;
		Token char_literal24=null;
		ParserRuleReturnScope expr25 =null;
		ParserRuleReturnScope expr26 =null;

		Object ID23_tree=null;
		Object char_literal24_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "param");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:39:7: ( ID ':' expr | expr )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==15) ) {
					alt8=1;
				}
				else if ( ((LA8_1 >= ID && LA8_1 <= TYPEID)||(LA8_1 >= 10 && LA8_1 <= 11)||LA8_1==14||LA8_1==16||LA8_1==19) ) {
					alt8=2;
				}

				else {
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
			else if ( ((LA8_0 >= INT && LA8_0 <= TYPEID)||LA8_0==10||LA8_0==19) ) {
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:39:9: ID ':' expr
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(39,9);
					ID23=(Token)match(input,ID,FOLLOW_ID_in_param164); 
					ID23_tree = (Object)adaptor.create(ID23);
					adaptor.addChild(root_0, ID23_tree);
					dbg.location(39,12);
					char_literal24=(Token)match(input,15,FOLLOW_15_in_param166); 
					char_literal24_tree = (Object)adaptor.create(char_literal24);
					adaptor.addChild(root_0, char_literal24_tree);
					dbg.location(39,16);
					pushFollow(FOLLOW_expr_in_param168);
					expr25=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr25.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:40:4: expr
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(40,4);
					pushFollow(FOLLOW_expr_in_param173);
					expr26=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr26.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "param");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "param"


	public static class fnparam_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fnparam"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:1: fnparam : ID ( ':' TYPEID )? ;
	public final SneakersParser.fnparam_return fnparam() throws RecognitionException {
		SneakersParser.fnparam_return retval = new SneakersParser.fnparam_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID27=null;
		Token char_literal28=null;
		Token TYPEID29=null;

		Object ID27_tree=null;
		Object char_literal28_tree=null;
		Object TYPEID29_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "fnparam");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:9: ( ID ( ':' TYPEID )? )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:11: ID ( ':' TYPEID )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(43,11);
			ID27=(Token)match(input,ID,FOLLOW_ID_in_fnparam183); 
			ID27_tree = (Object)adaptor.create(ID27);
			adaptor.addChild(root_0, ID27_tree);
			dbg.location(43,14);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:14: ( ':' TYPEID )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==15) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:15: ':' TYPEID
					{
					dbg.location(43,15);
					char_literal28=(Token)match(input,15,FOLLOW_15_in_fnparam186); 
					char_literal28_tree = (Object)adaptor.create(char_literal28);
					adaptor.addChild(root_0, char_literal28_tree);
					dbg.location(43,19);
					TYPEID29=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_fnparam188); 
					TYPEID29_tree = (Object)adaptor.create(TYPEID29);
					adaptor.addChild(root_0, TYPEID29_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(44, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fnparam");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fnparam"


	public static class fndecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fndecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:1: fndecl : '(' ( fnparam )* ')' ( ':' TYPEID )? '->' ;
	public final SneakersParser.fndecl_return fndecl() throws RecognitionException {
		SneakersParser.fndecl_return retval = new SneakersParser.fndecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal30=null;
		Token char_literal32=null;
		Token char_literal33=null;
		Token TYPEID34=null;
		Token string_literal35=null;
		ParserRuleReturnScope fnparam31 =null;

		Object char_literal30_tree=null;
		Object char_literal32_tree=null;
		Object char_literal33_tree=null;
		Object TYPEID34_tree=null;
		Object string_literal35_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "fndecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:8: ( '(' ( fnparam )* ')' ( ':' TYPEID )? '->' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:10: '(' ( fnparam )* ')' ( ':' TYPEID )? '->'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(46,10);
			char_literal30=(Token)match(input,10,FOLLOW_10_in_fndecl200); 
			char_literal30_tree = (Object)adaptor.create(char_literal30);
			adaptor.addChild(root_0, char_literal30_tree);
			dbg.location(46,14);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:14: ( fnparam )*
			try { dbg.enterSubRule(10);

			loop10:
			while (true) {
				int alt10=2;
				try { dbg.enterDecision(10, decisionCanBacktrack[10]);

				int LA10_0 = input.LA(1);
				if ( (LA10_0==ID) ) {
					alt10=1;
				}

				} finally {dbg.exitDecision(10);}

				switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:14: fnparam
					{
					dbg.location(46,14);
					pushFollow(FOLLOW_fnparam_in_fndecl202);
					fnparam31=fnparam();
					state._fsp--;

					adaptor.addChild(root_0, fnparam31.getTree());

					}
					break;

				default :
					break loop10;
				}
			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(46,23);
			char_literal32=(Token)match(input,11,FOLLOW_11_in_fndecl205); 
			char_literal32_tree = (Object)adaptor.create(char_literal32);
			adaptor.addChild(root_0, char_literal32_tree);
			dbg.location(46,27);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:27: ( ':' TYPEID )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==15) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:28: ':' TYPEID
					{
					dbg.location(46,28);
					char_literal33=(Token)match(input,15,FOLLOW_15_in_fndecl208); 
					char_literal33_tree = (Object)adaptor.create(char_literal33);
					adaptor.addChild(root_0, char_literal33_tree);
					dbg.location(46,32);
					TYPEID34=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_fndecl210); 
					TYPEID34_tree = (Object)adaptor.create(TYPEID34);
					adaptor.addChild(root_0, TYPEID34_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(46,41);
			string_literal35=(Token)match(input,13,FOLLOW_13_in_fndecl214); 
			string_literal35_tree = (Object)adaptor.create(string_literal35);
			adaptor.addChild(root_0, string_literal35_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(47, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fndecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fndecl"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:1: expr : ( INT | KEYWORD | STRING | dict | nested_id | fndecl | standalone_fncall );
	public final SneakersParser.expr_return expr() throws RecognitionException {
		SneakersParser.expr_return retval = new SneakersParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT36=null;
		Token KEYWORD37=null;
		Token STRING38=null;
		ParserRuleReturnScope dict39 =null;
		ParserRuleReturnScope nested_id40 =null;
		ParserRuleReturnScope fndecl41 =null;
		ParserRuleReturnScope standalone_fncall42 =null;

		Object INT36_tree=null;
		Object KEYWORD37_tree=null;
		Object STRING38_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:6: ( INT | KEYWORD | STRING | dict | nested_id | fndecl | standalone_fncall )
			int alt12=7;
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			try {
				isCyclicDecision = true;
				alt12 = dfa12.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:8: INT
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(49,8);
					INT36=(Token)match(input,INT,FOLLOW_INT_in_expr224); 
					INT36_tree = (Object)adaptor.create(INT36);
					adaptor.addChild(root_0, INT36_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:50:4: KEYWORD
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(50,4);
					KEYWORD37=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_expr229); 
					KEYWORD37_tree = (Object)adaptor.create(KEYWORD37);
					adaptor.addChild(root_0, KEYWORD37_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:4: STRING
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(51,4);
					STRING38=(Token)match(input,STRING,FOLLOW_STRING_in_expr234); 
					STRING38_tree = (Object)adaptor.create(STRING38);
					adaptor.addChild(root_0, STRING38_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:52:4: dict
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(52,4);
					pushFollow(FOLLOW_dict_in_expr239);
					dict39=dict();
					state._fsp--;

					adaptor.addChild(root_0, dict39.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:4: nested_id
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(53,4);
					pushFollow(FOLLOW_nested_id_in_expr244);
					nested_id40=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id40.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:54:4: fndecl
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(54,4);
					pushFollow(FOLLOW_fndecl_in_expr249);
					fndecl41=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl41.getTree());

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:55:4: standalone_fncall
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(55,4);
					pushFollow(FOLLOW_standalone_fncall_in_expr254);
					standalone_fncall42=standalone_fncall();
					state._fsp--;

					adaptor.addChild(root_0, standalone_fncall42.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(57, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expr"


	public static class standalone_fncall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "standalone_fncall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:59:1: standalone_fncall : '(' fncall ')' ;
	public final SneakersParser.standalone_fncall_return standalone_fncall() throws RecognitionException {
		SneakersParser.standalone_fncall_return retval = new SneakersParser.standalone_fncall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal43=null;
		Token char_literal45=null;
		ParserRuleReturnScope fncall44 =null;

		Object char_literal43_tree=null;
		Object char_literal45_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "standalone_fncall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(59, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:60:2: ( '(' fncall ')' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:60:4: '(' fncall ')'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(60,4);
			char_literal43=(Token)match(input,10,FOLLOW_10_in_standalone_fncall266); 
			char_literal43_tree = (Object)adaptor.create(char_literal43);
			adaptor.addChild(root_0, char_literal43_tree);
			dbg.location(60,8);
			pushFollow(FOLLOW_fncall_in_standalone_fncall268);
			fncall44=fncall();
			state._fsp--;

			adaptor.addChild(root_0, fncall44.getTree());
			dbg.location(60,15);
			char_literal45=(Token)match(input,11,FOLLOW_11_in_standalone_fncall270); 
			char_literal45_tree = (Object)adaptor.create(char_literal45);
			adaptor.addChild(root_0, char_literal45_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(61, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "standalone_fncall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "standalone_fncall"


	public static class index_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:1: index_expr : ( KEYWORD | INT | STRING | nested_id | standalone_fncall );
	public final SneakersParser.index_expr_return index_expr() throws RecognitionException {
		SneakersParser.index_expr_return retval = new SneakersParser.index_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token KEYWORD46=null;
		Token INT47=null;
		Token STRING48=null;
		ParserRuleReturnScope nested_id49 =null;
		ParserRuleReturnScope standalone_fncall50 =null;

		Object KEYWORD46_tree=null;
		Object INT47_tree=null;
		Object STRING48_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "index_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:2: ( KEYWORD | INT | STRING | nested_id | standalone_fncall )
			int alt13=5;
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			switch ( input.LA(1) ) {
			case KEYWORD:
				{
				alt13=1;
				}
				break;
			case INT:
				{
				alt13=2;
				}
				break;
			case STRING:
				{
				alt13=3;
				}
				break;
			case ID:
			case TYPEID:
				{
				alt13=4;
				}
				break;
			case 10:
				{
				alt13=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:4: KEYWORD
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(64,4);
					KEYWORD46=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_index_expr282); 
					KEYWORD46_tree = (Object)adaptor.create(KEYWORD46);
					adaptor.addChild(root_0, KEYWORD46_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:4: INT
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(65,4);
					INT47=(Token)match(input,INT,FOLLOW_INT_in_index_expr287); 
					INT47_tree = (Object)adaptor.create(INT47);
					adaptor.addChild(root_0, INT47_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:4: STRING
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(66,4);
					STRING48=(Token)match(input,STRING,FOLLOW_STRING_in_index_expr292); 
					STRING48_tree = (Object)adaptor.create(STRING48);
					adaptor.addChild(root_0, STRING48_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:4: nested_id
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(67,4);
					pushFollow(FOLLOW_nested_id_in_index_expr297);
					nested_id49=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id49.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:68:4: standalone_fncall
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(68,4);
					pushFollow(FOLLOW_standalone_fncall_in_index_expr302);
					standalone_fncall50=standalone_fncall();
					state._fsp--;

					adaptor.addChild(root_0, standalone_fncall50.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(69, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "index_expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "index_expr"


	public static class dict_pair_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dict_pair"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:71:1: dict_pair : index_expr '=>' expr ;
	public final SneakersParser.dict_pair_return dict_pair() throws RecognitionException {
		SneakersParser.dict_pair_return retval = new SneakersParser.dict_pair_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal52=null;
		ParserRuleReturnScope index_expr51 =null;
		ParserRuleReturnScope expr53 =null;

		Object string_literal52_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dict_pair");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:2: ( index_expr '=>' expr )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:4: index_expr '=>' expr
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(72,4);
			pushFollow(FOLLOW_index_expr_in_dict_pair314);
			index_expr51=index_expr();
			state._fsp--;

			adaptor.addChild(root_0, index_expr51.getTree());
			dbg.location(72,15);
			string_literal52=(Token)match(input,18,FOLLOW_18_in_dict_pair316); 
			string_literal52_tree = (Object)adaptor.create(string_literal52);
			adaptor.addChild(root_0, string_literal52_tree);
			dbg.location(72,20);
			pushFollow(FOLLOW_expr_in_dict_pair318);
			expr53=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr53.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(73, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dict_pair");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "dict_pair"


	public static class dict_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dict"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:1: dict : '{' ( dict_pair )? ( ',' dict_pair )* '}' ;
	public final SneakersParser.dict_return dict() throws RecognitionException {
		SneakersParser.dict_return retval = new SneakersParser.dict_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal54=null;
		Token char_literal56=null;
		Token char_literal58=null;
		ParserRuleReturnScope dict_pair55 =null;
		ParserRuleReturnScope dict_pair57 =null;

		Object char_literal54_tree=null;
		Object char_literal56_tree=null;
		Object char_literal58_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dict");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:6: ( '{' ( dict_pair )? ( ',' dict_pair )* '}' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:8: '{' ( dict_pair )? ( ',' dict_pair )* '}'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(75,8);
			char_literal54=(Token)match(input,19,FOLLOW_19_in_dict328); 
			char_literal54_tree = (Object)adaptor.create(char_literal54);
			adaptor.addChild(root_0, char_literal54_tree);
			dbg.location(75,12);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:12: ( dict_pair )?
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= ID && LA14_0 <= TYPEID)||LA14_0==10) ) {
				alt14=1;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:13: dict_pair
					{
					dbg.location(75,13);
					pushFollow(FOLLOW_dict_pair_in_dict331);
					dict_pair55=dict_pair();
					state._fsp--;

					adaptor.addChild(root_0, dict_pair55.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(14);}
			dbg.location(75,25);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:25: ( ',' dict_pair )*
			try { dbg.enterSubRule(15);

			loop15:
			while (true) {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( (LA15_0==12) ) {
					alt15=1;
				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:26: ',' dict_pair
					{
					dbg.location(75,26);
					char_literal56=(Token)match(input,12,FOLLOW_12_in_dict336); 
					char_literal56_tree = (Object)adaptor.create(char_literal56);
					adaptor.addChild(root_0, char_literal56_tree);
					dbg.location(75,30);
					pushFollow(FOLLOW_dict_pair_in_dict338);
					dict_pair57=dict_pair();
					state._fsp--;

					adaptor.addChild(root_0, dict_pair57.getTree());

					}
					break;

				default :
					break loop15;
				}
			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(75,42);
			char_literal58=(Token)match(input,20,FOLLOW_20_in_dict342); 
			char_literal58_tree = (Object)adaptor.create(char_literal58);
			adaptor.addChild(root_0, char_literal58_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(76, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dict");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "dict"


	public static class any_id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "any_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:1: any_id : ( ID | TYPEID );
	public final SneakersParser.any_id_return any_id() throws RecognitionException {
		SneakersParser.any_id_return retval = new SneakersParser.any_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set59=null;

		Object set59_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "any_id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(90, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:2: ( ID | TYPEID )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(91,2);
			set59=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==TYPEID ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set59));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(93, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "any_id");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "any_id"

	// Delegated rules


	protected DFA2 dfa2 = new DFA2(this);
	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA2_eotS =
		"\11\uffff";
	static final String DFA2_eofS =
		"\11\uffff";
	static final String DFA2_minS =
		"\1\4\1\21\1\4\1\uffff\2\4\1\uffff\2\4";
	static final String DFA2_maxS =
		"\1\10\1\21\1\23\1\uffff\2\23\1\uffff\1\10\1\23";
	static final String DFA2_acceptS =
		"\3\uffff\1\1\2\uffff\1\2\2\uffff";
	static final String DFA2_specialS =
		"\11\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\1\3\uffff\1\1",
			"\1\2",
			"\1\5\1\3\1\4\1\3\1\5\1\uffff\1\3\10\uffff\1\3",
			"",
			"\5\6\1\uffff\1\6\5\uffff\1\3\2\uffff\1\6",
			"\5\6\1\uffff\1\6\3\uffff\1\7\1\uffff\1\3\2\uffff\1\6",
			"",
			"\1\10\3\uffff\1\10",
			"\5\6\1\uffff\1\6\3\uffff\1\7\1\uffff\1\3\2\uffff\1\6"
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
			return "14:1: assignment : ( any_id '=' expr | any_id '=' fncall );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA12_eotS =
		"\16\uffff";
	static final String DFA12_eofS =
		"\16\uffff";
	static final String DFA12_minS =
		"\1\4\5\uffff\2\4\2\uffff\4\4";
	static final String DFA12_maxS =
		"\1\23\5\uffff\1\13\1\23\2\uffff\2\23\1\24\1\23";
	static final String DFA12_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\6\1\7\4\uffff";
	static final String DFA12_specialS =
		"\16\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\5\1\1\1\2\1\3\1\5\1\uffff\1\6\10\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"\1\7\1\uffff\1\11\1\uffff\1\11\2\uffff\1\10",
			"\1\12\4\11\1\uffff\1\11\1\10\2\uffff\1\11\1\10\3\uffff\1\11",
			"",
			"",
			"\1\12\4\11\1\uffff\1\11\1\14\2\uffff\1\11\1\13\3\uffff\1\11",
			"\4\11\1\15\1\uffff\1\11\10\uffff\1\11",
			"\5\11\1\uffff\3\11\1\10\1\uffff\1\10\1\11\2\uffff\2\11",
			"\1\12\4\11\1\uffff\1\11\1\14\2\uffff\1\11\4\uffff\1\11"
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "49:1: expr : ( INT | KEYWORD | STRING | dict | nested_id | fndecl | standalone_fncall );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_stat_in_prog37 = new BitSet(new long[]{0x0000000000000112L});
	public static final BitSet FOLLOW_assignment_in_stat46 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stat48 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment59 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_assignment61 = new BitSet(new long[]{0x00000000000805F0L});
	public static final BitSet FOLLOW_expr_in_assignment63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment68 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_assignment70 = new BitSet(new long[]{0x0000000000000150L});
	public static final BitSet FOLLOW_fncall_in_assignment72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_defable83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_defable88 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_stat_in_defable90 = new BitSet(new long[]{0x0000000000000112L});
	public static final BitSet FOLLOW_KEYWORD_in_defdecl101 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_defdecl103 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_defable_in_defdecl105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_nested_id118 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_nested_id121 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_any_id_in_nested_id123 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_nested_id_in_fnname136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_fnname141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fnname_in_fncall151 = new BitSet(new long[]{0x00000000000805F0L});
	public static final BitSet FOLLOW_param_in_fncall153 = new BitSet(new long[]{0x00000000000805F2L});
	public static final BitSet FOLLOW_ID_in_param164 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_param166 = new BitSet(new long[]{0x00000000000805F0L});
	public static final BitSet FOLLOW_expr_in_param168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_param173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fnparam183 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_fnparam186 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TYPEID_in_fnparam188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_fndecl200 = new BitSet(new long[]{0x0000000000000810L});
	public static final BitSet FOLLOW_fnparam_in_fndecl202 = new BitSet(new long[]{0x0000000000000810L});
	public static final BitSet FOLLOW_11_in_fndecl205 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_15_in_fndecl208 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_TYPEID_in_fndecl210 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_fndecl214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_expr229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_expr234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_expr244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_expr249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standalone_fncall_in_expr254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_standalone_fncall266 = new BitSet(new long[]{0x0000000000000150L});
	public static final BitSet FOLLOW_fncall_in_standalone_fncall268 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_standalone_fncall270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_index_expr282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_index_expr287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_index_expr292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_index_expr297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standalone_fncall_in_index_expr302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_dict_pair314 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_dict_pair316 = new BitSet(new long[]{0x00000000000805F0L});
	public static final BitSet FOLLOW_expr_in_dict_pair318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_dict328 = new BitSet(new long[]{0x00000000001015F0L});
	public static final BitSet FOLLOW_dict_pair_in_dict331 = new BitSet(new long[]{0x0000000000101000L});
	public static final BitSet FOLLOW_12_in_dict336 = new BitSet(new long[]{0x00000000000005F0L});
	public static final BitSet FOLLOW_dict_pair_in_dict338 = new BitSet(new long[]{0x0000000000101000L});
	public static final BitSet FOLLOW_20_in_dict342 = new BitSet(new long[]{0x0000000000000002L});
}
