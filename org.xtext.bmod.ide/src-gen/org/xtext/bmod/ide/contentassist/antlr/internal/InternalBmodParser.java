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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARNAME", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'attentive'", "'relaxed'", "'optimistic'", "'sceptic'", "'newcomer'", "'experienced'", "'panic'", "'Room'", "'and'", "'Door'", "'from'", "'to'", "'PerceptionLevel'", "'ActionProfile'", "'Person'", "'in'", "':'", "','", "'Exit'", "'Fire'", "'Sign'", "'on'", "'Condition'", "'('", "')'", "'without'"
    };
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


    // $ANTLR start "entryRulePerception"
    // InternalBmod.g:153:1: entryRulePerception : rulePerception EOF ;
    public final void entryRulePerception() throws RecognitionException {
        try {
            // InternalBmod.g:154:1: ( rulePerception EOF )
            // InternalBmod.g:155:1: rulePerception EOF
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
    // InternalBmod.g:162:1: rulePerception : ( ( rule__Perception__Alternatives ) ) ;
    public final void rulePerception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:166:2: ( ( ( rule__Perception__Alternatives ) ) )
            // InternalBmod.g:167:2: ( ( rule__Perception__Alternatives ) )
            {
            // InternalBmod.g:167:2: ( ( rule__Perception__Alternatives ) )
            // InternalBmod.g:168:3: ( rule__Perception__Alternatives )
            {
             before(grammarAccess.getPerceptionAccess().getAlternatives()); 
            // InternalBmod.g:169:3: ( rule__Perception__Alternatives )
            // InternalBmod.g:169:4: rule__Perception__Alternatives
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
    // InternalBmod.g:178:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalBmod.g:179:1: ( ruleAction EOF )
            // InternalBmod.g:180:1: ruleAction EOF
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
    // InternalBmod.g:187:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:191:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalBmod.g:192:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalBmod.g:192:2: ( ( rule__Action__Alternatives ) )
            // InternalBmod.g:193:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalBmod.g:194:3: ( rule__Action__Alternatives )
            // InternalBmod.g:194:4: rule__Action__Alternatives
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


    // $ANTLR start "entryRulePerceptionLevel"
    // InternalBmod.g:203:1: entryRulePerceptionLevel : rulePerceptionLevel EOF ;
    public final void entryRulePerceptionLevel() throws RecognitionException {
        try {
            // InternalBmod.g:204:1: ( rulePerceptionLevel EOF )
            // InternalBmod.g:205:1: rulePerceptionLevel EOF
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
    // InternalBmod.g:212:1: rulePerceptionLevel : ( ( rule__PerceptionLevel__Group__0 ) ) ;
    public final void rulePerceptionLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:216:2: ( ( ( rule__PerceptionLevel__Group__0 ) ) )
            // InternalBmod.g:217:2: ( ( rule__PerceptionLevel__Group__0 ) )
            {
            // InternalBmod.g:217:2: ( ( rule__PerceptionLevel__Group__0 ) )
            // InternalBmod.g:218:3: ( rule__PerceptionLevel__Group__0 )
            {
             before(grammarAccess.getPerceptionLevelAccess().getGroup()); 
            // InternalBmod.g:219:3: ( rule__PerceptionLevel__Group__0 )
            // InternalBmod.g:219:4: rule__PerceptionLevel__Group__0
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
    // InternalBmod.g:228:1: entryRuleActionProfile : ruleActionProfile EOF ;
    public final void entryRuleActionProfile() throws RecognitionException {
        try {
            // InternalBmod.g:229:1: ( ruleActionProfile EOF )
            // InternalBmod.g:230:1: ruleActionProfile EOF
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
    // InternalBmod.g:237:1: ruleActionProfile : ( ( rule__ActionProfile__Group__0 ) ) ;
    public final void ruleActionProfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:241:2: ( ( ( rule__ActionProfile__Group__0 ) ) )
            // InternalBmod.g:242:2: ( ( rule__ActionProfile__Group__0 ) )
            {
            // InternalBmod.g:242:2: ( ( rule__ActionProfile__Group__0 ) )
            // InternalBmod.g:243:3: ( rule__ActionProfile__Group__0 )
            {
             before(grammarAccess.getActionProfileAccess().getGroup()); 
            // InternalBmod.g:244:3: ( rule__ActionProfile__Group__0 )
            // InternalBmod.g:244:4: rule__ActionProfile__Group__0
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


    // $ANTLR start "entryRuleFire"
    // InternalBmod.g:303:1: entryRuleFire : ruleFire EOF ;
    public final void entryRuleFire() throws RecognitionException {
        try {
            // InternalBmod.g:304:1: ( ruleFire EOF )
            // InternalBmod.g:305:1: ruleFire EOF
            {
             before(grammarAccess.getFireRule()); 
            pushFollow(FOLLOW_1);
            ruleFire();

            state._fsp--;

             after(grammarAccess.getFireRule()); 
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
    // $ANTLR end "entryRuleFire"


    // $ANTLR start "ruleFire"
    // InternalBmod.g:312:1: ruleFire : ( ( rule__Fire__Group__0 ) ) ;
    public final void ruleFire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:316:2: ( ( ( rule__Fire__Group__0 ) ) )
            // InternalBmod.g:317:2: ( ( rule__Fire__Group__0 ) )
            {
            // InternalBmod.g:317:2: ( ( rule__Fire__Group__0 ) )
            // InternalBmod.g:318:3: ( rule__Fire__Group__0 )
            {
             before(grammarAccess.getFireAccess().getGroup()); 
            // InternalBmod.g:319:3: ( rule__Fire__Group__0 )
            // InternalBmod.g:319:4: rule__Fire__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFireAccess().getGroup()); 

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
    // $ANTLR end "ruleFire"


    // $ANTLR start "entryRuleEmergencySign"
    // InternalBmod.g:328:1: entryRuleEmergencySign : ruleEmergencySign EOF ;
    public final void entryRuleEmergencySign() throws RecognitionException {
        try {
            // InternalBmod.g:329:1: ( ruleEmergencySign EOF )
            // InternalBmod.g:330:1: ruleEmergencySign EOF
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
    // InternalBmod.g:337:1: ruleEmergencySign : ( ( rule__EmergencySign__Group__0 ) ) ;
    public final void ruleEmergencySign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:341:2: ( ( ( rule__EmergencySign__Group__0 ) ) )
            // InternalBmod.g:342:2: ( ( rule__EmergencySign__Group__0 ) )
            {
            // InternalBmod.g:342:2: ( ( rule__EmergencySign__Group__0 ) )
            // InternalBmod.g:343:3: ( rule__EmergencySign__Group__0 )
            {
             before(grammarAccess.getEmergencySignAccess().getGroup()); 
            // InternalBmod.g:344:3: ( rule__EmergencySign__Group__0 )
            // InternalBmod.g:344:4: rule__EmergencySign__Group__0
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
    // InternalBmod.g:353:1: entryRuleDoorRef : ruleDoorRef EOF ;
    public final void entryRuleDoorRef() throws RecognitionException {
        try {
            // InternalBmod.g:354:1: ( ruleDoorRef EOF )
            // InternalBmod.g:355:1: ruleDoorRef EOF
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
    // InternalBmod.g:362:1: ruleDoorRef : ( ( rule__DoorRef__Group__0 ) ) ;
    public final void ruleDoorRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:366:2: ( ( ( rule__DoorRef__Group__0 ) ) )
            // InternalBmod.g:367:2: ( ( rule__DoorRef__Group__0 ) )
            {
            // InternalBmod.g:367:2: ( ( rule__DoorRef__Group__0 ) )
            // InternalBmod.g:368:3: ( rule__DoorRef__Group__0 )
            {
             before(grammarAccess.getDoorRefAccess().getGroup()); 
            // InternalBmod.g:369:3: ( rule__DoorRef__Group__0 )
            // InternalBmod.g:369:4: rule__DoorRef__Group__0
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
    // InternalBmod.g:378:1: entryRuleDangerousCondition : ruleDangerousCondition EOF ;
    public final void entryRuleDangerousCondition() throws RecognitionException {
        try {
            // InternalBmod.g:379:1: ( ruleDangerousCondition EOF )
            // InternalBmod.g:380:1: ruleDangerousCondition EOF
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
    // InternalBmod.g:387:1: ruleDangerousCondition : ( ( rule__DangerousCondition__Group__0 ) ) ;
    public final void ruleDangerousCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:391:2: ( ( ( rule__DangerousCondition__Group__0 ) ) )
            // InternalBmod.g:392:2: ( ( rule__DangerousCondition__Group__0 ) )
            {
            // InternalBmod.g:392:2: ( ( rule__DangerousCondition__Group__0 ) )
            // InternalBmod.g:393:3: ( rule__DangerousCondition__Group__0 )
            {
             before(grammarAccess.getDangerousConditionAccess().getGroup()); 
            // InternalBmod.g:394:3: ( rule__DangerousCondition__Group__0 )
            // InternalBmod.g:394:4: rule__DangerousCondition__Group__0
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
    // InternalBmod.g:403:1: entryRuleCoordinate : ruleCoordinate EOF ;
    public final void entryRuleCoordinate() throws RecognitionException {
        try {
            // InternalBmod.g:404:1: ( ruleCoordinate EOF )
            // InternalBmod.g:405:1: ruleCoordinate EOF
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
    // InternalBmod.g:412:1: ruleCoordinate : ( ( rule__Coordinate__Group__0 ) ) ;
    public final void ruleCoordinate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:416:2: ( ( ( rule__Coordinate__Group__0 ) ) )
            // InternalBmod.g:417:2: ( ( rule__Coordinate__Group__0 ) )
            {
            // InternalBmod.g:417:2: ( ( rule__Coordinate__Group__0 ) )
            // InternalBmod.g:418:3: ( rule__Coordinate__Group__0 )
            {
             before(grammarAccess.getCoordinateAccess().getGroup()); 
            // InternalBmod.g:419:3: ( rule__Coordinate__Group__0 )
            // InternalBmod.g:419:4: rule__Coordinate__Group__0
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
    // InternalBmod.g:428:1: entryRuleArea : ruleArea EOF ;
    public final void entryRuleArea() throws RecognitionException {
        try {
            // InternalBmod.g:429:1: ( ruleArea EOF )
            // InternalBmod.g:430:1: ruleArea EOF
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
    // InternalBmod.g:437:1: ruleArea : ( ( rule__Area__Group__0 ) ) ;
    public final void ruleArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:441:2: ( ( ( rule__Area__Group__0 ) ) )
            // InternalBmod.g:442:2: ( ( rule__Area__Group__0 ) )
            {
            // InternalBmod.g:442:2: ( ( rule__Area__Group__0 ) )
            // InternalBmod.g:443:3: ( rule__Area__Group__0 )
            {
             before(grammarAccess.getAreaAccess().getGroup()); 
            // InternalBmod.g:444:3: ( rule__Area__Group__0 )
            // InternalBmod.g:444:4: rule__Area__Group__0
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
    // InternalBmod.g:453:1: rulePerceptionEnum : ( ( rule__PerceptionEnum__Alternatives ) ) ;
    public final void rulePerceptionEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:457:1: ( ( ( rule__PerceptionEnum__Alternatives ) ) )
            // InternalBmod.g:458:2: ( ( rule__PerceptionEnum__Alternatives ) )
            {
            // InternalBmod.g:458:2: ( ( rule__PerceptionEnum__Alternatives ) )
            // InternalBmod.g:459:3: ( rule__PerceptionEnum__Alternatives )
            {
             before(grammarAccess.getPerceptionEnumAccess().getAlternatives()); 
            // InternalBmod.g:460:3: ( rule__PerceptionEnum__Alternatives )
            // InternalBmod.g:460:4: rule__PerceptionEnum__Alternatives
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
    // InternalBmod.g:469:1: ruleActionEnum : ( ( rule__ActionEnum__Alternatives ) ) ;
    public final void ruleActionEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:473:1: ( ( ( rule__ActionEnum__Alternatives ) ) )
            // InternalBmod.g:474:2: ( ( rule__ActionEnum__Alternatives ) )
            {
            // InternalBmod.g:474:2: ( ( rule__ActionEnum__Alternatives ) )
            // InternalBmod.g:475:3: ( rule__ActionEnum__Alternatives )
            {
             before(grammarAccess.getActionEnumAccess().getAlternatives()); 
            // InternalBmod.g:476:3: ( rule__ActionEnum__Alternatives )
            // InternalBmod.g:476:4: rule__ActionEnum__Alternatives
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
    // InternalBmod.g:484:1: rule__Floorplan__Alternatives_1 : ( ( ( rule__Floorplan__PerceptionsAssignment_1_0 ) ) | ( ( rule__Floorplan__ActionsAssignment_1_1 ) ) | ( ( rule__Floorplan__RoomsAssignment_1_2 ) ) | ( ( rule__Floorplan__DoorsAssignment_1_3 ) ) | ( ( rule__Floorplan__PersonsAssignment_1_4 ) ) | ( ( rule__Floorplan__ExitsAssignment_1_5 ) ) | ( ( rule__Floorplan__FiresAssignment_1_6 ) ) | ( ( rule__Floorplan__SignsAssignment_1_7 ) ) | ( ( rule__Floorplan__DanconsAssignment_1_8 ) ) );
    public final void rule__Floorplan__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:488:1: ( ( ( rule__Floorplan__PerceptionsAssignment_1_0 ) ) | ( ( rule__Floorplan__ActionsAssignment_1_1 ) ) | ( ( rule__Floorplan__RoomsAssignment_1_2 ) ) | ( ( rule__Floorplan__DoorsAssignment_1_3 ) ) | ( ( rule__Floorplan__PersonsAssignment_1_4 ) ) | ( ( rule__Floorplan__ExitsAssignment_1_5 ) ) | ( ( rule__Floorplan__FiresAssignment_1_6 ) ) | ( ( rule__Floorplan__SignsAssignment_1_7 ) ) | ( ( rule__Floorplan__DanconsAssignment_1_8 ) ) )
            int alt1=9;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case 26:
                {
                alt1=5;
                }
                break;
            case 30:
                {
                alt1=6;
                }
                break;
            case 31:
                {
                alt1=7;
                }
                break;
            case 32:
                {
                alt1=8;
                }
                break;
            case 34:
                {
                alt1=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBmod.g:489:2: ( ( rule__Floorplan__PerceptionsAssignment_1_0 ) )
                    {
                    // InternalBmod.g:489:2: ( ( rule__Floorplan__PerceptionsAssignment_1_0 ) )
                    // InternalBmod.g:490:3: ( rule__Floorplan__PerceptionsAssignment_1_0 )
                    {
                     before(grammarAccess.getFloorplanAccess().getPerceptionsAssignment_1_0()); 
                    // InternalBmod.g:491:3: ( rule__Floorplan__PerceptionsAssignment_1_0 )
                    // InternalBmod.g:491:4: rule__Floorplan__PerceptionsAssignment_1_0
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
                    // InternalBmod.g:495:2: ( ( rule__Floorplan__ActionsAssignment_1_1 ) )
                    {
                    // InternalBmod.g:495:2: ( ( rule__Floorplan__ActionsAssignment_1_1 ) )
                    // InternalBmod.g:496:3: ( rule__Floorplan__ActionsAssignment_1_1 )
                    {
                     before(grammarAccess.getFloorplanAccess().getActionsAssignment_1_1()); 
                    // InternalBmod.g:497:3: ( rule__Floorplan__ActionsAssignment_1_1 )
                    // InternalBmod.g:497:4: rule__Floorplan__ActionsAssignment_1_1
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
                    // InternalBmod.g:501:2: ( ( rule__Floorplan__RoomsAssignment_1_2 ) )
                    {
                    // InternalBmod.g:501:2: ( ( rule__Floorplan__RoomsAssignment_1_2 ) )
                    // InternalBmod.g:502:3: ( rule__Floorplan__RoomsAssignment_1_2 )
                    {
                     before(grammarAccess.getFloorplanAccess().getRoomsAssignment_1_2()); 
                    // InternalBmod.g:503:3: ( rule__Floorplan__RoomsAssignment_1_2 )
                    // InternalBmod.g:503:4: rule__Floorplan__RoomsAssignment_1_2
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
                    // InternalBmod.g:507:2: ( ( rule__Floorplan__DoorsAssignment_1_3 ) )
                    {
                    // InternalBmod.g:507:2: ( ( rule__Floorplan__DoorsAssignment_1_3 ) )
                    // InternalBmod.g:508:3: ( rule__Floorplan__DoorsAssignment_1_3 )
                    {
                     before(grammarAccess.getFloorplanAccess().getDoorsAssignment_1_3()); 
                    // InternalBmod.g:509:3: ( rule__Floorplan__DoorsAssignment_1_3 )
                    // InternalBmod.g:509:4: rule__Floorplan__DoorsAssignment_1_3
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
                    // InternalBmod.g:513:2: ( ( rule__Floorplan__PersonsAssignment_1_4 ) )
                    {
                    // InternalBmod.g:513:2: ( ( rule__Floorplan__PersonsAssignment_1_4 ) )
                    // InternalBmod.g:514:3: ( rule__Floorplan__PersonsAssignment_1_4 )
                    {
                     before(grammarAccess.getFloorplanAccess().getPersonsAssignment_1_4()); 
                    // InternalBmod.g:515:3: ( rule__Floorplan__PersonsAssignment_1_4 )
                    // InternalBmod.g:515:4: rule__Floorplan__PersonsAssignment_1_4
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
                    // InternalBmod.g:519:2: ( ( rule__Floorplan__ExitsAssignment_1_5 ) )
                    {
                    // InternalBmod.g:519:2: ( ( rule__Floorplan__ExitsAssignment_1_5 ) )
                    // InternalBmod.g:520:3: ( rule__Floorplan__ExitsAssignment_1_5 )
                    {
                     before(grammarAccess.getFloorplanAccess().getExitsAssignment_1_5()); 
                    // InternalBmod.g:521:3: ( rule__Floorplan__ExitsAssignment_1_5 )
                    // InternalBmod.g:521:4: rule__Floorplan__ExitsAssignment_1_5
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
                    // InternalBmod.g:525:2: ( ( rule__Floorplan__FiresAssignment_1_6 ) )
                    {
                    // InternalBmod.g:525:2: ( ( rule__Floorplan__FiresAssignment_1_6 ) )
                    // InternalBmod.g:526:3: ( rule__Floorplan__FiresAssignment_1_6 )
                    {
                     before(grammarAccess.getFloorplanAccess().getFiresAssignment_1_6()); 
                    // InternalBmod.g:527:3: ( rule__Floorplan__FiresAssignment_1_6 )
                    // InternalBmod.g:527:4: rule__Floorplan__FiresAssignment_1_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__FiresAssignment_1_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getFiresAssignment_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBmod.g:531:2: ( ( rule__Floorplan__SignsAssignment_1_7 ) )
                    {
                    // InternalBmod.g:531:2: ( ( rule__Floorplan__SignsAssignment_1_7 ) )
                    // InternalBmod.g:532:3: ( rule__Floorplan__SignsAssignment_1_7 )
                    {
                     before(grammarAccess.getFloorplanAccess().getSignsAssignment_1_7()); 
                    // InternalBmod.g:533:3: ( rule__Floorplan__SignsAssignment_1_7 )
                    // InternalBmod.g:533:4: rule__Floorplan__SignsAssignment_1_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__SignsAssignment_1_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getSignsAssignment_1_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBmod.g:537:2: ( ( rule__Floorplan__DanconsAssignment_1_8 ) )
                    {
                    // InternalBmod.g:537:2: ( ( rule__Floorplan__DanconsAssignment_1_8 ) )
                    // InternalBmod.g:538:3: ( rule__Floorplan__DanconsAssignment_1_8 )
                    {
                     before(grammarAccess.getFloorplanAccess().getDanconsAssignment_1_8()); 
                    // InternalBmod.g:539:3: ( rule__Floorplan__DanconsAssignment_1_8 )
                    // InternalBmod.g:539:4: rule__Floorplan__DanconsAssignment_1_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__DanconsAssignment_1_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getDanconsAssignment_1_8()); 

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
    // InternalBmod.g:547:1: rule__Perception__Alternatives : ( ( ( rule__Perception__ExistingAssignment_0 ) ) | ( ( rule__Perception__CustomAssignment_1 ) ) );
    public final void rule__Perception__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:551:1: ( ( ( rule__Perception__ExistingAssignment_0 ) ) | ( ( rule__Perception__CustomAssignment_1 ) ) )
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
                    // InternalBmod.g:552:2: ( ( rule__Perception__ExistingAssignment_0 ) )
                    {
                    // InternalBmod.g:552:2: ( ( rule__Perception__ExistingAssignment_0 ) )
                    // InternalBmod.g:553:3: ( rule__Perception__ExistingAssignment_0 )
                    {
                     before(grammarAccess.getPerceptionAccess().getExistingAssignment_0()); 
                    // InternalBmod.g:554:3: ( rule__Perception__ExistingAssignment_0 )
                    // InternalBmod.g:554:4: rule__Perception__ExistingAssignment_0
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
                    // InternalBmod.g:558:2: ( ( rule__Perception__CustomAssignment_1 ) )
                    {
                    // InternalBmod.g:558:2: ( ( rule__Perception__CustomAssignment_1 ) )
                    // InternalBmod.g:559:3: ( rule__Perception__CustomAssignment_1 )
                    {
                     before(grammarAccess.getPerceptionAccess().getCustomAssignment_1()); 
                    // InternalBmod.g:560:3: ( rule__Perception__CustomAssignment_1 )
                    // InternalBmod.g:560:4: rule__Perception__CustomAssignment_1
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
    // InternalBmod.g:568:1: rule__Action__Alternatives : ( ( ( rule__Action__ExistingAssignment_0 ) ) | ( ( rule__Action__CustomAssignment_1 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:572:1: ( ( ( rule__Action__ExistingAssignment_0 ) ) | ( ( rule__Action__CustomAssignment_1 ) ) )
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
                    // InternalBmod.g:573:2: ( ( rule__Action__ExistingAssignment_0 ) )
                    {
                    // InternalBmod.g:573:2: ( ( rule__Action__ExistingAssignment_0 ) )
                    // InternalBmod.g:574:3: ( rule__Action__ExistingAssignment_0 )
                    {
                     before(grammarAccess.getActionAccess().getExistingAssignment_0()); 
                    // InternalBmod.g:575:3: ( rule__Action__ExistingAssignment_0 )
                    // InternalBmod.g:575:4: rule__Action__ExistingAssignment_0
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
                    // InternalBmod.g:579:2: ( ( rule__Action__CustomAssignment_1 ) )
                    {
                    // InternalBmod.g:579:2: ( ( rule__Action__CustomAssignment_1 ) )
                    // InternalBmod.g:580:3: ( rule__Action__CustomAssignment_1 )
                    {
                     before(grammarAccess.getActionAccess().getCustomAssignment_1()); 
                    // InternalBmod.g:581:3: ( rule__Action__CustomAssignment_1 )
                    // InternalBmod.g:581:4: rule__Action__CustomAssignment_1
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
    // InternalBmod.g:589:1: rule__PerceptionEnum__Alternatives : ( ( ( 'attentive' ) ) | ( ( 'relaxed' ) ) | ( ( 'optimistic' ) ) | ( ( 'sceptic' ) ) );
    public final void rule__PerceptionEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:593:1: ( ( ( 'attentive' ) ) | ( ( 'relaxed' ) ) | ( ( 'optimistic' ) ) | ( ( 'sceptic' ) ) )
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
                    // InternalBmod.g:594:2: ( ( 'attentive' ) )
                    {
                    // InternalBmod.g:594:2: ( ( 'attentive' ) )
                    // InternalBmod.g:595:3: ( 'attentive' )
                    {
                     before(grammarAccess.getPerceptionEnumAccess().getAttentiveEnumLiteralDeclaration_0()); 
                    // InternalBmod.g:596:3: ( 'attentive' )
                    // InternalBmod.g:596:4: 'attentive'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerceptionEnumAccess().getAttentiveEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:600:2: ( ( 'relaxed' ) )
                    {
                    // InternalBmod.g:600:2: ( ( 'relaxed' ) )
                    // InternalBmod.g:601:3: ( 'relaxed' )
                    {
                     before(grammarAccess.getPerceptionEnumAccess().getRelaxedEnumLiteralDeclaration_1()); 
                    // InternalBmod.g:602:3: ( 'relaxed' )
                    // InternalBmod.g:602:4: 'relaxed'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerceptionEnumAccess().getRelaxedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:606:2: ( ( 'optimistic' ) )
                    {
                    // InternalBmod.g:606:2: ( ( 'optimistic' ) )
                    // InternalBmod.g:607:3: ( 'optimistic' )
                    {
                     before(grammarAccess.getPerceptionEnumAccess().getOptimisticEnumLiteralDeclaration_2()); 
                    // InternalBmod.g:608:3: ( 'optimistic' )
                    // InternalBmod.g:608:4: 'optimistic'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerceptionEnumAccess().getOptimisticEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBmod.g:612:2: ( ( 'sceptic' ) )
                    {
                    // InternalBmod.g:612:2: ( ( 'sceptic' ) )
                    // InternalBmod.g:613:3: ( 'sceptic' )
                    {
                     before(grammarAccess.getPerceptionEnumAccess().getScepticEnumLiteralDeclaration_3()); 
                    // InternalBmod.g:614:3: ( 'sceptic' )
                    // InternalBmod.g:614:4: 'sceptic'
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
    // InternalBmod.g:622:1: rule__ActionEnum__Alternatives : ( ( ( 'newcomer' ) ) | ( ( 'experienced' ) ) | ( ( 'panic' ) ) );
    public final void rule__ActionEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:626:1: ( ( ( 'newcomer' ) ) | ( ( 'experienced' ) ) | ( ( 'panic' ) ) )
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
                    // InternalBmod.g:627:2: ( ( 'newcomer' ) )
                    {
                    // InternalBmod.g:627:2: ( ( 'newcomer' ) )
                    // InternalBmod.g:628:3: ( 'newcomer' )
                    {
                     before(grammarAccess.getActionEnumAccess().getNewcomerEnumLiteralDeclaration_0()); 
                    // InternalBmod.g:629:3: ( 'newcomer' )
                    // InternalBmod.g:629:4: 'newcomer'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getNewcomerEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:633:2: ( ( 'experienced' ) )
                    {
                    // InternalBmod.g:633:2: ( ( 'experienced' ) )
                    // InternalBmod.g:634:3: ( 'experienced' )
                    {
                     before(grammarAccess.getActionEnumAccess().getExperiencedEnumLiteralDeclaration_1()); 
                    // InternalBmod.g:635:3: ( 'experienced' )
                    // InternalBmod.g:635:4: 'experienced'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getExperiencedEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:639:2: ( ( 'panic' ) )
                    {
                    // InternalBmod.g:639:2: ( ( 'panic' ) )
                    // InternalBmod.g:640:3: ( 'panic' )
                    {
                     before(grammarAccess.getActionEnumAccess().getPanicEnumLiteralDeclaration_2()); 
                    // InternalBmod.g:641:3: ( 'panic' )
                    // InternalBmod.g:641:4: 'panic'
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
    // InternalBmod.g:649:1: rule__Floorplan__Group__0 : rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1 ;
    public final void rule__Floorplan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:653:1: ( rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1 )
            // InternalBmod.g:654:2: rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1
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
    // InternalBmod.g:661:1: rule__Floorplan__Group__0__Impl : ( () ) ;
    public final void rule__Floorplan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:665:1: ( ( () ) )
            // InternalBmod.g:666:1: ( () )
            {
            // InternalBmod.g:666:1: ( () )
            // InternalBmod.g:667:2: ()
            {
             before(grammarAccess.getFloorplanAccess().getFloorplanAction_0()); 
            // InternalBmod.g:668:2: ()
            // InternalBmod.g:668:3: 
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
    // InternalBmod.g:676:1: rule__Floorplan__Group__1 : rule__Floorplan__Group__1__Impl ;
    public final void rule__Floorplan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:680:1: ( rule__Floorplan__Group__1__Impl )
            // InternalBmod.g:681:2: rule__Floorplan__Group__1__Impl
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
    // InternalBmod.g:687:1: rule__Floorplan__Group__1__Impl : ( ( rule__Floorplan__Alternatives_1 )* ) ;
    public final void rule__Floorplan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:691:1: ( ( ( rule__Floorplan__Alternatives_1 )* ) )
            // InternalBmod.g:692:1: ( ( rule__Floorplan__Alternatives_1 )* )
            {
            // InternalBmod.g:692:1: ( ( rule__Floorplan__Alternatives_1 )* )
            // InternalBmod.g:693:2: ( rule__Floorplan__Alternatives_1 )*
            {
             before(grammarAccess.getFloorplanAccess().getAlternatives_1()); 
            // InternalBmod.g:694:2: ( rule__Floorplan__Alternatives_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19||LA6_0==21||(LA6_0>=24 && LA6_0<=26)||(LA6_0>=30 && LA6_0<=32)||LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBmod.g:694:3: rule__Floorplan__Alternatives_1
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
    // InternalBmod.g:703:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:707:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalBmod.g:708:2: rule__Room__Group__0__Impl rule__Room__Group__1
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
    // InternalBmod.g:715:1: rule__Room__Group__0__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:719:1: ( ( 'Room' ) )
            // InternalBmod.g:720:1: ( 'Room' )
            {
            // InternalBmod.g:720:1: ( 'Room' )
            // InternalBmod.g:721:2: 'Room'
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
    // InternalBmod.g:730:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:734:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalBmod.g:735:2: rule__Room__Group__1__Impl rule__Room__Group__2
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
    // InternalBmod.g:742:1: rule__Room__Group__1__Impl : ( ( rule__Room__NameAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:746:1: ( ( ( rule__Room__NameAssignment_1 ) ) )
            // InternalBmod.g:747:1: ( ( rule__Room__NameAssignment_1 ) )
            {
            // InternalBmod.g:747:1: ( ( rule__Room__NameAssignment_1 ) )
            // InternalBmod.g:748:2: ( rule__Room__NameAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_1()); 
            // InternalBmod.g:749:2: ( rule__Room__NameAssignment_1 )
            // InternalBmod.g:749:3: rule__Room__NameAssignment_1
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
    // InternalBmod.g:757:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:761:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalBmod.g:762:2: rule__Room__Group__2__Impl rule__Room__Group__3
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
    // InternalBmod.g:769:1: rule__Room__Group__2__Impl : ( ( rule__Room__AreasAssignment_2 ) ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:773:1: ( ( ( rule__Room__AreasAssignment_2 ) ) )
            // InternalBmod.g:774:1: ( ( rule__Room__AreasAssignment_2 ) )
            {
            // InternalBmod.g:774:1: ( ( rule__Room__AreasAssignment_2 ) )
            // InternalBmod.g:775:2: ( rule__Room__AreasAssignment_2 )
            {
             before(grammarAccess.getRoomAccess().getAreasAssignment_2()); 
            // InternalBmod.g:776:2: ( rule__Room__AreasAssignment_2 )
            // InternalBmod.g:776:3: rule__Room__AreasAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__AreasAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getAreasAssignment_2()); 

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
    // InternalBmod.g:784:1: rule__Room__Group__3 : rule__Room__Group__3__Impl ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:788:1: ( rule__Room__Group__3__Impl )
            // InternalBmod.g:789:2: rule__Room__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__3__Impl();

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
    // InternalBmod.g:795:1: rule__Room__Group__3__Impl : ( ( rule__Room__Group_3__0 )* ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:799:1: ( ( ( rule__Room__Group_3__0 )* ) )
            // InternalBmod.g:800:1: ( ( rule__Room__Group_3__0 )* )
            {
            // InternalBmod.g:800:1: ( ( rule__Room__Group_3__0 )* )
            // InternalBmod.g:801:2: ( rule__Room__Group_3__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_3()); 
            // InternalBmod.g:802:2: ( rule__Room__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBmod.g:802:3: rule__Room__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Room__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_3()); 

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


    // $ANTLR start "rule__Room__Group_3__0"
    // InternalBmod.g:811:1: rule__Room__Group_3__0 : rule__Room__Group_3__0__Impl rule__Room__Group_3__1 ;
    public final void rule__Room__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:815:1: ( rule__Room__Group_3__0__Impl rule__Room__Group_3__1 )
            // InternalBmod.g:816:2: rule__Room__Group_3__0__Impl rule__Room__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Room__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_3__1();

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
    // $ANTLR end "rule__Room__Group_3__0"


    // $ANTLR start "rule__Room__Group_3__0__Impl"
    // InternalBmod.g:823:1: rule__Room__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__Room__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:827:1: ( ( 'and' ) )
            // InternalBmod.g:828:1: ( 'and' )
            {
            // InternalBmod.g:828:1: ( 'and' )
            // InternalBmod.g:829:2: 'and'
            {
             before(grammarAccess.getRoomAccess().getAndKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getAndKeyword_3_0()); 

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
    // $ANTLR end "rule__Room__Group_3__0__Impl"


    // $ANTLR start "rule__Room__Group_3__1"
    // InternalBmod.g:838:1: rule__Room__Group_3__1 : rule__Room__Group_3__1__Impl ;
    public final void rule__Room__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:842:1: ( rule__Room__Group_3__1__Impl )
            // InternalBmod.g:843:2: rule__Room__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_3__1__Impl();

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
    // $ANTLR end "rule__Room__Group_3__1"


    // $ANTLR start "rule__Room__Group_3__1__Impl"
    // InternalBmod.g:849:1: rule__Room__Group_3__1__Impl : ( ( rule__Room__AreasAssignment_3_1 ) ) ;
    public final void rule__Room__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:853:1: ( ( ( rule__Room__AreasAssignment_3_1 ) ) )
            // InternalBmod.g:854:1: ( ( rule__Room__AreasAssignment_3_1 ) )
            {
            // InternalBmod.g:854:1: ( ( rule__Room__AreasAssignment_3_1 ) )
            // InternalBmod.g:855:2: ( rule__Room__AreasAssignment_3_1 )
            {
             before(grammarAccess.getRoomAccess().getAreasAssignment_3_1()); 
            // InternalBmod.g:856:2: ( rule__Room__AreasAssignment_3_1 )
            // InternalBmod.g:856:3: rule__Room__AreasAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__AreasAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getAreasAssignment_3_1()); 

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
    // $ANTLR end "rule__Room__Group_3__1__Impl"


    // $ANTLR start "rule__Door__Group__0"
    // InternalBmod.g:865:1: rule__Door__Group__0 : rule__Door__Group__0__Impl rule__Door__Group__1 ;
    public final void rule__Door__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:869:1: ( rule__Door__Group__0__Impl rule__Door__Group__1 )
            // InternalBmod.g:870:2: rule__Door__Group__0__Impl rule__Door__Group__1
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
    // InternalBmod.g:877:1: rule__Door__Group__0__Impl : ( 'Door' ) ;
    public final void rule__Door__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:881:1: ( ( 'Door' ) )
            // InternalBmod.g:882:1: ( 'Door' )
            {
            // InternalBmod.g:882:1: ( 'Door' )
            // InternalBmod.g:883:2: 'Door'
            {
             before(grammarAccess.getDoorAccess().getDoorKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBmod.g:892:1: rule__Door__Group__1 : rule__Door__Group__1__Impl rule__Door__Group__2 ;
    public final void rule__Door__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:896:1: ( rule__Door__Group__1__Impl rule__Door__Group__2 )
            // InternalBmod.g:897:2: rule__Door__Group__1__Impl rule__Door__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalBmod.g:904:1: rule__Door__Group__1__Impl : ( ( rule__Door__NameAssignment_1 ) ) ;
    public final void rule__Door__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:908:1: ( ( ( rule__Door__NameAssignment_1 ) ) )
            // InternalBmod.g:909:1: ( ( rule__Door__NameAssignment_1 ) )
            {
            // InternalBmod.g:909:1: ( ( rule__Door__NameAssignment_1 ) )
            // InternalBmod.g:910:2: ( rule__Door__NameAssignment_1 )
            {
             before(grammarAccess.getDoorAccess().getNameAssignment_1()); 
            // InternalBmod.g:911:2: ( rule__Door__NameAssignment_1 )
            // InternalBmod.g:911:3: rule__Door__NameAssignment_1
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
    // InternalBmod.g:919:1: rule__Door__Group__2 : rule__Door__Group__2__Impl rule__Door__Group__3 ;
    public final void rule__Door__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:923:1: ( rule__Door__Group__2__Impl rule__Door__Group__3 )
            // InternalBmod.g:924:2: rule__Door__Group__2__Impl rule__Door__Group__3
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
    // InternalBmod.g:931:1: rule__Door__Group__2__Impl : ( 'from' ) ;
    public final void rule__Door__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:935:1: ( ( 'from' ) )
            // InternalBmod.g:936:1: ( 'from' )
            {
            // InternalBmod.g:936:1: ( 'from' )
            // InternalBmod.g:937:2: 'from'
            {
             before(grammarAccess.getDoorAccess().getFromKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBmod.g:946:1: rule__Door__Group__3 : rule__Door__Group__3__Impl rule__Door__Group__4 ;
    public final void rule__Door__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:950:1: ( rule__Door__Group__3__Impl rule__Door__Group__4 )
            // InternalBmod.g:951:2: rule__Door__Group__3__Impl rule__Door__Group__4
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
    // InternalBmod.g:958:1: rule__Door__Group__3__Impl : ( ( rule__Door__FromAssignment_3 ) ) ;
    public final void rule__Door__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:962:1: ( ( ( rule__Door__FromAssignment_3 ) ) )
            // InternalBmod.g:963:1: ( ( rule__Door__FromAssignment_3 ) )
            {
            // InternalBmod.g:963:1: ( ( rule__Door__FromAssignment_3 ) )
            // InternalBmod.g:964:2: ( rule__Door__FromAssignment_3 )
            {
             before(grammarAccess.getDoorAccess().getFromAssignment_3()); 
            // InternalBmod.g:965:2: ( rule__Door__FromAssignment_3 )
            // InternalBmod.g:965:3: rule__Door__FromAssignment_3
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
    // InternalBmod.g:973:1: rule__Door__Group__4 : rule__Door__Group__4__Impl rule__Door__Group__5 ;
    public final void rule__Door__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:977:1: ( rule__Door__Group__4__Impl rule__Door__Group__5 )
            // InternalBmod.g:978:2: rule__Door__Group__4__Impl rule__Door__Group__5
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
    // InternalBmod.g:985:1: rule__Door__Group__4__Impl : ( 'to' ) ;
    public final void rule__Door__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:989:1: ( ( 'to' ) )
            // InternalBmod.g:990:1: ( 'to' )
            {
            // InternalBmod.g:990:1: ( 'to' )
            // InternalBmod.g:991:2: 'to'
            {
             before(grammarAccess.getDoorAccess().getToKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBmod.g:1000:1: rule__Door__Group__5 : rule__Door__Group__5__Impl ;
    public final void rule__Door__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1004:1: ( rule__Door__Group__5__Impl )
            // InternalBmod.g:1005:2: rule__Door__Group__5__Impl
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
    // InternalBmod.g:1011:1: rule__Door__Group__5__Impl : ( ( rule__Door__ToAssignment_5 ) ) ;
    public final void rule__Door__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1015:1: ( ( ( rule__Door__ToAssignment_5 ) ) )
            // InternalBmod.g:1016:1: ( ( rule__Door__ToAssignment_5 ) )
            {
            // InternalBmod.g:1016:1: ( ( rule__Door__ToAssignment_5 ) )
            // InternalBmod.g:1017:2: ( rule__Door__ToAssignment_5 )
            {
             before(grammarAccess.getDoorAccess().getToAssignment_5()); 
            // InternalBmod.g:1018:2: ( rule__Door__ToAssignment_5 )
            // InternalBmod.g:1018:3: rule__Door__ToAssignment_5
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
    // InternalBmod.g:1027:1: rule__PerceptionLevel__Group__0 : rule__PerceptionLevel__Group__0__Impl rule__PerceptionLevel__Group__1 ;
    public final void rule__PerceptionLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1031:1: ( rule__PerceptionLevel__Group__0__Impl rule__PerceptionLevel__Group__1 )
            // InternalBmod.g:1032:2: rule__PerceptionLevel__Group__0__Impl rule__PerceptionLevel__Group__1
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
    // InternalBmod.g:1039:1: rule__PerceptionLevel__Group__0__Impl : ( 'PerceptionLevel' ) ;
    public final void rule__PerceptionLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1043:1: ( ( 'PerceptionLevel' ) )
            // InternalBmod.g:1044:1: ( 'PerceptionLevel' )
            {
            // InternalBmod.g:1044:1: ( 'PerceptionLevel' )
            // InternalBmod.g:1045:2: 'PerceptionLevel'
            {
             before(grammarAccess.getPerceptionLevelAccess().getPerceptionLevelKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBmod.g:1054:1: rule__PerceptionLevel__Group__1 : rule__PerceptionLevel__Group__1__Impl ;
    public final void rule__PerceptionLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1058:1: ( rule__PerceptionLevel__Group__1__Impl )
            // InternalBmod.g:1059:2: rule__PerceptionLevel__Group__1__Impl
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
    // InternalBmod.g:1065:1: rule__PerceptionLevel__Group__1__Impl : ( ( rule__PerceptionLevel__NameAssignment_1 ) ) ;
    public final void rule__PerceptionLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1069:1: ( ( ( rule__PerceptionLevel__NameAssignment_1 ) ) )
            // InternalBmod.g:1070:1: ( ( rule__PerceptionLevel__NameAssignment_1 ) )
            {
            // InternalBmod.g:1070:1: ( ( rule__PerceptionLevel__NameAssignment_1 ) )
            // InternalBmod.g:1071:2: ( rule__PerceptionLevel__NameAssignment_1 )
            {
             before(grammarAccess.getPerceptionLevelAccess().getNameAssignment_1()); 
            // InternalBmod.g:1072:2: ( rule__PerceptionLevel__NameAssignment_1 )
            // InternalBmod.g:1072:3: rule__PerceptionLevel__NameAssignment_1
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
    // InternalBmod.g:1081:1: rule__ActionProfile__Group__0 : rule__ActionProfile__Group__0__Impl rule__ActionProfile__Group__1 ;
    public final void rule__ActionProfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1085:1: ( rule__ActionProfile__Group__0__Impl rule__ActionProfile__Group__1 )
            // InternalBmod.g:1086:2: rule__ActionProfile__Group__0__Impl rule__ActionProfile__Group__1
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
    // InternalBmod.g:1093:1: rule__ActionProfile__Group__0__Impl : ( 'ActionProfile' ) ;
    public final void rule__ActionProfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1097:1: ( ( 'ActionProfile' ) )
            // InternalBmod.g:1098:1: ( 'ActionProfile' )
            {
            // InternalBmod.g:1098:1: ( 'ActionProfile' )
            // InternalBmod.g:1099:2: 'ActionProfile'
            {
             before(grammarAccess.getActionProfileAccess().getActionProfileKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBmod.g:1108:1: rule__ActionProfile__Group__1 : rule__ActionProfile__Group__1__Impl ;
    public final void rule__ActionProfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1112:1: ( rule__ActionProfile__Group__1__Impl )
            // InternalBmod.g:1113:2: rule__ActionProfile__Group__1__Impl
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
    // InternalBmod.g:1119:1: rule__ActionProfile__Group__1__Impl : ( ( rule__ActionProfile__NameAssignment_1 ) ) ;
    public final void rule__ActionProfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1123:1: ( ( ( rule__ActionProfile__NameAssignment_1 ) ) )
            // InternalBmod.g:1124:1: ( ( rule__ActionProfile__NameAssignment_1 ) )
            {
            // InternalBmod.g:1124:1: ( ( rule__ActionProfile__NameAssignment_1 ) )
            // InternalBmod.g:1125:2: ( rule__ActionProfile__NameAssignment_1 )
            {
             before(grammarAccess.getActionProfileAccess().getNameAssignment_1()); 
            // InternalBmod.g:1126:2: ( rule__ActionProfile__NameAssignment_1 )
            // InternalBmod.g:1126:3: rule__ActionProfile__NameAssignment_1
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
    // InternalBmod.g:1135:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1139:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalBmod.g:1140:2: rule__Person__Group__0__Impl rule__Person__Group__1
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
    // InternalBmod.g:1147:1: rule__Person__Group__0__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1151:1: ( ( 'Person' ) )
            // InternalBmod.g:1152:1: ( 'Person' )
            {
            // InternalBmod.g:1152:1: ( 'Person' )
            // InternalBmod.g:1153:2: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBmod.g:1162:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1166:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalBmod.g:1167:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalBmod.g:1174:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1178:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalBmod.g:1179:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalBmod.g:1179:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalBmod.g:1180:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalBmod.g:1181:2: ( rule__Person__NameAssignment_1 )
            // InternalBmod.g:1181:3: rule__Person__NameAssignment_1
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
    // InternalBmod.g:1189:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1193:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalBmod.g:1194:2: rule__Person__Group__2__Impl rule__Person__Group__3
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
    // InternalBmod.g:1201:1: rule__Person__Group__2__Impl : ( 'in' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1205:1: ( ( 'in' ) )
            // InternalBmod.g:1206:1: ( 'in' )
            {
            // InternalBmod.g:1206:1: ( 'in' )
            // InternalBmod.g:1207:2: 'in'
            {
             before(grammarAccess.getPersonAccess().getInKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getInKeyword_2()); 

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
    // InternalBmod.g:1216:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1220:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalBmod.g:1221:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalBmod.g:1228:1: rule__Person__Group__3__Impl : ( ( rule__Person__LocationAssignment_3 ) ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1232:1: ( ( ( rule__Person__LocationAssignment_3 ) ) )
            // InternalBmod.g:1233:1: ( ( rule__Person__LocationAssignment_3 ) )
            {
            // InternalBmod.g:1233:1: ( ( rule__Person__LocationAssignment_3 ) )
            // InternalBmod.g:1234:2: ( rule__Person__LocationAssignment_3 )
            {
             before(grammarAccess.getPersonAccess().getLocationAssignment_3()); 
            // InternalBmod.g:1235:2: ( rule__Person__LocationAssignment_3 )
            // InternalBmod.g:1235:3: rule__Person__LocationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Person__LocationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getLocationAssignment_3()); 

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
    // InternalBmod.g:1243:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1247:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalBmod.g:1248:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalBmod.g:1255:1: rule__Person__Group__4__Impl : ( ':' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1259:1: ( ( ':' ) )
            // InternalBmod.g:1260:1: ( ':' )
            {
            // InternalBmod.g:1260:1: ( ':' )
            // InternalBmod.g:1261:2: ':'
            {
             before(grammarAccess.getPersonAccess().getColonKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getColonKeyword_4()); 

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
    // InternalBmod.g:1270:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1274:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalBmod.g:1275:2: rule__Person__Group__5__Impl rule__Person__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalBmod.g:1282:1: rule__Person__Group__5__Impl : ( ( rule__Person__PerceptionAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1286:1: ( ( ( rule__Person__PerceptionAssignment_5 ) ) )
            // InternalBmod.g:1287:1: ( ( rule__Person__PerceptionAssignment_5 ) )
            {
            // InternalBmod.g:1287:1: ( ( rule__Person__PerceptionAssignment_5 ) )
            // InternalBmod.g:1288:2: ( rule__Person__PerceptionAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getPerceptionAssignment_5()); 
            // InternalBmod.g:1289:2: ( rule__Person__PerceptionAssignment_5 )
            // InternalBmod.g:1289:3: rule__Person__PerceptionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Person__PerceptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getPerceptionAssignment_5()); 

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
    // InternalBmod.g:1297:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1301:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // InternalBmod.g:1302:2: rule__Person__Group__6__Impl rule__Person__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalBmod.g:1309:1: rule__Person__Group__6__Impl : ( ',' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1313:1: ( ( ',' ) )
            // InternalBmod.g:1314:1: ( ',' )
            {
            // InternalBmod.g:1314:1: ( ',' )
            // InternalBmod.g:1315:2: ','
            {
             before(grammarAccess.getPersonAccess().getCommaKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getCommaKeyword_6()); 

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
    // InternalBmod.g:1324:1: rule__Person__Group__7 : rule__Person__Group__7__Impl ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1328:1: ( rule__Person__Group__7__Impl )
            // InternalBmod.g:1329:2: rule__Person__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__7__Impl();

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
    // InternalBmod.g:1335:1: rule__Person__Group__7__Impl : ( ( rule__Person__ActionAssignment_7 ) ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1339:1: ( ( ( rule__Person__ActionAssignment_7 ) ) )
            // InternalBmod.g:1340:1: ( ( rule__Person__ActionAssignment_7 ) )
            {
            // InternalBmod.g:1340:1: ( ( rule__Person__ActionAssignment_7 ) )
            // InternalBmod.g:1341:2: ( rule__Person__ActionAssignment_7 )
            {
             before(grammarAccess.getPersonAccess().getActionAssignment_7()); 
            // InternalBmod.g:1342:2: ( rule__Person__ActionAssignment_7 )
            // InternalBmod.g:1342:3: rule__Person__ActionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Person__ActionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getActionAssignment_7()); 

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


    // $ANTLR start "rule__Exit__Group__0"
    // InternalBmod.g:1351:1: rule__Exit__Group__0 : rule__Exit__Group__0__Impl rule__Exit__Group__1 ;
    public final void rule__Exit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1355:1: ( rule__Exit__Group__0__Impl rule__Exit__Group__1 )
            // InternalBmod.g:1356:2: rule__Exit__Group__0__Impl rule__Exit__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBmod.g:1363:1: rule__Exit__Group__0__Impl : ( 'Exit' ) ;
    public final void rule__Exit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1367:1: ( ( 'Exit' ) )
            // InternalBmod.g:1368:1: ( 'Exit' )
            {
            // InternalBmod.g:1368:1: ( 'Exit' )
            // InternalBmod.g:1369:2: 'Exit'
            {
             before(grammarAccess.getExitAccess().getExitKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBmod.g:1378:1: rule__Exit__Group__1 : rule__Exit__Group__1__Impl rule__Exit__Group__2 ;
    public final void rule__Exit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1382:1: ( rule__Exit__Group__1__Impl rule__Exit__Group__2 )
            // InternalBmod.g:1383:2: rule__Exit__Group__1__Impl rule__Exit__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalBmod.g:1390:1: rule__Exit__Group__1__Impl : ( 'in' ) ;
    public final void rule__Exit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1394:1: ( ( 'in' ) )
            // InternalBmod.g:1395:1: ( 'in' )
            {
            // InternalBmod.g:1395:1: ( 'in' )
            // InternalBmod.g:1396:2: 'in'
            {
             before(grammarAccess.getExitAccess().getInKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBmod.g:1405:1: rule__Exit__Group__2 : rule__Exit__Group__2__Impl ;
    public final void rule__Exit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1409:1: ( rule__Exit__Group__2__Impl )
            // InternalBmod.g:1410:2: rule__Exit__Group__2__Impl
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
    // InternalBmod.g:1416:1: rule__Exit__Group__2__Impl : ( ( rule__Exit__LocationAssignment_2 ) ) ;
    public final void rule__Exit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1420:1: ( ( ( rule__Exit__LocationAssignment_2 ) ) )
            // InternalBmod.g:1421:1: ( ( rule__Exit__LocationAssignment_2 ) )
            {
            // InternalBmod.g:1421:1: ( ( rule__Exit__LocationAssignment_2 ) )
            // InternalBmod.g:1422:2: ( rule__Exit__LocationAssignment_2 )
            {
             before(grammarAccess.getExitAccess().getLocationAssignment_2()); 
            // InternalBmod.g:1423:2: ( rule__Exit__LocationAssignment_2 )
            // InternalBmod.g:1423:3: rule__Exit__LocationAssignment_2
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


    // $ANTLR start "rule__Fire__Group__0"
    // InternalBmod.g:1432:1: rule__Fire__Group__0 : rule__Fire__Group__0__Impl rule__Fire__Group__1 ;
    public final void rule__Fire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1436:1: ( rule__Fire__Group__0__Impl rule__Fire__Group__1 )
            // InternalBmod.g:1437:2: rule__Fire__Group__0__Impl rule__Fire__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Fire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fire__Group__1();

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
    // $ANTLR end "rule__Fire__Group__0"


    // $ANTLR start "rule__Fire__Group__0__Impl"
    // InternalBmod.g:1444:1: rule__Fire__Group__0__Impl : ( 'Fire' ) ;
    public final void rule__Fire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1448:1: ( ( 'Fire' ) )
            // InternalBmod.g:1449:1: ( 'Fire' )
            {
            // InternalBmod.g:1449:1: ( 'Fire' )
            // InternalBmod.g:1450:2: 'Fire'
            {
             before(grammarAccess.getFireAccess().getFireKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFireAccess().getFireKeyword_0()); 

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
    // $ANTLR end "rule__Fire__Group__0__Impl"


    // $ANTLR start "rule__Fire__Group__1"
    // InternalBmod.g:1459:1: rule__Fire__Group__1 : rule__Fire__Group__1__Impl rule__Fire__Group__2 ;
    public final void rule__Fire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1463:1: ( rule__Fire__Group__1__Impl rule__Fire__Group__2 )
            // InternalBmod.g:1464:2: rule__Fire__Group__1__Impl rule__Fire__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Fire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fire__Group__2();

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
    // $ANTLR end "rule__Fire__Group__1"


    // $ANTLR start "rule__Fire__Group__1__Impl"
    // InternalBmod.g:1471:1: rule__Fire__Group__1__Impl : ( 'in' ) ;
    public final void rule__Fire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1475:1: ( ( 'in' ) )
            // InternalBmod.g:1476:1: ( 'in' )
            {
            // InternalBmod.g:1476:1: ( 'in' )
            // InternalBmod.g:1477:2: 'in'
            {
             before(grammarAccess.getFireAccess().getInKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFireAccess().getInKeyword_1()); 

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
    // $ANTLR end "rule__Fire__Group__1__Impl"


    // $ANTLR start "rule__Fire__Group__2"
    // InternalBmod.g:1486:1: rule__Fire__Group__2 : rule__Fire__Group__2__Impl ;
    public final void rule__Fire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1490:1: ( rule__Fire__Group__2__Impl )
            // InternalBmod.g:1491:2: rule__Fire__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fire__Group__2__Impl();

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
    // $ANTLR end "rule__Fire__Group__2"


    // $ANTLR start "rule__Fire__Group__2__Impl"
    // InternalBmod.g:1497:1: rule__Fire__Group__2__Impl : ( ( rule__Fire__LocationAssignment_2 ) ) ;
    public final void rule__Fire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1501:1: ( ( ( rule__Fire__LocationAssignment_2 ) ) )
            // InternalBmod.g:1502:1: ( ( rule__Fire__LocationAssignment_2 ) )
            {
            // InternalBmod.g:1502:1: ( ( rule__Fire__LocationAssignment_2 ) )
            // InternalBmod.g:1503:2: ( rule__Fire__LocationAssignment_2 )
            {
             before(grammarAccess.getFireAccess().getLocationAssignment_2()); 
            // InternalBmod.g:1504:2: ( rule__Fire__LocationAssignment_2 )
            // InternalBmod.g:1504:3: rule__Fire__LocationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Fire__LocationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFireAccess().getLocationAssignment_2()); 

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
    // $ANTLR end "rule__Fire__Group__2__Impl"


    // $ANTLR start "rule__EmergencySign__Group__0"
    // InternalBmod.g:1513:1: rule__EmergencySign__Group__0 : rule__EmergencySign__Group__0__Impl rule__EmergencySign__Group__1 ;
    public final void rule__EmergencySign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1517:1: ( rule__EmergencySign__Group__0__Impl rule__EmergencySign__Group__1 )
            // InternalBmod.g:1518:2: rule__EmergencySign__Group__0__Impl rule__EmergencySign__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBmod.g:1525:1: rule__EmergencySign__Group__0__Impl : ( 'Sign' ) ;
    public final void rule__EmergencySign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1529:1: ( ( 'Sign' ) )
            // InternalBmod.g:1530:1: ( 'Sign' )
            {
            // InternalBmod.g:1530:1: ( 'Sign' )
            // InternalBmod.g:1531:2: 'Sign'
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
    // InternalBmod.g:1540:1: rule__EmergencySign__Group__1 : rule__EmergencySign__Group__1__Impl rule__EmergencySign__Group__2 ;
    public final void rule__EmergencySign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1544:1: ( rule__EmergencySign__Group__1__Impl rule__EmergencySign__Group__2 )
            // InternalBmod.g:1545:2: rule__EmergencySign__Group__1__Impl rule__EmergencySign__Group__2
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
    // InternalBmod.g:1552:1: rule__EmergencySign__Group__1__Impl : ( 'on' ) ;
    public final void rule__EmergencySign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1556:1: ( ( 'on' ) )
            // InternalBmod.g:1557:1: ( 'on' )
            {
            // InternalBmod.g:1557:1: ( 'on' )
            // InternalBmod.g:1558:2: 'on'
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
    // InternalBmod.g:1567:1: rule__EmergencySign__Group__2 : rule__EmergencySign__Group__2__Impl rule__EmergencySign__Group__3 ;
    public final void rule__EmergencySign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1571:1: ( rule__EmergencySign__Group__2__Impl rule__EmergencySign__Group__3 )
            // InternalBmod.g:1572:2: rule__EmergencySign__Group__2__Impl rule__EmergencySign__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalBmod.g:1579:1: rule__EmergencySign__Group__2__Impl : ( ( rule__EmergencySign__OnAssignment_2 ) ) ;
    public final void rule__EmergencySign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1583:1: ( ( ( rule__EmergencySign__OnAssignment_2 ) ) )
            // InternalBmod.g:1584:1: ( ( rule__EmergencySign__OnAssignment_2 ) )
            {
            // InternalBmod.g:1584:1: ( ( rule__EmergencySign__OnAssignment_2 ) )
            // InternalBmod.g:1585:2: ( rule__EmergencySign__OnAssignment_2 )
            {
             before(grammarAccess.getEmergencySignAccess().getOnAssignment_2()); 
            // InternalBmod.g:1586:2: ( rule__EmergencySign__OnAssignment_2 )
            // InternalBmod.g:1586:3: rule__EmergencySign__OnAssignment_2
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
    // InternalBmod.g:1594:1: rule__EmergencySign__Group__3 : rule__EmergencySign__Group__3__Impl ;
    public final void rule__EmergencySign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1598:1: ( rule__EmergencySign__Group__3__Impl )
            // InternalBmod.g:1599:2: rule__EmergencySign__Group__3__Impl
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
    // InternalBmod.g:1605:1: rule__EmergencySign__Group__3__Impl : ( ( rule__EmergencySign__ToAssignment_3 ) ) ;
    public final void rule__EmergencySign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1609:1: ( ( ( rule__EmergencySign__ToAssignment_3 ) ) )
            // InternalBmod.g:1610:1: ( ( rule__EmergencySign__ToAssignment_3 ) )
            {
            // InternalBmod.g:1610:1: ( ( rule__EmergencySign__ToAssignment_3 ) )
            // InternalBmod.g:1611:2: ( rule__EmergencySign__ToAssignment_3 )
            {
             before(grammarAccess.getEmergencySignAccess().getToAssignment_3()); 
            // InternalBmod.g:1612:2: ( rule__EmergencySign__ToAssignment_3 )
            // InternalBmod.g:1612:3: rule__EmergencySign__ToAssignment_3
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
    // InternalBmod.g:1621:1: rule__DoorRef__Group__0 : rule__DoorRef__Group__0__Impl rule__DoorRef__Group__1 ;
    public final void rule__DoorRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1625:1: ( rule__DoorRef__Group__0__Impl rule__DoorRef__Group__1 )
            // InternalBmod.g:1626:2: rule__DoorRef__Group__0__Impl rule__DoorRef__Group__1
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
    // InternalBmod.g:1633:1: rule__DoorRef__Group__0__Impl : ( 'to' ) ;
    public final void rule__DoorRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1637:1: ( ( 'to' ) )
            // InternalBmod.g:1638:1: ( 'to' )
            {
            // InternalBmod.g:1638:1: ( 'to' )
            // InternalBmod.g:1639:2: 'to'
            {
             before(grammarAccess.getDoorRefAccess().getToKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBmod.g:1648:1: rule__DoorRef__Group__1 : rule__DoorRef__Group__1__Impl ;
    public final void rule__DoorRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1652:1: ( rule__DoorRef__Group__1__Impl )
            // InternalBmod.g:1653:2: rule__DoorRef__Group__1__Impl
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
    // InternalBmod.g:1659:1: rule__DoorRef__Group__1__Impl : ( ( rule__DoorRef__RefAssignment_1 ) ) ;
    public final void rule__DoorRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1663:1: ( ( ( rule__DoorRef__RefAssignment_1 ) ) )
            // InternalBmod.g:1664:1: ( ( rule__DoorRef__RefAssignment_1 ) )
            {
            // InternalBmod.g:1664:1: ( ( rule__DoorRef__RefAssignment_1 ) )
            // InternalBmod.g:1665:2: ( rule__DoorRef__RefAssignment_1 )
            {
             before(grammarAccess.getDoorRefAccess().getRefAssignment_1()); 
            // InternalBmod.g:1666:2: ( rule__DoorRef__RefAssignment_1 )
            // InternalBmod.g:1666:3: rule__DoorRef__RefAssignment_1
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
    // InternalBmod.g:1675:1: rule__DangerousCondition__Group__0 : rule__DangerousCondition__Group__0__Impl rule__DangerousCondition__Group__1 ;
    public final void rule__DangerousCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1679:1: ( rule__DangerousCondition__Group__0__Impl rule__DangerousCondition__Group__1 )
            // InternalBmod.g:1680:2: rule__DangerousCondition__Group__0__Impl rule__DangerousCondition__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBmod.g:1687:1: rule__DangerousCondition__Group__0__Impl : ( 'Condition' ) ;
    public final void rule__DangerousCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1691:1: ( ( 'Condition' ) )
            // InternalBmod.g:1692:1: ( 'Condition' )
            {
            // InternalBmod.g:1692:1: ( 'Condition' )
            // InternalBmod.g:1693:2: 'Condition'
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
    // InternalBmod.g:1702:1: rule__DangerousCondition__Group__1 : rule__DangerousCondition__Group__1__Impl rule__DangerousCondition__Group__2 ;
    public final void rule__DangerousCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1706:1: ( rule__DangerousCondition__Group__1__Impl rule__DangerousCondition__Group__2 )
            // InternalBmod.g:1707:2: rule__DangerousCondition__Group__1__Impl rule__DangerousCondition__Group__2
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
    // InternalBmod.g:1714:1: rule__DangerousCondition__Group__1__Impl : ( 'on' ) ;
    public final void rule__DangerousCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1718:1: ( ( 'on' ) )
            // InternalBmod.g:1719:1: ( 'on' )
            {
            // InternalBmod.g:1719:1: ( 'on' )
            // InternalBmod.g:1720:2: 'on'
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
    // InternalBmod.g:1729:1: rule__DangerousCondition__Group__2 : rule__DangerousCondition__Group__2__Impl rule__DangerousCondition__Group__3 ;
    public final void rule__DangerousCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1733:1: ( rule__DangerousCondition__Group__2__Impl rule__DangerousCondition__Group__3 )
            // InternalBmod.g:1734:2: rule__DangerousCondition__Group__2__Impl rule__DangerousCondition__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalBmod.g:1741:1: rule__DangerousCondition__Group__2__Impl : ( ( rule__DangerousCondition__OnAssignment_2 ) ) ;
    public final void rule__DangerousCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1745:1: ( ( ( rule__DangerousCondition__OnAssignment_2 ) ) )
            // InternalBmod.g:1746:1: ( ( rule__DangerousCondition__OnAssignment_2 ) )
            {
            // InternalBmod.g:1746:1: ( ( rule__DangerousCondition__OnAssignment_2 ) )
            // InternalBmod.g:1747:2: ( rule__DangerousCondition__OnAssignment_2 )
            {
             before(grammarAccess.getDangerousConditionAccess().getOnAssignment_2()); 
            // InternalBmod.g:1748:2: ( rule__DangerousCondition__OnAssignment_2 )
            // InternalBmod.g:1748:3: rule__DangerousCondition__OnAssignment_2
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
    // InternalBmod.g:1756:1: rule__DangerousCondition__Group__3 : rule__DangerousCondition__Group__3__Impl ;
    public final void rule__DangerousCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1760:1: ( rule__DangerousCondition__Group__3__Impl )
            // InternalBmod.g:1761:2: rule__DangerousCondition__Group__3__Impl
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
    // InternalBmod.g:1767:1: rule__DangerousCondition__Group__3__Impl : ( ( rule__DangerousCondition__AmountAssignment_3 ) ) ;
    public final void rule__DangerousCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1771:1: ( ( ( rule__DangerousCondition__AmountAssignment_3 ) ) )
            // InternalBmod.g:1772:1: ( ( rule__DangerousCondition__AmountAssignment_3 ) )
            {
            // InternalBmod.g:1772:1: ( ( rule__DangerousCondition__AmountAssignment_3 ) )
            // InternalBmod.g:1773:2: ( rule__DangerousCondition__AmountAssignment_3 )
            {
             before(grammarAccess.getDangerousConditionAccess().getAmountAssignment_3()); 
            // InternalBmod.g:1774:2: ( rule__DangerousCondition__AmountAssignment_3 )
            // InternalBmod.g:1774:3: rule__DangerousCondition__AmountAssignment_3
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
    // InternalBmod.g:1783:1: rule__Coordinate__Group__0 : rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 ;
    public final void rule__Coordinate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1787:1: ( rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 )
            // InternalBmod.g:1788:2: rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1
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
    // InternalBmod.g:1795:1: rule__Coordinate__Group__0__Impl : ( '(' ) ;
    public final void rule__Coordinate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1799:1: ( ( '(' ) )
            // InternalBmod.g:1800:1: ( '(' )
            {
            // InternalBmod.g:1800:1: ( '(' )
            // InternalBmod.g:1801:2: '('
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
    // InternalBmod.g:1810:1: rule__Coordinate__Group__1 : rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2 ;
    public final void rule__Coordinate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1814:1: ( rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2 )
            // InternalBmod.g:1815:2: rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2
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
    // InternalBmod.g:1822:1: rule__Coordinate__Group__1__Impl : ( ( rule__Coordinate__XAssignment_1 ) ) ;
    public final void rule__Coordinate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1826:1: ( ( ( rule__Coordinate__XAssignment_1 ) ) )
            // InternalBmod.g:1827:1: ( ( rule__Coordinate__XAssignment_1 ) )
            {
            // InternalBmod.g:1827:1: ( ( rule__Coordinate__XAssignment_1 ) )
            // InternalBmod.g:1828:2: ( rule__Coordinate__XAssignment_1 )
            {
             before(grammarAccess.getCoordinateAccess().getXAssignment_1()); 
            // InternalBmod.g:1829:2: ( rule__Coordinate__XAssignment_1 )
            // InternalBmod.g:1829:3: rule__Coordinate__XAssignment_1
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
    // InternalBmod.g:1837:1: rule__Coordinate__Group__2 : rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3 ;
    public final void rule__Coordinate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1841:1: ( rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3 )
            // InternalBmod.g:1842:2: rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3
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
    // InternalBmod.g:1849:1: rule__Coordinate__Group__2__Impl : ( ',' ) ;
    public final void rule__Coordinate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1853:1: ( ( ',' ) )
            // InternalBmod.g:1854:1: ( ',' )
            {
            // InternalBmod.g:1854:1: ( ',' )
            // InternalBmod.g:1855:2: ','
            {
             before(grammarAccess.getCoordinateAccess().getCommaKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBmod.g:1864:1: rule__Coordinate__Group__3 : rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4 ;
    public final void rule__Coordinate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1868:1: ( rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4 )
            // InternalBmod.g:1869:2: rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4
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
    // InternalBmod.g:1876:1: rule__Coordinate__Group__3__Impl : ( ( rule__Coordinate__YAssignment_3 ) ) ;
    public final void rule__Coordinate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1880:1: ( ( ( rule__Coordinate__YAssignment_3 ) ) )
            // InternalBmod.g:1881:1: ( ( rule__Coordinate__YAssignment_3 ) )
            {
            // InternalBmod.g:1881:1: ( ( rule__Coordinate__YAssignment_3 ) )
            // InternalBmod.g:1882:2: ( rule__Coordinate__YAssignment_3 )
            {
             before(grammarAccess.getCoordinateAccess().getYAssignment_3()); 
            // InternalBmod.g:1883:2: ( rule__Coordinate__YAssignment_3 )
            // InternalBmod.g:1883:3: rule__Coordinate__YAssignment_3
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
    // InternalBmod.g:1891:1: rule__Coordinate__Group__4 : rule__Coordinate__Group__4__Impl ;
    public final void rule__Coordinate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1895:1: ( rule__Coordinate__Group__4__Impl )
            // InternalBmod.g:1896:2: rule__Coordinate__Group__4__Impl
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
    // InternalBmod.g:1902:1: rule__Coordinate__Group__4__Impl : ( ')' ) ;
    public final void rule__Coordinate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1906:1: ( ( ')' ) )
            // InternalBmod.g:1907:1: ( ')' )
            {
            // InternalBmod.g:1907:1: ( ')' )
            // InternalBmod.g:1908:2: ')'
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
    // InternalBmod.g:1918:1: rule__Area__Group__0 : rule__Area__Group__0__Impl rule__Area__Group__1 ;
    public final void rule__Area__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1922:1: ( rule__Area__Group__0__Impl rule__Area__Group__1 )
            // InternalBmod.g:1923:2: rule__Area__Group__0__Impl rule__Area__Group__1
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
    // InternalBmod.g:1930:1: rule__Area__Group__0__Impl : ( 'from' ) ;
    public final void rule__Area__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1934:1: ( ( 'from' ) )
            // InternalBmod.g:1935:1: ( 'from' )
            {
            // InternalBmod.g:1935:1: ( 'from' )
            // InternalBmod.g:1936:2: 'from'
            {
             before(grammarAccess.getAreaAccess().getFromKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBmod.g:1945:1: rule__Area__Group__1 : rule__Area__Group__1__Impl rule__Area__Group__2 ;
    public final void rule__Area__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1949:1: ( rule__Area__Group__1__Impl rule__Area__Group__2 )
            // InternalBmod.g:1950:2: rule__Area__Group__1__Impl rule__Area__Group__2
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
    // InternalBmod.g:1957:1: rule__Area__Group__1__Impl : ( ( rule__Area__FromAssignment_1 ) ) ;
    public final void rule__Area__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1961:1: ( ( ( rule__Area__FromAssignment_1 ) ) )
            // InternalBmod.g:1962:1: ( ( rule__Area__FromAssignment_1 ) )
            {
            // InternalBmod.g:1962:1: ( ( rule__Area__FromAssignment_1 ) )
            // InternalBmod.g:1963:2: ( rule__Area__FromAssignment_1 )
            {
             before(grammarAccess.getAreaAccess().getFromAssignment_1()); 
            // InternalBmod.g:1964:2: ( rule__Area__FromAssignment_1 )
            // InternalBmod.g:1964:3: rule__Area__FromAssignment_1
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
    // InternalBmod.g:1972:1: rule__Area__Group__2 : rule__Area__Group__2__Impl rule__Area__Group__3 ;
    public final void rule__Area__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1976:1: ( rule__Area__Group__2__Impl rule__Area__Group__3 )
            // InternalBmod.g:1977:2: rule__Area__Group__2__Impl rule__Area__Group__3
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
    // InternalBmod.g:1984:1: rule__Area__Group__2__Impl : ( 'to' ) ;
    public final void rule__Area__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1988:1: ( ( 'to' ) )
            // InternalBmod.g:1989:1: ( 'to' )
            {
            // InternalBmod.g:1989:1: ( 'to' )
            // InternalBmod.g:1990:2: 'to'
            {
             before(grammarAccess.getAreaAccess().getToKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBmod.g:1999:1: rule__Area__Group__3 : rule__Area__Group__3__Impl rule__Area__Group__4 ;
    public final void rule__Area__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2003:1: ( rule__Area__Group__3__Impl rule__Area__Group__4 )
            // InternalBmod.g:2004:2: rule__Area__Group__3__Impl rule__Area__Group__4
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
    // InternalBmod.g:2011:1: rule__Area__Group__3__Impl : ( ( rule__Area__ToAssignment_3 ) ) ;
    public final void rule__Area__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2015:1: ( ( ( rule__Area__ToAssignment_3 ) ) )
            // InternalBmod.g:2016:1: ( ( rule__Area__ToAssignment_3 ) )
            {
            // InternalBmod.g:2016:1: ( ( rule__Area__ToAssignment_3 ) )
            // InternalBmod.g:2017:2: ( rule__Area__ToAssignment_3 )
            {
             before(grammarAccess.getAreaAccess().getToAssignment_3()); 
            // InternalBmod.g:2018:2: ( rule__Area__ToAssignment_3 )
            // InternalBmod.g:2018:3: rule__Area__ToAssignment_3
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
    // InternalBmod.g:2026:1: rule__Area__Group__4 : rule__Area__Group__4__Impl ;
    public final void rule__Area__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2030:1: ( rule__Area__Group__4__Impl )
            // InternalBmod.g:2031:2: rule__Area__Group__4__Impl
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
    // InternalBmod.g:2037:1: rule__Area__Group__4__Impl : ( ( rule__Area__Group_4__0 )? ) ;
    public final void rule__Area__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2041:1: ( ( ( rule__Area__Group_4__0 )? ) )
            // InternalBmod.g:2042:1: ( ( rule__Area__Group_4__0 )? )
            {
            // InternalBmod.g:2042:1: ( ( rule__Area__Group_4__0 )? )
            // InternalBmod.g:2043:2: ( rule__Area__Group_4__0 )?
            {
             before(grammarAccess.getAreaAccess().getGroup_4()); 
            // InternalBmod.g:2044:2: ( rule__Area__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==37) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBmod.g:2044:3: rule__Area__Group_4__0
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
    // InternalBmod.g:2053:1: rule__Area__Group_4__0 : rule__Area__Group_4__0__Impl rule__Area__Group_4__1 ;
    public final void rule__Area__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2057:1: ( rule__Area__Group_4__0__Impl rule__Area__Group_4__1 )
            // InternalBmod.g:2058:2: rule__Area__Group_4__0__Impl rule__Area__Group_4__1
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
    // InternalBmod.g:2065:1: rule__Area__Group_4__0__Impl : ( 'without' ) ;
    public final void rule__Area__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2069:1: ( ( 'without' ) )
            // InternalBmod.g:2070:1: ( 'without' )
            {
            // InternalBmod.g:2070:1: ( 'without' )
            // InternalBmod.g:2071:2: 'without'
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
    // InternalBmod.g:2080:1: rule__Area__Group_4__1 : rule__Area__Group_4__1__Impl rule__Area__Group_4__2 ;
    public final void rule__Area__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2084:1: ( rule__Area__Group_4__1__Impl rule__Area__Group_4__2 )
            // InternalBmod.g:2085:2: rule__Area__Group_4__1__Impl rule__Area__Group_4__2
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
    // InternalBmod.g:2092:1: rule__Area__Group_4__1__Impl : ( ( rule__Area__WithoutAssignment_4_1 ) ) ;
    public final void rule__Area__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2096:1: ( ( ( rule__Area__WithoutAssignment_4_1 ) ) )
            // InternalBmod.g:2097:1: ( ( rule__Area__WithoutAssignment_4_1 ) )
            {
            // InternalBmod.g:2097:1: ( ( rule__Area__WithoutAssignment_4_1 ) )
            // InternalBmod.g:2098:2: ( rule__Area__WithoutAssignment_4_1 )
            {
             before(grammarAccess.getAreaAccess().getWithoutAssignment_4_1()); 
            // InternalBmod.g:2099:2: ( rule__Area__WithoutAssignment_4_1 )
            // InternalBmod.g:2099:3: rule__Area__WithoutAssignment_4_1
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
    // InternalBmod.g:2107:1: rule__Area__Group_4__2 : rule__Area__Group_4__2__Impl ;
    public final void rule__Area__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2111:1: ( rule__Area__Group_4__2__Impl )
            // InternalBmod.g:2112:2: rule__Area__Group_4__2__Impl
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
    // InternalBmod.g:2118:1: rule__Area__Group_4__2__Impl : ( ( rule__Area__Group_4_2__0 )* ) ;
    public final void rule__Area__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2122:1: ( ( ( rule__Area__Group_4_2__0 )* ) )
            // InternalBmod.g:2123:1: ( ( rule__Area__Group_4_2__0 )* )
            {
            // InternalBmod.g:2123:1: ( ( rule__Area__Group_4_2__0 )* )
            // InternalBmod.g:2124:2: ( rule__Area__Group_4_2__0 )*
            {
             before(grammarAccess.getAreaAccess().getGroup_4_2()); 
            // InternalBmod.g:2125:2: ( rule__Area__Group_4_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBmod.g:2125:3: rule__Area__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Area__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalBmod.g:2134:1: rule__Area__Group_4_2__0 : rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1 ;
    public final void rule__Area__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2138:1: ( rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1 )
            // InternalBmod.g:2139:2: rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1
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
    // InternalBmod.g:2146:1: rule__Area__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Area__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2150:1: ( ( ',' ) )
            // InternalBmod.g:2151:1: ( ',' )
            {
            // InternalBmod.g:2151:1: ( ',' )
            // InternalBmod.g:2152:2: ','
            {
             before(grammarAccess.getAreaAccess().getCommaKeyword_4_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBmod.g:2161:1: rule__Area__Group_4_2__1 : rule__Area__Group_4_2__1__Impl ;
    public final void rule__Area__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2165:1: ( rule__Area__Group_4_2__1__Impl )
            // InternalBmod.g:2166:2: rule__Area__Group_4_2__1__Impl
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
    // InternalBmod.g:2172:1: rule__Area__Group_4_2__1__Impl : ( ( rule__Area__WithoutAssignment_4_2_1 ) ) ;
    public final void rule__Area__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2176:1: ( ( ( rule__Area__WithoutAssignment_4_2_1 ) ) )
            // InternalBmod.g:2177:1: ( ( rule__Area__WithoutAssignment_4_2_1 ) )
            {
            // InternalBmod.g:2177:1: ( ( rule__Area__WithoutAssignment_4_2_1 ) )
            // InternalBmod.g:2178:2: ( rule__Area__WithoutAssignment_4_2_1 )
            {
             before(grammarAccess.getAreaAccess().getWithoutAssignment_4_2_1()); 
            // InternalBmod.g:2179:2: ( rule__Area__WithoutAssignment_4_2_1 )
            // InternalBmod.g:2179:3: rule__Area__WithoutAssignment_4_2_1
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
    // InternalBmod.g:2188:1: rule__Floorplan__PerceptionsAssignment_1_0 : ( rulePerceptionLevel ) ;
    public final void rule__Floorplan__PerceptionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2192:1: ( ( rulePerceptionLevel ) )
            // InternalBmod.g:2193:2: ( rulePerceptionLevel )
            {
            // InternalBmod.g:2193:2: ( rulePerceptionLevel )
            // InternalBmod.g:2194:3: rulePerceptionLevel
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
    // InternalBmod.g:2203:1: rule__Floorplan__ActionsAssignment_1_1 : ( ruleActionProfile ) ;
    public final void rule__Floorplan__ActionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2207:1: ( ( ruleActionProfile ) )
            // InternalBmod.g:2208:2: ( ruleActionProfile )
            {
            // InternalBmod.g:2208:2: ( ruleActionProfile )
            // InternalBmod.g:2209:3: ruleActionProfile
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
    // InternalBmod.g:2218:1: rule__Floorplan__RoomsAssignment_1_2 : ( ruleRoom ) ;
    public final void rule__Floorplan__RoomsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2222:1: ( ( ruleRoom ) )
            // InternalBmod.g:2223:2: ( ruleRoom )
            {
            // InternalBmod.g:2223:2: ( ruleRoom )
            // InternalBmod.g:2224:3: ruleRoom
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
    // InternalBmod.g:2233:1: rule__Floorplan__DoorsAssignment_1_3 : ( ruleDoor ) ;
    public final void rule__Floorplan__DoorsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2237:1: ( ( ruleDoor ) )
            // InternalBmod.g:2238:2: ( ruleDoor )
            {
            // InternalBmod.g:2238:2: ( ruleDoor )
            // InternalBmod.g:2239:3: ruleDoor
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
    // InternalBmod.g:2248:1: rule__Floorplan__PersonsAssignment_1_4 : ( rulePerson ) ;
    public final void rule__Floorplan__PersonsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2252:1: ( ( rulePerson ) )
            // InternalBmod.g:2253:2: ( rulePerson )
            {
            // InternalBmod.g:2253:2: ( rulePerson )
            // InternalBmod.g:2254:3: rulePerson
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
    // InternalBmod.g:2263:1: rule__Floorplan__ExitsAssignment_1_5 : ( ruleExit ) ;
    public final void rule__Floorplan__ExitsAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2267:1: ( ( ruleExit ) )
            // InternalBmod.g:2268:2: ( ruleExit )
            {
            // InternalBmod.g:2268:2: ( ruleExit )
            // InternalBmod.g:2269:3: ruleExit
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


    // $ANTLR start "rule__Floorplan__FiresAssignment_1_6"
    // InternalBmod.g:2278:1: rule__Floorplan__FiresAssignment_1_6 : ( ruleFire ) ;
    public final void rule__Floorplan__FiresAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2282:1: ( ( ruleFire ) )
            // InternalBmod.g:2283:2: ( ruleFire )
            {
            // InternalBmod.g:2283:2: ( ruleFire )
            // InternalBmod.g:2284:3: ruleFire
            {
             before(grammarAccess.getFloorplanAccess().getFiresFireParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFire();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getFiresFireParserRuleCall_1_6_0()); 

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
    // $ANTLR end "rule__Floorplan__FiresAssignment_1_6"


    // $ANTLR start "rule__Floorplan__SignsAssignment_1_7"
    // InternalBmod.g:2293:1: rule__Floorplan__SignsAssignment_1_7 : ( ruleEmergencySign ) ;
    public final void rule__Floorplan__SignsAssignment_1_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2297:1: ( ( ruleEmergencySign ) )
            // InternalBmod.g:2298:2: ( ruleEmergencySign )
            {
            // InternalBmod.g:2298:2: ( ruleEmergencySign )
            // InternalBmod.g:2299:3: ruleEmergencySign
            {
             before(grammarAccess.getFloorplanAccess().getSignsEmergencySignParserRuleCall_1_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEmergencySign();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getSignsEmergencySignParserRuleCall_1_7_0()); 

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
    // $ANTLR end "rule__Floorplan__SignsAssignment_1_7"


    // $ANTLR start "rule__Floorplan__DanconsAssignment_1_8"
    // InternalBmod.g:2308:1: rule__Floorplan__DanconsAssignment_1_8 : ( ruleDangerousCondition ) ;
    public final void rule__Floorplan__DanconsAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2312:1: ( ( ruleDangerousCondition ) )
            // InternalBmod.g:2313:2: ( ruleDangerousCondition )
            {
            // InternalBmod.g:2313:2: ( ruleDangerousCondition )
            // InternalBmod.g:2314:3: ruleDangerousCondition
            {
             before(grammarAccess.getFloorplanAccess().getDanconsDangerousConditionParserRuleCall_1_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDangerousCondition();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getDanconsDangerousConditionParserRuleCall_1_8_0()); 

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
    // $ANTLR end "rule__Floorplan__DanconsAssignment_1_8"


    // $ANTLR start "rule__Room__NameAssignment_1"
    // InternalBmod.g:2323:1: rule__Room__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Room__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2327:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2328:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:2328:2: ( RULE_VARNAME )
            // InternalBmod.g:2329:3: RULE_VARNAME
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


    // $ANTLR start "rule__Room__AreasAssignment_2"
    // InternalBmod.g:2338:1: rule__Room__AreasAssignment_2 : ( ruleArea ) ;
    public final void rule__Room__AreasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2342:1: ( ( ruleArea ) )
            // InternalBmod.g:2343:2: ( ruleArea )
            {
            // InternalBmod.g:2343:2: ( ruleArea )
            // InternalBmod.g:2344:3: ruleArea
            {
             before(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArea();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Room__AreasAssignment_2"


    // $ANTLR start "rule__Room__AreasAssignment_3_1"
    // InternalBmod.g:2353:1: rule__Room__AreasAssignment_3_1 : ( ruleArea ) ;
    public final void rule__Room__AreasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2357:1: ( ( ruleArea ) )
            // InternalBmod.g:2358:2: ( ruleArea )
            {
            // InternalBmod.g:2358:2: ( ruleArea )
            // InternalBmod.g:2359:3: ruleArea
            {
             before(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArea();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Room__AreasAssignment_3_1"


    // $ANTLR start "rule__Door__NameAssignment_1"
    // InternalBmod.g:2368:1: rule__Door__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Door__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2372:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2373:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:2373:2: ( RULE_VARNAME )
            // InternalBmod.g:2374:3: RULE_VARNAME
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
    // InternalBmod.g:2383:1: rule__Door__FromAssignment_3 : ( ruleCoordinate ) ;
    public final void rule__Door__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2387:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2388:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2388:2: ( ruleCoordinate )
            // InternalBmod.g:2389:3: ruleCoordinate
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
    // InternalBmod.g:2398:1: rule__Door__ToAssignment_5 : ( ruleCoordinate ) ;
    public final void rule__Door__ToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2402:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2403:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2403:2: ( ruleCoordinate )
            // InternalBmod.g:2404:3: ruleCoordinate
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


    // $ANTLR start "rule__Perception__ExistingAssignment_0"
    // InternalBmod.g:2413:1: rule__Perception__ExistingAssignment_0 : ( rulePerceptionEnum ) ;
    public final void rule__Perception__ExistingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2417:1: ( ( rulePerceptionEnum ) )
            // InternalBmod.g:2418:2: ( rulePerceptionEnum )
            {
            // InternalBmod.g:2418:2: ( rulePerceptionEnum )
            // InternalBmod.g:2419:3: rulePerceptionEnum
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
    // InternalBmod.g:2428:1: rule__Perception__CustomAssignment_1 : ( ( RULE_VARNAME ) ) ;
    public final void rule__Perception__CustomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2432:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2433:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2433:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2434:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getPerceptionAccess().getCustomPerceptionLevelCrossReference_1_0()); 
            // InternalBmod.g:2435:3: ( RULE_VARNAME )
            // InternalBmod.g:2436:4: RULE_VARNAME
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
    // InternalBmod.g:2447:1: rule__Action__ExistingAssignment_0 : ( ruleActionEnum ) ;
    public final void rule__Action__ExistingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2451:1: ( ( ruleActionEnum ) )
            // InternalBmod.g:2452:2: ( ruleActionEnum )
            {
            // InternalBmod.g:2452:2: ( ruleActionEnum )
            // InternalBmod.g:2453:3: ruleActionEnum
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
    // InternalBmod.g:2462:1: rule__Action__CustomAssignment_1 : ( ( RULE_VARNAME ) ) ;
    public final void rule__Action__CustomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2466:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2467:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2467:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2468:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getActionAccess().getCustomActionProfileCrossReference_1_0()); 
            // InternalBmod.g:2469:3: ( RULE_VARNAME )
            // InternalBmod.g:2470:4: RULE_VARNAME
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


    // $ANTLR start "rule__PerceptionLevel__NameAssignment_1"
    // InternalBmod.g:2481:1: rule__PerceptionLevel__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__PerceptionLevel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2485:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2486:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:2486:2: ( RULE_VARNAME )
            // InternalBmod.g:2487:3: RULE_VARNAME
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
    // InternalBmod.g:2496:1: rule__ActionProfile__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__ActionProfile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2500:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2501:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:2501:2: ( RULE_VARNAME )
            // InternalBmod.g:2502:3: RULE_VARNAME
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


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalBmod.g:2511:1: rule__Person__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2515:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2516:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:2516:2: ( RULE_VARNAME )
            // InternalBmod.g:2517:3: RULE_VARNAME
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


    // $ANTLR start "rule__Person__LocationAssignment_3"
    // InternalBmod.g:2526:1: rule__Person__LocationAssignment_3 : ( ruleCoordinate ) ;
    public final void rule__Person__LocationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2530:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2531:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2531:2: ( ruleCoordinate )
            // InternalBmod.g:2532:3: ruleCoordinate
            {
             before(grammarAccess.getPersonAccess().getLocationCoordinateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getLocationCoordinateParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Person__LocationAssignment_3"


    // $ANTLR start "rule__Person__PerceptionAssignment_5"
    // InternalBmod.g:2541:1: rule__Person__PerceptionAssignment_5 : ( rulePerception ) ;
    public final void rule__Person__PerceptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2545:1: ( ( rulePerception ) )
            // InternalBmod.g:2546:2: ( rulePerception )
            {
            // InternalBmod.g:2546:2: ( rulePerception )
            // InternalBmod.g:2547:3: rulePerception
            {
             before(grammarAccess.getPersonAccess().getPerceptionPerceptionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePerception();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getPerceptionPerceptionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Person__PerceptionAssignment_5"


    // $ANTLR start "rule__Person__ActionAssignment_7"
    // InternalBmod.g:2556:1: rule__Person__ActionAssignment_7 : ( ruleAction ) ;
    public final void rule__Person__ActionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2560:1: ( ( ruleAction ) )
            // InternalBmod.g:2561:2: ( ruleAction )
            {
            // InternalBmod.g:2561:2: ( ruleAction )
            // InternalBmod.g:2562:3: ruleAction
            {
             before(grammarAccess.getPersonAccess().getActionActionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getActionActionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Person__ActionAssignment_7"


    // $ANTLR start "rule__Exit__LocationAssignment_2"
    // InternalBmod.g:2571:1: rule__Exit__LocationAssignment_2 : ( ruleCoordinate ) ;
    public final void rule__Exit__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2575:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2576:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2576:2: ( ruleCoordinate )
            // InternalBmod.g:2577:3: ruleCoordinate
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


    // $ANTLR start "rule__Fire__LocationAssignment_2"
    // InternalBmod.g:2586:1: rule__Fire__LocationAssignment_2 : ( ruleCoordinate ) ;
    public final void rule__Fire__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2590:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2591:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2591:2: ( ruleCoordinate )
            // InternalBmod.g:2592:3: ruleCoordinate
            {
             before(grammarAccess.getFireAccess().getLocationCoordinateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getFireAccess().getLocationCoordinateParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Fire__LocationAssignment_2"


    // $ANTLR start "rule__EmergencySign__OnAssignment_2"
    // InternalBmod.g:2601:1: rule__EmergencySign__OnAssignment_2 : ( ( RULE_VARNAME ) ) ;
    public final void rule__EmergencySign__OnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2605:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2606:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2606:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2607:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getEmergencySignAccess().getOnDoorCrossReference_2_0()); 
            // InternalBmod.g:2608:3: ( RULE_VARNAME )
            // InternalBmod.g:2609:4: RULE_VARNAME
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
    // InternalBmod.g:2620:1: rule__EmergencySign__ToAssignment_3 : ( ruleDoorRef ) ;
    public final void rule__EmergencySign__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2624:1: ( ( ruleDoorRef ) )
            // InternalBmod.g:2625:2: ( ruleDoorRef )
            {
            // InternalBmod.g:2625:2: ( ruleDoorRef )
            // InternalBmod.g:2626:3: ruleDoorRef
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
    // InternalBmod.g:2635:1: rule__DoorRef__RefAssignment_1 : ( ( RULE_VARNAME ) ) ;
    public final void rule__DoorRef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2639:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2640:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2640:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2641:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getDoorRefAccess().getRefDoorCrossReference_1_0()); 
            // InternalBmod.g:2642:3: ( RULE_VARNAME )
            // InternalBmod.g:2643:4: RULE_VARNAME
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
    // InternalBmod.g:2654:1: rule__DangerousCondition__OnAssignment_2 : ( ( RULE_VARNAME ) ) ;
    public final void rule__DangerousCondition__OnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2658:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2659:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2659:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2660:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getDangerousConditionAccess().getOnRoomCrossReference_2_0()); 
            // InternalBmod.g:2661:3: ( RULE_VARNAME )
            // InternalBmod.g:2662:4: RULE_VARNAME
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
    // InternalBmod.g:2673:1: rule__DangerousCondition__AmountAssignment_3 : ( RULE_INT ) ;
    public final void rule__DangerousCondition__AmountAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2677:1: ( ( RULE_INT ) )
            // InternalBmod.g:2678:2: ( RULE_INT )
            {
            // InternalBmod.g:2678:2: ( RULE_INT )
            // InternalBmod.g:2679:3: RULE_INT
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
    // InternalBmod.g:2688:1: rule__Coordinate__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Coordinate__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2692:1: ( ( RULE_INT ) )
            // InternalBmod.g:2693:2: ( RULE_INT )
            {
            // InternalBmod.g:2693:2: ( RULE_INT )
            // InternalBmod.g:2694:3: RULE_INT
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
    // InternalBmod.g:2703:1: rule__Coordinate__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Coordinate__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2707:1: ( ( RULE_INT ) )
            // InternalBmod.g:2708:2: ( RULE_INT )
            {
            // InternalBmod.g:2708:2: ( RULE_INT )
            // InternalBmod.g:2709:3: RULE_INT
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
    // InternalBmod.g:2718:1: rule__Area__FromAssignment_1 : ( ruleCoordinate ) ;
    public final void rule__Area__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2722:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2723:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2723:2: ( ruleCoordinate )
            // InternalBmod.g:2724:3: ruleCoordinate
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
    // InternalBmod.g:2733:1: rule__Area__ToAssignment_3 : ( ruleCoordinate ) ;
    public final void rule__Area__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2737:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2738:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2738:2: ( ruleCoordinate )
            // InternalBmod.g:2739:3: ruleCoordinate
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
    // InternalBmod.g:2748:1: rule__Area__WithoutAssignment_4_1 : ( ruleCoordinate ) ;
    public final void rule__Area__WithoutAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2752:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2753:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2753:2: ( ruleCoordinate )
            // InternalBmod.g:2754:3: ruleCoordinate
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
    // InternalBmod.g:2763:1: rule__Area__WithoutAssignment_4_2_1 : ( ruleCoordinate ) ;
    public final void rule__Area__WithoutAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2767:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2768:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2768:2: ( ruleCoordinate )
            // InternalBmod.g:2769:3: ruleCoordinate
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000005C7280000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000005C7280002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000F010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000070010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});

}