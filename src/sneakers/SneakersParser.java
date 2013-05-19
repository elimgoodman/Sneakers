// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-19 10:59:07
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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANONVAR", "BLOCK", "FNCALL", 
		"ID", "INT", "KEYWORD", "MUTID", "STRING", "TYPEID", "WS", "'#'", "'('", 
		"')'", "','", "'.'", "':'", "';'", "'<'", "'='", "'=>'", "'>'", "'@'", 
		"'['", "']'", "'else'", "'elseif'", "'if'", "'pass'", "'return'", "'{'", 
		"'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int ANONVAR=4;
	public static final int BLOCK=5;
	public static final int FNCALL=6;
	public static final int ID=7;
	public static final int INT=8;
	public static final int KEYWORD=9;
	public static final int MUTID=10;
	public static final int STRING=11;
	public static final int TYPEID=12;
	public static final int WS=13;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "array", "mutdecl", "index_expr", "block", "standalone_fncall", 
		"paramtype", "defable", "blockdecl", "dict", "anonfn", "stat", "mutcall", 
		"fndecl", "dict_pair", "prog", "contained_block", "any_id", "fnparam", 
		"defdecl", "param", "expr", "nested_id", "ifstat", "fncall", "assignment"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:9:1: prog : block ;
	public final SneakersParser.prog_return prog() throws RecognitionException {
		SneakersParser.prog_return retval = new SneakersParser.prog_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope block1 =null;


		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(9, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:9:6: ( block )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:9:8: block
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(9,8);
			pushFollow(FOLLOW_block_in_prog42);
			block1=block();
			state._fsp--;

			adaptor.addChild(root_0, block1.getTree());

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
		dbg.location(10, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "prog"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:1: block : ( stat ';' )+ -> ^( BLOCK ( stat )+ ) ;
	public final SneakersParser.block_return block() throws RecognitionException {
		SneakersParser.block_return retval = new SneakersParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal3=null;
		ParserRuleReturnScope stat2 =null;

		Object char_literal3_tree=null;
		RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:8: ( ( stat ';' )+ -> ^( BLOCK ( stat )+ ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:10: ( stat ';' )+
			{
			dbg.location(12,10);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:10: ( stat ';' )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==MUTID||LA1_0==TYPEID||LA1_0==21||(LA1_0 >= 30 && LA1_0 <= 32)) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:11: stat ';'
					{
					dbg.location(12,11);
					pushFollow(FOLLOW_stat_in_block54);
					stat2=stat();
					state._fsp--;

					stream_stat.add(stat2.getTree());dbg.location(12,16);
					char_literal3=(Token)match(input,20,FOLLOW_20_in_block56);  
					stream_20.add(char_literal3);

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

			// AST REWRITE
			// elements: stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 12:22: -> ^( BLOCK ( stat )+ )
			{
				dbg.location(12,25);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:25: ^( BLOCK ( stat )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(12,27);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				dbg.location(12,33);
				if ( !(stream_stat.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_stat.hasNext() ) {
					dbg.location(12,33);
					adaptor.addChild(root_1, stream_stat.nextTree());
				}
				stream_stat.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
		dbg.location(12, 38);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "block"


	public static class stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:1: stat : ( assignment | ifstat | 'return' fncall | 'return' expr | mutcall | 'pass' );
	public final SneakersParser.stat_return stat() throws RecognitionException {
		SneakersParser.stat_return retval = new SneakersParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal6=null;
		Token string_literal8=null;
		Token string_literal11=null;
		ParserRuleReturnScope assignment4 =null;
		ParserRuleReturnScope ifstat5 =null;
		ParserRuleReturnScope fncall7 =null;
		ParserRuleReturnScope expr9 =null;
		ParserRuleReturnScope mutcall10 =null;

		Object string_literal6_tree=null;
		Object string_literal8_tree=null;
		Object string_literal11_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:6: ( assignment | ifstat | 'return' fncall | 'return' expr | mutcall | 'pass' )
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:8: assignment
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(14,8);
					pushFollow(FOLLOW_assignment_in_stat75);
					assignment4=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment4.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:15:4: ifstat
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(15,4);
					pushFollow(FOLLOW_ifstat_in_stat80);
					ifstat5=ifstat();
					state._fsp--;

					adaptor.addChild(root_0, ifstat5.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:16:4: 'return' fncall
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(16,4);
					string_literal6=(Token)match(input,32,FOLLOW_32_in_stat85); 
					string_literal6_tree = (Object)adaptor.create(string_literal6);
					adaptor.addChild(root_0, string_literal6_tree);
					dbg.location(16,13);
					pushFollow(FOLLOW_fncall_in_stat87);
					fncall7=fncall();
					state._fsp--;

					adaptor.addChild(root_0, fncall7.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:17:4: 'return' expr
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(17,4);
					string_literal8=(Token)match(input,32,FOLLOW_32_in_stat92); 
					string_literal8_tree = (Object)adaptor.create(string_literal8);
					adaptor.addChild(root_0, string_literal8_tree);
					dbg.location(17,13);
					pushFollow(FOLLOW_expr_in_stat94);
					expr9=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr9.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:18:4: mutcall
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(18,4);
					pushFollow(FOLLOW_mutcall_in_stat99);
					mutcall10=mutcall();
					state._fsp--;

					adaptor.addChild(root_0, mutcall10.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:19:4: 'pass'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(19,4);
					string_literal11=(Token)match(input,31,FOLLOW_31_in_stat104); 
					string_literal11_tree = (Object)adaptor.create(string_literal11);
					adaptor.addChild(root_0, string_literal11_tree);

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
		dbg.location(20, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "stat"


	public static class ifstat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifstat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:1: ifstat : 'if' expr contained_block ( 'elseif' expr contained_block )* ( 'else' contained_block )? ;
	public final SneakersParser.ifstat_return ifstat() throws RecognitionException {
		SneakersParser.ifstat_return retval = new SneakersParser.ifstat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal12=null;
		Token string_literal15=null;
		Token string_literal18=null;
		ParserRuleReturnScope expr13 =null;
		ParserRuleReturnScope contained_block14 =null;
		ParserRuleReturnScope expr16 =null;
		ParserRuleReturnScope contained_block17 =null;
		ParserRuleReturnScope contained_block19 =null;

		Object string_literal12_tree=null;
		Object string_literal15_tree=null;
		Object string_literal18_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "ifstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(22, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:8: ( 'if' expr contained_block ( 'elseif' expr contained_block )* ( 'else' contained_block )? )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:10: 'if' expr contained_block ( 'elseif' expr contained_block )* ( 'else' contained_block )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(22,10);
			string_literal12=(Token)match(input,30,FOLLOW_30_in_ifstat114); 
			string_literal12_tree = (Object)adaptor.create(string_literal12);
			adaptor.addChild(root_0, string_literal12_tree);
			dbg.location(22,15);
			pushFollow(FOLLOW_expr_in_ifstat116);
			expr13=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr13.getTree());
			dbg.location(22,20);
			pushFollow(FOLLOW_contained_block_in_ifstat118);
			contained_block14=contained_block();
			state._fsp--;

			adaptor.addChild(root_0, contained_block14.getTree());
			dbg.location(22,36);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:36: ( 'elseif' expr contained_block )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==29) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:37: 'elseif' expr contained_block
					{
					dbg.location(22,37);
					string_literal15=(Token)match(input,29,FOLLOW_29_in_ifstat121); 
					string_literal15_tree = (Object)adaptor.create(string_literal15);
					adaptor.addChild(root_0, string_literal15_tree);
					dbg.location(22,46);
					pushFollow(FOLLOW_expr_in_ifstat123);
					expr16=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr16.getTree());
					dbg.location(22,51);
					pushFollow(FOLLOW_contained_block_in_ifstat125);
					contained_block17=contained_block();
					state._fsp--;

					adaptor.addChild(root_0, contained_block17.getTree());

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(22,69);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:69: ( 'else' contained_block )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==28) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:22:70: 'else' contained_block
					{
					dbg.location(22,70);
					string_literal18=(Token)match(input,28,FOLLOW_28_in_ifstat130); 
					string_literal18_tree = (Object)adaptor.create(string_literal18);
					adaptor.addChild(root_0, string_literal18_tree);
					dbg.location(22,77);
					pushFollow(FOLLOW_contained_block_in_ifstat132);
					contained_block19=contained_block();
					state._fsp--;

					adaptor.addChild(root_0, contained_block19.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

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
		dbg.location(22, 93);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ifstat"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:24:1: assignment : ( any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );
	public final SneakersParser.assignment_return assignment() throws RecognitionException {
		SneakersParser.assignment_return retval = new SneakersParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal21=null;
		Token char_literal24=null;
		ParserRuleReturnScope any_id20 =null;
		ParserRuleReturnScope expr22 =null;
		ParserRuleReturnScope any_id23 =null;
		ParserRuleReturnScope fncall25 =null;

		Object char_literal21_tree=null;
		Object char_literal24_tree=null;
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "assignment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:25:2: ( any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) )
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:25:4: any_id '=' expr
					{
					dbg.location(25,4);
					pushFollow(FOLLOW_any_id_in_assignment143);
					any_id20=any_id();
					state._fsp--;

					stream_any_id.add(any_id20.getTree());dbg.location(25,11);
					char_literal21=(Token)match(input,22,FOLLOW_22_in_assignment145);  
					stream_22.add(char_literal21);
					dbg.location(25,15);
					pushFollow(FOLLOW_expr_in_assignment147);
					expr22=expr();
					state._fsp--;

					stream_expr.add(expr22.getTree());
					// AST REWRITE
					// elements: any_id, 22, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 25:20: -> ^( '=' any_id expr )
					{
						dbg.location(25,23);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:25:23: ^( '=' any_id expr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(25,25);
						root_1 = (Object)adaptor.becomeRoot(stream_22.nextNode(), root_1);
						dbg.location(25,29);
						adaptor.addChild(root_1, stream_any_id.nextTree());dbg.location(25,36);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:26:4: any_id '=' fncall
					{
					dbg.location(26,4);
					pushFollow(FOLLOW_any_id_in_assignment162);
					any_id23=any_id();
					state._fsp--;

					stream_any_id.add(any_id23.getTree());dbg.location(26,11);
					char_literal24=(Token)match(input,22,FOLLOW_22_in_assignment164);  
					stream_22.add(char_literal24);
					dbg.location(26,15);
					pushFollow(FOLLOW_fncall_in_assignment166);
					fncall25=fncall();
					state._fsp--;

					stream_fncall.add(fncall25.getTree());
					// AST REWRITE
					// elements: 22, any_id, fncall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 26:22: -> ^( '=' any_id fncall )
					{
						dbg.location(26,25);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:26:25: ^( '=' any_id fncall )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(26,27);
						root_1 = (Object)adaptor.becomeRoot(stream_22.nextNode(), root_1);
						dbg.location(26,31);
						adaptor.addChild(root_1, stream_any_id.nextTree());dbg.location(26,38);
						adaptor.addChild(root_1, stream_fncall.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

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
		dbg.location(27, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:1: defable : ( TYPEID | fndecl ( stat )+ );
	public final SneakersParser.defable_return defable() throws RecognitionException {
		SneakersParser.defable_return retval = new SneakersParser.defable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TYPEID26=null;
		ParserRuleReturnScope fndecl27 =null;
		ParserRuleReturnScope stat28 =null;

		Object TYPEID26_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "defable");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:9: ( TYPEID | fndecl ( stat )+ )
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==TYPEID) ) {
				alt7=1;
			}
			else if ( (LA7_0==14) ) {
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:30:11: TYPEID
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(30,11);
					TYPEID26=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_defable187); 
					TYPEID26_tree = (Object)adaptor.create(TYPEID26);
					adaptor.addChild(root_0, TYPEID26_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:4: fndecl ( stat )+
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(31,4);
					pushFollow(FOLLOW_fndecl_in_defable192);
					fndecl27=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl27.getTree());
					dbg.location(31,11);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:11: ( stat )+
					int cnt6=0;
					try { dbg.enterSubRule(6);

					loop6:
					while (true) {
						int alt6=2;
						try { dbg.enterDecision(6, decisionCanBacktrack[6]);

						int LA6_0 = input.LA(1);
						if ( (LA6_0==ID||LA6_0==MUTID||LA6_0==TYPEID||LA6_0==21||(LA6_0 >= 30 && LA6_0 <= 32)) ) {
							alt6=1;
						}

						} finally {dbg.exitDecision(6);}

						switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:11: stat
							{
							dbg.location(31,11);
							pushFollow(FOLLOW_stat_in_defable194);
							stat28=stat();
							state._fsp--;

							adaptor.addChild(root_0, stat28.getTree());

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
		dbg.location(32, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:34:1: defdecl : KEYWORD '=>' defable ;
	public final SneakersParser.defdecl_return defdecl() throws RecognitionException {
		SneakersParser.defdecl_return retval = new SneakersParser.defdecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token KEYWORD29=null;
		Token string_literal30=null;
		ParserRuleReturnScope defable31 =null;

		Object KEYWORD29_tree=null;
		Object string_literal30_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "defdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:34:9: ( KEYWORD '=>' defable )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:34:11: KEYWORD '=>' defable
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(34,11);
			KEYWORD29=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_defdecl205); 
			KEYWORD29_tree = (Object)adaptor.create(KEYWORD29);
			adaptor.addChild(root_0, KEYWORD29_tree);
			dbg.location(34,19);
			string_literal30=(Token)match(input,23,FOLLOW_23_in_defdecl207); 
			string_literal30_tree = (Object)adaptor.create(string_literal30);
			adaptor.addChild(root_0, string_literal30_tree);
			dbg.location(34,24);
			pushFollow(FOLLOW_defable_in_defdecl209);
			defable31=defable();
			state._fsp--;

			adaptor.addChild(root_0, defable31.getTree());

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
		dbg.location(35, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:38:1: nested_id : ( ANONVAR ( '.' any_id )* -> ^( ID ANONVAR ( any_id )* ) | any_id ( '.' any_id )* -> ^( ID ( any_id )* ) );
	public final SneakersParser.nested_id_return nested_id() throws RecognitionException {
		SneakersParser.nested_id_return retval = new SneakersParser.nested_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ANONVAR32=null;
		Token char_literal33=null;
		Token char_literal36=null;
		ParserRuleReturnScope any_id34 =null;
		ParserRuleReturnScope any_id35 =null;
		ParserRuleReturnScope any_id37 =null;

		Object ANONVAR32_tree=null;
		Object char_literal33_tree=null;
		Object char_literal36_tree=null;
		RewriteRuleTokenStream stream_ANONVAR=new RewriteRuleTokenStream(adaptor,"token ANONVAR");
		RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");

		try { dbg.enterRule(getGrammarFileName(), "nested_id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:39:2: ( ANONVAR ( '.' any_id )* -> ^( ID ANONVAR ( any_id )* ) | any_id ( '.' any_id )* -> ^( ID ( any_id )* ) )
			int alt10=2;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==ANONVAR) ) {
				alt10=1;
			}
			else if ( (LA10_0==ID||LA10_0==MUTID||LA10_0==TYPEID) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:39:4: ANONVAR ( '.' any_id )*
					{
					dbg.location(39,4);
					ANONVAR32=(Token)match(input,ANONVAR,FOLLOW_ANONVAR_in_nested_id222);  
					stream_ANONVAR.add(ANONVAR32);
					dbg.location(39,12);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:39:12: ( '.' any_id )*
					try { dbg.enterSubRule(8);

					loop8:
					while (true) {
						int alt8=2;
						try { dbg.enterDecision(8, decisionCanBacktrack[8]);

						int LA8_0 = input.LA(1);
						if ( (LA8_0==18) ) {
							alt8=1;
						}

						} finally {dbg.exitDecision(8);}

						switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:39:13: '.' any_id
							{
							dbg.location(39,13);
							char_literal33=(Token)match(input,18,FOLLOW_18_in_nested_id225);  
							stream_18.add(char_literal33);
							dbg.location(39,17);
							pushFollow(FOLLOW_any_id_in_nested_id227);
							any_id34=any_id();
							state._fsp--;

							stream_any_id.add(any_id34.getTree());
							}
							break;

						default :
							break loop8;
						}
					}
					} finally {dbg.exitSubRule(8);}

					// AST REWRITE
					// elements: ANONVAR, any_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 39:26: -> ^( ID ANONVAR ( any_id )* )
					{
						dbg.location(39,29);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:39:29: ^( ID ANONVAR ( any_id )* )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(39,31);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID, "ID"), root_1);
						dbg.location(39,34);
						adaptor.addChild(root_1, stream_ANONVAR.nextNode());dbg.location(39,42);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:39:42: ( any_id )*
						while ( stream_any_id.hasNext() ) {
							dbg.location(39,42);
							adaptor.addChild(root_1, stream_any_id.nextTree());
						}
						stream_any_id.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:40:4: any_id ( '.' any_id )*
					{
					dbg.location(40,4);
					pushFollow(FOLLOW_any_id_in_nested_id245);
					any_id35=any_id();
					state._fsp--;

					stream_any_id.add(any_id35.getTree());dbg.location(40,11);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:40:11: ( '.' any_id )*
					try { dbg.enterSubRule(9);

					loop9:
					while (true) {
						int alt9=2;
						try { dbg.enterDecision(9, decisionCanBacktrack[9]);

						int LA9_0 = input.LA(1);
						if ( (LA9_0==18) ) {
							alt9=1;
						}

						} finally {dbg.exitDecision(9);}

						switch (alt9) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:40:12: '.' any_id
							{
							dbg.location(40,12);
							char_literal36=(Token)match(input,18,FOLLOW_18_in_nested_id248);  
							stream_18.add(char_literal36);
							dbg.location(40,16);
							pushFollow(FOLLOW_any_id_in_nested_id250);
							any_id37=any_id();
							state._fsp--;

							stream_any_id.add(any_id37.getTree());
							}
							break;

						default :
							break loop9;
						}
					}
					} finally {dbg.exitSubRule(9);}

					// AST REWRITE
					// elements: any_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 40:25: -> ^( ID ( any_id )* )
					{
						dbg.location(40,28);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:40:28: ^( ID ( any_id )* )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(40,30);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID, "ID"), root_1);
						dbg.location(40,33);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:40:33: ( any_id )*
						while ( stream_any_id.hasNext() ) {
							dbg.location(40,33);
							adaptor.addChild(root_1, stream_any_id.nextTree());
						}
						stream_any_id.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

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
			dbg.exitRule(getGrammarFileName(), "nested_id");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "nested_id"


	public static class fncall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fncall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:1: fncall : nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) ;
	public final SneakersParser.fncall_return fncall() throws RecognitionException {
		SneakersParser.fncall_return retval = new SneakersParser.fncall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal40=null;
		ParserRuleReturnScope nested_id38 =null;
		ParserRuleReturnScope param39 =null;
		ParserRuleReturnScope param41 =null;

		Object char_literal40_tree=null;
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try { dbg.enterRule(getGrammarFileName(), "fncall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:8: ( nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:10: nested_id param ( ( ',' )? param )*
			{
			dbg.location(43,10);
			pushFollow(FOLLOW_nested_id_in_fncall271);
			nested_id38=nested_id();
			state._fsp--;

			stream_nested_id.add(nested_id38.getTree());dbg.location(43,20);
			pushFollow(FOLLOW_param_in_fncall273);
			param39=param();
			state._fsp--;

			stream_param.add(param39.getTree());dbg.location(43,26);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:26: ( ( ',' )? param )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				switch ( input.LA(1) ) {
				case ID:
					{
					int LA12_2 = input.LA(2);
					if ( (LA12_2==EOF||LA12_2==ANONVAR||(LA12_2 >= ID && LA12_2 <= TYPEID)||(LA12_2 >= 14 && LA12_2 <= 21)||(LA12_2 >= 24 && LA12_2 <= 27)||(LA12_2 >= 30 && LA12_2 <= 33)) ) {
						alt12=1;
					}

					}
					break;
				case ANONVAR:
				case INT:
				case KEYWORD:
				case STRING:
				case 14:
				case 15:
				case 17:
				case 25:
				case 26:
				case 33:
					{
					alt12=1;
					}
					break;
				case MUTID:
				case TYPEID:
					{
					int LA12_4 = input.LA(2);
					if ( (LA12_4==EOF||LA12_4==ANONVAR||(LA12_4 >= ID && LA12_4 <= TYPEID)||(LA12_4 >= 14 && LA12_4 <= 18)||(LA12_4 >= 20 && LA12_4 <= 21)||(LA12_4 >= 24 && LA12_4 <= 27)||(LA12_4 >= 30 && LA12_4 <= 33)) ) {
						alt12=1;
					}

					}
					break;
				}
				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:27: ( ',' )? param
					{
					dbg.location(43,27);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:27: ( ',' )?
					int alt11=2;
					try { dbg.enterSubRule(11);
					try { dbg.enterDecision(11, decisionCanBacktrack[11]);

					int LA11_0 = input.LA(1);
					if ( (LA11_0==17) ) {
						alt11=1;
					}
					} finally {dbg.exitDecision(11);}

					switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:27: ','
							{
							dbg.location(43,27);
							char_literal40=(Token)match(input,17,FOLLOW_17_in_fncall276);  
							stream_17.add(char_literal40);

							}
							break;

					}
					} finally {dbg.exitSubRule(11);}
					dbg.location(43,32);
					pushFollow(FOLLOW_param_in_fncall279);
					param41=param();
					state._fsp--;

					stream_param.add(param41.getTree());
					}
					break;

				default :
					break loop12;
				}
			}
			} finally {dbg.exitSubRule(12);}

			// AST REWRITE
			// elements: nested_id, param
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 43:40: -> ^( FNCALL nested_id ( param )* )
			{
				dbg.location(43,43);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:43: ^( FNCALL nested_id ( param )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(43,45);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FNCALL, "FNCALL"), root_1);
				dbg.location(43,52);
				adaptor.addChild(root_1, stream_nested_id.nextTree());dbg.location(43,62);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:62: ( param )*
				while ( stream_param.hasNext() ) {
					dbg.location(43,62);
					adaptor.addChild(root_1, stream_param.nextTree());
				}
				stream_param.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:1: param : ( ID ':' expr | expr );
	public final SneakersParser.param_return param() throws RecognitionException {
		SneakersParser.param_return retval = new SneakersParser.param_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID42=null;
		Token char_literal43=null;
		ParserRuleReturnScope expr44 =null;
		ParserRuleReturnScope expr45 =null;

		Object ID42_tree=null;
		Object char_literal43_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "param");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:7: ( ID ':' expr | expr )
			int alt13=2;
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==ID) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==19) ) {
					alt13=1;
				}
				else if ( (LA13_1==EOF||LA13_1==ANONVAR||(LA13_1 >= ID && LA13_1 <= TYPEID)||(LA13_1 >= 14 && LA13_1 <= 18)||(LA13_1 >= 20 && LA13_1 <= 21)||(LA13_1 >= 24 && LA13_1 <= 27)||(LA13_1 >= 30 && LA13_1 <= 33)) ) {
					alt13=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA13_0==ANONVAR||(LA13_0 >= INT && LA13_0 <= TYPEID)||(LA13_0 >= 14 && LA13_0 <= 15)||(LA13_0 >= 25 && LA13_0 <= 26)||LA13_0==33) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:9: ID ':' expr
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(46,9);
					ID42=(Token)match(input,ID,FOLLOW_ID_in_param302); 
					ID42_tree = (Object)adaptor.create(ID42);
					adaptor.addChild(root_0, ID42_tree);
					dbg.location(46,12);
					char_literal43=(Token)match(input,19,FOLLOW_19_in_param304); 
					char_literal43_tree = (Object)adaptor.create(char_literal43);
					adaptor.addChild(root_0, char_literal43_tree);
					dbg.location(46,16);
					pushFollow(FOLLOW_expr_in_param306);
					expr44=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr44.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:47:4: expr
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(47,4);
					pushFollow(FOLLOW_expr_in_param311);
					expr45=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr45.getTree());

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
		dbg.location(48, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "param");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "param"


	public static class paramtype_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "paramtype"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:50:1: paramtype : ( TYPEID | '(' ( TYPEID )* ')' ':' TYPEID );
	public final SneakersParser.paramtype_return paramtype() throws RecognitionException {
		SneakersParser.paramtype_return retval = new SneakersParser.paramtype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TYPEID46=null;
		Token char_literal47=null;
		Token TYPEID48=null;
		Token char_literal49=null;
		Token char_literal50=null;
		Token TYPEID51=null;

		Object TYPEID46_tree=null;
		Object char_literal47_tree=null;
		Object TYPEID48_tree=null;
		Object char_literal49_tree=null;
		Object char_literal50_tree=null;
		Object TYPEID51_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "paramtype");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:50:11: ( TYPEID | '(' ( TYPEID )* ')' ':' TYPEID )
			int alt15=2;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==TYPEID) ) {
				alt15=1;
			}
			else if ( (LA15_0==15) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:50:14: TYPEID
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(50,14);
					TYPEID46=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype322); 
					TYPEID46_tree = (Object)adaptor.create(TYPEID46);
					adaptor.addChild(root_0, TYPEID46_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:4: '(' ( TYPEID )* ')' ':' TYPEID
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(51,4);
					char_literal47=(Token)match(input,15,FOLLOW_15_in_paramtype327); 
					char_literal47_tree = (Object)adaptor.create(char_literal47);
					adaptor.addChild(root_0, char_literal47_tree);
					dbg.location(51,8);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:8: ( TYPEID )*
					try { dbg.enterSubRule(14);

					loop14:
					while (true) {
						int alt14=2;
						try { dbg.enterDecision(14, decisionCanBacktrack[14]);

						int LA14_0 = input.LA(1);
						if ( (LA14_0==TYPEID) ) {
							alt14=1;
						}

						} finally {dbg.exitDecision(14);}

						switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:8: TYPEID
							{
							dbg.location(51,8);
							TYPEID48=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype329); 
							TYPEID48_tree = (Object)adaptor.create(TYPEID48);
							adaptor.addChild(root_0, TYPEID48_tree);

							}
							break;

						default :
							break loop14;
						}
					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(51,16);
					char_literal49=(Token)match(input,16,FOLLOW_16_in_paramtype332); 
					char_literal49_tree = (Object)adaptor.create(char_literal49);
					adaptor.addChild(root_0, char_literal49_tree);
					dbg.location(51,20);
					char_literal50=(Token)match(input,19,FOLLOW_19_in_paramtype334); 
					char_literal50_tree = (Object)adaptor.create(char_literal50);
					adaptor.addChild(root_0, char_literal50_tree);
					dbg.location(51,24);
					TYPEID51=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype336); 
					TYPEID51_tree = (Object)adaptor.create(TYPEID51);
					adaptor.addChild(root_0, TYPEID51_tree);

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
		dbg.location(52, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paramtype");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "paramtype"


	public static class fnparam_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fnparam"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:54:1: fnparam : ID ':' paramtype ;
	public final SneakersParser.fnparam_return fnparam() throws RecognitionException {
		SneakersParser.fnparam_return retval = new SneakersParser.fnparam_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID52=null;
		Token char_literal53=null;
		ParserRuleReturnScope paramtype54 =null;

		Object ID52_tree=null;
		Object char_literal53_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "fnparam");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:54:9: ( ID ':' paramtype )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:54:11: ID ':' paramtype
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(54,11);
			ID52=(Token)match(input,ID,FOLLOW_ID_in_fnparam347); 
			ID52_tree = (Object)adaptor.create(ID52);
			adaptor.addChild(root_0, ID52_tree);
			dbg.location(54,14);
			char_literal53=(Token)match(input,19,FOLLOW_19_in_fnparam349); 
			char_literal53_tree = (Object)adaptor.create(char_literal53);
			adaptor.addChild(root_0, char_literal53_tree);
			dbg.location(54,18);
			pushFollow(FOLLOW_paramtype_in_fnparam351);
			paramtype54=paramtype();
			state._fsp--;

			adaptor.addChild(root_0, paramtype54.getTree());

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
		dbg.location(55, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fnparam");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fnparam"


	public static class anonfn_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "anonfn"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:1: anonfn : ( '#' '[' fncall ']' | '#' '[' nested_id ']' );
	public final SneakersParser.anonfn_return anonfn() throws RecognitionException {
		SneakersParser.anonfn_return retval = new SneakersParser.anonfn_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal55=null;
		Token char_literal56=null;
		Token char_literal58=null;
		Token char_literal59=null;
		Token char_literal60=null;
		Token char_literal62=null;
		ParserRuleReturnScope fncall57 =null;
		ParserRuleReturnScope nested_id61 =null;

		Object char_literal55_tree=null;
		Object char_literal56_tree=null;
		Object char_literal58_tree=null;
		Object char_literal59_tree=null;
		Object char_literal60_tree=null;
		Object char_literal62_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "anonfn");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:8: ( '#' '[' fncall ']' | '#' '[' nested_id ']' )
			int alt16=2;
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			try {
				isCyclicDecision = true;
				alt16 = dfa16.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:10: '#' '[' fncall ']'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(57,10);
					char_literal55=(Token)match(input,14,FOLLOW_14_in_anonfn361); 
					char_literal55_tree = (Object)adaptor.create(char_literal55);
					adaptor.addChild(root_0, char_literal55_tree);
					dbg.location(57,14);
					char_literal56=(Token)match(input,26,FOLLOW_26_in_anonfn363); 
					char_literal56_tree = (Object)adaptor.create(char_literal56);
					adaptor.addChild(root_0, char_literal56_tree);
					dbg.location(57,18);
					pushFollow(FOLLOW_fncall_in_anonfn365);
					fncall57=fncall();
					state._fsp--;

					adaptor.addChild(root_0, fncall57.getTree());
					dbg.location(57,25);
					char_literal58=(Token)match(input,27,FOLLOW_27_in_anonfn367); 
					char_literal58_tree = (Object)adaptor.create(char_literal58);
					adaptor.addChild(root_0, char_literal58_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:4: '#' '[' nested_id ']'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(58,4);
					char_literal59=(Token)match(input,14,FOLLOW_14_in_anonfn372); 
					char_literal59_tree = (Object)adaptor.create(char_literal59);
					adaptor.addChild(root_0, char_literal59_tree);
					dbg.location(58,8);
					char_literal60=(Token)match(input,26,FOLLOW_26_in_anonfn374); 
					char_literal60_tree = (Object)adaptor.create(char_literal60);
					adaptor.addChild(root_0, char_literal60_tree);
					dbg.location(58,12);
					pushFollow(FOLLOW_nested_id_in_anonfn376);
					nested_id61=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id61.getTree());
					dbg.location(58,22);
					char_literal62=(Token)match(input,27,FOLLOW_27_in_anonfn378); 
					char_literal62_tree = (Object)adaptor.create(char_literal62);
					adaptor.addChild(root_0, char_literal62_tree);

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
		dbg.location(59, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "anonfn");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "anonfn"


	public static class blockdecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "blockdecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:1: blockdecl : ( '(' ')' ( ':' TYPEID )? contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block );
	public final SneakersParser.blockdecl_return blockdecl() throws RecognitionException {
		SneakersParser.blockdecl_return retval = new SneakersParser.blockdecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal63=null;
		Token char_literal64=null;
		Token char_literal65=null;
		Token TYPEID66=null;
		Token char_literal68=null;
		Token char_literal70=null;
		Token char_literal72=null;
		Token char_literal73=null;
		Token TYPEID74=null;
		ParserRuleReturnScope contained_block67 =null;
		ParserRuleReturnScope fnparam69 =null;
		ParserRuleReturnScope fnparam71 =null;
		ParserRuleReturnScope contained_block75 =null;

		Object char_literal63_tree=null;
		Object char_literal64_tree=null;
		Object char_literal65_tree=null;
		Object TYPEID66_tree=null;
		Object char_literal68_tree=null;
		Object char_literal70_tree=null;
		Object char_literal72_tree=null;
		Object char_literal73_tree=null;
		Object TYPEID74_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "blockdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:2: ( '(' ')' ( ':' TYPEID )? contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block )
			int alt21=2;
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( (LA21_0==15) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==16) ) {
					alt21=1;
				}
				else if ( (LA21_1==ID) ) {
					alt21=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:4: '(' ')' ( ':' TYPEID )? contained_block
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(62,4);
					char_literal63=(Token)match(input,15,FOLLOW_15_in_blockdecl389); 
					char_literal63_tree = (Object)adaptor.create(char_literal63);
					adaptor.addChild(root_0, char_literal63_tree);
					dbg.location(62,8);
					char_literal64=(Token)match(input,16,FOLLOW_16_in_blockdecl391); 
					char_literal64_tree = (Object)adaptor.create(char_literal64);
					adaptor.addChild(root_0, char_literal64_tree);
					dbg.location(62,12);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:12: ( ':' TYPEID )?
					int alt17=2;
					try { dbg.enterSubRule(17);
					try { dbg.enterDecision(17, decisionCanBacktrack[17]);

					int LA17_0 = input.LA(1);
					if ( (LA17_0==19) ) {
						alt17=1;
					}
					} finally {dbg.exitDecision(17);}

					switch (alt17) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:13: ':' TYPEID
							{
							dbg.location(62,13);
							char_literal65=(Token)match(input,19,FOLLOW_19_in_blockdecl394); 
							char_literal65_tree = (Object)adaptor.create(char_literal65);
							adaptor.addChild(root_0, char_literal65_tree);
							dbg.location(62,17);
							TYPEID66=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl396); 
							TYPEID66_tree = (Object)adaptor.create(TYPEID66);
							adaptor.addChild(root_0, TYPEID66_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(17);}
					dbg.location(62,26);
					pushFollow(FOLLOW_contained_block_in_blockdecl400);
					contained_block67=contained_block();
					state._fsp--;

					adaptor.addChild(root_0, contained_block67.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:4: '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(63,4);
					char_literal68=(Token)match(input,15,FOLLOW_15_in_blockdecl405); 
					char_literal68_tree = (Object)adaptor.create(char_literal68);
					adaptor.addChild(root_0, char_literal68_tree);
					dbg.location(63,8);
					pushFollow(FOLLOW_fnparam_in_blockdecl407);
					fnparam69=fnparam();
					state._fsp--;

					adaptor.addChild(root_0, fnparam69.getTree());
					dbg.location(63,16);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:16: ( ( ',' )? fnparam )*
					try { dbg.enterSubRule(19);

					loop19:
					while (true) {
						int alt19=2;
						try { dbg.enterDecision(19, decisionCanBacktrack[19]);

						int LA19_0 = input.LA(1);
						if ( (LA19_0==ID||LA19_0==17) ) {
							alt19=1;
						}

						} finally {dbg.exitDecision(19);}

						switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:17: ( ',' )? fnparam
							{
							dbg.location(63,17);
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:17: ( ',' )?
							int alt18=2;
							try { dbg.enterSubRule(18);
							try { dbg.enterDecision(18, decisionCanBacktrack[18]);

							int LA18_0 = input.LA(1);
							if ( (LA18_0==17) ) {
								alt18=1;
							}
							} finally {dbg.exitDecision(18);}

							switch (alt18) {
								case 1 :
									dbg.enterAlt(1);

									// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:17: ','
									{
									dbg.location(63,17);
									char_literal70=(Token)match(input,17,FOLLOW_17_in_blockdecl410); 
									char_literal70_tree = (Object)adaptor.create(char_literal70);
									adaptor.addChild(root_0, char_literal70_tree);

									}
									break;

							}
							} finally {dbg.exitSubRule(18);}
							dbg.location(63,22);
							pushFollow(FOLLOW_fnparam_in_blockdecl413);
							fnparam71=fnparam();
							state._fsp--;

							adaptor.addChild(root_0, fnparam71.getTree());

							}
							break;

						default :
							break loop19;
						}
					}
					} finally {dbg.exitSubRule(19);}
					dbg.location(63,32);
					char_literal72=(Token)match(input,16,FOLLOW_16_in_blockdecl417); 
					char_literal72_tree = (Object)adaptor.create(char_literal72);
					adaptor.addChild(root_0, char_literal72_tree);
					dbg.location(63,36);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:36: ( ':' TYPEID )?
					int alt20=2;
					try { dbg.enterSubRule(20);
					try { dbg.enterDecision(20, decisionCanBacktrack[20]);

					int LA20_0 = input.LA(1);
					if ( (LA20_0==19) ) {
						alt20=1;
					}
					} finally {dbg.exitDecision(20);}

					switch (alt20) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:37: ':' TYPEID
							{
							dbg.location(63,37);
							char_literal73=(Token)match(input,19,FOLLOW_19_in_blockdecl420); 
							char_literal73_tree = (Object)adaptor.create(char_literal73);
							adaptor.addChild(root_0, char_literal73_tree);
							dbg.location(63,41);
							TYPEID74=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl422); 
							TYPEID74_tree = (Object)adaptor.create(TYPEID74);
							adaptor.addChild(root_0, TYPEID74_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(20);}
					dbg.location(63,50);
					pushFollow(FOLLOW_contained_block_in_blockdecl426);
					contained_block75=contained_block();
					state._fsp--;

					adaptor.addChild(root_0, contained_block75.getTree());

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
		dbg.location(64, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "blockdecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "blockdecl"


	public static class fndecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fndecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:1: fndecl : '#' blockdecl ;
	public final SneakersParser.fndecl_return fndecl() throws RecognitionException {
		SneakersParser.fndecl_return retval = new SneakersParser.fndecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal76=null;
		ParserRuleReturnScope blockdecl77 =null;

		Object char_literal76_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "fndecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:8: ( '#' blockdecl )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:10: '#' blockdecl
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(66,10);
			char_literal76=(Token)match(input,14,FOLLOW_14_in_fndecl436); 
			char_literal76_tree = (Object)adaptor.create(char_literal76);
			adaptor.addChild(root_0, char_literal76_tree);
			dbg.location(66,14);
			pushFollow(FOLLOW_blockdecl_in_fndecl438);
			blockdecl77=blockdecl();
			state._fsp--;

			adaptor.addChild(root_0, blockdecl77.getTree());

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
		dbg.location(67, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fndecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fndecl"


	public static class mutdecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mutdecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:1: mutdecl : '@' blockdecl ;
	public final SneakersParser.mutdecl_return mutdecl() throws RecognitionException {
		SneakersParser.mutdecl_return retval = new SneakersParser.mutdecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal78=null;
		ParserRuleReturnScope blockdecl79 =null;

		Object char_literal78_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "mutdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:9: ( '@' blockdecl )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:11: '@' blockdecl
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(69,11);
			char_literal78=(Token)match(input,25,FOLLOW_25_in_mutdecl448); 
			char_literal78_tree = (Object)adaptor.create(char_literal78);
			adaptor.addChild(root_0, char_literal78_tree);
			dbg.location(69,15);
			pushFollow(FOLLOW_blockdecl_in_mutdecl450);
			blockdecl79=blockdecl();
			state._fsp--;

			adaptor.addChild(root_0, blockdecl79.getTree());

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
		dbg.location(70, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mutdecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "mutdecl"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:1: expr : ( index_expr | dict | fndecl | mutdecl | anonfn | array );
	public final SneakersParser.expr_return expr() throws RecognitionException {
		SneakersParser.expr_return retval = new SneakersParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope index_expr80 =null;
		ParserRuleReturnScope dict81 =null;
		ParserRuleReturnScope fndecl82 =null;
		ParserRuleReturnScope mutdecl83 =null;
		ParserRuleReturnScope anonfn84 =null;
		ParserRuleReturnScope array85 =null;


		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(72, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:6: ( index_expr | dict | fndecl | mutdecl | anonfn | array )
			int alt22=6;
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			switch ( input.LA(1) ) {
			case ANONVAR:
			case ID:
			case INT:
			case KEYWORD:
			case MUTID:
			case STRING:
			case TYPEID:
			case 15:
				{
				alt22=1;
				}
				break;
			case 33:
				{
				alt22=2;
				}
				break;
			case 14:
				{
				int LA22_3 = input.LA(2);
				if ( (LA22_3==26) ) {
					alt22=5;
				}
				else if ( (LA22_3==15) ) {
					alt22=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
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
			case 25:
				{
				alt22=4;
				}
				break;
			case 26:
				{
				alt22=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:8: index_expr
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(72,8);
					pushFollow(FOLLOW_index_expr_in_expr460);
					index_expr80=index_expr();
					state._fsp--;

					adaptor.addChild(root_0, index_expr80.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:4: dict
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(73,4);
					pushFollow(FOLLOW_dict_in_expr465);
					dict81=dict();
					state._fsp--;

					adaptor.addChild(root_0, dict81.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:4: fndecl
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(74,4);
					pushFollow(FOLLOW_fndecl_in_expr470);
					fndecl82=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl82.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:4: mutdecl
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,4);
					pushFollow(FOLLOW_mutdecl_in_expr475);
					mutdecl83=mutdecl();
					state._fsp--;

					adaptor.addChild(root_0, mutdecl83.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:4: anonfn
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(76,4);
					pushFollow(FOLLOW_anonfn_in_expr480);
					anonfn84=anonfn();
					state._fsp--;

					adaptor.addChild(root_0, anonfn84.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:4: array
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(77,4);
					pushFollow(FOLLOW_array_in_expr485);
					array85=array();
					state._fsp--;

					adaptor.addChild(root_0, array85.getTree());

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
		dbg.location(78, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:80:1: standalone_fncall : '(' fncall ')' ;
	public final SneakersParser.standalone_fncall_return standalone_fncall() throws RecognitionException {
		SneakersParser.standalone_fncall_return retval = new SneakersParser.standalone_fncall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal86=null;
		Token char_literal88=null;
		ParserRuleReturnScope fncall87 =null;

		Object char_literal86_tree=null;
		Object char_literal88_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "standalone_fncall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:2: ( '(' fncall ')' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:4: '(' fncall ')'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(81,4);
			char_literal86=(Token)match(input,15,FOLLOW_15_in_standalone_fncall496); 
			char_literal86_tree = (Object)adaptor.create(char_literal86);
			adaptor.addChild(root_0, char_literal86_tree);
			dbg.location(81,8);
			pushFollow(FOLLOW_fncall_in_standalone_fncall498);
			fncall87=fncall();
			state._fsp--;

			adaptor.addChild(root_0, fncall87.getTree());
			dbg.location(81,15);
			char_literal88=(Token)match(input,16,FOLLOW_16_in_standalone_fncall500); 
			char_literal88_tree = (Object)adaptor.create(char_literal88);
			adaptor.addChild(root_0, char_literal88_tree);

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
		dbg.location(82, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "standalone_fncall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "standalone_fncall"


	public static class mutcall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mutcall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:1: mutcall : ( '<' nested_id '>' | '<' fncall '>' );
	public final SneakersParser.mutcall_return mutcall() throws RecognitionException {
		SneakersParser.mutcall_return retval = new SneakersParser.mutcall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal89=null;
		Token char_literal91=null;
		Token char_literal92=null;
		Token char_literal94=null;
		ParserRuleReturnScope nested_id90 =null;
		ParserRuleReturnScope fncall93 =null;

		Object char_literal89_tree=null;
		Object char_literal91_tree=null;
		Object char_literal92_tree=null;
		Object char_literal94_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "mutcall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(84, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:9: ( '<' nested_id '>' | '<' fncall '>' )
			int alt23=2;
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

			try {
				isCyclicDecision = true;
				alt23 = dfa23.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(23);}

			switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:11: '<' nested_id '>'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(84,11);
					char_literal89=(Token)match(input,21,FOLLOW_21_in_mutcall510); 
					char_literal89_tree = (Object)adaptor.create(char_literal89);
					adaptor.addChild(root_0, char_literal89_tree);
					dbg.location(84,15);
					pushFollow(FOLLOW_nested_id_in_mutcall512);
					nested_id90=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id90.getTree());
					dbg.location(84,25);
					char_literal91=(Token)match(input,24,FOLLOW_24_in_mutcall514); 
					char_literal91_tree = (Object)adaptor.create(char_literal91);
					adaptor.addChild(root_0, char_literal91_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:85:4: '<' fncall '>'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(85,4);
					char_literal92=(Token)match(input,21,FOLLOW_21_in_mutcall519); 
					char_literal92_tree = (Object)adaptor.create(char_literal92);
					adaptor.addChild(root_0, char_literal92_tree);
					dbg.location(85,8);
					pushFollow(FOLLOW_fncall_in_mutcall521);
					fncall93=fncall();
					state._fsp--;

					adaptor.addChild(root_0, fncall93.getTree());
					dbg.location(85,15);
					char_literal94=(Token)match(input,24,FOLLOW_24_in_mutcall523); 
					char_literal94_tree = (Object)adaptor.create(char_literal94);
					adaptor.addChild(root_0, char_literal94_tree);

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
		dbg.location(86, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mutcall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "mutcall"


	public static class index_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index_expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:1: index_expr : ( KEYWORD | INT | STRING | nested_id | standalone_fncall );
	public final SneakersParser.index_expr_return index_expr() throws RecognitionException {
		SneakersParser.index_expr_return retval = new SneakersParser.index_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token KEYWORD95=null;
		Token INT96=null;
		Token STRING97=null;
		ParserRuleReturnScope nested_id98 =null;
		ParserRuleReturnScope standalone_fncall99 =null;

		Object KEYWORD95_tree=null;
		Object INT96_tree=null;
		Object STRING97_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "index_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(88, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:2: ( KEYWORD | INT | STRING | nested_id | standalone_fncall )
			int alt24=5;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			switch ( input.LA(1) ) {
			case KEYWORD:
				{
				alt24=1;
				}
				break;
			case INT:
				{
				alt24=2;
				}
				break;
			case STRING:
				{
				alt24=3;
				}
				break;
			case ANONVAR:
			case ID:
			case MUTID:
			case TYPEID:
				{
				alt24=4;
				}
				break;
			case 15:
				{
				alt24=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:4: KEYWORD
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(89,4);
					KEYWORD95=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_index_expr535); 
					KEYWORD95_tree = (Object)adaptor.create(KEYWORD95);
					adaptor.addChild(root_0, KEYWORD95_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:4: INT
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(90,4);
					INT96=(Token)match(input,INT,FOLLOW_INT_in_index_expr540); 
					INT96_tree = (Object)adaptor.create(INT96);
					adaptor.addChild(root_0, INT96_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:4: STRING
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(91,4);
					STRING97=(Token)match(input,STRING,FOLLOW_STRING_in_index_expr545); 
					STRING97_tree = (Object)adaptor.create(STRING97);
					adaptor.addChild(root_0, STRING97_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:4: nested_id
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(92,4);
					pushFollow(FOLLOW_nested_id_in_index_expr550);
					nested_id98=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id98.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:4: standalone_fncall
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(93,4);
					pushFollow(FOLLOW_standalone_fncall_in_index_expr555);
					standalone_fncall99=standalone_fncall();
					state._fsp--;

					adaptor.addChild(root_0, standalone_fncall99.getTree());

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
		dbg.location(94, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:1: dict_pair : index_expr '=>' expr ;
	public final SneakersParser.dict_pair_return dict_pair() throws RecognitionException {
		SneakersParser.dict_pair_return retval = new SneakersParser.dict_pair_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal101=null;
		ParserRuleReturnScope index_expr100 =null;
		ParserRuleReturnScope expr102 =null;

		Object string_literal101_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dict_pair");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(96, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:97:2: ( index_expr '=>' expr )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:97:4: index_expr '=>' expr
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(97,4);
			pushFollow(FOLLOW_index_expr_in_dict_pair567);
			index_expr100=index_expr();
			state._fsp--;

			adaptor.addChild(root_0, index_expr100.getTree());
			dbg.location(97,15);
			string_literal101=(Token)match(input,23,FOLLOW_23_in_dict_pair569); 
			string_literal101_tree = (Object)adaptor.create(string_literal101);
			adaptor.addChild(root_0, string_literal101_tree);
			dbg.location(97,20);
			pushFollow(FOLLOW_expr_in_dict_pair571);
			expr102=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr102.getTree());

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
		dbg.location(98, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:1: dict : '{' ( dict_pair )? ( ',' dict_pair )* '}' ;
	public final SneakersParser.dict_return dict() throws RecognitionException {
		SneakersParser.dict_return retval = new SneakersParser.dict_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal103=null;
		Token char_literal105=null;
		Token char_literal107=null;
		ParserRuleReturnScope dict_pair104 =null;
		ParserRuleReturnScope dict_pair106 =null;

		Object char_literal103_tree=null;
		Object char_literal105_tree=null;
		Object char_literal107_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "dict");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:6: ( '{' ( dict_pair )? ( ',' dict_pair )* '}' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:8: '{' ( dict_pair )? ( ',' dict_pair )* '}'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(100,8);
			char_literal103=(Token)match(input,33,FOLLOW_33_in_dict581); 
			char_literal103_tree = (Object)adaptor.create(char_literal103);
			adaptor.addChild(root_0, char_literal103_tree);
			dbg.location(100,12);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:12: ( dict_pair )?
			int alt25=2;
			try { dbg.enterSubRule(25);
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			int LA25_0 = input.LA(1);
			if ( (LA25_0==ANONVAR||(LA25_0 >= ID && LA25_0 <= TYPEID)||LA25_0==15) ) {
				alt25=1;
			}
			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:13: dict_pair
					{
					dbg.location(100,13);
					pushFollow(FOLLOW_dict_pair_in_dict584);
					dict_pair104=dict_pair();
					state._fsp--;

					adaptor.addChild(root_0, dict_pair104.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(25);}
			dbg.location(100,25);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:25: ( ',' dict_pair )*
			try { dbg.enterSubRule(26);

			loop26:
			while (true) {
				int alt26=2;
				try { dbg.enterDecision(26, decisionCanBacktrack[26]);

				int LA26_0 = input.LA(1);
				if ( (LA26_0==17) ) {
					alt26=1;
				}

				} finally {dbg.exitDecision(26);}

				switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:26: ',' dict_pair
					{
					dbg.location(100,26);
					char_literal105=(Token)match(input,17,FOLLOW_17_in_dict589); 
					char_literal105_tree = (Object)adaptor.create(char_literal105);
					adaptor.addChild(root_0, char_literal105_tree);
					dbg.location(100,30);
					pushFollow(FOLLOW_dict_pair_in_dict591);
					dict_pair106=dict_pair();
					state._fsp--;

					adaptor.addChild(root_0, dict_pair106.getTree());

					}
					break;

				default :
					break loop26;
				}
			}
			} finally {dbg.exitSubRule(26);}
			dbg.location(100,42);
			char_literal107=(Token)match(input,34,FOLLOW_34_in_dict595); 
			char_literal107_tree = (Object)adaptor.create(char_literal107);
			adaptor.addChild(root_0, char_literal107_tree);

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
		dbg.location(101, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dict");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "dict"


	public static class contained_block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "contained_block"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:103:1: contained_block : '[' block ']' ;
	public final SneakersParser.contained_block_return contained_block() throws RecognitionException {
		SneakersParser.contained_block_return retval = new SneakersParser.contained_block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal108=null;
		Token char_literal110=null;
		ParserRuleReturnScope block109 =null;

		Object char_literal108_tree=null;
		Object char_literal110_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "contained_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(103, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:2: ( '[' block ']' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:4: '[' block ']'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(104,4);
			char_literal108=(Token)match(input,26,FOLLOW_26_in_contained_block608); 
			char_literal108_tree = (Object)adaptor.create(char_literal108);
			adaptor.addChild(root_0, char_literal108_tree);
			dbg.location(104,8);
			pushFollow(FOLLOW_block_in_contained_block610);
			block109=block();
			state._fsp--;

			adaptor.addChild(root_0, block109.getTree());
			dbg.location(104,14);
			char_literal110=(Token)match(input,27,FOLLOW_27_in_contained_block612); 
			char_literal110_tree = (Object)adaptor.create(char_literal110);
			adaptor.addChild(root_0, char_literal110_tree);

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
		dbg.location(105, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "contained_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "contained_block"


	public static class array_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:1: array : '[' ( expr )? ( ',' expr )* ']' ;
	public final SneakersParser.array_return array() throws RecognitionException {
		SneakersParser.array_return retval = new SneakersParser.array_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal111=null;
		Token char_literal113=null;
		Token char_literal115=null;
		ParserRuleReturnScope expr112 =null;
		ParserRuleReturnScope expr114 =null;

		Object char_literal111_tree=null;
		Object char_literal113_tree=null;
		Object char_literal115_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "array");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(107, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:7: ( '[' ( expr )? ( ',' expr )* ']' )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:9: '[' ( expr )? ( ',' expr )* ']'
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(107,9);
			char_literal111=(Token)match(input,26,FOLLOW_26_in_array622); 
			char_literal111_tree = (Object)adaptor.create(char_literal111);
			adaptor.addChild(root_0, char_literal111_tree);
			dbg.location(107,13);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:13: ( expr )?
			int alt27=2;
			try { dbg.enterSubRule(27);
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==ANONVAR||(LA27_0 >= ID && LA27_0 <= TYPEID)||(LA27_0 >= 14 && LA27_0 <= 15)||(LA27_0 >= 25 && LA27_0 <= 26)||LA27_0==33) ) {
				alt27=1;
			}
			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:13: expr
					{
					dbg.location(107,13);
					pushFollow(FOLLOW_expr_in_array624);
					expr112=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr112.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(107,19);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:19: ( ',' expr )*
			try { dbg.enterSubRule(28);

			loop28:
			while (true) {
				int alt28=2;
				try { dbg.enterDecision(28, decisionCanBacktrack[28]);

				int LA28_0 = input.LA(1);
				if ( (LA28_0==17) ) {
					alt28=1;
				}

				} finally {dbg.exitDecision(28);}

				switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:20: ',' expr
					{
					dbg.location(107,20);
					char_literal113=(Token)match(input,17,FOLLOW_17_in_array628); 
					char_literal113_tree = (Object)adaptor.create(char_literal113);
					adaptor.addChild(root_0, char_literal113_tree);
					dbg.location(107,24);
					pushFollow(FOLLOW_expr_in_array630);
					expr114=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr114.getTree());

					}
					break;

				default :
					break loop28;
				}
			}
			} finally {dbg.exitSubRule(28);}
			dbg.location(107,31);
			char_literal115=(Token)match(input,27,FOLLOW_27_in_array634); 
			char_literal115_tree = (Object)adaptor.create(char_literal115);
			adaptor.addChild(root_0, char_literal115_tree);

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
		dbg.location(108, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "array");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "array"


	public static class any_id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "any_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:126:1: any_id : ( ID | TYPEID | MUTID );
	public final SneakersParser.any_id_return any_id() throws RecognitionException {
		SneakersParser.any_id_return retval = new SneakersParser.any_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set116=null;

		Object set116_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "any_id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(126, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:2: ( ID | TYPEID | MUTID )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(127,2);
			set116=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==MUTID||input.LA(1)==TYPEID ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set116));
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
		dbg.location(130, 1);

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
	protected DFA5 dfa5 = new DFA5(this);
	protected DFA16 dfa16 = new DFA16(this);
	protected DFA23 dfa23 = new DFA23(this);
	static final String DFA2_eotS =
		"\20\uffff";
	static final String DFA2_eofS =
		"\6\uffff\2\10\2\uffff\1\13\1\uffff\1\13\1\uffff\2\10";
	static final String DFA2_minS =
		"\1\7\2\uffff\1\4\2\uffff\2\4\1\uffff\1\7\1\4\1\uffff\1\4\1\7\2\4";
	static final String DFA2_maxS =
		"\1\40\2\uffff\1\41\2\uffff\2\41\1\uffff\1\14\1\41\1\uffff\1\41\1\14\2"+
		"\41";
	static final String DFA2_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\5\1\6\2\uffff\1\4\2\uffff\1\3\4\uffff";
	static final String DFA2_specialS =
		"\20\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\1\2\uffff\1\1\1\uffff\1\1\10\uffff\1\4\10\uffff\1\2\1\5\1\3",
			"",
			"",
			"\1\6\2\uffff\1\7\2\10\1\7\1\10\1\7\1\uffff\2\10\11\uffff\2\10\6\uffff"+
			"\1\10",
			"",
			"",
			"\1\13\2\uffff\1\12\2\13\1\14\1\13\1\14\1\uffff\2\13\2\uffff\1\11\1\uffff"+
			"\2\10\3\uffff\2\13\3\uffff\3\10\1\13",
			"\1\13\2\uffff\1\12\2\13\1\14\1\13\1\14\1\uffff\2\13\2\uffff\1\15\1\uffff"+
			"\2\10\3\uffff\2\13\3\uffff\3\10\1\13",
			"",
			"\1\16\2\uffff\1\16\1\uffff\1\16",
			"\1\13\2\uffff\6\13\1\uffff\2\13\1\uffff\5\13\1\10\2\uffff\2\13\3\uffff"+
			"\4\13",
			"",
			"\1\13\2\uffff\6\13\1\uffff\2\13\1\uffff\2\13\1\uffff\2\13\1\10\2\uffff"+
			"\2\13\3\uffff\4\13",
			"\1\17\2\uffff\1\17\1\uffff\1\17",
			"\1\13\2\uffff\1\12\2\13\1\14\1\13\1\14\1\uffff\2\13\2\uffff\1\11\1\uffff"+
			"\2\10\3\uffff\2\13\3\uffff\3\10\1\13",
			"\1\13\2\uffff\1\12\2\13\1\14\1\13\1\14\1\uffff\2\13\2\uffff\1\15\1\uffff"+
			"\2\10\3\uffff\2\13\3\uffff\3\10\1\13"
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
			return "14:1: stat : ( assignment | ifstat | 'return' fncall | 'return' expr | mutcall | 'pass' );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA5_eotS =
		"\15\uffff";
	static final String DFA5_eofS =
		"\4\uffff\2\3\1\uffff\2\11\2\uffff\2\3";
	static final String DFA5_minS =
		"\1\7\1\26\1\4\1\uffff\2\4\1\7\2\4\1\uffff\1\7\2\4";
	static final String DFA5_maxS =
		"\1\14\1\26\1\41\1\uffff\2\41\1\14\2\41\1\uffff\1\14\2\41";
	static final String DFA5_acceptS =
		"\3\uffff\1\1\5\uffff\1\2\3\uffff";
	static final String DFA5_specialS =
		"\15\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\1\2\uffff\1\1\1\uffff\1\1",
			"\1\2",
			"\1\4\2\uffff\1\5\2\3\1\5\1\3\1\5\1\uffff\2\3\11\uffff\2\3\6\uffff\1"+
			"\3",
			"",
			"\1\11\2\uffff\1\7\2\11\1\10\1\11\1\10\1\uffff\2\11\2\uffff\1\6\1\uffff"+
			"\2\3\3\uffff\2\11\3\uffff\3\3\1\11",
			"\1\11\2\uffff\1\7\2\11\1\10\1\11\1\10\1\uffff\2\11\2\uffff\1\12\1\uffff"+
			"\2\3\3\uffff\2\11\3\uffff\3\3\1\11",
			"\1\13\2\uffff\1\13\1\uffff\1\13",
			"\1\11\2\uffff\6\11\1\uffff\2\11\1\uffff\5\11\1\3\2\uffff\2\11\3\uffff"+
			"\4\11",
			"\1\11\2\uffff\6\11\1\uffff\2\11\1\uffff\2\11\1\uffff\2\11\1\3\2\uffff"+
			"\2\11\3\uffff\4\11",
			"",
			"\1\14\2\uffff\1\14\1\uffff\1\14",
			"\1\11\2\uffff\1\7\2\11\1\10\1\11\1\10\1\uffff\2\11\2\uffff\1\6\1\uffff"+
			"\2\3\3\uffff\2\11\3\uffff\3\3\1\11",
			"\1\11\2\uffff\1\7\2\11\1\10\1\11\1\10\1\uffff\2\11\2\uffff\1\12\1\uffff"+
			"\2\3\3\uffff\2\11\3\uffff\3\3\1\11"
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
			return "24:1: assignment : ( any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA16_eotS =
		"\13\uffff";
	static final String DFA16_eofS =
		"\13\uffff";
	static final String DFA16_minS =
		"\1\16\1\32\3\4\1\7\2\uffff\1\7\2\4";
	static final String DFA16_maxS =
		"\1\16\1\32\1\14\2\41\1\14\2\uffff\1\14\2\41";
	static final String DFA16_acceptS =
		"\6\uffff\1\1\1\2\3\uffff";
	static final String DFA16_specialS =
		"\13\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\2\uffff\1\4\2\uffff\1\4\1\uffff\1\4",
			"\1\6\2\uffff\6\6\1\uffff\2\6\2\uffff\1\5\6\uffff\2\6\1\7\5\uffff\1\6",
			"\1\6\2\uffff\6\6\1\uffff\2\6\2\uffff\1\10\6\uffff\2\6\1\7\5\uffff\1"+
			"\6",
			"\1\11\2\uffff\1\11\1\uffff\1\11",
			"",
			"",
			"\1\12\2\uffff\1\12\1\uffff\1\12",
			"\1\6\2\uffff\6\6\1\uffff\2\6\2\uffff\1\5\6\uffff\2\6\1\7\5\uffff\1\6",
			"\1\6\2\uffff\6\6\1\uffff\2\6\2\uffff\1\10\6\uffff\2\6\1\7\5\uffff\1"+
			"\6"
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "57:1: anonfn : ( '#' '[' fncall ']' | '#' '[' nested_id ']' );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA23_eotS =
		"\12\uffff";
	static final String DFA23_eofS =
		"\12\uffff";
	static final String DFA23_minS =
		"\1\25\3\4\1\7\2\uffff\1\7\2\4";
	static final String DFA23_maxS =
		"\1\25\1\14\2\41\1\14\2\uffff\1\14\2\41";
	static final String DFA23_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA23_specialS =
		"\12\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\1",
			"\1\2\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3",
			"\1\6\2\uffff\6\6\1\uffff\2\6\2\uffff\1\4\5\uffff\1\5\2\6\6\uffff\1\6",
			"\1\6\2\uffff\6\6\1\uffff\2\6\2\uffff\1\7\5\uffff\1\5\2\6\6\uffff\1\6",
			"\1\10\2\uffff\1\10\1\uffff\1\10",
			"",
			"",
			"\1\11\2\uffff\1\11\1\uffff\1\11",
			"\1\6\2\uffff\6\6\1\uffff\2\6\2\uffff\1\4\5\uffff\1\5\2\6\6\uffff\1\6",
			"\1\6\2\uffff\6\6\1\uffff\2\6\2\uffff\1\7\5\uffff\1\5\2\6\6\uffff\1\6"
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "84:1: mutcall : ( '<' nested_id '>' | '<' fncall '>' );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_block_in_prog42 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_block54 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_block56 = new BitSet(new long[]{0x00000001C0201482L});
	public static final BitSet FOLLOW_assignment_in_stat75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_stat85 = new BitSet(new long[]{0x0000000000001490L});
	public static final BitSet FOLLOW_fncall_in_stat87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_stat92 = new BitSet(new long[]{0x000000020600DF90L});
	public static final BitSet FOLLOW_expr_in_stat94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutcall_in_stat99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_stat104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_ifstat114 = new BitSet(new long[]{0x000000020600DF90L});
	public static final BitSet FOLLOW_expr_in_ifstat116 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat118 = new BitSet(new long[]{0x0000000030000002L});
	public static final BitSet FOLLOW_29_in_ifstat121 = new BitSet(new long[]{0x000000020600DF90L});
	public static final BitSet FOLLOW_expr_in_ifstat123 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat125 = new BitSet(new long[]{0x0000000030000002L});
	public static final BitSet FOLLOW_28_in_ifstat130 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment143 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_assignment145 = new BitSet(new long[]{0x000000020600DF90L});
	public static final BitSet FOLLOW_expr_in_assignment147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment162 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_assignment164 = new BitSet(new long[]{0x0000000000001490L});
	public static final BitSet FOLLOW_fncall_in_assignment166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_defable187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_defable192 = new BitSet(new long[]{0x00000001C0201480L});
	public static final BitSet FOLLOW_stat_in_defable194 = new BitSet(new long[]{0x00000001C0201482L});
	public static final BitSet FOLLOW_KEYWORD_in_defdecl205 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_defdecl207 = new BitSet(new long[]{0x0000000000005000L});
	public static final BitSet FOLLOW_defable_in_defdecl209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANONVAR_in_nested_id222 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_nested_id225 = new BitSet(new long[]{0x0000000000001480L});
	public static final BitSet FOLLOW_any_id_in_nested_id227 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_any_id_in_nested_id245 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_nested_id248 = new BitSet(new long[]{0x0000000000001480L});
	public static final BitSet FOLLOW_any_id_in_nested_id250 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_nested_id_in_fncall271 = new BitSet(new long[]{0x000000020600DF90L});
	public static final BitSet FOLLOW_param_in_fncall273 = new BitSet(new long[]{0x000000020602DF92L});
	public static final BitSet FOLLOW_17_in_fncall276 = new BitSet(new long[]{0x000000020600DF90L});
	public static final BitSet FOLLOW_param_in_fncall279 = new BitSet(new long[]{0x000000020602DF92L});
	public static final BitSet FOLLOW_ID_in_param302 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_param304 = new BitSet(new long[]{0x000000020600DF90L});
	public static final BitSet FOLLOW_expr_in_param306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_param311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_paramtype327 = new BitSet(new long[]{0x0000000000011000L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype329 = new BitSet(new long[]{0x0000000000011000L});
	public static final BitSet FOLLOW_16_in_paramtype332 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_paramtype334 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fnparam347 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_fnparam349 = new BitSet(new long[]{0x0000000000009000L});
	public static final BitSet FOLLOW_paramtype_in_fnparam351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_anonfn361 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_anonfn363 = new BitSet(new long[]{0x0000000000001490L});
	public static final BitSet FOLLOW_fncall_in_anonfn365 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_anonfn367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_anonfn372 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_anonfn374 = new BitSet(new long[]{0x0000000000001490L});
	public static final BitSet FOLLOW_nested_id_in_anonfn376 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_anonfn378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_blockdecl389 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_blockdecl391 = new BitSet(new long[]{0x0000000004080000L});
	public static final BitSet FOLLOW_19_in_blockdecl394 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl396 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_blockdecl405 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl407 = new BitSet(new long[]{0x0000000000030080L});
	public static final BitSet FOLLOW_17_in_blockdecl410 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl413 = new BitSet(new long[]{0x0000000000030080L});
	public static final BitSet FOLLOW_16_in_blockdecl417 = new BitSet(new long[]{0x0000000004080000L});
	public static final BitSet FOLLOW_19_in_blockdecl420 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl422 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_fndecl436 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_blockdecl_in_fndecl438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_mutdecl448 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_blockdecl_in_mutdecl450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_expr460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_expr470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutdecl_in_expr475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anonfn_in_expr480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_expr485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_standalone_fncall496 = new BitSet(new long[]{0x0000000000001490L});
	public static final BitSet FOLLOW_fncall_in_standalone_fncall498 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_standalone_fncall500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_mutcall510 = new BitSet(new long[]{0x0000000000001490L});
	public static final BitSet FOLLOW_nested_id_in_mutcall512 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_mutcall514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_mutcall519 = new BitSet(new long[]{0x0000000000001490L});
	public static final BitSet FOLLOW_fncall_in_mutcall521 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_mutcall523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_index_expr535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_index_expr540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_index_expr545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_index_expr550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standalone_fncall_in_index_expr555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_dict_pair567 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_dict_pair569 = new BitSet(new long[]{0x000000020600DF90L});
	public static final BitSet FOLLOW_expr_in_dict_pair571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_dict581 = new BitSet(new long[]{0x0000000400029F90L});
	public static final BitSet FOLLOW_dict_pair_in_dict584 = new BitSet(new long[]{0x0000000400020000L});
	public static final BitSet FOLLOW_17_in_dict589 = new BitSet(new long[]{0x0000000000009F90L});
	public static final BitSet FOLLOW_dict_pair_in_dict591 = new BitSet(new long[]{0x0000000400020000L});
	public static final BitSet FOLLOW_34_in_dict595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_contained_block608 = new BitSet(new long[]{0x00000001C0201480L});
	public static final BitSet FOLLOW_block_in_contained_block610 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_contained_block612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_array622 = new BitSet(new long[]{0x000000020E02DF90L});
	public static final BitSet FOLLOW_expr_in_array624 = new BitSet(new long[]{0x0000000008020000L});
	public static final BitSet FOLLOW_17_in_array628 = new BitSet(new long[]{0x000000020600DF90L});
	public static final BitSet FOLLOW_expr_in_array630 = new BitSet(new long[]{0x0000000008020000L});
	public static final BitSet FOLLOW_27_in_array634 = new BitSet(new long[]{0x0000000000000002L});
}
