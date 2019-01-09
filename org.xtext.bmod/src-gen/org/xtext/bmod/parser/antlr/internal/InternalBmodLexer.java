package org.xtext.bmod.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBmodLexer extends Lexer {
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_VARNAME=4;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalBmodLexer() {;} 
    public InternalBmodLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBmodLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBmod.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:11:7: ( 'Room' )
            // InternalBmod.g:11:9: 'Room'
            {
            match("Room"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:12:7: ( 'and' )
            // InternalBmod.g:12:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:13:7: ( 'Door' )
            // InternalBmod.g:13:9: 'Door'
            {
            match("Door"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:14:7: ( 'from' )
            // InternalBmod.g:14:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:15:7: ( 'to' )
            // InternalBmod.g:15:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:16:7: ( 'PerceptionLevel' )
            // InternalBmod.g:16:9: 'PerceptionLevel'
            {
            match("PerceptionLevel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:17:7: ( 'ActionProfile' )
            // InternalBmod.g:17:9: 'ActionProfile'
            {
            match("ActionProfile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:18:7: ( 'Person' )
            // InternalBmod.g:18:9: 'Person'
            {
            match("Person"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:19:7: ( 'in' )
            // InternalBmod.g:19:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:20:7: ( ':' )
            // InternalBmod.g:20:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:21:7: ( ',' )
            // InternalBmod.g:21:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:22:7: ( 'Exit' )
            // InternalBmod.g:22:9: 'Exit'
            {
            match("Exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:23:7: ( 'Fire' )
            // InternalBmod.g:23:9: 'Fire'
            {
            match("Fire"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:24:7: ( 'Sign' )
            // InternalBmod.g:24:9: 'Sign'
            {
            match("Sign"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:25:7: ( 'on' )
            // InternalBmod.g:25:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:26:7: ( 'Condition' )
            // InternalBmod.g:26:9: 'Condition'
            {
            match("Condition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:27:7: ( '(' )
            // InternalBmod.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:28:7: ( ')' )
            // InternalBmod.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:29:7: ( 'without' )
            // InternalBmod.g:29:9: 'without'
            {
            match("without"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:30:7: ( 'attentive' )
            // InternalBmod.g:30:9: 'attentive'
            {
            match("attentive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:31:7: ( 'relaxed' )
            // InternalBmod.g:31:9: 'relaxed'
            {
            match("relaxed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:32:7: ( 'optimistic' )
            // InternalBmod.g:32:9: 'optimistic'
            {
            match("optimistic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:33:7: ( 'sceptic' )
            // InternalBmod.g:33:9: 'sceptic'
            {
            match("sceptic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:34:7: ( 'newcomer' )
            // InternalBmod.g:34:9: 'newcomer'
            {
            match("newcomer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:35:7: ( 'experienced' )
            // InternalBmod.g:35:9: 'experienced'
            {
            match("experienced"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:36:7: ( 'panic' )
            // InternalBmod.g:36:9: 'panic'
            {
            match("panic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_VARNAME"
    public final void mRULE_VARNAME() throws RecognitionException {
        try {
            int _type = RULE_VARNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBmod.g:1269:14: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBmod.g:1269:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalBmod.g:1269:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBmod.g:
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
            // InternalBmod.g:1271:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBmod.g:1271:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBmod.g:1271:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBmod.g:1271:11: '^'
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

            // InternalBmod.g:1271:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBmod.g:
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
            // InternalBmod.g:1273:10: ( ( '0' .. '9' )+ )
            // InternalBmod.g:1273:12: ( '0' .. '9' )+
            {
            // InternalBmod.g:1273:12: ( '0' .. '9' )+
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
            	    // InternalBmod.g:1273:13: '0' .. '9'
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
            // InternalBmod.g:1275:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBmod.g:1275:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBmod.g:1275:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalBmod.g:1275:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBmod.g:1275:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalBmod.g:1275:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBmod.g:1275:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalBmod.g:1275:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBmod.g:1275:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalBmod.g:1275:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBmod.g:1275:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalBmod.g:1277:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBmod.g:1277:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBmod.g:1277:24: ( options {greedy=false; } : . )*
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
            	    // InternalBmod.g:1277:52: .
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
            // InternalBmod.g:1279:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBmod.g:1279:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBmod.g:1279:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBmod.g:1279:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalBmod.g:1279:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBmod.g:1279:41: ( '\\r' )? '\\n'
                    {
                    // InternalBmod.g:1279:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalBmod.g:1279:41: '\\r'
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
            // InternalBmod.g:1281:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBmod.g:1281:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBmod.g:1281:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalBmod.g:
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
            // InternalBmod.g:1283:16: ( . )
            // InternalBmod.g:1283:18: .
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
        // InternalBmod.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_VARNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=34;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalBmod.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalBmod.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalBmod.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalBmod.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalBmod.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalBmod.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalBmod.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalBmod.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalBmod.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalBmod.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalBmod.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalBmod.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalBmod.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalBmod.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalBmod.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalBmod.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalBmod.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalBmod.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalBmod.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalBmod.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalBmod.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalBmod.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalBmod.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalBmod.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalBmod.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalBmod.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalBmod.g:1:166: RULE_VARNAME
                {
                mRULE_VARNAME(); 

                }
                break;
            case 28 :
                // InternalBmod.g:1:179: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // InternalBmod.g:1:187: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // InternalBmod.g:1:196: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // InternalBmod.g:1:208: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // InternalBmod.g:1:224: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // InternalBmod.g:1:240: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // InternalBmod.g:1:248: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\10\41\2\uffff\5\41\2\uffff\7\41\1\37\1\uffff\3\37\2\uffff\1\41\1\uffff\5\41\1\106\2\41\1\111\2\uffff\3\41\1\115\2\41\2\uffff\6\41\6\uffff\1\41\1\127\3\41\1\uffff\2\41\1\uffff\3\41\1\uffff\10\41\1\151\1\uffff\1\41\1\153\1\154\3\41\1\160\1\161\1\162\10\41\1\uffff\1\41\2\uffff\3\41\3\uffff\7\41\1\u0086\2\41\1\u0089\10\41\1\uffff\2\41\1\uffff\3\41\1\u0097\1\u0098\1\u0099\7\41\3\uffff\1\u00a1\1\41\1\u00a3\3\41\1\u00a7\1\uffff\1\41\1\uffff\2\41\1\u00ab\1\uffff\3\41\1\uffff\1\u00af\2\41\1\uffff\1\41\1\u00b3\1\41\1\uffff\1\u00b5\1\uffff";
    static final String DFA13_eofS =
        "\u00b6\uffff";
    static final String DFA13_minS =
        "\1\0\10\60\2\uffff\5\60\2\uffff\7\60\1\101\1\uffff\2\0\1\52\2\uffff\1\60\1\uffff\11\60\2\uffff\6\60\2\uffff\6\60\6\uffff\5\60\1\uffff\2\60\1\uffff\3\60\1\uffff\11\60\1\uffff\21\60\1\uffff\1\60\2\uffff\3\60\3\uffff\23\60\1\uffff\2\60\1\uffff\15\60\3\uffff\7\60\1\uffff\1\60\1\uffff\3\60\1\uffff\3\60\1\uffff\3\60\1\uffff\3\60\1\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\10\172\2\uffff\5\172\2\uffff\10\172\1\uffff\2\uffff\1\57\2\uffff\1\172\1\uffff\11\172\2\uffff\6\172\2\uffff\6\172\6\uffff\5\172\1\uffff\2\172\1\uffff\3\172\1\uffff\11\172\1\uffff\21\172\1\uffff\1\172\2\uffff\3\172\3\uffff\23\172\1\uffff\2\172\1\uffff\15\172\3\uffff\7\172\1\uffff\1\172\1\uffff\3\172\1\uffff\3\172\1\uffff\3\172\1\uffff\3\172\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\11\uffff\1\12\1\13\5\uffff\1\21\1\22\10\uffff\1\35\3\uffff\1\41\1\42\1\uffff\1\33\11\uffff\1\12\1\13\6\uffff\1\21\1\22\6\uffff\1\34\1\35\1\36\1\37\1\40\1\41\5\uffff\1\5\2\uffff\1\11\3\uffff\1\17\11\uffff\1\2\21\uffff\1\1\1\uffff\1\3\1\4\3\uffff\1\14\1\15\1\16\23\uffff\1\32\2\uffff\1\10\15\uffff\1\23\1\25\1\27\7\uffff\1\30\1\uffff\1\24\3\uffff\1\20\3\uffff\1\26\3\uffff\1\31\3\uffff\1\7\1\uffff\1\6";
    static final String DFA13_specialS =
        "\1\2\32\uffff\1\1\1\0\u0099\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\4\37\1\34\1\20\1\21\2\37\1\12\2\37\1\35\12\32\1\11\6\37\1\7\1\30\1\17\1\3\1\13\1\14\11\30\1\6\1\30\1\1\1\15\7\30\3\37\1\31\1\30\1\37\1\2\3\30\1\26\1\4\2\30\1\10\4\30\1\25\1\16\1\27\1\30\1\23\1\24\1\5\2\30\1\22\3\30\uff85\37",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\40\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\43\5\42\1\44\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\45\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\46\10\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\47\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\50\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\51\27\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\52\14\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\27\42\1\55\2\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\56\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\57\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\60\1\42\1\61\12\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\62\13\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\65\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\66\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\67\27\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\70\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\27\42\1\71\2\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\72\31\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\0\75",
            "\0\75",
            "\1\76\4\uffff\1\77",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\101\13\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\3\42\1\102\26\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\103\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\104\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\105\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\107\10\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\110\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\112\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\113\10\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\6\42\1\114\23\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\116\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\117\14\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\120\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\121\16\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\122\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\26\42\1\123\3\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\17\42\1\124\12\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\125\14\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\14\42\1\126\15\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\130\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\131\10\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\14\42\1\132\15\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\133\17\42\1\134\7\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\135\21\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\136\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\137\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\140\14\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\141\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\3\42\1\142\26\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\7\42\1\143\22\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\144\31\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\17\42\1\145\12\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\146\27\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\147\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\150\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\152\14\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\155\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\156\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\157\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\14\42\1\163\15\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\164\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\165\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\27\42\1\166\2\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\167\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\170\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\171\10\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\172\27\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\173\6\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\17\42\1\174\12\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\175\14\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\176\14\42",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\177\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u0080\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\24\42\1\u0081\5\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u0082\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\u0083\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\14\42\1\u0084\15\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\u0085\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\u0087\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u0088\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\17\42\1\u008a\12\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u008b\7\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\u008c\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u008d\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\3\42\1\u008e\26\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\u008f\27\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u0090\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u0091\25\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\25\42\1\u0092\4\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\u0093\21\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\u0094\10\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u0095\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\u0096\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\u009a\10\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u009b\14\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u009c\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\u009d\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\u009e\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\u009f\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u00a0\14\42",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\u00a2\27\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\u00a4\14\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\5\42\1\u00a5\24\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\2\42\1\u00a6\27\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u00a8\25\42",
            "",
            "\12\42\7\uffff\13\42\1\u00a9\16\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\10\42\1\u00aa\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\3\42\1\u00ac\26\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u00ad\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\u00ae\16\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\25\42\1\u00b0\4\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u00b1\25\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\u00b2\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\13\42\1\u00b4\16\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_VARNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_28 = input.LA(1);

                        s = -1;
                        if ( ((LA13_28>='\u0000' && LA13_28<='\uFFFF')) ) {s = 61;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_27 = input.LA(1);

                        s = -1;
                        if ( ((LA13_27>='\u0000' && LA13_27<='\uFFFF')) ) {s = 61;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='R') ) {s = 1;}

                        else if ( (LA13_0=='a') ) {s = 2;}

                        else if ( (LA13_0=='D') ) {s = 3;}

                        else if ( (LA13_0=='f') ) {s = 4;}

                        else if ( (LA13_0=='t') ) {s = 5;}

                        else if ( (LA13_0=='P') ) {s = 6;}

                        else if ( (LA13_0=='A') ) {s = 7;}

                        else if ( (LA13_0=='i') ) {s = 8;}

                        else if ( (LA13_0==':') ) {s = 9;}

                        else if ( (LA13_0==',') ) {s = 10;}

                        else if ( (LA13_0=='E') ) {s = 11;}

                        else if ( (LA13_0=='F') ) {s = 12;}

                        else if ( (LA13_0=='S') ) {s = 13;}

                        else if ( (LA13_0=='o') ) {s = 14;}

                        else if ( (LA13_0=='C') ) {s = 15;}

                        else if ( (LA13_0=='(') ) {s = 16;}

                        else if ( (LA13_0==')') ) {s = 17;}

                        else if ( (LA13_0=='w') ) {s = 18;}

                        else if ( (LA13_0=='r') ) {s = 19;}

                        else if ( (LA13_0=='s') ) {s = 20;}

                        else if ( (LA13_0=='n') ) {s = 21;}

                        else if ( (LA13_0=='e') ) {s = 22;}

                        else if ( (LA13_0=='p') ) {s = 23;}

                        else if ( (LA13_0=='B'||(LA13_0>='G' && LA13_0<='O')||LA13_0=='Q'||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='d')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='m')||LA13_0=='q'||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 24;}

                        else if ( (LA13_0=='^') ) {s = 25;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 26;}

                        else if ( (LA13_0=='\"') ) {s = 27;}

                        else if ( (LA13_0=='\'') ) {s = 28;}

                        else if ( (LA13_0=='/') ) {s = 29;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 30;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||(LA13_0>=';' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 31;}

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