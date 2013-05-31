// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Def.g 2013-05-31 17:44:16
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
		"FNCALL", "FNDECL", "FNPARAM", "ID", "INT", "KEYWORD", "METHODDEF", "MUTDECL", 
		"MUTID", "PARAM", "PARAMTYPEFN", "PARAMTYPEMUT", "RET", "STRING", "TYPEID", 
		"WS", "'#'", "'('", "')'", "','", "'.'", "':'", "';'", "'<'", "'=>'", 
		"'>'", "'@'", "'['", "']'", "'else'", "'elseif'", "'extend'", "'if'", 
		"'pass'", "'return'", "'{'", "'}'", "'this'"
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
	public static final int T__51=51;

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
	    
	    private void print(String s) {
	    	//System.out.println(s);
	    }
	    



	// $ANTLR start "topdown"
	// /Users/eli/dev/Sneakers-Java/Def.g:27:1: topdown : ( enterBlock | enterClass | varDeclaration | atoms );
	public final void topdown() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:28:5: ( enterBlock | enterClass | varDeclaration | atoms )
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
			case FIELDDEF:
			case FNPARAM:
			case METHODDEF:
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
					// /Users/eli/dev/Sneakers-Java/Def.g:28:9: enterBlock
					{
					pushFollow(FOLLOW_enterBlock_in_topdown63);
					enterBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Def.g:30:7: enterClass
					{
					pushFollow(FOLLOW_enterClass_in_topdown76);
					enterClass();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Def.g:31:9: varDeclaration
					{
					pushFollow(FOLLOW_varDeclaration_in_topdown86);
					varDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Def.g:32:9: atoms
					{
					pushFollow(FOLLOW_atoms_in_topdown96);
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
	// /Users/eli/dev/Sneakers-Java/Def.g:35:1: bottomup : ( exitBlock | exitMethod | exitClass );
	public final void bottomup() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:36:5: ( exitBlock | exitMethod | exitClass )
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
					// /Users/eli/dev/Sneakers-Java/Def.g:36:9: exitBlock
					{
					pushFollow(FOLLOW_exitBlock_in_bottomup115);
					exitBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Def.g:37:9: exitMethod
					{
					pushFollow(FOLLOW_exitMethod_in_bottomup125);
					exitMethod();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Def.g:38:9: exitClass
					{
					pushFollow(FOLLOW_exitClass_in_bottomup135);
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
	// /Users/eli/dev/Sneakers-Java/Def.g:43:1: enterBlock : BLOCK ;
	public final void enterBlock() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:44:5: ( BLOCK )
			// /Users/eli/dev/Sneakers-Java/Def.g:44:9: BLOCK
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_enterBlock156); if (state.failed) return;
			if ( state.backtracking==1 ) {
			    		print("enter block");
			    		print("PUSH SCOPE");
			    		currentScope = new LocalScope(currentScope);
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
	// $ANTLR end "enterBlock"



	// $ANTLR start "exitBlock"
	// /Users/eli/dev/Sneakers-Java/Def.g:51:1: exitBlock : BLOCK ;
	public final void exitBlock() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:52:5: ( BLOCK )
			// /Users/eli/dev/Sneakers-Java/Def.g:52:9: BLOCK
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_exitBlock183); if (state.failed) return;
			if ( state.backtracking==1 ) {
			        	print("OUT OF BLOCK");
			        	print("locals: "+currentScope);
			        	print("POP SCOPE");
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
	// /Users/eli/dev/Sneakers-Java/Def.g:62:1: enterClass : ^( 'class' name= TYPEID ( . )* ) ;
	public final void enterClass() throws RecognitionException {
		SneakersAST name=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:63:5: ( ^( 'class' name= TYPEID ( . )* ) )
			// /Users/eli/dev/Sneakers-Java/Def.g:63:9: ^( 'class' name= TYPEID ( . )* )
			{
			match(input,CLASSDEF,FOLLOW_CLASSDEF_in_enterClass214); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			name=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_enterClass218); if (state.failed) return;
			// /Users/eli/dev/Sneakers-Java/Def.g:63:31: ( . )*
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
					// /Users/eli/dev/Sneakers-Java/Def.g:63:31: .
					{
					matchAny(input); if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) { // def class but leave superclass blank until ref phase
			        print("line "+name.getLine()+
			                           ": def class "+(name!=null?name.getText():null));
			        // record scope in AST for next pass
			        ClassSymbol cs = new ClassSymbol((name!=null?name.getText():null),currentScope,null);
			        cs.def = name;           // point from symbol table into AST
			        name.symbol = cs;        // point from AST into symbol table
			        currentScope.define(cs);  // def class in current scope
			        print("PUSH SCOPE");
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
	// /Users/eli/dev/Sneakers-Java/Def.g:78:1: exitClass : CLASSDEF ;
	public final void exitClass() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:79:5: ( CLASSDEF )
			// /Users/eli/dev/Sneakers-Java/Def.g:79:9: CLASSDEF
			{
			match(input,CLASSDEF,FOLLOW_CLASSDEF_in_exitClass252); if (state.failed) return;
			if ( state.backtracking==1 ) {
			        print("OUT OF CLASS");
			        print("members: "+currentScope);
			        print("POP SCOPE");
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
	// /Users/eli/dev/Sneakers-Java/Def.g:89:1: exitMethod : FNDECL ;
	public final void exitMethod() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:90:5: ( FNDECL )
			// /Users/eli/dev/Sneakers-Java/Def.g:90:9: FNDECL
			{
			match(input,FNDECL,FOLLOW_FNDECL_in_exitMethod282); if (state.failed) return;
			if ( state.backtracking==1 ) {
			        print("OUT OF METHOD");
			        print("args: "+currentScope);
			        print("POP SCOPE");
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
	// /Users/eli/dev/Sneakers-Java/Def.g:101:1: atoms :{...}? ( 'this' | ID | TYPEID ) ;
	public final void atoms() throws RecognitionException {
		SneakersAST t = (SneakersAST)input.LT(1);
		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:103:5: ({...}? ( 'this' | ID | TYPEID ) )
			// /Users/eli/dev/Sneakers-Java/Def.g:103:8: {...}? ( 'this' | ID | TYPEID )
			{
			if ( !((t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "atoms", "t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN)");
			}
			if ( input.LA(1)==ID||input.LA(1)==TYPEID||input.LA(1)==51 ) {
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
	// /Users/eli/dev/Sneakers-Java/Def.g:109:1: varDeclaration : ( ^( '=' ID ^( FNDECL TYPEID ( . )* ) ) | ^( '=' ID (~ ( FNDECL ) )* ) | ^( FNPARAM ID TYPEID ) | ^( FIELDDEF KEYWORD ^(~ FNDECL ( . )* ) ) | ^( METHODDEF KEYWORD ^( FNDECL ( . )+ ) ) );
	public final void varDeclaration() throws RecognitionException {
		SneakersAST ID1=null;
		SneakersAST TYPEID2=null;
		SneakersAST ID3=null;
		SneakersAST ID4=null;
		SneakersAST TYPEID5=null;
		SneakersAST KEYWORD6=null;
		SneakersAST KEYWORD7=null;

		try {
			// /Users/eli/dev/Sneakers-Java/Def.g:110:2: ( ^( '=' ID ^( FNDECL TYPEID ( . )* ) ) | ^( '=' ID (~ ( FNDECL ) )* ) | ^( FNPARAM ID TYPEID ) | ^( FIELDDEF KEYWORD ^(~ FNDECL ( . )* ) ) | ^( METHODDEF KEYWORD ^( FNDECL ( . )+ ) ) )
			int alt8=5;
			switch ( input.LA(1) ) {
			case ASSIGN:
				{
				int LA8_1 = input.LA(2);
				if ( (LA8_1==DOWN) ) {
					int LA8_5 = input.LA(3);
					if ( (LA8_5==ID) ) {
						int LA8_6 = input.LA(4);
						if ( (LA8_6==FNDECL) ) {
							alt8=1;
						}
						else if ( ((LA8_6 >= UP && LA8_6 <= FNCALL)||(LA8_6 >= FNPARAM && LA8_6 <= 51)) ) {
							alt8=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 6, input);
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
								new NoViableAltException("", 8, 5, input);
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
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FNPARAM:
				{
				alt8=3;
				}
				break;
			case FIELDDEF:
				{
				alt8=4;
				}
				break;
			case METHODDEF:
				{
				alt8=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Def.g:110:4: ^( '=' ID ^( FNDECL TYPEID ( . )* ) )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration353); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					ID1=(SneakersAST)match(input,ID,FOLLOW_ID_in_varDeclaration355); if (state.failed) return;
					match(input,FNDECL,FOLLOW_FNDECL_in_varDeclaration358); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					TYPEID2=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_varDeclaration360); if (state.failed) return;
					// /Users/eli/dev/Sneakers-Java/Def.g:110:29: ( . )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= ANONFN && LA4_0 <= 51)) ) {
							alt4=1;
						}
						else if ( (LA4_0==UP) ) {
							alt4=2;
						}

						switch (alt4) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Def.g:110:29: .
							{
							matchAny(input); if (state.failed) return;
							}
							break;

						default :
							break loop4;
						}
					}

					match(input, Token.UP, null); if (state.failed) return;

					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==1 ) {
							print("line "+ID1.getLine()+": def "+(ID1!=null?ID1.getText():null));
					        
					        	MethodSymbol ms = new MethodSymbol((ID1!=null?ID1.getText():null),null,currentScope);
					        	
					        	TYPEID2.scope = currentScope;
					        	ms.def = ID1;            // track AST location of def's ID
						        ID1.symbol = ms;         // track in AST
					        	currentScope.define(ms); // def method in globals
					        	
					        	print("PUSH SCOPE");
						        currentScope = ms;       // set current scope to method scope
						}
					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Def.g:124:11: ^( '=' ID (~ ( FNDECL ) )* )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_varDeclaration381); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					ID3=(SneakersAST)match(input,ID,FOLLOW_ID_in_varDeclaration383); if (state.failed) return;
					// /Users/eli/dev/Sneakers-Java/Def.g:124:20: (~ ( FNDECL ) )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= ANONFN && LA5_0 <= FNCALL)||(LA5_0 >= FNPARAM && LA5_0 <= 51)) ) {
							alt5=1;
						}

						switch (alt5) {
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
							break loop5;
						}
					}

					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==1 ) {
					        	print("line "+ID3.getLine()+": def "+(ID3!=null?ID3.getText():null));
					        
						        VariableSymbol vs = new VariableSymbol((ID3!=null?ID3.getText():null),null);
						        vs.scope = currentScope;
					        	vs.def = ID3;            // track AST location of def's ID
						        ID3.symbol = vs;         // track in AST
					        	currentScope.define(vs);
					        }
					}
					break;
				case 3 :
					// /Users/eli/dev/Sneakers-Java/Def.g:134:11: ^( FNPARAM ID TYPEID )
					{
					match(input,FNPARAM,FOLLOW_FNPARAM_in_varDeclaration414); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					ID4=(SneakersAST)match(input,ID,FOLLOW_ID_in_varDeclaration416); if (state.failed) return;
					TYPEID5=(SneakersAST)match(input,TYPEID,FOLLOW_TYPEID_in_varDeclaration418); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==1 ) {
					        	print("fn param line "+ID4.getLine()+": def "+(ID4!=null?ID4.getText():null));
					        
						        VariableSymbol vs = new VariableSymbol((ID4!=null?ID4.getText():null),null);
						        
						        TYPEID5.scope = currentScope;
						        vs.scope = currentScope;
					        	vs.def = ID4;            // track AST location of def's ID
						        ID4.symbol = vs;         // track in AST
					        	currentScope.define(vs);
					        }
					}
					break;
				case 4 :
					// /Users/eli/dev/Sneakers-Java/Def.g:146:11: ^( FIELDDEF KEYWORD ^(~ FNDECL ( . )* ) )
					{
					match(input,FIELDDEF,FOLLOW_FIELDDEF_in_varDeclaration442); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					KEYWORD6=(SneakersAST)match(input,KEYWORD,FOLLOW_KEYWORD_in_varDeclaration444); if (state.failed) return;
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
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return;
						// /Users/eli/dev/Sneakers-Java/Def.g:146:40: ( . )*
						loop6:
						while (true) {
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( ((LA6_0 >= ANONFN && LA6_0 <= 51)) ) {
								alt6=1;
							}
							else if ( (LA6_0==UP) ) {
								alt6=2;
							}

							switch (alt6) {
							case 1 :
								// /Users/eli/dev/Sneakers-Java/Def.g:146:40: .
								{
								matchAny(input); if (state.failed) return;
								}
								break;

							default :
								break loop6;
							}
						}

						match(input, Token.UP, null); if (state.failed) return;
					}

					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==1 ) {
					        	print("class var line "+KEYWORD6.getLine()+": def "+(KEYWORD6!=null?KEYWORD6.getText():null));
					        	
					        	String text = (KEYWORD6!=null?KEYWORD6.getText():null).substring(1);
						        VariableSymbol vs = new VariableSymbol(text, null);
						        
						        vs.scope = currentScope;
					        	vs.def = KEYWORD6;            // track AST location of def's ID
						        KEYWORD6.symbol = vs;         // track in AST
					        	currentScope.define(vs);
					        }
					}
					break;
				case 5 :
					// /Users/eli/dev/Sneakers-Java/Def.g:158:11: ^( METHODDEF KEYWORD ^( FNDECL ( . )+ ) )
					{
					match(input,METHODDEF,FOLLOW_METHODDEF_in_varDeclaration476); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					KEYWORD7=(SneakersAST)match(input,KEYWORD,FOLLOW_KEYWORD_in_varDeclaration478); if (state.failed) return;
					match(input,FNDECL,FOLLOW_FNDECL_in_varDeclaration481); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					// /Users/eli/dev/Sneakers-Java/Def.g:158:40: ( . )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= ANONFN && LA7_0 <= 51)) ) {
							alt7=1;
						}
						else if ( (LA7_0==UP) ) {
							alt7=2;
						}

						switch (alt7) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Def.g:158:40: .
							{
							matchAny(input); if (state.failed) return;
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					match(input, Token.UP, null); if (state.failed) return;

					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==1 ) {
					        	print("class method line "+KEYWORD7.getLine()+": def "+(KEYWORD7!=null?KEYWORD7.getText():null));
					        	
					        	String text = (KEYWORD7!=null?KEYWORD7.getText():null).substring(1);
					        	MethodSymbol ms = new MethodSymbol(text,null,currentScope);
						        
						        ms.scope = currentScope;
					        	ms.def = KEYWORD7;            // track AST location of def's ID
						        KEYWORD7.symbol = ms;         // track in AST
					        	currentScope.define(ms);
					        	
					        	print("PUSH SCOPE");
						        currentScope = ms;
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
	public static final BitSet FOLLOW_enterClass_in_topdown76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDeclaration_in_topdown86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atoms_in_topdown96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitBlock_in_bottomup115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitMethod_in_bottomup125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitClass_in_bottomup135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_enterBlock156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_exitBlock183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASSDEF_in_enterClass214 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_enterClass218 = new BitSet(new long[]{0x000FFFFFFFFFFFF8L});
	public static final BitSet FOLLOW_CLASSDEF_in_exitClass252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FNDECL_in_exitMethod282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_atoms320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_varDeclaration353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_varDeclaration355 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_FNDECL_in_varDeclaration358 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPEID_in_varDeclaration360 = new BitSet(new long[]{0x000FFFFFFFFFFFF8L});
	public static final BitSet FOLLOW_ASSIGN_in_varDeclaration381 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_varDeclaration383 = new BitSet(new long[]{0x000FFFFFFFFF7FF8L});
	public static final BitSet FOLLOW_FNPARAM_in_varDeclaration414 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_varDeclaration416 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_TYPEID_in_varDeclaration418 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FIELDDEF_in_varDeclaration442 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_KEYWORD_in_varDeclaration444 = new BitSet(new long[]{0x000FFFFFFFFF7FF0L});
	public static final BitSet FOLLOW_set_in_varDeclaration447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHODDEF_in_varDeclaration476 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_KEYWORD_in_varDeclaration478 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_FNDECL_in_varDeclaration481 = new BitSet(new long[]{0x0000000000000004L});
}
