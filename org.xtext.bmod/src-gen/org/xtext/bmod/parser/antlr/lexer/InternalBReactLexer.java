package org.xtext.bmod.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBReactLexer extends Lexer {
    public static final int Action=8;
    public static final int RULE_STRING=25;
    public static final int Shared=11;
    public static final int Global=9;
    public static final int RULE_SL_COMMENT=27;
    public static final int Farthest=4;
    public static final int Last=19;
    public static final int First=12;
    public static final int Colon=20;
    public static final int EOF=-1;
    public static final int Cell=13;
    public static final int Exit=15;
    public static final int RULE_VARNAME=22;
    public static final int RULE_ID=23;
    public static final int RULE_WS=28;
    public static final int From=18;
    public static final int RULE_ANY_OTHER=29;
    public static final int Normal=10;
    public static final int Door=14;
    public static final int Burning=5;
    public static final int Semicolon=21;
    public static final int Nearest=6;
    public static final int RULE_INT=24;
    public static final int Fire=16;
    public static final int Find=17;
    public static final int RULE_ML_COMMENT=26;
    public static final int Person=7;

    // delegates
    // delegators

    public InternalBReactLexer() {;} 
    public InternalBReactLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBReactLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBReactLexer.g"; }

    // $ANTLR start "Farthest"
    public final void mFarthest() throws RecognitionException {
        try {
            int _type = Farthest;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:14:10: ( 'farthest' )
            // InternalBReactLexer.g:14:12: 'farthest'
            {
            match("farthest"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Farthest"

    // $ANTLR start "Burning"
    public final void mBurning() throws RecognitionException {
        try {
            int _type = Burning;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:16:9: ( 'burning' )
            // InternalBReactLexer.g:16:11: 'burning'
            {
            match("burning"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Burning"

    // $ANTLR start "Nearest"
    public final void mNearest() throws RecognitionException {
        try {
            int _type = Nearest;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:18:9: ( 'nearest' )
            // InternalBReactLexer.g:18:11: 'nearest'
            {
            match("nearest"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nearest"

    // $ANTLR start "Person"
    public final void mPerson() throws RecognitionException {
        try {
            int _type = Person;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:20:8: ( 'Person' )
            // InternalBReactLexer.g:20:10: 'Person'
            {
            match("Person"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Person"

    // $ANTLR start "Action"
    public final void mAction() throws RecognitionException {
        try {
            int _type = Action;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:22:8: ( 'action' )
            // InternalBReactLexer.g:22:10: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Action"

    // $ANTLR start "Global"
    public final void mGlobal() throws RecognitionException {
        try {
            int _type = Global;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:24:8: ( 'global' )
            // InternalBReactLexer.g:24:10: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Global"

    // $ANTLR start "Normal"
    public final void mNormal() throws RecognitionException {
        try {
            int _type = Normal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:26:8: ( 'normal' )
            // InternalBReactLexer.g:26:10: 'normal'
            {
            match("normal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Normal"

    // $ANTLR start "Shared"
    public final void mShared() throws RecognitionException {
        try {
            int _type = Shared;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:28:8: ( 'shared' )
            // InternalBReactLexer.g:28:10: 'shared'
            {
            match("shared"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Shared"

    // $ANTLR start "First"
    public final void mFirst() throws RecognitionException {
        try {
            int _type = First;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:30:7: ( 'first' )
            // InternalBReactLexer.g:30:9: 'first'
            {
            match("first"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "First"

    // $ANTLR start "Cell"
    public final void mCell() throws RecognitionException {
        try {
            int _type = Cell;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:32:6: ( 'Cell' )
            // InternalBReactLexer.g:32:8: 'Cell'
            {
            match("Cell"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cell"

    // $ANTLR start "Door"
    public final void mDoor() throws RecognitionException {
        try {
            int _type = Door;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:34:6: ( 'Door' )
            // InternalBReactLexer.g:34:8: 'Door'
            {
            match("Door"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Door"

    // $ANTLR start "Exit"
    public final void mExit() throws RecognitionException {
        try {
            int _type = Exit;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:36:6: ( 'Exit' )
            // InternalBReactLexer.g:36:8: 'Exit'
            {
            match("Exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Exit"

    // $ANTLR start "Fire"
    public final void mFire() throws RecognitionException {
        try {
            int _type = Fire;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:38:6: ( 'Fire' )
            // InternalBReactLexer.g:38:8: 'Fire'
            {
            match("Fire"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fire"

    // $ANTLR start "Find"
    public final void mFind() throws RecognitionException {
        try {
            int _type = Find;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:40:6: ( 'find' )
            // InternalBReactLexer.g:40:8: 'find'
            {
            match("find"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Find"

    // $ANTLR start "From"
    public final void mFrom() throws RecognitionException {
        try {
            int _type = From;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:42:6: ( 'from' )
            // InternalBReactLexer.g:42:8: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "From"

    // $ANTLR start "Last"
    public final void mLast() throws RecognitionException {
        try {
            int _type = Last;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:44:6: ( 'last' )
            // InternalBReactLexer.g:44:8: 'last'
            {
            match("last"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Last"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:46:7: ( ':' )
            // InternalBReactLexer.g:46:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:48:11: ( ';' )
            // InternalBReactLexer.g:48:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "RULE_VARNAME"
    public final void mRULE_VARNAME() throws RecognitionException {
        try {
            int _type = RULE_VARNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:50:14: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBReactLexer.g:50:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalBReactLexer.g:50:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBReactLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARNAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:52:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBReactLexer.g:52:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBReactLexer.g:52:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBReactLexer.g:52:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalBReactLexer.g:52:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBReactLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:54:10: ( ( '0' .. '9' )+ )
            // InternalBReactLexer.g:54:12: ( '0' .. '9' )+
            {
            // InternalBReactLexer.g:54:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBReactLexer.g:54:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:56:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBReactLexer.g:56:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBReactLexer.g:56:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBReactLexer.g:56:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBReactLexer.g:56:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBReactLexer.g:56:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBReactLexer.g:56:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalBReactLexer.g:56:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBReactLexer.g:56:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBReactLexer.g:56:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBReactLexer.g:56:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:58:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBReactLexer.g:58:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBReactLexer.g:58:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBReactLexer.g:58:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:60:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBReactLexer.g:60:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBReactLexer.g:60:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBReactLexer.g:60:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalBReactLexer.g:60:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBReactLexer.g:60:41: ( '\\r' )? '\\n'
                    {
                    // InternalBReactLexer.g:60:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalBReactLexer.g:60:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:62:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBReactLexer.g:62:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBReactLexer.g:62:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBReactLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBReactLexer.g:64:16: ( . )
            // InternalBReactLexer.g:64:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalBReactLexer.g:1:8: ( Farthest | Burning | Nearest | Person | Action | Global | Normal | Shared | First | Cell | Door | Exit | Fire | Find | From | Last | Colon | Semicolon | RULE_VARNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=26;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalBReactLexer.g:1:10: Farthest
                {
                mFarthest(); 

                }
                break;
            case 2 :
                // InternalBReactLexer.g:1:19: Burning
                {
                mBurning(); 

                }
                break;
            case 3 :
                // InternalBReactLexer.g:1:27: Nearest
                {
                mNearest(); 

                }
                break;
            case 4 :
                // InternalBReactLexer.g:1:35: Person
                {
                mPerson(); 

                }
                break;
            case 5 :
                // InternalBReactLexer.g:1:42: Action
                {
                mAction(); 

                }
                break;
            case 6 :
                // InternalBReactLexer.g:1:49: Global
                {
                mGlobal(); 

                }
                break;
            case 7 :
                // InternalBReactLexer.g:1:56: Normal
                {
                mNormal(); 

                }
                break;
            case 8 :
                // InternalBReactLexer.g:1:63: Shared
                {
                mShared(); 

                }
                break;
            case 9 :
                // InternalBReactLexer.g:1:70: First
                {
                mFirst(); 

                }
                break;
            case 10 :
                // InternalBReactLexer.g:1:76: Cell
                {
                mCell(); 

                }
                break;
            case 11 :
                // InternalBReactLexer.g:1:81: Door
                {
                mDoor(); 

                }
                break;
            case 12 :
                // InternalBReactLexer.g:1:86: Exit
                {
                mExit(); 

                }
                break;
            case 13 :
                // InternalBReactLexer.g:1:91: Fire
                {
                mFire(); 

                }
                break;
            case 14 :
                // InternalBReactLexer.g:1:96: Find
                {
                mFind(); 

                }
                break;
            case 15 :
                // InternalBReactLexer.g:1:101: From
                {
                mFrom(); 

                }
                break;
            case 16 :
                // InternalBReactLexer.g:1:106: Last
                {
                mLast(); 

                }
                break;
            case 17 :
                // InternalBReactLexer.g:1:111: Colon
                {
                mColon(); 

                }
                break;
            case 18 :
                // InternalBReactLexer.g:1:117: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 19 :
                // InternalBReactLexer.g:1:127: RULE_VARNAME
                {
                mRULE_VARNAME(); 

                }
                break;
            case 20 :
                // InternalBReactLexer.g:1:140: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // InternalBReactLexer.g:1:148: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // InternalBReactLexer.g:1:157: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // InternalBReactLexer.g:1:169: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // InternalBReactLexer.g:1:185: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalBReactLexer.g:1:201: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // InternalBReactLexer.g:1:209: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\14\33\2\uffff\1\33\1\26\1\uffff\3\26\2\uffff\4\33\1\uffff\14\33\10\uffff\22\33\1\122\1\123\7\33\1\133\1\134\1\135\1\136\1\137\1\33\1\141\2\uffff\7\33\5\uffff\1\33\1\uffff\2\33\1\154\1\155\1\156\1\157\1\160\1\33\1\162\1\163\5\uffff\1\164\3\uffff";
    static final String DFA13_eofS =
        "\165\uffff";
    static final String DFA13_minS =
        "\1\0\14\60\2\uffff\1\60\1\101\1\uffff\2\0\1\52\2\uffff\4\60\1\uffff\14\60\10\uffff\42\60\2\uffff\7\60\5\uffff\1\60\1\uffff\12\60\5\uffff\1\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\14\172\2\uffff\2\172\1\uffff\2\uffff\1\57\2\uffff\4\172\1\uffff\14\172\10\uffff\42\172\2\uffff\7\172\5\uffff\1\172\1\uffff\12\172\5\uffff\1\172\3\uffff";
    static final String DFA13_acceptS =
        "\15\uffff\1\21\1\22\2\uffff\1\25\3\uffff\1\31\1\32\4\uffff\1\23\14\uffff\1\21\1\22\1\24\1\25\1\26\1\27\1\30\1\31\42\uffff\1\16\1\17\7\uffff\1\12\1\13\1\14\1\15\1\20\1\uffff\1\11\12\uffff\1\7\1\4\1\5\1\6\1\10\1\uffff\1\2\1\3\1\1";
    static final String DFA13_specialS =
        "\1\1\21\uffff\1\0\1\2\141\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\22\4\26\1\23\7\26\1\24\12\21\1\15\1\16\5\26\2\17\1\10\1\11\1\12\1\13\11\17\1\4\12\17\3\26\1\20\1\17\1\26\1\5\1\2\3\17\1\1\1\6\4\17\1\14\1\17\1\3\4\17\1\7\7\17\uff85\26",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\27\7\32\1\30\10\32\1\31\10\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32\1\34\5\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\35\11\32\1\36\13\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\37\25\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\2\32\1\40\27\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32\1\41\16\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\7\32\1\42\22\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\43\25\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32\1\44\13\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\27\32\1\45\2\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32\1\46\21\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\47\31\32",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\0\54",
            "\0\54",
            "\1\55\4\uffff\1\56",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\60\10\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32\1\62\3\32\1\61\10\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32\1\63\13\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\64\10\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\65\31\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\66\10\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\67\10\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32\1\70\6\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32\1\71\13\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\72\31\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32\1\73\16\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32\1\74\13\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32\1\75\21\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\76\10\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\22\32\1\77\7\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32\1\100\6\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\22\32\1\101\7\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32\1\102\26\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\14\32\1\103\15\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32\1\104\14\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\105\10\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\14\32\1\106\15\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\22\32\1\107\7\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32\1\110\21\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\32\1\111\30\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\112\10\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32\1\113\16\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32\1\114\10\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32\1\115\6\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\116\25\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32\1\117\6\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\7\32\1\120\22\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32\1\121\6\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32\1\124\21\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\125\25\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\126\31\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32\1\127\13\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32\1\130\13\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\131\31\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\132\25\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32\1\140\25\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32\1\142\14\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\22\32\1\143\7\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32\1\144\16\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32\1\145\14\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32\1\146\14\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32\1\147\16\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32\1\150\26\32",
            "",
            "",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\22\32\1\151\7\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\6\32\1\152\23\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32\1\153\6\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32\1\161\6\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Farthest | Burning | Nearest | Person | Action | Global | Normal | Shared | First | Cell | Door | Exit | Fire | Find | From | Last | Colon | Semicolon | RULE_VARNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_18 = input.LA(1);

                        s = -1;
                        if ( ((LA13_18>='\u0000' && LA13_18<='\uFFFF')) ) {s = 44;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='f') ) {s = 1;}

                        else if ( (LA13_0=='b') ) {s = 2;}

                        else if ( (LA13_0=='n') ) {s = 3;}

                        else if ( (LA13_0=='P') ) {s = 4;}

                        else if ( (LA13_0=='a') ) {s = 5;}

                        else if ( (LA13_0=='g') ) {s = 6;}

                        else if ( (LA13_0=='s') ) {s = 7;}

                        else if ( (LA13_0=='C') ) {s = 8;}

                        else if ( (LA13_0=='D') ) {s = 9;}

                        else if ( (LA13_0=='E') ) {s = 10;}

                        else if ( (LA13_0=='F') ) {s = 11;}

                        else if ( (LA13_0=='l') ) {s = 12;}

                        else if ( (LA13_0==':') ) {s = 13;}

                        else if ( (LA13_0==';') ) {s = 14;}

                        else if ( ((LA13_0>='A' && LA13_0<='B')||(LA13_0>='G' && LA13_0<='O')||(LA13_0>='Q' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='c' && LA13_0<='e')||(LA13_0>='h' && LA13_0<='k')||LA13_0=='m'||(LA13_0>='o' && LA13_0<='r')||(LA13_0>='t' && LA13_0<='z')) ) {s = 15;}

                        else if ( (LA13_0=='^') ) {s = 16;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 17;}

                        else if ( (LA13_0=='\"') ) {s = 18;}

                        else if ( (LA13_0=='\'') ) {s = 19;}

                        else if ( (LA13_0=='/') ) {s = 20;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 21;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='.')||(LA13_0>='<' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_19 = input.LA(1);

                        s = -1;
                        if ( ((LA13_19>='\u0000' && LA13_19<='\uFFFF')) ) {s = 44;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}