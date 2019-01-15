package org.xtext.bmod.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBmodLexer extends Lexer {
    public static final int Import=7;
    public static final int In=14;
    public static final int RULE_STRING=25;
    public static final int RULE_SL_COMMENT=27;
    public static final int Comma=18;
    public static final int LeftParenthesis=16;
    public static final int Without=5;
    public static final int To=15;
    public static final int Colon=19;
    public static final int EOF=-1;
    public static final int Room=11;
    public static final int RightSquareBracket=21;
    public static final int Exit=9;
    public static final int RULE_VARNAME=22;
    public static final int RULE_ID=23;
    public static final int RULE_WS=28;
    public static final int RightParenthesis=17;
    public static final int From=12;
    public static final int RULE_ANY_OTHER=29;
    public static final int Door=8;
    public static final int And=13;
    public static final int RULE_INT=24;
    public static final int Fire=10;
    public static final int RULE_ML_COMMENT=26;
    public static final int LeftSquareBracket=20;
    public static final int Person=6;
    public static final int EmergencySign=4;

    // delegates
    // delegators

    public InternalBmodLexer() {;} 
    public InternalBmodLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBmodLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBmodLexer.g"; }

    // $ANTLR start "EmergencySign"
    public final void mEmergencySign() throws RecognitionException {
        try {
            int _type = EmergencySign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:14:15: ( 'EmergencySign' )
            // InternalBmodLexer.g:14:17: 'EmergencySign'
            {
            match("EmergencySign"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EmergencySign"

    // $ANTLR start "Without"
    public final void mWithout() throws RecognitionException {
        try {
            int _type = Without;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:16:9: ( 'without' )
            // InternalBmodLexer.g:16:11: 'without'
            {
            match("without"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Without"

    // $ANTLR start "Person"
    public final void mPerson() throws RecognitionException {
        try {
            int _type = Person;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:18:8: ( 'Person' )
            // InternalBmodLexer.g:18:10: 'Person'
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

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:20:8: ( 'import' )
            // InternalBmodLexer.g:20:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Import"

    // $ANTLR start "Door"
    public final void mDoor() throws RecognitionException {
        try {
            int _type = Door;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:22:6: ( 'Door' )
            // InternalBmodLexer.g:22:8: 'Door'
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
            // InternalBmodLexer.g:24:6: ( 'Exit' )
            // InternalBmodLexer.g:24:8: 'Exit'
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
            // InternalBmodLexer.g:26:6: ( 'Fire' )
            // InternalBmodLexer.g:26:8: 'Fire'
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

    // $ANTLR start "Room"
    public final void mRoom() throws RecognitionException {
        try {
            int _type = Room;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:28:6: ( 'Room' )
            // InternalBmodLexer.g:28:8: 'Room'
            {
            match("Room"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Room"

    // $ANTLR start "From"
    public final void mFrom() throws RecognitionException {
        try {
            int _type = From;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:30:6: ( 'from' )
            // InternalBmodLexer.g:30:8: 'from'
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

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:32:5: ( 'and' )
            // InternalBmodLexer.g:32:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:34:4: ( 'in' )
            // InternalBmodLexer.g:34:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:36:4: ( 'to' )
            // InternalBmodLexer.g:36:6: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:38:17: ( '(' )
            // InternalBmodLexer.g:38:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:40:18: ( ')' )
            // InternalBmodLexer.g:40:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:42:7: ( ',' )
            // InternalBmodLexer.g:42:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:44:7: ( ':' )
            // InternalBmodLexer.g:44:9: ':'
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

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:46:19: ( '[' )
            // InternalBmodLexer.g:46:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:48:20: ( ']' )
            // InternalBmodLexer.g:48:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "RULE_VARNAME"
    public final void mRULE_VARNAME() throws RecognitionException {
        try {
            int _type = RULE_VARNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmodLexer.g:50:14: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBmodLexer.g:50:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalBmodLexer.g:50:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBmodLexer.g:
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
            // InternalBmodLexer.g:52:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBmodLexer.g:52:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBmodLexer.g:52:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBmodLexer.g:52:11: '^'
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

            // InternalBmodLexer.g:52:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBmodLexer.g:
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
            // InternalBmodLexer.g:54:10: ( ( '0' .. '9' )+ )
            // InternalBmodLexer.g:54:12: ( '0' .. '9' )+
            {
            // InternalBmodLexer.g:54:12: ( '0' .. '9' )+
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
            	    // InternalBmodLexer.g:54:13: '0' .. '9'
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
            // InternalBmodLexer.g:56:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBmodLexer.g:56:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBmodLexer.g:56:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalBmodLexer.g:56:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBmodLexer.g:56:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalBmodLexer.g:56:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBmodLexer.g:56:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalBmodLexer.g:56:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBmodLexer.g:56:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalBmodLexer.g:56:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBmodLexer.g:56:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalBmodLexer.g:58:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBmodLexer.g:58:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBmodLexer.g:58:24: ( options {greedy=false; } : . )*
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
            	    // InternalBmodLexer.g:58:52: .
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
            // InternalBmodLexer.g:60:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBmodLexer.g:60:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBmodLexer.g:60:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBmodLexer.g:60:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalBmodLexer.g:60:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBmodLexer.g:60:41: ( '\\r' )? '\\n'
                    {
                    // InternalBmodLexer.g:60:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalBmodLexer.g:60:41: '\\r'
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
            // InternalBmodLexer.g:62:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBmodLexer.g:62:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBmodLexer.g:62:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalBmodLexer.g:
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
            // InternalBmodLexer.g:64:16: ( . )
            // InternalBmodLexer.g:64:18: .
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
        // InternalBmodLexer.g:1:8: ( EmergencySign | Without | Person | Import | Door | Exit | Fire | Room | From | And | In | To | LeftParenthesis | RightParenthesis | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_VARNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=26;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalBmodLexer.g:1:10: EmergencySign
                {
                mEmergencySign(); 

                }
                break;
            case 2 :
                // InternalBmodLexer.g:1:24: Without
                {
                mWithout(); 

                }
                break;
            case 3 :
                // InternalBmodLexer.g:1:32: Person
                {
                mPerson(); 

                }
                break;
            case 4 :
                // InternalBmodLexer.g:1:39: Import
                {
                mImport(); 

                }
                break;
            case 5 :
                // InternalBmodLexer.g:1:46: Door
                {
                mDoor(); 

                }
                break;
            case 6 :
                // InternalBmodLexer.g:1:51: Exit
                {
                mExit(); 

                }
                break;
            case 7 :
                // InternalBmodLexer.g:1:56: Fire
                {
                mFire(); 

                }
                break;
            case 8 :
                // InternalBmodLexer.g:1:61: Room
                {
                mRoom(); 

                }
                break;
            case 9 :
                // InternalBmodLexer.g:1:66: From
                {
                mFrom(); 

                }
                break;
            case 10 :
                // InternalBmodLexer.g:1:71: And
                {
                mAnd(); 

                }
                break;
            case 11 :
                // InternalBmodLexer.g:1:75: In
                {
                mIn(); 

                }
                break;
            case 12 :
                // InternalBmodLexer.g:1:78: To
                {
                mTo(); 

                }
                break;
            case 13 :
                // InternalBmodLexer.g:1:81: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 14 :
                // InternalBmodLexer.g:1:97: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 15 :
                // InternalBmodLexer.g:1:114: Comma
                {
                mComma(); 

                }
                break;
            case 16 :
                // InternalBmodLexer.g:1:120: Colon
                {
                mColon(); 

                }
                break;
            case 17 :
                // InternalBmodLexer.g:1:126: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 18 :
                // InternalBmodLexer.g:1:144: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 19 :
                // InternalBmodLexer.g:1:163: RULE_VARNAME
                {
                mRULE_VARNAME(); 

                }
                break;
            case 20 :
                // InternalBmodLexer.g:1:176: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // InternalBmodLexer.g:1:184: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // InternalBmodLexer.g:1:193: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // InternalBmodLexer.g:1:205: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // InternalBmodLexer.g:1:221: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalBmodLexer.g:1:237: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // InternalBmodLexer.g:1:245: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\12\34\6\uffff\1\34\1\30\1\uffff\3\30\2\uffff\3\34\1\uffff\3\34\1\70\5\34\1\76\14\uffff\5\34\1\uffff\4\34\1\110\1\uffff\1\34\1\112\3\34\1\116\1\117\1\120\1\121\1\uffff\1\34\1\uffff\3\34\4\uffff\2\34\1\130\1\131\1\34\1\133\2\uffff\1\34\1\uffff\4\34\1\141\1\uffff";
    static final String DFA13_eofS =
        "\142\uffff";
    static final String DFA13_minS =
        "\1\0\12\60\6\uffff\1\60\1\101\1\uffff\2\0\1\52\2\uffff\3\60\1\uffff\12\60\14\uffff\5\60\1\uffff\5\60\1\uffff\11\60\1\uffff\1\60\1\uffff\3\60\4\uffff\6\60\2\uffff\1\60\1\uffff\5\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\12\172\6\uffff\2\172\1\uffff\2\uffff\1\57\2\uffff\3\172\1\uffff\12\172\14\uffff\5\172\1\uffff\5\172\1\uffff\11\172\1\uffff\1\172\1\uffff\3\172\4\uffff\6\172\2\uffff\1\172\1\uffff\5\172\1\uffff";
    static final String DFA13_acceptS =
        "\13\uffff\1\15\1\16\1\17\1\20\1\21\1\22\2\uffff\1\25\3\uffff\1\31\1\32\3\uffff\1\23\12\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\24\1\25\1\26\1\27\1\30\1\31\5\uffff\1\13\5\uffff\1\14\11\uffff\1\12\1\uffff\1\6\3\uffff\1\5\1\7\1\10\1\11\6\uffff\1\3\1\4\1\uffff\1\2\5\uffff\1\1";
    static final String DFA13_specialS =
        "\1\1\23\uffff\1\0\1\2\114\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\24\4\30\1\25\1\13\1\14\2\30\1\15\2\30\1\26\12\23\1\16\6\30\3\21\1\5\1\1\1\6\11\21\1\3\1\21\1\7\10\21\1\17\1\30\1\20\1\22\1\21\1\30\1\11\4\21\1\10\2\21\1\4\12\21\1\12\2\21\1\2\3\21\uff85\30",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\14\33\1\31\12\33\1\32\2\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\10\33\1\35\21\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\36\25\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\14\33\1\37\1\40\14\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\41\13\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\10\33\1\42\21\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\43\13\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\44\10\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\45\14\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\46\13\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\0\57",
            "\0\57",
            "\1\60\4\uffff\1\61",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\63\25\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\10\33\1\64\21\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33\1\65\6\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\66\10\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\17\33\1\67\12\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\71\13\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\72\10\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\73\13\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\74\13\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\3\33\1\75\26\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\77\10\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33\1\100\6\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\7\33\1\101\22\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33\1\102\7\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\103\13\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\104\10\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\105\25\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\14\33\1\106\15\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\14\33\1\107\15\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\6\33\1\111\23\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\113\13\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\16\33\1\114\13\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\21\33\1\115\10\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\122\25\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\24\33\1\123\5\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\124\14\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33\1\125\6\33",
            "",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\126\14\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33\1\127\6\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\2\33\1\132\27\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\30\33\1\134\1\33",
            "",
            "\12\33\7\uffff\22\33\1\135\7\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\10\33\1\136\21\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\6\33\1\137\23\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\15\33\1\140\14\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
            return "1:1: Tokens : ( EmergencySign | Without | Person | Import | Door | Exit | Fire | Room | From | And | In | To | LeftParenthesis | RightParenthesis | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_VARNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_20 = input.LA(1);

                        s = -1;
                        if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFF')) ) {s = 47;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='E') ) {s = 1;}

                        else if ( (LA13_0=='w') ) {s = 2;}

                        else if ( (LA13_0=='P') ) {s = 3;}

                        else if ( (LA13_0=='i') ) {s = 4;}

                        else if ( (LA13_0=='D') ) {s = 5;}

                        else if ( (LA13_0=='F') ) {s = 6;}

                        else if ( (LA13_0=='R') ) {s = 7;}

                        else if ( (LA13_0=='f') ) {s = 8;}

                        else if ( (LA13_0=='a') ) {s = 9;}

                        else if ( (LA13_0=='t') ) {s = 10;}

                        else if ( (LA13_0=='(') ) {s = 11;}

                        else if ( (LA13_0==')') ) {s = 12;}

                        else if ( (LA13_0==',') ) {s = 13;}

                        else if ( (LA13_0==':') ) {s = 14;}

                        else if ( (LA13_0=='[') ) {s = 15;}

                        else if ( (LA13_0==']') ) {s = 16;}

                        else if ( ((LA13_0>='A' && LA13_0<='C')||(LA13_0>='G' && LA13_0<='O')||LA13_0=='Q'||(LA13_0>='S' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='e')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='s')||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 17;}

                        else if ( (LA13_0=='^') ) {s = 18;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 19;}

                        else if ( (LA13_0=='\"') ) {s = 20;}

                        else if ( (LA13_0=='\'') ) {s = 21;}

                        else if ( (LA13_0=='/') ) {s = 22;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 23;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||(LA13_0>=';' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_21 = input.LA(1);

                        s = -1;
                        if ( ((LA13_21>='\u0000' && LA13_21<='\uFFFF')) ) {s = 47;}

                        else s = 24;

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