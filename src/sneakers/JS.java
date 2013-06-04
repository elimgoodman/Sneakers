// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/JS.g 2013-06-04 09:05:06

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
	// /Users/eli/dev/Sneakers-Java/JS.g:21:1: stat : ( ^( '=' name= ( ID | MUTID ) value= expr ) -> assignment(name=$namevalue=$value.st)| ^( CLASSDEF name= TYPEID (methods+= method |fields+= field )* ) -> classdef(name=$namefields=$fieldsmethods=$methods)| 'pass' -> pass(| ^( RET e= expr ) -> return(expr=$e.st));
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
			// /Users/eli/dev/Sneakers-Java/JS.g:22:2: ( ^( '=' name= ( ID | MUTID ) value= expr ) -> assignment(name=$namevalue=$value.st)| ^( CLASSDEF name= TYPEID (methods+= method |fields+= field )* ) -> classdef(name=$namefields=$fieldsmethods=$methods)| 'pass' -> pass(| ^( RET e= expr ) -> return(expr=$e.st))
			int alt4=4;
			switch ( input.LA(1) ) {
			case ASSIGN:
				{
				alt4=1;
				}
				break;
			case CLASSDEF:
				{
				alt4=2;
				}
				break;
			case 51:
				{
				alt4=3;
				}
				break;
			case RET:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:22:4: ^( '=' name= ( ID | MUTID ) value= expr )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_stat84); 
					match(input, Token.DOWN, null); 
					// /Users/eli/dev/Sneakers-Java/JS.g:22:15: ( ID | MUTID )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ID) ) {
						alt2=1;
					}
					else if ( (LA2_0==MUTID) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:22:16: ID
							{
							name=(SneakersAST)match(input,ID,FOLLOW_ID_in_stat89); 
							}
							break;
						case 2 :
							// /Users/eli/dev/Sneakers-Java/JS.g:22:21: MUTID
							{
							name=(SneakersAST)match(input,MUTID,FOLLOW_MUTID_in_stat93); 
							}
							break;

					}

					pushFollow(FOLLOW_expr_in_stat98);
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
					match(input,CLASSDEF,FOLLOW_CLASSDEF_in_stat122); 
					match(input, Token.DOWN, null); 
					name=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_stat126); 
					// /Users/eli/dev/Sneakers-Java/JS.g:24:27: (methods+= method |fields+= field )*
					loop3:
					while (true) {
						int alt3=3;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==METHODDEF) ) {
							alt3=1;
						}
						else if ( (LA3_0==FIELDDEF) ) {
							alt3=2;
						}

						switch (alt3) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:24:28: methods+= method
							{
							pushFollow(FOLLOW_method_in_stat131);
							methods=method();
							state._fsp--;

							if (list_methods==null) list_methods=new ArrayList<Object>();
							list_methods.add(methods.getTemplate());
							}
							break;
						case 2 :
							// /Users/eli/dev/Sneakers-Java/JS.g:24:46: fields+= field
							{
							pushFollow(FOLLOW_field_in_stat137);
							fields=field();
							state._fsp--;

							if (list_fields==null) list_fields=new ArrayList<Object>();
							list_fields.add(fields.getTemplate());
							}
							break;

						default :
							break loop3;
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
					match(input,51,FOLLOW_51_in_stat168); 
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
					match(input,RET,FOLLOW_RET_in_stat180); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_stat184);
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
			match(input,FIELDDEF,FOLLOW_FIELDDEF_in_field205); 
			match(input, Token.DOWN, null); 
			name=(SneakersAST)match(input,ID,FOLLOW_ID_in_field209); 
			type=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_field213); 
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
			match(input,METHODDEF,FOLLOW_METHODDEF_in_method234); 
			match(input, Token.DOWN, null); 
			name=(SneakersAST)match(input,ID,FOLLOW_ID_in_method238); 
			match(input,FNDECL,FOLLOW_FNDECL_in_method241); 
			match(input, Token.DOWN, null); 
			ret=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_method245); 
			// /Users/eli/dev/Sneakers-Java/JS.g:33:56: (params+= param )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==FNPARAM) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:33:56: params+= param
					{
					pushFollow(FOLLOW_param_in_method249);
					params=param();
					state._fsp--;

					if (list_params==null) list_params=new ArrayList<Object>();
					list_params.add(params.getTemplate());
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,BLOCK,FOLLOW_BLOCK_in_method253); 
			match(input, Token.DOWN, null); 
			// /Users/eli/dev/Sneakers-Java/JS.g:33:78: (stats+= stat )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ASSIGN||LA6_0==CLASSDEF||LA6_0==RET||LA6_0==51) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:33:78: stats+= stat
					{
					pushFollow(FOLLOW_stat_in_method257);
					stats=stat();
					state._fsp--;

					if (list_stats==null) list_stats=new ArrayList<Object>();
					list_stats.add(stats.getTemplate());
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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
	// /Users/eli/dev/Sneakers-Java/JS.g:37:1: expr : ( ^( ( FNDECL | MUTDECL ) ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) -> fndecl(params=$paramsstats=$stats)| ^( FNCALL (names+= any_id )+ (params+= fncallparam )* ) -> fncall(names=$namesparams=$params)| ^( INSTANCE (types+= any_id )+ d= dict ) -> instance(types=$typesattrs=$d.st)|i= INT -> identity(o=$i)|i= ID -> identity(o=$i)|s= STRING -> identity(o=$s)|d= dict -> identity(o=$d.st)| ^( ARRAY (exs+= expr )* ) -> array(exs=$exs));
	public final JS.expr_return expr() throws RecognitionException {
		JS.expr_return retval = new JS.expr_return();
		retval.start = input.LT(1);

		SneakersAST ret=null;
		SneakersAST i=null;
		SneakersAST s=null;
		List<Object> list_params=null;
		List<Object> list_stats=null;
		List<Object> list_names=null;
		List<Object> list_types=null;
		List<Object> list_exs=null;
		TreeRuleReturnScope d =null;
		RuleReturnScope params = null;
		RuleReturnScope stats = null;
		RuleReturnScope names = null;
		RuleReturnScope types = null;
		RuleReturnScope exs = null;
		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:37:6: ( ^( ( FNDECL | MUTDECL ) ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) ) -> fndecl(params=$paramsstats=$stats)| ^( FNCALL (names+= any_id )+ (params+= fncallparam )* ) -> fncall(names=$namesparams=$params)| ^( INSTANCE (types+= any_id )+ d= dict ) -> instance(types=$typesattrs=$d.st)|i= INT -> identity(o=$i)|i= ID -> identity(o=$i)|s= STRING -> identity(o=$s)|d= dict -> identity(o=$d.st)| ^( ARRAY (exs+= expr )* ) -> array(exs=$exs))
			int alt14=8;
			switch ( input.LA(1) ) {
			case FNDECL:
			case MUTDECL:
				{
				alt14=1;
				}
				break;
			case FNCALL:
				{
				alt14=2;
				}
				break;
			case INSTANCE:
				{
				alt14=3;
				}
				break;
			case INT:
				{
				alt14=4;
				}
				break;
			case ID:
				{
				alt14=5;
				}
				break;
			case STRING:
				{
				alt14=6;
				}
				break;
			case DICT:
				{
				alt14=7;
				}
				break;
			case ARRAY:
				{
				alt14=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:37:8: ^( ( FNDECL | MUTDECL ) ret= TYPEID (params+= param )* ^( BLOCK (stats+= stat )+ ) )
					{
					// /Users/eli/dev/Sneakers-Java/JS.g:37:10: ( FNDECL | MUTDECL )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==FNDECL) ) {
						alt7=1;
					}
					else if ( (LA7_0==MUTDECL) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:37:11: FNDECL
							{
							match(input,FNDECL,FOLLOW_FNDECL_in_expr295); 
							}
							break;
						case 2 :
							// /Users/eli/dev/Sneakers-Java/JS.g:37:20: MUTDECL
							{
							match(input,MUTDECL,FOLLOW_MUTDECL_in_expr299); 
							}
							break;

					}

					match(input, Token.DOWN, null); 
					ret=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_expr304); 
					// /Users/eli/dev/Sneakers-Java/JS.g:37:46: (params+= param )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==FNPARAM) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:37:46: params+= param
							{
							pushFollow(FOLLOW_param_in_expr308);
							params=param();
							state._fsp--;

							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							break loop8;
						}
					}

					match(input,BLOCK,FOLLOW_BLOCK_in_expr312); 
					match(input, Token.DOWN, null); 
					// /Users/eli/dev/Sneakers-Java/JS.g:37:68: (stats+= stat )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==ASSIGN||LA9_0==CLASSDEF||LA9_0==RET||LA9_0==51) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:37:68: stats+= stat
							{
							pushFollow(FOLLOW_stat_in_expr316);
							stats=stat();
							state._fsp--;

							if (list_stats==null) list_stats=new ArrayList<Object>();
							list_stats.add(stats.getTemplate());
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
					// 38:4: -> fndecl(params=$paramsstats=$stats)
					{
						retval.st = templateLib.getInstanceOf("fndecl",new STAttrMap().put("params", list_params).put("stats", list_stats));
					}



					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/JS.g:39:4: ^( FNCALL (names+= any_id )+ (params+= fncallparam )* )
					{
					match(input,FNCALL,FOLLOW_FNCALL_in_expr343); 
					match(input, Token.DOWN, null); 
					// /Users/eli/dev/Sneakers-Java/JS.g:39:18: (names+= any_id )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==ID||LA10_0==MUTID||LA10_0==TYPEID) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:39:18: names+= any_id
							{
							pushFollow(FOLLOW_any_id_in_expr347);
							names=any_id();
							state._fsp--;

							if (list_names==null) list_names=new ArrayList<Object>();
							list_names.add(names.getTemplate());
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					// /Users/eli/dev/Sneakers-Java/JS.g:39:34: (params+= fncallparam )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==PARAM) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:39:34: params+= fncallparam
							{
							pushFollow(FOLLOW_fncallparam_in_expr352);
							params=fncallparam();
							state._fsp--;

							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							break loop11;
						}
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 39:50: -> fncall(names=$namesparams=$params)
					{
						retval.st = templateLib.getInstanceOf("fncall",new STAttrMap().put("names", list_names).put("params", list_params));
					}



					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/JS.g:40:4: ^( INSTANCE (types+= any_id )+ d= dict )
					{
					match(input,INSTANCE,FOLLOW_INSTANCE_in_expr373); 
					match(input, Token.DOWN, null); 
					// /Users/eli/dev/Sneakers-Java/JS.g:40:20: (types+= any_id )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==ID||LA12_0==MUTID||LA12_0==TYPEID) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/JS.g:40:20: types+= any_id
							{
							pushFollow(FOLLOW_any_id_in_expr377);
							types=any_id();
							state._fsp--;

							if (list_types==null) list_types=new ArrayList<Object>();
							list_types.add(types.getTemplate());
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					pushFollow(FOLLOW_dict_in_expr382);
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
					i=(SneakersAST)match(input,INT,FOLLOW_INT_in_expr407); 
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
					i=(SneakersAST)match(input,ID,FOLLOW_ID_in_expr423); 
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
					s=(SneakersAST)match(input,STRING,FOLLOW_STRING_in_expr439); 
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
					pushFollow(FOLLOW_dict_in_expr455);
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
					match(input,ARRAY,FOLLOW_ARRAY_in_expr470); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/eli/dev/Sneakers-Java/JS.g:46:15: (exs+= expr )*
						loop13:
						while (true) {
							int alt13=2;
							int LA13_0 = input.LA(1);
							if ( (LA13_0==ARRAY||LA13_0==DICT||(LA13_0 >= FNCALL && LA13_0 <= FNDECL)||(LA13_0 >= ID && LA13_0 <= INT)||LA13_0==MUTDECL||LA13_0==STRING) ) {
								alt13=1;
							}

							switch (alt13) {
							case 1 :
								// /Users/eli/dev/Sneakers-Java/JS.g:46:15: exs+= expr
								{
								pushFollow(FOLLOW_expr_in_expr474);
								exs=expr();
								state._fsp--;

								if (list_exs==null) list_exs=new ArrayList<Object>();
								list_exs.add(exs.getTemplate());
								}
								break;

							default :
								break loop13;
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
			match(input,DICT,FOLLOW_DICT_in_dict496); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/eli/dev/Sneakers-Java/JS.g:49:20: (attrs+= dict_pair )*
				loop15:
				while (true) {
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==DICT_PAIR) ) {
						alt15=1;
					}

					switch (alt15) {
					case 1 :
						// /Users/eli/dev/Sneakers-Java/JS.g:49:20: attrs+= dict_pair
						{
						pushFollow(FOLLOW_dict_pair_in_dict500);
						attrs=dict_pair();
						state._fsp--;

						if (list_attrs==null) list_attrs=new ArrayList<Object>();
						list_attrs.add(attrs.getTemplate());
						}
						break;

					default :
						break loop15;
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
	// /Users/eli/dev/Sneakers-Java/JS.g:52:1: dict_pair : ^( DICT_PAIR key= expr value= expr ) -> dict_pair(key=$key.stvalue=$value.st);
	public final JS.dict_pair_return dict_pair() throws RecognitionException {
		JS.dict_pair_return retval = new JS.dict_pair_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope key =null;
		TreeRuleReturnScope value =null;

		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:52:10: ( ^( DICT_PAIR key= expr value= expr ) -> dict_pair(key=$key.stvalue=$value.st))
			// /Users/eli/dev/Sneakers-Java/JS.g:52:12: ^( DICT_PAIR key= expr value= expr )
			{
			match(input,DICT_PAIR,FOLLOW_DICT_PAIR_in_dict_pair521); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_dict_pair525);
			key=expr();
			state._fsp--;

			pushFollow(FOLLOW_expr_in_dict_pair529);
			value=expr();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 52:45: -> dict_pair(key=$key.stvalue=$value.st)
			{
				retval.st = templateLib.getInstanceOf("dict_pair",new STAttrMap().put("key", (key!=null?((StringTemplate)key.getTemplate()):null)).put("value", (value!=null?((StringTemplate)value.getTemplate()):null)));
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
			match(input,PARAM,FOLLOW_PARAM_in_fncallparam556); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_fncallparam560);
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
			int alt16=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt16=1;
				}
				break;
			case MUTID:
				{
				alt16=2;
				}
				break;
			case TYPEID:
				{
				alt16=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/JS.g:60:5: i= ID
					{
					i=(SneakersAST)match(input,ID,FOLLOW_ID_in_any_id584); 
					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/JS.g:60:12: i= MUTID
					{
					i=(SneakersAST)match(input,MUTID,FOLLOW_MUTID_in_any_id590); 
					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/JS.g:60:22: i= TYPEID
					{
					i=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_any_id596); 
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
			match(input,FNPARAM,FOLLOW_FNPARAM_in_param618); 
			match(input, Token.DOWN, null); 
			name=(SneakersAST)match(input,ID,FOLLOW_ID_in_param622); 
			type=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_param626); 
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
	public static final BitSet FOLLOW_ID_in_stat89 = new BitSet(new long[]{0x00000000409D8840L});
	public static final BitSet FOLLOW_MUTID_in_stat93 = new BitSet(new long[]{0x00000000409D8840L});
	public static final BitSet FOLLOW_expr_in_stat98 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASSDEF_in_stat122 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_stat126 = new BitSet(new long[]{0x0000000000404008L});
	public static final BitSet FOLLOW_method_in_stat131 = new BitSet(new long[]{0x0000000000404008L});
	public static final BitSet FOLLOW_field_in_stat137 = new BitSet(new long[]{0x0000000000404008L});
	public static final BitSet FOLLOW_51_in_stat168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RET_in_stat180 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_stat184 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FIELDDEF_in_field205 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_field209 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_TYPEID_in_field213 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHODDEF_in_method234 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_method238 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_FNDECL_in_method241 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_method245 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_param_in_method249 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_BLOCK_in_method253 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_method257 = new BitSet(new long[]{0x0008000010000488L});
	public static final BitSet FOLLOW_FNDECL_in_expr295 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MUTDECL_in_expr299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_expr304 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_param_in_expr308 = new BitSet(new long[]{0x0000000000020100L});
	public static final BitSet FOLLOW_BLOCK_in_expr312 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_expr316 = new BitSet(new long[]{0x0008000010000488L});
	public static final BitSet FOLLOW_FNCALL_in_expr343 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_any_id_in_expr347 = new BitSet(new long[]{0x0000000083040008L});
	public static final BitSet FOLLOW_fncallparam_in_expr352 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_INSTANCE_in_expr373 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_any_id_in_expr377 = new BitSet(new long[]{0x0000000081040800L});
	public static final BitSet FOLLOW_dict_in_expr382 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_expr407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_expr439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dict_in_expr455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_expr470 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr474 = new BitSet(new long[]{0x00000000409D8848L});
	public static final BitSet FOLLOW_DICT_in_dict496 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dict_pair_in_dict500 = new BitSet(new long[]{0x0000000000001008L});
	public static final BitSet FOLLOW_DICT_PAIR_in_dict_pair521 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_dict_pair525 = new BitSet(new long[]{0x00000000409D8840L});
	public static final BitSet FOLLOW_expr_in_dict_pair529 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAM_in_fncallparam556 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_fncallparam560 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_any_id584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MUTID_in_any_id590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEID_in_any_id596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FNPARAM_in_param618 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_param622 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_TYPEID_in_param626 = new BitSet(new long[]{0x0000000000000008L});
}
