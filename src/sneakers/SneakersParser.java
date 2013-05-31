// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-31 19:22:33
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
		"ASSIGN", "BLOCK", "BLOCKDECL", "CLASSDEF", "DICT", "DICT_PAIR", "EXPR", 
		"FIELDDEF", "FNCALL", "FNDECL", "FNPARAM", "ID", "INSTANCE", "INT", "KEYWORD", 
		"METHODDEF", "MUTDECL", "MUTID", "PARAM", "PARAMTYPEFN", "PARAMTYPEMUT", 
		"RET", "STRING", "TYPEID", "WS", "'#'", "'('", "')'", "','", "'.'", "':'", 
		"';'", "'<'", "'=>'", "'>'", "'@'", "'['", "']'", "'else'", "'elseif'", 
		"'extend'", "'if'", "'new'", "'pass'", "'return'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int ANONFN=4;
	public static final int ANONVAR=5;
	public static final int ARRAY=6;
	public static final int ASSIGN=7;
	public static final int BLOCK=8;
	public static final int BLOCKDECL=9;
	public static final int CLASSDEF=10;
	public static final int DICT=11;
	public static final int DICT_PAIR=12;
	public static final int EXPR=13;
	public static final int FIELDDEF=14;
	public static final int FNCALL=15;
	public static final int FNDECL=16;
	public static final int FNPARAM=17;
	public static final int ID=18;
	public static final int INSTANCE=19;
	public static final int INT=20;
	public static final int KEYWORD=21;
	public static final int METHODDEF=22;
	public static final int MUTDECL=23;
	public static final int MUTID=24;
	public static final int PARAM=25;
	public static final int PARAMTYPEFN=26;
	public static final int PARAMTYPEMUT=27;
	public static final int RET=28;
	public static final int STRING=29;
	public static final int TYPEID=30;
	public static final int WS=31;

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:50:1: prog : block ;
	public final SneakersParser.prog_return prog() throws RecognitionException {
		SneakersParser.prog_return retval = new SneakersParser.prog_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		ParserRuleReturnScope block1 =null;


		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:50:6: ( block )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:50:8: block
			{
			root_0 = (SneakersAST)adaptor.nil();


			pushFollow(FOLLOW_block_in_prog153);
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:1: block : ( stat ';' )+ -> ^( BLOCK ( stat )+ ) ;
	public final SneakersParser.block_return block() throws RecognitionException {
		SneakersParser.block_return retval = new SneakersParser.block_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal3=null;
		ParserRuleReturnScope stat2 =null;

		SneakersAST char_literal3_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:8: ( ( stat ';' )+ -> ^( BLOCK ( stat )+ ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:10: ( stat ';' )+
			{
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:10: ( stat ';' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==MUTID||LA1_0==TYPEID||LA1_0==39||LA1_0==48||(LA1_0 >= 50 && LA1_0 <= 51)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:11: stat ';'
					{
					pushFollow(FOLLOW_stat_in_block165);
					stat2=stat();
					state._fsp--;

					stream_stat.add(stat2.getTree());
					char_literal3=(Token)match(input,38,FOLLOW_38_in_block167);  
					stream_38.add(char_literal3);

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
			// 53:22: -> ^( BLOCK ( stat )+ )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:25: ^( BLOCK ( stat )+ )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:55:1: stat : ( assignment | ifstat | returnstat | mutcall | 'pass' );
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:55:6: ( assignment | ifstat | returnstat | mutcall | 'pass' )
			int alt2=5;
			switch ( input.LA(1) ) {
			case ID:
			case MUTID:
			case TYPEID:
				{
				alt2=1;
				}
				break;
			case 48:
				{
				alt2=2;
				}
				break;
			case 51:
				{
				alt2=3;
				}
				break;
			case 39:
				{
				alt2=4;
				}
				break;
			case 50:
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:55:8: assignment
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_stat186);
					assignment4=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment4.getTree());

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:56:4: ifstat
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_ifstat_in_stat191);
					ifstat5=ifstat();
					state._fsp--;

					adaptor.addChild(root_0, ifstat5.getTree());

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:4: returnstat
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_returnstat_in_stat196);
					returnstat6=returnstat();
					state._fsp--;

					adaptor.addChild(root_0, returnstat6.getTree());

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:58:4: mutcall
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_mutcall_in_stat201);
					mutcall7=mutcall();
					state._fsp--;

					adaptor.addChild(root_0, mutcall7.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:59:4: 'pass'
					{
					root_0 = (SneakersAST)adaptor.nil();


					string_literal8=(Token)match(input,50,FOLLOW_50_in_stat206); 
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:1: returnstat : ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) );
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
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:2: ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) )
			int alt3=2;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:4: 'return' fncall
					{
					string_literal9=(Token)match(input,51,FOLLOW_51_in_returnstat217);  
					stream_51.add(string_literal9);

					pushFollow(FOLLOW_fncall_in_returnstat219);
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
					// 63:20: -> ^( RET fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:63:23: ^( RET fncall )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:4: 'return' expr
					{
					string_literal11=(Token)match(input,51,FOLLOW_51_in_returnstat232);  
					stream_51.add(string_literal11);

					pushFollow(FOLLOW_expr_in_returnstat234);
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
					// 64:18: -> ^( RET expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:64:21: ^( RET expr )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:1: ifstat : 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) ;
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
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:8: ( 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:10: 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )?
			{
			string_literal13=(Token)match(input,48,FOLLOW_48_in_ifstat252);  
			stream_48.add(string_literal13);

			pushFollow(FOLLOW_expr_in_ifstat256);
			ifexpr=expr();
			state._fsp--;

			stream_expr.add(ifexpr.getTree());
			pushFollow(FOLLOW_contained_block_in_ifstat260);
			ifblock=contained_block();
			state._fsp--;

			stream_contained_block.add(ifblock.getTree());
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:68:3: ( 'elseif' elifexpr+= expr elifblock+= contained_block )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==46) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:68:4: 'elseif' elifexpr+= expr elifblock+= contained_block
					{
					string_literal14=(Token)match(input,46,FOLLOW_46_in_ifstat266);  
					stream_46.add(string_literal14);

					pushFollow(FOLLOW_expr_in_ifstat270);
					elifexpr=expr();
					state._fsp--;

					stream_expr.add(elifexpr.getTree());
					if (list_elifexpr==null) list_elifexpr=new ArrayList<Object>();
					list_elifexpr.add(elifexpr.getTree());
					pushFollow(FOLLOW_contained_block_in_ifstat274);
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

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:3: ( 'else' elseblock= contained_block )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==45) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:69:4: 'else' elseblock= contained_block
					{
					string_literal15=(Token)match(input,45,FOLLOW_45_in_ifstat282);  
					stream_45.add(string_literal15);

					pushFollow(FOLLOW_contained_block_in_ifstat286);
					elseblock=contained_block();
					state._fsp--;

					stream_contained_block.add(elseblock.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: elseblock, elifblock, ifexpr, elifexpr, ifblock, 48
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
			// 70:3: -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:6: ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot(stream_48.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ifexpr.nextTree());
				adaptor.addChild(root_1, stream_ifblock.nextTree());
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:30: ( $elifexpr $elifblock)*
				while ( stream_elifblock.hasNext()||stream_elifexpr.hasNext() ) {
					adaptor.addChild(root_1, stream_elifexpr.nextTree());
					adaptor.addChild(root_1, stream_elifblock.nextTree());
				}
				stream_elifblock.reset();
				stream_elifexpr.reset();

				// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:55: ( $elseblock)?
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:1: classdef : '{' ( fielddef )? ( ',' fielddef )* '}' -> ( fielddef )* ;
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
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_fielddef=new RewriteRuleSubtreeStream(adaptor,"rule fielddef");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:9: ( '{' ( fielddef )? ( ',' fielddef )* '}' -> ( fielddef )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:11: '{' ( fielddef )? ( ',' fielddef )* '}'
			{
			char_literal16=(Token)match(input,52,FOLLOW_52_in_classdef322);  
			stream_52.add(char_literal16);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:15: ( fielddef )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:16: fielddef
					{
					pushFollow(FOLLOW_fielddef_in_classdef325);
					fielddef17=fielddef();
					state._fsp--;

					stream_fielddef.add(fielddef17.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:27: ( ',' fielddef )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==35) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:28: ',' fielddef
					{
					char_literal18=(Token)match(input,35,FOLLOW_35_in_classdef330);  
					stream_35.add(char_literal18);

					pushFollow(FOLLOW_fielddef_in_classdef332);
					fielddef19=fielddef();
					state._fsp--;

					stream_fielddef.add(fielddef19.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

			char_literal20=(Token)match(input,53,FOLLOW_53_in_classdef336);  
			stream_53.add(char_literal20);

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
			// 72:47: -> ( fielddef )*
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:72:50: ( fielddef )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:1: assignment : ( TYPEID '=' 'class' classdef -> ^( 'class' TYPEID classdef ) |newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' classdef -> ^( 'extend' $newclass $oldclass classdef ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );
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
		RewriteRuleTokenStream stream_CLASSDEF=new RewriteRuleTokenStream(adaptor,"token CLASSDEF");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_classdef=new RewriteRuleSubtreeStream(adaptor,"rule classdef");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:2: ( TYPEID '=' 'class' classdef -> ^( 'class' TYPEID classdef ) |newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' classdef -> ^( 'extend' $newclass $oldclass classdef ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) )
			int alt8=4;
			alt8 = dfa8.predict(input);
			switch (alt8) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:4: TYPEID '=' 'class' classdef
					{
					TYPEID21=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_assignment352);  
					stream_TYPEID.add(TYPEID21);

					char_literal22=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment354);  
					stream_ASSIGN.add(char_literal22);

					string_literal23=(Token)match(input,CLASSDEF,FOLLOW_CLASSDEF_in_assignment356);  
					stream_CLASSDEF.add(string_literal23);

					pushFollow(FOLLOW_classdef_in_assignment358);
					classdef24=classdef();
					state._fsp--;

					stream_classdef.add(classdef24.getTree());
					// AST REWRITE
					// elements: CLASSDEF, classdef, TYPEID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 76:32: -> ^( 'class' TYPEID classdef )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:35: ^( 'class' TYPEID classdef )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_CLASSDEF.nextNode(), root_1);
						adaptor.addChild(root_1, stream_TYPEID.nextNode());
						adaptor.addChild(root_1, stream_classdef.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:4: newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' classdef
					{
					newclass=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_assignment375);  
					stream_TYPEID.add(newclass);

					char_literal25=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment377);  
					stream_ASSIGN.add(char_literal25);

					oldclass=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_assignment381);  
					stream_TYPEID.add(oldclass);

					char_literal26=(Token)match(input,36,FOLLOW_36_in_assignment383);  
					stream_36.add(char_literal26);

					string_literal27=(Token)match(input,47,FOLLOW_47_in_assignment385);  
					stream_47.add(string_literal27);

					pushFollow(FOLLOW_classdef_in_assignment387);
					classdef28=classdef();
					state._fsp--;

					stream_classdef.add(classdef28.getTree());
					// AST REWRITE
					// elements: oldclass, 47, classdef, newclass
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
					// 77:62: -> ^( 'extend' $newclass $oldclass classdef )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:65: ^( 'extend' $newclass $oldclass classdef )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_47.nextNode(), root_1);
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:78:4: any_id '=' expr
					{
					pushFollow(FOLLOW_any_id_in_assignment406);
					any_id29=any_id();
					state._fsp--;

					stream_any_id.add(any_id29.getTree());
					char_literal30=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment408);  
					stream_ASSIGN.add(char_literal30);

					pushFollow(FOLLOW_expr_in_assignment410);
					expr31=expr();
					state._fsp--;

					stream_expr.add(expr31.getTree());
					// AST REWRITE
					// elements: expr, any_id, ASSIGN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 78:20: -> ^( '=' any_id expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:78:23: ^( '=' any_id expr )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);
						adaptor.addChild(root_1, stream_any_id.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:79:4: any_id '=' fncall
					{
					pushFollow(FOLLOW_any_id_in_assignment425);
					any_id32=any_id();
					state._fsp--;

					stream_any_id.add(any_id32.getTree());
					char_literal33=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment427);  
					stream_ASSIGN.add(char_literal33);

					pushFollow(FOLLOW_fncall_in_assignment429);
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

					root_0 = (SneakersAST)adaptor.nil();
					// 79:22: -> ^( '=' any_id fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:79:25: ^( '=' any_id fncall )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);
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


	public static class fielddef_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "fielddef"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:1: fielddef : ( ID '=>' paramtype -> ^( FIELDDEF ID paramtype ) | ID '=>' fndecl -> ^( METHODDEF ID fndecl ) | ID '=>' mutdecl -> ^( METHODDEF ID mutdecl ) );
	public final SneakersParser.fielddef_return fielddef() throws RecognitionException {
		SneakersParser.fielddef_return retval = new SneakersParser.fielddef_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ID35=null;
		Token string_literal36=null;
		Token ID38=null;
		Token string_literal39=null;
		Token ID41=null;
		Token string_literal42=null;
		ParserRuleReturnScope paramtype37 =null;
		ParserRuleReturnScope fndecl40 =null;
		ParserRuleReturnScope mutdecl43 =null;

		SneakersAST ID35_tree=null;
		SneakersAST string_literal36_tree=null;
		SneakersAST ID38_tree=null;
		SneakersAST string_literal39_tree=null;
		SneakersAST ID41_tree=null;
		SneakersAST string_literal42_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_mutdecl=new RewriteRuleSubtreeStream(adaptor,"rule mutdecl");
		RewriteRuleSubtreeStream stream_fndecl=new RewriteRuleSubtreeStream(adaptor,"rule fndecl");
		RewriteRuleSubtreeStream stream_paramtype=new RewriteRuleSubtreeStream(adaptor,"rule paramtype");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:2: ( ID '=>' paramtype -> ^( FIELDDEF ID paramtype ) | ID '=>' fndecl -> ^( METHODDEF ID fndecl ) | ID '=>' mutdecl -> ^( METHODDEF ID mutdecl ) )
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==40) ) {
					switch ( input.LA(3) ) {
					case TYPEID:
						{
						alt9=1;
						}
						break;
					case 32:
						{
						int LA9_4 = input.LA(4);
						if ( (LA9_4==33) ) {
							switch ( input.LA(5) ) {
							case TYPEID:
								{
								alt9=1;
								}
								break;
							case 34:
								{
								int LA9_8 = input.LA(6);
								if ( (LA9_8==37) ) {
									int LA9_12 = input.LA(7);
									if ( (LA9_12==TYPEID) ) {
										int LA9_14 = input.LA(8);
										if ( (LA9_14==35||LA9_14==53) ) {
											alt9=1;
										}
										else if ( (LA9_14==43) ) {
											alt9=2;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 9, 14, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
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
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
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
								alt9=2;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
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

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
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
						break;
					case 42:
						{
						int LA9_5 = input.LA(4);
						if ( (LA9_5==33) ) {
							switch ( input.LA(5) ) {
							case TYPEID:
								{
								alt9=1;
								}
								break;
							case 34:
								{
								int LA9_10 = input.LA(6);
								if ( (LA9_10==37) ) {
									int LA9_13 = input.LA(7);
									if ( (LA9_13==TYPEID) ) {
										int LA9_15 = input.LA(8);
										if ( (LA9_15==35||LA9_15==53) ) {
											alt9=1;
										}
										else if ( (LA9_15==43) ) {
											alt9=3;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 9, 15, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
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
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
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
								break;
							case ID:
								{
								alt9=3;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 9, 7, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
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
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
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
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:4: ID '=>' paramtype
					{
					ID35=(Token)match(input,ID,FOLLOW_ID_in_fielddef452);  
					stream_ID.add(ID35);

					string_literal36=(Token)match(input,40,FOLLOW_40_in_fielddef454);  
					stream_40.add(string_literal36);

					pushFollow(FOLLOW_paramtype_in_fielddef456);
					paramtype37=paramtype();
					state._fsp--;

					stream_paramtype.add(paramtype37.getTree());
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
					// 84:22: -> ^( FIELDDEF ID paramtype )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:25: ^( FIELDDEF ID paramtype )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(FIELDDEF, "FIELDDEF"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_paramtype.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:85:4: ID '=>' fndecl
					{
					ID38=(Token)match(input,ID,FOLLOW_ID_in_fielddef471);  
					stream_ID.add(ID38);

					string_literal39=(Token)match(input,40,FOLLOW_40_in_fielddef473);  
					stream_40.add(string_literal39);

					pushFollow(FOLLOW_fndecl_in_fielddef475);
					fndecl40=fndecl();
					state._fsp--;

					stream_fndecl.add(fndecl40.getTree());
					// AST REWRITE
					// elements: fndecl, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 85:19: -> ^( METHODDEF ID fndecl )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:85:22: ^( METHODDEF ID fndecl )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(METHODDEF, "METHODDEF"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_fndecl.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:4: ID '=>' mutdecl
					{
					ID41=(Token)match(input,ID,FOLLOW_ID_in_fielddef490);  
					stream_ID.add(ID41);

					string_literal42=(Token)match(input,40,FOLLOW_40_in_fielddef492);  
					stream_40.add(string_literal42);

					pushFollow(FOLLOW_mutdecl_in_fielddef494);
					mutdecl43=mutdecl();
					state._fsp--;

					stream_mutdecl.add(mutdecl43.getTree());
					// AST REWRITE
					// elements: mutdecl, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 86:20: -> ^( METHODDEF ID mutdecl )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:86:23: ^( METHODDEF ID mutdecl )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(METHODDEF, "METHODDEF"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_mutdecl.nextTree());
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
	// $ANTLR end "fielddef"


	public static class nested_id_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "nested_id"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:1: nested_id : ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* );
	public final SneakersParser.nested_id_return nested_id() throws RecognitionException {
		SneakersParser.nested_id_return retval = new SneakersParser.nested_id_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ANONVAR44=null;
		Token char_literal45=null;
		Token char_literal48=null;
		ParserRuleReturnScope any_id46 =null;
		ParserRuleReturnScope any_id47 =null;
		ParserRuleReturnScope any_id49 =null;

		SneakersAST ANONVAR44_tree=null;
		SneakersAST char_literal45_tree=null;
		SneakersAST char_literal48_tree=null;
		RewriteRuleTokenStream stream_ANONVAR=new RewriteRuleTokenStream(adaptor,"token ANONVAR");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:2: ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:4: ANONVAR ( '.' any_id )*
					{
					ANONVAR44=(Token)match(input,ANONVAR,FOLLOW_ANONVAR_in_nested_id517);  
					stream_ANONVAR.add(ANONVAR44);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:12: ( '.' any_id )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==36) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:13: '.' any_id
							{
							char_literal45=(Token)match(input,36,FOLLOW_36_in_nested_id520);  
							stream_36.add(char_literal45);

							pushFollow(FOLLOW_any_id_in_nested_id522);
							any_id46=any_id();
							state._fsp--;

							stream_any_id.add(any_id46.getTree());
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
					// 91:26: -> ANONVAR ( any_id )*
					{
						adaptor.addChild(root_0, stream_ANONVAR.nextNode());
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:91:37: ( any_id )*
						while ( stream_any_id.hasNext() ) {
							adaptor.addChild(root_0, stream_any_id.nextTree());
						}
						stream_any_id.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:4: any_id ( '.' any_id )*
					{
					pushFollow(FOLLOW_any_id_in_nested_id536);
					any_id47=any_id();
					state._fsp--;

					stream_any_id.add(any_id47.getTree());
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:11: ( '.' any_id )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==36) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:12: '.' any_id
							{
							char_literal48=(Token)match(input,36,FOLLOW_36_in_nested_id539);  
							stream_36.add(char_literal48);

							pushFollow(FOLLOW_any_id_in_nested_id541);
							any_id49=any_id();
							state._fsp--;

							stream_any_id.add(any_id49.getTree());
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
					// 92:25: -> ( any_id )*
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:92:28: ( any_id )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:1: fncall : nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) ;
	public final SneakersParser.fncall_return fncall() throws RecognitionException {
		SneakersParser.fncall_return retval = new SneakersParser.fncall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal52=null;
		ParserRuleReturnScope nested_id50 =null;
		ParserRuleReturnScope param51 =null;
		ParserRuleReturnScope param53 =null;

		SneakersAST char_literal52_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:8: ( nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:10: nested_id param ( ( ',' )? param )*
			{
			pushFollow(FOLLOW_nested_id_in_fncall558);
			nested_id50=nested_id();
			state._fsp--;

			stream_nested_id.add(nested_id50.getTree());
			pushFollow(FOLLOW_param_in_fncall560);
			param51=param();
			state._fsp--;

			stream_param.add(param51.getTree());
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:26: ( ( ',' )? param )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==ANONVAR||LA14_0==ID||(LA14_0 >= INT && LA14_0 <= KEYWORD)||LA14_0==MUTID||(LA14_0 >= STRING && LA14_0 <= TYPEID)||(LA14_0 >= 32 && LA14_0 <= 33)||LA14_0==35||(LA14_0 >= 42 && LA14_0 <= 43)||LA14_0==49||LA14_0==52) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:27: ( ',' )? param
					{
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:27: ( ',' )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==35) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:27: ','
							{
							char_literal52=(Token)match(input,35,FOLLOW_35_in_fncall563);  
							stream_35.add(char_literal52);

							}
							break;

					}

					pushFollow(FOLLOW_param_in_fncall566);
					param53=param();
					state._fsp--;

					stream_param.add(param53.getTree());
					}
					break;

				default :
					break loop14;
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
			// 95:40: -> ^( FNCALL nested_id ( param )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:43: ^( FNCALL nested_id ( param )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(FNCALL, "FNCALL"), root_1);
				adaptor.addChild(root_1, stream_nested_id.nextTree());
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:95:62: ( param )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:98:1: param : ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) );
	public final SneakersParser.param_return param() throws RecognitionException {
		SneakersParser.param_return retval = new SneakersParser.param_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ID54=null;
		Token char_literal55=null;
		ParserRuleReturnScope expr56 =null;
		ParserRuleReturnScope expr57 =null;

		SneakersAST ID54_tree=null;
		SneakersAST char_literal55_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:98:7: ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==37) ) {
					alt15=1;
				}
				else if ( (LA15_1==ANONVAR||LA15_1==ID||(LA15_1 >= INT && LA15_1 <= KEYWORD)||LA15_1==MUTID||(LA15_1 >= STRING && LA15_1 <= TYPEID)||(LA15_1 >= 32 && LA15_1 <= 36)||LA15_1==38||(LA15_1 >= 41 && LA15_1 <= 44)||LA15_1==49||LA15_1==52) ) {
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
			else if ( (LA15_0==ANONVAR||(LA15_0 >= INT && LA15_0 <= KEYWORD)||LA15_0==MUTID||(LA15_0 >= STRING && LA15_0 <= TYPEID)||(LA15_0 >= 32 && LA15_0 <= 33)||(LA15_0 >= 42 && LA15_0 <= 43)||LA15_0==49||LA15_0==52) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:98:9: ID ':' expr
					{
					ID54=(Token)match(input,ID,FOLLOW_ID_in_param589);  
					stream_ID.add(ID54);

					char_literal55=(Token)match(input,37,FOLLOW_37_in_param591);  
					stream_37.add(char_literal55);

					pushFollow(FOLLOW_expr_in_param593);
					expr56=expr();
					state._fsp--;

					stream_expr.add(expr56.getTree());
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
					// 98:21: -> ^( PARAM ID expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:98:24: ^( PARAM ID expr )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:4: expr
					{
					pushFollow(FOLLOW_expr_in_param608);
					expr57=expr();
					state._fsp--;

					stream_expr.add(expr57.getTree());
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
					// 99:9: -> ^( PARAM expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:99:12: ^( PARAM expr )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:102:1: blockparamtype : ( '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ( TYPEID )+ | '(' ')' ':' TYPEID -> TYPEID );
	public final SneakersParser.blockparamtype_return blockparamtype() throws RecognitionException {
		SneakersParser.blockparamtype_return retval = new SneakersParser.blockparamtype_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal58=null;
		Token TYPEID59=null;
		Token char_literal60=null;
		Token TYPEID61=null;
		Token char_literal62=null;
		Token char_literal63=null;
		Token TYPEID64=null;
		Token char_literal65=null;
		Token char_literal66=null;
		Token char_literal67=null;
		Token TYPEID68=null;

		SneakersAST char_literal58_tree=null;
		SneakersAST TYPEID59_tree=null;
		SneakersAST char_literal60_tree=null;
		SneakersAST TYPEID61_tree=null;
		SneakersAST char_literal62_tree=null;
		SneakersAST char_literal63_tree=null;
		SneakersAST TYPEID64_tree=null;
		SneakersAST char_literal65_tree=null;
		SneakersAST char_literal66_tree=null;
		SneakersAST char_literal67_tree=null;
		SneakersAST TYPEID68_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:103:2: ( '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ( TYPEID )+ | '(' ')' ':' TYPEID -> TYPEID )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==33) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==TYPEID) ) {
					alt17=1;
				}
				else if ( (LA17_1==34) ) {
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:103:4: '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID
					{
					char_literal58=(Token)match(input,33,FOLLOW_33_in_blockparamtype628);  
					stream_33.add(char_literal58);

					TYPEID59=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype630);  
					stream_TYPEID.add(TYPEID59);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:103:15: ( ',' TYPEID )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==35) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:103:16: ',' TYPEID
							{
							char_literal60=(Token)match(input,35,FOLLOW_35_in_blockparamtype633);  
							stream_35.add(char_literal60);

							TYPEID61=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype635);  
							stream_TYPEID.add(TYPEID61);

							}
							break;

						default :
							break loop16;
						}
					}

					char_literal62=(Token)match(input,34,FOLLOW_34_in_blockparamtype639);  
					stream_34.add(char_literal62);

					char_literal63=(Token)match(input,37,FOLLOW_37_in_blockparamtype641);  
					stream_37.add(char_literal63);

					TYPEID64=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype643);  
					stream_TYPEID.add(TYPEID64);

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
					// 103:44: -> ( TYPEID )+
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:104:4: '(' ')' ':' TYPEID
					{
					char_literal65=(Token)match(input,33,FOLLOW_33_in_blockparamtype653);  
					stream_33.add(char_literal65);

					char_literal66=(Token)match(input,34,FOLLOW_34_in_blockparamtype655);  
					stream_34.add(char_literal66);

					char_literal67=(Token)match(input,37,FOLLOW_37_in_blockparamtype657);  
					stream_37.add(char_literal67);

					TYPEID68=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype659);  
					stream_TYPEID.add(TYPEID68);

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
					// 104:23: -> TYPEID
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:1: paramtype : ( TYPEID | '#' blockparamtype -> ^( PARAMTYPEFN blockparamtype ) | '@' blockparamtype -> ^( PARAMTYPEMUT blockparamtype ) );
	public final SneakersParser.paramtype_return paramtype() throws RecognitionException {
		SneakersParser.paramtype_return retval = new SneakersParser.paramtype_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token TYPEID69=null;
		Token char_literal70=null;
		Token char_literal72=null;
		ParserRuleReturnScope blockparamtype71 =null;
		ParserRuleReturnScope blockparamtype73 =null;

		SneakersAST TYPEID69_tree=null;
		SneakersAST char_literal70_tree=null;
		SneakersAST char_literal72_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_blockparamtype=new RewriteRuleSubtreeStream(adaptor,"rule blockparamtype");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:11: ( TYPEID | '#' blockparamtype -> ^( PARAMTYPEFN blockparamtype ) | '@' blockparamtype -> ^( PARAMTYPEMUT blockparamtype ) )
			int alt18=3;
			switch ( input.LA(1) ) {
			case TYPEID:
				{
				alt18=1;
				}
				break;
			case 32:
				{
				alt18=2;
				}
				break;
			case 42:
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:14: TYPEID
					{
					root_0 = (SneakersAST)adaptor.nil();


					TYPEID69=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype674); 
					TYPEID69_tree = (SneakersAST)adaptor.create(TYPEID69);
					adaptor.addChild(root_0, TYPEID69_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:108:4: '#' blockparamtype
					{
					char_literal70=(Token)match(input,32,FOLLOW_32_in_paramtype679);  
					stream_32.add(char_literal70);

					pushFollow(FOLLOW_blockparamtype_in_paramtype681);
					blockparamtype71=blockparamtype();
					state._fsp--;

					stream_blockparamtype.add(blockparamtype71.getTree());
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
					// 108:23: -> ^( PARAMTYPEFN blockparamtype )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:108:26: ^( PARAMTYPEFN blockparamtype )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:4: '@' blockparamtype
					{
					char_literal72=(Token)match(input,42,FOLLOW_42_in_paramtype694);  
					stream_42.add(char_literal72);

					pushFollow(FOLLOW_blockparamtype_in_paramtype696);
					blockparamtype73=blockparamtype();
					state._fsp--;

					stream_blockparamtype.add(blockparamtype73.getTree());
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
					// 109:23: -> ^( PARAMTYPEMUT blockparamtype )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:109:26: ^( PARAMTYPEMUT blockparamtype )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:1: fnparam : ID ':' paramtype -> ^( FNPARAM ID paramtype ) ;
	public final SneakersParser.fnparam_return fnparam() throws RecognitionException {
		SneakersParser.fnparam_return retval = new SneakersParser.fnparam_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token ID74=null;
		Token char_literal75=null;
		ParserRuleReturnScope paramtype76 =null;

		SneakersAST ID74_tree=null;
		SneakersAST char_literal75_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_paramtype=new RewriteRuleSubtreeStream(adaptor,"rule paramtype");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:9: ( ID ':' paramtype -> ^( FNPARAM ID paramtype ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:11: ID ':' paramtype
			{
			ID74=(Token)match(input,ID,FOLLOW_ID_in_fnparam715);  
			stream_ID.add(ID74);

			char_literal75=(Token)match(input,37,FOLLOW_37_in_fnparam717);  
			stream_37.add(char_literal75);

			pushFollow(FOLLOW_paramtype_in_fnparam719);
			paramtype76=paramtype();
			state._fsp--;

			stream_paramtype.add(paramtype76.getTree());
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
			// 112:28: -> ^( FNPARAM ID paramtype )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:112:31: ^( FNPARAM ID paramtype )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:115:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );
	public final SneakersParser.anonfn_return anonfn() throws RecognitionException {
		SneakersParser.anonfn_return retval = new SneakersParser.anonfn_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal77=null;
		Token char_literal78=null;
		Token char_literal80=null;
		Token char_literal81=null;
		Token char_literal82=null;
		Token char_literal84=null;
		ParserRuleReturnScope fncall79 =null;
		ParserRuleReturnScope nested_id83 =null;

		SneakersAST char_literal77_tree=null;
		SneakersAST char_literal78_tree=null;
		SneakersAST char_literal80_tree=null;
		SneakersAST char_literal81_tree=null;
		SneakersAST char_literal82_tree=null;
		SneakersAST char_literal84_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:115:8: ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) )
			int alt19=2;
			alt19 = dfa19.predict(input);
			switch (alt19) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:115:10: '#' '[' fncall ']'
					{
					char_literal77=(Token)match(input,32,FOLLOW_32_in_anonfn739);  
					stream_32.add(char_literal77);

					char_literal78=(Token)match(input,43,FOLLOW_43_in_anonfn741);  
					stream_43.add(char_literal78);

					pushFollow(FOLLOW_fncall_in_anonfn743);
					fncall79=fncall();
					state._fsp--;

					stream_fncall.add(fncall79.getTree());
					char_literal80=(Token)match(input,44,FOLLOW_44_in_anonfn745);  
					stream_44.add(char_literal80);

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
					// 115:29: -> ^( ANONFN fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:115:32: ^( ANONFN fncall )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:4: '#' '[' nested_id ']'
					{
					char_literal81=(Token)match(input,32,FOLLOW_32_in_anonfn758);  
					stream_32.add(char_literal81);

					char_literal82=(Token)match(input,43,FOLLOW_43_in_anonfn760);  
					stream_43.add(char_literal82);

					pushFollow(FOLLOW_nested_id_in_anonfn762);
					nested_id83=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id83.getTree());
					char_literal84=(Token)match(input,44,FOLLOW_44_in_anonfn764);  
					stream_44.add(char_literal84);

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
					// 116:26: -> ^( ANONFN nested_id )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:116:29: ^( ANONFN nested_id )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:119:1: blockdecl : ( '(' ')' ':' TYPEID contained_block -> TYPEID contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ':' TYPEID contained_block -> TYPEID ( fnparam )* contained_block );
	public final SneakersParser.blockdecl_return blockdecl() throws RecognitionException {
		SneakersParser.blockdecl_return retval = new SneakersParser.blockdecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal85=null;
		Token char_literal86=null;
		Token char_literal87=null;
		Token TYPEID88=null;
		Token char_literal90=null;
		Token char_literal92=null;
		Token char_literal94=null;
		Token char_literal95=null;
		Token TYPEID96=null;
		ParserRuleReturnScope contained_block89 =null;
		ParserRuleReturnScope fnparam91 =null;
		ParserRuleReturnScope fnparam93 =null;
		ParserRuleReturnScope contained_block97 =null;

		SneakersAST char_literal85_tree=null;
		SneakersAST char_literal86_tree=null;
		SneakersAST char_literal87_tree=null;
		SneakersAST TYPEID88_tree=null;
		SneakersAST char_literal90_tree=null;
		SneakersAST char_literal92_tree=null;
		SneakersAST char_literal94_tree=null;
		SneakersAST char_literal95_tree=null;
		SneakersAST TYPEID96_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_fnparam=new RewriteRuleSubtreeStream(adaptor,"rule fnparam");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:120:2: ( '(' ')' ':' TYPEID contained_block -> TYPEID contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ':' TYPEID contained_block -> TYPEID ( fnparam )* contained_block )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==33) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==34) ) {
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:120:4: '(' ')' ':' TYPEID contained_block
					{
					char_literal85=(Token)match(input,33,FOLLOW_33_in_blockdecl783);  
					stream_33.add(char_literal85);

					char_literal86=(Token)match(input,34,FOLLOW_34_in_blockdecl785);  
					stream_34.add(char_literal86);

					char_literal87=(Token)match(input,37,FOLLOW_37_in_blockdecl787);  
					stream_37.add(char_literal87);

					TYPEID88=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl789);  
					stream_TYPEID.add(TYPEID88);

					pushFollow(FOLLOW_contained_block_in_blockdecl791);
					contained_block89=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block89.getTree());
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
					// 120:39: -> TYPEID contained_block
					{
						adaptor.addChild(root_0, stream_TYPEID.nextNode());
						adaptor.addChild(root_0, stream_contained_block.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:4: '(' fnparam ( ( ',' )? fnparam )* ')' ':' TYPEID contained_block
					{
					char_literal90=(Token)match(input,33,FOLLOW_33_in_blockdecl802);  
					stream_33.add(char_literal90);

					pushFollow(FOLLOW_fnparam_in_blockdecl804);
					fnparam91=fnparam();
					state._fsp--;

					stream_fnparam.add(fnparam91.getTree());
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:16: ( ( ',' )? fnparam )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==ID||LA21_0==35) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:17: ( ',' )? fnparam
							{
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:17: ( ',' )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==35) ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:17: ','
									{
									char_literal92=(Token)match(input,35,FOLLOW_35_in_blockdecl807);  
									stream_35.add(char_literal92);

									}
									break;

							}

							pushFollow(FOLLOW_fnparam_in_blockdecl810);
							fnparam93=fnparam();
							state._fsp--;

							stream_fnparam.add(fnparam93.getTree());
							}
							break;

						default :
							break loop21;
						}
					}

					char_literal94=(Token)match(input,34,FOLLOW_34_in_blockdecl814);  
					stream_34.add(char_literal94);

					char_literal95=(Token)match(input,37,FOLLOW_37_in_blockdecl816);  
					stream_37.add(char_literal95);

					TYPEID96=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl818);  
					stream_TYPEID.add(TYPEID96);

					pushFollow(FOLLOW_contained_block_in_blockdecl820);
					contained_block97=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block97.getTree());
					// AST REWRITE
					// elements: fnparam, contained_block, TYPEID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 121:63: -> TYPEID ( fnparam )* contained_block
					{
						adaptor.addChild(root_0, stream_TYPEID.nextNode());
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:121:73: ( fnparam )*
						while ( stream_fnparam.hasNext() ) {
							adaptor.addChild(root_0, stream_fnparam.nextTree());
						}
						stream_fnparam.reset();

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:124:1: fndecl : '#' blockdecl -> ^( FNDECL blockdecl ) ;
	public final SneakersParser.fndecl_return fndecl() throws RecognitionException {
		SneakersParser.fndecl_return retval = new SneakersParser.fndecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal98=null;
		ParserRuleReturnScope blockdecl99 =null;

		SneakersAST char_literal98_tree=null;
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:124:8: ( '#' blockdecl -> ^( FNDECL blockdecl ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:124:10: '#' blockdecl
			{
			char_literal98=(Token)match(input,32,FOLLOW_32_in_fndecl839);  
			stream_32.add(char_literal98);

			pushFollow(FOLLOW_blockdecl_in_fndecl841);
			blockdecl99=blockdecl();
			state._fsp--;

			stream_blockdecl.add(blockdecl99.getTree());
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
			// 124:24: -> ^( FNDECL blockdecl )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:124:27: ^( FNDECL blockdecl )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:1: mutdecl : '@' blockdecl -> ^( MUTDECL blockdecl ) ;
	public final SneakersParser.mutdecl_return mutdecl() throws RecognitionException {
		SneakersParser.mutdecl_return retval = new SneakersParser.mutdecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal100=null;
		ParserRuleReturnScope blockdecl101 =null;

		SneakersAST char_literal100_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:9: ( '@' blockdecl -> ^( MUTDECL blockdecl ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:11: '@' blockdecl
			{
			char_literal100=(Token)match(input,42,FOLLOW_42_in_mutdecl859);  
			stream_42.add(char_literal100);

			pushFollow(FOLLOW_blockdecl_in_mutdecl861);
			blockdecl101=blockdecl();
			state._fsp--;

			stream_blockdecl.add(blockdecl101.getTree());
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
			// 127:25: -> ^( MUTDECL blockdecl )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:127:28: ^( MUTDECL blockdecl )
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


	public static class instance_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "instance"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:130:1: instance : 'new' TYPEID dict -> ^( INSTANCE TYPEID dict ) ;
	public final SneakersParser.instance_return instance() throws RecognitionException {
		SneakersParser.instance_return retval = new SneakersParser.instance_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token string_literal102=null;
		Token TYPEID103=null;
		ParserRuleReturnScope dict104 =null;

		SneakersAST string_literal102_tree=null;
		SneakersAST TYPEID103_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleSubtreeStream stream_dict=new RewriteRuleSubtreeStream(adaptor,"rule dict");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:2: ( 'new' TYPEID dict -> ^( INSTANCE TYPEID dict ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:4: 'new' TYPEID dict
			{
			string_literal102=(Token)match(input,49,FOLLOW_49_in_instance880);  
			stream_49.add(string_literal102);

			TYPEID103=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_instance882);  
			stream_TYPEID.add(TYPEID103);

			pushFollow(FOLLOW_dict_in_instance884);
			dict104=dict();
			state._fsp--;

			stream_dict.add(dict104.getTree());
			// AST REWRITE
			// elements: dict, TYPEID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (SneakersAST)adaptor.nil();
			// 131:22: -> ^( INSTANCE TYPEID dict )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:25: ^( INSTANCE TYPEID dict )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(INSTANCE, "INSTANCE"), root_1);
				adaptor.addChild(root_1, stream_TYPEID.nextNode());
				adaptor.addChild(root_1, stream_dict.nextTree());
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
	// $ANTLR end "instance"


	public static class expr_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:1: expr : ( instance | index_expr | dict | fndecl | mutdecl | anonfn | array );
	public final SneakersParser.expr_return expr() throws RecognitionException {
		SneakersParser.expr_return retval = new SneakersParser.expr_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		ParserRuleReturnScope instance105 =null;
		ParserRuleReturnScope index_expr106 =null;
		ParserRuleReturnScope dict107 =null;
		ParserRuleReturnScope fndecl108 =null;
		ParserRuleReturnScope mutdecl109 =null;
		ParserRuleReturnScope anonfn110 =null;
		ParserRuleReturnScope array111 =null;


		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:6: ( instance | index_expr | dict | fndecl | mutdecl | anonfn | array )
			int alt23=7;
			switch ( input.LA(1) ) {
			case 49:
				{
				alt23=1;
				}
				break;
			case ANONVAR:
			case ID:
			case INT:
			case KEYWORD:
			case MUTID:
			case STRING:
			case TYPEID:
			case 33:
				{
				alt23=2;
				}
				break;
			case 52:
				{
				alt23=3;
				}
				break;
			case 32:
				{
				int LA23_4 = input.LA(2);
				if ( (LA23_4==43) ) {
					alt23=6;
				}
				else if ( (LA23_4==33) ) {
					alt23=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 42:
				{
				alt23=5;
				}
				break;
			case 43:
				{
				alt23=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:134:8: instance
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_instance_in_expr904);
					instance105=instance();
					state._fsp--;

					adaptor.addChild(root_0, instance105.getTree());

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:135:4: index_expr
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_index_expr_in_expr909);
					index_expr106=index_expr();
					state._fsp--;

					adaptor.addChild(root_0, index_expr106.getTree());

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:136:4: dict
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_dict_in_expr914);
					dict107=dict();
					state._fsp--;

					adaptor.addChild(root_0, dict107.getTree());

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:137:4: fndecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_fndecl_in_expr919);
					fndecl108=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl108.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:138:4: mutdecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_mutdecl_in_expr924);
					mutdecl109=mutdecl();
					state._fsp--;

					adaptor.addChild(root_0, mutdecl109.getTree());

					}
					break;
				case 6 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:139:4: anonfn
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_anonfn_in_expr929);
					anonfn110=anonfn();
					state._fsp--;

					adaptor.addChild(root_0, anonfn110.getTree());

					}
					break;
				case 7 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:140:4: array
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_array_in_expr934);
					array111=array();
					state._fsp--;

					adaptor.addChild(root_0, array111.getTree());

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:143:1: standalone_fncall : ( '(' nested_id ')' -> ^( FNCALL nested_id ) | '(' fncall ')' -> fncall );
	public final SneakersParser.standalone_fncall_return standalone_fncall() throws RecognitionException {
		SneakersParser.standalone_fncall_return retval = new SneakersParser.standalone_fncall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal112=null;
		Token char_literal114=null;
		Token char_literal115=null;
		Token char_literal117=null;
		ParserRuleReturnScope nested_id113 =null;
		ParserRuleReturnScope fncall116 =null;

		SneakersAST char_literal112_tree=null;
		SneakersAST char_literal114_tree=null;
		SneakersAST char_literal115_tree=null;
		SneakersAST char_literal117_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:144:2: ( '(' nested_id ')' -> ^( FNCALL nested_id ) | '(' fncall ')' -> fncall )
			int alt24=2;
			alt24 = dfa24.predict(input);
			switch (alt24) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:144:4: '(' nested_id ')'
					{
					char_literal112=(Token)match(input,33,FOLLOW_33_in_standalone_fncall945);  
					stream_33.add(char_literal112);

					pushFollow(FOLLOW_nested_id_in_standalone_fncall947);
					nested_id113=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id113.getTree());
					char_literal114=(Token)match(input,34,FOLLOW_34_in_standalone_fncall949);  
					stream_34.add(char_literal114);

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
					// 144:22: -> ^( FNCALL nested_id )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:144:25: ^( FNCALL nested_id )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(FNCALL, "FNCALL"), root_1);
						adaptor.addChild(root_1, stream_nested_id.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:145:4: '(' fncall ')'
					{
					char_literal115=(Token)match(input,33,FOLLOW_33_in_standalone_fncall962);  
					stream_33.add(char_literal115);

					pushFollow(FOLLOW_fncall_in_standalone_fncall964);
					fncall116=fncall();
					state._fsp--;

					stream_fncall.add(fncall116.getTree());
					char_literal117=(Token)match(input,34,FOLLOW_34_in_standalone_fncall966);  
					stream_34.add(char_literal117);

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
					// 145:19: -> fncall
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
	// $ANTLR end "standalone_fncall"


	public static class mutcall_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "mutcall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:148:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );
	public final SneakersParser.mutcall_return mutcall() throws RecognitionException {
		SneakersParser.mutcall_return retval = new SneakersParser.mutcall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal118=null;
		Token char_literal120=null;
		Token char_literal121=null;
		Token char_literal123=null;
		ParserRuleReturnScope nested_id119 =null;
		ParserRuleReturnScope fncall122 =null;

		SneakersAST char_literal118_tree=null;
		SneakersAST char_literal120_tree=null;
		SneakersAST char_literal121_tree=null;
		SneakersAST char_literal123_tree=null;
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:148:9: ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall )
			int alt25=2;
			alt25 = dfa25.predict(input);
			switch (alt25) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:148:11: '<' nested_id '>'
					{
					char_literal118=(Token)match(input,39,FOLLOW_39_in_mutcall980);  
					stream_39.add(char_literal118);

					pushFollow(FOLLOW_nested_id_in_mutcall982);
					nested_id119=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id119.getTree());
					char_literal120=(Token)match(input,41,FOLLOW_41_in_mutcall984);  
					stream_41.add(char_literal120);

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
					// 148:29: -> nested_id
					{
						adaptor.addChild(root_0, stream_nested_id.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:149:4: '<' fncall '>'
					{
					char_literal121=(Token)match(input,39,FOLLOW_39_in_mutcall993);  
					stream_39.add(char_literal121);

					pushFollow(FOLLOW_fncall_in_mutcall995);
					fncall122=fncall();
					state._fsp--;

					stream_fncall.add(fncall122.getTree());
					char_literal123=(Token)match(input,41,FOLLOW_41_in_mutcall997);  
					stream_41.add(char_literal123);

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
					// 149:19: -> fncall
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:152:1: index_expr : ( KEYWORD | INT | STRING | nested_id | standalone_fncall );
	public final SneakersParser.index_expr_return index_expr() throws RecognitionException {
		SneakersParser.index_expr_return retval = new SneakersParser.index_expr_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token KEYWORD124=null;
		Token INT125=null;
		Token STRING126=null;
		ParserRuleReturnScope nested_id127 =null;
		ParserRuleReturnScope standalone_fncall128 =null;

		SneakersAST KEYWORD124_tree=null;
		SneakersAST INT125_tree=null;
		SneakersAST STRING126_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:153:2: ( KEYWORD | INT | STRING | nested_id | standalone_fncall )
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
			case 33:
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:153:4: KEYWORD
					{
					root_0 = (SneakersAST)adaptor.nil();


					KEYWORD124=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_index_expr1012); 
					KEYWORD124_tree = (SneakersAST)adaptor.create(KEYWORD124);
					adaptor.addChild(root_0, KEYWORD124_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:154:4: INT
					{
					root_0 = (SneakersAST)adaptor.nil();


					INT125=(Token)match(input,INT,FOLLOW_INT_in_index_expr1017); 
					INT125_tree = (SneakersAST)adaptor.create(INT125);
					adaptor.addChild(root_0, INT125_tree);

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:155:4: STRING
					{
					root_0 = (SneakersAST)adaptor.nil();


					STRING126=(Token)match(input,STRING,FOLLOW_STRING_in_index_expr1022); 
					STRING126_tree = (SneakersAST)adaptor.create(STRING126);
					adaptor.addChild(root_0, STRING126_tree);

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:156:4: nested_id
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_nested_id_in_index_expr1027);
					nested_id127=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id127.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:157:4: standalone_fncall
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_standalone_fncall_in_index_expr1032);
					standalone_fncall128=standalone_fncall();
					state._fsp--;

					adaptor.addChild(root_0, standalone_fncall128.getTree());

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:160:1: dict_pair : index_expr '=>' expr -> ^( DICT_PAIR index_expr expr ) ;
	public final SneakersParser.dict_pair_return dict_pair() throws RecognitionException {
		SneakersParser.dict_pair_return retval = new SneakersParser.dict_pair_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token string_literal130=null;
		ParserRuleReturnScope index_expr129 =null;
		ParserRuleReturnScope expr131 =null;

		SneakersAST string_literal130_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:161:2: ( index_expr '=>' expr -> ^( DICT_PAIR index_expr expr ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:161:4: index_expr '=>' expr
			{
			pushFollow(FOLLOW_index_expr_in_dict_pair1044);
			index_expr129=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr129.getTree());
			string_literal130=(Token)match(input,40,FOLLOW_40_in_dict_pair1046);  
			stream_40.add(string_literal130);

			pushFollow(FOLLOW_expr_in_dict_pair1048);
			expr131=expr();
			state._fsp--;

			stream_expr.add(expr131.getTree());
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
			// 161:25: -> ^( DICT_PAIR index_expr expr )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:161:28: ^( DICT_PAIR index_expr expr )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(DICT_PAIR, "DICT_PAIR"), root_1);
				adaptor.addChild(root_1, stream_index_expr.nextTree());
				adaptor.addChild(root_1, stream_expr.nextTree());
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
	// $ANTLR end "dict_pair"


	public static class dict_return extends ParserRuleReturnScope {
		SneakersAST tree;
		@Override
		public SneakersAST getTree() { return tree; }
	};


	// $ANTLR start "dict"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:1: dict : '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) ;
	public final SneakersParser.dict_return dict() throws RecognitionException {
		SneakersParser.dict_return retval = new SneakersParser.dict_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal132=null;
		Token char_literal134=null;
		Token char_literal136=null;
		ParserRuleReturnScope dict_pair133 =null;
		ParserRuleReturnScope dict_pair135 =null;

		SneakersAST char_literal132_tree=null;
		SneakersAST char_literal134_tree=null;
		SneakersAST char_literal136_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_dict_pair=new RewriteRuleSubtreeStream(adaptor,"rule dict_pair");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:6: ( '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:8: '{' ( dict_pair )? ( ',' dict_pair )* '}'
			{
			char_literal132=(Token)match(input,52,FOLLOW_52_in_dict1068);  
			stream_52.add(char_literal132);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:12: ( dict_pair )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==ANONVAR||LA27_0==ID||(LA27_0 >= INT && LA27_0 <= KEYWORD)||LA27_0==MUTID||(LA27_0 >= STRING && LA27_0 <= TYPEID)||LA27_0==33) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:13: dict_pair
					{
					pushFollow(FOLLOW_dict_pair_in_dict1071);
					dict_pair133=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair133.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:25: ( ',' dict_pair )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==35) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:26: ',' dict_pair
					{
					char_literal134=(Token)match(input,35,FOLLOW_35_in_dict1076);  
					stream_35.add(char_literal134);

					pushFollow(FOLLOW_dict_pair_in_dict1078);
					dict_pair135=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair135.getTree());
					}
					break;

				default :
					break loop28;
				}
			}

			char_literal136=(Token)match(input,53,FOLLOW_53_in_dict1082);  
			stream_53.add(char_literal136);

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
			// 164:46: -> ^( DICT ( dict_pair )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:49: ^( DICT ( dict_pair )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(DICT, "DICT"), root_1);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:56: ( dict_pair )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:167:1: contained_block : '[' block ']' -> block ;
	public final SneakersParser.contained_block_return contained_block() throws RecognitionException {
		SneakersParser.contained_block_return retval = new SneakersParser.contained_block_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal137=null;
		Token char_literal139=null;
		ParserRuleReturnScope block138 =null;

		SneakersAST char_literal137_tree=null;
		SneakersAST char_literal139_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:168:2: ( '[' block ']' -> block )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:168:4: '[' block ']'
			{
			char_literal137=(Token)match(input,43,FOLLOW_43_in_contained_block1104);  
			stream_43.add(char_literal137);

			pushFollow(FOLLOW_block_in_contained_block1106);
			block138=block();
			state._fsp--;

			stream_block.add(block138.getTree());
			char_literal139=(Token)match(input,44,FOLLOW_44_in_contained_block1108);  
			stream_44.add(char_literal139);

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
			// 168:18: -> block
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:171:1: array : '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) ;
	public final SneakersParser.array_return array() throws RecognitionException {
		SneakersParser.array_return retval = new SneakersParser.array_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal140=null;
		Token char_literal142=null;
		Token char_literal144=null;
		ParserRuleReturnScope expr141 =null;
		ParserRuleReturnScope expr143 =null;

		SneakersAST char_literal140_tree=null;
		SneakersAST char_literal142_tree=null;
		SneakersAST char_literal144_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:171:7: ( '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:171:9: '[' ( expr )? ( ',' expr )* ']'
			{
			char_literal140=(Token)match(input,43,FOLLOW_43_in_array1122);  
			stream_43.add(char_literal140);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:171:13: ( expr )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ANONVAR||LA29_0==ID||(LA29_0 >= INT && LA29_0 <= KEYWORD)||LA29_0==MUTID||(LA29_0 >= STRING && LA29_0 <= TYPEID)||(LA29_0 >= 32 && LA29_0 <= 33)||(LA29_0 >= 42 && LA29_0 <= 43)||LA29_0==49||LA29_0==52) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:171:13: expr
					{
					pushFollow(FOLLOW_expr_in_array1124);
					expr141=expr();
					state._fsp--;

					stream_expr.add(expr141.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:171:19: ( ',' expr )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==35) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:171:20: ',' expr
					{
					char_literal142=(Token)match(input,35,FOLLOW_35_in_array1128);  
					stream_35.add(char_literal142);

					pushFollow(FOLLOW_expr_in_array1130);
					expr143=expr();
					state._fsp--;

					stream_expr.add(expr143.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			char_literal144=(Token)match(input,44,FOLLOW_44_in_array1134);  
			stream_44.add(char_literal144);

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
			// 171:35: -> ^( ARRAY ( expr )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:171:38: ^( ARRAY ( expr )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(ARRAY, "ARRAY"), root_1);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:171:46: ( expr )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:190:1: any_id : ( ID | MUTID | TYPEID );
	public final SneakersParser.any_id_return any_id() throws RecognitionException {
		SneakersParser.any_id_return retval = new SneakersParser.any_id_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token set145=null;

		SneakersAST set145_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:191:2: ( ID | MUTID | TYPEID )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:
			{
			root_0 = (SneakersAST)adaptor.nil();


			set145=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==MUTID||input.LA(1)==TYPEID ) {
				input.consume();
				adaptor.addChild(root_0, (SneakersAST)adaptor.create(set145));
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
	protected DFA24 dfa24 = new DFA24(this);
	protected DFA25 dfa25 = new DFA25(this);
	static final String DFA3_eotS =
		"\12\uffff";
	static final String DFA3_eofS =
		"\12\uffff";
	static final String DFA3_minS =
		"\1\63\3\5\1\uffff\1\22\1\uffff\1\22\2\5";
	static final String DFA3_maxS =
		"\1\63\3\64\1\uffff\1\36\1\uffff\1\36\2\64";
	static final String DFA3_acceptS =
		"\4\uffff\1\2\1\uffff\1\1\3\uffff";
	static final String DFA3_specialS =
		"\12\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1",
			"\1\2\14\uffff\1\3\1\uffff\2\4\2\uffff\1\3\4\uffff\1\4\1\3\1\uffff\2"+
			"\4\10\uffff\2\4\5\uffff\1\4\2\uffff\1\4",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2"+
			"\uffff\1\5\1\uffff\1\4\3\uffff\2\6\5\uffff\1\6\2\uffff\1\6",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2"+
			"\uffff\1\7\1\uffff\1\4\3\uffff\2\6\5\uffff\1\6\2\uffff\1\6",
			"",
			"\1\10\5\uffff\1\10\5\uffff\1\10",
			"",
			"\1\11\5\uffff\1\11\5\uffff\1\11",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2"+
			"\uffff\1\5\1\uffff\1\4\3\uffff\2\6\5\uffff\1\6\2\uffff\1\6",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2"+
			"\uffff\1\7\1\uffff\1\4\3\uffff\2\6\5\uffff\1\6\2\uffff\1\6"
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
			return "62:1: returnstat : ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) );";
		}
	}

	static final String DFA8_eotS =
		"\21\uffff";
	static final String DFA8_eofS =
		"\21\uffff";
	static final String DFA8_minS =
		"\1\22\2\7\2\5\1\uffff\1\5\1\uffff\2\5\1\22\1\uffff\2\22\1\uffff\2\5";
	static final String DFA8_maxS =
		"\1\36\2\7\2\64\1\uffff\1\64\1\uffff\2\64\1\57\1\uffff\2\36\1\uffff\2\64";
	static final String DFA8_acceptS =
		"\5\uffff\1\1\1\uffff\1\3\3\uffff\1\4\2\uffff\1\2\2\uffff";
	static final String DFA8_specialS =
		"\21\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\2\5\uffff\1\2\5\uffff\1\1",
			"\1\3",
			"\1\4",
			"\1\10\4\uffff\1\5\7\uffff\1\11\1\uffff\2\7\2\uffff\1\11\4\uffff\1\7"+
			"\1\6\1\uffff\2\7\10\uffff\2\7\5\uffff\1\7\2\uffff\1\7",
			"\1\10\14\uffff\1\11\1\uffff\2\7\2\uffff\1\11\4\uffff\1\7\1\11\1\uffff"+
			"\2\7\10\uffff\2\7\5\uffff\1\7\2\uffff\1\7",
			"",
			"\1\13\14\uffff\1\13\1\uffff\2\13\2\uffff\1\13\4\uffff\2\13\1\uffff\2"+
			"\13\2\uffff\1\12\1\uffff\1\7\3\uffff\2\13\5\uffff\1\13\2\uffff\1\13",
			"",
			"\1\13\14\uffff\1\13\1\uffff\2\13\2\uffff\1\13\4\uffff\2\13\1\uffff\2"+
			"\13\2\uffff\1\14\1\uffff\1\7\3\uffff\2\13\5\uffff\1\13\2\uffff\1\13",
			"\1\13\14\uffff\1\13\1\uffff\2\13\2\uffff\1\13\4\uffff\2\13\1\uffff\2"+
			"\13\2\uffff\1\15\1\uffff\1\7\3\uffff\2\13\5\uffff\1\13\2\uffff\1\13",
			"\1\17\5\uffff\1\17\5\uffff\1\17\20\uffff\1\16",
			"",
			"\1\20\5\uffff\1\20\5\uffff\1\20",
			"\1\17\5\uffff\1\17\5\uffff\1\17",
			"",
			"\1\13\14\uffff\1\13\1\uffff\2\13\2\uffff\1\13\4\uffff\2\13\1\uffff\2"+
			"\13\2\uffff\1\15\1\uffff\1\7\3\uffff\2\13\5\uffff\1\13\2\uffff\1\13",
			"\1\13\14\uffff\1\13\1\uffff\2\13\2\uffff\1\13\4\uffff\2\13\1\uffff\2"+
			"\13\2\uffff\1\14\1\uffff\1\7\3\uffff\2\13\5\uffff\1\13\2\uffff\1\13"
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
			return "75:1: assignment : ( TYPEID '=' 'class' classdef -> ^( 'class' TYPEID classdef ) |newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' classdef -> ^( 'extend' $newclass $oldclass classdef ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );";
		}
	}

	static final String DFA19_eotS =
		"\13\uffff";
	static final String DFA19_eofS =
		"\13\uffff";
	static final String DFA19_minS =
		"\1\40\1\53\3\5\1\22\2\uffff\1\22\2\5";
	static final String DFA19_maxS =
		"\1\40\1\53\1\36\2\64\1\36\2\uffff\1\36\2\64";
	static final String DFA19_acceptS =
		"\6\uffff\1\1\1\2\3\uffff";
	static final String DFA19_specialS =
		"\13\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\14\uffff\1\4\5\uffff\1\4\5\uffff\1\4",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2"+
			"\uffff\1\5\5\uffff\2\6\1\7\4\uffff\1\6\2\uffff\1\6",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2"+
			"\uffff\1\10\5\uffff\2\6\1\7\4\uffff\1\6\2\uffff\1\6",
			"\1\11\5\uffff\1\11\5\uffff\1\11",
			"",
			"",
			"\1\12\5\uffff\1\12\5\uffff\1\12",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2"+
			"\uffff\1\5\5\uffff\2\6\1\7\4\uffff\1\6\2\uffff\1\6",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2"+
			"\uffff\1\10\5\uffff\2\6\1\7\4\uffff\1\6\2\uffff\1\6"
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
			return "115:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );";
		}
	}

	static final String DFA24_eotS =
		"\12\uffff";
	static final String DFA24_eofS =
		"\12\uffff";
	static final String DFA24_minS =
		"\1\41\3\5\1\22\2\uffff\1\22\2\5";
	static final String DFA24_maxS =
		"\1\41\1\36\2\64\1\36\2\uffff\1\36\2\64";
	static final String DFA24_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA24_specialS =
		"\12\uffff}>";
	static final String[] DFA24_transitionS = {
			"\1\1",
			"\1\2\14\uffff\1\3\5\uffff\1\3\5\uffff\1\3",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\1"+
			"\5\1\uffff\1\4\5\uffff\2\6\5\uffff\1\6\2\uffff\1\6",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\1"+
			"\5\1\uffff\1\7\5\uffff\2\6\5\uffff\1\6\2\uffff\1\6",
			"\1\10\5\uffff\1\10\5\uffff\1\10",
			"",
			"",
			"\1\11\5\uffff\1\11\5\uffff\1\11",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\1"+
			"\5\1\uffff\1\4\5\uffff\2\6\5\uffff\1\6\2\uffff\1\6",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\1"+
			"\5\1\uffff\1\7\5\uffff\2\6\5\uffff\1\6\2\uffff\1\6"
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
			return "143:1: standalone_fncall : ( '(' nested_id ')' -> ^( FNCALL nested_id ) | '(' fncall ')' -> fncall );";
		}
	}

	static final String DFA25_eotS =
		"\12\uffff";
	static final String DFA25_eofS =
		"\12\uffff";
	static final String DFA25_minS =
		"\1\47\3\5\1\22\2\uffff\1\22\2\5";
	static final String DFA25_maxS =
		"\1\47\1\36\2\64\1\36\2\uffff\1\36\2\64";
	static final String DFA25_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA25_specialS =
		"\12\uffff}>";
	static final String[] DFA25_transitionS = {
			"\1\1",
			"\1\2\14\uffff\1\3\5\uffff\1\3\5\uffff\1\3",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2"+
			"\uffff\1\4\4\uffff\1\5\2\6\5\uffff\1\6\2\uffff\1\6",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2"+
			"\uffff\1\7\4\uffff\1\5\2\6\5\uffff\1\6\2\uffff\1\6",
			"\1\10\5\uffff\1\10\5\uffff\1\10",
			"",
			"",
			"\1\11\5\uffff\1\11\5\uffff\1\11",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2"+
			"\uffff\1\4\4\uffff\1\5\2\6\5\uffff\1\6\2\uffff\1\6",
			"\1\6\14\uffff\1\6\1\uffff\2\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2"+
			"\uffff\1\7\4\uffff\1\5\2\6\5\uffff\1\6\2\uffff\1\6"
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
			return "148:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );";
		}
	}

	public static final BitSet FOLLOW_block_in_prog153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_block165 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_block167 = new BitSet(new long[]{0x000D008041040002L});
	public static final BitSet FOLLOW_assignment_in_stat186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_stat196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutcall_in_stat201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_stat206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_returnstat217 = new BitSet(new long[]{0x0000000041040020L});
	public static final BitSet FOLLOW_fncall_in_returnstat219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_returnstat232 = new BitSet(new long[]{0x00120C0361340020L});
	public static final BitSet FOLLOW_expr_in_returnstat234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_ifstat252 = new BitSet(new long[]{0x00120C0361340020L});
	public static final BitSet FOLLOW_expr_in_ifstat256 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat260 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_46_in_ifstat266 = new BitSet(new long[]{0x00120C0361340020L});
	public static final BitSet FOLLOW_expr_in_ifstat270 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat274 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_45_in_ifstat282 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_classdef322 = new BitSet(new long[]{0x0020000800040000L});
	public static final BitSet FOLLOW_fielddef_in_classdef325 = new BitSet(new long[]{0x0020000800000000L});
	public static final BitSet FOLLOW_35_in_classdef330 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_fielddef_in_classdef332 = new BitSet(new long[]{0x0020000800000000L});
	public static final BitSet FOLLOW_53_in_classdef336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_assignment352 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment354 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSDEF_in_assignment356 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_classdef_in_assignment358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_assignment375 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment377 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TYPEID_in_assignment381 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_assignment383 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_assignment385 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_classdef_in_assignment387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment406 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment408 = new BitSet(new long[]{0x00120C0361340020L});
	public static final BitSet FOLLOW_expr_in_assignment410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment425 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment427 = new BitSet(new long[]{0x0000000041040020L});
	public static final BitSet FOLLOW_fncall_in_assignment429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fielddef452 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_fielddef454 = new BitSet(new long[]{0x0000040140000000L});
	public static final BitSet FOLLOW_paramtype_in_fielddef456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fielddef471 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_fielddef473 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_fndecl_in_fielddef475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fielddef490 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_fielddef492 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_mutdecl_in_fielddef494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANONVAR_in_nested_id517 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_nested_id520 = new BitSet(new long[]{0x0000000041040000L});
	public static final BitSet FOLLOW_any_id_in_nested_id522 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_any_id_in_nested_id536 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_nested_id539 = new BitSet(new long[]{0x0000000041040000L});
	public static final BitSet FOLLOW_any_id_in_nested_id541 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_nested_id_in_fncall558 = new BitSet(new long[]{0x00120C0361340020L});
	public static final BitSet FOLLOW_param_in_fncall560 = new BitSet(new long[]{0x00120C0B61340022L});
	public static final BitSet FOLLOW_35_in_fncall563 = new BitSet(new long[]{0x00120C0361340020L});
	public static final BitSet FOLLOW_param_in_fncall566 = new BitSet(new long[]{0x00120C0B61340022L});
	public static final BitSet FOLLOW_ID_in_param589 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_param591 = new BitSet(new long[]{0x00120C0361340020L});
	public static final BitSet FOLLOW_expr_in_param593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_param608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_blockparamtype628 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype630 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_35_in_blockparamtype633 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype635 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_34_in_blockparamtype639 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_blockparamtype641 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_blockparamtype653 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_blockparamtype655 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_blockparamtype657 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_paramtype679 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_blockparamtype_in_paramtype681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_paramtype694 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_blockparamtype_in_paramtype696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fnparam715 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_fnparam717 = new BitSet(new long[]{0x0000040140000000L});
	public static final BitSet FOLLOW_paramtype_in_fnparam719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_anonfn739 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_anonfn741 = new BitSet(new long[]{0x0000000041040020L});
	public static final BitSet FOLLOW_fncall_in_anonfn743 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_anonfn745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_anonfn758 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_anonfn760 = new BitSet(new long[]{0x0000000041040020L});
	public static final BitSet FOLLOW_nested_id_in_anonfn762 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_anonfn764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_blockdecl783 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_blockdecl785 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_blockdecl787 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl789 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_blockdecl802 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl804 = new BitSet(new long[]{0x0000000C00040000L});
	public static final BitSet FOLLOW_35_in_blockdecl807 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl810 = new BitSet(new long[]{0x0000000C00040000L});
	public static final BitSet FOLLOW_34_in_blockdecl814 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_blockdecl816 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl818 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_fndecl839 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_blockdecl_in_fndecl841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_mutdecl859 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_blockdecl_in_mutdecl861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_instance880 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TYPEID_in_instance882 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_dict_in_instance884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instance_in_expr904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_expr909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_expr919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutdecl_in_expr924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anonfn_in_expr929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_expr934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_standalone_fncall945 = new BitSet(new long[]{0x0000000041040020L});
	public static final BitSet FOLLOW_nested_id_in_standalone_fncall947 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_standalone_fncall949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_standalone_fncall962 = new BitSet(new long[]{0x0000000041040020L});
	public static final BitSet FOLLOW_fncall_in_standalone_fncall964 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_standalone_fncall966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_mutcall980 = new BitSet(new long[]{0x0000000041040020L});
	public static final BitSet FOLLOW_nested_id_in_mutcall982 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_mutcall984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_mutcall993 = new BitSet(new long[]{0x0000000041040020L});
	public static final BitSet FOLLOW_fncall_in_mutcall995 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_mutcall997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_index_expr1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_index_expr1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_index_expr1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_index_expr1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standalone_fncall_in_index_expr1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_dict_pair1044 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_dict_pair1046 = new BitSet(new long[]{0x00120C0361340020L});
	public static final BitSet FOLLOW_expr_in_dict_pair1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_dict1068 = new BitSet(new long[]{0x0020000A61340020L});
	public static final BitSet FOLLOW_dict_pair_in_dict1071 = new BitSet(new long[]{0x0020000800000000L});
	public static final BitSet FOLLOW_35_in_dict1076 = new BitSet(new long[]{0x0000000261340020L});
	public static final BitSet FOLLOW_dict_pair_in_dict1078 = new BitSet(new long[]{0x0020000800000000L});
	public static final BitSet FOLLOW_53_in_dict1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_contained_block1104 = new BitSet(new long[]{0x000D008041040000L});
	public static final BitSet FOLLOW_block_in_contained_block1106 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_contained_block1108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_array1122 = new BitSet(new long[]{0x00121C0B61340020L});
	public static final BitSet FOLLOW_expr_in_array1124 = new BitSet(new long[]{0x0000100800000000L});
	public static final BitSet FOLLOW_35_in_array1128 = new BitSet(new long[]{0x00120C0361340020L});
	public static final BitSet FOLLOW_expr_in_array1130 = new BitSet(new long[]{0x0000100800000000L});
	public static final BitSet FOLLOW_44_in_array1134 = new BitSet(new long[]{0x0000000000000002L});
}
