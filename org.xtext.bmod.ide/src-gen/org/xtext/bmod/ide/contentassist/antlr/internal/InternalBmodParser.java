package org.xtext.bmod.ide.contentassist.antlr.internal;

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
import org.xtext.bmod.services.BmodGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBmodParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARNAME", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Room'", "'named'", "'Door'", "'from'", "'to'", "'Profile'", "'Level'", "'Person'", "'in'", "':'", "','", "'('", "')'", "'without'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_VARNAME=4;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBmodParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBmodParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBmodParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBmod.g"; }


    	private BmodGrammarAccess grammarAccess;

    	public void setGrammarAccess(BmodGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalBmod.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalBmod.g:54:1: ( ruleModel EOF )
            // InternalBmod.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBmod.g:62:1: ruleModel : ( ruleFloorplan ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:66:2: ( ( ruleFloorplan ) )
            // InternalBmod.g:67:2: ( ruleFloorplan )
            {
            // InternalBmod.g:67:2: ( ruleFloorplan )
            // InternalBmod.g:68:3: ruleFloorplan
            {
             before(grammarAccess.getModelAccess().getFloorplanParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleFloorplan();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFloorplanParserRuleCall()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFloorplan"
    // InternalBmod.g:78:1: entryRuleFloorplan : ruleFloorplan EOF ;
    public final void entryRuleFloorplan() throws RecognitionException {
        try {
            // InternalBmod.g:79:1: ( ruleFloorplan EOF )
            // InternalBmod.g:80:1: ruleFloorplan EOF
            {
             before(grammarAccess.getFloorplanRule()); 
            pushFollow(FOLLOW_1);
            ruleFloorplan();

            state._fsp--;

             after(grammarAccess.getFloorplanRule()); 
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
    // $ANTLR end "entryRuleFloorplan"


    // $ANTLR start "ruleFloorplan"
    // InternalBmod.g:87:1: ruleFloorplan : ( ( rule__Floorplan__Group__0 ) ) ;
    public final void ruleFloorplan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:91:2: ( ( ( rule__Floorplan__Group__0 ) ) )
            // InternalBmod.g:92:2: ( ( rule__Floorplan__Group__0 ) )
            {
            // InternalBmod.g:92:2: ( ( rule__Floorplan__Group__0 ) )
            // InternalBmod.g:93:3: ( rule__Floorplan__Group__0 )
            {
             before(grammarAccess.getFloorplanAccess().getGroup()); 
            // InternalBmod.g:94:3: ( rule__Floorplan__Group__0 )
            // InternalBmod.g:94:4: rule__Floorplan__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Floorplan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloorplanAccess().getGroup()); 

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
    // $ANTLR end "ruleFloorplan"


    // $ANTLR start "entryRuleRoom"
    // InternalBmod.g:103:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalBmod.g:104:1: ( ruleRoom EOF )
            // InternalBmod.g:105:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalBmod.g:112:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:116:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalBmod.g:117:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalBmod.g:117:2: ( ( rule__Room__Group__0 ) )
            // InternalBmod.g:118:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalBmod.g:119:3: ( rule__Room__Group__0 )
            // InternalBmod.g:119:4: rule__Room__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleDoor"
    // InternalBmod.g:128:1: entryRuleDoor : ruleDoor EOF ;
    public final void entryRuleDoor() throws RecognitionException {
        try {
            // InternalBmod.g:129:1: ( ruleDoor EOF )
            // InternalBmod.g:130:1: ruleDoor EOF
            {
             before(grammarAccess.getDoorRule()); 
            pushFollow(FOLLOW_1);
            ruleDoor();

            state._fsp--;

             after(grammarAccess.getDoorRule()); 
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
    // $ANTLR end "entryRuleDoor"


    // $ANTLR start "ruleDoor"
    // InternalBmod.g:137:1: ruleDoor : ( ( rule__Door__Group__0 ) ) ;
    public final void ruleDoor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:141:2: ( ( ( rule__Door__Group__0 ) ) )
            // InternalBmod.g:142:2: ( ( rule__Door__Group__0 ) )
            {
            // InternalBmod.g:142:2: ( ( rule__Door__Group__0 ) )
            // InternalBmod.g:143:3: ( rule__Door__Group__0 )
            {
             before(grammarAccess.getDoorAccess().getGroup()); 
            // InternalBmod.g:144:3: ( rule__Door__Group__0 )
            // InternalBmod.g:144:4: rule__Door__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Door__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoorAccess().getGroup()); 

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
    // $ANTLR end "ruleDoor"


    // $ANTLR start "entryRuleProfile"
    // InternalBmod.g:153:1: entryRuleProfile : ruleProfile EOF ;
    public final void entryRuleProfile() throws RecognitionException {
        try {
            // InternalBmod.g:154:1: ( ruleProfile EOF )
            // InternalBmod.g:155:1: ruleProfile EOF
            {
             before(grammarAccess.getProfileRule()); 
            pushFollow(FOLLOW_1);
            ruleProfile();

            state._fsp--;

             after(grammarAccess.getProfileRule()); 
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
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalBmod.g:162:1: ruleProfile : ( ( rule__Profile__Group__0 ) ) ;
    public final void ruleProfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:166:2: ( ( ( rule__Profile__Group__0 ) ) )
            // InternalBmod.g:167:2: ( ( rule__Profile__Group__0 ) )
            {
            // InternalBmod.g:167:2: ( ( rule__Profile__Group__0 ) )
            // InternalBmod.g:168:3: ( rule__Profile__Group__0 )
            {
             before(grammarAccess.getProfileAccess().getGroup()); 
            // InternalBmod.g:169:3: ( rule__Profile__Group__0 )
            // InternalBmod.g:169:4: rule__Profile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getGroup()); 

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
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleLevel"
    // InternalBmod.g:178:1: entryRuleLevel : ruleLevel EOF ;
    public final void entryRuleLevel() throws RecognitionException {
        try {
            // InternalBmod.g:179:1: ( ruleLevel EOF )
            // InternalBmod.g:180:1: ruleLevel EOF
            {
             before(grammarAccess.getLevelRule()); 
            pushFollow(FOLLOW_1);
            ruleLevel();

            state._fsp--;

             after(grammarAccess.getLevelRule()); 
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
    // $ANTLR end "entryRuleLevel"


    // $ANTLR start "ruleLevel"
    // InternalBmod.g:187:1: ruleLevel : ( ( rule__Level__Group__0 ) ) ;
    public final void ruleLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:191:2: ( ( ( rule__Level__Group__0 ) ) )
            // InternalBmod.g:192:2: ( ( rule__Level__Group__0 ) )
            {
            // InternalBmod.g:192:2: ( ( rule__Level__Group__0 ) )
            // InternalBmod.g:193:3: ( rule__Level__Group__0 )
            {
             before(grammarAccess.getLevelAccess().getGroup()); 
            // InternalBmod.g:194:3: ( rule__Level__Group__0 )
            // InternalBmod.g:194:4: rule__Level__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Level__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getGroup()); 

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
    // $ANTLR end "ruleLevel"


    // $ANTLR start "entryRulePerson"
    // InternalBmod.g:203:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalBmod.g:204:1: ( rulePerson EOF )
            // InternalBmod.g:205:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalBmod.g:212:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:216:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalBmod.g:217:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalBmod.g:217:2: ( ( rule__Person__Group__0 ) )
            // InternalBmod.g:218:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalBmod.g:219:3: ( rule__Person__Group__0 )
            // InternalBmod.g:219:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleCoordinate"
    // InternalBmod.g:228:1: entryRuleCoordinate : ruleCoordinate EOF ;
    public final void entryRuleCoordinate() throws RecognitionException {
        try {
            // InternalBmod.g:229:1: ( ruleCoordinate EOF )
            // InternalBmod.g:230:1: ruleCoordinate EOF
            {
             before(grammarAccess.getCoordinateRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getCoordinateRule()); 
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
    // $ANTLR end "entryRuleCoordinate"


    // $ANTLR start "ruleCoordinate"
    // InternalBmod.g:237:1: ruleCoordinate : ( ( rule__Coordinate__Group__0 ) ) ;
    public final void ruleCoordinate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:241:2: ( ( ( rule__Coordinate__Group__0 ) ) )
            // InternalBmod.g:242:2: ( ( rule__Coordinate__Group__0 ) )
            {
            // InternalBmod.g:242:2: ( ( rule__Coordinate__Group__0 ) )
            // InternalBmod.g:243:3: ( rule__Coordinate__Group__0 )
            {
             before(grammarAccess.getCoordinateAccess().getGroup()); 
            // InternalBmod.g:244:3: ( rule__Coordinate__Group__0 )
            // InternalBmod.g:244:4: rule__Coordinate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateAccess().getGroup()); 

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
    // $ANTLR end "ruleCoordinate"


    // $ANTLR start "entryRuleArea"
    // InternalBmod.g:253:1: entryRuleArea : ruleArea EOF ;
    public final void entryRuleArea() throws RecognitionException {
        try {
            // InternalBmod.g:254:1: ( ruleArea EOF )
            // InternalBmod.g:255:1: ruleArea EOF
            {
             before(grammarAccess.getAreaRule()); 
            pushFollow(FOLLOW_1);
            ruleArea();

            state._fsp--;

             after(grammarAccess.getAreaRule()); 
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
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalBmod.g:262:1: ruleArea : ( ( rule__Area__Group__0 ) ) ;
    public final void ruleArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:266:2: ( ( ( rule__Area__Group__0 ) ) )
            // InternalBmod.g:267:2: ( ( rule__Area__Group__0 ) )
            {
            // InternalBmod.g:267:2: ( ( rule__Area__Group__0 ) )
            // InternalBmod.g:268:3: ( rule__Area__Group__0 )
            {
             before(grammarAccess.getAreaAccess().getGroup()); 
            // InternalBmod.g:269:3: ( rule__Area__Group__0 )
            // InternalBmod.g:269:4: rule__Area__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getGroup()); 

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
    // $ANTLR end "ruleArea"


    // $ANTLR start "rule__Floorplan__Alternatives_1"
    // InternalBmod.g:277:1: rule__Floorplan__Alternatives_1 : ( ( ( rule__Floorplan__RoomsAssignment_1_0 ) ) | ( ( rule__Floorplan__DoorsAssignment_1_1 ) ) | ( ( rule__Floorplan__PersonsAssignment_1_2 ) ) | ( ( rule__Floorplan__ProfilesAssignment_1_3 ) ) | ( ( rule__Floorplan__LevelsAssignment_1_4 ) ) );
    public final void rule__Floorplan__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:281:1: ( ( ( rule__Floorplan__RoomsAssignment_1_0 ) ) | ( ( rule__Floorplan__DoorsAssignment_1_1 ) ) | ( ( rule__Floorplan__PersonsAssignment_1_2 ) ) | ( ( rule__Floorplan__ProfilesAssignment_1_3 ) ) | ( ( rule__Floorplan__LevelsAssignment_1_4 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
                }
                break;
            case 18:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBmod.g:282:2: ( ( rule__Floorplan__RoomsAssignment_1_0 ) )
                    {
                    // InternalBmod.g:282:2: ( ( rule__Floorplan__RoomsAssignment_1_0 ) )
                    // InternalBmod.g:283:3: ( rule__Floorplan__RoomsAssignment_1_0 )
                    {
                     before(grammarAccess.getFloorplanAccess().getRoomsAssignment_1_0()); 
                    // InternalBmod.g:284:3: ( rule__Floorplan__RoomsAssignment_1_0 )
                    // InternalBmod.g:284:4: rule__Floorplan__RoomsAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__RoomsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getRoomsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:288:2: ( ( rule__Floorplan__DoorsAssignment_1_1 ) )
                    {
                    // InternalBmod.g:288:2: ( ( rule__Floorplan__DoorsAssignment_1_1 ) )
                    // InternalBmod.g:289:3: ( rule__Floorplan__DoorsAssignment_1_1 )
                    {
                     before(grammarAccess.getFloorplanAccess().getDoorsAssignment_1_1()); 
                    // InternalBmod.g:290:3: ( rule__Floorplan__DoorsAssignment_1_1 )
                    // InternalBmod.g:290:4: rule__Floorplan__DoorsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__DoorsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getDoorsAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:294:2: ( ( rule__Floorplan__PersonsAssignment_1_2 ) )
                    {
                    // InternalBmod.g:294:2: ( ( rule__Floorplan__PersonsAssignment_1_2 ) )
                    // InternalBmod.g:295:3: ( rule__Floorplan__PersonsAssignment_1_2 )
                    {
                     before(grammarAccess.getFloorplanAccess().getPersonsAssignment_1_2()); 
                    // InternalBmod.g:296:3: ( rule__Floorplan__PersonsAssignment_1_2 )
                    // InternalBmod.g:296:4: rule__Floorplan__PersonsAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__PersonsAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getPersonsAssignment_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBmod.g:300:2: ( ( rule__Floorplan__ProfilesAssignment_1_3 ) )
                    {
                    // InternalBmod.g:300:2: ( ( rule__Floorplan__ProfilesAssignment_1_3 ) )
                    // InternalBmod.g:301:3: ( rule__Floorplan__ProfilesAssignment_1_3 )
                    {
                     before(grammarAccess.getFloorplanAccess().getProfilesAssignment_1_3()); 
                    // InternalBmod.g:302:3: ( rule__Floorplan__ProfilesAssignment_1_3 )
                    // InternalBmod.g:302:4: rule__Floorplan__ProfilesAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__ProfilesAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getProfilesAssignment_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBmod.g:306:2: ( ( rule__Floorplan__LevelsAssignment_1_4 ) )
                    {
                    // InternalBmod.g:306:2: ( ( rule__Floorplan__LevelsAssignment_1_4 ) )
                    // InternalBmod.g:307:3: ( rule__Floorplan__LevelsAssignment_1_4 )
                    {
                     before(grammarAccess.getFloorplanAccess().getLevelsAssignment_1_4()); 
                    // InternalBmod.g:308:3: ( rule__Floorplan__LevelsAssignment_1_4 )
                    // InternalBmod.g:308:4: rule__Floorplan__LevelsAssignment_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__LevelsAssignment_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getLevelsAssignment_1_4()); 

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
    // $ANTLR end "rule__Floorplan__Alternatives_1"


    // $ANTLR start "rule__Person__Alternatives_6"
    // InternalBmod.g:316:1: rule__Person__Alternatives_6 : ( ( ( rule__Person__Group_6_0__0 ) ) | ( ( rule__Person__Group_6_1__0 ) ) );
    public final void rule__Person__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:320:1: ( ( ( rule__Person__Group_6_0__0 ) ) | ( ( rule__Person__Group_6_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBmod.g:321:2: ( ( rule__Person__Group_6_0__0 ) )
                    {
                    // InternalBmod.g:321:2: ( ( rule__Person__Group_6_0__0 ) )
                    // InternalBmod.g:322:3: ( rule__Person__Group_6_0__0 )
                    {
                     before(grammarAccess.getPersonAccess().getGroup_6_0()); 
                    // InternalBmod.g:323:3: ( rule__Person__Group_6_0__0 )
                    // InternalBmod.g:323:4: rule__Person__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPersonAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:327:2: ( ( rule__Person__Group_6_1__0 ) )
                    {
                    // InternalBmod.g:327:2: ( ( rule__Person__Group_6_1__0 ) )
                    // InternalBmod.g:328:3: ( rule__Person__Group_6_1__0 )
                    {
                     before(grammarAccess.getPersonAccess().getGroup_6_1()); 
                    // InternalBmod.g:329:3: ( rule__Person__Group_6_1__0 )
                    // InternalBmod.g:329:4: rule__Person__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPersonAccess().getGroup_6_1()); 

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
    // $ANTLR end "rule__Person__Alternatives_6"


    // $ANTLR start "rule__Floorplan__Group__0"
    // InternalBmod.g:337:1: rule__Floorplan__Group__0 : rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1 ;
    public final void rule__Floorplan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:341:1: ( rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1 )
            // InternalBmod.g:342:2: rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Floorplan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floorplan__Group__1();

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
    // $ANTLR end "rule__Floorplan__Group__0"


    // $ANTLR start "rule__Floorplan__Group__0__Impl"
    // InternalBmod.g:349:1: rule__Floorplan__Group__0__Impl : ( () ) ;
    public final void rule__Floorplan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:353:1: ( ( () ) )
            // InternalBmod.g:354:1: ( () )
            {
            // InternalBmod.g:354:1: ( () )
            // InternalBmod.g:355:2: ()
            {
             before(grammarAccess.getFloorplanAccess().getFloorplanAction_0()); 
            // InternalBmod.g:356:2: ()
            // InternalBmod.g:356:3: 
            {
            }

             after(grammarAccess.getFloorplanAccess().getFloorplanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floorplan__Group__0__Impl"


    // $ANTLR start "rule__Floorplan__Group__1"
    // InternalBmod.g:364:1: rule__Floorplan__Group__1 : rule__Floorplan__Group__1__Impl ;
    public final void rule__Floorplan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:368:1: ( rule__Floorplan__Group__1__Impl )
            // InternalBmod.g:369:2: rule__Floorplan__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Floorplan__Group__1__Impl();

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
    // $ANTLR end "rule__Floorplan__Group__1"


    // $ANTLR start "rule__Floorplan__Group__1__Impl"
    // InternalBmod.g:375:1: rule__Floorplan__Group__1__Impl : ( ( rule__Floorplan__Alternatives_1 )* ) ;
    public final void rule__Floorplan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:379:1: ( ( ( rule__Floorplan__Alternatives_1 )* ) )
            // InternalBmod.g:380:1: ( ( rule__Floorplan__Alternatives_1 )* )
            {
            // InternalBmod.g:380:1: ( ( rule__Floorplan__Alternatives_1 )* )
            // InternalBmod.g:381:2: ( rule__Floorplan__Alternatives_1 )*
            {
             before(grammarAccess.getFloorplanAccess().getAlternatives_1()); 
            // InternalBmod.g:382:2: ( rule__Floorplan__Alternatives_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||LA3_0==14||(LA3_0>=17 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBmod.g:382:3: rule__Floorplan__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Floorplan__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFloorplanAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Floorplan__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalBmod.g:391:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:395:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalBmod.g:396:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__1();

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
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // InternalBmod.g:403:1: rule__Room__Group__0__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:407:1: ( ( 'Room' ) )
            // InternalBmod.g:408:1: ( 'Room' )
            {
            // InternalBmod.g:408:1: ( 'Room' )
            // InternalBmod.g:409:2: 'Room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomKeyword_0()); 

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
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // InternalBmod.g:418:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:422:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalBmod.g:423:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Room__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__2();

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
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // InternalBmod.g:430:1: rule__Room__Group__1__Impl : ( ( rule__Room__NameAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:434:1: ( ( ( rule__Room__NameAssignment_1 ) ) )
            // InternalBmod.g:435:1: ( ( rule__Room__NameAssignment_1 ) )
            {
            // InternalBmod.g:435:1: ( ( rule__Room__NameAssignment_1 ) )
            // InternalBmod.g:436:2: ( rule__Room__NameAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_1()); 
            // InternalBmod.g:437:2: ( rule__Room__NameAssignment_1 )
            // InternalBmod.g:437:3: rule__Room__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__2"
    // InternalBmod.g:445:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:449:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalBmod.g:450:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Room__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__3();

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
    // $ANTLR end "rule__Room__Group__2"


    // $ANTLR start "rule__Room__Group__2__Impl"
    // InternalBmod.g:457:1: rule__Room__Group__2__Impl : ( 'named' ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:461:1: ( ( 'named' ) )
            // InternalBmod.g:462:1: ( 'named' )
            {
            // InternalBmod.g:462:1: ( 'named' )
            // InternalBmod.g:463:2: 'named'
            {
             before(grammarAccess.getRoomAccess().getNamedKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getNamedKeyword_2()); 

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
    // $ANTLR end "rule__Room__Group__2__Impl"


    // $ANTLR start "rule__Room__Group__3"
    // InternalBmod.g:472:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:476:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalBmod.g:477:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Room__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__4();

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
    // $ANTLR end "rule__Room__Group__3"


    // $ANTLR start "rule__Room__Group__3__Impl"
    // InternalBmod.g:484:1: rule__Room__Group__3__Impl : ( ( rule__Room__NamedAssignment_3 ) ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:488:1: ( ( ( rule__Room__NamedAssignment_3 ) ) )
            // InternalBmod.g:489:1: ( ( rule__Room__NamedAssignment_3 ) )
            {
            // InternalBmod.g:489:1: ( ( rule__Room__NamedAssignment_3 ) )
            // InternalBmod.g:490:2: ( rule__Room__NamedAssignment_3 )
            {
             before(grammarAccess.getRoomAccess().getNamedAssignment_3()); 
            // InternalBmod.g:491:2: ( rule__Room__NamedAssignment_3 )
            // InternalBmod.g:491:3: rule__Room__NamedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Room__NamedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNamedAssignment_3()); 

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
    // $ANTLR end "rule__Room__Group__3__Impl"


    // $ANTLR start "rule__Room__Group__4"
    // InternalBmod.g:499:1: rule__Room__Group__4 : rule__Room__Group__4__Impl ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:503:1: ( rule__Room__Group__4__Impl )
            // InternalBmod.g:504:2: rule__Room__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__4__Impl();

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
    // $ANTLR end "rule__Room__Group__4"


    // $ANTLR start "rule__Room__Group__4__Impl"
    // InternalBmod.g:510:1: rule__Room__Group__4__Impl : ( ( rule__Room__AreaAssignment_4 ) ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:514:1: ( ( ( rule__Room__AreaAssignment_4 ) ) )
            // InternalBmod.g:515:1: ( ( rule__Room__AreaAssignment_4 ) )
            {
            // InternalBmod.g:515:1: ( ( rule__Room__AreaAssignment_4 ) )
            // InternalBmod.g:516:2: ( rule__Room__AreaAssignment_4 )
            {
             before(grammarAccess.getRoomAccess().getAreaAssignment_4()); 
            // InternalBmod.g:517:2: ( rule__Room__AreaAssignment_4 )
            // InternalBmod.g:517:3: rule__Room__AreaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Room__AreaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getAreaAssignment_4()); 

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
    // $ANTLR end "rule__Room__Group__4__Impl"


    // $ANTLR start "rule__Door__Group__0"
    // InternalBmod.g:526:1: rule__Door__Group__0 : rule__Door__Group__0__Impl rule__Door__Group__1 ;
    public final void rule__Door__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:530:1: ( rule__Door__Group__0__Impl rule__Door__Group__1 )
            // InternalBmod.g:531:2: rule__Door__Group__0__Impl rule__Door__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Door__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Door__Group__1();

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
    // $ANTLR end "rule__Door__Group__0"


    // $ANTLR start "rule__Door__Group__0__Impl"
    // InternalBmod.g:538:1: rule__Door__Group__0__Impl : ( 'Door' ) ;
    public final void rule__Door__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:542:1: ( ( 'Door' ) )
            // InternalBmod.g:543:1: ( 'Door' )
            {
            // InternalBmod.g:543:1: ( 'Door' )
            // InternalBmod.g:544:2: 'Door'
            {
             before(grammarAccess.getDoorAccess().getDoorKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDoorAccess().getDoorKeyword_0()); 

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
    // $ANTLR end "rule__Door__Group__0__Impl"


    // $ANTLR start "rule__Door__Group__1"
    // InternalBmod.g:553:1: rule__Door__Group__1 : rule__Door__Group__1__Impl rule__Door__Group__2 ;
    public final void rule__Door__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:557:1: ( rule__Door__Group__1__Impl rule__Door__Group__2 )
            // InternalBmod.g:558:2: rule__Door__Group__1__Impl rule__Door__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Door__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Door__Group__2();

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
    // $ANTLR end "rule__Door__Group__1"


    // $ANTLR start "rule__Door__Group__1__Impl"
    // InternalBmod.g:565:1: rule__Door__Group__1__Impl : ( ( rule__Door__NameAssignment_1 ) ) ;
    public final void rule__Door__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:569:1: ( ( ( rule__Door__NameAssignment_1 ) ) )
            // InternalBmod.g:570:1: ( ( rule__Door__NameAssignment_1 ) )
            {
            // InternalBmod.g:570:1: ( ( rule__Door__NameAssignment_1 ) )
            // InternalBmod.g:571:2: ( rule__Door__NameAssignment_1 )
            {
             before(grammarAccess.getDoorAccess().getNameAssignment_1()); 
            // InternalBmod.g:572:2: ( rule__Door__NameAssignment_1 )
            // InternalBmod.g:572:3: rule__Door__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Door__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Door__Group__1__Impl"


    // $ANTLR start "rule__Door__Group__2"
    // InternalBmod.g:580:1: rule__Door__Group__2 : rule__Door__Group__2__Impl rule__Door__Group__3 ;
    public final void rule__Door__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:584:1: ( rule__Door__Group__2__Impl rule__Door__Group__3 )
            // InternalBmod.g:585:2: rule__Door__Group__2__Impl rule__Door__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Door__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Door__Group__3();

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
    // $ANTLR end "rule__Door__Group__2"


    // $ANTLR start "rule__Door__Group__2__Impl"
    // InternalBmod.g:592:1: rule__Door__Group__2__Impl : ( 'from' ) ;
    public final void rule__Door__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:596:1: ( ( 'from' ) )
            // InternalBmod.g:597:1: ( 'from' )
            {
            // InternalBmod.g:597:1: ( 'from' )
            // InternalBmod.g:598:2: 'from'
            {
             before(grammarAccess.getDoorAccess().getFromKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDoorAccess().getFromKeyword_2()); 

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
    // $ANTLR end "rule__Door__Group__2__Impl"


    // $ANTLR start "rule__Door__Group__3"
    // InternalBmod.g:607:1: rule__Door__Group__3 : rule__Door__Group__3__Impl rule__Door__Group__4 ;
    public final void rule__Door__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:611:1: ( rule__Door__Group__3__Impl rule__Door__Group__4 )
            // InternalBmod.g:612:2: rule__Door__Group__3__Impl rule__Door__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Door__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Door__Group__4();

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
    // $ANTLR end "rule__Door__Group__3"


    // $ANTLR start "rule__Door__Group__3__Impl"
    // InternalBmod.g:619:1: rule__Door__Group__3__Impl : ( ( rule__Door__FromAssignment_3 ) ) ;
    public final void rule__Door__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:623:1: ( ( ( rule__Door__FromAssignment_3 ) ) )
            // InternalBmod.g:624:1: ( ( rule__Door__FromAssignment_3 ) )
            {
            // InternalBmod.g:624:1: ( ( rule__Door__FromAssignment_3 ) )
            // InternalBmod.g:625:2: ( rule__Door__FromAssignment_3 )
            {
             before(grammarAccess.getDoorAccess().getFromAssignment_3()); 
            // InternalBmod.g:626:2: ( rule__Door__FromAssignment_3 )
            // InternalBmod.g:626:3: rule__Door__FromAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Door__FromAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDoorAccess().getFromAssignment_3()); 

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
    // $ANTLR end "rule__Door__Group__3__Impl"


    // $ANTLR start "rule__Door__Group__4"
    // InternalBmod.g:634:1: rule__Door__Group__4 : rule__Door__Group__4__Impl rule__Door__Group__5 ;
    public final void rule__Door__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:638:1: ( rule__Door__Group__4__Impl rule__Door__Group__5 )
            // InternalBmod.g:639:2: rule__Door__Group__4__Impl rule__Door__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Door__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Door__Group__5();

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
    // $ANTLR end "rule__Door__Group__4"


    // $ANTLR start "rule__Door__Group__4__Impl"
    // InternalBmod.g:646:1: rule__Door__Group__4__Impl : ( 'to' ) ;
    public final void rule__Door__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:650:1: ( ( 'to' ) )
            // InternalBmod.g:651:1: ( 'to' )
            {
            // InternalBmod.g:651:1: ( 'to' )
            // InternalBmod.g:652:2: 'to'
            {
             before(grammarAccess.getDoorAccess().getToKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDoorAccess().getToKeyword_4()); 

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
    // $ANTLR end "rule__Door__Group__4__Impl"


    // $ANTLR start "rule__Door__Group__5"
    // InternalBmod.g:661:1: rule__Door__Group__5 : rule__Door__Group__5__Impl ;
    public final void rule__Door__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:665:1: ( rule__Door__Group__5__Impl )
            // InternalBmod.g:666:2: rule__Door__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Door__Group__5__Impl();

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
    // $ANTLR end "rule__Door__Group__5"


    // $ANTLR start "rule__Door__Group__5__Impl"
    // InternalBmod.g:672:1: rule__Door__Group__5__Impl : ( ( rule__Door__ToAssignment_5 ) ) ;
    public final void rule__Door__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:676:1: ( ( ( rule__Door__ToAssignment_5 ) ) )
            // InternalBmod.g:677:1: ( ( rule__Door__ToAssignment_5 ) )
            {
            // InternalBmod.g:677:1: ( ( rule__Door__ToAssignment_5 ) )
            // InternalBmod.g:678:2: ( rule__Door__ToAssignment_5 )
            {
             before(grammarAccess.getDoorAccess().getToAssignment_5()); 
            // InternalBmod.g:679:2: ( rule__Door__ToAssignment_5 )
            // InternalBmod.g:679:3: rule__Door__ToAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Door__ToAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDoorAccess().getToAssignment_5()); 

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
    // $ANTLR end "rule__Door__Group__5__Impl"


    // $ANTLR start "rule__Profile__Group__0"
    // InternalBmod.g:688:1: rule__Profile__Group__0 : rule__Profile__Group__0__Impl rule__Profile__Group__1 ;
    public final void rule__Profile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:692:1: ( rule__Profile__Group__0__Impl rule__Profile__Group__1 )
            // InternalBmod.g:693:2: rule__Profile__Group__0__Impl rule__Profile__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Profile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__1();

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
    // $ANTLR end "rule__Profile__Group__0"


    // $ANTLR start "rule__Profile__Group__0__Impl"
    // InternalBmod.g:700:1: rule__Profile__Group__0__Impl : ( 'Profile' ) ;
    public final void rule__Profile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:704:1: ( ( 'Profile' ) )
            // InternalBmod.g:705:1: ( 'Profile' )
            {
            // InternalBmod.g:705:1: ( 'Profile' )
            // InternalBmod.g:706:2: 'Profile'
            {
             before(grammarAccess.getProfileAccess().getProfileKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProfileAccess().getProfileKeyword_0()); 

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
    // $ANTLR end "rule__Profile__Group__0__Impl"


    // $ANTLR start "rule__Profile__Group__1"
    // InternalBmod.g:715:1: rule__Profile__Group__1 : rule__Profile__Group__1__Impl ;
    public final void rule__Profile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:719:1: ( rule__Profile__Group__1__Impl )
            // InternalBmod.g:720:2: rule__Profile__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group__1__Impl();

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
    // $ANTLR end "rule__Profile__Group__1"


    // $ANTLR start "rule__Profile__Group__1__Impl"
    // InternalBmod.g:726:1: rule__Profile__Group__1__Impl : ( ( rule__Profile__NameAssignment_1 ) ) ;
    public final void rule__Profile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:730:1: ( ( ( rule__Profile__NameAssignment_1 ) ) )
            // InternalBmod.g:731:1: ( ( rule__Profile__NameAssignment_1 ) )
            {
            // InternalBmod.g:731:1: ( ( rule__Profile__NameAssignment_1 ) )
            // InternalBmod.g:732:2: ( rule__Profile__NameAssignment_1 )
            {
             before(grammarAccess.getProfileAccess().getNameAssignment_1()); 
            // InternalBmod.g:733:2: ( rule__Profile__NameAssignment_1 )
            // InternalBmod.g:733:3: rule__Profile__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Profile__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Profile__Group__1__Impl"


    // $ANTLR start "rule__Level__Group__0"
    // InternalBmod.g:742:1: rule__Level__Group__0 : rule__Level__Group__0__Impl rule__Level__Group__1 ;
    public final void rule__Level__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:746:1: ( rule__Level__Group__0__Impl rule__Level__Group__1 )
            // InternalBmod.g:747:2: rule__Level__Group__0__Impl rule__Level__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Level__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Level__Group__1();

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
    // $ANTLR end "rule__Level__Group__0"


    // $ANTLR start "rule__Level__Group__0__Impl"
    // InternalBmod.g:754:1: rule__Level__Group__0__Impl : ( 'Level' ) ;
    public final void rule__Level__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:758:1: ( ( 'Level' ) )
            // InternalBmod.g:759:1: ( 'Level' )
            {
            // InternalBmod.g:759:1: ( 'Level' )
            // InternalBmod.g:760:2: 'Level'
            {
             before(grammarAccess.getLevelAccess().getLevelKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLevelAccess().getLevelKeyword_0()); 

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
    // $ANTLR end "rule__Level__Group__0__Impl"


    // $ANTLR start "rule__Level__Group__1"
    // InternalBmod.g:769:1: rule__Level__Group__1 : rule__Level__Group__1__Impl ;
    public final void rule__Level__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:773:1: ( rule__Level__Group__1__Impl )
            // InternalBmod.g:774:2: rule__Level__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Level__Group__1__Impl();

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
    // $ANTLR end "rule__Level__Group__1"


    // $ANTLR start "rule__Level__Group__1__Impl"
    // InternalBmod.g:780:1: rule__Level__Group__1__Impl : ( ( rule__Level__NameAssignment_1 ) ) ;
    public final void rule__Level__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:784:1: ( ( ( rule__Level__NameAssignment_1 ) ) )
            // InternalBmod.g:785:1: ( ( rule__Level__NameAssignment_1 ) )
            {
            // InternalBmod.g:785:1: ( ( rule__Level__NameAssignment_1 ) )
            // InternalBmod.g:786:2: ( rule__Level__NameAssignment_1 )
            {
             before(grammarAccess.getLevelAccess().getNameAssignment_1()); 
            // InternalBmod.g:787:2: ( rule__Level__NameAssignment_1 )
            // InternalBmod.g:787:3: rule__Level__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Level__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Level__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalBmod.g:796:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:800:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalBmod.g:801:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

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
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalBmod.g:808:1: rule__Person__Group__0__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:812:1: ( ( 'Person' ) )
            // InternalBmod.g:813:1: ( 'Person' )
            {
            // InternalBmod.g:813:1: ( 'Person' )
            // InternalBmod.g:814:2: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 

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
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalBmod.g:823:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:827:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalBmod.g:828:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__2();

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
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalBmod.g:835:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:839:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalBmod.g:840:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalBmod.g:840:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalBmod.g:841:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalBmod.g:842:2: ( rule__Person__NameAssignment_1 )
            // InternalBmod.g:842:3: rule__Person__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // InternalBmod.g:850:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:854:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalBmod.g:855:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__3();

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
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // InternalBmod.g:862:1: rule__Person__Group__2__Impl : ( 'named' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:866:1: ( ( 'named' ) )
            // InternalBmod.g:867:1: ( 'named' )
            {
            // InternalBmod.g:867:1: ( 'named' )
            // InternalBmod.g:868:2: 'named'
            {
             before(grammarAccess.getPersonAccess().getNamedKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNamedKeyword_2()); 

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
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // InternalBmod.g:877:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:881:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalBmod.g:882:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__4();

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
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // InternalBmod.g:889:1: rule__Person__Group__3__Impl : ( ( rule__Person__NamedAssignment_3 ) ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:893:1: ( ( ( rule__Person__NamedAssignment_3 ) ) )
            // InternalBmod.g:894:1: ( ( rule__Person__NamedAssignment_3 ) )
            {
            // InternalBmod.g:894:1: ( ( rule__Person__NamedAssignment_3 ) )
            // InternalBmod.g:895:2: ( rule__Person__NamedAssignment_3 )
            {
             before(grammarAccess.getPersonAccess().getNamedAssignment_3()); 
            // InternalBmod.g:896:2: ( rule__Person__NamedAssignment_3 )
            // InternalBmod.g:896:3: rule__Person__NamedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Person__NamedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNamedAssignment_3()); 

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
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__4"
    // InternalBmod.g:904:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:908:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalBmod.g:909:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Person__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__5();

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
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // InternalBmod.g:916:1: rule__Person__Group__4__Impl : ( 'in' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:920:1: ( ( 'in' ) )
            // InternalBmod.g:921:1: ( 'in' )
            {
            // InternalBmod.g:921:1: ( 'in' )
            // InternalBmod.g:922:2: 'in'
            {
             before(grammarAccess.getPersonAccess().getInKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getInKeyword_4()); 

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
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__5"
    // InternalBmod.g:931:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:935:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalBmod.g:936:2: rule__Person__Group__5__Impl rule__Person__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Person__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__6();

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
    // $ANTLR end "rule__Person__Group__5"


    // $ANTLR start "rule__Person__Group__5__Impl"
    // InternalBmod.g:943:1: rule__Person__Group__5__Impl : ( ( rule__Person__LocationAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:947:1: ( ( ( rule__Person__LocationAssignment_5 ) ) )
            // InternalBmod.g:948:1: ( ( rule__Person__LocationAssignment_5 ) )
            {
            // InternalBmod.g:948:1: ( ( rule__Person__LocationAssignment_5 ) )
            // InternalBmod.g:949:2: ( rule__Person__LocationAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getLocationAssignment_5()); 
            // InternalBmod.g:950:2: ( rule__Person__LocationAssignment_5 )
            // InternalBmod.g:950:3: rule__Person__LocationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Person__LocationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getLocationAssignment_5()); 

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
    // $ANTLR end "rule__Person__Group__5__Impl"


    // $ANTLR start "rule__Person__Group__6"
    // InternalBmod.g:958:1: rule__Person__Group__6 : rule__Person__Group__6__Impl ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:962:1: ( rule__Person__Group__6__Impl )
            // InternalBmod.g:963:2: rule__Person__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__6__Impl();

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
    // $ANTLR end "rule__Person__Group__6"


    // $ANTLR start "rule__Person__Group__6__Impl"
    // InternalBmod.g:969:1: rule__Person__Group__6__Impl : ( ( rule__Person__Alternatives_6 )? ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:973:1: ( ( ( rule__Person__Alternatives_6 )? ) )
            // InternalBmod.g:974:1: ( ( rule__Person__Alternatives_6 )? )
            {
            // InternalBmod.g:974:1: ( ( rule__Person__Alternatives_6 )? )
            // InternalBmod.g:975:2: ( rule__Person__Alternatives_6 )?
            {
             before(grammarAccess.getPersonAccess().getAlternatives_6()); 
            // InternalBmod.g:976:2: ( rule__Person__Alternatives_6 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==21) ) {
                    alt4=1;
                }
            }
            else if ( (LA4_0==18) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==21) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalBmod.g:976:3: rule__Person__Alternatives_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Alternatives_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getAlternatives_6()); 

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
    // $ANTLR end "rule__Person__Group__6__Impl"


    // $ANTLR start "rule__Person__Group_6_0__0"
    // InternalBmod.g:985:1: rule__Person__Group_6_0__0 : rule__Person__Group_6_0__0__Impl rule__Person__Group_6_0__1 ;
    public final void rule__Person__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:989:1: ( rule__Person__Group_6_0__0__Impl rule__Person__Group_6_0__1 )
            // InternalBmod.g:990:2: rule__Person__Group_6_0__0__Impl rule__Person__Group_6_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Person__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_6_0__1();

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
    // $ANTLR end "rule__Person__Group_6_0__0"


    // $ANTLR start "rule__Person__Group_6_0__0__Impl"
    // InternalBmod.g:997:1: rule__Person__Group_6_0__0__Impl : ( 'Profile' ) ;
    public final void rule__Person__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1001:1: ( ( 'Profile' ) )
            // InternalBmod.g:1002:1: ( 'Profile' )
            {
            // InternalBmod.g:1002:1: ( 'Profile' )
            // InternalBmod.g:1003:2: 'Profile'
            {
             before(grammarAccess.getPersonAccess().getProfileKeyword_6_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getProfileKeyword_6_0_0()); 

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
    // $ANTLR end "rule__Person__Group_6_0__0__Impl"


    // $ANTLR start "rule__Person__Group_6_0__1"
    // InternalBmod.g:1012:1: rule__Person__Group_6_0__1 : rule__Person__Group_6_0__1__Impl rule__Person__Group_6_0__2 ;
    public final void rule__Person__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1016:1: ( rule__Person__Group_6_0__1__Impl rule__Person__Group_6_0__2 )
            // InternalBmod.g:1017:2: rule__Person__Group_6_0__1__Impl rule__Person__Group_6_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group_6_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_6_0__2();

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
    // $ANTLR end "rule__Person__Group_6_0__1"


    // $ANTLR start "rule__Person__Group_6_0__1__Impl"
    // InternalBmod.g:1024:1: rule__Person__Group_6_0__1__Impl : ( ':' ) ;
    public final void rule__Person__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1028:1: ( ( ':' ) )
            // InternalBmod.g:1029:1: ( ':' )
            {
            // InternalBmod.g:1029:1: ( ':' )
            // InternalBmod.g:1030:2: ':'
            {
             before(grammarAccess.getPersonAccess().getColonKeyword_6_0_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getColonKeyword_6_0_1()); 

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
    // $ANTLR end "rule__Person__Group_6_0__1__Impl"


    // $ANTLR start "rule__Person__Group_6_0__2"
    // InternalBmod.g:1039:1: rule__Person__Group_6_0__2 : rule__Person__Group_6_0__2__Impl rule__Person__Group_6_0__3 ;
    public final void rule__Person__Group_6_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1043:1: ( rule__Person__Group_6_0__2__Impl rule__Person__Group_6_0__3 )
            // InternalBmod.g:1044:2: rule__Person__Group_6_0__2__Impl rule__Person__Group_6_0__3
            {
            pushFollow(FOLLOW_14);
            rule__Person__Group_6_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_6_0__3();

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
    // $ANTLR end "rule__Person__Group_6_0__2"


    // $ANTLR start "rule__Person__Group_6_0__2__Impl"
    // InternalBmod.g:1051:1: rule__Person__Group_6_0__2__Impl : ( ( rule__Person__ProfileAssignment_6_0_2 ) ) ;
    public final void rule__Person__Group_6_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1055:1: ( ( ( rule__Person__ProfileAssignment_6_0_2 ) ) )
            // InternalBmod.g:1056:1: ( ( rule__Person__ProfileAssignment_6_0_2 ) )
            {
            // InternalBmod.g:1056:1: ( ( rule__Person__ProfileAssignment_6_0_2 ) )
            // InternalBmod.g:1057:2: ( rule__Person__ProfileAssignment_6_0_2 )
            {
             before(grammarAccess.getPersonAccess().getProfileAssignment_6_0_2()); 
            // InternalBmod.g:1058:2: ( rule__Person__ProfileAssignment_6_0_2 )
            // InternalBmod.g:1058:3: rule__Person__ProfileAssignment_6_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Person__ProfileAssignment_6_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getProfileAssignment_6_0_2()); 

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
    // $ANTLR end "rule__Person__Group_6_0__2__Impl"


    // $ANTLR start "rule__Person__Group_6_0__3"
    // InternalBmod.g:1066:1: rule__Person__Group_6_0__3 : rule__Person__Group_6_0__3__Impl rule__Person__Group_6_0__4 ;
    public final void rule__Person__Group_6_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1070:1: ( rule__Person__Group_6_0__3__Impl rule__Person__Group_6_0__4 )
            // InternalBmod.g:1071:2: rule__Person__Group_6_0__3__Impl rule__Person__Group_6_0__4
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group_6_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_6_0__4();

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
    // $ANTLR end "rule__Person__Group_6_0__3"


    // $ANTLR start "rule__Person__Group_6_0__3__Impl"
    // InternalBmod.g:1078:1: rule__Person__Group_6_0__3__Impl : ( ',' ) ;
    public final void rule__Person__Group_6_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1082:1: ( ( ',' ) )
            // InternalBmod.g:1083:1: ( ',' )
            {
            // InternalBmod.g:1083:1: ( ',' )
            // InternalBmod.g:1084:2: ','
            {
             before(grammarAccess.getPersonAccess().getCommaKeyword_6_0_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getCommaKeyword_6_0_3()); 

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
    // $ANTLR end "rule__Person__Group_6_0__3__Impl"


    // $ANTLR start "rule__Person__Group_6_0__4"
    // InternalBmod.g:1093:1: rule__Person__Group_6_0__4 : rule__Person__Group_6_0__4__Impl rule__Person__Group_6_0__5 ;
    public final void rule__Person__Group_6_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1097:1: ( rule__Person__Group_6_0__4__Impl rule__Person__Group_6_0__5 )
            // InternalBmod.g:1098:2: rule__Person__Group_6_0__4__Impl rule__Person__Group_6_0__5
            {
            pushFollow(FOLLOW_13);
            rule__Person__Group_6_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_6_0__5();

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
    // $ANTLR end "rule__Person__Group_6_0__4"


    // $ANTLR start "rule__Person__Group_6_0__4__Impl"
    // InternalBmod.g:1105:1: rule__Person__Group_6_0__4__Impl : ( 'Level' ) ;
    public final void rule__Person__Group_6_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1109:1: ( ( 'Level' ) )
            // InternalBmod.g:1110:1: ( 'Level' )
            {
            // InternalBmod.g:1110:1: ( 'Level' )
            // InternalBmod.g:1111:2: 'Level'
            {
             before(grammarAccess.getPersonAccess().getLevelKeyword_6_0_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLevelKeyword_6_0_4()); 

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
    // $ANTLR end "rule__Person__Group_6_0__4__Impl"


    // $ANTLR start "rule__Person__Group_6_0__5"
    // InternalBmod.g:1120:1: rule__Person__Group_6_0__5 : rule__Person__Group_6_0__5__Impl rule__Person__Group_6_0__6 ;
    public final void rule__Person__Group_6_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1124:1: ( rule__Person__Group_6_0__5__Impl rule__Person__Group_6_0__6 )
            // InternalBmod.g:1125:2: rule__Person__Group_6_0__5__Impl rule__Person__Group_6_0__6
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group_6_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_6_0__6();

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
    // $ANTLR end "rule__Person__Group_6_0__5"


    // $ANTLR start "rule__Person__Group_6_0__5__Impl"
    // InternalBmod.g:1132:1: rule__Person__Group_6_0__5__Impl : ( ':' ) ;
    public final void rule__Person__Group_6_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1136:1: ( ( ':' ) )
            // InternalBmod.g:1137:1: ( ':' )
            {
            // InternalBmod.g:1137:1: ( ':' )
            // InternalBmod.g:1138:2: ':'
            {
             before(grammarAccess.getPersonAccess().getColonKeyword_6_0_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getColonKeyword_6_0_5()); 

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
    // $ANTLR end "rule__Person__Group_6_0__5__Impl"


    // $ANTLR start "rule__Person__Group_6_0__6"
    // InternalBmod.g:1147:1: rule__Person__Group_6_0__6 : rule__Person__Group_6_0__6__Impl ;
    public final void rule__Person__Group_6_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1151:1: ( rule__Person__Group_6_0__6__Impl )
            // InternalBmod.g:1152:2: rule__Person__Group_6_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_6_0__6__Impl();

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
    // $ANTLR end "rule__Person__Group_6_0__6"


    // $ANTLR start "rule__Person__Group_6_0__6__Impl"
    // InternalBmod.g:1158:1: rule__Person__Group_6_0__6__Impl : ( ( rule__Person__LevelAssignment_6_0_6 ) ) ;
    public final void rule__Person__Group_6_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1162:1: ( ( ( rule__Person__LevelAssignment_6_0_6 ) ) )
            // InternalBmod.g:1163:1: ( ( rule__Person__LevelAssignment_6_0_6 ) )
            {
            // InternalBmod.g:1163:1: ( ( rule__Person__LevelAssignment_6_0_6 ) )
            // InternalBmod.g:1164:2: ( rule__Person__LevelAssignment_6_0_6 )
            {
             before(grammarAccess.getPersonAccess().getLevelAssignment_6_0_6()); 
            // InternalBmod.g:1165:2: ( rule__Person__LevelAssignment_6_0_6 )
            // InternalBmod.g:1165:3: rule__Person__LevelAssignment_6_0_6
            {
            pushFollow(FOLLOW_2);
            rule__Person__LevelAssignment_6_0_6();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getLevelAssignment_6_0_6()); 

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
    // $ANTLR end "rule__Person__Group_6_0__6__Impl"


    // $ANTLR start "rule__Person__Group_6_1__0"
    // InternalBmod.g:1174:1: rule__Person__Group_6_1__0 : rule__Person__Group_6_1__0__Impl rule__Person__Group_6_1__1 ;
    public final void rule__Person__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1178:1: ( rule__Person__Group_6_1__0__Impl rule__Person__Group_6_1__1 )
            // InternalBmod.g:1179:2: rule__Person__Group_6_1__0__Impl rule__Person__Group_6_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Person__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_6_1__1();

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
    // $ANTLR end "rule__Person__Group_6_1__0"


    // $ANTLR start "rule__Person__Group_6_1__0__Impl"
    // InternalBmod.g:1186:1: rule__Person__Group_6_1__0__Impl : ( 'Level' ) ;
    public final void rule__Person__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1190:1: ( ( 'Level' ) )
            // InternalBmod.g:1191:1: ( 'Level' )
            {
            // InternalBmod.g:1191:1: ( 'Level' )
            // InternalBmod.g:1192:2: 'Level'
            {
             before(grammarAccess.getPersonAccess().getLevelKeyword_6_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLevelKeyword_6_1_0()); 

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
    // $ANTLR end "rule__Person__Group_6_1__0__Impl"


    // $ANTLR start "rule__Person__Group_6_1__1"
    // InternalBmod.g:1201:1: rule__Person__Group_6_1__1 : rule__Person__Group_6_1__1__Impl rule__Person__Group_6_1__2 ;
    public final void rule__Person__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1205:1: ( rule__Person__Group_6_1__1__Impl rule__Person__Group_6_1__2 )
            // InternalBmod.g:1206:2: rule__Person__Group_6_1__1__Impl rule__Person__Group_6_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group_6_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_6_1__2();

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
    // $ANTLR end "rule__Person__Group_6_1__1"


    // $ANTLR start "rule__Person__Group_6_1__1__Impl"
    // InternalBmod.g:1213:1: rule__Person__Group_6_1__1__Impl : ( ':' ) ;
    public final void rule__Person__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1217:1: ( ( ':' ) )
            // InternalBmod.g:1218:1: ( ':' )
            {
            // InternalBmod.g:1218:1: ( ':' )
            // InternalBmod.g:1219:2: ':'
            {
             before(grammarAccess.getPersonAccess().getColonKeyword_6_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getColonKeyword_6_1_1()); 

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
    // $ANTLR end "rule__Person__Group_6_1__1__Impl"


    // $ANTLR start "rule__Person__Group_6_1__2"
    // InternalBmod.g:1228:1: rule__Person__Group_6_1__2 : rule__Person__Group_6_1__2__Impl rule__Person__Group_6_1__3 ;
    public final void rule__Person__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1232:1: ( rule__Person__Group_6_1__2__Impl rule__Person__Group_6_1__3 )
            // InternalBmod.g:1233:2: rule__Person__Group_6_1__2__Impl rule__Person__Group_6_1__3
            {
            pushFollow(FOLLOW_14);
            rule__Person__Group_6_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_6_1__3();

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
    // $ANTLR end "rule__Person__Group_6_1__2"


    // $ANTLR start "rule__Person__Group_6_1__2__Impl"
    // InternalBmod.g:1240:1: rule__Person__Group_6_1__2__Impl : ( ( rule__Person__ProfileAssignment_6_1_2 ) ) ;
    public final void rule__Person__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1244:1: ( ( ( rule__Person__ProfileAssignment_6_1_2 ) ) )
            // InternalBmod.g:1245:1: ( ( rule__Person__ProfileAssignment_6_1_2 ) )
            {
            // InternalBmod.g:1245:1: ( ( rule__Person__ProfileAssignment_6_1_2 ) )
            // InternalBmod.g:1246:2: ( rule__Person__ProfileAssignment_6_1_2 )
            {
             before(grammarAccess.getPersonAccess().getProfileAssignment_6_1_2()); 
            // InternalBmod.g:1247:2: ( rule__Person__ProfileAssignment_6_1_2 )
            // InternalBmod.g:1247:3: rule__Person__ProfileAssignment_6_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Person__ProfileAssignment_6_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getProfileAssignment_6_1_2()); 

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
    // $ANTLR end "rule__Person__Group_6_1__2__Impl"


    // $ANTLR start "rule__Person__Group_6_1__3"
    // InternalBmod.g:1255:1: rule__Person__Group_6_1__3 : rule__Person__Group_6_1__3__Impl rule__Person__Group_6_1__4 ;
    public final void rule__Person__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1259:1: ( rule__Person__Group_6_1__3__Impl rule__Person__Group_6_1__4 )
            // InternalBmod.g:1260:2: rule__Person__Group_6_1__3__Impl rule__Person__Group_6_1__4
            {
            pushFollow(FOLLOW_16);
            rule__Person__Group_6_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_6_1__4();

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
    // $ANTLR end "rule__Person__Group_6_1__3"


    // $ANTLR start "rule__Person__Group_6_1__3__Impl"
    // InternalBmod.g:1267:1: rule__Person__Group_6_1__3__Impl : ( ',' ) ;
    public final void rule__Person__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1271:1: ( ( ',' ) )
            // InternalBmod.g:1272:1: ( ',' )
            {
            // InternalBmod.g:1272:1: ( ',' )
            // InternalBmod.g:1273:2: ','
            {
             before(grammarAccess.getPersonAccess().getCommaKeyword_6_1_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getCommaKeyword_6_1_3()); 

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
    // $ANTLR end "rule__Person__Group_6_1__3__Impl"


    // $ANTLR start "rule__Person__Group_6_1__4"
    // InternalBmod.g:1282:1: rule__Person__Group_6_1__4 : rule__Person__Group_6_1__4__Impl rule__Person__Group_6_1__5 ;
    public final void rule__Person__Group_6_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1286:1: ( rule__Person__Group_6_1__4__Impl rule__Person__Group_6_1__5 )
            // InternalBmod.g:1287:2: rule__Person__Group_6_1__4__Impl rule__Person__Group_6_1__5
            {
            pushFollow(FOLLOW_13);
            rule__Person__Group_6_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_6_1__5();

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
    // $ANTLR end "rule__Person__Group_6_1__4"


    // $ANTLR start "rule__Person__Group_6_1__4__Impl"
    // InternalBmod.g:1294:1: rule__Person__Group_6_1__4__Impl : ( 'Profile' ) ;
    public final void rule__Person__Group_6_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1298:1: ( ( 'Profile' ) )
            // InternalBmod.g:1299:1: ( 'Profile' )
            {
            // InternalBmod.g:1299:1: ( 'Profile' )
            // InternalBmod.g:1300:2: 'Profile'
            {
             before(grammarAccess.getPersonAccess().getProfileKeyword_6_1_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getProfileKeyword_6_1_4()); 

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
    // $ANTLR end "rule__Person__Group_6_1__4__Impl"


    // $ANTLR start "rule__Person__Group_6_1__5"
    // InternalBmod.g:1309:1: rule__Person__Group_6_1__5 : rule__Person__Group_6_1__5__Impl rule__Person__Group_6_1__6 ;
    public final void rule__Person__Group_6_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1313:1: ( rule__Person__Group_6_1__5__Impl rule__Person__Group_6_1__6 )
            // InternalBmod.g:1314:2: rule__Person__Group_6_1__5__Impl rule__Person__Group_6_1__6
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group_6_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_6_1__6();

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
    // $ANTLR end "rule__Person__Group_6_1__5"


    // $ANTLR start "rule__Person__Group_6_1__5__Impl"
    // InternalBmod.g:1321:1: rule__Person__Group_6_1__5__Impl : ( ':' ) ;
    public final void rule__Person__Group_6_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1325:1: ( ( ':' ) )
            // InternalBmod.g:1326:1: ( ':' )
            {
            // InternalBmod.g:1326:1: ( ':' )
            // InternalBmod.g:1327:2: ':'
            {
             before(grammarAccess.getPersonAccess().getColonKeyword_6_1_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getColonKeyword_6_1_5()); 

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
    // $ANTLR end "rule__Person__Group_6_1__5__Impl"


    // $ANTLR start "rule__Person__Group_6_1__6"
    // InternalBmod.g:1336:1: rule__Person__Group_6_1__6 : rule__Person__Group_6_1__6__Impl ;
    public final void rule__Person__Group_6_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1340:1: ( rule__Person__Group_6_1__6__Impl )
            // InternalBmod.g:1341:2: rule__Person__Group_6_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_6_1__6__Impl();

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
    // $ANTLR end "rule__Person__Group_6_1__6"


    // $ANTLR start "rule__Person__Group_6_1__6__Impl"
    // InternalBmod.g:1347:1: rule__Person__Group_6_1__6__Impl : ( ( rule__Person__LevelAssignment_6_1_6 ) ) ;
    public final void rule__Person__Group_6_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1351:1: ( ( ( rule__Person__LevelAssignment_6_1_6 ) ) )
            // InternalBmod.g:1352:1: ( ( rule__Person__LevelAssignment_6_1_6 ) )
            {
            // InternalBmod.g:1352:1: ( ( rule__Person__LevelAssignment_6_1_6 ) )
            // InternalBmod.g:1353:2: ( rule__Person__LevelAssignment_6_1_6 )
            {
             before(grammarAccess.getPersonAccess().getLevelAssignment_6_1_6()); 
            // InternalBmod.g:1354:2: ( rule__Person__LevelAssignment_6_1_6 )
            // InternalBmod.g:1354:3: rule__Person__LevelAssignment_6_1_6
            {
            pushFollow(FOLLOW_2);
            rule__Person__LevelAssignment_6_1_6();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getLevelAssignment_6_1_6()); 

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
    // $ANTLR end "rule__Person__Group_6_1__6__Impl"


    // $ANTLR start "rule__Coordinate__Group__0"
    // InternalBmod.g:1363:1: rule__Coordinate__Group__0 : rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 ;
    public final void rule__Coordinate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1367:1: ( rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 )
            // InternalBmod.g:1368:2: rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Coordinate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__1();

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
    // $ANTLR end "rule__Coordinate__Group__0"


    // $ANTLR start "rule__Coordinate__Group__0__Impl"
    // InternalBmod.g:1375:1: rule__Coordinate__Group__0__Impl : ( '(' ) ;
    public final void rule__Coordinate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1379:1: ( ( '(' ) )
            // InternalBmod.g:1380:1: ( '(' )
            {
            // InternalBmod.g:1380:1: ( '(' )
            // InternalBmod.g:1381:2: '('
            {
             before(grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Coordinate__Group__0__Impl"


    // $ANTLR start "rule__Coordinate__Group__1"
    // InternalBmod.g:1390:1: rule__Coordinate__Group__1 : rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2 ;
    public final void rule__Coordinate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1394:1: ( rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2 )
            // InternalBmod.g:1395:2: rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Coordinate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__2();

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
    // $ANTLR end "rule__Coordinate__Group__1"


    // $ANTLR start "rule__Coordinate__Group__1__Impl"
    // InternalBmod.g:1402:1: rule__Coordinate__Group__1__Impl : ( ( rule__Coordinate__XAssignment_1 ) ) ;
    public final void rule__Coordinate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1406:1: ( ( ( rule__Coordinate__XAssignment_1 ) ) )
            // InternalBmod.g:1407:1: ( ( rule__Coordinate__XAssignment_1 ) )
            {
            // InternalBmod.g:1407:1: ( ( rule__Coordinate__XAssignment_1 ) )
            // InternalBmod.g:1408:2: ( rule__Coordinate__XAssignment_1 )
            {
             before(grammarAccess.getCoordinateAccess().getXAssignment_1()); 
            // InternalBmod.g:1409:2: ( rule__Coordinate__XAssignment_1 )
            // InternalBmod.g:1409:3: rule__Coordinate__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Coordinate__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateAccess().getXAssignment_1()); 

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
    // $ANTLR end "rule__Coordinate__Group__1__Impl"


    // $ANTLR start "rule__Coordinate__Group__2"
    // InternalBmod.g:1417:1: rule__Coordinate__Group__2 : rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3 ;
    public final void rule__Coordinate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1421:1: ( rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3 )
            // InternalBmod.g:1422:2: rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Coordinate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__3();

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
    // $ANTLR end "rule__Coordinate__Group__2"


    // $ANTLR start "rule__Coordinate__Group__2__Impl"
    // InternalBmod.g:1429:1: rule__Coordinate__Group__2__Impl : ( ',' ) ;
    public final void rule__Coordinate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1433:1: ( ( ',' ) )
            // InternalBmod.g:1434:1: ( ',' )
            {
            // InternalBmod.g:1434:1: ( ',' )
            // InternalBmod.g:1435:2: ','
            {
             before(grammarAccess.getCoordinateAccess().getCommaKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCoordinateAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__Coordinate__Group__2__Impl"


    // $ANTLR start "rule__Coordinate__Group__3"
    // InternalBmod.g:1444:1: rule__Coordinate__Group__3 : rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4 ;
    public final void rule__Coordinate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1448:1: ( rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4 )
            // InternalBmod.g:1449:2: rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Coordinate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__4();

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
    // $ANTLR end "rule__Coordinate__Group__3"


    // $ANTLR start "rule__Coordinate__Group__3__Impl"
    // InternalBmod.g:1456:1: rule__Coordinate__Group__3__Impl : ( ( rule__Coordinate__YAssignment_3 ) ) ;
    public final void rule__Coordinate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1460:1: ( ( ( rule__Coordinate__YAssignment_3 ) ) )
            // InternalBmod.g:1461:1: ( ( rule__Coordinate__YAssignment_3 ) )
            {
            // InternalBmod.g:1461:1: ( ( rule__Coordinate__YAssignment_3 ) )
            // InternalBmod.g:1462:2: ( rule__Coordinate__YAssignment_3 )
            {
             before(grammarAccess.getCoordinateAccess().getYAssignment_3()); 
            // InternalBmod.g:1463:2: ( rule__Coordinate__YAssignment_3 )
            // InternalBmod.g:1463:3: rule__Coordinate__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Coordinate__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateAccess().getYAssignment_3()); 

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
    // $ANTLR end "rule__Coordinate__Group__3__Impl"


    // $ANTLR start "rule__Coordinate__Group__4"
    // InternalBmod.g:1471:1: rule__Coordinate__Group__4 : rule__Coordinate__Group__4__Impl ;
    public final void rule__Coordinate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1475:1: ( rule__Coordinate__Group__4__Impl )
            // InternalBmod.g:1476:2: rule__Coordinate__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__4__Impl();

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
    // $ANTLR end "rule__Coordinate__Group__4"


    // $ANTLR start "rule__Coordinate__Group__4__Impl"
    // InternalBmod.g:1482:1: rule__Coordinate__Group__4__Impl : ( ')' ) ;
    public final void rule__Coordinate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1486:1: ( ( ')' ) )
            // InternalBmod.g:1487:1: ( ')' )
            {
            // InternalBmod.g:1487:1: ( ')' )
            // InternalBmod.g:1488:2: ')'
            {
             before(grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Coordinate__Group__4__Impl"


    // $ANTLR start "rule__Area__Group__0"
    // InternalBmod.g:1498:1: rule__Area__Group__0 : rule__Area__Group__0__Impl rule__Area__Group__1 ;
    public final void rule__Area__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1502:1: ( rule__Area__Group__0__Impl rule__Area__Group__1 )
            // InternalBmod.g:1503:2: rule__Area__Group__0__Impl rule__Area__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Area__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__1();

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
    // $ANTLR end "rule__Area__Group__0"


    // $ANTLR start "rule__Area__Group__0__Impl"
    // InternalBmod.g:1510:1: rule__Area__Group__0__Impl : ( 'from' ) ;
    public final void rule__Area__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1514:1: ( ( 'from' ) )
            // InternalBmod.g:1515:1: ( 'from' )
            {
            // InternalBmod.g:1515:1: ( 'from' )
            // InternalBmod.g:1516:2: 'from'
            {
             before(grammarAccess.getAreaAccess().getFromKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getFromKeyword_0()); 

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
    // $ANTLR end "rule__Area__Group__0__Impl"


    // $ANTLR start "rule__Area__Group__1"
    // InternalBmod.g:1525:1: rule__Area__Group__1 : rule__Area__Group__1__Impl rule__Area__Group__2 ;
    public final void rule__Area__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1529:1: ( rule__Area__Group__1__Impl rule__Area__Group__2 )
            // InternalBmod.g:1530:2: rule__Area__Group__1__Impl rule__Area__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Area__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__2();

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
    // $ANTLR end "rule__Area__Group__1"


    // $ANTLR start "rule__Area__Group__1__Impl"
    // InternalBmod.g:1537:1: rule__Area__Group__1__Impl : ( ( rule__Area__FromAssignment_1 ) ) ;
    public final void rule__Area__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1541:1: ( ( ( rule__Area__FromAssignment_1 ) ) )
            // InternalBmod.g:1542:1: ( ( rule__Area__FromAssignment_1 ) )
            {
            // InternalBmod.g:1542:1: ( ( rule__Area__FromAssignment_1 ) )
            // InternalBmod.g:1543:2: ( rule__Area__FromAssignment_1 )
            {
             before(grammarAccess.getAreaAccess().getFromAssignment_1()); 
            // InternalBmod.g:1544:2: ( rule__Area__FromAssignment_1 )
            // InternalBmod.g:1544:3: rule__Area__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Area__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getFromAssignment_1()); 

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
    // $ANTLR end "rule__Area__Group__1__Impl"


    // $ANTLR start "rule__Area__Group__2"
    // InternalBmod.g:1552:1: rule__Area__Group__2 : rule__Area__Group__2__Impl rule__Area__Group__3 ;
    public final void rule__Area__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1556:1: ( rule__Area__Group__2__Impl rule__Area__Group__3 )
            // InternalBmod.g:1557:2: rule__Area__Group__2__Impl rule__Area__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Area__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__3();

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
    // $ANTLR end "rule__Area__Group__2"


    // $ANTLR start "rule__Area__Group__2__Impl"
    // InternalBmod.g:1564:1: rule__Area__Group__2__Impl : ( 'to' ) ;
    public final void rule__Area__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1568:1: ( ( 'to' ) )
            // InternalBmod.g:1569:1: ( 'to' )
            {
            // InternalBmod.g:1569:1: ( 'to' )
            // InternalBmod.g:1570:2: 'to'
            {
             before(grammarAccess.getAreaAccess().getToKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__Area__Group__2__Impl"


    // $ANTLR start "rule__Area__Group__3"
    // InternalBmod.g:1579:1: rule__Area__Group__3 : rule__Area__Group__3__Impl rule__Area__Group__4 ;
    public final void rule__Area__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1583:1: ( rule__Area__Group__3__Impl rule__Area__Group__4 )
            // InternalBmod.g:1584:2: rule__Area__Group__3__Impl rule__Area__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Area__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__4();

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
    // $ANTLR end "rule__Area__Group__3"


    // $ANTLR start "rule__Area__Group__3__Impl"
    // InternalBmod.g:1591:1: rule__Area__Group__3__Impl : ( ( rule__Area__ToAssignment_3 ) ) ;
    public final void rule__Area__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1595:1: ( ( ( rule__Area__ToAssignment_3 ) ) )
            // InternalBmod.g:1596:1: ( ( rule__Area__ToAssignment_3 ) )
            {
            // InternalBmod.g:1596:1: ( ( rule__Area__ToAssignment_3 ) )
            // InternalBmod.g:1597:2: ( rule__Area__ToAssignment_3 )
            {
             before(grammarAccess.getAreaAccess().getToAssignment_3()); 
            // InternalBmod.g:1598:2: ( rule__Area__ToAssignment_3 )
            // InternalBmod.g:1598:3: rule__Area__ToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Area__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getToAssignment_3()); 

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
    // $ANTLR end "rule__Area__Group__3__Impl"


    // $ANTLR start "rule__Area__Group__4"
    // InternalBmod.g:1606:1: rule__Area__Group__4 : rule__Area__Group__4__Impl ;
    public final void rule__Area__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1610:1: ( rule__Area__Group__4__Impl )
            // InternalBmod.g:1611:2: rule__Area__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__4__Impl();

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
    // $ANTLR end "rule__Area__Group__4"


    // $ANTLR start "rule__Area__Group__4__Impl"
    // InternalBmod.g:1617:1: rule__Area__Group__4__Impl : ( ( rule__Area__Group_4__0 )? ) ;
    public final void rule__Area__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1621:1: ( ( ( rule__Area__Group_4__0 )? ) )
            // InternalBmod.g:1622:1: ( ( rule__Area__Group_4__0 )? )
            {
            // InternalBmod.g:1622:1: ( ( rule__Area__Group_4__0 )? )
            // InternalBmod.g:1623:2: ( rule__Area__Group_4__0 )?
            {
             before(grammarAccess.getAreaAccess().getGroup_4()); 
            // InternalBmod.g:1624:2: ( rule__Area__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBmod.g:1624:3: rule__Area__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Area__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAreaAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Area__Group__4__Impl"


    // $ANTLR start "rule__Area__Group_4__0"
    // InternalBmod.g:1633:1: rule__Area__Group_4__0 : rule__Area__Group_4__0__Impl rule__Area__Group_4__1 ;
    public final void rule__Area__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1637:1: ( rule__Area__Group_4__0__Impl rule__Area__Group_4__1 )
            // InternalBmod.g:1638:2: rule__Area__Group_4__0__Impl rule__Area__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Area__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group_4__1();

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
    // $ANTLR end "rule__Area__Group_4__0"


    // $ANTLR start "rule__Area__Group_4__0__Impl"
    // InternalBmod.g:1645:1: rule__Area__Group_4__0__Impl : ( 'without' ) ;
    public final void rule__Area__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1649:1: ( ( 'without' ) )
            // InternalBmod.g:1650:1: ( 'without' )
            {
            // InternalBmod.g:1650:1: ( 'without' )
            // InternalBmod.g:1651:2: 'without'
            {
             before(grammarAccess.getAreaAccess().getWithoutKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getWithoutKeyword_4_0()); 

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
    // $ANTLR end "rule__Area__Group_4__0__Impl"


    // $ANTLR start "rule__Area__Group_4__1"
    // InternalBmod.g:1660:1: rule__Area__Group_4__1 : rule__Area__Group_4__1__Impl rule__Area__Group_4__2 ;
    public final void rule__Area__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1664:1: ( rule__Area__Group_4__1__Impl rule__Area__Group_4__2 )
            // InternalBmod.g:1665:2: rule__Area__Group_4__1__Impl rule__Area__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__Area__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group_4__2();

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
    // $ANTLR end "rule__Area__Group_4__1"


    // $ANTLR start "rule__Area__Group_4__1__Impl"
    // InternalBmod.g:1672:1: rule__Area__Group_4__1__Impl : ( ( rule__Area__WithoutAssignment_4_1 ) ) ;
    public final void rule__Area__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1676:1: ( ( ( rule__Area__WithoutAssignment_4_1 ) ) )
            // InternalBmod.g:1677:1: ( ( rule__Area__WithoutAssignment_4_1 ) )
            {
            // InternalBmod.g:1677:1: ( ( rule__Area__WithoutAssignment_4_1 ) )
            // InternalBmod.g:1678:2: ( rule__Area__WithoutAssignment_4_1 )
            {
             before(grammarAccess.getAreaAccess().getWithoutAssignment_4_1()); 
            // InternalBmod.g:1679:2: ( rule__Area__WithoutAssignment_4_1 )
            // InternalBmod.g:1679:3: rule__Area__WithoutAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Area__WithoutAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getWithoutAssignment_4_1()); 

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
    // $ANTLR end "rule__Area__Group_4__1__Impl"


    // $ANTLR start "rule__Area__Group_4__2"
    // InternalBmod.g:1687:1: rule__Area__Group_4__2 : rule__Area__Group_4__2__Impl ;
    public final void rule__Area__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1691:1: ( rule__Area__Group_4__2__Impl )
            // InternalBmod.g:1692:2: rule__Area__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group_4__2__Impl();

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
    // $ANTLR end "rule__Area__Group_4__2"


    // $ANTLR start "rule__Area__Group_4__2__Impl"
    // InternalBmod.g:1698:1: rule__Area__Group_4__2__Impl : ( ( rule__Area__Group_4_2__0 )* ) ;
    public final void rule__Area__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1702:1: ( ( ( rule__Area__Group_4_2__0 )* ) )
            // InternalBmod.g:1703:1: ( ( rule__Area__Group_4_2__0 )* )
            {
            // InternalBmod.g:1703:1: ( ( rule__Area__Group_4_2__0 )* )
            // InternalBmod.g:1704:2: ( rule__Area__Group_4_2__0 )*
            {
             before(grammarAccess.getAreaAccess().getGroup_4_2()); 
            // InternalBmod.g:1705:2: ( rule__Area__Group_4_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBmod.g:1705:3: rule__Area__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Area__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAreaAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__Area__Group_4__2__Impl"


    // $ANTLR start "rule__Area__Group_4_2__0"
    // InternalBmod.g:1714:1: rule__Area__Group_4_2__0 : rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1 ;
    public final void rule__Area__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1718:1: ( rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1 )
            // InternalBmod.g:1719:2: rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Area__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group_4_2__1();

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
    // $ANTLR end "rule__Area__Group_4_2__0"


    // $ANTLR start "rule__Area__Group_4_2__0__Impl"
    // InternalBmod.g:1726:1: rule__Area__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Area__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1730:1: ( ( ',' ) )
            // InternalBmod.g:1731:1: ( ',' )
            {
            // InternalBmod.g:1731:1: ( ',' )
            // InternalBmod.g:1732:2: ','
            {
             before(grammarAccess.getAreaAccess().getCommaKeyword_4_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Area__Group_4_2__0__Impl"


    // $ANTLR start "rule__Area__Group_4_2__1"
    // InternalBmod.g:1741:1: rule__Area__Group_4_2__1 : rule__Area__Group_4_2__1__Impl ;
    public final void rule__Area__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1745:1: ( rule__Area__Group_4_2__1__Impl )
            // InternalBmod.g:1746:2: rule__Area__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Area__Group_4_2__1"


    // $ANTLR start "rule__Area__Group_4_2__1__Impl"
    // InternalBmod.g:1752:1: rule__Area__Group_4_2__1__Impl : ( ( rule__Area__WithoutAssignment_4_2_1 ) ) ;
    public final void rule__Area__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1756:1: ( ( ( rule__Area__WithoutAssignment_4_2_1 ) ) )
            // InternalBmod.g:1757:1: ( ( rule__Area__WithoutAssignment_4_2_1 ) )
            {
            // InternalBmod.g:1757:1: ( ( rule__Area__WithoutAssignment_4_2_1 ) )
            // InternalBmod.g:1758:2: ( rule__Area__WithoutAssignment_4_2_1 )
            {
             before(grammarAccess.getAreaAccess().getWithoutAssignment_4_2_1()); 
            // InternalBmod.g:1759:2: ( rule__Area__WithoutAssignment_4_2_1 )
            // InternalBmod.g:1759:3: rule__Area__WithoutAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Area__WithoutAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getWithoutAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Area__Group_4_2__1__Impl"


    // $ANTLR start "rule__Floorplan__RoomsAssignment_1_0"
    // InternalBmod.g:1768:1: rule__Floorplan__RoomsAssignment_1_0 : ( ruleRoom ) ;
    public final void rule__Floorplan__RoomsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1772:1: ( ( ruleRoom ) )
            // InternalBmod.g:1773:2: ( ruleRoom )
            {
            // InternalBmod.g:1773:2: ( ruleRoom )
            // InternalBmod.g:1774:3: ruleRoom
            {
             before(grammarAccess.getFloorplanAccess().getRoomsRoomParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getRoomsRoomParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Floorplan__RoomsAssignment_1_0"


    // $ANTLR start "rule__Floorplan__DoorsAssignment_1_1"
    // InternalBmod.g:1783:1: rule__Floorplan__DoorsAssignment_1_1 : ( ruleDoor ) ;
    public final void rule__Floorplan__DoorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1787:1: ( ( ruleDoor ) )
            // InternalBmod.g:1788:2: ( ruleDoor )
            {
            // InternalBmod.g:1788:2: ( ruleDoor )
            // InternalBmod.g:1789:3: ruleDoor
            {
             before(grammarAccess.getFloorplanAccess().getDoorsDoorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDoor();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getDoorsDoorParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Floorplan__DoorsAssignment_1_1"


    // $ANTLR start "rule__Floorplan__PersonsAssignment_1_2"
    // InternalBmod.g:1798:1: rule__Floorplan__PersonsAssignment_1_2 : ( rulePerson ) ;
    public final void rule__Floorplan__PersonsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1802:1: ( ( rulePerson ) )
            // InternalBmod.g:1803:2: ( rulePerson )
            {
            // InternalBmod.g:1803:2: ( rulePerson )
            // InternalBmod.g:1804:3: rulePerson
            {
             before(grammarAccess.getFloorplanAccess().getPersonsPersonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getPersonsPersonParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Floorplan__PersonsAssignment_1_2"


    // $ANTLR start "rule__Floorplan__ProfilesAssignment_1_3"
    // InternalBmod.g:1813:1: rule__Floorplan__ProfilesAssignment_1_3 : ( ruleProfile ) ;
    public final void rule__Floorplan__ProfilesAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1817:1: ( ( ruleProfile ) )
            // InternalBmod.g:1818:2: ( ruleProfile )
            {
            // InternalBmod.g:1818:2: ( ruleProfile )
            // InternalBmod.g:1819:3: ruleProfile
            {
             before(grammarAccess.getFloorplanAccess().getProfilesProfileParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProfile();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getProfilesProfileParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__Floorplan__ProfilesAssignment_1_3"


    // $ANTLR start "rule__Floorplan__LevelsAssignment_1_4"
    // InternalBmod.g:1828:1: rule__Floorplan__LevelsAssignment_1_4 : ( ruleLevel ) ;
    public final void rule__Floorplan__LevelsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1832:1: ( ( ruleLevel ) )
            // InternalBmod.g:1833:2: ( ruleLevel )
            {
            // InternalBmod.g:1833:2: ( ruleLevel )
            // InternalBmod.g:1834:3: ruleLevel
            {
             before(grammarAccess.getFloorplanAccess().getLevelsLevelParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLevel();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getLevelsLevelParserRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__Floorplan__LevelsAssignment_1_4"


    // $ANTLR start "rule__Room__NameAssignment_1"
    // InternalBmod.g:1843:1: rule__Room__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Room__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1847:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:1848:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:1848:2: ( RULE_VARNAME )
            // InternalBmod.g:1849:3: RULE_VARNAME
            {
             before(grammarAccess.getRoomAccess().getNameVARNAMETerminalRuleCall_1_0()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getNameVARNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Room__NameAssignment_1"


    // $ANTLR start "rule__Room__NamedAssignment_3"
    // InternalBmod.g:1858:1: rule__Room__NamedAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Room__NamedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1862:1: ( ( RULE_STRING ) )
            // InternalBmod.g:1863:2: ( RULE_STRING )
            {
            // InternalBmod.g:1863:2: ( RULE_STRING )
            // InternalBmod.g:1864:3: RULE_STRING
            {
             before(grammarAccess.getRoomAccess().getNamedSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getNamedSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Room__NamedAssignment_3"


    // $ANTLR start "rule__Room__AreaAssignment_4"
    // InternalBmod.g:1873:1: rule__Room__AreaAssignment_4 : ( ruleArea ) ;
    public final void rule__Room__AreaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1877:1: ( ( ruleArea ) )
            // InternalBmod.g:1878:2: ( ruleArea )
            {
            // InternalBmod.g:1878:2: ( ruleArea )
            // InternalBmod.g:1879:3: ruleArea
            {
             before(grammarAccess.getRoomAccess().getAreaAreaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArea();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getAreaAreaParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Room__AreaAssignment_4"


    // $ANTLR start "rule__Door__NameAssignment_1"
    // InternalBmod.g:1888:1: rule__Door__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Door__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1892:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:1893:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:1893:2: ( RULE_VARNAME )
            // InternalBmod.g:1894:3: RULE_VARNAME
            {
             before(grammarAccess.getDoorAccess().getNameVARNAMETerminalRuleCall_1_0()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getDoorAccess().getNameVARNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Door__NameAssignment_1"


    // $ANTLR start "rule__Door__FromAssignment_3"
    // InternalBmod.g:1903:1: rule__Door__FromAssignment_3 : ( ruleCoordinate ) ;
    public final void rule__Door__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1907:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:1908:2: ( ruleCoordinate )
            {
            // InternalBmod.g:1908:2: ( ruleCoordinate )
            // InternalBmod.g:1909:3: ruleCoordinate
            {
             before(grammarAccess.getDoorAccess().getFromCoordinateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getDoorAccess().getFromCoordinateParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Door__FromAssignment_3"


    // $ANTLR start "rule__Door__ToAssignment_5"
    // InternalBmod.g:1918:1: rule__Door__ToAssignment_5 : ( ruleCoordinate ) ;
    public final void rule__Door__ToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1922:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:1923:2: ( ruleCoordinate )
            {
            // InternalBmod.g:1923:2: ( ruleCoordinate )
            // InternalBmod.g:1924:3: ruleCoordinate
            {
             before(grammarAccess.getDoorAccess().getToCoordinateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getDoorAccess().getToCoordinateParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Door__ToAssignment_5"


    // $ANTLR start "rule__Profile__NameAssignment_1"
    // InternalBmod.g:1933:1: rule__Profile__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Profile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1937:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:1938:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:1938:2: ( RULE_VARNAME )
            // InternalBmod.g:1939:3: RULE_VARNAME
            {
             before(grammarAccess.getProfileAccess().getNameVARNAMETerminalRuleCall_1_0()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getProfileAccess().getNameVARNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Profile__NameAssignment_1"


    // $ANTLR start "rule__Level__NameAssignment_1"
    // InternalBmod.g:1948:1: rule__Level__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Level__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1952:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:1953:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:1953:2: ( RULE_VARNAME )
            // InternalBmod.g:1954:3: RULE_VARNAME
            {
             before(grammarAccess.getLevelAccess().getNameVARNAMETerminalRuleCall_1_0()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getLevelAccess().getNameVARNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Level__NameAssignment_1"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalBmod.g:1963:1: rule__Person__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1967:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:1968:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:1968:2: ( RULE_VARNAME )
            // InternalBmod.g:1969:3: RULE_VARNAME
            {
             before(grammarAccess.getPersonAccess().getNameVARNAMETerminalRuleCall_1_0()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNameVARNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Person__NameAssignment_1"


    // $ANTLR start "rule__Person__NamedAssignment_3"
    // InternalBmod.g:1978:1: rule__Person__NamedAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Person__NamedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1982:1: ( ( RULE_STRING ) )
            // InternalBmod.g:1983:2: ( RULE_STRING )
            {
            // InternalBmod.g:1983:2: ( RULE_STRING )
            // InternalBmod.g:1984:3: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getNamedSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNamedSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Person__NamedAssignment_3"


    // $ANTLR start "rule__Person__LocationAssignment_5"
    // InternalBmod.g:1993:1: rule__Person__LocationAssignment_5 : ( ruleCoordinate ) ;
    public final void rule__Person__LocationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1997:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:1998:2: ( ruleCoordinate )
            {
            // InternalBmod.g:1998:2: ( ruleCoordinate )
            // InternalBmod.g:1999:3: ruleCoordinate
            {
             before(grammarAccess.getPersonAccess().getLocationCoordinateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getLocationCoordinateParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Person__LocationAssignment_5"


    // $ANTLR start "rule__Person__ProfileAssignment_6_0_2"
    // InternalBmod.g:2008:1: rule__Person__ProfileAssignment_6_0_2 : ( ( RULE_VARNAME ) ) ;
    public final void rule__Person__ProfileAssignment_6_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2012:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2013:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2013:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2014:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getPersonAccess().getProfileProfileCrossReference_6_0_2_0()); 
            // InternalBmod.g:2015:3: ( RULE_VARNAME )
            // InternalBmod.g:2016:4: RULE_VARNAME
            {
             before(grammarAccess.getPersonAccess().getProfileProfileVARNAMETerminalRuleCall_6_0_2_0_1()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getProfileProfileVARNAMETerminalRuleCall_6_0_2_0_1()); 

            }

             after(grammarAccess.getPersonAccess().getProfileProfileCrossReference_6_0_2_0()); 

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
    // $ANTLR end "rule__Person__ProfileAssignment_6_0_2"


    // $ANTLR start "rule__Person__LevelAssignment_6_0_6"
    // InternalBmod.g:2027:1: rule__Person__LevelAssignment_6_0_6 : ( ( RULE_VARNAME ) ) ;
    public final void rule__Person__LevelAssignment_6_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2031:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2032:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2032:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2033:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getPersonAccess().getLevelLevelCrossReference_6_0_6_0()); 
            // InternalBmod.g:2034:3: ( RULE_VARNAME )
            // InternalBmod.g:2035:4: RULE_VARNAME
            {
             before(grammarAccess.getPersonAccess().getLevelLevelVARNAMETerminalRuleCall_6_0_6_0_1()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLevelLevelVARNAMETerminalRuleCall_6_0_6_0_1()); 

            }

             after(grammarAccess.getPersonAccess().getLevelLevelCrossReference_6_0_6_0()); 

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
    // $ANTLR end "rule__Person__LevelAssignment_6_0_6"


    // $ANTLR start "rule__Person__ProfileAssignment_6_1_2"
    // InternalBmod.g:2046:1: rule__Person__ProfileAssignment_6_1_2 : ( ( RULE_VARNAME ) ) ;
    public final void rule__Person__ProfileAssignment_6_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2050:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2051:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2051:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2052:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getPersonAccess().getProfileLevelCrossReference_6_1_2_0()); 
            // InternalBmod.g:2053:3: ( RULE_VARNAME )
            // InternalBmod.g:2054:4: RULE_VARNAME
            {
             before(grammarAccess.getPersonAccess().getProfileLevelVARNAMETerminalRuleCall_6_1_2_0_1()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getProfileLevelVARNAMETerminalRuleCall_6_1_2_0_1()); 

            }

             after(grammarAccess.getPersonAccess().getProfileLevelCrossReference_6_1_2_0()); 

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
    // $ANTLR end "rule__Person__ProfileAssignment_6_1_2"


    // $ANTLR start "rule__Person__LevelAssignment_6_1_6"
    // InternalBmod.g:2065:1: rule__Person__LevelAssignment_6_1_6 : ( ( RULE_VARNAME ) ) ;
    public final void rule__Person__LevelAssignment_6_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2069:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2070:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2070:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2071:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getPersonAccess().getLevelProfileCrossReference_6_1_6_0()); 
            // InternalBmod.g:2072:3: ( RULE_VARNAME )
            // InternalBmod.g:2073:4: RULE_VARNAME
            {
             before(grammarAccess.getPersonAccess().getLevelProfileVARNAMETerminalRuleCall_6_1_6_0_1()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLevelProfileVARNAMETerminalRuleCall_6_1_6_0_1()); 

            }

             after(grammarAccess.getPersonAccess().getLevelProfileCrossReference_6_1_6_0()); 

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
    // $ANTLR end "rule__Person__LevelAssignment_6_1_6"


    // $ANTLR start "rule__Coordinate__XAssignment_1"
    // InternalBmod.g:2084:1: rule__Coordinate__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Coordinate__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2088:1: ( ( RULE_INT ) )
            // InternalBmod.g:2089:2: ( RULE_INT )
            {
            // InternalBmod.g:2089:2: ( RULE_INT )
            // InternalBmod.g:2090:3: RULE_INT
            {
             before(grammarAccess.getCoordinateAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordinateAccess().getXINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Coordinate__XAssignment_1"


    // $ANTLR start "rule__Coordinate__YAssignment_3"
    // InternalBmod.g:2099:1: rule__Coordinate__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Coordinate__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2103:1: ( ( RULE_INT ) )
            // InternalBmod.g:2104:2: ( RULE_INT )
            {
            // InternalBmod.g:2104:2: ( RULE_INT )
            // InternalBmod.g:2105:3: RULE_INT
            {
             before(grammarAccess.getCoordinateAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordinateAccess().getYINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Coordinate__YAssignment_3"


    // $ANTLR start "rule__Area__FromAssignment_1"
    // InternalBmod.g:2114:1: rule__Area__FromAssignment_1 : ( ruleCoordinate ) ;
    public final void rule__Area__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2118:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2119:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2119:2: ( ruleCoordinate )
            // InternalBmod.g:2120:3: ruleCoordinate
            {
             before(grammarAccess.getAreaAccess().getFromCoordinateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getAreaAccess().getFromCoordinateParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Area__FromAssignment_1"


    // $ANTLR start "rule__Area__ToAssignment_3"
    // InternalBmod.g:2129:1: rule__Area__ToAssignment_3 : ( ruleCoordinate ) ;
    public final void rule__Area__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2133:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2134:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2134:2: ( ruleCoordinate )
            // InternalBmod.g:2135:3: ruleCoordinate
            {
             before(grammarAccess.getAreaAccess().getToCoordinateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getAreaAccess().getToCoordinateParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Area__ToAssignment_3"


    // $ANTLR start "rule__Area__WithoutAssignment_4_1"
    // InternalBmod.g:2144:1: rule__Area__WithoutAssignment_4_1 : ( ruleCoordinate ) ;
    public final void rule__Area__WithoutAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2148:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2149:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2149:2: ( ruleCoordinate )
            // InternalBmod.g:2150:3: ruleCoordinate
            {
             before(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Area__WithoutAssignment_4_1"


    // $ANTLR start "rule__Area__WithoutAssignment_4_2_1"
    // InternalBmod.g:2159:1: rule__Area__WithoutAssignment_4_2_1 : ( ruleCoordinate ) ;
    public final void rule__Area__WithoutAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2163:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2164:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2164:2: ( ruleCoordinate )
            // InternalBmod.g:2165:3: ruleCoordinate
            {
             before(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__Area__WithoutAssignment_4_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000E5000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000E5002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400002L});

}