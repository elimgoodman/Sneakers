// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/JS.g 2013-05-31 18:00:56

package sneakers;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class JS extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public JS(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public JS(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("JSTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return JS.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/eli/dev/Sneakers-Java/JS.g"; }


	public static class compilationUnit_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "compilationUnit"
	// /Users/eli/dev/Sneakers-Java/JS.g:17:1: compilationUnit : ^( BLOCK (stats+= stat )+ ) -> file(stats=$stats);
	public final JS.compilationUnit_return compilationUnit() throws RecognitionException {
		JS.compilationUnit_return retval = new JS.compilationUnit_return();
		retval.start = input.LT(1);

		List<Object> list_stats=null;
		RuleReturnScope stats = null;
		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:18:2: ( ^( BLOCK (stats+= stat )+ ) -> file(stats=$stats))
			// /Users/eli/dev/Sneakers-Java/JS.g:18:4: ^( BLOCK (stats+= stat )+ )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_compilationUnit56); 
			match(input, Token.DOWN, null); 
			// /Users/eli/dev/Sneakers-Java/JS.g:18:17: (stats+= stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ASSIGN||LA1_0==CLASSDEF||LA1_0==47) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:18:17: stats+= stat
					{
					pushFollow(FOLLOW_stat_in_compilationUnit60);
					stats=stat();
					state._fsp--;

					if (list_stats==null) list_stats=new ArrayList<Object>();
					list_stats.add(stats.getTemplate());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 18:26: -> file(stats=$stats)
			{
				retval.st = templateLib.getInstanceOf("file",new STAttrMap().put("stats", list_stats));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compilationUnit"


	public static class stat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "stat"
	// /Users/eli/dev/Sneakers-Java/JS.g:21:1: stat : ( ^( '=' name= ID value= expr ) -> assignment(name=$namevalue=$value.st)| ^( CLASSDEF name= TYPEID (members+= member )* ) -> classdef(name=$namemembers=$members)| 'pass' -> pass();
	public final JS.stat_return stat() throws RecognitionException {
		JS.stat_return retval = new JS.stat_return();
		retval.start = input.LT(1);

		SneakersAST name=null;
		List<Object> list_members=null;
		TreeRuleReturnScope value =null;
		RuleReturnScope members = null;
		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:22:2: ( ^( '=' name= ID value= expr ) -> assignment(name=$namevalue=$value.st)| ^( CLASSDEF name= TYPEID (members+= member )* ) -> classdef(name=$namemembers=$members)| 'pass' -> pass()
			int alt3=3;
			switch ( input.LA(1) ) {
			case ASSIGN:
				{
				alt3=1;
				}
				break;
			case CLASSDEF:
				{
				alt3=2;
				}
				break;
			case 47:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:22:4: ^( '=' name= ID value= expr )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_stat84); 
					match(input, Token.DOWN, null); 
					name=(SneakersAST)match(input,ID,FOLLOW_ID_in_stat88); 
					pushFollow(FOLLOW_expr_in_stat92);
					value=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 23:3: -> assignment(name=$namevalue=$value.st)
					{
						retval.st = templateLib.getInstanceOf("assignment",new STAttrMap().put("name", name).put("value", (value!=null?((StringTemplate)value.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/JS.g:24:4: ^( CLASSDEF name= TYPEID (members+= member )* )
					{
					match(input,CLASSDEF,FOLLOW_CLASSDEF_in_stat116); 
					match(input, Token.DOWN, null); 
					name=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_stat120); 
					// /Users/eli/dev/Sneakers-Java/JS.g:24:34: (members+= member )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==FIELDDEF||LA2_0==METHODDEF) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:24:34: members+= member
							{
							pushFollow(FOLLOW_member_in_stat124);
							members=member();
							state._fsp--;

							if (list_members==null) list_members=new ArrayList<Object>();
							list_members.add(members.getTemplate());
							}
							break;

						default :
							break loop2;
						}
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 25:3: -> classdef(name=$namemembers=$members)
					{
						retval.st = templateLib.getInstanceOf("classdef",new STAttrMap().put("name", name).put("members", list_members));
					}



					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/JS.g:26:4: 'pass'
					{
					match(input,47,FOLLOW_47_in_stat148); 
					// TEMPLATE REWRITE
					// 26:11: -> pass(
					{
						retval.st = templateLib.getInstanceOf("pass");
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class member_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "member"
	// /Users/eli/dev/Sneakers-Java/JS.g:29:1: member : ( ^( FIELDDEF name= KEYWORD type= TYPEID ) -> identity(o=$name)| ^( METHODDEF name= KEYWORD ^( FNDECL ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) ) -> method(name=$nameparams=$paramsstats=$stats));
	public final JS.member_return member() throws RecognitionException {
		JS.member_return retval = new JS.member_return();
		retval.start = input.LT(1);

		SneakersAST name=null;
		SneakersAST type=null;
		SneakersAST ret=null;
		List<Object> list_params=null;
		List<Object> list_stats=null;
		RuleReturnScope params = null;
		RuleReturnScope stats = null;
		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:29:8: ( ^( FIELDDEF name= KEYWORD type= TYPEID ) -> identity(o=$name)| ^( METHODDEF name= KEYWORD ^( FNDECL ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) ) -> method(name=$nameparams=$paramsstats=$stats))
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==FIELDDEF) ) {
				alt6=1;
			}
			else if ( (LA6_0==METHODDEF) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:29:10: ^( FIELDDEF name= KEYWORD type= TYPEID )
					{
					match(input,FIELDDEF,FOLLOW_FIELDDEF_in_member165); 
					match(input, Token.DOWN, null); 
					name=(SneakersAST)match(input,KEYWORD,FOLLOW_KEYWORD_in_member169); 
					type=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_member173); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 29:47: -> identity(o=$name)
					{
						retval.st = templateLib.getInstanceOf("identity",new STAttrMap().put("o", name));
					}



					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/JS.g:30:4: ^( METHODDEF name= KEYWORD ^( FNDECL ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) )
					{
					match(input,METHODDEF,FOLLOW_METHODDEF_in_member189); 
					match(input, Token.DOWN, null); 
					name=(SneakersAST)match(input,KEYWORD,FOLLOW_KEYWORD_in_member193); 
					match(input,FNDECL,FOLLOW_FNDECL_in_member196); 
					match(input, Token.DOWN, null); 
					ret=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_member200); 
					// /Users/eli/dev/Sneakers-Java/JS.g:30:55: (params+= param )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==FNPARAM) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:30:55: params+= param
							{
							pushFollow(FOLLOW_param_in_member204);
							params=param();
							state._fsp--;

							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							break loop4;
						}
					}

					match(input,BLOCK,FOLLOW_BLOCK_in_member208); 
					match(input, Token.DOWN, null); 
					// /Users/eli/dev/Sneakers-Java/JS.g:30:77: (stats+= stat )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==ASSIGN||LA5_0==CLASSDEF||LA5_0==47) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:30:77: stats+= stat
							{
							pushFollow(FOLLOW_stat_in_member212);
							stats=stat();
							state._fsp--;

							if (list_stats==null) list_stats=new ArrayList<Object>();
							list_stats.add(stats.getTemplate());
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 31:3: -> method(name=$nameparams=$paramsstats=$stats)
					{
						retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("name", name).put("params", list_params).put("stats", list_stats));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "member"


	public static class expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// /Users/eli/dev/Sneakers-Java/JS.g:34:1: expr : ( ^( FNDECL ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) -> fndecl(params=$paramsstats=$stats)| ^( FNCALL name= ID (params+= expr )* ) -> fncall(name=$nameparams=$params)| ^( PARAM name= ID ) -> identity(o=$name)|i= INT -> identity(o=$i));
	public final JS.expr_return expr() throws RecognitionException {
		JS.expr_return retval = new JS.expr_return();
		retval.start = input.LT(1);

		SneakersAST ret=null;
		SneakersAST name=null;
		SneakersAST i=null;
		List<Object> list_params=null;
		List<Object> list_stats=null;
		RuleReturnScope params = null;
		RuleReturnScope stats = null;
		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:34:6: ( ^( FNDECL ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) -> fndecl(params=$paramsstats=$stats)| ^( FNCALL name= ID (params+= expr )* ) -> fncall(name=$nameparams=$params)| ^( PARAM name= ID ) -> identity(o=$name)|i= INT -> identity(o=$i))
			int alt10=4;
			switch ( input.LA(1) ) {
			case FNDECL:
				{
				alt10=1;
				}
				break;
			case FNCALL:
				{
				alt10=2;
				}
				break;
			case PARAM:
				{
				alt10=3;
				}
				break;
			case INT:
				{
				alt10=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:34:8: ^( FNDECL ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) )
					{
					match(input,FNDECL,FOLLOW_FNDECL_in_expr249); 
					match(input, Token.DOWN, null); 
					ret=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_expr253); 
					// /Users/eli/dev/Sneakers-Java/JS.g:34:34: (params+= param )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==FNPARAM) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:34:34: params+= param
							{
							pushFollow(FOLLOW_param_in_expr257);
							params=param();
							state._fsp--;

							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							break loop7;
						}
					}

					match(input,BLOCK,FOLLOW_BLOCK_in_expr261); 
					match(input, Token.DOWN, null); 
					// /Users/eli/dev/Sneakers-Java/JS.g:34:56: (stats+= stat )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==ASSIGN||LA8_0==CLASSDEF||LA8_0==47) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:34:56: stats+= stat
							{
							pushFollow(FOLLOW_stat_in_expr265);
							stats=stat();
							state._fsp--;

							if (list_stats==null) list_stats=new ArrayList<Object>();
							list_stats.add(stats.getTemplate());
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 35:3: -> fndecl(params=$paramsstats=$stats)
					{
						retval.st = templateLib.getInstanceOf("fndecl",new STAttrMap().put("params", list_params).put("stats", list_stats));
					}



					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/JS.g:36:4: ^( FNCALL name= ID (params+= expr )* )
					{
					match(input,FNCALL,FOLLOW_FNCALL_in_expr291); 
					match(input, Token.DOWN, null); 
					name=(SneakersAST)match(input,ID,FOLLOW_ID_in_expr295); 
					// /Users/eli/dev/Sneakers-Java/JS.g:36:27: (params+= expr )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= FNCALL && LA9_0 <= FNDECL)||LA9_0==INT||LA9_0==PARAM) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:36:27: params+= expr
							{
							pushFollow(FOLLOW_expr_in_expr299);
							params=expr();
							state._fsp--;

							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							break loop9;
						}
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 36:36: -> fncall(name=$nameparams=$params)
					{
						retval.st = templateLib.getInstanceOf("fncall",new STAttrMap().put("name", name).put("params", list_params));
					}



					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/JS.g:37:4: ^( PARAM name= ID )
					{
					match(input,PARAM,FOLLOW_PARAM_in_expr320); 
					match(input, Token.DOWN, null); 
					name=(SneakersAST)match(input,ID,FOLLOW_ID_in_expr324); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 37:21: -> identity(o=$name)
					{
						retval.st = templateLib.getInstanceOf("identity",new STAttrMap().put("o", name));
					}



					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/JS.g:38:4: i= INT
					{
					i=(SneakersAST)match(input,INT,FOLLOW_INT_in_expr341); 
					// TEMPLATE REWRITE
					// 38:10: -> identity(o=$i)
					{
						retval.st = templateLib.getInstanceOf("identity",new STAttrMap().put("o", i));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class param_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "param"
	// /Users/eli/dev/Sneakers-Java/JS.g:41:1: param : ^( FNPARAM name= ID type= TYPEID ) -> identity(o=$name);
	public final JS.param_return param() throws RecognitionException {
		JS.param_return retval = new JS.param_return();
		retval.start = input.LT(1);

		SneakersAST name=null;
		SneakersAST type=null;

		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:41:7: ( ^( FNPARAM name= ID type= TYPEID ) -> identity(o=$name))
			// /Users/eli/dev/Sneakers-Java/JS.g:41:9: ^( FNPARAM name= ID type= TYPEID )
			{
			match(input,FNPARAM,FOLLOW_FNPARAM_in_param361); 
			match(input, Token.DOWN, null); 
			name=(SneakersAST)match(input,ID,FOLLOW_ID_in_param365); 
			type=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_param369); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 41:40: -> identity(o=$name)
			{
				retval.st = templateLib.getInstanceOf("identity",new STAttrMap().put("o", name));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param"

	// Delegated rules



	public static final BitSet FOLLOW_BLOCK_in_compilationUnit56 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_compilationUnit60 = new BitSet(new long[]{0x0000800000000488L});
	public static final BitSet FOLLOW_ASSIGN_in_stat84 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_stat88 = new BitSet(new long[]{0x000000000084C000L});
	public static final BitSet FOLLOW_expr_in_stat92 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASSDEF_in_stat116 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_stat120 = new BitSet(new long[]{0x0000000000102008L});
	public static final BitSet FOLLOW_member_in_stat124 = new BitSet(new long[]{0x0000000000102008L});
	public static final BitSet FOLLOW_47_in_stat148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIELDDEF_in_member165 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_KEYWORD_in_member169 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_TYPEID_in_member173 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHODDEF_in_member189 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_KEYWORD_in_member193 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_FNDECL_in_member196 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_member200 = new BitSet(new long[]{0x0000000000010100L});
	public static final BitSet FOLLOW_param_in_member204 = new BitSet(new long[]{0x0000000000010100L});
	public static final BitSet FOLLOW_BLOCK_in_member208 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_member212 = new BitSet(new long[]{0x0000800000000488L});
	public static final BitSet FOLLOW_FNDECL_in_expr249 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_expr253 = new BitSet(new long[]{0x0000000000010100L});
	public static final BitSet FOLLOW_param_in_expr257 = new BitSet(new long[]{0x0000000000010100L});
	public static final BitSet FOLLOW_BLOCK_in_expr261 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_expr265 = new BitSet(new long[]{0x0000800000000488L});
	public static final BitSet FOLLOW_FNCALL_in_expr291 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr295 = new BitSet(new long[]{0x000000000084C008L});
	public static final BitSet FOLLOW_expr_in_expr299 = new BitSet(new long[]{0x000000000084C008L});
	public static final BitSet FOLLOW_PARAM_in_expr320 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr324 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_expr341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FNPARAM_in_param361 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_param365 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_TYPEID_in_param369 = new BitSet(new long[]{0x0000000000000008L});
}
