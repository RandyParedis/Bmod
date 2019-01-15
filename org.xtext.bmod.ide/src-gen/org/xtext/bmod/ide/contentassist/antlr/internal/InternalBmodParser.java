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
import org.xtext.bmod.services.BmodGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBmodParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EmergencySign", "Without", "Person", "Import", "Door", "Exit", "Fire", "Room", "From", "And", "In", "To", "LeftParenthesis", "RightParenthesis", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_VARNAME", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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


        public InternalBmodParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBmodParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBmodParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBmodParser.g"; }


    	private BmodGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("In", "'in'");
    		tokenNameToValue.put("To", "'to'");
    		tokenNameToValue.put("And", "'and'");
    		tokenNameToValue.put("Door", "'Door'");
    		tokenNameToValue.put("Exit", "'Exit'");
    		tokenNameToValue.put("Fire", "'Fire'");
    		tokenNameToValue.put("Room", "'Room'");
    		tokenNameToValue.put("From", "'from'");
    		tokenNameToValue.put("Person", "'Person'");
    		tokenNameToValue.put("Import", "'import'");
    		tokenNameToValue.put("Without", "'without'");
    		tokenNameToValue.put("EmergencySign", "'EmergencySign'");
    	}

    	public void setGrammarAccess(BmodGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalBmodParser.g:73:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalBmodParser.g:74:1: ( ruleModel EOF )
            // InternalBmodParser.g:75:1: ruleModel EOF
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
    // InternalBmodParser.g:82:1: ruleModel : ( ruleFloorplan ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:86:2: ( ( ruleFloorplan ) )
            // InternalBmodParser.g:87:2: ( ruleFloorplan )
            {
            // InternalBmodParser.g:87:2: ( ruleFloorplan )
            // InternalBmodParser.g:88:3: ruleFloorplan
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
    // InternalBmodParser.g:98:1: entryRuleFloorplan : ruleFloorplan EOF ;
    public final void entryRuleFloorplan() throws RecognitionException {
        try {
            // InternalBmodParser.g:99:1: ( ruleFloorplan EOF )
            // InternalBmodParser.g:100:1: ruleFloorplan EOF
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
    // InternalBmodParser.g:107:1: ruleFloorplan : ( ( rule__Floorplan__Group__0 ) ) ;
    public final void ruleFloorplan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:111:2: ( ( ( rule__Floorplan__Group__0 ) ) )
            // InternalBmodParser.g:112:2: ( ( rule__Floorplan__Group__0 ) )
            {
            // InternalBmodParser.g:112:2: ( ( rule__Floorplan__Group__0 ) )
            // InternalBmodParser.g:113:3: ( rule__Floorplan__Group__0 )
            {
             before(grammarAccess.getFloorplanAccess().getGroup()); 
            // InternalBmodParser.g:114:3: ( rule__Floorplan__Group__0 )
            // InternalBmodParser.g:114:4: rule__Floorplan__Group__0
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


    // $ANTLR start "entryRuleImport"
    // InternalBmodParser.g:123:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalBmodParser.g:124:1: ( ruleImport EOF )
            // InternalBmodParser.g:125:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalBmodParser.g:132:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:136:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalBmodParser.g:137:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalBmodParser.g:137:2: ( ( rule__Import__Group__0 ) )
            // InternalBmodParser.g:138:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalBmodParser.g:139:3: ( rule__Import__Group__0 )
            // InternalBmodParser.g:139:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleRoom"
    // InternalBmodParser.g:148:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalBmodParser.g:149:1: ( ruleRoom EOF )
            // InternalBmodParser.g:150:1: ruleRoom EOF
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
    // InternalBmodParser.g:157:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:161:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalBmodParser.g:162:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalBmodParser.g:162:2: ( ( rule__Room__Group__0 ) )
            // InternalBmodParser.g:163:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalBmodParser.g:164:3: ( rule__Room__Group__0 )
            // InternalBmodParser.g:164:4: rule__Room__Group__0
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
    // InternalBmodParser.g:173:1: entryRuleDoor : ruleDoor EOF ;
    public final void entryRuleDoor() throws RecognitionException {
        try {
            // InternalBmodParser.g:174:1: ( ruleDoor EOF )
            // InternalBmodParser.g:175:1: ruleDoor EOF
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
    // InternalBmodParser.g:182:1: ruleDoor : ( ( rule__Door__Group__0 ) ) ;
    public final void ruleDoor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:186:2: ( ( ( rule__Door__Group__0 ) ) )
            // InternalBmodParser.g:187:2: ( ( rule__Door__Group__0 ) )
            {
            // InternalBmodParser.g:187:2: ( ( rule__Door__Group__0 ) )
            // InternalBmodParser.g:188:3: ( rule__Door__Group__0 )
            {
             before(grammarAccess.getDoorAccess().getGroup()); 
            // InternalBmodParser.g:189:3: ( rule__Door__Group__0 )
            // InternalBmodParser.g:189:4: rule__Door__Group__0
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
    // InternalBmodParser.g:198:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalBmodParser.g:199:1: ( rulePerson EOF )
            // InternalBmodParser.g:200:1: rulePerson EOF
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
    // InternalBmodParser.g:207:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:211:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalBmodParser.g:212:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalBmodParser.g:212:2: ( ( rule__Person__Group__0 ) )
            // InternalBmodParser.g:213:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalBmodParser.g:214:3: ( rule__Person__Group__0 )
            // InternalBmodParser.g:214:4: rule__Person__Group__0
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
    // InternalBmodParser.g:223:1: entryRuleExit : ruleExit EOF ;
    public final void entryRuleExit() throws RecognitionException {
        try {
            // InternalBmodParser.g:224:1: ( ruleExit EOF )
            // InternalBmodParser.g:225:1: ruleExit EOF
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
    // InternalBmodParser.g:232:1: ruleExit : ( ( rule__Exit__Group__0 ) ) ;
    public final void ruleExit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:236:2: ( ( ( rule__Exit__Group__0 ) ) )
            // InternalBmodParser.g:237:2: ( ( rule__Exit__Group__0 ) )
            {
            // InternalBmodParser.g:237:2: ( ( rule__Exit__Group__0 ) )
            // InternalBmodParser.g:238:3: ( rule__Exit__Group__0 )
            {
             before(grammarAccess.getExitAccess().getGroup()); 
            // InternalBmodParser.g:239:3: ( rule__Exit__Group__0 )
            // InternalBmodParser.g:239:4: rule__Exit__Group__0
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
    // InternalBmodParser.g:248:1: entryRuleFire : ruleFire EOF ;
    public final void entryRuleFire() throws RecognitionException {
        try {
            // InternalBmodParser.g:249:1: ( ruleFire EOF )
            // InternalBmodParser.g:250:1: ruleFire EOF
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
    // InternalBmodParser.g:257:1: ruleFire : ( ( rule__Fire__Group__0 ) ) ;
    public final void ruleFire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:261:2: ( ( ( rule__Fire__Group__0 ) ) )
            // InternalBmodParser.g:262:2: ( ( rule__Fire__Group__0 ) )
            {
            // InternalBmodParser.g:262:2: ( ( rule__Fire__Group__0 ) )
            // InternalBmodParser.g:263:3: ( rule__Fire__Group__0 )
            {
             before(grammarAccess.getFireAccess().getGroup()); 
            // InternalBmodParser.g:264:3: ( rule__Fire__Group__0 )
            // InternalBmodParser.g:264:4: rule__Fire__Group__0
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
    // InternalBmodParser.g:273:1: entryRuleEmergencySign : ruleEmergencySign EOF ;
    public final void entryRuleEmergencySign() throws RecognitionException {
        try {
            // InternalBmodParser.g:274:1: ( ruleEmergencySign EOF )
            // InternalBmodParser.g:275:1: ruleEmergencySign EOF
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
    // InternalBmodParser.g:282:1: ruleEmergencySign : ( ( rule__EmergencySign__Group__0 ) ) ;
    public final void ruleEmergencySign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:286:2: ( ( ( rule__EmergencySign__Group__0 ) ) )
            // InternalBmodParser.g:287:2: ( ( rule__EmergencySign__Group__0 ) )
            {
            // InternalBmodParser.g:287:2: ( ( rule__EmergencySign__Group__0 ) )
            // InternalBmodParser.g:288:3: ( rule__EmergencySign__Group__0 )
            {
             before(grammarAccess.getEmergencySignAccess().getGroup()); 
            // InternalBmodParser.g:289:3: ( rule__EmergencySign__Group__0 )
            // InternalBmodParser.g:289:4: rule__EmergencySign__Group__0
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
    // InternalBmodParser.g:298:1: entryRuleDoorRef : ruleDoorRef EOF ;
    public final void entryRuleDoorRef() throws RecognitionException {
        try {
            // InternalBmodParser.g:299:1: ( ruleDoorRef EOF )
            // InternalBmodParser.g:300:1: ruleDoorRef EOF
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
    // InternalBmodParser.g:307:1: ruleDoorRef : ( ( rule__DoorRef__Group__0 ) ) ;
    public final void ruleDoorRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:311:2: ( ( ( rule__DoorRef__Group__0 ) ) )
            // InternalBmodParser.g:312:2: ( ( rule__DoorRef__Group__0 ) )
            {
            // InternalBmodParser.g:312:2: ( ( rule__DoorRef__Group__0 ) )
            // InternalBmodParser.g:313:3: ( rule__DoorRef__Group__0 )
            {
             before(grammarAccess.getDoorRefAccess().getGroup()); 
            // InternalBmodParser.g:314:3: ( rule__DoorRef__Group__0 )
            // InternalBmodParser.g:314:4: rule__DoorRef__Group__0
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


    // $ANTLR start "entryRuleCoordinate"
    // InternalBmodParser.g:323:1: entryRuleCoordinate : ruleCoordinate EOF ;
    public final void entryRuleCoordinate() throws RecognitionException {
        try {
            // InternalBmodParser.g:324:1: ( ruleCoordinate EOF )
            // InternalBmodParser.g:325:1: ruleCoordinate EOF
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
    // InternalBmodParser.g:332:1: ruleCoordinate : ( ( rule__Coordinate__Group__0 ) ) ;
    public final void ruleCoordinate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:336:2: ( ( ( rule__Coordinate__Group__0 ) ) )
            // InternalBmodParser.g:337:2: ( ( rule__Coordinate__Group__0 ) )
            {
            // InternalBmodParser.g:337:2: ( ( rule__Coordinate__Group__0 ) )
            // InternalBmodParser.g:338:3: ( rule__Coordinate__Group__0 )
            {
             before(grammarAccess.getCoordinateAccess().getGroup()); 
            // InternalBmodParser.g:339:3: ( rule__Coordinate__Group__0 )
            // InternalBmodParser.g:339:4: rule__Coordinate__Group__0
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
    // InternalBmodParser.g:348:1: entryRuleArea : ruleArea EOF ;
    public final void entryRuleArea() throws RecognitionException {
        try {
            // InternalBmodParser.g:349:1: ( ruleArea EOF )
            // InternalBmodParser.g:350:1: ruleArea EOF
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
    // InternalBmodParser.g:357:1: ruleArea : ( ( rule__Area__Group__0 ) ) ;
    public final void ruleArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:361:2: ( ( ( rule__Area__Group__0 ) ) )
            // InternalBmodParser.g:362:2: ( ( rule__Area__Group__0 ) )
            {
            // InternalBmodParser.g:362:2: ( ( rule__Area__Group__0 ) )
            // InternalBmodParser.g:363:3: ( rule__Area__Group__0 )
            {
             before(grammarAccess.getAreaAccess().getGroup()); 
            // InternalBmodParser.g:364:3: ( rule__Area__Group__0 )
            // InternalBmodParser.g:364:4: rule__Area__Group__0
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


    // $ANTLR start "rule__Floorplan__Alternatives_2"
    // InternalBmodParser.g:372:1: rule__Floorplan__Alternatives_2 : ( ( ( rule__Floorplan__RoomsAssignment_2_0 ) ) | ( ( rule__Floorplan__DoorsAssignment_2_1 ) ) | ( ( rule__Floorplan__PersonsAssignment_2_2 ) ) | ( ( rule__Floorplan__ExitsAssignment_2_3 ) ) | ( ( rule__Floorplan__FiresAssignment_2_4 ) ) | ( ( rule__Floorplan__SignsAssignment_2_5 ) ) );
    public final void rule__Floorplan__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:376:1: ( ( ( rule__Floorplan__RoomsAssignment_2_0 ) ) | ( ( rule__Floorplan__DoorsAssignment_2_1 ) ) | ( ( rule__Floorplan__PersonsAssignment_2_2 ) ) | ( ( rule__Floorplan__ExitsAssignment_2_3 ) ) | ( ( rule__Floorplan__FiresAssignment_2_4 ) ) | ( ( rule__Floorplan__SignsAssignment_2_5 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case Room:
                {
                alt1=1;
                }
                break;
            case Door:
                {
                alt1=2;
                }
                break;
            case Person:
                {
                alt1=3;
                }
                break;
            case Exit:
                {
                alt1=4;
                }
                break;
            case Fire:
                {
                alt1=5;
                }
                break;
            case EmergencySign:
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
                    // InternalBmodParser.g:377:2: ( ( rule__Floorplan__RoomsAssignment_2_0 ) )
                    {
                    // InternalBmodParser.g:377:2: ( ( rule__Floorplan__RoomsAssignment_2_0 ) )
                    // InternalBmodParser.g:378:3: ( rule__Floorplan__RoomsAssignment_2_0 )
                    {
                     before(grammarAccess.getFloorplanAccess().getRoomsAssignment_2_0()); 
                    // InternalBmodParser.g:379:3: ( rule__Floorplan__RoomsAssignment_2_0 )
                    // InternalBmodParser.g:379:4: rule__Floorplan__RoomsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__RoomsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getRoomsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBmodParser.g:383:2: ( ( rule__Floorplan__DoorsAssignment_2_1 ) )
                    {
                    // InternalBmodParser.g:383:2: ( ( rule__Floorplan__DoorsAssignment_2_1 ) )
                    // InternalBmodParser.g:384:3: ( rule__Floorplan__DoorsAssignment_2_1 )
                    {
                     before(grammarAccess.getFloorplanAccess().getDoorsAssignment_2_1()); 
                    // InternalBmodParser.g:385:3: ( rule__Floorplan__DoorsAssignment_2_1 )
                    // InternalBmodParser.g:385:4: rule__Floorplan__DoorsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__DoorsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getDoorsAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBmodParser.g:389:2: ( ( rule__Floorplan__PersonsAssignment_2_2 ) )
                    {
                    // InternalBmodParser.g:389:2: ( ( rule__Floorplan__PersonsAssignment_2_2 ) )
                    // InternalBmodParser.g:390:3: ( rule__Floorplan__PersonsAssignment_2_2 )
                    {
                     before(grammarAccess.getFloorplanAccess().getPersonsAssignment_2_2()); 
                    // InternalBmodParser.g:391:3: ( rule__Floorplan__PersonsAssignment_2_2 )
                    // InternalBmodParser.g:391:4: rule__Floorplan__PersonsAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__PersonsAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getPersonsAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBmodParser.g:395:2: ( ( rule__Floorplan__ExitsAssignment_2_3 ) )
                    {
                    // InternalBmodParser.g:395:2: ( ( rule__Floorplan__ExitsAssignment_2_3 ) )
                    // InternalBmodParser.g:396:3: ( rule__Floorplan__ExitsAssignment_2_3 )
                    {
                     before(grammarAccess.getFloorplanAccess().getExitsAssignment_2_3()); 
                    // InternalBmodParser.g:397:3: ( rule__Floorplan__ExitsAssignment_2_3 )
                    // InternalBmodParser.g:397:4: rule__Floorplan__ExitsAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__ExitsAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getExitsAssignment_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBmodParser.g:401:2: ( ( rule__Floorplan__FiresAssignment_2_4 ) )
                    {
                    // InternalBmodParser.g:401:2: ( ( rule__Floorplan__FiresAssignment_2_4 ) )
                    // InternalBmodParser.g:402:3: ( rule__Floorplan__FiresAssignment_2_4 )
                    {
                     before(grammarAccess.getFloorplanAccess().getFiresAssignment_2_4()); 
                    // InternalBmodParser.g:403:3: ( rule__Floorplan__FiresAssignment_2_4 )
                    // InternalBmodParser.g:403:4: rule__Floorplan__FiresAssignment_2_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__FiresAssignment_2_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getFiresAssignment_2_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBmodParser.g:407:2: ( ( rule__Floorplan__SignsAssignment_2_5 ) )
                    {
                    // InternalBmodParser.g:407:2: ( ( rule__Floorplan__SignsAssignment_2_5 ) )
                    // InternalBmodParser.g:408:3: ( rule__Floorplan__SignsAssignment_2_5 )
                    {
                     before(grammarAccess.getFloorplanAccess().getSignsAssignment_2_5()); 
                    // InternalBmodParser.g:409:3: ( rule__Floorplan__SignsAssignment_2_5 )
                    // InternalBmodParser.g:409:4: rule__Floorplan__SignsAssignment_2_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Floorplan__SignsAssignment_2_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloorplanAccess().getSignsAssignment_2_5()); 

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
    // $ANTLR end "rule__Floorplan__Alternatives_2"


    // $ANTLR start "rule__Floorplan__Group__0"
    // InternalBmodParser.g:417:1: rule__Floorplan__Group__0 : rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1 ;
    public final void rule__Floorplan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:421:1: ( rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1 )
            // InternalBmodParser.g:422:2: rule__Floorplan__Group__0__Impl rule__Floorplan__Group__1
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
    // InternalBmodParser.g:429:1: rule__Floorplan__Group__0__Impl : ( () ) ;
    public final void rule__Floorplan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:433:1: ( ( () ) )
            // InternalBmodParser.g:434:1: ( () )
            {
            // InternalBmodParser.g:434:1: ( () )
            // InternalBmodParser.g:435:2: ()
            {
             before(grammarAccess.getFloorplanAccess().getFloorplanAction_0()); 
            // InternalBmodParser.g:436:2: ()
            // InternalBmodParser.g:436:3: 
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
    // InternalBmodParser.g:444:1: rule__Floorplan__Group__1 : rule__Floorplan__Group__1__Impl rule__Floorplan__Group__2 ;
    public final void rule__Floorplan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:448:1: ( rule__Floorplan__Group__1__Impl rule__Floorplan__Group__2 )
            // InternalBmodParser.g:449:2: rule__Floorplan__Group__1__Impl rule__Floorplan__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Floorplan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floorplan__Group__2();

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
    // InternalBmodParser.g:456:1: rule__Floorplan__Group__1__Impl : ( ( rule__Floorplan__ImportsAssignment_1 )* ) ;
    public final void rule__Floorplan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:460:1: ( ( ( rule__Floorplan__ImportsAssignment_1 )* ) )
            // InternalBmodParser.g:461:1: ( ( rule__Floorplan__ImportsAssignment_1 )* )
            {
            // InternalBmodParser.g:461:1: ( ( rule__Floorplan__ImportsAssignment_1 )* )
            // InternalBmodParser.g:462:2: ( rule__Floorplan__ImportsAssignment_1 )*
            {
             before(grammarAccess.getFloorplanAccess().getImportsAssignment_1()); 
            // InternalBmodParser.g:463:2: ( rule__Floorplan__ImportsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Import) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBmodParser.g:463:3: rule__Floorplan__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Floorplan__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getFloorplanAccess().getImportsAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Floorplan__Group__2"
    // InternalBmodParser.g:471:1: rule__Floorplan__Group__2 : rule__Floorplan__Group__2__Impl ;
    public final void rule__Floorplan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:475:1: ( rule__Floorplan__Group__2__Impl )
            // InternalBmodParser.g:476:2: rule__Floorplan__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Floorplan__Group__2__Impl();

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
    // $ANTLR end "rule__Floorplan__Group__2"


    // $ANTLR start "rule__Floorplan__Group__2__Impl"
    // InternalBmodParser.g:482:1: rule__Floorplan__Group__2__Impl : ( ( rule__Floorplan__Alternatives_2 )* ) ;
    public final void rule__Floorplan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:486:1: ( ( ( rule__Floorplan__Alternatives_2 )* ) )
            // InternalBmodParser.g:487:1: ( ( rule__Floorplan__Alternatives_2 )* )
            {
            // InternalBmodParser.g:487:1: ( ( rule__Floorplan__Alternatives_2 )* )
            // InternalBmodParser.g:488:2: ( rule__Floorplan__Alternatives_2 )*
            {
             before(grammarAccess.getFloorplanAccess().getAlternatives_2()); 
            // InternalBmodParser.g:489:2: ( rule__Floorplan__Alternatives_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==EmergencySign||LA3_0==Person||(LA3_0>=Door && LA3_0<=Room)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBmodParser.g:489:3: rule__Floorplan__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Floorplan__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFloorplanAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floorplan__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalBmodParser.g:498:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:502:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalBmodParser.g:503:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalBmodParser.g:510:1: rule__Import__Group__0__Impl : ( Import ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:514:1: ( ( Import ) )
            // InternalBmodParser.g:515:1: ( Import )
            {
            // InternalBmodParser.g:515:1: ( Import )
            // InternalBmodParser.g:516:2: Import
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,Import,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalBmodParser.g:525:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:529:1: ( rule__Import__Group__1__Impl )
            // InternalBmodParser.g:530:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalBmodParser.g:536:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:540:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalBmodParser.g:541:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalBmodParser.g:541:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalBmodParser.g:542:2: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalBmodParser.g:543:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalBmodParser.g:543:3: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalBmodParser.g:552:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:556:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalBmodParser.g:557:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBmodParser.g:564:1: rule__Room__Group__0__Impl : ( Room ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:568:1: ( ( Room ) )
            // InternalBmodParser.g:569:1: ( Room )
            {
            // InternalBmodParser.g:569:1: ( Room )
            // InternalBmodParser.g:570:2: Room
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_0()); 
            match(input,Room,FOLLOW_2); 
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
    // InternalBmodParser.g:579:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:583:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalBmodParser.g:584:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalBmodParser.g:591:1: rule__Room__Group__1__Impl : ( ( rule__Room__NameAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:595:1: ( ( ( rule__Room__NameAssignment_1 ) ) )
            // InternalBmodParser.g:596:1: ( ( rule__Room__NameAssignment_1 ) )
            {
            // InternalBmodParser.g:596:1: ( ( rule__Room__NameAssignment_1 ) )
            // InternalBmodParser.g:597:2: ( rule__Room__NameAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_1()); 
            // InternalBmodParser.g:598:2: ( rule__Room__NameAssignment_1 )
            // InternalBmodParser.g:598:3: rule__Room__NameAssignment_1
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
    // InternalBmodParser.g:606:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:610:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalBmodParser.g:611:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalBmodParser.g:618:1: rule__Room__Group__2__Impl : ( ( rule__Room__Group_2__0 )? ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:622:1: ( ( ( rule__Room__Group_2__0 )? ) )
            // InternalBmodParser.g:623:1: ( ( rule__Room__Group_2__0 )? )
            {
            // InternalBmodParser.g:623:1: ( ( rule__Room__Group_2__0 )? )
            // InternalBmodParser.g:624:2: ( rule__Room__Group_2__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_2()); 
            // InternalBmodParser.g:625:2: ( rule__Room__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LeftSquareBracket) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBmodParser.g:625:3: rule__Room__Group_2__0
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
    // InternalBmodParser.g:633:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:637:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalBmodParser.g:638:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalBmodParser.g:645:1: rule__Room__Group__3__Impl : ( ( rule__Room__AreasAssignment_3 ) ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:649:1: ( ( ( rule__Room__AreasAssignment_3 ) ) )
            // InternalBmodParser.g:650:1: ( ( rule__Room__AreasAssignment_3 ) )
            {
            // InternalBmodParser.g:650:1: ( ( rule__Room__AreasAssignment_3 ) )
            // InternalBmodParser.g:651:2: ( rule__Room__AreasAssignment_3 )
            {
             before(grammarAccess.getRoomAccess().getAreasAssignment_3()); 
            // InternalBmodParser.g:652:2: ( rule__Room__AreasAssignment_3 )
            // InternalBmodParser.g:652:3: rule__Room__AreasAssignment_3
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
    // InternalBmodParser.g:660:1: rule__Room__Group__4 : rule__Room__Group__4__Impl ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:664:1: ( rule__Room__Group__4__Impl )
            // InternalBmodParser.g:665:2: rule__Room__Group__4__Impl
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
    // InternalBmodParser.g:671:1: rule__Room__Group__4__Impl : ( ( rule__Room__Group_4__0 )* ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:675:1: ( ( ( rule__Room__Group_4__0 )* ) )
            // InternalBmodParser.g:676:1: ( ( rule__Room__Group_4__0 )* )
            {
            // InternalBmodParser.g:676:1: ( ( rule__Room__Group_4__0 )* )
            // InternalBmodParser.g:677:2: ( rule__Room__Group_4__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_4()); 
            // InternalBmodParser.g:678:2: ( rule__Room__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==And) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBmodParser.g:678:3: rule__Room__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Room__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalBmodParser.g:687:1: rule__Room__Group_2__0 : rule__Room__Group_2__0__Impl rule__Room__Group_2__1 ;
    public final void rule__Room__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:691:1: ( rule__Room__Group_2__0__Impl rule__Room__Group_2__1 )
            // InternalBmodParser.g:692:2: rule__Room__Group_2__0__Impl rule__Room__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBmodParser.g:699:1: rule__Room__Group_2__0__Impl : ( ( rule__Room__HasCapacityAssignment_2_0 ) ) ;
    public final void rule__Room__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:703:1: ( ( ( rule__Room__HasCapacityAssignment_2_0 ) ) )
            // InternalBmodParser.g:704:1: ( ( rule__Room__HasCapacityAssignment_2_0 ) )
            {
            // InternalBmodParser.g:704:1: ( ( rule__Room__HasCapacityAssignment_2_0 ) )
            // InternalBmodParser.g:705:2: ( rule__Room__HasCapacityAssignment_2_0 )
            {
             before(grammarAccess.getRoomAccess().getHasCapacityAssignment_2_0()); 
            // InternalBmodParser.g:706:2: ( rule__Room__HasCapacityAssignment_2_0 )
            // InternalBmodParser.g:706:3: rule__Room__HasCapacityAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Room__HasCapacityAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getHasCapacityAssignment_2_0()); 

            }


            }

        }
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
    // InternalBmodParser.g:714:1: rule__Room__Group_2__1 : rule__Room__Group_2__1__Impl rule__Room__Group_2__2 ;
    public final void rule__Room__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:718:1: ( rule__Room__Group_2__1__Impl rule__Room__Group_2__2 )
            // InternalBmodParser.g:719:2: rule__Room__Group_2__1__Impl rule__Room__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__Room__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_2__2();

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
    // InternalBmodParser.g:726:1: rule__Room__Group_2__1__Impl : ( ( rule__Room__CapacityAssignment_2_1 ) ) ;
    public final void rule__Room__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:730:1: ( ( ( rule__Room__CapacityAssignment_2_1 ) ) )
            // InternalBmodParser.g:731:1: ( ( rule__Room__CapacityAssignment_2_1 ) )
            {
            // InternalBmodParser.g:731:1: ( ( rule__Room__CapacityAssignment_2_1 ) )
            // InternalBmodParser.g:732:2: ( rule__Room__CapacityAssignment_2_1 )
            {
             before(grammarAccess.getRoomAccess().getCapacityAssignment_2_1()); 
            // InternalBmodParser.g:733:2: ( rule__Room__CapacityAssignment_2_1 )
            // InternalBmodParser.g:733:3: rule__Room__CapacityAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__CapacityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getCapacityAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Room__Group_2__2"
    // InternalBmodParser.g:741:1: rule__Room__Group_2__2 : rule__Room__Group_2__2__Impl ;
    public final void rule__Room__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:745:1: ( rule__Room__Group_2__2__Impl )
            // InternalBmodParser.g:746:2: rule__Room__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_2__2__Impl();

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
    // $ANTLR end "rule__Room__Group_2__2"


    // $ANTLR start "rule__Room__Group_2__2__Impl"
    // InternalBmodParser.g:752:1: rule__Room__Group_2__2__Impl : ( RightSquareBracket ) ;
    public final void rule__Room__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:756:1: ( ( RightSquareBracket ) )
            // InternalBmodParser.g:757:1: ( RightSquareBracket )
            {
            // InternalBmodParser.g:757:1: ( RightSquareBracket )
            // InternalBmodParser.g:758:2: RightSquareBracket
            {
             before(grammarAccess.getRoomAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_2__2__Impl"


    // $ANTLR start "rule__Room__Group_4__0"
    // InternalBmodParser.g:768:1: rule__Room__Group_4__0 : rule__Room__Group_4__0__Impl rule__Room__Group_4__1 ;
    public final void rule__Room__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:772:1: ( rule__Room__Group_4__0__Impl rule__Room__Group_4__1 )
            // InternalBmodParser.g:773:2: rule__Room__Group_4__0__Impl rule__Room__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBmodParser.g:780:1: rule__Room__Group_4__0__Impl : ( And ) ;
    public final void rule__Room__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:784:1: ( ( And ) )
            // InternalBmodParser.g:785:1: ( And )
            {
            // InternalBmodParser.g:785:1: ( And )
            // InternalBmodParser.g:786:2: And
            {
             before(grammarAccess.getRoomAccess().getAndKeyword_4_0()); 
            match(input,And,FOLLOW_2); 
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
    // InternalBmodParser.g:795:1: rule__Room__Group_4__1 : rule__Room__Group_4__1__Impl ;
    public final void rule__Room__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:799:1: ( rule__Room__Group_4__1__Impl )
            // InternalBmodParser.g:800:2: rule__Room__Group_4__1__Impl
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
    // InternalBmodParser.g:806:1: rule__Room__Group_4__1__Impl : ( ( rule__Room__AreasAssignment_4_1 ) ) ;
    public final void rule__Room__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:810:1: ( ( ( rule__Room__AreasAssignment_4_1 ) ) )
            // InternalBmodParser.g:811:1: ( ( rule__Room__AreasAssignment_4_1 ) )
            {
            // InternalBmodParser.g:811:1: ( ( rule__Room__AreasAssignment_4_1 ) )
            // InternalBmodParser.g:812:2: ( rule__Room__AreasAssignment_4_1 )
            {
             before(grammarAccess.getRoomAccess().getAreasAssignment_4_1()); 
            // InternalBmodParser.g:813:2: ( rule__Room__AreasAssignment_4_1 )
            // InternalBmodParser.g:813:3: rule__Room__AreasAssignment_4_1
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
    // InternalBmodParser.g:822:1: rule__Door__Group__0 : rule__Door__Group__0__Impl rule__Door__Group__1 ;
    public final void rule__Door__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:826:1: ( rule__Door__Group__0__Impl rule__Door__Group__1 )
            // InternalBmodParser.g:827:2: rule__Door__Group__0__Impl rule__Door__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBmodParser.g:834:1: rule__Door__Group__0__Impl : ( Door ) ;
    public final void rule__Door__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:838:1: ( ( Door ) )
            // InternalBmodParser.g:839:1: ( Door )
            {
            // InternalBmodParser.g:839:1: ( Door )
            // InternalBmodParser.g:840:2: Door
            {
             before(grammarAccess.getDoorAccess().getDoorKeyword_0()); 
            match(input,Door,FOLLOW_2); 
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
    // InternalBmodParser.g:849:1: rule__Door__Group__1 : rule__Door__Group__1__Impl rule__Door__Group__2 ;
    public final void rule__Door__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:853:1: ( rule__Door__Group__1__Impl rule__Door__Group__2 )
            // InternalBmodParser.g:854:2: rule__Door__Group__1__Impl rule__Door__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalBmodParser.g:861:1: rule__Door__Group__1__Impl : ( ( rule__Door__NameAssignment_1 ) ) ;
    public final void rule__Door__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:865:1: ( ( ( rule__Door__NameAssignment_1 ) ) )
            // InternalBmodParser.g:866:1: ( ( rule__Door__NameAssignment_1 ) )
            {
            // InternalBmodParser.g:866:1: ( ( rule__Door__NameAssignment_1 ) )
            // InternalBmodParser.g:867:2: ( rule__Door__NameAssignment_1 )
            {
             before(grammarAccess.getDoorAccess().getNameAssignment_1()); 
            // InternalBmodParser.g:868:2: ( rule__Door__NameAssignment_1 )
            // InternalBmodParser.g:868:3: rule__Door__NameAssignment_1
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
    // InternalBmodParser.g:876:1: rule__Door__Group__2 : rule__Door__Group__2__Impl rule__Door__Group__3 ;
    public final void rule__Door__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:880:1: ( rule__Door__Group__2__Impl rule__Door__Group__3 )
            // InternalBmodParser.g:881:2: rule__Door__Group__2__Impl rule__Door__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalBmodParser.g:888:1: rule__Door__Group__2__Impl : ( From ) ;
    public final void rule__Door__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:892:1: ( ( From ) )
            // InternalBmodParser.g:893:1: ( From )
            {
            // InternalBmodParser.g:893:1: ( From )
            // InternalBmodParser.g:894:2: From
            {
             before(grammarAccess.getDoorAccess().getFromKeyword_2()); 
            match(input,From,FOLLOW_2); 
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
    // InternalBmodParser.g:903:1: rule__Door__Group__3 : rule__Door__Group__3__Impl rule__Door__Group__4 ;
    public final void rule__Door__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:907:1: ( rule__Door__Group__3__Impl rule__Door__Group__4 )
            // InternalBmodParser.g:908:2: rule__Door__Group__3__Impl rule__Door__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalBmodParser.g:915:1: rule__Door__Group__3__Impl : ( ( rule__Door__FromAssignment_3 ) ) ;
    public final void rule__Door__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:919:1: ( ( ( rule__Door__FromAssignment_3 ) ) )
            // InternalBmodParser.g:920:1: ( ( rule__Door__FromAssignment_3 ) )
            {
            // InternalBmodParser.g:920:1: ( ( rule__Door__FromAssignment_3 ) )
            // InternalBmodParser.g:921:2: ( rule__Door__FromAssignment_3 )
            {
             before(grammarAccess.getDoorAccess().getFromAssignment_3()); 
            // InternalBmodParser.g:922:2: ( rule__Door__FromAssignment_3 )
            // InternalBmodParser.g:922:3: rule__Door__FromAssignment_3
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
    // InternalBmodParser.g:930:1: rule__Door__Group__4 : rule__Door__Group__4__Impl rule__Door__Group__5 ;
    public final void rule__Door__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:934:1: ( rule__Door__Group__4__Impl rule__Door__Group__5 )
            // InternalBmodParser.g:935:2: rule__Door__Group__4__Impl rule__Door__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalBmodParser.g:942:1: rule__Door__Group__4__Impl : ( To ) ;
    public final void rule__Door__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:946:1: ( ( To ) )
            // InternalBmodParser.g:947:1: ( To )
            {
            // InternalBmodParser.g:947:1: ( To )
            // InternalBmodParser.g:948:2: To
            {
             before(grammarAccess.getDoorAccess().getToKeyword_4()); 
            match(input,To,FOLLOW_2); 
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
    // InternalBmodParser.g:957:1: rule__Door__Group__5 : rule__Door__Group__5__Impl ;
    public final void rule__Door__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:961:1: ( rule__Door__Group__5__Impl )
            // InternalBmodParser.g:962:2: rule__Door__Group__5__Impl
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
    // InternalBmodParser.g:968:1: rule__Door__Group__5__Impl : ( ( rule__Door__ToAssignment_5 ) ) ;
    public final void rule__Door__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:972:1: ( ( ( rule__Door__ToAssignment_5 ) ) )
            // InternalBmodParser.g:973:1: ( ( rule__Door__ToAssignment_5 ) )
            {
            // InternalBmodParser.g:973:1: ( ( rule__Door__ToAssignment_5 ) )
            // InternalBmodParser.g:974:2: ( rule__Door__ToAssignment_5 )
            {
             before(grammarAccess.getDoorAccess().getToAssignment_5()); 
            // InternalBmodParser.g:975:2: ( rule__Door__ToAssignment_5 )
            // InternalBmodParser.g:975:3: rule__Door__ToAssignment_5
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
    // InternalBmodParser.g:984:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:988:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalBmodParser.g:989:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBmodParser.g:996:1: rule__Person__Group__0__Impl : ( Person ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1000:1: ( ( Person ) )
            // InternalBmodParser.g:1001:1: ( Person )
            {
            // InternalBmodParser.g:1001:1: ( Person )
            // InternalBmodParser.g:1002:2: Person
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,Person,FOLLOW_2); 
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
    // InternalBmodParser.g:1011:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1015:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalBmodParser.g:1016:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalBmodParser.g:1023:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1027:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalBmodParser.g:1028:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalBmodParser.g:1028:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalBmodParser.g:1029:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalBmodParser.g:1030:2: ( rule__Person__NameAssignment_1 )
            // InternalBmodParser.g:1030:3: rule__Person__NameAssignment_1
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
    // InternalBmodParser.g:1038:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1042:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalBmodParser.g:1043:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalBmodParser.g:1050:1: rule__Person__Group__2__Impl : ( In ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1054:1: ( ( In ) )
            // InternalBmodParser.g:1055:1: ( In )
            {
            // InternalBmodParser.g:1055:1: ( In )
            // InternalBmodParser.g:1056:2: In
            {
             before(grammarAccess.getPersonAccess().getInKeyword_2()); 
            match(input,In,FOLLOW_2); 
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
    // InternalBmodParser.g:1065:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1069:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalBmodParser.g:1070:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalBmodParser.g:1077:1: rule__Person__Group__3__Impl : ( ( rule__Person__LocationAssignment_3 ) ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1081:1: ( ( ( rule__Person__LocationAssignment_3 ) ) )
            // InternalBmodParser.g:1082:1: ( ( rule__Person__LocationAssignment_3 ) )
            {
            // InternalBmodParser.g:1082:1: ( ( rule__Person__LocationAssignment_3 ) )
            // InternalBmodParser.g:1083:2: ( rule__Person__LocationAssignment_3 )
            {
             before(grammarAccess.getPersonAccess().getLocationAssignment_3()); 
            // InternalBmodParser.g:1084:2: ( rule__Person__LocationAssignment_3 )
            // InternalBmodParser.g:1084:3: rule__Person__LocationAssignment_3
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
    // InternalBmodParser.g:1092:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1096:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalBmodParser.g:1097:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalBmodParser.g:1104:1: rule__Person__Group__4__Impl : ( Colon ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1108:1: ( ( Colon ) )
            // InternalBmodParser.g:1109:1: ( Colon )
            {
            // InternalBmodParser.g:1109:1: ( Colon )
            // InternalBmodParser.g:1110:2: Colon
            {
             before(grammarAccess.getPersonAccess().getColonKeyword_4()); 
            match(input,Colon,FOLLOW_2); 
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
    // InternalBmodParser.g:1119:1: rule__Person__Group__5 : rule__Person__Group__5__Impl ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1123:1: ( rule__Person__Group__5__Impl )
            // InternalBmodParser.g:1124:2: rule__Person__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__5__Impl();

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
    // InternalBmodParser.g:1130:1: rule__Person__Group__5__Impl : ( ( rule__Person__ActionAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1134:1: ( ( ( rule__Person__ActionAssignment_5 ) ) )
            // InternalBmodParser.g:1135:1: ( ( rule__Person__ActionAssignment_5 ) )
            {
            // InternalBmodParser.g:1135:1: ( ( rule__Person__ActionAssignment_5 ) )
            // InternalBmodParser.g:1136:2: ( rule__Person__ActionAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getActionAssignment_5()); 
            // InternalBmodParser.g:1137:2: ( rule__Person__ActionAssignment_5 )
            // InternalBmodParser.g:1137:3: rule__Person__ActionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Person__ActionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getActionAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Exit__Group__0"
    // InternalBmodParser.g:1146:1: rule__Exit__Group__0 : rule__Exit__Group__0__Impl rule__Exit__Group__1 ;
    public final void rule__Exit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1150:1: ( rule__Exit__Group__0__Impl rule__Exit__Group__1 )
            // InternalBmodParser.g:1151:2: rule__Exit__Group__0__Impl rule__Exit__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBmodParser.g:1158:1: rule__Exit__Group__0__Impl : ( Exit ) ;
    public final void rule__Exit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1162:1: ( ( Exit ) )
            // InternalBmodParser.g:1163:1: ( Exit )
            {
            // InternalBmodParser.g:1163:1: ( Exit )
            // InternalBmodParser.g:1164:2: Exit
            {
             before(grammarAccess.getExitAccess().getExitKeyword_0()); 
            match(input,Exit,FOLLOW_2); 
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
    // InternalBmodParser.g:1173:1: rule__Exit__Group__1 : rule__Exit__Group__1__Impl rule__Exit__Group__2 ;
    public final void rule__Exit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1177:1: ( rule__Exit__Group__1__Impl rule__Exit__Group__2 )
            // InternalBmodParser.g:1178:2: rule__Exit__Group__1__Impl rule__Exit__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalBmodParser.g:1185:1: rule__Exit__Group__1__Impl : ( In ) ;
    public final void rule__Exit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1189:1: ( ( In ) )
            // InternalBmodParser.g:1190:1: ( In )
            {
            // InternalBmodParser.g:1190:1: ( In )
            // InternalBmodParser.g:1191:2: In
            {
             before(grammarAccess.getExitAccess().getInKeyword_1()); 
            match(input,In,FOLLOW_2); 
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
    // InternalBmodParser.g:1200:1: rule__Exit__Group__2 : rule__Exit__Group__2__Impl ;
    public final void rule__Exit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1204:1: ( rule__Exit__Group__2__Impl )
            // InternalBmodParser.g:1205:2: rule__Exit__Group__2__Impl
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
    // InternalBmodParser.g:1211:1: rule__Exit__Group__2__Impl : ( ( rule__Exit__LocationAssignment_2 ) ) ;
    public final void rule__Exit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1215:1: ( ( ( rule__Exit__LocationAssignment_2 ) ) )
            // InternalBmodParser.g:1216:1: ( ( rule__Exit__LocationAssignment_2 ) )
            {
            // InternalBmodParser.g:1216:1: ( ( rule__Exit__LocationAssignment_2 ) )
            // InternalBmodParser.g:1217:2: ( rule__Exit__LocationAssignment_2 )
            {
             before(grammarAccess.getExitAccess().getLocationAssignment_2()); 
            // InternalBmodParser.g:1218:2: ( rule__Exit__LocationAssignment_2 )
            // InternalBmodParser.g:1218:3: rule__Exit__LocationAssignment_2
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
    // InternalBmodParser.g:1227:1: rule__Fire__Group__0 : rule__Fire__Group__0__Impl rule__Fire__Group__1 ;
    public final void rule__Fire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1231:1: ( rule__Fire__Group__0__Impl rule__Fire__Group__1 )
            // InternalBmodParser.g:1232:2: rule__Fire__Group__0__Impl rule__Fire__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBmodParser.g:1239:1: rule__Fire__Group__0__Impl : ( Fire ) ;
    public final void rule__Fire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1243:1: ( ( Fire ) )
            // InternalBmodParser.g:1244:1: ( Fire )
            {
            // InternalBmodParser.g:1244:1: ( Fire )
            // InternalBmodParser.g:1245:2: Fire
            {
             before(grammarAccess.getFireAccess().getFireKeyword_0()); 
            match(input,Fire,FOLLOW_2); 
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
    // InternalBmodParser.g:1254:1: rule__Fire__Group__1 : rule__Fire__Group__1__Impl rule__Fire__Group__2 ;
    public final void rule__Fire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1258:1: ( rule__Fire__Group__1__Impl rule__Fire__Group__2 )
            // InternalBmodParser.g:1259:2: rule__Fire__Group__1__Impl rule__Fire__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalBmodParser.g:1266:1: rule__Fire__Group__1__Impl : ( In ) ;
    public final void rule__Fire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1270:1: ( ( In ) )
            // InternalBmodParser.g:1271:1: ( In )
            {
            // InternalBmodParser.g:1271:1: ( In )
            // InternalBmodParser.g:1272:2: In
            {
             before(grammarAccess.getFireAccess().getInKeyword_1()); 
            match(input,In,FOLLOW_2); 
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
    // InternalBmodParser.g:1281:1: rule__Fire__Group__2 : rule__Fire__Group__2__Impl ;
    public final void rule__Fire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1285:1: ( rule__Fire__Group__2__Impl )
            // InternalBmodParser.g:1286:2: rule__Fire__Group__2__Impl
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
    // InternalBmodParser.g:1292:1: rule__Fire__Group__2__Impl : ( ( rule__Fire__LocationAssignment_2 ) ) ;
    public final void rule__Fire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1296:1: ( ( ( rule__Fire__LocationAssignment_2 ) ) )
            // InternalBmodParser.g:1297:1: ( ( rule__Fire__LocationAssignment_2 ) )
            {
            // InternalBmodParser.g:1297:1: ( ( rule__Fire__LocationAssignment_2 ) )
            // InternalBmodParser.g:1298:2: ( rule__Fire__LocationAssignment_2 )
            {
             before(grammarAccess.getFireAccess().getLocationAssignment_2()); 
            // InternalBmodParser.g:1299:2: ( rule__Fire__LocationAssignment_2 )
            // InternalBmodParser.g:1299:3: rule__Fire__LocationAssignment_2
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
    // InternalBmodParser.g:1308:1: rule__EmergencySign__Group__0 : rule__EmergencySign__Group__0__Impl rule__EmergencySign__Group__1 ;
    public final void rule__EmergencySign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1312:1: ( rule__EmergencySign__Group__0__Impl rule__EmergencySign__Group__1 )
            // InternalBmodParser.g:1313:2: rule__EmergencySign__Group__0__Impl rule__EmergencySign__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalBmodParser.g:1320:1: rule__EmergencySign__Group__0__Impl : ( EmergencySign ) ;
    public final void rule__EmergencySign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1324:1: ( ( EmergencySign ) )
            // InternalBmodParser.g:1325:1: ( EmergencySign )
            {
            // InternalBmodParser.g:1325:1: ( EmergencySign )
            // InternalBmodParser.g:1326:2: EmergencySign
            {
             before(grammarAccess.getEmergencySignAccess().getEmergencySignKeyword_0()); 
            match(input,EmergencySign,FOLLOW_2); 
             after(grammarAccess.getEmergencySignAccess().getEmergencySignKeyword_0()); 

            }


            }

        }
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
    // InternalBmodParser.g:1335:1: rule__EmergencySign__Group__1 : rule__EmergencySign__Group__1__Impl rule__EmergencySign__Group__2 ;
    public final void rule__EmergencySign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1339:1: ( rule__EmergencySign__Group__1__Impl rule__EmergencySign__Group__2 )
            // InternalBmodParser.g:1340:2: rule__EmergencySign__Group__1__Impl rule__EmergencySign__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalBmodParser.g:1347:1: rule__EmergencySign__Group__1__Impl : ( From ) ;
    public final void rule__EmergencySign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1351:1: ( ( From ) )
            // InternalBmodParser.g:1352:1: ( From )
            {
            // InternalBmodParser.g:1352:1: ( From )
            // InternalBmodParser.g:1353:2: From
            {
             before(grammarAccess.getEmergencySignAccess().getFromKeyword_1()); 
            match(input,From,FOLLOW_2); 
             after(grammarAccess.getEmergencySignAccess().getFromKeyword_1()); 

            }


            }

        }
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
    // InternalBmodParser.g:1362:1: rule__EmergencySign__Group__2 : rule__EmergencySign__Group__2__Impl rule__EmergencySign__Group__3 ;
    public final void rule__EmergencySign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1366:1: ( rule__EmergencySign__Group__2__Impl rule__EmergencySign__Group__3 )
            // InternalBmodParser.g:1367:2: rule__EmergencySign__Group__2__Impl rule__EmergencySign__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalBmodParser.g:1374:1: rule__EmergencySign__Group__2__Impl : ( ( rule__EmergencySign__FromAssignment_2 ) ) ;
    public final void rule__EmergencySign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1378:1: ( ( ( rule__EmergencySign__FromAssignment_2 ) ) )
            // InternalBmodParser.g:1379:1: ( ( rule__EmergencySign__FromAssignment_2 ) )
            {
            // InternalBmodParser.g:1379:1: ( ( rule__EmergencySign__FromAssignment_2 ) )
            // InternalBmodParser.g:1380:2: ( rule__EmergencySign__FromAssignment_2 )
            {
             before(grammarAccess.getEmergencySignAccess().getFromAssignment_2()); 
            // InternalBmodParser.g:1381:2: ( rule__EmergencySign__FromAssignment_2 )
            // InternalBmodParser.g:1381:3: rule__EmergencySign__FromAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EmergencySign__FromAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmergencySignAccess().getFromAssignment_2()); 

            }


            }

        }
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
    // InternalBmodParser.g:1389:1: rule__EmergencySign__Group__3 : rule__EmergencySign__Group__3__Impl ;
    public final void rule__EmergencySign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1393:1: ( rule__EmergencySign__Group__3__Impl )
            // InternalBmodParser.g:1394:2: rule__EmergencySign__Group__3__Impl
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
    // InternalBmodParser.g:1400:1: rule__EmergencySign__Group__3__Impl : ( ( rule__EmergencySign__RefAssignment_3 ) ) ;
    public final void rule__EmergencySign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1404:1: ( ( ( rule__EmergencySign__RefAssignment_3 ) ) )
            // InternalBmodParser.g:1405:1: ( ( rule__EmergencySign__RefAssignment_3 ) )
            {
            // InternalBmodParser.g:1405:1: ( ( rule__EmergencySign__RefAssignment_3 ) )
            // InternalBmodParser.g:1406:2: ( rule__EmergencySign__RefAssignment_3 )
            {
             before(grammarAccess.getEmergencySignAccess().getRefAssignment_3()); 
            // InternalBmodParser.g:1407:2: ( rule__EmergencySign__RefAssignment_3 )
            // InternalBmodParser.g:1407:3: rule__EmergencySign__RefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EmergencySign__RefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEmergencySignAccess().getRefAssignment_3()); 

            }


            }

        }
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
    // InternalBmodParser.g:1416:1: rule__DoorRef__Group__0 : rule__DoorRef__Group__0__Impl rule__DoorRef__Group__1 ;
    public final void rule__DoorRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1420:1: ( rule__DoorRef__Group__0__Impl rule__DoorRef__Group__1 )
            // InternalBmodParser.g:1421:2: rule__DoorRef__Group__0__Impl rule__DoorRef__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBmodParser.g:1428:1: rule__DoorRef__Group__0__Impl : ( To ) ;
    public final void rule__DoorRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1432:1: ( ( To ) )
            // InternalBmodParser.g:1433:1: ( To )
            {
            // InternalBmodParser.g:1433:1: ( To )
            // InternalBmodParser.g:1434:2: To
            {
             before(grammarAccess.getDoorRefAccess().getToKeyword_0()); 
            match(input,To,FOLLOW_2); 
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
    // InternalBmodParser.g:1443:1: rule__DoorRef__Group__1 : rule__DoorRef__Group__1__Impl ;
    public final void rule__DoorRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1447:1: ( rule__DoorRef__Group__1__Impl )
            // InternalBmodParser.g:1448:2: rule__DoorRef__Group__1__Impl
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
    // InternalBmodParser.g:1454:1: rule__DoorRef__Group__1__Impl : ( ( rule__DoorRef__ToAssignment_1 ) ) ;
    public final void rule__DoorRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1458:1: ( ( ( rule__DoorRef__ToAssignment_1 ) ) )
            // InternalBmodParser.g:1459:1: ( ( rule__DoorRef__ToAssignment_1 ) )
            {
            // InternalBmodParser.g:1459:1: ( ( rule__DoorRef__ToAssignment_1 ) )
            // InternalBmodParser.g:1460:2: ( rule__DoorRef__ToAssignment_1 )
            {
             before(grammarAccess.getDoorRefAccess().getToAssignment_1()); 
            // InternalBmodParser.g:1461:2: ( rule__DoorRef__ToAssignment_1 )
            // InternalBmodParser.g:1461:3: rule__DoorRef__ToAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DoorRef__ToAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoorRefAccess().getToAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Coordinate__Group__0"
    // InternalBmodParser.g:1470:1: rule__Coordinate__Group__0 : rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 ;
    public final void rule__Coordinate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1474:1: ( rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 )
            // InternalBmodParser.g:1475:2: rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBmodParser.g:1482:1: rule__Coordinate__Group__0__Impl : ( LeftParenthesis ) ;
    public final void rule__Coordinate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1486:1: ( ( LeftParenthesis ) )
            // InternalBmodParser.g:1487:1: ( LeftParenthesis )
            {
            // InternalBmodParser.g:1487:1: ( LeftParenthesis )
            // InternalBmodParser.g:1488:2: LeftParenthesis
            {
             before(grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
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
    // InternalBmodParser.g:1497:1: rule__Coordinate__Group__1 : rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2 ;
    public final void rule__Coordinate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1501:1: ( rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2 )
            // InternalBmodParser.g:1502:2: rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalBmodParser.g:1509:1: rule__Coordinate__Group__1__Impl : ( ( rule__Coordinate__XAssignment_1 ) ) ;
    public final void rule__Coordinate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1513:1: ( ( ( rule__Coordinate__XAssignment_1 ) ) )
            // InternalBmodParser.g:1514:1: ( ( rule__Coordinate__XAssignment_1 ) )
            {
            // InternalBmodParser.g:1514:1: ( ( rule__Coordinate__XAssignment_1 ) )
            // InternalBmodParser.g:1515:2: ( rule__Coordinate__XAssignment_1 )
            {
             before(grammarAccess.getCoordinateAccess().getXAssignment_1()); 
            // InternalBmodParser.g:1516:2: ( rule__Coordinate__XAssignment_1 )
            // InternalBmodParser.g:1516:3: rule__Coordinate__XAssignment_1
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
    // InternalBmodParser.g:1524:1: rule__Coordinate__Group__2 : rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3 ;
    public final void rule__Coordinate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1528:1: ( rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3 )
            // InternalBmodParser.g:1529:2: rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBmodParser.g:1536:1: rule__Coordinate__Group__2__Impl : ( Comma ) ;
    public final void rule__Coordinate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1540:1: ( ( Comma ) )
            // InternalBmodParser.g:1541:1: ( Comma )
            {
            // InternalBmodParser.g:1541:1: ( Comma )
            // InternalBmodParser.g:1542:2: Comma
            {
             before(grammarAccess.getCoordinateAccess().getCommaKeyword_2()); 
            match(input,Comma,FOLLOW_2); 
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
    // InternalBmodParser.g:1551:1: rule__Coordinate__Group__3 : rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4 ;
    public final void rule__Coordinate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1555:1: ( rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4 )
            // InternalBmodParser.g:1556:2: rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalBmodParser.g:1563:1: rule__Coordinate__Group__3__Impl : ( ( rule__Coordinate__YAssignment_3 ) ) ;
    public final void rule__Coordinate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1567:1: ( ( ( rule__Coordinate__YAssignment_3 ) ) )
            // InternalBmodParser.g:1568:1: ( ( rule__Coordinate__YAssignment_3 ) )
            {
            // InternalBmodParser.g:1568:1: ( ( rule__Coordinate__YAssignment_3 ) )
            // InternalBmodParser.g:1569:2: ( rule__Coordinate__YAssignment_3 )
            {
             before(grammarAccess.getCoordinateAccess().getYAssignment_3()); 
            // InternalBmodParser.g:1570:2: ( rule__Coordinate__YAssignment_3 )
            // InternalBmodParser.g:1570:3: rule__Coordinate__YAssignment_3
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
    // InternalBmodParser.g:1578:1: rule__Coordinate__Group__4 : rule__Coordinate__Group__4__Impl ;
    public final void rule__Coordinate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1582:1: ( rule__Coordinate__Group__4__Impl )
            // InternalBmodParser.g:1583:2: rule__Coordinate__Group__4__Impl
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
    // InternalBmodParser.g:1589:1: rule__Coordinate__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Coordinate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1593:1: ( ( RightParenthesis ) )
            // InternalBmodParser.g:1594:1: ( RightParenthesis )
            {
            // InternalBmodParser.g:1594:1: ( RightParenthesis )
            // InternalBmodParser.g:1595:2: RightParenthesis
            {
             before(grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
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
    // InternalBmodParser.g:1605:1: rule__Area__Group__0 : rule__Area__Group__0__Impl rule__Area__Group__1 ;
    public final void rule__Area__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1609:1: ( rule__Area__Group__0__Impl rule__Area__Group__1 )
            // InternalBmodParser.g:1610:2: rule__Area__Group__0__Impl rule__Area__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalBmodParser.g:1617:1: rule__Area__Group__0__Impl : ( From ) ;
    public final void rule__Area__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1621:1: ( ( From ) )
            // InternalBmodParser.g:1622:1: ( From )
            {
            // InternalBmodParser.g:1622:1: ( From )
            // InternalBmodParser.g:1623:2: From
            {
             before(grammarAccess.getAreaAccess().getFromKeyword_0()); 
            match(input,From,FOLLOW_2); 
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
    // InternalBmodParser.g:1632:1: rule__Area__Group__1 : rule__Area__Group__1__Impl rule__Area__Group__2 ;
    public final void rule__Area__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1636:1: ( rule__Area__Group__1__Impl rule__Area__Group__2 )
            // InternalBmodParser.g:1637:2: rule__Area__Group__1__Impl rule__Area__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBmodParser.g:1644:1: rule__Area__Group__1__Impl : ( ( rule__Area__FromAssignment_1 ) ) ;
    public final void rule__Area__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1648:1: ( ( ( rule__Area__FromAssignment_1 ) ) )
            // InternalBmodParser.g:1649:1: ( ( rule__Area__FromAssignment_1 ) )
            {
            // InternalBmodParser.g:1649:1: ( ( rule__Area__FromAssignment_1 ) )
            // InternalBmodParser.g:1650:2: ( rule__Area__FromAssignment_1 )
            {
             before(grammarAccess.getAreaAccess().getFromAssignment_1()); 
            // InternalBmodParser.g:1651:2: ( rule__Area__FromAssignment_1 )
            // InternalBmodParser.g:1651:3: rule__Area__FromAssignment_1
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
    // InternalBmodParser.g:1659:1: rule__Area__Group__2 : rule__Area__Group__2__Impl rule__Area__Group__3 ;
    public final void rule__Area__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1663:1: ( rule__Area__Group__2__Impl rule__Area__Group__3 )
            // InternalBmodParser.g:1664:2: rule__Area__Group__2__Impl rule__Area__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalBmodParser.g:1671:1: rule__Area__Group__2__Impl : ( To ) ;
    public final void rule__Area__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1675:1: ( ( To ) )
            // InternalBmodParser.g:1676:1: ( To )
            {
            // InternalBmodParser.g:1676:1: ( To )
            // InternalBmodParser.g:1677:2: To
            {
             before(grammarAccess.getAreaAccess().getToKeyword_2()); 
            match(input,To,FOLLOW_2); 
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
    // InternalBmodParser.g:1686:1: rule__Area__Group__3 : rule__Area__Group__3__Impl rule__Area__Group__4 ;
    public final void rule__Area__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1690:1: ( rule__Area__Group__3__Impl rule__Area__Group__4 )
            // InternalBmodParser.g:1691:2: rule__Area__Group__3__Impl rule__Area__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBmodParser.g:1698:1: rule__Area__Group__3__Impl : ( ( rule__Area__ToAssignment_3 ) ) ;
    public final void rule__Area__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1702:1: ( ( ( rule__Area__ToAssignment_3 ) ) )
            // InternalBmodParser.g:1703:1: ( ( rule__Area__ToAssignment_3 ) )
            {
            // InternalBmodParser.g:1703:1: ( ( rule__Area__ToAssignment_3 ) )
            // InternalBmodParser.g:1704:2: ( rule__Area__ToAssignment_3 )
            {
             before(grammarAccess.getAreaAccess().getToAssignment_3()); 
            // InternalBmodParser.g:1705:2: ( rule__Area__ToAssignment_3 )
            // InternalBmodParser.g:1705:3: rule__Area__ToAssignment_3
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
    // InternalBmodParser.g:1713:1: rule__Area__Group__4 : rule__Area__Group__4__Impl ;
    public final void rule__Area__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1717:1: ( rule__Area__Group__4__Impl )
            // InternalBmodParser.g:1718:2: rule__Area__Group__4__Impl
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
    // InternalBmodParser.g:1724:1: rule__Area__Group__4__Impl : ( ( rule__Area__Group_4__0 )? ) ;
    public final void rule__Area__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1728:1: ( ( ( rule__Area__Group_4__0 )? ) )
            // InternalBmodParser.g:1729:1: ( ( rule__Area__Group_4__0 )? )
            {
            // InternalBmodParser.g:1729:1: ( ( rule__Area__Group_4__0 )? )
            // InternalBmodParser.g:1730:2: ( rule__Area__Group_4__0 )?
            {
             before(grammarAccess.getAreaAccess().getGroup_4()); 
            // InternalBmodParser.g:1731:2: ( rule__Area__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Without) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBmodParser.g:1731:3: rule__Area__Group_4__0
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
    // InternalBmodParser.g:1740:1: rule__Area__Group_4__0 : rule__Area__Group_4__0__Impl rule__Area__Group_4__1 ;
    public final void rule__Area__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1744:1: ( rule__Area__Group_4__0__Impl rule__Area__Group_4__1 )
            // InternalBmodParser.g:1745:2: rule__Area__Group_4__0__Impl rule__Area__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalBmodParser.g:1752:1: rule__Area__Group_4__0__Impl : ( Without ) ;
    public final void rule__Area__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1756:1: ( ( Without ) )
            // InternalBmodParser.g:1757:1: ( Without )
            {
            // InternalBmodParser.g:1757:1: ( Without )
            // InternalBmodParser.g:1758:2: Without
            {
             before(grammarAccess.getAreaAccess().getWithoutKeyword_4_0()); 
            match(input,Without,FOLLOW_2); 
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
    // InternalBmodParser.g:1767:1: rule__Area__Group_4__1 : rule__Area__Group_4__1__Impl rule__Area__Group_4__2 ;
    public final void rule__Area__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1771:1: ( rule__Area__Group_4__1__Impl rule__Area__Group_4__2 )
            // InternalBmodParser.g:1772:2: rule__Area__Group_4__1__Impl rule__Area__Group_4__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalBmodParser.g:1779:1: rule__Area__Group_4__1__Impl : ( ( rule__Area__WithoutAssignment_4_1 ) ) ;
    public final void rule__Area__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1783:1: ( ( ( rule__Area__WithoutAssignment_4_1 ) ) )
            // InternalBmodParser.g:1784:1: ( ( rule__Area__WithoutAssignment_4_1 ) )
            {
            // InternalBmodParser.g:1784:1: ( ( rule__Area__WithoutAssignment_4_1 ) )
            // InternalBmodParser.g:1785:2: ( rule__Area__WithoutAssignment_4_1 )
            {
             before(grammarAccess.getAreaAccess().getWithoutAssignment_4_1()); 
            // InternalBmodParser.g:1786:2: ( rule__Area__WithoutAssignment_4_1 )
            // InternalBmodParser.g:1786:3: rule__Area__WithoutAssignment_4_1
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
    // InternalBmodParser.g:1794:1: rule__Area__Group_4__2 : rule__Area__Group_4__2__Impl ;
    public final void rule__Area__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1798:1: ( rule__Area__Group_4__2__Impl )
            // InternalBmodParser.g:1799:2: rule__Area__Group_4__2__Impl
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
    // InternalBmodParser.g:1805:1: rule__Area__Group_4__2__Impl : ( ( rule__Area__Group_4_2__0 )* ) ;
    public final void rule__Area__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1809:1: ( ( ( rule__Area__Group_4_2__0 )* ) )
            // InternalBmodParser.g:1810:1: ( ( rule__Area__Group_4_2__0 )* )
            {
            // InternalBmodParser.g:1810:1: ( ( rule__Area__Group_4_2__0 )* )
            // InternalBmodParser.g:1811:2: ( rule__Area__Group_4_2__0 )*
            {
             before(grammarAccess.getAreaAccess().getGroup_4_2()); 
            // InternalBmodParser.g:1812:2: ( rule__Area__Group_4_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Comma) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBmodParser.g:1812:3: rule__Area__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Area__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalBmodParser.g:1821:1: rule__Area__Group_4_2__0 : rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1 ;
    public final void rule__Area__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1825:1: ( rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1 )
            // InternalBmodParser.g:1826:2: rule__Area__Group_4_2__0__Impl rule__Area__Group_4_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalBmodParser.g:1833:1: rule__Area__Group_4_2__0__Impl : ( Comma ) ;
    public final void rule__Area__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1837:1: ( ( Comma ) )
            // InternalBmodParser.g:1838:1: ( Comma )
            {
            // InternalBmodParser.g:1838:1: ( Comma )
            // InternalBmodParser.g:1839:2: Comma
            {
             before(grammarAccess.getAreaAccess().getCommaKeyword_4_2_0()); 
            match(input,Comma,FOLLOW_2); 
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
    // InternalBmodParser.g:1848:1: rule__Area__Group_4_2__1 : rule__Area__Group_4_2__1__Impl ;
    public final void rule__Area__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1852:1: ( rule__Area__Group_4_2__1__Impl )
            // InternalBmodParser.g:1853:2: rule__Area__Group_4_2__1__Impl
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
    // InternalBmodParser.g:1859:1: rule__Area__Group_4_2__1__Impl : ( ( rule__Area__WithoutAssignment_4_2_1 ) ) ;
    public final void rule__Area__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1863:1: ( ( ( rule__Area__WithoutAssignment_4_2_1 ) ) )
            // InternalBmodParser.g:1864:1: ( ( rule__Area__WithoutAssignment_4_2_1 ) )
            {
            // InternalBmodParser.g:1864:1: ( ( rule__Area__WithoutAssignment_4_2_1 ) )
            // InternalBmodParser.g:1865:2: ( rule__Area__WithoutAssignment_4_2_1 )
            {
             before(grammarAccess.getAreaAccess().getWithoutAssignment_4_2_1()); 
            // InternalBmodParser.g:1866:2: ( rule__Area__WithoutAssignment_4_2_1 )
            // InternalBmodParser.g:1866:3: rule__Area__WithoutAssignment_4_2_1
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


    // $ANTLR start "rule__Floorplan__ImportsAssignment_1"
    // InternalBmodParser.g:1875:1: rule__Floorplan__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Floorplan__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1879:1: ( ( ruleImport ) )
            // InternalBmodParser.g:1880:2: ( ruleImport )
            {
            // InternalBmodParser.g:1880:2: ( ruleImport )
            // InternalBmodParser.g:1881:3: ruleImport
            {
             before(grammarAccess.getFloorplanAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getImportsImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floorplan__ImportsAssignment_1"


    // $ANTLR start "rule__Floorplan__RoomsAssignment_2_0"
    // InternalBmodParser.g:1890:1: rule__Floorplan__RoomsAssignment_2_0 : ( ruleRoom ) ;
    public final void rule__Floorplan__RoomsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1894:1: ( ( ruleRoom ) )
            // InternalBmodParser.g:1895:2: ( ruleRoom )
            {
            // InternalBmodParser.g:1895:2: ( ruleRoom )
            // InternalBmodParser.g:1896:3: ruleRoom
            {
             before(grammarAccess.getFloorplanAccess().getRoomsRoomParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getRoomsRoomParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floorplan__RoomsAssignment_2_0"


    // $ANTLR start "rule__Floorplan__DoorsAssignment_2_1"
    // InternalBmodParser.g:1905:1: rule__Floorplan__DoorsAssignment_2_1 : ( ruleDoor ) ;
    public final void rule__Floorplan__DoorsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1909:1: ( ( ruleDoor ) )
            // InternalBmodParser.g:1910:2: ( ruleDoor )
            {
            // InternalBmodParser.g:1910:2: ( ruleDoor )
            // InternalBmodParser.g:1911:3: ruleDoor
            {
             before(grammarAccess.getFloorplanAccess().getDoorsDoorParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDoor();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getDoorsDoorParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floorplan__DoorsAssignment_2_1"


    // $ANTLR start "rule__Floorplan__PersonsAssignment_2_2"
    // InternalBmodParser.g:1920:1: rule__Floorplan__PersonsAssignment_2_2 : ( rulePerson ) ;
    public final void rule__Floorplan__PersonsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1924:1: ( ( rulePerson ) )
            // InternalBmodParser.g:1925:2: ( rulePerson )
            {
            // InternalBmodParser.g:1925:2: ( rulePerson )
            // InternalBmodParser.g:1926:3: rulePerson
            {
             before(grammarAccess.getFloorplanAccess().getPersonsPersonParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getPersonsPersonParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floorplan__PersonsAssignment_2_2"


    // $ANTLR start "rule__Floorplan__ExitsAssignment_2_3"
    // InternalBmodParser.g:1935:1: rule__Floorplan__ExitsAssignment_2_3 : ( ruleExit ) ;
    public final void rule__Floorplan__ExitsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1939:1: ( ( ruleExit ) )
            // InternalBmodParser.g:1940:2: ( ruleExit )
            {
            // InternalBmodParser.g:1940:2: ( ruleExit )
            // InternalBmodParser.g:1941:3: ruleExit
            {
             before(grammarAccess.getFloorplanAccess().getExitsExitParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExit();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getExitsExitParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floorplan__ExitsAssignment_2_3"


    // $ANTLR start "rule__Floorplan__FiresAssignment_2_4"
    // InternalBmodParser.g:1950:1: rule__Floorplan__FiresAssignment_2_4 : ( ruleFire ) ;
    public final void rule__Floorplan__FiresAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1954:1: ( ( ruleFire ) )
            // InternalBmodParser.g:1955:2: ( ruleFire )
            {
            // InternalBmodParser.g:1955:2: ( ruleFire )
            // InternalBmodParser.g:1956:3: ruleFire
            {
             before(grammarAccess.getFloorplanAccess().getFiresFireParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFire();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getFiresFireParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floorplan__FiresAssignment_2_4"


    // $ANTLR start "rule__Floorplan__SignsAssignment_2_5"
    // InternalBmodParser.g:1965:1: rule__Floorplan__SignsAssignment_2_5 : ( ruleEmergencySign ) ;
    public final void rule__Floorplan__SignsAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1969:1: ( ( ruleEmergencySign ) )
            // InternalBmodParser.g:1970:2: ( ruleEmergencySign )
            {
            // InternalBmodParser.g:1970:2: ( ruleEmergencySign )
            // InternalBmodParser.g:1971:3: ruleEmergencySign
            {
             before(grammarAccess.getFloorplanAccess().getSignsEmergencySignParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEmergencySign();

            state._fsp--;

             after(grammarAccess.getFloorplanAccess().getSignsEmergencySignParserRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floorplan__SignsAssignment_2_5"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalBmodParser.g:1980:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1984:1: ( ( RULE_STRING ) )
            // InternalBmodParser.g:1985:2: ( RULE_STRING )
            {
            // InternalBmodParser.g:1985:2: ( RULE_STRING )
            // InternalBmodParser.g:1986:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__Room__NameAssignment_1"
    // InternalBmodParser.g:1995:1: rule__Room__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Room__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:1999:1: ( ( RULE_VARNAME ) )
            // InternalBmodParser.g:2000:2: ( RULE_VARNAME )
            {
            // InternalBmodParser.g:2000:2: ( RULE_VARNAME )
            // InternalBmodParser.g:2001:3: RULE_VARNAME
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


    // $ANTLR start "rule__Room__HasCapacityAssignment_2_0"
    // InternalBmodParser.g:2010:1: rule__Room__HasCapacityAssignment_2_0 : ( ( LeftSquareBracket ) ) ;
    public final void rule__Room__HasCapacityAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2014:1: ( ( ( LeftSquareBracket ) ) )
            // InternalBmodParser.g:2015:2: ( ( LeftSquareBracket ) )
            {
            // InternalBmodParser.g:2015:2: ( ( LeftSquareBracket ) )
            // InternalBmodParser.g:2016:3: ( LeftSquareBracket )
            {
             before(grammarAccess.getRoomAccess().getHasCapacityLeftSquareBracketKeyword_2_0_0()); 
            // InternalBmodParser.g:2017:3: ( LeftSquareBracket )
            // InternalBmodParser.g:2018:4: LeftSquareBracket
            {
             before(grammarAccess.getRoomAccess().getHasCapacityLeftSquareBracketKeyword_2_0_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getHasCapacityLeftSquareBracketKeyword_2_0_0()); 

            }

             after(grammarAccess.getRoomAccess().getHasCapacityLeftSquareBracketKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__HasCapacityAssignment_2_0"


    // $ANTLR start "rule__Room__CapacityAssignment_2_1"
    // InternalBmodParser.g:2029:1: rule__Room__CapacityAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Room__CapacityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2033:1: ( ( RULE_INT ) )
            // InternalBmodParser.g:2034:2: ( RULE_INT )
            {
            // InternalBmodParser.g:2034:2: ( RULE_INT )
            // InternalBmodParser.g:2035:3: RULE_INT
            {
             before(grammarAccess.getRoomAccess().getCapacityINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCapacityINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__CapacityAssignment_2_1"


    // $ANTLR start "rule__Room__AreasAssignment_3"
    // InternalBmodParser.g:2044:1: rule__Room__AreasAssignment_3 : ( ruleArea ) ;
    public final void rule__Room__AreasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2048:1: ( ( ruleArea ) )
            // InternalBmodParser.g:2049:2: ( ruleArea )
            {
            // InternalBmodParser.g:2049:2: ( ruleArea )
            // InternalBmodParser.g:2050:3: ruleArea
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
    // InternalBmodParser.g:2059:1: rule__Room__AreasAssignment_4_1 : ( ruleArea ) ;
    public final void rule__Room__AreasAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2063:1: ( ( ruleArea ) )
            // InternalBmodParser.g:2064:2: ( ruleArea )
            {
            // InternalBmodParser.g:2064:2: ( ruleArea )
            // InternalBmodParser.g:2065:3: ruleArea
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
    // InternalBmodParser.g:2074:1: rule__Door__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Door__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2078:1: ( ( RULE_VARNAME ) )
            // InternalBmodParser.g:2079:2: ( RULE_VARNAME )
            {
            // InternalBmodParser.g:2079:2: ( RULE_VARNAME )
            // InternalBmodParser.g:2080:3: RULE_VARNAME
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
    // InternalBmodParser.g:2089:1: rule__Door__FromAssignment_3 : ( ruleCoordinate ) ;
    public final void rule__Door__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2093:1: ( ( ruleCoordinate ) )
            // InternalBmodParser.g:2094:2: ( ruleCoordinate )
            {
            // InternalBmodParser.g:2094:2: ( ruleCoordinate )
            // InternalBmodParser.g:2095:3: ruleCoordinate
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
    // InternalBmodParser.g:2104:1: rule__Door__ToAssignment_5 : ( ruleCoordinate ) ;
    public final void rule__Door__ToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2108:1: ( ( ruleCoordinate ) )
            // InternalBmodParser.g:2109:2: ( ruleCoordinate )
            {
            // InternalBmodParser.g:2109:2: ( ruleCoordinate )
            // InternalBmodParser.g:2110:3: ruleCoordinate
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
    // InternalBmodParser.g:2119:1: rule__Person__NameAssignment_1 : ( RULE_VARNAME ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2123:1: ( ( RULE_VARNAME ) )
            // InternalBmodParser.g:2124:2: ( RULE_VARNAME )
            {
            // InternalBmodParser.g:2124:2: ( RULE_VARNAME )
            // InternalBmodParser.g:2125:3: RULE_VARNAME
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
    // InternalBmodParser.g:2134:1: rule__Person__LocationAssignment_3 : ( ruleCoordinate ) ;
    public final void rule__Person__LocationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2138:1: ( ( ruleCoordinate ) )
            // InternalBmodParser.g:2139:2: ( ruleCoordinate )
            {
            // InternalBmodParser.g:2139:2: ( ruleCoordinate )
            // InternalBmodParser.g:2140:3: ruleCoordinate
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


    // $ANTLR start "rule__Person__ActionAssignment_5"
    // InternalBmodParser.g:2149:1: rule__Person__ActionAssignment_5 : ( ( RULE_VARNAME ) ) ;
    public final void rule__Person__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2153:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmodParser.g:2154:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmodParser.g:2154:2: ( ( RULE_VARNAME ) )
            // InternalBmodParser.g:2155:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getPersonAccess().getActionActionDescCrossReference_5_0()); 
            // InternalBmodParser.g:2156:3: ( RULE_VARNAME )
            // InternalBmodParser.g:2157:4: RULE_VARNAME
            {
             before(grammarAccess.getPersonAccess().getActionActionDescVARNAMETerminalRuleCall_5_0_1()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getActionActionDescVARNAMETerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getPersonAccess().getActionActionDescCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__ActionAssignment_5"


    // $ANTLR start "rule__Exit__LocationAssignment_2"
    // InternalBmodParser.g:2168:1: rule__Exit__LocationAssignment_2 : ( ruleCoordinate ) ;
    public final void rule__Exit__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2172:1: ( ( ruleCoordinate ) )
            // InternalBmodParser.g:2173:2: ( ruleCoordinate )
            {
            // InternalBmodParser.g:2173:2: ( ruleCoordinate )
            // InternalBmodParser.g:2174:3: ruleCoordinate
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
    // InternalBmodParser.g:2183:1: rule__Fire__LocationAssignment_2 : ( ruleCoordinate ) ;
    public final void rule__Fire__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2187:1: ( ( ruleCoordinate ) )
            // InternalBmodParser.g:2188:2: ( ruleCoordinate )
            {
            // InternalBmodParser.g:2188:2: ( ruleCoordinate )
            // InternalBmodParser.g:2189:3: ruleCoordinate
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


    // $ANTLR start "rule__EmergencySign__FromAssignment_2"
    // InternalBmodParser.g:2198:1: rule__EmergencySign__FromAssignment_2 : ( ( RULE_VARNAME ) ) ;
    public final void rule__EmergencySign__FromAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2202:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmodParser.g:2203:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmodParser.g:2203:2: ( ( RULE_VARNAME ) )
            // InternalBmodParser.g:2204:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getEmergencySignAccess().getFromDoorCrossReference_2_0()); 
            // InternalBmodParser.g:2205:3: ( RULE_VARNAME )
            // InternalBmodParser.g:2206:4: RULE_VARNAME
            {
             before(grammarAccess.getEmergencySignAccess().getFromDoorVARNAMETerminalRuleCall_2_0_1()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getEmergencySignAccess().getFromDoorVARNAMETerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEmergencySignAccess().getFromDoorCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmergencySign__FromAssignment_2"


    // $ANTLR start "rule__EmergencySign__RefAssignment_3"
    // InternalBmodParser.g:2217:1: rule__EmergencySign__RefAssignment_3 : ( ruleDoorRef ) ;
    public final void rule__EmergencySign__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2221:1: ( ( ruleDoorRef ) )
            // InternalBmodParser.g:2222:2: ( ruleDoorRef )
            {
            // InternalBmodParser.g:2222:2: ( ruleDoorRef )
            // InternalBmodParser.g:2223:3: ruleDoorRef
            {
             before(grammarAccess.getEmergencySignAccess().getRefDoorRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDoorRef();

            state._fsp--;

             after(grammarAccess.getEmergencySignAccess().getRefDoorRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmergencySign__RefAssignment_3"


    // $ANTLR start "rule__DoorRef__ToAssignment_1"
    // InternalBmodParser.g:2232:1: rule__DoorRef__ToAssignment_1 : ( ( RULE_VARNAME ) ) ;
    public final void rule__DoorRef__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2236:1: ( ( ( RULE_VARNAME ) ) )
            // InternalBmodParser.g:2237:2: ( ( RULE_VARNAME ) )
            {
            // InternalBmodParser.g:2237:2: ( ( RULE_VARNAME ) )
            // InternalBmodParser.g:2238:3: ( RULE_VARNAME )
            {
             before(grammarAccess.getDoorRefAccess().getToDoorCrossReference_1_0()); 
            // InternalBmodParser.g:2239:3: ( RULE_VARNAME )
            // InternalBmodParser.g:2240:4: RULE_VARNAME
            {
             before(grammarAccess.getDoorRefAccess().getToDoorVARNAMETerminalRuleCall_1_0_1()); 
            match(input,RULE_VARNAME,FOLLOW_2); 
             after(grammarAccess.getDoorRefAccess().getToDoorVARNAMETerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDoorRefAccess().getToDoorCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorRef__ToAssignment_1"


    // $ANTLR start "rule__Coordinate__XAssignment_1"
    // InternalBmodParser.g:2251:1: rule__Coordinate__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Coordinate__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2255:1: ( ( RULE_INT ) )
            // InternalBmodParser.g:2256:2: ( RULE_INT )
            {
            // InternalBmodParser.g:2256:2: ( RULE_INT )
            // InternalBmodParser.g:2257:3: RULE_INT
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
    // InternalBmodParser.g:2266:1: rule__Coordinate__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Coordinate__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2270:1: ( ( RULE_INT ) )
            // InternalBmodParser.g:2271:2: ( RULE_INT )
            {
            // InternalBmodParser.g:2271:2: ( RULE_INT )
            // InternalBmodParser.g:2272:3: RULE_INT
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
    // InternalBmodParser.g:2281:1: rule__Area__FromAssignment_1 : ( ruleCoordinate ) ;
    public final void rule__Area__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2285:1: ( ( ruleCoordinate ) )
            // InternalBmodParser.g:2286:2: ( ruleCoordinate )
            {
            // InternalBmodParser.g:2286:2: ( ruleCoordinate )
            // InternalBmodParser.g:2287:3: ruleCoordinate
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
    // InternalBmodParser.g:2296:1: rule__Area__ToAssignment_3 : ( ruleCoordinate ) ;
    public final void rule__Area__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2300:1: ( ( ruleCoordinate ) )
            // InternalBmodParser.g:2301:2: ( ruleCoordinate )
            {
            // InternalBmodParser.g:2301:2: ( ruleCoordinate )
            // InternalBmodParser.g:2302:3: ruleCoordinate
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
    // InternalBmodParser.g:2311:1: rule__Area__WithoutAssignment_4_1 : ( ruleCoordinate ) ;
    public final void rule__Area__WithoutAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2315:1: ( ( ruleCoordinate ) )
            // InternalBmodParser.g:2316:2: ( ruleCoordinate )
            {
            // InternalBmodParser.g:2316:2: ( ruleCoordinate )
            // InternalBmodParser.g:2317:3: ruleCoordinate
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
    // InternalBmodParser.g:2326:1: rule__Area__WithoutAssignment_4_2_1 : ( ruleCoordinate ) ;
    public final void rule__Area__WithoutAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBmodParser.g:2330:1: ( ( ruleCoordinate ) )
            // InternalBmodParser.g:2331:2: ( ruleCoordinate )
            {
            // InternalBmodParser.g:2331:2: ( ruleCoordinate )
            // InternalBmodParser.g:2332:3: ruleCoordinate
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000FD0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000F52L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040002L});

}