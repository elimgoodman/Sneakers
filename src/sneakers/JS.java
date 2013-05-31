// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/JS.g 2013-05-31 13:40:06

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
		"FNCALL", "FNDECL", "FNPARAM", "ID", "INT", "KEYWORD", "MUTDECL", "MUTID", 
		"PARAM", "PARAMTYPEFN", "PARAMTYPEMUT", "RET", "STRING", "TYPEID", "WS", 
		"'#'", "'('", "')'", "','", "'.'", "':'", "';'", "'<'", "'=>'", "'>'", 
		"'@'", "'['", "']'", "'else'", "'elseif'", "'extend'", "'if'", "'pass'", 
		"'return'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__49=49;
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
	public static final int MUTDECL=20;
	public static final int MUTID=21;
	public static final int PARAM=22;
	public static final int PARAMTYPEFN=23;
	public static final int PARAMTYPEMUT=24;
	public static final int RET=25;
	public static final int STRING=26;
	public static final int TYPEID=27;
	public static final int WS=28;

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
				if ( (LA1_0==ASSIGN) ) {
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
	// /Users/eli/dev/Sneakers-Java/JS.g:21:1: stat : ^( '=' name= ID value= . ) -> assignment(name=$namevalue=$value);
	public final JS.stat_return stat() throws RecognitionException {
		JS.stat_return retval = new JS.stat_return();
		retval.start = input.LT(1);

		SneakersAST name=null;
		SneakersAST value=null;

		try {
			// /Users/eli/dev/Sneakers-Java/JS.g:22:2: ( ^( '=' name= ID value= . ) -> assignment(name=$namevalue=$value))
			// /Users/eli/dev/Sneakers-Java/JS.g:22:4: ^( '=' name= ID value= . )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_stat84); 
			match(input, Token.DOWN, null); 
			name=(SneakersAST)match(input,ID,FOLLOW_ID_in_stat88); 
			value=(SneakersAST)input.LT(1);
			matchAny(input); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 23:3: -> assignment(name=$namevalue=$value)
			{
				retval.st = templateLib.getInstanceOf("assignment",new STAttrMap().put("name", name).put("value", value));
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
	// $ANTLR end "stat"

	// Delegated rules



	public static final BitSet FOLLOW_BLOCK_in_compilationUnit56 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_compilationUnit60 = new BitSet(new long[]{0x0000000000000088L});
	public static final BitSet FOLLOW_ASSIGN_in_stat84 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_stat88 = new BitSet(new long[]{0x0003FFFFFFFFFFF0L});
}
