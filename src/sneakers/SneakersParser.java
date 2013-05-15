// $ANTLR 3.5 /Users/eli/dev/Sneakers-Java/Sneakers.g 2013-05-14 22:43:58
 package sneakers; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SneakersParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "WS", 
		"'('", "')'", "'='"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int ID=4;
	public static final int INT=5;
	public static final int NEWLINE=6;
	public static final int WS=7;

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

	@Override public String[] getTokenNames() { return SneakersParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/eli/dev/Sneakers-Java/Sneakers.g"; }



	// $ANTLR start "prog"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:7: ( ( stat )+ )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:9: ( stat )+
			{
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:9: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==8) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:6:9: stat
					{
					pushFollow(FOLLOW_stat_in_prog28);
					stat();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:1: stat : ( ID '=' expr NEWLINE | fncall NEWLINE );
	public final void stat() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:6: ( ID '=' expr NEWLINE | fncall NEWLINE )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ID) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==10) ) {
					alt2=1;
				}
				else if ( (LA2_1==INT) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA2_0==8) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:8:8: ID '=' expr NEWLINE
					{
					match(input,ID,FOLLOW_ID_in_stat37); 
					match(input,10,FOLLOW_10_in_stat39); 
					pushFollow(FOLLOW_expr_in_stat41);
					expr();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat43); 
					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:9:4: fncall NEWLINE
					{
					pushFollow(FOLLOW_fncall_in_stat48);
					fncall();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat50); 
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
	// $ANTLR end "stat"



	// $ANTLR start "fncall"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:1: fncall : ( ID ( expr )+ | '(' ID ')' );
	public final void fncall() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:8: ( ID ( expr )+ | '(' ID ')' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ID) ) {
				alt4=1;
			}
			else if ( (LA4_0==8) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:10: ID ( expr )+
					{
					match(input,ID,FOLLOW_ID_in_fncall58); 
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:13: ( expr )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==INT) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/eli/dev/Sneakers-Java/Sneakers.g:11:14: expr
							{
							pushFollow(FOLLOW_expr_in_fncall61);
							expr();
							state._fsp--;

							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					}
					break;
				case 2 :
					// /Users/eli/dev/Sneakers-Java/Sneakers.g:12:4: '(' ID ')'
					{
					match(input,8,FOLLOW_8_in_fncall68); 
					match(input,ID,FOLLOW_ID_in_fncall70); 
					match(input,9,FOLLOW_9_in_fncall72); 
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
	// $ANTLR end "fncall"



	// $ANTLR start "expr"
	// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:1: expr : INT ;
	public final void expr() throws RecognitionException {
		try {
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:6: ( INT )
			// /Users/eli/dev/Sneakers-Java/Sneakers.g:14:8: INT
			{
			match(input,INT,FOLLOW_INT_in_expr80); 
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
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog28 = new BitSet(new long[]{0x0000000000000112L});
	public static final BitSet FOLLOW_ID_in_stat37 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_stat39 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_stat41 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_stat43 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fncall_in_stat48 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_stat50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fncall58 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_fncall61 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_8_in_fncall68 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_fncall70 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_fncall72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr80 = new BitSet(new long[]{0x0000000000000002L});
}
