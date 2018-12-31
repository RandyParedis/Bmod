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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARNAME", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'attentive'", "'relaxed'", "'optimistic'", "'sceptic'", "'newcomer'", "'experienced'", "'panic'", "'Room'", "'named'", "'and'", "'Door'", "'from'", "'to'", "'Person'", "'in'", "':'", "','", "'Exit'", "'Sign'", "'on'", "'Condition'", "'('", "')'", "'without'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
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


    // $ANTLR start "entryRulePerson"
    // InternalBmod.g:153:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalBmod.g:154:1: ( rulePerson EOF )
            // InternalBmod.g:155:1: rulePerson EOF
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
    // InternalBmod.g:162:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:166:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalBmod.g:167:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalBmod.g:167:2: ( ( rule__Person__Group__0 ) )
            // InternalBmod.g:168:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalBmod.g:169:3: ( rule__Person__Group__0 )
            // InternalBmod.g:169:4: rule__Person__Group__0
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
    // InternalBmod.g:178:1: entryRuleExit : ruleExit EOF ;
    public final void entryRuleExit() throws RecognitionException {
        try {
            // InternalBmod.g:179:1: ( ruleExit EOF )
            // InternalBmod.g:180:1: ruleExit EOF
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
    // InternalBmod.g:187:1: ruleExit : ( ( rule__Exit__Group__0 ) ) ;
    public final void ruleExit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:191:2: ( ( ( rule__Exit__Group__0 ) ) )
            // InternalBmod.g:192:2: ( ( rule__Exit__Group__0 ) )
            {
            // InternalBmod.g:192:2: ( ( rule__Exit__Group__0 ) )
            // InternalBmod.g:193:3: ( rule__Exit__Group__0 )
            {
             before(grammarAccess.getExitAccess().getGroup()); 
            // InternalBmod.g:194:3: ( rule__Exit__Group__0 )
            // InternalBmod.g:194:4: rule__Exit__Group__0
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
    // InternalBmod.g:203:1: entryRuleEmergencySign : ruleEmergencySign EOF ;
    public final void entryRuleEmergencySign() throws RecognitionException {
        try {
            // InternalBmod.g:204:1: ( ruleEmergencySign EOF )
            // InternalBmod.g:205:1: ruleEmergencySign EOF
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
    // InternalBmod.g:212:1: ruleEmergencySign : ( ( rule__EmergencySign__Group__0 ) ) ;
    public final void ruleEmergencySign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:216:2: ( ( ( rule__EmergencySign__Group__0 ) ) )
            // InternalBmod.g:217:2: ( ( rule__EmergencySign__Group__0 ) )
            {
            // InternalBmod.g:217:2: ( ( rule__EmergencySign__Group__0 ) )
            // InternalBmod.g:218:3: ( rule__EmergencySign__Group__0 )
            {
             before(grammarAccess.getEmergencySignAccess().getGroup()); 
            // InternalBmod.g:219:3: ( rule__EmergencySign__Group__0 )
            // InternalBmod.g:219:4: rule__EmergencySign__Group__0
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


    // $ANTLR start "entryRuleDangerousCondition"
    // InternalBmod.g:228:1: entryRuleDangerousCondition : ruleDangerousCondition EOF ;
    public final void entryRuleDangerousCondition() throws RecognitionException {
        try {
            // InternalBmod.g:229:1: ( ruleDangerousCondition EOF )
            // InternalBmod.g:230:1: ruleDangerousCondition EOF
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
    // InternalBmod.g:237:1: ruleDangerousCondition : ( ( rule__DangerousCondition__Group__0 ) ) ;
    public final void ruleDangerousCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:241:2: ( ( ( rule__DangerousCondition__Group__0 ) ) )
            // InternalBmod.g:242:2: ( ( rule__DangerousCondition__Group__0 ) )
            {
            // InternalBmod.g:242:2: ( ( rule__DangerousCondition__Group__0 ) )
            // InternalBmod.g:243:3: ( rule__DangerousCondition__Group__0 )
            {
             before(grammarAccess.getDangerousConditionAccess().getGroup()); 
            // InternalBmod.g:244:3: ( rule__DangerousCondition__Group__0 )
            // InternalBmod.g:244:4: rule__DangerousCondition__Group__0
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
    // InternalBmod.g:253:1: entryRuleCoordinate : ruleCoordinate EOF ;
    public final void entryRuleCoordinate() throws RecognitionException {
        try {
            // InternalBmod.g:254:1: ( ruleCoordinate EOF )
            // InternalBmod.g:255:1: ruleCoordinate EOF
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
    // InternalBmod.g:262:1: ruleCoordinate : ( ( rule__Coordinate__Group__0 ) ) ;
    public final void ruleCoordinate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:266:2: ( ( ( rule__Coordinate__Group__0 ) ) )
            // InternalBmod.g:267:2: ( ( rule__Coordinate__Group__0 ) )
            {
            // InternalBmod.g:267:2: ( ( rule__Coordinate__Group__0 ) )
            // InternalBmod.g:268:3: ( rule__Coordinate__Group__0 )
            {
             before(grammarAccess.getCoordinateAccess().getGroup()); 
            // InternalBmod.g:269:3: ( rule__Coordinate__Group__0 )
            // InternalBmod.g:269:4: rule__Coordinate__Group__0
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
    // InternalBmod.g:278:1: entryRuleArea : ruleArea EOF ;
    public final void entryRuleArea() throws RecognitionException {
        try {
            // InternalBmod.g:279:1: ( ruleArea EOF )
            // InternalBmod.g:280:1: ruleArea EOF
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
    // InternalBmod.g:287:1: ruleArea : ( ( rule__Area__Group__0 ) ) ;
    public final void ruleArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:291:2: ( ( ( rule__Area__Group__0 ) ) )
            // InternalBmod.g:292:2: ( ( rule__Area__Group__0 ) )
            {
            // InternalBmod.g:292:2: ( ( rule__Area__Group__0 ) )
            // InternalBmod.g:293:3: ( rule__Area__Group__0 )
            {
             before(grammarAccess.getAreaAccess().getGroup()); 
            // InternalBmod.g:294:3: ( rule__Area__Group__0 )
            // InternalBmod.g:294:4: rule__Area__Group__0
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


    // $ANTLR start "rulePerception"
    // InternalBmod.g:303:1: rulePerception : ( ( rule__Perception__Alternatives ) ) ;
    public final void rulePerception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:307:1: ( ( ( rule__Perception__Alternatives ) ) )
            // InternalBmod.g:308:2: ( ( rule__Perception__Alternatives ) )
            {
            // InternalBmod.g:308:2: ( ( rule__Perception__Alternatives ) )
            // InternalBmod.g:309:3: ( rule__Perception__Alternatives )
            {
             before(grammarAccess.getPerceptionAccess().getAlternatives()); 
            // InternalBmod.g:310:3: ( rule__Perception__Alternatives )
            // InternalBmod.g:310:4: rule__Perception__Alternatives
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


    // $ANTLR start "ruleAction"
    // InternalBmod.g:319:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:323:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalBmod.g:324:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalBmod.g:324:2: ( ( rule__Action__Alternatives ) )
            // InternalBmod.g:325:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalBmod.g:326:3: ( rule__Action__Alternatives )
            // InternalBmod.g:326:4: rule__Action__Alternatives
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


    // $ANTLR start "rule__Floorplan__Alternatives_1"
    // InternalBmod.g:334:1: rule__Floorplan__Alternatives_1 : ( ( ( rule__Floorplan__RoomsAssignment_1_0 ) ) | ( ( rule__Floorplan__DoorsAssignment_1_1 ) ) | ( ( rule__Floorplan__PersonsAssignment_1_2 ) ) | ( ( rule__Floorplan__ExitsAssignment_1_3 ) ) | ( ( rule__Floorplan__SignsAssignment_1_4 ) ) | ( ( rule__Floorplan__DanconsAssignment_1_5 ) ) );
    public final void rule__Floorplan__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:338:1: ( ( ( rule__Floorplan__RoomsAssignment_1_0 ) ) | ( ( rule__Floorplan__DoorsAssignment_1_1 ) ) | ( ( rule__Floorplan__PersonsAssignment_1_2 ) ) | ( ( rule__Floorplan__ExitsAssignment_1_3 ) ) | ( ( rule__Floorplan__SignsAssignment_1_4 ) ) | ( ( rule__Floorplan__DanconsAssignment_1_5 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            case 30:
                {
                alt1=5;
                }
                break;
            case 32:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBmod.g:339:2: ( ( rule__Floorplan__RoomsAssignment_1_0 ) )
                    {
                    // InternalBmod.g:339:2: ( ( rule__Floorplan__RoomsAssignment_1_0 ) )
                    // InternalBmod.g:340:3: ( rule__Floorplan__RoomsAssignment_1_0 )
                    {
                     before(grammarAccess.getFloorplanAccess().getRoomsAssignment_1_0()); 
                    // InternalBmod.g:341:3: ( rule__Floorplan__RoomsAssignment_1_0 )
                    // InternalBmod.g:341:4: rule__Floorplan__RoomsAssignment_1_0
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
                    // InternalBmod.g:345:2: ( ( rule__Floorplan__DoorsAssignment_1_1 ) )
                    {
                    // InternalBmod.g:345:2: ( ( rule__Floorplan__DoorsAssignment_1_1 ) )
                    // InternalBmod.g:346:3: ( rule__Floorplan__DoorsAssignment_1_1 )
                    {
                     before(grammarAccess.getFloorplanAccess().getDoorsAssignment_1_1()); 
                    // InternalBmod.g:347:3: ( rule__Floorplan__DoorsAssignment_1_1 )
                    // InternalBmod.g:347:4: rule__Floorplan__DoorsAssignment_1_1
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
                    // InternalBmod.g:351:2: ( ( rule__Floorplan__PersonsAssignment_1_2 ) )
                    {
                    // InternalBmod.g:351:2: ( ( rule__Floorplan__PersonsAssignment_1_2 ) )
                    // InternalBmod.g:352:3: ( rule__Floorplan__PersonsAssignment_1_2 )
                    {
                     before(grammarAccess.getFloorplanAccess().getPersonsAssignment_1_2()); 
                    // InternalBmod.g:353:3: ( rule__Floorplan__PersonsAssignment_1_2 )
                    // InternalBmod.g:353:4: rule__Floorplan__PersonsAssignment_1_2
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
                    // InternalBmod.g:357:2: ( ( rule__Floorplan__ExitsAssignment_1_3 ) )
                    {
                    // InternalBmod.g:357:2: ( ( rule__Floorplan__ExitsAssignment_1_3 ) )
                    // InternalBmod.g:358:3: ( rule__Floorplan__ExitsAssignment_1_3 )
                    {
                     before(grammarAccess.getFloorplanAccess().getExitsAssignment_1_3()); 
                    // InternalBmod.g:359:3: ( rule__Floorplan__ExitsAssignment_1_3 )
                    // InternalBmod.g:359:4: rule__Floorplan__ExitsAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__ExitsAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getExitsAssignment_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBmod.g:363:2: ( ( rule__Floorplan__SignsAssignment_1_4 ) )
                    {
                    // InternalBmod.g:363:2: ( ( rule__Floorplan__SignsAssignment_1_4 ) )
                    // InternalBmod.g:364:3: ( rule__Floorplan__SignsAssignment_1_4 )
                    {
                     before(grammarAccess.getFloorplanAccess().getSignsAssignment_1_4()); 
                    // InternalBmod.g:365:3: ( rule__Floorplan__SignsAssignment_1_4 )
                    // InternalBmod.g:365:4: rule__Floorplan__SignsAssignment_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__SignsAssignment_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getSignsAssignment_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBmod.g:369:2: ( ( rule__Floorplan__DanconsAssignment_1_5 ) )
                    {
                    // InternalBmod.g:369:2: ( ( rule__Floorplan__DanconsAssignment_1_5 ) )
                    // InternalBmod.g:370:3: ( rule__Floorplan__DanconsAssignment_1_5 )
                    {
                     before(grammarAccess.getFloorplanAccess().getDanconsAssignment_1_5()); 
                    // InternalBmod.g:371:3: ( rule__Floorplan__DanconsAssignment_1_5 )
                    // InternalBmod.g:371:4: rule__Floorplan__DanconsAssignment_1_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__DanconsAssignment_1_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getDanconsAssignment_1_5()); 

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


    // $ANTLR start "rule__Person__Alternatives_7"
    // InternalBmod.g:379:1: rule__Person__Alternatives_7 : ( ( ( rule__Person__Group_7_0__0 ) ) | ( ( rule__Person__Group_7_1__0 ) ) );
    public final void rule__Person__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:383:1: ( ( ( rule__Person__Group_7_0__0 ) ) | ( ( rule__Person__Group_7_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=15)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=16 && LA2_0<=18)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBmod.g:384:2: ( ( rule__Person__Group_7_0__0 ) )
                    {
                    // InternalBmod.g:384:2: ( ( rule__Person__Group_7_0__0 ) )
                    // InternalBmod.g:385:3: ( rule__Person__Group_7_0__0 )
                    {
                     before(grammarAccess.getPersonAccess().getGroup_7_0()); 
                    // InternalBmod.g:386:3: ( rule__Person__Group_7_0__0 )
                    // InternalBmod.g:386:4: rule__Person__Group_7_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_7_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPersonAccess().getGroup_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:390:2: ( ( rule__Person__Group_7_1__0 ) )
                    {
                    // InternalBmod.g:390:2: ( ( rule__Person__Group_7_1__0 ) )
                    // InternalBmod.g:391:3: ( rule__Person__Group_7_1__0 )
                    {
                     before(grammarAccess.getPersonAccess().getGroup_7_1()); 
                    // InternalBmod.g:392:3: ( rule__Person__Group_7_1__0 )
                    // InternalBmod.g:392:4: rule__Person__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_7_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPersonAccess().getGroup_7_1()); 

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
    // $ANTLR end "rule__Person__Alternatives_7"


    // $ANTLR start "rule__Perception__Alternatives"
    // InternalBmod.g:400:1: rule__Perception__Alternatives : ( ( ( 'attentive' ) ) | ( ( 'relaxed' ) ) | ( ( 'optimistic' ) ) | ( ( 'sceptic' ) ) );
    public final void rule__Perception__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:404:1: ( ( ( 'attentive' ) ) | ( ( 'relaxed' ) ) | ( ( 'optimistic' ) ) | ( ( 'sceptic' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBmod.g:405:2: ( ( 'attentive' ) )
                    {
                    // InternalBmod.g:405:2: ( ( 'attentive' ) )
                    // InternalBmod.g:406:3: ( 'attentive' )
                    {
                     before(grammarAccess.getPerceptionAccess().getATTENTIVEEnumLiteralDeclaration_0()); 
                    // InternalBmod.g:407:3: ( 'attentive' )
                    // InternalBmod.g:407:4: 'attentive'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerceptionAccess().getATTENTIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:411:2: ( ( 'relaxed' ) )
                    {
                    // InternalBmod.g:411:2: ( ( 'relaxed' ) )
                    // InternalBmod.g:412:3: ( 'relaxed' )
                    {
                     before(grammarAccess.getPerceptionAccess().getRELAXEDEnumLiteralDeclaration_1()); 
                    // InternalBmod.g:413:3: ( 'relaxed' )
                    // InternalBmod.g:413:4: 'relaxed'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerceptionAccess().getRELAXEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:417:2: ( ( 'optimistic' ) )
                    {
                    // InternalBmod.g:417:2: ( ( 'optimistic' ) )
                    // InternalBmod.g:418:3: ( 'optimistic' )
                    {
                     before(grammarAccess.getPerceptionAccess().getOPTIMISTICEnumLiteralDeclaration_2()); 
                    // InternalBmod.g:419:3: ( 'optimistic' )
                    // InternalBmod.g:419:4: 'optimistic'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerceptionAccess().getOPTIMISTICEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBmod.g:423:2: ( ( 'sceptic' ) )
                    {
                    // InternalBmod.g:423:2: ( ( 'sceptic' ) )
                    // InternalBmod.g:424:3: ( 'sceptic' )
                    {
                     before(grammarAccess.getPerceptionAccess().getSCEPTICEnumLiteralDeclaration_3()); 
                    // InternalBmod.g:425:3: ( 'sceptic' )
                    // InternalBmod.g:425:4: 'sceptic'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerceptionAccess().getSCEPTICEnumLiteralDeclaration_3()); 

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
    // InternalBmod.g:433:1: rule__Action__Alternatives : ( ( ( 'newcomer' ) ) | ( ( 'experienced' ) ) | ( ( 'panic' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:437:1: ( ( ( 'newcomer' ) ) | ( ( 'experienced' ) ) | ( ( 'panic' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBmod.g:438:2: ( ( 'newcomer' ) )
                    {
                    // InternalBmod.g:438:2: ( ( 'newcomer' ) )
                    // InternalBmod.g:439:3: ( 'newcomer' )
                    {
                     before(grammarAccess.getActionAccess().getNEWCOMEREnumLiteralDeclaration_0()); 
                    // InternalBmod.g:440:3: ( 'newcomer' )
                    // InternalBmod.g:440:4: 'newcomer'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getNEWCOMEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:444:2: ( ( 'experienced' ) )
                    {
                    // InternalBmod.g:444:2: ( ( 'experienced' ) )
                    // InternalBmod.g:445:3: ( 'experienced' )
                    {
                     before(grammarAccess.getActionAccess().getEXPERIENCEDEnumLiteralDeclaration_1()); 
                    // InternalBmod.g:446:3: ( 'experienced' )
                    // InternalBmod.g:446:4: 'experienced'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getEXPERIENCEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:450:2: ( ( 'panic' ) )
                    {
                    // InternalBmod.g:450:2: ( ( 'panic' ) )
                    // InternalBmod.g:451:3: ( 'panic' )
                    {
                     before(grammarAccess.getActionAccess().getPANICEnumLiteralDeclaration_2()); 
                    // InternalBmod.g:452:3: ( 'panic' )
                    // InternalBmod.g:452:4: 'panic'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getPANICEnumLiteralDeclaration_2()); 

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


    // $ANTLR start "rule__Floorplan__Group__0"
    // InternalBmod.g:460:1: rule__Floorplan__Group__0 : rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1 ;
    public final void rule__Floorplan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:464:1: ( rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1 )
            // InternalBmod.g:465:2: rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1
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
    // InternalBmod.g:472:1: rule__Floorplan__Group__0__Impl : ( () ) ;
    public final void rule__Floorplan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:476:1: ( ( () ) )
            // InternalBmod.g:477:1: ( () )
            {
            // InternalBmod.g:477:1: ( () )
            // InternalBmod.g:478:2: ()
            {
             before(grammarAccess.getFloorplanAccess().getFloorplanAction_0()); 
            // InternalBmod.g:479:2: ()
            // InternalBmod.g:479:3: 
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
    // InternalBmod.g:487:1: rule__Floorplan__Group__1 : rule__Floorplan__Group__1__Impl ;
    public final void rule__Floorplan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:491:1: ( rule__Floorplan__Group__1__Impl )
            // InternalBmod.g:492:2: rule__Floorplan__Group__1__Impl
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
    // InternalBmod.g:498:1: rule__Floorplan__Group__1__Impl : ( ( rule__Floorplan__Alternatives_1 )* ) ;
    public final void rule__Floorplan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:502:1: ( ( ( rule__Floorplan__Alternatives_1 )* ) )
            // InternalBmod.g:503:1: ( ( rule__Floorplan__Alternatives_1 )* )
            {
            // InternalBmod.g:503:1: ( ( rule__Floorplan__Alternatives_1 )* )
            // InternalBmod.g:504:2: ( rule__Floorplan__Alternatives_1 )*
            {
             before(grammarAccess.getFloorplanAccess().getAlternatives_1()); 
            // InternalBmod.g:505:2: ( rule__Floorplan__Alternatives_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19||LA5_0==22||LA5_0==25||(LA5_0>=29 && LA5_0<=30)||LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBmod.g:505:3: rule__Floorplan__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Floorplan__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalBmod.g:514:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:518:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalBmod.g:519:2: rule__Room__Group__0__Impl rule__Room__Group__1
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
    // InternalBmod.g:526:1: rule__Room__Group__0__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:530:1: ( ( 'Room' ) )
            // InternalBmod.g:531:1: ( 'Room' )
            {
            // InternalBmod.g:531:1: ( 'Room' )
            // InternalBmod.g:532:2: 'Room'
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
    // InternalBmod.g:541:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:545:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalBmod.g:546:2: rule__Room__Group__1__Impl rule__Room__Group__2
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
    // InternalBmod.g:553:1: rule__Room__Group__1__Impl : ( ( rule__Room__NameAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:557:1: ( ( ( rule__Room__NameAssignment_1 ) ) )
            // InternalBmod.g:558:1: ( ( rule__Room__NameAssignment_1 ) )
            {
            // InternalBmod.g:558:1: ( ( rule__Room__NameAssignment_1 ) )
            // InternalBmod.g:559:2: ( rule__Room__NameAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_1()); 
            // InternalBmod.g:560:2: ( rule__Room__NameAssignment_1 )
            // InternalBmod.g:560:3: rule__Room__NameAssignment_1
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
    // InternalBmod.g:568:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:572:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalBmod.g:573:2: rule__Room__Group__2__Impl rule__Room__Group__3
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
    // InternalBmod.g:580:1: rule__Room__Group__2__Impl : ( 'named' ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:584:1: ( ( 'named' ) )
            // InternalBmod.g:585:1: ( 'named' )
            {
            // InternalBmod.g:585:1: ( 'named' )
            // InternalBmod.g:586:2: 'named'
            {
             before(grammarAccess.getRoomAccess().getNamedKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBmod.g:595:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:599:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalBmod.g:600:2: rule__Room__Group__3__Impl rule__Room__Group__4
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
    // InternalBmod.g:607:1: rule__Room__Group__3__Impl : ( ( rule__Room__NamedAssignment_3 ) ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:611:1: ( ( ( rule__Room__NamedAssignment_3 ) ) )
            // InternalBmod.g:612:1: ( ( rule__Room__NamedAssignment_3 ) )
            {
            // InternalBmod.g:612:1: ( ( rule__Room__NamedAssignment_3 ) )
            // InternalBmod.g:613:2: ( rule__Room__NamedAssignment_3 )
            {
             before(grammarAccess.getRoomAccess().getNamedAssignment_3()); 
            // InternalBmod.g:614:2: ( rule__Room__NamedAssignment_3 )
            // InternalBmod.g:614:3: rule__Room__NamedAssignment_3
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
    // InternalBmod.g:622:1: rule__Room__Group__4 : rule__Room__Group__4__Impl rule__Room__Group__5 ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:626:1: ( rule__Room__Group__4__Impl rule__Room__Group__5 )
            // InternalBmod.g:627:2: rule__Room__Group__4__Impl rule__Room__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Room__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__5();

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
    // InternalBmod.g:634:1: rule__Room__Group__4__Impl : ( ( rule__Room__AreasAssignment_4 ) ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:638:1: ( ( ( rule__Room__AreasAssignment_4 ) ) )
            // InternalBmod.g:639:1: ( ( rule__Room__AreasAssignment_4 ) )
            {
            // InternalBmod.g:639:1: ( ( rule__Room__AreasAssignment_4 ) )
            // InternalBmod.g:640:2: ( rule__Room__AreasAssignment_4 )
            {
             before(grammarAccess.getRoomAccess().getAreasAssignment_4()); 
            // InternalBmod.g:641:2: ( rule__Room__AreasAssignment_4 )
            // InternalBmod.g:641:3: rule__Room__AreasAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Room__AreasAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getAreasAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Room__Group__5"
    // InternalBmod.g:649:1: rule__Room__Group__5 : rule__Room__Group__5__Impl ;
    public final void rule__Room__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:653:1: ( rule__Room__Group__5__Impl )
            // InternalBmod.g:654:2: rule__Room__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__5__Impl();

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
    // $ANTLR end "rule__Room__Group__5"


    // $ANTLR start "rule__Room__Group__5__Impl"
    // InternalBmod.g:660:1: rule__Room__Group__5__Impl : ( ( rule__Room__Group_5__0 )* ) ;
    public final void rule__Room__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:664:1: ( ( ( rule__Room__Group_5__0 )* ) )
            // InternalBmod.g:665:1: ( ( rule__Room__Group_5__0 )* )
            {
            // InternalBmod.g:665:1: ( ( rule__Room__Group_5__0 )* )
            // InternalBmod.g:666:2: ( rule__Room__Group_5__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_5()); 
            // InternalBmod.g:667:2: ( rule__Room__Group_5__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBmod.g:667:3: rule__Room__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Room__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__5__Impl"


    // $ANTLR start "rule__Room__Group_5__0"
    // InternalBmod.g:676:1: rule__Room__Group_5__0 : rule__Room__Group_5__0__Impl rule__Room__Group_5__1 ;
    public final void rule__Room__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:680:1: ( rule__Room__Group_5__0__Impl rule__Room__Group_5__1 )
            // InternalBmod.g:681:2: rule__Room__Group_5__0__Impl rule__Room__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Room__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_5__1();

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
    // $ANTLR end "rule__Room__Group_5__0"


    // $ANTLR start "rule__Room__Group_5__0__Impl"
    // InternalBmod.g:688:1: rule__Room__Group_5__0__Impl : ( 'and' ) ;
    public final void rule__Room__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:692:1: ( ( 'and' ) )
            // InternalBmod.g:693:1: ( 'and' )
            {
            // InternalBmod.g:693:1: ( 'and' )
            // InternalBmod.g:694:2: 'and'
            {
             before(grammarAccess.getRoomAccess().getAndKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getAndKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_5__0__Impl"


    // $ANTLR start "rule__Room__Group_5__1"
    // InternalBmod.g:703:1: rule__Room__Group_5__1 : rule__Room__Group_5__1__Impl ;
    public final void rule__Room__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:707:1: ( rule__Room__Group_5__1__Impl )
            // InternalBmod.g:708:2: rule__Room__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_5__1__Impl();

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
    // $ANTLR end "rule__Room__Group_5__1"


    // $ANTLR start "rule__Room__Group_5__1__Impl"
    // InternalBmod.g:714:1: rule__Room__Group_5__1__Impl : ( ( rule__Room__AreasAssignment_5_1 ) ) ;
    public final void rule__Room__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:718:1: ( ( ( rule__Room__AreasAssignment_5_1 ) ) )
            // InternalBmod.g:719:1: ( ( rule__Room__AreasAssignment_5_1 ) )
            {
            // InternalBmod.g:719:1: ( ( rule__Room__AreasAssignment_5_1 ) )
            // InternalBmod.g:720:2: ( rule__Room__AreasAssignment_5_1 )
            {
             before(grammarAccess.getRoomAccess().getAreasAssignment_5_1()); 
            // InternalBmod.g:721:2: ( rule__Room__AreasAssignment_5_1 )
            // InternalBmod.g:721:3: rule__Room__AreasAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__AreasAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getAreasAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_5__1__Impl"


    // $ANTLR start "rule__Door__Group__0"
    // InternalBmod.g:730:1: rule__Door__Group__0 : rule__Door__Group__0__Impl rule__Door__Group__1 ;
    public final void rule__Door__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:734:1: ( rule__Door__Group__0__Impl rule__Door__Group__1 )
            // InternalBmod.g:735:2: rule__Door__Group__0__Impl rule__Door__Group__1
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
    // InternalBmod.g:742:1: rule__Door__Group__0__Impl : ( 'Door' ) ;
    public final void rule__Door__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:746:1: ( ( 'Door' ) )
            // InternalBmod.g:747:1: ( 'Door' )
            {
            // InternalBmod.g:747:1: ( 'Door' )
            // InternalBmod.g:748:2: 'Door'
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
    // InternalBmod.g:757:1: rule__Door__Group__1 : rule__Door__Group__1__Impl rule__Door__Group__2 ;
    public final void rule__Door__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:761:1: ( rule__Door__Group__1__Impl rule__Door__Group__2 )
            // InternalBmod.g:762:2: rule__Door__Group__1__Impl rule__Door__Group__2
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
    // InternalBmod.g:769:1: rule__Door__Group__1__Impl : ( ( rule__Door__NameAssignment_1 ) ) ;
    public final void rule__Door__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:773:1: ( ( ( rule__Door__NameAssignment_1 ) ) )
            // InternalBmod.g:774:1: ( ( rule__Door__NameAssignment_1 ) )
            {
            // InternalBmod.g:774:1: ( ( rule__Door__NameAssignment_1 ) )
            // InternalBmod.g:775:2: ( rule__Door__NameAssignment_1 )
            {
             before(grammarAccess.getDoorAccess().getNameAssignment_1()); 
            // InternalBmod.g:776:2: ( rule__Door__NameAssignment_1 )
            // InternalBmod.g:776:3: rule__Door__NameAssignment_1
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
    // InternalBmod.g:784:1: rule__Door__Group__2 : rule__Door__Group__2__Impl rule__Door__Group__3 ;
    public final void rule__Door__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:788:1: ( rule__Door__Group__2__Impl rule__Door__Group__3 )
            // InternalBmod.g:789:2: rule__Door__Group__2__Impl rule__Door__Group__3
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
    // InternalBmod.g:796:1: rule__Door__Group__2__Impl : ( 'from' ) ;
    public final void rule__Door__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:800:1: ( ( 'from' ) )
            // InternalBmod.g:801:1: ( 'from' )
            {
            // InternalBmod.g:801:1: ( 'from' )
            // InternalBmod.g:802:2: 'from'
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
    // InternalBmod.g:811:1: rule__Door__Group__3 : rule__Door__Group__3__Impl rule__Door__Group__4 ;
    public final void rule__Door__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:815:1: ( rule__Door__Group__3__Impl rule__Door__Group__4 )
            // InternalBmod.g:816:2: rule__Door__Group__3__Impl rule__Door__Group__4
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
    // InternalBmod.g:823:1: rule__Door__Group__3__Impl : ( ( rule__Door__FromAssignment_3 ) ) ;
    public final void rule__Door__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:827:1: ( ( ( rule__Door__FromAssignment_3 ) ) )
            // InternalBmod.g:828:1: ( ( rule__Door__FromAssignment_3 ) )
            {
            // InternalBmod.g:828:1: ( ( rule__Door__FromAssignment_3 ) )
            // InternalBmod.g:829:2: ( rule__Door__FromAssignment_3 )
            {
             before(grammarAccess.getDoorAccess().getFromAssignment_3()); 
            // InternalBmod.g:830:2: ( rule__Door__FromAssignment_3 )
            // InternalBmod.g:830:3: rule__Door__FromAssignment_3
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
    // InternalBmod.g:838:1: rule__Door__Group__4 : rule__Door__Group__4__Impl rule__Door__Group__5 ;
    public final void rule__Door__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:842:1: ( rule__Door__Group__4__Impl rule__Door__Group__5 )
            // InternalBmod.g:843:2: rule__Door__Group__4__Impl rule__Door__Group__5
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
    // InternalBmod.g:850:1: rule__Door__Group__4__Impl : ( 'to' ) ;
    public final void rule__Door__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:854:1: ( ( 'to' ) )
            // InternalBmod.g:855:1: ( 'to' )
            {
            // InternalBmod.g:855:1: ( 'to' )
            // InternalBmod.g:856:2: 'to'
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
    // InternalBmod.g:865:1: rule__Door__Group__5 : rule__Door__Group__5__Impl ;
    public final void rule__Door__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:869:1: ( rule__Door__Group__5__Impl )
            // InternalBmod.g:870:2: rule__Door__Group__5__Impl
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
    // InternalBmod.g:876:1: rule__Door__Group__5__Impl : ( ( rule__Door__ToAssignment_5 ) ) ;
    public final void rule__Door__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:880:1: ( ( ( rule__Door__ToAssignment_5 ) ) )
            // InternalBmod.g:881:1: ( ( rule__Door__ToAssignment_5 ) )
            {
            // InternalBmod.g:881:1: ( ( rule__Door__ToAssignment_5 ) )
            // InternalBmod.g:882:2: ( rule__Door__ToAssignment_5 )
            {
             before(grammarAccess.getDoorAccess().getToAssignment_5()); 
            // InternalBmod.g:883:2: ( rule__Door__ToAssignment_5 )
            // InternalBmod.g:883:3: rule__Door__ToAssignment_5
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


    // $ANTLR start "rule__Person__Group__0"
    // InternalBmod.g:892:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:896:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalBmod.g:897:2: rule__Person__Group__0__Impl rule__Person__Group__1
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
    // InternalBmod.g:904:1: rule__Person__Group__0__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:908:1: ( ( 'Person' ) )
            // InternalBmod.g:909:1: ( 'Person' )
            {
            // InternalBmod.g:909:1: ( 'Person' )
            // InternalBmod.g:910:2: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBmod.g:919:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:923:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalBmod.g:924:2: rule__Person__Group__1__Impl rule__Person__Group__2
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
    // InternalBmod.g:931:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:935:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalBmod.g:936:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalBmod.g:936:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalBmod.g:937:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalBmod.g:938:2: ( rule__Person__NameAssignment_1 )
            // InternalBmod.g:938:3: rule__Person__NameAssignment_1
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
    // InternalBmod.g:946:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:950:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalBmod.g:951:2: rule__Person__Group__2__Impl rule__Person__Group__3
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
    // InternalBmod.g:958:1: rule__Person__Group__2__Impl : ( 'named' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:962:1: ( ( 'named' ) )
            // InternalBmod.g:963:1: ( 'named' )
            {
            // InternalBmod.g:963:1: ( 'named' )
            // InternalBmod.g:964:2: 'named'
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
    // InternalBmod.g:973:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:977:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalBmod.g:978:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalBmod.g:985:1: rule__Person__Group__3__Impl : ( ( rule__Person__NamedAssignment_3 ) ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:989:1: ( ( ( rule__Person__NamedAssignment_3 ) ) )
            // InternalBmod.g:990:1: ( ( rule__Person__NamedAssignment_3 ) )
            {
            // InternalBmod.g:990:1: ( ( rule__Person__NamedAssignment_3 ) )
            // InternalBmod.g:991:2: ( rule__Person__NamedAssignment_3 )
            {
             before(grammarAccess.getPersonAccess().getNamedAssignment_3()); 
            // InternalBmod.g:992:2: ( rule__Person__NamedAssignment_3 )
            // InternalBmod.g:992:3: rule__Person__NamedAssignment_3
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
    // InternalBmod.g:1000:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1004:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalBmod.g:1005:2: rule__Person__Group__4__Impl rule__Person__Group__5
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
    // InternalBmod.g:1012:1: rule__Person__Group__4__Impl : ( 'in' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1016:1: ( ( 'in' ) )
            // InternalBmod.g:1017:1: ( 'in' )
            {
            // InternalBmod.g:1017:1: ( 'in' )
            // InternalBmod.g:1018:2: 'in'
            {
             before(grammarAccess.getPersonAccess().getInKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBmod.g:1027:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1031:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalBmod.g:1032:2: rule__Person__Group__5__Impl rule__Person__Group__6
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
    // InternalBmod.g:1039:1: rule__Person__Group__5__Impl : ( ( rule__Person__LocationAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1043:1: ( ( ( rule__Person__LocationAssignment_5 ) ) )
            // InternalBmod.g:1044:1: ( ( rule__Person__LocationAssignment_5 ) )
            {
            // InternalBmod.g:1044:1: ( ( rule__Person__LocationAssignment_5 ) )
            // InternalBmod.g:1045:2: ( rule__Person__LocationAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getLocationAssignment_5()); 
            // InternalBmod.g:1046:2: ( rule__Person__LocationAssignment_5 )
            // InternalBmod.g:1046:3: rule__Person__LocationAssignment_5
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
    // InternalBmod.g:1054:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1058:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // InternalBmod.g:1059:2: rule__Person__Group__6__Impl rule__Person__Group__7
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
    // InternalBmod.g:1066:1: rule__Person__Group__6__Impl : ( ':' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1070:1: ( ( ':' ) )
            // InternalBmod.g:1071:1: ( ':' )
            {
            // InternalBmod.g:1071:1: ( ':' )
            // InternalBmod.g:1072:2: ':'
            {
             before(grammarAccess.getPersonAccess().getColonKeyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBmod.g:1081:1: rule__Person__Group__7 : rule__Person__Group__7__Impl ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1085:1: ( rule__Person__Group__7__Impl )
            // InternalBmod.g:1086:2: rule__Person__Group__7__Impl
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
    // InternalBmod.g:1092:1: rule__Person__Group__7__Impl : ( ( rule__Person__Alternatives_7 ) ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1096:1: ( ( ( rule__Person__Alternatives_7 ) ) )
            // InternalBmod.g:1097:1: ( ( rule__Person__Alternatives_7 ) )
            {
            // InternalBmod.g:1097:1: ( ( rule__Person__Alternatives_7 ) )
            // InternalBmod.g:1098:2: ( rule__Person__Alternatives_7 )
            {
             before(grammarAccess.getPersonAccess().getAlternatives_7()); 
            // InternalBmod.g:1099:2: ( rule__Person__Alternatives_7 )
            // InternalBmod.g:1099:3: rule__Person__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Person__Group_7_0__0"
    // InternalBmod.g:1108:1: rule__Person__Group_7_0__0 : rule__Person__Group_7_0__0__Impl rule__Person__Group_7_0__1 ;
    public final void rule__Person__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1112:1: ( rule__Person__Group_7_0__0__Impl rule__Person__Group_7_0__1 )
            // InternalBmod.g:1113:2: rule__Person__Group_7_0__0__Impl rule__Person__Group_7_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Person__Group_7_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_7_0__1();

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
    // $ANTLR end "rule__Person__Group_7_0__0"


    // $ANTLR start "rule__Person__Group_7_0__0__Impl"
    // InternalBmod.g:1120:1: rule__Person__Group_7_0__0__Impl : ( ( rule__Person__PerceptionAssignment_7_0_0 ) ) ;
    public final void rule__Person__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1124:1: ( ( ( rule__Person__PerceptionAssignment_7_0_0 ) ) )
            // InternalBmod.g:1125:1: ( ( rule__Person__PerceptionAssignment_7_0_0 ) )
            {
            // InternalBmod.g:1125:1: ( ( rule__Person__PerceptionAssignment_7_0_0 ) )
            // InternalBmod.g:1126:2: ( rule__Person__PerceptionAssignment_7_0_0 )
            {
             before(grammarAccess.getPersonAccess().getPerceptionAssignment_7_0_0()); 
            // InternalBmod.g:1127:2: ( rule__Person__PerceptionAssignment_7_0_0 )
            // InternalBmod.g:1127:3: rule__Person__PerceptionAssignment_7_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Person__PerceptionAssignment_7_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getPerceptionAssignment_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_7_0__0__Impl"


    // $ANTLR start "rule__Person__Group_7_0__1"
    // InternalBmod.g:1135:1: rule__Person__Group_7_0__1 : rule__Person__Group_7_0__1__Impl rule__Person__Group_7_0__2 ;
    public final void rule__Person__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1139:1: ( rule__Person__Group_7_0__1__Impl rule__Person__Group_7_0__2 )
            // InternalBmod.g:1140:2: rule__Person__Group_7_0__1__Impl rule__Person__Group_7_0__2
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group_7_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_7_0__2();

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
    // $ANTLR end "rule__Person__Group_7_0__1"


    // $ANTLR start "rule__Person__Group_7_0__1__Impl"
    // InternalBmod.g:1147:1: rule__Person__Group_7_0__1__Impl : ( ',' ) ;
    public final void rule__Person__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1151:1: ( ( ',' ) )
            // InternalBmod.g:1152:1: ( ',' )
            {
            // InternalBmod.g:1152:1: ( ',' )
            // InternalBmod.g:1153:2: ','
            {
             before(grammarAccess.getPersonAccess().getCommaKeyword_7_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getCommaKeyword_7_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_7_0__1__Impl"


    // $ANTLR start "rule__Person__Group_7_0__2"
    // InternalBmod.g:1162:1: rule__Person__Group_7_0__2 : rule__Person__Group_7_0__2__Impl ;
    public final void rule__Person__Group_7_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1166:1: ( rule__Person__Group_7_0__2__Impl )
            // InternalBmod.g:1167:2: rule__Person__Group_7_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_7_0__2__Impl();

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
    // $ANTLR end "rule__Person__Group_7_0__2"


    // $ANTLR start "rule__Person__Group_7_0__2__Impl"
    // InternalBmod.g:1173:1: rule__Person__Group_7_0__2__Impl : ( ( rule__Person__ActionAssignment_7_0_2 ) ) ;
    public final void rule__Person__Group_7_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1177:1: ( ( ( rule__Person__ActionAssignment_7_0_2 ) ) )
            // InternalBmod.g:1178:1: ( ( rule__Person__ActionAssignment_7_0_2 ) )
            {
            // InternalBmod.g:1178:1: ( ( rule__Person__ActionAssignment_7_0_2 ) )
            // InternalBmod.g:1179:2: ( rule__Person__ActionAssignment_7_0_2 )
            {
             before(grammarAccess.getPersonAccess().getActionAssignment_7_0_2()); 
            // InternalBmod.g:1180:2: ( rule__Person__ActionAssignment_7_0_2 )
            // InternalBmod.g:1180:3: rule__Person__ActionAssignment_7_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Person__ActionAssignment_7_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getActionAssignment_7_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_7_0__2__Impl"


    // $ANTLR start "rule__Person__Group_7_1__0"
    // InternalBmod.g:1189:1: rule__Person__Group_7_1__0 : rule__Person__Group_7_1__0__Impl rule__Person__Group_7_1__1 ;
    public final void rule__Person__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1193:1: ( rule__Person__Group_7_1__0__Impl rule__Person__Group_7_1__1 )
            // InternalBmod.g:1194:2: rule__Person__Group_7_1__0__Impl rule__Person__Group_7_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Person__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_7_1__1();

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
    // $ANTLR end "rule__Person__Group_7_1__0"


    // $ANTLR start "rule__Person__Group_7_1__0__Impl"
    // InternalBmod.g:1201:1: rule__Person__Group_7_1__0__Impl : ( ( rule__Person__ActionAssignment_7_1_0 ) ) ;
    public final void rule__Person__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1205:1: ( ( ( rule__Person__ActionAssignment_7_1_0 ) ) )
            // InternalBmod.g:1206:1: ( ( rule__Person__ActionAssignment_7_1_0 ) )
            {
            // InternalBmod.g:1206:1: ( ( rule__Person__ActionAssignment_7_1_0 ) )
            // InternalBmod.g:1207:2: ( rule__Person__ActionAssignment_7_1_0 )
            {
             before(grammarAccess.getPersonAccess().getActionAssignment_7_1_0()); 
            // InternalBmod.g:1208:2: ( rule__Person__ActionAssignment_7_1_0 )
            // InternalBmod.g:1208:3: rule__Person__ActionAssignment_7_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Person__ActionAssignment_7_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getActionAssignment_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_7_1__0__Impl"


    // $ANTLR start "rule__Person__Group_7_1__1"
    // InternalBmod.g:1216:1: rule__Person__Group_7_1__1 : rule__Person__Group_7_1__1__Impl rule__Person__Group_7_1__2 ;
    public final void rule__Person__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1220:1: ( rule__Person__Group_7_1__1__Impl rule__Person__Group_7_1__2 )
            // InternalBmod.g:1221:2: rule__Person__Group_7_1__1__Impl rule__Person__Group_7_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Person__Group_7_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_7_1__2();

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
    // $ANTLR end "rule__Person__Group_7_1__1"


    // $ANTLR start "rule__Person__Group_7_1__1__Impl"
    // InternalBmod.g:1228:1: rule__Person__Group_7_1__1__Impl : ( ',' ) ;
    public final void rule__Person__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1232:1: ( ( ',' ) )
            // InternalBmod.g:1233:1: ( ',' )
            {
            // InternalBmod.g:1233:1: ( ',' )
            // InternalBmod.g:1234:2: ','
            {
             before(grammarAccess.getPersonAccess().getCommaKeyword_7_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getCommaKeyword_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_7_1__1__Impl"


    // $ANTLR start "rule__Person__Group_7_1__2"
    // InternalBmod.g:1243:1: rule__Person__Group_7_1__2 : rule__Person__Group_7_1__2__Impl ;
    public final void rule__Person__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1247:1: ( rule__Person__Group_7_1__2__Impl )
            // InternalBmod.g:1248:2: rule__Person__Group_7_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_7_1__2__Impl();

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
    // $ANTLR end "rule__Person__Group_7_1__2"


    // $ANTLR start "rule__Person__Group_7_1__2__Impl"
    // InternalBmod.g:1254:1: rule__Person__Group_7_1__2__Impl : ( ( rule__Person__PerceptionAssignment_7_1_2 ) ) ;
    public final void rule__Person__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1258:1: ( ( ( rule__Person__PerceptionAssignment_7_1_2 ) ) )
            // InternalBmod.g:1259:1: ( ( rule__Person__PerceptionAssignment_7_1_2 ) )
            {
            // InternalBmod.g:1259:1: ( ( rule__Person__PerceptionAssignment_7_1_2 ) )
            // InternalBmod.g:1260:2: ( rule__Person__PerceptionAssignment_7_1_2 )
            {
             before(grammarAccess.getPersonAccess().getPerceptionAssignment_7_1_2()); 
            // InternalBmod.g:1261:2: ( rule__Person__PerceptionAssignment_7_1_2 )
            // InternalBmod.g:1261:3: rule__Person__PerceptionAssignment_7_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Person__PerceptionAssignment_7_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getPerceptionAssignment_7_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_7_1__2__Impl"


    // $ANTLR start "rule__Exit__Group__0"
    // InternalBmod.g:1270:1: rule__Exit__Group__0 : rule__Exit__Group__0__Impl rule__Exit__Group__1 ;
    public final void rule__Exit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1274:1: ( rule__Exit__Group__0__Impl rule__Exit__Group__1 )
            // InternalBmod.g:1275:2: rule__Exit__Group__0__Impl rule__Exit__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalBmod.g:1282:1: rule__Exit__Group__0__Impl : ( 'Exit' ) ;
    public final void rule__Exit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1286:1: ( ( 'Exit' ) )
            // InternalBmod.g:1287:1: ( 'Exit' )
            {
            // InternalBmod.g:1287:1: ( 'Exit' )
            // InternalBmod.g:1288:2: 'Exit'
            {
             before(grammarAccess.getExitAccess().getExitKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBmod.g:1297:1: rule__Exit__Group__1 : rule__Exit__Group__1__Impl rule__Exit__Group__2 ;
    public final void rule__Exit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1301:1: ( rule__Exit__Group__1__Impl rule__Exit__Group__2 )
            // InternalBmod.g:1302:2: rule__Exit__Group__1__Impl rule__Exit__Group__2
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
    // InternalBmod.g:1309:1: rule__Exit__Group__1__Impl : ( 'in' ) ;
    public final void rule__Exit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1313:1: ( ( 'in' ) )
            // InternalBmod.g:1314:1: ( 'in' )
            {
            // InternalBmod.g:1314:1: ( 'in' )
            // InternalBmod.g:1315:2: 'in'
            {
             before(grammarAccess.getExitAccess().getInKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBmod.g:1324:1: rule__Exit__Group__2 : rule__Exit__Group__2__Impl ;
    public final void rule__Exit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1328:1: ( rule__Exit__Group__2__Impl )
            // InternalBmod.g:1329:2: rule__Exit__Group__2__Impl
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
    // InternalBmod.g:1335:1: rule__Exit__Group__2__Impl : ( ( rule__Exit__LocationAssignment_2 ) ) ;
    public final void rule__Exit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1339:1: ( ( ( rule__Exit__LocationAssignment_2 ) ) )
            // InternalBmod.g:1340:1: ( ( rule__Exit__LocationAssignment_2 ) )
            {
            // InternalBmod.g:1340:1: ( ( rule__Exit__LocationAssignment_2 ) )
            // InternalBmod.g:1341:2: ( rule__Exit__LocationAssignment_2 )
            {
             before(grammarAccess.getExitAccess().getLocationAssignment_2()); 
            // InternalBmod.g:1342:2: ( rule__Exit__LocationAssignment_2 )
            // InternalBmod.g:1342:3: rule__Exit__LocationAssignment_2
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
    // InternalBmod.g:1351:1: rule__EmergencySign__Group__0 : rule__EmergencySign__Group__0__Impl rule__EmergencySign__Group__1 ;
    public final void rule__EmergencySign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1355:1: ( rule__EmergencySign__Group__0__Impl rule__EmergencySign__Group__1 )
            // InternalBmod.g:1356:2: rule__EmergencySign__Group__0__Impl rule__EmergencySign__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBmod.g:1363:1: rule__EmergencySign__Group__0__Impl : ( 'Sign' ) ;
    public final void rule__EmergencySign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1367:1: ( ( 'Sign' ) )
            // InternalBmod.g:1368:1: ( 'Sign' )
            {
            // InternalBmod.g:1368:1: ( 'Sign' )
            // InternalBmod.g:1369:2: 'Sign'
            {
             before(grammarAccess.getEmergencySignAccess().getSignKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBmod.g:1378:1: rule__EmergencySign__Group__1 : rule__EmergencySign__Group__1__Impl rule__EmergencySign__Group__2 ;
    public final void rule__EmergencySign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1382:1: ( rule__EmergencySign__Group__1__Impl rule__EmergencySign__Group__2 )
            // InternalBmod.g:1383:2: rule__EmergencySign__Group__1__Impl rule__EmergencySign__Group__2
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
    // InternalBmod.g:1390:1: rule__EmergencySign__Group__1__Impl : ( 'on' ) ;
    public final void rule__EmergencySign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1394:1: ( ( 'on' ) )
            // InternalBmod.g:1395:1: ( 'on' )
            {
            // InternalBmod.g:1395:1: ( 'on' )
            // InternalBmod.g:1396:2: 'on'
            {
             before(grammarAccess.getEmergencySignAccess().getOnKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBmod.g:1405:1: rule__EmergencySign__Group__2 : rule__EmergencySign__Group__2__Impl rule__EmergencySign__Group__3 ;
    public final void rule__EmergencySign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1409:1: ( rule__EmergencySign__Group__2__Impl rule__EmergencySign__Group__3 )
            // InternalBmod.g:1410:2: rule__EmergencySign__Group__2__Impl rule__EmergencySign__Group__3
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
    // InternalBmod.g:1417:1: rule__EmergencySign__Group__2__Impl : ( ( rule__EmergencySign__OnAssignment_2 ) ) ;
    public final void rule__EmergencySign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1421:1: ( ( ( rule__EmergencySign__OnAssignment_2 ) ) )
            // InternalBmod.g:1422:1: ( ( rule__EmergencySign__OnAssignment_2 ) )
            {
            // InternalBmod.g:1422:1: ( ( rule__EmergencySign__OnAssignment_2 ) )
            // InternalBmod.g:1423:2: ( rule__EmergencySign__OnAssignment_2 )
            {
             before(grammarAccess.getEmergencySignAccess().getOnAssignment_2()); 
            // InternalBmod.g:1424:2: ( rule__EmergencySign__OnAssignment_2 )
            // InternalBmod.g:1424:3: rule__EmergencySign__OnAssignment_2
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
    // InternalBmod.g:1432:1: rule__EmergencySign__Group__3 : rule__EmergencySign__Group__3__Impl rule__EmergencySign__Group__4 ;
    public final void rule__EmergencySign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1436:1: ( rule__EmergencySign__Group__3__Impl rule__EmergencySign__Group__4 )
            // InternalBmod.g:1437:2: rule__EmergencySign__Group__3__Impl rule__EmergencySign__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__EmergencySign__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmergencySign__Group__4();

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
    // InternalBmod.g:1444:1: rule__EmergencySign__Group__3__Impl : ( 'to' ) ;
    public final void rule__EmergencySign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1448:1: ( ( 'to' ) )
            // InternalBmod.g:1449:1: ( 'to' )
            {
            // InternalBmod.g:1449:1: ( 'to' )
            // InternalBmod.g:1450:2: 'to'
            {
             before(grammarAccess.getEmergencySignAccess().getToKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEmergencySignAccess().getToKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__EmergencySign__Group__4"
    // InternalBmod.g:1459:1: rule__EmergencySign__Group__4 : rule__EmergencySign__Group__4__Impl ;
    public final void rule__EmergencySign__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1463:1: ( rule__EmergencySign__Group__4__Impl )
            // InternalBmod.g:1464:2: rule__EmergencySign__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmergencySign__Group__4__Impl();

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
    // $ANTLR end "rule__EmergencySign__Group__4"


    // $ANTLR start "rule__EmergencySign__Group__4__Impl"
    // InternalBmod.g:1470:1: rule__EmergencySign__Group__4__Impl : ( ( rule__EmergencySign__ToAssignment_4 ) ) ;
    public final void rule__EmergencySign__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1474:1: ( ( ( rule__EmergencySign__ToAssignment_4 ) ) )
            // InternalBmod.g:1475:1: ( ( rule__EmergencySign__ToAssignment_4 ) )
            {
            // InternalBmod.g:1475:1: ( ( rule__EmergencySign__ToAssignment_4 ) )
            // InternalBmod.g:1476:2: ( rule__EmergencySign__ToAssignment_4 )
            {
             before(grammarAccess.getEmergencySignAccess().getToAssignment_4()); 
            // InternalBmod.g:1477:2: ( rule__EmergencySign__ToAssignment_4 )
            // InternalBmod.g:1477:3: rule__EmergencySign__ToAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EmergencySign__ToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEmergencySignAccess().getToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmergencySign__Group__4__Impl"


    // $ANTLR start "rule__DangerousCondition__Group__0"
    // InternalBmod.g:1486:1: rule__DangerousCondition__Group__0 : rule__DangerousCondition__Group__0__Impl rule__DangerousCondition__Group__1 ;
    public final void rule__DangerousCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1490:1: ( rule__DangerousCondition__Group__0__Impl rule__DangerousCondition__Group__1 )
            // InternalBmod.g:1491:2: rule__DangerousCondition__Group__0__Impl rule__DangerousCondition__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalBmod.g:1498:1: rule__DangerousCondition__Group__0__Impl : ( 'Condition' ) ;
    public final void rule__DangerousCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1502:1: ( ( 'Condition' ) )
            // InternalBmod.g:1503:1: ( 'Condition' )
            {
            // InternalBmod.g:1503:1: ( 'Condition' )
            // InternalBmod.g:1504:2: 'Condition'
            {
             before(grammarAccess.getDangerousConditionAccess().getConditionKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBmod.g:1513:1: rule__DangerousCondition__Group__1 : rule__DangerousCondition__Group__1__Impl rule__DangerousCondition__Group__2 ;
    public final void rule__DangerousCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1517:1: ( rule__DangerousCondition__Group__1__Impl rule__DangerousCondition__Group__2 )
            // InternalBmod.g:1518:2: rule__DangerousCondition__Group__1__Impl rule__DangerousCondition__Group__2
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
    // InternalBmod.g:1525:1: rule__DangerousCondition__Group__1__Impl : ( 'on' ) ;
    public final void rule__DangerousCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1529:1: ( ( 'on' ) )
            // InternalBmod.g:1530:1: ( 'on' )
            {
            // InternalBmod.g:1530:1: ( 'on' )
            // InternalBmod.g:1531:2: 'on'
            {
             before(grammarAccess.getDangerousConditionAccess().getOnKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBmod.g:1540:1: rule__DangerousCondition__Group__2 : rule__DangerousCondition__Group__2__Impl rule__DangerousCondition__Group__3 ;
    public final void rule__DangerousCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1544:1: ( rule__DangerousCondition__Group__2__Impl rule__DangerousCondition__Group__3 )
            // InternalBmod.g:1545:2: rule__DangerousCondition__Group__2__Impl rule__DangerousCondition__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalBmod.g:1552:1: rule__DangerousCondition__Group__2__Impl : ( ( rule__DangerousCondition__OnAssignment_2 ) ) ;
    public final void rule__DangerousCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1556:1: ( ( ( rule__DangerousCondition__OnAssignment_2 ) ) )
            // InternalBmod.g:1557:1: ( ( rule__DangerousCondition__OnAssignment_2 ) )
            {
            // InternalBmod.g:1557:1: ( ( rule__DangerousCondition__OnAssignment_2 ) )
            // InternalBmod.g:1558:2: ( rule__DangerousCondition__OnAssignment_2 )
            {
             before(grammarAccess.getDangerousConditionAccess().getOnAssignment_2()); 
            // InternalBmod.g:1559:2: ( rule__DangerousCondition__OnAssignment_2 )
            // InternalBmod.g:1559:3: rule__DangerousCondition__OnAssignment_2
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
    // InternalBmod.g:1567:1: rule__DangerousCondition__Group__3 : rule__DangerousCondition__Group__3__Impl ;
    public final void rule__DangerousCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1571:1: ( rule__DangerousCondition__Group__3__Impl )
            // InternalBmod.g:1572:2: rule__DangerousCondition__Group__3__Impl
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
    // InternalBmod.g:1578:1: rule__DangerousCondition__Group__3__Impl : ( ( rule__DangerousCondition__AmountAssignment_3 ) ) ;
    public final void rule__DangerousCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1582:1: ( ( ( rule__DangerousCondition__AmountAssignment_3 ) ) )
            // InternalBmod.g:1583:1: ( ( rule__DangerousCondition__AmountAssignment_3 ) )
            {
            // InternalBmod.g:1583:1: ( ( rule__DangerousCondition__AmountAssignment_3 ) )
            // InternalBmod.g:1584:2: ( rule__DangerousCondition__AmountAssignment_3 )
            {
             before(grammarAccess.getDangerousConditionAccess().getAmountAssignment_3()); 
            // InternalBmod.g:1585:2: ( rule__DangerousCondition__AmountAssignment_3 )
            // InternalBmod.g:1585:3: rule__DangerousCondition__AmountAssignment_3
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
    // InternalBmod.g:1594:1: rule__Coordinate__Group__0 : rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 ;
    public final void rule__Coordinate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1598:1: ( rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 )
            // InternalBmod.g:1599:2: rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBmod.g:1606:1: rule__Coordinate__Group__0__Impl : ( '(' ) ;
    public final void rule__Coordinate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1610:1: ( ( '(' ) )
            // InternalBmod.g:1611:1: ( '(' )
            {
            // InternalBmod.g:1611:1: ( '(' )
            // InternalBmod.g:1612:2: '('
            {
             before(grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBmod.g:1621:1: rule__Coordinate__Group__1 : rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2 ;
    public final void rule__Coordinate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1625:1: ( rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2 )
            // InternalBmod.g:1626:2: rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBmod.g:1633:1: rule__Coordinate__Group__1__Impl : ( ( rule__Coordinate__XAssignment_1 ) ) ;
    public final void rule__Coordinate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1637:1: ( ( ( rule__Coordinate__XAssignment_1 ) ) )
            // InternalBmod.g:1638:1: ( ( rule__Coordinate__XAssignment_1 ) )
            {
            // InternalBmod.g:1638:1: ( ( rule__Coordinate__XAssignment_1 ) )
            // InternalBmod.g:1639:2: ( rule__Coordinate__XAssignment_1 )
            {
             before(grammarAccess.getCoordinateAccess().getXAssignment_1()); 
            // InternalBmod.g:1640:2: ( rule__Coordinate__XAssignment_1 )
            // InternalBmod.g:1640:3: rule__Coordinate__XAssignment_1
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
    // InternalBmod.g:1648:1: rule__Coordinate__Group__2 : rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3 ;
    public final void rule__Coordinate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1652:1: ( rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3 )
            // InternalBmod.g:1653:2: rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalBmod.g:1660:1: rule__Coordinate__Group__2__Impl : ( ',' ) ;
    public final void rule__Coordinate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1664:1: ( ( ',' ) )
            // InternalBmod.g:1665:1: ( ',' )
            {
            // InternalBmod.g:1665:1: ( ',' )
            // InternalBmod.g:1666:2: ','
            {
             before(grammarAccess.getCoordinateAccess().getCommaKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBmod.g:1675:1: rule__Coordinate__Group__3 : rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4 ;
    public final void rule__Coordinate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1679:1: ( rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4 )
            // InternalBmod.g:1680:2: rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBmod.g:1687:1: rule__Coordinate__Group__3__Impl : ( ( rule__Coordinate__YAssignment_3 ) ) ;
    public final void rule__Coordinate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1691:1: ( ( ( rule__Coordinate__YAssignment_3 ) ) )
            // InternalBmod.g:1692:1: ( ( rule__Coordinate__YAssignment_3 ) )
            {
            // InternalBmod.g:1692:1: ( ( rule__Coordinate__YAssignment_3 ) )
            // InternalBmod.g:1693:2: ( rule__Coordinate__YAssignment_3 )
            {
             before(grammarAccess.getCoordinateAccess().getYAssignment_3()); 
            // InternalBmod.g:1694:2: ( rule__Coordinate__YAssignment_3 )
            // InternalBmod.g:1694:3: rule__Coordinate__YAssignment_3
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
    // InternalBmod.g:1702:1: rule__Coordinate__Group__4 : rule__Coordinate__Group__4__Impl ;
    public final void rule__Coordinate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1706:1: ( rule__Coordinate__Group__4__Impl )
            // InternalBmod.g:1707:2: rule__Coordinate__Group__4__Impl
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
    // InternalBmod.g:1713:1: rule__Coordinate__Group__4__Impl : ( ')' ) ;
    public final void rule__Coordinate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1717:1: ( ( ')' ) )
            // InternalBmod.g:1718:1: ( ')' )
            {
            // InternalBmod.g:1718:1: ( ')' )
            // InternalBmod.g:1719:2: ')'
            {
             before(grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBmod.g:1729:1: rule__Area__Group__0 : rule__Area__Group__0__Impl rule__Area__Group__1 ;
    public final void rule__Area__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1733:1: ( rule__Area__Group__0__Impl rule__Area__Group__1 )
            // InternalBmod.g:1734:2: rule__Area__Group__0__Impl rule__Area__Group__1
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
    // InternalBmod.g:1741:1: rule__Area__Group__0__Impl : ( 'from' ) ;
    public final void rule__Area__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1745:1: ( ( 'from' ) )
            // InternalBmod.g:1746:1: ( 'from' )
            {
            // InternalBmod.g:1746:1: ( 'from' )
            // InternalBmod.g:1747:2: 'from'
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
    // InternalBmod.g:1756:1: rule__Area__Group__1 : rule__Area__Group__1__Impl rule__Area__Group__2 ;
    public final void rule__Area__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1760:1: ( rule__Area__Group__1__Impl rule__Area__Group__2 )
            // InternalBmod.g:1761:2: rule__Area__Group__1__Impl rule__Area__Group__2
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
    // InternalBmod.g:1768:1: rule__Area__Group__1__Impl : ( ( rule__Area__FromAssignment_1 ) ) ;
    public final void rule__Area__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1772:1: ( ( ( rule__Area__FromAssignment_1 ) ) )
            // InternalBmod.g:1773:1: ( ( rule__Area__FromAssignment_1 ) )
            {
            // InternalBmod.g:1773:1: ( ( rule__Area__FromAssignment_1 ) )
            // InternalBmod.g:1774:2: ( rule__Area__FromAssignment_1 )
            {
             before(grammarAccess.getAreaAccess().getFromAssignment_1()); 
            // InternalBmod.g:1775:2: ( rule__Area__FromAssignment_1 )
            // InternalBmod.g:1775:3: rule__Area__FromAssignment_1
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
    // InternalBmod.g:1783:1: rule__Area__Group__2 : rule__Area__Group__2__Impl rule__Area__Group__3 ;
    public final void rule__Area__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1787:1: ( rule__Area__Group__2__Impl rule__Area__Group__3 )
            // InternalBmod.g:1788:2: rule__Area__Group__2__Impl rule__Area__Group__3
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
    // InternalBmod.g:1795:1: rule__Area__Group__2__Impl : ( 'to' ) ;
    public final void rule__Area__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1799:1: ( ( 'to' ) )
            // InternalBmod.g:1800:1: ( 'to' )
            {
            // InternalBmod.g:1800:1: ( 'to' )
            // InternalBmod.g:1801:2: 'to'
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
    // InternalBmod.g:1810:1: rule__Area__Group__3 : rule__Area__Group__3__Impl rule__Area__Group__4 ;
    public final void rule__Area__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1814:1: ( rule__Area__Group__3__Impl rule__Area__Group__4 )
            // InternalBmod.g:1815:2: rule__Area__Group__3__Impl rule__Area__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalBmod.g:1822:1: rule__Area__Group__3__Impl : ( ( rule__Area__ToAssignment_3 ) ) ;
    public final void rule__Area__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1826:1: ( ( ( rule__Area__ToAssignment_3 ) ) )
            // InternalBmod.g:1827:1: ( ( rule__Area__ToAssignment_3 ) )
            {
            // InternalBmod.g:1827:1: ( ( rule__Area__ToAssignment_3 ) )
            // InternalBmod.g:1828:2: ( rule__Area__ToAssignment_3 )
            {
             before(grammarAccess.getAreaAccess().getToAssignment_3()); 
            // InternalBmod.g:1829:2: ( rule__Area__ToAssignment_3 )
            // InternalBmod.g:1829:3: rule__Area__ToAssignment_3
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
    // InternalBmod.g:1837:1: rule__Area__Group__4 : rule__Area__Group__4__Impl ;
    public final void rule__Area__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1841:1: ( rule__Area__Group__4__Impl )
            // InternalBmod.g:1842:2: rule__Area__Group__4__Impl
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
    // InternalBmod.g:1848:1: rule__Area__Group__4__Impl : ( ( rule__Area__Group_4__0 )? ) ;
    public final void rule__Area__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1852:1: ( ( ( rule__Area__Group_4__0 )? ) )
            // InternalBmod.g:1853:1: ( ( rule__Area__Group_4__0 )? )
            {
            // InternalBmod.g:1853:1: ( ( rule__Area__Group_4__0 )? )
            // InternalBmod.g:1854:2: ( rule__Area__Group_4__0 )?
            {
             before(grammarAccess.getAreaAccess().getGroup_4()); 
            // InternalBmod.g:1855:2: ( rule__Area__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBmod.g:1855:3: rule__Area__Group_4__0
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
    // InternalBmod.g:1864:1: rule__Area__Group_4__0 : rule__Area__Group_4__0__Impl rule__Area__Group_4__1 ;
    public final void rule__Area__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1868:1: ( rule__Area__Group_4__0__Impl rule__Area__Group_4__1 )
            // InternalBmod.g:1869:2: rule__Area__Group_4__0__Impl rule__Area__Group_4__1
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
    // InternalBmod.g:1876:1: rule__Area__Group_4__0__Impl : ( 'without' ) ;
    public final void rule__Area__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1880:1: ( ( 'without' ) )
            // InternalBmod.g:1881:1: ( 'without' )
            {
            // InternalBmod.g:1881:1: ( 'without' )
            // InternalBmod.g:1882:2: 'without'
            {
             before(grammarAccess.getAreaAccess().getWithoutKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBmod.g:1891:1: rule__Area__Group_4__1 : rule__Area__Group_4__1__Impl rule__Area__Group_4__2 ;
    public final void rule__Area__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1895:1: ( rule__Area__Group_4__1__Impl rule__Area__Group_4__2 )
            // InternalBmod.g:1896:2: rule__Area__Group_4__1__Impl rule__Area__Group_4__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBmod.g:1903:1: rule__Area__Group_4__1__Impl : ( ( rule__Area__WithoutAssignment_4_1 ) ) ;
    public final void rule__Area__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1907:1: ( ( ( rule__Area__WithoutAssignment_4_1 ) ) )
            // InternalBmod.g:1908:1: ( ( rule__Area__WithoutAssignment_4_1 ) )
            {
            // InternalBmod.g:1908:1: ( ( rule__Area__WithoutAssignment_4_1 ) )
            // InternalBmod.g:1909:2: ( rule__Area__WithoutAssignment_4_1 )
            {
             before(grammarAccess.getAreaAccess().getWithoutAssignment_4_1()); 
            // InternalBmod.g:1910:2: ( rule__Area__WithoutAssignment_4_1 )
            // InternalBmod.g:1910:3: rule__Area__WithoutAssignment_4_1
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
    // InternalBmod.g:1918:1: rule__Area__Group_4__2 : rule__Area__Group_4__2__Impl ;
    public final void rule__Area__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1922:1: ( rule__Area__Group_4__2__Impl )
            // InternalBmod.g:1923:2: rule__Area__Group_4__2__Impl
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
    // InternalBmod.g:1929:1: rule__Area__Group_4__2__Impl : ( ( rule__Area__Group_4_2__0 )* ) ;
    public final void rule__Area__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1933:1: ( ( ( rule__Area__Group_4_2__0 )* ) )
            // InternalBmod.g:1934:1: ( ( rule__Area__Group_4_2__0 )* )
            {
            // InternalBmod.g:1934:1: ( ( rule__Area__Group_4_2__0 )* )
            // InternalBmod.g:1935:2: ( rule__Area__Group_4_2__0 )*
            {
             before(grammarAccess.getAreaAccess().getGroup_4_2()); 
            // InternalBmod.g:1936:2: ( rule__Area__Group_4_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBmod.g:1936:3: rule__Area__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Area__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalBmod.g:1945:1: rule__Area__Group_4_2__0 : rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1 ;
    public final void rule__Area__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1949:1: ( rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1 )
            // InternalBmod.g:1950:2: rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1
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
    // InternalBmod.g:1957:1: rule__Area__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Area__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1961:1: ( ( ',' ) )
            // InternalBmod.g:1962:1: ( ',' )
            {
            // InternalBmod.g:1962:1: ( ',' )
            // InternalBmod.g:1963:2: ','
            {
             before(grammarAccess.getAreaAccess().getCommaKeyword_4_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBmod.g:1972:1: rule__Area__Group_4_2__1 : rule__Area__Group_4_2__1__Impl ;
    public final void rule__Area__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1976:1: ( rule__Area__Group_4_2__1__Impl )
            // InternalBmod.g:1977:2: rule__Area__Group_4_2__1__Impl
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
    // InternalBmod.g:1983:1: rule__Area__Group_4_2__1__Impl : ( ( rule__Area__WithoutAssignment_4_2_1 ) ) ;
    public final void rule__Area__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:1987:1: ( ( ( rule__Area__WithoutAssignment_4_2_1 ) ) )
            // InternalBmod.g:1988:1: ( ( rule__Area__WithoutAssignment_4_2_1 ) )
            {
            // InternalBmod.g:1988:1: ( ( rule__Area__WithoutAssignment_4_2_1 ) )
            // InternalBmod.g:1989:2: ( rule__Area__WithoutAssignment_4_2_1 )
            {
             before(grammarAccess.getAreaAccess().getWithoutAssignment_4_2_1()); 
            // InternalBmod.g:1990:2: ( rule__Area__WithoutAssignment_4_2_1 )
            // InternalBmod.g:1990:3: rule__Area__WithoutAssignment_4_2_1
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
    // InternalBmod.g:1999:1: rule__Floorplan__RoomsAssignment_1_0 : ( ruleRoom ) ;
    public final void rule__Floorplan__RoomsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2003:1: ( ( ruleRoom ) )
            // InternalBmod.g:2004:2: ( ruleRoom )
            {
            // InternalBmod.g:2004:2: ( ruleRoom )
            // InternalBmod.g:2005:3: ruleRoom
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
    // InternalBmod.g:2014:1: rule__Floorplan__DoorsAssignment_1_1 : ( ruleDoor ) ;
    public final void rule__Floorplan__DoorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2018:1: ( ( ruleDoor ) )
            // InternalBmod.g:2019:2: ( ruleDoor )
            {
            // InternalBmod.g:2019:2: ( ruleDoor )
            // InternalBmod.g:2020:3: ruleDoor
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
    // InternalBmod.g:2029:1: rule__Floorplan__PersonsAssignment_1_2 : ( rulePerson ) ;
    public final void rule__Floorplan__PersonsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2033:1: ( ( rulePerson ) )
            // InternalBmod.g:2034:2: ( rulePerson )
            {
            // InternalBmod.g:2034:2: ( rulePerson )
            // InternalBmod.g:2035:3: rulePerson
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


    // $ANTLR start "rule__Floorplan__ExitsAssignment_1_3"
    // InternalBmod.g:2044:1: rule__Floorplan__ExitsAssignment_1_3 : ( ruleExit ) ;
    public final void rule__Floorplan__ExitsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2048:1: ( ( ruleExit ) )
            // InternalBmod.g:2049:2: ( ruleExit )
            {
            // InternalBmod.g:2049:2: ( ruleExit )
            // InternalBmod.g:2050:3: ruleExit
            {
             before(grammarAccess.getFloorplanAccess().getExitsExitParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExit();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getExitsExitParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floorplan__ExitsAssignment_1_3"


    // $ANTLR start "rule__Floorplan__SignsAssignment_1_4"
    // InternalBmod.g:2059:1: rule__Floorplan__SignsAssignment_1_4 : ( ruleEmergencySign ) ;
    public final void rule__Floorplan__SignsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2063:1: ( ( ruleEmergencySign ) )
            // InternalBmod.g:2064:2: ( ruleEmergencySign )
            {
            // InternalBmod.g:2064:2: ( ruleEmergencySign )
            // InternalBmod.g:2065:3: ruleEmergencySign
            {
             before(grammarAccess.getFloorplanAccess().getSignsEmergencySignParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEmergencySign();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getSignsEmergencySignParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floorplan__SignsAssignment_1_4"


    // $ANTLR start "rule__Floorplan__DanconsAssignment_1_5"
    // InternalBmod.g:2074:1: rule__Floorplan__DanconsAssignment_1_5 : ( ruleDangerousCondition ) ;
    public final void rule__Floorplan__DanconsAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2078:1: ( ( ruleDangerousCondition ) )
            // InternalBmod.g:2079:2: ( ruleDangerousCondition )
            {
            // InternalBmod.g:2079:2: ( ruleDangerousCondition )
            // InternalBmod.g:2080:3: ruleDangerousCondition
            {
             before(grammarAccess.getFloorplanAccess().getDanconsDangerousConditionParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDangerousCondition();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getDanconsDangerousConditionParserRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floorplan__DanconsAssignment_1_5"


    // $ANTLR start "rule__Room__NameAssignment_1"
    // InternalBmod.g:2089:1: rule__Room__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Room__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2093:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2094:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:2094:2: ( RULE_VARNAME )
            // InternalBmod.g:2095:3: RULE_VARNAME
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
    // InternalBmod.g:2104:1: rule__Room__NamedAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Room__NamedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2108:1: ( ( RULE_STRING ) )
            // InternalBmod.g:2109:2: ( RULE_STRING )
            {
            // InternalBmod.g:2109:2: ( RULE_STRING )
            // InternalBmod.g:2110:3: RULE_STRING
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


    // $ANTLR start "rule__Room__AreasAssignment_4"
    // InternalBmod.g:2119:1: rule__Room__AreasAssignment_4 : ( ruleArea ) ;
    public final void rule__Room__AreasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2123:1: ( ( ruleArea ) )
            // InternalBmod.g:2124:2: ( ruleArea )
            {
            // InternalBmod.g:2124:2: ( ruleArea )
            // InternalBmod.g:2125:3: ruleArea
            {
             before(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArea();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__AreasAssignment_4"


    // $ANTLR start "rule__Room__AreasAssignment_5_1"
    // InternalBmod.g:2134:1: rule__Room__AreasAssignment_5_1 : ( ruleArea ) ;
    public final void rule__Room__AreasAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2138:1: ( ( ruleArea ) )
            // InternalBmod.g:2139:2: ( ruleArea )
            {
            // InternalBmod.g:2139:2: ( ruleArea )
            // InternalBmod.g:2140:3: ruleArea
            {
             before(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArea();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__AreasAssignment_5_1"


    // $ANTLR start "rule__Door__NameAssignment_1"
    // InternalBmod.g:2149:1: rule__Door__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Door__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2153:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2154:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:2154:2: ( RULE_VARNAME )
            // InternalBmod.g:2155:3: RULE_VARNAME
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
    // InternalBmod.g:2164:1: rule__Door__FromAssignment_3 : ( ruleCoordinate ) ;
    public final void rule__Door__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2168:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2169:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2169:2: ( ruleCoordinate )
            // InternalBmod.g:2170:3: ruleCoordinate
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
    // InternalBmod.g:2179:1: rule__Door__ToAssignment_5 : ( ruleCoordinate ) ;
    public final void rule__Door__ToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2183:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2184:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2184:2: ( ruleCoordinate )
            // InternalBmod.g:2185:3: ruleCoordinate
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


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalBmod.g:2194:1: rule__Person__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2198:1: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2199:2: ( RULE_VARNAME )
            {
            // InternalBmod.g:2199:2: ( RULE_VARNAME )
            // InternalBmod.g:2200:3: RULE_VARNAME
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
    // InternalBmod.g:2209:1: rule__Person__NamedAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Person__NamedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2213:1: ( ( RULE_STRING ) )
            // InternalBmod.g:2214:2: ( RULE_STRING )
            {
            // InternalBmod.g:2214:2: ( RULE_STRING )
            // InternalBmod.g:2215:3: RULE_STRING
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
    // InternalBmod.g:2224:1: rule__Person__LocationAssignment_5 : ( ruleCoordinate ) ;
    public final void rule__Person__LocationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2228:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2229:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2229:2: ( ruleCoordinate )
            // InternalBmod.g:2230:3: ruleCoordinate
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


    // $ANTLR start "rule__Person__PerceptionAssignment_7_0_0"
    // InternalBmod.g:2239:1: rule__Person__PerceptionAssignment_7_0_0 : ( rulePerception ) ;
    public final void rule__Person__PerceptionAssignment_7_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2243:1: ( ( rulePerception ) )
            // InternalBmod.g:2244:2: ( rulePerception )
            {
            // InternalBmod.g:2244:2: ( rulePerception )
            // InternalBmod.g:2245:3: rulePerception
            {
             before(grammarAccess.getPersonAccess().getPerceptionPerceptionEnumRuleCall_7_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulePerception();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getPerceptionPerceptionEnumRuleCall_7_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__PerceptionAssignment_7_0_0"


    // $ANTLR start "rule__Person__ActionAssignment_7_0_2"
    // InternalBmod.g:2254:1: rule__Person__ActionAssignment_7_0_2 : ( ruleAction ) ;
    public final void rule__Person__ActionAssignment_7_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2258:1: ( ( ruleAction ) )
            // InternalBmod.g:2259:2: ( ruleAction )
            {
            // InternalBmod.g:2259:2: ( ruleAction )
            // InternalBmod.g:2260:3: ruleAction
            {
             before(grammarAccess.getPersonAccess().getActionActionEnumRuleCall_7_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getActionActionEnumRuleCall_7_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__ActionAssignment_7_0_2"


    // $ANTLR start "rule__Person__ActionAssignment_7_1_0"
    // InternalBmod.g:2269:1: rule__Person__ActionAssignment_7_1_0 : ( ruleAction ) ;
    public final void rule__Person__ActionAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2273:1: ( ( ruleAction ) )
            // InternalBmod.g:2274:2: ( ruleAction )
            {
            // InternalBmod.g:2274:2: ( ruleAction )
            // InternalBmod.g:2275:3: ruleAction
            {
             before(grammarAccess.getPersonAccess().getActionActionEnumRuleCall_7_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getActionActionEnumRuleCall_7_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__ActionAssignment_7_1_0"


    // $ANTLR start "rule__Person__PerceptionAssignment_7_1_2"
    // InternalBmod.g:2284:1: rule__Person__PerceptionAssignment_7_1_2 : ( rulePerception ) ;
    public final void rule__Person__PerceptionAssignment_7_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2288:1: ( ( rulePerception ) )
            // InternalBmod.g:2289:2: ( rulePerception )
            {
            // InternalBmod.g:2289:2: ( rulePerception )
            // InternalBmod.g:2290:3: rulePerception
            {
             before(grammarAccess.getPersonAccess().getPerceptionPerceptionEnumRuleCall_7_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerception();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getPerceptionPerceptionEnumRuleCall_7_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__PerceptionAssignment_7_1_2"


    // $ANTLR start "rule__Exit__LocationAssignment_2"
    // InternalBmod.g:2299:1: rule__Exit__LocationAssignment_2 : ( ruleCoordinate ) ;
    public final void rule__Exit__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2303:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2304:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2304:2: ( ruleCoordinate )
            // InternalBmod.g:2305:3: ruleCoordinate
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
    // InternalBmod.g:2314:1: rule__EmergencySign__OnAssignment_2 : ( ( RULE_VARNAME ) ) ;
    public final void rule__EmergencySign__OnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2318:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2319:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2319:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2320:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getEmergencySignAccess().getOnDoorCrossReference_2_0()); 
            // InternalBmod.g:2321:3: ( RULE_VARNAME )
            // InternalBmod.g:2322:4: RULE_VARNAME
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


    // $ANTLR start "rule__EmergencySign__ToAssignment_4"
    // InternalBmod.g:2333:1: rule__EmergencySign__ToAssignment_4 : ( ( RULE_VARNAME ) ) ;
    public final void rule__EmergencySign__ToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2337:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2338:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2338:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2339:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getEmergencySignAccess().getToDoorCrossReference_4_0()); 
            // InternalBmod.g:2340:3: ( RULE_VARNAME )
            // InternalBmod.g:2341:4: RULE_VARNAME
            {
             before(grammarAccess.getEmergencySignAccess().getToDoorVARNAMETerminalRuleCall_4_0_1()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getEmergencySignAccess().getToDoorVARNAMETerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getEmergencySignAccess().getToDoorCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmergencySign__ToAssignment_4"


    // $ANTLR start "rule__DangerousCondition__OnAssignment_2"
    // InternalBmod.g:2352:1: rule__DangerousCondition__OnAssignment_2 : ( ( RULE_VARNAME ) ) ;
    public final void rule__DangerousCondition__OnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2356:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmod.g:2357:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmod.g:2357:2: ( ( RULE_VARNAME ) )
            // InternalBmod.g:2358:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getDangerousConditionAccess().getOnRoomCrossReference_2_0()); 
            // InternalBmod.g:2359:3: ( RULE_VARNAME )
            // InternalBmod.g:2360:4: RULE_VARNAME
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
    // InternalBmod.g:2371:1: rule__DangerousCondition__AmountAssignment_3 : ( RULE_INT ) ;
    public final void rule__DangerousCondition__AmountAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2375:1: ( ( RULE_INT ) )
            // InternalBmod.g:2376:2: ( RULE_INT )
            {
            // InternalBmod.g:2376:2: ( RULE_INT )
            // InternalBmod.g:2377:3: RULE_INT
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
    // InternalBmod.g:2386:1: rule__Coordinate__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Coordinate__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2390:1: ( ( RULE_INT ) )
            // InternalBmod.g:2391:2: ( RULE_INT )
            {
            // InternalBmod.g:2391:2: ( RULE_INT )
            // InternalBmod.g:2392:3: RULE_INT
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
    // InternalBmod.g:2401:1: rule__Coordinate__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Coordinate__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2405:1: ( ( RULE_INT ) )
            // InternalBmod.g:2406:2: ( RULE_INT )
            {
            // InternalBmod.g:2406:2: ( RULE_INT )
            // InternalBmod.g:2407:3: RULE_INT
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
    // InternalBmod.g:2416:1: rule__Area__FromAssignment_1 : ( ruleCoordinate ) ;
    public final void rule__Area__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2420:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2421:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2421:2: ( ruleCoordinate )
            // InternalBmod.g:2422:3: ruleCoordinate
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
    // InternalBmod.g:2431:1: rule__Area__ToAssignment_3 : ( ruleCoordinate ) ;
    public final void rule__Area__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2435:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2436:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2436:2: ( ruleCoordinate )
            // InternalBmod.g:2437:3: ruleCoordinate
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
    // InternalBmod.g:2446:1: rule__Area__WithoutAssignment_4_1 : ( ruleCoordinate ) ;
    public final void rule__Area__WithoutAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2450:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2451:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2451:2: ( ruleCoordinate )
            // InternalBmod.g:2452:3: ruleCoordinate
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
    // InternalBmod.g:2461:1: rule__Area__WithoutAssignment_4_2_1 : ( ruleCoordinate ) ;
    public final void rule__Area__WithoutAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmod.g:2465:1: ( ( ruleCoordinate ) )
            // InternalBmod.g:2466:2: ( ruleCoordinate )
            {
            // InternalBmod.g:2466:2: ( ruleCoordinate )
            // InternalBmod.g:2467:3: ruleCoordinate
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000162480000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000162480002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});

}