// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-22 08:17:15
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
		"';'", "'<'", "'='", "'=>'", "'>'", "'@'", "'['", "']'", "'class'", "'else'", 
		"'elseif'", "'extend'", "'if'", "'pass'", "'return'", "'{'", "'}'"
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
	public static final int T__46=46;
	public static final int T__47=47;
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
				if ( (LA1_0==ID||LA1_0==MUTID||LA1_0==TYPEID||LA1_0==32||(LA1_0 >= 43 && LA1_0 <= 45)) ) {
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
			case 43:
				{
				alt2=2;
				}
				break;
			case 45:
				{
				alt2=3;
				}
				break;
			case 32:
				{
				alt2=4;
				}
				break;
			case 44:
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


					string_literal8=(Token)match(input,44,FOLLOW_44_in_stat174); 
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
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
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
					string_literal9=(Token)match(input,45,FOLLOW_45_in_returnstat185);  
					stream_45.add(string_literal9);

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
					string_literal11=(Token)match(input,45,FOLLOW_45_in_returnstat200);  
					stream_45.add(string_literal11);

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
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:60:8: ( 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:60:10: 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )?
			{
			string_literal13=(Token)match(input,43,FOLLOW_43_in_ifstat220);  
			stream_43.add(string_literal13);

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
				if ( (LA4_0==41) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:4: 'elseif' elifexpr+= expr elifblock+= contained_block
					{
					string_literal14=(Token)match(input,41,FOLLOW_41_in_ifstat234);  
					stream_41.add(string_literal14);

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
			if ( (LA5_0==40) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:4: 'else' elseblock= contained_block
					{
					string_literal15=(Token)match(input,40,FOLLOW_40_in_ifstat250);  
					stream_40.add(string_literal15);

					pushFollow(FOLLOW_contained_block_in_ifstat254);
					elseblock=contained_block();
					state._fsp--;

					stream_contained_block.add(elseblock.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: elifblock, 43, elifexpr, ifexpr, elseblock, ifblock
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
				root_1 = (SneakersAST)adaptor.becomeRoot(stream_43.nextNode(), root_1);
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:1: assignment : ( TYPEID '=' 'class' expr -> ^( 'class' TYPEID expr ) |newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' expr -> ^( 'extend' $newclass $oldclass expr ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );
	public final SneakersParser.assignment_return assignment() throws RecognitionException {
		SneakersParser.assignment_return retval = new SneakersParser.assignment_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token newclass=null;
		Token oldclass=null;
		Token TYPEID16=null;
		Token char_literal17=null;
		Token string_literal18=null;
		Token char_literal20=null;
		Token char_literal21=null;
		Token string_literal22=null;
		Token char_literal25=null;
		Token char_literal28=null;
		ParserRuleReturnScope expr19 =null;
		ParserRuleReturnScope expr23 =null;
		ParserRuleReturnScope any_id24 =null;
		ParserRuleReturnScope expr26 =null;
		ParserRuleReturnScope any_id27 =null;
		ParserRuleReturnScope fncall29 =null;

		SneakersAST newclass_tree=null;
		SneakersAST oldclass_tree=null;
		SneakersAST TYPEID16_tree=null;
		SneakersAST char_literal17_tree=null;
		SneakersAST string_literal18_tree=null;
		SneakersAST char_literal20_tree=null;
		SneakersAST char_literal21_tree=null;
		SneakersAST string_literal22_tree=null;
		SneakersAST char_literal25_tree=null;
		SneakersAST char_literal28_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:2: ( TYPEID '=' 'class' expr -> ^( 'class' TYPEID expr ) |newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' expr -> ^( 'extend' $newclass $oldclass expr ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) )
			int alt6=4;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:4: TYPEID '=' 'class' expr
					{
					TYPEID16=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_assignment292);  
					stream_TYPEID.add(TYPEID16);

					char_literal17=(Token)match(input,33,FOLLOW_33_in_assignment294);  
					stream_33.add(char_literal17);

					string_literal18=(Token)match(input,39,FOLLOW_39_in_assignment296);  
					stream_39.add(string_literal18);

					pushFollow(FOLLOW_expr_in_assignment298);
					expr19=expr();
					state._fsp--;

					stream_expr.add(expr19.getTree());
					// AST REWRITE
					// elements: 39, expr, TYPEID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 66:28: -> ^( 'class' TYPEID expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:31: ^( 'class' TYPEID expr )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_39.nextNode(), root_1);
						adaptor.addChild(root_1, stream_TYPEID.nextNode());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:4: newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' expr
					{
					newclass=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_assignment315);  
					stream_TYPEID.add(newclass);

					char_literal20=(Token)match(input,33,FOLLOW_33_in_assignment317);  
					stream_33.add(char_literal20);

					oldclass=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_assignment321);  
					stream_TYPEID.add(oldclass);

					char_literal21=(Token)match(input,29,FOLLOW_29_in_assignment323);  
					stream_29.add(char_literal21);

					string_literal22=(Token)match(input,42,FOLLOW_42_in_assignment325);  
					stream_42.add(string_literal22);

					pushFollow(FOLLOW_expr_in_assignment327);
					expr23=expr();
					state._fsp--;

					stream_expr.add(expr23.getTree());
					// AST REWRITE
					// elements: oldclass, 42, expr, newclass
					// token labels: oldclass, newclass
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_oldclass=new RewriteRuleTokenStream(adaptor,"token oldclass",oldclass);
					RewriteRuleTokenStream stream_newclass=new RewriteRuleTokenStream(adaptor,"token newclass",newclass);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 67:58: -> ^( 'extend' $newclass $oldclass expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:61: ^( 'extend' $newclass $oldclass expr )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_42.nextNode(), root_1);
						adaptor.addChild(root_1, stream_newclass.nextNode());
						adaptor.addChild(root_1, stream_oldclass.nextNode());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:68:4: any_id '=' expr
					{
					pushFollow(FOLLOW_any_id_in_assignment346);
					any_id24=any_id();
					state._fsp--;

					stream_any_id.add(any_id24.getTree());
					char_literal25=(Token)match(input,33,FOLLOW_33_in_assignment348);  
					stream_33.add(char_literal25);

					pushFollow(FOLLOW_expr_in_assignment350);
					expr26=expr();
					state._fsp--;

					stream_expr.add(expr26.getTree());
					// AST REWRITE
					// elements: any_id, expr, 33
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 68:20: -> ^( '=' any_id expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:68:23: ^( '=' any_id expr )
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
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:4: any_id '=' fncall
					{
					pushFollow(FOLLOW_any_id_in_assignment365);
					any_id27=any_id();
					state._fsp--;

					stream_any_id.add(any_id27.getTree());
					char_literal28=(Token)match(input,33,FOLLOW_33_in_assignment367);  
					stream_33.add(char_literal28);

					pushFollow(FOLLOW_fncall_in_assignment369);
					fncall29=fncall();
					state._fsp--;

					stream_fncall.add(fncall29.getTree());
					// AST REWRITE
					// elements: fncall, 33, any_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 69:22: -> ^( '=' any_id fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:25: ^( '=' any_id fncall )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:1: defable : ( TYPEID | fndecl ( stat )+ );
	public final SneakersParser.defable_return defable() throws RecognitionException {
		SneakersParser.defable_return retval = new SneakersParser.defable_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token TYPEID30=null;
		ParserRuleReturnScope fndecl31 =null;
		ParserRuleReturnScope stat32 =null;

		SneakersAST TYPEID30_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:9: ( TYPEID | fndecl ( stat )+ )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:11: TYPEID
					{
					root_0 = (SneakersAST)adaptor.nil();


					TYPEID30=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_defable390); 
					TYPEID30_tree = (SneakersAST)adaptor.create(TYPEID30);
					adaptor.addChild(root_0, TYPEID30_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:4: fndecl ( stat )+
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_fndecl_in_defable395);
					fndecl31=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl31.getTree());

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:11: ( stat )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==ID||LA7_0==MUTID||LA7_0==TYPEID||LA7_0==32||(LA7_0 >= 43 && LA7_0 <= 45)) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:11: stat
							{
							pushFollow(FOLLOW_stat_in_defable397);
							stat32=stat();
							state._fsp--;

							adaptor.addChild(root_0, stat32.getTree());

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:1: defdecl : KEYWORD '=>' defable ;
	public final SneakersParser.defdecl_return defdecl() throws RecognitionException {
		SneakersParser.defdecl_return retval = new SneakersParser.defdecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token KEYWORD33=null;
		Token string_literal34=null;
		ParserRuleReturnScope defable35 =null;

		SneakersAST KEYWORD33_tree=null;
		SneakersAST string_literal34_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:9: ( KEYWORD '=>' defable )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:11: KEYWORD '=>' defable
			{
			root_0 = (SneakersAST)adaptor.nil();


			KEYWORD33=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_defdecl408); 
			KEYWORD33_tree = (SneakersAST)adaptor.create(KEYWORD33);
			adaptor.addChild(root_0, KEYWORD33_tree);

			string_literal34=(Token)match(input,34,FOLLOW_34_in_defdecl410); 
			string_literal34_tree = (SneakersAST)adaptor.create(string_literal34);
			adaptor.addChild(root_0, string_literal34_tree);

			pushFollow(FOLLOW_defable_in_defdecl412);
			defable35=defable();
			state._fsp--;

			adaptor.addChild(root_0, defable35.getTree());

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:1: nested_id : ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* );
	public final SneakersParser.nested_id_return nested_id() throws RecognitionException {
		SneakersParser.nested_id_return retval = new SneakersParser.nested_id_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ANONVAR36=null;
		Token char_literal37=null;
		Token char_literal40=null;
		ParserRuleReturnScope any_id38 =null;
		ParserRuleReturnScope any_id39 =null;
		ParserRuleReturnScope any_id41 =null;

		SneakersAST ANONVAR36_tree=null;
		SneakersAST char_literal37_tree=null;
		SneakersAST char_literal40_tree=null;
		RewriteRuleTokenStream stream_ANONVAR=new RewriteRuleTokenStream(adaptor,"token ANONVAR");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:2: ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:4: ANONVAR ( '.' any_id )*
					{
					ANONVAR36=(Token)match(input,ANONVAR,FOLLOW_ANONVAR_in_nested_id425);  
					stream_ANONVAR.add(ANONVAR36);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:12: ( '.' any_id )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==29) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:13: '.' any_id
							{
							char_literal37=(Token)match(input,29,FOLLOW_29_in_nested_id428);  
							stream_29.add(char_literal37);

							pushFollow(FOLLOW_any_id_in_nested_id430);
							any_id38=any_id();
							state._fsp--;

							stream_any_id.add(any_id38.getTree());
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
					// 82:26: -> ANONVAR ( any_id )*
					{
						adaptor.addChild(root_0, stream_ANONVAR.nextNode());
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:37: ( any_id )*
						while ( stream_any_id.hasNext() ) {
							adaptor.addChild(root_0, stream_any_id.nextTree());
						}
						stream_any_id.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:4: any_id ( '.' any_id )*
					{
					pushFollow(FOLLOW_any_id_in_nested_id444);
					any_id39=any_id();
					state._fsp--;

					stream_any_id.add(any_id39.getTree());
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:11: ( '.' any_id )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==29) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:12: '.' any_id
							{
							char_literal40=(Token)match(input,29,FOLLOW_29_in_nested_id447);  
							stream_29.add(char_literal40);

							pushFollow(FOLLOW_any_id_in_nested_id449);
							any_id41=any_id();
							state._fsp--;

							stream_any_id.add(any_id41.getTree());
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
					// 83:25: -> ( any_id )*
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:28: ( any_id )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:1: fncall : nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) ;
	public final SneakersParser.fncall_return fncall() throws RecognitionException {
		SneakersParser.fncall_return retval = new SneakersParser.fncall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal44=null;
		ParserRuleReturnScope nested_id42 =null;
		ParserRuleReturnScope param43 =null;
		ParserRuleReturnScope param45 =null;

		SneakersAST char_literal44_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:8: ( nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:10: nested_id param ( ( ',' )? param )*
			{
			pushFollow(FOLLOW_nested_id_in_fncall466);
			nested_id42=nested_id();
			state._fsp--;

			stream_nested_id.add(nested_id42.getTree());
			pushFollow(FOLLOW_param_in_fncall468);
			param43=param();
			state._fsp--;

			stream_param.add(param43.getTree());
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:26: ( ( ',' )? param )*
			loop13:
			while (true) {
				int alt13=2;
				switch ( input.LA(1) ) {
				case TYPEID:
					{
					int LA13_2 = input.LA(2);
					if ( (LA13_2==EOF||LA13_2==ANONVAR||(LA13_2 >= ID && LA13_2 <= KEYWORD)||LA13_2==MUTID||(LA13_2 >= STRING && LA13_2 <= TYPEID)||(LA13_2 >= 25 && LA13_2 <= 29)||(LA13_2 >= 31 && LA13_2 <= 32)||(LA13_2 >= 35 && LA13_2 <= 38)||(LA13_2 >= 43 && LA13_2 <= 46)) ) {
						alt13=1;
					}

					}
					break;
				case ID:
					{
					int LA13_3 = input.LA(2);
					if ( (LA13_3==EOF||LA13_3==ANONVAR||(LA13_3 >= ID && LA13_3 <= KEYWORD)||LA13_3==MUTID||(LA13_3 >= STRING && LA13_3 <= TYPEID)||(LA13_3 >= 25 && LA13_3 <= 32)||(LA13_3 >= 35 && LA13_3 <= 38)||(LA13_3 >= 43 && LA13_3 <= 46)) ) {
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
				case 46:
					{
					alt13=1;
					}
					break;
				case MUTID:
					{
					int LA13_5 = input.LA(2);
					if ( (LA13_5==EOF||LA13_5==ANONVAR||(LA13_5 >= ID && LA13_5 <= KEYWORD)||LA13_5==MUTID||(LA13_5 >= STRING && LA13_5 <= TYPEID)||(LA13_5 >= 25 && LA13_5 <= 29)||(LA13_5 >= 31 && LA13_5 <= 32)||(LA13_5 >= 35 && LA13_5 <= 38)||(LA13_5 >= 43 && LA13_5 <= 46)) ) {
						alt13=1;
					}

					}
					break;
				}
				switch (alt13) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:27: ( ',' )? param
					{
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:27: ( ',' )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==28) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:27: ','
							{
							char_literal44=(Token)match(input,28,FOLLOW_28_in_fncall471);  
							stream_28.add(char_literal44);

							}
							break;

					}

					pushFollow(FOLLOW_param_in_fncall474);
					param45=param();
					state._fsp--;

					stream_param.add(param45.getTree());
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
			// 86:40: -> ^( FNCALL nested_id ( param )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:43: ^( FNCALL nested_id ( param )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(FNCALL, "FNCALL"), root_1);
				adaptor.addChild(root_1, stream_nested_id.nextTree());
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:62: ( param )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:1: param : ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) );
	public final SneakersParser.param_return param() throws RecognitionException {
		SneakersParser.param_return retval = new SneakersParser.param_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ID46=null;
		Token char_literal47=null;
		ParserRuleReturnScope expr48 =null;
		ParserRuleReturnScope expr49 =null;

		SneakersAST ID46_tree=null;
		SneakersAST char_literal47_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:7: ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ID) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==30) ) {
					alt14=1;
				}
				else if ( (LA14_1==EOF||LA14_1==ANONVAR||(LA14_1 >= ID && LA14_1 <= KEYWORD)||LA14_1==MUTID||(LA14_1 >= STRING && LA14_1 <= TYPEID)||(LA14_1 >= 25 && LA14_1 <= 29)||(LA14_1 >= 31 && LA14_1 <= 32)||(LA14_1 >= 35 && LA14_1 <= 38)||(LA14_1 >= 43 && LA14_1 <= 46)) ) {
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
			else if ( (LA14_0==ANONVAR||(LA14_0 >= INT && LA14_0 <= KEYWORD)||LA14_0==MUTID||(LA14_0 >= STRING && LA14_0 <= TYPEID)||(LA14_0 >= 25 && LA14_0 <= 26)||(LA14_0 >= 36 && LA14_0 <= 37)||LA14_0==46) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:9: ID ':' expr
					{
					ID46=(Token)match(input,ID,FOLLOW_ID_in_param497);  
					stream_ID.add(ID46);

					char_literal47=(Token)match(input,30,FOLLOW_30_in_param499);  
					stream_30.add(char_literal47);

					pushFollow(FOLLOW_expr_in_param501);
					expr48=expr();
					state._fsp--;

					stream_expr.add(expr48.getTree());
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
					// 89:21: -> ^( PARAM ID expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:24: ^( PARAM ID expr )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:4: expr
					{
					pushFollow(FOLLOW_expr_in_param516);
					expr49=expr();
					state._fsp--;

					stream_expr.add(expr49.getTree());
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
					// 90:9: -> ^( PARAM expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:12: ^( PARAM expr )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:1: blockparamtype : ( '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ( TYPEID )+ | '(' ')' ':' TYPEID -> TYPEID );
	public final SneakersParser.blockparamtype_return blockparamtype() throws RecognitionException {
		SneakersParser.blockparamtype_return retval = new SneakersParser.blockparamtype_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal50=null;
		Token TYPEID51=null;
		Token char_literal52=null;
		Token TYPEID53=null;
		Token char_literal54=null;
		Token char_literal55=null;
		Token TYPEID56=null;
		Token char_literal57=null;
		Token char_literal58=null;
		Token char_literal59=null;
		Token TYPEID60=null;

		SneakersAST char_literal50_tree=null;
		SneakersAST TYPEID51_tree=null;
		SneakersAST char_literal52_tree=null;
		SneakersAST TYPEID53_tree=null;
		SneakersAST char_literal54_tree=null;
		SneakersAST char_literal55_tree=null;
		SneakersAST TYPEID56_tree=null;
		SneakersAST char_literal57_tree=null;
		SneakersAST char_literal58_tree=null;
		SneakersAST char_literal59_tree=null;
		SneakersAST TYPEID60_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:94:2: ( '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ( TYPEID )+ | '(' ')' ':' TYPEID -> TYPEID )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:94:4: '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID
					{
					char_literal50=(Token)match(input,26,FOLLOW_26_in_blockparamtype536);  
					stream_26.add(char_literal50);

					TYPEID51=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype538);  
					stream_TYPEID.add(TYPEID51);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:94:15: ( ',' TYPEID )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==28) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:94:16: ',' TYPEID
							{
							char_literal52=(Token)match(input,28,FOLLOW_28_in_blockparamtype541);  
							stream_28.add(char_literal52);

							TYPEID53=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype543);  
							stream_TYPEID.add(TYPEID53);

							}
							break;

						default :
							break loop15;
						}
					}

					char_literal54=(Token)match(input,27,FOLLOW_27_in_blockparamtype547);  
					stream_27.add(char_literal54);

					char_literal55=(Token)match(input,30,FOLLOW_30_in_blockparamtype549);  
					stream_30.add(char_literal55);

					TYPEID56=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype551);  
					stream_TYPEID.add(TYPEID56);

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
					// 94:44: -> ( TYPEID )+
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:4: '(' ')' ':' TYPEID
					{
					char_literal57=(Token)match(input,26,FOLLOW_26_in_blockparamtype561);  
					stream_26.add(char_literal57);

					char_literal58=(Token)match(input,27,FOLLOW_27_in_blockparamtype563);  
					stream_27.add(char_literal58);

					char_literal59=(Token)match(input,30,FOLLOW_30_in_blockparamtype565);  
					stream_30.add(char_literal59);

					TYPEID60=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype567);  
					stream_TYPEID.add(TYPEID60);

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
					// 95:23: -> TYPEID
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:98:1: paramtype : ( TYPEID | '#' blockparamtype -> ^( PARAMTYPEFN blockparamtype ) | '@' blockparamtype -> ^( PARAMTYPEMUT blockparamtype ) );
	public final SneakersParser.paramtype_return paramtype() throws RecognitionException {
		SneakersParser.paramtype_return retval = new SneakersParser.paramtype_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token TYPEID61=null;
		Token char_literal62=null;
		Token char_literal64=null;
		ParserRuleReturnScope blockparamtype63 =null;
		ParserRuleReturnScope blockparamtype65 =null;

		SneakersAST TYPEID61_tree=null;
		SneakersAST char_literal62_tree=null;
		SneakersAST char_literal64_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleSubtreeStream stream_blockparamtype=new RewriteRuleSubtreeStream(adaptor,"rule blockparamtype");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:98:11: ( TYPEID | '#' blockparamtype -> ^( PARAMTYPEFN blockparamtype ) | '@' blockparamtype -> ^( PARAMTYPEMUT blockparamtype ) )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:98:14: TYPEID
					{
					root_0 = (SneakersAST)adaptor.nil();


					TYPEID61=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype582); 
					TYPEID61_tree = (SneakersAST)adaptor.create(TYPEID61);
					adaptor.addChild(root_0, TYPEID61_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:4: '#' blockparamtype
					{
					char_literal62=(Token)match(input,25,FOLLOW_25_in_paramtype587);  
					stream_25.add(char_literal62);

					pushFollow(FOLLOW_blockparamtype_in_paramtype589);
					blockparamtype63=blockparamtype();
					state._fsp--;

					stream_blockparamtype.add(blockparamtype63.getTree());
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
					// 99:23: -> ^( PARAMTYPEFN blockparamtype )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:26: ^( PARAMTYPEFN blockparamtype )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:4: '@' blockparamtype
					{
					char_literal64=(Token)match(input,36,FOLLOW_36_in_paramtype602);  
					stream_36.add(char_literal64);

					pushFollow(FOLLOW_blockparamtype_in_paramtype604);
					blockparamtype65=blockparamtype();
					state._fsp--;

					stream_blockparamtype.add(blockparamtype65.getTree());
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
					// 100:23: -> ^( PARAMTYPEMUT blockparamtype )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:26: ^( PARAMTYPEMUT blockparamtype )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:103:1: fnparam : ID ':' paramtype -> ^( FNPARAM ID paramtype ) ;
	public final SneakersParser.fnparam_return fnparam() throws RecognitionException {
		SneakersParser.fnparam_return retval = new SneakersParser.fnparam_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ID66=null;
		Token char_literal67=null;
		ParserRuleReturnScope paramtype68 =null;

		SneakersAST ID66_tree=null;
		SneakersAST char_literal67_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_paramtype=new RewriteRuleSubtreeStream(adaptor,"rule paramtype");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:103:9: ( ID ':' paramtype -> ^( FNPARAM ID paramtype ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:103:11: ID ':' paramtype
			{
			ID66=(Token)match(input,ID,FOLLOW_ID_in_fnparam623);  
			stream_ID.add(ID66);

			char_literal67=(Token)match(input,30,FOLLOW_30_in_fnparam625);  
			stream_30.add(char_literal67);

			pushFollow(FOLLOW_paramtype_in_fnparam627);
			paramtype68=paramtype();
			state._fsp--;

			stream_paramtype.add(paramtype68.getTree());
			// AST REWRITE
			// elements: ID, paramtype
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (SneakersAST)adaptor.nil();
			// 103:28: -> ^( FNPARAM ID paramtype )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:103:31: ^( FNPARAM ID paramtype )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );
	public final SneakersParser.anonfn_return anonfn() throws RecognitionException {
		SneakersParser.anonfn_return retval = new SneakersParser.anonfn_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal69=null;
		Token char_literal70=null;
		Token char_literal72=null;
		Token char_literal73=null;
		Token char_literal74=null;
		Token char_literal76=null;
		ParserRuleReturnScope fncall71 =null;
		ParserRuleReturnScope nested_id75 =null;

		SneakersAST char_literal69_tree=null;
		SneakersAST char_literal70_tree=null;
		SneakersAST char_literal72_tree=null;
		SneakersAST char_literal73_tree=null;
		SneakersAST char_literal74_tree=null;
		SneakersAST char_literal76_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:8: ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) )
			int alt18=2;
			alt18 = dfa18.predict(input);
			switch (alt18) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:10: '#' '[' fncall ']'
					{
					char_literal69=(Token)match(input,25,FOLLOW_25_in_anonfn647);  
					stream_25.add(char_literal69);

					char_literal70=(Token)match(input,37,FOLLOW_37_in_anonfn649);  
					stream_37.add(char_literal70);

					pushFollow(FOLLOW_fncall_in_anonfn651);
					fncall71=fncall();
					state._fsp--;

					stream_fncall.add(fncall71.getTree());
					char_literal72=(Token)match(input,38,FOLLOW_38_in_anonfn653);  
					stream_38.add(char_literal72);

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
					// 106:29: -> ^( ANONFN fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:32: ^( ANONFN fncall )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:4: '#' '[' nested_id ']'
					{
					char_literal73=(Token)match(input,25,FOLLOW_25_in_anonfn666);  
					stream_25.add(char_literal73);

					char_literal74=(Token)match(input,37,FOLLOW_37_in_anonfn668);  
					stream_37.add(char_literal74);

					pushFollow(FOLLOW_nested_id_in_anonfn670);
					nested_id75=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id75.getTree());
					char_literal76=(Token)match(input,38,FOLLOW_38_in_anonfn672);  
					stream_38.add(char_literal76);

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
					// 107:26: -> ^( ANONFN nested_id )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:29: ^( ANONFN nested_id )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:1: blockdecl : ( '(' ')' ( ':' TYPEID )? contained_block -> ( TYPEID )? contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block -> ( fnparam )* ( TYPEID )? contained_block );
	public final SneakersParser.blockdecl_return blockdecl() throws RecognitionException {
		SneakersParser.blockdecl_return retval = new SneakersParser.blockdecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal77=null;
		Token char_literal78=null;
		Token char_literal79=null;
		Token TYPEID80=null;
		Token char_literal82=null;
		Token char_literal84=null;
		Token char_literal86=null;
		Token char_literal87=null;
		Token TYPEID88=null;
		ParserRuleReturnScope contained_block81 =null;
		ParserRuleReturnScope fnparam83 =null;
		ParserRuleReturnScope fnparam85 =null;
		ParserRuleReturnScope contained_block89 =null;

		SneakersAST char_literal77_tree=null;
		SneakersAST char_literal78_tree=null;
		SneakersAST char_literal79_tree=null;
		SneakersAST TYPEID80_tree=null;
		SneakersAST char_literal82_tree=null;
		SneakersAST char_literal84_tree=null;
		SneakersAST char_literal86_tree=null;
		SneakersAST char_literal87_tree=null;
		SneakersAST TYPEID88_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_fnparam=new RewriteRuleSubtreeStream(adaptor,"rule fnparam");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:111:2: ( '(' ')' ( ':' TYPEID )? contained_block -> ( TYPEID )? contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block -> ( fnparam )* ( TYPEID )? contained_block )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:111:4: '(' ')' ( ':' TYPEID )? contained_block
					{
					char_literal77=(Token)match(input,26,FOLLOW_26_in_blockdecl691);  
					stream_26.add(char_literal77);

					char_literal78=(Token)match(input,27,FOLLOW_27_in_blockdecl693);  
					stream_27.add(char_literal78);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:111:12: ( ':' TYPEID )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==30) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:111:13: ':' TYPEID
							{
							char_literal79=(Token)match(input,30,FOLLOW_30_in_blockdecl696);  
							stream_30.add(char_literal79);

							TYPEID80=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl698);  
							stream_TYPEID.add(TYPEID80);

							}
							break;

					}

					pushFollow(FOLLOW_contained_block_in_blockdecl702);
					contained_block81=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block81.getTree());
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
					// 111:42: -> ( TYPEID )? contained_block
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:111:45: ( TYPEID )?
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:4: '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block
					{
					char_literal82=(Token)match(input,26,FOLLOW_26_in_blockdecl714);  
					stream_26.add(char_literal82);

					pushFollow(FOLLOW_fnparam_in_blockdecl716);
					fnparam83=fnparam();
					state._fsp--;

					stream_fnparam.add(fnparam83.getTree());
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:16: ( ( ',' )? fnparam )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==ID||LA21_0==28) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:17: ( ',' )? fnparam
							{
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:17: ( ',' )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==28) ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:17: ','
									{
									char_literal84=(Token)match(input,28,FOLLOW_28_in_blockdecl719);  
									stream_28.add(char_literal84);

									}
									break;

							}

							pushFollow(FOLLOW_fnparam_in_blockdecl722);
							fnparam85=fnparam();
							state._fsp--;

							stream_fnparam.add(fnparam85.getTree());
							}
							break;

						default :
							break loop21;
						}
					}

					char_literal86=(Token)match(input,27,FOLLOW_27_in_blockdecl726);  
					stream_27.add(char_literal86);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:36: ( ':' TYPEID )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==30) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:37: ':' TYPEID
							{
							char_literal87=(Token)match(input,30,FOLLOW_30_in_blockdecl729);  
							stream_30.add(char_literal87);

							TYPEID88=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl731);  
							stream_TYPEID.add(TYPEID88);

							}
							break;

					}

					pushFollow(FOLLOW_contained_block_in_blockdecl735);
					contained_block89=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block89.getTree());
					// AST REWRITE
					// elements: TYPEID, contained_block, fnparam
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 112:66: -> ( fnparam )* ( TYPEID )? contained_block
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:69: ( fnparam )*
						while ( stream_fnparam.hasNext() ) {
							adaptor.addChild(root_0, stream_fnparam.nextTree());
						}
						stream_fnparam.reset();

						// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:78: ( TYPEID )?
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:115:1: fndecl : '#' blockdecl -> ^( FNDECL blockdecl ) ;
	public final SneakersParser.fndecl_return fndecl() throws RecognitionException {
		SneakersParser.fndecl_return retval = new SneakersParser.fndecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal90=null;
		ParserRuleReturnScope blockdecl91 =null;

		SneakersAST char_literal90_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:115:8: ( '#' blockdecl -> ^( FNDECL blockdecl ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:115:10: '#' blockdecl
			{
			char_literal90=(Token)match(input,25,FOLLOW_25_in_fndecl755);  
			stream_25.add(char_literal90);

			pushFollow(FOLLOW_blockdecl_in_fndecl757);
			blockdecl91=blockdecl();
			state._fsp--;

			stream_blockdecl.add(blockdecl91.getTree());
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
			// 115:24: -> ^( FNDECL blockdecl )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:115:27: ^( FNDECL blockdecl )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:1: mutdecl : '@' blockdecl -> ^( MUTDECL blockdecl ) ;
	public final SneakersParser.mutdecl_return mutdecl() throws RecognitionException {
		SneakersParser.mutdecl_return retval = new SneakersParser.mutdecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal92=null;
		ParserRuleReturnScope blockdecl93 =null;

		SneakersAST char_literal92_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:9: ( '@' blockdecl -> ^( MUTDECL blockdecl ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:11: '@' blockdecl
			{
			char_literal92=(Token)match(input,36,FOLLOW_36_in_mutdecl775);  
			stream_36.add(char_literal92);

			pushFollow(FOLLOW_blockdecl_in_mutdecl777);
			blockdecl93=blockdecl();
			state._fsp--;

			stream_blockdecl.add(blockdecl93.getTree());
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
			// 118:25: -> ^( MUTDECL blockdecl )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:28: ^( MUTDECL blockdecl )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:1: expr : ( index_expr | dict | fndecl | mutdecl | anonfn | array );
	public final SneakersParser.expr_return expr() throws RecognitionException {
		SneakersParser.expr_return retval = new SneakersParser.expr_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		ParserRuleReturnScope index_expr94 =null;
		ParserRuleReturnScope dict95 =null;
		ParserRuleReturnScope fndecl96 =null;
		ParserRuleReturnScope mutdecl97 =null;
		ParserRuleReturnScope anonfn98 =null;
		ParserRuleReturnScope array99 =null;


		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:6: ( index_expr | dict | fndecl | mutdecl | anonfn | array )
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
			case 46:
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:8: index_expr
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_index_expr_in_expr795);
					index_expr94=index_expr();
					state._fsp--;

					adaptor.addChild(root_0, index_expr94.getTree());

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:4: dict
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_dict_in_expr800);
					dict95=dict();
					state._fsp--;

					adaptor.addChild(root_0, dict95.getTree());

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:123:4: fndecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_fndecl_in_expr805);
					fndecl96=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl96.getTree());

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:124:4: mutdecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_mutdecl_in_expr810);
					mutdecl97=mutdecl();
					state._fsp--;

					adaptor.addChild(root_0, mutdecl97.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:4: anonfn
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_anonfn_in_expr815);
					anonfn98=anonfn();
					state._fsp--;

					adaptor.addChild(root_0, anonfn98.getTree());

					}
					break;
				case 6 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:126:4: array
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_array_in_expr820);
					array99=array();
					state._fsp--;

					adaptor.addChild(root_0, array99.getTree());

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:129:1: standalone_fncall : '(' fncall ')' -> fncall ;
	public final SneakersParser.standalone_fncall_return standalone_fncall() throws RecognitionException {
		SneakersParser.standalone_fncall_return retval = new SneakersParser.standalone_fncall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal100=null;
		Token char_literal102=null;
		ParserRuleReturnScope fncall101 =null;

		SneakersAST char_literal100_tree=null;
		SneakersAST char_literal102_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:130:2: ( '(' fncall ')' -> fncall )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:130:4: '(' fncall ')'
			{
			char_literal100=(Token)match(input,26,FOLLOW_26_in_standalone_fncall831);  
			stream_26.add(char_literal100);

			pushFollow(FOLLOW_fncall_in_standalone_fncall833);
			fncall101=fncall();
			state._fsp--;

			stream_fncall.add(fncall101.getTree());
			char_literal102=(Token)match(input,27,FOLLOW_27_in_standalone_fncall835);  
			stream_27.add(char_literal102);

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
			// 130:19: -> fncall
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:133:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );
	public final SneakersParser.mutcall_return mutcall() throws RecognitionException {
		SneakersParser.mutcall_return retval = new SneakersParser.mutcall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal103=null;
		Token char_literal105=null;
		Token char_literal106=null;
		Token char_literal108=null;
		ParserRuleReturnScope nested_id104 =null;
		ParserRuleReturnScope fncall107 =null;

		SneakersAST char_literal103_tree=null;
		SneakersAST char_literal105_tree=null;
		SneakersAST char_literal106_tree=null;
		SneakersAST char_literal108_tree=null;
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:133:9: ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall )
			int alt25=2;
			alt25 = dfa25.predict(input);
			switch (alt25) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:133:11: '<' nested_id '>'
					{
					char_literal103=(Token)match(input,32,FOLLOW_32_in_mutcall849);  
					stream_32.add(char_literal103);

					pushFollow(FOLLOW_nested_id_in_mutcall851);
					nested_id104=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id104.getTree());
					char_literal105=(Token)match(input,35,FOLLOW_35_in_mutcall853);  
					stream_35.add(char_literal105);

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
					// 133:29: -> nested_id
					{
						adaptor.addChild(root_0, stream_nested_id.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:4: '<' fncall '>'
					{
					char_literal106=(Token)match(input,32,FOLLOW_32_in_mutcall862);  
					stream_32.add(char_literal106);

					pushFollow(FOLLOW_fncall_in_mutcall864);
					fncall107=fncall();
					state._fsp--;

					stream_fncall.add(fncall107.getTree());
					char_literal108=(Token)match(input,35,FOLLOW_35_in_mutcall866);  
					stream_35.add(char_literal108);

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
					// 134:19: -> fncall
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:137:1: index_expr : ( KEYWORD | INT | STRING | nested_id | standalone_fncall );
	public final SneakersParser.index_expr_return index_expr() throws RecognitionException {
		SneakersParser.index_expr_return retval = new SneakersParser.index_expr_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token KEYWORD109=null;
		Token INT110=null;
		Token STRING111=null;
		ParserRuleReturnScope nested_id112 =null;
		ParserRuleReturnScope standalone_fncall113 =null;

		SneakersAST KEYWORD109_tree=null;
		SneakersAST INT110_tree=null;
		SneakersAST STRING111_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:138:2: ( KEYWORD | INT | STRING | nested_id | standalone_fncall )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:138:4: KEYWORD
					{
					root_0 = (SneakersAST)adaptor.nil();


					KEYWORD109=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_index_expr881); 
					KEYWORD109_tree = (SneakersAST)adaptor.create(KEYWORD109);
					adaptor.addChild(root_0, KEYWORD109_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:139:4: INT
					{
					root_0 = (SneakersAST)adaptor.nil();


					INT110=(Token)match(input,INT,FOLLOW_INT_in_index_expr886); 
					INT110_tree = (SneakersAST)adaptor.create(INT110);
					adaptor.addChild(root_0, INT110_tree);

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:140:4: STRING
					{
					root_0 = (SneakersAST)adaptor.nil();


					STRING111=(Token)match(input,STRING,FOLLOW_STRING_in_index_expr891); 
					STRING111_tree = (SneakersAST)adaptor.create(STRING111);
					adaptor.addChild(root_0, STRING111_tree);

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:141:4: nested_id
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_nested_id_in_index_expr896);
					nested_id112=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id112.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:142:4: standalone_fncall
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_standalone_fncall_in_index_expr901);
					standalone_fncall113=standalone_fncall();
					state._fsp--;

					adaptor.addChild(root_0, standalone_fncall113.getTree());

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:145:1: dict_pair : index_expr '=>' expr -> index_expr expr ;
	public final SneakersParser.dict_pair_return dict_pair() throws RecognitionException {
		SneakersParser.dict_pair_return retval = new SneakersParser.dict_pair_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token string_literal115=null;
		ParserRuleReturnScope index_expr114 =null;
		ParserRuleReturnScope expr116 =null;

		SneakersAST string_literal115_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:146:2: ( index_expr '=>' expr -> index_expr expr )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:146:4: index_expr '=>' expr
			{
			pushFollow(FOLLOW_index_expr_in_dict_pair913);
			index_expr114=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr114.getTree());
			string_literal115=(Token)match(input,34,FOLLOW_34_in_dict_pair915);  
			stream_34.add(string_literal115);

			pushFollow(FOLLOW_expr_in_dict_pair917);
			expr116=expr();
			state._fsp--;

			stream_expr.add(expr116.getTree());
			// AST REWRITE
			// elements: index_expr, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (SneakersAST)adaptor.nil();
			// 146:25: -> index_expr expr
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:149:1: dict : '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) ;
	public final SneakersParser.dict_return dict() throws RecognitionException {
		SneakersParser.dict_return retval = new SneakersParser.dict_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal117=null;
		Token char_literal119=null;
		Token char_literal121=null;
		ParserRuleReturnScope dict_pair118 =null;
		ParserRuleReturnScope dict_pair120 =null;

		SneakersAST char_literal117_tree=null;
		SneakersAST char_literal119_tree=null;
		SneakersAST char_literal121_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_dict_pair=new RewriteRuleSubtreeStream(adaptor,"rule dict_pair");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:149:6: ( '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:149:8: '{' ( dict_pair )? ( ',' dict_pair )* '}'
			{
			char_literal117=(Token)match(input,46,FOLLOW_46_in_dict933);  
			stream_46.add(char_literal117);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:149:12: ( dict_pair )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==ANONVAR||(LA27_0 >= ID && LA27_0 <= KEYWORD)||LA27_0==MUTID||(LA27_0 >= STRING && LA27_0 <= TYPEID)||LA27_0==26) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:149:13: dict_pair
					{
					pushFollow(FOLLOW_dict_pair_in_dict936);
					dict_pair118=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair118.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:149:25: ( ',' dict_pair )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==28) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:149:26: ',' dict_pair
					{
					char_literal119=(Token)match(input,28,FOLLOW_28_in_dict941);  
					stream_28.add(char_literal119);

					pushFollow(FOLLOW_dict_pair_in_dict943);
					dict_pair120=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair120.getTree());
					}
					break;

				default :
					break loop28;
				}
			}

			char_literal121=(Token)match(input,47,FOLLOW_47_in_dict947);  
			stream_47.add(char_literal121);

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
			// 149:46: -> ^( DICT ( dict_pair )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:149:49: ^( DICT ( dict_pair )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(DICT, "DICT"), root_1);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:149:56: ( dict_pair )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:152:1: contained_block : '[' block ']' -> block ;
	public final SneakersParser.contained_block_return contained_block() throws RecognitionException {
		SneakersParser.contained_block_return retval = new SneakersParser.contained_block_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal122=null;
		Token char_literal124=null;
		ParserRuleReturnScope block123 =null;

		SneakersAST char_literal122_tree=null;
		SneakersAST char_literal124_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:153:2: ( '[' block ']' -> block )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:153:4: '[' block ']'
			{
			char_literal122=(Token)match(input,37,FOLLOW_37_in_contained_block969);  
			stream_37.add(char_literal122);

			pushFollow(FOLLOW_block_in_contained_block971);
			block123=block();
			state._fsp--;

			stream_block.add(block123.getTree());
			char_literal124=(Token)match(input,38,FOLLOW_38_in_contained_block973);  
			stream_38.add(char_literal124);

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
			// 153:18: -> block
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:156:1: array : '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) ;
	public final SneakersParser.array_return array() throws RecognitionException {
		SneakersParser.array_return retval = new SneakersParser.array_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal125=null;
		Token char_literal127=null;
		Token char_literal129=null;
		ParserRuleReturnScope expr126 =null;
		ParserRuleReturnScope expr128 =null;

		SneakersAST char_literal125_tree=null;
		SneakersAST char_literal127_tree=null;
		SneakersAST char_literal129_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:156:7: ( '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:156:9: '[' ( expr )? ( ',' expr )* ']'
			{
			char_literal125=(Token)match(input,37,FOLLOW_37_in_array987);  
			stream_37.add(char_literal125);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:156:13: ( expr )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ANONVAR||(LA29_0 >= ID && LA29_0 <= KEYWORD)||LA29_0==MUTID||(LA29_0 >= STRING && LA29_0 <= TYPEID)||(LA29_0 >= 25 && LA29_0 <= 26)||(LA29_0 >= 36 && LA29_0 <= 37)||LA29_0==46) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:156:13: expr
					{
					pushFollow(FOLLOW_expr_in_array989);
					expr126=expr();
					state._fsp--;

					stream_expr.add(expr126.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:156:19: ( ',' expr )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==28) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:156:20: ',' expr
					{
					char_literal127=(Token)match(input,28,FOLLOW_28_in_array993);  
					stream_28.add(char_literal127);

					pushFollow(FOLLOW_expr_in_array995);
					expr128=expr();
					state._fsp--;

					stream_expr.add(expr128.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			char_literal129=(Token)match(input,38,FOLLOW_38_in_array999);  
			stream_38.add(char_literal129);

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
			// 156:35: -> ^( ARRAY ( expr )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:156:38: ^( ARRAY ( expr )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(ARRAY, "ARRAY"), root_1);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:156:46: ( expr )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:175:1: any_id : ( ID | TYPEID | MUTID );
	public final SneakersParser.any_id_return any_id() throws RecognitionException {
		SneakersParser.any_id_return retval = new SneakersParser.any_id_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token set130=null;

		SneakersAST set130_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:176:2: ( ID | TYPEID | MUTID )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:
			{
			root_0 = (SneakersAST)adaptor.nil();


			set130=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==MUTID||input.LA(1)==TYPEID ) {
				input.consume();
				adaptor.addChild(root_0, (SneakersAST)adaptor.create(set130));
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
		"\15\uffff";
	static final String DFA3_eofS =
		"\2\uffff\2\4\2\uffff\1\7\1\uffff\2\7\1\uffff\2\4";
	static final String DFA3_minS =
		"\1\55\3\5\1\uffff\1\15\1\5\1\uffff\2\5\1\15\2\5";
	static final String DFA3_maxS =
		"\1\55\3\56\1\uffff\1\27\1\56\1\uffff\2\56\1\27\2\56";
	static final String DFA3_acceptS =
		"\4\uffff\1\2\2\uffff\1\1\5\uffff";
	static final String DFA3_specialS =
		"\15\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1",
			"\1\2\7\uffff\1\3\2\4\1\uffff\1\3\4\uffff\1\4\1\3\1\uffff\2\4\11\uffff"+
			"\2\4\10\uffff\1\4",
			"\1\7\7\uffff\1\6\2\7\1\uffff\1\11\4\uffff\1\7\1\10\1\uffff\2\7\2\uffff"+
			"\1\5\1\uffff\2\4\3\uffff\2\7\5\uffff\3\4\1\7",
			"\1\7\7\uffff\1\6\2\7\1\uffff\1\11\4\uffff\1\7\1\10\1\uffff\2\7\2\uffff"+
			"\1\12\1\uffff\2\4\3\uffff\2\7\5\uffff\3\4\1\7",
			"",
			"\1\13\3\uffff\1\13\5\uffff\1\13",
			"\1\7\7\uffff\3\7\1\uffff\1\7\4\uffff\2\7\1\uffff\2\7\1\uffff\5\7\1\4"+
			"\2\uffff\2\7\5\uffff\4\7",
			"",
			"\1\7\7\uffff\3\7\1\uffff\1\7\4\uffff\2\7\1\uffff\2\7\1\uffff\2\7\1\uffff"+
			"\2\7\1\4\2\uffff\2\7\5\uffff\4\7",
			"\1\7\7\uffff\3\7\1\uffff\1\7\4\uffff\2\7\1\uffff\2\7\1\uffff\2\7\1\uffff"+
			"\2\7\1\4\2\uffff\2\7\5\uffff\4\7",
			"\1\14\3\uffff\1\14\5\uffff\1\14",
			"\1\7\7\uffff\1\6\2\7\1\uffff\1\11\4\uffff\1\7\1\10\1\uffff\2\7\2\uffff"+
			"\1\5\1\uffff\2\4\3\uffff\2\7\5\uffff\3\4\1\7",
			"\1\7\7\uffff\1\6\2\7\1\uffff\1\11\4\uffff\1\7\1\10\1\uffff\2\7\2\uffff"+
			"\1\12\1\uffff\2\4\3\uffff\2\7\5\uffff\3\4\1\7"
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
		"\24\uffff";
	static final String DFA6_eofS =
		"\6\uffff\1\7\1\uffff\2\7\1\uffff\3\16\4\uffff\2\7";
	static final String DFA6_minS =
		"\1\15\2\41\2\5\1\uffff\1\5\1\uffff\2\5\1\15\3\5\1\uffff\2\15\1\uffff\2"+
		"\5";
	static final String DFA6_maxS =
		"\1\27\2\41\2\56\1\uffff\1\56\1\uffff\2\56\1\52\3\56\1\uffff\2\27\1\uffff"+
		"\2\56";
	static final String DFA6_acceptS =
		"\5\uffff\1\1\1\uffff\1\3\6\uffff\1\4\2\uffff\1\2\2\uffff";
	static final String DFA6_specialS =
		"\24\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\2\3\uffff\1\2\5\uffff\1\1",
			"\1\3",
			"\1\4",
			"\1\10\7\uffff\1\11\2\7\1\uffff\1\11\4\uffff\1\7\1\6\1\uffff\2\7\11\uffff"+
			"\2\7\1\uffff\1\5\6\uffff\1\7",
			"\1\10\7\uffff\1\11\2\7\1\uffff\1\11\4\uffff\1\7\1\11\1\uffff\2\7\11"+
			"\uffff\2\7\10\uffff\1\7",
			"",
			"\1\16\7\uffff\1\14\2\16\1\uffff\1\15\4\uffff\1\16\1\13\1\uffff\2\16"+
			"\2\uffff\1\12\1\uffff\2\7\3\uffff\2\16\5\uffff\3\7\1\16",
			"",
			"\1\16\7\uffff\1\14\2\16\1\uffff\1\15\4\uffff\1\16\1\13\1\uffff\2\16"+
			"\2\uffff\1\17\1\uffff\2\7\3\uffff\2\16\5\uffff\3\7\1\16",
			"\1\16\7\uffff\1\14\2\16\1\uffff\1\15\4\uffff\1\16\1\13\1\uffff\2\16"+
			"\2\uffff\1\20\1\uffff\2\7\3\uffff\2\16\5\uffff\3\7\1\16",
			"\1\22\3\uffff\1\22\5\uffff\1\22\22\uffff\1\21",
			"\1\16\7\uffff\3\16\1\uffff\1\16\4\uffff\2\16\1\uffff\2\16\1\uffff\2"+
			"\16\1\uffff\2\16\1\7\2\uffff\2\16\5\uffff\4\16",
			"\1\16\7\uffff\3\16\1\uffff\1\16\4\uffff\2\16\1\uffff\2\16\1\uffff\5"+
			"\16\1\7\2\uffff\2\16\5\uffff\4\16",
			"\1\16\7\uffff\3\16\1\uffff\1\16\4\uffff\2\16\1\uffff\2\16\1\uffff\2"+
			"\16\1\uffff\2\16\1\7\2\uffff\2\16\5\uffff\4\16",
			"",
			"\1\23\3\uffff\1\23\5\uffff\1\23",
			"\1\22\3\uffff\1\22\5\uffff\1\22",
			"",
			"\1\16\7\uffff\1\14\2\16\1\uffff\1\15\4\uffff\1\16\1\13\1\uffff\2\16"+
			"\2\uffff\1\20\1\uffff\2\7\3\uffff\2\16\5\uffff\3\7\1\16",
			"\1\16\7\uffff\1\14\2\16\1\uffff\1\15\4\uffff\1\16\1\13\1\uffff\2\16"+
			"\2\uffff\1\17\1\uffff\2\7\3\uffff\2\16\5\uffff\3\7\1\16"
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
			return "65:1: assignment : ( TYPEID '=' 'class' expr -> ^( 'class' TYPEID expr ) |newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' expr -> ^( 'extend' $newclass $oldclass expr ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );";
		}
	}

	static final String DFA18_eotS =
		"\13\uffff";
	static final String DFA18_eofS =
		"\13\uffff";
	static final String DFA18_minS =
		"\1\31\1\45\3\5\1\15\2\uffff\1\15\2\5";
	static final String DFA18_maxS =
		"\1\31\1\45\1\27\2\56\1\27\2\uffff\1\27\2\56";
	static final String DFA18_acceptS =
		"\6\uffff\1\1\1\2\3\uffff";
	static final String DFA18_specialS =
		"\13\uffff}>";
	static final String[] DFA18_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\7\uffff\1\4\3\uffff\1\4\5\uffff\1\4",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\5\6\uffff"+
			"\2\6\1\7\7\uffff\1\6",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\10\6"+
			"\uffff\2\6\1\7\7\uffff\1\6",
			"\1\11\3\uffff\1\11\5\uffff\1\11",
			"",
			"",
			"\1\12\3\uffff\1\12\5\uffff\1\12",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\5\6\uffff"+
			"\2\6\1\7\7\uffff\1\6",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\10\6"+
			"\uffff\2\6\1\7\7\uffff\1\6"
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
			return "106:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );";
		}
	}

	static final String DFA25_eotS =
		"\12\uffff";
	static final String DFA25_eofS =
		"\12\uffff";
	static final String DFA25_minS =
		"\1\40\3\5\1\15\2\uffff\1\15\2\5";
	static final String DFA25_maxS =
		"\1\40\1\27\2\56\1\27\2\uffff\1\27\2\56";
	static final String DFA25_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA25_specialS =
		"\12\uffff}>";
	static final String[] DFA25_transitionS = {
			"\1\1",
			"\1\2\7\uffff\1\3\3\uffff\1\3\5\uffff\1\3",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\4\5\uffff"+
			"\1\5\2\6\10\uffff\1\6",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\7\5\uffff"+
			"\1\5\2\6\10\uffff\1\6",
			"\1\10\3\uffff\1\10\5\uffff\1\10",
			"",
			"",
			"\1\11\3\uffff\1\11\5\uffff\1\11",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\4\5\uffff"+
			"\1\5\2\6\10\uffff\1\6",
			"\1\6\7\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\7\5\uffff"+
			"\1\5\2\6\10\uffff\1\6"
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
			return "133:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );";
		}
	}

	public static final BitSet FOLLOW_block_in_prog121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_block133 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_block135 = new BitSet(new long[]{0x0000380100822002L});
	public static final BitSet FOLLOW_assignment_in_stat154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_stat164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutcall_in_stat169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_stat174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_returnstat185 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_fncall_in_returnstat187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_returnstat200 = new BitSet(new long[]{0x0000403006C2E020L});
	public static final BitSet FOLLOW_expr_in_returnstat202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_ifstat220 = new BitSet(new long[]{0x0000403006C2E020L});
	public static final BitSet FOLLOW_expr_in_ifstat224 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat228 = new BitSet(new long[]{0x0000030000000002L});
	public static final BitSet FOLLOW_41_in_ifstat234 = new BitSet(new long[]{0x0000403006C2E020L});
	public static final BitSet FOLLOW_expr_in_ifstat238 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat242 = new BitSet(new long[]{0x0000030000000002L});
	public static final BitSet FOLLOW_40_in_ifstat250 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_assignment292 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_assignment294 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_assignment296 = new BitSet(new long[]{0x0000403006C2E020L});
	public static final BitSet FOLLOW_expr_in_assignment298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_assignment315 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_assignment317 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TYPEID_in_assignment321 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_assignment323 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_assignment325 = new BitSet(new long[]{0x0000403006C2E020L});
	public static final BitSet FOLLOW_expr_in_assignment327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment346 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_assignment348 = new BitSet(new long[]{0x0000403006C2E020L});
	public static final BitSet FOLLOW_expr_in_assignment350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment365 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_assignment367 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_fncall_in_assignment369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_defable390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_defable395 = new BitSet(new long[]{0x0000380100822000L});
	public static final BitSet FOLLOW_stat_in_defable397 = new BitSet(new long[]{0x0000380100822002L});
	public static final BitSet FOLLOW_KEYWORD_in_defdecl408 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_defdecl410 = new BitSet(new long[]{0x0000000002800000L});
	public static final BitSet FOLLOW_defable_in_defdecl412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANONVAR_in_nested_id425 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_nested_id428 = new BitSet(new long[]{0x0000000000822000L});
	public static final BitSet FOLLOW_any_id_in_nested_id430 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_any_id_in_nested_id444 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_nested_id447 = new BitSet(new long[]{0x0000000000822000L});
	public static final BitSet FOLLOW_any_id_in_nested_id449 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_nested_id_in_fncall466 = new BitSet(new long[]{0x0000403006C2E020L});
	public static final BitSet FOLLOW_param_in_fncall468 = new BitSet(new long[]{0x0000403016C2E022L});
	public static final BitSet FOLLOW_28_in_fncall471 = new BitSet(new long[]{0x0000403006C2E020L});
	public static final BitSet FOLLOW_param_in_fncall474 = new BitSet(new long[]{0x0000403016C2E022L});
	public static final BitSet FOLLOW_ID_in_param497 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_param499 = new BitSet(new long[]{0x0000403006C2E020L});
	public static final BitSet FOLLOW_expr_in_param501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_param516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_blockparamtype536 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype538 = new BitSet(new long[]{0x0000000018000000L});
	public static final BitSet FOLLOW_28_in_blockparamtype541 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype543 = new BitSet(new long[]{0x0000000018000000L});
	public static final BitSet FOLLOW_27_in_blockparamtype547 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_blockparamtype549 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_blockparamtype561 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_blockparamtype563 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_blockparamtype565 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_paramtype587 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_blockparamtype_in_paramtype589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_paramtype602 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_blockparamtype_in_paramtype604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fnparam623 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_fnparam625 = new BitSet(new long[]{0x0000001002800000L});
	public static final BitSet FOLLOW_paramtype_in_fnparam627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_anonfn647 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_anonfn649 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_fncall_in_anonfn651 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_anonfn653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_anonfn666 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_anonfn668 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_nested_id_in_anonfn670 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_anonfn672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_blockdecl691 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_blockdecl693 = new BitSet(new long[]{0x0000002040000000L});
	public static final BitSet FOLLOW_30_in_blockdecl696 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl698 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_blockdecl714 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl716 = new BitSet(new long[]{0x0000000018002000L});
	public static final BitSet FOLLOW_28_in_blockdecl719 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl722 = new BitSet(new long[]{0x0000000018002000L});
	public static final BitSet FOLLOW_27_in_blockdecl726 = new BitSet(new long[]{0x0000002040000000L});
	public static final BitSet FOLLOW_30_in_blockdecl729 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl731 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_fndecl755 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_blockdecl_in_fndecl757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_mutdecl775 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_blockdecl_in_mutdecl777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_expr795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_expr805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutdecl_in_expr810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anonfn_in_expr815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_expr820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_standalone_fncall831 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_fncall_in_standalone_fncall833 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_standalone_fncall835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_mutcall849 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_nested_id_in_mutcall851 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_mutcall853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_mutcall862 = new BitSet(new long[]{0x0000000000822020L});
	public static final BitSet FOLLOW_fncall_in_mutcall864 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_mutcall866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_index_expr881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_index_expr886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_index_expr891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_index_expr896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standalone_fncall_in_index_expr901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_dict_pair913 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_dict_pair915 = new BitSet(new long[]{0x0000403006C2E020L});
	public static final BitSet FOLLOW_expr_in_dict_pair917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_dict933 = new BitSet(new long[]{0x0000800014C2E020L});
	public static final BitSet FOLLOW_dict_pair_in_dict936 = new BitSet(new long[]{0x0000800010000000L});
	public static final BitSet FOLLOW_28_in_dict941 = new BitSet(new long[]{0x0000000004C2E020L});
	public static final BitSet FOLLOW_dict_pair_in_dict943 = new BitSet(new long[]{0x0000800010000000L});
	public static final BitSet FOLLOW_47_in_dict947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_contained_block969 = new BitSet(new long[]{0x0000380100822000L});
	public static final BitSet FOLLOW_block_in_contained_block971 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_contained_block973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_array987 = new BitSet(new long[]{0x0000407016C2E020L});
	public static final BitSet FOLLOW_expr_in_array989 = new BitSet(new long[]{0x0000004010000000L});
	public static final BitSet FOLLOW_28_in_array993 = new BitSet(new long[]{0x0000403006C2E020L});
	public static final BitSet FOLLOW_expr_in_array995 = new BitSet(new long[]{0x0000004010000000L});
	public static final BitSet FOLLOW_38_in_array999 = new BitSet(new long[]{0x0000000000000002L});
}
