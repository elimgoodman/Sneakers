// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-21 08:45:24
 package sneakers; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class SneakersParser extends Parser {
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


	public SneakersParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SneakersParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return SneakersParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/eli/dev/Sneakers-Java/Sneakers.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:28:1: prog : block ;
	public final SneakersParser.prog_return prog() throws RecognitionException {
		SneakersParser.prog_return retval = new SneakersParser.prog_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		ParserRuleReturnScope block1 =null;


		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:28:6: ( block )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:28:8: block
			{
			root_0 = (SneakersAST)adaptor.nil();


			pushFollow(FOLLOW_block_in_prog99);
			block1=block();
			state._fsp--;

			adaptor.addChild(root_0, block1.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class block_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:1: block : ( stat ';' )+ -> ^( BLOCK ( stat )+ ) ;
	public final SneakersParser.block_return block() throws RecognitionException {
		SneakersParser.block_return retval = new SneakersParser.block_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal3=null;
		ParserRuleReturnScope stat2 =null;

		SneakersAST char_literal3_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:8: ( ( stat ';' )+ -> ^( BLOCK ( stat )+ ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:10: ( stat ';' )+
			{
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:10: ( stat ';' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==MUTID||LA1_0==TYPEID||LA1_0==31||(LA1_0 >= 40 && LA1_0 <= 42)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:11: stat ';'
					{
					pushFollow(FOLLOW_stat_in_block111);
					stat2=stat();
					state._fsp--;

					stream_stat.add(stat2.getTree());
					char_literal3=(Token)match(input,30,FOLLOW_30_in_block113);  
					stream_30.add(char_literal3);

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// AST REWRITE
			// elements: stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (SneakersAST)adaptor.nil();
			// 31:22: -> ^( BLOCK ( stat )+ )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:31:25: ^( BLOCK ( stat )+ )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(BLOCK, "BLOCK"), root_1);
				if ( !(stream_stat.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_stat.hasNext() ) {
					adaptor.addChild(root_1, stream_stat.nextTree());
				}
				stream_stat.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class stat_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:33:1: stat : ( assignment | ifstat | returnstat | mutcall | 'pass' );
	public final SneakersParser.stat_return stat() throws RecognitionException {
		SneakersParser.stat_return retval = new SneakersParser.stat_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token string_literal8=null;
		ParserRuleReturnScope assignment4 =null;
		ParserRuleReturnScope ifstat5 =null;
		ParserRuleReturnScope returnstat6 =null;
		ParserRuleReturnScope mutcall7 =null;

		SneakersAST string_literal8_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:33:6: ( assignment | ifstat | returnstat | mutcall | 'pass' )
			int alt2=5;
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
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:33:8: assignment
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_stat132);
					assignment4=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment4.getTree());

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:34:4: ifstat
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_ifstat_in_stat137);
					ifstat5=ifstat();
					state._fsp--;

					adaptor.addChild(root_0, ifstat5.getTree());

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:35:4: returnstat
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_returnstat_in_stat142);
					returnstat6=returnstat();
					state._fsp--;

					adaptor.addChild(root_0, returnstat6.getTree());

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:36:4: mutcall
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_mutcall_in_stat147);
					mutcall7=mutcall();
					state._fsp--;

					adaptor.addChild(root_0, mutcall7.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:37:4: 'pass'
					{
					root_0 = (SneakersAST)adaptor.nil();


					string_literal8=(Token)match(input,41,FOLLOW_41_in_stat152); 
					string_literal8_tree = (SneakersAST)adaptor.create(string_literal8);
					adaptor.addChild(root_0, string_literal8_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class returnstat_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "returnstat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:40:1: returnstat : ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) );
	public final SneakersParser.returnstat_return returnstat() throws RecognitionException {
		SneakersParser.returnstat_return retval = new SneakersParser.returnstat_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token string_literal9=null;
		Token string_literal11=null;
		ParserRuleReturnScope fncall10 =null;
		ParserRuleReturnScope expr12 =null;

		SneakersAST string_literal9_tree=null;
		SneakersAST string_literal11_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:41:2: ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) )
			int alt3=2;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:41:4: 'return' fncall
					{
					string_literal9=(Token)match(input,42,FOLLOW_42_in_returnstat163);  
					stream_42.add(string_literal9);

					pushFollow(FOLLOW_fncall_in_returnstat165);
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

					root_0 = (SneakersAST)adaptor.nil();
					// 41:20: -> ^( RET fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:41:23: ^( RET fncall )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(RET, "RET"), root_1);
						adaptor.addChild(root_1, stream_fncall.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:42:4: 'return' expr
					{
					string_literal11=(Token)match(input,42,FOLLOW_42_in_returnstat178);  
					stream_42.add(string_literal11);

					pushFollow(FOLLOW_expr_in_returnstat180);
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

					root_0 = (SneakersAST)adaptor.nil();
					// 42:18: -> ^( RET expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:42:21: ^( RET expr )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(RET, "RET"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "returnstat"


	public static class ifstat_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "ifstat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:1: ifstat : 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) ;
	public final SneakersParser.ifstat_return ifstat() throws RecognitionException {
		SneakersParser.ifstat_return retval = new SneakersParser.ifstat_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

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
		SneakersAST string_literal13_tree=null;
		SneakersAST string_literal14_tree=null;
		SneakersAST string_literal15_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:8: ( 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:45:10: 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )?
			{
			string_literal13=(Token)match(input,40,FOLLOW_40_in_ifstat198);  
			stream_40.add(string_literal13);

			pushFollow(FOLLOW_expr_in_ifstat202);
			ifexpr=expr();
			state._fsp--;

			stream_expr.add(ifexpr.getTree());
			pushFollow(FOLLOW_contained_block_in_ifstat206);
			ifblock=contained_block();
			state._fsp--;

			stream_contained_block.add(ifblock.getTree());
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:3: ( 'elseif' elifexpr+= expr elifblock+= contained_block )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==39) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:4: 'elseif' elifexpr+= expr elifblock+= contained_block
					{
					string_literal14=(Token)match(input,39,FOLLOW_39_in_ifstat212);  
					stream_39.add(string_literal14);

					pushFollow(FOLLOW_expr_in_ifstat216);
					elifexpr=expr();
					state._fsp--;

					stream_expr.add(elifexpr.getTree());
					if (list_elifexpr==null) list_elifexpr=new ArrayList<Object>();
					list_elifexpr.add(elifexpr.getTree());
					pushFollow(FOLLOW_contained_block_in_ifstat220);
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

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:47:3: ( 'else' elseblock= contained_block )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==38) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:47:4: 'else' elseblock= contained_block
					{
					string_literal15=(Token)match(input,38,FOLLOW_38_in_ifstat228);  
					stream_38.add(string_literal15);

					pushFollow(FOLLOW_contained_block_in_ifstat232);
					elseblock=contained_block();
					state._fsp--;

					stream_contained_block.add(elseblock.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: elifblock, 40, ifexpr, ifblock, elifexpr, elseblock
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
			root_0 = (SneakersAST)adaptor.nil();
			// 48:3: -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:6: ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot(stream_40.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ifexpr.nextTree());
				adaptor.addChild(root_1, stream_ifblock.nextTree());
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:30: ( $elifexpr $elifblock)*
				while ( stream_elifblock.hasNext()||stream_elifexpr.hasNext() ) {
					adaptor.addChild(root_1, stream_elifexpr.nextTree());
					adaptor.addChild(root_1, stream_elifblock.nextTree());
				}
				stream_elifblock.reset();
				stream_elifexpr.reset();

				// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:55: ( $elseblock)?
				if ( stream_elseblock.hasNext() ) {
					adaptor.addChild(root_1, stream_elseblock.nextTree());
				}
				stream_elseblock.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifstat"


	public static class assignment_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:50:1: assignment : ( any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );
	public final SneakersParser.assignment_return assignment() throws RecognitionException {
		SneakersParser.assignment_return retval = new SneakersParser.assignment_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal17=null;
		Token char_literal20=null;
		ParserRuleReturnScope any_id16 =null;
		ParserRuleReturnScope expr18 =null;
		ParserRuleReturnScope any_id19 =null;
		ParserRuleReturnScope fncall21 =null;

		SneakersAST char_literal17_tree=null;
		SneakersAST char_literal20_tree=null;
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:2: ( any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) )
			int alt6=2;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:4: any_id '=' expr
					{
					pushFollow(FOLLOW_any_id_in_assignment270);
					any_id16=any_id();
					state._fsp--;

					stream_any_id.add(any_id16.getTree());
					char_literal17=(Token)match(input,32,FOLLOW_32_in_assignment272);  
					stream_32.add(char_literal17);

					pushFollow(FOLLOW_expr_in_assignment274);
					expr18=expr();
					state._fsp--;

					stream_expr.add(expr18.getTree());
					// AST REWRITE
					// elements: expr, any_id, 32
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 51:20: -> ^( '=' any_id expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:23: ^( '=' any_id expr )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_32.nextNode(), root_1);
						adaptor.addChild(root_1, stream_any_id.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:52:4: any_id '=' fncall
					{
					pushFollow(FOLLOW_any_id_in_assignment289);
					any_id19=any_id();
					state._fsp--;

					stream_any_id.add(any_id19.getTree());
					char_literal20=(Token)match(input,32,FOLLOW_32_in_assignment291);  
					stream_32.add(char_literal20);

					pushFollow(FOLLOW_fncall_in_assignment293);
					fncall21=fncall();
					state._fsp--;

					stream_fncall.add(fncall21.getTree());
					// AST REWRITE
					// elements: 32, fncall, any_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 52:22: -> ^( '=' any_id fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:52:25: ^( '=' any_id fncall )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_32.nextNode(), root_1);
						adaptor.addChild(root_1, stream_any_id.nextTree());
						adaptor.addChild(root_1, stream_fncall.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class defable_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "defable"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:56:1: defable : ( TYPEID | fndecl ( stat )+ );
	public final SneakersParser.defable_return defable() throws RecognitionException {
		SneakersParser.defable_return retval = new SneakersParser.defable_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token TYPEID22=null;
		ParserRuleReturnScope fndecl23 =null;
		ParserRuleReturnScope stat24 =null;

		SneakersAST TYPEID22_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:56:9: ( TYPEID | fndecl ( stat )+ )
			int alt8=2;
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
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:56:11: TYPEID
					{
					root_0 = (SneakersAST)adaptor.nil();


					TYPEID22=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_defable314); 
					TYPEID22_tree = (SneakersAST)adaptor.create(TYPEID22);
					adaptor.addChild(root_0, TYPEID22_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:4: fndecl ( stat )+
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_fndecl_in_defable319);
					fndecl23=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl23.getTree());

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:11: ( stat )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==ID||LA7_0==MUTID||LA7_0==TYPEID||LA7_0==31||(LA7_0 >= 40 && LA7_0 <= 42)) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:11: stat
							{
							pushFollow(FOLLOW_stat_in_defable321);
							stat24=stat();
							state._fsp--;

							adaptor.addChild(root_0, stat24.getTree());

							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "defable"


	public static class defdecl_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "defdecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:60:1: defdecl : KEYWORD '=>' defable ;
	public final SneakersParser.defdecl_return defdecl() throws RecognitionException {
		SneakersParser.defdecl_return retval = new SneakersParser.defdecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token KEYWORD25=null;
		Token string_literal26=null;
		ParserRuleReturnScope defable27 =null;

		SneakersAST KEYWORD25_tree=null;
		SneakersAST string_literal26_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:60:9: ( KEYWORD '=>' defable )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:60:11: KEYWORD '=>' defable
			{
			root_0 = (SneakersAST)adaptor.nil();


			KEYWORD25=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_defdecl332); 
			KEYWORD25_tree = (SneakersAST)adaptor.create(KEYWORD25);
			adaptor.addChild(root_0, KEYWORD25_tree);

			string_literal26=(Token)match(input,33,FOLLOW_33_in_defdecl334); 
			string_literal26_tree = (SneakersAST)adaptor.create(string_literal26);
			adaptor.addChild(root_0, string_literal26_tree);

			pushFollow(FOLLOW_defable_in_defdecl336);
			defable27=defable();
			state._fsp--;

			adaptor.addChild(root_0, defable27.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "defdecl"


	public static class nested_id_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "nested_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:1: nested_id : ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* );
	public final SneakersParser.nested_id_return nested_id() throws RecognitionException {
		SneakersParser.nested_id_return retval = new SneakersParser.nested_id_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ANONVAR28=null;
		Token char_literal29=null;
		Token char_literal32=null;
		ParserRuleReturnScope any_id30 =null;
		ParserRuleReturnScope any_id31 =null;
		ParserRuleReturnScope any_id33 =null;

		SneakersAST ANONVAR28_tree=null;
		SneakersAST char_literal29_tree=null;
		SneakersAST char_literal32_tree=null;
		RewriteRuleTokenStream stream_ANONVAR=new RewriteRuleTokenStream(adaptor,"token ANONVAR");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:2: ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* )
			int alt11=2;
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
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:4: ANONVAR ( '.' any_id )*
					{
					ANONVAR28=(Token)match(input,ANONVAR,FOLLOW_ANONVAR_in_nested_id349);  
					stream_ANONVAR.add(ANONVAR28);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:12: ( '.' any_id )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==28) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:13: '.' any_id
							{
							char_literal29=(Token)match(input,28,FOLLOW_28_in_nested_id352);  
							stream_28.add(char_literal29);

							pushFollow(FOLLOW_any_id_in_nested_id354);
							any_id30=any_id();
							state._fsp--;

							stream_any_id.add(any_id30.getTree());
							}
							break;

						default :
							break loop9;
						}
					}

					// AST REWRITE
					// elements: any_id, ANONVAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 65:26: -> ANONVAR ( any_id )*
					{
						adaptor.addChild(root_0, stream_ANONVAR.nextNode());
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:37: ( any_id )*
						while ( stream_any_id.hasNext() ) {
							adaptor.addChild(root_0, stream_any_id.nextTree());
						}
						stream_any_id.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:4: any_id ( '.' any_id )*
					{
					pushFollow(FOLLOW_any_id_in_nested_id368);
					any_id31=any_id();
					state._fsp--;

					stream_any_id.add(any_id31.getTree());
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:11: ( '.' any_id )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==28) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:12: '.' any_id
							{
							char_literal32=(Token)match(input,28,FOLLOW_28_in_nested_id371);  
							stream_28.add(char_literal32);

							pushFollow(FOLLOW_any_id_in_nested_id373);
							any_id33=any_id();
							state._fsp--;

							stream_any_id.add(any_id33.getTree());
							}
							break;

						default :
							break loop10;
						}
					}

					// AST REWRITE
					// elements: any_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 66:25: -> ( any_id )*
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:28: ( any_id )*
						while ( stream_any_id.hasNext() ) {
							adaptor.addChild(root_0, stream_any_id.nextTree());
						}
						stream_any_id.reset();

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nested_id"


	public static class fncall_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "fncall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:1: fncall : nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) ;
	public final SneakersParser.fncall_return fncall() throws RecognitionException {
		SneakersParser.fncall_return retval = new SneakersParser.fncall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal36=null;
		ParserRuleReturnScope nested_id34 =null;
		ParserRuleReturnScope param35 =null;
		ParserRuleReturnScope param37 =null;

		SneakersAST char_literal36_tree=null;
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:8: ( nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:10: nested_id param ( ( ',' )? param )*
			{
			pushFollow(FOLLOW_nested_id_in_fncall390);
			nested_id34=nested_id();
			state._fsp--;

			stream_nested_id.add(nested_id34.getTree());
			pushFollow(FOLLOW_param_in_fncall392);
			param35=param();
			state._fsp--;

			stream_param.add(param35.getTree());
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:26: ( ( ',' )? param )*
			loop13:
			while (true) {
				int alt13=2;
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
				switch (alt13) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:27: ( ',' )? param
					{
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:27: ( ',' )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==27) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:27: ','
							{
							char_literal36=(Token)match(input,27,FOLLOW_27_in_fncall395);  
							stream_27.add(char_literal36);

							}
							break;

					}

					pushFollow(FOLLOW_param_in_fncall398);
					param37=param();
					state._fsp--;

					stream_param.add(param37.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			// AST REWRITE
			// elements: param, nested_id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (SneakersAST)adaptor.nil();
			// 69:40: -> ^( FNCALL nested_id ( param )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:43: ^( FNCALL nested_id ( param )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(FNCALL, "FNCALL"), root_1);
				adaptor.addChild(root_1, stream_nested_id.nextTree());
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:62: ( param )*
				while ( stream_param.hasNext() ) {
					adaptor.addChild(root_1, stream_param.nextTree());
				}
				stream_param.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fncall"


	public static class param_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "param"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:1: param : ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) );
	public final SneakersParser.param_return param() throws RecognitionException {
		SneakersParser.param_return retval = new SneakersParser.param_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ID38=null;
		Token char_literal39=null;
		ParserRuleReturnScope expr40 =null;
		ParserRuleReturnScope expr41 =null;

		SneakersAST ID38_tree=null;
		SneakersAST char_literal39_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:7: ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) )
			int alt14=2;
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
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:9: ID ':' expr
					{
					ID38=(Token)match(input,ID,FOLLOW_ID_in_param421);  
					stream_ID.add(ID38);

					char_literal39=(Token)match(input,29,FOLLOW_29_in_param423);  
					stream_29.add(char_literal39);

					pushFollow(FOLLOW_expr_in_param425);
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

					root_0 = (SneakersAST)adaptor.nil();
					// 72:21: -> ^( PARAM ID expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:24: ^( PARAM ID expr )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(PARAM, "PARAM"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:4: expr
					{
					pushFollow(FOLLOW_expr_in_param440);
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

					root_0 = (SneakersAST)adaptor.nil();
					// 73:9: -> ^( PARAM expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:12: ^( PARAM expr )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(PARAM, "PARAM"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param"


	public static class paramtype_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "paramtype"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:1: paramtype : ( TYPEID | '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ^( PARAMTYPEFN ( TYPEID )+ ) | '(' ')' ':' TYPEID -> ^( PARAMTYPEFN TYPEID ) );
	public final SneakersParser.paramtype_return paramtype() throws RecognitionException {
		SneakersParser.paramtype_return retval = new SneakersParser.paramtype_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

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

		SneakersAST TYPEID42_tree=null;
		SneakersAST char_literal43_tree=null;
		SneakersAST TYPEID44_tree=null;
		SneakersAST char_literal45_tree=null;
		SneakersAST TYPEID46_tree=null;
		SneakersAST char_literal47_tree=null;
		SneakersAST char_literal48_tree=null;
		SneakersAST TYPEID49_tree=null;
		SneakersAST char_literal50_tree=null;
		SneakersAST char_literal51_tree=null;
		SneakersAST char_literal52_tree=null;
		SneakersAST TYPEID53_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:11: ( TYPEID | '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ^( PARAMTYPEFN ( TYPEID )+ ) | '(' ')' ':' TYPEID -> ^( PARAMTYPEFN TYPEID ) )
			int alt16=3;
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
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:14: TYPEID
					{
					root_0 = (SneakersAST)adaptor.nil();


					TYPEID42=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype459); 
					TYPEID42_tree = (SneakersAST)adaptor.create(TYPEID42);
					adaptor.addChild(root_0, TYPEID42_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:4: '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID
					{
					char_literal43=(Token)match(input,25,FOLLOW_25_in_paramtype464);  
					stream_25.add(char_literal43);

					TYPEID44=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype466);  
					stream_TYPEID.add(TYPEID44);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:15: ( ',' TYPEID )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==27) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:16: ',' TYPEID
							{
							char_literal45=(Token)match(input,27,FOLLOW_27_in_paramtype469);  
							stream_27.add(char_literal45);

							TYPEID46=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype471);  
							stream_TYPEID.add(TYPEID46);

							}
							break;

						default :
							break loop15;
						}
					}

					char_literal47=(Token)match(input,26,FOLLOW_26_in_paramtype475);  
					stream_26.add(char_literal47);

					char_literal48=(Token)match(input,29,FOLLOW_29_in_paramtype477);  
					stream_29.add(char_literal48);

					TYPEID49=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype479);  
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

					root_0 = (SneakersAST)adaptor.nil();
					// 77:44: -> ^( PARAMTYPEFN ( TYPEID )+ )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:47: ^( PARAMTYPEFN ( TYPEID )+ )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(PARAMTYPEFN, "PARAMTYPEFN"), root_1);
						if ( !(stream_TYPEID.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_TYPEID.hasNext() ) {
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:78:4: '(' ')' ':' TYPEID
					{
					char_literal50=(Token)match(input,25,FOLLOW_25_in_paramtype493);  
					stream_25.add(char_literal50);

					char_literal51=(Token)match(input,26,FOLLOW_26_in_paramtype495);  
					stream_26.add(char_literal51);

					char_literal52=(Token)match(input,29,FOLLOW_29_in_paramtype497);  
					stream_29.add(char_literal52);

					TYPEID53=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype499);  
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

					root_0 = (SneakersAST)adaptor.nil();
					// 78:23: -> ^( PARAMTYPEFN TYPEID )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:78:26: ^( PARAMTYPEFN TYPEID )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(PARAMTYPEFN, "PARAMTYPEFN"), root_1);
						adaptor.addChild(root_1, stream_TYPEID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramtype"


	public static class fnparam_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "fnparam"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:1: fnparam : ID ':' paramtype -> ^( FNPARAM ID paramtype ) ;
	public final SneakersParser.fnparam_return fnparam() throws RecognitionException {
		SneakersParser.fnparam_return retval = new SneakersParser.fnparam_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ID54=null;
		Token char_literal55=null;
		ParserRuleReturnScope paramtype56 =null;

		SneakersAST ID54_tree=null;
		SneakersAST char_literal55_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_paramtype=new RewriteRuleSubtreeStream(adaptor,"rule paramtype");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:9: ( ID ':' paramtype -> ^( FNPARAM ID paramtype ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:11: ID ':' paramtype
			{
			ID54=(Token)match(input,ID,FOLLOW_ID_in_fnparam518);  
			stream_ID.add(ID54);

			char_literal55=(Token)match(input,29,FOLLOW_29_in_fnparam520);  
			stream_29.add(char_literal55);

			pushFollow(FOLLOW_paramtype_in_fnparam522);
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

			root_0 = (SneakersAST)adaptor.nil();
			// 81:28: -> ^( FNPARAM ID paramtype )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:31: ^( FNPARAM ID paramtype )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(FNPARAM, "FNPARAM"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_paramtype.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fnparam"


	public static class anonfn_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "anonfn"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );
	public final SneakersParser.anonfn_return anonfn() throws RecognitionException {
		SneakersParser.anonfn_return retval = new SneakersParser.anonfn_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal57=null;
		Token char_literal58=null;
		Token char_literal60=null;
		Token char_literal61=null;
		Token char_literal62=null;
		Token char_literal64=null;
		ParserRuleReturnScope fncall59 =null;
		ParserRuleReturnScope nested_id63 =null;

		SneakersAST char_literal57_tree=null;
		SneakersAST char_literal58_tree=null;
		SneakersAST char_literal60_tree=null;
		SneakersAST char_literal61_tree=null;
		SneakersAST char_literal62_tree=null;
		SneakersAST char_literal64_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:8: ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) )
			int alt17=2;
			alt17 = dfa17.predict(input);
			switch (alt17) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:10: '#' '[' fncall ']'
					{
					char_literal57=(Token)match(input,24,FOLLOW_24_in_anonfn542);  
					stream_24.add(char_literal57);

					char_literal58=(Token)match(input,36,FOLLOW_36_in_anonfn544);  
					stream_36.add(char_literal58);

					pushFollow(FOLLOW_fncall_in_anonfn546);
					fncall59=fncall();
					state._fsp--;

					stream_fncall.add(fncall59.getTree());
					char_literal60=(Token)match(input,37,FOLLOW_37_in_anonfn548);  
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

					root_0 = (SneakersAST)adaptor.nil();
					// 84:29: -> ^( ANONFN fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:32: ^( ANONFN fncall )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(ANONFN, "ANONFN"), root_1);
						adaptor.addChild(root_1, stream_fncall.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:85:4: '#' '[' nested_id ']'
					{
					char_literal61=(Token)match(input,24,FOLLOW_24_in_anonfn561);  
					stream_24.add(char_literal61);

					char_literal62=(Token)match(input,36,FOLLOW_36_in_anonfn563);  
					stream_36.add(char_literal62);

					pushFollow(FOLLOW_nested_id_in_anonfn565);
					nested_id63=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id63.getTree());
					char_literal64=(Token)match(input,37,FOLLOW_37_in_anonfn567);  
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

					root_0 = (SneakersAST)adaptor.nil();
					// 85:26: -> ^( ANONFN nested_id )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:85:29: ^( ANONFN nested_id )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(ANONFN, "ANONFN"), root_1);
						adaptor.addChild(root_1, stream_nested_id.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "anonfn"


	public static class blockdecl_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "blockdecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:1: blockdecl : ( '(' ')' ( ':' TYPEID )? contained_block -> ^( BLOCKDECL ( TYPEID )? contained_block ) | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block -> ^( BLOCKDECL ( fnparam )* ( TYPEID )? contained_block ) );
	public final SneakersParser.blockdecl_return blockdecl() throws RecognitionException {
		SneakersParser.blockdecl_return retval = new SneakersParser.blockdecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

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

		SneakersAST char_literal65_tree=null;
		SneakersAST char_literal66_tree=null;
		SneakersAST char_literal67_tree=null;
		SneakersAST TYPEID68_tree=null;
		SneakersAST char_literal70_tree=null;
		SneakersAST char_literal72_tree=null;
		SneakersAST char_literal74_tree=null;
		SneakersAST char_literal75_tree=null;
		SneakersAST TYPEID76_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_fnparam=new RewriteRuleSubtreeStream(adaptor,"rule fnparam");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:2: ( '(' ')' ( ':' TYPEID )? contained_block -> ^( BLOCKDECL ( TYPEID )? contained_block ) | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block -> ^( BLOCKDECL ( fnparam )* ( TYPEID )? contained_block ) )
			int alt22=2;
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
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:4: '(' ')' ( ':' TYPEID )? contained_block
					{
					char_literal65=(Token)match(input,25,FOLLOW_25_in_blockdecl586);  
					stream_25.add(char_literal65);

					char_literal66=(Token)match(input,26,FOLLOW_26_in_blockdecl588);  
					stream_26.add(char_literal66);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:12: ( ':' TYPEID )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==29) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:13: ':' TYPEID
							{
							char_literal67=(Token)match(input,29,FOLLOW_29_in_blockdecl591);  
							stream_29.add(char_literal67);

							TYPEID68=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl593);  
							stream_TYPEID.add(TYPEID68);

							}
							break;

					}

					pushFollow(FOLLOW_contained_block_in_blockdecl597);
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

					root_0 = (SneakersAST)adaptor.nil();
					// 89:42: -> ^( BLOCKDECL ( TYPEID )? contained_block )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:45: ^( BLOCKDECL ( TYPEID )? contained_block )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(BLOCKDECL, "BLOCKDECL"), root_1);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:57: ( TYPEID )?
						if ( stream_TYPEID.hasNext() ) {
							adaptor.addChild(root_1, stream_TYPEID.nextNode());
						}
						stream_TYPEID.reset();

						adaptor.addChild(root_1, stream_contained_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:4: '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block
					{
					char_literal70=(Token)match(input,25,FOLLOW_25_in_blockdecl613);  
					stream_25.add(char_literal70);

					pushFollow(FOLLOW_fnparam_in_blockdecl615);
					fnparam71=fnparam();
					state._fsp--;

					stream_fnparam.add(fnparam71.getTree());
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:16: ( ( ',' )? fnparam )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==ID||LA20_0==27) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:17: ( ',' )? fnparam
							{
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:17: ( ',' )?
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==27) ) {
								alt19=1;
							}
							switch (alt19) {
								case 1 :
									// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:17: ','
									{
									char_literal72=(Token)match(input,27,FOLLOW_27_in_blockdecl618);  
									stream_27.add(char_literal72);

									}
									break;

							}

							pushFollow(FOLLOW_fnparam_in_blockdecl621);
							fnparam73=fnparam();
							state._fsp--;

							stream_fnparam.add(fnparam73.getTree());
							}
							break;

						default :
							break loop20;
						}
					}

					char_literal74=(Token)match(input,26,FOLLOW_26_in_blockdecl625);  
					stream_26.add(char_literal74);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:36: ( ':' TYPEID )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==29) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:37: ':' TYPEID
							{
							char_literal75=(Token)match(input,29,FOLLOW_29_in_blockdecl628);  
							stream_29.add(char_literal75);

							TYPEID76=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl630);  
							stream_TYPEID.add(TYPEID76);

							}
							break;

					}

					pushFollow(FOLLOW_contained_block_in_blockdecl634);
					contained_block77=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block77.getTree());
					// AST REWRITE
					// elements: contained_block, TYPEID, fnparam
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 90:66: -> ^( BLOCKDECL ( fnparam )* ( TYPEID )? contained_block )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:69: ^( BLOCKDECL ( fnparam )* ( TYPEID )? contained_block )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(BLOCKDECL, "BLOCKDECL"), root_1);
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:81: ( fnparam )*
						while ( stream_fnparam.hasNext() ) {
							adaptor.addChild(root_1, stream_fnparam.nextTree());
						}
						stream_fnparam.reset();

						// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:90: ( TYPEID )?
						if ( stream_TYPEID.hasNext() ) {
							adaptor.addChild(root_1, stream_TYPEID.nextNode());
						}
						stream_TYPEID.reset();

						adaptor.addChild(root_1, stream_contained_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "blockdecl"


	public static class fndecl_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "fndecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:1: fndecl : '#' blockdecl -> ^( FNDECL blockdecl ) ;
	public final SneakersParser.fndecl_return fndecl() throws RecognitionException {
		SneakersParser.fndecl_return retval = new SneakersParser.fndecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal78=null;
		ParserRuleReturnScope blockdecl79 =null;

		SneakersAST char_literal78_tree=null;
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:8: ( '#' blockdecl -> ^( FNDECL blockdecl ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:10: '#' blockdecl
			{
			char_literal78=(Token)match(input,24,FOLLOW_24_in_fndecl658);  
			stream_24.add(char_literal78);

			pushFollow(FOLLOW_blockdecl_in_fndecl660);
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

			root_0 = (SneakersAST)adaptor.nil();
			// 93:24: -> ^( FNDECL blockdecl )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:27: ^( FNDECL blockdecl )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(FNDECL, "FNDECL"), root_1);
				adaptor.addChild(root_1, stream_blockdecl.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fndecl"


	public static class mutdecl_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "mutdecl"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:1: mutdecl : '@' blockdecl -> ^( MUTDECL blockdecl ) ;
	public final SneakersParser.mutdecl_return mutdecl() throws RecognitionException {
		SneakersParser.mutdecl_return retval = new SneakersParser.mutdecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal80=null;
		ParserRuleReturnScope blockdecl81 =null;

		SneakersAST char_literal80_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:9: ( '@' blockdecl -> ^( MUTDECL blockdecl ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:11: '@' blockdecl
			{
			char_literal80=(Token)match(input,35,FOLLOW_35_in_mutdecl678);  
			stream_35.add(char_literal80);

			pushFollow(FOLLOW_blockdecl_in_mutdecl680);
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

			root_0 = (SneakersAST)adaptor.nil();
			// 96:25: -> ^( MUTDECL blockdecl )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:28: ^( MUTDECL blockdecl )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(MUTDECL, "MUTDECL"), root_1);
				adaptor.addChild(root_1, stream_blockdecl.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mutdecl"


	public static class expr_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:1: expr : ( index_expr | dict | fndecl | mutdecl | anonfn | array );
	public final SneakersParser.expr_return expr() throws RecognitionException {
		SneakersParser.expr_return retval = new SneakersParser.expr_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		ParserRuleReturnScope index_expr82 =null;
		ParserRuleReturnScope dict83 =null;
		ParserRuleReturnScope fndecl84 =null;
		ParserRuleReturnScope mutdecl85 =null;
		ParserRuleReturnScope anonfn86 =null;
		ParserRuleReturnScope array87 =null;


		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:6: ( index_expr | dict | fndecl | mutdecl | anonfn | array )
			int alt23=6;
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
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:8: index_expr
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_index_expr_in_expr698);
					index_expr82=index_expr();
					state._fsp--;

					adaptor.addChild(root_0, index_expr82.getTree());

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:4: dict
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_dict_in_expr703);
					dict83=dict();
					state._fsp--;

					adaptor.addChild(root_0, dict83.getTree());

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:101:4: fndecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_fndecl_in_expr708);
					fndecl84=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl84.getTree());

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:102:4: mutdecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_mutdecl_in_expr713);
					mutdecl85=mutdecl();
					state._fsp--;

					adaptor.addChild(root_0, mutdecl85.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:103:4: anonfn
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_anonfn_in_expr718);
					anonfn86=anonfn();
					state._fsp--;

					adaptor.addChild(root_0, anonfn86.getTree());

					}
					break;
				case 6 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:4: array
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_array_in_expr723);
					array87=array();
					state._fsp--;

					adaptor.addChild(root_0, array87.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class standalone_fncall_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "standalone_fncall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:1: standalone_fncall : '(' fncall ')' -> fncall ;
	public final SneakersParser.standalone_fncall_return standalone_fncall() throws RecognitionException {
		SneakersParser.standalone_fncall_return retval = new SneakersParser.standalone_fncall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal88=null;
		Token char_literal90=null;
		ParserRuleReturnScope fncall89 =null;

		SneakersAST char_literal88_tree=null;
		SneakersAST char_literal90_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:108:2: ( '(' fncall ')' -> fncall )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:108:4: '(' fncall ')'
			{
			char_literal88=(Token)match(input,25,FOLLOW_25_in_standalone_fncall734);  
			stream_25.add(char_literal88);

			pushFollow(FOLLOW_fncall_in_standalone_fncall736);
			fncall89=fncall();
			state._fsp--;

			stream_fncall.add(fncall89.getTree());
			char_literal90=(Token)match(input,26,FOLLOW_26_in_standalone_fncall738);  
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

			root_0 = (SneakersAST)adaptor.nil();
			// 108:19: -> fncall
			{
				adaptor.addChild(root_0, stream_fncall.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "standalone_fncall"


	public static class mutcall_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "mutcall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:111:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );
	public final SneakersParser.mutcall_return mutcall() throws RecognitionException {
		SneakersParser.mutcall_return retval = new SneakersParser.mutcall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal91=null;
		Token char_literal93=null;
		Token char_literal94=null;
		Token char_literal96=null;
		ParserRuleReturnScope nested_id92 =null;
		ParserRuleReturnScope fncall95 =null;

		SneakersAST char_literal91_tree=null;
		SneakersAST char_literal93_tree=null;
		SneakersAST char_literal94_tree=null;
		SneakersAST char_literal96_tree=null;
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:111:9: ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall )
			int alt24=2;
			alt24 = dfa24.predict(input);
			switch (alt24) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:111:11: '<' nested_id '>'
					{
					char_literal91=(Token)match(input,31,FOLLOW_31_in_mutcall752);  
					stream_31.add(char_literal91);

					pushFollow(FOLLOW_nested_id_in_mutcall754);
					nested_id92=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id92.getTree());
					char_literal93=(Token)match(input,34,FOLLOW_34_in_mutcall756);  
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

					root_0 = (SneakersAST)adaptor.nil();
					// 111:29: -> nested_id
					{
						adaptor.addChild(root_0, stream_nested_id.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:4: '<' fncall '>'
					{
					char_literal94=(Token)match(input,31,FOLLOW_31_in_mutcall765);  
					stream_31.add(char_literal94);

					pushFollow(FOLLOW_fncall_in_mutcall767);
					fncall95=fncall();
					state._fsp--;

					stream_fncall.add(fncall95.getTree());
					char_literal96=(Token)match(input,34,FOLLOW_34_in_mutcall769);  
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

					root_0 = (SneakersAST)adaptor.nil();
					// 112:19: -> fncall
					{
						adaptor.addChild(root_0, stream_fncall.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mutcall"


	public static class index_expr_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "index_expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:115:1: index_expr : ( KEYWORD | INT | STRING | nested_id | standalone_fncall );
	public final SneakersParser.index_expr_return index_expr() throws RecognitionException {
		SneakersParser.index_expr_return retval = new SneakersParser.index_expr_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token KEYWORD97=null;
		Token INT98=null;
		Token STRING99=null;
		ParserRuleReturnScope nested_id100 =null;
		ParserRuleReturnScope standalone_fncall101 =null;

		SneakersAST KEYWORD97_tree=null;
		SneakersAST INT98_tree=null;
		SneakersAST STRING99_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:2: ( KEYWORD | INT | STRING | nested_id | standalone_fncall )
			int alt25=5;
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
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:4: KEYWORD
					{
					root_0 = (SneakersAST)adaptor.nil();


					KEYWORD97=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_index_expr784); 
					KEYWORD97_tree = (SneakersAST)adaptor.create(KEYWORD97);
					adaptor.addChild(root_0, KEYWORD97_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:117:4: INT
					{
					root_0 = (SneakersAST)adaptor.nil();


					INT98=(Token)match(input,INT,FOLLOW_INT_in_index_expr789); 
					INT98_tree = (SneakersAST)adaptor.create(INT98);
					adaptor.addChild(root_0, INT98_tree);

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:4: STRING
					{
					root_0 = (SneakersAST)adaptor.nil();


					STRING99=(Token)match(input,STRING,FOLLOW_STRING_in_index_expr794); 
					STRING99_tree = (SneakersAST)adaptor.create(STRING99);
					adaptor.addChild(root_0, STRING99_tree);

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:119:4: nested_id
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_nested_id_in_index_expr799);
					nested_id100=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id100.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:120:4: standalone_fncall
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_standalone_fncall_in_index_expr804);
					standalone_fncall101=standalone_fncall();
					state._fsp--;

					adaptor.addChild(root_0, standalone_fncall101.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "index_expr"


	public static class dict_pair_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "dict_pair"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:123:1: dict_pair : index_expr '=>' expr -> index_expr expr ;
	public final SneakersParser.dict_pair_return dict_pair() throws RecognitionException {
		SneakersParser.dict_pair_return retval = new SneakersParser.dict_pair_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token string_literal103=null;
		ParserRuleReturnScope index_expr102 =null;
		ParserRuleReturnScope expr104 =null;

		SneakersAST string_literal103_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:124:2: ( index_expr '=>' expr -> index_expr expr )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:124:4: index_expr '=>' expr
			{
			pushFollow(FOLLOW_index_expr_in_dict_pair816);
			index_expr102=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr102.getTree());
			string_literal103=(Token)match(input,33,FOLLOW_33_in_dict_pair818);  
			stream_33.add(string_literal103);

			pushFollow(FOLLOW_expr_in_dict_pair820);
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

			root_0 = (SneakersAST)adaptor.nil();
			// 124:25: -> index_expr expr
			{
				adaptor.addChild(root_0, stream_index_expr.nextTree());
				adaptor.addChild(root_0, stream_expr.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dict_pair"


	public static class dict_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "dict"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:1: dict : '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) ;
	public final SneakersParser.dict_return dict() throws RecognitionException {
		SneakersParser.dict_return retval = new SneakersParser.dict_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal105=null;
		Token char_literal107=null;
		Token char_literal109=null;
		ParserRuleReturnScope dict_pair106 =null;
		ParserRuleReturnScope dict_pair108 =null;

		SneakersAST char_literal105_tree=null;
		SneakersAST char_literal107_tree=null;
		SneakersAST char_literal109_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_dict_pair=new RewriteRuleSubtreeStream(adaptor,"rule dict_pair");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:6: ( '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:8: '{' ( dict_pair )? ( ',' dict_pair )* '}'
			{
			char_literal105=(Token)match(input,43,FOLLOW_43_in_dict836);  
			stream_43.add(char_literal105);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:12: ( dict_pair )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==ANONVAR||(LA26_0 >= ID && LA26_0 <= KEYWORD)||LA26_0==MUTID||(LA26_0 >= STRING && LA26_0 <= TYPEID)||LA26_0==25) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:13: dict_pair
					{
					pushFollow(FOLLOW_dict_pair_in_dict839);
					dict_pair106=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair106.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:25: ( ',' dict_pair )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==27) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:26: ',' dict_pair
					{
					char_literal107=(Token)match(input,27,FOLLOW_27_in_dict844);  
					stream_27.add(char_literal107);

					pushFollow(FOLLOW_dict_pair_in_dict846);
					dict_pair108=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair108.getTree());
					}
					break;

				default :
					break loop27;
				}
			}

			char_literal109=(Token)match(input,44,FOLLOW_44_in_dict850);  
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

			root_0 = (SneakersAST)adaptor.nil();
			// 127:46: -> ^( DICT ( dict_pair )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:49: ^( DICT ( dict_pair )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(DICT, "DICT"), root_1);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:56: ( dict_pair )*
				while ( stream_dict_pair.hasNext() ) {
					adaptor.addChild(root_1, stream_dict_pair.nextTree());
				}
				stream_dict_pair.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dict"


	public static class contained_block_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "contained_block"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:130:1: contained_block : '[' block ']' -> block ;
	public final SneakersParser.contained_block_return contained_block() throws RecognitionException {
		SneakersParser.contained_block_return retval = new SneakersParser.contained_block_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal110=null;
		Token char_literal112=null;
		ParserRuleReturnScope block111 =null;

		SneakersAST char_literal110_tree=null;
		SneakersAST char_literal112_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:2: ( '[' block ']' -> block )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:4: '[' block ']'
			{
			char_literal110=(Token)match(input,36,FOLLOW_36_in_contained_block872);  
			stream_36.add(char_literal110);

			pushFollow(FOLLOW_block_in_contained_block874);
			block111=block();
			state._fsp--;

			stream_block.add(block111.getTree());
			char_literal112=(Token)match(input,37,FOLLOW_37_in_contained_block876);  
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

			root_0 = (SneakersAST)adaptor.nil();
			// 131:18: -> block
			{
				adaptor.addChild(root_0, stream_block.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "contained_block"


	public static class array_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "array"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:1: array : '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) ;
	public final SneakersParser.array_return array() throws RecognitionException {
		SneakersParser.array_return retval = new SneakersParser.array_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal113=null;
		Token char_literal115=null;
		Token char_literal117=null;
		ParserRuleReturnScope expr114 =null;
		ParserRuleReturnScope expr116 =null;

		SneakersAST char_literal113_tree=null;
		SneakersAST char_literal115_tree=null;
		SneakersAST char_literal117_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:7: ( '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:9: '[' ( expr )? ( ',' expr )* ']'
			{
			char_literal113=(Token)match(input,36,FOLLOW_36_in_array890);  
			stream_36.add(char_literal113);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:13: ( expr )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==ANONVAR||(LA28_0 >= ID && LA28_0 <= KEYWORD)||LA28_0==MUTID||(LA28_0 >= STRING && LA28_0 <= TYPEID)||(LA28_0 >= 24 && LA28_0 <= 25)||(LA28_0 >= 35 && LA28_0 <= 36)||LA28_0==43) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:13: expr
					{
					pushFollow(FOLLOW_expr_in_array892);
					expr114=expr();
					state._fsp--;

					stream_expr.add(expr114.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:19: ( ',' expr )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==27) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:20: ',' expr
					{
					char_literal115=(Token)match(input,27,FOLLOW_27_in_array896);  
					stream_27.add(char_literal115);

					pushFollow(FOLLOW_expr_in_array898);
					expr116=expr();
					state._fsp--;

					stream_expr.add(expr116.getTree());
					}
					break;

				default :
					break loop29;
				}
			}

			char_literal117=(Token)match(input,37,FOLLOW_37_in_array902);  
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

			root_0 = (SneakersAST)adaptor.nil();
			// 134:35: -> ^( ARRAY ( expr )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:38: ^( ARRAY ( expr )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(ARRAY, "ARRAY"), root_1);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:46: ( expr )*
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_expr.nextTree());
				}
				stream_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array"


	public static class any_id_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "any_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:153:1: any_id : ( ID | TYPEID | MUTID );
	public final SneakersParser.any_id_return any_id() throws RecognitionException {
		SneakersParser.any_id_return retval = new SneakersParser.any_id_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token set118=null;

		SneakersAST set118_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:154:2: ( ID | TYPEID | MUTID )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:
			{
			root_0 = (SneakersAST)adaptor.nil();


			set118=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==MUTID||input.LA(1)==TYPEID ) {
				input.consume();
				adaptor.addChild(root_0, (SneakersAST)adaptor.create(set118));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (SneakersAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (SneakersAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
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
			return "40:1: returnstat : ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) );";
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
			return "50:1: assignment : ( any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );";
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
			return "84:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );";
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
			return "111:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );";
		}
	}

	public static final BitSet FOLLOW_block_in_prog99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_block111 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_block113 = new BitSet(new long[]{0x0000070080422002L});
	public static final BitSet FOLLOW_assignment_in_stat132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_stat142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutcall_in_stat147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_stat152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_returnstat163 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_fncall_in_returnstat165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_returnstat178 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_returnstat180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_ifstat198 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_ifstat202 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat206 = new BitSet(new long[]{0x000000C000000002L});
	public static final BitSet FOLLOW_39_in_ifstat212 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_ifstat216 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat220 = new BitSet(new long[]{0x000000C000000002L});
	public static final BitSet FOLLOW_38_in_ifstat228 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment270 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_assignment272 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_assignment274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment289 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_assignment291 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_fncall_in_assignment293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_defable314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_defable319 = new BitSet(new long[]{0x0000070080422000L});
	public static final BitSet FOLLOW_stat_in_defable321 = new BitSet(new long[]{0x0000070080422002L});
	public static final BitSet FOLLOW_KEYWORD_in_defdecl332 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_defdecl334 = new BitSet(new long[]{0x0000000001400000L});
	public static final BitSet FOLLOW_defable_in_defdecl336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANONVAR_in_nested_id349 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_nested_id352 = new BitSet(new long[]{0x0000000000422000L});
	public static final BitSet FOLLOW_any_id_in_nested_id354 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_any_id_in_nested_id368 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_nested_id371 = new BitSet(new long[]{0x0000000000422000L});
	public static final BitSet FOLLOW_any_id_in_nested_id373 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_nested_id_in_fncall390 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_param_in_fncall392 = new BitSet(new long[]{0x000008180B62E022L});
	public static final BitSet FOLLOW_27_in_fncall395 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_param_in_fncall398 = new BitSet(new long[]{0x000008180B62E022L});
	public static final BitSet FOLLOW_ID_in_param421 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_param423 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_param425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_param440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_paramtype464 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype466 = new BitSet(new long[]{0x000000000C000000L});
	public static final BitSet FOLLOW_27_in_paramtype469 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype471 = new BitSet(new long[]{0x000000000C000000L});
	public static final BitSet FOLLOW_26_in_paramtype475 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_paramtype477 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_paramtype493 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_paramtype495 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_paramtype497 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fnparam518 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_fnparam520 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_paramtype_in_fnparam522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_anonfn542 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_anonfn544 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_fncall_in_anonfn546 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_anonfn548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_anonfn561 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_anonfn563 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_nested_id_in_anonfn565 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_anonfn567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_blockdecl586 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_blockdecl588 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_29_in_blockdecl591 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl593 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_blockdecl613 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl615 = new BitSet(new long[]{0x000000000C002000L});
	public static final BitSet FOLLOW_27_in_blockdecl618 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl621 = new BitSet(new long[]{0x000000000C002000L});
	public static final BitSet FOLLOW_26_in_blockdecl625 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_29_in_blockdecl628 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl630 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_fndecl658 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_blockdecl_in_fndecl660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_mutdecl678 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_blockdecl_in_mutdecl680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_expr698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_expr708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutdecl_in_expr713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anonfn_in_expr718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_expr723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_standalone_fncall734 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_fncall_in_standalone_fncall736 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_standalone_fncall738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_mutcall752 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_nested_id_in_mutcall754 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_mutcall756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_mutcall765 = new BitSet(new long[]{0x0000000000422020L});
	public static final BitSet FOLLOW_fncall_in_mutcall767 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_mutcall769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_index_expr784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_index_expr789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_index_expr794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_index_expr799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standalone_fncall_in_index_expr804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_dict_pair816 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_dict_pair818 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_dict_pair820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_dict836 = new BitSet(new long[]{0x000010000A62E020L});
	public static final BitSet FOLLOW_dict_pair_in_dict839 = new BitSet(new long[]{0x0000100008000000L});
	public static final BitSet FOLLOW_27_in_dict844 = new BitSet(new long[]{0x000000000262E020L});
	public static final BitSet FOLLOW_dict_pair_in_dict846 = new BitSet(new long[]{0x0000100008000000L});
	public static final BitSet FOLLOW_44_in_dict850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_contained_block872 = new BitSet(new long[]{0x0000070080422000L});
	public static final BitSet FOLLOW_block_in_contained_block874 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_contained_block876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_array890 = new BitSet(new long[]{0x000008380B62E020L});
	public static final BitSet FOLLOW_expr_in_array892 = new BitSet(new long[]{0x0000002008000000L});
	public static final BitSet FOLLOW_27_in_array896 = new BitSet(new long[]{0x000008180362E020L});
	public static final BitSet FOLLOW_expr_in_array898 = new BitSet(new long[]{0x0000002008000000L});
	public static final BitSet FOLLOW_37_in_array902 = new BitSet(new long[]{0x0000000000000002L});
}
