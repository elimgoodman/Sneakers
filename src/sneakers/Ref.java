// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Ref.g 2013-05-27 13:09:25
 package sneakers; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class Ref extends TreeFilter {
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
	public TreeFilter[] getDelegates() {
		return new TreeFilter[] {};
	}

	// delegators


	public Ref(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public Ref(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return Ref.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/eli/dev/Sneakers-Java/Ref.g"; }


	    SymbolTable symtab;
	    public Ref(TreeNodeStream input, SymbolTable symtab) {
	        this(input);
	        this.symtab = symtab;
	    }
	    



	// $ANTLR start "topdown"
	// /Users/eli/dev/Sneakers-Java/Ref.g:24:1: topdown : assignment ;
	public final void topdown() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Ref.g:28:6: ( assignment )
			// /Users/eli/dev/Sneakers-Java/Ref.g:28:11: assignment
			{
			pushFollow(FOLLOW_assignment_in_topdown82);
			assignment();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "topdown"



	// $ANTLR start "assignment"
	// /Users/eli/dev/Sneakers-Java/Ref.g:87:1: assignment : ^( '=' expr expr ) ;
	public final void assignment() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Ref.g:87:13: ( ^( '=' expr expr ) )
			// /Users/eli/dev/Sneakers-Java/Ref.g:87:15: ^( '=' expr expr )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment124); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_assignment126);
			expr();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_expr_in_assignment128);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment"



	// $ANTLR start "expr"
	// /Users/eli/dev/Sneakers-Java/Ref.g:95:1: expr returns [Type type] : ( id | INT );
	public final Type expr() throws RecognitionException {
		Type type = null;


		Type id1 =null;

		try {
			// /Users/eli/dev/Sneakers-Java/Ref.g:99:5: ( id | INT )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==ID) ) {
				alt1=1;
			}
			else if ( (LA1_0==INT) ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return type;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Ref.g:99:10: id
					{
					pushFollow(FOLLOW_id_in_expr161);
					id1=id();
					state._fsp--;
					if (state.failed) return type;
					if ( state.backtracking==1 ) {type = id1;}
					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Ref.g:100:9: INT
					{
					match(input,INT,FOLLOW_INT_in_expr182); if (state.failed) return type;
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
		return type;
	}
	// $ANTLR end "expr"



	// $ANTLR start "id"
	// /Users/eli/dev/Sneakers-Java/Ref.g:105:1: id returns [Type type] : ID ;
	public final Type id() throws RecognitionException {
		Type type = null;


		SneakersAST ID2=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Ref.g:106:5: ( ID )
			// /Users/eli/dev/Sneakers-Java/Ref.g:106:9: ID
			{
			ID2=(SneakersAST)match(input,ID,FOLLOW_ID_in_id207); if (state.failed) return type;
			if ( state.backtracking==1 ) {
			        // do usual resolve(ID) then check for illegal forward references
			        ID2.symbol = SymbolTable.resolveID(ID2);
			        if ( ID2.symbol!=null ) type = ID2.symbol.type;
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
		return type;
	}
	// $ANTLR end "id"

	// Delegated rules



	public static final BitSet FOLLOW_assignment_in_topdown82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment124 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_assignment126 = new BitSet(new long[]{0x0000000000060000L});
	public static final BitSet FOLLOW_expr_in_assignment128 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_id_in_expr161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id207 = new BitSet(new long[]{0x0000000000000002L});
}
