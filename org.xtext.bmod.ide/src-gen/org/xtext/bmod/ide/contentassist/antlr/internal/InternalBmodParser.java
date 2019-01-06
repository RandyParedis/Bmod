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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARNAME", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'attentive'", "'relaxed'", "'optimistic'", "'sceptic'", "'newcomer'", "'experienced'", "'panic'", "'Room'", "'named'", "'and'", "'Door'", "'from'", "'to'", "'PerceptionLevel'", "'ActionProfile'", "'Person'", "'in'", "':'", "','", "'Exit'", "'Sign'", "'on'", "'Condition'", "'('", "')'", "'without'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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


    // $ANTLR start "entryRulePerceptionLevel"
    // InternalBmod.g:153:1: entryRulePerceptionLevel : rulePerceptionLevel EOF ;
    public final void entryRulePerceptionLevel() throws RecognitionException {
        try {
            // InternalBmod.g:154:1: ( rulePerceptionLevel EOF )
            // InternalBmod.g:155:1: rulePerceptionLevel EOF
            {
             before(grammarAccess.getPerceptionLevelRule()); 
            pushFollow(FOLLOW_1);
            rulePerceptionLevel();

            state._fsp--;

             after(grammarAccess.getPerceptionLevelRule()); 
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
    // $ANTLR end "entryRulePerceptionLevel"


    // $ANTLR start "rulePerceptionLevel"
    // InternalBmod.g:162:1: rulePerceptionLevel : ( ( rule__PerceptionLevel__Group__0 ) ) ;
    public final void rulePerceptionLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:166:2: ( ( ( rule__PerceptionLevel__Group__0 ) ) )
            // InternalBmod.g:167:2: ( ( rule__PerceptionLevel__Group__0 ) )
            {
            // InternalBmod.g:167:2: ( ( rule__PerceptionLevel__Group__0 ) )
            // InternalBmod.g:168:3: ( rule__PerceptionLevel__Group__0 )
            {
             before(grammarAccess.getPerceptionLevelAccess().getGroup()); 
            // InternalBmod.g:169:3: ( rule__PerceptionLevel__Group__0 )
            // InternalBmod.g:169:4: rule__PerceptionLevel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PerceptionLevel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerceptionLevelAccess().getGroup()); 

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
    // $ANTLR end "rulePerceptionLevel"


    // $ANTLR start "entryRuleActionProfile"
    // InternalBmod.g:178:1: entryRuleActionProfile : ruleActionProfile EOF ;
    public final void entryRuleActionProfile() throws RecognitionException {
        try {
            // InternalBmod.g:179:1: ( ruleActionProfile EOF )
            // InternalBmod.g:180:1: ruleActionProfile EOF
            {
             before(grammarAccess.getActionProfileRule()); 
            pushFollow(FOLLOW_1);
            ruleActionProfile();

            state._fsp--;

             after(grammarAccess.getActionProfileRule()); 
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
    // $ANTLR end "entryRuleActionProfile"


    // $ANTLR start "ruleActionProfile"
    // InternalBmod.g:187:1: ruleActionProfile : ( ( rule__ActionProfile__Group__0 ) ) ;
    public final void ruleActionProfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:191:2: ( ( ( rule__ActionProfile__Group__0 ) ) )
            // InternalBmod.g:192:2: ( ( rule__ActionProfile__Group__0 ) )
            {
            // InternalBmod.g:192:2: ( ( rule__ActionProfile__Group__0 ) )
            // InternalBmod.g:193:3: ( rule__ActionProfile__Group__0 )
            {
             before(grammarAccess.getActionProfileAccess().getGroup()); 
            // InternalBmod.g:194:3: ( rule__ActionProfile__Group__0 )
            // InternalBmod.g:194:4: rule__ActionProfile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionProfile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionProfileAccess().getGroup()); 

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
    // $ANTLR end "ruleActionProfile"


    // $ANTLR start "entryRulePerception"
    // InternalBmod.g:203:1: entryRulePerception : rulePerception EOF ;
    public final void entryRulePerception() throws RecognitionException {
        try {
            // InternalBmod.g:204:1: ( rulePerception EOF )
            // InternalBmod.g:205:1: rulePerception EOF
            {
             before(grammarAccess.getPerceptionRule()); 
            pushFollow(FOLLOW_1);
            rulePerception();

            state._fsp--;

             after(grammarAccess.getPerceptionRule()); 
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
    // $ANTLR end "entryRulePerception"


    // $ANTLR start "rulePerception"
    // InternalBmod.g:212:1: rulePerception : ( ( rule__Perception__Alternatives ) ) ;
    public final void rulePerception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:216:2: ( ( ( rule__Perception__Alternatives ) ) )
            // InternalBmod.g:217:2: ( ( rule__Perception__Alternatives ) )
            {
            // InternalBmod.g:217:2: ( ( rule__Perception__Alternatives ) )
            // InternalBmod.g:218:3: ( rule__Perception__Alternatives )
            {
             before(grammarAccess.getPerceptionAccess().getAlternatives()); 
            // InternalBmod.g:219:3: ( rule__Perception__Alternatives )
            // InternalBmod.g:219:4: rule__Perception__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Perception__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPerceptionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePerception"


    // $ANTLR start "entryRuleAction"
    // InternalBmod.g:228:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalBmod.g:229:1: ( ruleAction EOF )
            // InternalBmod.g:230:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalBmod.g:237:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:241:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalBmod.g:242:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalBmod.g:242:2: ( ( rule__Action__Alternatives ) )
            // InternalBmod.g:243:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalBmod.g:244:3: ( rule__Action__Alternatives )
            // InternalBmod.g:244:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRulePerson"
    // InternalBmod.g:253:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalBmod.g:254:1: ( rulePerson EOF )
            // InternalBmod.g:255:1: rulePerson EOF
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
    // InternalBmod.g:262:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:266:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalBmod.g:267:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalBmod.g:267:2: ( ( rule__Person__Group__0 ) )
            // InternalBmod.g:268:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalBmod.g:269:3: ( rule__Person__Group__0 )
            // InternalBmod.g:269:4: rule__Person__Group__0
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


    // $ANTLR start "entryRuleExit"
    // InternalBmod.g:278:1: entryRuleExit : ruleExit EOF ;
    public final void entryRuleExit() throws RecognitionException {
        try {
            // InternalBmod.g:279:1: ( ruleExit EOF )
            // InternalBmod.g:280:1: ruleExit EOF
            {
             before(grammarAccess.getExitRule()); 
            pushFollow(FOLLOW_1);
            ruleExit();

            state._fsp--;

             after(grammarAccess.getExitRule()); 
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
    // $ANTLR end "entryRuleExit"


    // $ANTLR start "ruleExit"
    // InternalBmod.g:287:1: ruleExit : ( ( rule__Exit__Group__0 ) ) ;
    public final void ruleExit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:291:2: ( ( ( rule__Exit__Group__0 ) ) )
            // InternalBmod.g:292:2: ( ( rule__Exit__Group__0 ) )
            {
            // InternalBmod.g:292:2: ( ( rule__Exit__Group__0 ) )
            // InternalBmod.g:293:3: ( rule__Exit__Group__0 )
            {
             before(grammarAccess.getExitAccess().getGroup()); 
            // InternalBmod.g:294:3: ( rule__Exit__Group__0 )
            // InternalBmod.g:294:4: rule__Exit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExitAccess().getGroup()); 

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
    // $ANTLR end "ruleExit"


    // $ANTLR start "entryRuleEmergencySign"
    // InternalBmod.g:303:1: entryRuleEmergencySign : ruleEmergencySign EOF ;
    public final void entryRuleEmergencySign() throws RecognitionException {
        try {
            // InternalBmod.g:304:1: ( ruleEmergencySign EOF )
            // InternalBmod.g:305:1: ruleEmergencySign EOF
            {
             before(grammarAccess.getEmergencySignRule()); 
            pushFollow(FOLLOW_1);
            ruleEmergencySign();

            state._fsp--;

             after(grammarAccess.getEmergencySignRule()); 
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
    // $ANTLR end "entryRuleEmergencySign"


    // $ANTLR start "ruleEmergencySign"
    // InternalBmod.g:312:1: ruleEmergencySign : ( ( rule__EmergencySign__Group__0 ) ) ;
    public final void ruleEmergencySign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:316:2: ( ( ( rule__EmergencySign__Group__0 ) ) )
            // InternalBmod.g:317:2: ( ( rule__EmergencySign__Group__0 ) )
            {
            // InternalBmod.g:317:2: ( ( rule__EmergencySign__Group__0 ) )
            // InternalBmod.g:318:3: ( rule__EmergencySign__Group__0 )
            {
             before(grammarAccess.getEmergencySignAccess().getGroup()); 
            // InternalBmod.g:319:3: ( rule__EmergencySign__Group__0 )
            // InternalBmod.g:319:4: rule__EmergencySign__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EmergencySign__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmergencySignAccess().getGroup()); 

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
    // $ANTLR end "ruleEmergencySign"


    // $ANTLR start "entryRuleDoorRef"
    // InternalBmod.g:328:1: entryRuleDoorRef : ruleDoorRef EOF ;
    public final void entryRuleDoorRef() throws RecognitionException {
        try {
            // InternalBmod.g:329:1: ( ruleDoorRef EOF )
            // InternalBmod.g:330:1: ruleDoorRef EOF
            {
             before(grammarAccess.getDoorRefRule()); 
            pushFollow(FOLLOW_1);
            ruleDoorRef();

            state._fsp--;

             after(grammarAccess.getDoorRefRule()); 
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
    // $ANTLR end "entryRuleDoorRef"


    // $ANTLR start "ruleDoorRef"
    // InternalBmod.g:337:1: ruleDoorRef : ( ( rule__DoorRef__Group__0 ) ) ;
    public final void ruleDoorRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:341:2: ( ( ( rule__DoorRef__Group__0 ) ) )
            // InternalBmod.g:342:2: ( ( rule__DoorRef__Group__0 ) )
            {
            // InternalBmod.g:342:2: ( ( rule__DoorRef__Group__0 ) )
            // InternalBmod.g:343:3: ( rule__DoorRef__Group__0 )
            {
             before(grammarAccess.getDoorRefAccess().getGroup()); 
            // InternalBmod.g:344:3: ( rule__DoorRef__Group__0 )
            // InternalBmod.g:344:4: rule__DoorRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoorRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoorRefAccess().getGroup()); 

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
    // $ANTLR end "ruleDoorRef"


    // $ANTLR start "entryRuleDangerousCondition"
    // InternalBmod.g:353:1: entryRuleDangerousCondition : ruleDangerousCondition EOF ;
    public final void entryRuleDangerousCondition() throws RecognitionException {
        try {
            // InternalBmod.g:354:1: ( ruleDangerousCondition EOF )
            // InternalBmod.g:355:1: ruleDangerousCondition EOF
            {
             before(grammarAccess.getDangerousConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleDangerousCondition();

            state._fsp--;

             after(grammarAccess.getDangerousConditionRule()); 
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
    // $ANTLR end "entryRuleDangerousCondition"


    // $ANTLR start "ruleDangerousCondition"
    // InternalBmod.g:362:1: ruleDangerousCondition : ( ( rule__DangerousCondition__Group__0 ) ) ;
    public final void ruleDangerousCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:366:2: ( ( ( rule__DangerousCondition__Group__0 ) ) )
            // InternalBmod.g:367:2: ( ( rule__DangerousCondition__Group__0 ) )
            {
            // InternalBmod.g:367:2: ( ( rule__DangerousCondition__Group__0 ) )
            // InternalBmod.g:368:3: ( rule__DangerousCondition__Group__0 )
            {
             before(grammarAccess.getDangerousConditionAccess().getGroup()); 
            // InternalBmod.g:369:3: ( rule__DangerousCondition__Group__0 )
            // InternalBmod.g:369:4: rule__DangerousCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DangerousCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDangerousConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleDangerousCondition"


    // $ANTLR start "entryRuleCoordinate"
    // InternalBmod.g:378:1: entryRuleCoordinate : ruleCoordinate EOF ;
    public final void entryRuleCoordinate() throws RecognitionException {
        try {
            // InternalBmod.g:379:1: ( ruleCoordinate EOF )
            // InternalBmod.g:380:1: ruleCoordinate EOF
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
    // InternalBmod.g:387:1: ruleCoordinate : ( ( rule__Coordinate__Group__0 ) ) ;
    public final void ruleCoordinate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:391:2: ( ( ( rule__Coordinate__Group__0 ) ) )
            // InternalBmod.g:392:2: ( ( rule__Coordinate__Group__0 ) )
            {
            // InternalBmod.g:392:2: ( ( rule__Coordinate__Group__0 ) )
            // InternalBmod.g:393:3: ( rule__Coordinate__Group__0 )
            {
             before(grammarAccess.getCoordinateAccess().getGroup()); 
            // InternalBmod.g:394:3: ( rule__Coordinate__Group__0 )
            // InternalBmod.g:394:4: rule__Coordinate__Group__0
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
    // InternalBmod.g:403:1: entryRuleArea : ruleArea EOF ;
    public final void entryRuleArea() throws RecognitionException {
        try {
            // InternalBmod.g:404:1: ( ruleArea EOF )
            // InternalBmod.g:405:1: ruleArea EOF
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
    // InternalBmod.g:412:1: ruleArea : ( ( rule__Area__Group__0 ) ) ;
    public final void ruleArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:416:2: ( ( ( rule__Area__Group__0 ) ) )
            // InternalBmod.g:417:2: ( ( rule__Area__Group__0 ) )
            {
            // InternalBmod.g:417:2: ( ( rule__Area__Group__0 ) )
            // InternalBmod.g:418:3: ( rule__Area__Group__0 )
            {
             before(grammarAccess.getAreaAccess().getGroup()); 
            // InternalBmod.g:419:3: ( rule__Area__Group__0 )
            // InternalBmod.g:419:4: rule__Area__Group__0
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


    // $ANTLR start "rulePerceptionEnum"
    // InternalBmod.g:428:1: rulePerceptionEnum : ( ( rule__PerceptionEnum__Alternatives ) ) ;
    public final void rulePerceptionEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:432:1: ( ( ( rule__PerceptionEnum__Alternatives ) ) )
            // InternalBmod.g:433:2: ( ( rule__PerceptionEnum__Alternatives ) )
            {
            // InternalBmod.g:433:2: ( ( rule__PerceptionEnum__Alternatives ) )
            // InternalBmod.g:434:3: ( rule__PerceptionEnum__Alternatives )
            {
             before(grammarAccess.getPerceptionEnumAccess().getAlternatives()); 
            // InternalBmod.g:435:3: ( rule__PerceptionEnum__Alternatives )
            // InternalBmod.g:435:4: rule__PerceptionEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PerceptionEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPerceptionEnumAccess().getAlternatives()); 

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
    // $ANTLR end "rulePerceptionEnum"


    // $ANTLR start "ruleActionEnum"
    // InternalBmod.g:444:1: ruleActionEnum : ( ( rule__ActionEnum__Alternatives ) ) ;
    public final void ruleActionEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:448:1: ( ( ( rule__ActionEnum__Alternatives ) ) )
            // InternalBmod.g:449:2: ( ( rule__ActionEnum__Alternatives ) )
            {
            // InternalBmod.g:449:2: ( ( rule__ActionEnum__Alternatives ) )
            // InternalBmod.g:450:3: ( rule__ActionEnum__Alternatives )
            {
             before(grammarAccess.getActionEnumAccess().getAlternatives()); 
            // InternalBmod.g:451:3: ( rule__ActionEnum__Alternatives )
            // InternalBmod.g:451:4: rule__ActionEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionEnumAccess().getAlternatives()); 

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
    // $ANTLR end "ruleActionEnum"


    // $ANTLR start "rule__Floorplan__Alternatives_1"
    // InternalBmod.g:459:1: rule__Floorplan__Alternatives_1 : ( ( ( rule__Floorplan__PerceptionsAssignment_1_0 ) ) | ( ( rule__Floorplan__ActionsAssignment_1_1 ) ) | ( ( rule__Floorplan__RoomsAssignment_1_2 ) ) | ( ( rule__Floorplan__DoorsAssignment_1_3 ) ) | ( ( rule__Floorplan__PersonsAssignment_1_4 ) ) | ( ( rule__Floorplan__ExitsAssignment_1_5 ) ) | ( ( rule__Floorplan__SignsAssignment_1_6 ) ) | ( ( rule__Floorplan__DanconsAssignment_1_7 ) ) );
    public final void rule__Floorplan__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:463:1: ( ( ( rule__Floorplan__PerceptionsAssignment_1_0 ) ) | ( ( rule__Floorplan__ActionsAssignment_1_1 ) ) | ( ( rule__Floorplan__RoomsAssignment_1_2 ) ) | ( ( rule__Floorplan__DoorsAssignment_1_3 ) ) | ( ( rule__Floorplan__PersonsAssignment_1_4 ) ) | ( ( rule__Floorplan__ExitsAssignment_1_5 ) ) | ( ( rule__Floorplan__SignsAssignment_1_6 ) ) | ( ( rule__Floorplan__DanconsAssignment_1_7 ) ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            case 27:
                {
                alt1=5;
                }
                break;
            case 31:
                {
                alt1=6;
                }
                break;
            case 32:
                {
                alt1=7;
                }
                break;
            case 34:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBmod.g:464:2: ( ( rule__Floorplan__PerceptionsAssignment_1_0 ) )
                    {
                    // InternalBmod.g:464:2: ( ( rule__Floorplan__PerceptionsAssignment_1_0 ) )
                    // InternalBmod.g:465:3: ( rule__Floorplan__PerceptionsAssignment_1_0 )
                    {
                     before(grammarAccess.getFloorplanAccess().getPerceptionsAssignment_1_0()); 
                    // InternalBmod.g:466:3: ( rule__Floorplan__PerceptionsAssignment_1_0 )
                    // InternalBmod.g:466:4: rule__Floorplan__PerceptionsAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__PerceptionsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getPerceptionsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:470:2: ( ( rule__Floorplan__ActionsAssignment_1_1 ) )
                    {
                    // InternalBmod.g:470:2: ( ( rule__Floorplan__ActionsAssignment_1_1 ) )
                    // InternalBmod.g:471:3: ( rule__Floorplan__ActionsAssignment_1_1 )
                    {
                     before(grammarAccess.getFloorplanAccess().getActionsAssignment_1_1()); 
                    // InternalBmod.g:472:3: ( rule__Floorplan__ActionsAssignment_1_1 )
                    // InternalBmod.g:472:4: rule__Floorplan__ActionsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__ActionsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getActionsAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:476:2: ( ( rule__Floorplan__RoomsAssignment_1_2 ) )
                    {
                    // InternalBmod.g:476:2: ( ( rule__Floorplan__RoomsAssignment_1_2 ) )
                    // InternalBmod.g:477:3: ( rule__Floorplan__RoomsAssignment_1_2 )
                    {
                     before(grammarAccess.getFloorplanAccess().getRoomsAssignment_1_2()); 
                    // InternalBmod.g:478:3: ( rule__Floorplan__RoomsAssignment_1_2 )
                    // InternalBmod.g:478:4: rule__Floorplan__RoomsAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__RoomsAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getRoomsAssignment_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBmod.g:482:2: ( ( rule__Floorplan__DoorsAssignment_1_3 ) )
                    {
                    // InternalBmod.g:482:2: ( ( rule__Floorplan__DoorsAssignment_1_3 ) )
                    // InternalBmod.g:483:3: ( rule__Floorplan__DoorsAssignment_1_3 )
                    {
                     before(grammarAccess.getFloorplanAccess().getDoorsAssignment_1_3()); 
                    // InternalBmod.g:484:3: ( rule__Floorplan__DoorsAssignment_1_3 )
                    // InternalBmod.g:484:4: rule__Floorplan__DoorsAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__DoorsAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getDoorsAssignment_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBmod.g:488:2: ( ( rule__Floorplan__PersonsAssignment_1_4 ) )
                    {
                    // InternalBmod.g:488:2: ( ( rule__Floorplan__PersonsAssignment_1_4 ) )
                    // InternalBmod.g:489:3: ( rule__Floorplan__PersonsAssignment_1_4 )
                    {
                     before(grammarAccess.getFloorplanAccess().getPersonsAssignment_1_4()); 
                    // InternalBmod.g:490:3: ( rule__Floorplan__PersonsAssignment_1_4 )
                    // InternalBmod.g:490:4: rule__Floorplan__PersonsAssignment_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__PersonsAssignment_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getPersonsAssignment_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBmod.g:494:2: ( ( rule__Floorplan__ExitsAssignment_1_5 ) )
                    {
                    // InternalBmod.g:494:2: ( ( rule__Floorplan__ExitsAssignment_1_5 ) )
                    // InternalBmod.g:495:3: ( rule__Floorplan__ExitsAssignment_1_5 )
                    {
                     before(grammarAccess.getFloorplanAccess().getExitsAssignment_1_5()); 
                    // InternalBmod.g:496:3: ( rule__Floorplan__ExitsAssignment_1_5 )
                    // InternalBmod.g:496:4: rule__Floorplan__ExitsAssignment_1_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__ExitsAssignment_1_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getExitsAssignment_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBmod.g:500:2: ( ( rule__Floorplan__SignsAssignment_1_6 ) )
                    {
                    // InternalBmod.g:500:2: ( ( rule__Floorplan__SignsAssignment_1_6 ) )
                    // InternalBmod.g:501:3: ( rule__Floorplan__SignsAssignment_1_6 )
                    {
                     before(grammarAccess.getFloorplanAccess().getSignsAssignment_1_6()); 
                    // InternalBmod.g:502:3: ( rule__Floorplan__SignsAssignment_1_6 )
                    // InternalBmod.g:502:4: rule__Floorplan__SignsAssignment_1_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__SignsAssignment_1_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getSignsAssignment_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBmod.g:506:2: ( ( rule__Floorplan__DanconsAssignment_1_7 ) )
                    {
                    // InternalBmod.g:506:2: ( ( rule__Floorplan__DanconsAssignment_1_7 ) )
                    // InternalBmod.g:507:3: ( rule__Floorplan__DanconsAssignment_1_7 )
                    {
                     before(grammarAccess.getFloorplanAccess().getDanconsAssignment_1_7()); 
                    // InternalBmod.g:508:3: ( rule__Floorplan__DanconsAssignment_1_7 )
                    // InternalBmod.g:508:4: rule__Floorplan__DanconsAssignment_1_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__DanconsAssignment_1_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getDanconsAssignment_1_7()); 

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


    // $ANTLR start "rule__Perception__Alternatives"
    // InternalBmod.g:516:1: rule__Perception__Alternatives : ( ( ( rule__Perception__ExistingAssignment_0 ) ) | ( ( rule__Perception__CustomAssignment_1 ) ) );
    public final void rule__Perception__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:520:1: ( ( ( rule__Perception__ExistingAssignment_0 ) ) | ( ( rule__Perception__CustomAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=15)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_VARNAME) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBmod.g:521:2: ( ( rule__Perception__ExistingAssignment_0 ) )
                    {
                    // InternalBmod.g:521:2: ( ( rule__Perception__ExistingAssignment_0 ) )
                    // InternalBmod.g:522:3: ( rule__Perception__ExistingAssignment_0 )
                    {
                     before(grammarAccess.getPerceptionAccess().getExistingAssignment_0()); 
                    // InternalBmod.g:523:3: ( rule__Perception__ExistingAssignment_0 )
                    // InternalBmod.g:523:4: rule__Perception__ExistingAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Perception__ExistingAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPerceptionAccess().getExistingAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:527:2: ( ( rule__Perception__CustomAssignment_1 ) )
                    {
                    // InternalBmod.g:527:2: ( ( rule__Perception__CustomAssignment_1 ) )
                    // InternalBmod.g:528:3: ( rule__Perception__CustomAssignment_1 )
                    {
                     before(grammarAccess.getPerceptionAccess().getCustomAssignment_1()); 
                    // InternalBmod.g:529:3: ( rule__Perception__CustomAssignment_1 )
                    // InternalBmod.g:529:4: rule__Perception__CustomAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Perception__CustomAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPerceptionAccess().getCustomAssignment_1()); 

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
    // $ANTLR end "rule__Perception__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalBmod.g:537:1: rule__Action__Alternatives : ( ( ( rule__Action__ExistingAssignment_0 ) ) | ( ( rule__Action__CustomAssignment_1 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:541:1: ( ( ( rule__Action__ExistingAssignment_0 ) ) | ( ( rule__Action__CustomAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=16 && LA3_0<=18)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_VARNAME) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBmod.g:542:2: ( ( rule__Action__ExistingAssignment_0 ) )
                    {
                    // InternalBmod.g:542:2: ( ( rule__Action__ExistingAssignment_0 ) )
                    // InternalBmod.g:543:3: ( rule__Action__ExistingAssignment_0 )
                    {
                     before(grammarAccess.getActionAccess().getExistingAssignment_0()); 
                    // InternalBmod.g:544:3: ( rule__Action__ExistingAssignment_0 )
                    // InternalBmod.g:544:4: rule__Action__ExistingAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__ExistingAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getExistingAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:548:2: ( ( rule__Action__CustomAssignment_1 ) )
                    {
                    // InternalBmod.g:548:2: ( ( rule__Action__CustomAssignment_1 ) )
                    // InternalBmod.g:549:3: ( rule__Action__CustomAssignment_1 )
                    {
                     before(grammarAccess.getActionAccess().getCustomAssignment_1()); 
                    // InternalBmod.g:550:3: ( rule__Action__CustomAssignment_1 )
                    // InternalBmod.g:550:4: rule__Action__CustomAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__CustomAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getCustomAssignment_1()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__PerceptionEnum__Alternatives"
    // InternalBmod.g:558:1: rule__PerceptionEnum__Alternatives : ( ( ( 'attentive' ) ) | ( ( 'relaxed' ) ) | ( ( 'optimistic' ) ) | ( ( 'sceptic' ) ) );
    public final void rule__PerceptionEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:562:1: ( ( ( 'attentive' ) ) | ( ( 'relaxed' ) ) | ( ( 'optimistic' ) ) | ( ( 'sceptic' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBmod.g:563:2: ( ( 'attentive' ) )
                    {
                    // InternalBmod.g:563:2: ( ( 'attentive' ) )
                    // InternalBmod.g:564:3: ( 'attentive' )
                    {
                     before(grammarAccess.getPerceptionEnumAccess().getAttentiveEnumLiteralDeclaration_0()); 
                    // InternalBmod.g:565:3: ( 'attentive' )
                    // InternalBmod.g:565:4: 'attentive'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerceptionEnumAccess().getAttentiveEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:569:2: ( ( 'relaxed' ) )
                    {
                    // InternalBmod.g:569:2: ( ( 'relaxed' ) )
                    // InternalBmod.g:570:3: ( 'relaxed' )
                    {
                     before(grammarAccess.getPerceptionEnumAccess().getRelaxedEnumLiteralDeclaration_1()); 
                    // InternalBmod.g:571:3: ( 'relaxed' )
                    // InternalBmod.g:571:4: 'relaxed'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerceptionEnumAccess().getRelaxedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:575:2: ( ( 'optimistic' ) )
                    {
                    // InternalBmod.g:575:2: ( ( 'optimistic' ) )
                    // InternalBmod.g:576:3: ( 'optimistic' )
                    {
                     before(grammarAccess.getPerceptionEnumAccess().getOptimisticEnumLiteralDeclaration_2()); 
                    // InternalBmod.g:577:3: ( 'optimistic' )
                    // InternalBmod.g:577:4: 'optimistic'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerceptionEnumAccess().getOptimisticEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBmod.g:581:2: ( ( 'sceptic' ) )
                    {
                    // InternalBmod.g:581:2: ( ( 'sceptic' ) )
                    // InternalBmod.g:582:3: ( 'sceptic' )
                    {
                     before(grammarAccess.getPerceptionEnumAccess().getScepticEnumLiteralDeclaration_3()); 
                    // InternalBmod.g:583:3: ( 'sceptic' )
                    // InternalBmod.g:583:4: 'sceptic'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerceptionEnumAccess().getScepticEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__PerceptionEnum__Alternatives"


    // $ANTLR start "rule__ActionEnum__Alternatives"
    // InternalBmod.g:591:1: rule__ActionEnum__Alternatives : ( ( ( 'newcomer' ) ) | ( ( 'experienced' ) ) | ( ( 'panic' ) ) );
    public final void rule__ActionEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:595:1: ( ( ( 'newcomer' ) ) | ( ( 'experienced' ) ) | ( ( 'panic' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBmod.g:596:2: ( ( 'newcomer' ) )
                    {
                    // InternalBmod.g:596:2: ( ( 'newcomer' ) )
                    // InternalBmod.g:597:3: ( 'newcomer' )
                    {
                     before(grammarAccess.getActionEnumAccess().getNewcomerEnumLiteralDeclaration_0()); 
                    // InternalBmod.g:598:3: ( 'newcomer' )
                    // InternalBmod.g:598:4: 'newcomer'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getNewcomerEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:602:2: ( ( 'experienced' ) )
                    {
                    // InternalBmod.g:602:2: ( ( 'experienced' ) )
                    // InternalBmod.g:603:3: ( 'experienced' )
                    {
                     before(grammarAccess.getActionEnumAccess().getExperiencedEnumLiteralDeclaration_1()); 
                    // InternalBmod.g:604:3: ( 'experienced' )
                    // InternalBmod.g:604:4: 'experienced'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getExperiencedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:608:2: ( ( 'panic' ) )
                    {
                    // InternalBmod.g:608:2: ( ( 'panic' ) )
                    // InternalBmod.g:609:3: ( 'panic' )
                    {
                     before(grammarAccess.getActionEnumAccess().getPanicEnumLiteralDeclaration_2()); 
                    // InternalBmod.g:610:3: ( 'panic' )
                    // InternalBmod.g:610:4: 'panic'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getPanicEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ActionEnum__Alternatives"


    // $ANTLR start "rule__Floorplan__Group__0"
    // InternalBmod.g:618:1: rule__Floorplan__Group__0 : rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1 ;
    public final void rule__Floorplan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:622:1: ( rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1 )
            // InternalBmod.g:623:2: rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1
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
    // InternalBmod.g:630:1: rule__Floorplan__Group__0__Impl : ( () ) ;
    public final void rule__Floorplan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:634:1: ( ( () ) )
            // InternalBmod.g:635:1: ( () )
            {
            // InternalBmod.g:635:1: ( () )
            // InternalBmod.g:636:2: ()
            {
             before(grammarAccess.getFloorplanAccess().getFloorplanAction_0()); 
            // InternalBmod.g:637:2: ()
            // InternalBmod.g:637:3: 
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
    // InternalBmod.g:645:1: rule__Floorplan__Group__1 : rule__Floorplan__Group__1__Impl ;
    public final void rule__Floorplan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:649:1: ( rule__Floorplan__Group__1__Impl )
            // InternalBmod.g:650:2: rule__Floorplan__Group__1__Impl
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
    // InternalBmod.g:656:1: rule__Floorplan__Group__1__Impl : ( ( rule__Floorplan__Alternatives_1 )* ) ;
    public final void rule__Floorplan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:660:1: ( ( ( rule__Floorplan__Alternatives_1 )* ) )
            // InternalBmod.g:661:1: ( ( rule__Floorplan__Alternatives_1 )* )
            {
            // InternalBmod.g:661:1: ( ( rule__Floorplan__Alternatives_1 )* )
            // InternalBmod.g:662:2: ( rule__Floorplan__Alternatives_1 )*
            {
             before(grammarAccess.getFloorplanAccess().getAlternatives_1()); 
            // InternalBmod.g:663:2: ( rule__Floorplan__Alternatives_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19||LA6_0==22||(LA6_0>=25 && LA6_0<=27)||(LA6_0>=31 && LA6_0<=32)||LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBmod.g:663:3: rule__Floorplan__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Floorplan__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalBmod.g:672:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:676:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalBmod.g:677:2: rule__Room__Group__0__Impl rule__Room__Group__1
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
    // InternalBmod.g:684:1: rule__Room__Group__0__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:688:1: ( ( 'Room' ) )
            // InternalBmod.g:689:1: ( 'Room' )
            {
            // InternalBmod.g:689:1: ( 'Room' )
            // InternalBmod.g:690:2: 'Room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalBmod.g:699:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:703:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalBmod.g:704:2: rule__Room__Group__1__Impl rule__Room__Group__2
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
    // InternalBmod.g:711:1: rule__Room__Group__1__Impl : ( ( rule__Room__NameAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:715:1: ( ( ( rule__Room__NameAssignment_1 ) ) )
            // InternalBmod.g:716:1: ( ( rule__Room__NameAssignment_1 ) )
            {
            // InternalBmod.g:716:1: ( ( rule__Room__NameAssignment_1 ) )
            // InternalBmod.g:717:2: ( rule__Room__NameAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_1()); 
            // InternalBmod.g:718:2: ( rule__Room__NameAssignment_1 )
            // InternalBmod.g:718:3: rule__Room__NameAssignment_1
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
    // InternalBmod.g:726:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:730:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalBmod.g:731:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalBmod.g:738:1: rule__Room__Group__2__Impl : ( ( rule__Room__Group_2__0 )? ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:742:1: ( ( ( rule__Room__Group_2__0 )? ) )
            // InternalBmod.g:743:1: ( ( rule__Room__Group_2__0 )? )
            {
            // InternalBmod.g:743:1: ( ( rule__Room__Group_2__0 )? )
            // InternalBmod.g:744:2: ( rule__Room__Group_2__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_2()); 
            // InternalBmod.g:745:2: ( rule__Room__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBmod.g:745:3: rule__Room__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_2()); 

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
    // InternalBmod.g:753:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:757:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalBmod.g:758:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalBmod.g:765:1: rule__Room__Group__3__Impl : ( ( rule__Room__AreasAssignment_3 ) ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:769:1: ( ( ( rule__Room__AreasAssignment_3 ) ) )
            // InternalBmod.g:770:1: ( ( rule__Room__AreasAssignment_3 ) )
            {
            // InternalBmod.g:770:1: ( ( rule__Room__AreasAssignment_3 ) )
            // InternalBmod.g:771:2: ( rule__Room__AreasAssignment_3 )
            {
             before(grammarAccess.getRoomAccess().getAreasAssignment_3()); 
            // InternalBmod.g:772:2: ( rule__Room__AreasAssignment_3 )
            // InternalBmod.g:772:3: rule__Room__AreasAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Room__AreasAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getAreasAssignment_3()); 

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
    // InternalBmod.g:780:1: rule__Room__Group__4 : rule__Room__Group__4__Impl ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:784:1: ( rule__Room__Group__4__Impl )
            // InternalBmod.g:785:2: rule__Room__Group__4__Impl
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
    // InternalBmod.g:791:1: rule__Room__Group__4__Impl : ( ( rule__Room__Group_4__0 )* ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:795:1: ( ( ( rule__Room__Group_4__0 )* ) )
            // InternalBmod.g:796:1: ( ( rule__Room__Group_4__0 )* )
            {
            // InternalBmod.g:796:1: ( ( rule__Room__Group_4__0 )* )
            // InternalBmod.g:797:2: ( rule__Room__Group_4__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_4()); 
            // InternalBmod.g:798:2: ( rule__Room__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBmod.g:798:3: rule__Room__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Room__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Room__Group_2__0"
    // InternalBmod.g:807:1: rule__Room__Group_2__0 : rule__Room__Group_2__0__Impl rule__Room__Group_2__1 ;
    public final void rule__Room__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:811:1: ( rule__Room__Group_2__0__Impl rule__Room__Group_2__1 )
            // InternalBmod.g:812:2: rule__Room__Group_2__0__Impl rule__Room__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Room__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_2__1();

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
    // $ANTLR end "rule__Room__Group_2__0"


    // $ANTLR start "rule__Room__Group_2__0__Impl"
    // InternalBmod.g:819:1: rule__Room__Group_2__0__Impl : ( 'named' ) ;
    public final void rule__Room__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:823:1: ( ( 'named' ) )
            // InternalBmod.g:824:1: ( 'named' )
            {
            // InternalBmod.g:824:1: ( 'named' )
            // InternalBmod.g:825:2: 'named'
            {
             before(grammarAccess.getRoomAccess().getNamedKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getNamedKeyword_2_0()); 

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
    // $ANTLR end "rule__Room__Group_2__0__Impl"


    // $ANTLR start "rule__Room__Group_2__1"
    // InternalBmod.g:834:1: rule__Room__Group_2__1 : rule__Room__Group_2__1__Impl ;
    public final void rule__Room__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:838:1: ( rule__Room__Group_2__1__Impl )
            // InternalBmod.g:839:2: rule__Room__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_2__1__Impl();

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
    // $ANTLR end "rule__Room__Group_2__1"


    // $ANTLR start "rule__Room__Group_2__1__Impl"
    // InternalBmod.g:845:1: rule__Room__Group_2__1__Impl : ( ( rule__Room__NamedAssignment_2_1 ) ) ;
    public final void rule__Room__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:849:1: ( ( ( rule__Room__NamedAssignment_2_1 ) ) )
            // InternalBmod.g:850:1: ( ( rule__Room__NamedAssignment_2_1 ) )
            {
            // InternalBmod.g:850:1: ( ( rule__Room__NamedAssignment_2_1 ) )
            // InternalBmod.g:851:2: ( rule__Room__NamedAssignment_2_1 )
            {
             before(grammarAccess.getRoomAccess().getNamedAssignment_2_1()); 
            // InternalBmod.g:852:2: ( rule__Room__NamedAssignment_2_1 )
            // InternalBmod.g:852:3: rule__Room__NamedAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__NamedAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNamedAssignment_2_1()); 

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
    // $ANTLR end "rule__Room__Group_2__1__Impl"


    // $ANTLR start "rule__Room__Group_4__0"
    // InternalBmod.g:861:1: rule__Room__Group_4__0 : rule__Room__Group_4__0__Impl rule__Room__Group_4__1 ;
    public final void rule__Room__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:865:1: ( rule__Room__Group_4__0__Impl rule__Room__Group_4__1 )
            // InternalBmod.g:866:2: rule__Room__Group_4__0__Impl rule__Room__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Room__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_4__1();

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
    // $ANTLR end "rule__Room__Group_4__0"


    // $ANTLR start "rule__Room__Group_4__0__Impl"
    // InternalBmod.g:873:1: rule__Room__Group_4__0__Impl : ( 'and' ) ;
    public final void rule__Room__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:877:1: ( ( 'and' ) )
            // InternalBmod.g:878:1: ( 'and' )
            {
            // InternalBmod.g:878:1: ( 'and' )
            // InternalBmod.g:879:2: 'and'
            {
             before(grammarAccess.getRoomAccess().getAndKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getAndKeyword_4_0()); 

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
    // $ANTLR end "rule__Room__Group_4__0__Impl"


    // $ANTLR start "rule__Room__Group_4__1"
    // InternalBmod.g:888:1: rule__Room__Group_4__1 : rule__Room__Group_4__1__Impl ;
    public final void rule__Room__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:892:1: ( rule__Room__Group_4__1__Impl )
            // InternalBmod.g:893:2: rule__Room__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_4__1__Impl();

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
    // $ANTLR end "rule__Room__Group_4__1"


    // $ANTLR start "rule__Room__Group_4__1__Impl"
    // InternalBmod.g:899:1: rule__Room__Group_4__1__Impl : ( ( rule__Room__AreasAssignment_4_1 ) ) ;
    public final void rule__Room__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:903:1: ( ( ( rule__Room__AreasAssignment_4_1 ) ) )
            // InternalBmod.g:904:1: ( ( rule__Room__AreasAssignment_4_1 ) )
            {
            // InternalBmod.g:904:1: ( ( rule__Room__AreasAssignment_4_1 ) )
            // InternalBmod.g:905:2: ( rule__Room__AreasAssignment_4_1 )
            {
             before(grammarAccess.getRoomAccess().getAreasAssignment_4_1()); 
            // InternalBmod.g:906:2: ( rule__Room__AreasAssignment_4_1 )
            // InternalBmod.g:906:3: rule__Room__AreasAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__AreasAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getAreasAssignment_4_1()); 

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
    // $ANTLR end "rule__Room__Group_4__1__Impl"


    // $ANTLR start "rule__Door__Group__0"
    // InternalBmod.g:915:1: rule__Door__Group__0 : rule__Door__Group__0__Impl rule__Door__Group__1 ;
    public final void rule__Door__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:919:1: ( rule__Door__Group__0__Impl rule__Door__Group__1 )
            // InternalBmod.g:920:2: rule__Door__Group__0__Impl rule__Door__Group__1
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
    // InternalBmod.g:927:1: rule__Door__Group__0__Impl : ( 'Door' ) ;
    public final void rule__Door__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:931:1: ( ( 'Door' ) )
            // InternalBmod.g:932:1: ( 'Door' )
            {
            // InternalBmod.g:932:1: ( 'Door' )
            // InternalBmod.g:933:2: 'Door'
            {
             before(grammarAccess.getDoorAccess().getDoorKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBmod.g:942:1: rule__Door__Group__1 : rule__Door__Group__1__Impl rule__Door__Group__2 ;
    public final void rule__Door__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:946:1: ( rule__Door__Group__1__Impl rule__Door__Group__2 )
            // InternalBmod.g:947:2: rule__Door__Group__1__Impl rule__Door__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalBmod.g:954:1: rule__Door__Group__1__Impl : ( ( rule__Door__NameAssignment_1 ) ) ;
    public final void rule__Door__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:958:1: ( ( ( rule__Door__NameAssignment_1 ) ) )
            // InternalBmod.g:959:1: ( ( rule__Door__NameAssignment_1 ) )
            {
            // InternalBmod.g:959:1: ( ( rule__Door__NameAssignment_1 ) )
            // InternalBmod.g:960:2: ( rule__Door__NameAssignment_1 )
            {
             before(grammarAccess.getDoorAccess().getNameAssignment_1()); 
            // InternalBmod.g:961:2: ( rule__Door__NameAssignment_1 )
            // InternalBmod.g:961:3: rule__Door__NameAssignment_1
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
    // InternalBmod.g:969:1: rule__Door__Group__2 : rule__Door__Group__2__Impl rule__Door__Group__3 ;
    public final void rule__Door__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:973:1: ( rule__Door__Group__2__Impl rule__Door__Group__3 )
            // InternalBmod.g:974:2: rule__Door__Group__2__Impl rule__Door__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBmod.g:981:1: rule__Door__Group__2__Impl : ( 'from' ) ;
    public final void rule__Door__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:985:1: ( ( 'from' ) )
            // InternalBmod.g:986:1: ( 'from' )
            {
            // InternalBmod.g:986:1: ( 'from' )
            // InternalBmod.g:987:2: 'from'
            {
             before(grammarAccess.getDoorAccess().getFromKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBmod.g:996:1: rule__Door__Group__3 : rule__Door__Group__3__Impl rule__Door__Group__4 ;
    public final void rule__Door__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1000:1: ( rule__Door__Group__3__Impl rule__Door__Group__4 )
            // InternalBmod.g:1001:2: rule__Door__Group__3__Impl rule__Door__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalBmod.g:1008:1: rule__Door__Group__3__Impl : ( ( rule__Door__FromAssignment_3 ) ) ;
    public final void rule__Door__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1012:1: ( ( ( rule__Door__FromAssignment_3 ) ) )
            // InternalBmod.g:1013:1: ( ( rule__Door__FromAssignment_3 ) )
            {
            // InternalBmod.g:1013:1: ( ( rule__Door__FromAssignment_3 ) )
            // InternalBmod.g:1014:2: ( rule__Door__FromAssignment_3 )
            {
             before(grammarAccess.getDoorAccess().getFromAssignment_3()); 
            // InternalBmod.g:1015:2: ( rule__Door__FromAssignment_3 )
            // InternalBmod.g:1015:3: rule__Door__FromAssignment_3
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
    // InternalBmod.g:1023:1: rule__Door__Group__4 : rule__Door__Group__4__Impl rule__Door__Group__5 ;
    public final void rule__Door__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1027:1: ( rule__Door__Group__4__Impl rule__Door__Group__5 )
            // InternalBmod.g:1028:2: rule__Door__Group__4__Impl rule__Door__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalBmod.g:1035:1: rule__Door__Group__4__Impl : ( 'to' ) ;
    public final void rule__Door__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1039:1: ( ( 'to' ) )
            // InternalBmod.g:1040:1: ( 'to' )
            {
            // InternalBmod.g:1040:1: ( 'to' )
            // InternalBmod.g:1041:2: 'to'
            {
             before(grammarAccess.getDoorAccess().getToKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBmod.g:1050:1: rule__Door__Group__5 : rule__Door__Group__5__Impl ;
    public final void rule__Door__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1054:1: ( rule__Door__Group__5__Impl )
            // InternalBmod.g:1055:2: rule__Door__Group__5__Impl
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
    // InternalBmod.g:1061:1: rule__Door__Group__5__Impl : ( ( rule__Door__ToAssignment_5 ) ) ;
    public final void rule__Door__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1065:1: ( ( ( rule__Door__ToAssignment_5 ) ) )
            // InternalBmod.g:1066:1: ( ( rule__Door__ToAssignment_5 ) )
            {
            // InternalBmod.g:1066:1: ( ( rule__Door__ToAssignment_5 ) )
            // InternalBmod.g:1067:2: ( rule__Door__ToAssignment_5 )
            {
             before(grammarAccess.getDoorAccess().getToAssignment_5()); 
            // InternalBmod.g:1068:2: ( rule__Door__ToAssignment_5 )
            // InternalBmod.g:1068:3: rule__Door__ToAssignment_5
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


    // $ANTLR start "rule__PerceptionLevel__Group__0"
    // InternalBmod.g:1077:1: rule__PerceptionLevel__Group__0 : rule__PerceptionLevel__Group__0__Impl rule__PerceptionLevel__Group__1 ;
    public final void rule__PerceptionLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1081:1: ( rule__PerceptionLevel__Group__0__Impl rule__PerceptionLevel__Group__1 )
            // InternalBmod.g:1082:2: rule__PerceptionLevel__Group__0__Impl rule__PerceptionLevel__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PerceptionLevel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerceptionLevel__Group__1();

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
    // $ANTLR end "rule__PerceptionLevel__Group__0"


    // $ANTLR start "rule__PerceptionLevel__Group__0__Impl"
    // InternalBmod.g:1089:1: rule__PerceptionLevel__Group__0__Impl : ( 'PerceptionLevel' ) ;
    public final void rule__PerceptionLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1093:1: ( ( 'PerceptionLevel' ) )
            // InternalBmod.g:1094:1: ( 'PerceptionLevel' )
            {
            // InternalBmod.g:1094:1: ( 'PerceptionLevel' )
            // InternalBmod.g:1095:2: 'PerceptionLevel'
            {
             before(grammarAccess.getPerceptionLevelAccess().getPerceptionLevelKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPerceptionLevelAccess().getPerceptionLevelKeyword_0()); 

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
    // $ANTLR end "rule__PerceptionLevel__Group__0__Impl"


    // $ANTLR start "rule__PerceptionLevel__Group__1"
    // InternalBmod.g:1104:1: rule__PerceptionLevel__Group__1 : rule__PerceptionLevel__Group__1__Impl ;
    public final void rule__PerceptionLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1108:1: ( rule__PerceptionLevel__Group__1__Impl )
            // InternalBmod.g:1109:2: rule__PerceptionLevel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PerceptionLevel__Group__1__Impl();

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
    // $ANTLR end "rule__PerceptionLevel__Group__1"


    // $ANTLR start "rule__PerceptionLevel__Group__1__Impl"
    // InternalBmod.g:1115:1: rule__PerceptionLevel__Group__1__Impl : ( ( rule__PerceptionLevel__NameAssignment_1 ) ) ;
    public final void rule__PerceptionLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1119:1: ( ( ( rule__PerceptionLevel__NameAssignment_1 ) ) )
            // InternalBmod.g:1120:1: ( ( rule__PerceptionLevel__NameAssignment_1 ) )
            {
            // InternalBmod.g:1120:1: ( ( rule__PerceptionLevel__NameAssignment_1 ) )
            // InternalBmod.g:1121:2: ( rule__PerceptionLevel__NameAssignment_1 )
            {
             before(grammarAccess.getPerceptionLevelAccess().getNameAssignment_1()); 
            // InternalBmod.g:1122:2: ( rule__PerceptionLevel__NameAssignment_1 )
            // InternalBmod.g:1122:3: rule__PerceptionLevel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PerceptionLevel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPerceptionLevelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PerceptionLevel__Group__1__Impl"


    // $ANTLR start "rule__ActionProfile__Group__0"
    // InternalBmod.g:1131:1: rule__ActionProfile__Group__0 : rule__ActionProfile__Group__0__Impl rule__ActionProfile__Group__1 ;
    public final void rule__ActionProfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1135:1: ( rule__ActionProfile__Group__0__Impl rule__ActionProfile__Group__1 )
            // InternalBmod.g:1136:2: rule__ActionProfile__Group__0__Impl rule__ActionProfile__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ActionProfile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionProfile__Group__1();

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
    // $ANTLR end "rule__ActionProfile__Group__0"


    // $ANTLR start "rule__ActionProfile__Group__0__Impl"
    // InternalBmod.g:1143:1: rule__ActionProfile__Group__0__Impl : ( 'ActionProfile' ) ;
    public final void rule__ActionProfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1147:1: ( ( 'ActionProfile' ) )
            // InternalBmod.g:1148:1: ( 'ActionProfile' )
            {
            // InternalBmod.g:1148:1: ( 'ActionProfile' )
            // InternalBmod.g:1149:2: 'ActionProfile'
            {
             before(grammarAccess.getActionProfileAccess().getActionProfileKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActionProfileAccess().getActionProfileKeyword_0()); 

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
    // $ANTLR end "rule__ActionProfile__Group__0__Impl"


    // $ANTLR start "rule__ActionProfile__Group__1"
    // InternalBmod.g:1158:1: rule__ActionProfile__Group__1 : rule__ActionProfile__Group__1__Impl ;
    public final void rule__ActionProfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1162:1: ( rule__ActionProfile__Group__1__Impl )
            // InternalBmod.g:1163:2: rule__ActionProfile__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionProfile__Group__1__Impl();

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
    // $ANTLR end "rule__ActionProfile__Group__1"


    // $ANTLR start "rule__ActionProfile__Group__1__Impl"
    // InternalBmod.g:1169:1: rule__ActionProfile__Group__1__Impl : ( ( rule__ActionProfile__NameAssignment_1 ) ) ;
    public final void rule__ActionProfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1173:1: ( ( ( rule__ActionProfile__NameAssignment_1 ) ) )
            // InternalBmod.g:1174:1: ( ( rule__ActionProfile__NameAssignment_1 ) )
            {
            // InternalBmod.g:1174:1: ( ( rule__ActionProfile__NameAssignment_1 ) )
            // InternalBmod.g:1175:2: ( rule__ActionProfile__NameAssignment_1 )
            {
             before(grammarAccess.getActionProfileAccess().getNameAssignment_1()); 
            // InternalBmod.g:1176:2: ( rule__ActionProfile__NameAssignment_1 )
            // InternalBmod.g:1176:3: rule__ActionProfile__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionProfile__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionProfileAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ActionProfile__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalBmod.g:1185:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1189:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalBmod.g:1190:2: rule__Person__Group__0__Impl rule__Person__Group__1
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
    // InternalBmod.g:1197:1: rule__Person__Group__0__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1201:1: ( ( 'Person' ) )
            // InternalBmod.g:1202:1: ( 'Person' )
            {
            // InternalBmod.g:1202:1: ( 'Person' )
            // InternalBmod.g:1203:2: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBmod.g:1212:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1216:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalBmod.g:1217:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalBmod.g:1224:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1228:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalBmod.g:1229:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalBmod.g:1229:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalBmod.g:1230:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalBmod.g:1231:2: ( rule__Person__NameAssignment_1 )
            // InternalBmod.g:1231:3: rule__Person__NameAssignment_1
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
    // InternalBmod.g:1239:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1243:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalBmod.g:1244:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalBmod.g:1251:1: rule__Person__Group__2__Impl : ( 'named' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1255:1: ( ( 'named' ) )
            // InternalBmod.g:1256:1: ( 'named' )
            {
            // InternalBmod.g:1256:1: ( 'named' )
            // InternalBmod.g:1257:2: 'named'
            {
             before(grammarAccess.getPersonAccess().getNamedKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBmod.g:1266:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1270:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalBmod.g:1271:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalBmod.g:1278:1: rule__Person__Group__3__Impl : ( ( rule__Person__NamedAssignment_3 ) ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1282:1: ( ( ( rule__Person__NamedAssignment_3 ) ) )
            // InternalBmod.g:1283:1: ( ( rule__Person__NamedAssignment_3 ) )
            {
            // InternalBmod.g:1283:1: ( ( rule__Person__NamedAssignment_3 ) )
            // InternalBmod.g:1284:2: ( rule__Person__NamedAssignment_3 )
            {
             before(grammarAccess.getPersonAccess().getNamedAssignment_3()); 
            // InternalBmod.g:1285:2: ( rule__Person__NamedAssignment_3 )
            // InternalBmod.g:1285:3: rule__Person__NamedAssignment_3
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
    // InternalBmod.g:1293:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1297:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalBmod.g:1298:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalBmod.g:1305:1: rule__Person__Group__4__Impl : ( 'in' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1309:1: ( ( 'in' ) )
            // InternalBmod.g:1310:1: ( 'in' )
            {
            // InternalBmod.g:1310:1: ( 'in' )
            // InternalBmod.g:1311:2: 'in'
            {
             before(grammarAccess.getPersonAccess().getInKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBmod.g:1320:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1324:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalBmod.g:1325:2: rule__Person__Group__5__Impl rule__Person__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalBmod.g:1332:1: rule__Person__Group__5__Impl : ( ( rule__Person__LocationAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1336:1: ( ( ( rule__Person__LocationAssignment_5 ) ) )
            // InternalBmod.g:1337:1: ( ( rule__Person__LocationAssignment_5 ) )
            {
            // InternalBmod.g:1337:1: ( ( rule__Person__LocationAssignment_5 ) )
            // InternalBmod.g:1338:2: ( rule__Person__LocationAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getLocationAssignment_5()); 
            // InternalBmod.g:1339:2: ( rule__Person__LocationAssignment_5 )
            // InternalBmod.g:1339:3: rule__Person__LocationAssignment_5
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
    // InternalBmod.g:1347:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1351:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // InternalBmod.g:1352:2: rule__Person__Group__6__Impl rule__Person__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Person__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__7();

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
    // InternalBmod.g:1359:1: rule__Person__Group__6__Impl : ( ':' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1363:1: ( ( ':' ) )
            // InternalBmod.g:1364:1: ( ':' )
            {
            // InternalBmod.g:1364:1: ( ':' )
            // InternalBmod.g:1365:2: ':'
            {
             before(grammarAccess.getPersonAccess().getColonKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getColonKeyword_6()); 

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


    // $ANTLR start "rule__Person__Group__7"
    // InternalBmod.g:1374:1: rule__Person__Group__7 : rule__Person__Group__7__Impl rule__Person__Group__8 ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1378:1: ( rule__Person__Group__7__Impl rule__Person__Group__8 )
            // InternalBmod.g:1379:2: rule__Person__Group__7__Impl rule__Person__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Person__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__8();

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
    // $ANTLR end "rule__Person__Group__7"


    // $ANTLR start "rule__Person__Group__7__Impl"
    // InternalBmod.g:1386:1: rule__Person__Group__7__Impl : ( ( rule__Person__PerceptionAssignment_7 ) ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1390:1: ( ( ( rule__Person__PerceptionAssignment_7 ) ) )
            // InternalBmod.g:1391:1: ( ( rule__Person__PerceptionAssignment_7 ) )
            {
            // InternalBmod.g:1391:1: ( ( rule__Person__PerceptionAssignment_7 ) )
            // InternalBmod.g:1392:2: ( rule__Person__PerceptionAssignment_7 )
            {
             before(grammarAccess.getPersonAccess().getPerceptionAssignment_7()); 
            // InternalBmod.g:1393:2: ( rule__Person__PerceptionAssignment_7 )
            // InternalBmod.g:1393:3: rule__Person__PerceptionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Person__PerceptionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getPerceptionAssignment_7()); 

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
    // $ANTLR end "rule__Person__Group__7__Impl"


    // $ANTLR start "rule__Person__Group__8"
    // InternalBmod.g:1401:1: rule__Person__Group__8 : rule__Person__Group__8__Impl rule__Person__Group__9 ;
    public final void rule__Person__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1405:1: ( rule__Person__Group__8__Impl rule__Person__Group__9 )
            // InternalBmod.g:1406:2: rule__Person__Group__8__Impl rule__Person__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Person__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__9();

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
    // $ANTLR end "rule__Person__Group__8"


    // $ANTLR start "rule__Person__Group__8__Impl"
    // InternalBmod.g:1413:1: rule__Person__Group__8__Impl : ( ',' ) ;
    public final void rule__Person__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1417:1: ( ( ',' ) )
            // InternalBmod.g:1418:1: ( ',' )
            {
            // InternalBmod.g:1418:1: ( ',' )
            // InternalBmod.g:1419:2: ','
            {
             before(grammarAccess.getPersonAccess().getCommaKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__Person__Group__8__Impl"


    // $ANTLR start "rule__Person__Group__9"
    // InternalBmod.g:1428:1: rule__Person__Group__9 : rule__Person__Group__9__Impl ;
    public final void rule__Person__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1432:1: ( rule__Person__Group__9__Impl )
            // InternalBmod.g:1433:2: rule__Person__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__9__Impl();

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
    // $ANTLR end "rule__Person__Group__9"


    // $ANTLR start "rule__Person__Group__9__Impl"
    // InternalBmod.g:1439:1: rule__Person__Group__9__Impl : ( ( rule__Person__ActionAssignment_9 ) ) ;
    public final void rule__Person__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1443:1: ( ( ( rule__Person__ActionAssignment_9 ) ) )
            // InternalBmod.g:1444:1: ( ( rule__Person__ActionAssignment_9 ) )
            {
            // InternalBmod.g:1444:1: ( ( rule__Person__ActionAssignment_9 ) )
            // InternalBmod.g:1445:2: ( rule__Person__ActionAssignment_9 )
            {
             before(grammarAccess.getPersonAccess().getActionAssignment_9()); 
            // InternalBmod.g:1446:2: ( rule__Person__ActionAssignment_9 )
            // InternalBmod.g:1446:3: rule__Person__ActionAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Person__ActionAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getActionAssignment_9()); 

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
    // $ANTLR end "rule__Person__Group__9__Impl"


    // $ANTLR start "rule__Exit__Group__0"
    // InternalBmod.g:1455:1: rule__Exit__Group__0 : rule__Exit__Group__0__Impl rule__Exit__Group__1 ;
    public final void rule__Exit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1459:1: ( rule__Exit__Group__0__Impl rule__Exit__Group__1 )
            // InternalBmod.g:1460:2: rule__Exit__Group__0__Impl rule__Exit__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Exit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exit__Group__1();

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
    // $ANTLR end "rule__Exit__Group__0"


    // $ANTLR start "rule__Exit__Group__0__Impl"
    // InternalBmod.g:1467:1: rule__Exit__Group__0__Impl : ( 'Exit' ) ;
    public final void rule__Exit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1471:1: ( ( 'Exit' ) )
            // InternalBmod.g:1472:1: ( 'Exit' )
            {
            // InternalBmod.g:1472:1: ( 'Exit' )
            // InternalBmod.g:1473:2: 'Exit'
            {
             before(grammarAccess.getExitAccess().getExitKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExitAccess().getExitKeyword_0()); 

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
    // $ANTLR end "rule__Exit__Group__0__Impl"


    // $ANTLR start "rule__Exit__Group__1"
    // InternalBmod.g:1482:1: rule__Exit__Group__1 : rule__Exit__Group__1__Impl rule__Exit__Group__2 ;
    public final void rule__Exit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1486:1: ( rule__Exit__Group__1__Impl rule__Exit__Group__2 )
            // InternalBmod.g:1487:2: rule__Exit__Group__1__Impl rule__Exit__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Exit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exit__Group__2();

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
    // $ANTLR end "rule__Exit__Group__1"


    // $ANTLR start "rule__Exit__Group__1__Impl"
    // InternalBmod.g:1494:1: rule__Exit__Group__1__Impl : ( 'in' ) ;
    public final void rule__Exit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1498:1: ( ( 'in' ) )
            // InternalBmod.g:1499:1: ( 'in' )
            {
            // InternalBmod.g:1499:1: ( 'in' )
            // InternalBmod.g:1500:2: 'in'
            {
             before(grammarAccess.getExitAccess().getInKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExitAccess().getInKeyword_1()); 

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
    // $ANTLR end "rule__Exit__Group__1__Impl"


    // $ANTLR start "rule__Exit__Group__2"
    // InternalBmod.g:1509:1: rule__Exit__Group__2 : rule__Exit__Group__2__Impl ;
    public final void rule__Exit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1513:1: ( rule__Exit__Group__2__Impl )
            // InternalBmod.g:1514:2: rule__Exit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exit__Group__2__Impl();

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
    // $ANTLR end "rule__Exit__Group__2"


    // $ANTLR start "rule__Exit__Group__2__Impl"
    // InternalBmod.g:1520:1: rule__Exit__Group__2__Impl : ( ( rule__Exit__LocationAssignment_2 ) ) ;
    public final void rule__Exit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1524:1: ( ( ( rule__Exit__LocationAssignment_2 ) ) )
            // InternalBmod.g:1525:1: ( ( rule__Exit__LocationAssignment_2 ) )
            {
            // InternalBmod.g:1525:1: ( ( rule__Exit__LocationAssignment_2 ) )
            // InternalBmod.g:1526:2: ( rule__Exit__LocationAssignment_2 )
            {
             before(grammarAccess.getExitAccess().getLocationAssignment_2()); 
            // InternalBmod.g:1527:2: ( rule__Exit__LocationAssignment_2 )
            // InternalBmod.g:1527:3: rule__Exit__LocationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Exit__LocationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExitAccess().getLocationAssignment_2()); 

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
    // $ANTLR end "rule__Exit__Group__2__Impl"


    // $ANTLR start "rule__EmergencySign__Group__0"
    // InternalBmod.g:1536:1: rule__EmergencySign__Group__0 : rule__EmergencySign__Group__0__Impl rule__EmergencySign__Group__1 ;
    public final void rule__EmergencySign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1540:1: ( rule__EmergencySign__Group__0__Impl rule__EmergencySign__Group__1 )
            // InternalBmod.g:1541:2: rule__EmergencySign__Group__0__Impl rule__EmergencySign__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EmergencySign__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmergencySign__Group__1();

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
    // $ANTLR end "rule__EmergencySign__Group__0"


    // $ANTLR start "rule__EmergencySign__Group__0__Impl"
    // InternalBmod.g:1548:1: rule__EmergencySign__Group__0__Impl : ( 'Sign' ) ;
    public final void rule__EmergencySign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1552:1: ( ( 'Sign' ) )
            // InternalBmod.g:1553:1: ( 'Sign' )
            {
            // InternalBmod.g:1553:1: ( 'Sign' )
            // InternalBmod.g:1554:2: 'Sign'
            {
             before(grammarAccess.getEmergencySignAccess().getSignKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEmergencySignAccess().getSignKeyword_0()); 

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
    // $ANTLR end "rule__EmergencySign__Group__0__Impl"


    // $ANTLR start "rule__EmergencySign__Group__1"
    // InternalBmod.g:1563:1: rule__EmergencySign__Group__1 : rule__EmergencySign__Group__1__Impl rule__EmergencySign__Group__2 ;
    public final void rule__EmergencySign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1567:1: ( rule__EmergencySign__Group__1__Impl rule__EmergencySign__Group__2 )
            // InternalBmod.g:1568:2: rule__EmergencySign__Group__1__Impl rule__EmergencySign__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__EmergencySign__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmergencySign__Group__2();

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
    // $ANTLR end "rule__EmergencySign__Group__1"


    // $ANTLR start "rule__EmergencySign__Group__1__Impl"
    // InternalBmod.g:1575:1: rule__EmergencySign__Group__1__Impl : ( 'on' ) ;
    public final void rule__EmergencySign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1579:1: ( ( 'on' ) )
            // InternalBmod.g:1580:1: ( 'on' )
            {
            // InternalBmod.g:1580:1: ( 'on' )
            // InternalBmod.g:1581:2: 'on'
            {
             before(grammarAccess.getEmergencySignAccess().getOnKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEmergencySignAccess().getOnKeyword_1()); 

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
    // $ANTLR end "rule__EmergencySign__Group__1__Impl"


    // $ANTLR start "rule__EmergencySign__Group__2"
    // InternalBmod.g:1590:1: rule__EmergencySign__Group__2 : rule__EmergencySign__Group__2__Impl rule__EmergencySign__Group__3 ;
    public final void rule__EmergencySign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1594:1: ( rule__EmergencySign__Group__2__Impl rule__EmergencySign__Group__3 )
            // InternalBmod.g:1595:2: rule__EmergencySign__Group__2__Impl rule__EmergencySign__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__EmergencySign__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmergencySign__Group__3();

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
    // $ANTLR end "rule__EmergencySign__Group__2"


    // $ANTLR start "rule__EmergencySign__Group__2__Impl"
    // InternalBmod.g:1602:1: rule__EmergencySign__Group__2__Impl : ( ( rule__EmergencySign__OnAssignment_2 ) ) ;
    public final void rule__EmergencySign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1606:1: ( ( ( rule__EmergencySign__OnAssignment_2 ) ) )
            // InternalBmod.g:1607:1: ( ( rule__EmergencySign__OnAssignment_2 ) )
            {
            // InternalBmod.g:1607:1: ( ( rule__EmergencySign__OnAssignment_2 ) )
            // InternalBmod.g:1608:2: ( rule__EmergencySign__OnAssignment_2 )
            {
             before(grammarAccess.getEmergencySignAccess().getOnAssignment_2()); 
            // InternalBmod.g:1609:2: ( rule__EmergencySign__OnAssignment_2 )
            // InternalBmod.g:1609:3: rule__EmergencySign__OnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EmergencySign__OnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmergencySignAccess().getOnAssignment_2()); 

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
    // $ANTLR end "rule__EmergencySign__Group__2__Impl"


    // $ANTLR start "rule__EmergencySign__Group__3"
    // InternalBmod.g:1617:1: rule__EmergencySign__Group__3 : rule__EmergencySign__Group__3__Impl ;
    public final void rule__EmergencySign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1621:1: ( rule__EmergencySign__Group__3__Impl )
            // InternalBmod.g:1622:2: rule__EmergencySign__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmergencySign__Group__3__Impl();

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
    // $ANTLR end "rule__EmergencySign__Group__3"


    // $ANTLR start "rule__EmergencySign__Group__3__Impl"
    // InternalBmod.g:1628:1: rule__EmergencySign__Group__3__Impl : ( ( rule__EmergencySign__ToAssignment_3 ) ) ;
    public final void rule__EmergencySign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1632:1: ( ( ( rule__EmergencySign__ToAssignment_3 ) ) )
            // InternalBmod.g:1633:1: ( ( rule__EmergencySign__ToAssignment_3 ) )
            {
            // InternalBmod.g:1633:1: ( ( rule__EmergencySign__ToAssignment_3 ) )
            // InternalBmod.g:1634:2: ( rule__EmergencySign__ToAssignment_3 )
            {
             before(grammarAccess.getEmergencySignAccess().getToAssignment_3()); 
            // InternalBmod.g:1635:2: ( rule__EmergencySign__ToAssignment_3 )
            // InternalBmod.g:1635:3: rule__EmergencySign__ToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EmergencySign__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEmergencySignAccess().getToAssignment_3()); 

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
    // $ANTLR end "rule__EmergencySign__Group__3__Impl"


    // $ANTLR start "rule__DoorRef__Group__0"
    // InternalBmod.g:1644:1: rule__DoorRef__Group__0 : rule__DoorRef__Group__0__Impl rule__DoorRef__Group__1 ;
    public final void rule__DoorRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1648:1: ( rule__DoorRef__Group__0__Impl rule__DoorRef__Group__1 )
            // InternalBmod.g:1649:2: rule__DoorRef__Group__0__Impl rule__DoorRef__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DoorRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoorRef__Group__1();

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
    // $ANTLR end "rule__DoorRef__Group__0"


    // $ANTLR start "rule__DoorRef__Group__0__Impl"
    // InternalBmod.g:1656:1: rule__DoorRef__Group__0__Impl : ( 'to' ) ;
    public final void rule__DoorRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1660:1: ( ( 'to' ) )
            // InternalBmod.g:1661:1: ( 'to' )
            {
            // InternalBmod.g:1661:1: ( 'to' )
            // InternalBmod.g:1662:2: 'to'
            {
             before(grammarAccess.getDoorRefAccess().getToKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDoorRefAccess().getToKeyword_0()); 

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
    // $ANTLR end "rule__DoorRef__Group__0__Impl"


    // $ANTLR start "rule__DoorRef__Group__1"
    // InternalBmod.g:1671:1: rule__DoorRef__Group__1 : rule__DoorRef__Group__1__Impl ;
    public final void rule__DoorRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1675:1: ( rule__DoorRef__Group__1__Impl )
            // InternalBmod.g:1676:2: rule__DoorRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoorRef__Group__1__Impl();

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
    // $ANTLR end "rule__DoorRef__Group__1"


    // $ANTLR start "rule__DoorRef__Group__1__Impl"
    // InternalBmod.g:1682:1: rule__DoorRef__Group__1__Impl : ( ( rule__DoorRef__RefAssignment_1 ) ) ;
    public final void rule__DoorRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1686:1: ( ( ( rule__DoorRef__RefAssignment_1 ) ) )
            // InternalBmod.g:1687:1: ( ( rule__DoorRef__RefAssignment_1 ) )
            {
            // InternalBmod.g:1687:1: ( ( rule__DoorRef__RefAssignment_1 ) )
            // InternalBmod.g:1688:2: ( rule__DoorRef__RefAssignment_1 )
            {
             before(grammarAccess.getDoorRefAccess().getRefAssignment_1()); 
            // InternalBmod.g:1689:2: ( rule__DoorRef__RefAssignment_1 )
            // InternalBmod.g:1689:3: rule__DoorRef__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DoorRef__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoorRefAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__DoorRef__Group__1__Impl"


    // $ANTLR start "rule__DangerousCondition__Group__0"
    // InternalBmod.g:1698:1: rule__DangerousCondition__Group__0 : rule__DangerousCondition__Group__0__Impl rule__DangerousCondition__Group__1 ;
    public final void rule__DangerousCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1702:1: ( rule__DangerousCondition__Group__0__Impl rule__DangerousCondition__Group__1 )
            // InternalBmod.g:1703:2: rule__DangerousCondition__Group__0__Impl rule__DangerousCondition__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DangerousCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DangerousCondition__Group__1();

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
    // $ANTLR end "rule__DangerousCondition__Group__0"


    // $ANTLR start "rule__DangerousCondition__Group__0__Impl"
    // InternalBmod.g:1710:1: rule__DangerousCondition__Group__0__Impl : ( 'Condition' ) ;
    public final void rule__DangerousCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1714:1: ( ( 'Condition' ) )
            // InternalBmod.g:1715:1: ( 'Condition' )
            {
            // InternalBmod.g:1715:1: ( 'Condition' )
            // InternalBmod.g:1716:2: 'Condition'
            {
             before(grammarAccess.getDangerousConditionAccess().getConditionKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDangerousConditionAccess().getConditionKeyword_0()); 

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
    // $ANTLR end "rule__DangerousCondition__Group__0__Impl"


    // $ANTLR start "rule__DangerousCondition__Group__1"
    // InternalBmod.g:1725:1: rule__DangerousCondition__Group__1 : rule__DangerousCondition__Group__1__Impl rule__DangerousCondition__Group__2 ;
    public final void rule__DangerousCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1729:1: ( rule__DangerousCondition__Group__1__Impl rule__DangerousCondition__Group__2 )
            // InternalBmod.g:1730:2: rule__DangerousCondition__Group__1__Impl rule__DangerousCondition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DangerousCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DangerousCondition__Group__2();

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
    // $ANTLR end "rule__DangerousCondition__Group__1"


    // $ANTLR start "rule__DangerousCondition__Group__1__Impl"
    // InternalBmod.g:1737:1: rule__DangerousCondition__Group__1__Impl : ( 'on' ) ;
    public final void rule__DangerousCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1741:1: ( ( 'on' ) )
            // InternalBmod.g:1742:1: ( 'on' )
            {
            // InternalBmod.g:1742:1: ( 'on' )
            // InternalBmod.g:1743:2: 'on'
            {
             before(grammarAccess.getDangerousConditionAccess().getOnKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDangerousConditionAccess().getOnKeyword_1()); 

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
    // $ANTLR end "rule__DangerousCondition__Group__1__Impl"


    // $ANTLR start "rule__DangerousCondition__Group__2"
    // InternalBmod.g:1752:1: rule__DangerousCondition__Group__2 : rule__DangerousCondition__Group__2__Impl rule__DangerousCondition__Group__3 ;
    public final void rule__DangerousCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1756:1: ( rule__DangerousCondition__Group__2__Impl rule__DangerousCondition__Group__3 )
            // InternalBmod.g:1757:2: rule__DangerousCondition__Group__2__Impl rule__DangerousCondition__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__DangerousCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DangerousCondition__Group__3();

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
    // $ANTLR end "rule__DangerousCondition__Group__2"


    // $ANTLR start "rule__DangerousCondition__Group__2__Impl"
    // InternalBmod.g:1764:1: rule__DangerousCondition__Group__2__Impl : ( ( rule__DangerousCondition__OnAssignment_2 ) ) ;
    public final void rule__DangerousCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1768:1: ( ( ( rule__DangerousCondition__OnAssignment_2 ) ) )
            // InternalBmod.g:1769:1: ( ( rule__DangerousCondition__OnAssignment_2 ) )
            {
            // InternalBmod.g:1769:1: ( ( rule__DangerousCondition__OnAssignment_2 ) )
            // InternalBmod.g:1770:2: ( rule__DangerousCondition__OnAssignment_2 )
            {
             before(grammarAccess.getDangerousConditionAccess().getOnAssignment_2()); 
            // InternalBmod.g:1771:2: ( rule__DangerousCondition__OnAssignment_2 )
            // InternalBmod.g:1771:3: rule__DangerousCondition__OnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DangerousCondition__OnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDangerousConditionAccess().getOnAssignment_2()); 

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
    // $ANTLR end "rule__DangerousCondition__Group__2__Impl"


    // $ANTLR start "rule__DangerousCondition__Group__3"
    // InternalBmod.g:1779:1: rule__DangerousCondition__Group__3 : rule__DangerousCondition__Group__3__Impl ;
    public final void rule__DangerousCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1783:1: ( rule__DangerousCondition__Group__3__Impl )
            // InternalBmod.g:1784:2: rule__DangerousCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DangerousCondition__Group__3__Impl();

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
    // $ANTLR end "rule__DangerousCondition__Group__3"


    // $ANTLR start "rule__DangerousCondition__Group__3__Impl"
    // InternalBmod.g:1790:1: rule__DangerousCondition__Group__3__Impl : ( ( rule__DangerousCondition__AmountAssignment_3 ) ) ;
    public final void rule__DangerousCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1794:1: ( ( ( rule__DangerousCondition__AmountAssignment_3 ) ) )
            // InternalBmod.g:1795:1: ( ( rule__DangerousCondition__AmountAssignment_3 ) )
            {
            // InternalBmod.g:1795:1: ( ( rule__DangerousCondition__AmountAssignment_3 ) )
            // InternalBmod.g:1796:2: ( rule__DangerousCondition__AmountAssignment_3 )
            {
             before(grammarAccess.getDangerousConditionAccess().getAmountAssignment_3()); 
            // InternalBmod.g:1797:2: ( rule__DangerousCondition__AmountAssignment_3 )
            // InternalBmod.g:1797:3: rule__DangerousCondition__AmountAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DangerousCondition__AmountAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDangerousConditionAccess().getAmountAssignment_3()); 

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
    // $ANTLR end "rule__DangerousCondition__Group__3__Impl"


    // $ANTLR start "rule__Coordinate__Group__0"
    // InternalBmod.g:1806:1: rule__Coordinate__Group__0 : rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 ;
    public final void rule__Coordinate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1810:1: ( rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 )
            // InternalBmod.g:1811:2: rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalBmod.g:1818:1: rule__Coordinate__Group__0__Impl : ( '(' ) ;
    public final void rule__Coordinate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1822:1: ( ( '(' ) )
            // InternalBmod.g:1823:1: ( '(' )
            {
            // InternalBmod.g:1823:1: ( '(' )
            // InternalBmod.g:1824:2: '('
            {
             before(grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBmod.g:1833:1: rule__Coordinate__Group__1 : rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2 ;
    public final void rule__Coordinate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1837:1: ( rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2 )
            // InternalBmod.g:1838:2: rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalBmod.g:1845:1: rule__Coordinate__Group__1__Impl : ( ( rule__Coordinate__XAssignment_1 ) ) ;
    public final void rule__Coordinate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1849:1: ( ( ( rule__Coordinate__XAssignment_1 ) ) )
            // InternalBmod.g:1850:1: ( ( rule__Coordinate__XAssignment_1 ) )
            {
            // InternalBmod.g:1850:1: ( ( rule__Coordinate__XAssignment_1 ) )
            // InternalBmod.g:1851:2: ( rule__Coordinate__XAssignment_1 )
            {
             before(grammarAccess.getCoordinateAccess().getXAssignment_1()); 
            // InternalBmod.g:1852:2: ( rule__Coordinate__XAssignment_1 )
            // InternalBmod.g:1852:3: rule__Coordinate__XAssignment_1
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
    // InternalBmod.g:1860:1: rule__Coordinate__Group__2 : rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3 ;
    public final void rule__Coordinate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1864:1: ( rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3 )
            // InternalBmod.g:1865:2: rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBmod.g:1872:1: rule__Coordinate__Group__2__Impl : ( ',' ) ;
    public final void rule__Coordinate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1876:1: ( ( ',' ) )
            // InternalBmod.g:1877:1: ( ',' )
            {
            // InternalBmod.g:1877:1: ( ',' )
            // InternalBmod.g:1878:2: ','
            {
             before(grammarAccess.getCoordinateAccess().getCommaKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBmod.g:1887:1: rule__Coordinate__Group__3 : rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4 ;
    public final void rule__Coordinate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1891:1: ( rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4 )
            // InternalBmod.g:1892:2: rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalBmod.g:1899:1: rule__Coordinate__Group__3__Impl : ( ( rule__Coordinate__YAssignment_3 ) ) ;
    public final void rule__Coordinate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1903:1: ( ( ( rule__Coordinate__YAssignment_3 ) ) )
            // InternalBmod.g:1904:1: ( ( rule__Coordinate__YAssignment_3 ) )
            {
            // InternalBmod.g:1904:1: ( ( rule__Coordinate__YAssignment_3 ) )
            // InternalBmod.g:1905:2: ( rule__Coordinate__YAssignment_3 )
            {
             before(grammarAccess.getCoordinateAccess().getYAssignment_3()); 
            // InternalBmod.g:1906:2: ( rule__Coordinate__YAssignment_3 )
            // InternalBmod.g:1906:3: rule__Coordinate__YAssignment_3
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
    // InternalBmod.g:1914:1: rule__Coordinate__Group__4 : rule__Coordinate__Group__4__Impl ;
    public final void rule__Coordinate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1918:1: ( rule__Coordinate__Group__4__Impl )
            // InternalBmod.g:1919:2: rule__Coordinate__Group__4__Impl
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
    // InternalBmod.g:1925:1: rule__Coordinate__Group__4__Impl : ( ')' ) ;
    public final void rule__Coordinate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1929:1: ( ( ')' ) )
            // InternalBmod.g:1930:1: ( ')' )
            {
            // InternalBmod.g:1930:1: ( ')' )
            // InternalBmod.g:1931:2: ')'
            {
             before(grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBmod.g:1941:1: rule__Area__Group__0 : rule__Area__Group__0__Impl rule__Area__Group__1 ;
    public final void rule__Area__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1945:1: ( rule__Area__Group__0__Impl rule__Area__Group__1 )
            // InternalBmod.g:1946:2: rule__Area__Group__0__Impl rule__Area__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBmod.g:1953:1: rule__Area__Group__0__Impl : ( 'from' ) ;
    public final void rule__Area__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1957:1: ( ( 'from' ) )
            // InternalBmod.g:1958:1: ( 'from' )
            {
            // InternalBmod.g:1958:1: ( 'from' )
            // InternalBmod.g:1959:2: 'from'
            {
             before(grammarAccess.getAreaAccess().getFromKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBmod.g:1968:1: rule__Area__Group__1 : rule__Area__Group__1__Impl rule__Area__Group__2 ;
    public final void rule__Area__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1972:1: ( rule__Area__Group__1__Impl rule__Area__Group__2 )
            // InternalBmod.g:1973:2: rule__Area__Group__1__Impl rule__Area__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalBmod.g:1980:1: rule__Area__Group__1__Impl : ( ( rule__Area__FromAssignment_1 ) ) ;
    public final void rule__Area__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1984:1: ( ( ( rule__Area__FromAssignment_1 ) ) )
            // InternalBmod.g:1985:1: ( ( rule__Area__FromAssignment_1 ) )
            {
            // InternalBmod.g:1985:1: ( ( rule__Area__FromAssignment_1 ) )
            // InternalBmod.g:1986:2: ( rule__Area__FromAssignment_1 )
            {
             before(grammarAccess.getAreaAccess().getFromAssignment_1()); 
            // InternalBmod.g:1987:2: ( rule__Area__FromAssignment_1 )
            // InternalBmod.g:1987:3: rule__Area__FromAssignment_1
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
    // InternalBmod.g:1995:1: rule__Area__Group__2 : rule__Area__Group__2__Impl rule__Area__Group__3 ;
    public final void rule__Area__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1999:1: ( rule__Area__Group__2__Impl rule__Area__Group__3 )
            // InternalBmod.g:2000:2: rule__Area__Group__2__Impl rule__Area__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBmod.g:2007:1: rule__Area__Group__2__Impl : ( 'to' ) ;
    public final void rule__Area__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2011:1: ( ( 'to' ) )
            // InternalBmod.g:2012:1: ( 'to' )
            {
            // InternalBmod.g:2012:1: ( 'to' )
            // InternalBmod.g:2013:2: 'to'
            {
             before(grammarAccess.getAreaAccess().getToKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBmod.g:2022:1: rule__Area__Group__3 : rule__Area__Group__3__Impl rule__Area__Group__4 ;
    public final void rule__Area__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2026:1: ( rule__Area__Group__3__Impl rule__Area__Group__4 )
            // InternalBmod.g:2027:2: rule__Area__Group__3__Impl rule__Area__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalBmod.g:2034:1: rule__Area__Group__3__Impl : ( ( rule__Area__ToAssignment_3 ) ) ;
    public final void rule__Area__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2038:1: ( ( ( rule__Area__ToAssignment_3 ) ) )
            // InternalBmod.g:2039:1: ( ( rule__Area__ToAssignment_3 ) )
            {
            // InternalBmod.g:2039:1: ( ( rule__Area__ToAssignment_3 ) )
            // InternalBmod.g:2040:2: ( rule__Area__ToAssignment_3 )
            {
             before(grammarAccess.getAreaAccess().getToAssignment_3()); 
            // InternalBmod.g:2041:2: ( rule__Area__ToAssignment_3 )
            // InternalBmod.g:2041:3: rule__Area__ToAssignment_3
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
    // InternalBmod.g:2049:1: rule__Area__Group__4 : rule__Area__Group__4__Impl ;
    public final void rule__Area__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2053:1: ( rule__Area__Group__4__Impl )
            // InternalBmod.g:2054:2: rule__Area__Group__4__Impl
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
    // InternalBmod.g:2060:1: rule__Area__Group__4__Impl : ( ( rule__Area__Group_4__0 )? ) ;
    public final void rule__Area__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2064:1: ( ( ( rule__Area__Group_4__0 )? ) )
            // InternalBmod.g:2065:1: ( ( rule__Area__Group_4__0 )? )
            {
            // InternalBmod.g:2065:1: ( ( rule__Area__Group_4__0 )? )
            // InternalBmod.g:2066:2: ( rule__Area__Group_4__0 )?
            {
             before(grammarAccess.getAreaAccess().getGroup_4()); 
            // InternalBmod.g:2067:2: ( rule__Area__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBmod.g:2067:3: rule__Area__Group_4__0
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
    // InternalBmod.g:2076:1: rule__Area__Group_4__0 : rule__Area__Group_4__0__Impl rule__Area__Group_4__1 ;
    public final void rule__Area__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2080:1: ( rule__Area__Group_4__0__Impl rule__Area__Group_4__1 )
            // InternalBmod.g:2081:2: rule__Area__Group_4__0__Impl rule__Area__Group_4__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBmod.g:2088:1: rule__Area__Group_4__0__Impl : ( 'without' ) ;
    public final void rule__Area__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2092:1: ( ( 'without' ) )
            // InternalBmod.g:2093:1: ( 'without' )
            {
            // InternalBmod.g:2093:1: ( 'without' )
            // InternalBmod.g:2094:2: 'without'
            {
             before(grammarAccess.getAreaAccess().getWithoutKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBmod.g:2103:1: rule__Area__Group_4__1 : rule__Area__Group_4__1__Impl rule__Area__Group_4__2 ;
    public final void rule__Area__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2107:1: ( rule__Area__Group_4__1__Impl rule__Area__Group_4__2 )
            // InternalBmod.g:2108:2: rule__Area__Group_4__1__Impl rule__Area__Group_4__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalBmod.g:2115:1: rule__Area__Group_4__1__Impl : ( ( rule__Area__WithoutAssignment_4_1 ) ) ;
    public final void rule__Area__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2119:1: ( ( ( rule__Area__WithoutAssignment_4_1 ) ) )
            // InternalBmod.g:2120:1: ( ( rule__Area__WithoutAssignment_4_1 ) )
            {
            // InternalBmod.g:2120:1: ( ( rule__Area__WithoutAssignment_4_1 ) )
            // InternalBmod.g:2121:2: ( rule__Area__WithoutAssignment_4_1 )
            {
             before(grammarAccess.getAreaAccess().getWithoutAssignment_4_1()); 
            // InternalBmod.g:2122:2: ( rule__Area__WithoutAssignment_4_1 )
            // InternalBmod.g:2122:3: rule__Area__WithoutAssignment_4_1
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
    // InternalBmod.g:2130:1: rule__Area__Group_4__2 : rule__Area__Group_4__2__Impl ;
    public final void rule__Area__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2134:1: ( rule__Area__Group_4__2__Impl )
            // InternalBmod.g:2135:2: rule__Area__Group_4__2__Impl
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
    // InternalBmod.g:2141:1: rule__Area__Group_4__2__Impl : ( ( rule__Area__Group_4_2__0 )* ) ;
    public final void rule__Area__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2145:1: ( ( ( rule__Area__Group_4_2__0 )* ) )
            // InternalBmod.g:2146:1: ( ( rule__Area__Group_4_2__0 )* )
            {
            // InternalBmod.g:2146:1: ( ( rule__Area__Group_4_2__0 )* )
            // InternalBmod.g:2147:2: ( rule__Area__Group_4_2__0 )*
            {
             before(grammarAccess.getAreaAccess().getGroup_4_2()); 
            // InternalBmod.g:2148:2: ( rule__Area__Group_4_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBmod.g:2148:3: rule__Area__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Area__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalBmod.g:2157:1: rule__Area__Group_4_2__0 : rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1 ;
    public final void rule__Area__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2161:1: ( rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1 )
            // InternalBmod.g:2162:2: rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBmod.g:2169:1: rule__Area__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Area__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2173:1: ( ( ',' ) )
            // InternalBmod.g:2174:1: ( ',' )
            {
            // InternalBmod.g:2174:1: ( ',' )
            // InternalBmod.g:2175:2: ','
            {
             before(grammarAccess.getAreaAccess().getCommaKeyword_4_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBmod.g:2184:1: rule__Area__Group_4_2__1 : rule__Area__Group_4_2__1__Impl ;
    public final void rule__Area__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2188:1: ( rule__Area__Group_4_2__1__Impl )
            // InternalBmod.g:2189:2: rule__Area__Group_4_2__1__Impl
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
    // InternalBmod.g:2195:1: rule__Area__Group_4_2__1__Impl : ( ( rule__Area__WithoutAssignment_4_2_1 ) ) ;
    public final void rule__Area__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2199:1: ( ( ( rule__Area__WithoutAssignment_4_2_1 ) ) )
            // InternalBmod.g:2200:1: ( ( rule__Area__WithoutAssignment_4_2_1 ) )
            {
            // InternalBmod.g:2200:1: ( ( rule__Area__WithoutAssignment_4_2_1 ) )
            // InternalBmod.g:2201:2: ( rule__Area__WithoutAssignment_4_2_1 )
            {
             before(grammarAccess.getAreaAccess().getWithoutAssignment_4_2_1()); 
            // InternalBmod.g:2202:2: ( rule__Area__WithoutAssignment_4_2_1 )
            // InternalBmod.g:2202:3: rule__Area__WithoutAssignment_4_2_1
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


    // $ANTLR start "rule__Floorplan__PerceptionsAssignment_1_0"
    // InternalBmod.g:2211:1: rule__Floorplan__PerceptionsAssignment_1_0 : ( rulePerceptionLevel ) ;
    public final void rule__Floorplan__PerceptionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2215:1: ( ( rulePerceptionLevel ) )
            // InternalBmod.g:2216:2: ( rulePerceptionLevel )
            {
            // InternalBmod.g:2216:2: ( rulePerceptionLevel )
            // InternalBmod.g:2217:3: rulePerceptionLevel
            {
             before(grammarAccess.getFloorplanAccess().getPerceptionsPerceptionLevelParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePerceptionLevel();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getPerceptionsPerceptionLevelParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Floorplan__PerceptionsAssignment_1_0"


    // $ANTLR start "rule__Floorplan__ActionsAssignment_1_1"
    // InternalBmod.g:2226:1: rule__Floorplan__ActionsAssignment_1_1 : ( ruleActionProfile ) ;
    public final void rule__Floorplan__ActionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2230:1: ( ( ruleActionProfile ) )
            // InternalBmod.g:2231:2: ( ruleActionProfile )
            {
            // InternalBmod.g:2231:2: ( ruleActionProfile )
            // InternalBmod.g:2232:3: ruleActionProfile
            {
             before(grammarAccess.getFloorplanAccess().getActionsActionProfileParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActionProfile();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getActionsActionProfileParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Floorplan__ActionsAssignment_1_1"


    // $ANTLR start "rule__Floorplan__RoomsAssignment_1_2"
    // InternalBmod.g:2241:1: rule__Floorplan__RoomsAssignment_1_2 : ( ruleRoom ) ;
    public final void rule__Floorplan__RoomsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2245:1: ( ( ruleRoom ) )
            // InternalBmod.g:2246:2: ( ruleRoom )
            {
            // InternalBmod.g:2246:2: ( ruleRoom )
            // InternalBmod.g:2247:3: ruleRoom
            {
             before(grammarAccess.getFloorplanAccess().getRoomsRoomParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getRoomsRoomParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Floorplan__RoomsAssignment_1_2"


    // $ANTLR start "rule__Floorplan__DoorsAssignment_1_3"
    // InternalBmod.g:2256:1: rule__Floorplan__DoorsAssignment_1_3 : ( ruleDoor ) ;
    public final void rule__Floorplan__DoorsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2260:1: ( ( ruleDoor ) )
            // InternalBmod.g:2261:2: ( ruleDoor )
            {
            // InternalBmod.g:2261:2: ( ruleDoor )
            // InternalBmod.g:2262:3: ruleDoor
            {
             before(grammarAccess.getFloorplanAccess().getDoorsDoorParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDoor();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getDoorsDoorParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__Floorplan__DoorsAssignment_1_3"


    // $ANTLR start "rule__Floorplan__PersonsAssignment_1_4"
    // InternalBmod.g:2271:1: rule__Floorplan__PersonsAssignment_1_4 : ( rulePerson ) ;
    public final void rule__Floorplan__PersonsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2275:1: ( ( rulePerson ) )
            // InternalBmod.g:2276:2: ( rulePerson )
            {
            // InternalBmod.g:2276:2: ( rulePerson )
            // InternalBmod.g:2277:3: rulePerson
            {
             before(grammarAccess.getFloorplanAccess().getPersonsPersonParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getPersonsPersonParserRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__Floorplan__PersonsAssignment_1_4"


    // $ANTLR start "rule__Floorplan__ExitsAssignment_1_5"
    // InternalBmod.g:2286:1: rule__Floorplan__ExitsAssignment_1_5 : ( ruleExit ) ;
    public final void rule__Floorplan__ExitsAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2290:1: ( ( ruleExit ) )
            // InternalBmod.g:2291:2: ( ruleExit )
            {
            // InternalBmod.g:2291:2: ( ruleExit )
            // InternalBmod.g:2292:3: ruleExit
            {
             before(grammarAccess.getFloorplanAccess().getExitsExitParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExit();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getExitsExitParserRuleCall_1_5_0()); 

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
    // $ANTLR end "rule__Floorplan__ExitsAssignment_1_5"


    // $ANTLR start "rule__Floorplan__SignsAssignment_1_6"
    // InternalBmod.g:2301:1: rule__Floorplan__SignsAssignment_1_6 : ( ruleEmergencySign ) ;
    public final void rule__Floorplan__SignsAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2305:1: ( ( ruleEmergencySign ) )
            // InternalBmod.g:2306:2: ( ruleEmergencySign )
            {
            // InternalBmod.g:2306:2: ( ruleEmergencySign )
            // InternalBmod.g:2307:3: ruleEmergencySign
            {
             before(grammarAccess.getFloorplanAccess().getSignsEmergencySignParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEmergencySign();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getSignsEmergencySignParserRuleCall_1_6_0()); 

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
    // $ANTLR end "rule__Floorplan__SignsAssignment_1_6"


    // $ANTLR start "rule__Floorplan__DanconsAssignment_1_7"
    // InternalBmod.g:2316:1: rule__Floorplan__DanconsAssignment_1_7 : ( ruleDangerousCondition ) ;
    public final void rule__Floorplan__DanconsAssignment_1_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2320:1: ( ( ruleDangerousCondition ) )
            // InternalBmod.g:2321:2: ( ruleDangerousCondition )
            {
            // InternalBmod.g:2321:2: ( ruleDangerousCondition )
            // InternalBmod.g:2322:3: ruleDangerousCondition
            {
             before(grammarAccess.getFloorplanAccess().getDanconsDangerousConditionParserRuleCall_1_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDangerousCondition();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getDanconsDangerousConditionParserRuleCall_1_7_0()); 

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
    // $ANTLR end "rule__Floorplan__DanconsAssignment_1_7"


    // $ANTLR start "rule__Room__NameAssignment_1"
    // InternalBmod.g:2331:1: rule__Room__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Room__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2335:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2336:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:2336:2: ( RULE_VARNAME )
            // InternalBmod.g:2337:3: RULE_VARNAME
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


    // $ANTLR start "rule__Room__NamedAssignment_2_1"
    // InternalBmod.g:2346:1: rule__Room__NamedAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Room__NamedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2350:1: ( ( RULE_STRING ) )
            // InternalBmod.g:2351:2: ( RULE_STRING )
            {
            // InternalBmod.g:2351:2: ( RULE_STRING )
            // InternalBmod.g:2352:3: RULE_STRING
            {
             before(grammarAccess.getRoomAccess().getNamedSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getNamedSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Room__NamedAssignment_2_1"


    // $ANTLR start "rule__Room__AreasAssignment_3"
    // InternalBmod.g:2361:1: rule__Room__AreasAssignment_3 : ( ruleArea ) ;
    public final void rule__Room__AreasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2365:1: ( ( ruleArea ) )
            // InternalBmod.g:2366:2: ( ruleArea )
            {
            // InternalBmod.g:2366:2: ( ruleArea )
            // InternalBmod.g:2367:3: ruleArea
            {
             before(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArea();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Room__AreasAssignment_3"


    // $ANTLR start "rule__Room__AreasAssignment_4_1"
    // InternalBmod.g:2376:1: rule__Room__AreasAssignment_4_1 : ( ruleArea ) ;
    public final void rule__Room__AreasAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2380:1: ( ( ruleArea ) )
            // InternalBmod.g:2381:2: ( ruleArea )
            {
            // InternalBmod.g:2381:2: ( ruleArea )
            // InternalBmod.g:2382:3: ruleArea
            {
             before(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArea();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Room__AreasAssignment_4_1"


    // $ANTLR start "rule__Door__NameAssignment_1"
    // InternalBmod.g:2391:1: rule__Door__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Door__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2395:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2396:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:2396:2: ( RULE_VARNAME )
            // InternalBmod.g:2397:3: RULE_VARNAME
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
    // InternalBmod.g:2406:1: rule__Door__FromAssignment_3 : ( ruleCoordinate ) ;
    public final void rule__Door__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2410:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2411:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2411:2: ( ruleCoordinate )
            // InternalBmod.g:2412:3: ruleCoordinate
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
    // InternalBmod.g:2421:1: rule__Door__ToAssignment_5 : ( ruleCoordinate ) ;
    public final void rule__Door__ToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2425:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2426:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2426:2: ( ruleCoordinate )
            // InternalBmod.g:2427:3: ruleCoordinate
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


    // $ANTLR start "rule__PerceptionLevel__NameAssignment_1"
    // InternalBmod.g:2436:1: rule__PerceptionLevel__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__PerceptionLevel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2440:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2441:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:2441:2: ( RULE_VARNAME )
            // InternalBmod.g:2442:3: RULE_VARNAME
            {
             before(grammarAccess.getPerceptionLevelAccess().getNameVARNAMETerminalRuleCall_1_0()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getPerceptionLevelAccess().getNameVARNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PerceptionLevel__NameAssignment_1"


    // $ANTLR start "rule__ActionProfile__NameAssignment_1"
    // InternalBmod.g:2451:1: rule__ActionProfile__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__ActionProfile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2455:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2456:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:2456:2: ( RULE_VARNAME )
            // InternalBmod.g:2457:3: RULE_VARNAME
            {
             before(grammarAccess.getActionProfileAccess().getNameVARNAMETerminalRuleCall_1_0()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getActionProfileAccess().getNameVARNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ActionProfile__NameAssignment_1"


    // $ANTLR start "rule__Perception__ExistingAssignment_0"
    // InternalBmod.g:2466:1: rule__Perception__ExistingAssignment_0 : ( rulePerceptionEnum ) ;
    public final void rule__Perception__ExistingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2470:1: ( ( rulePerceptionEnum ) )
            // InternalBmod.g:2471:2: ( rulePerceptionEnum )
            {
            // InternalBmod.g:2471:2: ( rulePerceptionEnum )
            // InternalBmod.g:2472:3: rulePerceptionEnum
            {
             before(grammarAccess.getPerceptionAccess().getExistingPerceptionEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePerceptionEnum();

            state._fsp--;

             after(grammarAccess.getPerceptionAccess().getExistingPerceptionEnumEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Perception__ExistingAssignment_0"


    // $ANTLR start "rule__Perception__CustomAssignment_1"
    // InternalBmod.g:2481:1: rule__Perception__CustomAssignment_1 : ( ( RULE_VARNAME ) ) ;
    public final void rule__Perception__CustomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2485:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2486:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2486:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2487:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getPerceptionAccess().getCustomPerceptionLevelCrossReference_1_0()); 
            // InternalBmod.g:2488:3: ( RULE_VARNAME )
            // InternalBmod.g:2489:4: RULE_VARNAME
            {
             before(grammarAccess.getPerceptionAccess().getCustomPerceptionLevelVARNAMETerminalRuleCall_1_0_1()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getPerceptionAccess().getCustomPerceptionLevelVARNAMETerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPerceptionAccess().getCustomPerceptionLevelCrossReference_1_0()); 

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
    // $ANTLR end "rule__Perception__CustomAssignment_1"


    // $ANTLR start "rule__Action__ExistingAssignment_0"
    // InternalBmod.g:2500:1: rule__Action__ExistingAssignment_0 : ( ruleActionEnum ) ;
    public final void rule__Action__ExistingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2504:1: ( ( ruleActionEnum ) )
            // InternalBmod.g:2505:2: ( ruleActionEnum )
            {
            // InternalBmod.g:2505:2: ( ruleActionEnum )
            // InternalBmod.g:2506:3: ruleActionEnum
            {
             before(grammarAccess.getActionAccess().getExistingActionEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleActionEnum();

            state._fsp--;

             after(grammarAccess.getActionAccess().getExistingActionEnumEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Action__ExistingAssignment_0"


    // $ANTLR start "rule__Action__CustomAssignment_1"
    // InternalBmod.g:2515:1: rule__Action__CustomAssignment_1 : ( ( RULE_VARNAME ) ) ;
    public final void rule__Action__CustomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2519:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2520:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2520:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2521:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getActionAccess().getCustomActionProfileCrossReference_1_0()); 
            // InternalBmod.g:2522:3: ( RULE_VARNAME )
            // InternalBmod.g:2523:4: RULE_VARNAME
            {
             before(grammarAccess.getActionAccess().getCustomActionProfileVARNAMETerminalRuleCall_1_0_1()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCustomActionProfileVARNAMETerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActionAccess().getCustomActionProfileCrossReference_1_0()); 

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
    // $ANTLR end "rule__Action__CustomAssignment_1"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalBmod.g:2534:1: rule__Person__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2538:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2539:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:2539:2: ( RULE_VARNAME )
            // InternalBmod.g:2540:3: RULE_VARNAME
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
    // InternalBmod.g:2549:1: rule__Person__NamedAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Person__NamedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2553:1: ( ( RULE_STRING ) )
            // InternalBmod.g:2554:2: ( RULE_STRING )
            {
            // InternalBmod.g:2554:2: ( RULE_STRING )
            // InternalBmod.g:2555:3: RULE_STRING
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
    // InternalBmod.g:2564:1: rule__Person__LocationAssignment_5 : ( ruleCoordinate ) ;
    public final void rule__Person__LocationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2568:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2569:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2569:2: ( ruleCoordinate )
            // InternalBmod.g:2570:3: ruleCoordinate
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


    // $ANTLR start "rule__Person__PerceptionAssignment_7"
    // InternalBmod.g:2579:1: rule__Person__PerceptionAssignment_7 : ( rulePerception ) ;
    public final void rule__Person__PerceptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2583:1: ( ( rulePerception ) )
            // InternalBmod.g:2584:2: ( rulePerception )
            {
            // InternalBmod.g:2584:2: ( rulePerception )
            // InternalBmod.g:2585:3: rulePerception
            {
             before(grammarAccess.getPersonAccess().getPerceptionPerceptionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePerception();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getPerceptionPerceptionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Person__PerceptionAssignment_7"


    // $ANTLR start "rule__Person__ActionAssignment_9"
    // InternalBmod.g:2594:1: rule__Person__ActionAssignment_9 : ( ruleAction ) ;
    public final void rule__Person__ActionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2598:1: ( ( ruleAction ) )
            // InternalBmod.g:2599:2: ( ruleAction )
            {
            // InternalBmod.g:2599:2: ( ruleAction )
            // InternalBmod.g:2600:3: ruleAction
            {
             before(grammarAccess.getPersonAccess().getActionActionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getActionActionParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Person__ActionAssignment_9"


    // $ANTLR start "rule__Exit__LocationAssignment_2"
    // InternalBmod.g:2609:1: rule__Exit__LocationAssignment_2 : ( ruleCoordinate ) ;
    public final void rule__Exit__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2613:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2614:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2614:2: ( ruleCoordinate )
            // InternalBmod.g:2615:3: ruleCoordinate
            {
             before(grammarAccess.getExitAccess().getLocationCoordinateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getExitAccess().getLocationCoordinateParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Exit__LocationAssignment_2"


    // $ANTLR start "rule__EmergencySign__OnAssignment_2"
    // InternalBmod.g:2624:1: rule__EmergencySign__OnAssignment_2 : ( ( RULE_VARNAME ) ) ;
    public final void rule__EmergencySign__OnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2628:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2629:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2629:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2630:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getEmergencySignAccess().getOnDoorCrossReference_2_0()); 
            // InternalBmod.g:2631:3: ( RULE_VARNAME )
            // InternalBmod.g:2632:4: RULE_VARNAME
            {
             before(grammarAccess.getEmergencySignAccess().getOnDoorVARNAMETerminalRuleCall_2_0_1()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getEmergencySignAccess().getOnDoorVARNAMETerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEmergencySignAccess().getOnDoorCrossReference_2_0()); 

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
    // $ANTLR end "rule__EmergencySign__OnAssignment_2"


    // $ANTLR start "rule__EmergencySign__ToAssignment_3"
    // InternalBmod.g:2643:1: rule__EmergencySign__ToAssignment_3 : ( ruleDoorRef ) ;
    public final void rule__EmergencySign__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2647:1: ( ( ruleDoorRef ) )
            // InternalBmod.g:2648:2: ( ruleDoorRef )
            {
            // InternalBmod.g:2648:2: ( ruleDoorRef )
            // InternalBmod.g:2649:3: ruleDoorRef
            {
             before(grammarAccess.getEmergencySignAccess().getToDoorRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDoorRef();

            state._fsp--;

             after(grammarAccess.getEmergencySignAccess().getToDoorRefParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__EmergencySign__ToAssignment_3"


    // $ANTLR start "rule__DoorRef__RefAssignment_1"
    // InternalBmod.g:2658:1: rule__DoorRef__RefAssignment_1 : ( ( RULE_VARNAME ) ) ;
    public final void rule__DoorRef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2662:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2663:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2663:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2664:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getDoorRefAccess().getRefDoorCrossReference_1_0()); 
            // InternalBmod.g:2665:3: ( RULE_VARNAME )
            // InternalBmod.g:2666:4: RULE_VARNAME
            {
             before(grammarAccess.getDoorRefAccess().getRefDoorVARNAMETerminalRuleCall_1_0_1()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getDoorRefAccess().getRefDoorVARNAMETerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDoorRefAccess().getRefDoorCrossReference_1_0()); 

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
    // $ANTLR end "rule__DoorRef__RefAssignment_1"


    // $ANTLR start "rule__DangerousCondition__OnAssignment_2"
    // InternalBmod.g:2677:1: rule__DangerousCondition__OnAssignment_2 : ( ( RULE_VARNAME ) ) ;
    public final void rule__DangerousCondition__OnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2681:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2682:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2682:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2683:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getDangerousConditionAccess().getOnRoomCrossReference_2_0()); 
            // InternalBmod.g:2684:3: ( RULE_VARNAME )
            // InternalBmod.g:2685:4: RULE_VARNAME
            {
             before(grammarAccess.getDangerousConditionAccess().getOnRoomVARNAMETerminalRuleCall_2_0_1()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getDangerousConditionAccess().getOnRoomVARNAMETerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDangerousConditionAccess().getOnRoomCrossReference_2_0()); 

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
    // $ANTLR end "rule__DangerousCondition__OnAssignment_2"


    // $ANTLR start "rule__DangerousCondition__AmountAssignment_3"
    // InternalBmod.g:2696:1: rule__DangerousCondition__AmountAssignment_3 : ( RULE_INT ) ;
    public final void rule__DangerousCondition__AmountAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2700:1: ( ( RULE_INT ) )
            // InternalBmod.g:2701:2: ( RULE_INT )
            {
            // InternalBmod.g:2701:2: ( RULE_INT )
            // InternalBmod.g:2702:3: RULE_INT
            {
             before(grammarAccess.getDangerousConditionAccess().getAmountINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDangerousConditionAccess().getAmountINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__DangerousCondition__AmountAssignment_3"


    // $ANTLR start "rule__Coordinate__XAssignment_1"
    // InternalBmod.g:2711:1: rule__Coordinate__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Coordinate__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2715:1: ( ( RULE_INT ) )
            // InternalBmod.g:2716:2: ( RULE_INT )
            {
            // InternalBmod.g:2716:2: ( RULE_INT )
            // InternalBmod.g:2717:3: RULE_INT
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
    // InternalBmod.g:2726:1: rule__Coordinate__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Coordinate__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2730:1: ( ( RULE_INT ) )
            // InternalBmod.g:2731:2: ( RULE_INT )
            {
            // InternalBmod.g:2731:2: ( RULE_INT )
            // InternalBmod.g:2732:3: RULE_INT
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
    // InternalBmod.g:2741:1: rule__Area__FromAssignment_1 : ( ruleCoordinate ) ;
    public final void rule__Area__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2745:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2746:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2746:2: ( ruleCoordinate )
            // InternalBmod.g:2747:3: ruleCoordinate
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
    // InternalBmod.g:2756:1: rule__Area__ToAssignment_3 : ( ruleCoordinate ) ;
    public final void rule__Area__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2760:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2761:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2761:2: ( ruleCoordinate )
            // InternalBmod.g:2762:3: ruleCoordinate
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
    // InternalBmod.g:2771:1: rule__Area__WithoutAssignment_4_1 : ( ruleCoordinate ) ;
    public final void rule__Area__WithoutAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2775:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2776:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2776:2: ( ruleCoordinate )
            // InternalBmod.g:2777:3: ruleCoordinate
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
    // InternalBmod.g:2786:1: rule__Area__WithoutAssignment_4_2_1 : ( ruleCoordinate ) ;
    public final void rule__Area__WithoutAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2790:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2791:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2791:2: ( ruleCoordinate )
            // InternalBmod.g:2792:3: ruleCoordinate
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000058E480000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000058E480002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000F010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000070010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});

}