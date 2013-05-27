// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Def.g 2013-05-27 12:23:21
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
		"ASSIGN", "BLOCK", "BLOCKDECL", "CLASSDEF", "DICT", "EXPR", "FIELDDEF", 
		"FNCALL", "FNDECL", "FNPARAM", "ID", "INT", "KEYWORD", "LETTER", "MUTDECL", 
		"MUTID", "PARAM", "PARAMTYPEFN", "PARAMTYPEMUT", "RET", "STRING", "WS", 
		"'#'", "'('", "')'", "','", "'.'", "':'", "';'", "'<'", "'=>'", "'>'", 
		"'@'", "'['", "']'", "'else'", "'elseif'", "'extend'", "'if'", "'pass'", 
		"'return'", "'{'", "'}'", "TYPEID", "'this'"
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
	public static final int LETTER=20;
	public static final int MUTDECL=21;
	public static final int MUTID=22;
	public static final int PARAM=23;
	public static final int PARAMTYPEFN=24;
	public static final int PARAMTYPEMUT=25;
	public static final int RET=26;
	public static final int STRING=27;
	public static final int WS=28;
	public static final int T__51=51;
	public static final int TYPEID=50;

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
	// /Users/eli/dev/Sneakers-Java/Def.g:22:1: topdown : ( enterBlock | enterClass | varDeclaration | atoms );
	public final void topdown() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:23:5: ( enterBlock | enterClass | varDeclaration | atoms )
			int alt1=4;
			switch ( input.LA(1) ) {
			case BLOCK:
				{
				alt1=1;
				}
				break;
			case CLASSDEF:
				{
				alt1=2;
				}
				break;
			case ASSIGN:
				{
				alt1=3;
				}
				break;
			case ID:
			case TYPEID:
			case 51:
				{
				alt1=4;
				}
				break;
			default:
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
					// /Users/eli/dev/Sneakers-Java/Def.g:24:7: enterClass
					{
					pushFollow(FOLLOW_enterClass_in_topdown71);
					enterClass();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Def.g:25:9: varDeclaration
					{
					pushFollow(FOLLOW_varDeclaration_in_topdown81);
					varDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Def.g:26:9: atoms
					{
					pushFollow(FOLLOW_atoms_in_topdown91);
					atoms();
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
	// /Users/eli/dev/Sneakers-Java/Def.g:29:1: bottomup : ( exitBlock | exitMethod | exitClass );
	public final void bottomup() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:30:5: ( exitBlock | exitMethod | exitClass )
			int alt2=3;
			switch ( input.LA(1) ) {
			case BLOCK:
				{
				alt2=1;
				}
				break;
			case FNDECL:
				{
				alt2=2;
				}
				break;
			case CLASSDEF:
				{
				alt2=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Def.g:30:9: exitBlock
					{
					pushFollow(FOLLOW_exitBlock_in_bottomup110);
					exitBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Def.g:31:9: exitMethod
					{
					pushFollow(FOLLOW_exitMethod_in_bottomup120);
					exitMethod();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Def.g:32:9: exitClass
					{
					pushFollow(FOLLOW_exitClass_in_bottomup130);
					exitClass();
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
	// $ANTLR end "bottomup"



	// $ANTLR start "enterBlock"
	// /Users/eli/dev/Sneakers-Java/Def.g:37:1: enterBlock : BLOCK ;
	public final void enterBlock() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:38:5: ( BLOCK )
			// /Users/eli/dev/Sneakers-Java/Def.g:38:9: BLOCK
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_enterBlock151); if (state.failed) return;
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
	// /Users/eli/dev/Sneakers-Java/Def.g:40:1: exitBlock : BLOCK ;
	public final void exitBlock() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:41:5: ( BLOCK )
			// /Users/eli/dev/Sneakers-Java/Def.g:41:9: BLOCK
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_exitBlock172); if (state.failed) return;
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



	// $ANTLR start "enterClass"
	// /Users/eli/dev/Sneakers-Java/Def.g:49:1: enterClass : ^( 'class' name= ID . ) ;
	public final void enterClass() throws RecognitionException {
		SneakersAST name=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:50:5: ( ^( 'class' name= ID . ) )
			// /Users/eli/dev/Sneakers-Java/Def.g:50:9: ^( 'class' name= ID . )
			{
			match(input,CLASSDEF,FOLLOW_CLASSDEF_in_enterClass203); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			name=(SneakersAST)match(input,ID,FOLLOW_ID_in_enterClass207); if (state.failed) return;
			matchAny(input); if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) { // def class but leave superclass blank until ref phase
			        System.out.println("line "+name.getLine()+
			                           ": def class "+(name!=null?name.getText():null));
			        // record scope in AST for next pass
			        ClassSymbol cs = new ClassSymbol((name!=null?name.getText():null),currentScope,null);
			        cs.def = name;           // point from symbol table into AST
			        name.symbol = cs;        // point from AST into symbol table
			        currentScope.define(cs);  // def class in current scope
			        currentScope = cs;        // set current scope to class scope
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
	// $ANTLR end "enterClass"



	// $ANTLR start "exitClass"
	// /Users/eli/dev/Sneakers-Java/Def.g:64:1: exitClass : CLASSDEF ;
	public final void exitClass() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:65:5: ( CLASSDEF )
			// /Users/eli/dev/Sneakers-Java/Def.g:65:9: CLASSDEF
			{
			match(input,CLASSDEF,FOLLOW_CLASSDEF_in_exitClass240); if (state.failed) return;
			if ( state.backtracking==1 ) {
			        System.out.println("OUT OF CLASS");
			        System.out.println("members: "+currentScope);
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
	// $ANTLR end "exitClass"



	// $ANTLR start "exitMethod"
	// /Users/eli/dev/Sneakers-Java/Def.g:74:1: exitMethod : FNDECL ;
	public final void exitMethod() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:75:5: ( FNDECL )
			// /Users/eli/dev/Sneakers-Java/Def.g:75:9: FNDECL
			{
			match(input,FNDECL,FOLLOW_FNDECL_in_exitMethod270); if (state.failed) return;
			if ( state.backtracking==1 ) {
			        System.out.println("OUT OF METHOD");
			        System.out.println("args: "+currentScope);
			        currentScope = currentScope.getEnclosingScope();    // pop arg scope
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
	// $ANTLR end "exitMethod"



	// $ANTLR start "atoms"
	// /Users/eli/dev/Sneakers-Java/Def.g:85:1: atoms :{...}? ( 'this' | ID | TYPEID ) ;
	public final void atoms() throws RecognitionException {
		SneakersAST t = (SneakersAST)input.LT(1);
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:87:5: ({...}? ( 'this' | ID | TYPEID ) )
			// /Users/eli/dev/Sneakers-Java/Def.g:87:8: {...}? ( 'this' | ID | TYPEID )
			{
			if ( !((t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "atoms", "t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN)");
			}
			if ( input.LA(1)==ID||(input.LA(1) >= TYPEID && input.LA(1) <= 51) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==1 ) {t.scope = currentScope;}
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
	// $ANTLR end "atoms"



	// $ANTLR start "varDeclaration"
	// /Users/eli/dev/Sneakers-Java/Def.g:93:1: varDeclaration : ( ^( '=' ID ^( FNDECL ( . )* ) ) | ^( '=' ID (~ ( FNDECL ) )* ) );
	public final void varDeclaration() throws RecognitionException {
		SneakersAST ID1=null;
		SneakersAST ID2=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:94:2: ( ^( '=' ID ^( FNDECL ( . )* ) ) | ^( '=' ID (~ ( FNDECL ) )* ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ASSIGN) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==DOWN) ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2==ID) ) {
						int LA5_3 = input.LA(4);
						if ( (LA5_3==FNDECL) ) {
							alt5=1;
						}
						else if ( ((LA5_3 >= UP && LA5_3 <= FNCALL)||(LA5_3 >= FNPARAM && LA5_3 <= 51)) ) {
							alt5=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Def.g:94:4: ^( '=' ID ^( FNDECL ( . )* ) )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration341); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					ID1=(SneakersAST)match(input,ID,FOLLOW_ID_in_varDeclaration343); if (state.failed) return;
					match(input,FNDECL,FOLLOW_FNDECL_in_varDeclaration346); if (state.failed) return;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return;
						// /Users/eli/dev/Sneakers-Java/Def.g:94:22: ( . )*
						loop3:
						while (true) {
							int alt3=2;
							int LA3_0 = input.LA(1);
							if ( ((LA3_0 >= ANONFN && LA3_0 <= 51)) ) {
								alt3=1;
							}
							else if ( (LA3_0==UP) ) {
								alt3=2;
							}

							switch (alt3) {
							case 1 :
								// /Users/eli/dev/Sneakers-Java/Def.g:94:22: .
								{
								matchAny(input); if (state.failed) return;
								}
								break;

							default :
								break loop3;
							}
						}

						match(input, Token.UP, null); if (state.failed) return;
					}

					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==1 ) {
							System.out.println("line "+ID1.getLine()+": def "+(ID1!=null?ID1.getText():null));
					        
					        	MethodSymbol ms = new MethodSymbol((ID1!=null?ID1.getText():null),null,currentScope);
					        	ms.def = ID1;            // track AST location of def's ID
						        ID1.symbol = ms;         // track in AST
					        	currentScope.define(ms); // def method in globals
						        currentScope = ms;       // set current scope to method scope
						}
					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Def.g:104:11: ^( '=' ID (~ ( FNDECL ) )* )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration367); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					ID2=(SneakersAST)match(input,ID,FOLLOW_ID_in_varDeclaration369); if (state.failed) return;
					// /Users/eli/dev/Sneakers-Java/Def.g:104:20: (~ ( FNDECL ) )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= ANONFN && LA4_0 <= FNCALL)||(LA4_0 >= FNPARAM && LA4_0 <= 51)) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Def.g:
							{
							if ( (input.LA(1) >= ANONFN && input.LA(1) <= FNCALL)||(input.LA(1) >= FNPARAM && input.LA(1) <= 51) ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==1 ) {
					        System.out.println("line "+ID2.getLine()+": def "+(ID2!=null?ID2.getText():null));
					        
					        VariableSymbol vs = new VariableSymbol((ID2!=null?ID2.getText():null),null);
					        vs.scope = currentScope;
					        vs.def = ID2;            // track AST location of def's ID
					        ID2.symbol = vs;         // track in AST
					        currentScope.define(vs);
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
	}
	// $ANTLR end "varDeclaration"

	// Delegated rules



	public static final BitSet FOLLOW_enterBlock_in_topdown63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enterClass_in_topdown71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDeclaration_in_topdown81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atoms_in_topdown91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitBlock_in_bottomup110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitMethod_in_bottomup120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitClass_in_bottomup130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_enterBlock151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_exitBlock172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASSDEF_in_enterClass203 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enterClass207 = new BitSet(new long[]{0x000FFFFFFFFFFFF0L});
	public static final BitSet FOLLOW_CLASSDEF_in_exitClass240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FNDECL_in_exitMethod270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_atoms308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_varDeclaration341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_varDeclaration343 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_FNDECL_in_varDeclaration346 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASSIGN_in_varDeclaration367 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_varDeclaration369 = new BitSet(new long[]{0x000FFFFFFFFF7FF8L});
}
