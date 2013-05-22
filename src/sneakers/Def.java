// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Def.g 2013-05-22 08:47:04
 package sneakers; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class Def extends TreeFilter {
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
	public TreeFilter[] getDelegates() {
		return new TreeFilter[] {};
	}

	// delegators


	public Def(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public Def(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return Def.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/eli/dev/Sneakers-Java/Def.g"; }


	    SymbolTable symtab;
	    Scope currentScope;
	    public Def(TreeNodeStream input, SymbolTable symtab) {
	        this(input);
	        this.symtab = symtab;
	        currentScope = symtab.globals;
	    }



	// $ANTLR start "topdown"
	// /Users/eli/dev/Sneakers-Java/Def.g:22:1: topdown : ( enterBlock | varDeclaration );
	public final void topdown() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:23:5: ( enterBlock | varDeclaration )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==BLOCK) ) {
				alt1=1;
			}
			else if ( (LA1_0==33) ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Def.g:23:9: enterBlock
					{
					pushFollow(FOLLOW_enterBlock_in_topdown63);
					enterBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Def.g:26:9: varDeclaration
					{
					pushFollow(FOLLOW_varDeclaration_in_topdown83);
					varDeclaration();
					state._fsp--;
					if (state.failed) return;
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
	}
	// $ANTLR end "topdown"



	// $ANTLR start "bottomup"
	// /Users/eli/dev/Sneakers-Java/Def.g:30:1: bottomup : exitBlock ;
	public final void bottomup() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:31:5: ( exitBlock )
			// /Users/eli/dev/Sneakers-Java/Def.g:31:9: exitBlock
			{
			pushFollow(FOLLOW_exitBlock_in_bottomup103);
			exitBlock();
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
	// $ANTLR end "bottomup"



	// $ANTLR start "enterBlock"
	// /Users/eli/dev/Sneakers-Java/Def.g:38:1: enterBlock : BLOCK ;
	public final void enterBlock() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:39:5: ( BLOCK )
			// /Users/eli/dev/Sneakers-Java/Def.g:39:9: BLOCK
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_enterBlock134); if (state.failed) return;
			if ( state.backtracking==1 ) {currentScope = new LocalScope(currentScope);}
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
	// $ANTLR end "enterBlock"



	// $ANTLR start "exitBlock"
	// /Users/eli/dev/Sneakers-Java/Def.g:41:1: exitBlock : BLOCK ;
	public final void exitBlock() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:42:5: ( BLOCK )
			// /Users/eli/dev/Sneakers-Java/Def.g:42:9: BLOCK
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_exitBlock155); if (state.failed) return;
			if ( state.backtracking==1 ) {
			        System.out.println("locals: "+currentScope);
			        currentScope = currentScope.getEnclosingScope();    // pop scope
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
	}
	// $ANTLR end "exitBlock"



	// $ANTLR start "varDeclaration"
	// /Users/eli/dev/Sneakers-Java/Def.g:104:1: varDeclaration : ^( '=' ID ( . )? ) ;
	public final void varDeclaration() throws RecognitionException {
		SneakersAST ID1=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:105:5: ( ^( '=' ID ( . )? ) )
			// /Users/eli/dev/Sneakers-Java/Def.g:105:9: ^( '=' ID ( . )? )
			{
			match(input,33,FOLLOW_33_in_varDeclaration197); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			ID1=(SneakersAST)match(input,ID,FOLLOW_ID_in_varDeclaration199); if (state.failed) return;
			// /Users/eli/dev/Sneakers-Java/Def.g:105:18: ( . )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= ANONFN && LA2_0 <= 47)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Def.g:105:18: .
					{
					matchAny(input); if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {
			        System.out.println("line "+ID1.getLine()+": def "+(ID1!=null?ID1.getText():null));
			        
			        VariableSymbol vs = new VariableSymbol((ID1!=null?ID1.getText():null),null);
			        vs.scope = currentScope;
			        vs.def = ID1;            // track AST location of def's ID
			        ID1.symbol = vs;         // track in AST
			        currentScope.define(vs);
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
	}
	// $ANTLR end "varDeclaration"

	// Delegated rules



	public static final BitSet FOLLOW_enterBlock_in_topdown63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDeclaration_in_topdown83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitBlock_in_bottomup103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_enterBlock134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_exitBlock155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_varDeclaration197 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_varDeclaration199 = new BitSet(new long[]{0x0000FFFFFFFFFFF8L});
}
