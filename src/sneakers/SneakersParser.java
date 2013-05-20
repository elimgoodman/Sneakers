// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-19 22:04:39
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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANONFN", "ANONVAR", "ARRAY", 
		"BLOCK", "BLOCKDECL", "DICT", "FNCALL", "FNDECL", "FNPARAM", "ID", "INT", 
		"KEYWORD", "MUTDECL", "MUTID", "PARAM", "PARAMTYPEFN", "RET", "STRING", 
		"TYPEID", "WS", "'#'", "'('", "')'", "','", "'.'", "':'", "';'", "'<'", 
		"'='", "'=>'", "'>'", "'@'", "'['", "']'", "'else'", "'elseif'", "'if'", 
		"'pass'", "'return'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int ANONFN=4;
	public static final int ANONVAR=5;
	public static final int ARRAY=6;
	public static final int BLOCK=7;
	public static final int BLOCKDECL=8;
	public static final int DICT=9;
	public static final int FNCALL=10;
	public static final int FNDECL=11;
	public static final int FNPARAM=12;
	public static final int ID=13;
	public static final int INT=14;
	public static final int KEYWORD=15;
	public static final int MUTDECL=16;
	public static final int MUTID=17;
	public static final int PARAM=18;
	public static final int PARAMTYPEFN=19;
	public static final int RET=20;
	public static final int STRING=21;
	public static final int TYPEID=22;
	public static final int WS=23;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "fncall", "index_expr", "contained_block", "standalone_fncall", 
		"mutcall", "mutdecl", "dict_pair", "param", "array", "prog", "fndecl", 
		"blockdecl", "stat", "returnstat", "paramtype", "assignment", "block", 
		"dict", "any_id", "ifstat", "defable", "fnparam", "defdecl", "nested_id", 
		"expr", "anonfn"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:26:1: prog : block ;
	public final SneakersParser.prog_return prog() throws RecognitionException {
		SneakersParser.prog_return retval = new SneakersParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope block1 =null;


		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:26:6: ( block )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:26:8: block
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(26,8);
			pushFollow(FOLLOW_block_in_prog97);
			block1=block();
			state._fsp--;

			adaptor.addChild(root_0, block1.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(27, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:1: block : ( stat ';' )+ -> ^( BLOCK ( stat )+ ) ;
	public final SneakersParser.block_return block() throws RecognitionException {
		SneakersParser.block_return retval = new SneakersParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal3=null;
		ParserRuleReturnScope stat2 =null;

		CommonTree char_literal3_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:8: ( ( stat ';' )+ -> ^( BLOCK ( stat )+ ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:10: ( stat ';' )+
			{
			dbg.location(29,10);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:10: ( stat ';' )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==MUTID||LA1_0==TYPEID||LA1_0==31||(LA1_0 >= 40 && LA1_0 <= 42)) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:11: stat ';'
					{
					dbg.location(29,11);
					pushFollow(FOLLOW_stat_in_block109);
					stat2=stat();
					state._fsp--;

					stream_stat.add(stat2.getTree());dbg.location(29,16);
					char_literal3=(Token)match(input,30,FOLLOW_30_in_block111);  
					stream_30.add(char_literal3);

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

			root_0 = (CommonTree)adaptor.nil();
			// 29:22: -> ^( BLOCK ( stat )+ )
			{
				dbg.location(29,25);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:29:25: ^( BLOCK ( stat )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(29,27);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				dbg.location(29,33);
				if ( !(stream_stat.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_stat.hasNext() ) {
					dbg.location(29,33);
					adaptor.addChild(root_1, stream_stat.nextTree());
				}
				stream_stat.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(29, 38);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:1: stat : ( assignment | ifstat | returnstat | mutcall | 'pass' );
	public final SneakersParser.stat_return stat() throws RecognitionException {
		SneakersParser.stat_return retval = new SneakersParser.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal8=null;
		ParserRuleReturnScope assignment4 =null;
		ParserRuleReturnScope ifstat5 =null;
		ParserRuleReturnScope returnstat6 =null;
		ParserRuleReturnScope mutcall7 =null;

		CommonTree string_literal8_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:6: ( assignment | ifstat | returnstat | mutcall | 'pass' )
			int alt2=5;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case ID:
			case MUTID:
			case TYPEID:
				{
				alt2=1;
				}
				break;
			case 40:
				{
				alt2=2;
				}
				break;
			case 42:
				{
				alt2=3;
				}
				break;
			case 31:
				{
				alt2=4;
				}
				break;
			case 41:
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:8: assignment
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(31,8);
					pushFollow(FOLLOW_assignment_in_stat130);
					assignment4=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment4.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:32:4: ifstat
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(32,4);
					pushFollow(FOLLOW_ifstat_in_stat135);
					ifstat5=ifstat();
					state._fsp--;

					adaptor.addChild(root_0, ifstat5.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:33:4: returnstat
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(33,4);
					pushFollow(FOLLOW_returnstat_in_stat140);
					returnstat6=returnstat();
					state._fsp--;

					adaptor.addChild(root_0, returnstat6.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:34:4: mutcall
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(34,4);
					pushFollow(FOLLOW_mutcall_in_stat145);
					mutcall7=mutcall();
					state._fsp--;

					adaptor.addChild(root_0, mutcall7.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:35:4: 'pass'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(35,4);
					string_literal8=(Token)match(input,41,FOLLOW_41_in_stat150); 
					string_literal8_tree = (CommonTree)adaptor.create(string_literal8);
					adaptor.addChild(root_0, string_literal8_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "stat"


	public static class returnstat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "returnstat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:38:1: returnstat : ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) );
	public final SneakersParser.returnstat_return returnstat() throws RecognitionException {
		SneakersParser.returnstat_return retval = new SneakersParser.returnstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal9=null;
		Token string_literal11=null;
		ParserRuleReturnScope fncall10 =null;
		ParserRuleReturnScope expr12 =null;

		CommonTree string_literal9_tree=null;
		CommonTree string_literal11_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "returnstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:39:2: ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) )
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:39:4: 'return' fncall
					{
					dbg.location(39,4);
					string_literal9=(Token)match(input,42,FOLLOW_42_in_returnstat161);  
					stream_42.add(string_literal9);
					dbg.location(39,13);
					pushFollow(FOLLOW_fncall_in_returnstat163);
					fncall10=fncall();
					state._fsp--;

					stream_fncall.add(fncall10.getTree());
					// AST REWRITE
					// elements: fncall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 39:20: -> ^( RET fncall )
					{
						dbg.location(39,23);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:39:23: ^( RET fncall )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(39,25);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RET, "RET"), root_1);
						dbg.location(39,29);
						adaptor.addChild(root_1, stream_fncall.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:40:4: 'return' expr
					{
					dbg.location(40,4);
					string_literal11=(Token)match(input,42,FOLLOW_42_in_returnstat176);  
					stream_42.add(string_literal11);
					dbg.location(40,13);
					pushFollow(FOLLOW_expr_in_returnstat178);
					expr12=expr();
					state._fsp--;

					stream_expr.add(expr12.getTree());
					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 40:18: -> ^( RET expr )
					{
						dbg.location(40,21);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:40:21: ^( RET expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(40,23);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RET, "RET"), root_1);
						dbg.location(40,27);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "returnstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "returnstat"


	public static class ifstat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifstat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:1: ifstat : 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) ;
	public final SneakersParser.ifstat_return ifstat() throws RecognitionException {
		SneakersParser.ifstat_return retval = new SneakersParser.ifstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal13=null;
		Token string_literal14=null;
		Token string_literal15=null;
		List<Object> list_elifexpr=null;
		List<Object> list_elifblock=null;
		ParserRuleReturnScope ifexpr =null;
		ParserRuleReturnScope ifblock =null;
		ParserRuleReturnScope elseblock =null;
		RuleReturnScope elifexpr = null;
		RuleReturnScope elifblock = null;
		CommonTree string_literal13_tree=null;
		CommonTree string_literal14_tree=null;
		CommonTree string_literal15_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "ifstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:8: ( 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:10: 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )?
			{
			dbg.location(43,10);
			string_literal13=(Token)match(input,40,FOLLOW_40_in_ifstat196);  
			stream_40.add(string_literal13);
			dbg.location(43,21);
			pushFollow(FOLLOW_expr_in_ifstat200);
			ifexpr=expr();
			state._fsp--;

			stream_expr.add(ifexpr.getTree());dbg.location(43,34);
			pushFollow(FOLLOW_contained_block_in_ifstat204);
			ifblock=contained_block();
			state._fsp--;

			stream_contained_block.add(ifblock.getTree());dbg.location(44,3);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:44:3: ( 'elseif' elifexpr+= expr elifblock+= contained_block )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==39) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:44:4: 'elseif' elifexpr+= expr elifblock+= contained_block
					{
					dbg.location(44,4);
					string_literal14=(Token)match(input,39,FOLLOW_39_in_ifstat210);  
					stream_39.add(string_literal14);
					dbg.location(44,21);
					pushFollow(FOLLOW_expr_in_ifstat214);
					elifexpr=expr();
					state._fsp--;

					stream_expr.add(elifexpr.getTree());
					if (list_elifexpr==null) list_elifexpr=new ArrayList<Object>();
					list_elifexpr.add(elifexpr.getTree());dbg.location(44,37);
					pushFollow(FOLLOW_contained_block_in_ifstat218);
					elifblock=contained_block();
					state._fsp--;

					stream_contained_block.add(elifblock.getTree());
					if (list_elifblock==null) list_elifblock=new ArrayList<Object>();
					list_elifblock.add(elifblock.getTree());
					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(45,3);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:3: ( 'else' elseblock= contained_block )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==38) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:4: 'else' elseblock= contained_block
					{
					dbg.location(45,4);
					string_literal15=(Token)match(input,38,FOLLOW_38_in_ifstat226);  
					stream_38.add(string_literal15);
					dbg.location(45,20);
					pushFollow(FOLLOW_contained_block_in_ifstat230);
					elseblock=contained_block();
					state._fsp--;

					stream_contained_block.add(elseblock.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

			// AST REWRITE
			// elements: elseblock, ifblock, 40, elifexpr, ifexpr, elifblock
			// token labels: 
			// rule labels: ifblock, retval, ifexpr, elseblock
			// token list labels: 
			// rule list labels: elifblock, elifexpr
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_ifblock=new RewriteRuleSubtreeStream(adaptor,"rule ifblock",ifblock!=null?ifblock.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_ifexpr=new RewriteRuleSubtreeStream(adaptor,"rule ifexpr",ifexpr!=null?ifexpr.getTree():null);
			RewriteRuleSubtreeStream stream_elseblock=new RewriteRuleSubtreeStream(adaptor,"rule elseblock",elseblock!=null?elseblock.getTree():null);
			RewriteRuleSubtreeStream stream_elifblock=new RewriteRuleSubtreeStream(adaptor,"token elifblock",list_elifblock);
			RewriteRuleSubtreeStream stream_elifexpr=new RewriteRuleSubtreeStream(adaptor,"token elifexpr",list_elifexpr);
			root_0 = (CommonTree)adaptor.nil();
			// 46:3: -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
			{
				dbg.location(46,6);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:6: ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(46,8);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_40.nextNode(), root_1);
				dbg.location(46,14);
				adaptor.addChild(root_1, stream_ifexpr.nextTree());dbg.location(46,22);
				adaptor.addChild(root_1, stream_ifblock.nextTree());dbg.location(46,30);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:30: ( $elifexpr $elifblock)*
				while ( stream_elifexpr.hasNext()||stream_elifblock.hasNext() ) {
					dbg.location(46,32);
					adaptor.addChild(root_1, stream_elifexpr.nextTree());dbg.location(46,42);
					adaptor.addChild(root_1, stream_elifblock.nextTree());
				}
				stream_elifexpr.reset();
				stream_elifblock.reset();
				dbg.location(46,55);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:55: ( $elseblock)?
				if ( stream_elseblock.hasNext() ) {
					dbg.location(46,55);
					adaptor.addChild(root_1, stream_elseblock.nextTree());
				}
				stream_elseblock.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(46, 65);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:1: assignment : ( any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );
	public final SneakersParser.assignment_return assignment() throws RecognitionException {
		SneakersParser.assignment_return retval = new SneakersParser.assignment_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal17=null;
		Token char_literal20=null;
		ParserRuleReturnScope any_id16 =null;
		ParserRuleReturnScope expr18 =null;
		ParserRuleReturnScope any_id19 =null;
		ParserRuleReturnScope fncall21 =null;

		CommonTree char_literal17_tree=null;
		CommonTree char_literal20_tree=null;
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "assignment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:2: ( any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			try {
				isCyclicDecision = true;
				alt6 = dfa6.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:4: any_id '=' expr
					{
					dbg.location(49,4);
					pushFollow(FOLLOW_any_id_in_assignment268);
					any_id16=any_id();
					state._fsp--;

					stream_any_id.add(any_id16.getTree());dbg.location(49,11);
					char_literal17=(Token)match(input,32,FOLLOW_32_in_assignment270);  
					stream_32.add(char_literal17);
					dbg.location(49,15);
					pushFollow(FOLLOW_expr_in_assignment272);
					expr18=expr();
					state._fsp--;

					stream_expr.add(expr18.getTree());
					// AST REWRITE
					// elements: any_id, 32, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 49:20: -> ^( '=' any_id expr )
					{
						dbg.location(49,23);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:23: ^( '=' any_id expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(49,25);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_32.nextNode(), root_1);
						dbg.location(49,29);
						adaptor.addChild(root_1, stream_any_id.nextTree());dbg.location(49,36);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:50:4: any_id '=' fncall
					{
					dbg.location(50,4);
					pushFollow(FOLLOW_any_id_in_assignment287);
					any_id19=any_id();
					state._fsp--;

					stream_any_id.add(any_id19.getTree());dbg.location(50,11);
					char_literal20=(Token)match(input,32,FOLLOW_32_in_assignment289);  
					stream_32.add(char_literal20);
					dbg.location(50,15);
					pushFollow(FOLLOW_fncall_in_assignment291);
					fncall21=fncall();
					state._fsp--;

					stream_fncall.add(fncall21.getTree());
					// AST REWRITE
					// elements: 32, any_id, fncall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 50:22: -> ^( '=' any_id fncall )
					{
						dbg.location(50,25);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:50:25: ^( '=' any_id fncall )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(50,27);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_32.nextNode(), root_1);
						dbg.location(50,31);
						adaptor.addChild(root_1, stream_any_id.nextTree());dbg.location(50,38);
						adaptor.addChild(root_1, stream_fncall.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(51, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "defable"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:54:1: defable : ( TYPEID | fndecl ( stat )+ );
	public final SneakersParser.defable_return defable() throws RecognitionException {
		SneakersParser.defable_return retval = new SneakersParser.defable_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TYPEID22=null;
		ParserRuleReturnScope fndecl23 =null;
		ParserRuleReturnScope stat24 =null;

		CommonTree TYPEID22_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "defable");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:54:9: ( TYPEID | fndecl ( stat )+ )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==TYPEID) ) {
				alt8=1;
			}
			else if ( (LA8_0==24) ) {
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:54:11: TYPEID
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(54,11);
					TYPEID22=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_defable312); 
					TYPEID22_tree = (CommonTree)adaptor.create(TYPEID22);
					adaptor.addChild(root_0, TYPEID22_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:55:4: fndecl ( stat )+
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(55,4);
					pushFollow(FOLLOW_fndecl_in_defable317);
					fndecl23=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl23.getTree());
					dbg.location(55,11);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:55:11: ( stat )+
					int cnt7=0;
					try { dbg.enterSubRule(7);

					loop7:
					while (true) {
						int alt7=2;
						try { dbg.enterDecision(7, decisionCanBacktrack[7]);

						int LA7_0 = input.LA(1);
						if ( (LA7_0==ID||LA7_0==MUTID||LA7_0==TYPEID||LA7_0==31||(LA7_0 >= 40 && LA7_0 <= 42)) ) {
							alt7=1;
						}

						} finally {dbg.exitDecision(7);}

						switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:55:11: stat
							{
							dbg.location(55,11);
							pushFollow(FOLLOW_stat_in_defable319);
							stat24=stat();
							state._fsp--;

							adaptor.addChild(root_0, stat24.getTree());

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
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "defdecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:1: defdecl : KEYWORD '=>' defable ;
	public final SneakersParser.defdecl_return defdecl() throws RecognitionException {
		SneakersParser.defdecl_return retval = new SneakersParser.defdecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KEYWORD25=null;
		Token string_literal26=null;
		ParserRuleReturnScope defable27 =null;

		CommonTree KEYWORD25_tree=null;
		CommonTree string_literal26_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "defdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:9: ( KEYWORD '=>' defable )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:11: KEYWORD '=>' defable
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(58,11);
			KEYWORD25=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_defdecl330); 
			KEYWORD25_tree = (CommonTree)adaptor.create(KEYWORD25);
			adaptor.addChild(root_0, KEYWORD25_tree);
			dbg.location(58,19);
			string_literal26=(Token)match(input,33,FOLLOW_33_in_defdecl332); 
			string_literal26_tree = (CommonTree)adaptor.create(string_literal26);
			adaptor.addChild(root_0, string_literal26_tree);
			dbg.location(58,24);
			pushFollow(FOLLOW_defable_in_defdecl334);
			defable27=defable();
			state._fsp--;

			adaptor.addChild(root_0, defable27.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(59, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nested_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:1: nested_id : ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* );
	public final SneakersParser.nested_id_return nested_id() throws RecognitionException {
		SneakersParser.nested_id_return retval = new SneakersParser.nested_id_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANONVAR28=null;
		Token char_literal29=null;
		Token char_literal32=null;
		ParserRuleReturnScope any_id30 =null;
		ParserRuleReturnScope any_id31 =null;
		ParserRuleReturnScope any_id33 =null;

		CommonTree ANONVAR28_tree=null;
		CommonTree char_literal29_tree=null;
		CommonTree char_literal32_tree=null;
		RewriteRuleTokenStream stream_ANONVAR=new RewriteRuleTokenStream(adaptor,"token ANONVAR");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");

		try { dbg.enterRule(getGrammarFileName(), "nested_id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(62, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:2: ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* )
			int alt11=2;
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==ANONVAR) ) {
				alt11=1;
			}
			else if ( (LA11_0==ID||LA11_0==MUTID||LA11_0==TYPEID) ) {
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:4: ANONVAR ( '.' any_id )*
					{
					dbg.location(63,4);
					ANONVAR28=(Token)match(input,ANONVAR,FOLLOW_ANONVAR_in_nested_id347);  
					stream_ANONVAR.add(ANONVAR28);
					dbg.location(63,12);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:12: ( '.' any_id )*
					try { dbg.enterSubRule(9);

					loop9:
					while (true) {
						int alt9=2;
						try { dbg.enterDecision(9, decisionCanBacktrack[9]);

						int LA9_0 = input.LA(1);
						if ( (LA9_0==28) ) {
							alt9=1;
						}

						} finally {dbg.exitDecision(9);}

						switch (alt9) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:13: '.' any_id
							{
							dbg.location(63,13);
							char_literal29=(Token)match(input,28,FOLLOW_28_in_nested_id350);  
							stream_28.add(char_literal29);
							dbg.location(63,17);
							pushFollow(FOLLOW_any_id_in_nested_id352);
							any_id30=any_id();
							state._fsp--;

							stream_any_id.add(any_id30.getTree());
							}
							break;

						default :
							break loop9;
						}
					}
					} finally {dbg.exitSubRule(9);}

					// AST REWRITE
					// elements: any_id, ANONVAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 63:26: -> ANONVAR ( any_id )*
					{
						dbg.location(63,29);
						adaptor.addChild(root_0, stream_ANONVAR.nextNode());dbg.location(63,37);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:37: ( any_id )*
						while ( stream_any_id.hasNext() ) {
							dbg.location(63,37);
							adaptor.addChild(root_0, stream_any_id.nextTree());
						}
						stream_any_id.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:4: any_id ( '.' any_id )*
					{
					dbg.location(64,4);
					pushFollow(FOLLOW_any_id_in_nested_id366);
					any_id31=any_id();
					state._fsp--;

					stream_any_id.add(any_id31.getTree());dbg.location(64,11);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:11: ( '.' any_id )*
					try { dbg.enterSubRule(10);

					loop10:
					while (true) {
						int alt10=2;
						try { dbg.enterDecision(10, decisionCanBacktrack[10]);

						int LA10_0 = input.LA(1);
						if ( (LA10_0==28) ) {
							alt10=1;
						}

						} finally {dbg.exitDecision(10);}

						switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:12: '.' any_id
							{
							dbg.location(64,12);
							char_literal32=(Token)match(input,28,FOLLOW_28_in_nested_id369);  
							stream_28.add(char_literal32);
							dbg.location(64,16);
							pushFollow(FOLLOW_any_id_in_nested_id371);
							any_id33=any_id();
							state._fsp--;

							stream_any_id.add(any_id33.getTree());
							}
							break;

						default :
							break loop10;
						}
					}
					} finally {dbg.exitSubRule(10);}

					// AST REWRITE
					// elements: any_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 64:25: -> ( any_id )*
					{
						dbg.location(64,28);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:28: ( any_id )*
						while ( stream_any_id.hasNext() ) {
							dbg.location(64,28);
							adaptor.addChild(root_0, stream_any_id.nextTree());
						}
						stream_any_id.reset();

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(65, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fncall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:1: fncall : nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) ;
	public final SneakersParser.fncall_return fncall() throws RecognitionException {
		SneakersParser.fncall_return retval = new SneakersParser.fncall_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal36=null;
		ParserRuleReturnScope nested_id34 =null;
		ParserRuleReturnScope param35 =null;
		ParserRuleReturnScope param37 =null;

		CommonTree char_literal36_tree=null;
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try { dbg.enterRule(getGrammarFileName(), "fncall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:8: ( nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:10: nested_id param ( ( ',' )? param )*
			{
			dbg.location(67,10);
			pushFollow(FOLLOW_nested_id_in_fncall388);
			nested_id34=nested_id();
			state._fsp--;

			stream_nested_id.add(nested_id34.getTree());dbg.location(67,20);
			pushFollow(FOLLOW_param_in_fncall390);
			param35=param();
			state._fsp--;

			stream_param.add(param35.getTree());dbg.location(67,26);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:26: ( ( ',' )? param )*
			try { dbg.enterSubRule(13);

			loop13:
			while (true) {
				int alt13=2;
				try { dbg.enterDecision(13, decisionCanBacktrack[13]);

				switch ( input.LA(1) ) {
				case ID:
					{
					int LA13_2 = input.LA(2);
					if ( (LA13_2==EOF||LA13_2==ANONVAR||(LA13_2 >= ID && LA13_2 <= KEYWORD)||LA13_2==MUTID||(LA13_2 >= STRING && LA13_2 <= TYPEID)||(LA13_2 >= 24 && LA13_2 <= 31)||(LA13_2 >= 34 && LA13_2 <= 37)||(LA13_2 >= 40 && LA13_2 <= 43)) ) {
						alt13=1;
					}

					}
					break;
				case ANONVAR:
				case INT:
				case KEYWORD:
				case STRING:
				case 24:
				case 25:
				case 27:
				case 35:
				case 36:
				case 43:
					{
					alt13=1;
					}
					break;
				case MUTID:
				case TYPEID:
					{
					int LA13_4 = input.LA(2);
					if ( (LA13_4==EOF||LA13_4==ANONVAR||(LA13_4 >= ID && LA13_4 <= KEYWORD)||LA13_4==MUTID||(LA13_4 >= STRING && LA13_4 <= TYPEID)||(LA13_4 >= 24 && LA13_4 <= 28)||(LA13_4 >= 30 && LA13_4 <= 31)||(LA13_4 >= 34 && LA13_4 <= 37)||(LA13_4 >= 40 && LA13_4 <= 43)) ) {
						alt13=1;
					}

					}
					break;
				}
				} finally {dbg.exitDecision(13);}

				switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:27: ( ',' )? param
					{
					dbg.location(67,27);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:27: ( ',' )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==27) ) {
						alt12=1;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:27: ','
							{
							dbg.location(67,27);
							char_literal36=(Token)match(input,27,FOLLOW_27_in_fncall393);  
							stream_27.add(char_literal36);

							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(67,32);
					pushFollow(FOLLOW_param_in_fncall396);
					param37=param();
					state._fsp--;

					stream_param.add(param37.getTree());
					}
					break;

				default :
					break loop13;
				}
			}
			} finally {dbg.exitSubRule(13);}

			// AST REWRITE
			// elements: param, nested_id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 67:40: -> ^( FNCALL nested_id ( param )* )
			{
				dbg.location(67,43);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:43: ^( FNCALL nested_id ( param )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(67,45);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FNCALL, "FNCALL"), root_1);
				dbg.location(67,52);
				adaptor.addChild(root_1, stream_nested_id.nextTree());dbg.location(67,62);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:62: ( param )*
				while ( stream_param.hasNext() ) {
					dbg.location(67,62);
					adaptor.addChild(root_1, stream_param.nextTree());
				}
				stream_param.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(68, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "param"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:1: param : ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) );
	public final SneakersParser.param_return param() throws RecognitionException {
		SneakersParser.param_return retval = new SneakersParser.param_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID38=null;
		Token char_literal39=null;
		ParserRuleReturnScope expr40 =null;
		ParserRuleReturnScope expr41 =null;

		CommonTree ID38_tree=null;
		CommonTree char_literal39_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "param");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:7: ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) )
			int alt14=2;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==ID) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==29) ) {
					alt14=1;
				}
				else if ( (LA14_1==EOF||LA14_1==ANONVAR||(LA14_1 >= ID && LA14_1 <= KEYWORD)||LA14_1==MUTID||(LA14_1 >= STRING && LA14_1 <= TYPEID)||(LA14_1 >= 24 && LA14_1 <= 28)||(LA14_1 >= 30 && LA14_1 <= 31)||(LA14_1 >= 34 && LA14_1 <= 37)||(LA14_1 >= 40 && LA14_1 <= 43)) ) {
					alt14=2;
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
			else if ( (LA14_0==ANONVAR||(LA14_0 >= INT && LA14_0 <= KEYWORD)||LA14_0==MUTID||(LA14_0 >= STRING && LA14_0 <= TYPEID)||(LA14_0 >= 24 && LA14_0 <= 25)||(LA14_0 >= 35 && LA14_0 <= 36)||LA14_0==43) ) {
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:9: ID ':' expr
					{
					dbg.location(70,9);
					ID38=(Token)match(input,ID,FOLLOW_ID_in_param419);  
					stream_ID.add(ID38);
					dbg.location(70,12);
					char_literal39=(Token)match(input,29,FOLLOW_29_in_param421);  
					stream_29.add(char_literal39);
					dbg.location(70,16);
					pushFollow(FOLLOW_expr_in_param423);
					expr40=expr();
					state._fsp--;

					stream_expr.add(expr40.getTree());
					// AST REWRITE
					// elements: ID, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 70:21: -> ^( PARAM ID expr )
					{
						dbg.location(70,24);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:24: ^( PARAM ID expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(70,26);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);
						dbg.location(70,32);
						adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(70,35);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:71:4: expr
					{
					dbg.location(71,4);
					pushFollow(FOLLOW_expr_in_param438);
					expr41=expr();
					state._fsp--;

					stream_expr.add(expr41.getTree());
					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 71:9: -> ^( PARAM expr )
					{
						dbg.location(71,12);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:71:12: ^( PARAM expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(71,14);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);
						dbg.location(71,20);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(72, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "paramtype"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:1: paramtype : ( TYPEID | '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ^( PARAMTYPEFN ( TYPEID )+ ) | '(' ')' ':' TYPEID -> ^( PARAMTYPEFN TYPEID ) );
	public final SneakersParser.paramtype_return paramtype() throws RecognitionException {
		SneakersParser.paramtype_return retval = new SneakersParser.paramtype_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TYPEID42=null;
		Token char_literal43=null;
		Token TYPEID44=null;
		Token char_literal45=null;
		Token TYPEID46=null;
		Token char_literal47=null;
		Token char_literal48=null;
		Token TYPEID49=null;
		Token char_literal50=null;
		Token char_literal51=null;
		Token char_literal52=null;
		Token TYPEID53=null;

		CommonTree TYPEID42_tree=null;
		CommonTree char_literal43_tree=null;
		CommonTree TYPEID44_tree=null;
		CommonTree char_literal45_tree=null;
		CommonTree TYPEID46_tree=null;
		CommonTree char_literal47_tree=null;
		CommonTree char_literal48_tree=null;
		CommonTree TYPEID49_tree=null;
		CommonTree char_literal50_tree=null;
		CommonTree char_literal51_tree=null;
		CommonTree char_literal52_tree=null;
		CommonTree TYPEID53_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

		try { dbg.enterRule(getGrammarFileName(), "paramtype");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:11: ( TYPEID | '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ^( PARAMTYPEFN ( TYPEID )+ ) | '(' ')' ':' TYPEID -> ^( PARAMTYPEFN TYPEID ) )
			int alt16=3;
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==TYPEID) ) {
				alt16=1;
			}
			else if ( (LA16_0==25) ) {
				int LA16_2 = input.LA(2);
				if ( (LA16_2==TYPEID) ) {
					alt16=2;
				}
				else if ( (LA16_2==26) ) {
					alt16=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:14: TYPEID
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(74,14);
					TYPEID42=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype457); 
					TYPEID42_tree = (CommonTree)adaptor.create(TYPEID42);
					adaptor.addChild(root_0, TYPEID42_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:4: '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID
					{
					dbg.location(75,4);
					char_literal43=(Token)match(input,25,FOLLOW_25_in_paramtype462);  
					stream_25.add(char_literal43);
					dbg.location(75,8);
					TYPEID44=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype464);  
					stream_TYPEID.add(TYPEID44);
					dbg.location(75,15);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:15: ( ',' TYPEID )*
					try { dbg.enterSubRule(15);

					loop15:
					while (true) {
						int alt15=2;
						try { dbg.enterDecision(15, decisionCanBacktrack[15]);

						int LA15_0 = input.LA(1);
						if ( (LA15_0==27) ) {
							alt15=1;
						}

						} finally {dbg.exitDecision(15);}

						switch (alt15) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:16: ',' TYPEID
							{
							dbg.location(75,16);
							char_literal45=(Token)match(input,27,FOLLOW_27_in_paramtype467);  
							stream_27.add(char_literal45);
							dbg.location(75,20);
							TYPEID46=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype469);  
							stream_TYPEID.add(TYPEID46);

							}
							break;

						default :
							break loop15;
						}
					}
					} finally {dbg.exitSubRule(15);}
					dbg.location(75,29);
					char_literal47=(Token)match(input,26,FOLLOW_26_in_paramtype473);  
					stream_26.add(char_literal47);
					dbg.location(75,33);
					char_literal48=(Token)match(input,29,FOLLOW_29_in_paramtype475);  
					stream_29.add(char_literal48);
					dbg.location(75,37);
					TYPEID49=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype477);  
					stream_TYPEID.add(TYPEID49);

					// AST REWRITE
					// elements: TYPEID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 75:44: -> ^( PARAMTYPEFN ( TYPEID )+ )
					{
						dbg.location(75,47);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:47: ^( PARAMTYPEFN ( TYPEID )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(75,49);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMTYPEFN, "PARAMTYPEFN"), root_1);
						dbg.location(75,61);
						if ( !(stream_TYPEID.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_TYPEID.hasNext() ) {
							dbg.location(75,61);
							adaptor.addChild(root_1, stream_TYPEID.nextNode());
						}
						stream_TYPEID.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:4: '(' ')' ':' TYPEID
					{
					dbg.location(76,4);
					char_literal50=(Token)match(input,25,FOLLOW_25_in_paramtype491);  
					stream_25.add(char_literal50);
					dbg.location(76,8);
					char_literal51=(Token)match(input,26,FOLLOW_26_in_paramtype493);  
					stream_26.add(char_literal51);
					dbg.location(76,12);
					char_literal52=(Token)match(input,29,FOLLOW_29_in_paramtype495);  
					stream_29.add(char_literal52);
					dbg.location(76,16);
					TYPEID53=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype497);  
					stream_TYPEID.add(TYPEID53);

					// AST REWRITE
					// elements: TYPEID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 76:23: -> ^( PARAMTYPEFN TYPEID )
					{
						dbg.location(76,26);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:26: ^( PARAMTYPEFN TYPEID )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(76,28);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMTYPEFN, "PARAMTYPEFN"), root_1);
						dbg.location(76,40);
						adaptor.addChild(root_1, stream_TYPEID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(77, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fnparam"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:79:1: fnparam : ID ':' paramtype -> ^( FNPARAM ID paramtype ) ;
	public final SneakersParser.fnparam_return fnparam() throws RecognitionException {
		SneakersParser.fnparam_return retval = new SneakersParser.fnparam_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID54=null;
		Token char_literal55=null;
		ParserRuleReturnScope paramtype56 =null;

		CommonTree ID54_tree=null;
		CommonTree char_literal55_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_paramtype=new RewriteRuleSubtreeStream(adaptor,"rule paramtype");

		try { dbg.enterRule(getGrammarFileName(), "fnparam");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:79:9: ( ID ':' paramtype -> ^( FNPARAM ID paramtype ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:79:11: ID ':' paramtype
			{
			dbg.location(79,11);
			ID54=(Token)match(input,ID,FOLLOW_ID_in_fnparam516);  
			stream_ID.add(ID54);
			dbg.location(79,14);
			char_literal55=(Token)match(input,29,FOLLOW_29_in_fnparam518);  
			stream_29.add(char_literal55);
			dbg.location(79,18);
			pushFollow(FOLLOW_paramtype_in_fnparam520);
			paramtype56=paramtype();
			state._fsp--;

			stream_paramtype.add(paramtype56.getTree());
			// AST REWRITE
			// elements: paramtype, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 79:28: -> ^( FNPARAM ID paramtype )
			{
				dbg.location(79,31);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:79:31: ^( FNPARAM ID paramtype )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(79,33);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FNPARAM, "FNPARAM"), root_1);
				dbg.location(79,41);
				adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(79,44);
				adaptor.addChild(root_1, stream_paramtype.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(80, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "anonfn"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );
	public final SneakersParser.anonfn_return anonfn() throws RecognitionException {
		SneakersParser.anonfn_return retval = new SneakersParser.anonfn_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal57=null;
		Token char_literal58=null;
		Token char_literal60=null;
		Token char_literal61=null;
		Token char_literal62=null;
		Token char_literal64=null;
		ParserRuleReturnScope fncall59 =null;
		ParserRuleReturnScope nested_id63 =null;

		CommonTree char_literal57_tree=null;
		CommonTree char_literal58_tree=null;
		CommonTree char_literal60_tree=null;
		CommonTree char_literal61_tree=null;
		CommonTree char_literal62_tree=null;
		CommonTree char_literal64_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try { dbg.enterRule(getGrammarFileName(), "anonfn");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:8: ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) )
			int alt17=2;
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			try {
				isCyclicDecision = true;
				alt17 = dfa17.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:10: '#' '[' fncall ']'
					{
					dbg.location(82,10);
					char_literal57=(Token)match(input,24,FOLLOW_24_in_anonfn540);  
					stream_24.add(char_literal57);
					dbg.location(82,14);
					char_literal58=(Token)match(input,36,FOLLOW_36_in_anonfn542);  
					stream_36.add(char_literal58);
					dbg.location(82,18);
					pushFollow(FOLLOW_fncall_in_anonfn544);
					fncall59=fncall();
					state._fsp--;

					stream_fncall.add(fncall59.getTree());dbg.location(82,25);
					char_literal60=(Token)match(input,37,FOLLOW_37_in_anonfn546);  
					stream_37.add(char_literal60);

					// AST REWRITE
					// elements: fncall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 82:29: -> ^( ANONFN fncall )
					{
						dbg.location(82,32);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:32: ^( ANONFN fncall )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(82,34);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANONFN, "ANONFN"), root_1);
						dbg.location(82,41);
						adaptor.addChild(root_1, stream_fncall.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:4: '#' '[' nested_id ']'
					{
					dbg.location(83,4);
					char_literal61=(Token)match(input,24,FOLLOW_24_in_anonfn559);  
					stream_24.add(char_literal61);
					dbg.location(83,8);
					char_literal62=(Token)match(input,36,FOLLOW_36_in_anonfn561);  
					stream_36.add(char_literal62);
					dbg.location(83,12);
					pushFollow(FOLLOW_nested_id_in_anonfn563);
					nested_id63=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id63.getTree());dbg.location(83,22);
					char_literal64=(Token)match(input,37,FOLLOW_37_in_anonfn565);  
					stream_37.add(char_literal64);

					// AST REWRITE
					// elements: nested_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 83:26: -> ^( ANONFN nested_id )
					{
						dbg.location(83,29);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:29: ^( ANONFN nested_id )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(83,31);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANONFN, "ANONFN"), root_1);
						dbg.location(83,38);
						adaptor.addChild(root_1, stream_nested_id.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(84, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "blockdecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:1: blockdecl : ( '(' ')' ( ':' TYPEID )? contained_block -> ^( BLOCKDECL ( TYPEID )? contained_block ) | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block -> ^( BLOCKDECL ( fnparam )* ( TYPEID )? contained_block ) );
	public final SneakersParser.blockdecl_return blockdecl() throws RecognitionException {
		SneakersParser.blockdecl_return retval = new SneakersParser.blockdecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal65=null;
		Token char_literal66=null;
		Token char_literal67=null;
		Token TYPEID68=null;
		Token char_literal70=null;
		Token char_literal72=null;
		Token char_literal74=null;
		Token char_literal75=null;
		Token TYPEID76=null;
		ParserRuleReturnScope contained_block69 =null;
		ParserRuleReturnScope fnparam71 =null;
		ParserRuleReturnScope fnparam73 =null;
		ParserRuleReturnScope contained_block77 =null;

		CommonTree char_literal65_tree=null;
		CommonTree char_literal66_tree=null;
		CommonTree char_literal67_tree=null;
		CommonTree TYPEID68_tree=null;
		CommonTree char_literal70_tree=null;
		CommonTree char_literal72_tree=null;
		CommonTree char_literal74_tree=null;
		CommonTree char_literal75_tree=null;
		CommonTree TYPEID76_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_fnparam=new RewriteRuleSubtreeStream(adaptor,"rule fnparam");

		try { dbg.enterRule(getGrammarFileName(), "blockdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:2: ( '(' ')' ( ':' TYPEID )? contained_block -> ^( BLOCKDECL ( TYPEID )? contained_block ) | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block -> ^( BLOCKDECL ( fnparam )* ( TYPEID )? contained_block ) )
			int alt22=2;
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==25) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==26) ) {
					alt22=1;
				}
				else if ( (LA22_1==ID) ) {
					alt22=2;
				}

				else {
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:4: '(' ')' ( ':' TYPEID )? contained_block
					{
					dbg.location(87,4);
					char_literal65=(Token)match(input,25,FOLLOW_25_in_blockdecl584);  
					stream_25.add(char_literal65);
					dbg.location(87,8);
					char_literal66=(Token)match(input,26,FOLLOW_26_in_blockdecl586);  
					stream_26.add(char_literal66);
					dbg.location(87,12);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:12: ( ':' TYPEID )?
					int alt18=2;
					try { dbg.enterSubRule(18);
					try { dbg.enterDecision(18, decisionCanBacktrack[18]);

					int LA18_0 = input.LA(1);
					if ( (LA18_0==29) ) {
						alt18=1;
					}
					} finally {dbg.exitDecision(18);}

					switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:13: ':' TYPEID
							{
							dbg.location(87,13);
							char_literal67=(Token)match(input,29,FOLLOW_29_in_blockdecl589);  
							stream_29.add(char_literal67);
							dbg.location(87,17);
							TYPEID68=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl591);  
							stream_TYPEID.add(TYPEID68);

							}
							break;

					}
					} finally {dbg.exitSubRule(18);}
					dbg.location(87,26);
					pushFollow(FOLLOW_contained_block_in_blockdecl595);
					contained_block69=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block69.getTree());
					// AST REWRITE
					// elements: contained_block, TYPEID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 87:42: -> ^( BLOCKDECL ( TYPEID )? contained_block )
					{
						dbg.location(87,45);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:45: ^( BLOCKDECL ( TYPEID )? contained_block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(87,47);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCKDECL, "BLOCKDECL"), root_1);
						dbg.location(87,57);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:57: ( TYPEID )?
						if ( stream_TYPEID.hasNext() ) {
							dbg.location(87,57);
							adaptor.addChild(root_1, stream_TYPEID.nextNode());
						}
						stream_TYPEID.reset();
						dbg.location(87,65);
						adaptor.addChild(root_1, stream_contained_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:4: '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block
					{
					dbg.location(88,4);
					char_literal70=(Token)match(input,25,FOLLOW_25_in_blockdecl611);  
					stream_25.add(char_literal70);
					dbg.location(88,8);
					pushFollow(FOLLOW_fnparam_in_blockdecl613);
					fnparam71=fnparam();
					state._fsp--;

					stream_fnparam.add(fnparam71.getTree());dbg.location(88,16);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:16: ( ( ',' )? fnparam )*
					try { dbg.enterSubRule(20);

					loop20:
					while (true) {
						int alt20=2;
						try { dbg.enterDecision(20, decisionCanBacktrack[20]);

						int LA20_0 = input.LA(1);
						if ( (LA20_0==ID||LA20_0==27) ) {
							alt20=1;
						}

						} finally {dbg.exitDecision(20);}

						switch (alt20) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:17: ( ',' )? fnparam
							{
							dbg.location(88,17);
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:17: ( ',' )?
							int alt19=2;
							try { dbg.enterSubRule(19);
							try { dbg.enterDecision(19, decisionCanBacktrack[19]);

							int LA19_0 = input.LA(1);
							if ( (LA19_0==27) ) {
								alt19=1;
							}
							} finally {dbg.exitDecision(19);}

							switch (alt19) {
								case 1 :
									dbg.enterAlt(1);

									// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:17: ','
									{
									dbg.location(88,17);
									char_literal72=(Token)match(input,27,FOLLOW_27_in_blockdecl616);  
									stream_27.add(char_literal72);

									}
									break;

							}
							} finally {dbg.exitSubRule(19);}
							dbg.location(88,22);
							pushFollow(FOLLOW_fnparam_in_blockdecl619);
							fnparam73=fnparam();
							state._fsp--;

							stream_fnparam.add(fnparam73.getTree());
							}
							break;

						default :
							break loop20;
						}
					}
					} finally {dbg.exitSubRule(20);}
					dbg.location(88,32);
					char_literal74=(Token)match(input,26,FOLLOW_26_in_blockdecl623);  
					stream_26.add(char_literal74);
					dbg.location(88,36);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:36: ( ':' TYPEID )?
					int alt21=2;
					try { dbg.enterSubRule(21);
					try { dbg.enterDecision(21, decisionCanBacktrack[21]);

					int LA21_0 = input.LA(1);
					if ( (LA21_0==29) ) {
						alt21=1;
					}
					} finally {dbg.exitDecision(21);}

					switch (alt21) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:37: ':' TYPEID
							{
							dbg.location(88,37);
							char_literal75=(Token)match(input,29,FOLLOW_29_in_blockdecl626);  
							stream_29.add(char_literal75);
							dbg.location(88,41);
							TYPEID76=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl628);  
							stream_TYPEID.add(TYPEID76);

							}
							break;

					}
					} finally {dbg.exitSubRule(21);}
					dbg.location(88,50);
					pushFollow(FOLLOW_contained_block_in_blockdecl632);
					contained_block77=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block77.getTree());
					// AST REWRITE
					// elements: fnparam, contained_block, TYPEID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 88:66: -> ^( BLOCKDECL ( fnparam )* ( TYPEID )? contained_block )
					{
						dbg.location(88,69);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:69: ^( BLOCKDECL ( fnparam )* ( TYPEID )? contained_block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(88,71);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCKDECL, "BLOCKDECL"), root_1);
						dbg.location(88,81);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:81: ( fnparam )*
						while ( stream_fnparam.hasNext() ) {
							dbg.location(88,81);
							adaptor.addChild(root_1, stream_fnparam.nextTree());
						}
						stream_fnparam.reset();
						dbg.location(88,90);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:90: ( TYPEID )?
						if ( stream_TYPEID.hasNext() ) {
							dbg.location(88,90);
							adaptor.addChild(root_1, stream_TYPEID.nextNode());
						}
						stream_TYPEID.reset();
						dbg.location(88,98);
						adaptor.addChild(root_1, stream_contained_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(89, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fndecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:1: fndecl : '#' blockdecl -> ^( FNDECL blockdecl ) ;
	public final SneakersParser.fndecl_return fndecl() throws RecognitionException {
		SneakersParser.fndecl_return retval = new SneakersParser.fndecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal78=null;
		ParserRuleReturnScope blockdecl79 =null;

		CommonTree char_literal78_tree=null;
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try { dbg.enterRule(getGrammarFileName(), "fndecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(91, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:8: ( '#' blockdecl -> ^( FNDECL blockdecl ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:10: '#' blockdecl
			{
			dbg.location(91,10);
			char_literal78=(Token)match(input,24,FOLLOW_24_in_fndecl656);  
			stream_24.add(char_literal78);
			dbg.location(91,14);
			pushFollow(FOLLOW_blockdecl_in_fndecl658);
			blockdecl79=blockdecl();
			state._fsp--;

			stream_blockdecl.add(blockdecl79.getTree());
			// AST REWRITE
			// elements: blockdecl
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 91:24: -> ^( FNDECL blockdecl )
			{
				dbg.location(91,27);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:27: ^( FNDECL blockdecl )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(91,29);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FNDECL, "FNDECL"), root_1);
				dbg.location(91,36);
				adaptor.addChild(root_1, stream_blockdecl.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(92, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mutdecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:94:1: mutdecl : '@' blockdecl -> ^( MUTDECL blockdecl ) ;
	public final SneakersParser.mutdecl_return mutdecl() throws RecognitionException {
		SneakersParser.mutdecl_return retval = new SneakersParser.mutdecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal80=null;
		ParserRuleReturnScope blockdecl81 =null;

		CommonTree char_literal80_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try { dbg.enterRule(getGrammarFileName(), "mutdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(94, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:94:9: ( '@' blockdecl -> ^( MUTDECL blockdecl ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:94:11: '@' blockdecl
			{
			dbg.location(94,11);
			char_literal80=(Token)match(input,35,FOLLOW_35_in_mutdecl676);  
			stream_35.add(char_literal80);
			dbg.location(94,15);
			pushFollow(FOLLOW_blockdecl_in_mutdecl678);
			blockdecl81=blockdecl();
			state._fsp--;

			stream_blockdecl.add(blockdecl81.getTree());
			// AST REWRITE
			// elements: blockdecl
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 94:25: -> ^( MUTDECL blockdecl )
			{
				dbg.location(94,28);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:94:28: ^( MUTDECL blockdecl )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(94,30);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MUTDECL, "MUTDECL"), root_1);
				dbg.location(94,38);
				adaptor.addChild(root_1, stream_blockdecl.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(95, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:97:1: expr : ( index_expr | dict | fndecl | mutdecl | anonfn | array );
	public final SneakersParser.expr_return expr() throws RecognitionException {
		SneakersParser.expr_return retval = new SneakersParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope index_expr82 =null;
		ParserRuleReturnScope dict83 =null;
		ParserRuleReturnScope fndecl84 =null;
		ParserRuleReturnScope mutdecl85 =null;
		ParserRuleReturnScope anonfn86 =null;
		ParserRuleReturnScope array87 =null;


		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(97, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:97:6: ( index_expr | dict | fndecl | mutdecl | anonfn | array )
			int alt23=6;
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

			switch ( input.LA(1) ) {
			case ANONVAR:
			case ID:
			case INT:
			case KEYWORD:
			case MUTID:
			case STRING:
			case TYPEID:
			case 25:
				{
				alt23=1;
				}
				break;
			case 43:
				{
				alt23=2;
				}
				break;
			case 24:
				{
				int LA23_3 = input.LA(2);
				if ( (LA23_3==36) ) {
					alt23=5;
				}
				else if ( (LA23_3==25) ) {
					alt23=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 35:
				{
				alt23=4;
				}
				break;
			case 36:
				{
				alt23=6;
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:97:8: index_expr
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(97,8);
					pushFollow(FOLLOW_index_expr_in_expr696);
					index_expr82=index_expr();
					state._fsp--;

					adaptor.addChild(root_0, index_expr82.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:98:4: dict
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(98,4);
					pushFollow(FOLLOW_dict_in_expr701);
					dict83=dict();
					state._fsp--;

					adaptor.addChild(root_0, dict83.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:4: fndecl
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(99,4);
					pushFollow(FOLLOW_fndecl_in_expr706);
					fndecl84=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl84.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:4: mutdecl
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(100,4);
					pushFollow(FOLLOW_mutdecl_in_expr711);
					mutdecl85=mutdecl();
					state._fsp--;

					adaptor.addChild(root_0, mutdecl85.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:101:4: anonfn
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(101,4);
					pushFollow(FOLLOW_anonfn_in_expr716);
					anonfn86=anonfn();
					state._fsp--;

					adaptor.addChild(root_0, anonfn86.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:102:4: array
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(102,4);
					pushFollow(FOLLOW_array_in_expr721);
					array87=array();
					state._fsp--;

					adaptor.addChild(root_0, array87.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(103, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "standalone_fncall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:105:1: standalone_fncall : '(' fncall ')' -> fncall ;
	public final SneakersParser.standalone_fncall_return standalone_fncall() throws RecognitionException {
		SneakersParser.standalone_fncall_return retval = new SneakersParser.standalone_fncall_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal88=null;
		Token char_literal90=null;
		ParserRuleReturnScope fncall89 =null;

		CommonTree char_literal88_tree=null;
		CommonTree char_literal90_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");

		try { dbg.enterRule(getGrammarFileName(), "standalone_fncall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(105, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:2: ( '(' fncall ')' -> fncall )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:4: '(' fncall ')'
			{
			dbg.location(106,4);
			char_literal88=(Token)match(input,25,FOLLOW_25_in_standalone_fncall732);  
			stream_25.add(char_literal88);
			dbg.location(106,8);
			pushFollow(FOLLOW_fncall_in_standalone_fncall734);
			fncall89=fncall();
			state._fsp--;

			stream_fncall.add(fncall89.getTree());dbg.location(106,15);
			char_literal90=(Token)match(input,26,FOLLOW_26_in_standalone_fncall736);  
			stream_26.add(char_literal90);

			// AST REWRITE
			// elements: fncall
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 106:19: -> fncall
			{
				dbg.location(106,22);
				adaptor.addChild(root_0, stream_fncall.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(107, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mutcall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );
	public final SneakersParser.mutcall_return mutcall() throws RecognitionException {
		SneakersParser.mutcall_return retval = new SneakersParser.mutcall_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal91=null;
		Token char_literal93=null;
		Token char_literal94=null;
		Token char_literal96=null;
		ParserRuleReturnScope nested_id92 =null;
		ParserRuleReturnScope fncall95 =null;

		CommonTree char_literal91_tree=null;
		CommonTree char_literal93_tree=null;
		CommonTree char_literal94_tree=null;
		CommonTree char_literal96_tree=null;
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try { dbg.enterRule(getGrammarFileName(), "mutcall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(109, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:9: ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall )
			int alt24=2;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			try {
				isCyclicDecision = true;
				alt24 = dfa24.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:11: '<' nested_id '>'
					{
					dbg.location(109,11);
					char_literal91=(Token)match(input,31,FOLLOW_31_in_mutcall750);  
					stream_31.add(char_literal91);
					dbg.location(109,15);
					pushFollow(FOLLOW_nested_id_in_mutcall752);
					nested_id92=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id92.getTree());dbg.location(109,25);
					char_literal93=(Token)match(input,34,FOLLOW_34_in_mutcall754);  
					stream_34.add(char_literal93);

					// AST REWRITE
					// elements: nested_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 109:29: -> nested_id
					{
						dbg.location(109,32);
						adaptor.addChild(root_0, stream_nested_id.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:4: '<' fncall '>'
					{
					dbg.location(110,4);
					char_literal94=(Token)match(input,31,FOLLOW_31_in_mutcall763);  
					stream_31.add(char_literal94);
					dbg.location(110,8);
					pushFollow(FOLLOW_fncall_in_mutcall765);
					fncall95=fncall();
					state._fsp--;

					stream_fncall.add(fncall95.getTree());dbg.location(110,15);
					char_literal96=(Token)match(input,34,FOLLOW_34_in_mutcall767);  
					stream_34.add(char_literal96);

					// AST REWRITE
					// elements: fncall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 110:19: -> fncall
					{
						dbg.location(110,22);
						adaptor.addChild(root_0, stream_fncall.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(111, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "index_expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:1: index_expr : ( KEYWORD | INT | STRING | nested_id | standalone_fncall );
	public final SneakersParser.index_expr_return index_expr() throws RecognitionException {
		SneakersParser.index_expr_return retval = new SneakersParser.index_expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KEYWORD97=null;
		Token INT98=null;
		Token STRING99=null;
		ParserRuleReturnScope nested_id100 =null;
		ParserRuleReturnScope standalone_fncall101 =null;

		CommonTree KEYWORD97_tree=null;
		CommonTree INT98_tree=null;
		CommonTree STRING99_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "index_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(113, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:114:2: ( KEYWORD | INT | STRING | nested_id | standalone_fncall )
			int alt25=5;
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			switch ( input.LA(1) ) {
			case KEYWORD:
				{
				alt25=1;
				}
				break;
			case INT:
				{
				alt25=2;
				}
				break;
			case STRING:
				{
				alt25=3;
				}
				break;
			case ANONVAR:
			case ID:
			case MUTID:
			case TYPEID:
				{
				alt25=4;
				}
				break;
			case 25:
				{
				alt25=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:114:4: KEYWORD
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(114,4);
					KEYWORD97=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_index_expr782); 
					KEYWORD97_tree = (CommonTree)adaptor.create(KEYWORD97);
					adaptor.addChild(root_0, KEYWORD97_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:115:4: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(115,4);
					INT98=(Token)match(input,INT,FOLLOW_INT_in_index_expr787); 
					INT98_tree = (CommonTree)adaptor.create(INT98);
					adaptor.addChild(root_0, INT98_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:4: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(116,4);
					STRING99=(Token)match(input,STRING,FOLLOW_STRING_in_index_expr792); 
					STRING99_tree = (CommonTree)adaptor.create(STRING99);
					adaptor.addChild(root_0, STRING99_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:117:4: nested_id
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(117,4);
					pushFollow(FOLLOW_nested_id_in_index_expr797);
					nested_id100=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id100.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:4: standalone_fncall
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(118,4);
					pushFollow(FOLLOW_standalone_fncall_in_index_expr802);
					standalone_fncall101=standalone_fncall();
					state._fsp--;

					adaptor.addChild(root_0, standalone_fncall101.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(119, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dict_pair"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:1: dict_pair : index_expr '=>' expr -> index_expr expr ;
	public final SneakersParser.dict_pair_return dict_pair() throws RecognitionException {
		SneakersParser.dict_pair_return retval = new SneakersParser.dict_pair_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal103=null;
		ParserRuleReturnScope index_expr102 =null;
		ParserRuleReturnScope expr104 =null;

		CommonTree string_literal103_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "dict_pair");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:2: ( index_expr '=>' expr -> index_expr expr )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:4: index_expr '=>' expr
			{
			dbg.location(122,4);
			pushFollow(FOLLOW_index_expr_in_dict_pair814);
			index_expr102=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr102.getTree());dbg.location(122,15);
			string_literal103=(Token)match(input,33,FOLLOW_33_in_dict_pair816);  
			stream_33.add(string_literal103);
			dbg.location(122,20);
			pushFollow(FOLLOW_expr_in_dict_pair818);
			expr104=expr();
			state._fsp--;

			stream_expr.add(expr104.getTree());
			// AST REWRITE
			// elements: expr, index_expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 122:25: -> index_expr expr
			{
				dbg.location(122,28);
				adaptor.addChild(root_0, stream_index_expr.nextTree());dbg.location(122,39);
				adaptor.addChild(root_0, stream_expr.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(123, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dict"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:1: dict : '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) ;
	public final SneakersParser.dict_return dict() throws RecognitionException {
		SneakersParser.dict_return retval = new SneakersParser.dict_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal105=null;
		Token char_literal107=null;
		Token char_literal109=null;
		ParserRuleReturnScope dict_pair106 =null;
		ParserRuleReturnScope dict_pair108 =null;

		CommonTree char_literal105_tree=null;
		CommonTree char_literal107_tree=null;
		CommonTree char_literal109_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_dict_pair=new RewriteRuleSubtreeStream(adaptor,"rule dict_pair");

		try { dbg.enterRule(getGrammarFileName(), "dict");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(125, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:6: ( '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:8: '{' ( dict_pair )? ( ',' dict_pair )* '}'
			{
			dbg.location(125,8);
			char_literal105=(Token)match(input,43,FOLLOW_43_in_dict834);  
			stream_43.add(char_literal105);
			dbg.location(125,12);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:12: ( dict_pair )?
			int alt26=2;
			try { dbg.enterSubRule(26);
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( (LA26_0==ANONVAR||(LA26_0 >= ID && LA26_0 <= KEYWORD)||LA26_0==MUTID||(LA26_0 >= STRING && LA26_0 <= TYPEID)||LA26_0==25) ) {
				alt26=1;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:13: dict_pair
					{
					dbg.location(125,13);
					pushFollow(FOLLOW_dict_pair_in_dict837);
					dict_pair106=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair106.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(26);}
			dbg.location(125,25);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:25: ( ',' dict_pair )*
			try { dbg.enterSubRule(27);

			loop27:
			while (true) {
				int alt27=2;
				try { dbg.enterDecision(27, decisionCanBacktrack[27]);

				int LA27_0 = input.LA(1);
				if ( (LA27_0==27) ) {
					alt27=1;
				}

				} finally {dbg.exitDecision(27);}

				switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:26: ',' dict_pair
					{
					dbg.location(125,26);
					char_literal107=(Token)match(input,27,FOLLOW_27_in_dict842);  
					stream_27.add(char_literal107);
					dbg.location(125,30);
					pushFollow(FOLLOW_dict_pair_in_dict844);
					dict_pair108=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair108.getTree());
					}
					break;

				default :
					break loop27;
				}
			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(125,42);
			char_literal109=(Token)match(input,44,FOLLOW_44_in_dict848);  
			stream_44.add(char_literal109);

			// AST REWRITE
			// elements: dict_pair
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 125:46: -> ^( DICT ( dict_pair )* )
			{
				dbg.location(125,49);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:49: ^( DICT ( dict_pair )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(125,51);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DICT, "DICT"), root_1);
				dbg.location(125,56);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:56: ( dict_pair )*
				while ( stream_dict_pair.hasNext() ) {
					dbg.location(125,56);
					adaptor.addChild(root_1, stream_dict_pair.nextTree());
				}
				stream_dict_pair.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(126, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "contained_block"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:128:1: contained_block : '[' block ']' -> block ;
	public final SneakersParser.contained_block_return contained_block() throws RecognitionException {
		SneakersParser.contained_block_return retval = new SneakersParser.contained_block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal110=null;
		Token char_literal112=null;
		ParserRuleReturnScope block111 =null;

		CommonTree char_literal110_tree=null;
		CommonTree char_literal112_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try { dbg.enterRule(getGrammarFileName(), "contained_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(128, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:129:2: ( '[' block ']' -> block )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:129:4: '[' block ']'
			{
			dbg.location(129,4);
			char_literal110=(Token)match(input,36,FOLLOW_36_in_contained_block870);  
			stream_36.add(char_literal110);
			dbg.location(129,8);
			pushFollow(FOLLOW_block_in_contained_block872);
			block111=block();
			state._fsp--;

			stream_block.add(block111.getTree());dbg.location(129,14);
			char_literal112=(Token)match(input,37,FOLLOW_37_in_contained_block874);  
			stream_37.add(char_literal112);

			// AST REWRITE
			// elements: block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 129:18: -> block
			{
				dbg.location(129,21);
				adaptor.addChild(root_0, stream_block.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(130, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "array"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:132:1: array : '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) ;
	public final SneakersParser.array_return array() throws RecognitionException {
		SneakersParser.array_return retval = new SneakersParser.array_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal113=null;
		Token char_literal115=null;
		Token char_literal117=null;
		ParserRuleReturnScope expr114 =null;
		ParserRuleReturnScope expr116 =null;

		CommonTree char_literal113_tree=null;
		CommonTree char_literal115_tree=null;
		CommonTree char_literal117_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "array");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(132, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:132:7: ( '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:132:9: '[' ( expr )? ( ',' expr )* ']'
			{
			dbg.location(132,9);
			char_literal113=(Token)match(input,36,FOLLOW_36_in_array888);  
			stream_36.add(char_literal113);
			dbg.location(132,13);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:132:13: ( expr )?
			int alt28=2;
			try { dbg.enterSubRule(28);
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==ANONVAR||(LA28_0 >= ID && LA28_0 <= KEYWORD)||LA28_0==MUTID||(LA28_0 >= STRING && LA28_0 <= TYPEID)||(LA28_0 >= 24 && LA28_0 <= 25)||(LA28_0 >= 35 && LA28_0 <= 36)||LA28_0==43) ) {
				alt28=1;
			}
			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:132:13: expr
					{
					dbg.location(132,13);
					pushFollow(FOLLOW_expr_in_array890);
					expr114=expr();
					state._fsp--;

					stream_expr.add(expr114.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(28);}
			dbg.location(132,19);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:132:19: ( ',' expr )*
			try { dbg.enterSubRule(29);

			loop29:
			while (true) {
				int alt29=2;
				try { dbg.enterDecision(29, decisionCanBacktrack[29]);

				int LA29_0 = input.LA(1);
				if ( (LA29_0==27) ) {
					alt29=1;
				}

				} finally {dbg.exitDecision(29);}

				switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:132:20: ',' expr
					{
					dbg.location(132,20);
					char_literal115=(Token)match(input,27,FOLLOW_27_in_array894);  
					stream_27.add(char_literal115);
					dbg.location(132,24);
					pushFollow(FOLLOW_expr_in_array896);
					expr116=expr();
					state._fsp--;

					stream_expr.add(expr116.getTree());
					}
					break;

				default :
					break loop29;
				}
			}
			} finally {dbg.exitSubRule(29);}
			dbg.location(132,31);
			char_literal117=(Token)match(input,37,FOLLOW_37_in_array900);  
			stream_37.add(char_literal117);

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 132:35: -> ^( ARRAY ( expr )* )
			{
				dbg.location(132,38);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:132:38: ^( ARRAY ( expr )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(132,40);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);
				dbg.location(132,46);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:132:46: ( expr )*
				while ( stream_expr.hasNext() ) {
					dbg.location(132,46);
					adaptor.addChild(root_1, stream_expr.nextTree());
				}
				stream_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(133, 1);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "any_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:151:1: any_id : ( ID | TYPEID | MUTID );
	public final SneakersParser.any_id_return any_id() throws RecognitionException {
		SneakersParser.any_id_return retval = new SneakersParser.any_id_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set118=null;

		CommonTree set118_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "any_id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(151, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:152:2: ( ID | TYPEID | MUTID )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(152,2);
			set118=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==MUTID||input.LA(1)==TYPEID ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set118));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(155, 1);

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


	protected DFA3 dfa3 = new DFA3(this);
	protected DFA6 dfa6 = new DFA6(this);
	protected DFA17 dfa17 = new DFA17(this);
	protected DFA24 dfa24 = new DFA24(this);
	static final String DFA3_eotS =
		"\14\uffff";
	static final String DFA3_eofS =
		"\2\uffff\2\4\2\uffff\1\7\1\uffff\1\7\1\uffff\2\4";
	static final String DFA3_minS =
		"\1\52\3\5\1\uffff\1\15\1\5\1\uffff\1\5\1\15\2\5";
	static final String DFA3_maxS =
		"\1\52\3\53\1\uffff\1\26\1\53\1\uffff\1\53\1\26\2\53";
	static final String DFA3_acceptS =
		"\4\uffff\1\2\2\uffff\1\1\4\uffff";
	static final String DFA3_specialS =
		"\14\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1",
			"\1\2\7\uffff\1\3\2\4\1\uffff\1\3\3\uffff\1\4\1\3\1\uffff\2\4\11\uffff"+
			"\2\4\6\uffff\1\4",
			"\1\7\7\uffff\1\6\2\7\1\uffff\1\10\3\uffff\1\7\1\10\1\uffff\2\7\2\uffff"+
			"\1\5\1\uffff\2\4\3\uffff\2\7\3\uffff\3\4\1\7",
			"\1\7\7\uffff\1\6\2\7\1\uffff\1\10\3\uffff\1\7\1\10\1\uffff\2\7\2\uffff"+
			"\1\11\1\uffff\2\4\3\uffff\2\7\3\uffff\3\4\1\7",
			"",
			"\1\12\3\uffff\1\12\4\uffff\1\12",
			"\1\7\7\uffff\3\7\1\uffff\1\7\3\uffff\2\7\1\uffff\2\7\1\uffff\5\7\1\4"+
			"\2\uffff\2\7\3\uffff\4\7",
			"",
			"\1\7\7\uffff\3\7\1\uffff\1\7\3\uffff\2\7\1\uffff\2\7\1\uffff\2\7\1\uffff"+
			"\2\7\1\4\2\uffff\2\7\3\uffff\4\7",
			"\1\13\3\uffff\1\13\4\uffff\1\13",
			"\1\7\7\uffff\1\6\2\7\1\uffff\1\10\3\uffff\1\7\1\10\1\uffff\2\7\2\uffff"+
			"\1\5\1\uffff\2\4\3\uffff\2\7\3\uffff\3\4\1\7",
			"\1\7\7\uffff\1\6\2\7\1\uffff\1\10\3\uffff\1\7\1\10\1\uffff\2\7\2\uffff"+
			"\1\11\1\uffff\2\4\3\uffff\2\7\3\uffff\3\4\1\7"
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
			return "38:1: returnstat : ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA6_eotS =
		"\15\uffff";
	static final String DFA6_eofS =
		"\4\uffff\2\3\1\uffff\2\11\2\uffff\2\3";
	static final String DFA6_minS =
		"\1\15\1\40\1\5\1\uffff\2\5\1\15\2\5\1\uffff\1\15\2\5";
	static final String DFA6_maxS =
		"\1\26\1\40\1\53\1\uffff\2\53\1\26\2\53\1\uffff\1\26\2\53";
	static final String DFA6_acceptS =
		"\3\uffff\1\1\5\uffff\1\2\3\uffff";
	static final String DFA6_specialS =
		"\15\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\1\3\uffff\1\1\4\uffff\1\1",
			"\1\2",
			"\1\4\7\uffff\1\5\2\3\1\uffff\1\5\3\uffff\1\3\1\5\1\uffff\2\3\11\uffff"+
			"\2\3\6\uffff\1\3",
			"",
			"\1\11\7\uffff\1\7\2\11\1\uffff\1\10\3\uffff\1\11\1\10\1\uffff\2\11\2"+
			"\uffff\1\6\1\uffff\2\3\3\uffff\2\11\3\uffff\3\3\1\11",
			"\1\11\7\uffff\1\7\2\11\1\uffff\1\10\3\uffff\1\11\1\10\1\uffff\2\11\2"+
			"\uffff\1\12\1\uffff\2\3\3\uffff\2\11\3\uffff\3\3\1\11",
			"\1\13\3\uffff\1\13\4\uffff\1\13",
			"\1\11\7\uffff\3\11\1\uffff\1\11\3\uffff\2\11\1\uffff\2\11\1\uffff\5"+
			"\11\1\3\2\uffff\2\11\3\uffff\4\11",
			"\1\11\7\uffff\3\11\1\uffff\1\11\3\uffff\2\11\1\uffff\2\11\1\uffff\2"+
			"\11\1\uffff\2\11\1\3\2\uffff\2\11\3\uffff\4\11",
			"",
			"\1\14\3\uffff\1\14\4\uffff\1\14",
			"\1\11\7\uffff\1\7\2\11\1\uffff\1\10\3\uffff\1\11\1\10\1\uffff\2\11\2"+
			"\uffff\1\6\1\uffff\2\3\3\uffff\2\11\3\uffff\3\3\1\11",
			"\1\11\7\uffff\1\7\2\11\1\uffff\1\10\3\uffff\1\11\1\10\1\uffff\2\11\2"+
			"\uffff\1\12\1\uffff\2\3\3\uffff\2\11\3\uffff\3\3\1\11"
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
			return "48:1: assignment : ( any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA17_eotS =
		"\13\uffff";
	static final String DFA17_eofS =
		"\13\uffff";
	static final String DFA17_minS =
		"\1\30\1\44\3\5\1\15\2\uffff\1\15\2\5";
	static final String DFA17_maxS =
		"\1\30\1\44\1\26\2\53\1\26\2\uffff\1\26\2\53";
	static final String DFA17_acceptS =
		"\6\uffff\1\1\1\2\3\uffff";
	static final String DFA17_specialS =
		"\13\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\7\uffff\1\4\3\uffff\1\4\4\uffff\1\4",
			"\1\6\7\uffff\3\6\1\uffff\1\6\3\uffff\2\6\1\uffff\2\6\2\uffff\1\5\6\uffff"+
			"\2\6\1\7\5\uffff\1\6",
			"\1\6\7\uffff\3\6\1\uffff\1\6\3\uffff\2\6\1\uffff\2\6\2\uffff\1\10\6"+
			"\uffff\2\6\1\7\5\uffff\1\6",
			"\1\11\3\uffff\1\11\4\uffff\1\11",
			"",
			"",
			"\1\12\3\uffff\1\12\4\uffff\1\12",
			"\1\6\7\uffff\3\6\1\uffff\1\6\3\uffff\2\6\1\uffff\2\6\2\uffff\1\5\6\uffff"+
			"\2\6\1\7\5\uffff\1\6",
			"\1\6\7\uffff\3\6\1\uffff\1\6\3\uffff\2\6\1\uffff\2\6\2\uffff\1\10\6"+
			"\uffff\2\6\1\7\5\uffff\1\6"
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "82:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA24_eotS =
		"\12\uffff";
	static final String DFA24_eofS =
		"\12\uffff";
	static final String DFA24_minS =
		"\1\37\3\5\1\15\2\uffff\1\15\2\5";
	static final String DFA24_maxS =
		"\1\37\1\26\2\53\1\26\2\uffff\1\26\2\53";
	static final String DFA24_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA24_specialS =
		"\12\uffff}>";
	static final String[] DFA24_transitionS = {
			"\1\1",
			"\1\2\7\uffff\1\3\3\uffff\1\3\4\uffff\1\3",
			"\1\6\7\uffff\3\6\1\uffff\1\6\3\uffff\2\6\1\uffff\2\6\2\uffff\1\4\5\uffff"+
			"\1\5\2\6\6\uffff\1\6",
			"\1\6\7\uffff\3\6\1\uffff\1\6\3\uffff\2\6\1\uffff\2\6\2\uffff\1\7\5\uffff"+
			"\1\5\2\6\6\uffff\1\6",
			"\1\10\3\uffff\1\10\4\uffff\1\10",
			"",
			"",
			"\1\11\3\uffff\1\11\4\uffff\1\11",
			"\1\6\7\uffff\3\6\1\uffff\1\6\3\uffff\2\6\1\uffff\2\6\2\uffff\1\4\5\uffff"+
			"\1\5\2\6\6\uffff\1\6",
			"\1\6\7\uffff\3\6\1\uffff\1\6\3\uffff\2\6\1\uffff\2\6\2\uffff\1\7\5\uffff"+
			"\1\5\2\6\6\uffff\1\6"
	};

	static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
	static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
	static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
	static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
	static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
	static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
	static final short[][] DFA24_transition;

	static {
		int numStates = DFA24_transitionS.length;
		DFA24_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
		}
	}

	protected class DFA24 extends DFA {

		public DFA24(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 24;
			this.eot = DFA24_eot;
			this.eof = DFA24_eof;
			this.min = DFA24_min;
			this.max = DFA24_max;
			this.accept = DFA24_accept;
			this.special = DFA24_special;
			this.transition = DFA24_transition;
		}
		@Override
		public String getDescription() {
			return "109:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_block_in_prog97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_block109 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_block111 = new BitSet(new long[]{0x0000070080422002L});
	public static final BitSet FOLLOW_assignment_in_stat130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_stat140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutcall_in_stat145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_stat150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_returnstat161 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_fncall_in_returnstat163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_returnstat176 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_returnstat178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_ifstat196 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_ifstat200 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat204 = new BitSet(new long[]{0x000000C000000002L});
	public static final BitSet FOLLOW_39_in_ifstat210 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_ifstat214 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat218 = new BitSet(new long[]{0x000000C000000002L});
	public static final BitSet FOLLOW_38_in_ifstat226 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment268 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_assignment270 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_assignment272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment287 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_assignment289 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_fncall_in_assignment291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_defable312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_defable317 = new BitSet(new long[]{0x0000070080422000L});
	public static final BitSet FOLLOW_stat_in_defable319 = new BitSet(new long[]{0x0000070080422002L});
	public static final BitSet FOLLOW_KEYWORD_in_defdecl330 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_defdecl332 = new BitSet(new long[]{0x0000000001400000L});
	public static final BitSet FOLLOW_defable_in_defdecl334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANONVAR_in_nested_id347 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_nested_id350 = new BitSet(new long[]{0x0000000000422000L});
	public static final BitSet FOLLOW_any_id_in_nested_id352 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_any_id_in_nested_id366 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_nested_id369 = new BitSet(new long[]{0x0000000000422000L});
	public static final BitSet FOLLOW_any_id_in_nested_id371 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_nested_id_in_fncall388 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_param_in_fncall390 = new BitSet(new long[]{0x000008180B62E022L});
	public static final BitSet FOLLOW_27_in_fncall393 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_param_in_fncall396 = new BitSet(new long[]{0x000008180B62E022L});
	public static final BitSet FOLLOW_ID_in_param419 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_param421 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_param423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_param438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_paramtype462 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype464 = new BitSet(new long[]{0x000000000C000000L});
	public static final BitSet FOLLOW_27_in_paramtype467 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype469 = new BitSet(new long[]{0x000000000C000000L});
	public static final BitSet FOLLOW_26_in_paramtype473 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_paramtype475 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_paramtype491 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_paramtype493 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_paramtype495 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fnparam516 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_fnparam518 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_paramtype_in_fnparam520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_anonfn540 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_anonfn542 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_fncall_in_anonfn544 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_anonfn546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_anonfn559 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_anonfn561 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_nested_id_in_anonfn563 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_anonfn565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_blockdecl584 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_blockdecl586 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_29_in_blockdecl589 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl591 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_blockdecl611 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl613 = new BitSet(new long[]{0x000000000C002000L});
	public static final BitSet FOLLOW_27_in_blockdecl616 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl619 = new BitSet(new long[]{0x000000000C002000L});
	public static final BitSet FOLLOW_26_in_blockdecl623 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_29_in_blockdecl626 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl628 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_fndecl656 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_blockdecl_in_fndecl658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_mutdecl676 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_blockdecl_in_mutdecl678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_expr696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_expr706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutdecl_in_expr711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anonfn_in_expr716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_expr721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_standalone_fncall732 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_fncall_in_standalone_fncall734 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_standalone_fncall736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_mutcall750 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_nested_id_in_mutcall752 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_mutcall754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_mutcall763 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_fncall_in_mutcall765 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_mutcall767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_index_expr782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_index_expr787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_index_expr792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_index_expr797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standalone_fncall_in_index_expr802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_dict_pair814 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_dict_pair816 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_dict_pair818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_dict834 = new BitSet(new long[]{0x000010000A62E020L});
	public static final BitSet FOLLOW_dict_pair_in_dict837 = new BitSet(new long[]{0x0000100008000000L});
	public static final BitSet FOLLOW_27_in_dict842 = new BitSet(new long[]{0x000000000262E020L});
	public static final BitSet FOLLOW_dict_pair_in_dict844 = new BitSet(new long[]{0x0000100008000000L});
	public static final BitSet FOLLOW_44_in_dict848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_contained_block870 = new BitSet(new long[]{0x0000070080422000L});
	public static final BitSet FOLLOW_block_in_contained_block872 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_contained_block874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_array888 = new BitSet(new long[]{0x000008380B62E020L});
	public static final BitSet FOLLOW_expr_in_array890 = new BitSet(new long[]{0x0000002008000000L});
	public static final BitSet FOLLOW_27_in_array894 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_array896 = new BitSet(new long[]{0x0000002008000000L});
	public static final BitSet FOLLOW_37_in_array900 = new BitSet(new long[]{0x0000000000000002L});
}
