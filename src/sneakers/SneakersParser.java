// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-27 11:07:40
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
		"BLOCK", "BLOCKDECL", "DICT", "FIELDDEF", "FNCALL", "FNDECL", "FNPARAM", 
		"ID", "INT", "KEYWORD", "MUTDECL", "MUTID", "PARAM", "PARAMTYPEFN", "PARAMTYPEMUT", 
		"RET", "STRING", "TYPEID", "WS", "'#'", "'('", "')'", "','", "'.'", "':'", 
		"';'", "'<'", "'='", "'=>'", "'>'", "'@'", "'['", "']'", "'class'", "'else'", 
		"'elseif'", "'extend'", "'if'", "'pass'", "'return'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__48=48;
	public static final int ANONFN=4;
	public static final int ANONVAR=5;
	public static final int ARRAY=6;
	public static final int BLOCK=7;
	public static final int BLOCKDECL=8;
	public static final int DICT=9;
	public static final int FIELDDEF=10;
	public static final int FNCALL=11;
	public static final int FNDECL=12;
	public static final int FNPARAM=13;
	public static final int ID=14;
	public static final int INT=15;
	public static final int KEYWORD=16;
	public static final int MUTDECL=17;
	public static final int MUTID=18;
	public static final int PARAM=19;
	public static final int PARAMTYPEFN=20;
	public static final int PARAMTYPEMUT=21;
	public static final int RET=22;
	public static final int STRING=23;
	public static final int TYPEID=24;
	public static final int WS=25;

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:44:1: prog : block ;
	public final SneakersParser.prog_return prog() throws RecognitionException {
		SneakersParser.prog_return retval = new SneakersParser.prog_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		ParserRuleReturnScope block1 =null;


		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:44:6: ( block )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:44:8: block
			{
			root_0 = (SneakersAST)adaptor.nil();


			pushFollow(FOLLOW_block_in_prog125);
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:47:1: block : ( stat ';' )+ -> ^( BLOCK ( stat )+ ) ;
	public final SneakersParser.block_return block() throws RecognitionException {
		SneakersParser.block_return retval = new SneakersParser.block_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal3=null;
		ParserRuleReturnScope stat2 =null;

		SneakersAST char_literal3_tree=null;
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:47:8: ( ( stat ';' )+ -> ^( BLOCK ( stat )+ ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:47:10: ( stat ';' )+
			{
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:47:10: ( stat ';' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==MUTID||LA1_0==TYPEID||LA1_0==33||(LA1_0 >= 44 && LA1_0 <= 46)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:47:11: stat ';'
					{
					pushFollow(FOLLOW_stat_in_block137);
					stat2=stat();
					state._fsp--;

					stream_stat.add(stat2.getTree());
					char_literal3=(Token)match(input,32,FOLLOW_32_in_block139);  
					stream_32.add(char_literal3);

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
			// 47:22: -> ^( BLOCK ( stat )+ )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:47:25: ^( BLOCK ( stat )+ )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:1: stat : ( assignment | ifstat | returnstat | mutcall | 'pass' );
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:6: ( assignment | ifstat | returnstat | mutcall | 'pass' )
			int alt2=5;
			switch ( input.LA(1) ) {
			case ID:
			case MUTID:
			case TYPEID:
				{
				alt2=1;
				}
				break;
			case 44:
				{
				alt2=2;
				}
				break;
			case 46:
				{
				alt2=3;
				}
				break;
			case 33:
				{
				alt2=4;
				}
				break;
			case 45:
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:49:8: assignment
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_stat158);
					assignment4=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment4.getTree());

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:50:4: ifstat
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_ifstat_in_stat163);
					ifstat5=ifstat();
					state._fsp--;

					adaptor.addChild(root_0, ifstat5.getTree());

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:4: returnstat
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_returnstat_in_stat168);
					returnstat6=returnstat();
					state._fsp--;

					adaptor.addChild(root_0, returnstat6.getTree());

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:52:4: mutcall
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_mutcall_in_stat173);
					mutcall7=mutcall();
					state._fsp--;

					adaptor.addChild(root_0, mutcall7.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:4: 'pass'
					{
					root_0 = (SneakersAST)adaptor.nil();


					string_literal8=(Token)match(input,45,FOLLOW_45_in_stat178); 
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:56:1: returnstat : ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) );
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
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:2: ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) )
			int alt3=2;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:4: 'return' fncall
					{
					string_literal9=(Token)match(input,46,FOLLOW_46_in_returnstat189);  
					stream_46.add(string_literal9);

					pushFollow(FOLLOW_fncall_in_returnstat191);
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
					// 57:20: -> ^( RET fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:23: ^( RET fncall )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:4: 'return' expr
					{
					string_literal11=(Token)match(input,46,FOLLOW_46_in_returnstat204);  
					stream_46.add(string_literal11);

					pushFollow(FOLLOW_expr_in_returnstat206);
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
					// 58:18: -> ^( RET expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:21: ^( RET expr )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:1: ifstat : 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) ;
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
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:8: ( 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:10: 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )?
			{
			string_literal13=(Token)match(input,44,FOLLOW_44_in_ifstat224);  
			stream_44.add(string_literal13);

			pushFollow(FOLLOW_expr_in_ifstat228);
			ifexpr=expr();
			state._fsp--;

			stream_expr.add(ifexpr.getTree());
			pushFollow(FOLLOW_contained_block_in_ifstat232);
			ifblock=contained_block();
			state._fsp--;

			stream_contained_block.add(ifblock.getTree());
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:3: ( 'elseif' elifexpr+= expr elifblock+= contained_block )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==42) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:4: 'elseif' elifexpr+= expr elifblock+= contained_block
					{
					string_literal14=(Token)match(input,42,FOLLOW_42_in_ifstat238);  
					stream_42.add(string_literal14);

					pushFollow(FOLLOW_expr_in_ifstat242);
					elifexpr=expr();
					state._fsp--;

					stream_expr.add(elifexpr.getTree());
					if (list_elifexpr==null) list_elifexpr=new ArrayList<Object>();
					list_elifexpr.add(elifexpr.getTree());
					pushFollow(FOLLOW_contained_block_in_ifstat246);
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

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:3: ( 'else' elseblock= contained_block )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==41) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:4: 'else' elseblock= contained_block
					{
					string_literal15=(Token)match(input,41,FOLLOW_41_in_ifstat254);  
					stream_41.add(string_literal15);

					pushFollow(FOLLOW_contained_block_in_ifstat258);
					elseblock=contained_block();
					state._fsp--;

					stream_contained_block.add(elseblock.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: elifexpr, 44, elseblock, ifexpr, elifblock, ifblock
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
			// 64:3: -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:6: ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot(stream_44.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ifexpr.nextTree());
				adaptor.addChild(root_1, stream_ifblock.nextTree());
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:30: ( $elifexpr $elifblock)*
				while ( stream_elifexpr.hasNext()||stream_elifblock.hasNext() ) {
					adaptor.addChild(root_1, stream_elifexpr.nextTree());
					adaptor.addChild(root_1, stream_elifblock.nextTree());
				}
				stream_elifexpr.reset();
				stream_elifblock.reset();

				// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:55: ( $elseblock)?
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


	public static class classdef_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "classdef"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:1: classdef : '{' ( fielddef )? ( ',' fielddef )* '}' -> ( fielddef )* ;
	public final SneakersParser.classdef_return classdef() throws RecognitionException {
		SneakersParser.classdef_return retval = new SneakersParser.classdef_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal16=null;
		Token char_literal18=null;
		Token char_literal20=null;
		ParserRuleReturnScope fielddef17 =null;
		ParserRuleReturnScope fielddef19 =null;

		SneakersAST char_literal16_tree=null;
		SneakersAST char_literal18_tree=null;
		SneakersAST char_literal20_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_fielddef=new RewriteRuleSubtreeStream(adaptor,"rule fielddef");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:9: ( '{' ( fielddef )? ( ',' fielddef )* '}' -> ( fielddef )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:11: '{' ( fielddef )? ( ',' fielddef )* '}'
			{
			char_literal16=(Token)match(input,47,FOLLOW_47_in_classdef294);  
			stream_47.add(char_literal16);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:15: ( fielddef )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==KEYWORD) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:16: fielddef
					{
					pushFollow(FOLLOW_fielddef_in_classdef297);
					fielddef17=fielddef();
					state._fsp--;

					stream_fielddef.add(fielddef17.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:27: ( ',' fielddef )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==29) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:28: ',' fielddef
					{
					char_literal18=(Token)match(input,29,FOLLOW_29_in_classdef302);  
					stream_29.add(char_literal18);

					pushFollow(FOLLOW_fielddef_in_classdef304);
					fielddef19=fielddef();
					state._fsp--;

					stream_fielddef.add(fielddef19.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

			char_literal20=(Token)match(input,48,FOLLOW_48_in_classdef308);  
			stream_48.add(char_literal20);

			// AST REWRITE
			// elements: fielddef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (SneakersAST)adaptor.nil();
			// 66:47: -> ( fielddef )*
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:50: ( fielddef )*
				while ( stream_fielddef.hasNext() ) {
					adaptor.addChild(root_0, stream_fielddef.nextTree());
				}
				stream_fielddef.reset();

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
	// $ANTLR end "classdef"


	public static class assignment_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:1: assignment : ( TYPEID '=' 'class' classdef -> ^( 'class' TYPEID classdef ) |newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' classdef -> ^( 'extend' $newclass $oldclass classdef ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );
	public final SneakersParser.assignment_return assignment() throws RecognitionException {
		SneakersParser.assignment_return retval = new SneakersParser.assignment_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token newclass=null;
		Token oldclass=null;
		Token TYPEID21=null;
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

		SneakersAST newclass_tree=null;
		SneakersAST oldclass_tree=null;
		SneakersAST TYPEID21_tree=null;
		SneakersAST char_literal22_tree=null;
		SneakersAST string_literal23_tree=null;
		SneakersAST char_literal25_tree=null;
		SneakersAST char_literal26_tree=null;
		SneakersAST string_literal27_tree=null;
		SneakersAST char_literal30_tree=null;
		SneakersAST char_literal33_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleSubtreeStream stream_classdef=new RewriteRuleSubtreeStream(adaptor,"rule classdef");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:2: ( TYPEID '=' 'class' classdef -> ^( 'class' TYPEID classdef ) |newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' classdef -> ^( 'extend' $newclass $oldclass classdef ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) )
			int alt8=4;
			alt8 = dfa8.predict(input);
			switch (alt8) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:4: TYPEID '=' 'class' classdef
					{
					TYPEID21=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_assignment324);  
					stream_TYPEID.add(TYPEID21);

					char_literal22=(Token)match(input,34,FOLLOW_34_in_assignment326);  
					stream_34.add(char_literal22);

					string_literal23=(Token)match(input,40,FOLLOW_40_in_assignment328);  
					stream_40.add(string_literal23);

					pushFollow(FOLLOW_classdef_in_assignment330);
					classdef24=classdef();
					state._fsp--;

					stream_classdef.add(classdef24.getTree());
					// AST REWRITE
					// elements: classdef, 40, TYPEID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 70:32: -> ^( 'class' TYPEID classdef )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:35: ^( 'class' TYPEID classdef )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_40.nextNode(), root_1);
						adaptor.addChild(root_1, stream_TYPEID.nextNode());
						adaptor.addChild(root_1, stream_classdef.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:71:4: newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' classdef
					{
					newclass=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_assignment347);  
					stream_TYPEID.add(newclass);

					char_literal25=(Token)match(input,34,FOLLOW_34_in_assignment349);  
					stream_34.add(char_literal25);

					oldclass=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_assignment353);  
					stream_TYPEID.add(oldclass);

					char_literal26=(Token)match(input,30,FOLLOW_30_in_assignment355);  
					stream_30.add(char_literal26);

					string_literal27=(Token)match(input,43,FOLLOW_43_in_assignment357);  
					stream_43.add(string_literal27);

					pushFollow(FOLLOW_classdef_in_assignment359);
					classdef28=classdef();
					state._fsp--;

					stream_classdef.add(classdef28.getTree());
					// AST REWRITE
					// elements: oldclass, classdef, 43, newclass
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
					// 71:62: -> ^( 'extend' $newclass $oldclass classdef )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:71:65: ^( 'extend' $newclass $oldclass classdef )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_43.nextNode(), root_1);
						adaptor.addChild(root_1, stream_newclass.nextNode());
						adaptor.addChild(root_1, stream_oldclass.nextNode());
						adaptor.addChild(root_1, stream_classdef.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:4: any_id '=' expr
					{
					pushFollow(FOLLOW_any_id_in_assignment378);
					any_id29=any_id();
					state._fsp--;

					stream_any_id.add(any_id29.getTree());
					char_literal30=(Token)match(input,34,FOLLOW_34_in_assignment380);  
					stream_34.add(char_literal30);

					pushFollow(FOLLOW_expr_in_assignment382);
					expr31=expr();
					state._fsp--;

					stream_expr.add(expr31.getTree());
					// AST REWRITE
					// elements: 34, any_id, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 72:20: -> ^( '=' any_id expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:23: ^( '=' any_id expr )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_34.nextNode(), root_1);
						adaptor.addChild(root_1, stream_any_id.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:4: any_id '=' fncall
					{
					pushFollow(FOLLOW_any_id_in_assignment397);
					any_id32=any_id();
					state._fsp--;

					stream_any_id.add(any_id32.getTree());
					char_literal33=(Token)match(input,34,FOLLOW_34_in_assignment399);  
					stream_34.add(char_literal33);

					pushFollow(FOLLOW_fncall_in_assignment401);
					fncall34=fncall();
					state._fsp--;

					stream_fncall.add(fncall34.getTree());
					// AST REWRITE
					// elements: any_id, fncall, 34
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 73:22: -> ^( '=' any_id fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:25: ^( '=' any_id fncall )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_34.nextNode(), root_1);
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:1: defable : ( paramtype | fndecl | mutdecl );
	public final SneakersParser.defable_return defable() throws RecognitionException {
		SneakersParser.defable_return retval = new SneakersParser.defable_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		ParserRuleReturnScope paramtype35 =null;
		ParserRuleReturnScope fndecl36 =null;
		ParserRuleReturnScope mutdecl37 =null;


		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:9: ( paramtype | fndecl | mutdecl )
			int alt9=3;
			switch ( input.LA(1) ) {
			case TYPEID:
				{
				alt9=1;
				}
				break;
			case 26:
				{
				int LA9_2 = input.LA(2);
				if ( (LA9_2==27) ) {
					switch ( input.LA(3) ) {
					case TYPEID:
						{
						alt9=1;
						}
						break;
					case 28:
						{
						int LA9_6 = input.LA(4);
						if ( (LA9_6==31) ) {
							int LA9_10 = input.LA(5);
							if ( (LA9_10==TYPEID) ) {
								int LA9_12 = input.LA(6);
								if ( (LA9_12==29||LA9_12==48) ) {
									alt9=1;
								}
								else if ( (LA9_12==38) ) {
									alt9=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 9, 12, input);
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
										new NoViableAltException("", 9, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA9_6==38) ) {
							alt9=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ID:
						{
						alt9=2;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 4, input);
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
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 37:
				{
				int LA9_3 = input.LA(2);
				if ( (LA9_3==27) ) {
					switch ( input.LA(3) ) {
					case TYPEID:
						{
						alt9=1;
						}
						break;
					case 28:
						{
						int LA9_8 = input.LA(4);
						if ( (LA9_8==31) ) {
							int LA9_11 = input.LA(5);
							if ( (LA9_11==TYPEID) ) {
								int LA9_13 = input.LA(6);
								if ( (LA9_13==29||LA9_13==48) ) {
									alt9=1;
								}
								else if ( (LA9_13==38) ) {
									alt9=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 9, 13, input);
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
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA9_8==38) ) {
							alt9=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ID:
						{
						alt9=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 5, input);
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
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:11: paramtype
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_paramtype_in_defable422);
					paramtype35=paramtype();
					state._fsp--;

					adaptor.addChild(root_0, paramtype35.getTree());

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:78:4: fndecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_fndecl_in_defable427);
					fndecl36=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl36.getTree());

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:79:4: mutdecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_mutdecl_in_defable432);
					mutdecl37=mutdecl();
					state._fsp--;

					adaptor.addChild(root_0, mutdecl37.getTree());

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


	public static class fielddef_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "fielddef"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:1: fielddef : KEYWORD '=>' defable -> ^( FIELDDEF KEYWORD defable ) ;
	public final SneakersParser.fielddef_return fielddef() throws RecognitionException {
		SneakersParser.fielddef_return retval = new SneakersParser.fielddef_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token KEYWORD38=null;
		Token string_literal39=null;
		ParserRuleReturnScope defable40 =null;

		SneakersAST KEYWORD38_tree=null;
		SneakersAST string_literal39_tree=null;
		RewriteRuleTokenStream stream_KEYWORD=new RewriteRuleTokenStream(adaptor,"token KEYWORD");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_defable=new RewriteRuleSubtreeStream(adaptor,"rule defable");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:2: ( KEYWORD '=>' defable -> ^( FIELDDEF KEYWORD defable ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:4: KEYWORD '=>' defable
			{
			KEYWORD38=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_fielddef444);  
			stream_KEYWORD.add(KEYWORD38);

			string_literal39=(Token)match(input,35,FOLLOW_35_in_fielddef446);  
			stream_35.add(string_literal39);

			pushFollow(FOLLOW_defable_in_fielddef448);
			defable40=defable();
			state._fsp--;

			stream_defable.add(defable40.getTree());
			// AST REWRITE
			// elements: defable, KEYWORD
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (SneakersAST)adaptor.nil();
			// 83:25: -> ^( FIELDDEF KEYWORD defable )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:28: ^( FIELDDEF KEYWORD defable )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(FIELDDEF, "FIELDDEF"), root_1);
				adaptor.addChild(root_1, stream_KEYWORD.nextNode());
				adaptor.addChild(root_1, stream_defable.nextTree());
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
	// $ANTLR end "fielddef"


	public static class nested_id_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "nested_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:87:1: nested_id : ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* );
	public final SneakersParser.nested_id_return nested_id() throws RecognitionException {
		SneakersParser.nested_id_return retval = new SneakersParser.nested_id_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ANONVAR41=null;
		Token char_literal42=null;
		Token char_literal45=null;
		ParserRuleReturnScope any_id43 =null;
		ParserRuleReturnScope any_id44 =null;
		ParserRuleReturnScope any_id46 =null;

		SneakersAST ANONVAR41_tree=null;
		SneakersAST char_literal42_tree=null;
		SneakersAST char_literal45_tree=null;
		RewriteRuleTokenStream stream_ANONVAR=new RewriteRuleTokenStream(adaptor,"token ANONVAR");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:2: ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ANONVAR) ) {
				alt12=1;
			}
			else if ( (LA12_0==ID||LA12_0==MUTID||LA12_0==TYPEID) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:4: ANONVAR ( '.' any_id )*
					{
					ANONVAR41=(Token)match(input,ANONVAR,FOLLOW_ANONVAR_in_nested_id471);  
					stream_ANONVAR.add(ANONVAR41);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:12: ( '.' any_id )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==30) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:13: '.' any_id
							{
							char_literal42=(Token)match(input,30,FOLLOW_30_in_nested_id474);  
							stream_30.add(char_literal42);

							pushFollow(FOLLOW_any_id_in_nested_id476);
							any_id43=any_id();
							state._fsp--;

							stream_any_id.add(any_id43.getTree());
							}
							break;

						default :
							break loop10;
						}
					}

					// AST REWRITE
					// elements: ANONVAR, any_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 88:26: -> ANONVAR ( any_id )*
					{
						adaptor.addChild(root_0, stream_ANONVAR.nextNode());
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:37: ( any_id )*
						while ( stream_any_id.hasNext() ) {
							adaptor.addChild(root_0, stream_any_id.nextTree());
						}
						stream_any_id.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:4: any_id ( '.' any_id )*
					{
					pushFollow(FOLLOW_any_id_in_nested_id490);
					any_id44=any_id();
					state._fsp--;

					stream_any_id.add(any_id44.getTree());
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:11: ( '.' any_id )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==30) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:12: '.' any_id
							{
							char_literal45=(Token)match(input,30,FOLLOW_30_in_nested_id493);  
							stream_30.add(char_literal45);

							pushFollow(FOLLOW_any_id_in_nested_id495);
							any_id46=any_id();
							state._fsp--;

							stream_any_id.add(any_id46.getTree());
							}
							break;

						default :
							break loop11;
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
					// 89:25: -> ( any_id )*
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:28: ( any_id )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:1: fncall : nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) ;
	public final SneakersParser.fncall_return fncall() throws RecognitionException {
		SneakersParser.fncall_return retval = new SneakersParser.fncall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal49=null;
		ParserRuleReturnScope nested_id47 =null;
		ParserRuleReturnScope param48 =null;
		ParserRuleReturnScope param50 =null;

		SneakersAST char_literal49_tree=null;
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:8: ( nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:10: nested_id param ( ( ',' )? param )*
			{
			pushFollow(FOLLOW_nested_id_in_fncall512);
			nested_id47=nested_id();
			state._fsp--;

			stream_nested_id.add(nested_id47.getTree());
			pushFollow(FOLLOW_param_in_fncall514);
			param48=param();
			state._fsp--;

			stream_param.add(param48.getTree());
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:26: ( ( ',' )? param )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==ANONVAR||(LA14_0 >= ID && LA14_0 <= KEYWORD)||LA14_0==MUTID||(LA14_0 >= STRING && LA14_0 <= TYPEID)||(LA14_0 >= 26 && LA14_0 <= 27)||LA14_0==29||(LA14_0 >= 37 && LA14_0 <= 38)||LA14_0==47) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:27: ( ',' )? param
					{
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:27: ( ',' )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==29) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:27: ','
							{
							char_literal49=(Token)match(input,29,FOLLOW_29_in_fncall517);  
							stream_29.add(char_literal49);

							}
							break;

					}

					pushFollow(FOLLOW_param_in_fncall520);
					param50=param();
					state._fsp--;

					stream_param.add(param50.getTree());
					}
					break;

				default :
					break loop14;
				}
			}

			// AST REWRITE
			// elements: nested_id, param
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (SneakersAST)adaptor.nil();
			// 92:40: -> ^( FNCALL nested_id ( param )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:43: ^( FNCALL nested_id ( param )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(FNCALL, "FNCALL"), root_1);
				adaptor.addChild(root_1, stream_nested_id.nextTree());
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:62: ( param )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:1: param : ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) );
	public final SneakersParser.param_return param() throws RecognitionException {
		SneakersParser.param_return retval = new SneakersParser.param_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ID51=null;
		Token char_literal52=null;
		ParserRuleReturnScope expr53 =null;
		ParserRuleReturnScope expr54 =null;

		SneakersAST ID51_tree=null;
		SneakersAST char_literal52_tree=null;
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:7: ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==31) ) {
					alt15=1;
				}
				else if ( (LA15_1==ANONVAR||(LA15_1 >= ID && LA15_1 <= KEYWORD)||LA15_1==MUTID||(LA15_1 >= STRING && LA15_1 <= TYPEID)||(LA15_1 >= 26 && LA15_1 <= 30)||LA15_1==32||(LA15_1 >= 36 && LA15_1 <= 39)||LA15_1==47) ) {
					alt15=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA15_0==ANONVAR||(LA15_0 >= INT && LA15_0 <= KEYWORD)||LA15_0==MUTID||(LA15_0 >= STRING && LA15_0 <= TYPEID)||(LA15_0 >= 26 && LA15_0 <= 27)||(LA15_0 >= 37 && LA15_0 <= 38)||LA15_0==47) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:9: ID ':' expr
					{
					ID51=(Token)match(input,ID,FOLLOW_ID_in_param543);  
					stream_ID.add(ID51);

					char_literal52=(Token)match(input,31,FOLLOW_31_in_param545);  
					stream_31.add(char_literal52);

					pushFollow(FOLLOW_expr_in_param547);
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

					root_0 = (SneakersAST)adaptor.nil();
					// 95:21: -> ^( PARAM ID expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:24: ^( PARAM ID expr )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:4: expr
					{
					pushFollow(FOLLOW_expr_in_param562);
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

					root_0 = (SneakersAST)adaptor.nil();
					// 96:9: -> ^( PARAM expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:12: ^( PARAM expr )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:1: blockparamtype : ( '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ( TYPEID )+ | '(' ')' ':' TYPEID -> TYPEID );
	public final SneakersParser.blockparamtype_return blockparamtype() throws RecognitionException {
		SneakersParser.blockparamtype_return retval = new SneakersParser.blockparamtype_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal55=null;
		Token TYPEID56=null;
		Token char_literal57=null;
		Token TYPEID58=null;
		Token char_literal59=null;
		Token char_literal60=null;
		Token TYPEID61=null;
		Token char_literal62=null;
		Token char_literal63=null;
		Token char_literal64=null;
		Token TYPEID65=null;

		SneakersAST char_literal55_tree=null;
		SneakersAST TYPEID56_tree=null;
		SneakersAST char_literal57_tree=null;
		SneakersAST TYPEID58_tree=null;
		SneakersAST char_literal59_tree=null;
		SneakersAST char_literal60_tree=null;
		SneakersAST TYPEID61_tree=null;
		SneakersAST char_literal62_tree=null;
		SneakersAST char_literal63_tree=null;
		SneakersAST char_literal64_tree=null;
		SneakersAST TYPEID65_tree=null;
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:2: ( '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ( TYPEID )+ | '(' ')' ':' TYPEID -> TYPEID )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==27) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==TYPEID) ) {
					alt17=1;
				}
				else if ( (LA17_1==28) ) {
					alt17=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:4: '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID
					{
					char_literal55=(Token)match(input,27,FOLLOW_27_in_blockparamtype582);  
					stream_27.add(char_literal55);

					TYPEID56=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype584);  
					stream_TYPEID.add(TYPEID56);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:15: ( ',' TYPEID )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==29) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:16: ',' TYPEID
							{
							char_literal57=(Token)match(input,29,FOLLOW_29_in_blockparamtype587);  
							stream_29.add(char_literal57);

							TYPEID58=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype589);  
							stream_TYPEID.add(TYPEID58);

							}
							break;

						default :
							break loop16;
						}
					}

					char_literal59=(Token)match(input,28,FOLLOW_28_in_blockparamtype593);  
					stream_28.add(char_literal59);

					char_literal60=(Token)match(input,31,FOLLOW_31_in_blockparamtype595);  
					stream_31.add(char_literal60);

					TYPEID61=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype597);  
					stream_TYPEID.add(TYPEID61);

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
					// 100:44: -> ( TYPEID )+
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:101:4: '(' ')' ':' TYPEID
					{
					char_literal62=(Token)match(input,27,FOLLOW_27_in_blockparamtype607);  
					stream_27.add(char_literal62);

					char_literal63=(Token)match(input,28,FOLLOW_28_in_blockparamtype609);  
					stream_28.add(char_literal63);

					char_literal64=(Token)match(input,31,FOLLOW_31_in_blockparamtype611);  
					stream_31.add(char_literal64);

					TYPEID65=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype613);  
					stream_TYPEID.add(TYPEID65);

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
					// 101:23: -> TYPEID
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:1: paramtype : ( TYPEID | '#' blockparamtype -> ^( PARAMTYPEFN blockparamtype ) | '@' blockparamtype -> ^( PARAMTYPEMUT blockparamtype ) );
	public final SneakersParser.paramtype_return paramtype() throws RecognitionException {
		SneakersParser.paramtype_return retval = new SneakersParser.paramtype_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token TYPEID66=null;
		Token char_literal67=null;
		Token char_literal69=null;
		ParserRuleReturnScope blockparamtype68 =null;
		ParserRuleReturnScope blockparamtype70 =null;

		SneakersAST TYPEID66_tree=null;
		SneakersAST char_literal67_tree=null;
		SneakersAST char_literal69_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_blockparamtype=new RewriteRuleSubtreeStream(adaptor,"rule blockparamtype");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:11: ( TYPEID | '#' blockparamtype -> ^( PARAMTYPEFN blockparamtype ) | '@' blockparamtype -> ^( PARAMTYPEMUT blockparamtype ) )
			int alt18=3;
			switch ( input.LA(1) ) {
			case TYPEID:
				{
				alt18=1;
				}
				break;
			case 26:
				{
				alt18=2;
				}
				break;
			case 37:
				{
				alt18=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:14: TYPEID
					{
					root_0 = (SneakersAST)adaptor.nil();


					TYPEID66=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype628); 
					TYPEID66_tree = (SneakersAST)adaptor.create(TYPEID66);
					adaptor.addChild(root_0, TYPEID66_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:105:4: '#' blockparamtype
					{
					char_literal67=(Token)match(input,26,FOLLOW_26_in_paramtype633);  
					stream_26.add(char_literal67);

					pushFollow(FOLLOW_blockparamtype_in_paramtype635);
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

					root_0 = (SneakersAST)adaptor.nil();
					// 105:23: -> ^( PARAMTYPEFN blockparamtype )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:105:26: ^( PARAMTYPEFN blockparamtype )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:4: '@' blockparamtype
					{
					char_literal69=(Token)match(input,37,FOLLOW_37_in_paramtype648);  
					stream_37.add(char_literal69);

					pushFollow(FOLLOW_blockparamtype_in_paramtype650);
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

					root_0 = (SneakersAST)adaptor.nil();
					// 106:23: -> ^( PARAMTYPEMUT blockparamtype )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:26: ^( PARAMTYPEMUT blockparamtype )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:1: fnparam : ID ':' paramtype -> ^( FNPARAM ID paramtype ) ;
	public final SneakersParser.fnparam_return fnparam() throws RecognitionException {
		SneakersParser.fnparam_return retval = new SneakersParser.fnparam_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ID71=null;
		Token char_literal72=null;
		ParserRuleReturnScope paramtype73 =null;

		SneakersAST ID71_tree=null;
		SneakersAST char_literal72_tree=null;
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_paramtype=new RewriteRuleSubtreeStream(adaptor,"rule paramtype");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:9: ( ID ':' paramtype -> ^( FNPARAM ID paramtype ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:11: ID ':' paramtype
			{
			ID71=(Token)match(input,ID,FOLLOW_ID_in_fnparam669);  
			stream_ID.add(ID71);

			char_literal72=(Token)match(input,31,FOLLOW_31_in_fnparam671);  
			stream_31.add(char_literal72);

			pushFollow(FOLLOW_paramtype_in_fnparam673);
			paramtype73=paramtype();
			state._fsp--;

			stream_paramtype.add(paramtype73.getTree());
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
			// 109:28: -> ^( FNPARAM ID paramtype )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:31: ^( FNPARAM ID paramtype )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );
	public final SneakersParser.anonfn_return anonfn() throws RecognitionException {
		SneakersParser.anonfn_return retval = new SneakersParser.anonfn_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal74=null;
		Token char_literal75=null;
		Token char_literal77=null;
		Token char_literal78=null;
		Token char_literal79=null;
		Token char_literal81=null;
		ParserRuleReturnScope fncall76 =null;
		ParserRuleReturnScope nested_id80 =null;

		SneakersAST char_literal74_tree=null;
		SneakersAST char_literal75_tree=null;
		SneakersAST char_literal77_tree=null;
		SneakersAST char_literal78_tree=null;
		SneakersAST char_literal79_tree=null;
		SneakersAST char_literal81_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:8: ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) )
			int alt19=2;
			alt19 = dfa19.predict(input);
			switch (alt19) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:10: '#' '[' fncall ']'
					{
					char_literal74=(Token)match(input,26,FOLLOW_26_in_anonfn693);  
					stream_26.add(char_literal74);

					char_literal75=(Token)match(input,38,FOLLOW_38_in_anonfn695);  
					stream_38.add(char_literal75);

					pushFollow(FOLLOW_fncall_in_anonfn697);
					fncall76=fncall();
					state._fsp--;

					stream_fncall.add(fncall76.getTree());
					char_literal77=(Token)match(input,39,FOLLOW_39_in_anonfn699);  
					stream_39.add(char_literal77);

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
					// 112:29: -> ^( ANONFN fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:32: ^( ANONFN fncall )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:4: '#' '[' nested_id ']'
					{
					char_literal78=(Token)match(input,26,FOLLOW_26_in_anonfn712);  
					stream_26.add(char_literal78);

					char_literal79=(Token)match(input,38,FOLLOW_38_in_anonfn714);  
					stream_38.add(char_literal79);

					pushFollow(FOLLOW_nested_id_in_anonfn716);
					nested_id80=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id80.getTree());
					char_literal81=(Token)match(input,39,FOLLOW_39_in_anonfn718);  
					stream_39.add(char_literal81);

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
					// 113:26: -> ^( ANONFN nested_id )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:29: ^( ANONFN nested_id )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:1: blockdecl : ( '(' ')' ( ':' TYPEID )? contained_block -> ( TYPEID )? contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block -> ( fnparam )* ( TYPEID )? contained_block );
	public final SneakersParser.blockdecl_return blockdecl() throws RecognitionException {
		SneakersParser.blockdecl_return retval = new SneakersParser.blockdecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal82=null;
		Token char_literal83=null;
		Token char_literal84=null;
		Token TYPEID85=null;
		Token char_literal87=null;
		Token char_literal89=null;
		Token char_literal91=null;
		Token char_literal92=null;
		Token TYPEID93=null;
		ParserRuleReturnScope contained_block86 =null;
		ParserRuleReturnScope fnparam88 =null;
		ParserRuleReturnScope fnparam90 =null;
		ParserRuleReturnScope contained_block94 =null;

		SneakersAST char_literal82_tree=null;
		SneakersAST char_literal83_tree=null;
		SneakersAST char_literal84_tree=null;
		SneakersAST TYPEID85_tree=null;
		SneakersAST char_literal87_tree=null;
		SneakersAST char_literal89_tree=null;
		SneakersAST char_literal91_tree=null;
		SneakersAST char_literal92_tree=null;
		SneakersAST TYPEID93_tree=null;
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_fnparam=new RewriteRuleSubtreeStream(adaptor,"rule fnparam");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:117:2: ( '(' ')' ( ':' TYPEID )? contained_block -> ( TYPEID )? contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block -> ( fnparam )* ( TYPEID )? contained_block )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==27) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==28) ) {
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
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:117:4: '(' ')' ( ':' TYPEID )? contained_block
					{
					char_literal82=(Token)match(input,27,FOLLOW_27_in_blockdecl737);  
					stream_27.add(char_literal82);

					char_literal83=(Token)match(input,28,FOLLOW_28_in_blockdecl739);  
					stream_28.add(char_literal83);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:117:12: ( ':' TYPEID )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==31) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:117:13: ':' TYPEID
							{
							char_literal84=(Token)match(input,31,FOLLOW_31_in_blockdecl742);  
							stream_31.add(char_literal84);

							TYPEID85=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl744);  
							stream_TYPEID.add(TYPEID85);

							}
							break;

					}

					pushFollow(FOLLOW_contained_block_in_blockdecl748);
					contained_block86=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block86.getTree());
					// AST REWRITE
					// elements: TYPEID, contained_block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 117:42: -> ( TYPEID )? contained_block
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:117:45: ( TYPEID )?
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:4: '(' fnparam ( ( ',' )? fnparam )* ')' ( ':' TYPEID )? contained_block
					{
					char_literal87=(Token)match(input,27,FOLLOW_27_in_blockdecl760);  
					stream_27.add(char_literal87);

					pushFollow(FOLLOW_fnparam_in_blockdecl762);
					fnparam88=fnparam();
					state._fsp--;

					stream_fnparam.add(fnparam88.getTree());
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:16: ( ( ',' )? fnparam )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==ID||LA22_0==29) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:17: ( ',' )? fnparam
							{
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:17: ( ',' )?
							int alt21=2;
							int LA21_0 = input.LA(1);
							if ( (LA21_0==29) ) {
								alt21=1;
							}
							switch (alt21) {
								case 1 :
									// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:17: ','
									{
									char_literal89=(Token)match(input,29,FOLLOW_29_in_blockdecl765);  
									stream_29.add(char_literal89);

									}
									break;

							}

							pushFollow(FOLLOW_fnparam_in_blockdecl768);
							fnparam90=fnparam();
							state._fsp--;

							stream_fnparam.add(fnparam90.getTree());
							}
							break;

						default :
							break loop22;
						}
					}

					char_literal91=(Token)match(input,28,FOLLOW_28_in_blockdecl772);  
					stream_28.add(char_literal91);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:36: ( ':' TYPEID )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==31) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:37: ':' TYPEID
							{
							char_literal92=(Token)match(input,31,FOLLOW_31_in_blockdecl775);  
							stream_31.add(char_literal92);

							TYPEID93=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl777);  
							stream_TYPEID.add(TYPEID93);

							}
							break;

					}

					pushFollow(FOLLOW_contained_block_in_blockdecl781);
					contained_block94=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block94.getTree());
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
					// 118:66: -> ( fnparam )* ( TYPEID )? contained_block
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:69: ( fnparam )*
						while ( stream_fnparam.hasNext() ) {
							adaptor.addChild(root_0, stream_fnparam.nextTree());
						}
						stream_fnparam.reset();

						// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:78: ( TYPEID )?
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:1: fndecl : '#' blockdecl -> ^( FNDECL blockdecl ) ;
	public final SneakersParser.fndecl_return fndecl() throws RecognitionException {
		SneakersParser.fndecl_return retval = new SneakersParser.fndecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal95=null;
		ParserRuleReturnScope blockdecl96 =null;

		SneakersAST char_literal95_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:8: ( '#' blockdecl -> ^( FNDECL blockdecl ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:10: '#' blockdecl
			{
			char_literal95=(Token)match(input,26,FOLLOW_26_in_fndecl801);  
			stream_26.add(char_literal95);

			pushFollow(FOLLOW_blockdecl_in_fndecl803);
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

			root_0 = (SneakersAST)adaptor.nil();
			// 121:24: -> ^( FNDECL blockdecl )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:27: ^( FNDECL blockdecl )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:124:1: mutdecl : '@' blockdecl -> ^( MUTDECL blockdecl ) ;
	public final SneakersParser.mutdecl_return mutdecl() throws RecognitionException {
		SneakersParser.mutdecl_return retval = new SneakersParser.mutdecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal97=null;
		ParserRuleReturnScope blockdecl98 =null;

		SneakersAST char_literal97_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:124:9: ( '@' blockdecl -> ^( MUTDECL blockdecl ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:124:11: '@' blockdecl
			{
			char_literal97=(Token)match(input,37,FOLLOW_37_in_mutdecl821);  
			stream_37.add(char_literal97);

			pushFollow(FOLLOW_blockdecl_in_mutdecl823);
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

			root_0 = (SneakersAST)adaptor.nil();
			// 124:25: -> ^( MUTDECL blockdecl )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:124:28: ^( MUTDECL blockdecl )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:1: expr : ( index_expr | dict | fndecl | mutdecl | anonfn | array );
	public final SneakersParser.expr_return expr() throws RecognitionException {
		SneakersParser.expr_return retval = new SneakersParser.expr_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		ParserRuleReturnScope index_expr99 =null;
		ParserRuleReturnScope dict100 =null;
		ParserRuleReturnScope fndecl101 =null;
		ParserRuleReturnScope mutdecl102 =null;
		ParserRuleReturnScope anonfn103 =null;
		ParserRuleReturnScope array104 =null;


		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:6: ( index_expr | dict | fndecl | mutdecl | anonfn | array )
			int alt25=6;
			switch ( input.LA(1) ) {
			case ANONVAR:
			case ID:
			case INT:
			case KEYWORD:
			case MUTID:
			case STRING:
			case TYPEID:
			case 27:
				{
				alt25=1;
				}
				break;
			case 47:
				{
				alt25=2;
				}
				break;
			case 26:
				{
				int LA25_3 = input.LA(2);
				if ( (LA25_3==38) ) {
					alt25=5;
				}
				else if ( (LA25_3==27) ) {
					alt25=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 37:
				{
				alt25=4;
				}
				break;
			case 38:
				{
				alt25=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:8: index_expr
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_index_expr_in_expr841);
					index_expr99=index_expr();
					state._fsp--;

					adaptor.addChild(root_0, index_expr99.getTree());

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:128:4: dict
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_dict_in_expr846);
					dict100=dict();
					state._fsp--;

					adaptor.addChild(root_0, dict100.getTree());

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:129:4: fndecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_fndecl_in_expr851);
					fndecl101=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl101.getTree());

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:130:4: mutdecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_mutdecl_in_expr856);
					mutdecl102=mutdecl();
					state._fsp--;

					adaptor.addChild(root_0, mutdecl102.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:4: anonfn
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_anonfn_in_expr861);
					anonfn103=anonfn();
					state._fsp--;

					adaptor.addChild(root_0, anonfn103.getTree());

					}
					break;
				case 6 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:132:4: array
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_array_in_expr866);
					array104=array();
					state._fsp--;

					adaptor.addChild(root_0, array104.getTree());

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:135:1: standalone_fncall : '(' fncall ')' -> fncall ;
	public final SneakersParser.standalone_fncall_return standalone_fncall() throws RecognitionException {
		SneakersParser.standalone_fncall_return retval = new SneakersParser.standalone_fncall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal105=null;
		Token char_literal107=null;
		ParserRuleReturnScope fncall106 =null;

		SneakersAST char_literal105_tree=null;
		SneakersAST char_literal107_tree=null;
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:136:2: ( '(' fncall ')' -> fncall )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:136:4: '(' fncall ')'
			{
			char_literal105=(Token)match(input,27,FOLLOW_27_in_standalone_fncall877);  
			stream_27.add(char_literal105);

			pushFollow(FOLLOW_fncall_in_standalone_fncall879);
			fncall106=fncall();
			state._fsp--;

			stream_fncall.add(fncall106.getTree());
			char_literal107=(Token)match(input,28,FOLLOW_28_in_standalone_fncall881);  
			stream_28.add(char_literal107);

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
			// 136:19: -> fncall
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:139:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );
	public final SneakersParser.mutcall_return mutcall() throws RecognitionException {
		SneakersParser.mutcall_return retval = new SneakersParser.mutcall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal108=null;
		Token char_literal110=null;
		Token char_literal111=null;
		Token char_literal113=null;
		ParserRuleReturnScope nested_id109 =null;
		ParserRuleReturnScope fncall112 =null;

		SneakersAST char_literal108_tree=null;
		SneakersAST char_literal110_tree=null;
		SneakersAST char_literal111_tree=null;
		SneakersAST char_literal113_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:139:9: ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall )
			int alt26=2;
			alt26 = dfa26.predict(input);
			switch (alt26) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:139:11: '<' nested_id '>'
					{
					char_literal108=(Token)match(input,33,FOLLOW_33_in_mutcall895);  
					stream_33.add(char_literal108);

					pushFollow(FOLLOW_nested_id_in_mutcall897);
					nested_id109=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id109.getTree());
					char_literal110=(Token)match(input,36,FOLLOW_36_in_mutcall899);  
					stream_36.add(char_literal110);

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
					// 139:29: -> nested_id
					{
						adaptor.addChild(root_0, stream_nested_id.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:140:4: '<' fncall '>'
					{
					char_literal111=(Token)match(input,33,FOLLOW_33_in_mutcall908);  
					stream_33.add(char_literal111);

					pushFollow(FOLLOW_fncall_in_mutcall910);
					fncall112=fncall();
					state._fsp--;

					stream_fncall.add(fncall112.getTree());
					char_literal113=(Token)match(input,36,FOLLOW_36_in_mutcall912);  
					stream_36.add(char_literal113);

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
					// 140:19: -> fncall
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:143:1: index_expr : ( KEYWORD | INT | STRING | nested_id | standalone_fncall );
	public final SneakersParser.index_expr_return index_expr() throws RecognitionException {
		SneakersParser.index_expr_return retval = new SneakersParser.index_expr_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token KEYWORD114=null;
		Token INT115=null;
		Token STRING116=null;
		ParserRuleReturnScope nested_id117 =null;
		ParserRuleReturnScope standalone_fncall118 =null;

		SneakersAST KEYWORD114_tree=null;
		SneakersAST INT115_tree=null;
		SneakersAST STRING116_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:144:2: ( KEYWORD | INT | STRING | nested_id | standalone_fncall )
			int alt27=5;
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
			case TYPEID:
				{
				alt27=4;
				}
				break;
			case 27:
				{
				alt27=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:144:4: KEYWORD
					{
					root_0 = (SneakersAST)adaptor.nil();


					KEYWORD114=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_index_expr927); 
					KEYWORD114_tree = (SneakersAST)adaptor.create(KEYWORD114);
					adaptor.addChild(root_0, KEYWORD114_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:145:4: INT
					{
					root_0 = (SneakersAST)adaptor.nil();


					INT115=(Token)match(input,INT,FOLLOW_INT_in_index_expr932); 
					INT115_tree = (SneakersAST)adaptor.create(INT115);
					adaptor.addChild(root_0, INT115_tree);

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:146:4: STRING
					{
					root_0 = (SneakersAST)adaptor.nil();


					STRING116=(Token)match(input,STRING,FOLLOW_STRING_in_index_expr937); 
					STRING116_tree = (SneakersAST)adaptor.create(STRING116);
					adaptor.addChild(root_0, STRING116_tree);

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:147:4: nested_id
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_nested_id_in_index_expr942);
					nested_id117=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id117.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:148:4: standalone_fncall
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_standalone_fncall_in_index_expr947);
					standalone_fncall118=standalone_fncall();
					state._fsp--;

					adaptor.addChild(root_0, standalone_fncall118.getTree());

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:151:1: dict_pair : index_expr '=>' expr -> index_expr expr ;
	public final SneakersParser.dict_pair_return dict_pair() throws RecognitionException {
		SneakersParser.dict_pair_return retval = new SneakersParser.dict_pair_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token string_literal120=null;
		ParserRuleReturnScope index_expr119 =null;
		ParserRuleReturnScope expr121 =null;

		SneakersAST string_literal120_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:152:2: ( index_expr '=>' expr -> index_expr expr )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:152:4: index_expr '=>' expr
			{
			pushFollow(FOLLOW_index_expr_in_dict_pair959);
			index_expr119=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr119.getTree());
			string_literal120=(Token)match(input,35,FOLLOW_35_in_dict_pair961);  
			stream_35.add(string_literal120);

			pushFollow(FOLLOW_expr_in_dict_pair963);
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

			root_0 = (SneakersAST)adaptor.nil();
			// 152:25: -> index_expr expr
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:155:1: dict : '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) ;
	public final SneakersParser.dict_return dict() throws RecognitionException {
		SneakersParser.dict_return retval = new SneakersParser.dict_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal122=null;
		Token char_literal124=null;
		Token char_literal126=null;
		ParserRuleReturnScope dict_pair123 =null;
		ParserRuleReturnScope dict_pair125 =null;

		SneakersAST char_literal122_tree=null;
		SneakersAST char_literal124_tree=null;
		SneakersAST char_literal126_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_dict_pair=new RewriteRuleSubtreeStream(adaptor,"rule dict_pair");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:155:6: ( '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:155:8: '{' ( dict_pair )? ( ',' dict_pair )* '}'
			{
			char_literal122=(Token)match(input,47,FOLLOW_47_in_dict979);  
			stream_47.add(char_literal122);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:155:12: ( dict_pair )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==ANONVAR||(LA28_0 >= ID && LA28_0 <= KEYWORD)||LA28_0==MUTID||(LA28_0 >= STRING && LA28_0 <= TYPEID)||LA28_0==27) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:155:13: dict_pair
					{
					pushFollow(FOLLOW_dict_pair_in_dict982);
					dict_pair123=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair123.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:155:25: ( ',' dict_pair )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==29) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:155:26: ',' dict_pair
					{
					char_literal124=(Token)match(input,29,FOLLOW_29_in_dict987);  
					stream_29.add(char_literal124);

					pushFollow(FOLLOW_dict_pair_in_dict989);
					dict_pair125=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair125.getTree());
					}
					break;

				default :
					break loop29;
				}
			}

			char_literal126=(Token)match(input,48,FOLLOW_48_in_dict993);  
			stream_48.add(char_literal126);

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
			// 155:46: -> ^( DICT ( dict_pair )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:155:49: ^( DICT ( dict_pair )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(DICT, "DICT"), root_1);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:155:56: ( dict_pair )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:158:1: contained_block : '[' block ']' -> block ;
	public final SneakersParser.contained_block_return contained_block() throws RecognitionException {
		SneakersParser.contained_block_return retval = new SneakersParser.contained_block_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal127=null;
		Token char_literal129=null;
		ParserRuleReturnScope block128 =null;

		SneakersAST char_literal127_tree=null;
		SneakersAST char_literal129_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:159:2: ( '[' block ']' -> block )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:159:4: '[' block ']'
			{
			char_literal127=(Token)match(input,38,FOLLOW_38_in_contained_block1015);  
			stream_38.add(char_literal127);

			pushFollow(FOLLOW_block_in_contained_block1017);
			block128=block();
			state._fsp--;

			stream_block.add(block128.getTree());
			char_literal129=(Token)match(input,39,FOLLOW_39_in_contained_block1019);  
			stream_39.add(char_literal129);

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
			// 159:18: -> block
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:162:1: array : '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) ;
	public final SneakersParser.array_return array() throws RecognitionException {
		SneakersParser.array_return retval = new SneakersParser.array_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal130=null;
		Token char_literal132=null;
		Token char_literal134=null;
		ParserRuleReturnScope expr131 =null;
		ParserRuleReturnScope expr133 =null;

		SneakersAST char_literal130_tree=null;
		SneakersAST char_literal132_tree=null;
		SneakersAST char_literal134_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:162:7: ( '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:162:9: '[' ( expr )? ( ',' expr )* ']'
			{
			char_literal130=(Token)match(input,38,FOLLOW_38_in_array1033);  
			stream_38.add(char_literal130);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:162:13: ( expr )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==ANONVAR||(LA30_0 >= ID && LA30_0 <= KEYWORD)||LA30_0==MUTID||(LA30_0 >= STRING && LA30_0 <= TYPEID)||(LA30_0 >= 26 && LA30_0 <= 27)||(LA30_0 >= 37 && LA30_0 <= 38)||LA30_0==47) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:162:13: expr
					{
					pushFollow(FOLLOW_expr_in_array1035);
					expr131=expr();
					state._fsp--;

					stream_expr.add(expr131.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:162:19: ( ',' expr )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==29) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:162:20: ',' expr
					{
					char_literal132=(Token)match(input,29,FOLLOW_29_in_array1039);  
					stream_29.add(char_literal132);

					pushFollow(FOLLOW_expr_in_array1041);
					expr133=expr();
					state._fsp--;

					stream_expr.add(expr133.getTree());
					}
					break;

				default :
					break loop31;
				}
			}

			char_literal134=(Token)match(input,39,FOLLOW_39_in_array1045);  
			stream_39.add(char_literal134);

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
			// 162:35: -> ^( ARRAY ( expr )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:162:38: ^( ARRAY ( expr )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(ARRAY, "ARRAY"), root_1);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:162:46: ( expr )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:181:1: any_id : ( ID | TYPEID | MUTID );
	public final SneakersParser.any_id_return any_id() throws RecognitionException {
		SneakersParser.any_id_return retval = new SneakersParser.any_id_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token set135=null;

		SneakersAST set135_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:182:2: ( ID | TYPEID | MUTID )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:
			{
			root_0 = (SneakersAST)adaptor.nil();


			set135=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==MUTID||input.LA(1)==TYPEID ) {
				input.consume();
				adaptor.addChild(root_0, (SneakersAST)adaptor.create(set135));
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
	protected DFA8 dfa8 = new DFA8(this);
	protected DFA19 dfa19 = new DFA19(this);
	protected DFA26 dfa26 = new DFA26(this);
	static final String DFA3_eotS =
		"\12\uffff";
	static final String DFA3_eofS =
		"\12\uffff";
	static final String DFA3_minS =
		"\1\56\3\5\1\uffff\1\16\1\uffff\1\16\2\5";
	static final String DFA3_maxS =
		"\1\56\3\57\1\uffff\1\30\1\uffff\1\30\2\57";
	static final String DFA3_acceptS =
		"\4\uffff\1\2\1\uffff\1\1\3\uffff";
	static final String DFA3_specialS =
		"\12\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1",
			"\1\2\10\uffff\1\3\2\4\1\uffff\1\3\4\uffff\1\4\1\3\1\uffff\2\4\11\uffff"+
			"\2\4\10\uffff\1\4",
			"\1\6\10\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\5\1"+
			"\uffff\1\4\4\uffff\2\6\10\uffff\1\6",
			"\1\6\10\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\7\1"+
			"\uffff\1\4\4\uffff\2\6\10\uffff\1\6",
			"",
			"\1\10\3\uffff\1\10\5\uffff\1\10",
			"",
			"\1\11\3\uffff\1\11\5\uffff\1\11",
			"\1\6\10\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\5\1"+
			"\uffff\1\4\4\uffff\2\6\10\uffff\1\6",
			"\1\6\10\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\7\1"+
			"\uffff\1\4\4\uffff\2\6\10\uffff\1\6"
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
			return "56:1: returnstat : ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) );";
		}
	}

	static final String DFA8_eotS =
		"\21\uffff";
	static final String DFA8_eofS =
		"\21\uffff";
	static final String DFA8_minS =
		"\1\16\2\42\2\5\1\uffff\1\5\1\uffff\2\5\1\16\1\uffff\2\16\1\uffff\2\5";
	static final String DFA8_maxS =
		"\1\30\2\42\2\57\1\uffff\1\57\1\uffff\2\57\1\53\1\uffff\2\30\1\uffff\2"+
		"\57";
	static final String DFA8_acceptS =
		"\5\uffff\1\1\1\uffff\1\3\3\uffff\1\4\2\uffff\1\2\2\uffff";
	static final String DFA8_specialS =
		"\21\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\2\3\uffff\1\2\5\uffff\1\1",
			"\1\3",
			"\1\4",
			"\1\10\10\uffff\1\11\2\7\1\uffff\1\11\4\uffff\1\7\1\6\1\uffff\2\7\11"+
			"\uffff\2\7\1\uffff\1\5\6\uffff\1\7",
			"\1\10\10\uffff\1\11\2\7\1\uffff\1\11\4\uffff\1\7\1\11\1\uffff\2\7\11"+
			"\uffff\2\7\10\uffff\1\7",
			"",
			"\1\13\10\uffff\3\13\1\uffff\1\13\4\uffff\2\13\1\uffff\2\13\2\uffff\1"+
			"\12\1\uffff\1\7\4\uffff\2\13\10\uffff\1\13",
			"",
			"\1\13\10\uffff\3\13\1\uffff\1\13\4\uffff\2\13\1\uffff\2\13\2\uffff\1"+
			"\14\1\uffff\1\7\4\uffff\2\13\10\uffff\1\13",
			"\1\13\10\uffff\3\13\1\uffff\1\13\4\uffff\2\13\1\uffff\2\13\2\uffff\1"+
			"\15\1\uffff\1\7\4\uffff\2\13\10\uffff\1\13",
			"\1\17\3\uffff\1\17\5\uffff\1\17\22\uffff\1\16",
			"",
			"\1\20\3\uffff\1\20\5\uffff\1\20",
			"\1\17\3\uffff\1\17\5\uffff\1\17",
			"",
			"\1\13\10\uffff\3\13\1\uffff\1\13\4\uffff\2\13\1\uffff\2\13\2\uffff\1"+
			"\15\1\uffff\1\7\4\uffff\2\13\10\uffff\1\13",
			"\1\13\10\uffff\3\13\1\uffff\1\13\4\uffff\2\13\1\uffff\2\13\2\uffff\1"+
			"\14\1\uffff\1\7\4\uffff\2\13\10\uffff\1\13"
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
			return "69:1: assignment : ( TYPEID '=' 'class' classdef -> ^( 'class' TYPEID classdef ) |newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' classdef -> ^( 'extend' $newclass $oldclass classdef ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );";
		}
	}

	static final String DFA19_eotS =
		"\13\uffff";
	static final String DFA19_eofS =
		"\13\uffff";
	static final String DFA19_minS =
		"\1\32\1\46\3\5\1\16\2\uffff\1\16\2\5";
	static final String DFA19_maxS =
		"\1\32\1\46\1\30\2\57\1\30\2\uffff\1\30\2\57";
	static final String DFA19_acceptS =
		"\6\uffff\1\1\1\2\3\uffff";
	static final String DFA19_specialS =
		"\13\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\10\uffff\1\4\3\uffff\1\4\5\uffff\1\4",
			"\1\6\10\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\5\6"+
			"\uffff\2\6\1\7\7\uffff\1\6",
			"\1\6\10\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\10\6"+
			"\uffff\2\6\1\7\7\uffff\1\6",
			"\1\11\3\uffff\1\11\5\uffff\1\11",
			"",
			"",
			"\1\12\3\uffff\1\12\5\uffff\1\12",
			"\1\6\10\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\5\6"+
			"\uffff\2\6\1\7\7\uffff\1\6",
			"\1\6\10\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\10\6"+
			"\uffff\2\6\1\7\7\uffff\1\6"
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
			return "112:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );";
		}
	}

	static final String DFA26_eotS =
		"\12\uffff";
	static final String DFA26_eofS =
		"\12\uffff";
	static final String DFA26_minS =
		"\1\41\3\5\1\16\2\uffff\1\16\2\5";
	static final String DFA26_maxS =
		"\1\41\1\30\2\57\1\30\2\uffff\1\30\2\57";
	static final String DFA26_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA26_specialS =
		"\12\uffff}>";
	static final String[] DFA26_transitionS = {
			"\1\1",
			"\1\2\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3",
			"\1\6\10\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\4\5"+
			"\uffff\1\5\2\6\10\uffff\1\6",
			"\1\6\10\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\7\5"+
			"\uffff\1\5\2\6\10\uffff\1\6",
			"\1\10\3\uffff\1\10\5\uffff\1\10",
			"",
			"",
			"\1\11\3\uffff\1\11\5\uffff\1\11",
			"\1\6\10\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\4\5"+
			"\uffff\1\5\2\6\10\uffff\1\6",
			"\1\6\10\uffff\3\6\1\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\7\5"+
			"\uffff\1\5\2\6\10\uffff\1\6"
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
			return "139:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );";
		}
	}

	public static final BitSet FOLLOW_block_in_prog125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_block137 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_block139 = new BitSet(new long[]{0x0000700201044002L});
	public static final BitSet FOLLOW_assignment_in_stat158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_stat168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutcall_in_stat173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_stat178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_returnstat189 = new BitSet(new long[]{0x0000000001044020L});
	public static final BitSet FOLLOW_fncall_in_returnstat191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_returnstat204 = new BitSet(new long[]{0x000080600D85C020L});
	public static final BitSet FOLLOW_expr_in_returnstat206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_ifstat224 = new BitSet(new long[]{0x000080600D85C020L});
	public static final BitSet FOLLOW_expr_in_ifstat228 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat232 = new BitSet(new long[]{0x0000060000000002L});
	public static final BitSet FOLLOW_42_in_ifstat238 = new BitSet(new long[]{0x000080600D85C020L});
	public static final BitSet FOLLOW_expr_in_ifstat242 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat246 = new BitSet(new long[]{0x0000060000000002L});
	public static final BitSet FOLLOW_41_in_ifstat254 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_classdef294 = new BitSet(new long[]{0x0001000020010000L});
	public static final BitSet FOLLOW_fielddef_in_classdef297 = new BitSet(new long[]{0x0001000020000000L});
	public static final BitSet FOLLOW_29_in_classdef302 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_fielddef_in_classdef304 = new BitSet(new long[]{0x0001000020000000L});
	public static final BitSet FOLLOW_48_in_classdef308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_assignment324 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_assignment326 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_assignment328 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_classdef_in_assignment330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_assignment347 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_assignment349 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_TYPEID_in_assignment353 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_assignment355 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_assignment357 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_classdef_in_assignment359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment378 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_assignment380 = new BitSet(new long[]{0x000080600D85C020L});
	public static final BitSet FOLLOW_expr_in_assignment382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment397 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_assignment399 = new BitSet(new long[]{0x0000000001044020L});
	public static final BitSet FOLLOW_fncall_in_assignment401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramtype_in_defable422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_defable427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutdecl_in_defable432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_fielddef444 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_fielddef446 = new BitSet(new long[]{0x0000002005000000L});
	public static final BitSet FOLLOW_defable_in_fielddef448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANONVAR_in_nested_id471 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_nested_id474 = new BitSet(new long[]{0x0000000001044000L});
	public static final BitSet FOLLOW_any_id_in_nested_id476 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_any_id_in_nested_id490 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_nested_id493 = new BitSet(new long[]{0x0000000001044000L});
	public static final BitSet FOLLOW_any_id_in_nested_id495 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_nested_id_in_fncall512 = new BitSet(new long[]{0x000080600D85C020L});
	public static final BitSet FOLLOW_param_in_fncall514 = new BitSet(new long[]{0x000080602D85C022L});
	public static final BitSet FOLLOW_29_in_fncall517 = new BitSet(new long[]{0x000080600D85C020L});
	public static final BitSet FOLLOW_param_in_fncall520 = new BitSet(new long[]{0x000080602D85C022L});
	public static final BitSet FOLLOW_ID_in_param543 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_param545 = new BitSet(new long[]{0x000080600D85C020L});
	public static final BitSet FOLLOW_expr_in_param547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_param562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_blockparamtype582 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype584 = new BitSet(new long[]{0x0000000030000000L});
	public static final BitSet FOLLOW_29_in_blockparamtype587 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype589 = new BitSet(new long[]{0x0000000030000000L});
	public static final BitSet FOLLOW_28_in_blockparamtype593 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_blockparamtype595 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_blockparamtype607 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_blockparamtype609 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_blockparamtype611 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_paramtype633 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_blockparamtype_in_paramtype635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_paramtype648 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_blockparamtype_in_paramtype650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fnparam669 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_fnparam671 = new BitSet(new long[]{0x0000002005000000L});
	public static final BitSet FOLLOW_paramtype_in_fnparam673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_anonfn693 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_anonfn695 = new BitSet(new long[]{0x0000000001044020L});
	public static final BitSet FOLLOW_fncall_in_anonfn697 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_anonfn699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_anonfn712 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_anonfn714 = new BitSet(new long[]{0x0000000001044020L});
	public static final BitSet FOLLOW_nested_id_in_anonfn716 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_anonfn718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_blockdecl737 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_blockdecl739 = new BitSet(new long[]{0x0000004080000000L});
	public static final BitSet FOLLOW_31_in_blockdecl742 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl744 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_blockdecl760 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl762 = new BitSet(new long[]{0x0000000030004000L});
	public static final BitSet FOLLOW_29_in_blockdecl765 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl768 = new BitSet(new long[]{0x0000000030004000L});
	public static final BitSet FOLLOW_28_in_blockdecl772 = new BitSet(new long[]{0x0000004080000000L});
	public static final BitSet FOLLOW_31_in_blockdecl775 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl777 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_fndecl801 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_blockdecl_in_fndecl803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_mutdecl821 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_blockdecl_in_mutdecl823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_expr841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_expr851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutdecl_in_expr856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anonfn_in_expr861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_expr866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_standalone_fncall877 = new BitSet(new long[]{0x0000000001044020L});
	public static final BitSet FOLLOW_fncall_in_standalone_fncall879 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_standalone_fncall881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_mutcall895 = new BitSet(new long[]{0x0000000001044020L});
	public static final BitSet FOLLOW_nested_id_in_mutcall897 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_mutcall899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_mutcall908 = new BitSet(new long[]{0x0000000001044020L});
	public static final BitSet FOLLOW_fncall_in_mutcall910 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_mutcall912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_index_expr927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_index_expr932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_index_expr937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_index_expr942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standalone_fncall_in_index_expr947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_dict_pair959 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_dict_pair961 = new BitSet(new long[]{0x000080600D85C020L});
	public static final BitSet FOLLOW_expr_in_dict_pair963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_dict979 = new BitSet(new long[]{0x000100002985C020L});
	public static final BitSet FOLLOW_dict_pair_in_dict982 = new BitSet(new long[]{0x0001000020000000L});
	public static final BitSet FOLLOW_29_in_dict987 = new BitSet(new long[]{0x000000000985C020L});
	public static final BitSet FOLLOW_dict_pair_in_dict989 = new BitSet(new long[]{0x0001000020000000L});
	public static final BitSet FOLLOW_48_in_dict993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_contained_block1015 = new BitSet(new long[]{0x0000700201044000L});
	public static final BitSet FOLLOW_block_in_contained_block1017 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_contained_block1019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_array1033 = new BitSet(new long[]{0x000080E02D85C020L});
	public static final BitSet FOLLOW_expr_in_array1035 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_29_in_array1039 = new BitSet(new long[]{0x000080600D85C020L});
	public static final BitSet FOLLOW_expr_in_array1041 = new BitSet(new long[]{0x0000008020000000L});
	public static final BitSet FOLLOW_39_in_array1045 = new BitSet(new long[]{0x0000000000000002L});
}
