// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-21 22:49:27
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
		"KEYWORD", "MUTDECL", "MUTID", "PARAM", "PARAMTYPEFN", "PARAMTYPEMUT", 
		"RET", "STRING", "TYPEID", "WS", "'#'", "'('", "')'", "','", "'.'", "':'", 
		"';'", "'<'", "'='", "'=>'", "'>'", "'@'", "'['", "']'", "'else'", "'elseif'", 
		"'if'", "'pass'", "'return'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__45=45;
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
	public static final int PARAMTYPEMUT=20;
	public static final int RET=21;
	public static final int STRING=22;
	public static final int TYPEID=23;
	public static final int WS=24;

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


	  @Override
	  public void reportError(RecognitionException e) {
	    throw new ParseException(e); 
	  }


	public static class prog_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:1: prog : block ;
	public final SneakersParser.prog_return prog() throws RecognitionException {
		SneakersParser.prog_return retval = new SneakersParser.prog_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		ParserRuleReturnScope block1 =null;


		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:6: ( block )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:43:8: block
			{
			root_0 = (SneakersAST)adaptor.nil();


			pushFollow(FOLLOW_block_in_prog121);
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:1: block : ( stat ';' )+ -> ^( BLOCK ( stat )+ ) ;
	public final SneakersParser.block_return block() throws RecognitionException {
		SneakersParser.block_return retval = new SneakersParser.block_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal3=null;
		ParserRuleReturnScope stat2 =null;

		SneakersAST char_literal3_tree=null;
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:8: ( ( stat ';' )+ -> ^( BLOCK ( stat )+ ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:10: ( stat ';' )+
			{
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:10: ( stat ';' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==MUTID||LA1_0==TYPEID||LA1_0==32||(LA1_0 >= 41 && LA1_0 <= 43)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:11: stat ';'
					{
					pushFollow(FOLLOW_stat_in_block133);
					stat2=stat();
					state._fsp--;

					stream_stat.add(stat2.getTree());
					char_literal3=(Token)match(input,31,FOLLOW_31_in_block135);  
					stream_31.add(char_literal3);

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
			// 46:22: -> ^( BLOCK ( stat )+ )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:46:25: ^( BLOCK ( stat )+ )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:1: stat : ( assignment | ifstat | returnstat | mutcall | 'pass' );
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:6: ( assignment | ifstat | returnstat | mutcall | 'pass' )
			int alt2=5;
			switch ( input.LA(1) ) {
			case ID:
			case MUTID:
			case TYPEID:
				{
				alt2=1;
				}
				break;
			case 41:
				{
				alt2=2;
				}
				break;
			case 43:
				{
				alt2=3;
				}
				break;
			case 32:
				{
				alt2=4;
				}
				break;
			case 42:
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:8: assignment
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_stat154);
					assignment4=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment4.getTree());

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:4: ifstat
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_ifstat_in_stat159);
					ifstat5=ifstat();
					state._fsp--;

					adaptor.addChild(root_0, ifstat5.getTree());

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:50:4: returnstat
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_returnstat_in_stat164);
					returnstat6=returnstat();
					state._fsp--;

					adaptor.addChild(root_0, returnstat6.getTree());

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:4: mutcall
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_mutcall_in_stat169);
					mutcall7=mutcall();
					state._fsp--;

					adaptor.addChild(root_0, mutcall7.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:52:4: 'pass'
					{
					root_0 = (SneakersAST)adaptor.nil();


					string_literal8=(Token)match(input,42,FOLLOW_42_in_stat174); 
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:55:1: returnstat : ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) );
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
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:56:2: ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) )
			int alt3=2;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:56:4: 'return' fncall
					{
					string_literal9=(Token)match(input,43,FOLLOW_43_in_returnstat185);  
					stream_43.add(string_literal9);

					pushFollow(FOLLOW_fncall_in_returnstat187);
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
					// 56:20: -> ^( RET fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:56:23: ^( RET fncall )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:4: 'return' expr
					{
					string_literal11=(Token)match(input,43,FOLLOW_43_in_returnstat200);  
					stream_43.add(string_literal11);

					pushFollow(FOLLOW_expr_in_returnstat202);
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
					// 57:18: -> ^( RET expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:21: ^( RET expr )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:60:1: ifstat : 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) ;
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
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:60:8: ( 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:60:10: 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )?
			{
			string_literal13=(Token)match(input,41,FOLLOW_41_in_ifstat220);  
			stream_41.add(string_literal13);

			pushFollow(FOLLOW_expr_in_ifstat224);
			ifexpr=expr();
			state._fsp--;

			stream_expr.add(ifexpr.getTree());
			pushFollow(FOLLOW_contained_block_in_ifstat228);
			ifblock=contained_block();
			state._fsp--;

			stream_contained_block.add(ifblock.getTree());
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:3: ( 'elseif' elifexpr+= expr elifblock+= contained_block )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==40) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:4: 'elseif' elifexpr+= expr elifblock+= contained_block
					{
					string_literal14=(Token)match(input,40,FOLLOW_40_in_ifstat234);  
					stream_40.add(string_literal14);

					pushFollow(FOLLOW_expr_in_ifstat238);
					elifexpr=expr();
					state._fsp--;

					stream_expr.add(elifexpr.getTree());
					if (list_elifexpr==null) list_elifexpr=new ArrayList<Object>();
					list_elifexpr.add(elifexpr.getTree());
					pushFollow(FOLLOW_contained_block_in_ifstat242);
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

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:3: ( 'else' elseblock= contained_block )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==39) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:4: 'else' elseblock= contained_block
					{
					string_literal15=(Token)match(input,39,FOLLOW_39_in_ifstat250);  
					stream_39.add(string_literal15);

					pushFollow(FOLLOW_contained_block_in_ifstat254);
					elseblock=contained_block();
					state._fsp--;

					stream_contained_block.add(elseblock.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: ifblock, elseblock, ifexpr, elifblock, elifexpr, 41
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
			// 63:3: -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:6: ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot(stream_41.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ifexpr.nextTree());
				adaptor.addChild(root_1, stream_ifblock.nextTree());
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:30: ( $elifexpr $elifblock)*
				while ( stream_elifblock.hasNext()||stream_elifexpr.hasNext() ) {
					adaptor.addChild(root_1, stream_elifexpr.nextTree());
					adaptor.addChild(root_1, stream_elifblock.nextTree());
				}
				stream_elifblock.reset();
				stream_elifexpr.reset();

				// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:55: ( $elseblock)?
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:1: assignment : ( any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );
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
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:2: ( any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) )
			int alt6=2;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:4: any_id '=' expr
					{
					pushFollow(FOLLOW_any_id_in_assignment292);
					any_id16=any_id();
					state._fsp--;

					stream_any_id.add(any_id16.getTree());
					char_literal17=(Token)match(input,33,FOLLOW_33_in_assignment294);  
					stream_33.add(char_literal17);

					pushFollow(FOLLOW_expr_in_assignment296);
					expr18=expr();
					state._fsp--;

					stream_expr.add(expr18.getTree());
					// AST REWRITE
					// elements: expr, any_id, 33
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 66:20: -> ^( '=' any_id expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:23: ^( '=' any_id expr )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_33.nextNode(), root_1);
						adaptor.addChild(root_1, stream_any_id.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:4: any_id '=' fncall
					{
					pushFollow(FOLLOW_any_id_in_assignment311);
					any_id19=any_id();
					state._fsp--;

					stream_any_id.add(any_id19.getTree());
					char_literal20=(Token)match(input,33,FOLLOW_33_in_assignment313);  
					stream_33.add(char_literal20);

					pushFollow(FOLLOW_fncall_in_assignment315);
					fncall21=fncall();
					state._fsp--;

					stream_fncall.add(fncall21.getTree());
					// AST REWRITE
					// elements: any_id, 33, fncall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 67:22: -> ^( '=' any_id fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:25: ^( '=' any_id fncall )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_33.nextNode(), root_1);
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:71:1: defable : ( TYPEID | fndecl ( stat )+ );
	public final SneakersParser.defable_return defable() throws RecognitionException {
		SneakersParser.defable_return retval = new SneakersParser.defable_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token TYPEID22=null;
		ParserRuleReturnScope fndecl23 =null;
		ParserRuleReturnScope stat24 =null;

		SneakersAST TYPEID22_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:71:9: ( TYPEID | fndecl ( stat )+ )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==TYPEID) ) {
				alt8=1;
			}
			else if ( (LA8_0==25) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:71:11: TYPEID
					{
					root_0 = (SneakersAST)adaptor.nil();


					TYPEID22=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_defable336); 
					TYPEID22_tree = (SneakersAST)adaptor.create(TYPEID22);
					adaptor.addChild(root_0, TYPEID22_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:4: fndecl ( stat )+
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_fndecl_in_defable341);
					fndecl23=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl23.getTree());

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:11: ( stat )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==ID||LA7_0==MUTID||LA7_0==TYPEID||LA7_0==32||(LA7_0 >= 41 && LA7_0 <= 43)) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:11: stat
							{
							pushFollow(FOLLOW_stat_in_defable343);
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:1: defdecl : KEYWORD '=>' defable ;
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:9: ( KEYWORD '=>' defable )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:11: KEYWORD '=>' defable
			{
			root_0 = (SneakersAST)adaptor.nil();


			KEYWORD25=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_defdecl354); 
			KEYWORD25_tree = (SneakersAST)adaptor.create(KEYWORD25);
			adaptor.addChild(root_0, KEYWORD25_tree);

			string_literal26=(Token)match(input,34,FOLLOW_34_in_defdecl356); 
			string_literal26_tree = (SneakersAST)adaptor.create(string_literal26);
			adaptor.addChild(root_0, string_literal26_tree);

			pushFollow(FOLLOW_defable_in_defdecl358);
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:79:1: nested_id : ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* );
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
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:80:2: ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:80:4: ANONVAR ( '.' any_id )*
					{
					ANONVAR28=(Token)match(input,ANONVAR,FOLLOW_ANONVAR_in_nested_id371);  
					stream_ANONVAR.add(ANONVAR28);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:80:12: ( '.' any_id )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==29) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:80:13: '.' any_id
							{
							char_literal29=(Token)match(input,29,FOLLOW_29_in_nested_id374);  
							stream_29.add(char_literal29);

							pushFollow(FOLLOW_any_id_in_nested_id376);
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
					// 80:26: -> ANONVAR ( any_id )*
					{
						adaptor.addChild(root_0, stream_ANONVAR.nextNode());
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:80:37: ( any_id )*
						while ( stream_any_id.hasNext() ) {
							adaptor.addChild(root_0, stream_any_id.nextTree());
						}
						stream_any_id.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:4: any_id ( '.' any_id )*
					{
					pushFollow(FOLLOW_any_id_in_nested_id390);
					any_id31=any_id();
					state._fsp--;

					stream_any_id.add(any_id31.getTree());
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:11: ( '.' any_id )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==29) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:12: '.' any_id
							{
							char_literal32=(Token)match(input,29,FOLLOW_29_in_nested_id393);  
							stream_29.add(char_literal32);

							pushFollow(FOLLOW_any_id_in_nested_id395);
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
					// 81:25: -> ( any_id )*
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:28: ( any_id )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:1: fncall : nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) ;
	public final SneakersParser.fncall_return fncall() throws RecognitionException {
		SneakersParser.fncall_return retval = new SneakersParser.fncall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal36=null;
		ParserRuleReturnScope nested_id34 =null;
		ParserRuleReturnScope param35 =null;
		ParserRuleReturnScope param37 =null;

		SneakersAST char_literal36_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:8: ( nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:10: nested_id param ( ( ',' )? param )*
			{
			pushFollow(FOLLOW_nested_id_in_fncall412);
			nested_id34=nested_id();
			state._fsp--;

			stream_nested_id.add(nested_id34.getTree());
			pushFollow(FOLLOW_param_in_fncall414);
			param35=param();
			state._fsp--;

			stream_param.add(param35.getTree());
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:26: ( ( ',' )? param )*
			loop13:
			while (true) {
				int alt13=2;
				switch ( input.LA(1) ) {
				case ID:
					{
					int LA13_2 = input.LA(2);
					if ( (LA13_2==EOF||LA13_2==ANONVAR||(LA13_2 >= ID && LA13_2 <= KEYWORD)||LA13_2==MUTID||(LA13_2 >= STRING && LA13_2 <= TYPEID)||(LA13_2 >= 25 && LA13_2 <= 32)||(LA13_2 >= 35 && LA13_2 <= 38)||(LA13_2 >= 41 && LA13_2 <= 44)) ) {
						alt13=1;
					}

					}
					break;
				case ANONVAR:
				case INT:
				case KEYWORD:
				case STRING:
				case 25:
				case 26:
				case 28:
				case 36:
				case 37:
				case 44:
					{
					alt13=1;
					}
					break;
				case MUTID:
				case TYPEID:
					{
					int LA13_4 = input.LA(2);
					if ( (LA13_4==EOF||LA13_4==ANONVAR||(LA13_4 >= ID && LA13_4 <= KEYWORD)||LA13_4==MUTID||(LA13_4 >= STRING && LA13_4 <= TYPEID)||(LA13_4 >= 25 && LA13_4 <= 29)||(LA13_4 >= 31 && LA13_4 <= 32)||(LA13_4 >= 35 && LA13_4 <= 38)||(LA13_4 >= 41 && LA13_4 <= 44)) ) {
						alt13=1;
					}

					}
					break;
				}
				switch (alt13) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:27: ( ',' )? param
					{
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:27: ( ',' )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==28) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:27: ','
							{
							char_literal36=(Token)match(input,28,FOLLOW_28_in_fncall417);  
							stream_28.add(char_literal36);

							}
							break;

					}

					pushFollow(FOLLOW_param_in_fncall420);
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
			// 84:40: -> ^( FNCALL nested_id ( param )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:43: ^( FNCALL nested_id ( param )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(FNCALL, "FNCALL"), root_1);
				adaptor.addChild(root_1, stream_nested_id.nextTree());
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:62: ( param )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:1: param : ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) );
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
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:7: ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ID) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==30) ) {
					alt14=1;
				}
				else if ( (LA14_1==EOF||LA14_1==ANONVAR||(LA14_1 >= ID && LA14_1 <= KEYWORD)||LA14_1==MUTID||(LA14_1 >= STRING && LA14_1 <= TYPEID)||(LA14_1 >= 25 && LA14_1 <= 29)||(LA14_1 >= 31 && LA14_1 <= 32)||(LA14_1 >= 35 && LA14_1 <= 38)||(LA14_1 >= 41 && LA14_1 <= 44)) ) {
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
			else if ( (LA14_0==ANONVAR||(LA14_0 >= INT && LA14_0 <= KEYWORD)||LA14_0==MUTID||(LA14_0 >= STRING && LA14_0 <= TYPEID)||(LA14_0 >= 25 && LA14_0 <= 26)||(LA14_0 >= 36 && LA14_0 <= 37)||LA14_0==44) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:9: ID ':' expr
					{
					ID38=(Token)match(input,ID,FOLLOW_ID_in_param443);  
					stream_ID.add(ID38);

					char_literal39=(Token)match(input,30,FOLLOW_30_in_param445);  
					stream_30.add(char_literal39);

					pushFollow(FOLLOW_expr_in_param447);
					expr40=expr();
					state._fsp--;

					stream_expr.add(expr40.getTree());
					// AST REWRITE
					// elements: expr, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 87:21: -> ^( PARAM ID expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:24: ^( PARAM ID expr )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:4: expr
					{
					pushFollow(FOLLOW_expr_in_param462);
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
					// 88:9: -> ^( PARAM expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:12: ^( PARAM expr )
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


	public static class blockparamtype_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "blockparamtype"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:1: blockparamtype : ( '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ( TYPEID )+ | '(' ')' ':' TYPEID -> TYPEID );
	public final SneakersParser.blockparamtype_return blockparamtype() throws RecognitionException {
		SneakersParser.blockparamtype_return retval = new SneakersParser.blockparamtype_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal42=null;
		Token TYPEID43=null;
		Token char_literal44=null;
		Token TYPEID45=null;
		Token char_literal46=null;
		Token char_literal47=null;
		Token TYPEID48=null;
		Token char_literal49=null;
		Token char_literal50=null;
		Token char_literal51=null;
		Token TYPEID52=null;

		SneakersAST char_literal42_tree=null;
		SneakersAST TYPEID43_tree=null;
		SneakersAST char_literal44_tree=null;
		SneakersAST TYPEID45_tree=null;
		SneakersAST char_literal46_tree=null;
		SneakersAST char_literal47_tree=null;
		SneakersAST TYPEID48_tree=null;
		SneakersAST char_literal49_tree=null;
		SneakersAST char_literal50_tree=null;
		SneakersAST char_literal51_tree=null;
		SneakersAST TYPEID52_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:2: ( '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ( TYPEID )+ | '(' ')' ':' TYPEID -> TYPEID )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==26) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==TYPEID) ) {
					alt16=1;
				}
				else if ( (LA16_1==27) ) {
					alt16=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:4: '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID
					{
					char_literal42=(Token)match(input,26,FOLLOW_26_in_blockparamtype482);  
					stream_26.add(char_literal42);

					TYPEID43=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype484);  
					stream_TYPEID.add(TYPEID43);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:15: ( ',' TYPEID )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==28) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:16: ',' TYPEID
							{
							char_literal44=(Token)match(input,28,FOLLOW_28_in_blockparamtype487);  
							stream_28.add(char_literal44);

							TYPEID45=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype489);  
							stream_TYPEID.add(TYPEID45);

							}
							break;

						default :
							break loop15;
						}
					}

					char_literal46=(Token)match(input,27,FOLLOW_27_in_blockparamtype493);  
					stream_27.add(char_literal46);

					char_literal47=(Token)match(input,30,FOLLOW_30_in_blockparamtype495);  
					stream_30.add(char_literal47);

					TYPEID48=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype497);  
					stream_TYPEID.add(TYPEID48);

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
					// 92:44: -> ( TYPEID )+
					{
						if ( !(stream_TYPEID.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_TYPEID.hasNext() ) {
							adaptor.addChild(root_0, stream_TYPEID.nextNode());
						}
						stream_TYPEID.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:4: '(' ')' ':' TYPEID
					{
					char_literal49=(Token)match(input,26,FOLLOW_26_in_blockparamtype507);  
					stream_26.add(char_literal49);

					char_literal50=(Token)match(input,27,FOLLOW_27_in_blockparamtype509);  
					stream_27.add(char_literal50);

					char_literal51=(Token)match(input,30,FOLLOW_30_in_blockparamtype511);  
					stream_30.add(char_literal51);

					TYPEID52=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype513);  
					stream_TYPEID.add(TYPEID52);

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
					// 93:23: -> TYPEID
					{
						adaptor.addChild(root_0, stream_TYPEID.nextNode());
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
	// $ANTLR end "blockparamtype"


	public static class paramtype_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "paramtype"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:1: paramtype : ( TYPEID | '#' blockparamtype -> ^( PARAMTYPEFN blockparamtype ) | '@' blockparamtype -> ^( PARAMTYPEMUT blockparamtype ) );
	public final SneakersParser.paramtype_return paramtype() throws RecognitionException {
		SneakersParser.paramtype_return retval = new SneakersParser.paramtype_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token TYPEID53=null;
		Token char_literal54=null;
		Token char_literal56=null;
		ParserRuleReturnScope blockparamtype55 =null;
		ParserRuleReturnScope blockparamtype57 =null;

		SneakersAST TYPEID53_tree=null;
		SneakersAST char_literal54_tree=null;
		SneakersAST char_literal56_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleSubtreeStream stream_blockparamtype=new RewriteRuleSubtreeStream(adaptor,"rule blockparamtype");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:11: ( TYPEID | '#' blockparamtype -> ^( PARAMTYPEFN blockparamtype ) | '@' blockparamtype -> ^( PARAMTYPEMUT blockparamtype ) )
			int alt17=3;
			switch ( input.LA(1) ) {
			case TYPEID:
				{
				alt17=1;
				}
				break;
			case 25:
				{
				alt17=2;
				}
				break;
			case 36:
				{
				alt17=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:14: TYPEID
					{
					root_0 = (SneakersAST)adaptor.nil();


					TYPEID53=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype528); 
					TYPEID53_tree = (SneakersAST)adaptor.create(TYPEID53);
					adaptor.addChild(root_0, TYPEID53_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:97:4: '#' blockparamtype
					{
					char_literal54=(Token)match(input,25,FOLLOW_25_in_paramtype533);  
					stream_25.add(char_literal54);

					pushFollow(FOLLOW_blockparamtype_in_paramtype535);
					blockparamtype55=blockparamtype();
					state._fsp--;

					stream_blockparamtype.add(blockparamtype55.getTree());
					// AST REWRITE
					// elements: blockparamtype
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 97:23: -> ^( PARAMTYPEFN blockparamtype )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:97:26: ^( PARAMTYPEFN blockparamtype )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(PARAMTYPEFN, "PARAMTYPEFN"), root_1);
						adaptor.addChild(root_1, stream_blockparamtype.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:98:4: '@' blockparamtype
					{
					char_literal56=(Token)match(input,36,FOLLOW_36_in_paramtype548);  
					stream_36.add(char_literal56);

					pushFollow(FOLLOW_blockparamtype_in_paramtype550);
					blockparamtype57=blockparamtype();
					state._fsp--;

					stream_blockparamtype.add(blockparamtype57.getTree());
					// AST REWRITE
					// elements: blockparamtype
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 98:23: -> ^( PARAMTYPEMUT blockparamtype )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:98:26: ^( PARAMTYPEMUT blockparamtype )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(PARAMTYPEMUT, "PARAMTYPEMUT"), root_1);
						adaptor.addChild(root_1, stream_blockparamtype.nextTree());
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:101:1: fnparam : ID ':' paramtype -> ^( FNPARAM ID paramtype ) ;
	public final SneakersParser.fnparam_return fnparam() throws RecognitionException {
		SneakersParser.fnparam_return retval = new SneakersParser.fnparam_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ID58=null;
		Token char_literal59=null;
		ParserRuleReturnScope paramtype60 =null;

		SneakersAST ID58_tree=null;
		SneakersAST char_literal59_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_paramtype=new RewriteRuleSubtreeStream(adaptor,"rule paramtype");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:101:9: ( ID ':' paramtype -> ^( FNPARAM ID paramtype ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:101:11: ID ':' paramtype
			{
			ID58=(Token)match(input,ID,FOLLOW_ID_in_fnparam569);  
			stream_ID.add(ID58);

			char_literal59=(Token)match(input,30,FOLLOW_30_in_fnparam571);  
			stream_30.add(char_literal59);

			pushFollow(FOLLOW_paramtype_in_fnparam573);
			paramtype60=paramtype();
			state._fsp--;

			stream_paramtype.add(paramtype60.getTree());
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
			// 101:28: -> ^( FNPARAM ID paramtype )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:101:31: ^( FNPARAM ID paramtype )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );
	public final SneakersParser.anonfn_return anonfn() throws RecognitionException {
		SneakersParser.anonfn_return retval = new SneakersParser.anonfn_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal61=null;
		Token char_literal62=null;
		Token char_literal64=null;
		Token char_literal65=null;
		Token char_literal66=null;
		Token char_literal68=null;
		ParserRuleReturnScope fncall63 =null;
		ParserRuleReturnScope nested_id67 =null;

		SneakersAST char_literal61_tree=null;
		SneakersAST char_literal62_tree=null;
		SneakersAST char_literal64_tree=null;
		SneakersAST char_literal65_tree=null;
		SneakersAST char_literal66_tree=null;
		SneakersAST char_literal68_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:8: ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) )
			int alt18=2;
			alt18 = dfa18.predict(input);
			switch (alt18) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:10: '#' '[' fncall ']'
					{
					char_literal61=(Token)match(input,25,FOLLOW_25_in_anonfn593);  
					stream_25.add(char_literal61);

					char_literal62=(Token)match(input,37,FOLLOW_37_in_anonfn595);  
					stream_37.add(char_literal62);

					pushFollow(FOLLOW_fncall_in_anonfn597);
					fncall63=fncall();
					state._fsp--;

					stream_fncall.add(fncall63.getTree());
					char_literal64=(Token)match(input,38,FOLLOW_38_in_anonfn599);  
					stream_38.add(char_literal64);

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
					// 104:29: -> ^( ANONFN fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:32: ^( ANONFN fncall )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:105:4: '#' '[' nested_id ']'
					{
					char_literal65=(Token)match(input,25,FOLLOW_25_in_anonfn612);  
					stream_25.add(char_literal65);

					char_literal66=(Token)match(input,37,FOLLOW_37_in_anonfn614);  
					stream_37.add(char_literal66);

					pushFollow(FOLLOW_nested_id_in_anonfn616);
					nested_id67=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id67.getTree());
					char_literal68=(Token)match(input,38,FOLLOW_38_in_anonfn618);  
					stream_38.add(char_literal68);

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
					// 105:26: -> ^( ANONFN nested_id )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:105:29: ^( ANONFN nested_id )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:108:1: blockdecl : ( '(' ')' ( ':' TYPEID )? contained_block -> ( TYPEID )? contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block -> ( fnparam )* ( TYPEID )? contained_block );
	public final SneakersParser.blockdecl_return blockdecl() throws RecognitionException {
		SneakersParser.blockdecl_return retval = new SneakersParser.blockdecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal69=null;
		Token char_literal70=null;
		Token char_literal71=null;
		Token TYPEID72=null;
		Token char_literal74=null;
		Token char_literal76=null;
		Token char_literal78=null;
		Token char_literal79=null;
		Token TYPEID80=null;
		ParserRuleReturnScope contained_block73 =null;
		ParserRuleReturnScope fnparam75 =null;
		ParserRuleReturnScope fnparam77 =null;
		ParserRuleReturnScope contained_block81 =null;

		SneakersAST char_literal69_tree=null;
		SneakersAST char_literal70_tree=null;
		SneakersAST char_literal71_tree=null;
		SneakersAST TYPEID72_tree=null;
		SneakersAST char_literal74_tree=null;
		SneakersAST char_literal76_tree=null;
		SneakersAST char_literal78_tree=null;
		SneakersAST char_literal79_tree=null;
		SneakersAST TYPEID80_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_fnparam=new RewriteRuleSubtreeStream(adaptor,"rule fnparam");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:2: ( '(' ')' ( ':' TYPEID )? contained_block -> ( TYPEID )? contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block -> ( fnparam )* ( TYPEID )? contained_block )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==26) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==27) ) {
					alt23=1;
				}
				else if ( (LA23_1==ID) ) {
					alt23=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:4: '(' ')' ( ':' TYPEID )? contained_block
					{
					char_literal69=(Token)match(input,26,FOLLOW_26_in_blockdecl637);  
					stream_26.add(char_literal69);

					char_literal70=(Token)match(input,27,FOLLOW_27_in_blockdecl639);  
					stream_27.add(char_literal70);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:12: ( ':' TYPEID )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==30) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:13: ':' TYPEID
							{
							char_literal71=(Token)match(input,30,FOLLOW_30_in_blockdecl642);  
							stream_30.add(char_literal71);

							TYPEID72=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl644);  
							stream_TYPEID.add(TYPEID72);

							}
							break;

					}

					pushFollow(FOLLOW_contained_block_in_blockdecl648);
					contained_block73=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block73.getTree());
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
					// 109:42: -> ( TYPEID )? contained_block
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:45: ( TYPEID )?
						if ( stream_TYPEID.hasNext() ) {
							adaptor.addChild(root_0, stream_TYPEID.nextNode());
						}
						stream_TYPEID.reset();

						adaptor.addChild(root_0, stream_contained_block.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:4: '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block
					{
					char_literal74=(Token)match(input,26,FOLLOW_26_in_blockdecl660);  
					stream_26.add(char_literal74);

					pushFollow(FOLLOW_fnparam_in_blockdecl662);
					fnparam75=fnparam();
					state._fsp--;

					stream_fnparam.add(fnparam75.getTree());
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:16: ( ( ',' )? fnparam )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==ID||LA21_0==28) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:17: ( ',' )? fnparam
							{
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:17: ( ',' )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==28) ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:17: ','
									{
									char_literal76=(Token)match(input,28,FOLLOW_28_in_blockdecl665);  
									stream_28.add(char_literal76);

									}
									break;

							}

							pushFollow(FOLLOW_fnparam_in_blockdecl668);
							fnparam77=fnparam();
							state._fsp--;

							stream_fnparam.add(fnparam77.getTree());
							}
							break;

						default :
							break loop21;
						}
					}

					char_literal78=(Token)match(input,27,FOLLOW_27_in_blockdecl672);  
					stream_27.add(char_literal78);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:36: ( ':' TYPEID )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==30) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:37: ':' TYPEID
							{
							char_literal79=(Token)match(input,30,FOLLOW_30_in_blockdecl675);  
							stream_30.add(char_literal79);

							TYPEID80=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl677);  
							stream_TYPEID.add(TYPEID80);

							}
							break;

					}

					pushFollow(FOLLOW_contained_block_in_blockdecl681);
					contained_block81=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block81.getTree());
					// AST REWRITE
					// elements: fnparam, TYPEID, contained_block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 110:66: -> ( fnparam )* ( TYPEID )? contained_block
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:69: ( fnparam )*
						while ( stream_fnparam.hasNext() ) {
							adaptor.addChild(root_0, stream_fnparam.nextTree());
						}
						stream_fnparam.reset();

						// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:78: ( TYPEID )?
						if ( stream_TYPEID.hasNext() ) {
							adaptor.addChild(root_0, stream_TYPEID.nextNode());
						}
						stream_TYPEID.reset();

						adaptor.addChild(root_0, stream_contained_block.nextTree());
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:1: fndecl : '#' blockdecl -> ^( FNDECL blockdecl ) ;
	public final SneakersParser.fndecl_return fndecl() throws RecognitionException {
		SneakersParser.fndecl_return retval = new SneakersParser.fndecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal82=null;
		ParserRuleReturnScope blockdecl83 =null;

		SneakersAST char_literal82_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:8: ( '#' blockdecl -> ^( FNDECL blockdecl ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:10: '#' blockdecl
			{
			char_literal82=(Token)match(input,25,FOLLOW_25_in_fndecl701);  
			stream_25.add(char_literal82);

			pushFollow(FOLLOW_blockdecl_in_fndecl703);
			blockdecl83=blockdecl();
			state._fsp--;

			stream_blockdecl.add(blockdecl83.getTree());
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
			// 113:24: -> ^( FNDECL blockdecl )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:27: ^( FNDECL blockdecl )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:1: mutdecl : '@' blockdecl -> ^( MUTDECL blockdecl ) ;
	public final SneakersParser.mutdecl_return mutdecl() throws RecognitionException {
		SneakersParser.mutdecl_return retval = new SneakersParser.mutdecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal84=null;
		ParserRuleReturnScope blockdecl85 =null;

		SneakersAST char_literal84_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:9: ( '@' blockdecl -> ^( MUTDECL blockdecl ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:11: '@' blockdecl
			{
			char_literal84=(Token)match(input,36,FOLLOW_36_in_mutdecl721);  
			stream_36.add(char_literal84);

			pushFollow(FOLLOW_blockdecl_in_mutdecl723);
			blockdecl85=blockdecl();
			state._fsp--;

			stream_blockdecl.add(blockdecl85.getTree());
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
			// 116:25: -> ^( MUTDECL blockdecl )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:28: ^( MUTDECL blockdecl )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:119:1: expr : ( index_expr | dict | fndecl | mutdecl | anonfn | array );
	public final SneakersParser.expr_return expr() throws RecognitionException {
		SneakersParser.expr_return retval = new SneakersParser.expr_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		ParserRuleReturnScope index_expr86 =null;
		ParserRuleReturnScope dict87 =null;
		ParserRuleReturnScope fndecl88 =null;
		ParserRuleReturnScope mutdecl89 =null;
		ParserRuleReturnScope anonfn90 =null;
		ParserRuleReturnScope array91 =null;


		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:119:6: ( index_expr | dict | fndecl | mutdecl | anonfn | array )
			int alt24=6;
			switch ( input.LA(1) ) {
			case ANONVAR:
			case ID:
			case INT:
			case KEYWORD:
			case MUTID:
			case STRING:
			case TYPEID:
			case 26:
				{
				alt24=1;
				}
				break;
			case 44:
				{
				alt24=2;
				}
				break;
			case 25:
				{
				int LA24_3 = input.LA(2);
				if ( (LA24_3==37) ) {
					alt24=5;
				}
				else if ( (LA24_3==26) ) {
					alt24=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 36:
				{
				alt24=4;
				}
				break;
			case 37:
				{
				alt24=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:119:8: index_expr
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_index_expr_in_expr741);
					index_expr86=index_expr();
					state._fsp--;

					adaptor.addChild(root_0, index_expr86.getTree());

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:120:4: dict
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_dict_in_expr746);
					dict87=dict();
					state._fsp--;

					adaptor.addChild(root_0, dict87.getTree());

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:4: fndecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_fndecl_in_expr751);
					fndecl88=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl88.getTree());

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:4: mutdecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_mutdecl_in_expr756);
					mutdecl89=mutdecl();
					state._fsp--;

					adaptor.addChild(root_0, mutdecl89.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:123:4: anonfn
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_anonfn_in_expr761);
					anonfn90=anonfn();
					state._fsp--;

					adaptor.addChild(root_0, anonfn90.getTree());

					}
					break;
				case 6 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:124:4: array
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_array_in_expr766);
					array91=array();
					state._fsp--;

					adaptor.addChild(root_0, array91.getTree());

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:1: standalone_fncall : '(' fncall ')' -> fncall ;
	public final SneakersParser.standalone_fncall_return standalone_fncall() throws RecognitionException {
		SneakersParser.standalone_fncall_return retval = new SneakersParser.standalone_fncall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal92=null;
		Token char_literal94=null;
		ParserRuleReturnScope fncall93 =null;

		SneakersAST char_literal92_tree=null;
		SneakersAST char_literal94_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:128:2: ( '(' fncall ')' -> fncall )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:128:4: '(' fncall ')'
			{
			char_literal92=(Token)match(input,26,FOLLOW_26_in_standalone_fncall777);  
			stream_26.add(char_literal92);

			pushFollow(FOLLOW_fncall_in_standalone_fncall779);
			fncall93=fncall();
			state._fsp--;

			stream_fncall.add(fncall93.getTree());
			char_literal94=(Token)match(input,27,FOLLOW_27_in_standalone_fncall781);  
			stream_27.add(char_literal94);

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
			// 128:19: -> fncall
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );
	public final SneakersParser.mutcall_return mutcall() throws RecognitionException {
		SneakersParser.mutcall_return retval = new SneakersParser.mutcall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal95=null;
		Token char_literal97=null;
		Token char_literal98=null;
		Token char_literal100=null;
		ParserRuleReturnScope nested_id96 =null;
		ParserRuleReturnScope fncall99 =null;

		SneakersAST char_literal95_tree=null;
		SneakersAST char_literal97_tree=null;
		SneakersAST char_literal98_tree=null;
		SneakersAST char_literal100_tree=null;
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:9: ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall )
			int alt25=2;
			alt25 = dfa25.predict(input);
			switch (alt25) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:11: '<' nested_id '>'
					{
					char_literal95=(Token)match(input,32,FOLLOW_32_in_mutcall795);  
					stream_32.add(char_literal95);

					pushFollow(FOLLOW_nested_id_in_mutcall797);
					nested_id96=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id96.getTree());
					char_literal97=(Token)match(input,35,FOLLOW_35_in_mutcall799);  
					stream_35.add(char_literal97);

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
					// 131:29: -> nested_id
					{
						adaptor.addChild(root_0, stream_nested_id.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:132:4: '<' fncall '>'
					{
					char_literal98=(Token)match(input,32,FOLLOW_32_in_mutcall808);  
					stream_32.add(char_literal98);

					pushFollow(FOLLOW_fncall_in_mutcall810);
					fncall99=fncall();
					state._fsp--;

					stream_fncall.add(fncall99.getTree());
					char_literal100=(Token)match(input,35,FOLLOW_35_in_mutcall812);  
					stream_35.add(char_literal100);

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
					// 132:19: -> fncall
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:135:1: index_expr : ( KEYWORD | INT | STRING | nested_id | standalone_fncall );
	public final SneakersParser.index_expr_return index_expr() throws RecognitionException {
		SneakersParser.index_expr_return retval = new SneakersParser.index_expr_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token KEYWORD101=null;
		Token INT102=null;
		Token STRING103=null;
		ParserRuleReturnScope nested_id104 =null;
		ParserRuleReturnScope standalone_fncall105 =null;

		SneakersAST KEYWORD101_tree=null;
		SneakersAST INT102_tree=null;
		SneakersAST STRING103_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:136:2: ( KEYWORD | INT | STRING | nested_id | standalone_fncall )
			int alt26=5;
			switch ( input.LA(1) ) {
			case KEYWORD:
				{
				alt26=1;
				}
				break;
			case INT:
				{
				alt26=2;
				}
				break;
			case STRING:
				{
				alt26=3;
				}
				break;
			case ANONVAR:
			case ID:
			case MUTID:
			case TYPEID:
				{
				alt26=4;
				}
				break;
			case 26:
				{
				alt26=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:136:4: KEYWORD
					{
					root_0 = (SneakersAST)adaptor.nil();


					KEYWORD101=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_index_expr827); 
					KEYWORD101_tree = (SneakersAST)adaptor.create(KEYWORD101);
					adaptor.addChild(root_0, KEYWORD101_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:137:4: INT
					{
					root_0 = (SneakersAST)adaptor.nil();


					INT102=(Token)match(input,INT,FOLLOW_INT_in_index_expr832); 
					INT102_tree = (SneakersAST)adaptor.create(INT102);
					adaptor.addChild(root_0, INT102_tree);

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:138:4: STRING
					{
					root_0 = (SneakersAST)adaptor.nil();


					STRING103=(Token)match(input,STRING,FOLLOW_STRING_in_index_expr837); 
					STRING103_tree = (SneakersAST)adaptor.create(STRING103);
					adaptor.addChild(root_0, STRING103_tree);

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:139:4: nested_id
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_nested_id_in_index_expr842);
					nested_id104=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id104.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:140:4: standalone_fncall
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_standalone_fncall_in_index_expr847);
					standalone_fncall105=standalone_fncall();
					state._fsp--;

					adaptor.addChild(root_0, standalone_fncall105.getTree());

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:143:1: dict_pair : index_expr '=>' expr -> index_expr expr ;
	public final SneakersParser.dict_pair_return dict_pair() throws RecognitionException {
		SneakersParser.dict_pair_return retval = new SneakersParser.dict_pair_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token string_literal107=null;
		ParserRuleReturnScope index_expr106 =null;
		ParserRuleReturnScope expr108 =null;

		SneakersAST string_literal107_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:144:2: ( index_expr '=>' expr -> index_expr expr )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:144:4: index_expr '=>' expr
			{
			pushFollow(FOLLOW_index_expr_in_dict_pair859);
			index_expr106=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr106.getTree());
			string_literal107=(Token)match(input,34,FOLLOW_34_in_dict_pair861);  
			stream_34.add(string_literal107);

			pushFollow(FOLLOW_expr_in_dict_pair863);
			expr108=expr();
			state._fsp--;

			stream_expr.add(expr108.getTree());
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
			// 144:25: -> index_expr expr
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:147:1: dict : '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) ;
	public final SneakersParser.dict_return dict() throws RecognitionException {
		SneakersParser.dict_return retval = new SneakersParser.dict_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal109=null;
		Token char_literal111=null;
		Token char_literal113=null;
		ParserRuleReturnScope dict_pair110 =null;
		ParserRuleReturnScope dict_pair112 =null;

		SneakersAST char_literal109_tree=null;
		SneakersAST char_literal111_tree=null;
		SneakersAST char_literal113_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_dict_pair=new RewriteRuleSubtreeStream(adaptor,"rule dict_pair");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:147:6: ( '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:147:8: '{' ( dict_pair )? ( ',' dict_pair )* '}'
			{
			char_literal109=(Token)match(input,44,FOLLOW_44_in_dict879);  
			stream_44.add(char_literal109);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:147:12: ( dict_pair )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==ANONVAR||(LA27_0 >= ID && LA27_0 <= KEYWORD)||LA27_0==MUTID||(LA27_0 >= STRING && LA27_0 <= TYPEID)||LA27_0==26) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:147:13: dict_pair
					{
					pushFollow(FOLLOW_dict_pair_in_dict882);
					dict_pair110=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair110.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:147:25: ( ',' dict_pair )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==28) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:147:26: ',' dict_pair
					{
					char_literal111=(Token)match(input,28,FOLLOW_28_in_dict887);  
					stream_28.add(char_literal111);

					pushFollow(FOLLOW_dict_pair_in_dict889);
					dict_pair112=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair112.getTree());
					}
					break;

				default :
					break loop28;
				}
			}

			char_literal113=(Token)match(input,45,FOLLOW_45_in_dict893);  
			stream_45.add(char_literal113);

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
			// 147:46: -> ^( DICT ( dict_pair )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:147:49: ^( DICT ( dict_pair )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(DICT, "DICT"), root_1);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:147:56: ( dict_pair )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:150:1: contained_block : '[' block ']' -> block ;
	public final SneakersParser.contained_block_return contained_block() throws RecognitionException {
		SneakersParser.contained_block_return retval = new SneakersParser.contained_block_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal114=null;
		Token char_literal116=null;
		ParserRuleReturnScope block115 =null;

		SneakersAST char_literal114_tree=null;
		SneakersAST char_literal116_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:151:2: ( '[' block ']' -> block )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:151:4: '[' block ']'
			{
			char_literal114=(Token)match(input,37,FOLLOW_37_in_contained_block915);  
			stream_37.add(char_literal114);

			pushFollow(FOLLOW_block_in_contained_block917);
			block115=block();
			state._fsp--;

			stream_block.add(block115.getTree());
			char_literal116=(Token)match(input,38,FOLLOW_38_in_contained_block919);  
			stream_38.add(char_literal116);

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
			// 151:18: -> block
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:154:1: array : '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) ;
	public final SneakersParser.array_return array() throws RecognitionException {
		SneakersParser.array_return retval = new SneakersParser.array_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal117=null;
		Token char_literal119=null;
		Token char_literal121=null;
		ParserRuleReturnScope expr118 =null;
		ParserRuleReturnScope expr120 =null;

		SneakersAST char_literal117_tree=null;
		SneakersAST char_literal119_tree=null;
		SneakersAST char_literal121_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:154:7: ( '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:154:9: '[' ( expr )? ( ',' expr )* ']'
			{
			char_literal117=(Token)match(input,37,FOLLOW_37_in_array933);  
			stream_37.add(char_literal117);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:154:13: ( expr )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ANONVAR||(LA29_0 >= ID && LA29_0 <= KEYWORD)||LA29_0==MUTID||(LA29_0 >= STRING && LA29_0 <= TYPEID)||(LA29_0 >= 25 && LA29_0 <= 26)||(LA29_0 >= 36 && LA29_0 <= 37)||LA29_0==44) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:154:13: expr
					{
					pushFollow(FOLLOW_expr_in_array935);
					expr118=expr();
					state._fsp--;

					stream_expr.add(expr118.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:154:19: ( ',' expr )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==28) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:154:20: ',' expr
					{
					char_literal119=(Token)match(input,28,FOLLOW_28_in_array939);  
					stream_28.add(char_literal119);

					pushFollow(FOLLOW_expr_in_array941);
					expr120=expr();
					state._fsp--;

					stream_expr.add(expr120.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			char_literal121=(Token)match(input,38,FOLLOW_38_in_array945);  
			stream_38.add(char_literal121);

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
			// 154:35: -> ^( ARRAY ( expr )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:154:38: ^( ARRAY ( expr )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(ARRAY, "ARRAY"), root_1);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:154:46: ( expr )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:173:1: any_id : ( ID | TYPEID | MUTID );
	public final SneakersParser.any_id_return any_id() throws RecognitionException {
		SneakersParser.any_id_return retval = new SneakersParser.any_id_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token set122=null;

		SneakersAST set122_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:174:2: ( ID | TYPEID | MUTID )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:
			{
			root_0 = (SneakersAST)adaptor.nil();


			set122=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==MUTID||input.LA(1)==TYPEID ) {
				input.consume();
				adaptor.addChild(root_0, (SneakersAST)adaptor.create(set122));
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
	protected DFA18 dfa18 = new DFA18(this);
	protected DFA25 dfa25 = new DFA25(this);
	static final String DFA3_eotS =
		"\14\uffff";
	static final String DFA3_eofS =
		"\2\uffff\2\4\2\uffff\1\7\1\uffff\1\7\1\uffff\2\4";
	static final String DFA3_minS =
		"\1\53\3\5\1\uffff\1\15\1\5\1\uffff\1\5\1\15\2\5";
	static final String DFA3_maxS =
		"\1\53\3\54\1\uffff\1\27\1\54\1\uffff\1\54\1\27\2\54";
	static final String DFA3_acceptS =
		"\4\uffff\1\2\2\uffff\1\1\4\uffff";
	static final String DFA3_specialS =
		"\14\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1",
			"\1\2\7\uffff\1\3\2\4\1\uffff\1\3\4\uffff\1\4\1\3\1\uffff\2\4\11\uffff"+
			"\2\4\6\uffff\1\4",
			"\1\7\7\uffff\1\6\2\7\1\uffff\1\10\4\uffff\1\7\1\10\1\uffff\2\7\2\uffff"+
			"\1\5\1\uffff\2\4\3\uffff\2\7\3\uffff\3\4\1\7",
			"\1\7\7\uffff\1\6\2\7\1\uffff\1\10\4\uffff\1\7\1\10\1\uffff\2\7\2\uffff"+
			"\1\11\1\uffff\2\4\3\uffff\2\7\3\uffff\3\4\1\7",
			"",
			"\1\12\3\uffff\1\12\5\uffff\1\12",
			"\1\7\7\uffff\3\7\1\uffff\1\7\4\uffff\2\7\1\uffff\2\7\1\uffff\5\7\1\4"+
			"\2\uffff\2\7\3\uffff\4\7",
			"",
			"\1\7\7\uffff\3\7\1\uffff\1\7\4\uffff\2\7\1\uffff\2\7\1\uffff\2\7\1\uffff"+
			"\2\7\1\4\2\uffff\2\7\3\uffff\4\7",
			"\1\13\3\uffff\1\13\5\uffff\1\13",
			"\1\7\7\uffff\1\6\2\7\1\uffff\1\10\4\uffff\1\7\1\10\1\uffff\2\7\2\uffff"+
			"\1\5\1\uffff\2\4\3\uffff\2\7\3\uffff\3\4\1\7",
			"\1\7\7\uffff\1\6\2\7\1\uffff\1\10\4\uffff\1\7\1\10\1\uffff\2\7\2\uffff"+
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
			return "55:1: returnstat : ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) );";
		}
	}

	static final String DFA6_eotS =
		"\15\uffff";
	static final String DFA6_eofS =
		"\4\uffff\2\3\1\uffff\2\11\2\uffff\2\3";
	static final String DFA6_minS =
		"\1\15\1\41\1\5\1\uffff\2\5\1\15\2\5\1\uffff\1\15\2\5";
	static final String DFA6_maxS =
		"\1\27\1\41\1\54\1\uffff\2\54\1\27\2\54\1\uffff\1\27\2\54";
	static final String DFA6_acceptS =
		"\3\uffff\1\1\5\uffff\1\2\3\uffff";
	static final String DFA6_specialS =
		"\15\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\1\3\uffff\1\1\5\uffff\1\1",
			"\1\2",
			"\1\4\7\uffff\1\5\2\3\1\uffff\1\5\4\uffff\1\3\1\5\1\uffff\2\3\11\uffff"+
			"\2\3\6\uffff\1\3",
			"",
			"\1\11\7\uffff\1\7\2\11\1\uffff\1\10\4\uffff\1\11\1\10\1\uffff\2\11\2"+
			"\uffff\1\6\1\uffff\2\3\3\uffff\2\11\3\uffff\3\3\1\11",
			"\1\11\7\uffff\1\7\2\11\1\uffff\1\10\4\uffff\1\11\1\10\1\uffff\2\11\2"+
			"\uffff\1\12\1\uffff\2\3\3\uffff\2\11\3\uffff\3\3\1\11",
			"\1\13\3\uffff\1\13\5\uffff\1\13",
			"\1\11\7\uffff\3\11\1\uffff\1\11\4\uffff\2\11\1\uffff\2\11\1\uffff\5"+
			"\11\1\3\2\uffff\2\11\3\uffff\4\11",
			"\1\11\7\uffff\3\11\1\uffff\1\11\4\uffff\2\11\1\uffff\2\11\1\uffff\2"+
			"\11\1\uffff\2\11\1\3\2\uffff\2\11\3\uffff\4\11",
			"",
			"\1\14\3\uffff\1\14\5\uffff\1\14",
			"\1\11\7\uffff\1\7\2\11\1\uffff\1\10\4\uffff\1\11\1\10\1\uffff\2\11\2"+
			"\uffff\1\6\1\uffff\2\3\3\uffff\2\11\3\uffff\3\3\1\11",
			"\1\11\7\uffff\1\7\2\11\1\uffff\1\10\4\uffff\1\11\1\10\1\uffff\2\11\2"+
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
			return "65:1: assignment : ( any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );";
		}
	}

	static final String DFA18_eotS =
		"\13\uffff";
	static final String DFA18_eofS =
		"\13\uffff";
	static final String DFA18_minS =
		"\1\31\1\45\3\5\1\15\2\uffff\1\15\2\5";
	static final String DFA18_maxS =
		"\1\31\1\45\1\27\2\54\1\27\2\uffff\1\27\2\54";
	static final String DFA18_acceptS =
		"\6\uffff\1\1\1\2\3\uffff";
	static final String DFA18_specialS =
		"\13\uffff}>";
	static final String[] DFA18_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\7\uffff\1\4\3\uffff\1\4\5\uffff\1\4",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\5\6\uffff"+
			"\2\6\1\7\5\uffff\1\6",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\10\6"+
			"\uffff\2\6\1\7\5\uffff\1\6",
			"\1\11\3\uffff\1\11\5\uffff\1\11",
			"",
			"",
			"\1\12\3\uffff\1\12\5\uffff\1\12",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\5\6\uffff"+
			"\2\6\1\7\5\uffff\1\6",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\10\6"+
			"\uffff\2\6\1\7\5\uffff\1\6"
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "104:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );";
		}
	}

	static final String DFA25_eotS =
		"\12\uffff";
	static final String DFA25_eofS =
		"\12\uffff";
	static final String DFA25_minS =
		"\1\40\3\5\1\15\2\uffff\1\15\2\5";
	static final String DFA25_maxS =
		"\1\40\1\27\2\54\1\27\2\uffff\1\27\2\54";
	static final String DFA25_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA25_specialS =
		"\12\uffff}>";
	static final String[] DFA25_transitionS = {
			"\1\1",
			"\1\2\7\uffff\1\3\3\uffff\1\3\5\uffff\1\3",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\4\5\uffff"+
			"\1\5\2\6\6\uffff\1\6",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\7\5\uffff"+
			"\1\5\2\6\6\uffff\1\6",
			"\1\10\3\uffff\1\10\5\uffff\1\10",
			"",
			"",
			"\1\11\3\uffff\1\11\5\uffff\1\11",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\4\5\uffff"+
			"\1\5\2\6\6\uffff\1\6",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\7\5\uffff"+
			"\1\5\2\6\6\uffff\1\6"
	};

	static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
	static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
	static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
	static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
	static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
	static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
	static final short[][] DFA25_transition;

	static {
		int numStates = DFA25_transitionS.length;
		DFA25_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
		}
	}

	protected class DFA25 extends DFA {

		public DFA25(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 25;
			this.eot = DFA25_eot;
			this.eof = DFA25_eof;
			this.min = DFA25_min;
			this.max = DFA25_max;
			this.accept = DFA25_accept;
			this.special = DFA25_special;
			this.transition = DFA25_transition;
		}
		@Override
		public String getDescription() {
			return "131:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );";
		}
	}

	public static final BitSet FOLLOW_block_in_prog121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_block133 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_block135 = new BitSet(new long[]{0x00000E0100822002L});
	public static final BitSet FOLLOW_assignment_in_stat154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_stat164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutcall_in_stat169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_stat174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_returnstat185 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_fncall_in_returnstat187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_returnstat200 = new BitSet(new long[]{0x0000103006C2E020L});
	public static final BitSet FOLLOW_expr_in_returnstat202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ifstat220 = new BitSet(new long[]{0x0000103006C2E020L});
	public static final BitSet FOLLOW_expr_in_ifstat224 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat228 = new BitSet(new long[]{0x0000018000000002L});
	public static final BitSet FOLLOW_40_in_ifstat234 = new BitSet(new long[]{0x0000103006C2E020L});
	public static final BitSet FOLLOW_expr_in_ifstat238 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat242 = new BitSet(new long[]{0x0000018000000002L});
	public static final BitSet FOLLOW_39_in_ifstat250 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment292 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_assignment294 = new BitSet(new long[]{0x0000103006C2E020L});
	public static final BitSet FOLLOW_expr_in_assignment296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment311 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_assignment313 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_fncall_in_assignment315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_defable336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_defable341 = new BitSet(new long[]{0x00000E0100822000L});
	public static final BitSet FOLLOW_stat_in_defable343 = new BitSet(new long[]{0x00000E0100822002L});
	public static final BitSet FOLLOW_KEYWORD_in_defdecl354 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_defdecl356 = new BitSet(new long[]{0x0000000002800000L});
	public static final BitSet FOLLOW_defable_in_defdecl358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANONVAR_in_nested_id371 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_nested_id374 = new BitSet(new long[]{0x0000000000822000L});
	public static final BitSet FOLLOW_any_id_in_nested_id376 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_any_id_in_nested_id390 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_nested_id393 = new BitSet(new long[]{0x0000000000822000L});
	public static final BitSet FOLLOW_any_id_in_nested_id395 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_nested_id_in_fncall412 = new BitSet(new long[]{0x0000103006C2E020L});
	public static final BitSet FOLLOW_param_in_fncall414 = new BitSet(new long[]{0x0000103016C2E022L});
	public static final BitSet FOLLOW_28_in_fncall417 = new BitSet(new long[]{0x0000103006C2E020L});
	public static final BitSet FOLLOW_param_in_fncall420 = new BitSet(new long[]{0x0000103016C2E022L});
	public static final BitSet FOLLOW_ID_in_param443 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_param445 = new BitSet(new long[]{0x0000103006C2E020L});
	public static final BitSet FOLLOW_expr_in_param447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_param462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_blockparamtype482 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype484 = new BitSet(new long[]{0x0000000018000000L});
	public static final BitSet FOLLOW_28_in_blockparamtype487 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype489 = new BitSet(new long[]{0x0000000018000000L});
	public static final BitSet FOLLOW_27_in_blockparamtype493 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_blockparamtype495 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_blockparamtype507 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_blockparamtype509 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_blockparamtype511 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_paramtype533 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_blockparamtype_in_paramtype535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_paramtype548 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_blockparamtype_in_paramtype550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fnparam569 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_fnparam571 = new BitSet(new long[]{0x0000001002800000L});
	public static final BitSet FOLLOW_paramtype_in_fnparam573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_anonfn593 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_anonfn595 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_fncall_in_anonfn597 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_anonfn599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_anonfn612 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_anonfn614 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_nested_id_in_anonfn616 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_anonfn618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_blockdecl637 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_blockdecl639 = new BitSet(new long[]{0x0000002040000000L});
	public static final BitSet FOLLOW_30_in_blockdecl642 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl644 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_blockdecl660 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl662 = new BitSet(new long[]{0x0000000018002000L});
	public static final BitSet FOLLOW_28_in_blockdecl665 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl668 = new BitSet(new long[]{0x0000000018002000L});
	public static final BitSet FOLLOW_27_in_blockdecl672 = new BitSet(new long[]{0x0000002040000000L});
	public static final BitSet FOLLOW_30_in_blockdecl675 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl677 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_fndecl701 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_blockdecl_in_fndecl703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_mutdecl721 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_blockdecl_in_mutdecl723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_expr741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_expr751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutdecl_in_expr756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anonfn_in_expr761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_expr766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_standalone_fncall777 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_fncall_in_standalone_fncall779 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_standalone_fncall781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_mutcall795 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_nested_id_in_mutcall797 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_mutcall799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_mutcall808 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_fncall_in_mutcall810 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_mutcall812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_index_expr827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_index_expr832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_index_expr837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_index_expr842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standalone_fncall_in_index_expr847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_dict_pair859 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_dict_pair861 = new BitSet(new long[]{0x0000103006C2E020L});
	public static final BitSet FOLLOW_expr_in_dict_pair863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_dict879 = new BitSet(new long[]{0x0000200014C2E020L});
	public static final BitSet FOLLOW_dict_pair_in_dict882 = new BitSet(new long[]{0x0000200010000000L});
	public static final BitSet FOLLOW_28_in_dict887 = new BitSet(new long[]{0x0000000004C2E020L});
	public static final BitSet FOLLOW_dict_pair_in_dict889 = new BitSet(new long[]{0x0000200010000000L});
	public static final BitSet FOLLOW_45_in_dict893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_contained_block915 = new BitSet(new long[]{0x00000E0100822000L});
	public static final BitSet FOLLOW_block_in_contained_block917 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_contained_block919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_array933 = new BitSet(new long[]{0x0000107016C2E020L});
	public static final BitSet FOLLOW_expr_in_array935 = new BitSet(new long[]{0x0000004010000000L});
	public static final BitSet FOLLOW_28_in_array939 = new BitSet(new long[]{0x0000103006C2E020L});
	public static final BitSet FOLLOW_expr_in_array941 = new BitSet(new long[]{0x0000004010000000L});
	public static final BitSet FOLLOW_38_in_array945 = new BitSet(new long[]{0x0000000000000002L});
}
