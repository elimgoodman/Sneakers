// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/JS.g 2013-05-31 19:39:07

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
				if ( (LA1_0==ASSIGN||LA1_0==CLASSDEF||LA1_0==RET||LA1_0==50) ) {
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
	// /Users/eli/dev/Sneakers-Java/JS.g:21:1: stat : ( ^( '=' name= ID value= expr ) -> assignment(name=$namevalue=$value.st)| ^( CLASSDEF name= TYPEID (methods+= method |fields+= field )* ) -> classdef(name=$namefields=$fieldsmethods=$methods)| 'pass' -> pass(| ^( RET e= expr ) -> return(expr=$e.st));
	public final JS.stat_return stat() throws RecognitionException {
		JS.stat_return retval = new JS.stat_return();
		retval.start = input.LT(1);

		SneakersAST name=null;
		List<Object> list_methods=null;
		List<Object> list_fields=null;
		TreeRuleReturnScope value =null;
		TreeRuleReturnScope e =null;
		RuleReturnScope methods = null;
		RuleReturnScope fields = null;
		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:22:2: ( ^( '=' name= ID value= expr ) -> assignment(name=$namevalue=$value.st)| ^( CLASSDEF name= TYPEID (methods+= method |fields+= field )* ) -> classdef(name=$namefields=$fieldsmethods=$methods)| 'pass' -> pass(| ^( RET e= expr ) -> return(expr=$e.st))
			int alt3=4;
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
			case 50:
				{
				alt3=3;
				}
				break;
			case RET:
				{
				alt3=4;
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
					// /Users/eli/dev/Sneakers-Java/JS.g:24:4: ^( CLASSDEF name= TYPEID (methods+= method |fields+= field )* )
					{
					match(input,CLASSDEF,FOLLOW_CLASSDEF_in_stat116); 
					match(input, Token.DOWN, null); 
					name=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_stat120); 
					// /Users/eli/dev/Sneakers-Java/JS.g:24:27: (methods+= method |fields+= field )*
					loop2:
					while (true) {
						int alt2=3;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==METHODDEF) ) {
							alt2=1;
						}
						else if ( (LA2_0==FIELDDEF) ) {
							alt2=2;
						}

						switch (alt2) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:24:28: methods+= method
							{
							pushFollow(FOLLOW_method_in_stat125);
							methods=method();
							state._fsp--;

							if (list_methods==null) list_methods=new ArrayList<Object>();
							list_methods.add(methods.getTemplate());
							}
							break;
						case 2 :
							// /Users/eli/dev/Sneakers-Java/JS.g:24:46: fields+= field
							{
							pushFollow(FOLLOW_field_in_stat131);
							fields=field();
							state._fsp--;

							if (list_fields==null) list_fields=new ArrayList<Object>();
							list_fields.add(fields.getTemplate());
							}
							break;

						default :
							break loop2;
						}
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 25:3: -> classdef(name=$namefields=$fieldsmethods=$methods)
					{
						retval.st = templateLib.getInstanceOf("classdef",new STAttrMap().put("name", name).put("fields", list_fields).put("methods", list_methods));
					}



					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/JS.g:26:4: 'pass'
					{
					match(input,50,FOLLOW_50_in_stat162); 
					// TEMPLATE REWRITE
					// 26:11: -> pass(
					{
						retval.st = templateLib.getInstanceOf("pass");
					}



					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/JS.g:27:4: ^( RET e= expr )
					{
					match(input,RET,FOLLOW_RET_in_stat174); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_stat178);
					e=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 27:18: -> return(expr=$e.st)
					{
						retval.st = templateLib.getInstanceOf("return",new STAttrMap().put("expr", (e!=null?((StringTemplate)e.getTemplate()):null)));
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


	public static class field_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "field"
	// /Users/eli/dev/Sneakers-Java/JS.g:30:1: field : ^( FIELDDEF name= ID type= TYPEID ) -> identity(o=$name);
	public final JS.field_return field() throws RecognitionException {
		JS.field_return retval = new JS.field_return();
		retval.start = input.LT(1);

		SneakersAST name=null;
		SneakersAST type=null;

		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:30:7: ( ^( FIELDDEF name= ID type= TYPEID ) -> identity(o=$name))
			// /Users/eli/dev/Sneakers-Java/JS.g:30:9: ^( FIELDDEF name= ID type= TYPEID )
			{
			match(input,FIELDDEF,FOLLOW_FIELDDEF_in_field199); 
			match(input, Token.DOWN, null); 
			name=(SneakersAST)match(input,ID,FOLLOW_ID_in_field203); 
			type=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_field207); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 30:41: -> identity(o=$name)
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
	// $ANTLR end "field"


	public static class method_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "method"
	// /Users/eli/dev/Sneakers-Java/JS.g:33:1: method : ^( METHODDEF name= ID ^( FNDECL ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) ) -> method(name=$nameparams=$paramsstats=$stats);
	public final JS.method_return method() throws RecognitionException {
		JS.method_return retval = new JS.method_return();
		retval.start = input.LT(1);

		SneakersAST name=null;
		SneakersAST ret=null;
		List<Object> list_params=null;
		List<Object> list_stats=null;
		RuleReturnScope params = null;
		RuleReturnScope stats = null;
		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:33:8: ( ^( METHODDEF name= ID ^( FNDECL ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) ) -> method(name=$nameparams=$paramsstats=$stats))
			// /Users/eli/dev/Sneakers-Java/JS.g:33:10: ^( METHODDEF name= ID ^( FNDECL ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) )
			{
			match(input,METHODDEF,FOLLOW_METHODDEF_in_method228); 
			match(input, Token.DOWN, null); 
			name=(SneakersAST)match(input,ID,FOLLOW_ID_in_method232); 
			match(input,FNDECL,FOLLOW_FNDECL_in_method235); 
			match(input, Token.DOWN, null); 
			ret=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_method239); 
			// /Users/eli/dev/Sneakers-Java/JS.g:33:56: (params+= param )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==FNPARAM) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:33:56: params+= param
					{
					pushFollow(FOLLOW_param_in_method243);
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

			match(input,BLOCK,FOLLOW_BLOCK_in_method247); 
			match(input, Token.DOWN, null); 
			// /Users/eli/dev/Sneakers-Java/JS.g:33:78: (stats+= stat )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ASSIGN||LA5_0==CLASSDEF||LA5_0==RET||LA5_0==50) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:33:78: stats+= stat
					{
					pushFollow(FOLLOW_stat_in_method251);
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
			// 34:3: -> method(name=$nameparams=$paramsstats=$stats)
			{
				retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("name", name).put("params", list_params).put("stats", list_stats));
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
	// $ANTLR end "method"


	public static class expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// /Users/eli/dev/Sneakers-Java/JS.g:37:1: expr : ( ^( FNDECL ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) -> fndecl(params=$paramsstats=$stats)| ^( FNCALL name= ID (params+= expr )* ) -> fncall(name=$nameparams=$params)| ^( PARAM name= ID ) -> identity(o=$name)| ^( INSTANCE type= TYPEID ^( DICT (attrs+= dict_pair )+ ) ) -> instance(type=$typeattrs=$attrs)|i= INT -> identity(o=$i));
	public final JS.expr_return expr() throws RecognitionException {
		JS.expr_return retval = new JS.expr_return();
		retval.start = input.LT(1);

		SneakersAST ret=null;
		SneakersAST name=null;
		SneakersAST type=null;
		SneakersAST i=null;
		List<Object> list_params=null;
		List<Object> list_stats=null;
		List<Object> list_attrs=null;
		RuleReturnScope params = null;
		RuleReturnScope stats = null;
		RuleReturnScope attrs = null;
		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:37:6: ( ^( FNDECL ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) -> fndecl(params=$paramsstats=$stats)| ^( FNCALL name= ID (params+= expr )* ) -> fncall(name=$nameparams=$params)| ^( PARAM name= ID ) -> identity(o=$name)| ^( INSTANCE type= TYPEID ^( DICT (attrs+= dict_pair )+ ) ) -> instance(type=$typeattrs=$attrs)|i= INT -> identity(o=$i))
			int alt10=5;
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
			case INSTANCE:
				{
				alt10=4;
				}
				break;
			case INT:
				{
				alt10=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:37:8: ^( FNDECL ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) )
					{
					match(input,FNDECL,FOLLOW_FNDECL_in_expr288); 
					match(input, Token.DOWN, null); 
					ret=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_expr292); 
					// /Users/eli/dev/Sneakers-Java/JS.g:37:34: (params+= param )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==FNPARAM) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:37:34: params+= param
							{
							pushFollow(FOLLOW_param_in_expr296);
							params=param();
							state._fsp--;

							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							break loop6;
						}
					}

					match(input,BLOCK,FOLLOW_BLOCK_in_expr300); 
					match(input, Token.DOWN, null); 
					// /Users/eli/dev/Sneakers-Java/JS.g:37:56: (stats+= stat )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==ASSIGN||LA7_0==CLASSDEF||LA7_0==RET||LA7_0==50) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:37:56: stats+= stat
							{
							pushFollow(FOLLOW_stat_in_expr304);
							stats=stat();
							state._fsp--;

							if (list_stats==null) list_stats=new ArrayList<Object>();
							list_stats.add(stats.getTemplate());
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 38:3: -> fndecl(params=$paramsstats=$stats)
					{
						retval.st = templateLib.getInstanceOf("fndecl",new STAttrMap().put("params", list_params).put("stats", list_stats));
					}



					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/JS.g:39:4: ^( FNCALL name= ID (params+= expr )* )
					{
					match(input,FNCALL,FOLLOW_FNCALL_in_expr330); 
					match(input, Token.DOWN, null); 
					name=(SneakersAST)match(input,ID,FOLLOW_ID_in_expr334); 
					// /Users/eli/dev/Sneakers-Java/JS.g:39:27: (params+= expr )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= FNCALL && LA8_0 <= FNDECL)||(LA8_0 >= INSTANCE && LA8_0 <= INT)||LA8_0==PARAM) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:39:27: params+= expr
							{
							pushFollow(FOLLOW_expr_in_expr338);
							params=expr();
							state._fsp--;

							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							break loop8;
						}
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 39:36: -> fncall(name=$nameparams=$params)
					{
						retval.st = templateLib.getInstanceOf("fncall",new STAttrMap().put("name", name).put("params", list_params));
					}



					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/JS.g:40:4: ^( PARAM name= ID )
					{
					match(input,PARAM,FOLLOW_PARAM_in_expr359); 
					match(input, Token.DOWN, null); 
					name=(SneakersAST)match(input,ID,FOLLOW_ID_in_expr363); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 40:21: -> identity(o=$name)
					{
						retval.st = templateLib.getInstanceOf("identity",new STAttrMap().put("o", name));
					}



					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/JS.g:41:4: ^( INSTANCE type= TYPEID ^( DICT (attrs+= dict_pair )+ ) )
					{
					match(input,INSTANCE,FOLLOW_INSTANCE_in_expr379); 
					match(input, Token.DOWN, null); 
					type=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_expr383); 
					match(input,DICT,FOLLOW_DICT_in_expr386); 
					match(input, Token.DOWN, null); 
					// /Users/eli/dev/Sneakers-Java/JS.g:41:39: (attrs+= dict_pair )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==DICT_PAIR) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:41:39: attrs+= dict_pair
							{
							pushFollow(FOLLOW_dict_pair_in_expr390);
							attrs=dict_pair();
							state._fsp--;

							if (list_attrs==null) list_attrs=new ArrayList<Object>();
							list_attrs.add(attrs.getTemplate());
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 42:3: -> instance(type=$typeattrs=$attrs)
					{
						retval.st = templateLib.getInstanceOf("instance",new STAttrMap().put("type", type).put("attrs", list_attrs));
					}



					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/JS.g:43:4: i= INT
					{
					i=(SneakersAST)match(input,INT,FOLLOW_INT_in_expr416); 
					// TEMPLATE REWRITE
					// 43:10: -> identity(o=$i)
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


	public static class dict_pair_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dict_pair"
	// /Users/eli/dev/Sneakers-Java/JS.g:46:1: dict_pair : ^( DICT_PAIR key= . value= . ) -> dict_pair(key=$keyvalue=$value);
	public final JS.dict_pair_return dict_pair() throws RecognitionException {
		JS.dict_pair_return retval = new JS.dict_pair_return();
		retval.start = input.LT(1);

		SneakersAST key=null;
		SneakersAST value=null;

		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:46:10: ( ^( DICT_PAIR key= . value= . ) -> dict_pair(key=$keyvalue=$value))
			// /Users/eli/dev/Sneakers-Java/JS.g:46:12: ^( DICT_PAIR key= . value= . )
			{
			match(input,DICT_PAIR,FOLLOW_DICT_PAIR_in_dict_pair435); 
			match(input, Token.DOWN, null); 
			key=(SneakersAST)input.LT(1);
			matchAny(input); 
			value=(SneakersAST)input.LT(1);
			matchAny(input); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 46:39: -> dict_pair(key=$keyvalue=$value)
			{
				retval.st = templateLib.getInstanceOf("dict_pair",new STAttrMap().put("key", key).put("value", value));
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
	// $ANTLR end "dict_pair"


	public static class param_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "param"
	// /Users/eli/dev/Sneakers-Java/JS.g:49:1: param : ^( FNPARAM name= ID type= TYPEID ) -> identity(o=$name);
	public final JS.param_return param() throws RecognitionException {
		JS.param_return retval = new JS.param_return();
		retval.start = input.LT(1);

		SneakersAST name=null;
		SneakersAST type=null;

		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:49:7: ( ^( FNPARAM name= ID type= TYPEID ) -> identity(o=$name))
			// /Users/eli/dev/Sneakers-Java/JS.g:49:9: ^( FNPARAM name= ID type= TYPEID )
			{
			match(input,FNPARAM,FOLLOW_FNPARAM_in_param469); 
			match(input, Token.DOWN, null); 
			name=(SneakersAST)match(input,ID,FOLLOW_ID_in_param473); 
			type=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_param477); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 49:40: -> identity(o=$name)
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
	public static final BitSet FOLLOW_stat_in_compilationUnit60 = new BitSet(new long[]{0x0004000010000488L});
	public static final BitSet FOLLOW_ASSIGN_in_stat84 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_stat88 = new BitSet(new long[]{0x0000000002198000L});
	public static final BitSet FOLLOW_expr_in_stat92 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASSDEF_in_stat116 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_stat120 = new BitSet(new long[]{0x0000000000404008L});
	public static final BitSet FOLLOW_method_in_stat125 = new BitSet(new long[]{0x0000000000404008L});
	public static final BitSet FOLLOW_field_in_stat131 = new BitSet(new long[]{0x0000000000404008L});
	public static final BitSet FOLLOW_50_in_stat162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RET_in_stat174 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_stat178 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FIELDDEF_in_field199 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_field203 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TYPEID_in_field207 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHODDEF_in_method228 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_method232 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_FNDECL_in_method235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_method239 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_param_in_method243 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_BLOCK_in_method247 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_method251 = new BitSet(new long[]{0x0004000010000488L});
	public static final BitSet FOLLOW_FNDECL_in_expr288 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_expr292 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_param_in_expr296 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_BLOCK_in_expr300 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_expr304 = new BitSet(new long[]{0x0004000010000488L});
	public static final BitSet FOLLOW_FNCALL_in_expr330 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr334 = new BitSet(new long[]{0x0000000002198008L});
	public static final BitSet FOLLOW_expr_in_expr338 = new BitSet(new long[]{0x0000000002198008L});
	public static final BitSet FOLLOW_PARAM_in_expr359 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INSTANCE_in_expr379 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_expr383 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DICT_in_expr386 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dict_pair_in_expr390 = new BitSet(new long[]{0x0000000000001008L});
	public static final BitSet FOLLOW_INT_in_expr416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DICT_PAIR_in_dict_pair435 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FNPARAM_in_param469 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_param473 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TYPEID_in_param477 = new BitSet(new long[]{0x0000000000000008L});
}
