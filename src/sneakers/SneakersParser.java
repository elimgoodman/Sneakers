// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-31 17:42:08
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
		"ASSIGN", "BLOCK", "BLOCKDECL", "CLASSDEF", "DICT", "EXPR", "FIELDDEF", 
		"FNCALL", "FNDECL", "FNPARAM", "ID", "INT", "KEYWORD", "METHODDEF", "MUTDECL", 
		"MUTID", "PARAM", "PARAMTYPEFN", "PARAMTYPEMUT", "RET", "STRING", "TYPEID", 
		"WS", "'#'", "'('", "')'", "','", "'.'", "':'", "';'", "'<'", "'=>'", 
		"'>'", "'@'", "'['", "']'", "'else'", "'elseif'", "'extend'", "'if'", 
		"'pass'", "'return'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__50=50;
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
	public static final int METHODDEF=20;
	public static final int MUTDECL=21;
	public static final int MUTID=22;
	public static final int PARAM=23;
	public static final int PARAMTYPEFN=24;
	public static final int PARAMTYPEMUT=25;
	public static final int RET=26;
	public static final int STRING=27;
	public static final int TYPEID=28;
	public static final int WS=29;

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:1: prog : block ;
	public final SneakersParser.prog_return prog() throws RecognitionException {
		SneakersParser.prog_return retval = new SneakersParser.prog_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		ParserRuleReturnScope block1 =null;


		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:6: ( block )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:48:8: block
			{
			root_0 = (SneakersAST)adaptor.nil();


			pushFollow(FOLLOW_block_in_prog145);
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:1: block : ( stat ';' )+ -> ^( BLOCK ( stat )+ ) ;
	public final SneakersParser.block_return block() throws RecognitionException {
		SneakersParser.block_return retval = new SneakersParser.block_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal3=null;
		ParserRuleReturnScope stat2 =null;

		SneakersAST char_literal3_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:8: ( ( stat ';' )+ -> ^( BLOCK ( stat )+ ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:10: ( stat ';' )+
			{
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:10: ( stat ';' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==MUTID||LA1_0==TYPEID||LA1_0==37||(LA1_0 >= 46 && LA1_0 <= 48)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:11: stat ';'
					{
					pushFollow(FOLLOW_stat_in_block157);
					stat2=stat();
					state._fsp--;

					stream_stat.add(stat2.getTree());
					char_literal3=(Token)match(input,36,FOLLOW_36_in_block159);  
					stream_36.add(char_literal3);

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
			// 51:22: -> ^( BLOCK ( stat )+ )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:51:25: ^( BLOCK ( stat )+ )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:1: stat : ( assignment | ifstat | returnstat | mutcall | 'pass' );
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
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:6: ( assignment | ifstat | returnstat | mutcall | 'pass' )
			int alt2=5;
			switch ( input.LA(1) ) {
			case ID:
			case MUTID:
			case TYPEID:
				{
				alt2=1;
				}
				break;
			case 46:
				{
				alt2=2;
				}
				break;
			case 48:
				{
				alt2=3;
				}
				break;
			case 37:
				{
				alt2=4;
				}
				break;
			case 47:
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:53:8: assignment
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_stat178);
					assignment4=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment4.getTree());

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:54:4: ifstat
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_ifstat_in_stat183);
					ifstat5=ifstat();
					state._fsp--;

					adaptor.addChild(root_0, ifstat5.getTree());

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:55:4: returnstat
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_returnstat_in_stat188);
					returnstat6=returnstat();
					state._fsp--;

					adaptor.addChild(root_0, returnstat6.getTree());

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:56:4: mutcall
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_mutcall_in_stat193);
					mutcall7=mutcall();
					state._fsp--;

					adaptor.addChild(root_0, mutcall7.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:57:4: 'pass'
					{
					root_0 = (SneakersAST)adaptor.nil();


					string_literal8=(Token)match(input,47,FOLLOW_47_in_stat198); 
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:60:1: returnstat : ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) );
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
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:2: ( 'return' fncall -> ^( RET fncall ) | 'return' expr -> ^( RET expr ) )
			int alt3=2;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:4: 'return' fncall
					{
					string_literal9=(Token)match(input,48,FOLLOW_48_in_returnstat209);  
					stream_48.add(string_literal9);

					pushFollow(FOLLOW_fncall_in_returnstat211);
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
					// 61:20: -> ^( RET fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:61:23: ^( RET fncall )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:4: 'return' expr
					{
					string_literal11=(Token)match(input,48,FOLLOW_48_in_returnstat224);  
					stream_48.add(string_literal11);

					pushFollow(FOLLOW_expr_in_returnstat226);
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
					// 62:18: -> ^( RET expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:62:21: ^( RET expr )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:1: ifstat : 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) ;
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
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:8: ( 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )? -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:65:10: 'if' ifexpr= expr ifblock= contained_block ( 'elseif' elifexpr+= expr elifblock+= contained_block )* ( 'else' elseblock= contained_block )?
			{
			string_literal13=(Token)match(input,46,FOLLOW_46_in_ifstat244);  
			stream_46.add(string_literal13);

			pushFollow(FOLLOW_expr_in_ifstat248);
			ifexpr=expr();
			state._fsp--;

			stream_expr.add(ifexpr.getTree());
			pushFollow(FOLLOW_contained_block_in_ifstat252);
			ifblock=contained_block();
			state._fsp--;

			stream_contained_block.add(ifblock.getTree());
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:3: ( 'elseif' elifexpr+= expr elifblock+= contained_block )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==44) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:66:4: 'elseif' elifexpr+= expr elifblock+= contained_block
					{
					string_literal14=(Token)match(input,44,FOLLOW_44_in_ifstat258);  
					stream_44.add(string_literal14);

					pushFollow(FOLLOW_expr_in_ifstat262);
					elifexpr=expr();
					state._fsp--;

					stream_expr.add(elifexpr.getTree());
					if (list_elifexpr==null) list_elifexpr=new ArrayList<Object>();
					list_elifexpr.add(elifexpr.getTree());
					pushFollow(FOLLOW_contained_block_in_ifstat266);
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

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:3: ( 'else' elseblock= contained_block )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==43) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:67:4: 'else' elseblock= contained_block
					{
					string_literal15=(Token)match(input,43,FOLLOW_43_in_ifstat274);  
					stream_43.add(string_literal15);

					pushFollow(FOLLOW_contained_block_in_ifstat278);
					elseblock=contained_block();
					state._fsp--;

					stream_contained_block.add(elseblock.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: elseblock, ifexpr, elifblock, ifblock, 46, elifexpr
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
			// 68:3: -> ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:68:6: ^( 'if' $ifexpr $ifblock ( $elifexpr $elifblock)* ( $elseblock)? )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot(stream_46.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ifexpr.nextTree());
				adaptor.addChild(root_1, stream_ifblock.nextTree());
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:68:30: ( $elifexpr $elifblock)*
				while ( stream_elifblock.hasNext()||stream_elifexpr.hasNext() ) {
					adaptor.addChild(root_1, stream_elifexpr.nextTree());
					adaptor.addChild(root_1, stream_elifblock.nextTree());
				}
				stream_elifblock.reset();
				stream_elifexpr.reset();

				// /Users/eli/dev/Sneakers-Java/Sneakers.g:68:55: ( $elseblock)?
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:1: classdef : '{' ( fielddef )? ( ',' fielddef )* '}' -> ( fielddef )* ;
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
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_fielddef=new RewriteRuleSubtreeStream(adaptor,"rule fielddef");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:9: ( '{' ( fielddef )? ( ',' fielddef )* '}' -> ( fielddef )* )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:11: '{' ( fielddef )? ( ',' fielddef )* '}'
			{
			char_literal16=(Token)match(input,49,FOLLOW_49_in_classdef314);  
			stream_49.add(char_literal16);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:15: ( fielddef )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==KEYWORD) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:16: fielddef
					{
					pushFollow(FOLLOW_fielddef_in_classdef317);
					fielddef17=fielddef();
					state._fsp--;

					stream_fielddef.add(fielddef17.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:27: ( ',' fielddef )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==33) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:28: ',' fielddef
					{
					char_literal18=(Token)match(input,33,FOLLOW_33_in_classdef322);  
					stream_33.add(char_literal18);

					pushFollow(FOLLOW_fielddef_in_classdef324);
					fielddef19=fielddef();
					state._fsp--;

					stream_fielddef.add(fielddef19.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

			char_literal20=(Token)match(input,50,FOLLOW_50_in_classdef328);  
			stream_50.add(char_literal20);

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
			// 70:47: -> ( fielddef )*
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:70:50: ( fielddef )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:73:1: assignment : ( TYPEID '=' 'class' classdef -> ^( 'class' TYPEID classdef ) |newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' classdef -> ^( 'extend' $newclass $oldclass classdef ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );
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
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_CLASSDEF=new RewriteRuleTokenStream(adaptor,"token CLASSDEF");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_classdef=new RewriteRuleSubtreeStream(adaptor,"rule classdef");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:2: ( TYPEID '=' 'class' classdef -> ^( 'class' TYPEID classdef ) |newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' classdef -> ^( 'extend' $newclass $oldclass classdef ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) )
			int alt8=4;
			alt8 = dfa8.predict(input);
			switch (alt8) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:4: TYPEID '=' 'class' classdef
					{
					TYPEID21=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_assignment344);  
					stream_TYPEID.add(TYPEID21);

					char_literal22=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment346);  
					stream_ASSIGN.add(char_literal22);

					string_literal23=(Token)match(input,CLASSDEF,FOLLOW_CLASSDEF_in_assignment348);  
					stream_CLASSDEF.add(string_literal23);

					pushFollow(FOLLOW_classdef_in_assignment350);
					classdef24=classdef();
					state._fsp--;

					stream_classdef.add(classdef24.getTree());
					// AST REWRITE
					// elements: CLASSDEF, TYPEID, classdef
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 74:32: -> ^( 'class' TYPEID classdef )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:74:35: ^( 'class' TYPEID classdef )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:4: newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' classdef
					{
					newclass=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_assignment367);  
					stream_TYPEID.add(newclass);

					char_literal25=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment369);  
					stream_ASSIGN.add(char_literal25);

					oldclass=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_assignment373);  
					stream_TYPEID.add(oldclass);

					char_literal26=(Token)match(input,34,FOLLOW_34_in_assignment375);  
					stream_34.add(char_literal26);

					string_literal27=(Token)match(input,45,FOLLOW_45_in_assignment377);  
					stream_45.add(string_literal27);

					pushFollow(FOLLOW_classdef_in_assignment379);
					classdef28=classdef();
					state._fsp--;

					stream_classdef.add(classdef28.getTree());
					// AST REWRITE
					// elements: classdef, oldclass, newclass, 45
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
					// 75:62: -> ^( 'extend' $newclass $oldclass classdef )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:75:65: ^( 'extend' $newclass $oldclass classdef )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot(stream_45.nextNode(), root_1);
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:4: any_id '=' expr
					{
					pushFollow(FOLLOW_any_id_in_assignment398);
					any_id29=any_id();
					state._fsp--;

					stream_any_id.add(any_id29.getTree());
					char_literal30=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment400);  
					stream_ASSIGN.add(char_literal30);

					pushFollow(FOLLOW_expr_in_assignment402);
					expr31=expr();
					state._fsp--;

					stream_expr.add(expr31.getTree());
					// AST REWRITE
					// elements: expr, ASSIGN, any_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 76:20: -> ^( '=' any_id expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:76:23: ^( '=' any_id expr )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:4: any_id '=' fncall
					{
					pushFollow(FOLLOW_any_id_in_assignment417);
					any_id32=any_id();
					state._fsp--;

					stream_any_id.add(any_id32.getTree());
					char_literal33=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment419);  
					stream_ASSIGN.add(char_literal33);

					pushFollow(FOLLOW_fncall_in_assignment421);
					fncall34=fncall();
					state._fsp--;

					stream_fncall.add(fncall34.getTree());
					// AST REWRITE
					// elements: any_id, fncall, ASSIGN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 77:22: -> ^( '=' any_id fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:77:25: ^( '=' any_id fncall )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:81:1: fielddef : ( KEYWORD '=>' paramtype -> ^( FIELDDEF KEYWORD paramtype ) | KEYWORD '=>' fndecl -> ^( METHODDEF KEYWORD fndecl ) | KEYWORD '=>' mutdecl -> ^( METHODDEF KEYWORD mutdecl ) );
	public final SneakersParser.fielddef_return fielddef() throws RecognitionException {
		SneakersParser.fielddef_return retval = new SneakersParser.fielddef_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token KEYWORD35=null;
		Token string_literal36=null;
		Token KEYWORD38=null;
		Token string_literal39=null;
		Token KEYWORD41=null;
		Token string_literal42=null;
		ParserRuleReturnScope paramtype37 =null;
		ParserRuleReturnScope fndecl40 =null;
		ParserRuleReturnScope mutdecl43 =null;

		SneakersAST KEYWORD35_tree=null;
		SneakersAST string_literal36_tree=null;
		SneakersAST KEYWORD38_tree=null;
		SneakersAST string_literal39_tree=null;
		SneakersAST KEYWORD41_tree=null;
		SneakersAST string_literal42_tree=null;
		RewriteRuleTokenStream stream_KEYWORD=new RewriteRuleTokenStream(adaptor,"token KEYWORD");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_mutdecl=new RewriteRuleSubtreeStream(adaptor,"rule mutdecl");
		RewriteRuleSubtreeStream stream_fndecl=new RewriteRuleSubtreeStream(adaptor,"rule fndecl");
		RewriteRuleSubtreeStream stream_paramtype=new RewriteRuleSubtreeStream(adaptor,"rule paramtype");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:2: ( KEYWORD '=>' paramtype -> ^( FIELDDEF KEYWORD paramtype ) | KEYWORD '=>' fndecl -> ^( METHODDEF KEYWORD fndecl ) | KEYWORD '=>' mutdecl -> ^( METHODDEF KEYWORD mutdecl ) )
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==KEYWORD) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==38) ) {
					switch ( input.LA(3) ) {
					case TYPEID:
						{
						alt9=1;
						}
						break;
					case 30:
						{
						int LA9_4 = input.LA(4);
						if ( (LA9_4==31) ) {
							switch ( input.LA(5) ) {
							case TYPEID:
								{
								alt9=1;
								}
								break;
							case 32:
								{
								int LA9_8 = input.LA(6);
								if ( (LA9_8==35) ) {
									int LA9_12 = input.LA(7);
									if ( (LA9_12==TYPEID) ) {
										int LA9_14 = input.LA(8);
										if ( (LA9_14==33||LA9_14==50) ) {
											alt9=1;
										}
										else if ( (LA9_14==41) ) {
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
					case 40:
						{
						int LA9_5 = input.LA(4);
						if ( (LA9_5==31) ) {
							switch ( input.LA(5) ) {
							case TYPEID:
								{
								alt9=1;
								}
								break;
							case 32:
								{
								int LA9_10 = input.LA(6);
								if ( (LA9_10==35) ) {
									int LA9_13 = input.LA(7);
									if ( (LA9_13==TYPEID) ) {
										int LA9_15 = input.LA(8);
										if ( (LA9_15==33||LA9_15==50) ) {
											alt9=1;
										}
										else if ( (LA9_15==41) ) {
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:4: KEYWORD '=>' paramtype
					{
					KEYWORD35=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_fielddef444);  
					stream_KEYWORD.add(KEYWORD35);

					string_literal36=(Token)match(input,38,FOLLOW_38_in_fielddef446);  
					stream_38.add(string_literal36);

					pushFollow(FOLLOW_paramtype_in_fielddef448);
					paramtype37=paramtype();
					state._fsp--;

					stream_paramtype.add(paramtype37.getTree());
					// AST REWRITE
					// elements: KEYWORD, paramtype
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 82:27: -> ^( FIELDDEF KEYWORD paramtype )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:82:30: ^( FIELDDEF KEYWORD paramtype )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(FIELDDEF, "FIELDDEF"), root_1);
						adaptor.addChild(root_1, stream_KEYWORD.nextNode());
						adaptor.addChild(root_1, stream_paramtype.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:4: KEYWORD '=>' fndecl
					{
					KEYWORD38=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_fielddef463);  
					stream_KEYWORD.add(KEYWORD38);

					string_literal39=(Token)match(input,38,FOLLOW_38_in_fielddef465);  
					stream_38.add(string_literal39);

					pushFollow(FOLLOW_fndecl_in_fielddef467);
					fndecl40=fndecl();
					state._fsp--;

					stream_fndecl.add(fndecl40.getTree());
					// AST REWRITE
					// elements: KEYWORD, fndecl
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 83:24: -> ^( METHODDEF KEYWORD fndecl )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:83:27: ^( METHODDEF KEYWORD fndecl )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(METHODDEF, "METHODDEF"), root_1);
						adaptor.addChild(root_1, stream_KEYWORD.nextNode());
						adaptor.addChild(root_1, stream_fndecl.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:4: KEYWORD '=>' mutdecl
					{
					KEYWORD41=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_fielddef482);  
					stream_KEYWORD.add(KEYWORD41);

					string_literal42=(Token)match(input,38,FOLLOW_38_in_fielddef484);  
					stream_38.add(string_literal42);

					pushFollow(FOLLOW_mutdecl_in_fielddef486);
					mutdecl43=mutdecl();
					state._fsp--;

					stream_mutdecl.add(mutdecl43.getTree());
					// AST REWRITE
					// elements: KEYWORD, mutdecl
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 84:25: -> ^( METHODDEF KEYWORD mutdecl )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:84:28: ^( METHODDEF KEYWORD mutdecl )
						{
						SneakersAST root_1 = (SneakersAST)adaptor.nil();
						root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(METHODDEF, "METHODDEF"), root_1);
						adaptor.addChild(root_1, stream_KEYWORD.nextNode());
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:88:1: nested_id : ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* );
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
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_any_id=new RewriteRuleSubtreeStream(adaptor,"rule any_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:2: ( ANONVAR ( '.' any_id )* -> ANONVAR ( any_id )* | any_id ( '.' any_id )* -> ( any_id )* )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:4: ANONVAR ( '.' any_id )*
					{
					ANONVAR44=(Token)match(input,ANONVAR,FOLLOW_ANONVAR_in_nested_id509);  
					stream_ANONVAR.add(ANONVAR44);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:12: ( '.' any_id )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==34) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:13: '.' any_id
							{
							char_literal45=(Token)match(input,34,FOLLOW_34_in_nested_id512);  
							stream_34.add(char_literal45);

							pushFollow(FOLLOW_any_id_in_nested_id514);
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
					// 89:26: -> ANONVAR ( any_id )*
					{
						adaptor.addChild(root_0, stream_ANONVAR.nextNode());
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:89:37: ( any_id )*
						while ( stream_any_id.hasNext() ) {
							adaptor.addChild(root_0, stream_any_id.nextTree());
						}
						stream_any_id.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:4: any_id ( '.' any_id )*
					{
					pushFollow(FOLLOW_any_id_in_nested_id528);
					any_id47=any_id();
					state._fsp--;

					stream_any_id.add(any_id47.getTree());
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:11: ( '.' any_id )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==34) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:12: '.' any_id
							{
							char_literal48=(Token)match(input,34,FOLLOW_34_in_nested_id531);  
							stream_34.add(char_literal48);

							pushFollow(FOLLOW_any_id_in_nested_id533);
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
					// 90:25: -> ( any_id )*
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:90:28: ( any_id )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:1: fncall : nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) ;
	public final SneakersParser.fncall_return fncall() throws RecognitionException {
		SneakersParser.fncall_return retval = new SneakersParser.fncall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal52=null;
		ParserRuleReturnScope nested_id50 =null;
		ParserRuleReturnScope param51 =null;
		ParserRuleReturnScope param53 =null;

		SneakersAST char_literal52_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:8: ( nested_id param ( ( ',' )? param )* -> ^( FNCALL nested_id ( param )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:10: nested_id param ( ( ',' )? param )*
			{
			pushFollow(FOLLOW_nested_id_in_fncall550);
			nested_id50=nested_id();
			state._fsp--;

			stream_nested_id.add(nested_id50.getTree());
			pushFollow(FOLLOW_param_in_fncall552);
			param51=param();
			state._fsp--;

			stream_param.add(param51.getTree());
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:26: ( ( ',' )? param )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==ANONVAR||(LA14_0 >= ID && LA14_0 <= KEYWORD)||LA14_0==MUTID||(LA14_0 >= STRING && LA14_0 <= TYPEID)||(LA14_0 >= 30 && LA14_0 <= 31)||LA14_0==33||(LA14_0 >= 40 && LA14_0 <= 41)||LA14_0==49) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:27: ( ',' )? param
					{
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:27: ( ',' )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==33) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:27: ','
							{
							char_literal52=(Token)match(input,33,FOLLOW_33_in_fncall555);  
							stream_33.add(char_literal52);

							}
							break;

					}

					pushFollow(FOLLOW_param_in_fncall558);
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
			// elements: nested_id, param
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (SneakersAST)adaptor.nil();
			// 93:40: -> ^( FNCALL nested_id ( param )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:43: ^( FNCALL nested_id ( param )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(FNCALL, "FNCALL"), root_1);
				adaptor.addChild(root_1, stream_nested_id.nextTree());
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:93:62: ( param )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:1: param : ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) );
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
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:7: ( ID ':' expr -> ^( PARAM ID expr ) | expr -> ^( PARAM expr ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==35) ) {
					alt15=1;
				}
				else if ( (LA15_1==ANONVAR||(LA15_1 >= ID && LA15_1 <= KEYWORD)||LA15_1==MUTID||(LA15_1 >= STRING && LA15_1 <= TYPEID)||(LA15_1 >= 30 && LA15_1 <= 34)||LA15_1==36||(LA15_1 >= 39 && LA15_1 <= 42)||LA15_1==49) ) {
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
			else if ( (LA15_0==ANONVAR||(LA15_0 >= INT && LA15_0 <= KEYWORD)||LA15_0==MUTID||(LA15_0 >= STRING && LA15_0 <= TYPEID)||(LA15_0 >= 30 && LA15_0 <= 31)||(LA15_0 >= 40 && LA15_0 <= 41)||LA15_0==49) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:9: ID ':' expr
					{
					ID54=(Token)match(input,ID,FOLLOW_ID_in_param581);  
					stream_ID.add(ID54);

					char_literal55=(Token)match(input,35,FOLLOW_35_in_param583);  
					stream_35.add(char_literal55);

					pushFollow(FOLLOW_expr_in_param585);
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
					// 96:21: -> ^( PARAM ID expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:96:24: ^( PARAM ID expr )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:97:4: expr
					{
					pushFollow(FOLLOW_expr_in_param600);
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
					// 97:9: -> ^( PARAM expr )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:97:12: ^( PARAM expr )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:100:1: blockparamtype : ( '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ( TYPEID )+ | '(' ')' ':' TYPEID -> TYPEID );
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
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:101:2: ( '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID -> ( TYPEID )+ | '(' ')' ':' TYPEID -> TYPEID )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==31) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==TYPEID) ) {
					alt17=1;
				}
				else if ( (LA17_1==32) ) {
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:101:4: '(' TYPEID ( ',' TYPEID )* ')' ':' TYPEID
					{
					char_literal58=(Token)match(input,31,FOLLOW_31_in_blockparamtype620);  
					stream_31.add(char_literal58);

					TYPEID59=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype622);  
					stream_TYPEID.add(TYPEID59);

					// /Users/eli/dev/Sneakers-Java/Sneakers.g:101:15: ( ',' TYPEID )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==33) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:101:16: ',' TYPEID
							{
							char_literal60=(Token)match(input,33,FOLLOW_33_in_blockparamtype625);  
							stream_33.add(char_literal60);

							TYPEID61=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype627);  
							stream_TYPEID.add(TYPEID61);

							}
							break;

						default :
							break loop16;
						}
					}

					char_literal62=(Token)match(input,32,FOLLOW_32_in_blockparamtype631);  
					stream_32.add(char_literal62);

					char_literal63=(Token)match(input,35,FOLLOW_35_in_blockparamtype633);  
					stream_35.add(char_literal63);

					TYPEID64=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype635);  
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
					// 101:44: -> ( TYPEID )+
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:102:4: '(' ')' ':' TYPEID
					{
					char_literal65=(Token)match(input,31,FOLLOW_31_in_blockparamtype645);  
					stream_31.add(char_literal65);

					char_literal66=(Token)match(input,32,FOLLOW_32_in_blockparamtype647);  
					stream_32.add(char_literal66);

					char_literal67=(Token)match(input,35,FOLLOW_35_in_blockparamtype649);  
					stream_35.add(char_literal67);

					TYPEID68=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockparamtype651);  
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
					// 102:23: -> TYPEID
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:105:1: paramtype : ( TYPEID | '#' blockparamtype -> ^( PARAMTYPEFN blockparamtype ) | '@' blockparamtype -> ^( PARAMTYPEMUT blockparamtype ) );
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
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_blockparamtype=new RewriteRuleSubtreeStream(adaptor,"rule blockparamtype");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:105:11: ( TYPEID | '#' blockparamtype -> ^( PARAMTYPEFN blockparamtype ) | '@' blockparamtype -> ^( PARAMTYPEMUT blockparamtype ) )
			int alt18=3;
			switch ( input.LA(1) ) {
			case TYPEID:
				{
				alt18=1;
				}
				break;
			case 30:
				{
				alt18=2;
				}
				break;
			case 40:
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:105:14: TYPEID
					{
					root_0 = (SneakersAST)adaptor.nil();


					TYPEID69=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_paramtype666); 
					TYPEID69_tree = (SneakersAST)adaptor.create(TYPEID69);
					adaptor.addChild(root_0, TYPEID69_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:4: '#' blockparamtype
					{
					char_literal70=(Token)match(input,30,FOLLOW_30_in_paramtype671);  
					stream_30.add(char_literal70);

					pushFollow(FOLLOW_blockparamtype_in_paramtype673);
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
					// 106:23: -> ^( PARAMTYPEFN blockparamtype )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:106:26: ^( PARAMTYPEFN blockparamtype )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:4: '@' blockparamtype
					{
					char_literal72=(Token)match(input,40,FOLLOW_40_in_paramtype686);  
					stream_40.add(char_literal72);

					pushFollow(FOLLOW_blockparamtype_in_paramtype688);
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
					// 107:23: -> ^( PARAMTYPEMUT blockparamtype )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:107:26: ^( PARAMTYPEMUT blockparamtype )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:1: fnparam : ID ':' paramtype -> ^( FNPARAM ID paramtype ) ;
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
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_paramtype=new RewriteRuleSubtreeStream(adaptor,"rule paramtype");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:9: ( ID ':' paramtype -> ^( FNPARAM ID paramtype ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:11: ID ':' paramtype
			{
			ID74=(Token)match(input,ID,FOLLOW_ID_in_fnparam707);  
			stream_ID.add(ID74);

			char_literal75=(Token)match(input,35,FOLLOW_35_in_fnparam709);  
			stream_35.add(char_literal75);

			pushFollow(FOLLOW_paramtype_in_fnparam711);
			paramtype76=paramtype();
			state._fsp--;

			stream_paramtype.add(paramtype76.getTree());
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
			// 110:28: -> ^( FNPARAM ID paramtype )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:110:31: ^( FNPARAM ID paramtype )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );
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
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:8: ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) )
			int alt19=2;
			alt19 = dfa19.predict(input);
			switch (alt19) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:10: '#' '[' fncall ']'
					{
					char_literal77=(Token)match(input,30,FOLLOW_30_in_anonfn731);  
					stream_30.add(char_literal77);

					char_literal78=(Token)match(input,41,FOLLOW_41_in_anonfn733);  
					stream_41.add(char_literal78);

					pushFollow(FOLLOW_fncall_in_anonfn735);
					fncall79=fncall();
					state._fsp--;

					stream_fncall.add(fncall79.getTree());
					char_literal80=(Token)match(input,42,FOLLOW_42_in_anonfn737);  
					stream_42.add(char_literal80);

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
					// 113:29: -> ^( ANONFN fncall )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:113:32: ^( ANONFN fncall )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:114:4: '#' '[' nested_id ']'
					{
					char_literal81=(Token)match(input,30,FOLLOW_30_in_anonfn750);  
					stream_30.add(char_literal81);

					char_literal82=(Token)match(input,41,FOLLOW_41_in_anonfn752);  
					stream_41.add(char_literal82);

					pushFollow(FOLLOW_nested_id_in_anonfn754);
					nested_id83=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id83.getTree());
					char_literal84=(Token)match(input,42,FOLLOW_42_in_anonfn756);  
					stream_42.add(char_literal84);

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
					// 114:26: -> ^( ANONFN nested_id )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:114:29: ^( ANONFN nested_id )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:117:1: blockdecl : ( '(' ')' ':' TYPEID contained_block -> TYPEID contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ':' TYPEID contained_block -> TYPEID ( fnparam )* contained_block );
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
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_TYPEID=new RewriteRuleTokenStream(adaptor,"token TYPEID");
		RewriteRuleSubtreeStream stream_contained_block=new RewriteRuleSubtreeStream(adaptor,"rule contained_block");
		RewriteRuleSubtreeStream stream_fnparam=new RewriteRuleSubtreeStream(adaptor,"rule fnparam");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:2: ( '(' ')' ':' TYPEID contained_block -> TYPEID contained_block | '(' fnparam ( ( ',' )? fnparam )* ')' ':' TYPEID contained_block -> TYPEID ( fnparam )* contained_block )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==31) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==32) ) {
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:118:4: '(' ')' ':' TYPEID contained_block
					{
					char_literal85=(Token)match(input,31,FOLLOW_31_in_blockdecl775);  
					stream_31.add(char_literal85);

					char_literal86=(Token)match(input,32,FOLLOW_32_in_blockdecl777);  
					stream_32.add(char_literal86);

					char_literal87=(Token)match(input,35,FOLLOW_35_in_blockdecl779);  
					stream_35.add(char_literal87);

					TYPEID88=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl781);  
					stream_TYPEID.add(TYPEID88);

					pushFollow(FOLLOW_contained_block_in_blockdecl783);
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
					// 118:39: -> TYPEID contained_block
					{
						adaptor.addChild(root_0, stream_TYPEID.nextNode());
						adaptor.addChild(root_0, stream_contained_block.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:119:4: '(' fnparam ( ( ',' )? fnparam )* ')' ':' TYPEID contained_block
					{
					char_literal90=(Token)match(input,31,FOLLOW_31_in_blockdecl794);  
					stream_31.add(char_literal90);

					pushFollow(FOLLOW_fnparam_in_blockdecl796);
					fnparam91=fnparam();
					state._fsp--;

					stream_fnparam.add(fnparam91.getTree());
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:119:16: ( ( ',' )? fnparam )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==ID||LA21_0==33) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:119:17: ( ',' )? fnparam
							{
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:119:17: ( ',' )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==33) ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// /Users/eli/dev/Sneakers-Java/Sneakers.g:119:17: ','
									{
									char_literal92=(Token)match(input,33,FOLLOW_33_in_blockdecl799);  
									stream_33.add(char_literal92);

									}
									break;

							}

							pushFollow(FOLLOW_fnparam_in_blockdecl802);
							fnparam93=fnparam();
							state._fsp--;

							stream_fnparam.add(fnparam93.getTree());
							}
							break;

						default :
							break loop21;
						}
					}

					char_literal94=(Token)match(input,32,FOLLOW_32_in_blockdecl806);  
					stream_32.add(char_literal94);

					char_literal95=(Token)match(input,35,FOLLOW_35_in_blockdecl808);  
					stream_35.add(char_literal95);

					TYPEID96=(Token)match(input,TYPEID,FOLLOW_TYPEID_in_blockdecl810);  
					stream_TYPEID.add(TYPEID96);

					pushFollow(FOLLOW_contained_block_in_blockdecl812);
					contained_block97=contained_block();
					state._fsp--;

					stream_contained_block.add(contained_block97.getTree());
					// AST REWRITE
					// elements: contained_block, fnparam, TYPEID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (SneakersAST)adaptor.nil();
					// 119:63: -> TYPEID ( fnparam )* contained_block
					{
						adaptor.addChild(root_0, stream_TYPEID.nextNode());
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:119:73: ( fnparam )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:1: fndecl : '#' blockdecl -> ^( FNDECL blockdecl ) ;
	public final SneakersParser.fndecl_return fndecl() throws RecognitionException {
		SneakersParser.fndecl_return retval = new SneakersParser.fndecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal98=null;
		ParserRuleReturnScope blockdecl99 =null;

		SneakersAST char_literal98_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:8: ( '#' blockdecl -> ^( FNDECL blockdecl ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:10: '#' blockdecl
			{
			char_literal98=(Token)match(input,30,FOLLOW_30_in_fndecl831);  
			stream_30.add(char_literal98);

			pushFollow(FOLLOW_blockdecl_in_fndecl833);
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
			// 122:24: -> ^( FNDECL blockdecl )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:122:27: ^( FNDECL blockdecl )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:1: mutdecl : '@' blockdecl -> ^( MUTDECL blockdecl ) ;
	public final SneakersParser.mutdecl_return mutdecl() throws RecognitionException {
		SneakersParser.mutdecl_return retval = new SneakersParser.mutdecl_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal100=null;
		ParserRuleReturnScope blockdecl101 =null;

		SneakersAST char_literal100_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_blockdecl=new RewriteRuleSubtreeStream(adaptor,"rule blockdecl");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:9: ( '@' blockdecl -> ^( MUTDECL blockdecl ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:11: '@' blockdecl
			{
			char_literal100=(Token)match(input,40,FOLLOW_40_in_mutdecl851);  
			stream_40.add(char_literal100);

			pushFollow(FOLLOW_blockdecl_in_mutdecl853);
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
			// 125:25: -> ^( MUTDECL blockdecl )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:125:28: ^( MUTDECL blockdecl )
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:128:1: expr : ( index_expr | dict | fndecl | mutdecl | anonfn | array );
	public final SneakersParser.expr_return expr() throws RecognitionException {
		SneakersParser.expr_return retval = new SneakersParser.expr_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		ParserRuleReturnScope index_expr102 =null;
		ParserRuleReturnScope dict103 =null;
		ParserRuleReturnScope fndecl104 =null;
		ParserRuleReturnScope mutdecl105 =null;
		ParserRuleReturnScope anonfn106 =null;
		ParserRuleReturnScope array107 =null;


		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:128:6: ( index_expr | dict | fndecl | mutdecl | anonfn | array )
			int alt23=6;
			switch ( input.LA(1) ) {
			case ANONVAR:
			case ID:
			case INT:
			case KEYWORD:
			case MUTID:
			case STRING:
			case TYPEID:
			case 31:
				{
				alt23=1;
				}
				break;
			case 49:
				{
				alt23=2;
				}
				break;
			case 30:
				{
				int LA23_3 = input.LA(2);
				if ( (LA23_3==41) ) {
					alt23=5;
				}
				else if ( (LA23_3==31) ) {
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
			case 40:
				{
				alt23=4;
				}
				break;
			case 41:
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:128:8: index_expr
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_index_expr_in_expr871);
					index_expr102=index_expr();
					state._fsp--;

					adaptor.addChild(root_0, index_expr102.getTree());

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:129:4: dict
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_dict_in_expr876);
					dict103=dict();
					state._fsp--;

					adaptor.addChild(root_0, dict103.getTree());

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:130:4: fndecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_fndecl_in_expr881);
					fndecl104=fndecl();
					state._fsp--;

					adaptor.addChild(root_0, fndecl104.getTree());

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:131:4: mutdecl
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_mutdecl_in_expr886);
					mutdecl105=mutdecl();
					state._fsp--;

					adaptor.addChild(root_0, mutdecl105.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:132:4: anonfn
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_anonfn_in_expr891);
					anonfn106=anonfn();
					state._fsp--;

					adaptor.addChild(root_0, anonfn106.getTree());

					}
					break;
				case 6 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:133:4: array
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_array_in_expr896);
					array107=array();
					state._fsp--;

					adaptor.addChild(root_0, array107.getTree());

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:136:1: standalone_fncall : ( '(' nested_id ')' -> ^( FNCALL nested_id ) | '(' fncall ')' -> fncall );
	public final SneakersParser.standalone_fncall_return standalone_fncall() throws RecognitionException {
		SneakersParser.standalone_fncall_return retval = new SneakersParser.standalone_fncall_return();
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
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:137:2: ( '(' nested_id ')' -> ^( FNCALL nested_id ) | '(' fncall ')' -> fncall )
			int alt24=2;
			alt24 = dfa24.predict(input);
			switch (alt24) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:137:4: '(' nested_id ')'
					{
					char_literal108=(Token)match(input,31,FOLLOW_31_in_standalone_fncall907);  
					stream_31.add(char_literal108);

					pushFollow(FOLLOW_nested_id_in_standalone_fncall909);
					nested_id109=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id109.getTree());
					char_literal110=(Token)match(input,32,FOLLOW_32_in_standalone_fncall911);  
					stream_32.add(char_literal110);

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
					// 137:22: -> ^( FNCALL nested_id )
					{
						// /Users/eli/dev/Sneakers-Java/Sneakers.g:137:25: ^( FNCALL nested_id )
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:138:4: '(' fncall ')'
					{
					char_literal111=(Token)match(input,31,FOLLOW_31_in_standalone_fncall924);  
					stream_31.add(char_literal111);

					pushFollow(FOLLOW_fncall_in_standalone_fncall926);
					fncall112=fncall();
					state._fsp--;

					stream_fncall.add(fncall112.getTree());
					char_literal113=(Token)match(input,32,FOLLOW_32_in_standalone_fncall928);  
					stream_32.add(char_literal113);

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
					// 138:19: -> fncall
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:141:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );
	public final SneakersParser.mutcall_return mutcall() throws RecognitionException {
		SneakersParser.mutcall_return retval = new SneakersParser.mutcall_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal114=null;
		Token char_literal116=null;
		Token char_literal117=null;
		Token char_literal119=null;
		ParserRuleReturnScope nested_id115 =null;
		ParserRuleReturnScope fncall118 =null;

		SneakersAST char_literal114_tree=null;
		SneakersAST char_literal116_tree=null;
		SneakersAST char_literal117_tree=null;
		SneakersAST char_literal119_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_fncall=new RewriteRuleSubtreeStream(adaptor,"rule fncall");
		RewriteRuleSubtreeStream stream_nested_id=new RewriteRuleSubtreeStream(adaptor,"rule nested_id");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:141:9: ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall )
			int alt25=2;
			alt25 = dfa25.predict(input);
			switch (alt25) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:141:11: '<' nested_id '>'
					{
					char_literal114=(Token)match(input,37,FOLLOW_37_in_mutcall942);  
					stream_37.add(char_literal114);

					pushFollow(FOLLOW_nested_id_in_mutcall944);
					nested_id115=nested_id();
					state._fsp--;

					stream_nested_id.add(nested_id115.getTree());
					char_literal116=(Token)match(input,39,FOLLOW_39_in_mutcall946);  
					stream_39.add(char_literal116);

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
					// 141:29: -> nested_id
					{
						adaptor.addChild(root_0, stream_nested_id.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:142:4: '<' fncall '>'
					{
					char_literal117=(Token)match(input,37,FOLLOW_37_in_mutcall955);  
					stream_37.add(char_literal117);

					pushFollow(FOLLOW_fncall_in_mutcall957);
					fncall118=fncall();
					state._fsp--;

					stream_fncall.add(fncall118.getTree());
					char_literal119=(Token)match(input,39,FOLLOW_39_in_mutcall959);  
					stream_39.add(char_literal119);

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
					// 142:19: -> fncall
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:145:1: index_expr : ( KEYWORD | INT | STRING | nested_id | standalone_fncall );
	public final SneakersParser.index_expr_return index_expr() throws RecognitionException {
		SneakersParser.index_expr_return retval = new SneakersParser.index_expr_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token KEYWORD120=null;
		Token INT121=null;
		Token STRING122=null;
		ParserRuleReturnScope nested_id123 =null;
		ParserRuleReturnScope standalone_fncall124 =null;

		SneakersAST KEYWORD120_tree=null;
		SneakersAST INT121_tree=null;
		SneakersAST STRING122_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:146:2: ( KEYWORD | INT | STRING | nested_id | standalone_fncall )
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
			case 31:
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
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:146:4: KEYWORD
					{
					root_0 = (SneakersAST)adaptor.nil();


					KEYWORD120=(Token)match(input,KEYWORD,FOLLOW_KEYWORD_in_index_expr974); 
					KEYWORD120_tree = (SneakersAST)adaptor.create(KEYWORD120);
					adaptor.addChild(root_0, KEYWORD120_tree);

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:147:4: INT
					{
					root_0 = (SneakersAST)adaptor.nil();


					INT121=(Token)match(input,INT,FOLLOW_INT_in_index_expr979); 
					INT121_tree = (SneakersAST)adaptor.create(INT121);
					adaptor.addChild(root_0, INT121_tree);

					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:148:4: STRING
					{
					root_0 = (SneakersAST)adaptor.nil();


					STRING122=(Token)match(input,STRING,FOLLOW_STRING_in_index_expr984); 
					STRING122_tree = (SneakersAST)adaptor.create(STRING122);
					adaptor.addChild(root_0, STRING122_tree);

					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:149:4: nested_id
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_nested_id_in_index_expr989);
					nested_id123=nested_id();
					state._fsp--;

					adaptor.addChild(root_0, nested_id123.getTree());

					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:150:4: standalone_fncall
					{
					root_0 = (SneakersAST)adaptor.nil();


					pushFollow(FOLLOW_standalone_fncall_in_index_expr994);
					standalone_fncall124=standalone_fncall();
					state._fsp--;

					adaptor.addChild(root_0, standalone_fncall124.getTree());

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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:153:1: dict_pair : index_expr '=>' expr -> index_expr expr ;
	public final SneakersParser.dict_pair_return dict_pair() throws RecognitionException {
		SneakersParser.dict_pair_return retval = new SneakersParser.dict_pair_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token string_literal126=null;
		ParserRuleReturnScope index_expr125 =null;
		ParserRuleReturnScope expr127 =null;

		SneakersAST string_literal126_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_index_expr=new RewriteRuleSubtreeStream(adaptor,"rule index_expr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:154:2: ( index_expr '=>' expr -> index_expr expr )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:154:4: index_expr '=>' expr
			{
			pushFollow(FOLLOW_index_expr_in_dict_pair1006);
			index_expr125=index_expr();
			state._fsp--;

			stream_index_expr.add(index_expr125.getTree());
			string_literal126=(Token)match(input,38,FOLLOW_38_in_dict_pair1008);  
			stream_38.add(string_literal126);

			pushFollow(FOLLOW_expr_in_dict_pair1010);
			expr127=expr();
			state._fsp--;

			stream_expr.add(expr127.getTree());
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
			// 154:25: -> index_expr expr
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:157:1: dict : '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) ;
	public final SneakersParser.dict_return dict() throws RecognitionException {
		SneakersParser.dict_return retval = new SneakersParser.dict_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal128=null;
		Token char_literal130=null;
		Token char_literal132=null;
		ParserRuleReturnScope dict_pair129 =null;
		ParserRuleReturnScope dict_pair131 =null;

		SneakersAST char_literal128_tree=null;
		SneakersAST char_literal130_tree=null;
		SneakersAST char_literal132_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_dict_pair=new RewriteRuleSubtreeStream(adaptor,"rule dict_pair");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:157:6: ( '{' ( dict_pair )? ( ',' dict_pair )* '}' -> ^( DICT ( dict_pair )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:157:8: '{' ( dict_pair )? ( ',' dict_pair )* '}'
			{
			char_literal128=(Token)match(input,49,FOLLOW_49_in_dict1026);  
			stream_49.add(char_literal128);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:157:12: ( dict_pair )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==ANONVAR||(LA27_0 >= ID && LA27_0 <= KEYWORD)||LA27_0==MUTID||(LA27_0 >= STRING && LA27_0 <= TYPEID)||LA27_0==31) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:157:13: dict_pair
					{
					pushFollow(FOLLOW_dict_pair_in_dict1029);
					dict_pair129=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair129.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:157:25: ( ',' dict_pair )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==33) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:157:26: ',' dict_pair
					{
					char_literal130=(Token)match(input,33,FOLLOW_33_in_dict1034);  
					stream_33.add(char_literal130);

					pushFollow(FOLLOW_dict_pair_in_dict1036);
					dict_pair131=dict_pair();
					state._fsp--;

					stream_dict_pair.add(dict_pair131.getTree());
					}
					break;

				default :
					break loop28;
				}
			}

			char_literal132=(Token)match(input,50,FOLLOW_50_in_dict1040);  
			stream_50.add(char_literal132);

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
			// 157:46: -> ^( DICT ( dict_pair )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:157:49: ^( DICT ( dict_pair )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(DICT, "DICT"), root_1);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:157:56: ( dict_pair )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:160:1: contained_block : '[' block ']' -> block ;
	public final SneakersParser.contained_block_return contained_block() throws RecognitionException {
		SneakersParser.contained_block_return retval = new SneakersParser.contained_block_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal133=null;
		Token char_literal135=null;
		ParserRuleReturnScope block134 =null;

		SneakersAST char_literal133_tree=null;
		SneakersAST char_literal135_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:161:2: ( '[' block ']' -> block )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:161:4: '[' block ']'
			{
			char_literal133=(Token)match(input,41,FOLLOW_41_in_contained_block1062);  
			stream_41.add(char_literal133);

			pushFollow(FOLLOW_block_in_contained_block1064);
			block134=block();
			state._fsp--;

			stream_block.add(block134.getTree());
			char_literal135=(Token)match(input,42,FOLLOW_42_in_contained_block1066);  
			stream_42.add(char_literal135);

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
			// 161:18: -> block
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:1: array : '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) ;
	public final SneakersParser.array_return array() throws RecognitionException {
		SneakersParser.array_return retval = new SneakersParser.array_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token char_literal136=null;
		Token char_literal138=null;
		Token char_literal140=null;
		ParserRuleReturnScope expr137 =null;
		ParserRuleReturnScope expr139 =null;

		SneakersAST char_literal136_tree=null;
		SneakersAST char_literal138_tree=null;
		SneakersAST char_literal140_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:7: ( '[' ( expr )? ( ',' expr )* ']' -> ^( ARRAY ( expr )* ) )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:9: '[' ( expr )? ( ',' expr )* ']'
			{
			char_literal136=(Token)match(input,41,FOLLOW_41_in_array1080);  
			stream_41.add(char_literal136);

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:13: ( expr )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ANONVAR||(LA29_0 >= ID && LA29_0 <= KEYWORD)||LA29_0==MUTID||(LA29_0 >= STRING && LA29_0 <= TYPEID)||(LA29_0 >= 30 && LA29_0 <= 31)||(LA29_0 >= 40 && LA29_0 <= 41)||LA29_0==49) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:13: expr
					{
					pushFollow(FOLLOW_expr_in_array1082);
					expr137=expr();
					state._fsp--;

					stream_expr.add(expr137.getTree());
					}
					break;

			}

			// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:19: ( ',' expr )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==33) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:20: ',' expr
					{
					char_literal138=(Token)match(input,33,FOLLOW_33_in_array1086);  
					stream_33.add(char_literal138);

					pushFollow(FOLLOW_expr_in_array1088);
					expr139=expr();
					state._fsp--;

					stream_expr.add(expr139.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			char_literal140=(Token)match(input,42,FOLLOW_42_in_array1092);  
			stream_42.add(char_literal140);

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
			// 164:35: -> ^( ARRAY ( expr )* )
			{
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:38: ^( ARRAY ( expr )* )
				{
				SneakersAST root_1 = (SneakersAST)adaptor.nil();
				root_1 = (SneakersAST)adaptor.becomeRoot((SneakersAST)adaptor.create(ARRAY, "ARRAY"), root_1);
				// /Users/eli/dev/Sneakers-Java/Sneakers.g:164:46: ( expr )*
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
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:183:1: any_id : ( ID | MUTID | TYPEID );
	public final SneakersParser.any_id_return any_id() throws RecognitionException {
		SneakersParser.any_id_return retval = new SneakersParser.any_id_return();
		retval.start = input.LT(1);

		SneakersAST root_0 = null;

		Token set141=null;

		SneakersAST set141_tree=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:184:2: ( ID | MUTID | TYPEID )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:
			{
			root_0 = (SneakersAST)adaptor.nil();


			set141=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==MUTID||input.LA(1)==TYPEID ) {
				input.consume();
				adaptor.addChild(root_0, (SneakersAST)adaptor.create(set141));
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
		"\1\60\3\5\1\uffff\1\21\1\uffff\1\21\2\5";
	static final String DFA3_maxS =
		"\1\60\3\61\1\uffff\1\34\1\uffff\1\34\2\61";
	static final String DFA3_acceptS =
		"\4\uffff\1\2\1\uffff\1\1\3\uffff";
	static final String DFA3_specialS =
		"\12\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1",
			"\1\2\13\uffff\1\3\2\4\2\uffff\1\3\4\uffff\1\4\1\3\1\uffff\2\4\10\uffff"+
			"\2\4\7\uffff\1\4",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\5\1"+
			"\uffff\1\4\3\uffff\2\6\7\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\7\1"+
			"\uffff\1\4\3\uffff\2\6\7\uffff\1\6",
			"",
			"\1\10\4\uffff\1\10\5\uffff\1\10",
			"",
			"\1\11\4\uffff\1\11\5\uffff\1\11",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\5\1"+
			"\uffff\1\4\3\uffff\2\6\7\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\7\1"+
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
	}

	static final String DFA8_eotS =
		"\21\uffff";
	static final String DFA8_eofS =
		"\21\uffff";
	static final String DFA8_minS =
		"\1\21\2\7\2\5\1\uffff\1\5\1\uffff\2\5\1\21\1\uffff\2\21\1\uffff\2\5";
	static final String DFA8_maxS =
		"\1\34\2\7\2\61\1\uffff\1\61\1\uffff\2\61\1\55\1\uffff\2\34\1\uffff\2\61";
	static final String DFA8_acceptS =
		"\5\uffff\1\1\1\uffff\1\3\3\uffff\1\4\2\uffff\1\2\2\uffff";
	static final String DFA8_specialS =
		"\21\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\2\4\uffff\1\2\5\uffff\1\1",
			"\1\3",
			"\1\4",
			"\1\10\4\uffff\1\5\6\uffff\1\11\2\7\2\uffff\1\11\4\uffff\1\7\1\6\1\uffff"+
			"\2\7\10\uffff\2\7\7\uffff\1\7",
			"\1\10\13\uffff\1\11\2\7\2\uffff\1\11\4\uffff\1\7\1\11\1\uffff\2\7\10"+
			"\uffff\2\7\7\uffff\1\7",
			"",
			"\1\13\13\uffff\3\13\2\uffff\1\13\4\uffff\2\13\1\uffff\2\13\2\uffff\1"+
			"\12\1\uffff\1\7\3\uffff\2\13\7\uffff\1\13",
			"",
			"\1\13\13\uffff\3\13\2\uffff\1\13\4\uffff\2\13\1\uffff\2\13\2\uffff\1"+
			"\14\1\uffff\1\7\3\uffff\2\13\7\uffff\1\13",
			"\1\13\13\uffff\3\13\2\uffff\1\13\4\uffff\2\13\1\uffff\2\13\2\uffff\1"+
			"\15\1\uffff\1\7\3\uffff\2\13\7\uffff\1\13",
			"\1\17\4\uffff\1\17\5\uffff\1\17\20\uffff\1\16",
			"",
			"\1\20\4\uffff\1\20\5\uffff\1\20",
			"\1\17\4\uffff\1\17\5\uffff\1\17",
			"",
			"\1\13\13\uffff\3\13\2\uffff\1\13\4\uffff\2\13\1\uffff\2\13\2\uffff\1"+
			"\15\1\uffff\1\7\3\uffff\2\13\7\uffff\1\13",
			"\1\13\13\uffff\3\13\2\uffff\1\13\4\uffff\2\13\1\uffff\2\13\2\uffff\1"+
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
			return "73:1: assignment : ( TYPEID '=' 'class' classdef -> ^( 'class' TYPEID classdef ) |newclass= TYPEID '=' oldclass= TYPEID '.' 'extend' classdef -> ^( 'extend' $newclass $oldclass classdef ) | any_id '=' expr -> ^( '=' any_id expr ) | any_id '=' fncall -> ^( '=' any_id fncall ) );";
		}
	}

	static final String DFA19_eotS =
		"\13\uffff";
	static final String DFA19_eofS =
		"\13\uffff";
	static final String DFA19_minS =
		"\1\36\1\51\3\5\1\21\2\uffff\1\21\2\5";
	static final String DFA19_maxS =
		"\1\36\1\51\1\34\2\61\1\34\2\uffff\1\34\2\61";
	static final String DFA19_acceptS =
		"\6\uffff\1\1\1\2\3\uffff";
	static final String DFA19_specialS =
		"\13\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\13\uffff\1\4\4\uffff\1\4\5\uffff\1\4",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\5\5"+
			"\uffff\2\6\1\7\6\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\10\5"+
			"\uffff\2\6\1\7\6\uffff\1\6",
			"\1\11\4\uffff\1\11\5\uffff\1\11",
			"",
			"",
			"\1\12\4\uffff\1\12\5\uffff\1\12",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\5\5"+
			"\uffff\2\6\1\7\6\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\10\5"+
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
			return "113:1: anonfn : ( '#' '[' fncall ']' -> ^( ANONFN fncall ) | '#' '[' nested_id ']' -> ^( ANONFN nested_id ) );";
		}
	}

	static final String DFA24_eotS =
		"\12\uffff";
	static final String DFA24_eofS =
		"\12\uffff";
	static final String DFA24_minS =
		"\1\37\3\5\1\21\2\uffff\1\21\2\5";
	static final String DFA24_maxS =
		"\1\37\1\34\2\61\1\34\2\uffff\1\34\2\61";
	static final String DFA24_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA24_specialS =
		"\12\uffff}>";
	static final String[] DFA24_transitionS = {
			"\1\1",
			"\1\2\13\uffff\1\3\4\uffff\1\3\5\uffff\1\3",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\1\5\1\uffff\1"+
			"\4\5\uffff\2\6\7\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\1\5\1\uffff\1"+
			"\7\5\uffff\2\6\7\uffff\1\6",
			"\1\10\4\uffff\1\10\5\uffff\1\10",
			"",
			"",
			"\1\11\4\uffff\1\11\5\uffff\1\11",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\1\5\1\uffff\1"+
			"\4\5\uffff\2\6\7\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\1\5\1\uffff\1"+
			"\7\5\uffff\2\6\7\uffff\1\6"
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
			return "136:1: standalone_fncall : ( '(' nested_id ')' -> ^( FNCALL nested_id ) | '(' fncall ')' -> fncall );";
		}
	}

	static final String DFA25_eotS =
		"\12\uffff";
	static final String DFA25_eofS =
		"\12\uffff";
	static final String DFA25_minS =
		"\1\45\3\5\1\21\2\uffff\1\21\2\5";
	static final String DFA25_maxS =
		"\1\45\1\34\2\61\1\34\2\uffff\1\34\2\61";
	static final String DFA25_acceptS =
		"\5\uffff\1\1\1\2\3\uffff";
	static final String DFA25_specialS =
		"\12\uffff}>";
	static final String[] DFA25_transitionS = {
			"\1\1",
			"\1\2\13\uffff\1\3\4\uffff\1\3\5\uffff\1\3",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\4\4"+
			"\uffff\1\5\2\6\7\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\7\4"+
			"\uffff\1\5\2\6\7\uffff\1\6",
			"\1\10\4\uffff\1\10\5\uffff\1\10",
			"",
			"",
			"\1\11\4\uffff\1\11\5\uffff\1\11",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\4\4"+
			"\uffff\1\5\2\6\7\uffff\1\6",
			"\1\6\13\uffff\3\6\2\uffff\1\6\4\uffff\2\6\1\uffff\2\6\2\uffff\1\7\4"+
			"\uffff\1\5\2\6\7\uffff\1\6"
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
			return "141:1: mutcall : ( '<' nested_id '>' -> nested_id | '<' fncall '>' -> fncall );";
		}
	}

	public static final BitSet FOLLOW_block_in_prog145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_block157 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_block159 = new BitSet(new long[]{0x0001C02010420002L});
	public static final BitSet FOLLOW_assignment_in_stat178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_stat188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutcall_in_stat193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_stat198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_returnstat209 = new BitSet(new long[]{0x0000000010420020L});
	public static final BitSet FOLLOW_fncall_in_returnstat211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_returnstat224 = new BitSet(new long[]{0x00020300D84E0020L});
	public static final BitSet FOLLOW_expr_in_returnstat226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_ifstat244 = new BitSet(new long[]{0x00020300D84E0020L});
	public static final BitSet FOLLOW_expr_in_ifstat248 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat252 = new BitSet(new long[]{0x0000180000000002L});
	public static final BitSet FOLLOW_44_in_ifstat258 = new BitSet(new long[]{0x00020300D84E0020L});
	public static final BitSet FOLLOW_expr_in_ifstat262 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat266 = new BitSet(new long[]{0x0000180000000002L});
	public static final BitSet FOLLOW_43_in_ifstat274 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_contained_block_in_ifstat278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_classdef314 = new BitSet(new long[]{0x0004000200080000L});
	public static final BitSet FOLLOW_fielddef_in_classdef317 = new BitSet(new long[]{0x0004000200000000L});
	public static final BitSet FOLLOW_33_in_classdef322 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_fielddef_in_classdef324 = new BitSet(new long[]{0x0004000200000000L});
	public static final BitSet FOLLOW_50_in_classdef328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_assignment344 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment346 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CLASSDEF_in_assignment348 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_classdef_in_assignment350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_assignment367 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment369 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_TYPEID_in_assignment373 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_assignment375 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_assignment377 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_classdef_in_assignment379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment398 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment400 = new BitSet(new long[]{0x00020300D84E0020L});
	public static final BitSet FOLLOW_expr_in_assignment402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_any_id_in_assignment417 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment419 = new BitSet(new long[]{0x0000000010420020L});
	public static final BitSet FOLLOW_fncall_in_assignment421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_fielddef444 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_fielddef446 = new BitSet(new long[]{0x0000010050000000L});
	public static final BitSet FOLLOW_paramtype_in_fielddef448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_fielddef463 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_fielddef465 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_fndecl_in_fielddef467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_fielddef482 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_fielddef484 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_mutdecl_in_fielddef486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANONVAR_in_nested_id509 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_nested_id512 = new BitSet(new long[]{0x0000000010420000L});
	public static final BitSet FOLLOW_any_id_in_nested_id514 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_any_id_in_nested_id528 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_nested_id531 = new BitSet(new long[]{0x0000000010420000L});
	public static final BitSet FOLLOW_any_id_in_nested_id533 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_nested_id_in_fncall550 = new BitSet(new long[]{0x00020300D84E0020L});
	public static final BitSet FOLLOW_param_in_fncall552 = new BitSet(new long[]{0x00020302D84E0022L});
	public static final BitSet FOLLOW_33_in_fncall555 = new BitSet(new long[]{0x00020300D84E0020L});
	public static final BitSet FOLLOW_param_in_fncall558 = new BitSet(new long[]{0x00020302D84E0022L});
	public static final BitSet FOLLOW_ID_in_param581 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_param583 = new BitSet(new long[]{0x00020300D84E0020L});
	public static final BitSet FOLLOW_expr_in_param585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_param600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_blockparamtype620 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype622 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_33_in_blockparamtype625 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype627 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_32_in_blockparamtype631 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_blockparamtype633 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_blockparamtype645 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_blockparamtype647 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_blockparamtype649 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockparamtype651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_paramtype666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_paramtype671 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_blockparamtype_in_paramtype673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_paramtype686 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_blockparamtype_in_paramtype688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fnparam707 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_fnparam709 = new BitSet(new long[]{0x0000010050000000L});
	public static final BitSet FOLLOW_paramtype_in_fnparam711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_anonfn731 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_anonfn733 = new BitSet(new long[]{0x0000000010420020L});
	public static final BitSet FOLLOW_fncall_in_anonfn735 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_anonfn737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_anonfn750 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_anonfn752 = new BitSet(new long[]{0x0000000010420020L});
	public static final BitSet FOLLOW_nested_id_in_anonfn754 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_anonfn756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_blockdecl775 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_blockdecl777 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_blockdecl779 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl781 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_blockdecl794 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl796 = new BitSet(new long[]{0x0000000300020000L});
	public static final BitSet FOLLOW_33_in_blockdecl799 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_fnparam_in_blockdecl802 = new BitSet(new long[]{0x0000000300020000L});
	public static final BitSet FOLLOW_32_in_blockdecl806 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_blockdecl808 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_TYPEID_in_blockdecl810 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_contained_block_in_blockdecl812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_fndecl831 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_blockdecl_in_fndecl833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_mutdecl851 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_blockdecl_in_mutdecl853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_expr871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fndecl_in_expr881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutdecl_in_expr886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anonfn_in_expr891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_expr896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_standalone_fncall907 = new BitSet(new long[]{0x0000000010420020L});
	public static final BitSet FOLLOW_nested_id_in_standalone_fncall909 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_standalone_fncall911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_standalone_fncall924 = new BitSet(new long[]{0x0000000010420020L});
	public static final BitSet FOLLOW_fncall_in_standalone_fncall926 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_standalone_fncall928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_mutcall942 = new BitSet(new long[]{0x0000000010420020L});
	public static final BitSet FOLLOW_nested_id_in_mutcall944 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_mutcall946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_mutcall955 = new BitSet(new long[]{0x0000000010420020L});
	public static final BitSet FOLLOW_fncall_in_mutcall957 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_mutcall959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_in_index_expr974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_index_expr979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_index_expr984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nested_id_in_index_expr989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standalone_fncall_in_index_expr994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_expr_in_dict_pair1006 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_dict_pair1008 = new BitSet(new long[]{0x00020300D84E0020L});
	public static final BitSet FOLLOW_expr_in_dict_pair1010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_dict1026 = new BitSet(new long[]{0x00040002984E0020L});
	public static final BitSet FOLLOW_dict_pair_in_dict1029 = new BitSet(new long[]{0x0004000200000000L});
	public static final BitSet FOLLOW_33_in_dict1034 = new BitSet(new long[]{0x00000000984E0020L});
	public static final BitSet FOLLOW_dict_pair_in_dict1036 = new BitSet(new long[]{0x0004000200000000L});
	public static final BitSet FOLLOW_50_in_dict1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_contained_block1062 = new BitSet(new long[]{0x0001C02010420000L});
	public static final BitSet FOLLOW_block_in_contained_block1064 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_contained_block1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_array1080 = new BitSet(new long[]{0x00020702D84E0020L});
	public static final BitSet FOLLOW_expr_in_array1082 = new BitSet(new long[]{0x0000040200000000L});
	public static final BitSet FOLLOW_33_in_array1086 = new BitSet(new long[]{0x00020300D84E0020L});
	public static final BitSet FOLLOW_expr_in_array1088 = new BitSet(new long[]{0x0000040200000000L});
	public static final BitSet FOLLOW_42_in_array1092 = new BitSet(new long[]{0x0000000000000002L});
}
