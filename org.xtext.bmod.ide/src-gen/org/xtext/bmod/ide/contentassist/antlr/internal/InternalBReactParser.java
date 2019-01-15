package org.xtext.bmod.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.bmod.services.BReactGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBReactParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Farthest", "Burning", "Nearest", "Person", "Action", "Global", "Normal", "Shared", "First", "Cell", "Door", "Exit", "Fire", "Find", "From", "Last", "Colon", "Semicolon", "RULE_VARNAME", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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


        public InternalBReactParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBReactParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBReactParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBReactParser.g"; }


    	private BReactGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("Cell", "'Cell'");
    		tokenNameToValue.put("Door", "'Door'");
    		tokenNameToValue.put("Exit", "'Exit'");
    		tokenNameToValue.put("Fire", "'Fire'");
    		tokenNameToValue.put("Find", "'find'");
    		tokenNameToValue.put("From", "'from'");
    		tokenNameToValue.put("Last", "'last'");
    		tokenNameToValue.put("First", "'first'");
    		tokenNameToValue.put("Person", "'Person'");
    		tokenNameToValue.put("Action", "'action'");
    		tokenNameToValue.put("Global", "'global'");
    		tokenNameToValue.put("Normal", "'normal'");
    		tokenNameToValue.put("Shared", "'shared'");
    		tokenNameToValue.put("Burning", "'burning'");
    		tokenNameToValue.put("Nearest", "'nearest'");
    		tokenNameToValue.put("Farthest", "'farthest'");
    	}

    	public void setGrammarAccess(BReactGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleReact"
    // InternalBReactParser.g:73:1: entryRuleReact : ruleReact EOF ;
    public final void entryRuleReact() throws RecognitionException {
        try {
            // InternalBReactParser.g:74:1: ( ruleReact EOF )
            // InternalBReactParser.g:75:1: ruleReact EOF
            {
             before(grammarAccess.getReactRule()); 
            pushFollow(FOLLOW_1);
            ruleReact();

            state._fsp--;

             after(grammarAccess.getReactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReact"


    // $ANTLR start "ruleReact"
    // InternalBReactParser.g:82:1: ruleReact : ( ( rule__React__Group__0 ) ) ;
    public final void ruleReact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:86:2: ( ( ( rule__React__Group__0 ) ) )
            // InternalBReactParser.g:87:2: ( ( rule__React__Group__0 ) )
            {
            // InternalBReactParser.g:87:2: ( ( rule__React__Group__0 ) )
            // InternalBReactParser.g:88:3: ( rule__React__Group__0 )
            {
             before(grammarAccess.getReactAccess().getGroup()); 
            // InternalBReactParser.g:89:3: ( rule__React__Group__0 )
            // InternalBReactParser.g:89:4: rule__React__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__React__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReact"


    // $ANTLR start "entryRuleActionDesc"
    // InternalBReactParser.g:98:1: entryRuleActionDesc : ruleActionDesc EOF ;
    public final void entryRuleActionDesc() throws RecognitionException {
        try {
            // InternalBReactParser.g:99:1: ( ruleActionDesc EOF )
            // InternalBReactParser.g:100:1: ruleActionDesc EOF
            {
             before(grammarAccess.getActionDescRule()); 
            pushFollow(FOLLOW_1);
            ruleActionDesc();

            state._fsp--;

             after(grammarAccess.getActionDescRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionDesc"


    // $ANTLR start "ruleActionDesc"
    // InternalBReactParser.g:107:1: ruleActionDesc : ( ( rule__ActionDesc__Group__0 ) ) ;
    public final void ruleActionDesc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:111:2: ( ( ( rule__ActionDesc__Group__0 ) ) )
            // InternalBReactParser.g:112:2: ( ( rule__ActionDesc__Group__0 ) )
            {
            // InternalBReactParser.g:112:2: ( ( rule__ActionDesc__Group__0 ) )
            // InternalBReactParser.g:113:3: ( rule__ActionDesc__Group__0 )
            {
             before(grammarAccess.getActionDescAccess().getGroup()); 
            // InternalBReactParser.g:114:3: ( rule__ActionDesc__Group__0 )
            // InternalBReactParser.g:114:4: rule__ActionDesc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionDesc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionDescAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionDesc"


    // $ANTLR start "entryRuleFind"
    // InternalBReactParser.g:123:1: entryRuleFind : ruleFind EOF ;
    public final void entryRuleFind() throws RecognitionException {
        try {
            // InternalBReactParser.g:124:1: ( ruleFind EOF )
            // InternalBReactParser.g:125:1: ruleFind EOF
            {
             before(grammarAccess.getFindRule()); 
            pushFollow(FOLLOW_1);
            ruleFind();

            state._fsp--;

             after(grammarAccess.getFindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFind"


    // $ANTLR start "ruleFind"
    // InternalBReactParser.g:132:1: ruleFind : ( ( rule__Find__Group__0 ) ) ;
    public final void ruleFind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:136:2: ( ( ( rule__Find__Group__0 ) ) )
            // InternalBReactParser.g:137:2: ( ( rule__Find__Group__0 ) )
            {
            // InternalBReactParser.g:137:2: ( ( rule__Find__Group__0 ) )
            // InternalBReactParser.g:138:3: ( rule__Find__Group__0 )
            {
             before(grammarAccess.getFindAccess().getGroup()); 
            // InternalBReactParser.g:139:3: ( rule__Find__Group__0 )
            // InternalBReactParser.g:139:4: rule__Find__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Find__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFind"


    // $ANTLR start "ruleDistance"
    // InternalBReactParser.g:148:1: ruleDistance : ( ( rule__Distance__Alternatives ) ) ;
    public final void ruleDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:152:1: ( ( ( rule__Distance__Alternatives ) ) )
            // InternalBReactParser.g:153:2: ( ( rule__Distance__Alternatives ) )
            {
            // InternalBReactParser.g:153:2: ( ( rule__Distance__Alternatives ) )
            // InternalBReactParser.g:154:3: ( rule__Distance__Alternatives )
            {
             before(grammarAccess.getDistanceAccess().getAlternatives()); 
            // InternalBReactParser.g:155:3: ( rule__Distance__Alternatives )
            // InternalBReactParser.g:155:4: rule__Distance__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Distance__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDistanceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistance"


    // $ANTLR start "ruleLocatable"
    // InternalBReactParser.g:164:1: ruleLocatable : ( ( rule__Locatable__Alternatives ) ) ;
    public final void ruleLocatable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:168:1: ( ( ( rule__Locatable__Alternatives ) ) )
            // InternalBReactParser.g:169:2: ( ( rule__Locatable__Alternatives ) )
            {
            // InternalBReactParser.g:169:2: ( ( rule__Locatable__Alternatives ) )
            // InternalBReactParser.g:170:3: ( rule__Locatable__Alternatives )
            {
             before(grammarAccess.getLocatableAccess().getAlternatives()); 
            // InternalBReactParser.g:171:3: ( rule__Locatable__Alternatives )
            // InternalBReactParser.g:171:4: rule__Locatable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Locatable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLocatableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocatable"


    // $ANTLR start "rule__Find__Alternatives_4"
    // InternalBReactParser.g:179:1: rule__Find__Alternatives_4 : ( ( ( rule__Find__BurningAssignment_4_0 ) ) | ( ( rule__Find__NormalAssignment_4_1 ) ) );
    public final void rule__Find__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:183:1: ( ( ( rule__Find__BurningAssignment_4_0 ) ) | ( ( rule__Find__NormalAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Burning) ) {
                alt1=1;
            }
            else if ( (LA1_0==Normal) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBReactParser.g:184:2: ( ( rule__Find__BurningAssignment_4_0 ) )
                    {
                    // InternalBReactParser.g:184:2: ( ( rule__Find__BurningAssignment_4_0 ) )
                    // InternalBReactParser.g:185:3: ( rule__Find__BurningAssignment_4_0 )
                    {
                     before(grammarAccess.getFindAccess().getBurningAssignment_4_0()); 
                    // InternalBReactParser.g:186:3: ( rule__Find__BurningAssignment_4_0 )
                    // InternalBReactParser.g:186:4: rule__Find__BurningAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Find__BurningAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFindAccess().getBurningAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBReactParser.g:190:2: ( ( rule__Find__NormalAssignment_4_1 ) )
                    {
                    // InternalBReactParser.g:190:2: ( ( rule__Find__NormalAssignment_4_1 ) )
                    // InternalBReactParser.g:191:3: ( rule__Find__NormalAssignment_4_1 )
                    {
                     before(grammarAccess.getFindAccess().getNormalAssignment_4_1()); 
                    // InternalBReactParser.g:192:3: ( rule__Find__NormalAssignment_4_1 )
                    // InternalBReactParser.g:192:4: rule__Find__NormalAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Find__NormalAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFindAccess().getNormalAssignment_4_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Alternatives_4"


    // $ANTLR start "rule__Distance__Alternatives"
    // InternalBReactParser.g:200:1: rule__Distance__Alternatives : ( ( ( Nearest ) ) | ( ( Farthest ) ) | ( ( First ) ) | ( ( Last ) ) );
    public final void rule__Distance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:204:1: ( ( ( Nearest ) ) | ( ( Farthest ) ) | ( ( First ) ) | ( ( Last ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case Nearest:
                {
                alt2=1;
                }
                break;
            case Farthest:
                {
                alt2=2;
                }
                break;
            case First:
                {
                alt2=3;
                }
                break;
            case Last:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBReactParser.g:205:2: ( ( Nearest ) )
                    {
                    // InternalBReactParser.g:205:2: ( ( Nearest ) )
                    // InternalBReactParser.g:206:3: ( Nearest )
                    {
                     before(grammarAccess.getDistanceAccess().getNearestEnumLiteralDeclaration_0()); 
                    // InternalBReactParser.g:207:3: ( Nearest )
                    // InternalBReactParser.g:207:4: Nearest
                    {
                    match(input,Nearest,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceAccess().getNearestEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBReactParser.g:211:2: ( ( Farthest ) )
                    {
                    // InternalBReactParser.g:211:2: ( ( Farthest ) )
                    // InternalBReactParser.g:212:3: ( Farthest )
                    {
                     before(grammarAccess.getDistanceAccess().getFarthestEnumLiteralDeclaration_1()); 
                    // InternalBReactParser.g:213:3: ( Farthest )
                    // InternalBReactParser.g:213:4: Farthest
                    {
                    match(input,Farthest,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceAccess().getFarthestEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBReactParser.g:217:2: ( ( First ) )
                    {
                    // InternalBReactParser.g:217:2: ( ( First ) )
                    // InternalBReactParser.g:218:3: ( First )
                    {
                     before(grammarAccess.getDistanceAccess().getFirstEnumLiteralDeclaration_2()); 
                    // InternalBReactParser.g:219:3: ( First )
                    // InternalBReactParser.g:219:4: First
                    {
                    match(input,First,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceAccess().getFirstEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBReactParser.g:223:2: ( ( Last ) )
                    {
                    // InternalBReactParser.g:223:2: ( ( Last ) )
                    // InternalBReactParser.g:224:3: ( Last )
                    {
                     before(grammarAccess.getDistanceAccess().getLastEnumLiteralDeclaration_3()); 
                    // InternalBReactParser.g:225:3: ( Last )
                    // InternalBReactParser.g:225:4: Last
                    {
                    match(input,Last,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceAccess().getLastEnumLiteralDeclaration_3()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Alternatives"


    // $ANTLR start "rule__Locatable__Alternatives"
    // InternalBReactParser.g:233:1: rule__Locatable__Alternatives : ( ( ( Cell ) ) | ( ( Door ) ) | ( ( Exit ) ) | ( ( Fire ) ) | ( ( Person ) ) );
    public final void rule__Locatable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:237:1: ( ( ( Cell ) ) | ( ( Door ) ) | ( ( Exit ) ) | ( ( Fire ) ) | ( ( Person ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case Cell:
                {
                alt3=1;
                }
                break;
            case Door:
                {
                alt3=2;
                }
                break;
            case Exit:
                {
                alt3=3;
                }
                break;
            case Fire:
                {
                alt3=4;
                }
                break;
            case Person:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBReactParser.g:238:2: ( ( Cell ) )
                    {
                    // InternalBReactParser.g:238:2: ( ( Cell ) )
                    // InternalBReactParser.g:239:3: ( Cell )
                    {
                     before(grammarAccess.getLocatableAccess().getCellEnumLiteralDeclaration_0()); 
                    // InternalBReactParser.g:240:3: ( Cell )
                    // InternalBReactParser.g:240:4: Cell
                    {
                    match(input,Cell,FOLLOW_2); 

                    }

                     after(grammarAccess.getLocatableAccess().getCellEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBReactParser.g:244:2: ( ( Door ) )
                    {
                    // InternalBReactParser.g:244:2: ( ( Door ) )
                    // InternalBReactParser.g:245:3: ( Door )
                    {
                     before(grammarAccess.getLocatableAccess().getDoorEnumLiteralDeclaration_1()); 
                    // InternalBReactParser.g:246:3: ( Door )
                    // InternalBReactParser.g:246:4: Door
                    {
                    match(input,Door,FOLLOW_2); 

                    }

                     after(grammarAccess.getLocatableAccess().getDoorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBReactParser.g:250:2: ( ( Exit ) )
                    {
                    // InternalBReactParser.g:250:2: ( ( Exit ) )
                    // InternalBReactParser.g:251:3: ( Exit )
                    {
                     before(grammarAccess.getLocatableAccess().getExitEnumLiteralDeclaration_2()); 
                    // InternalBReactParser.g:252:3: ( Exit )
                    // InternalBReactParser.g:252:4: Exit
                    {
                    match(input,Exit,FOLLOW_2); 

                    }

                     after(grammarAccess.getLocatableAccess().getExitEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBReactParser.g:256:2: ( ( Fire ) )
                    {
                    // InternalBReactParser.g:256:2: ( ( Fire ) )
                    // InternalBReactParser.g:257:3: ( Fire )
                    {
                     before(grammarAccess.getLocatableAccess().getFireEnumLiteralDeclaration_3()); 
                    // InternalBReactParser.g:258:3: ( Fire )
                    // InternalBReactParser.g:258:4: Fire
                    {
                    match(input,Fire,FOLLOW_2); 

                    }

                     after(grammarAccess.getLocatableAccess().getFireEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBReactParser.g:262:2: ( ( Person ) )
                    {
                    // InternalBReactParser.g:262:2: ( ( Person ) )
                    // InternalBReactParser.g:263:3: ( Person )
                    {
                     before(grammarAccess.getLocatableAccess().getPersonEnumLiteralDeclaration_4()); 
                    // InternalBReactParser.g:264:3: ( Person )
                    // InternalBReactParser.g:264:4: Person
                    {
                    match(input,Person,FOLLOW_2); 

                    }

                     after(grammarAccess.getLocatableAccess().getPersonEnumLiteralDeclaration_4()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locatable__Alternatives"


    // $ANTLR start "rule__React__Group__0"
    // InternalBReactParser.g:272:1: rule__React__Group__0 : rule__React__Group__0__Impl rule__React__Group__1 ;
    public final void rule__React__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:276:1: ( rule__React__Group__0__Impl rule__React__Group__1 )
            // InternalBReactParser.g:277:2: rule__React__Group__0__Impl rule__React__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__React__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__React__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__React__Group__0"


    // $ANTLR start "rule__React__Group__0__Impl"
    // InternalBReactParser.g:284:1: rule__React__Group__0__Impl : ( () ) ;
    public final void rule__React__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:288:1: ( ( () ) )
            // InternalBReactParser.g:289:1: ( () )
            {
            // InternalBReactParser.g:289:1: ( () )
            // InternalBReactParser.g:290:2: ()
            {
             before(grammarAccess.getReactAccess().getReactAction_0()); 
            // InternalBReactParser.g:291:2: ()
            // InternalBReactParser.g:291:3: 
            {
            }

             after(grammarAccess.getReactAccess().getReactAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__React__Group__0__Impl"


    // $ANTLR start "rule__React__Group__1"
    // InternalBReactParser.g:299:1: rule__React__Group__1 : rule__React__Group__1__Impl ;
    public final void rule__React__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:303:1: ( rule__React__Group__1__Impl )
            // InternalBReactParser.g:304:2: rule__React__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__React__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__React__Group__1"


    // $ANTLR start "rule__React__Group__1__Impl"
    // InternalBReactParser.g:310:1: rule__React__Group__1__Impl : ( ( rule__React__ActionsAssignment_1 )* ) ;
    public final void rule__React__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:314:1: ( ( ( rule__React__ActionsAssignment_1 )* ) )
            // InternalBReactParser.g:315:1: ( ( rule__React__ActionsAssignment_1 )* )
            {
            // InternalBReactParser.g:315:1: ( ( rule__React__ActionsAssignment_1 )* )
            // InternalBReactParser.g:316:2: ( rule__React__ActionsAssignment_1 )*
            {
             before(grammarAccess.getReactAccess().getActionsAssignment_1()); 
            // InternalBReactParser.g:317:2: ( rule__React__ActionsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Action||LA4_0==Shared) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBReactParser.g:317:3: rule__React__ActionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__React__ActionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getReactAccess().getActionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__React__Group__1__Impl"


    // $ANTLR start "rule__ActionDesc__Group__0"
    // InternalBReactParser.g:326:1: rule__ActionDesc__Group__0 : rule__ActionDesc__Group__0__Impl rule__ActionDesc__Group__1 ;
    public final void rule__ActionDesc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:330:1: ( rule__ActionDesc__Group__0__Impl rule__ActionDesc__Group__1 )
            // InternalBReactParser.g:331:2: rule__ActionDesc__Group__0__Impl rule__ActionDesc__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ActionDesc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDesc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDesc__Group__0"


    // $ANTLR start "rule__ActionDesc__Group__0__Impl"
    // InternalBReactParser.g:338:1: rule__ActionDesc__Group__0__Impl : ( ( rule__ActionDesc__SharedAssignment_0 )? ) ;
    public final void rule__ActionDesc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:342:1: ( ( ( rule__ActionDesc__SharedAssignment_0 )? ) )
            // InternalBReactParser.g:343:1: ( ( rule__ActionDesc__SharedAssignment_0 )? )
            {
            // InternalBReactParser.g:343:1: ( ( rule__ActionDesc__SharedAssignment_0 )? )
            // InternalBReactParser.g:344:2: ( rule__ActionDesc__SharedAssignment_0 )?
            {
             before(grammarAccess.getActionDescAccess().getSharedAssignment_0()); 
            // InternalBReactParser.g:345:2: ( rule__ActionDesc__SharedAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Shared) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBReactParser.g:345:3: rule__ActionDesc__SharedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionDesc__SharedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionDescAccess().getSharedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDesc__Group__0__Impl"


    // $ANTLR start "rule__ActionDesc__Group__1"
    // InternalBReactParser.g:353:1: rule__ActionDesc__Group__1 : rule__ActionDesc__Group__1__Impl rule__ActionDesc__Group__2 ;
    public final void rule__ActionDesc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:357:1: ( rule__ActionDesc__Group__1__Impl rule__ActionDesc__Group__2 )
            // InternalBReactParser.g:358:2: rule__ActionDesc__Group__1__Impl rule__ActionDesc__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ActionDesc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDesc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDesc__Group__1"


    // $ANTLR start "rule__ActionDesc__Group__1__Impl"
    // InternalBReactParser.g:365:1: rule__ActionDesc__Group__1__Impl : ( Action ) ;
    public final void rule__ActionDesc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:369:1: ( ( Action ) )
            // InternalBReactParser.g:370:1: ( Action )
            {
            // InternalBReactParser.g:370:1: ( Action )
            // InternalBReactParser.g:371:2: Action
            {
             before(grammarAccess.getActionDescAccess().getActionKeyword_1()); 
            match(input,Action,FOLLOW_2); 
             after(grammarAccess.getActionDescAccess().getActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDesc__Group__1__Impl"


    // $ANTLR start "rule__ActionDesc__Group__2"
    // InternalBReactParser.g:380:1: rule__ActionDesc__Group__2 : rule__ActionDesc__Group__2__Impl rule__ActionDesc__Group__3 ;
    public final void rule__ActionDesc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:384:1: ( rule__ActionDesc__Group__2__Impl rule__ActionDesc__Group__3 )
            // InternalBReactParser.g:385:2: rule__ActionDesc__Group__2__Impl rule__ActionDesc__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ActionDesc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDesc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDesc__Group__2"


    // $ANTLR start "rule__ActionDesc__Group__2__Impl"
    // InternalBReactParser.g:392:1: rule__ActionDesc__Group__2__Impl : ( ( rule__ActionDesc__NameAssignment_2 ) ) ;
    public final void rule__ActionDesc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:396:1: ( ( ( rule__ActionDesc__NameAssignment_2 ) ) )
            // InternalBReactParser.g:397:1: ( ( rule__ActionDesc__NameAssignment_2 ) )
            {
            // InternalBReactParser.g:397:1: ( ( rule__ActionDesc__NameAssignment_2 ) )
            // InternalBReactParser.g:398:2: ( rule__ActionDesc__NameAssignment_2 )
            {
             before(grammarAccess.getActionDescAccess().getNameAssignment_2()); 
            // InternalBReactParser.g:399:2: ( rule__ActionDesc__NameAssignment_2 )
            // InternalBReactParser.g:399:3: rule__ActionDesc__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ActionDesc__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionDescAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDesc__Group__2__Impl"


    // $ANTLR start "rule__ActionDesc__Group__3"
    // InternalBReactParser.g:407:1: rule__ActionDesc__Group__3 : rule__ActionDesc__Group__3__Impl rule__ActionDesc__Group__4 ;
    public final void rule__ActionDesc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:411:1: ( rule__ActionDesc__Group__3__Impl rule__ActionDesc__Group__4 )
            // InternalBReactParser.g:412:2: rule__ActionDesc__Group__3__Impl rule__ActionDesc__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ActionDesc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDesc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDesc__Group__3"


    // $ANTLR start "rule__ActionDesc__Group__3__Impl"
    // InternalBReactParser.g:419:1: rule__ActionDesc__Group__3__Impl : ( Colon ) ;
    public final void rule__ActionDesc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:423:1: ( ( Colon ) )
            // InternalBReactParser.g:424:1: ( Colon )
            {
            // InternalBReactParser.g:424:1: ( Colon )
            // InternalBReactParser.g:425:2: Colon
            {
             before(grammarAccess.getActionDescAccess().getColonKeyword_3()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getActionDescAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDesc__Group__3__Impl"


    // $ANTLR start "rule__ActionDesc__Group__4"
    // InternalBReactParser.g:434:1: rule__ActionDesc__Group__4 : rule__ActionDesc__Group__4__Impl ;
    public final void rule__ActionDesc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:438:1: ( rule__ActionDesc__Group__4__Impl )
            // InternalBReactParser.g:439:2: rule__ActionDesc__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionDesc__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDesc__Group__4"


    // $ANTLR start "rule__ActionDesc__Group__4__Impl"
    // InternalBReactParser.g:445:1: rule__ActionDesc__Group__4__Impl : ( ( ( rule__ActionDesc__FindsAssignment_4 ) ) ( ( rule__ActionDesc__FindsAssignment_4 )* ) ) ;
    public final void rule__ActionDesc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:449:1: ( ( ( ( rule__ActionDesc__FindsAssignment_4 ) ) ( ( rule__ActionDesc__FindsAssignment_4 )* ) ) )
            // InternalBReactParser.g:450:1: ( ( ( rule__ActionDesc__FindsAssignment_4 ) ) ( ( rule__ActionDesc__FindsAssignment_4 )* ) )
            {
            // InternalBReactParser.g:450:1: ( ( ( rule__ActionDesc__FindsAssignment_4 ) ) ( ( rule__ActionDesc__FindsAssignment_4 )* ) )
            // InternalBReactParser.g:451:2: ( ( rule__ActionDesc__FindsAssignment_4 ) ) ( ( rule__ActionDesc__FindsAssignment_4 )* )
            {
            // InternalBReactParser.g:451:2: ( ( rule__ActionDesc__FindsAssignment_4 ) )
            // InternalBReactParser.g:452:3: ( rule__ActionDesc__FindsAssignment_4 )
            {
             before(grammarAccess.getActionDescAccess().getFindsAssignment_4()); 
            // InternalBReactParser.g:453:3: ( rule__ActionDesc__FindsAssignment_4 )
            // InternalBReactParser.g:453:4: rule__ActionDesc__FindsAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__ActionDesc__FindsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActionDescAccess().getFindsAssignment_4()); 

            }

            // InternalBReactParser.g:456:2: ( ( rule__ActionDesc__FindsAssignment_4 )* )
            // InternalBReactParser.g:457:3: ( rule__ActionDesc__FindsAssignment_4 )*
            {
             before(grammarAccess.getActionDescAccess().getFindsAssignment_4()); 
            // InternalBReactParser.g:458:3: ( rule__ActionDesc__FindsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Global||LA6_0==Find) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBReactParser.g:458:4: rule__ActionDesc__FindsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ActionDesc__FindsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getActionDescAccess().getFindsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDesc__Group__4__Impl"


    // $ANTLR start "rule__Find__Group__0"
    // InternalBReactParser.g:468:1: rule__Find__Group__0 : rule__Find__Group__0__Impl rule__Find__Group__1 ;
    public final void rule__Find__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:472:1: ( rule__Find__Group__0__Impl rule__Find__Group__1 )
            // InternalBReactParser.g:473:2: rule__Find__Group__0__Impl rule__Find__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Find__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Find__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__0"


    // $ANTLR start "rule__Find__Group__0__Impl"
    // InternalBReactParser.g:480:1: rule__Find__Group__0__Impl : ( ( rule__Find__GlobalAssignment_0 )? ) ;
    public final void rule__Find__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:484:1: ( ( ( rule__Find__GlobalAssignment_0 )? ) )
            // InternalBReactParser.g:485:1: ( ( rule__Find__GlobalAssignment_0 )? )
            {
            // InternalBReactParser.g:485:1: ( ( rule__Find__GlobalAssignment_0 )? )
            // InternalBReactParser.g:486:2: ( rule__Find__GlobalAssignment_0 )?
            {
             before(grammarAccess.getFindAccess().getGlobalAssignment_0()); 
            // InternalBReactParser.g:487:2: ( rule__Find__GlobalAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Global) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBReactParser.g:487:3: rule__Find__GlobalAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Find__GlobalAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFindAccess().getGlobalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__0__Impl"


    // $ANTLR start "rule__Find__Group__1"
    // InternalBReactParser.g:495:1: rule__Find__Group__1 : rule__Find__Group__1__Impl rule__Find__Group__2 ;
    public final void rule__Find__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:499:1: ( rule__Find__Group__1__Impl rule__Find__Group__2 )
            // InternalBReactParser.g:500:2: rule__Find__Group__1__Impl rule__Find__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Find__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Find__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__1"


    // $ANTLR start "rule__Find__Group__1__Impl"
    // InternalBReactParser.g:507:1: rule__Find__Group__1__Impl : ( Find ) ;
    public final void rule__Find__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:511:1: ( ( Find ) )
            // InternalBReactParser.g:512:1: ( Find )
            {
            // InternalBReactParser.g:512:1: ( Find )
            // InternalBReactParser.g:513:2: Find
            {
             before(grammarAccess.getFindAccess().getFindKeyword_1()); 
            match(input,Find,FOLLOW_2); 
             after(grammarAccess.getFindAccess().getFindKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__1__Impl"


    // $ANTLR start "rule__Find__Group__2"
    // InternalBReactParser.g:522:1: rule__Find__Group__2 : rule__Find__Group__2__Impl rule__Find__Group__3 ;
    public final void rule__Find__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:526:1: ( rule__Find__Group__2__Impl rule__Find__Group__3 )
            // InternalBReactParser.g:527:2: rule__Find__Group__2__Impl rule__Find__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Find__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Find__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__2"


    // $ANTLR start "rule__Find__Group__2__Impl"
    // InternalBReactParser.g:534:1: rule__Find__Group__2__Impl : ( ( rule__Find__DistanceAssignment_2 ) ) ;
    public final void rule__Find__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:538:1: ( ( ( rule__Find__DistanceAssignment_2 ) ) )
            // InternalBReactParser.g:539:1: ( ( rule__Find__DistanceAssignment_2 ) )
            {
            // InternalBReactParser.g:539:1: ( ( rule__Find__DistanceAssignment_2 ) )
            // InternalBReactParser.g:540:2: ( rule__Find__DistanceAssignment_2 )
            {
             before(grammarAccess.getFindAccess().getDistanceAssignment_2()); 
            // InternalBReactParser.g:541:2: ( rule__Find__DistanceAssignment_2 )
            // InternalBReactParser.g:541:3: rule__Find__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Find__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFindAccess().getDistanceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__2__Impl"


    // $ANTLR start "rule__Find__Group__3"
    // InternalBReactParser.g:549:1: rule__Find__Group__3 : rule__Find__Group__3__Impl rule__Find__Group__4 ;
    public final void rule__Find__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:553:1: ( rule__Find__Group__3__Impl rule__Find__Group__4 )
            // InternalBReactParser.g:554:2: rule__Find__Group__3__Impl rule__Find__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Find__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Find__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__3"


    // $ANTLR start "rule__Find__Group__3__Impl"
    // InternalBReactParser.g:561:1: rule__Find__Group__3__Impl : ( ( rule__Find__FromAssignment_3 )? ) ;
    public final void rule__Find__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:565:1: ( ( ( rule__Find__FromAssignment_3 )? ) )
            // InternalBReactParser.g:566:1: ( ( rule__Find__FromAssignment_3 )? )
            {
            // InternalBReactParser.g:566:1: ( ( rule__Find__FromAssignment_3 )? )
            // InternalBReactParser.g:567:2: ( rule__Find__FromAssignment_3 )?
            {
             before(grammarAccess.getFindAccess().getFromAssignment_3()); 
            // InternalBReactParser.g:568:2: ( rule__Find__FromAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==From) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBReactParser.g:568:3: rule__Find__FromAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Find__FromAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFindAccess().getFromAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__3__Impl"


    // $ANTLR start "rule__Find__Group__4"
    // InternalBReactParser.g:576:1: rule__Find__Group__4 : rule__Find__Group__4__Impl rule__Find__Group__5 ;
    public final void rule__Find__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:580:1: ( rule__Find__Group__4__Impl rule__Find__Group__5 )
            // InternalBReactParser.g:581:2: rule__Find__Group__4__Impl rule__Find__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Find__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Find__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__4"


    // $ANTLR start "rule__Find__Group__4__Impl"
    // InternalBReactParser.g:588:1: rule__Find__Group__4__Impl : ( ( rule__Find__Alternatives_4 )? ) ;
    public final void rule__Find__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:592:1: ( ( ( rule__Find__Alternatives_4 )? ) )
            // InternalBReactParser.g:593:1: ( ( rule__Find__Alternatives_4 )? )
            {
            // InternalBReactParser.g:593:1: ( ( rule__Find__Alternatives_4 )? )
            // InternalBReactParser.g:594:2: ( rule__Find__Alternatives_4 )?
            {
             before(grammarAccess.getFindAccess().getAlternatives_4()); 
            // InternalBReactParser.g:595:2: ( rule__Find__Alternatives_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Burning||LA9_0==Normal) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBReactParser.g:595:3: rule__Find__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Find__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFindAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__4__Impl"


    // $ANTLR start "rule__Find__Group__5"
    // InternalBReactParser.g:603:1: rule__Find__Group__5 : rule__Find__Group__5__Impl rule__Find__Group__6 ;
    public final void rule__Find__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:607:1: ( rule__Find__Group__5__Impl rule__Find__Group__6 )
            // InternalBReactParser.g:608:2: rule__Find__Group__5__Impl rule__Find__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Find__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Find__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__5"


    // $ANTLR start "rule__Find__Group__5__Impl"
    // InternalBReactParser.g:615:1: rule__Find__Group__5__Impl : ( ( rule__Find__LocatableAssignment_5 ) ) ;
    public final void rule__Find__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:619:1: ( ( ( rule__Find__LocatableAssignment_5 ) ) )
            // InternalBReactParser.g:620:1: ( ( rule__Find__LocatableAssignment_5 ) )
            {
            // InternalBReactParser.g:620:1: ( ( rule__Find__LocatableAssignment_5 ) )
            // InternalBReactParser.g:621:2: ( rule__Find__LocatableAssignment_5 )
            {
             before(grammarAccess.getFindAccess().getLocatableAssignment_5()); 
            // InternalBReactParser.g:622:2: ( rule__Find__LocatableAssignment_5 )
            // InternalBReactParser.g:622:3: rule__Find__LocatableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Find__LocatableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFindAccess().getLocatableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__5__Impl"


    // $ANTLR start "rule__Find__Group__6"
    // InternalBReactParser.g:630:1: rule__Find__Group__6 : rule__Find__Group__6__Impl ;
    public final void rule__Find__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:634:1: ( rule__Find__Group__6__Impl )
            // InternalBReactParser.g:635:2: rule__Find__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Find__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__6"


    // $ANTLR start "rule__Find__Group__6__Impl"
    // InternalBReactParser.g:641:1: rule__Find__Group__6__Impl : ( Semicolon ) ;
    public final void rule__Find__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:645:1: ( ( Semicolon ) )
            // InternalBReactParser.g:646:1: ( Semicolon )
            {
            // InternalBReactParser.g:646:1: ( Semicolon )
            // InternalBReactParser.g:647:2: Semicolon
            {
             before(grammarAccess.getFindAccess().getSemicolonKeyword_6()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getFindAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__6__Impl"


    // $ANTLR start "rule__React__ActionsAssignment_1"
    // InternalBReactParser.g:657:1: rule__React__ActionsAssignment_1 : ( ruleActionDesc ) ;
    public final void rule__React__ActionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:661:1: ( ( ruleActionDesc ) )
            // InternalBReactParser.g:662:2: ( ruleActionDesc )
            {
            // InternalBReactParser.g:662:2: ( ruleActionDesc )
            // InternalBReactParser.g:663:3: ruleActionDesc
            {
             before(grammarAccess.getReactAccess().getActionsActionDescParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActionDesc();

            state._fsp--;

             after(grammarAccess.getReactAccess().getActionsActionDescParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__React__ActionsAssignment_1"


    // $ANTLR start "rule__ActionDesc__SharedAssignment_0"
    // InternalBReactParser.g:672:1: rule__ActionDesc__SharedAssignment_0 : ( ( Shared ) ) ;
    public final void rule__ActionDesc__SharedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:676:1: ( ( ( Shared ) ) )
            // InternalBReactParser.g:677:2: ( ( Shared ) )
            {
            // InternalBReactParser.g:677:2: ( ( Shared ) )
            // InternalBReactParser.g:678:3: ( Shared )
            {
             before(grammarAccess.getActionDescAccess().getSharedSharedKeyword_0_0()); 
            // InternalBReactParser.g:679:3: ( Shared )
            // InternalBReactParser.g:680:4: Shared
            {
             before(grammarAccess.getActionDescAccess().getSharedSharedKeyword_0_0()); 
            match(input,Shared,FOLLOW_2); 
             after(grammarAccess.getActionDescAccess().getSharedSharedKeyword_0_0()); 

            }

             after(grammarAccess.getActionDescAccess().getSharedSharedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDesc__SharedAssignment_0"


    // $ANTLR start "rule__ActionDesc__NameAssignment_2"
    // InternalBReactParser.g:691:1: rule__ActionDesc__NameAssignment_2 : ( RULE_VARNAME ) ;
    public final void rule__ActionDesc__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:695:1: ( ( RULE_VARNAME ) )
            // InternalBReactParser.g:696:2: ( RULE_VARNAME )
            {
            // InternalBReactParser.g:696:2: ( RULE_VARNAME )
            // InternalBReactParser.g:697:3: RULE_VARNAME
            {
             before(grammarAccess.getActionDescAccess().getNameVARNAMETerminalRuleCall_2_0()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getActionDescAccess().getNameVARNAMETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDesc__NameAssignment_2"


    // $ANTLR start "rule__ActionDesc__FindsAssignment_4"
    // InternalBReactParser.g:706:1: rule__ActionDesc__FindsAssignment_4 : ( ruleFind ) ;
    public final void rule__ActionDesc__FindsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:710:1: ( ( ruleFind ) )
            // InternalBReactParser.g:711:2: ( ruleFind )
            {
            // InternalBReactParser.g:711:2: ( ruleFind )
            // InternalBReactParser.g:712:3: ruleFind
            {
             before(grammarAccess.getActionDescAccess().getFindsFindParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFind();

            state._fsp--;

             after(grammarAccess.getActionDescAccess().getFindsFindParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionDesc__FindsAssignment_4"


    // $ANTLR start "rule__Find__GlobalAssignment_0"
    // InternalBReactParser.g:721:1: rule__Find__GlobalAssignment_0 : ( ( Global ) ) ;
    public final void rule__Find__GlobalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:725:1: ( ( ( Global ) ) )
            // InternalBReactParser.g:726:2: ( ( Global ) )
            {
            // InternalBReactParser.g:726:2: ( ( Global ) )
            // InternalBReactParser.g:727:3: ( Global )
            {
             before(grammarAccess.getFindAccess().getGlobalGlobalKeyword_0_0()); 
            // InternalBReactParser.g:728:3: ( Global )
            // InternalBReactParser.g:729:4: Global
            {
             before(grammarAccess.getFindAccess().getGlobalGlobalKeyword_0_0()); 
            match(input,Global,FOLLOW_2); 
             after(grammarAccess.getFindAccess().getGlobalGlobalKeyword_0_0()); 

            }

             after(grammarAccess.getFindAccess().getGlobalGlobalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__GlobalAssignment_0"


    // $ANTLR start "rule__Find__DistanceAssignment_2"
    // InternalBReactParser.g:740:1: rule__Find__DistanceAssignment_2 : ( ruleDistance ) ;
    public final void rule__Find__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:744:1: ( ( ruleDistance ) )
            // InternalBReactParser.g:745:2: ( ruleDistance )
            {
            // InternalBReactParser.g:745:2: ( ruleDistance )
            // InternalBReactParser.g:746:3: ruleDistance
            {
             before(grammarAccess.getFindAccess().getDistanceDistanceEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDistance();

            state._fsp--;

             after(grammarAccess.getFindAccess().getDistanceDistanceEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__DistanceAssignment_2"


    // $ANTLR start "rule__Find__FromAssignment_3"
    // InternalBReactParser.g:755:1: rule__Find__FromAssignment_3 : ( ( From ) ) ;
    public final void rule__Find__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:759:1: ( ( ( From ) ) )
            // InternalBReactParser.g:760:2: ( ( From ) )
            {
            // InternalBReactParser.g:760:2: ( ( From ) )
            // InternalBReactParser.g:761:3: ( From )
            {
             before(grammarAccess.getFindAccess().getFromFromKeyword_3_0()); 
            // InternalBReactParser.g:762:3: ( From )
            // InternalBReactParser.g:763:4: From
            {
             before(grammarAccess.getFindAccess().getFromFromKeyword_3_0()); 
            match(input,From,FOLLOW_2); 
             after(grammarAccess.getFindAccess().getFromFromKeyword_3_0()); 

            }

             after(grammarAccess.getFindAccess().getFromFromKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__FromAssignment_3"


    // $ANTLR start "rule__Find__BurningAssignment_4_0"
    // InternalBReactParser.g:774:1: rule__Find__BurningAssignment_4_0 : ( ( Burning ) ) ;
    public final void rule__Find__BurningAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:778:1: ( ( ( Burning ) ) )
            // InternalBReactParser.g:779:2: ( ( Burning ) )
            {
            // InternalBReactParser.g:779:2: ( ( Burning ) )
            // InternalBReactParser.g:780:3: ( Burning )
            {
             before(grammarAccess.getFindAccess().getBurningBurningKeyword_4_0_0()); 
            // InternalBReactParser.g:781:3: ( Burning )
            // InternalBReactParser.g:782:4: Burning
            {
             before(grammarAccess.getFindAccess().getBurningBurningKeyword_4_0_0()); 
            match(input,Burning,FOLLOW_2); 
             after(grammarAccess.getFindAccess().getBurningBurningKeyword_4_0_0()); 

            }

             after(grammarAccess.getFindAccess().getBurningBurningKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__BurningAssignment_4_0"


    // $ANTLR start "rule__Find__NormalAssignment_4_1"
    // InternalBReactParser.g:793:1: rule__Find__NormalAssignment_4_1 : ( ( Normal ) ) ;
    public final void rule__Find__NormalAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:797:1: ( ( ( Normal ) ) )
            // InternalBReactParser.g:798:2: ( ( Normal ) )
            {
            // InternalBReactParser.g:798:2: ( ( Normal ) )
            // InternalBReactParser.g:799:3: ( Normal )
            {
             before(grammarAccess.getFindAccess().getNormalNormalKeyword_4_1_0()); 
            // InternalBReactParser.g:800:3: ( Normal )
            // InternalBReactParser.g:801:4: Normal
            {
             before(grammarAccess.getFindAccess().getNormalNormalKeyword_4_1_0()); 
            match(input,Normal,FOLLOW_2); 
             after(grammarAccess.getFindAccess().getNormalNormalKeyword_4_1_0()); 

            }

             after(grammarAccess.getFindAccess().getNormalNormalKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__NormalAssignment_4_1"


    // $ANTLR start "rule__Find__LocatableAssignment_5"
    // InternalBReactParser.g:812:1: rule__Find__LocatableAssignment_5 : ( ruleLocatable ) ;
    public final void rule__Find__LocatableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBReactParser.g:816:1: ( ( ruleLocatable ) )
            // InternalBReactParser.g:817:2: ( ruleLocatable )
            {
            // InternalBReactParser.g:817:2: ( ruleLocatable )
            // InternalBReactParser.g:818:3: ruleLocatable
            {
             before(grammarAccess.getFindAccess().getLocatableLocatableEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLocatable();

            state._fsp--;

             after(grammarAccess.getFindAccess().getLocatableLocatableEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__LocatableAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020202L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000081050L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000005E4A0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});

}