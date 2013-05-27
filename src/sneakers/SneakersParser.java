// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-27 12:35:47
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
		"ASSIGN", "BLOCK", "BLOCKDECL", "CLASSDEF", "DICT", "EXPR", "FIELDDEF", 
		"FNCALL", "FNDECL", "FNPARAM", "ID", "INT", "KEYWORD", "LETTER", "MUTDECL", 
		"MUTID", "PARAM", "PARAMTYPEFN", "PARAMTYPEMUT", "RET", "STRING", "WS", 
		"'#'", "'('", "')'", "','", "'.'", "':'", "';'", "'<'", "'=>'", "'>'", 
		"'@'", "'['", "']'", "'else'", "'elseif'", "'extend'", "'if'", "'pass'", 
		"'return'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__49=49;
	public static final int ANONFN=4;
	public static final int ANONVAR=5;
	public static final int ARRAY=6;
	public static final int ASSIGN=7;
	public static final int BLOCK=8;
	public static final int BLOCKDECL=9;
	public static final int CLASSDEF=10;
	public static final int DICT=11;
	public static final int EXPR=12;
	public static final int FIELDDEF=13;
	public static final int FNCALL=14;
	public static final int FNDECL=15;
	public static final int FNPARAM=16;
	public static final int ID=17;
	public static final int INT=18;
	public static final int KEYWORD=19;
	public static final int LETTER=20;
	public static final int MUTDECL=21;
	public static final int MUTID=22;
	public static final int PARAM=23;
	public static final int PARAMTYPEFN=24;
	public static final int PARAMTYPEMUT=25;
	public static final int RET=26;
	public static final int STRING=27;
	public static final int WS=28;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "stat", "fielddef", "nested_id", "returnstat", "blockparamtype", 
		"anonfn", "defable", "expr", "param", "fndecl", "standalone_fncall", "prog", 
		"index_expr", "ifstat", "array", "block", "fncall", "paramtype", "fnparam", 
		"assignment", "blockdecl", "dict_pair", "dict", "contained_block", "mutcall", 
		"any_id", "mutdecl", "classdef"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false
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


	  @Override
	  public void reportError(RecognitionException e) {
	    //throw new ParseException(e); 
	  }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:1: prog : block ;
	public final SneakersParser.prog_return prog() throws RecognitionException {
		SneakersParser.prog_return retval = new SneakersParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope block1 =null;


		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:6: ( block )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:8: block
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(48,8);
			pushFollow(FOLLOW_block_in_prog143);
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
		dbg.location(49, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:1: block : ( stat ';' )+ -> ^( BLOCK ( stat )+ ) ;
	public final SneakersParser.block_return block() throws RecognitionException {
		SneakersParser.block_return retval = new SneakersParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal3=null;
		ParserRuleReturnScope stat2 =null;

		CommonTree char_literal3_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:8: ( ( stat ';' )+ -> ^( BLOCK ( stat )+ ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:10: ( stat ';' )+
			{
			dbg.location(51,10);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:10: ( stat ';' )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==MUTID||LA1_0==36||(LA1_0 >= 45 && LA1_0 <= 47)) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:11: stat ';'
					{
					dbg.location(51,11);
					pushFollow(FOLLOW_stat_in_block155);
					stat2=stat();
					state._fsp--;

					stream_stat.add(stat2.getTree());dbg.location(51,16);
					char_literal3=(Token)match(input,35,FOLLOW_35_in_block157);  
					stream_35.add(char_literal3);

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
			// 51:22: -> ^( BLOCK ( stat )+ )
			{
				dbg.location(51,25);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:25: ^( BLOCK ( stat )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(51,27);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				dbg.location(51,33);
				if ( !(stream_stat.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_stat.hasNext() ) {
					dbg.location(51,33);
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
		dbg.location(51, 38);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:1: stat : ( assignment | ifstat | returnstat | mutcall | 'pass' );
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
		dbg.location(53, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:6: ( assignment | ifstat | returnstat | mutcall | 'pass' )
			int alt2=5;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case ID:
			case MUTID:
				{
				alt2=1;
				}
				break;
			case 45:
				{
				alt2=2;
				}
				break;
			case 47:
				{
				alt2=3;
				}
				break;
			case 36:
				{
				alt2=4;
				}
				break;
			case 46:
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:8: assignment
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(53,8);
					pushFollow(FOLLOW_assignment_in_stat176);
					assignment4=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment4.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:54:4: ifstat
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(54,4);
					pushFollow(FOLLOW_ifstat_in_stat181);
					ifstat5=ifstat();
					state._fsp--;

					adaptor.addChild(root_0, ifstat5.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:55:4: returnstat
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(55,4);
					pushFollow(FOLLOW_returnstat_in_stat186);
					returnstat6=returnstat();
					state._fsp--;

					adaptor.addChild(root_0, returnstat6.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:56:4: mutcall
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(56,4);
					pushFollow(FOLLOW_mutcall_in_stat191);
					mutcall7=mutcall();
					state._fsp--;

					adaptor.addChild(root_0, mutcall7.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:4: 'pass'
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(57,4);
					string_literal8=(Token)match(input,46,FOLLOW_46_in_stat196); 
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
		dbg.location(58, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:60:1: returnstat : ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) );
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
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "returnstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:2: ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) )
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:4: 'return' fncall
					{
					dbg.location(61,4);
					string_literal9=(Token)match(input,47,FOLLOW_47_in_returnstat207);  
					stream_47.add(string_literal9);
					dbg.location(61,13);
					pushFollow(FOLLOW_fncall_in_returnstat209);
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
					// 61:20: -> ^( RET fncall )
					{
						dbg.location(61,23);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:23: ^( RET fncall )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(61,25);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RET, "RET"), root_1);
						dbg.location(61,29);
						adaptor.addChild(root_1, stream_fncall.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:4: 'return' expr
					{
					dbg.location(62,4);
					string_literal11=(Token)match(input,47,FOLLOW_47_in_returnstat222);  
					stream_47.add(string_literal11);
					dbg.location(62,13);
					pushFollow(FOLLOW_expr_in_returnstat224);
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
					// 62:18: -> ^( RET expr )
					{
						dbg.location(62,21);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:21: ^( RET expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(62,23);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RET, "RET"), root_1);
						dbg.location(62,27);
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
		dbg.location(63, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:1: ifstat : 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) ;
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
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "ifstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:8: ( 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:10: 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )?
			{
			dbg.location(65,10);
			string_literal13=(Token)match(input,45,FOLLOW_45_in_ifstat242);  
			stream_45.add(string_literal13);
			dbg.location(65,21);
			pushFollow(FOLLOW_expr_in_ifstat246);
			ifexpr=expr();
			state._fsp--;

			stream_expr.add(ifexpr.getTree());dbg.location(65,34);
			pushFollow(FOLLOW_contained_block_in_ifstat250);
			ifblock=contained_block();
			state._fsp--;

			stream_contained_block.add(ifblock.getTree());dbg.location(66,3);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:3: ( 'elseif' elifexpr+= expr elifblock+= contained_block )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==43) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:4: 'elseif' elifexpr+= expr elifblock+= contained_block
					{
					dbg.location(66,4);
					string_literal14=(Token)match(input,43,FOLLOW_43_in_ifstat256);  
					stream_43.add(string_literal14);
					dbg.location(66,21);
					pushFollow(FOLLOW_expr_in_ifstat260);
					elifexpr=expr();
					state._fsp--;

					stream_expr.add(elifexpr.getTree());
					if (list_elifexpr==null) list_elifexpr=new ArrayList<Object>();
					list_elifexpr.add(elifexpr.getTree());dbg.location(66,37);
					pushFollow(FOLLOW_contained_block_in_ifstat264);
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
			dbg.location(67,3);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:3: ( 'else' elseblock= contained_block )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==42) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:4: 'else' elseblock= contained_block
					{
					dbg.location(67,4);
					string_literal15=(Token)match(input,42,FOLLOW_42_in_ifstat272);  
					stream_42.add(string_literal15);
					dbg.location(67,20);
					pushFollow(FOLLOW_contained_block_in_ifstat276);
					elseblock=contained_block();
					state._fsp--;

					stream_contained_block.add(elseblock.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

			// AST REWRITE
			// elements: elifblock, 45, elifexpr, elseblock, ifexpr, ifblock
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
			// 68:3: -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
			{
				dbg.location(68,6);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:68:6: ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(68,8);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_1);
				dbg.location(68,14);
				adaptor.addChild(root_1, stream_ifexpr.nextTree());dbg.location(68,22);
				adaptor.addChild(root_1, stream_ifblock.nextTree());dbg.location(68,30);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:68:30: ( $elifexpr $elifblock)*
				while ( stream_elifblock.hasNext()||stream_elifexpr.hasNext() ) {
					dbg.location(68,32);
					adaptor.addChild(root_1, stream_elifexpr.nextTree());dbg.location(68,42);
					adaptor.addChild(root_1, stream_elifblock.nextTree());
				}
				stream_elifblock.reset();
				stream_elifexpr.reset();
				dbg.location(68,55);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:68:55: ( $elseblock)?
				if ( stream_elseblock.hasNext() ) {
					dbg.location(68,55);
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
		dbg.location(68, 65);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ifstat"


	public static class classdef_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classdef"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:1: classdef : '{' ( fielddef )? ( ',' fielddef )* '}' -> ( fielddef )* ;
	public final SneakersParser.classdef_return classdef() throws RecognitionException {
		SneakersParser.classdef_return retval = new SneakersParser.classdef_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal16=null;
		Token char_literal18=null;
		Token char_literal20=null;
		ParserRuleReturnScope fielddef17 =null;
		ParserRuleReturnScope fielddef19 =null;

		CommonTree char_literal16_tree=null;
		CommonTree char_literal18_tree=null;
		CommonTree char_literal20_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_fielddef=new RewriteRuleSubtreeStream(adaptor,"rule fielddef");

		try { dbg.enterRule(getGrammarFileName(), "classdef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:9: ( '{' ( fielddef )? ( ',' fielddef )* '}' -> ( fielddef )* )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:11: '{' ( fielddef )? ( ',' fielddef )* '}'
			{
			dbg.location(70,11);
			char_literal16=(Token)match(input,48,FOLLOW_48_in_classdef312);  
			stream_48.add(char_literal16);
			dbg.location(70,15);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:15: ( fielddef )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==KEYWORD) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:16: fielddef
					{
					dbg.location(70,16);
					pushFollow(FOLLOW_fielddef_in_classdef315);
					fielddef17=fielddef();
					state._fsp--;

					stream_fielddef.add(fielddef17.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(70,27);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:27: ( ',' fielddef )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==32) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:28: ',' fielddef
					{
					dbg.location(70,28);
					char_literal18=(Token)match(input,32,FOLLOW_32_in_classdef320);  
					stream_32.add(char_literal18);
					dbg.location(70,32);
					pushFollow(FOLLOW_fielddef_in_classdef322);
					fielddef19=fielddef();
					state._fsp--;

					stream_fielddef.add(fielddef19.getTree());
					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(70,43);
			char_literal20=(Token)match(input,49,FOLLOW_49_in_classdef326);  
			stream_49.add(char_literal20);

			// AST REWRITE
			// elements: fielddef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 70:47: -> ( fielddef )*
			{
				dbg.location(70,50);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:50: ( fielddef )*
				while ( stream_fielddef.hasNext() ) {
					dbg.location(70,50);
					adaptor.addChild(root_0, stream_fielddef.nextTree());
				}
				stream_fielddef.reset();

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
		dbg.location(71, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "classdef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "classdef"


	public static class assignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:1: assignment : ( ID '=' 'class' classdef -> ^( 'class' ID classdef ) |newclass= ID '=' oldclass= ID '.' 'extend' classdef -> ^( 'extend' $newclass $oldclass classdef ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );
	public final SneakersParser.assignment_return assignment() throws RecognitionException {
		SneakersParser.assignment_return retval = new SneakersParser.assignment_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token newclass=null;
		Token oldclass=null;
		Token ID21=null;
		Token char_literal22=null;
		Token string_literal23=null;
		Token char_literal25=null;
		Token char_literal26=null;
		Token string_literal27=null;
		Token char_literal30=null;
		Token char_literal33=null;
		ParserRuleReturnScope classdef24 =null;
		ParserRuleReturnScope classdef28 =null;
		ParserRuleReturnScope any_id29 =null;
		ParserRuleReturnScope expr31 =null;
		ParserRuleReturnScope any_id32 =null;
		ParserRuleReturnScope fncall34 =null;

		CommonTree newclass_tree=null;
		CommonTree oldclass_tree=null;
		CommonTree ID21_tree=null;
		CommonTree char_literal22_tree=null;
		CommonTree string_literal23_tree=null;
		CommonTree char_literal25_tree=null;
		CommonTree char_literal26_tree=null;
		CommonTree string_literal27_tree=null;
		CommonTree char_literal30_tree=null;
		CommonTree char_literal33_tree=null;
		RewriteRuleTokenStream stream_CLASSDEF=new RewriteRuleTokenStream(adaptor,"token CLASSDEF");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_classdef=new RewriteRuleSubtreeStream(adaptor,"rule classdef");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "assignment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:2: ( ID '=' 'class' classdef -> ^( 'class' ID classdef ) |newclass= ID '=' oldclass= ID '.' 'extend' classdef -> ^( 'extend' $newclass $oldclass classdef ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) )
			int alt8=4;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			try {
				isCyclicDecision = true;
				alt8 = dfa8.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:4: ID '=' 'class' classdef
					{
					dbg.location(74,4);
					ID21=(Token)match(input,ID,FOLLOW_ID_in_assignment342);  
					stream_ID.add(ID21);
					dbg.location(74,7);
					char_literal22=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment344);  
					stream_ASSIGN.add(char_literal22);
					dbg.location(74,11);
					string_literal23=(Token)match(input,CLASSDEF,FOLLOW_CLASSDEF_in_assignment346);  
					stream_CLASSDEF.add(string_literal23);
					dbg.location(74,19);
					pushFollow(FOLLOW_classdef_in_assignment348);
					classdef24=classdef();
					state._fsp--;

					stream_classdef.add(classdef24.getTree());
					// AST REWRITE
					// elements: ID, classdef, CLASSDEF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 74:28: -> ^( 'class' ID classdef )
					{
						dbg.location(74,31);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:31: ^( 'class' ID classdef )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(74,33);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_CLASSDEF.nextNode(), root_1);
						dbg.location(74,41);
						adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(74,44);
						adaptor.addChild(root_1, stream_classdef.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:4: newclass= ID '=' oldclass= ID '.' 'extend' classdef
					{
					dbg.location(75,12);
					newclass=(Token)match(input,ID,FOLLOW_ID_in_assignment365);  
					stream_ID.add(newclass);
					dbg.location(75,16);
					char_literal25=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment367);  
					stream_ASSIGN.add(char_literal25);
					dbg.location(75,28);
					oldclass=(Token)match(input,ID,FOLLOW_ID_in_assignment371);  
					stream_ID.add(oldclass);
					dbg.location(75,32);
					char_literal26=(Token)match(input,33,FOLLOW_33_in_assignment373);  
					stream_33.add(char_literal26);
					dbg.location(75,36);
					string_literal27=(Token)match(input,44,FOLLOW_44_in_assignment375);  
					stream_44.add(string_literal27);
					dbg.location(75,45);
					pushFollow(FOLLOW_classdef_in_assignment377);
					classdef28=classdef();
					state._fsp--;

					stream_classdef.add(classdef28.getTree());
					// AST REWRITE
					// elements: 44, classdef, oldclass, newclass
					// token labels: oldclass, newclass
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_oldclass=new RewriteRuleTokenStream(adaptor,"token oldclass",oldclass);
					RewriteRuleTokenStream stream_newclass=new RewriteRuleTokenStream(adaptor,"token newclass",newclass);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 75:54: -> ^( 'extend' $newclass $oldclass classdef )
					{
						dbg.location(75,57);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:57: ^( 'extend' $newclass $oldclass classdef )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(75,59);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_44.nextNode(), root_1);
						dbg.location(75,69);
						adaptor.addChild(root_1, stream_newclass.nextNode());dbg.location(75,79);
						adaptor.addChild(root_1, stream_oldclass.nextNode());dbg.location(75,88);
						adaptor.addChild(root_1, stream_classdef.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:4: any_id '=' expr
					{
					dbg.location(76,4);
					pushFollow(FOLLOW_any_id_in_assignment396);
					any_id29=any_id();
					state._fsp--;

					stream_any_id.add(any_id29.getTree());dbg.location(76,11);
					char_literal30=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment398);  
					stream_ASSIGN.add(char_literal30);
					dbg.location(76,15);
					pushFollow(FOLLOW_expr_in_assignment400);
					expr31=expr();
					state._fsp--;

					stream_expr.add(expr31.getTree());
					// AST REWRITE
					// elements: any_id, ASSIGN, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 76:20: -> ^( '=' any_id expr )
					{
						dbg.location(76,23);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:23: ^( '=' any_id expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(76,25);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);
						dbg.location(76,29);
						adaptor.addChild(root_1, stream_any_id.nextTree());dbg.location(76,36);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:4: any_id '=' fncall
					{
					dbg.location(77,4);
					pushFollow(FOLLOW_any_id_in_assignment415);
					any_id32=any_id();
					state._fsp--;

					stream_any_id.add(any_id32.getTree());dbg.location(77,11);
					char_literal33=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment417);  
					stream_ASSIGN.add(char_literal33);
					dbg.location(77,15);
					pushFollow(FOLLOW_fncall_in_assignment419);
					fncall34=fncall();
					state._fsp--;

					stream_fncall.add(fncall34.getTree());
					// AST REWRITE
					// elements: fncall, any_id, ASSIGN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 77:22: -> ^( '=' any_id fncall )
					{
						dbg.location(77,25);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:25: ^( '=' any_id fncall )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(77,27);
						root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);
						dbg.location(77,31);
						adaptor.addChild(root_1, stream_any_id.nextTree());dbg.location(77,38);
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
		dbg.location(78, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:1: defable : ( paramtype | fndecl | mutdecl );
	public final SneakersParser.defable_return defable() throws RecognitionException {
		SneakersParser.defable_return retval = new SneakersParser.defable_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope paramtype35 =null;
		ParserRuleReturnScope fndecl36 =null;
		ParserRuleReturnScope mutdecl37 =null;


		try { dbg.enterRule(getGrammarFileName(), "defable");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(81, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:9: ( paramtype | fndecl | mutdecl )
			int alt9=3;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case ID:
				{
				alt9=1;
				}
				break;
			case 29:
				{
				int LA9_2 = input.LA(2);
				if ( (LA9_2==30) ) {
					int LA9_4 = input.LA(3);
					if ( (LA9_4==ID) ) {
						int LA9_6 = input.LA(4);
						if ( (LA9_6==34) ) {
							alt9=2;
						}
						else if ( ((LA9_6 >= 31 && LA9_6 <= 32)) ) {
							alt9=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 6, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA9_4==31) ) {
						int LA9_7 = input.LA(4);
						if ( (LA9_7==34) ) {
							int LA9_11 = input.LA(5);
							if ( (LA9_11==ID) ) {
								int LA9_14 = input.LA(6);
								if ( (LA9_14==32||LA9_14==49) ) {
									alt9=1;
								}
								else if ( (LA9_14==40) ) {
									alt9=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 9, 14, input);
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
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 9, 11, input);
									dbg.recognitionException(nvae);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA9_7==40) ) {
							alt9=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 7, input);
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 4, input);
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
							new NoViableAltException("", 9, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 39:
				{
				int LA9_3 = input.LA(2);
				if ( (LA9_3==30) ) {
					int LA9_5 = input.LA(3);
					if ( (LA9_5==ID) ) {
						int LA9_8 = input.LA(4);
						if ( (LA9_8==34) ) {
							alt9=3;
						}
						else if ( ((LA9_8 >= 31 && LA9_8 <= 32)) ) {
							alt9=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 8, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA9_5==31) ) {
						int LA9_9 = input.LA(4);
						if ( (LA9_9==34) ) {
							int LA9_13 = input.LA(5);
							if ( (LA9_13==ID) ) {
								int LA9_15 = input.LA(6);
								if ( (LA9_15==32||LA9_15==49) ) {
									alt9=1;
								}
								else if ( (LA9_15==40) ) {
									alt9=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 9, 15, input);
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
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 9, 13, input);
									dbg.recognitionException(nvae);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA9_9==40) ) {
							alt9=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 9, input);
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 5, input);
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
							new NoViableAltException("", 9, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:11: paramtype
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(81,11);
					pushFollow(FOLLOW_paramtype_in_defable440);
					paramtype35=paramtype();
					state._fsp--;

					adaptor.addChild(root_0, paramtype35.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:4: fndecl
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(82,4);
					pushFollow(FOLLOW_fndecl_in_defable445);
					fndecl36=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl36.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:4: mutdecl
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(83,4);
					pushFollow(FOLLOW_mutdecl_in_defable450);
					mutdecl37=mutdecl();
					state._fsp--;

					adaptor.addChild(root_0, mutdecl37.getTree());

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
			dbg.exitRule(getGrammarFileName(), "defable");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "defable"


	public static class fielddef_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fielddef"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:1: fielddef : KEYWORD '=>' defable -> ^( FIELDDEF KEYWORD defable ) ;
	public final SneakersParser.fielddef_return fielddef() throws RecognitionException {
		SneakersParser.fielddef_return retval = new SneakersParser.fielddef_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KEYWORD38=null;
		Token string_literal39=null;
		ParserRuleReturnScope defable40 =null;

		CommonTree KEYWORD38_tree=null;
		CommonTree string_literal39_tree=null;
		RewriteRuleTokenStream stream_KEYWORD=new RewriteRuleTokenStream(adaptor,"token KEYWORD");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_defable=new RewriteRuleSubtreeStream(adaptor,"rule defable");

		try { dbg.enterRule(getGrammarFileName(), "fielddef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:2: ( KEYWORD '=>' defable -> ^( FIELDDEF KEYWORD defable ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:4: KEYWORD '=>' defable
			{
			dbg.location(87,4);
			KEYWORD38=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_fielddef462);  
			stream_KEYWORD.add(KEYWORD38);
			dbg.location(87,12);
			string_literal39=(Token)match(input,37,FOLLOW_37_in_fielddef464);  
			stream_37.add(string_literal39);
			dbg.location(87,17);
			pushFollow(FOLLOW_defable_in_fielddef466);
			defable40=defable();
			state._fsp--;

			stream_defable.add(defable40.getTree());
			// AST REWRITE
			// elements: KEYWORD, defable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 87:25: -> ^( FIELDDEF KEYWORD defable )
			{
				dbg.location(87,28);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:28: ^( FIELDDEF KEYWORD defable )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(87,30);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELDDEF, "FIELDDEF"), root_1);
				dbg.location(87,39);
				adaptor.addChild(root_1, stream_KEYWORD.nextNode());dbg.location(87,47);
				adaptor.addChild(root_1, stream_defable.nextTree());
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
		dbg.location(88, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "fielddef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "fielddef"


	public static class nested_id_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nested_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:1: nested_id : ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* );
	public final SneakersParser.nested_id_return nested_id() throws RecognitionException {
		SneakersParser.nested_id_return retval = new SneakersParser.nested_id_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANONVAR41=null;
		Token char_literal42=null;
		Token char_literal45=null;
		ParserRuleReturnScope any_id43 =null;
		ParserRuleReturnScope any_id44 =null;
		ParserRuleReturnScope any_id46 =null;

		CommonTree ANONVAR41_tree=null;
		CommonTree char_literal42_tree=null;
		CommonTree char_literal45_tree=null;
		RewriteRuleTokenStream stream_ANONVAR=new RewriteRuleTokenStream(adaptor,"token ANONVAR");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");

		try { dbg.enterRule(getGrammarFileName(), "nested_id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(91, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:2: ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* )
			int alt12=2;
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==ANONVAR) ) {
				alt12=1;
			}
			else if ( (LA12_0==ID||LA12_0==MUTID) ) {
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:4: ANONVAR ( '.' any_id )*
					{
					dbg.location(92,4);
					ANONVAR41=(Token)match(input,ANONVAR,FOLLOW_ANONVAR_in_nested_id489);  
					stream_ANONVAR.add(ANONVAR41);
					dbg.location(92,12);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:12: ( '.' any_id )*
					try { dbg.enterSubRule(10);

					loop10:
					while (true) {
						int alt10=2;
						try { dbg.enterDecision(10, decisionCanBacktrack[10]);

						int LA10_0 = input.LA(1);
						if ( (LA10_0==33) ) {
							alt10=1;
						}

						} finally {dbg.exitDecision(10);}

						switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:13: '.' any_id
							{
							dbg.location(92,13);
							char_literal42=(Token)match(input,33,FOLLOW_33_in_nested_id492);  
							stream_33.add(char_literal42);
							dbg.location(92,17);
							pushFollow(FOLLOW_any_id_in_nested_id494);
							any_id43=any_id();
							state._fsp--;

							stream_any_id.add(any_id43.getTree());
							}
							break;

						default :
							break loop10;
						}
					}
					} finally {dbg.exitSubRule(10);}

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
					// 92:26: -> ANONVAR ( any_id )*
					{
						dbg.location(92,29);
						adaptor.addChild(root_0, stream_ANONVAR.nextNode());dbg.location(92,37);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:37: ( any_id )*
						while ( stream_any_id.hasNext() ) {
							dbg.location(92,37);
							adaptor.addChild(root_0, stream_any_id.nextTree());
						}
						stream_any_id.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:4: any_id ( '.' any_id )*
					{
					dbg.location(93,4);
					pushFollow(FOLLOW_any_id_in_nested_id508);
					any_id44=any_id();
					state._fsp--;

					stream_any_id.add(any_id44.getTree());dbg.location(93,11);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:11: ( '.' any_id )*
					try { dbg.enterSubRule(11);

					loop11:
					while (true) {
						int alt11=2;
						try { dbg.enterDecision(11, decisionCanBacktrack[11]);

						int LA11_0 = input.LA(1);
						if ( (LA11_0==33) ) {
							alt11=1;
						}

						} finally {dbg.exitDecision(11);}

						switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:12: '.' any_id
							{
							dbg.location(93,12);
							char_literal45=(Token)match(input,33,FOLLOW_33_in_nested_id511);  
							stream_33.add(char_literal45);
							dbg.location(93,16);
							pushFollow(FOLLOW_any_id_in_nested_id513);
							any_id46=any_id();
							state._fsp--;

							stream_any_id.add(any_id46.getTree());
							}
							break;

						default :
							break loop11;
						}
					}
					} finally {dbg.exitSubRule(11);}

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
					// 93:25: -> ( any_id )*
					{
						dbg.location(93,28);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:28: ( any_id )*
						while ( stream_any_id.hasNext() ) {
							dbg.location(93,28);
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
		dbg.location(94, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:1: fncall : nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) ;
	public final SneakersParser.fncall_return fncall() throws RecognitionException {
		SneakersParser.fncall_return retval = new SneakersParser.fncall_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal49=null;
		ParserRuleReturnScope nested_id47 =null;
		ParserRuleReturnScope param48 =null;
		ParserRuleReturnScope param50 =null;

		CommonTree char_literal49_tree=null;
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try { dbg.enterRule(getGrammarFileName(), "fncall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(96, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:8: ( nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:10: nested_id param ( ( ',' )? param )*
			{
			dbg.location(96,10);
			pushFollow(FOLLOW_nested_id_in_fncall530);
			nested_id47=nested_id();
			state._fsp--;

			stream_nested_id.add(nested_id47.getTree());dbg.location(96,20);
			pushFollow(FOLLOW_param_in_fncall532);
			param48=param();
			state._fsp--;

			stream_param.add(param48.getTree());dbg.location(96,26);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:26: ( ( ',' )? param )*
			try { dbg.enterSubRule(14);

			loop14:
			while (true) {
				int alt14=2;
				try { dbg.enterDecision(14, decisionCanBacktrack[14]);

				int LA14_0 = input.LA(1);
				if ( (LA14_0==ANONVAR||(LA14_0 >= ID && LA14_0 <= KEYWORD)||LA14_0==MUTID||LA14_0==STRING||(LA14_0 >= 29 && LA14_0 <= 30)||LA14_0==32||(LA14_0 >= 39 && LA14_0 <= 40)||LA14_0==48) ) {
					alt14=1;
				}

				} finally {dbg.exitDecision(14);}

				switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:27: ( ',' )? param
					{
					dbg.location(96,27);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:27: ( ',' )?
					int alt13=2;
					try { dbg.enterSubRule(13);
					try { dbg.enterDecision(13, decisionCanBacktrack[13]);

					int LA13_0 = input.LA(1);
					if ( (LA13_0==32) ) {
						alt13=1;
					}
					} finally {dbg.exitDecision(13);}

					switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:27: ','
							{
							dbg.location(96,27);
							char_literal49=(Token)match(input,32,FOLLOW_32_in_fncall535);  
							stream_32.add(char_literal49);

							}
							break;

					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(96,32);
					pushFollow(FOLLOW_param_in_fncall538);
					param50=param();
					state._fsp--;

					stream_param.add(param50.getTree());
					}
					break;

				default :
					break loop14;
				}
			}
			} finally {dbg.exitSubRule(14);}

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
			// 96:40: -> ^( FNCALL nested_id ( param )* )
			{
				dbg.location(96,43);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:43: ^( FNCALL nested_id ( param )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(96,45);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FNCALL, "FNCALL"), root_1);
				dbg.location(96,52);
				adaptor.addChild(root_1, stream_nested_id.nextTree());dbg.location(96,62);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:62: ( param )*
				while ( stream_param.hasNext() ) {
					dbg.location(96,62);
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
		dbg.location(97, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:1: param : ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) );
	public final SneakersParser.param_return param() throws RecognitionException {
		SneakersParser.param_return retval = new SneakersParser.param_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID51=null;
		Token char_literal52=null;
		ParserRuleReturnScope expr53 =null;
		ParserRuleReturnScope expr54 =null;

		CommonTree ID51_tree=null;
		CommonTree char_literal52_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "param");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(99, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:7: ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) )
			int alt15=2;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==34) ) {
					alt15=1;
				}
				else if ( (LA15_1==ANONVAR||(LA15_1 >= ID && LA15_1 <= KEYWORD)||LA15_1==MUTID||LA15_1==STRING||(LA15_1 >= 29 && LA15_1 <= 33)||LA15_1==35||(LA15_1 >= 38 && LA15_1 <= 41)||LA15_1==48) ) {
					alt15=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA15_0==ANONVAR||(LA15_0 >= INT && LA15_0 <= KEYWORD)||LA15_0==MUTID||LA15_0==STRING||(LA15_0 >= 29 && LA15_0 <= 30)||(LA15_0 >= 39 && LA15_0 <= 40)||LA15_0==48) ) {
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:9: ID ':' expr
					{
					dbg.location(99,9);
					ID51=(Token)match(input,ID,FOLLOW_ID_in_param561);  
					stream_ID.add(ID51);
					dbg.location(99,12);
					char_literal52=(Token)match(input,34,FOLLOW_34_in_param563);  
					stream_34.add(char_literal52);
					dbg.location(99,16);
					pushFollow(FOLLOW_expr_in_param565);
					expr53=expr();
					state._fsp--;

					stream_expr.add(expr53.getTree());
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
					// 99:21: -> ^( PARAM ID expr )
					{
						dbg.location(99,24);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:24: ^( PARAM ID expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(99,26);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);
						dbg.location(99,32);
						adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(99,35);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:4: expr
					{
					dbg.location(100,4);
					pushFollow(FOLLOW_expr_in_param580);
					expr54=expr();
					state._fsp--;

					stream_expr.add(expr54.getTree());
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
					// 100:9: -> ^( PARAM expr )
					{
						dbg.location(100,12);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:12: ^( PARAM expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(100,14);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);
						dbg.location(100,20);
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
		dbg.location(101, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "param");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "param"


	public static class blockparamtype_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "blockparamtype"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:103:1: blockparamtype : ( '(' ID ( ',' ID )* ')' ':' ID -> ( ID )+ | '(' ')' ':' ID -> ID );
	public final SneakersParser.blockparamtype_return blockparamtype() throws RecognitionException {
		SneakersParser.blockparamtype_return retval = new SneakersParser.blockparamtype_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal55=null;
		Token ID56=null;
		Token char_literal57=null;
		Token ID58=null;
		Token char_literal59=null;
		Token char_literal60=null;
		Token ID61=null;
		Token char_literal62=null;
		Token char_literal63=null;
		Token char_literal64=null;
		Token ID65=null;

		CommonTree char_literal55_tree=null;
		CommonTree ID56_tree=null;
		CommonTree char_literal57_tree=null;
		CommonTree ID58_tree=null;
		CommonTree char_literal59_tree=null;
		CommonTree char_literal60_tree=null;
		CommonTree ID61_tree=null;
		CommonTree char_literal62_tree=null;
		CommonTree char_literal63_tree=null;
		CommonTree char_literal64_tree=null;
		CommonTree ID65_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");

		try { dbg.enterRule(getGrammarFileName(), "blockparamtype");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(103, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:2: ( '(' ID ( ',' ID )* ')' ':' ID -> ( ID )+ | '(' ')' ':' ID -> ID )
			int alt17=2;
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==30) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==ID) ) {
					alt17=1;
				}
				else if ( (LA17_1==31) ) {
					alt17=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:4: '(' ID ( ',' ID )* ')' ':' ID
					{
					dbg.location(104,4);
					char_literal55=(Token)match(input,30,FOLLOW_30_in_blockparamtype600);  
					stream_30.add(char_literal55);
					dbg.location(104,8);
					ID56=(Token)match(input,ID,FOLLOW_ID_in_blockparamtype602);  
					stream_ID.add(ID56);
					dbg.location(104,11);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:11: ( ',' ID )*
					try { dbg.enterSubRule(16);

					loop16:
					while (true) {
						int alt16=2;
						try { dbg.enterDecision(16, decisionCanBacktrack[16]);

						int LA16_0 = input.LA(1);
						if ( (LA16_0==32) ) {
							alt16=1;
						}

						} finally {dbg.exitDecision(16);}

						switch (alt16) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:12: ',' ID
							{
							dbg.location(104,12);
							char_literal57=(Token)match(input,32,FOLLOW_32_in_blockparamtype605);  
							stream_32.add(char_literal57);
							dbg.location(104,16);
							ID58=(Token)match(input,ID,FOLLOW_ID_in_blockparamtype607);  
							stream_ID.add(ID58);

							}
							break;

						default :
							break loop16;
						}
					}
					} finally {dbg.exitSubRule(16);}
					dbg.location(104,21);
					char_literal59=(Token)match(input,31,FOLLOW_31_in_blockparamtype611);  
					stream_31.add(char_literal59);
					dbg.location(104,25);
					char_literal60=(Token)match(input,34,FOLLOW_34_in_blockparamtype613);  
					stream_34.add(char_literal60);
					dbg.location(104,29);
					ID61=(Token)match(input,ID,FOLLOW_ID_in_blockparamtype615);  
					stream_ID.add(ID61);

					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 104:32: -> ( ID )+
					{
						dbg.location(104,35);
						if ( !(stream_ID.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_ID.hasNext() ) {
							dbg.location(104,35);
							adaptor.addChild(root_0, stream_ID.nextNode());
						}
						stream_ID.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:105:4: '(' ')' ':' ID
					{
					dbg.location(105,4);
					char_literal62=(Token)match(input,30,FOLLOW_30_in_blockparamtype625);  
					stream_30.add(char_literal62);
					dbg.location(105,8);
					char_literal63=(Token)match(input,31,FOLLOW_31_in_blockparamtype627);  
					stream_31.add(char_literal63);
					dbg.location(105,12);
					char_literal64=(Token)match(input,34,FOLLOW_34_in_blockparamtype629);  
					stream_34.add(char_literal64);
					dbg.location(105,16);
					ID65=(Token)match(input,ID,FOLLOW_ID_in_blockparamtype631);  
					stream_ID.add(ID65);

					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 105:19: -> ID
					{
						dbg.location(105,22);
						adaptor.addChild(root_0, stream_ID.nextNode());
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
		dbg.location(106, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "blockparamtype");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "blockparamtype"


	public static class paramtype_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "paramtype"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:108:1: paramtype : ( ID | '#' blockparamtype -> ^( PARAMTYPEFN blockparamtype ) | '@' blockparamtype -> ^( PARAMTYPEMUT blockparamtype ) );
	public final SneakersParser.paramtype_return paramtype() throws RecognitionException {
		SneakersParser.paramtype_return retval = new SneakersParser.paramtype_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID66=null;
		Token char_literal67=null;
		Token char_literal69=null;
		ParserRuleReturnScope blockparamtype68 =null;
		ParserRuleReturnScope blockparamtype70 =null;

		CommonTree ID66_tree=null;
		CommonTree char_literal67_tree=null;
		CommonTree char_literal69_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_blockparamtype=new RewriteRuleSubtreeStream(adaptor,"rule blockparamtype");

		try { dbg.enterRule(getGrammarFileName(), "paramtype");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:108:11: ( ID | '#' blockparamtype -> ^( PARAMTYPEFN blockparamtype ) | '@' blockparamtype -> ^( PARAMTYPEMUT blockparamtype ) )
			int alt18=3;
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			switch ( input.LA(1) ) {
			case ID:
				{
				alt18=1;
				}
				break;
			case 29:
				{
				alt18=2;
				}
				break;
			case 39:
				{
				alt18=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:108:14: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(108,14);
					ID66=(Token)match(input,ID,FOLLOW_ID_in_paramtype646); 
					ID66_tree = (CommonTree)adaptor.create(ID66);
					adaptor.addChild(root_0, ID66_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:4: '#' blockparamtype
					{
					dbg.location(109,4);
					char_literal67=(Token)match(input,29,FOLLOW_29_in_paramtype651);  
					stream_29.add(char_literal67);
					dbg.location(109,8);
					pushFollow(FOLLOW_blockparamtype_in_paramtype653);
					blockparamtype68=blockparamtype();
					state._fsp--;

					stream_blockparamtype.add(blockparamtype68.getTree());
					// AST REWRITE
					// elements: blockparamtype
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 109:23: -> ^( PARAMTYPEFN blockparamtype )
					{
						dbg.location(109,26);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:26: ^( PARAMTYPEFN blockparamtype )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(109,28);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMTYPEFN, "PARAMTYPEFN"), root_1);
						dbg.location(109,40);
						adaptor.addChild(root_1, stream_blockparamtype.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:4: '@' blockparamtype
					{
					dbg.location(110,4);
					char_literal69=(Token)match(input,39,FOLLOW_39_in_paramtype666);  
					stream_39.add(char_literal69);
					dbg.location(110,8);
					pushFollow(FOLLOW_blockparamtype_in_paramtype668);
					blockparamtype70=blockparamtype();
					state._fsp--;

					stream_blockparamtype.add(blockparamtype70.getTree());
					// AST REWRITE
					// elements: blockparamtype
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 110:23: -> ^( PARAMTYPEMUT blockparamtype )
					{
						dbg.location(110,26);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:26: ^( PARAMTYPEMUT blockparamtype )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(110,28);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMTYPEMUT, "PARAMTYPEMUT"), root_1);
						dbg.location(110,41);
						adaptor.addChild(root_1, stream_blockparamtype.nextTree());
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
		dbg.location(111, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:1: fnparam : ID ':' paramtype -> ^( FNPARAM ID paramtype ) ;
	public final SneakersParser.fnparam_return fnparam() throws RecognitionException {
		SneakersParser.fnparam_return retval = new SneakersParser.fnparam_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID71=null;
		Token char_literal72=null;
		ParserRuleReturnScope paramtype73 =null;

		CommonTree ID71_tree=null;
		CommonTree char_literal72_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_paramtype=new RewriteRuleSubtreeStream(adaptor,"rule paramtype");

		try { dbg.enterRule(getGrammarFileName(), "fnparam");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(113, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:9: ( ID ':' paramtype -> ^( FNPARAM ID paramtype ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:11: ID ':' paramtype
			{
			dbg.location(113,11);
			ID71=(Token)match(input,ID,FOLLOW_ID_in_fnparam687);  
			stream_ID.add(ID71);
			dbg.location(113,14);
			char_literal72=(Token)match(input,34,FOLLOW_34_in_fnparam689);  
			stream_34.add(char_literal72);
			dbg.location(113,18);
			pushFollow(FOLLOW_paramtype_in_fnparam691);
			paramtype73=paramtype();
			state._fsp--;

			stream_paramtype.add(paramtype73.getTree());
			// AST REWRITE
			// elements: ID, paramtype
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 113:28: -> ^( FNPARAM ID paramtype )
			{
				dbg.location(113,31);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:31: ^( FNPARAM ID paramtype )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(113,33);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FNPARAM, "FNPARAM"), root_1);
				dbg.location(113,41);
				adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(113,44);
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
		dbg.location(114, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );
	public final SneakersParser.anonfn_return anonfn() throws RecognitionException {
		SneakersParser.anonfn_return retval = new SneakersParser.anonfn_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal74=null;
		Token char_literal75=null;
		Token char_literal77=null;
		Token char_literal78=null;
		Token char_literal79=null;
		Token char_literal81=null;
		ParserRuleReturnScope fncall76 =null;
		ParserRuleReturnScope nested_id80 =null;

		CommonTree char_literal74_tree=null;
		CommonTree char_literal75_tree=null;
		CommonTree char_literal77_tree=null;
		CommonTree char_literal78_tree=null;
		CommonTree char_literal79_tree=null;
		CommonTree char_literal81_tree=null;
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try { dbg.enterRule(getGrammarFileName(), "anonfn");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(116, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:8: ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) )
			int alt19=2;
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			try {
				isCyclicDecision = true;
				alt19 = dfa19.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:10: '#' '[' fncall ']'
					{
					dbg.location(116,10);
					char_literal74=(Token)match(input,29,FOLLOW_29_in_anonfn711);  
					stream_29.add(char_literal74);
					dbg.location(116,14);
					char_literal75=(Token)match(input,40,FOLLOW_40_in_anonfn713);  
					stream_40.add(char_literal75);
					dbg.location(116,18);
					pushFollow(FOLLOW_fncall_in_anonfn715);
					fncall76=fncall();
					state._fsp--;

					stream_fncall.add(fncall76.getTree());dbg.location(116,25);
					char_literal77=(Token)match(input,41,FOLLOW_41_in_anonfn717);  
					stream_41.add(char_literal77);

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
					// 116:29: -> ^( ANONFN fncall )
					{
						dbg.location(116,32);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:32: ^( ANONFN fncall )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(116,34);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANONFN, "ANONFN"), root_1);
						dbg.location(116,41);
						adaptor.addChild(root_1, stream_fncall.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:117:4: '#' '[' nested_id ']'
					{
					dbg.location(117,4);
					char_literal78=(Token)match(input,29,FOLLOW_29_in_anonfn730);  
					stream_29.add(char_literal78);
					dbg.location(117,8);
					char_literal79=(Token)match(input,40,FOLLOW_40_in_anonfn732);  
					stream_40.add(char_literal79);
					dbg.location(117,12);
					pushFollow(FOLLOW_nested_id_in_anonfn734);
					nested_id80=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id80.getTree());dbg.location(117,22);
					char_literal81=(Token)match(input,41,FOLLOW_41_in_anonfn736);  
					stream_41.add(char_literal81);

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
					// 117:26: -> ^( ANONFN nested_id )
					{
						dbg.location(117,29);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:117:29: ^( ANONFN nested_id )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(117,31);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANONFN, "ANONFN"), root_1);
						dbg.location(117,38);
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
		dbg.location(118, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:120:1: blockdecl : ( '(' ')' ( ':' ID )? contained_block -> ( ID )? contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' ID )? contained_block -> ( fnparam )* ( ID )? contained_block );
	public final SneakersParser.blockdecl_return blockdecl() throws RecognitionException {
		SneakersParser.blockdecl_return retval = new SneakersParser.blockdecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal82=null;
		Token char_literal83=null;
		Token char_literal84=null;
		Token ID85=null;
		Token char_literal87=null;
		Token char_literal89=null;
		Token char_literal91=null;
		Token char_literal92=null;
		Token ID93=null;
		ParserRuleReturnScope contained_block86 =null;
		ParserRuleReturnScope fnparam88 =null;
		ParserRuleReturnScope fnparam90 =null;
		ParserRuleReturnScope contained_block94 =null;

		CommonTree char_literal82_tree=null;
		CommonTree char_literal83_tree=null;
		CommonTree char_literal84_tree=null;
		CommonTree ID85_tree=null;
		CommonTree char_literal87_tree=null;
		CommonTree char_literal89_tree=null;
		CommonTree char_literal91_tree=null;
		CommonTree char_literal92_tree=null;
		CommonTree ID93_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_fnparam=new RewriteRuleSubtreeStream(adaptor,"rule fnparam");

		try { dbg.enterRule(getGrammarFileName(), "blockdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(120, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:2: ( '(' ')' ( ':' ID )? contained_block -> ( ID )? contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' ID )? contained_block -> ( fnparam )* ( ID )? contained_block )
			int alt24=2;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( (LA24_0==30) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==31) ) {
					alt24=1;
				}
				else if ( (LA24_1==ID) ) {
					alt24=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:4: '(' ')' ( ':' ID )? contained_block
					{
					dbg.location(121,4);
					char_literal82=(Token)match(input,30,FOLLOW_30_in_blockdecl755);  
					stream_30.add(char_literal82);
					dbg.location(121,8);
					char_literal83=(Token)match(input,31,FOLLOW_31_in_blockdecl757);  
					stream_31.add(char_literal83);
					dbg.location(121,12);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:12: ( ':' ID )?
					int alt20=2;
					try { dbg.enterSubRule(20);
					try { dbg.enterDecision(20, decisionCanBacktrack[20]);

					int LA20_0 = input.LA(1);
					if ( (LA20_0==34) ) {
						alt20=1;
					}
					} finally {dbg.exitDecision(20);}

					switch (alt20) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:13: ':' ID
							{
							dbg.location(121,13);
							char_literal84=(Token)match(input,34,FOLLOW_34_in_blockdecl760);  
							stream_34.add(char_literal84);
							dbg.location(121,17);
							ID85=(Token)match(input,ID,FOLLOW_ID_in_blockdecl762);  
							stream_ID.add(ID85);

							}
							break;

					}
					} finally {dbg.exitSubRule(20);}
					dbg.location(121,22);
					pushFollow(FOLLOW_contained_block_in_blockdecl766);
					contained_block86=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block86.getTree());
					// AST REWRITE
					// elements: ID, contained_block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 121:38: -> ( ID )? contained_block
					{
						dbg.location(121,41);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:41: ( ID )?
						if ( stream_ID.hasNext() ) {
							dbg.location(121,41);
							adaptor.addChild(root_0, stream_ID.nextNode());
						}
						stream_ID.reset();
						dbg.location(121,45);
						adaptor.addChild(root_0, stream_contained_block.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:4: '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' ID )? contained_block
					{
					dbg.location(122,4);
					char_literal87=(Token)match(input,30,FOLLOW_30_in_blockdecl778);  
					stream_30.add(char_literal87);
					dbg.location(122,8);
					pushFollow(FOLLOW_fnparam_in_blockdecl780);
					fnparam88=fnparam();
					state._fsp--;

					stream_fnparam.add(fnparam88.getTree());dbg.location(122,16);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:16: ( ( ',' )? fnparam )*
					try { dbg.enterSubRule(22);

					loop22:
					while (true) {
						int alt22=2;
						try { dbg.enterDecision(22, decisionCanBacktrack[22]);

						int LA22_0 = input.LA(1);
						if ( (LA22_0==ID||LA22_0==32) ) {
							alt22=1;
						}

						} finally {dbg.exitDecision(22);}

						switch (alt22) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:17: ( ',' )? fnparam
							{
							dbg.location(122,17);
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:17: ( ',' )?
							int alt21=2;
							try { dbg.enterSubRule(21);
							try { dbg.enterDecision(21, decisionCanBacktrack[21]);

							int LA21_0 = input.LA(1);
							if ( (LA21_0==32) ) {
								alt21=1;
							}
							} finally {dbg.exitDecision(21);}

							switch (alt21) {
								case 1 :
									dbg.enterAlt(1);

									// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:17: ','
									{
									dbg.location(122,17);
									char_literal89=(Token)match(input,32,FOLLOW_32_in_blockdecl783);  
									stream_32.add(char_literal89);

									}
									break;

							}
							} finally {dbg.exitSubRule(21);}
							dbg.location(122,22);
							pushFollow(FOLLOW_fnparam_in_blockdecl786);
							fnparam90=fnparam();
							state._fsp--;

							stream_fnparam.add(fnparam90.getTree());
							}
							break;

						default :
							break loop22;
						}
					}
					} finally {dbg.exitSubRule(22);}
					dbg.location(122,32);
					char_literal91=(Token)match(input,31,FOLLOW_31_in_blockdecl790);  
					stream_31.add(char_literal91);
					dbg.location(122,36);
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:36: ( ':' ID )?
					int alt23=2;
					try { dbg.enterSubRule(23);
					try { dbg.enterDecision(23, decisionCanBacktrack[23]);

					int LA23_0 = input.LA(1);
					if ( (LA23_0==34) ) {
						alt23=1;
					}
					} finally {dbg.exitDecision(23);}

					switch (alt23) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:37: ':' ID
							{
							dbg.location(122,37);
							char_literal92=(Token)match(input,34,FOLLOW_34_in_blockdecl793);  
							stream_34.add(char_literal92);
							dbg.location(122,41);
							ID93=(Token)match(input,ID,FOLLOW_ID_in_blockdecl795);  
							stream_ID.add(ID93);

							}
							break;

					}
					} finally {dbg.exitSubRule(23);}
					dbg.location(122,46);
					pushFollow(FOLLOW_contained_block_in_blockdecl799);
					contained_block94=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block94.getTree());
					// AST REWRITE
					// elements: ID, fnparam, contained_block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 122:62: -> ( fnparam )* ( ID )? contained_block
					{
						dbg.location(122,65);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:65: ( fnparam )*
						while ( stream_fnparam.hasNext() ) {
							dbg.location(122,65);
							adaptor.addChild(root_0, stream_fnparam.nextTree());
						}
						stream_fnparam.reset();
						dbg.location(122,74);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:74: ( ID )?
						if ( stream_ID.hasNext() ) {
							dbg.location(122,74);
							adaptor.addChild(root_0, stream_ID.nextNode());
						}
						stream_ID.reset();
						dbg.location(122,78);
						adaptor.addChild(root_0, stream_contained_block.nextTree());
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
		dbg.location(123, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:1: fndecl : '#' blockdecl -> ^( FNDECL blockdecl ) ;
	public final SneakersParser.fndecl_return fndecl() throws RecognitionException {
		SneakersParser.fndecl_return retval = new SneakersParser.fndecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal95=null;
		ParserRuleReturnScope blockdecl96 =null;

		CommonTree char_literal95_tree=null;
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try { dbg.enterRule(getGrammarFileName(), "fndecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(125, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:8: ( '#' blockdecl -> ^( FNDECL blockdecl ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:10: '#' blockdecl
			{
			dbg.location(125,10);
			char_literal95=(Token)match(input,29,FOLLOW_29_in_fndecl819);  
			stream_29.add(char_literal95);
			dbg.location(125,14);
			pushFollow(FOLLOW_blockdecl_in_fndecl821);
			blockdecl96=blockdecl();
			state._fsp--;

			stream_blockdecl.add(blockdecl96.getTree());
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
			// 125:24: -> ^( FNDECL blockdecl )
			{
				dbg.location(125,27);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:27: ^( FNDECL blockdecl )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(125,29);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FNDECL, "FNDECL"), root_1);
				dbg.location(125,36);
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
		dbg.location(126, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:128:1: mutdecl : '@' blockdecl -> ^( MUTDECL blockdecl ) ;
	public final SneakersParser.mutdecl_return mutdecl() throws RecognitionException {
		SneakersParser.mutdecl_return retval = new SneakersParser.mutdecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal97=null;
		ParserRuleReturnScope blockdecl98 =null;

		CommonTree char_literal97_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try { dbg.enterRule(getGrammarFileName(), "mutdecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(128, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:128:9: ( '@' blockdecl -> ^( MUTDECL blockdecl ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:128:11: '@' blockdecl
			{
			dbg.location(128,11);
			char_literal97=(Token)match(input,39,FOLLOW_39_in_mutdecl839);  
			stream_39.add(char_literal97);
			dbg.location(128,15);
			pushFollow(FOLLOW_blockdecl_in_mutdecl841);
			blockdecl98=blockdecl();
			state._fsp--;

			stream_blockdecl.add(blockdecl98.getTree());
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
			// 128:25: -> ^( MUTDECL blockdecl )
			{
				dbg.location(128,28);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:128:28: ^( MUTDECL blockdecl )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(128,30);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MUTDECL, "MUTDECL"), root_1);
				dbg.location(128,38);
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
		dbg.location(129, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:1: expr : ( index_expr | dict | fndecl | mutdecl | anonfn | array );
	public final SneakersParser.expr_return expr() throws RecognitionException {
		SneakersParser.expr_return retval = new SneakersParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope index_expr99 =null;
		ParserRuleReturnScope dict100 =null;
		ParserRuleReturnScope fndecl101 =null;
		ParserRuleReturnScope mutdecl102 =null;
		ParserRuleReturnScope anonfn103 =null;
		ParserRuleReturnScope array104 =null;


		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(131, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:6: ( index_expr | dict | fndecl | mutdecl | anonfn | array )
			int alt25=6;
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			switch ( input.LA(1) ) {
			case ANONVAR:
			case ID:
			case INT:
			case KEYWORD:
			case MUTID:
			case STRING:
			case 30:
				{
				alt25=1;
				}
				break;
			case 48:
				{
				alt25=2;
				}
				break;
			case 29:
				{
				int LA25_3 = input.LA(2);
				if ( (LA25_3==40) ) {
					alt25=5;
				}
				else if ( (LA25_3==30) ) {
					alt25=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 3, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 39:
				{
				alt25=4;
				}
				break;
			case 40:
				{
				alt25=6;
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

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:8: index_expr
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(131,8);
					pushFollow(FOLLOW_index_expr_in_expr859);
					index_expr99=index_expr();
					state._fsp--;

					adaptor.addChild(root_0, index_expr99.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:132:4: dict
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(132,4);
					pushFollow(FOLLOW_dict_in_expr864);
					dict100=dict();
					state._fsp--;

					adaptor.addChild(root_0, dict100.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:133:4: fndecl
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(133,4);
					pushFollow(FOLLOW_fndecl_in_expr869);
					fndecl101=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl101.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:4: mutdecl
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(134,4);
					pushFollow(FOLLOW_mutdecl_in_expr874);
					mutdecl102=mutdecl();
					state._fsp--;

					adaptor.addChild(root_0, mutdecl102.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:135:4: anonfn
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(135,4);
					pushFollow(FOLLOW_anonfn_in_expr879);
					anonfn103=anonfn();
					state._fsp--;

					adaptor.addChild(root_0, anonfn103.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:136:4: array
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(136,4);
					pushFollow(FOLLOW_array_in_expr884);
					array104=array();
					state._fsp--;

					adaptor.addChild(root_0, array104.getTree());

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
		dbg.location(137, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:139:1: standalone_fncall : '(' fncall ')' -> fncall ;
	public final SneakersParser.standalone_fncall_return standalone_fncall() throws RecognitionException {
		SneakersParser.standalone_fncall_return retval = new SneakersParser.standalone_fncall_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal105=null;
		Token char_literal107=null;
		ParserRuleReturnScope fncall106 =null;

		CommonTree char_literal105_tree=null;
		CommonTree char_literal107_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");

		try { dbg.enterRule(getGrammarFileName(), "standalone_fncall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(139, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:140:2: ( '(' fncall ')' -> fncall )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:140:4: '(' fncall ')'
			{
			dbg.location(140,4);
			char_literal105=(Token)match(input,30,FOLLOW_30_in_standalone_fncall895);  
			stream_30.add(char_literal105);
			dbg.location(140,8);
			pushFollow(FOLLOW_fncall_in_standalone_fncall897);
			fncall106=fncall();
			state._fsp--;

			stream_fncall.add(fncall106.getTree());dbg.location(140,15);
			char_literal107=(Token)match(input,31,FOLLOW_31_in_standalone_fncall899);  
			stream_31.add(char_literal107);

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
			// 140:19: -> fncall
			{
				dbg.location(140,22);
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
		dbg.location(141, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:143:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );
	public final SneakersParser.mutcall_return mutcall() throws RecognitionException {
		SneakersParser.mutcall_return retval = new SneakersParser.mutcall_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal108=null;
		Token char_literal110=null;
		Token char_literal111=null;
		Token char_literal113=null;
		ParserRuleReturnScope nested_id109 =null;
		ParserRuleReturnScope fncall112 =null;

		CommonTree char_literal108_tree=null;
		CommonTree char_literal110_tree=null;
		CommonTree char_literal111_tree=null;
		CommonTree char_literal113_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try { dbg.enterRule(getGrammarFileName(), "mutcall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(143, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:143:9: ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall )
			int alt26=2;
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			try {
				isCyclicDecision = true;
				alt26 = dfa26.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:143:11: '<' nested_id '>'
					{
					dbg.location(143,11);
					char_literal108=(Token)match(input,36,FOLLOW_36_in_mutcall913);  
					stream_36.add(char_literal108);
					dbg.location(143,15);
					pushFollow(FOLLOW_nested_id_in_mutcall915);
					nested_id109=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id109.getTree());dbg.location(143,25);
					char_literal110=(Token)match(input,38,FOLLOW_38_in_mutcall917);  
					stream_38.add(char_literal110);

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
					// 143:29: -> nested_id
					{
						dbg.location(143,32);
						adaptor.addChild(root_0, stream_nested_id.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:144:4: '<' fncall '>'
					{
					dbg.location(144,4);
					char_literal111=(Token)match(input,36,FOLLOW_36_in_mutcall926);  
					stream_36.add(char_literal111);
					dbg.location(144,8);
					pushFollow(FOLLOW_fncall_in_mutcall928);
					fncall112=fncall();
					state._fsp--;

					stream_fncall.add(fncall112.getTree());dbg.location(144,15);
					char_literal113=(Token)match(input,38,FOLLOW_38_in_mutcall930);  
					stream_38.add(char_literal113);

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
					// 144:19: -> fncall
					{
						dbg.location(144,22);
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
		dbg.location(145, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:147:1: index_expr : ( KEYWORD | INT | STRING | nested_id | standalone_fncall );
	public final SneakersParser.index_expr_return index_expr() throws RecognitionException {
		SneakersParser.index_expr_return retval = new SneakersParser.index_expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token KEYWORD114=null;
		Token INT115=null;
		Token STRING116=null;
		ParserRuleReturnScope nested_id117 =null;
		ParserRuleReturnScope standalone_fncall118 =null;

		CommonTree KEYWORD114_tree=null;
		CommonTree INT115_tree=null;
		CommonTree STRING116_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "index_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(147, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:148:2: ( KEYWORD | INT | STRING | nested_id | standalone_fncall )
			int alt27=5;
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			switch ( input.LA(1) ) {
			case KEYWORD:
				{
				alt27=1;
				}
				break;
			case INT:
				{
				alt27=2;
				}
				break;
			case STRING:
				{
				alt27=3;
				}
				break;
			case ANONVAR:
			case ID:
			case MUTID:
				{
				alt27=4;
				}
				break;
			case 30:
				{
				alt27=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:148:4: KEYWORD
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(148,4);
					KEYWORD114=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_index_expr945); 
					KEYWORD114_tree = (CommonTree)adaptor.create(KEYWORD114);
					adaptor.addChild(root_0, KEYWORD114_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:149:4: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(149,4);
					INT115=(Token)match(input,INT,FOLLOW_INT_in_index_expr950); 
					INT115_tree = (CommonTree)adaptor.create(INT115);
					adaptor.addChild(root_0, INT115_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:150:4: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(150,4);
					STRING116=(Token)match(input,STRING,FOLLOW_STRING_in_index_expr955); 
					STRING116_tree = (CommonTree)adaptor.create(STRING116);
					adaptor.addChild(root_0, STRING116_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:151:4: nested_id
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(151,4);
					pushFollow(FOLLOW_nested_id_in_index_expr960);
					nested_id117=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id117.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:152:4: standalone_fncall
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(152,4);
					pushFollow(FOLLOW_standalone_fncall_in_index_expr965);
					standalone_fncall118=standalone_fncall();
					state._fsp--;

					adaptor.addChild(root_0, standalone_fncall118.getTree());

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
		dbg.location(153, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:155:1: dict_pair : index_expr '=>' expr -> index_expr expr ;
	public final SneakersParser.dict_pair_return dict_pair() throws RecognitionException {
		SneakersParser.dict_pair_return retval = new SneakersParser.dict_pair_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal120=null;
		ParserRuleReturnScope index_expr119 =null;
		ParserRuleReturnScope expr121 =null;

		CommonTree string_literal120_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "dict_pair");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(155, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:156:2: ( index_expr '=>' expr -> index_expr expr )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:156:4: index_expr '=>' expr
			{
			dbg.location(156,4);
			pushFollow(FOLLOW_index_expr_in_dict_pair977);
			index_expr119=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr119.getTree());dbg.location(156,15);
			string_literal120=(Token)match(input,37,FOLLOW_37_in_dict_pair979);  
			stream_37.add(string_literal120);
			dbg.location(156,20);
			pushFollow(FOLLOW_expr_in_dict_pair981);
			expr121=expr();
			state._fsp--;

			stream_expr.add(expr121.getTree());
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
			// 156:25: -> index_expr expr
			{
				dbg.location(156,28);
				adaptor.addChild(root_0, stream_index_expr.nextTree());dbg.location(156,39);
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
		dbg.location(157, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:159:1: dict : '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) ;
	public final SneakersParser.dict_return dict() throws RecognitionException {
		SneakersParser.dict_return retval = new SneakersParser.dict_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal122=null;
		Token char_literal124=null;
		Token char_literal126=null;
		ParserRuleReturnScope dict_pair123 =null;
		ParserRuleReturnScope dict_pair125 =null;

		CommonTree char_literal122_tree=null;
		CommonTree char_literal124_tree=null;
		CommonTree char_literal126_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_dict_pair=new RewriteRuleSubtreeStream(adaptor,"rule dict_pair");

		try { dbg.enterRule(getGrammarFileName(), "dict");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(159, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:159:6: ( '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:159:8: '{' ( dict_pair )? ( ',' dict_pair )* '}'
			{
			dbg.location(159,8);
			char_literal122=(Token)match(input,48,FOLLOW_48_in_dict997);  
			stream_48.add(char_literal122);
			dbg.location(159,12);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:159:12: ( dict_pair )?
			int alt28=2;
			try { dbg.enterSubRule(28);
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==ANONVAR||(LA28_0 >= ID && LA28_0 <= KEYWORD)||LA28_0==MUTID||LA28_0==STRING||LA28_0==30) ) {
				alt28=1;
			}
			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:159:13: dict_pair
					{
					dbg.location(159,13);
					pushFollow(FOLLOW_dict_pair_in_dict1000);
					dict_pair123=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair123.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(28);}
			dbg.location(159,25);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:159:25: ( ',' dict_pair )*
			try { dbg.enterSubRule(29);

			loop29:
			while (true) {
				int alt29=2;
				try { dbg.enterDecision(29, decisionCanBacktrack[29]);

				int LA29_0 = input.LA(1);
				if ( (LA29_0==32) ) {
					alt29=1;
				}

				} finally {dbg.exitDecision(29);}

				switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:159:26: ',' dict_pair
					{
					dbg.location(159,26);
					char_literal124=(Token)match(input,32,FOLLOW_32_in_dict1005);  
					stream_32.add(char_literal124);
					dbg.location(159,30);
					pushFollow(FOLLOW_dict_pair_in_dict1007);
					dict_pair125=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair125.getTree());
					}
					break;

				default :
					break loop29;
				}
			}
			} finally {dbg.exitSubRule(29);}
			dbg.location(159,42);
			char_literal126=(Token)match(input,49,FOLLOW_49_in_dict1011);  
			stream_49.add(char_literal126);

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
			// 159:46: -> ^( DICT ( dict_pair )* )
			{
				dbg.location(159,49);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:159:49: ^( DICT ( dict_pair )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(159,51);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DICT, "DICT"), root_1);
				dbg.location(159,56);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:159:56: ( dict_pair )*
				while ( stream_dict_pair.hasNext() ) {
					dbg.location(159,56);
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
		dbg.location(160, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:162:1: contained_block : '[' block ']' -> block ;
	public final SneakersParser.contained_block_return contained_block() throws RecognitionException {
		SneakersParser.contained_block_return retval = new SneakersParser.contained_block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal127=null;
		Token char_literal129=null;
		ParserRuleReturnScope block128 =null;

		CommonTree char_literal127_tree=null;
		CommonTree char_literal129_tree=null;
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try { dbg.enterRule(getGrammarFileName(), "contained_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(162, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:163:2: ( '[' block ']' -> block )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:163:4: '[' block ']'
			{
			dbg.location(163,4);
			char_literal127=(Token)match(input,40,FOLLOW_40_in_contained_block1033);  
			stream_40.add(char_literal127);
			dbg.location(163,8);
			pushFollow(FOLLOW_block_in_contained_block1035);
			block128=block();
			state._fsp--;

			stream_block.add(block128.getTree());dbg.location(163,14);
			char_literal129=(Token)match(input,41,FOLLOW_41_in_contained_block1037);  
			stream_41.add(char_literal129);

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
			// 163:18: -> block
			{
				dbg.location(163,21);
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
		dbg.location(164, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:166:1: array : '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) ;
	public final SneakersParser.array_return array() throws RecognitionException {
		SneakersParser.array_return retval = new SneakersParser.array_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal130=null;
		Token char_literal132=null;
		Token char_literal134=null;
		ParserRuleReturnScope expr131 =null;
		ParserRuleReturnScope expr133 =null;

		CommonTree char_literal130_tree=null;
		CommonTree char_literal132_tree=null;
		CommonTree char_literal134_tree=null;
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "array");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(166, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:166:7: ( '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:166:9: '[' ( expr )? ( ',' expr )* ']'
			{
			dbg.location(166,9);
			char_literal130=(Token)match(input,40,FOLLOW_40_in_array1051);  
			stream_40.add(char_literal130);
			dbg.location(166,13);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:166:13: ( expr )?
			int alt30=2;
			try { dbg.enterSubRule(30);
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

			int LA30_0 = input.LA(1);
			if ( (LA30_0==ANONVAR||(LA30_0 >= ID && LA30_0 <= KEYWORD)||LA30_0==MUTID||LA30_0==STRING||(LA30_0 >= 29 && LA30_0 <= 30)||(LA30_0 >= 39 && LA30_0 <= 40)||LA30_0==48) ) {
				alt30=1;
			}
			} finally {dbg.exitDecision(30);}

			switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:166:13: expr
					{
					dbg.location(166,13);
					pushFollow(FOLLOW_expr_in_array1053);
					expr131=expr();
					state._fsp--;

					stream_expr.add(expr131.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(30);}
			dbg.location(166,19);
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:166:19: ( ',' expr )*
			try { dbg.enterSubRule(31);

			loop31:
			while (true) {
				int alt31=2;
				try { dbg.enterDecision(31, decisionCanBacktrack[31]);

				int LA31_0 = input.LA(1);
				if ( (LA31_0==32) ) {
					alt31=1;
				}

				} finally {dbg.exitDecision(31);}

				switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:166:20: ',' expr
					{
					dbg.location(166,20);
					char_literal132=(Token)match(input,32,FOLLOW_32_in_array1057);  
					stream_32.add(char_literal132);
					dbg.location(166,24);
					pushFollow(FOLLOW_expr_in_array1059);
					expr133=expr();
					state._fsp--;

					stream_expr.add(expr133.getTree());
					}
					break;

				default :
					break loop31;
				}
			}
			} finally {dbg.exitSubRule(31);}
			dbg.location(166,31);
			char_literal134=(Token)match(input,41,FOLLOW_41_in_array1063);  
			stream_41.add(char_literal134);

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
			// 166:35: -> ^( ARRAY ( expr )* )
			{
				dbg.location(166,38);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:166:38: ^( ARRAY ( expr )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(166,40);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);
				dbg.location(166,46);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:166:46: ( expr )*
				while ( stream_expr.hasNext() ) {
					dbg.location(166,46);
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
		dbg.location(167, 1);

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:186:1: any_id : ( ID | MUTID );
	public final SneakersParser.any_id_return any_id() throws RecognitionException {
		SneakersParser.any_id_return retval = new SneakersParser.any_id_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set135=null;

		CommonTree set135_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "any_id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(186, 0);

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:187:2: ( ID | MUTID )
			dbg.enterAlt(1);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(187,2);
			set135=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==MUTID ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set135));
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
		dbg.location(189, 1);

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
	protected DFA8 dfa8 = new DFA8(this);
	protected DFA19 dfa19 = new DFA19(this);
	protected DFA26 dfa26 = new DFA26(this);
	static final String DFA3_eotS =
		"\12\uffff";
	static final String DFA3_eofS =
		"\12\uffff";
	static final String DFA3_minS =
		"\1\57\3\5\1\uffff\1\21\1\uffff\1\21\2\5";
	static final String DFA3_maxS =
		"\1\57\3\60\1\uffff\1\26\1\uffff\1\26\2\60";
	static final String DFA3_acceptS =
		"\4\uffff\1\2\1\uffff\1\1\3\uffff";
	static final String DFA3_specialS =
		"\12\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1",
			"\1\2\13\uffff\1\3\2\4\2\uffff\1\3\4\uffff\1\4\1\uffff\2\4\10\uffff\2"+
			"\4\7\uffff\1\4",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\1\6\1\uffff\2\6\2\uffff\1\5\1"+
			"\uffff\1\4\3\uffff\2\6\7\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\1\6\1\uffff\2\6\2\uffff\1\7\1"+
			"\uffff\1\4\3\uffff\2\6\7\uffff\1\6",
			"",
			"\1\10\4\uffff\1\10",
			"",
			"\1\11\4\uffff\1\11",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\1\6\1\uffff\2\6\2\uffff\1\5\1"+
			"\uffff\1\4\3\uffff\2\6\7\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\1\6\1\uffff\2\6\2\uffff\1\7\1"+
			"\uffff\1\4\3\uffff\2\6\7\uffff\1\6"
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
			return "60:1: returnstat : ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA8_eotS =
		"\21\uffff";
	static final String DFA8_eofS =
		"\21\uffff";
	static final String DFA8_minS =
		"\1\21\2\7\2\5\1\uffff\1\5\1\uffff\2\5\1\21\1\uffff\2\21\1\uffff\2\5";
	static final String DFA8_maxS =
		"\1\26\2\7\2\60\1\uffff\1\60\1\uffff\2\60\1\54\1\uffff\2\26\1\uffff\2\60";
	static final String DFA8_acceptS =
		"\5\uffff\1\1\1\uffff\1\3\3\uffff\1\4\2\uffff\1\2\2\uffff";
	static final String DFA8_specialS =
		"\21\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\1\4\uffff\1\2",
			"\1\3",
			"\1\4",
			"\1\10\4\uffff\1\5\6\uffff\1\6\2\7\2\uffff\1\11\4\uffff\1\7\1\uffff\2"+
			"\7\10\uffff\2\7\7\uffff\1\7",
			"\1\10\13\uffff\1\11\2\7\2\uffff\1\11\4\uffff\1\7\1\uffff\2\7\10\uffff"+
			"\2\7\7\uffff\1\7",
			"",
			"\1\13\13\uffff\3\13\2\uffff\1\13\4\uffff\1\13\1\uffff\2\13\2\uffff\1"+
			"\12\1\uffff\1\7\3\uffff\2\13\7\uffff\1\13",
			"",
			"\1\13\13\uffff\3\13\2\uffff\1\13\4\uffff\1\13\1\uffff\2\13\2\uffff\1"+
			"\14\1\uffff\1\7\3\uffff\2\13\7\uffff\1\13",
			"\1\13\13\uffff\3\13\2\uffff\1\13\4\uffff\1\13\1\uffff\2\13\2\uffff\1"+
			"\15\1\uffff\1\7\3\uffff\2\13\7\uffff\1\13",
			"\1\17\4\uffff\1\17\25\uffff\1\16",
			"",
			"\1\20\4\uffff\1\20",
			"\1\17\4\uffff\1\17",
			"",
			"\1\13\13\uffff\3\13\2\uffff\1\13\4\uffff\1\13\1\uffff\2\13\2\uffff\1"+
			"\15\1\uffff\1\7\3\uffff\2\13\7\uffff\1\13",
			"\1\13\13\uffff\3\13\2\uffff\1\13\4\uffff\1\13\1\uffff\2\13\2\uffff\1"+
			"\14\1\uffff\1\7\3\uffff\2\13\7\uffff\1\13"
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "73:1: assignment : ( ID '=' 'class' classdef -> ^( 'class' ID classdef ) |newclass= ID '=' oldclass= ID '.' 'extend' classdef -> ^( 'extend' $newclass $oldclass classdef ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA19_eotS =
		"\13\uffff";
	static final String DFA19_eofS =
		"\13\uffff";
	static final String DFA19_minS =
		"\1\35\1\50\3\5\1\21\2\uffff\1\21\2\5";
	static final String DFA19_maxS =
		"\1\35\1\50\1\26\2\60\1\26\2\uffff\1\26\2\60";
	static final String DFA19_acceptS =
		"\6\uffff\1\1\1\2\3\uffff";
	static final String DFA19_specialS =
		"\13\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\13\uffff\1\4\4\uffff\1\4",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\1\6\1\uffff\2\6\2\uffff\1\5\5"+
			"\uffff\2\6\1\7\6\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\1\6\1\uffff\2\6\2\uffff\1\10\5"+
			"\uffff\2\6\1\7\6\uffff\1\6",
			"\1\11\4\uffff\1\11",
			"",
			"",
			"\1\12\4\uffff\1\12",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\1\6\1\uffff\2\6\2\uffff\1\5\5"+
			"\uffff\2\6\1\7\6\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\1\6\1\uffff\2\6\2\uffff\1\10\5"+
			"\uffff\2\6\1\7\6\uffff\1\6"
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "116:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA26_eotS =
		"\12\uffff";
	static final String DFA26_eofS =
		"\12\uffff";
	static final String DFA26_minS =
		"\1\44\3\5\1\21\2\uffff\1\21\2\5";
	static final String DFA26_maxS =
		"\1\44\1\26\2\60\1\26\2\uffff\1\26\2\60";
	static final String DFA26_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA26_specialS =
		"\12\uffff}>";
	static final String[] DFA26_transitionS = {
			"\1\1",
			"\1\2\13\uffff\1\3\4\uffff\1\3",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\1\6\1\uffff\2\6\2\uffff\1\4\4"+
			"\uffff\1\5\2\6\7\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\1\6\1\uffff\2\6\2\uffff\1\7\4"+
			"\uffff\1\5\2\6\7\uffff\1\6",
			"\1\10\4\uffff\1\10",
			"",
			"",
			"\1\11\4\uffff\1\11",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\1\6\1\uffff\2\6\2\uffff\1\4\4"+
			"\uffff\1\5\2\6\7\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\1\6\1\uffff\2\6\2\uffff\1\7\4"+
			"\uffff\1\5\2\6\7\uffff\1\6"
	};

	static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
	static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
	static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
	static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
	static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
	static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
	static final short[][] DFA26_transition;

	static {
		int numStates = DFA26_transitionS.length;
		DFA26_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
		}
	}

	protected class DFA26 extends DFA {

		public DFA26(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 26;
			this.eot = DFA26_eot;
			this.eof = DFA26_eof;
			this.min = DFA26_min;
			this.max = DFA26_max;
			this.accept = DFA26_accept;
			this.special = DFA26_special;
			this.transition = DFA26_transition;
		}
		@Override
		public String getDescription() {
			return "143:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_block_in_prog143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_block155 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_block157 = new BitSet(new long[]{0x0000E01000420002L});
	public static final BitSet FOLLOW_assignment_in_stat176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_stat186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutcall_in_stat191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_stat196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_returnstat207 = new BitSet(new long[]{0x0000000000420020L});
	public static final BitSet FOLLOW_fncall_in_returnstat209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_returnstat222 = new BitSet(new long[]{0x00010180684E0020L});
	public static final BitSet FOLLOW_expr_in_returnstat224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_ifstat242 = new BitSet(new long[]{0x00010180684E0020L});
	public static final BitSet FOLLOW_expr_in_ifstat246 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat250 = new BitSet(new long[]{0x00000C0000000002L});
	public static final BitSet FOLLOW_43_in_ifstat256 = new BitSet(new long[]{0x00010180684E0020L});
	public static final BitSet FOLLOW_expr_in_ifstat260 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat264 = new BitSet(new long[]{0x00000C0000000002L});
	public static final BitSet FOLLOW_42_in_ifstat272 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_classdef312 = new BitSet(new long[]{0x0002000100080000L});
	public static final BitSet FOLLOW_fielddef_in_classdef315 = new BitSet(new long[]{0x0002000100000000L});
	public static final BitSet FOLLOW_32_in_classdef320 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_fielddef_in_classdef322 = new BitSet(new long[]{0x0002000100000000L});
	public static final BitSet FOLLOW_49_in_classdef326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment342 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment344 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSDEF_in_assignment346 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_classdef_in_assignment348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment365 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment367 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_assignment371 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_assignment373 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_assignment375 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_classdef_in_assignment377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment396 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment398 = new BitSet(new long[]{0x00010180684E0020L});
	public static final BitSet FOLLOW_expr_in_assignment400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment415 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment417 = new BitSet(new long[]{0x0000000000420020L});
	public static final BitSet FOLLOW_fncall_in_assignment419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramtype_in_defable440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_defable445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutdecl_in_defable450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_fielddef462 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_fielddef464 = new BitSet(new long[]{0x0000008020020000L});
	public static final BitSet FOLLOW_defable_in_fielddef466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANONVAR_in_nested_id489 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_nested_id492 = new BitSet(new long[]{0x0000000000420000L});
	public static final BitSet FOLLOW_any_id_in_nested_id494 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_any_id_in_nested_id508 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_nested_id511 = new BitSet(new long[]{0x0000000000420000L});
	public static final BitSet FOLLOW_any_id_in_nested_id513 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_nested_id_in_fncall530 = new BitSet(new long[]{0x00010180684E0020L});
	public static final BitSet FOLLOW_param_in_fncall532 = new BitSet(new long[]{0x00010181684E0022L});
	public static final BitSet FOLLOW_32_in_fncall535 = new BitSet(new long[]{0x00010180684E0020L});
	public static final BitSet FOLLOW_param_in_fncall538 = new BitSet(new long[]{0x00010181684E0022L});
	public static final BitSet FOLLOW_ID_in_param561 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_param563 = new BitSet(new long[]{0x00010180684E0020L});
	public static final BitSet FOLLOW_expr_in_param565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_param580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_blockparamtype600 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_blockparamtype602 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_32_in_blockparamtype605 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_blockparamtype607 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_31_in_blockparamtype611 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_blockparamtype613 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_blockparamtype615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_blockparamtype625 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_blockparamtype627 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_blockparamtype629 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_blockparamtype631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paramtype646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_paramtype651 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_blockparamtype_in_paramtype653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_paramtype666 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_blockparamtype_in_paramtype668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fnparam687 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_fnparam689 = new BitSet(new long[]{0x0000008020020000L});
	public static final BitSet FOLLOW_paramtype_in_fnparam691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_anonfn711 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_anonfn713 = new BitSet(new long[]{0x0000000000420020L});
	public static final BitSet FOLLOW_fncall_in_anonfn715 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_anonfn717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_anonfn730 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_anonfn732 = new BitSet(new long[]{0x0000000000420020L});
	public static final BitSet FOLLOW_nested_id_in_anonfn734 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_anonfn736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_blockdecl755 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_blockdecl757 = new BitSet(new long[]{0x0000010400000000L});
	public static final BitSet FOLLOW_34_in_blockdecl760 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_blockdecl762 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_blockdecl778 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl780 = new BitSet(new long[]{0x0000000180020000L});
	public static final BitSet FOLLOW_32_in_blockdecl783 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl786 = new BitSet(new long[]{0x0000000180020000L});
	public static final BitSet FOLLOW_31_in_blockdecl790 = new BitSet(new long[]{0x0000010400000000L});
	public static final BitSet FOLLOW_34_in_blockdecl793 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_blockdecl795 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_fndecl819 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_blockdecl_in_fndecl821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_mutdecl839 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_blockdecl_in_mutdecl841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_expr859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_expr869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutdecl_in_expr874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anonfn_in_expr879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_expr884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_standalone_fncall895 = new BitSet(new long[]{0x0000000000420020L});
	public static final BitSet FOLLOW_fncall_in_standalone_fncall897 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_standalone_fncall899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_mutcall913 = new BitSet(new long[]{0x0000000000420020L});
	public static final BitSet FOLLOW_nested_id_in_mutcall915 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_mutcall917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_mutcall926 = new BitSet(new long[]{0x0000000000420020L});
	public static final BitSet FOLLOW_fncall_in_mutcall928 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_mutcall930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_index_expr945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_index_expr950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_index_expr955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_index_expr960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standalone_fncall_in_index_expr965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_dict_pair977 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_dict_pair979 = new BitSet(new long[]{0x00010180684E0020L});
	public static final BitSet FOLLOW_expr_in_dict_pair981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_dict997 = new BitSet(new long[]{0x00020001484E0020L});
	public static final BitSet FOLLOW_dict_pair_in_dict1000 = new BitSet(new long[]{0x0002000100000000L});
	public static final BitSet FOLLOW_32_in_dict1005 = new BitSet(new long[]{0x00000000484E0020L});
	public static final BitSet FOLLOW_dict_pair_in_dict1007 = new BitSet(new long[]{0x0002000100000000L});
	public static final BitSet FOLLOW_49_in_dict1011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_contained_block1033 = new BitSet(new long[]{0x0000E01000420000L});
	public static final BitSet FOLLOW_block_in_contained_block1035 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_contained_block1037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_array1051 = new BitSet(new long[]{0x00010381684E0020L});
	public static final BitSet FOLLOW_expr_in_array1053 = new BitSet(new long[]{0x0000020100000000L});
	public static final BitSet FOLLOW_32_in_array1057 = new BitSet(new long[]{0x00010180684E0020L});
	public static final BitSet FOLLOW_expr_in_array1059 = new BitSet(new long[]{0x0000020100000000L});
	public static final BitSet FOLLOW_41_in_array1063 = new BitSet(new long[]{0x0000000000000002L});
}
