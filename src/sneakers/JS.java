// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/JS.g 2013-06-02 22:11:56

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
		"RET", "SL_COMMENT", "STRING", "TYPEID", "WS", "'#'", "'('", "')'", "','", 
		"'.'", "':'", "';'", "'<'", "'=>'", "'>'", "'@'", "'['", "']'", "'else'", 
		"'elseif'", "'extend'", "'if'", "'new'", "'pass'", "'return'", "'{'", 
		"'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__54=54;
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
	public static final int SL_COMMENT=29;
	public static final int STRING=30;
	public static final int TYPEID=31;
	public static final int WS=32;

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
				if ( (LA1_0==ASSIGN||LA1_0==CLASSDEF||LA1_0==RET||LA1_0==51) ) {
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
			case 51:
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
					match(input,51,FOLLOW_51_in_stat162); 
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
				if ( (LA5_0==ASSIGN||LA5_0==CLASSDEF||LA5_0==RET||LA5_0==51) ) {
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
	// /Users/eli/dev/Sneakers-Java/JS.g:37:1: expr : ( ^( ( FNDECL | MUTDECL ) ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) -> fndecl(params=$paramsstats=$stats)| ^( FNCALL (names+= ID )+ (params+= fncallparam )* ) -> fncall(names=$namesparams=$params)| ^( INSTANCE (types+= any_id )+ d= dict ) -> instance(types=$typesattrs=$d.st)|i= INT -> identity(o=$i)|i= ID -> identity(o=$i)|s= STRING -> identity(o=$s)|d= dict -> identity(o=$d.st)| ^( ARRAY (exs+= expr )* ) -> array(exs=$exs));
	public final JS.expr_return expr() throws RecognitionException {
		JS.expr_return retval = new JS.expr_return();
		retval.start = input.LT(1);

		SneakersAST ret=null;
		SneakersAST i=null;
		SneakersAST s=null;
		SneakersAST names=null;
		List<Object> list_names=null;
		List<Object> list_params=null;
		List<Object> list_stats=null;
		List<Object> list_types=null;
		List<Object> list_exs=null;
		TreeRuleReturnScope d =null;
		RuleReturnScope params = null;
		RuleReturnScope stats = null;
		RuleReturnScope types = null;
		RuleReturnScope exs = null;
		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:37:6: ( ^( ( FNDECL | MUTDECL ) ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) -> fndecl(params=$paramsstats=$stats)| ^( FNCALL (names+= ID )+ (params+= fncallparam )* ) -> fncall(names=$namesparams=$params)| ^( INSTANCE (types+= any_id )+ d= dict ) -> instance(types=$typesattrs=$d.st)|i= INT -> identity(o=$i)|i= ID -> identity(o=$i)|s= STRING -> identity(o=$s)|d= dict -> identity(o=$d.st)| ^( ARRAY (exs+= expr )* ) -> array(exs=$exs))
			int alt13=8;
			switch ( input.LA(1) ) {
			case FNDECL:
			case MUTDECL:
				{
				alt13=1;
				}
				break;
			case FNCALL:
				{
				alt13=2;
				}
				break;
			case INSTANCE:
				{
				alt13=3;
				}
				break;
			case INT:
				{
				alt13=4;
				}
				break;
			case ID:
				{
				alt13=5;
				}
				break;
			case STRING:
				{
				alt13=6;
				}
				break;
			case DICT:
				{
				alt13=7;
				}
				break;
			case ARRAY:
				{
				alt13=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:37:8: ^( ( FNDECL | MUTDECL ) ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) )
					{
					// /Users/eli/dev/Sneakers-Java/JS.g:37:10: ( FNDECL | MUTDECL )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==FNDECL) ) {
						alt6=1;
					}
					else if ( (LA6_0==MUTDECL) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:37:11: FNDECL
							{
							match(input,FNDECL,FOLLOW_FNDECL_in_expr289); 
							}
							break;
						case 2 :
							// /Users/eli/dev/Sneakers-Java/JS.g:37:20: MUTDECL
							{
							match(input,MUTDECL,FOLLOW_MUTDECL_in_expr293); 
							}
							break;

					}

					match(input, Token.DOWN, null); 
					ret=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_expr298); 
					// /Users/eli/dev/Sneakers-Java/JS.g:37:46: (params+= param )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==FNPARAM) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:37:46: params+= param
							{
							pushFollow(FOLLOW_param_in_expr302);
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

					match(input,BLOCK,FOLLOW_BLOCK_in_expr306); 
					match(input, Token.DOWN, null); 
					// /Users/eli/dev/Sneakers-Java/JS.g:37:68: (stats+= stat )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==ASSIGN||LA8_0==CLASSDEF||LA8_0==RET||LA8_0==51) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:37:68: stats+= stat
							{
							pushFollow(FOLLOW_stat_in_expr310);
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
					// 38:4: -> fndecl(params=$paramsstats=$stats)
					{
						retval.st = templateLib.getInstanceOf("fndecl",new STAttrMap().put("params", list_params).put("stats", list_stats));
					}



					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/JS.g:39:4: ^( FNCALL (names+= ID )+ (params+= fncallparam )* )
					{
					match(input,FNCALL,FOLLOW_FNCALL_in_expr337); 
					match(input, Token.DOWN, null); 
					// /Users/eli/dev/Sneakers-Java/JS.g:39:18: (names+= ID )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==ID) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:39:18: names+= ID
							{
							names=(SneakersAST)match(input,ID,FOLLOW_ID_in_expr341); 
							if (list_names==null) list_names=new ArrayList<Object>();
							list_names.add(names);
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					// /Users/eli/dev/Sneakers-Java/JS.g:39:30: (params+= fncallparam )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==PARAM) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:39:30: params+= fncallparam
							{
							pushFollow(FOLLOW_fncallparam_in_expr346);
							params=fncallparam();
							state._fsp--;

							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							break loop10;
						}
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 39:46: -> fncall(names=$namesparams=$params)
					{
						retval.st = templateLib.getInstanceOf("fncall",new STAttrMap().put("names", list_names).put("params", list_params));
					}



					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/JS.g:40:4: ^( INSTANCE (types+= any_id )+ d= dict )
					{
					match(input,INSTANCE,FOLLOW_INSTANCE_in_expr367); 
					match(input, Token.DOWN, null); 
					// /Users/eli/dev/Sneakers-Java/JS.g:40:20: (types+= any_id )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==ID||LA11_0==MUTID||LA11_0==TYPEID) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:40:20: types+= any_id
							{
							pushFollow(FOLLOW_any_id_in_expr371);
							types=any_id();
							state._fsp--;

							if (list_types==null) list_types=new ArrayList<Object>();
							list_types.add(types.getTemplate());
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					pushFollow(FOLLOW_dict_in_expr376);
					d=dict();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 41:4: -> instance(types=$typesattrs=$d.st)
					{
						retval.st = templateLib.getInstanceOf("instance",new STAttrMap().put("types", list_types).put("attrs", (d!=null?((StringTemplate)d.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/JS.g:42:4: i= INT
					{
					i=(SneakersAST)match(input,INT,FOLLOW_INT_in_expr401); 
					// TEMPLATE REWRITE
					// 42:10: -> identity(o=$i)
					{
						retval.st = templateLib.getInstanceOf("identity",new STAttrMap().put("o", i));
					}



					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/JS.g:43:4: i= ID
					{
					i=(SneakersAST)match(input,ID,FOLLOW_ID_in_expr417); 
					// TEMPLATE REWRITE
					// 43:9: -> identity(o=$i)
					{
						retval.st = templateLib.getInstanceOf("identity",new STAttrMap().put("o", i));
					}



					}
					break;
				case 6 :
					// /Users/eli/dev/Sneakers-Java/JS.g:44:4: s= STRING
					{
					s=(SneakersAST)match(input,STRING,FOLLOW_STRING_in_expr433); 
					// TEMPLATE REWRITE
					// 44:13: -> identity(o=$s)
					{
						retval.st = templateLib.getInstanceOf("identity",new STAttrMap().put("o", s));
					}



					}
					break;
				case 7 :
					// /Users/eli/dev/Sneakers-Java/JS.g:45:4: d= dict
					{
					pushFollow(FOLLOW_dict_in_expr449);
					d=dict();
					state._fsp--;

					// TEMPLATE REWRITE
					// 45:11: -> identity(o=$d.st)
					{
						retval.st = templateLib.getInstanceOf("identity",new STAttrMap().put("o", (d!=null?((StringTemplate)d.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// /Users/eli/dev/Sneakers-Java/JS.g:46:4: ^( ARRAY (exs+= expr )* )
					{
					match(input,ARRAY,FOLLOW_ARRAY_in_expr464); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/eli/dev/Sneakers-Java/JS.g:46:15: (exs+= expr )*
						loop12:
						while (true) {
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==ARRAY||LA12_0==DICT||(LA12_0 >= FNCALL && LA12_0 <= FNDECL)||(LA12_0 >= ID && LA12_0 <= INT)||LA12_0==MUTDECL||LA12_0==STRING) ) {
								alt12=1;
							}

							switch (alt12) {
							case 1 :
								// /Users/eli/dev/Sneakers-Java/JS.g:46:15: exs+= expr
								{
								pushFollow(FOLLOW_expr_in_expr468);
								exs=expr();
								state._fsp--;

								if (list_exs==null) list_exs=new ArrayList<Object>();
								list_exs.add(exs.getTemplate());
								}
								break;

							default :
								break loop12;
							}
						}

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 46:24: -> array(exs=$exs)
					{
						retval.st = templateLib.getInstanceOf("array",new STAttrMap().put("exs", list_exs));
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


	public static class dict_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dict"
	// /Users/eli/dev/Sneakers-Java/JS.g:49:1: dict : ^( DICT (attrs+= dict_pair )* ) -> dict(attrs=$attrs);
	public final JS.dict_return dict() throws RecognitionException {
		JS.dict_return retval = new JS.dict_return();
		retval.start = input.LT(1);

		List<Object> list_attrs=null;
		RuleReturnScope attrs = null;
		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:49:6: ( ^( DICT (attrs+= dict_pair )* ) -> dict(attrs=$attrs))
			// /Users/eli/dev/Sneakers-Java/JS.g:49:8: ^( DICT (attrs+= dict_pair )* )
			{
			match(input,DICT,FOLLOW_DICT_in_dict490); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/eli/dev/Sneakers-Java/JS.g:49:20: (attrs+= dict_pair )*
				loop14:
				while (true) {
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==DICT_PAIR) ) {
						alt14=1;
					}

					switch (alt14) {
					case 1 :
						// /Users/eli/dev/Sneakers-Java/JS.g:49:20: attrs+= dict_pair
						{
						pushFollow(FOLLOW_dict_pair_in_dict494);
						attrs=dict_pair();
						state._fsp--;

						if (list_attrs==null) list_attrs=new ArrayList<Object>();
						list_attrs.add(attrs.getTemplate());
						}
						break;

					default :
						break loop14;
					}
				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 49:34: -> dict(attrs=$attrs)
			{
				retval.st = templateLib.getInstanceOf("dict",new STAttrMap().put("attrs", list_attrs));
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
	// $ANTLR end "dict"


	public static class dict_pair_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dict_pair"
	// /Users/eli/dev/Sneakers-Java/JS.g:52:1: dict_pair : ^( DICT_PAIR key= . value= . ) -> dict_pair(key=$keyvalue=$value);
	public final JS.dict_pair_return dict_pair() throws RecognitionException {
		JS.dict_pair_return retval = new JS.dict_pair_return();
		retval.start = input.LT(1);

		SneakersAST key=null;
		SneakersAST value=null;

		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:52:10: ( ^( DICT_PAIR key= . value= . ) -> dict_pair(key=$keyvalue=$value))
			// /Users/eli/dev/Sneakers-Java/JS.g:52:12: ^( DICT_PAIR key= . value= . )
			{
			match(input,DICT_PAIR,FOLLOW_DICT_PAIR_in_dict_pair515); 
			match(input, Token.DOWN, null); 
			key=(SneakersAST)input.LT(1);
			matchAny(input); 
			value=(SneakersAST)input.LT(1);
			matchAny(input); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 52:39: -> dict_pair(key=$keyvalue=$value)
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


	public static class fncallparam_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "fncallparam"
	// /Users/eli/dev/Sneakers-Java/JS.g:55:1: fncallparam : ^( PARAM ex= expr ) -> identity(o=$ex.st);
	public final JS.fncallparam_return fncallparam() throws RecognitionException {
		JS.fncallparam_return retval = new JS.fncallparam_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ex =null;

		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:56:2: ( ^( PARAM ex= expr ) -> identity(o=$ex.st))
			// /Users/eli/dev/Sneakers-Java/JS.g:56:4: ^( PARAM ex= expr )
			{
			match(input,PARAM,FOLLOW_PARAM_in_fncallparam550); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_fncallparam554);
			ex=expr();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 56:21: -> identity(o=$ex.st)
			{
				retval.st = templateLib.getInstanceOf("identity",new STAttrMap().put("o", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
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
	// $ANTLR end "fncallparam"


	public static class any_id_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "any_id"
	// /Users/eli/dev/Sneakers-Java/JS.g:59:1: any_id : (i= ID |i= MUTID |i= TYPEID ) -> identity(o=$i);
	public final JS.any_id_return any_id() throws RecognitionException {
		JS.any_id_return retval = new JS.any_id_return();
		retval.start = input.LT(1);

		SneakersAST i=null;

		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:60:2: ( (i= ID |i= MUTID |i= TYPEID ) -> identity(o=$i))
			// /Users/eli/dev/Sneakers-Java/JS.g:60:4: (i= ID |i= MUTID |i= TYPEID )
			{
			// /Users/eli/dev/Sneakers-Java/JS.g:60:4: (i= ID |i= MUTID |i= TYPEID )
			int alt15=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt15=1;
				}
				break;
			case MUTID:
				{
				alt15=2;
				}
				break;
			case TYPEID:
				{
				alt15=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:60:5: i= ID
					{
					i=(SneakersAST)match(input,ID,FOLLOW_ID_in_any_id578); 
					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/JS.g:60:12: i= MUTID
					{
					i=(SneakersAST)match(input,MUTID,FOLLOW_MUTID_in_any_id584); 
					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/JS.g:60:22: i= TYPEID
					{
					i=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_any_id590); 
					}
					break;

			}

			// TEMPLATE REWRITE
			// 60:32: -> identity(o=$i)
			{
				retval.st = templateLib.getInstanceOf("identity",new STAttrMap().put("o", i));
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
	// $ANTLR end "any_id"


	public static class param_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "param"
	// /Users/eli/dev/Sneakers-Java/JS.g:63:1: param : ^( FNPARAM name= ID type= TYPEID ) -> identity(o=$name);
	public final JS.param_return param() throws RecognitionException {
		JS.param_return retval = new JS.param_return();
		retval.start = input.LT(1);

		SneakersAST name=null;
		SneakersAST type=null;

		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:63:7: ( ^( FNPARAM name= ID type= TYPEID ) -> identity(o=$name))
			// /Users/eli/dev/Sneakers-Java/JS.g:63:9: ^( FNPARAM name= ID type= TYPEID )
			{
			match(input,FNPARAM,FOLLOW_FNPARAM_in_param612); 
			match(input, Token.DOWN, null); 
			name=(SneakersAST)match(input,ID,FOLLOW_ID_in_param616); 
			type=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_param620); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 63:40: -> identity(o=$name)
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
	public static final BitSet FOLLOW_stat_in_compilationUnit60 = new BitSet(new long[]{0x0008000010000488L});
	public static final BitSet FOLLOW_ASSIGN_in_stat84 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_stat88 = new BitSet(new long[]{0x00000000409D8840L});
	public static final BitSet FOLLOW_expr_in_stat92 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASSDEF_in_stat116 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_stat120 = new BitSet(new long[]{0x0000000000404008L});
	public static final BitSet FOLLOW_method_in_stat125 = new BitSet(new long[]{0x0000000000404008L});
	public static final BitSet FOLLOW_field_in_stat131 = new BitSet(new long[]{0x0000000000404008L});
	public static final BitSet FOLLOW_51_in_stat162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RET_in_stat174 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_stat178 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FIELDDEF_in_field199 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_field203 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_TYPEID_in_field207 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHODDEF_in_method228 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_method232 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_FNDECL_in_method235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_method239 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_param_in_method243 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_BLOCK_in_method247 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_method251 = new BitSet(new long[]{0x0008000010000488L});
	public static final BitSet FOLLOW_FNDECL_in_expr289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MUTDECL_in_expr293 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_expr298 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_param_in_expr302 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_BLOCK_in_expr306 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_expr310 = new BitSet(new long[]{0x0008000010000488L});
	public static final BitSet FOLLOW_FNCALL_in_expr337 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr341 = new BitSet(new long[]{0x0000000002040008L});
	public static final BitSet FOLLOW_fncallparam_in_expr346 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_INSTANCE_in_expr367 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_any_id_in_expr371 = new BitSet(new long[]{0x0000000081040800L});
	public static final BitSet FOLLOW_dict_in_expr376 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_expr401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_expr433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_expr464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr468 = new BitSet(new long[]{0x00000000409D8848L});
	public static final BitSet FOLLOW_DICT_in_dict490 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dict_pair_in_dict494 = new BitSet(new long[]{0x0000000000001008L});
	public static final BitSet FOLLOW_DICT_PAIR_in_dict_pair515 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PARAM_in_fncallparam550 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_fncallparam554 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_any_id578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MUTID_in_any_id584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_any_id590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FNPARAM_in_param612 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_param616 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_TYPEID_in_param620 = new BitSet(new long[]{0x0000000000000008L});
}
