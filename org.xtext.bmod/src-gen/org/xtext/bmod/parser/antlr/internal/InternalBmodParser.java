package org.xtext.bmod.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.bmod.services.BmodGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBmodParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARNAME", "RULE_STRING", "RULE_INT", "RULE_HEX", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Room'", "'named'", "'and'", "'Door'", "'from'", "'to'", "'PerceptionLevel'", "'('", "','", "')'", "'ActionProfile'", "'Person'", "'in'", "':'", "'Exit'", "'Fire'", "'Sign'", "'on'", "'Condition'", "'without'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'<'", "'>'", "'>='", "'||'", "'&&'", "'=='", "'!='", "'==='", "'!=='", "'instanceof'", "'->'", "'..<'", "'..'", "'=>'", "'<>'", "'?:'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'++'", "'--'", "'.'", "'::'", "'?.'", "'#'", "'{'", "'}'", "'['", "']'", "'|'", "';'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'extends'", "'static'", "'import'", "'extension'", "'super'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'synchronized'", "'catch'", "'?'", "'&'", "'attentive'", "'relaxed'", "'optimistic'", "'sceptic'", "'newcomer'", "'experienced'", "'panic'"
    };
    public static final int RULE_HEX=7;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=9;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_VARNAME=4;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DECIMAL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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

        public InternalBmodParser(TokenStream input, BmodGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BmodGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBmod.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBmod.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalBmod.g:66:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBmod.g:72:1: ruleModel returns [EObject current=null] : this_Floorplan_0= ruleFloorplan ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Floorplan_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:78:2: (this_Floorplan_0= ruleFloorplan )
            // InternalBmod.g:79:2: this_Floorplan_0= ruleFloorplan
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getModelAccess().getFloorplanParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Floorplan_0=ruleFloorplan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Floorplan_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFloorplan"
    // InternalBmod.g:90:1: entryRuleFloorplan returns [EObject current=null] : iv_ruleFloorplan= ruleFloorplan EOF ;
    public final EObject entryRuleFloorplan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloorplan = null;


        try {
            // InternalBmod.g:90:50: (iv_ruleFloorplan= ruleFloorplan EOF )
            // InternalBmod.g:91:2: iv_ruleFloorplan= ruleFloorplan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloorplanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloorplan=ruleFloorplan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloorplan; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloorplan"


    // $ANTLR start "ruleFloorplan"
    // InternalBmod.g:97:1: ruleFloorplan returns [EObject current=null] : ( () ( ( (lv_perceptions_1_0= rulePerceptionLevel ) ) | ( (lv_actions_2_0= ruleActionProfile ) ) | ( (lv_rooms_3_0= ruleRoom ) ) | ( (lv_doors_4_0= ruleDoor ) ) | ( (lv_persons_5_0= rulePerson ) ) | ( (lv_exits_6_0= ruleExit ) ) | ( (lv_fires_7_0= ruleFire ) ) | ( (lv_signs_8_0= ruleEmergencySign ) ) | ( (lv_dancons_9_0= ruleDangerousCondition ) ) )* ) ;
    public final EObject ruleFloorplan() throws RecognitionException {
        EObject current = null;

        EObject lv_perceptions_1_0 = null;

        EObject lv_actions_2_0 = null;

        EObject lv_rooms_3_0 = null;

        EObject lv_doors_4_0 = null;

        EObject lv_persons_5_0 = null;

        EObject lv_exits_6_0 = null;

        EObject lv_fires_7_0 = null;

        EObject lv_signs_8_0 = null;

        EObject lv_dancons_9_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:103:2: ( ( () ( ( (lv_perceptions_1_0= rulePerceptionLevel ) ) | ( (lv_actions_2_0= ruleActionProfile ) ) | ( (lv_rooms_3_0= ruleRoom ) ) | ( (lv_doors_4_0= ruleDoor ) ) | ( (lv_persons_5_0= rulePerson ) ) | ( (lv_exits_6_0= ruleExit ) ) | ( (lv_fires_7_0= ruleFire ) ) | ( (lv_signs_8_0= ruleEmergencySign ) ) | ( (lv_dancons_9_0= ruleDangerousCondition ) ) )* ) )
            // InternalBmod.g:104:2: ( () ( ( (lv_perceptions_1_0= rulePerceptionLevel ) ) | ( (lv_actions_2_0= ruleActionProfile ) ) | ( (lv_rooms_3_0= ruleRoom ) ) | ( (lv_doors_4_0= ruleDoor ) ) | ( (lv_persons_5_0= rulePerson ) ) | ( (lv_exits_6_0= ruleExit ) ) | ( (lv_fires_7_0= ruleFire ) ) | ( (lv_signs_8_0= ruleEmergencySign ) ) | ( (lv_dancons_9_0= ruleDangerousCondition ) ) )* )
            {
            // InternalBmod.g:104:2: ( () ( ( (lv_perceptions_1_0= rulePerceptionLevel ) ) | ( (lv_actions_2_0= ruleActionProfile ) ) | ( (lv_rooms_3_0= ruleRoom ) ) | ( (lv_doors_4_0= ruleDoor ) ) | ( (lv_persons_5_0= rulePerson ) ) | ( (lv_exits_6_0= ruleExit ) ) | ( (lv_fires_7_0= ruleFire ) ) | ( (lv_signs_8_0= ruleEmergencySign ) ) | ( (lv_dancons_9_0= ruleDangerousCondition ) ) )* )
            // InternalBmod.g:105:3: () ( ( (lv_perceptions_1_0= rulePerceptionLevel ) ) | ( (lv_actions_2_0= ruleActionProfile ) ) | ( (lv_rooms_3_0= ruleRoom ) ) | ( (lv_doors_4_0= ruleDoor ) ) | ( (lv_persons_5_0= rulePerson ) ) | ( (lv_exits_6_0= ruleExit ) ) | ( (lv_fires_7_0= ruleFire ) ) | ( (lv_signs_8_0= ruleEmergencySign ) ) | ( (lv_dancons_9_0= ruleDangerousCondition ) ) )*
            {
            // InternalBmod.g:105:3: ()
            // InternalBmod.g:106:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFloorplanAccess().getFloorplanAction_0(),
              					current);
              			
            }

            }

            // InternalBmod.g:112:3: ( ( (lv_perceptions_1_0= rulePerceptionLevel ) ) | ( (lv_actions_2_0= ruleActionProfile ) ) | ( (lv_rooms_3_0= ruleRoom ) ) | ( (lv_doors_4_0= ruleDoor ) ) | ( (lv_persons_5_0= rulePerson ) ) | ( (lv_exits_6_0= ruleExit ) ) | ( (lv_fires_7_0= ruleFire ) ) | ( (lv_signs_8_0= ruleEmergencySign ) ) | ( (lv_dancons_9_0= ruleDangerousCondition ) ) )*
            loop1:
            do {
                int alt1=10;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    alt1=1;
                    }
                    break;
                case 24:
                    {
                    alt1=2;
                    }
                    break;
                case 14:
                    {
                    alt1=3;
                    }
                    break;
                case 17:
                    {
                    alt1=4;
                    }
                    break;
                case 25:
                    {
                    alt1=5;
                    }
                    break;
                case 28:
                    {
                    alt1=6;
                    }
                    break;
                case 29:
                    {
                    alt1=7;
                    }
                    break;
                case 30:
                    {
                    alt1=8;
                    }
                    break;
                case 32:
                    {
                    alt1=9;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalBmod.g:113:4: ( (lv_perceptions_1_0= rulePerceptionLevel ) )
            	    {
            	    // InternalBmod.g:113:4: ( (lv_perceptions_1_0= rulePerceptionLevel ) )
            	    // InternalBmod.g:114:5: (lv_perceptions_1_0= rulePerceptionLevel )
            	    {
            	    // InternalBmod.g:114:5: (lv_perceptions_1_0= rulePerceptionLevel )
            	    // InternalBmod.g:115:6: lv_perceptions_1_0= rulePerceptionLevel
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFloorplanAccess().getPerceptionsPerceptionLevelParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_perceptions_1_0=rulePerceptionLevel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	      						}
            	      						add(
            	      							current,
            	      							"perceptions",
            	      							lv_perceptions_1_0,
            	      							"org.xtext.bmod.Bmod.PerceptionLevel");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBmod.g:133:4: ( (lv_actions_2_0= ruleActionProfile ) )
            	    {
            	    // InternalBmod.g:133:4: ( (lv_actions_2_0= ruleActionProfile ) )
            	    // InternalBmod.g:134:5: (lv_actions_2_0= ruleActionProfile )
            	    {
            	    // InternalBmod.g:134:5: (lv_actions_2_0= ruleActionProfile )
            	    // InternalBmod.g:135:6: lv_actions_2_0= ruleActionProfile
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFloorplanAccess().getActionsActionProfileParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_actions_2_0=ruleActionProfile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	      						}
            	      						add(
            	      							current,
            	      							"actions",
            	      							lv_actions_2_0,
            	      							"org.xtext.bmod.Bmod.ActionProfile");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBmod.g:153:4: ( (lv_rooms_3_0= ruleRoom ) )
            	    {
            	    // InternalBmod.g:153:4: ( (lv_rooms_3_0= ruleRoom ) )
            	    // InternalBmod.g:154:5: (lv_rooms_3_0= ruleRoom )
            	    {
            	    // InternalBmod.g:154:5: (lv_rooms_3_0= ruleRoom )
            	    // InternalBmod.g:155:6: lv_rooms_3_0= ruleRoom
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFloorplanAccess().getRoomsRoomParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_rooms_3_0=ruleRoom();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	      						}
            	      						add(
            	      							current,
            	      							"rooms",
            	      							lv_rooms_3_0,
            	      							"org.xtext.bmod.Bmod.Room");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBmod.g:173:4: ( (lv_doors_4_0= ruleDoor ) )
            	    {
            	    // InternalBmod.g:173:4: ( (lv_doors_4_0= ruleDoor ) )
            	    // InternalBmod.g:174:5: (lv_doors_4_0= ruleDoor )
            	    {
            	    // InternalBmod.g:174:5: (lv_doors_4_0= ruleDoor )
            	    // InternalBmod.g:175:6: lv_doors_4_0= ruleDoor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFloorplanAccess().getDoorsDoorParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_doors_4_0=ruleDoor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	      						}
            	      						add(
            	      							current,
            	      							"doors",
            	      							lv_doors_4_0,
            	      							"org.xtext.bmod.Bmod.Door");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalBmod.g:193:4: ( (lv_persons_5_0= rulePerson ) )
            	    {
            	    // InternalBmod.g:193:4: ( (lv_persons_5_0= rulePerson ) )
            	    // InternalBmod.g:194:5: (lv_persons_5_0= rulePerson )
            	    {
            	    // InternalBmod.g:194:5: (lv_persons_5_0= rulePerson )
            	    // InternalBmod.g:195:6: lv_persons_5_0= rulePerson
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFloorplanAccess().getPersonsPersonParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_persons_5_0=rulePerson();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	      						}
            	      						add(
            	      							current,
            	      							"persons",
            	      							lv_persons_5_0,
            	      							"org.xtext.bmod.Bmod.Person");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalBmod.g:213:4: ( (lv_exits_6_0= ruleExit ) )
            	    {
            	    // InternalBmod.g:213:4: ( (lv_exits_6_0= ruleExit ) )
            	    // InternalBmod.g:214:5: (lv_exits_6_0= ruleExit )
            	    {
            	    // InternalBmod.g:214:5: (lv_exits_6_0= ruleExit )
            	    // InternalBmod.g:215:6: lv_exits_6_0= ruleExit
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFloorplanAccess().getExitsExitParserRuleCall_1_5_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_exits_6_0=ruleExit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exits",
            	      							lv_exits_6_0,
            	      							"org.xtext.bmod.Bmod.Exit");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalBmod.g:233:4: ( (lv_fires_7_0= ruleFire ) )
            	    {
            	    // InternalBmod.g:233:4: ( (lv_fires_7_0= ruleFire ) )
            	    // InternalBmod.g:234:5: (lv_fires_7_0= ruleFire )
            	    {
            	    // InternalBmod.g:234:5: (lv_fires_7_0= ruleFire )
            	    // InternalBmod.g:235:6: lv_fires_7_0= ruleFire
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFloorplanAccess().getFiresFireParserRuleCall_1_6_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_fires_7_0=ruleFire();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	      						}
            	      						add(
            	      							current,
            	      							"fires",
            	      							lv_fires_7_0,
            	      							"org.xtext.bmod.Bmod.Fire");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalBmod.g:253:4: ( (lv_signs_8_0= ruleEmergencySign ) )
            	    {
            	    // InternalBmod.g:253:4: ( (lv_signs_8_0= ruleEmergencySign ) )
            	    // InternalBmod.g:254:5: (lv_signs_8_0= ruleEmergencySign )
            	    {
            	    // InternalBmod.g:254:5: (lv_signs_8_0= ruleEmergencySign )
            	    // InternalBmod.g:255:6: lv_signs_8_0= ruleEmergencySign
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFloorplanAccess().getSignsEmergencySignParserRuleCall_1_7_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_signs_8_0=ruleEmergencySign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	      						}
            	      						add(
            	      							current,
            	      							"signs",
            	      							lv_signs_8_0,
            	      							"org.xtext.bmod.Bmod.EmergencySign");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalBmod.g:273:4: ( (lv_dancons_9_0= ruleDangerousCondition ) )
            	    {
            	    // InternalBmod.g:273:4: ( (lv_dancons_9_0= ruleDangerousCondition ) )
            	    // InternalBmod.g:274:5: (lv_dancons_9_0= ruleDangerousCondition )
            	    {
            	    // InternalBmod.g:274:5: (lv_dancons_9_0= ruleDangerousCondition )
            	    // InternalBmod.g:275:6: lv_dancons_9_0= ruleDangerousCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFloorplanAccess().getDanconsDangerousConditionParserRuleCall_1_8_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_dancons_9_0=ruleDangerousCondition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	      						}
            	      						add(
            	      							current,
            	      							"dancons",
            	      							lv_dancons_9_0,
            	      							"org.xtext.bmod.Bmod.DangerousCondition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloorplan"


    // $ANTLR start "entryRuleRoom"
    // InternalBmod.g:297:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalBmod.g:297:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalBmod.g:298:2: iv_ruleRoom= ruleRoom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoomRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoom; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalBmod.g:304:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) (otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) )? ( (lv_areas_4_0= ruleArea ) ) (otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) ) )* ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_named_3_0=null;
        Token otherlv_5=null;
        EObject lv_areas_4_0 = null;

        EObject lv_areas_6_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:310:2: ( (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) (otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) )? ( (lv_areas_4_0= ruleArea ) ) (otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) ) )* ) )
            // InternalBmod.g:311:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) (otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) )? ( (lv_areas_4_0= ruleArea ) ) (otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) ) )* )
            {
            // InternalBmod.g:311:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) (otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) )? ( (lv_areas_4_0= ruleArea ) ) (otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) ) )* )
            // InternalBmod.g:312:3: otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) (otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) )? ( (lv_areas_4_0= ruleArea ) ) (otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
              		
            }
            // InternalBmod.g:316:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:317:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:317:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:318:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRoomAccess().getNameVARNAMETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRoomRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.bmod.Bmod.VARNAME");
              				
            }

            }


            }

            // InternalBmod.g:334:3: (otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBmod.g:335:4: otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getNamedKeyword_2_0());
                      			
                    }
                    // InternalBmod.g:339:4: ( (lv_named_3_0= RULE_STRING ) )
                    // InternalBmod.g:340:5: (lv_named_3_0= RULE_STRING )
                    {
                    // InternalBmod.g:340:5: (lv_named_3_0= RULE_STRING )
                    // InternalBmod.g:341:6: lv_named_3_0= RULE_STRING
                    {
                    lv_named_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_named_3_0, grammarAccess.getRoomAccess().getNamedSTRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRoomRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"named",
                      							lv_named_3_0,
                      							"org.eclipse.xtext.xbase.Xtype.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalBmod.g:358:3: ( (lv_areas_4_0= ruleArea ) )
            // InternalBmod.g:359:4: (lv_areas_4_0= ruleArea )
            {
            // InternalBmod.g:359:4: (lv_areas_4_0= ruleArea )
            // InternalBmod.g:360:5: lv_areas_4_0= ruleArea
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_areas_4_0=ruleArea();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRoomRule());
              					}
              					add(
              						current,
              						"areas",
              						lv_areas_4_0,
              						"org.xtext.bmod.Bmod.Area");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBmod.g:377:3: (otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBmod.g:378:4: otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getAndKeyword_4_0());
            	      			
            	    }
            	    // InternalBmod.g:382:4: ( (lv_areas_6_0= ruleArea ) )
            	    // InternalBmod.g:383:5: (lv_areas_6_0= ruleArea )
            	    {
            	    // InternalBmod.g:383:5: (lv_areas_6_0= ruleArea )
            	    // InternalBmod.g:384:6: lv_areas_6_0= ruleArea
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_areas_6_0=ruleArea();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRoomRule());
            	      						}
            	      						add(
            	      							current,
            	      							"areas",
            	      							lv_areas_6_0,
            	      							"org.xtext.bmod.Bmod.Area");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleDoor"
    // InternalBmod.g:406:1: entryRuleDoor returns [EObject current=null] : iv_ruleDoor= ruleDoor EOF ;
    public final EObject entryRuleDoor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoor = null;


        try {
            // InternalBmod.g:406:45: (iv_ruleDoor= ruleDoor EOF )
            // InternalBmod.g:407:2: iv_ruleDoor= ruleDoor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDoor=ruleDoor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoor"


    // $ANTLR start "ruleDoor"
    // InternalBmod.g:413:1: ruleDoor returns [EObject current=null] : (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) ) ;
    public final EObject ruleDoor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_from_3_0 = null;

        EObject lv_to_5_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:419:2: ( (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) ) )
            // InternalBmod.g:420:2: (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) )
            {
            // InternalBmod.g:420:2: (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) )
            // InternalBmod.g:421:3: otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDoorAccess().getDoorKeyword_0());
              		
            }
            // InternalBmod.g:425:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:426:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:426:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:427:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDoorAccess().getNameVARNAMETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDoorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.bmod.Bmod.VARNAME");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDoorAccess().getFromKeyword_2());
              		
            }
            // InternalBmod.g:447:3: ( (lv_from_3_0= ruleCoordinate ) )
            // InternalBmod.g:448:4: (lv_from_3_0= ruleCoordinate )
            {
            // InternalBmod.g:448:4: (lv_from_3_0= ruleCoordinate )
            // InternalBmod.g:449:5: lv_from_3_0= ruleCoordinate
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDoorAccess().getFromCoordinateParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_from_3_0=ruleCoordinate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDoorRule());
              					}
              					set(
              						current,
              						"from",
              						lv_from_3_0,
              						"org.xtext.bmod.Bmod.Coordinate");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDoorAccess().getToKeyword_4());
              		
            }
            // InternalBmod.g:470:3: ( (lv_to_5_0= ruleCoordinate ) )
            // InternalBmod.g:471:4: (lv_to_5_0= ruleCoordinate )
            {
            // InternalBmod.g:471:4: (lv_to_5_0= ruleCoordinate )
            // InternalBmod.g:472:5: lv_to_5_0= ruleCoordinate
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDoorAccess().getToCoordinateParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_to_5_0=ruleCoordinate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDoorRule());
              					}
              					set(
              						current,
              						"to",
              						lv_to_5_0,
              						"org.xtext.bmod.Bmod.Coordinate");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoor"


    // $ANTLR start "entryRulePerceptionLevel"
    // InternalBmod.g:493:1: entryRulePerceptionLevel returns [EObject current=null] : iv_rulePerceptionLevel= rulePerceptionLevel EOF ;
    public final EObject entryRulePerceptionLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerceptionLevel = null;


        try {
            // InternalBmod.g:493:56: (iv_rulePerceptionLevel= rulePerceptionLevel EOF )
            // InternalBmod.g:494:2: iv_rulePerceptionLevel= rulePerceptionLevel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPerceptionLevelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePerceptionLevel=rulePerceptionLevel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePerceptionLevel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerceptionLevel"


    // $ANTLR start "rulePerceptionLevel"
    // InternalBmod.g:500:1: rulePerceptionLevel returns [EObject current=null] : (otherlv_0= 'PerceptionLevel' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= '(' ( (lv_person_3_0= RULE_VARNAME ) ) otherlv_4= ',' ( (lv_objects_5_0= RULE_VARNAME ) ) otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) ) ;
    public final EObject rulePerceptionLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_person_3_0=null;
        Token otherlv_4=null;
        Token lv_objects_5_0=null;
        Token otherlv_6=null;
        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:506:2: ( (otherlv_0= 'PerceptionLevel' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= '(' ( (lv_person_3_0= RULE_VARNAME ) ) otherlv_4= ',' ( (lv_objects_5_0= RULE_VARNAME ) ) otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) ) )
            // InternalBmod.g:507:2: (otherlv_0= 'PerceptionLevel' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= '(' ( (lv_person_3_0= RULE_VARNAME ) ) otherlv_4= ',' ( (lv_objects_5_0= RULE_VARNAME ) ) otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) )
            {
            // InternalBmod.g:507:2: (otherlv_0= 'PerceptionLevel' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= '(' ( (lv_person_3_0= RULE_VARNAME ) ) otherlv_4= ',' ( (lv_objects_5_0= RULE_VARNAME ) ) otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) )
            // InternalBmod.g:508:3: otherlv_0= 'PerceptionLevel' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= '(' ( (lv_person_3_0= RULE_VARNAME ) ) otherlv_4= ',' ( (lv_objects_5_0= RULE_VARNAME ) ) otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPerceptionLevelAccess().getPerceptionLevelKeyword_0());
              		
            }
            // InternalBmod.g:512:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:513:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:513:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:514:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPerceptionLevelAccess().getNameVARNAMETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPerceptionLevelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.bmod.Bmod.VARNAME");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPerceptionLevelAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalBmod.g:534:3: ( (lv_person_3_0= RULE_VARNAME ) )
            // InternalBmod.g:535:4: (lv_person_3_0= RULE_VARNAME )
            {
            // InternalBmod.g:535:4: (lv_person_3_0= RULE_VARNAME )
            // InternalBmod.g:536:5: lv_person_3_0= RULE_VARNAME
            {
            lv_person_3_0=(Token)match(input,RULE_VARNAME,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_person_3_0, grammarAccess.getPerceptionLevelAccess().getPersonVARNAMETerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPerceptionLevelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"person",
              						lv_person_3_0,
              						"org.xtext.bmod.Bmod.VARNAME");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPerceptionLevelAccess().getCommaKeyword_4());
              		
            }
            // InternalBmod.g:556:3: ( (lv_objects_5_0= RULE_VARNAME ) )
            // InternalBmod.g:557:4: (lv_objects_5_0= RULE_VARNAME )
            {
            // InternalBmod.g:557:4: (lv_objects_5_0= RULE_VARNAME )
            // InternalBmod.g:558:5: lv_objects_5_0= RULE_VARNAME
            {
            lv_objects_5_0=(Token)match(input,RULE_VARNAME,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_objects_5_0, grammarAccess.getPerceptionLevelAccess().getObjectsVARNAMETerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPerceptionLevelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"objects",
              						lv_objects_5_0,
              						"org.xtext.bmod.Bmod.VARNAME");
              				
            }

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getPerceptionLevelAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalBmod.g:578:3: ( (lv_body_7_0= ruleXBlockExpression ) )
            // InternalBmod.g:579:4: (lv_body_7_0= ruleXBlockExpression )
            {
            // InternalBmod.g:579:4: (lv_body_7_0= ruleXBlockExpression )
            // InternalBmod.g:580:5: lv_body_7_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPerceptionLevelAccess().getBodyXBlockExpressionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_7_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPerceptionLevelRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_7_0,
              						"org.eclipse.xtext.xbase.Xbase.XBlockExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerceptionLevel"


    // $ANTLR start "entryRuleActionProfile"
    // InternalBmod.g:601:1: entryRuleActionProfile returns [EObject current=null] : iv_ruleActionProfile= ruleActionProfile EOF ;
    public final EObject entryRuleActionProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionProfile = null;


        try {
            // InternalBmod.g:601:54: (iv_ruleActionProfile= ruleActionProfile EOF )
            // InternalBmod.g:602:2: iv_ruleActionProfile= ruleActionProfile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionProfileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleActionProfile=ruleActionProfile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionProfile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionProfile"


    // $ANTLR start "ruleActionProfile"
    // InternalBmod.g:608:1: ruleActionProfile returns [EObject current=null] : (otherlv_0= 'ActionProfile' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= '(' ( (lv_person_3_0= RULE_VARNAME ) ) otherlv_4= ',' ( (lv_objects_5_0= RULE_VARNAME ) ) otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleActionProfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_person_3_0=null;
        Token otherlv_4=null;
        Token lv_objects_5_0=null;
        Token otherlv_6=null;
        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:614:2: ( (otherlv_0= 'ActionProfile' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= '(' ( (lv_person_3_0= RULE_VARNAME ) ) otherlv_4= ',' ( (lv_objects_5_0= RULE_VARNAME ) ) otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) ) )
            // InternalBmod.g:615:2: (otherlv_0= 'ActionProfile' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= '(' ( (lv_person_3_0= RULE_VARNAME ) ) otherlv_4= ',' ( (lv_objects_5_0= RULE_VARNAME ) ) otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) )
            {
            // InternalBmod.g:615:2: (otherlv_0= 'ActionProfile' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= '(' ( (lv_person_3_0= RULE_VARNAME ) ) otherlv_4= ',' ( (lv_objects_5_0= RULE_VARNAME ) ) otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) )
            // InternalBmod.g:616:3: otherlv_0= 'ActionProfile' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= '(' ( (lv_person_3_0= RULE_VARNAME ) ) otherlv_4= ',' ( (lv_objects_5_0= RULE_VARNAME ) ) otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getActionProfileAccess().getActionProfileKeyword_0());
              		
            }
            // InternalBmod.g:620:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:621:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:621:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:622:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getActionProfileAccess().getNameVARNAMETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getActionProfileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.bmod.Bmod.VARNAME");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getActionProfileAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalBmod.g:642:3: ( (lv_person_3_0= RULE_VARNAME ) )
            // InternalBmod.g:643:4: (lv_person_3_0= RULE_VARNAME )
            {
            // InternalBmod.g:643:4: (lv_person_3_0= RULE_VARNAME )
            // InternalBmod.g:644:5: lv_person_3_0= RULE_VARNAME
            {
            lv_person_3_0=(Token)match(input,RULE_VARNAME,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_person_3_0, grammarAccess.getActionProfileAccess().getPersonVARNAMETerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getActionProfileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"person",
              						lv_person_3_0,
              						"org.xtext.bmod.Bmod.VARNAME");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getActionProfileAccess().getCommaKeyword_4());
              		
            }
            // InternalBmod.g:664:3: ( (lv_objects_5_0= RULE_VARNAME ) )
            // InternalBmod.g:665:4: (lv_objects_5_0= RULE_VARNAME )
            {
            // InternalBmod.g:665:4: (lv_objects_5_0= RULE_VARNAME )
            // InternalBmod.g:666:5: lv_objects_5_0= RULE_VARNAME
            {
            lv_objects_5_0=(Token)match(input,RULE_VARNAME,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_objects_5_0, grammarAccess.getActionProfileAccess().getObjectsVARNAMETerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getActionProfileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"objects",
              						lv_objects_5_0,
              						"org.xtext.bmod.Bmod.VARNAME");
              				
            }

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getActionProfileAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalBmod.g:686:3: ( (lv_body_7_0= ruleXBlockExpression ) )
            // InternalBmod.g:687:4: (lv_body_7_0= ruleXBlockExpression )
            {
            // InternalBmod.g:687:4: (lv_body_7_0= ruleXBlockExpression )
            // InternalBmod.g:688:5: lv_body_7_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActionProfileAccess().getBodyXBlockExpressionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_7_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActionProfileRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_7_0,
              						"org.eclipse.xtext.xbase.Xbase.XBlockExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionProfile"


    // $ANTLR start "entryRulePerception"
    // InternalBmod.g:709:1: entryRulePerception returns [EObject current=null] : iv_rulePerception= rulePerception EOF ;
    public final EObject entryRulePerception() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerception = null;


        try {
            // InternalBmod.g:709:51: (iv_rulePerception= rulePerception EOF )
            // InternalBmod.g:710:2: iv_rulePerception= rulePerception EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPerceptionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePerception=rulePerception();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePerception; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerception"


    // $ANTLR start "rulePerception"
    // InternalBmod.g:716:1: rulePerception returns [EObject current=null] : ( ( (lv_existing_0_0= rulePerceptionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) ) ;
    public final EObject rulePerception() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_existing_0_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:722:2: ( ( ( (lv_existing_0_0= rulePerceptionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) ) )
            // InternalBmod.g:723:2: ( ( (lv_existing_0_0= rulePerceptionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) )
            {
            // InternalBmod.g:723:2: ( ( (lv_existing_0_0= rulePerceptionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=104 && LA4_0<=107)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_VARNAME) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBmod.g:724:3: ( (lv_existing_0_0= rulePerceptionEnum ) )
                    {
                    // InternalBmod.g:724:3: ( (lv_existing_0_0= rulePerceptionEnum ) )
                    // InternalBmod.g:725:4: (lv_existing_0_0= rulePerceptionEnum )
                    {
                    // InternalBmod.g:725:4: (lv_existing_0_0= rulePerceptionEnum )
                    // InternalBmod.g:726:5: lv_existing_0_0= rulePerceptionEnum
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPerceptionAccess().getExistingPerceptionEnumEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_existing_0_0=rulePerceptionEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPerceptionRule());
                      					}
                      					set(
                      						current,
                      						"existing",
                      						lv_existing_0_0,
                      						"org.xtext.bmod.Bmod.PerceptionEnum");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:744:3: ( (otherlv_1= RULE_VARNAME ) )
                    {
                    // InternalBmod.g:744:3: ( (otherlv_1= RULE_VARNAME ) )
                    // InternalBmod.g:745:4: (otherlv_1= RULE_VARNAME )
                    {
                    // InternalBmod.g:745:4: (otherlv_1= RULE_VARNAME )
                    // InternalBmod.g:746:5: otherlv_1= RULE_VARNAME
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPerceptionRule());
                      					}
                      				
                    }
                    otherlv_1=(Token)match(input,RULE_VARNAME,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getPerceptionAccess().getCustomPerceptionLevelCrossReference_1_0());
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerception"


    // $ANTLR start "entryRuleAction"
    // InternalBmod.g:761:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalBmod.g:761:47: (iv_ruleAction= ruleAction EOF )
            // InternalBmod.g:762:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalBmod.g:768:1: ruleAction returns [EObject current=null] : ( ( (lv_existing_0_0= ruleActionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_existing_0_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:774:2: ( ( ( (lv_existing_0_0= ruleActionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) ) )
            // InternalBmod.g:775:2: ( ( (lv_existing_0_0= ruleActionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) )
            {
            // InternalBmod.g:775:2: ( ( (lv_existing_0_0= ruleActionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=108 && LA5_0<=110)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_VARNAME) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBmod.g:776:3: ( (lv_existing_0_0= ruleActionEnum ) )
                    {
                    // InternalBmod.g:776:3: ( (lv_existing_0_0= ruleActionEnum ) )
                    // InternalBmod.g:777:4: (lv_existing_0_0= ruleActionEnum )
                    {
                    // InternalBmod.g:777:4: (lv_existing_0_0= ruleActionEnum )
                    // InternalBmod.g:778:5: lv_existing_0_0= ruleActionEnum
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getActionAccess().getExistingActionEnumEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_existing_0_0=ruleActionEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getActionRule());
                      					}
                      					set(
                      						current,
                      						"existing",
                      						lv_existing_0_0,
                      						"org.xtext.bmod.Bmod.ActionEnum");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:796:3: ( (otherlv_1= RULE_VARNAME ) )
                    {
                    // InternalBmod.g:796:3: ( (otherlv_1= RULE_VARNAME ) )
                    // InternalBmod.g:797:4: (otherlv_1= RULE_VARNAME )
                    {
                    // InternalBmod.g:797:4: (otherlv_1= RULE_VARNAME )
                    // InternalBmod.g:798:5: otherlv_1= RULE_VARNAME
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getActionRule());
                      					}
                      				
                    }
                    otherlv_1=(Token)match(input,RULE_VARNAME,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getActionAccess().getCustomActionProfileCrossReference_1_0());
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRulePerson"
    // InternalBmod.g:813:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalBmod.g:813:47: (iv_rulePerson= rulePerson EOF )
            // InternalBmod.g:814:2: iv_rulePerson= rulePerson EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPersonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePerson; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalBmod.g:820:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) otherlv_6= ':' ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_named_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_location_5_0 = null;

        EObject lv_perception_7_0 = null;

        EObject lv_action_9_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:826:2: ( (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) otherlv_6= ':' ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) ) ) )
            // InternalBmod.g:827:2: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) otherlv_6= ':' ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) ) )
            {
            // InternalBmod.g:827:2: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) otherlv_6= ':' ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) ) )
            // InternalBmod.g:828:3: otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) otherlv_6= ':' ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
              		
            }
            // InternalBmod.g:832:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:833:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:833:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:834:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameVARNAMETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPersonRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.bmod.Bmod.VARNAME");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getNamedKeyword_2());
              		
            }
            // InternalBmod.g:854:3: ( (lv_named_3_0= RULE_STRING ) )
            // InternalBmod.g:855:4: (lv_named_3_0= RULE_STRING )
            {
            // InternalBmod.g:855:4: (lv_named_3_0= RULE_STRING )
            // InternalBmod.g:856:5: lv_named_3_0= RULE_STRING
            {
            lv_named_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_named_3_0, grammarAccess.getPersonAccess().getNamedSTRINGTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPersonRule());
              					}
              					setWithLastConsumed(
              						current,
              						"named",
              						lv_named_3_0,
              						"org.eclipse.xtext.xbase.Xtype.STRING");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getInKeyword_4());
              		
            }
            // InternalBmod.g:876:3: ( (lv_location_5_0= ruleCoordinate ) )
            // InternalBmod.g:877:4: (lv_location_5_0= ruleCoordinate )
            {
            // InternalBmod.g:877:4: (lv_location_5_0= ruleCoordinate )
            // InternalBmod.g:878:5: lv_location_5_0= ruleCoordinate
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPersonAccess().getLocationCoordinateParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_location_5_0=ruleCoordinate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPersonRule());
              					}
              					set(
              						current,
              						"location",
              						lv_location_5_0,
              						"org.xtext.bmod.Bmod.Coordinate");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getColonKeyword_6());
              		
            }
            // InternalBmod.g:899:3: ( (lv_perception_7_0= rulePerception ) )
            // InternalBmod.g:900:4: (lv_perception_7_0= rulePerception )
            {
            // InternalBmod.g:900:4: (lv_perception_7_0= rulePerception )
            // InternalBmod.g:901:5: lv_perception_7_0= rulePerception
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPersonAccess().getPerceptionPerceptionParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_perception_7_0=rulePerception();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPersonRule());
              					}
              					set(
              						current,
              						"perception",
              						lv_perception_7_0,
              						"org.xtext.bmod.Bmod.Perception");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getCommaKeyword_8());
              		
            }
            // InternalBmod.g:922:3: ( (lv_action_9_0= ruleAction ) )
            // InternalBmod.g:923:4: (lv_action_9_0= ruleAction )
            {
            // InternalBmod.g:923:4: (lv_action_9_0= ruleAction )
            // InternalBmod.g:924:5: lv_action_9_0= ruleAction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPersonAccess().getActionActionParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_action_9_0=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPersonRule());
              					}
              					set(
              						current,
              						"action",
              						lv_action_9_0,
              						"org.xtext.bmod.Bmod.Action");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleExit"
    // InternalBmod.g:945:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // InternalBmod.g:945:45: (iv_ruleExit= ruleExit EOF )
            // InternalBmod.g:946:2: iv_ruleExit= ruleExit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExit=ruleExit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExit"


    // $ANTLR start "ruleExit"
    // InternalBmod.g:952:1: ruleExit returns [EObject current=null] : (otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_location_2_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:958:2: ( (otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) ) )
            // InternalBmod.g:959:2: (otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) )
            {
            // InternalBmod.g:959:2: (otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) )
            // InternalBmod.g:960:3: otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExitAccess().getExitKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExitAccess().getInKeyword_1());
              		
            }
            // InternalBmod.g:968:3: ( (lv_location_2_0= ruleCoordinate ) )
            // InternalBmod.g:969:4: (lv_location_2_0= ruleCoordinate )
            {
            // InternalBmod.g:969:4: (lv_location_2_0= ruleCoordinate )
            // InternalBmod.g:970:5: lv_location_2_0= ruleCoordinate
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExitAccess().getLocationCoordinateParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_location_2_0=ruleCoordinate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExitRule());
              					}
              					set(
              						current,
              						"location",
              						lv_location_2_0,
              						"org.xtext.bmod.Bmod.Coordinate");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExit"


    // $ANTLR start "entryRuleFire"
    // InternalBmod.g:991:1: entryRuleFire returns [EObject current=null] : iv_ruleFire= ruleFire EOF ;
    public final EObject entryRuleFire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFire = null;


        try {
            // InternalBmod.g:991:45: (iv_ruleFire= ruleFire EOF )
            // InternalBmod.g:992:2: iv_ruleFire= ruleFire EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFireRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFire=ruleFire();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFire; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFire"


    // $ANTLR start "ruleFire"
    // InternalBmod.g:998:1: ruleFire returns [EObject current=null] : (otherlv_0= 'Fire' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) ) ;
    public final EObject ruleFire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_location_2_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:1004:2: ( (otherlv_0= 'Fire' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) ) )
            // InternalBmod.g:1005:2: (otherlv_0= 'Fire' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) )
            {
            // InternalBmod.g:1005:2: (otherlv_0= 'Fire' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) )
            // InternalBmod.g:1006:3: otherlv_0= 'Fire' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFireAccess().getFireKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFireAccess().getInKeyword_1());
              		
            }
            // InternalBmod.g:1014:3: ( (lv_location_2_0= ruleCoordinate ) )
            // InternalBmod.g:1015:4: (lv_location_2_0= ruleCoordinate )
            {
            // InternalBmod.g:1015:4: (lv_location_2_0= ruleCoordinate )
            // InternalBmod.g:1016:5: lv_location_2_0= ruleCoordinate
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFireAccess().getLocationCoordinateParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_location_2_0=ruleCoordinate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFireRule());
              					}
              					set(
              						current,
              						"location",
              						lv_location_2_0,
              						"org.xtext.bmod.Bmod.Coordinate");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFire"


    // $ANTLR start "entryRuleEmergencySign"
    // InternalBmod.g:1037:1: entryRuleEmergencySign returns [EObject current=null] : iv_ruleEmergencySign= ruleEmergencySign EOF ;
    public final EObject entryRuleEmergencySign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmergencySign = null;


        try {
            // InternalBmod.g:1037:54: (iv_ruleEmergencySign= ruleEmergencySign EOF )
            // InternalBmod.g:1038:2: iv_ruleEmergencySign= ruleEmergencySign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmergencySignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmergencySign=ruleEmergencySign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmergencySign; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmergencySign"


    // $ANTLR start "ruleEmergencySign"
    // InternalBmod.g:1044:1: ruleEmergencySign returns [EObject current=null] : (otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_to_3_0= ruleDoorRef ) ) ) ;
    public final EObject ruleEmergencySign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_to_3_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:1050:2: ( (otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_to_3_0= ruleDoorRef ) ) ) )
            // InternalBmod.g:1051:2: (otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_to_3_0= ruleDoorRef ) ) )
            {
            // InternalBmod.g:1051:2: (otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_to_3_0= ruleDoorRef ) ) )
            // InternalBmod.g:1052:3: otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_to_3_0= ruleDoorRef ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEmergencySignAccess().getSignKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEmergencySignAccess().getOnKeyword_1());
              		
            }
            // InternalBmod.g:1060:3: ( (otherlv_2= RULE_VARNAME ) )
            // InternalBmod.g:1061:4: (otherlv_2= RULE_VARNAME )
            {
            // InternalBmod.g:1061:4: (otherlv_2= RULE_VARNAME )
            // InternalBmod.g:1062:5: otherlv_2= RULE_VARNAME
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEmergencySignRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_VARNAME,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getEmergencySignAccess().getOnDoorCrossReference_2_0());
              				
            }

            }


            }

            // InternalBmod.g:1073:3: ( (lv_to_3_0= ruleDoorRef ) )
            // InternalBmod.g:1074:4: (lv_to_3_0= ruleDoorRef )
            {
            // InternalBmod.g:1074:4: (lv_to_3_0= ruleDoorRef )
            // InternalBmod.g:1075:5: lv_to_3_0= ruleDoorRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEmergencySignAccess().getToDoorRefParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_to_3_0=ruleDoorRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEmergencySignRule());
              					}
              					set(
              						current,
              						"to",
              						lv_to_3_0,
              						"org.xtext.bmod.Bmod.DoorRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmergencySign"


    // $ANTLR start "entryRuleDoorRef"
    // InternalBmod.g:1096:1: entryRuleDoorRef returns [EObject current=null] : iv_ruleDoorRef= ruleDoorRef EOF ;
    public final EObject entryRuleDoorRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoorRef = null;


        try {
            // InternalBmod.g:1096:48: (iv_ruleDoorRef= ruleDoorRef EOF )
            // InternalBmod.g:1097:2: iv_ruleDoorRef= ruleDoorRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoorRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDoorRef=ruleDoorRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoorRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoorRef"


    // $ANTLR start "ruleDoorRef"
    // InternalBmod.g:1103:1: ruleDoorRef returns [EObject current=null] : (otherlv_0= 'to' ( (otherlv_1= RULE_VARNAME ) ) ) ;
    public final EObject ruleDoorRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBmod.g:1109:2: ( (otherlv_0= 'to' ( (otherlv_1= RULE_VARNAME ) ) ) )
            // InternalBmod.g:1110:2: (otherlv_0= 'to' ( (otherlv_1= RULE_VARNAME ) ) )
            {
            // InternalBmod.g:1110:2: (otherlv_0= 'to' ( (otherlv_1= RULE_VARNAME ) ) )
            // InternalBmod.g:1111:3: otherlv_0= 'to' ( (otherlv_1= RULE_VARNAME ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDoorRefAccess().getToKeyword_0());
              		
            }
            // InternalBmod.g:1115:3: ( (otherlv_1= RULE_VARNAME ) )
            // InternalBmod.g:1116:4: (otherlv_1= RULE_VARNAME )
            {
            // InternalBmod.g:1116:4: (otherlv_1= RULE_VARNAME )
            // InternalBmod.g:1117:5: otherlv_1= RULE_VARNAME
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDoorRefRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_VARNAME,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDoorRefAccess().getRefDoorCrossReference_1_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoorRef"


    // $ANTLR start "entryRuleDangerousCondition"
    // InternalBmod.g:1132:1: entryRuleDangerousCondition returns [EObject current=null] : iv_ruleDangerousCondition= ruleDangerousCondition EOF ;
    public final EObject entryRuleDangerousCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDangerousCondition = null;


        try {
            // InternalBmod.g:1132:59: (iv_ruleDangerousCondition= ruleDangerousCondition EOF )
            // InternalBmod.g:1133:2: iv_ruleDangerousCondition= ruleDangerousCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDangerousConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDangerousCondition=ruleDangerousCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDangerousCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDangerousCondition"


    // $ANTLR start "ruleDangerousCondition"
    // InternalBmod.g:1139:1: ruleDangerousCondition returns [EObject current=null] : (otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) ) ) ;
    public final EObject ruleDangerousCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_amount_3_0=null;


        	enterRule();

        try {
            // InternalBmod.g:1145:2: ( (otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) ) ) )
            // InternalBmod.g:1146:2: (otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) ) )
            {
            // InternalBmod.g:1146:2: (otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) ) )
            // InternalBmod.g:1147:3: otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDangerousConditionAccess().getConditionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDangerousConditionAccess().getOnKeyword_1());
              		
            }
            // InternalBmod.g:1155:3: ( (otherlv_2= RULE_VARNAME ) )
            // InternalBmod.g:1156:4: (otherlv_2= RULE_VARNAME )
            {
            // InternalBmod.g:1156:4: (otherlv_2= RULE_VARNAME )
            // InternalBmod.g:1157:5: otherlv_2= RULE_VARNAME
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDangerousConditionRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_VARNAME,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDangerousConditionAccess().getOnRoomCrossReference_2_0());
              				
            }

            }


            }

            // InternalBmod.g:1168:3: ( (lv_amount_3_0= RULE_INT ) )
            // InternalBmod.g:1169:4: (lv_amount_3_0= RULE_INT )
            {
            // InternalBmod.g:1169:4: (lv_amount_3_0= RULE_INT )
            // InternalBmod.g:1170:5: lv_amount_3_0= RULE_INT
            {
            lv_amount_3_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_amount_3_0, grammarAccess.getDangerousConditionAccess().getAmountINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDangerousConditionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"amount",
              						lv_amount_3_0,
              						"org.eclipse.xtext.xbase.Xbase.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDangerousCondition"


    // $ANTLR start "entryRuleCoordinate"
    // InternalBmod.g:1190:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalBmod.g:1190:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalBmod.g:1191:2: iv_ruleCoordinate= ruleCoordinate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoordinateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCoordinate=ruleCoordinate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoordinate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoordinate"


    // $ANTLR start "ruleCoordinate"
    // InternalBmod.g:1197:1: ruleCoordinate returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBmod.g:1203:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalBmod.g:1204:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalBmod.g:1204:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalBmod.g:1205:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalBmod.g:1209:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalBmod.g:1210:4: (lv_x_1_0= RULE_INT )
            {
            // InternalBmod.g:1210:4: (lv_x_1_0= RULE_INT )
            // InternalBmod.g:1211:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_x_1_0, grammarAccess.getCoordinateAccess().getXINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCoordinateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"x",
              						lv_x_1_0,
              						"org.eclipse.xtext.xbase.Xbase.INT");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCoordinateAccess().getCommaKeyword_2());
              		
            }
            // InternalBmod.g:1231:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalBmod.g:1232:4: (lv_y_3_0= RULE_INT )
            {
            // InternalBmod.g:1232:4: (lv_y_3_0= RULE_INT )
            // InternalBmod.g:1233:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_y_3_0, grammarAccess.getCoordinateAccess().getYINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCoordinateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"y",
              						lv_y_3_0,
              						"org.eclipse.xtext.xbase.Xbase.INT");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoordinate"


    // $ANTLR start "entryRuleArea"
    // InternalBmod.g:1257:1: entryRuleArea returns [EObject current=null] : iv_ruleArea= ruleArea EOF ;
    public final EObject entryRuleArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArea = null;


        try {
            // InternalBmod.g:1257:45: (iv_ruleArea= ruleArea EOF )
            // InternalBmod.g:1258:2: iv_ruleArea= ruleArea EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAreaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArea=ruleArea();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArea; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalBmod.g:1264:1: ruleArea returns [EObject current=null] : (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? ) ;
    public final EObject ruleArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_from_1_0 = null;

        EObject lv_to_3_0 = null;

        EObject lv_without_5_0 = null;

        EObject lv_without_7_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:1270:2: ( (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? ) )
            // InternalBmod.g:1271:2: (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? )
            {
            // InternalBmod.g:1271:2: (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? )
            // InternalBmod.g:1272:3: otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAreaAccess().getFromKeyword_0());
              		
            }
            // InternalBmod.g:1276:3: ( (lv_from_1_0= ruleCoordinate ) )
            // InternalBmod.g:1277:4: (lv_from_1_0= ruleCoordinate )
            {
            // InternalBmod.g:1277:4: (lv_from_1_0= ruleCoordinate )
            // InternalBmod.g:1278:5: lv_from_1_0= ruleCoordinate
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAreaAccess().getFromCoordinateParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_from_1_0=ruleCoordinate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAreaRule());
              					}
              					set(
              						current,
              						"from",
              						lv_from_1_0,
              						"org.xtext.bmod.Bmod.Coordinate");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAreaAccess().getToKeyword_2());
              		
            }
            // InternalBmod.g:1299:3: ( (lv_to_3_0= ruleCoordinate ) )
            // InternalBmod.g:1300:4: (lv_to_3_0= ruleCoordinate )
            {
            // InternalBmod.g:1300:4: (lv_to_3_0= ruleCoordinate )
            // InternalBmod.g:1301:5: lv_to_3_0= ruleCoordinate
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAreaAccess().getToCoordinateParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_to_3_0=ruleCoordinate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAreaRule());
              					}
              					set(
              						current,
              						"to",
              						lv_to_3_0,
              						"org.xtext.bmod.Bmod.Coordinate");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBmod.g:1318:3: (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBmod.g:1319:4: otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )*
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAreaAccess().getWithoutKeyword_4_0());
                      			
                    }
                    // InternalBmod.g:1323:4: ( (lv_without_5_0= ruleCoordinate ) )
                    // InternalBmod.g:1324:5: (lv_without_5_0= ruleCoordinate )
                    {
                    // InternalBmod.g:1324:5: (lv_without_5_0= ruleCoordinate )
                    // InternalBmod.g:1325:6: lv_without_5_0= ruleCoordinate
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_without_5_0=ruleCoordinate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAreaRule());
                      						}
                      						add(
                      							current,
                      							"without",
                      							lv_without_5_0,
                      							"org.xtext.bmod.Bmod.Coordinate");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBmod.g:1342:4: (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==22) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBmod.g:1343:5: otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getAreaAccess().getCommaKeyword_4_2_0());
                    	      				
                    	    }
                    	    // InternalBmod.g:1347:5: ( (lv_without_7_0= ruleCoordinate ) )
                    	    // InternalBmod.g:1348:6: (lv_without_7_0= ruleCoordinate )
                    	    {
                    	    // InternalBmod.g:1348:6: (lv_without_7_0= ruleCoordinate )
                    	    // InternalBmod.g:1349:7: lv_without_7_0= ruleCoordinate
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_22);
                    	    lv_without_7_0=ruleCoordinate();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAreaRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"without",
                    	      								lv_without_7_0,
                    	      								"org.xtext.bmod.Bmod.Coordinate");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArea"


    // $ANTLR start "entryRuleXExpression"
    // InternalBmod.g:1372:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // InternalBmod.g:1372:52: (iv_ruleXExpression= ruleXExpression EOF )
            // InternalBmod.g:1373:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // InternalBmod.g:1379:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:1385:2: (this_XAssignment_0= ruleXAssignment )
            // InternalBmod.g:1386:2: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_XAssignment_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // InternalBmod.g:1397:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // InternalBmod.g:1397:52: (iv_ruleXAssignment= ruleXAssignment EOF )
            // InternalBmod.g:1398:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // InternalBmod.g:1404:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:1410:2: ( ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // InternalBmod.g:1411:2: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // InternalBmod.g:1411:2: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==34) ) {
                    alt9=1;
                }
                else if ( (LA9_1==EOF||(LA9_1>=RULE_STRING && LA9_1<=RULE_ID)||(LA9_1>=21 && LA9_1<=23)||LA9_1==27||(LA9_1>=35 && LA9_1<=73)||(LA9_1>=75 && LA9_1<=101)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 86:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==34) ) {
                    alt9=1;
                }
                else if ( (LA9_2==EOF||(LA9_2>=RULE_STRING && LA9_2<=RULE_ID)||(LA9_2>=21 && LA9_2<=23)||LA9_2==27||(LA9_2>=35 && LA9_2<=73)||(LA9_2>=75 && LA9_2<=101)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 87:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==34) ) {
                    alt9=1;
                }
                else if ( (LA9_3==EOF||(LA9_3>=RULE_STRING && LA9_3<=RULE_ID)||(LA9_3>=21 && LA9_3<=23)||LA9_3==27||(LA9_3>=35 && LA9_3<=73)||(LA9_3>=75 && LA9_3<=101)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 88:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==34) ) {
                    alt9=1;
                }
                else if ( (LA9_4==EOF||(LA9_4>=RULE_STRING && LA9_4<=RULE_ID)||(LA9_4>=21 && LA9_4<=23)||LA9_4==27||(LA9_4>=35 && LA9_4<=73)||(LA9_4>=75 && LA9_4<=101)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case 89:
                {
                int LA9_5 = input.LA(2);

                if ( (LA9_5==34) ) {
                    alt9=1;
                }
                else if ( (LA9_5==EOF||(LA9_5>=RULE_STRING && LA9_5<=RULE_ID)||(LA9_5>=21 && LA9_5<=23)||LA9_5==27||(LA9_5>=35 && LA9_5<=73)||(LA9_5>=75 && LA9_5<=101)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
            case 21:
            case 40:
            case 56:
            case 57:
            case 62:
            case 69:
            case 70:
            case 72:
            case 76:
            case 78:
            case 81:
            case 82:
            case 83:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 100:
                {
                alt9=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBmod.g:1412:3: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // InternalBmod.g:1412:3: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // InternalBmod.g:1413:4: () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // InternalBmod.g:1413:4: ()
                    // InternalBmod.g:1414:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalBmod.g:1420:4: ( ( ruleFeatureCallID ) )
                    // InternalBmod.g:1421:5: ( ruleFeatureCallID )
                    {
                    // InternalBmod.g:1421:5: ( ruleFeatureCallID )
                    // InternalBmod.g:1422:6: ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXAssignmentRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_24);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalBmod.g:1443:4: ( (lv_value_3_0= ruleXAssignment ) )
                    // InternalBmod.g:1444:5: (lv_value_3_0= ruleXAssignment )
                    {
                    // InternalBmod.g:1444:5: (lv_value_3_0= ruleXAssignment )
                    // InternalBmod.g:1445:6: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.eclipse.xtext.xbase.Xbase.XAssignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:1464:3: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // InternalBmod.g:1464:3: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // InternalBmod.g:1465:4: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_25);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_XOrExpression_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalBmod.g:1473:4: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt8=2;
                    alt8 = dfa8.predict(input);
                    switch (alt8) {
                        case 1 :
                            // InternalBmod.g:1474:5: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // InternalBmod.g:1474:5: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // InternalBmod.g:1475:6: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // InternalBmod.g:1485:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // InternalBmod.g:1486:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // InternalBmod.g:1486:7: ()
                            // InternalBmod.g:1487:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElementAndSet(
                              									grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                              									current);
                              							
                            }

                            }

                            // InternalBmod.g:1493:7: ( ( ruleOpMultiAssign ) )
                            // InternalBmod.g:1494:8: ( ruleOpMultiAssign )
                            {
                            // InternalBmod.g:1494:8: ( ruleOpMultiAssign )
                            // InternalBmod.g:1495:9: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElement(grammarAccess.getXAssignmentRule());
                              									}
                              								
                            }
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0());
                              								
                            }
                            pushFollow(FOLLOW_24);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }


                            }


                            }

                            // InternalBmod.g:1511:5: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // InternalBmod.g:1512:6: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // InternalBmod.g:1512:6: (lv_rightOperand_7_0= ruleXAssignment )
                            // InternalBmod.g:1513:7: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              							}
                              							set(
                              								current,
                              								"rightOperand",
                              								lv_rightOperand_7_0,
                              								"org.eclipse.xtext.xbase.Xbase.XAssignment");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // InternalBmod.g:1536:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // InternalBmod.g:1536:54: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // InternalBmod.g:1537:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // InternalBmod.g:1543:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBmod.g:1549:2: (kw= '=' )
            // InternalBmod.g:1550:2: kw= '='
            {
            kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // InternalBmod.g:1558:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // InternalBmod.g:1558:53: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // InternalBmod.g:1559:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // InternalBmod.g:1565:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) ) ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBmod.g:1571:2: ( (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) ) )
            // InternalBmod.g:1572:2: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) )
            {
            // InternalBmod.g:1572:2: (kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | (kw= '<' kw= '<' kw= '=' ) | (kw= '>' (kw= '>' )? kw= '>=' ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt11=1;
                }
                break;
            case 36:
                {
                alt11=2;
                }
                break;
            case 37:
                {
                alt11=3;
                }
                break;
            case 38:
                {
                alt11=4;
                }
                break;
            case 39:
                {
                alt11=5;
                }
                break;
            case 40:
                {
                alt11=6;
                }
                break;
            case 41:
                {
                alt11=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalBmod.g:1573:3: kw= '+='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:1579:3: kw= '-='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getHyphenMinusEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBmod.g:1585:3: kw= '*='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getAsteriskEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBmod.g:1591:3: kw= '/='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getSolidusEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalBmod.g:1597:3: kw= '%='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPercentSignEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalBmod.g:1603:3: (kw= '<' kw= '<' kw= '=' )
                    {
                    // InternalBmod.g:1603:3: (kw= '<' kw= '<' kw= '=' )
                    // InternalBmod.g:1604:4: kw= '<' kw= '<' kw= '='
                    {
                    kw=(Token)match(input,40,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getLessThanSignKeyword_5_0());
                      			
                    }
                    kw=(Token)match(input,40,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getLessThanSignKeyword_5_1());
                      			
                    }
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getEqualsSignKeyword_5_2());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalBmod.g:1621:3: (kw= '>' (kw= '>' )? kw= '>=' )
                    {
                    // InternalBmod.g:1621:3: (kw= '>' (kw= '>' )? kw= '>=' )
                    // InternalBmod.g:1622:4: kw= '>' (kw= '>' )? kw= '>='
                    {
                    kw=(Token)match(input,41,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getGreaterThanSignKeyword_6_0());
                      			
                    }
                    // InternalBmod.g:1627:4: (kw= '>' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==41) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalBmod.g:1628:5: kw= '>'
                            {
                            kw=(Token)match(input,41,FOLLOW_28); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getGreaterThanSignKeyword_6_1());
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getGreaterThanSignEqualsSignKeyword_6_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // InternalBmod.g:1644:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // InternalBmod.g:1644:54: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // InternalBmod.g:1645:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // InternalBmod.g:1651:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:1657:2: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // InternalBmod.g:1658:2: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // InternalBmod.g:1658:2: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // InternalBmod.g:1659:3: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBmod.g:1667:3: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==43) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred2_InternalBmod()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalBmod.g:1668:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // InternalBmod.g:1668:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // InternalBmod.g:1669:5: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // InternalBmod.g:1679:5: ( () ( ( ruleOpOr ) ) )
            	    // InternalBmod.g:1680:6: () ( ( ruleOpOr ) )
            	    {
            	    // InternalBmod.g:1680:6: ()
            	    // InternalBmod.g:1681:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalBmod.g:1687:6: ( ( ruleOpOr ) )
            	    // InternalBmod.g:1688:7: ( ruleOpOr )
            	    {
            	    // InternalBmod.g:1688:7: ( ruleOpOr )
            	    // InternalBmod.g:1689:8: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_24);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalBmod.g:1705:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // InternalBmod.g:1706:5: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // InternalBmod.g:1706:5: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // InternalBmod.g:1707:6: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XAndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // InternalBmod.g:1729:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // InternalBmod.g:1729:44: (iv_ruleOpOr= ruleOpOr EOF )
            // InternalBmod.g:1730:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // InternalBmod.g:1736:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBmod.g:1742:2: (kw= '||' )
            // InternalBmod.g:1743:2: kw= '||'
            {
            kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // InternalBmod.g:1751:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // InternalBmod.g:1751:55: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // InternalBmod.g:1752:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // InternalBmod.g:1758:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:1764:2: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // InternalBmod.g:1765:2: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // InternalBmod.g:1765:2: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // InternalBmod.g:1766:3: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_30);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBmod.g:1774:3: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==44) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred3_InternalBmod()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalBmod.g:1775:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // InternalBmod.g:1775:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // InternalBmod.g:1776:5: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // InternalBmod.g:1786:5: ( () ( ( ruleOpAnd ) ) )
            	    // InternalBmod.g:1787:6: () ( ( ruleOpAnd ) )
            	    {
            	    // InternalBmod.g:1787:6: ()
            	    // InternalBmod.g:1788:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalBmod.g:1794:6: ( ( ruleOpAnd ) )
            	    // InternalBmod.g:1795:7: ( ruleOpAnd )
            	    {
            	    // InternalBmod.g:1795:7: ( ruleOpAnd )
            	    // InternalBmod.g:1796:8: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_24);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalBmod.g:1812:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // InternalBmod.g:1813:5: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // InternalBmod.g:1813:5: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // InternalBmod.g:1814:6: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XEqualityExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // InternalBmod.g:1836:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // InternalBmod.g:1836:45: (iv_ruleOpAnd= ruleOpAnd EOF )
            // InternalBmod.g:1837:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // InternalBmod.g:1843:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBmod.g:1849:2: (kw= '&&' )
            // InternalBmod.g:1850:2: kw= '&&'
            {
            kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // InternalBmod.g:1858:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // InternalBmod.g:1858:60: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // InternalBmod.g:1859:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // InternalBmod.g:1865:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:1871:2: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // InternalBmod.g:1872:2: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // InternalBmod.g:1872:2: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // InternalBmod.g:1873:3: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBmod.g:1881:3: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred4_InternalBmod()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred4_InternalBmod()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred4_InternalBmod()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA14_5 = input.LA(2);

                    if ( (synpred4_InternalBmod()) ) {
                        alt14=1;
                    }


                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // InternalBmod.g:1882:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // InternalBmod.g:1882:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // InternalBmod.g:1883:5: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // InternalBmod.g:1893:5: ( () ( ( ruleOpEquality ) ) )
            	    // InternalBmod.g:1894:6: () ( ( ruleOpEquality ) )
            	    {
            	    // InternalBmod.g:1894:6: ()
            	    // InternalBmod.g:1895:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalBmod.g:1901:6: ( ( ruleOpEquality ) )
            	    // InternalBmod.g:1902:7: ( ruleOpEquality )
            	    {
            	    // InternalBmod.g:1902:7: ( ruleOpEquality )
            	    // InternalBmod.g:1903:8: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_24);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalBmod.g:1919:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // InternalBmod.g:1920:5: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // InternalBmod.g:1920:5: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // InternalBmod.g:1921:6: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XRelationalExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // InternalBmod.g:1943:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // InternalBmod.g:1943:50: (iv_ruleOpEquality= ruleOpEquality EOF )
            // InternalBmod.g:1944:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // InternalBmod.g:1950:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBmod.g:1956:2: ( (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' ) )
            // InternalBmod.g:1957:2: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            {
            // InternalBmod.g:1957:2: (kw= '==' | kw= '!=' | kw= '===' | kw= '!==' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt15=1;
                }
                break;
            case 46:
                {
                alt15=2;
                }
                break;
            case 47:
                {
                alt15=3;
                }
                break;
            case 48:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalBmod.g:1958:3: kw= '=='
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:1964:3: kw= '!='
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBmod.g:1970:3: kw= '==='
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBmod.g:1976:3: kw= '!=='
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // InternalBmod.g:1985:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // InternalBmod.g:1985:62: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // InternalBmod.g:1986:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // InternalBmod.g:1992:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:1998:2: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // InternalBmod.g:1999:2: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // InternalBmod.g:1999:2: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // InternalBmod.g:2000:3: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBmod.g:2008:3: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop16:
            do {
                int alt16=3;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred6_InternalBmod()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred6_InternalBmod()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred5_InternalBmod()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred6_InternalBmod()) ) {
                        alt16=2;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalBmod.g:2009:4: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // InternalBmod.g:2009:4: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // InternalBmod.g:2010:5: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // InternalBmod.g:2010:5: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // InternalBmod.g:2011:6: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // InternalBmod.g:2017:6: ( () otherlv_2= 'instanceof' )
            	    // InternalBmod.g:2018:7: () otherlv_2= 'instanceof'
            	    {
            	    // InternalBmod.g:2018:7: ()
            	    // InternalBmod.g:2019:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalBmod.g:2031:5: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // InternalBmod.g:2032:6: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // InternalBmod.g:2032:6: (lv_type_3_0= ruleJvmTypeReference )
            	    // InternalBmod.g:2033:7: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"type",
            	      								lv_type_3_0,
            	      								"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBmod.g:2052:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // InternalBmod.g:2052:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // InternalBmod.g:2053:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // InternalBmod.g:2053:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // InternalBmod.g:2054:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // InternalBmod.g:2064:6: ( () ( ( ruleOpCompare ) ) )
            	    // InternalBmod.g:2065:7: () ( ( ruleOpCompare ) )
            	    {
            	    // InternalBmod.g:2065:7: ()
            	    // InternalBmod.g:2066:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalBmod.g:2072:7: ( ( ruleOpCompare ) )
            	    // InternalBmod.g:2073:8: ( ruleOpCompare )
            	    {
            	    // InternalBmod.g:2073:8: ( ruleOpCompare )
            	    // InternalBmod.g:2074:9: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      									}
            	      								
            	    }
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_24);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									afterParserOrEnumRuleCall();
            	      								
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalBmod.g:2090:5: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // InternalBmod.g:2091:6: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // InternalBmod.g:2091:6: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // InternalBmod.g:2092:7: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rightOperand",
            	      								lv_rightOperand_6_0,
            	      								"org.eclipse.xtext.xbase.Xbase.XOtherOperatorExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // InternalBmod.g:2115:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // InternalBmod.g:2115:49: (iv_ruleOpCompare= ruleOpCompare EOF )
            // InternalBmod.g:2116:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // InternalBmod.g:2122:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBmod.g:2128:2: ( (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' ) )
            // InternalBmod.g:2129:2: (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' )
            {
            // InternalBmod.g:2129:2: (kw= '>=' | (kw= '<' kw= '=' ) | kw= '>' | kw= '<' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt17=1;
                }
                break;
            case 40:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==34) ) {
                    alt17=2;
                }
                else if ( (LA17_2==EOF||(LA17_2>=RULE_STRING && LA17_2<=RULE_ID)||LA17_2==21||LA17_2==40||(LA17_2>=56 && LA17_2<=57)||LA17_2==62||(LA17_2>=69 && LA17_2<=70)||LA17_2==72||LA17_2==76||LA17_2==78||(LA17_2>=81 && LA17_2<=83)||(LA17_2>=86 && LA17_2<=98)||LA17_2==100) ) {
                    alt17=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalBmod.g:2130:3: kw= '>='
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:2136:3: (kw= '<' kw= '=' )
                    {
                    // InternalBmod.g:2136:3: (kw= '<' kw= '=' )
                    // InternalBmod.g:2137:4: kw= '<' kw= '='
                    {
                    kw=(Token)match(input,40,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpCompareAccess().getEqualsSignKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:2149:3: kw= '>'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBmod.g:2155:3: kw= '<'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // InternalBmod.g:2164:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // InternalBmod.g:2164:65: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // InternalBmod.g:2165:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // InternalBmod.g:2171:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:2177:2: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // InternalBmod.g:2178:2: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // InternalBmod.g:2178:2: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // InternalBmod.g:2179:3: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBmod.g:2187:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalBmod.g:2188:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // InternalBmod.g:2188:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // InternalBmod.g:2189:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // InternalBmod.g:2199:5: ( () ( ( ruleOpOther ) ) )
            	    // InternalBmod.g:2200:6: () ( ( ruleOpOther ) )
            	    {
            	    // InternalBmod.g:2200:6: ()
            	    // InternalBmod.g:2201:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalBmod.g:2207:6: ( ( ruleOpOther ) )
            	    // InternalBmod.g:2208:7: ( ruleOpOther )
            	    {
            	    // InternalBmod.g:2208:7: ( ruleOpOther )
            	    // InternalBmod.g:2209:8: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_24);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalBmod.g:2225:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // InternalBmod.g:2226:5: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // InternalBmod.g:2226:5: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // InternalBmod.g:2227:6: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XAdditiveExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // InternalBmod.g:2249:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // InternalBmod.g:2249:47: (iv_ruleOpOther= ruleOpOther EOF )
            // InternalBmod.g:2250:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // InternalBmod.g:2256:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBmod.g:2262:2: ( (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' ) )
            // InternalBmod.g:2263:2: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' )
            {
            // InternalBmod.g:2263:2: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' )
            int alt21=9;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalBmod.g:2264:3: kw= '->'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:2270:3: kw= '..<'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopLessThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBmod.g:2276:3: (kw= '>' kw= '..' )
                    {
                    // InternalBmod.g:2276:3: (kw= '>' kw= '..' )
                    // InternalBmod.g:2277:4: kw= '>' kw= '..'
                    {
                    kw=(Token)match(input,41,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_2_0());
                      			
                    }
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBmod.g:2289:3: kw= '..'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalBmod.g:2295:3: kw= '=>'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalBmod.g:2301:3: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // InternalBmod.g:2301:3: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // InternalBmod.g:2302:4: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,41,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_0());
                      			
                    }
                    // InternalBmod.g:2307:4: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==41) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==EOF||(LA19_1>=RULE_STRING && LA19_1<=RULE_ID)||LA19_1==21||LA19_1==40||(LA19_1>=56 && LA19_1<=57)||LA19_1==62||(LA19_1>=69 && LA19_1<=70)||LA19_1==72||LA19_1==76||LA19_1==78||(LA19_1>=81 && LA19_1<=83)||(LA19_1>=86 && LA19_1<=98)||LA19_1==100) ) {
                            alt19=2;
                        }
                        else if ( (LA19_1==41) && (synpred8_InternalBmod())) {
                            alt19=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalBmod.g:2308:5: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // InternalBmod.g:2308:5: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // InternalBmod.g:2309:6: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // InternalBmod.g:2314:6: (kw= '>' kw= '>' )
                            // InternalBmod.g:2315:7: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,41,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(kw);
                              							newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_0());
                              						
                            }
                            kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(kw);
                              							newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_1());
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalBmod.g:2328:5: kw= '>'
                            {
                            kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalBmod.g:2336:3: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) )
                    {
                    // InternalBmod.g:2336:3: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) )
                    // InternalBmod.g:2337:4: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' )
                    {
                    kw=(Token)match(input,40,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_0());
                      			
                    }
                    // InternalBmod.g:2342:4: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' )
                    int alt20=3;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==40) ) {
                        int LA20_1 = input.LA(2);

                        if ( (synpred9_InternalBmod()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA20_0==53) ) {
                        alt20=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalBmod.g:2343:5: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // InternalBmod.g:2343:5: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // InternalBmod.g:2344:6: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // InternalBmod.g:2349:6: (kw= '<' kw= '<' )
                            // InternalBmod.g:2350:7: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,40,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(kw);
                              							newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_0());
                              						
                            }
                            kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(kw);
                              							newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_1());
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalBmod.g:2363:5: kw= '<'
                            {
                            kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_1());
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalBmod.g:2369:5: kw= '=>'
                            {
                            kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_6_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalBmod.g:2377:3: kw= '<>'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalBmod.g:2383:3: kw= '?:'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_8());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // InternalBmod.g:2392:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // InternalBmod.g:2392:60: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // InternalBmod.g:2393:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // InternalBmod.g:2399:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:2405:2: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // InternalBmod.g:2406:2: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // InternalBmod.g:2406:2: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // InternalBmod.g:2407:3: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBmod.g:2415:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==56) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred10_InternalBmod()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==57) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred10_InternalBmod()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalBmod.g:2416:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // InternalBmod.g:2416:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // InternalBmod.g:2417:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // InternalBmod.g:2427:5: ( () ( ( ruleOpAdd ) ) )
            	    // InternalBmod.g:2428:6: () ( ( ruleOpAdd ) )
            	    {
            	    // InternalBmod.g:2428:6: ()
            	    // InternalBmod.g:2429:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalBmod.g:2435:6: ( ( ruleOpAdd ) )
            	    // InternalBmod.g:2436:7: ( ruleOpAdd )
            	    {
            	    // InternalBmod.g:2436:7: ( ruleOpAdd )
            	    // InternalBmod.g:2437:8: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_24);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalBmod.g:2453:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // InternalBmod.g:2454:5: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // InternalBmod.g:2454:5: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // InternalBmod.g:2455:6: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XMultiplicativeExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // InternalBmod.g:2477:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // InternalBmod.g:2477:45: (iv_ruleOpAdd= ruleOpAdd EOF )
            // InternalBmod.g:2478:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // InternalBmod.g:2484:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBmod.g:2490:2: ( (kw= '+' | kw= '-' ) )
            // InternalBmod.g:2491:2: (kw= '+' | kw= '-' )
            {
            // InternalBmod.g:2491:2: (kw= '+' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==56) ) {
                alt23=1;
            }
            else if ( (LA23_0==57) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalBmod.g:2492:3: kw= '+'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:2498:3: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // InternalBmod.g:2507:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // InternalBmod.g:2507:66: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // InternalBmod.g:2508:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // InternalBmod.g:2514:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:2520:2: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // InternalBmod.g:2521:2: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // InternalBmod.g:2521:2: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // InternalBmod.g:2522:3: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBmod.g:2530:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 58:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred11_InternalBmod()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 59:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred11_InternalBmod()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 60:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred11_InternalBmod()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 61:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred11_InternalBmod()) ) {
                        alt24=1;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // InternalBmod.g:2531:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // InternalBmod.g:2531:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // InternalBmod.g:2532:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // InternalBmod.g:2542:5: ( () ( ( ruleOpMulti ) ) )
            	    // InternalBmod.g:2543:6: () ( ( ruleOpMulti ) )
            	    {
            	    // InternalBmod.g:2543:6: ()
            	    // InternalBmod.g:2544:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalBmod.g:2550:6: ( ( ruleOpMulti ) )
            	    // InternalBmod.g:2551:7: ( ruleOpMulti )
            	    {
            	    // InternalBmod.g:2551:7: ( ruleOpMulti )
            	    // InternalBmod.g:2552:8: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      								}
            	      							
            	    }
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_24);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalBmod.g:2568:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // InternalBmod.g:2569:5: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // InternalBmod.g:2569:5: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // InternalBmod.g:2570:6: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XUnaryOperation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // InternalBmod.g:2592:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // InternalBmod.g:2592:47: (iv_ruleOpMulti= ruleOpMulti EOF )
            // InternalBmod.g:2593:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // InternalBmod.g:2599:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBmod.g:2605:2: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // InternalBmod.g:2606:2: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // InternalBmod.g:2606:2: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt25=1;
                }
                break;
            case 59:
                {
                alt25=2;
                }
                break;
            case 60:
                {
                alt25=3;
                }
                break;
            case 61:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalBmod.g:2607:3: kw= '*'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:2613:3: kw= '**'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBmod.g:2619:3: kw= '/'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBmod.g:2625:3: kw= '%'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // InternalBmod.g:2634:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // InternalBmod.g:2634:56: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // InternalBmod.g:2635:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // InternalBmod.g:2641:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;



        	enterRule();

        try {
            // InternalBmod.g:2647:2: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // InternalBmod.g:2648:2: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // InternalBmod.g:2648:2: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=56 && LA26_0<=57)||LA26_0==62) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||LA26_0==21||LA26_0==40||(LA26_0>=69 && LA26_0<=70)||LA26_0==72||LA26_0==76||LA26_0==78||(LA26_0>=81 && LA26_0<=83)||(LA26_0>=86 && LA26_0<=98)||LA26_0==100) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalBmod.g:2649:3: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    {
                    // InternalBmod.g:2649:3: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    // InternalBmod.g:2650:4: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    {
                    // InternalBmod.g:2650:4: ()
                    // InternalBmod.g:2651:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalBmod.g:2657:4: ( ( ruleOpUnary ) )
                    // InternalBmod.g:2658:5: ( ruleOpUnary )
                    {
                    // InternalBmod.g:2658:5: ( ruleOpUnary )
                    // InternalBmod.g:2659:6: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBmod.g:2673:4: ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    // InternalBmod.g:2674:5: (lv_operand_2_0= ruleXUnaryOperation )
                    {
                    // InternalBmod.g:2674:5: (lv_operand_2_0= ruleXUnaryOperation )
                    // InternalBmod.g:2675:6: lv_operand_2_0= ruleXUnaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXUnaryOperationParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleXUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_2_0,
                      							"org.eclipse.xtext.xbase.Xbase.XUnaryOperation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:2694:3: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XCastedExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // InternalBmod.g:2706:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // InternalBmod.g:2706:47: (iv_ruleOpUnary= ruleOpUnary EOF )
            // InternalBmod.g:2707:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // InternalBmod.g:2713:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBmod.g:2719:2: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // InternalBmod.g:2720:2: (kw= '!' | kw= '-' | kw= '+' )
            {
            // InternalBmod.g:2720:2: (kw= '!' | kw= '-' | kw= '+' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt27=1;
                }
                break;
            case 57:
                {
                alt27=2;
                }
                break;
            case 56:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalBmod.g:2721:3: kw= '!'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:2727:3: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBmod.g:2733:3: kw= '+'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // InternalBmod.g:2742:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // InternalBmod.g:2742:58: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // InternalBmod.g:2743:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // InternalBmod.g:2749:1: ruleXCastedExpression returns [EObject current=null] : (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XPostfixOperation_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:2755:2: ( (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // InternalBmod.g:2756:2: (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // InternalBmod.g:2756:2: (this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // InternalBmod.g:2757:3: this_XPostfixOperation_0= ruleXPostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXPostfixOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_XPostfixOperation_0=ruleXPostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XPostfixOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBmod.g:2765:3: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==63) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred12_InternalBmod()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalBmod.g:2766:4: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // InternalBmod.g:2766:4: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // InternalBmod.g:2767:5: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // InternalBmod.g:2773:5: ( () otherlv_2= 'as' )
            	    // InternalBmod.g:2774:6: () otherlv_2= 'as'
            	    {
            	    // InternalBmod.g:2774:6: ()
            	    // InternalBmod.g:2775:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,63,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBmod.g:2787:4: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // InternalBmod.g:2788:5: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // InternalBmod.g:2788:5: (lv_type_3_0= ruleJvmTypeReference )
            	    // InternalBmod.g:2789:6: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"type",
            	      							lv_type_3_0,
            	      							"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXPostfixOperation"
    // InternalBmod.g:2811:1: entryRuleXPostfixOperation returns [EObject current=null] : iv_ruleXPostfixOperation= ruleXPostfixOperation EOF ;
    public final EObject entryRuleXPostfixOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPostfixOperation = null;


        try {
            // InternalBmod.g:2811:58: (iv_ruleXPostfixOperation= ruleXPostfixOperation EOF )
            // InternalBmod.g:2812:2: iv_ruleXPostfixOperation= ruleXPostfixOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPostfixOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXPostfixOperation=ruleXPostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPostfixOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPostfixOperation"


    // $ANTLR start "ruleXPostfixOperation"
    // InternalBmod.g:2818:1: ruleXPostfixOperation returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? ) ;
    public final EObject ruleXPostfixOperation() throws RecognitionException {
        EObject current = null;

        EObject this_XMemberFeatureCall_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:2824:2: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? ) )
            // InternalBmod.g:2825:2: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? )
            {
            // InternalBmod.g:2825:2: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )? )
            // InternalBmod.g:2826:3: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXPostfixOperationAccess().getXMemberFeatureCallParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XMemberFeatureCall_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBmod.g:2834:3: ( ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==64) ) {
                int LA29_1 = input.LA(2);

                if ( (synpred13_InternalBmod()) ) {
                    alt29=1;
                }
            }
            else if ( (LA29_0==65) ) {
                int LA29_2 = input.LA(2);

                if ( (synpred13_InternalBmod()) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalBmod.g:2835:4: ( ( () ( ( ruleOpPostfix ) ) ) )=> ( () ( ( ruleOpPostfix ) ) )
                    {
                    // InternalBmod.g:2845:4: ( () ( ( ruleOpPostfix ) ) )
                    // InternalBmod.g:2846:5: () ( ( ruleOpPostfix ) )
                    {
                    // InternalBmod.g:2846:5: ()
                    // InternalBmod.g:2847:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalBmod.g:2853:5: ( ( ruleOpPostfix ) )
                    // InternalBmod.g:2854:6: ( ruleOpPostfix )
                    {
                    // InternalBmod.g:2854:6: ( ruleOpPostfix )
                    // InternalBmod.g:2855:7: ruleOpPostfix
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXPostfixOperationRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXPostfixOperationAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    ruleOpPostfix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPostfixOperation"


    // $ANTLR start "entryRuleOpPostfix"
    // InternalBmod.g:2875:1: entryRuleOpPostfix returns [String current=null] : iv_ruleOpPostfix= ruleOpPostfix EOF ;
    public final String entryRuleOpPostfix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpPostfix = null;


        try {
            // InternalBmod.g:2875:49: (iv_ruleOpPostfix= ruleOpPostfix EOF )
            // InternalBmod.g:2876:2: iv_ruleOpPostfix= ruleOpPostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpPostfixRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpPostfix=ruleOpPostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpPostfix.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpPostfix"


    // $ANTLR start "ruleOpPostfix"
    // InternalBmod.g:2882:1: ruleOpPostfix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '++' | kw= '--' ) ;
    public final AntlrDatatypeRuleToken ruleOpPostfix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBmod.g:2888:2: ( (kw= '++' | kw= '--' ) )
            // InternalBmod.g:2889:2: (kw= '++' | kw= '--' )
            {
            // InternalBmod.g:2889:2: (kw= '++' | kw= '--' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==64) ) {
                alt30=1;
            }
            else if ( (LA30_0==65) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalBmod.g:2890:3: kw= '++'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpPostfixAccess().getPlusSignPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:2896:3: kw= '--'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpPostfixAccess().getHyphenMinusHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpPostfix"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // InternalBmod.g:2905:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // InternalBmod.g:2905:59: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // InternalBmod.g:2906:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // InternalBmod.g:2912:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitStatic_3_0=null;
        Token otherlv_8=null;
        Token lv_nullSafe_9_0=null;
        Token lv_explicitStatic_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_explicitOperationCall_17_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_typeArguments_12_0 = null;

        EObject lv_typeArguments_14_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_19_0 = null;

        EObject lv_memberCallArguments_21_0 = null;

        EObject lv_memberCallArguments_23_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:2918:2: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* ) )
            // InternalBmod.g:2919:2: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* )
            {
            // InternalBmod.g:2919:2: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )* )
            // InternalBmod.g:2920:3: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBmod.g:2928:3: ( ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? ) )*
            loop39:
            do {
                int alt39=3;
                switch ( input.LA(1) ) {
                case 66:
                    {
                    int LA39_2 = input.LA(2);

                    if ( (synpred14_InternalBmod()) ) {
                        alt39=1;
                    }
                    else if ( (synpred15_InternalBmod()) ) {
                        alt39=2;
                    }


                    }
                    break;
                case 67:
                    {
                    int LA39_3 = input.LA(2);

                    if ( (synpred14_InternalBmod()) ) {
                        alt39=1;
                    }
                    else if ( (synpred15_InternalBmod()) ) {
                        alt39=2;
                    }


                    }
                    break;
                case 68:
                    {
                    int LA39_4 = input.LA(2);

                    if ( (synpred15_InternalBmod()) ) {
                        alt39=2;
                    }


                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // InternalBmod.g:2929:4: ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) )
            	    {
            	    // InternalBmod.g:2929:4: ( ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) ) )
            	    // InternalBmod.g:2930:5: ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_6_0= ruleXAssignment ) )
            	    {
            	    // InternalBmod.g:2930:5: ( ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
            	    // InternalBmod.g:2931:6: ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    {
            	    // InternalBmod.g:2951:6: ( () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    // InternalBmod.g:2952:7: () (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
            	    {
            	    // InternalBmod.g:2952:7: ()
            	    // InternalBmod.g:2953:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalBmod.g:2959:7: (otherlv_2= '.' | ( (lv_explicitStatic_3_0= '::' ) ) )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==66) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==67) ) {
            	        alt31=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalBmod.g:2960:8: otherlv_2= '.'
            	            {
            	            otherlv_2=(Token)match(input,66,FOLLOW_43); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1_0());
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBmod.g:2965:8: ( (lv_explicitStatic_3_0= '::' ) )
            	            {
            	            // InternalBmod.g:2965:8: ( (lv_explicitStatic_3_0= '::' ) )
            	            // InternalBmod.g:2966:9: (lv_explicitStatic_3_0= '::' )
            	            {
            	            // InternalBmod.g:2966:9: (lv_explicitStatic_3_0= '::' )
            	            // InternalBmod.g:2967:10: lv_explicitStatic_3_0= '::'
            	            {
            	            lv_explicitStatic_3_0=(Token)match(input,67,FOLLOW_43); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										newLeafNode(lv_explicitStatic_3_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitStaticColonColonKeyword_1_0_0_0_1_1_0());
            	              									
            	            }
            	            if ( state.backtracking==0 ) {

            	              										if (current==null) {
            	              											current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              										}
            	              										setWithLastConsumed(current, "explicitStatic", true, "::");
            	              									
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalBmod.g:2980:7: ( ( ruleFeatureCallID ) )
            	    // InternalBmod.g:2981:8: ( ruleFeatureCallID )
            	    {
            	    // InternalBmod.g:2981:8: ( ruleFeatureCallID )
            	    // InternalBmod.g:2982:9: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      									}
            	      								
            	    }
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_23);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									afterParserOrEnumRuleCall();
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_24);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalBmod.g:3005:5: ( (lv_value_6_0= ruleXAssignment ) )
            	    // InternalBmod.g:3006:6: (lv_value_6_0= ruleXAssignment )
            	    {
            	    // InternalBmod.g:3006:6: (lv_value_6_0= ruleXAssignment )
            	    // InternalBmod.g:3007:7: lv_value_6_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_value_6_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      							}
            	      							set(
            	      								current,
            	      								"value",
            	      								lv_value_6_0,
            	      								"org.eclipse.xtext.xbase.Xbase.XAssignment");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBmod.g:3026:4: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? )
            	    {
            	    // InternalBmod.g:3026:4: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )? )
            	    // InternalBmod.g:3027:5: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) ) (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?
            	    {
            	    // InternalBmod.g:3027:5: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) ) )
            	    // InternalBmod.g:3028:6: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )=> ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) )
            	    {
            	    // InternalBmod.g:3048:6: ( () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) ) )
            	    // InternalBmod.g:3049:7: () (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) )
            	    {
            	    // InternalBmod.g:3049:7: ()
            	    // InternalBmod.g:3050:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalBmod.g:3056:7: (otherlv_8= '.' | ( (lv_nullSafe_9_0= '?.' ) ) | ( (lv_explicitStatic_10_0= '::' ) ) )
            	    int alt32=3;
            	    switch ( input.LA(1) ) {
            	    case 66:
            	        {
            	        alt32=1;
            	        }
            	        break;
            	    case 68:
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt32) {
            	        case 1 :
            	            // InternalBmod.g:3057:8: otherlv_8= '.'
            	            {
            	            otherlv_8=(Token)match(input,66,FOLLOW_44); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(otherlv_8, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBmod.g:3062:8: ( (lv_nullSafe_9_0= '?.' ) )
            	            {
            	            // InternalBmod.g:3062:8: ( (lv_nullSafe_9_0= '?.' ) )
            	            // InternalBmod.g:3063:9: (lv_nullSafe_9_0= '?.' )
            	            {
            	            // InternalBmod.g:3063:9: (lv_nullSafe_9_0= '?.' )
            	            // InternalBmod.g:3064:10: lv_nullSafe_9_0= '?.'
            	            {
            	            lv_nullSafe_9_0=(Token)match(input,68,FOLLOW_44); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										newLeafNode(lv_nullSafe_9_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	              									
            	            }
            	            if ( state.backtracking==0 ) {

            	              										if (current==null) {
            	              											current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              										}
            	              										setWithLastConsumed(current, "nullSafe", true, "?.");
            	              									
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalBmod.g:3077:8: ( (lv_explicitStatic_10_0= '::' ) )
            	            {
            	            // InternalBmod.g:3077:8: ( (lv_explicitStatic_10_0= '::' ) )
            	            // InternalBmod.g:3078:9: (lv_explicitStatic_10_0= '::' )
            	            {
            	            // InternalBmod.g:3078:9: (lv_explicitStatic_10_0= '::' )
            	            // InternalBmod.g:3079:10: lv_explicitStatic_10_0= '::'
            	            {
            	            lv_explicitStatic_10_0=(Token)match(input,67,FOLLOW_44); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              										newLeafNode(lv_explicitStatic_10_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitStaticColonColonKeyword_1_1_0_0_1_2_0());
            	              									
            	            }
            	            if ( state.backtracking==0 ) {

            	              										if (current==null) {
            	              											current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              										}
            	              										setWithLastConsumed(current, "explicitStatic", true, "::");
            	              									
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalBmod.g:3094:5: (otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>' )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==40) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalBmod.g:3095:6: otherlv_11= '<' ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) ) (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )* otherlv_15= '>'
            	            {
            	            otherlv_11=(Token)match(input,40,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_11, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	              					
            	            }
            	            // InternalBmod.g:3099:6: ( (lv_typeArguments_12_0= ruleJvmArgumentTypeReference ) )
            	            // InternalBmod.g:3100:7: (lv_typeArguments_12_0= ruleJvmArgumentTypeReference )
            	            {
            	            // InternalBmod.g:3100:7: (lv_typeArguments_12_0= ruleJvmArgumentTypeReference )
            	            // InternalBmod.g:3101:8: lv_typeArguments_12_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_46);
            	            lv_typeArguments_12_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              								}
            	              								add(
            	              									current,
            	              									"typeArguments",
            	              									lv_typeArguments_12_0,
            	              									"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            // InternalBmod.g:3118:6: (otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop33:
            	            do {
            	                int alt33=2;
            	                int LA33_0 = input.LA(1);

            	                if ( (LA33_0==22) ) {
            	                    alt33=1;
            	                }


            	                switch (alt33) {
            	            	case 1 :
            	            	    // InternalBmod.g:3119:7: otherlv_13= ',' ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,22,FOLLOW_45); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      							newLeafNode(otherlv_13, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	      						
            	            	    }
            	            	    // InternalBmod.g:3123:7: ( (lv_typeArguments_14_0= ruleJvmArgumentTypeReference ) )
            	            	    // InternalBmod.g:3124:8: (lv_typeArguments_14_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // InternalBmod.g:3124:8: (lv_typeArguments_14_0= ruleJvmArgumentTypeReference )
            	            	    // InternalBmod.g:3125:9: lv_typeArguments_14_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      									newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0());
            	            	      								
            	            	    }
            	            	    pushFollow(FOLLOW_46);
            	            	    lv_typeArguments_14_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      									if (current==null) {
            	            	      										current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      									}
            	            	      									add(
            	            	      										current,
            	            	      										"typeArguments",
            	            	      										lv_typeArguments_14_0,
            	            	      										"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
            	            	      									afterParserOrEnumRuleCall();
            	            	      								
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop33;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,41,FOLLOW_44); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // InternalBmod.g:3148:5: ( ( ruleIdOrSuper ) )
            	    // InternalBmod.g:3149:6: ( ruleIdOrSuper )
            	    {
            	    // InternalBmod.g:3149:6: ( ruleIdOrSuper )
            	    // InternalBmod.g:3150:7: ruleIdOrSuper
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      							}
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_47);
            	    ruleIdOrSuper();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalBmod.g:3164:5: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )?
            	    int alt37=2;
            	    alt37 = dfa37.predict(input);
            	    switch (alt37) {
            	        case 1 :
            	            // InternalBmod.g:3165:6: ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')'
            	            {
            	            // InternalBmod.g:3165:6: ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) )
            	            // InternalBmod.g:3166:7: ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' )
            	            {
            	            // InternalBmod.g:3170:7: (lv_explicitOperationCall_17_0= '(' )
            	            // InternalBmod.g:3171:8: lv_explicitOperationCall_17_0= '('
            	            {
            	            lv_explicitOperationCall_17_0=(Token)match(input,21,FOLLOW_48); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_explicitOperationCall_17_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              								}
            	              								setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              							
            	            }

            	            }


            	            }

            	            // InternalBmod.g:3183:6: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )?
            	            int alt36=3;
            	            alt36 = dfa36.predict(input);
            	            switch (alt36) {
            	                case 1 :
            	                    // InternalBmod.g:3184:7: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) )
            	                    {
            	                    // InternalBmod.g:3184:7: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) )
            	                    // InternalBmod.g:3185:8: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure )
            	                    {
            	                    // InternalBmod.g:3210:8: (lv_memberCallArguments_18_0= ruleXShortClosure )
            	                    // InternalBmod.g:3211:9: lv_memberCallArguments_18_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      									newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0());
            	                      								
            	                    }
            	                    pushFollow(FOLLOW_12);
            	                    lv_memberCallArguments_18_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      									if (current==null) {
            	                      										current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      									}
            	                      									add(
            	                      										current,
            	                      										"memberCallArguments",
            	                      										lv_memberCallArguments_18_0,
            	                      										"org.eclipse.xtext.xbase.Xbase.XShortClosure");
            	                      									afterParserOrEnumRuleCall();
            	                      								
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalBmod.g:3229:7: ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* )
            	                    {
            	                    // InternalBmod.g:3229:7: ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* )
            	                    // InternalBmod.g:3230:8: ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )*
            	                    {
            	                    // InternalBmod.g:3230:8: ( (lv_memberCallArguments_19_0= ruleXExpression ) )
            	                    // InternalBmod.g:3231:9: (lv_memberCallArguments_19_0= ruleXExpression )
            	                    {
            	                    // InternalBmod.g:3231:9: (lv_memberCallArguments_19_0= ruleXExpression )
            	                    // InternalBmod.g:3232:10: lv_memberCallArguments_19_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      										newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0());
            	                      									
            	                    }
            	                    pushFollow(FOLLOW_49);
            	                    lv_memberCallArguments_19_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      										if (current==null) {
            	                      											current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      										}
            	                      										add(
            	                      											current,
            	                      											"memberCallArguments",
            	                      											lv_memberCallArguments_19_0,
            	                      											"org.eclipse.xtext.xbase.Xbase.XExpression");
            	                      										afterParserOrEnumRuleCall();
            	                      									
            	                    }

            	                    }


            	                    }

            	                    // InternalBmod.g:3249:8: (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )*
            	                    loop35:
            	                    do {
            	                        int alt35=2;
            	                        int LA35_0 = input.LA(1);

            	                        if ( (LA35_0==22) ) {
            	                            alt35=1;
            	                        }


            	                        switch (alt35) {
            	                    	case 1 :
            	                    	    // InternalBmod.g:3250:9: otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_20=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									newLeafNode(otherlv_20, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	      								
            	                    	    }
            	                    	    // InternalBmod.g:3254:9: ( (lv_memberCallArguments_21_0= ruleXExpression ) )
            	                    	    // InternalBmod.g:3255:10: (lv_memberCallArguments_21_0= ruleXExpression )
            	                    	    {
            	                    	    // InternalBmod.g:3255:10: (lv_memberCallArguments_21_0= ruleXExpression )
            	                    	    // InternalBmod.g:3256:11: lv_memberCallArguments_21_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0());
            	                    	      										
            	                    	    }
            	                    	    pushFollow(FOLLOW_49);
            	                    	    lv_memberCallArguments_21_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											if (current==null) {
            	                    	      												current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      											}
            	                    	      											add(
            	                    	      												current,
            	                    	      												"memberCallArguments",
            	                    	      												lv_memberCallArguments_21_0,
            	                    	      												"org.eclipse.xtext.xbase.Xbase.XExpression");
            	                    	      											afterParserOrEnumRuleCall();
            	                    	      										
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop35;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_22=(Token)match(input,23,FOLLOW_50); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_22, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // InternalBmod.g:3281:5: ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?
            	    int alt38=2;
            	    alt38 = dfa38.predict(input);
            	    switch (alt38) {
            	        case 1 :
            	            // InternalBmod.g:3282:6: ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure )
            	            {
            	            // InternalBmod.g:3288:6: (lv_memberCallArguments_23_0= ruleXClosure )
            	            // InternalBmod.g:3289:7: lv_memberCallArguments_23_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_42);
            	            lv_memberCallArguments_23_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              							}
            	              							add(
            	              								current,
            	              								"memberCallArguments",
            	              								lv_memberCallArguments_23_0,
            	              								"org.eclipse.xtext.xbase.Xbase.XClosure");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // InternalBmod.g:3312:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // InternalBmod.g:3312:59: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // InternalBmod.g:3313:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // InternalBmod.g:3319:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XSynchronizedExpression_3 = null;

        EObject this_XFeatureCall_4 = null;

        EObject this_XLiteral_5 = null;

        EObject this_XIfExpression_6 = null;

        EObject this_XForLoopExpression_7 = null;

        EObject this_XBasicForLoopExpression_8 = null;

        EObject this_XWhileExpression_9 = null;

        EObject this_XDoWhileExpression_10 = null;

        EObject this_XThrowExpression_11 = null;

        EObject this_XReturnExpression_12 = null;

        EObject this_XTryCatchFinallyExpression_13 = null;

        EObject this_XParenthesizedExpression_14 = null;



        	enterRule();

        try {
            // InternalBmod.g:3325:2: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression ) )
            // InternalBmod.g:3326:2: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression )
            {
            // InternalBmod.g:3326:2: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression )
            int alt40=15;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalBmod.g:3327:3: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XConstructorCall_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:3336:3: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XBlockExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBmod.g:3345:3: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XSwitchExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBmod.g:3354:3: ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression )
                    {
                    // InternalBmod.g:3354:3: ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression )
                    // InternalBmod.g:3355:4: ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSynchronizedExpressionParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_XSynchronizedExpression_3=ruleXSynchronizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_XSynchronizedExpression_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBmod.g:3372:3: this_XFeatureCall_4= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XFeatureCall_4=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XFeatureCall_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalBmod.g:3381:3: this_XLiteral_5= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XLiteral_5=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XLiteral_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalBmod.g:3390:3: this_XIfExpression_6= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XIfExpression_6=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XIfExpression_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalBmod.g:3399:3: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression )
                    {
                    // InternalBmod.g:3399:3: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression )
                    // InternalBmod.g:3400:4: ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_7());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_XForLoopExpression_7=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_XForLoopExpression_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalBmod.g:3423:3: this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBasicForLoopExpressionParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XBasicForLoopExpression_8=ruleXBasicForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XBasicForLoopExpression_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalBmod.g:3432:3: this_XWhileExpression_9= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XWhileExpression_9=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XWhileExpression_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalBmod.g:3441:3: this_XDoWhileExpression_10= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XDoWhileExpression_10=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XDoWhileExpression_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalBmod.g:3450:3: this_XThrowExpression_11= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XThrowExpression_11=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XThrowExpression_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalBmod.g:3459:3: this_XReturnExpression_12= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XReturnExpression_12=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XReturnExpression_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalBmod.g:3468:3: this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XTryCatchFinallyExpression_13=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XTryCatchFinallyExpression_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalBmod.g:3477:3: this_XParenthesizedExpression_14= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XParenthesizedExpression_14=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XParenthesizedExpression_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // InternalBmod.g:3489:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // InternalBmod.g:3489:49: (iv_ruleXLiteral= ruleXLiteral EOF )
            // InternalBmod.g:3490:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // InternalBmod.g:3496:1: ruleXLiteral returns [EObject current=null] : (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XCollectionLiteral_0 = null;

        EObject this_XClosure_1 = null;

        EObject this_XBooleanLiteral_2 = null;

        EObject this_XNumberLiteral_3 = null;

        EObject this_XNullLiteral_4 = null;

        EObject this_XStringLiteral_5 = null;

        EObject this_XTypeLiteral_6 = null;



        	enterRule();

        try {
            // InternalBmod.g:3502:2: ( (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) )
            // InternalBmod.g:3503:2: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            {
            // InternalBmod.g:3503:2: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            int alt41=7;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==69) ) {
                alt41=1;
            }
            else if ( (LA41_0==72) && (synpred21_InternalBmod())) {
                alt41=2;
            }
            else if ( ((LA41_0>=92 && LA41_0<=93)) ) {
                alt41=3;
            }
            else if ( ((LA41_0>=RULE_INT && LA41_0<=RULE_DECIMAL)) ) {
                alt41=4;
            }
            else if ( (LA41_0==94) ) {
                alt41=5;
            }
            else if ( (LA41_0==RULE_STRING) ) {
                alt41=6;
            }
            else if ( (LA41_0==95) ) {
                alt41=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalBmod.g:3504:3: this_XCollectionLiteral_0= ruleXCollectionLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXLiteralAccess().getXCollectionLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XCollectionLiteral_0=ruleXCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XCollectionLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:3513:3: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    {
                    // InternalBmod.g:3513:3: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    // InternalBmod.g:3514:4: ( ( () '[' ) )=>this_XClosure_1= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_XClosure_1=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_XClosure_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:3530:3: this_XBooleanLiteral_2= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XBooleanLiteral_2=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XBooleanLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBmod.g:3539:3: this_XNumberLiteral_3= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XNumberLiteral_3=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XNumberLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalBmod.g:3548:3: this_XNullLiteral_4= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XNullLiteral_4=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XNullLiteral_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalBmod.g:3557:3: this_XStringLiteral_5= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XStringLiteral_5=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XStringLiteral_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalBmod.g:3566:3: this_XTypeLiteral_6= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XTypeLiteral_6=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XTypeLiteral_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXCollectionLiteral"
    // InternalBmod.g:3578:1: entryRuleXCollectionLiteral returns [EObject current=null] : iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF ;
    public final EObject entryRuleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCollectionLiteral = null;


        try {
            // InternalBmod.g:3578:59: (iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF )
            // InternalBmod.g:3579:2: iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCollectionLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXCollectionLiteral=ruleXCollectionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCollectionLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCollectionLiteral"


    // $ANTLR start "ruleXCollectionLiteral"
    // InternalBmod.g:3585:1: ruleXCollectionLiteral returns [EObject current=null] : (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) ;
    public final EObject ruleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XSetLiteral_0 = null;

        EObject this_XListLiteral_1 = null;



        	enterRule();

        try {
            // InternalBmod.g:3591:2: ( (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) )
            // InternalBmod.g:3592:2: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            {
            // InternalBmod.g:3592:2: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==69) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==72) ) {
                    alt42=2;
                }
                else if ( (LA42_1==70) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalBmod.g:3593:3: this_XSetLiteral_0= ruleXSetLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXSetLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XSetLiteral_0=ruleXSetLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XSetLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:3602:3: this_XListLiteral_1= ruleXListLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXListLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XListLiteral_1=ruleXListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XListLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCollectionLiteral"


    // $ANTLR start "entryRuleXSetLiteral"
    // InternalBmod.g:3614:1: entryRuleXSetLiteral returns [EObject current=null] : iv_ruleXSetLiteral= ruleXSetLiteral EOF ;
    public final EObject entryRuleXSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSetLiteral = null;


        try {
            // InternalBmod.g:3614:52: (iv_ruleXSetLiteral= ruleXSetLiteral EOF )
            // InternalBmod.g:3615:2: iv_ruleXSetLiteral= ruleXSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSetLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXSetLiteral=ruleXSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSetLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSetLiteral"


    // $ANTLR start "ruleXSetLiteral"
    // InternalBmod.g:3621:1: ruleXSetLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleXSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:3627:2: ( ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) )
            // InternalBmod.g:3628:2: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            {
            // InternalBmod.g:3628:2: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            // InternalBmod.g:3629:3: () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}'
            {
            // InternalBmod.g:3629:3: ()
            // InternalBmod.g:3630:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXSetLiteralAccess().getXSetLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXSetLiteralAccess().getNumberSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,70,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXSetLiteralAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalBmod.g:3644:3: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)||LA44_0==21||LA44_0==40||(LA44_0>=56 && LA44_0<=57)||LA44_0==62||(LA44_0>=69 && LA44_0<=70)||LA44_0==72||LA44_0==76||LA44_0==78||(LA44_0>=81 && LA44_0<=83)||(LA44_0>=86 && LA44_0<=98)||LA44_0==100) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBmod.g:3645:4: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // InternalBmod.g:3645:4: ( (lv_elements_3_0= ruleXExpression ) )
                    // InternalBmod.g:3646:5: (lv_elements_3_0= ruleXExpression )
                    {
                    // InternalBmod.g:3646:5: (lv_elements_3_0= ruleXExpression )
                    // InternalBmod.g:3647:6: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_52);
                    lv_elements_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXSetLiteralRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_3_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBmod.g:3664:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==22) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalBmod.g:3665:5: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getXSetLiteralAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalBmod.g:3669:5: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // InternalBmod.g:3670:6: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // InternalBmod.g:3670:6: (lv_elements_5_0= ruleXExpression )
                    	    // InternalBmod.g:3671:7: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_52);
                    	    lv_elements_5_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXSetLiteralRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_5_0,
                    	      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getXSetLiteralAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSetLiteral"


    // $ANTLR start "entryRuleXListLiteral"
    // InternalBmod.g:3698:1: entryRuleXListLiteral returns [EObject current=null] : iv_ruleXListLiteral= ruleXListLiteral EOF ;
    public final EObject entryRuleXListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXListLiteral = null;


        try {
            // InternalBmod.g:3698:53: (iv_ruleXListLiteral= ruleXListLiteral EOF )
            // InternalBmod.g:3699:2: iv_ruleXListLiteral= ruleXListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXListLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXListLiteral=ruleXListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXListLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXListLiteral"


    // $ANTLR start "ruleXListLiteral"
    // InternalBmod.g:3705:1: ruleXListLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleXListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:3711:2: ( ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) )
            // InternalBmod.g:3712:2: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            {
            // InternalBmod.g:3712:2: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            // InternalBmod.g:3713:3: () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']'
            {
            // InternalBmod.g:3713:3: ()
            // InternalBmod.g:3714:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXListLiteralAccess().getXListLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXListLiteralAccess().getNumberSignKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,72,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXListLiteralAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalBmod.g:3728:3: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_ID)||LA46_0==21||LA46_0==40||(LA46_0>=56 && LA46_0<=57)||LA46_0==62||(LA46_0>=69 && LA46_0<=70)||LA46_0==72||LA46_0==76||LA46_0==78||(LA46_0>=81 && LA46_0<=83)||(LA46_0>=86 && LA46_0<=98)||LA46_0==100) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBmod.g:3729:4: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // InternalBmod.g:3729:4: ( (lv_elements_3_0= ruleXExpression ) )
                    // InternalBmod.g:3730:5: (lv_elements_3_0= ruleXExpression )
                    {
                    // InternalBmod.g:3730:5: (lv_elements_3_0= ruleXExpression )
                    // InternalBmod.g:3731:6: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_55);
                    lv_elements_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXListLiteralRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_3_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBmod.g:3748:4: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==22) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalBmod.g:3749:5: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getXListLiteralAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalBmod.g:3753:5: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // InternalBmod.g:3754:6: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // InternalBmod.g:3754:6: (lv_elements_5_0= ruleXExpression )
                    	    // InternalBmod.g:3755:7: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_55);
                    	    lv_elements_5_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXListLiteralRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_5_0,
                    	      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getXListLiteralAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXListLiteral"


    // $ANTLR start "entryRuleXClosure"
    // InternalBmod.g:3782:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // InternalBmod.g:3782:49: (iv_ruleXClosure= ruleXClosure EOF )
            // InternalBmod.g:3783:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // InternalBmod.g:3789:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:3795:2: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // InternalBmod.g:3796:2: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // InternalBmod.g:3796:2: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // InternalBmod.g:3797:3: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // InternalBmod.g:3797:3: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // InternalBmod.g:3798:4: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // InternalBmod.g:3804:4: ( () otherlv_1= '[' )
            // InternalBmod.g:3805:5: () otherlv_1= '['
            {
            // InternalBmod.g:3805:5: ()
            // InternalBmod.g:3806:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
              				
            }

            }


            }

            // InternalBmod.g:3818:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalBmod.g:3819:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // InternalBmod.g:3842:4: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // InternalBmod.g:3843:5: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // InternalBmod.g:3843:5: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_ID||LA48_0==21||LA48_0==53) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalBmod.g:3844:6: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // InternalBmod.g:3844:6: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // InternalBmod.g:3845:7: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // InternalBmod.g:3845:7: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // InternalBmod.g:3846:8: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0());
                              							
                            }
                            pushFollow(FOLLOW_57);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXClosureRule());
                              								}
                              								add(
                              									current,
                              									"declaredFormalParameters",
                              									lv_declaredFormalParameters_2_0,
                              									"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalBmod.g:3863:6: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==22) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // InternalBmod.g:3864:7: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,22,FOLLOW_33); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	      						
                            	    }
                            	    // InternalBmod.g:3868:7: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // InternalBmod.g:3869:8: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // InternalBmod.g:3869:8: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // InternalBmod.g:3870:9: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_57);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"declaredFormalParameters",
                            	      										lv_declaredFormalParameters_4_0,
                            	      										"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop47;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalBmod.g:3889:5: ( (lv_explicitSyntax_5_0= '|' ) )
                    // InternalBmod.g:3890:6: (lv_explicitSyntax_5_0= '|' )
                    {
                    // InternalBmod.g:3890:6: (lv_explicitSyntax_5_0= '|' )
                    // InternalBmod.g:3891:7: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,74,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXClosureRule());
                      							}
                      							setWithLastConsumed(current, "explicitSyntax", true, "|");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalBmod.g:3905:3: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // InternalBmod.g:3906:4: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // InternalBmod.g:3906:4: (lv_expression_6_0= ruleXExpressionInClosure )
            // InternalBmod.g:3907:5: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_59);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXClosureRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_6_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpressionInClosure");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // InternalBmod.g:3932:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // InternalBmod.g:3932:61: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // InternalBmod.g:3933:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // InternalBmod.g:3939:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:3945:2: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* ) )
            // InternalBmod.g:3946:2: ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* )
            {
            // InternalBmod.g:3946:2: ( () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )* )
            // InternalBmod.g:3947:3: () ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )*
            {
            // InternalBmod.g:3947:3: ()
            // InternalBmod.g:3948:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalBmod.g:3954:3: ( ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )? )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_ID)||LA51_0==21||LA51_0==40||(LA51_0>=56 && LA51_0<=57)||LA51_0==62||(LA51_0>=69 && LA51_0<=70)||LA51_0==72||LA51_0==76||LA51_0==78||(LA51_0>=81 && LA51_0<=98)||LA51_0==100) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalBmod.g:3955:4: ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_2= ';' )?
            	    {
            	    // InternalBmod.g:3955:4: ( (lv_expressions_1_0= ruleXExpressionOrVarDeclaration ) )
            	    // InternalBmod.g:3956:5: (lv_expressions_1_0= ruleXExpressionOrVarDeclaration )
            	    {
            	    // InternalBmod.g:3956:5: (lv_expressions_1_0= ruleXExpressionOrVarDeclaration )
            	    // InternalBmod.g:3957:6: lv_expressions_1_0= ruleXExpressionOrVarDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionOrVarDeclarationParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
            	    lv_expressions_1_0=ruleXExpressionOrVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_1_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XExpressionOrVarDeclaration");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalBmod.g:3974:4: (otherlv_2= ';' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==75) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalBmod.g:3975:5: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,75,FOLLOW_61); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // InternalBmod.g:3985:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // InternalBmod.g:3985:54: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // InternalBmod.g:3986:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // InternalBmod.g:3992:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:3998:2: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // InternalBmod.g:3999:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // InternalBmod.g:3999:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // InternalBmod.g:4000:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // InternalBmod.g:4000:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // InternalBmod.g:4001:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // InternalBmod.g:4026:4: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // InternalBmod.g:4027:5: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // InternalBmod.g:4027:5: ()
            // InternalBmod.g:4028:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
              							current);
              					
            }

            }

            // InternalBmod.g:4034:5: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID||LA53_0==21||LA53_0==53) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBmod.g:4035:6: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // InternalBmod.g:4035:6: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // InternalBmod.g:4036:7: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // InternalBmod.g:4036:7: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // InternalBmod.g:4037:8: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0());
                      							
                    }
                    pushFollow(FOLLOW_57);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      								}
                      								add(
                      									current,
                      									"declaredFormalParameters",
                      									lv_declaredFormalParameters_1_0,
                      									"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalBmod.g:4054:6: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==22) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalBmod.g:4055:7: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,22,FOLLOW_33); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	      						
                    	    }
                    	    // InternalBmod.g:4059:7: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // InternalBmod.g:4060:8: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // InternalBmod.g:4060:8: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // InternalBmod.g:4061:9: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      									newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0());
                    	      								
                    	    }
                    	    pushFollow(FOLLOW_57);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      									if (current==null) {
                    	      										current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      									}
                    	      									add(
                    	      										current,
                    	      										"declaredFormalParameters",
                    	      										lv_declaredFormalParameters_3_0,
                    	      										"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                    	      									afterParserOrEnumRuleCall();
                    	      								
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBmod.g:4080:5: ( (lv_explicitSyntax_4_0= '|' ) )
            // InternalBmod.g:4081:6: (lv_explicitSyntax_4_0= '|' )
            {
            // InternalBmod.g:4081:6: (lv_explicitSyntax_4_0= '|' )
            // InternalBmod.g:4082:7: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,74,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
              						
            }
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElement(grammarAccess.getXShortClosureRule());
              							}
              							setWithLastConsumed(current, "explicitSyntax", true, "|");
              						
            }

            }


            }


            }


            }

            // InternalBmod.g:4096:3: ( (lv_expression_5_0= ruleXExpression ) )
            // InternalBmod.g:4097:4: (lv_expression_5_0= ruleXExpression )
            {
            // InternalBmod.g:4097:4: (lv_expression_5_0= ruleXExpression )
            // InternalBmod.g:4098:5: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_5_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // InternalBmod.g:4119:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // InternalBmod.g:4119:65: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // InternalBmod.g:4120:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // InternalBmod.g:4126:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;



        	enterRule();

        try {
            // InternalBmod.g:4132:2: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // InternalBmod.g:4133:2: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // InternalBmod.g:4133:2: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // InternalBmod.g:4134:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_12);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_XExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // InternalBmod.g:4154:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // InternalBmod.g:4154:54: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // InternalBmod.g:4155:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // InternalBmod.g:4161:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:4167:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // InternalBmod.g:4168:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // InternalBmod.g:4168:2: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // InternalBmod.g:4169:3: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // InternalBmod.g:4169:3: ()
            // InternalBmod.g:4170:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,21,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalBmod.g:4184:3: ( (lv_if_3_0= ruleXExpression ) )
            // InternalBmod.g:4185:4: (lv_if_3_0= ruleXExpression )
            {
            // InternalBmod.g:4185:4: (lv_if_3_0= ruleXExpression )
            // InternalBmod.g:4186:5: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              					}
              					set(
              						current,
              						"if",
              						lv_if_3_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalBmod.g:4207:3: ( (lv_then_5_0= ruleXExpression ) )
            // InternalBmod.g:4208:4: (lv_then_5_0= ruleXExpression )
            {
            // InternalBmod.g:4208:4: (lv_then_5_0= ruleXExpression )
            // InternalBmod.g:4209:5: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_62);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              					}
              					set(
              						current,
              						"then",
              						lv_then_5_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBmod.g:4226:3: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==77) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred25_InternalBmod()) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // InternalBmod.g:4227:4: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // InternalBmod.g:4227:4: ( ( 'else' )=>otherlv_6= 'else' )
                    // InternalBmod.g:4228:5: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                      				
                    }

                    }

                    // InternalBmod.g:4234:4: ( (lv_else_7_0= ruleXExpression ) )
                    // InternalBmod.g:4235:5: (lv_else_7_0= ruleXExpression )
                    {
                    // InternalBmod.g:4235:5: (lv_else_7_0= ruleXExpression )
                    // InternalBmod.g:4236:6: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      						}
                      						set(
                      							current,
                      							"else",
                      							lv_else_7_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // InternalBmod.g:4258:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // InternalBmod.g:4258:58: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // InternalBmod.g:4259:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // InternalBmod.g:4265:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_switch_5_0 = null;

        EObject lv_declaredParam_7_0 = null;

        EObject lv_switch_9_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:4271:2: ( ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // InternalBmod.g:4272:2: ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // InternalBmod.g:4272:2: ( () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // InternalBmod.g:4273:3: () otherlv_1= 'switch' ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )* (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // InternalBmod.g:4273:3: ()
            // InternalBmod.g:4274:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
              		
            }
            // InternalBmod.g:4284:3: ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) )
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalBmod.g:4285:4: ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' )
                    {
                    // InternalBmod.g:4285:4: ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' )
                    // InternalBmod.g:4286:5: ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')'
                    {
                    // InternalBmod.g:4286:5: ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) )
                    // InternalBmod.g:4287:6: ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
                    {
                    // InternalBmod.g:4297:6: (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
                    // InternalBmod.g:4298:7: otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_2, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_0_0_0_0());
                      						
                    }
                    // InternalBmod.g:4302:7: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
                    // InternalBmod.g:4303:8: (lv_declaredParam_3_0= ruleJvmFormalParameter )
                    {
                    // InternalBmod.g:4303:8: (lv_declaredParam_3_0= ruleJvmFormalParameter )
                    // InternalBmod.g:4304:9: lv_declaredParam_3_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {

                      									newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0_0_0_1_0());
                      								
                    }
                    pushFollow(FOLLOW_16);
                    lv_declaredParam_3_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      									if (current==null) {
                      										current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      									}
                      									set(
                      										current,
                      										"declaredParam",
                      										lv_declaredParam_3_0,
                      										"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                      									afterParserOrEnumRuleCall();
                      								
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_4, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_2());
                      						
                    }

                    }


                    }

                    // InternalBmod.g:4327:5: ( (lv_switch_5_0= ruleXExpression ) )
                    // InternalBmod.g:4328:6: (lv_switch_5_0= ruleXExpression )
                    {
                    // InternalBmod.g:4328:6: (lv_switch_5_0= ruleXExpression )
                    // InternalBmod.g:4329:7: lv_switch_5_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_12);
                    lv_switch_5_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      							}
                      							set(
                      								current,
                      								"switch",
                      								lv_switch_5_0,
                      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:4352:4: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) )
                    {
                    // InternalBmod.g:4352:4: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) )
                    // InternalBmod.g:4353:5: ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) )
                    {
                    // InternalBmod.g:4353:5: ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )?
                    int alt55=2;
                    alt55 = dfa55.predict(input);
                    switch (alt55) {
                        case 1 :
                            // InternalBmod.g:4354:6: ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' )
                            {
                            // InternalBmod.g:4363:6: ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' )
                            // InternalBmod.g:4364:7: ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':'
                            {
                            // InternalBmod.g:4364:7: ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) )
                            // InternalBmod.g:4365:8: (lv_declaredParam_7_0= ruleJvmFormalParameter )
                            {
                            // InternalBmod.g:4365:8: (lv_declaredParam_7_0= ruleJvmFormalParameter )
                            // InternalBmod.g:4366:9: lv_declaredParam_7_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_1_0_0_0_0());
                              								
                            }
                            pushFollow(FOLLOW_16);
                            lv_declaredParam_7_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              									}
                              									set(
                              										current,
                              										"declaredParam",
                              										lv_declaredParam_7_0,
                              										"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,27,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_1());
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalBmod.g:4389:5: ( (lv_switch_9_0= ruleXExpression ) )
                    // InternalBmod.g:4390:6: (lv_switch_9_0= ruleXExpression )
                    {
                    // InternalBmod.g:4390:6: (lv_switch_9_0= ruleXExpression )
                    // InternalBmod.g:4391:7: lv_switch_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_13);
                    lv_switch_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      							}
                      							set(
                      								current,
                      								"switch",
                      								lv_switch_9_0,
                      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,70,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalBmod.g:4414:3: ( (lv_cases_11_0= ruleXCasePart ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID||(LA57_0>=21 && LA57_0<=22)||LA57_0==27||LA57_0==53||LA57_0==80) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalBmod.g:4415:4: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // InternalBmod.g:4415:4: (lv_cases_11_0= ruleXCasePart )
            	    // InternalBmod.g:4416:5: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_64);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"cases",
            	      						lv_cases_11_0,
            	      						"org.eclipse.xtext.xbase.Xbase.XCasePart");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // InternalBmod.g:4433:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==79) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalBmod.g:4434:4: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,79,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                      			
                    }
                    otherlv_13=(Token)match(input,27,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                      			
                    }
                    // InternalBmod.g:4442:4: ( (lv_default_14_0= ruleXExpression ) )
                    // InternalBmod.g:4443:5: (lv_default_14_0= ruleXExpression )
                    {
                    // InternalBmod.g:4443:5: (lv_default_14_0= ruleXExpression )
                    // InternalBmod.g:4444:6: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_65);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_14_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // InternalBmod.g:4470:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // InternalBmod.g:4470:50: (iv_ruleXCasePart= ruleXCasePart EOF )
            // InternalBmod.g:4471:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // InternalBmod.g:4477:1: ruleXCasePart returns [EObject current=null] : ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_fallThrough_6_0=null;
        EObject lv_typeGuard_1_0 = null;

        EObject lv_case_3_0 = null;

        EObject lv_then_5_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:4483:2: ( ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) ) )
            // InternalBmod.g:4484:2: ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) )
            {
            // InternalBmod.g:4484:2: ( () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) ) )
            // InternalBmod.g:4485:3: () ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )? (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )? ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) )
            {
            // InternalBmod.g:4485:3: ()
            // InternalBmod.g:4486:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXCasePartAccess().getXCasePartAction_0(),
              					current);
              			
            }

            }

            // InternalBmod.g:4492:3: ( (lv_typeGuard_1_0= ruleJvmTypeReference ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID||LA59_0==21||LA59_0==53) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBmod.g:4493:4: (lv_typeGuard_1_0= ruleJvmTypeReference )
                    {
                    // InternalBmod.g:4493:4: (lv_typeGuard_1_0= ruleJvmTypeReference )
                    // InternalBmod.g:4494:5: lv_typeGuard_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_66);
                    lv_typeGuard_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      					}
                      					set(
                      						current,
                      						"typeGuard",
                      						lv_typeGuard_1_0,
                      						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalBmod.g:4511:3: (otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==80) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalBmod.g:4512:4: otherlv_2= 'case' ( (lv_case_3_0= ruleXExpression ) )
                    {
                    otherlv_2=(Token)match(input,80,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getXCasePartAccess().getCaseKeyword_2_0());
                      			
                    }
                    // InternalBmod.g:4516:4: ( (lv_case_3_0= ruleXExpression ) )
                    // InternalBmod.g:4517:5: (lv_case_3_0= ruleXExpression )
                    {
                    // InternalBmod.g:4517:5: (lv_case_3_0= ruleXExpression )
                    // InternalBmod.g:4518:6: lv_case_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_67);
                    lv_case_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      						}
                      						set(
                      							current,
                      							"case",
                      							lv_case_3_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalBmod.g:4536:3: ( (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) ) | ( (lv_fallThrough_6_0= ',' ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==27) ) {
                alt61=1;
            }
            else if ( (LA61_0==22) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalBmod.g:4537:4: (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) )
                    {
                    // InternalBmod.g:4537:4: (otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) ) )
                    // InternalBmod.g:4538:5: otherlv_4= ':' ( (lv_then_5_0= ruleXExpression ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getXCasePartAccess().getColonKeyword_3_0_0());
                      				
                    }
                    // InternalBmod.g:4542:5: ( (lv_then_5_0= ruleXExpression ) )
                    // InternalBmod.g:4543:6: (lv_then_5_0= ruleXExpression )
                    {
                    // InternalBmod.g:4543:6: (lv_then_5_0= ruleXExpression )
                    // InternalBmod.g:4544:7: lv_then_5_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_then_5_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      							}
                      							set(
                      								current,
                      								"then",
                      								lv_then_5_0,
                      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:4563:4: ( (lv_fallThrough_6_0= ',' ) )
                    {
                    // InternalBmod.g:4563:4: ( (lv_fallThrough_6_0= ',' ) )
                    // InternalBmod.g:4564:5: (lv_fallThrough_6_0= ',' )
                    {
                    // InternalBmod.g:4564:5: (lv_fallThrough_6_0= ',' )
                    // InternalBmod.g:4565:6: lv_fallThrough_6_0= ','
                    {
                    lv_fallThrough_6_0=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_fallThrough_6_0, grammarAccess.getXCasePartAccess().getFallThroughCommaKeyword_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXCasePartRule());
                      						}
                      						setWithLastConsumed(current, "fallThrough", true, ",");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // InternalBmod.g:4582:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // InternalBmod.g:4582:59: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // InternalBmod.g:4583:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // InternalBmod.g:4589:1: ruleXForLoopExpression returns [EObject current=null] : ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:4595:2: ( ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // InternalBmod.g:4596:2: ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // InternalBmod.g:4596:2: ( ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // InternalBmod.g:4597:3: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // InternalBmod.g:4597:3: ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) )
            // InternalBmod.g:4598:4: ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
            {
            // InternalBmod.g:4611:4: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' )
            // InternalBmod.g:4612:5: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':'
            {
            // InternalBmod.g:4612:5: ()
            // InternalBmod.g:4613:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_0_0_1());
              				
            }
            otherlv_2=(Token)match(input,21,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_0_0_2());
              				
            }
            // InternalBmod.g:4627:5: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // InternalBmod.g:4628:6: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // InternalBmod.g:4628:6: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // InternalBmod.g:4629:7: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {

              							newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_0_0_3_0());
              						
            }
            pushFollow(FOLLOW_16);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              							}
              							set(
              								current,
              								"declaredParam",
              								lv_declaredParam_3_0,
              								"org.eclipse.xtext.xbase.Xbase.JvmFormalParameter");
              							afterParserOrEnumRuleCall();
              						
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_0_0_4());
              				
            }

            }


            }

            // InternalBmod.g:4652:3: ( (lv_forExpression_5_0= ruleXExpression ) )
            // InternalBmod.g:4653:4: (lv_forExpression_5_0= ruleXExpression )
            {
            // InternalBmod.g:4653:4: (lv_forExpression_5_0= ruleXExpression )
            // InternalBmod.g:4654:5: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              					}
              					set(
              						current,
              						"forExpression",
              						lv_forExpression_5_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_2());
              		
            }
            // InternalBmod.g:4675:3: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // InternalBmod.g:4676:4: (lv_eachExpression_7_0= ruleXExpression )
            {
            // InternalBmod.g:4676:4: (lv_eachExpression_7_0= ruleXExpression )
            // InternalBmod.g:4677:5: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              					}
              					set(
              						current,
              						"eachExpression",
              						lv_eachExpression_7_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXBasicForLoopExpression"
    // InternalBmod.g:4698:1: entryRuleXBasicForLoopExpression returns [EObject current=null] : iv_ruleXBasicForLoopExpression= ruleXBasicForLoopExpression EOF ;
    public final EObject entryRuleXBasicForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBasicForLoopExpression = null;


        try {
            // InternalBmod.g:4698:64: (iv_ruleXBasicForLoopExpression= ruleXBasicForLoopExpression EOF )
            // InternalBmod.g:4699:2: iv_ruleXBasicForLoopExpression= ruleXBasicForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBasicForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXBasicForLoopExpression=ruleXBasicForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBasicForLoopExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBasicForLoopExpression"


    // $ANTLR start "ruleXBasicForLoopExpression"
    // InternalBmod.g:4705:1: ruleXBasicForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) ) ;
    public final EObject ruleXBasicForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_initExpressions_3_0 = null;

        EObject lv_initExpressions_5_0 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_updateExpressions_9_0 = null;

        EObject lv_updateExpressions_11_0 = null;

        EObject lv_eachExpression_13_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:4711:2: ( ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) ) )
            // InternalBmod.g:4712:2: ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) )
            {
            // InternalBmod.g:4712:2: ( () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) ) )
            // InternalBmod.g:4713:3: () otherlv_1= 'for' otherlv_2= '(' ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )? otherlv_6= ';' ( (lv_expression_7_0= ruleXExpression ) )? otherlv_8= ';' ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )? otherlv_12= ')' ( (lv_eachExpression_13_0= ruleXExpression ) )
            {
            // InternalBmod.g:4713:3: ()
            // InternalBmod.g:4714:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXBasicForLoopExpressionAccess().getXBasicForLoopExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXBasicForLoopExpressionAccess().getForKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,21,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXBasicForLoopExpressionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalBmod.g:4728:3: ( ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_STRING && LA63_0<=RULE_ID)||LA63_0==21||LA63_0==40||(LA63_0>=56 && LA63_0<=57)||LA63_0==62||(LA63_0>=69 && LA63_0<=70)||LA63_0==72||LA63_0==76||LA63_0==78||(LA63_0>=81 && LA63_0<=98)||LA63_0==100) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalBmod.g:4729:4: ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )*
                    {
                    // InternalBmod.g:4729:4: ( (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration ) )
                    // InternalBmod.g:4730:5: (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration )
                    {
                    // InternalBmod.g:4730:5: (lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration )
                    // InternalBmod.g:4731:6: lv_initExpressions_3_0= ruleXExpressionOrVarDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getInitExpressionsXExpressionOrVarDeclarationParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_69);
                    lv_initExpressions_3_0=ruleXExpressionOrVarDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                      						}
                      						add(
                      							current,
                      							"initExpressions",
                      							lv_initExpressions_3_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpressionOrVarDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBmod.g:4748:4: (otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==22) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalBmod.g:4749:5: otherlv_4= ',' ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_70); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getXBasicForLoopExpressionAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalBmod.g:4753:5: ( (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration ) )
                    	    // InternalBmod.g:4754:6: (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration )
                    	    {
                    	    // InternalBmod.g:4754:6: (lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration )
                    	    // InternalBmod.g:4755:7: lv_initExpressions_5_0= ruleXExpressionOrVarDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getInitExpressionsXExpressionOrVarDeclarationParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_69);
                    	    lv_initExpressions_5_0=ruleXExpressionOrVarDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"initExpressions",
                    	      								lv_initExpressions_5_0,
                    	      								"org.eclipse.xtext.xbase.Xbase.XExpressionOrVarDeclaration");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,75,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getXBasicForLoopExpressionAccess().getSemicolonKeyword_4());
              		
            }
            // InternalBmod.g:4778:3: ( (lv_expression_7_0= ruleXExpression ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_ID)||LA64_0==21||LA64_0==40||(LA64_0>=56 && LA64_0<=57)||LA64_0==62||(LA64_0>=69 && LA64_0<=70)||LA64_0==72||LA64_0==76||LA64_0==78||(LA64_0>=81 && LA64_0<=83)||(LA64_0>=86 && LA64_0<=98)||LA64_0==100) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalBmod.g:4779:4: (lv_expression_7_0= ruleXExpression )
                    {
                    // InternalBmod.g:4779:4: (lv_expression_7_0= ruleXExpression )
                    // InternalBmod.g:4780:5: lv_expression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getExpressionXExpressionParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_72);
                    lv_expression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_7_0,
                      						"org.eclipse.xtext.xbase.Xbase.XExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,75,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getXBasicForLoopExpressionAccess().getSemicolonKeyword_6());
              		
            }
            // InternalBmod.g:4801:3: ( ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_STRING && LA66_0<=RULE_ID)||LA66_0==21||LA66_0==40||(LA66_0>=56 && LA66_0<=57)||LA66_0==62||(LA66_0>=69 && LA66_0<=70)||LA66_0==72||LA66_0==76||LA66_0==78||(LA66_0>=81 && LA66_0<=83)||(LA66_0>=86 && LA66_0<=98)||LA66_0==100) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalBmod.g:4802:4: ( (lv_updateExpressions_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )*
                    {
                    // InternalBmod.g:4802:4: ( (lv_updateExpressions_9_0= ruleXExpression ) )
                    // InternalBmod.g:4803:5: (lv_updateExpressions_9_0= ruleXExpression )
                    {
                    // InternalBmod.g:4803:5: (lv_updateExpressions_9_0= ruleXExpression )
                    // InternalBmod.g:4804:6: lv_updateExpressions_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getUpdateExpressionsXExpressionParserRuleCall_7_0_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
                    lv_updateExpressions_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                      						}
                      						add(
                      							current,
                      							"updateExpressions",
                      							lv_updateExpressions_9_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBmod.g:4821:4: (otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==22) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalBmod.g:4822:5: otherlv_10= ',' ( (lv_updateExpressions_11_0= ruleXExpression ) )
                    	    {
                    	    otherlv_10=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_10, grammarAccess.getXBasicForLoopExpressionAccess().getCommaKeyword_7_1_0());
                    	      				
                    	    }
                    	    // InternalBmod.g:4826:5: ( (lv_updateExpressions_11_0= ruleXExpression ) )
                    	    // InternalBmod.g:4827:6: (lv_updateExpressions_11_0= ruleXExpression )
                    	    {
                    	    // InternalBmod.g:4827:6: (lv_updateExpressions_11_0= ruleXExpression )
                    	    // InternalBmod.g:4828:7: lv_updateExpressions_11_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getUpdateExpressionsXExpressionParserRuleCall_7_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_49);
                    	    lv_updateExpressions_11_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"updateExpressions",
                    	      								lv_updateExpressions_11_0,
                    	      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,23,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getXBasicForLoopExpressionAccess().getRightParenthesisKeyword_8());
              		
            }
            // InternalBmod.g:4851:3: ( (lv_eachExpression_13_0= ruleXExpression ) )
            // InternalBmod.g:4852:4: (lv_eachExpression_13_0= ruleXExpression )
            {
            // InternalBmod.g:4852:4: (lv_eachExpression_13_0= ruleXExpression )
            // InternalBmod.g:4853:5: lv_eachExpression_13_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXBasicForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_eachExpression_13_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXBasicForLoopExpressionRule());
              					}
              					set(
              						current,
              						"eachExpression",
              						lv_eachExpression_13_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBasicForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // InternalBmod.g:4874:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // InternalBmod.g:4874:57: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // InternalBmod.g:4875:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // InternalBmod.g:4881:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:4887:2: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // InternalBmod.g:4888:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // InternalBmod.g:4888:2: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // InternalBmod.g:4889:3: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // InternalBmod.g:4889:3: ()
            // InternalBmod.g:4890:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,82,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,21,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalBmod.g:4904:3: ( (lv_predicate_3_0= ruleXExpression ) )
            // InternalBmod.g:4905:4: (lv_predicate_3_0= ruleXExpression )
            {
            // InternalBmod.g:4905:4: (lv_predicate_3_0= ruleXExpression )
            // InternalBmod.g:4906:5: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              					}
              					set(
              						current,
              						"predicate",
              						lv_predicate_3_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalBmod.g:4927:3: ( (lv_body_5_0= ruleXExpression ) )
            // InternalBmod.g:4928:4: (lv_body_5_0= ruleXExpression )
            {
            // InternalBmod.g:4928:4: (lv_body_5_0= ruleXExpression )
            // InternalBmod.g:4929:5: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_5_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // InternalBmod.g:4950:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // InternalBmod.g:4950:59: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // InternalBmod.g:4951:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // InternalBmod.g:4957:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:4963:2: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // InternalBmod.g:4964:2: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // InternalBmod.g:4964:2: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // InternalBmod.g:4965:3: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // InternalBmod.g:4965:3: ()
            // InternalBmod.g:4966:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,83,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
              		
            }
            // InternalBmod.g:4976:3: ( (lv_body_2_0= ruleXExpression ) )
            // InternalBmod.g:4977:4: (lv_body_2_0= ruleXExpression )
            {
            // InternalBmod.g:4977:4: (lv_body_2_0= ruleXExpression )
            // InternalBmod.g:4978:5: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_74);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_2_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,82,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,21,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalBmod.g:5003:3: ( (lv_predicate_5_0= ruleXExpression ) )
            // InternalBmod.g:5004:4: (lv_predicate_5_0= ruleXExpression )
            {
            // InternalBmod.g:5004:4: (lv_predicate_5_0= ruleXExpression )
            // InternalBmod.g:5005:5: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              					}
              					set(
              						current,
              						"predicate",
              						lv_predicate_5_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // InternalBmod.g:5030:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // InternalBmod.g:5030:57: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // InternalBmod.g:5031:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // InternalBmod.g:5037:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:5043:2: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // InternalBmod.g:5044:2: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // InternalBmod.g:5044:2: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // InternalBmod.g:5045:3: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // InternalBmod.g:5045:3: ()
            // InternalBmod.g:5046:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalBmod.g:5056:3: ( ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )? )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=RULE_STRING && LA68_0<=RULE_ID)||LA68_0==21||LA68_0==40||(LA68_0>=56 && LA68_0<=57)||LA68_0==62||(LA68_0>=69 && LA68_0<=70)||LA68_0==72||LA68_0==76||LA68_0==78||(LA68_0>=81 && LA68_0<=98)||LA68_0==100) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalBmod.g:5057:4: ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) ) (otherlv_3= ';' )?
            	    {
            	    // InternalBmod.g:5057:4: ( (lv_expressions_2_0= ruleXExpressionOrVarDeclaration ) )
            	    // InternalBmod.g:5058:5: (lv_expressions_2_0= ruleXExpressionOrVarDeclaration )
            	    {
            	    // InternalBmod.g:5058:5: (lv_expressions_2_0= ruleXExpressionOrVarDeclaration )
            	    // InternalBmod.g:5059:6: lv_expressions_2_0= ruleXExpressionOrVarDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionOrVarDeclarationParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_76);
            	    lv_expressions_2_0=ruleXExpressionOrVarDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_2_0,
            	      							"org.eclipse.xtext.xbase.Xbase.XExpressionOrVarDeclaration");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalBmod.g:5076:4: (otherlv_3= ';' )?
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==75) ) {
            	        alt67=1;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // InternalBmod.g:5077:5: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,75,FOLLOW_75); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_4=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionOrVarDeclaration"
    // InternalBmod.g:5091:1: entryRuleXExpressionOrVarDeclaration returns [EObject current=null] : iv_ruleXExpressionOrVarDeclaration= ruleXExpressionOrVarDeclaration EOF ;
    public final EObject entryRuleXExpressionOrVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionOrVarDeclaration = null;


        try {
            // InternalBmod.g:5091:68: (iv_ruleXExpressionOrVarDeclaration= ruleXExpressionOrVarDeclaration EOF )
            // InternalBmod.g:5092:2: iv_ruleXExpressionOrVarDeclaration= ruleXExpressionOrVarDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionOrVarDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXExpressionOrVarDeclaration=ruleXExpressionOrVarDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionOrVarDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionOrVarDeclaration"


    // $ANTLR start "ruleXExpressionOrVarDeclaration"
    // InternalBmod.g:5098:1: ruleXExpressionOrVarDeclaration returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionOrVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;



        	enterRule();

        try {
            // InternalBmod.g:5104:2: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // InternalBmod.g:5105:2: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // InternalBmod.g:5105:2: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=84 && LA69_0<=85)) ) {
                alt69=1;
            }
            else if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_ID)||LA69_0==21||LA69_0==40||(LA69_0>=56 && LA69_0<=57)||LA69_0==62||(LA69_0>=69 && LA69_0<=70)||LA69_0==72||LA69_0==76||LA69_0==78||(LA69_0>=81 && LA69_0<=83)||(LA69_0>=86 && LA69_0<=98)||LA69_0==100) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalBmod.g:5106:3: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXExpressionOrVarDeclarationAccess().getXVariableDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XVariableDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:5115:3: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getXExpressionOrVarDeclarationAccess().getXExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionOrVarDeclaration"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // InternalBmod.g:5127:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // InternalBmod.g:5127:61: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // InternalBmod.g:5128:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // InternalBmod.g:5134:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:5140:2: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // InternalBmod.g:5141:2: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // InternalBmod.g:5141:2: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // InternalBmod.g:5142:3: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // InternalBmod.g:5142:3: ()
            // InternalBmod.g:5143:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
              					current);
              			
            }

            }

            // InternalBmod.g:5149:3: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==84) ) {
                alt70=1;
            }
            else if ( (LA70_0==85) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalBmod.g:5150:4: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // InternalBmod.g:5150:4: ( (lv_writeable_1_0= 'var' ) )
                    // InternalBmod.g:5151:5: (lv_writeable_1_0= 'var' )
                    {
                    // InternalBmod.g:5151:5: (lv_writeable_1_0= 'var' )
                    // InternalBmod.g:5152:6: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,84,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      						}
                      						setWithLastConsumed(current, "writeable", true, "var");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:5165:4: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,85,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalBmod.g:5170:3: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                int LA71_1 = input.LA(2);

                if ( (synpred29_InternalBmod()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA71_0==21) && (synpred29_InternalBmod())) {
                alt71=1;
            }
            else if ( (LA71_0==53) && (synpred29_InternalBmod())) {
                alt71=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalBmod.g:5171:4: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // InternalBmod.g:5171:4: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // InternalBmod.g:5172:5: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // InternalBmod.g:5185:5: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // InternalBmod.g:5186:6: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // InternalBmod.g:5186:6: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // InternalBmod.g:5187:7: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // InternalBmod.g:5187:7: (lv_type_3_0= ruleJvmTypeReference )
                    // InternalBmod.g:5188:8: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0());
                      							
                    }
                    pushFollow(FOLLOW_77);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      								}
                      								set(
                      									current,
                      									"type",
                      									lv_type_3_0,
                      									"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalBmod.g:5205:6: ( (lv_name_4_0= ruleValidID ) )
                    // InternalBmod.g:5206:7: (lv_name_4_0= ruleValidID )
                    {
                    // InternalBmod.g:5206:7: (lv_name_4_0= ruleValidID )
                    // InternalBmod.g:5207:8: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0());
                      							
                    }
                    pushFollow(FOLLOW_78);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      								}
                      								set(
                      									current,
                      									"name",
                      									lv_name_4_0,
                      									"org.eclipse.xtext.xbase.Xtype.ValidID");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:5227:4: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // InternalBmod.g:5227:4: ( (lv_name_5_0= ruleValidID ) )
                    // InternalBmod.g:5228:5: (lv_name_5_0= ruleValidID )
                    {
                    // InternalBmod.g:5228:5: (lv_name_5_0= ruleValidID )
                    // InternalBmod.g:5229:6: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_78);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_5_0,
                      							"org.eclipse.xtext.xbase.Xtype.ValidID");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalBmod.g:5247:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==34) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalBmod.g:5248:4: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalBmod.g:5252:4: ( (lv_right_7_0= ruleXExpression ) )
                    // InternalBmod.g:5253:5: (lv_right_7_0= ruleXExpression )
                    {
                    // InternalBmod.g:5253:5: (lv_right_7_0= ruleXExpression )
                    // InternalBmod.g:5254:6: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_7_0,
                      							"org.eclipse.xtext.xbase.Xbase.XExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // InternalBmod.g:5276:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // InternalBmod.g:5276:59: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // InternalBmod.g:5277:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // InternalBmod.g:5283:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:5289:2: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // InternalBmod.g:5290:2: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // InternalBmod.g:5290:2: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // InternalBmod.g:5291:3: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // InternalBmod.g:5291:3: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==RULE_ID||LA73_1==40||LA73_1==66||LA73_1==72) ) {
                    alt73=1;
                }
            }
            else if ( (LA73_0==21||LA73_0==53) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalBmod.g:5292:4: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // InternalBmod.g:5292:4: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // InternalBmod.g:5293:5: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_77);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      					}
                      					set(
                      						current,
                      						"parameterType",
                      						lv_parameterType_0_0,
                      						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalBmod.g:5310:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalBmod.g:5311:4: (lv_name_1_0= ruleValidID )
            {
            // InternalBmod.g:5311:4: (lv_name_1_0= ruleValidID )
            // InternalBmod.g:5312:5: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.xbase.Xtype.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // InternalBmod.g:5333:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // InternalBmod.g:5333:63: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // InternalBmod.g:5334:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // InternalBmod.g:5340:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:5346:2: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // InternalBmod.g:5347:2: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // InternalBmod.g:5347:2: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // InternalBmod.g:5348:3: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // InternalBmod.g:5348:3: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // InternalBmod.g:5349:4: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // InternalBmod.g:5349:4: (lv_parameterType_0_0= ruleJvmTypeReference )
            // InternalBmod.g:5350:5: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_77);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              					}
              					set(
              						current,
              						"parameterType",
              						lv_parameterType_0_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBmod.g:5367:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalBmod.g:5368:4: (lv_name_1_0= ruleValidID )
            {
            // InternalBmod.g:5368:4: (lv_name_1_0= ruleValidID )
            // InternalBmod.g:5369:5: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.xbase.Xtype.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // InternalBmod.g:5390:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // InternalBmod.g:5390:53: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // InternalBmod.g:5391:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // InternalBmod.g:5397:1: ruleXFeatureCall returns [EObject current=null] : ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_explicitOperationCall_7_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_typeArguments_2_0 = null;

        EObject lv_typeArguments_4_0 = null;

        EObject lv_featureCallArguments_8_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_11_0 = null;

        EObject lv_featureCallArguments_13_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:5403:2: ( ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? ) )
            // InternalBmod.g:5404:2: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? )
            {
            // InternalBmod.g:5404:2: ( () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )? )
            // InternalBmod.g:5405:3: () (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?
            {
            // InternalBmod.g:5405:3: ()
            // InternalBmod.g:5406:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
              					current);
              			
            }

            }

            // InternalBmod.g:5412:3: (otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==40) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalBmod.g:5413:4: otherlv_1= '<' ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_1_0());
                      			
                    }
                    // InternalBmod.g:5417:4: ( (lv_typeArguments_2_0= ruleJvmArgumentTypeReference ) )
                    // InternalBmod.g:5418:5: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalBmod.g:5418:5: (lv_typeArguments_2_0= ruleJvmArgumentTypeReference )
                    // InternalBmod.g:5419:6: lv_typeArguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
                    lv_typeArguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      						}
                      						add(
                      							current,
                      							"typeArguments",
                      							lv_typeArguments_2_0,
                      							"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBmod.g:5436:4: (otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==22) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalBmod.g:5437:5: otherlv_3= ',' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_45); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getXFeatureCallAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalBmod.g:5441:5: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalBmod.g:5442:6: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalBmod.g:5442:6: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    	    // InternalBmod.g:5443:7: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"typeArguments",
                    	      								lv_typeArguments_4_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,41,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalBmod.g:5466:3: ( ( ruleIdOrSuper ) )
            // InternalBmod.g:5467:4: ( ruleIdOrSuper )
            {
            // InternalBmod.g:5467:4: ( ruleIdOrSuper )
            // InternalBmod.g:5468:5: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getXFeatureCallRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_79);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBmod.g:5482:3: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // InternalBmod.g:5483:4: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')'
                    {
                    // InternalBmod.g:5483:4: ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) )
                    // InternalBmod.g:5484:5: ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' )
                    {
                    // InternalBmod.g:5488:5: (lv_explicitOperationCall_7_0= '(' )
                    // InternalBmod.g:5489:6: lv_explicitOperationCall_7_0= '('
                    {
                    lv_explicitOperationCall_7_0=(Token)match(input,21,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_explicitOperationCall_7_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXFeatureCallRule());
                      						}
                      						setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      					
                    }

                    }


                    }

                    // InternalBmod.g:5501:4: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?
                    int alt77=3;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // InternalBmod.g:5502:5: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            {
                            // InternalBmod.g:5502:5: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) )
                            // InternalBmod.g:5503:6: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure )
                            {
                            // InternalBmod.g:5528:6: (lv_featureCallArguments_8_0= ruleXShortClosure )
                            // InternalBmod.g:5529:7: lv_featureCallArguments_8_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_12);
                            lv_featureCallArguments_8_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              							}
                              							add(
                              								current,
                              								"featureCallArguments",
                              								lv_featureCallArguments_8_0,
                              								"org.eclipse.xtext.xbase.Xbase.XShortClosure");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalBmod.g:5547:5: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            {
                            // InternalBmod.g:5547:5: ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* )
                            // InternalBmod.g:5548:6: ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            {
                            // InternalBmod.g:5548:6: ( (lv_featureCallArguments_9_0= ruleXExpression ) )
                            // InternalBmod.g:5549:7: (lv_featureCallArguments_9_0= ruleXExpression )
                            {
                            // InternalBmod.g:5549:7: (lv_featureCallArguments_9_0= ruleXExpression )
                            // InternalBmod.g:5550:8: lv_featureCallArguments_9_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_49);
                            lv_featureCallArguments_9_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              								}
                              								add(
                              									current,
                              									"featureCallArguments",
                              									lv_featureCallArguments_9_0,
                              									"org.eclipse.xtext.xbase.Xbase.XExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalBmod.g:5567:6: (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )*
                            loop76:
                            do {
                                int alt76=2;
                                int LA76_0 = input.LA(1);

                                if ( (LA76_0==22) ) {
                                    alt76=1;
                                }


                                switch (alt76) {
                            	case 1 :
                            	    // InternalBmod.g:5568:7: otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    {
                            	    otherlv_10=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_10, grammarAccess.getXFeatureCallAccess().getCommaKeyword_3_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalBmod.g:5572:7: ( (lv_featureCallArguments_11_0= ruleXExpression ) )
                            	    // InternalBmod.g:5573:8: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    {
                            	    // InternalBmod.g:5573:8: (lv_featureCallArguments_11_0= ruleXExpression )
                            	    // InternalBmod.g:5574:9: lv_featureCallArguments_11_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_3_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_49);
                            	    lv_featureCallArguments_11_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"featureCallArguments",
                            	      										lv_featureCallArguments_11_0,
                            	      										"org.eclipse.xtext.xbase.Xbase.XExpression");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop76;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,23,FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalBmod.g:5599:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // InternalBmod.g:5600:4: ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure )
                    {
                    // InternalBmod.g:5606:4: (lv_featureCallArguments_13_0= ruleXClosure )
                    // InternalBmod.g:5607:5: lv_featureCallArguments_13_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_featureCallArguments_13_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      					}
                      					add(
                      						current,
                      						"featureCallArguments",
                      						lv_featureCallArguments_13_0,
                      						"org.eclipse.xtext.xbase.Xbase.XClosure");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleFeatureCallID"
    // InternalBmod.g:5628:1: entryRuleFeatureCallID returns [String current=null] : iv_ruleFeatureCallID= ruleFeatureCallID EOF ;
    public final String entryRuleFeatureCallID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCallID = null;


        try {
            // InternalBmod.g:5628:53: (iv_ruleFeatureCallID= ruleFeatureCallID EOF )
            // InternalBmod.g:5629:2: iv_ruleFeatureCallID= ruleFeatureCallID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureCallID=ruleFeatureCallID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCallID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureCallID"


    // $ANTLR start "ruleFeatureCallID"
    // InternalBmod.g:5635:1: ruleFeatureCallID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCallID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:5641:2: ( (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) )
            // InternalBmod.g:5642:2: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            {
            // InternalBmod.g:5642:2: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            int alt80=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt80=1;
                }
                break;
            case 86:
                {
                alt80=2;
                }
                break;
            case 87:
                {
                alt80=3;
                }
                break;
            case 88:
                {
                alt80=4;
                }
                break;
            case 89:
                {
                alt80=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalBmod.g:5643:3: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureCallIDAccess().getValidIDParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ValidID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:5654:3: kw= 'extends'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtendsKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBmod.g:5660:3: kw= 'static'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getStaticKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBmod.g:5666:3: kw= 'import'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getImportKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalBmod.g:5672:3: kw= 'extension'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtensionKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCallID"


    // $ANTLR start "entryRuleIdOrSuper"
    // InternalBmod.g:5681:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // InternalBmod.g:5681:49: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // InternalBmod.g:5682:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // InternalBmod.g:5688:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureCallID_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:5694:2: ( (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) )
            // InternalBmod.g:5695:2: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            {
            // InternalBmod.g:5695:2: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID||(LA81_0>=86 && LA81_0<=89)) ) {
                alt81=1;
            }
            else if ( (LA81_0==90) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalBmod.g:5696:3: this_FeatureCallID_0= ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIdOrSuperAccess().getFeatureCallIDParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FeatureCallID_0=ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FeatureCallID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:5707:3: kw= 'super'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleXConstructorCall"
    // InternalBmod.g:5716:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // InternalBmod.g:5716:57: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // InternalBmod.g:5717:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // InternalBmod.g:5723:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_explicitConstructorCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:5729:2: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // InternalBmod.g:5730:2: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // InternalBmod.g:5730:2: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // InternalBmod.g:5731:3: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // InternalBmod.g:5731:3: ()
            // InternalBmod.g:5732:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,91,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
              		
            }
            // InternalBmod.g:5742:3: ( ( ruleQualifiedName ) )
            // InternalBmod.g:5743:4: ( ruleQualifiedName )
            {
            // InternalBmod.g:5743:4: ( ruleQualifiedName )
            // InternalBmod.g:5744:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getXConstructorCallRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_81);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBmod.g:5758:3: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // InternalBmod.g:5759:4: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // InternalBmod.g:5759:4: ( ( '<' )=>otherlv_3= '<' )
                    // InternalBmod.g:5760:5: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                      				
                    }

                    }

                    // InternalBmod.g:5766:4: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // InternalBmod.g:5767:5: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalBmod.g:5767:5: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // InternalBmod.g:5768:6: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      						}
                      						add(
                      							current,
                      							"typeArguments",
                      							lv_typeArguments_4_0,
                      							"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBmod.g:5785:4: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==22) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalBmod.g:5786:5: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_45); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalBmod.g:5790:5: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalBmod.g:5791:6: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalBmod.g:5791:6: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // InternalBmod.g:5792:7: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"typeArguments",
                    	      								lv_typeArguments_6_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,41,FOLLOW_79); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                      			
                    }

                    }
                    break;

            }

            // InternalBmod.g:5815:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // InternalBmod.g:5816:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // InternalBmod.g:5816:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) )
                    // InternalBmod.g:5817:5: ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' )
                    {
                    // InternalBmod.g:5821:5: (lv_explicitConstructorCall_8_0= '(' )
                    // InternalBmod.g:5822:6: lv_explicitConstructorCall_8_0= '('
                    {
                    lv_explicitConstructorCall_8_0=(Token)match(input,21,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_explicitConstructorCall_8_0, grammarAccess.getXConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXConstructorCallRule());
                      						}
                      						setWithLastConsumed(current, "explicitConstructorCall", true, "(");
                      					
                    }

                    }


                    }

                    // InternalBmod.g:5834:4: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt85=3;
                    alt85 = dfa85.predict(input);
                    switch (alt85) {
                        case 1 :
                            // InternalBmod.g:5835:5: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // InternalBmod.g:5835:5: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // InternalBmod.g:5836:6: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // InternalBmod.g:5861:6: (lv_arguments_9_0= ruleXShortClosure )
                            // InternalBmod.g:5862:7: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_12);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              							}
                              							add(
                              								current,
                              								"arguments",
                              								lv_arguments_9_0,
                              								"org.eclipse.xtext.xbase.Xbase.XShortClosure");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalBmod.g:5880:5: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // InternalBmod.g:5880:5: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // InternalBmod.g:5881:6: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // InternalBmod.g:5881:6: ( (lv_arguments_10_0= ruleXExpression ) )
                            // InternalBmod.g:5882:7: (lv_arguments_10_0= ruleXExpression )
                            {
                            // InternalBmod.g:5882:7: (lv_arguments_10_0= ruleXExpression )
                            // InternalBmod.g:5883:8: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_49);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              								}
                              								add(
                              									current,
                              									"arguments",
                              									lv_arguments_10_0,
                              									"org.eclipse.xtext.xbase.Xbase.XExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalBmod.g:5900:6: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop84:
                            do {
                                int alt84=2;
                                int LA84_0 = input.LA(1);

                                if ( (LA84_0==22) ) {
                                    alt84=1;
                                }


                                switch (alt84) {
                            	case 1 :
                            	    // InternalBmod.g:5901:7: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalBmod.g:5905:7: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // InternalBmod.g:5906:8: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // InternalBmod.g:5906:8: (lv_arguments_12_0= ruleXExpression )
                            	    // InternalBmod.g:5907:9: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_49);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"arguments",
                            	      										lv_arguments_12_0,
                            	      										"org.eclipse.xtext.xbase.Xbase.XExpression");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop84;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,23,FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            // InternalBmod.g:5932:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt87=2;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // InternalBmod.g:5933:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // InternalBmod.g:5939:4: (lv_arguments_14_0= ruleXClosure )
                    // InternalBmod.g:5940:5: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      					}
                      					add(
                      						current,
                      						"arguments",
                      						lv_arguments_14_0,
                      						"org.eclipse.xtext.xbase.Xbase.XClosure");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // InternalBmod.g:5961:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // InternalBmod.g:5961:56: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // InternalBmod.g:5962:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // InternalBmod.g:5968:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;


        	enterRule();

        try {
            // InternalBmod.g:5974:2: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // InternalBmod.g:5975:2: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // InternalBmod.g:5975:2: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // InternalBmod.g:5976:3: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // InternalBmod.g:5976:3: ()
            // InternalBmod.g:5977:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalBmod.g:5983:3: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==92) ) {
                alt88=1;
            }
            else if ( (LA88_0==93) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalBmod.g:5984:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:5989:4: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // InternalBmod.g:5989:4: ( (lv_isTrue_2_0= 'true' ) )
                    // InternalBmod.g:5990:5: (lv_isTrue_2_0= 'true' )
                    {
                    // InternalBmod.g:5990:5: (lv_isTrue_2_0= 'true' )
                    // InternalBmod.g:5991:6: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "isTrue", true, "true");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // InternalBmod.g:6008:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // InternalBmod.g:6008:53: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // InternalBmod.g:6009:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // InternalBmod.g:6015:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBmod.g:6021:2: ( ( () otherlv_1= 'null' ) )
            // InternalBmod.g:6022:2: ( () otherlv_1= 'null' )
            {
            // InternalBmod.g:6022:2: ( () otherlv_1= 'null' )
            // InternalBmod.g:6023:3: () otherlv_1= 'null'
            {
            // InternalBmod.g:6023:3: ()
            // InternalBmod.g:6024:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // InternalBmod.g:6038:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // InternalBmod.g:6038:55: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // InternalBmod.g:6039:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // InternalBmod.g:6045:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:6051:2: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // InternalBmod.g:6052:2: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // InternalBmod.g:6052:2: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // InternalBmod.g:6053:3: () ( (lv_value_1_0= ruleNumber ) )
            {
            // InternalBmod.g:6053:3: ()
            // InternalBmod.g:6054:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalBmod.g:6060:3: ( (lv_value_1_0= ruleNumber ) )
            // InternalBmod.g:6061:4: (lv_value_1_0= ruleNumber )
            {
            // InternalBmod.g:6061:4: (lv_value_1_0= ruleNumber )
            // InternalBmod.g:6062:5: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.xtext.xbase.Xbase.Number");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // InternalBmod.g:6083:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // InternalBmod.g:6083:55: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // InternalBmod.g:6084:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // InternalBmod.g:6090:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalBmod.g:6096:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalBmod.g:6097:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalBmod.g:6097:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalBmod.g:6098:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalBmod.g:6098:3: ()
            // InternalBmod.g:6099:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalBmod.g:6105:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalBmod.g:6106:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalBmod.g:6106:4: (lv_value_1_0= RULE_STRING )
            // InternalBmod.g:6107:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getXStringLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.xtext.xbase.Xtype.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // InternalBmod.g:6127:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // InternalBmod.g:6127:53: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // InternalBmod.g:6128:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // InternalBmod.g:6134:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayDimensions_4_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:6140:2: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) )
            // InternalBmod.g:6141:2: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            {
            // InternalBmod.g:6141:2: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            // InternalBmod.g:6142:3: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')'
            {
            // InternalBmod.g:6142:3: ()
            // InternalBmod.g:6143:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,95,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,21,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalBmod.g:6157:3: ( ( ruleQualifiedName ) )
            // InternalBmod.g:6158:4: ( ruleQualifiedName )
            {
            // InternalBmod.g:6158:4: ( ruleQualifiedName )
            // InternalBmod.g:6159:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getXTypeLiteralRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_82);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBmod.g:6173:3: ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==72) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalBmod.g:6174:4: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    {
            	    // InternalBmod.g:6174:4: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    // InternalBmod.g:6175:5: lv_arrayDimensions_4_0= ruleArrayBrackets
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getXTypeLiteralAccess().getArrayDimensionsArrayBracketsParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_82);
            	    lv_arrayDimensions_4_0=ruleArrayBrackets();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getXTypeLiteralRule());
            	      					}
            	      					add(
            	      						current,
            	      						"arrayDimensions",
            	      						lv_arrayDimensions_4_0,
            	      						"org.eclipse.xtext.xbase.Xtype.ArrayBrackets");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // InternalBmod.g:6200:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // InternalBmod.g:6200:57: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // InternalBmod.g:6201:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // InternalBmod.g:6207:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:6213:2: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // InternalBmod.g:6214:2: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // InternalBmod.g:6214:2: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // InternalBmod.g:6215:3: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // InternalBmod.g:6215:3: ()
            // InternalBmod.g:6216:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,96,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
              		
            }
            // InternalBmod.g:6226:3: ( (lv_expression_2_0= ruleXExpression ) )
            // InternalBmod.g:6227:4: (lv_expression_2_0= ruleXExpression )
            {
            // InternalBmod.g:6227:4: (lv_expression_2_0= ruleXExpression )
            // InternalBmod.g:6228:5: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // InternalBmod.g:6249:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // InternalBmod.g:6249:58: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // InternalBmod.g:6250:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // InternalBmod.g:6256:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:6262:2: ( ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // InternalBmod.g:6263:2: ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // InternalBmod.g:6263:2: ( () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )? )
            // InternalBmod.g:6264:3: () otherlv_1= 'return' ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // InternalBmod.g:6264:3: ()
            // InternalBmod.g:6265:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,97,FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
              		
            }
            // InternalBmod.g:6275:3: ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // InternalBmod.g:6276:4: ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // InternalBmod.g:6277:4: (lv_expression_2_0= ruleXExpression )
                    // InternalBmod.g:6278:5: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_2_0,
                      						"org.eclipse.xtext.xbase.Xbase.XExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // InternalBmod.g:6299:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // InternalBmod.g:6299:67: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // InternalBmod.g:6300:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // InternalBmod.g:6306:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:6312:2: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // InternalBmod.g:6313:2: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // InternalBmod.g:6313:2: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // InternalBmod.g:6314:3: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // InternalBmod.g:6314:3: ()
            // InternalBmod.g:6315:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,98,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
              		
            }
            // InternalBmod.g:6325:3: ( (lv_expression_2_0= ruleXExpression ) )
            // InternalBmod.g:6326:4: (lv_expression_2_0= ruleXExpression )
            {
            // InternalBmod.g:6326:4: (lv_expression_2_0= ruleXExpression )
            // InternalBmod.g:6327:5: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_84);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBmod.g:6344:3: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==101) ) {
                alt93=1;
            }
            else if ( (LA93_0==99) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalBmod.g:6345:4: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // InternalBmod.g:6345:4: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // InternalBmod.g:6346:5: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // InternalBmod.g:6346:5: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt91=0;
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==101) ) {
                            int LA91_2 = input.LA(2);

                            if ( (synpred38_InternalBmod()) ) {
                                alt91=1;
                            }


                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalBmod.g:6347:6: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // InternalBmod.g:6348:6: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // InternalBmod.g:6349:7: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_85);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"catchClauses",
                    	      								lv_catchClauses_3_0,
                    	      								"org.eclipse.xtext.xbase.Xbase.XCatchClause");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt91 >= 1 ) break loop91;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(91, input);
                                throw eee;
                        }
                        cnt91++;
                    } while (true);

                    // InternalBmod.g:6366:5: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==99) ) {
                        int LA92_1 = input.LA(2);

                        if ( (synpred39_InternalBmod()) ) {
                            alt92=1;
                        }
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalBmod.g:6367:6: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // InternalBmod.g:6367:6: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // InternalBmod.g:6368:7: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,99,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                              						
                            }

                            }

                            // InternalBmod.g:6374:6: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // InternalBmod.g:6375:7: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // InternalBmod.g:6375:7: (lv_finallyExpression_5_0= ruleXExpression )
                            // InternalBmod.g:6376:8: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              								}
                              								set(
                              									current,
                              									"finallyExpression",
                              									lv_finallyExpression_5_0,
                              									"org.eclipse.xtext.xbase.Xbase.XExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:6396:4: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // InternalBmod.g:6396:4: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // InternalBmod.g:6397:5: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,99,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                      				
                    }
                    // InternalBmod.g:6401:5: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // InternalBmod.g:6402:6: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // InternalBmod.g:6402:6: (lv_finallyExpression_7_0= ruleXExpression )
                    // InternalBmod.g:6403:7: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      							}
                      							set(
                      								current,
                      								"finallyExpression",
                      								lv_finallyExpression_7_0,
                      								"org.eclipse.xtext.xbase.Xbase.XExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXSynchronizedExpression"
    // InternalBmod.g:6426:1: entryRuleXSynchronizedExpression returns [EObject current=null] : iv_ruleXSynchronizedExpression= ruleXSynchronizedExpression EOF ;
    public final EObject entryRuleXSynchronizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSynchronizedExpression = null;


        try {
            // InternalBmod.g:6426:64: (iv_ruleXSynchronizedExpression= ruleXSynchronizedExpression EOF )
            // InternalBmod.g:6427:2: iv_ruleXSynchronizedExpression= ruleXSynchronizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSynchronizedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXSynchronizedExpression=ruleXSynchronizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSynchronizedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSynchronizedExpression"


    // $ANTLR start "ruleXSynchronizedExpression"
    // InternalBmod.g:6433:1: ruleXSynchronizedExpression returns [EObject current=null] : ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXSynchronizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_param_3_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:6439:2: ( ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // InternalBmod.g:6440:2: ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // InternalBmod.g:6440:2: ( ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) ) )
            // InternalBmod.g:6441:3: ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) ) ( (lv_param_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_expression_5_0= ruleXExpression ) )
            {
            // InternalBmod.g:6441:3: ( ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' ) )
            // InternalBmod.g:6442:4: ( ( () 'synchronized' '(' ) )=> ( () otherlv_1= 'synchronized' otherlv_2= '(' )
            {
            // InternalBmod.g:6449:4: ( () otherlv_1= 'synchronized' otherlv_2= '(' )
            // InternalBmod.g:6450:5: () otherlv_1= 'synchronized' otherlv_2= '('
            {
            // InternalBmod.g:6450:5: ()
            // InternalBmod.g:6451:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getXSynchronizedExpressionAccess().getXSynchronizedExpressionAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,100,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getXSynchronizedExpressionAccess().getSynchronizedKeyword_0_0_1());
              				
            }
            otherlv_2=(Token)match(input,21,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getXSynchronizedExpressionAccess().getLeftParenthesisKeyword_0_0_2());
              				
            }

            }


            }

            // InternalBmod.g:6467:3: ( (lv_param_3_0= ruleXExpression ) )
            // InternalBmod.g:6468:4: (lv_param_3_0= ruleXExpression )
            {
            // InternalBmod.g:6468:4: (lv_param_3_0= ruleXExpression )
            // InternalBmod.g:6469:5: lv_param_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXSynchronizedExpressionAccess().getParamXExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_param_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXSynchronizedExpressionRule());
              					}
              					set(
              						current,
              						"param",
              						lv_param_3_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getXSynchronizedExpressionAccess().getRightParenthesisKeyword_2());
              		
            }
            // InternalBmod.g:6490:3: ( (lv_expression_5_0= ruleXExpression ) )
            // InternalBmod.g:6491:4: (lv_expression_5_0= ruleXExpression )
            {
            // InternalBmod.g:6491:4: (lv_expression_5_0= ruleXExpression )
            // InternalBmod.g:6492:5: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXSynchronizedExpressionAccess().getExpressionXExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXSynchronizedExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_5_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSynchronizedExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // InternalBmod.g:6513:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // InternalBmod.g:6513:53: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // InternalBmod.g:6514:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // InternalBmod.g:6520:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:6526:2: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // InternalBmod.g:6527:2: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // InternalBmod.g:6527:2: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // InternalBmod.g:6528:3: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // InternalBmod.g:6528:3: ( ( 'catch' )=>otherlv_0= 'catch' )
            // InternalBmod.g:6529:4: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,101,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalBmod.g:6539:3: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // InternalBmod.g:6540:4: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // InternalBmod.g:6540:4: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // InternalBmod.g:6541:5: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              					}
              					set(
              						current,
              						"declaredParam",
              						lv_declaredParam_2_0,
              						"org.eclipse.xtext.xbase.Xbase.FullJvmFormalParameter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalBmod.g:6562:3: ( (lv_expression_4_0= ruleXExpression ) )
            // InternalBmod.g:6563:4: (lv_expression_4_0= ruleXExpression )
            {
            // InternalBmod.g:6563:4: (lv_expression_4_0= ruleXExpression )
            // InternalBmod.g:6564:5: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_4_0,
              						"org.eclipse.xtext.xbase.Xbase.XExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBmod.g:6585:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBmod.g:6585:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBmod.g:6586:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalBmod.g:6592:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalBmod.g:6598:2: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // InternalBmod.g:6599:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // InternalBmod.g:6599:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // InternalBmod.g:6600:3: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_86);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ValidID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBmod.g:6610:3: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==66) ) {
                    int LA94_2 = input.LA(2);

                    if ( (LA94_2==RULE_ID) ) {
                        int LA94_3 = input.LA(3);

                        if ( (synpred42_InternalBmod()) ) {
                            alt94=1;
                        }


                    }


                }


                switch (alt94) {
            	case 1 :
            	    // InternalBmod.g:6611:4: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // InternalBmod.g:6611:4: ( ( '.' )=>kw= '.' )
            	    // InternalBmod.g:6612:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,66,FOLLOW_77); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_86);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ValidID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // InternalBmod.g:6634:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalBmod.g:6636:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalBmod.g:6637:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalBmod.g:6646:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalBmod.g:6653:2: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // InternalBmod.g:6654:2: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // InternalBmod.g:6654:2: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_HEX) ) {
                alt98=1;
            }
            else if ( (LA98_0==RULE_INT||LA98_0==RULE_DECIMAL) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalBmod.g:6655:3: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_HEX_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:6663:3: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // InternalBmod.g:6663:3: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // InternalBmod.g:6664:4: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // InternalBmod.g:6664:4: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==RULE_INT) ) {
                        alt95=1;
                    }
                    else if ( (LA95_0==RULE_DECIMAL) ) {
                        alt95=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalBmod.g:6665:5: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_86); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_INT_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalBmod.g:6673:5: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_86); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_DECIMAL_2);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalBmod.g:6681:4: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==66) ) {
                        int LA97_1 = input.LA(2);

                        if ( (LA97_1==RULE_INT||LA97_1==RULE_DECIMAL) ) {
                            alt97=1;
                        }
                    }
                    switch (alt97) {
                        case 1 :
                            // InternalBmod.g:6682:5: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,66,FOLLOW_87); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0());
                              				
                            }
                            // InternalBmod.g:6687:5: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt96=2;
                            int LA96_0 = input.LA(1);

                            if ( (LA96_0==RULE_INT) ) {
                                alt96=1;
                            }
                            else if ( (LA96_0==RULE_DECIMAL) ) {
                                alt96=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 96, 0, input);

                                throw nvae;
                            }
                            switch (alt96) {
                                case 1 :
                                    // InternalBmod.g:6688:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(this_INT_4);
                                      					
                                    }
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0());
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalBmod.g:6696:6: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(this_DECIMAL_5);
                                      					
                                    }
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1());
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // InternalBmod.g:6713:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // InternalBmod.g:6713:57: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // InternalBmod.g:6714:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // InternalBmod.g:6720:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;



        	enterRule();

        try {
            // InternalBmod.g:6726:2: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // InternalBmod.g:6727:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // InternalBmod.g:6727:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_ID) ) {
                alt100=1;
            }
            else if ( (LA100_0==21||LA100_0==53) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalBmod.g:6728:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // InternalBmod.g:6728:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // InternalBmod.g:6729:4: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_80);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_JvmParameterizedTypeReference_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalBmod.g:6737:4: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==72) ) {
                            int LA99_2 = input.LA(2);

                            if ( (LA99_2==73) ) {
                                int LA99_3 = input.LA(3);

                                if ( (synpred43_InternalBmod()) ) {
                                    alt99=1;
                                }


                            }


                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalBmod.g:6738:5: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // InternalBmod.g:6744:5: ( () ruleArrayBrackets )
                    	    // InternalBmod.g:6745:6: () ruleArrayBrackets
                    	    {
                    	    // InternalBmod.g:6745:6: ()
                    	    // InternalBmod.g:6746:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_80);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:6763:3: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XFunctionTypeRef_3=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XFunctionTypeRef_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // InternalBmod.g:6775:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // InternalBmod.g:6775:53: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // InternalBmod.g:6776:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // InternalBmod.g:6782:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBmod.g:6788:2: ( (kw= '[' kw= ']' ) )
            // InternalBmod.g:6789:2: (kw= '[' kw= ']' )
            {
            // InternalBmod.g:6789:2: (kw= '[' kw= ']' )
            // InternalBmod.g:6790:3: kw= '[' kw= ']'
            {
            kw=(Token)match(input,72,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // InternalBmod.g:6804:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // InternalBmod.g:6804:57: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // InternalBmod.g:6805:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // InternalBmod.g:6811:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:6817:2: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // InternalBmod.g:6818:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // InternalBmod.g:6818:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // InternalBmod.g:6819:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // InternalBmod.g:6819:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==21) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalBmod.g:6820:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_88); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    // InternalBmod.g:6824:4: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==RULE_ID||LA102_0==21||LA102_0==53) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalBmod.g:6825:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // InternalBmod.g:6825:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // InternalBmod.g:6826:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // InternalBmod.g:6826:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // InternalBmod.g:6827:7: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_49);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              							}
                              							add(
                              								current,
                              								"paramTypes",
                              								lv_paramTypes_1_0,
                              								"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalBmod.g:6844:5: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop101:
                            do {
                                int alt101=2;
                                int LA101_0 = input.LA(1);

                                if ( (LA101_0==22) ) {
                                    alt101=1;
                                }


                                switch (alt101) {
                            	case 1 :
                            	    // InternalBmod.g:6845:6: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,22,FOLLOW_33); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	      					
                            	    }
                            	    // InternalBmod.g:6849:6: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // InternalBmod.g:6850:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // InternalBmod.g:6850:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // InternalBmod.g:6851:8: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_49);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"paramTypes",
                            	      									lv_paramTypes_3_0,
                            	      									"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop101;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_89); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,53,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalBmod.g:6879:3: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // InternalBmod.g:6880:4: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // InternalBmod.g:6880:4: (lv_returnType_6_0= ruleJvmTypeReference )
            // InternalBmod.g:6881:5: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_6_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // InternalBmod.g:6902:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // InternalBmod.g:6902:70: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // InternalBmod.g:6903:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // InternalBmod.g:6909:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:6915:2: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) )
            // InternalBmod.g:6916:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            {
            // InternalBmod.g:6916:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            // InternalBmod.g:6917:3: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            {
            // InternalBmod.g:6917:3: ( ( ruleQualifiedName ) )
            // InternalBmod.g:6918:4: ( ruleQualifiedName )
            {
            // InternalBmod.g:6918:4: ( ruleQualifiedName )
            // InternalBmod.g:6919:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_90);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBmod.g:6933:3: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            int alt108=2;
            alt108 = dfa108.predict(input);
            switch (alt108) {
                case 1 :
                    // InternalBmod.g:6934:4: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    {
                    // InternalBmod.g:6934:4: ( ( '<' )=>otherlv_1= '<' )
                    // InternalBmod.g:6935:5: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                      				
                    }

                    }

                    // InternalBmod.g:6941:4: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // InternalBmod.g:6942:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalBmod.g:6942:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // InternalBmod.g:6943:6: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      						}
                      						add(
                      							current,
                      							"arguments",
                      							lv_arguments_2_0,
                      							"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBmod.g:6960:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==22) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // InternalBmod.g:6961:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_45); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalBmod.g:6965:5: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalBmod.g:6966:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalBmod.g:6966:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // InternalBmod.g:6967:7: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arguments",
                    	      								lv_arguments_4_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,41,FOLLOW_86); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                      			
                    }
                    // InternalBmod.g:6989:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==66) ) {
                            int LA107_2 = input.LA(2);

                            if ( (LA107_2==RULE_ID) ) {
                                int LA107_3 = input.LA(3);

                                if ( (synpred45_InternalBmod()) ) {
                                    alt107=1;
                                }


                            }


                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalBmod.g:6990:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    {
                    	    // InternalBmod.g:6990:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
                    	    // InternalBmod.g:6991:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
                    	    {
                    	    // InternalBmod.g:6997:6: ( () otherlv_7= '.' )
                    	    // InternalBmod.g:6998:7: () otherlv_7= '.'
                    	    {
                    	    // InternalBmod.g:6998:7: ()
                    	    // InternalBmod.g:6999:8: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								current = forceCreateModelElementAndSet(
                    	      									grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0(),
                    	      									current);
                    	      							
                    	    }

                    	    }

                    	    otherlv_7=(Token)match(input,66,FOLLOW_77); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_7, grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalBmod.g:7011:5: ( ( ruleValidID ) )
                    	    // InternalBmod.g:7012:6: ( ruleValidID )
                    	    {
                    	    // InternalBmod.g:7012:6: ( ruleValidID )
                    	    // InternalBmod.g:7013:7: ruleValidID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_91);
                    	    ruleValidID();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalBmod.g:7027:5: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    int alt106=2;
                    	    alt106 = dfa106.predict(input);
                    	    switch (alt106) {
                    	        case 1 :
                    	            // InternalBmod.g:7028:6: ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>'
                    	            {
                    	            // InternalBmod.g:7028:6: ( ( '<' )=>otherlv_9= '<' )
                    	            // InternalBmod.g:7029:7: ( '<' )=>otherlv_9= '<'
                    	            {
                    	            otherlv_9=(Token)match(input,40,FOLLOW_45); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_9, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0());
                    	              						
                    	            }

                    	            }

                    	            // InternalBmod.g:7035:6: ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) )
                    	            // InternalBmod.g:7036:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            {
                    	            // InternalBmod.g:7036:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            // InternalBmod.g:7037:8: lv_arguments_10_0= ruleJvmArgumentTypeReference
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_46);
                    	            lv_arguments_10_0=ruleJvmArgumentTypeReference();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	              								}
                    	              								add(
                    	              									current,
                    	              									"arguments",
                    	              									lv_arguments_10_0,
                    	              									"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }


                    	            }

                    	            // InternalBmod.g:7054:6: (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )*
                    	            loop105:
                    	            do {
                    	                int alt105=2;
                    	                int LA105_0 = input.LA(1);

                    	                if ( (LA105_0==22) ) {
                    	                    alt105=1;
                    	                }


                    	                switch (alt105) {
                    	            	case 1 :
                    	            	    // InternalBmod.g:7055:7: otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    {
                    	            	    otherlv_11=(Token)match(input,22,FOLLOW_45); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      							newLeafNode(otherlv_11, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0());
                    	            	      						
                    	            	    }
                    	            	    // InternalBmod.g:7059:7: ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    // InternalBmod.g:7060:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    {
                    	            	    // InternalBmod.g:7060:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    // InternalBmod.g:7061:9: lv_arguments_12_0= ruleJvmArgumentTypeReference
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_2_1_0());
                    	            	      								
                    	            	    }
                    	            	    pushFollow(FOLLOW_46);
                    	            	    lv_arguments_12_0=ruleJvmArgumentTypeReference();

                    	            	    state._fsp--;
                    	            	    if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									if (current==null) {
                    	            	      										current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	            	      									}
                    	            	      									add(
                    	            	      										current,
                    	            	      										"arguments",
                    	            	      										lv_arguments_12_0,
                    	            	      										"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	            	      									afterParserOrEnumRuleCall();
                    	            	      								
                    	            	    }

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop105;
                    	                }
                    	            } while (true);

                    	            otherlv_13=(Token)match(input,41,FOLLOW_86); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_13, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // InternalBmod.g:7090:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // InternalBmod.g:7090:65: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // InternalBmod.g:7091:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // InternalBmod.g:7097:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;



        	enterRule();

        try {
            // InternalBmod.g:7103:2: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // InternalBmod.g:7104:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // InternalBmod.g:7104:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==RULE_ID||LA109_0==21||LA109_0==53) ) {
                alt109=1;
            }
            else if ( (LA109_0==102) ) {
                alt109=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // InternalBmod.g:7105:3: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmTypeReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBmod.g:7114:3: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmWildcardTypeReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // InternalBmod.g:7126:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // InternalBmod.g:7126:65: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // InternalBmod.g:7127:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // InternalBmod.g:7133:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;

        EObject lv_constraints_4_0 = null;

        EObject lv_constraints_5_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:7139:2: ( ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) )
            // InternalBmod.g:7140:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            {
            // InternalBmod.g:7140:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            // InternalBmod.g:7141:3: () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            {
            // InternalBmod.g:7141:3: ()
            // InternalBmod.g:7142:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,102,FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
              		
            }
            // InternalBmod.g:7152:3: ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            int alt112=3;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==86) ) {
                alt112=1;
            }
            else if ( (LA112_0==90) ) {
                alt112=2;
            }
            switch (alt112) {
                case 1 :
                    // InternalBmod.g:7153:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    {
                    // InternalBmod.g:7153:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    // InternalBmod.g:7154:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    {
                    // InternalBmod.g:7154:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // InternalBmod.g:7155:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // InternalBmod.g:7155:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    // InternalBmod.g:7156:7: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_93);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      							}
                      							add(
                      								current,
                      								"constraints",
                      								lv_constraints_2_0,
                      								"org.eclipse.xtext.xbase.Xtype.JvmUpperBound");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalBmod.g:7173:5: ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==103) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // InternalBmod.g:7174:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    {
                    	    // InternalBmod.g:7174:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    // InternalBmod.g:7175:7: lv_constraints_3_0= ruleJvmUpperBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundAndedParserRuleCall_2_0_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_93);
                    	    lv_constraints_3_0=ruleJvmUpperBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"constraints",
                    	      								lv_constraints_3_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmUpperBoundAnded");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:7194:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    {
                    // InternalBmod.g:7194:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    // InternalBmod.g:7195:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    {
                    // InternalBmod.g:7195:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) )
                    // InternalBmod.g:7196:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    {
                    // InternalBmod.g:7196:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    // InternalBmod.g:7197:7: lv_constraints_4_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_93);
                    lv_constraints_4_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      							}
                      							add(
                      								current,
                      								"constraints",
                      								lv_constraints_4_0,
                      								"org.eclipse.xtext.xbase.Xtype.JvmLowerBound");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalBmod.g:7214:5: ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==103) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalBmod.g:7215:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    {
                    	    // InternalBmod.g:7215:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    // InternalBmod.g:7216:7: lv_constraints_5_0= ruleJvmLowerBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundAndedParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_93);
                    	    lv_constraints_5_0=ruleJvmLowerBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"constraints",
                    	      								lv_constraints_5_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmLowerBoundAnded");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // InternalBmod.g:7239:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // InternalBmod.g:7239:54: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // InternalBmod.g:7240:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // InternalBmod.g:7246:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:7252:2: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalBmod.g:7253:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalBmod.g:7253:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalBmod.g:7254:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,86,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
              		
            }
            // InternalBmod.g:7258:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalBmod.g:7259:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalBmod.g:7259:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalBmod.g:7260:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // InternalBmod.g:7281:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // InternalBmod.g:7281:59: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // InternalBmod.g:7282:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // InternalBmod.g:7288:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:7294:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalBmod.g:7295:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalBmod.g:7295:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalBmod.g:7296:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,103,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalBmod.g:7300:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalBmod.g:7301:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalBmod.g:7301:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalBmod.g:7302:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // InternalBmod.g:7323:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // InternalBmod.g:7323:54: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // InternalBmod.g:7324:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // InternalBmod.g:7330:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:7336:2: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalBmod.g:7337:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalBmod.g:7337:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalBmod.g:7338:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,90,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
              		
            }
            // InternalBmod.g:7342:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalBmod.g:7343:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalBmod.g:7343:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalBmod.g:7344:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleJvmLowerBoundAnded"
    // InternalBmod.g:7365:1: entryRuleJvmLowerBoundAnded returns [EObject current=null] : iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF ;
    public final EObject entryRuleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBoundAnded = null;


        try {
            // InternalBmod.g:7365:59: (iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF )
            // InternalBmod.g:7366:2: iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBoundAnded=ruleJvmLowerBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBoundAnded"


    // $ANTLR start "ruleJvmLowerBoundAnded"
    // InternalBmod.g:7372:1: ruleJvmLowerBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:7378:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalBmod.g:7379:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalBmod.g:7379:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalBmod.g:7380:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,103,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalBmod.g:7384:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalBmod.g:7385:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalBmod.g:7385:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalBmod.g:7386:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmLowerBoundAndedRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBoundAnded"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalBmod.g:7407:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalBmod.g:7407:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalBmod.g:7408:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalBmod.g:7414:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:7420:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // InternalBmod.g:7421:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // InternalBmod.g:7421:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // InternalBmod.g:7422:3: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_94);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,66,FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1());
              		
            }
            kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // InternalBmod.g:7446:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalBmod.g:7446:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalBmod.g:7447:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalBmod.g:7453:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalBmod.g:7459:2: (this_ID_0= RULE_ID )
            // InternalBmod.g:7460:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportDeclaration"
    // InternalBmod.g:7470:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // InternalBmod.g:7470:59: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // InternalBmod.g:7471:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // InternalBmod.g:7477:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token lv_wildcard_4_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_memberName_5_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:7483:2: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // InternalBmod.g:7484:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // InternalBmod.g:7484:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // InternalBmod.g:7485:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,88,FOLLOW_96); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
              		
            }
            // InternalBmod.g:7489:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt115=3;
            alt115 = dfa115.predict(input);
            switch (alt115) {
                case 1 :
                    // InternalBmod.g:7490:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    {
                    // InternalBmod.g:7490:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    // InternalBmod.g:7491:5: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    {
                    // InternalBmod.g:7491:5: ( (lv_static_1_0= 'static' ) )
                    // InternalBmod.g:7492:6: (lv_static_1_0= 'static' )
                    {
                    // InternalBmod.g:7492:6: (lv_static_1_0= 'static' )
                    // InternalBmod.g:7493:7: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,87,FOLLOW_97); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_static_1_0, grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      							}
                      							setWithLastConsumed(current, "static", true, "static");
                      						
                    }

                    }


                    }

                    // InternalBmod.g:7505:5: ( (lv_extension_2_0= 'extension' ) )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==89) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // InternalBmod.g:7506:6: (lv_extension_2_0= 'extension' )
                            {
                            // InternalBmod.g:7506:6: (lv_extension_2_0= 'extension' )
                            // InternalBmod.g:7507:7: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,89,FOLLOW_97); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_extension_2_0, grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              							}
                              							setWithLastConsumed(current, "extension", true, "extension");
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalBmod.g:7519:5: ( ( ruleQualifiedNameInStaticImport ) )
                    // InternalBmod.g:7520:6: ( ruleQualifiedNameInStaticImport )
                    {
                    // InternalBmod.g:7520:6: ( ruleQualifiedNameInStaticImport )
                    // InternalBmod.g:7521:7: ruleQualifiedNameInStaticImport
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_98);
                    ruleQualifiedNameInStaticImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalBmod.g:7535:5: ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==58) ) {
                        alt114=1;
                    }
                    else if ( (LA114_0==RULE_ID) ) {
                        alt114=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 114, 0, input);

                        throw nvae;
                    }
                    switch (alt114) {
                        case 1 :
                            // InternalBmod.g:7536:6: ( (lv_wildcard_4_0= '*' ) )
                            {
                            // InternalBmod.g:7536:6: ( (lv_wildcard_4_0= '*' ) )
                            // InternalBmod.g:7537:7: (lv_wildcard_4_0= '*' )
                            {
                            // InternalBmod.g:7537:7: (lv_wildcard_4_0= '*' )
                            // InternalBmod.g:7538:8: lv_wildcard_4_0= '*'
                            {
                            lv_wildcard_4_0=(Token)match(input,58,FOLLOW_99); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_wildcard_4_0, grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              								}
                              								setWithLastConsumed(current, "wildcard", true, "*");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalBmod.g:7551:6: ( (lv_memberName_5_0= ruleValidID ) )
                            {
                            // InternalBmod.g:7551:6: ( (lv_memberName_5_0= ruleValidID ) )
                            // InternalBmod.g:7552:7: (lv_memberName_5_0= ruleValidID )
                            {
                            // InternalBmod.g:7552:7: (lv_memberName_5_0= ruleValidID )
                            // InternalBmod.g:7553:8: lv_memberName_5_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXImportDeclarationAccess().getMemberNameValidIDParserRuleCall_1_0_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_99);
                            lv_memberName_5_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                              								}
                              								set(
                              									current,
                              									"memberName",
                              									lv_memberName_5_0,
                              									"org.eclipse.xtext.xbase.Xtype.ValidID");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:7573:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalBmod.g:7573:4: ( ( ruleQualifiedName ) )
                    // InternalBmod.g:7574:5: ( ruleQualifiedName )
                    {
                    // InternalBmod.g:7574:5: ( ruleQualifiedName )
                    // InternalBmod.g:7575:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_99);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:7590:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalBmod.g:7590:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // InternalBmod.g:7591:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalBmod.g:7591:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // InternalBmod.g:7592:6: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_99);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"importedNamespace",
                      							lv_importedNamespace_7_0,
                      							"org.eclipse.xtext.xbase.Xtype.QualifiedNameWithWildcard");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalBmod.g:7610:3: (otherlv_8= ';' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==75) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalBmod.g:7611:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXImportDeclaration"


    // $ANTLR start "entryRuleQualifiedNameInStaticImport"
    // InternalBmod.g:7620:1: entryRuleQualifiedNameInStaticImport returns [String current=null] : iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF ;
    public final String entryRuleQualifiedNameInStaticImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameInStaticImport = null;


        try {
            // InternalBmod.g:7620:67: (iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF )
            // InternalBmod.g:7621:2: iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameInStaticImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameInStaticImport=ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameInStaticImport.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameInStaticImport"


    // $ANTLR start "ruleQualifiedNameInStaticImport"
    // InternalBmod.g:7627:1: ruleQualifiedNameInStaticImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '.' )+ ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameInStaticImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:7633:2: ( (this_ValidID_0= ruleValidID kw= '.' )+ )
            // InternalBmod.g:7634:2: (this_ValidID_0= ruleValidID kw= '.' )+
            {
            // InternalBmod.g:7634:2: (this_ValidID_0= ruleValidID kw= '.' )+
            int cnt117=0;
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==RULE_ID) ) {
                    int LA117_2 = input.LA(2);

                    if ( (LA117_2==66) ) {
                        alt117=1;
                    }


                }


                switch (alt117) {
            	case 1 :
            	    // InternalBmod.g:7635:3: this_ValidID_0= ruleValidID kw= '.'
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getQualifiedNameInStaticImportAccess().getValidIDParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_94);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ValidID_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }
            	    kw=(Token)match(input,66,FOLLOW_100); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt117 >= 1 ) break loop117;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(117, input);
                        throw eee;
                }
                cnt117++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameInStaticImport"


    // $ANTLR start "rulePerceptionEnum"
    // InternalBmod.g:7654:1: rulePerceptionEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'attentive' ) | (enumLiteral_1= 'relaxed' ) | (enumLiteral_2= 'optimistic' ) | (enumLiteral_3= 'sceptic' ) ) ;
    public final Enumerator rulePerceptionEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBmod.g:7660:2: ( ( (enumLiteral_0= 'attentive' ) | (enumLiteral_1= 'relaxed' ) | (enumLiteral_2= 'optimistic' ) | (enumLiteral_3= 'sceptic' ) ) )
            // InternalBmod.g:7661:2: ( (enumLiteral_0= 'attentive' ) | (enumLiteral_1= 'relaxed' ) | (enumLiteral_2= 'optimistic' ) | (enumLiteral_3= 'sceptic' ) )
            {
            // InternalBmod.g:7661:2: ( (enumLiteral_0= 'attentive' ) | (enumLiteral_1= 'relaxed' ) | (enumLiteral_2= 'optimistic' ) | (enumLiteral_3= 'sceptic' ) )
            int alt118=4;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt118=1;
                }
                break;
            case 105:
                {
                alt118=2;
                }
                break;
            case 106:
                {
                alt118=3;
                }
                break;
            case 107:
                {
                alt118=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // InternalBmod.g:7662:3: (enumLiteral_0= 'attentive' )
                    {
                    // InternalBmod.g:7662:3: (enumLiteral_0= 'attentive' )
                    // InternalBmod.g:7663:4: enumLiteral_0= 'attentive'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPerceptionEnumAccess().getAttentiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getPerceptionEnumAccess().getAttentiveEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:7670:3: (enumLiteral_1= 'relaxed' )
                    {
                    // InternalBmod.g:7670:3: (enumLiteral_1= 'relaxed' )
                    // InternalBmod.g:7671:4: enumLiteral_1= 'relaxed'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPerceptionEnumAccess().getRelaxedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getPerceptionEnumAccess().getRelaxedEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:7678:3: (enumLiteral_2= 'optimistic' )
                    {
                    // InternalBmod.g:7678:3: (enumLiteral_2= 'optimistic' )
                    // InternalBmod.g:7679:4: enumLiteral_2= 'optimistic'
                    {
                    enumLiteral_2=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPerceptionEnumAccess().getOptimisticEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getPerceptionEnumAccess().getOptimisticEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBmod.g:7686:3: (enumLiteral_3= 'sceptic' )
                    {
                    // InternalBmod.g:7686:3: (enumLiteral_3= 'sceptic' )
                    // InternalBmod.g:7687:4: enumLiteral_3= 'sceptic'
                    {
                    enumLiteral_3=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getPerceptionEnumAccess().getScepticEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getPerceptionEnumAccess().getScepticEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerceptionEnum"


    // $ANTLR start "ruleActionEnum"
    // InternalBmod.g:7697:1: ruleActionEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'newcomer' ) | (enumLiteral_1= 'experienced' ) | (enumLiteral_2= 'panic' ) ) ;
    public final Enumerator ruleActionEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBmod.g:7703:2: ( ( (enumLiteral_0= 'newcomer' ) | (enumLiteral_1= 'experienced' ) | (enumLiteral_2= 'panic' ) ) )
            // InternalBmod.g:7704:2: ( (enumLiteral_0= 'newcomer' ) | (enumLiteral_1= 'experienced' ) | (enumLiteral_2= 'panic' ) )
            {
            // InternalBmod.g:7704:2: ( (enumLiteral_0= 'newcomer' ) | (enumLiteral_1= 'experienced' ) | (enumLiteral_2= 'panic' ) )
            int alt119=3;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt119=1;
                }
                break;
            case 109:
                {
                alt119=2;
                }
                break;
            case 110:
                {
                alt119=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // InternalBmod.g:7705:3: (enumLiteral_0= 'newcomer' )
                    {
                    // InternalBmod.g:7705:3: (enumLiteral_0= 'newcomer' )
                    // InternalBmod.g:7706:4: enumLiteral_0= 'newcomer'
                    {
                    enumLiteral_0=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionEnumAccess().getNewcomerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getActionEnumAccess().getNewcomerEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:7713:3: (enumLiteral_1= 'experienced' )
                    {
                    // InternalBmod.g:7713:3: (enumLiteral_1= 'experienced' )
                    // InternalBmod.g:7714:4: enumLiteral_1= 'experienced'
                    {
                    enumLiteral_1=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionEnumAccess().getExperiencedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getActionEnumAccess().getExperiencedEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:7721:3: (enumLiteral_2= 'panic' )
                    {
                    // InternalBmod.g:7721:3: (enumLiteral_2= 'panic' )
                    // InternalBmod.g:7722:4: enumLiteral_2= 'panic'
                    {
                    enumLiteral_2=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionEnumAccess().getPanicEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getActionEnumAccess().getPanicEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionEnum"

    // $ANTLR start synpred1_InternalBmod
    public final void synpred1_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:1475:6: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // InternalBmod.g:1475:7: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // InternalBmod.g:1475:7: ( () ( ( ruleOpMultiAssign ) ) )
        // InternalBmod.g:1476:7: () ( ( ruleOpMultiAssign ) )
        {
        // InternalBmod.g:1476:7: ()
        // InternalBmod.g:1477:7: 
        {
        }

        // InternalBmod.g:1478:7: ( ( ruleOpMultiAssign ) )
        // InternalBmod.g:1479:8: ( ruleOpMultiAssign )
        {
        // InternalBmod.g:1479:8: ( ruleOpMultiAssign )
        // InternalBmod.g:1480:9: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_2);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalBmod

    // $ANTLR start synpred2_InternalBmod
    public final void synpred2_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:1669:5: ( ( () ( ( ruleOpOr ) ) ) )
        // InternalBmod.g:1669:6: ( () ( ( ruleOpOr ) ) )
        {
        // InternalBmod.g:1669:6: ( () ( ( ruleOpOr ) ) )
        // InternalBmod.g:1670:6: () ( ( ruleOpOr ) )
        {
        // InternalBmod.g:1670:6: ()
        // InternalBmod.g:1671:6: 
        {
        }

        // InternalBmod.g:1672:6: ( ( ruleOpOr ) )
        // InternalBmod.g:1673:7: ( ruleOpOr )
        {
        // InternalBmod.g:1673:7: ( ruleOpOr )
        // InternalBmod.g:1674:8: ruleOpOr
        {
        pushFollow(FOLLOW_2);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalBmod

    // $ANTLR start synpred3_InternalBmod
    public final void synpred3_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:1776:5: ( ( () ( ( ruleOpAnd ) ) ) )
        // InternalBmod.g:1776:6: ( () ( ( ruleOpAnd ) ) )
        {
        // InternalBmod.g:1776:6: ( () ( ( ruleOpAnd ) ) )
        // InternalBmod.g:1777:6: () ( ( ruleOpAnd ) )
        {
        // InternalBmod.g:1777:6: ()
        // InternalBmod.g:1778:6: 
        {
        }

        // InternalBmod.g:1779:6: ( ( ruleOpAnd ) )
        // InternalBmod.g:1780:7: ( ruleOpAnd )
        {
        // InternalBmod.g:1780:7: ( ruleOpAnd )
        // InternalBmod.g:1781:8: ruleOpAnd
        {
        pushFollow(FOLLOW_2);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalBmod

    // $ANTLR start synpred4_InternalBmod
    public final void synpred4_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:1883:5: ( ( () ( ( ruleOpEquality ) ) ) )
        // InternalBmod.g:1883:6: ( () ( ( ruleOpEquality ) ) )
        {
        // InternalBmod.g:1883:6: ( () ( ( ruleOpEquality ) ) )
        // InternalBmod.g:1884:6: () ( ( ruleOpEquality ) )
        {
        // InternalBmod.g:1884:6: ()
        // InternalBmod.g:1885:6: 
        {
        }

        // InternalBmod.g:1886:6: ( ( ruleOpEquality ) )
        // InternalBmod.g:1887:7: ( ruleOpEquality )
        {
        // InternalBmod.g:1887:7: ( ruleOpEquality )
        // InternalBmod.g:1888:8: ruleOpEquality
        {
        pushFollow(FOLLOW_2);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalBmod

    // $ANTLR start synpred5_InternalBmod
    public final void synpred5_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:2011:6: ( ( () 'instanceof' ) )
        // InternalBmod.g:2011:7: ( () 'instanceof' )
        {
        // InternalBmod.g:2011:7: ( () 'instanceof' )
        // InternalBmod.g:2012:7: () 'instanceof'
        {
        // InternalBmod.g:2012:7: ()
        // InternalBmod.g:2013:7: 
        {
        }

        match(input,49,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalBmod

    // $ANTLR start synpred6_InternalBmod
    public final void synpred6_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:2054:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalBmod.g:2054:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalBmod.g:2054:7: ( () ( ( ruleOpCompare ) ) )
        // InternalBmod.g:2055:7: () ( ( ruleOpCompare ) )
        {
        // InternalBmod.g:2055:7: ()
        // InternalBmod.g:2056:7: 
        {
        }

        // InternalBmod.g:2057:7: ( ( ruleOpCompare ) )
        // InternalBmod.g:2058:8: ( ruleOpCompare )
        {
        // InternalBmod.g:2058:8: ( ruleOpCompare )
        // InternalBmod.g:2059:9: ruleOpCompare
        {
        pushFollow(FOLLOW_2);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalBmod

    // $ANTLR start synpred7_InternalBmod
    public final void synpred7_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:2189:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalBmod.g:2189:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalBmod.g:2189:6: ( () ( ( ruleOpOther ) ) )
        // InternalBmod.g:2190:6: () ( ( ruleOpOther ) )
        {
        // InternalBmod.g:2190:6: ()
        // InternalBmod.g:2191:6: 
        {
        }

        // InternalBmod.g:2192:6: ( ( ruleOpOther ) )
        // InternalBmod.g:2193:7: ( ruleOpOther )
        {
        // InternalBmod.g:2193:7: ( ruleOpOther )
        // InternalBmod.g:2194:8: ruleOpOther
        {
        pushFollow(FOLLOW_2);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalBmod

    // $ANTLR start synpred8_InternalBmod
    public final void synpred8_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:2309:6: ( ( '>' '>' ) )
        // InternalBmod.g:2309:7: ( '>' '>' )
        {
        // InternalBmod.g:2309:7: ( '>' '>' )
        // InternalBmod.g:2310:7: '>' '>'
        {
        match(input,41,FOLLOW_36); if (state.failed) return ;
        match(input,41,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalBmod

    // $ANTLR start synpred9_InternalBmod
    public final void synpred9_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:2344:6: ( ( '<' '<' ) )
        // InternalBmod.g:2344:7: ( '<' '<' )
        {
        // InternalBmod.g:2344:7: ( '<' '<' )
        // InternalBmod.g:2345:7: '<' '<'
        {
        match(input,40,FOLLOW_26); if (state.failed) return ;
        match(input,40,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalBmod

    // $ANTLR start synpred10_InternalBmod
    public final void synpred10_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:2417:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalBmod.g:2417:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalBmod.g:2417:6: ( () ( ( ruleOpAdd ) ) )
        // InternalBmod.g:2418:6: () ( ( ruleOpAdd ) )
        {
        // InternalBmod.g:2418:6: ()
        // InternalBmod.g:2419:6: 
        {
        }

        // InternalBmod.g:2420:6: ( ( ruleOpAdd ) )
        // InternalBmod.g:2421:7: ( ruleOpAdd )
        {
        // InternalBmod.g:2421:7: ( ruleOpAdd )
        // InternalBmod.g:2422:8: ruleOpAdd
        {
        pushFollow(FOLLOW_2);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalBmod

    // $ANTLR start synpred11_InternalBmod
    public final void synpred11_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:2532:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalBmod.g:2532:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalBmod.g:2532:6: ( () ( ( ruleOpMulti ) ) )
        // InternalBmod.g:2533:6: () ( ( ruleOpMulti ) )
        {
        // InternalBmod.g:2533:6: ()
        // InternalBmod.g:2534:6: 
        {
        }

        // InternalBmod.g:2535:6: ( ( ruleOpMulti ) )
        // InternalBmod.g:2536:7: ( ruleOpMulti )
        {
        // InternalBmod.g:2536:7: ( ruleOpMulti )
        // InternalBmod.g:2537:8: ruleOpMulti
        {
        pushFollow(FOLLOW_2);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalBmod

    // $ANTLR start synpred12_InternalBmod
    public final void synpred12_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:2767:5: ( ( () 'as' ) )
        // InternalBmod.g:2767:6: ( () 'as' )
        {
        // InternalBmod.g:2767:6: ( () 'as' )
        // InternalBmod.g:2768:6: () 'as'
        {
        // InternalBmod.g:2768:6: ()
        // InternalBmod.g:2769:6: 
        {
        }

        match(input,63,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalBmod

    // $ANTLR start synpred13_InternalBmod
    public final void synpred13_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:2835:4: ( ( () ( ( ruleOpPostfix ) ) ) )
        // InternalBmod.g:2835:5: ( () ( ( ruleOpPostfix ) ) )
        {
        // InternalBmod.g:2835:5: ( () ( ( ruleOpPostfix ) ) )
        // InternalBmod.g:2836:5: () ( ( ruleOpPostfix ) )
        {
        // InternalBmod.g:2836:5: ()
        // InternalBmod.g:2837:5: 
        {
        }

        // InternalBmod.g:2838:5: ( ( ruleOpPostfix ) )
        // InternalBmod.g:2839:6: ( ruleOpPostfix )
        {
        // InternalBmod.g:2839:6: ( ruleOpPostfix )
        // InternalBmod.g:2840:7: ruleOpPostfix
        {
        pushFollow(FOLLOW_2);
        ruleOpPostfix();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalBmod

    // $ANTLR start synpred14_InternalBmod
    public final void synpred14_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:2931:6: ( ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
        // InternalBmod.g:2931:7: ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        {
        // InternalBmod.g:2931:7: ( () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        // InternalBmod.g:2932:7: () ( '.' | ( ( '::' ) ) ) ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
        {
        // InternalBmod.g:2932:7: ()
        // InternalBmod.g:2933:7: 
        {
        }

        // InternalBmod.g:2934:7: ( '.' | ( ( '::' ) ) )
        int alt120=2;
        int LA120_0 = input.LA(1);

        if ( (LA120_0==66) ) {
            alt120=1;
        }
        else if ( (LA120_0==67) ) {
            alt120=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 120, 0, input);

            throw nvae;
        }
        switch (alt120) {
            case 1 :
                // InternalBmod.g:2935:8: '.'
                {
                match(input,66,FOLLOW_43); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBmod.g:2937:8: ( ( '::' ) )
                {
                // InternalBmod.g:2937:8: ( ( '::' ) )
                // InternalBmod.g:2938:9: ( '::' )
                {
                // InternalBmod.g:2938:9: ( '::' )
                // InternalBmod.g:2939:10: '::'
                {
                match(input,67,FOLLOW_43); if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalBmod.g:2943:7: ( ( ruleFeatureCallID ) )
        // InternalBmod.g:2944:8: ( ruleFeatureCallID )
        {
        // InternalBmod.g:2944:8: ( ruleFeatureCallID )
        // InternalBmod.g:2945:9: ruleFeatureCallID
        {
        pushFollow(FOLLOW_23);
        ruleFeatureCallID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalBmod

    // $ANTLR start synpred15_InternalBmod
    public final void synpred15_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:3028:6: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) ) )
        // InternalBmod.g:3028:7: ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) )
        {
        // InternalBmod.g:3028:7: ( () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) ) )
        // InternalBmod.g:3029:7: () ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) )
        {
        // InternalBmod.g:3029:7: ()
        // InternalBmod.g:3030:7: 
        {
        }

        // InternalBmod.g:3031:7: ( '.' | ( ( '?.' ) ) | ( ( '::' ) ) )
        int alt121=3;
        switch ( input.LA(1) ) {
        case 66:
            {
            alt121=1;
            }
            break;
        case 68:
            {
            alt121=2;
            }
            break;
        case 67:
            {
            alt121=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 121, 0, input);

            throw nvae;
        }

        switch (alt121) {
            case 1 :
                // InternalBmod.g:3032:8: '.'
                {
                match(input,66,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBmod.g:3034:8: ( ( '?.' ) )
                {
                // InternalBmod.g:3034:8: ( ( '?.' ) )
                // InternalBmod.g:3035:9: ( '?.' )
                {
                // InternalBmod.g:3035:9: ( '?.' )
                // InternalBmod.g:3036:10: '?.'
                {
                match(input,68,FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalBmod.g:3040:8: ( ( '::' ) )
                {
                // InternalBmod.g:3040:8: ( ( '::' ) )
                // InternalBmod.g:3041:9: ( '::' )
                {
                // InternalBmod.g:3041:9: ( '::' )
                // InternalBmod.g:3042:10: '::'
                {
                match(input,67,FOLLOW_2); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred15_InternalBmod

    // $ANTLR start synpred16_InternalBmod
    public final void synpred16_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:3166:7: ( ( '(' ) )
        // InternalBmod.g:3166:8: ( '(' )
        {
        // InternalBmod.g:3166:8: ( '(' )
        // InternalBmod.g:3167:8: '('
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalBmod

    // $ANTLR start synpred17_InternalBmod
    public final void synpred17_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:3185:8: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // InternalBmod.g:3185:9: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // InternalBmod.g:3185:9: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // InternalBmod.g:3186:9: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // InternalBmod.g:3186:9: ()
        // InternalBmod.g:3187:9: 
        {
        }

        // InternalBmod.g:3188:9: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt123=2;
        int LA123_0 = input.LA(1);

        if ( (LA123_0==RULE_ID||LA123_0==21||LA123_0==53) ) {
            alt123=1;
        }
        switch (alt123) {
            case 1 :
                // InternalBmod.g:3189:10: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // InternalBmod.g:3189:10: ( ( ruleJvmFormalParameter ) )
                // InternalBmod.g:3190:11: ( ruleJvmFormalParameter )
                {
                // InternalBmod.g:3190:11: ( ruleJvmFormalParameter )
                // InternalBmod.g:3191:12: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_57);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalBmod.g:3194:10: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop122:
                do {
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==22) ) {
                        alt122=1;
                    }


                    switch (alt122) {
                	case 1 :
                	    // InternalBmod.g:3195:11: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_33); if (state.failed) return ;
                	    // InternalBmod.g:3196:11: ( ( ruleJvmFormalParameter ) )
                	    // InternalBmod.g:3197:12: ( ruleJvmFormalParameter )
                	    {
                	    // InternalBmod.g:3197:12: ( ruleJvmFormalParameter )
                	    // InternalBmod.g:3198:13: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_57);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop122;
                    }
                } while (true);


                }
                break;

        }

        // InternalBmod.g:3203:9: ( ( '|' ) )
        // InternalBmod.g:3204:10: ( '|' )
        {
        // InternalBmod.g:3204:10: ( '|' )
        // InternalBmod.g:3205:11: '|'
        {
        match(input,74,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalBmod

    // $ANTLR start synpred18_InternalBmod
    public final void synpred18_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:3282:6: ( ( () '[' ) )
        // InternalBmod.g:3282:7: ( () '[' )
        {
        // InternalBmod.g:3282:7: ( () '[' )
        // InternalBmod.g:3283:7: () '['
        {
        // InternalBmod.g:3283:7: ()
        // InternalBmod.g:3284:7: 
        {
        }

        match(input,72,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalBmod

    // $ANTLR start synpred19_InternalBmod
    public final void synpred19_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:3355:4: ( ( () 'synchronized' '(' ) )
        // InternalBmod.g:3355:5: ( () 'synchronized' '(' )
        {
        // InternalBmod.g:3355:5: ( () 'synchronized' '(' )
        // InternalBmod.g:3356:5: () 'synchronized' '('
        {
        // InternalBmod.g:3356:5: ()
        // InternalBmod.g:3357:5: 
        {
        }

        match(input,100,FOLLOW_9); if (state.failed) return ;
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalBmod

    // $ANTLR start synpred20_InternalBmod
    public final void synpred20_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:3400:4: ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )
        // InternalBmod.g:3400:5: ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' )
        {
        // InternalBmod.g:3400:5: ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' )
        // InternalBmod.g:3401:5: () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':'
        {
        // InternalBmod.g:3401:5: ()
        // InternalBmod.g:3402:5: 
        {
        }

        match(input,81,FOLLOW_9); if (state.failed) return ;
        match(input,21,FOLLOW_33); if (state.failed) return ;
        // InternalBmod.g:3405:5: ( ( ruleJvmFormalParameter ) )
        // InternalBmod.g:3406:6: ( ruleJvmFormalParameter )
        {
        // InternalBmod.g:3406:6: ( ruleJvmFormalParameter )
        // InternalBmod.g:3407:7: ruleJvmFormalParameter
        {
        pushFollow(FOLLOW_16);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalBmod

    // $ANTLR start synpred21_InternalBmod
    public final void synpred21_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:3514:4: ( ( () '[' ) )
        // InternalBmod.g:3514:5: ( () '[' )
        {
        // InternalBmod.g:3514:5: ( () '[' )
        // InternalBmod.g:3515:5: () '['
        {
        // InternalBmod.g:3515:5: ()
        // InternalBmod.g:3516:5: 
        {
        }

        match(input,72,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalBmod

    // $ANTLR start synpred23_InternalBmod
    public final void synpred23_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:3819:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // InternalBmod.g:3819:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // InternalBmod.g:3819:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // InternalBmod.g:3820:5: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // InternalBmod.g:3820:5: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt125=2;
        int LA125_0 = input.LA(1);

        if ( (LA125_0==RULE_ID||LA125_0==21||LA125_0==53) ) {
            alt125=1;
        }
        switch (alt125) {
            case 1 :
                // InternalBmod.g:3821:6: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // InternalBmod.g:3821:6: ( ( ruleJvmFormalParameter ) )
                // InternalBmod.g:3822:7: ( ruleJvmFormalParameter )
                {
                // InternalBmod.g:3822:7: ( ruleJvmFormalParameter )
                // InternalBmod.g:3823:8: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_57);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalBmod.g:3826:6: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop124:
                do {
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==22) ) {
                        alt124=1;
                    }


                    switch (alt124) {
                	case 1 :
                	    // InternalBmod.g:3827:7: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_33); if (state.failed) return ;
                	    // InternalBmod.g:3828:7: ( ( ruleJvmFormalParameter ) )
                	    // InternalBmod.g:3829:8: ( ruleJvmFormalParameter )
                	    {
                	    // InternalBmod.g:3829:8: ( ruleJvmFormalParameter )
                	    // InternalBmod.g:3830:9: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_57);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop124;
                    }
                } while (true);


                }
                break;

        }

        // InternalBmod.g:3835:5: ( ( '|' ) )
        // InternalBmod.g:3836:6: ( '|' )
        {
        // InternalBmod.g:3836:6: ( '|' )
        // InternalBmod.g:3837:7: '|'
        {
        match(input,74,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalBmod

    // $ANTLR start synpred25_InternalBmod
    public final void synpred25_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:4228:5: ( 'else' )
        // InternalBmod.g:4228:6: 'else'
        {
        match(input,77,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalBmod

    // $ANTLR start synpred26_InternalBmod
    public final void synpred26_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:4287:6: ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )
        // InternalBmod.g:4287:7: ( '(' ( ( ruleJvmFormalParameter ) ) ':' )
        {
        // InternalBmod.g:4287:7: ( '(' ( ( ruleJvmFormalParameter ) ) ':' )
        // InternalBmod.g:4288:7: '(' ( ( ruleJvmFormalParameter ) ) ':'
        {
        match(input,21,FOLLOW_33); if (state.failed) return ;
        // InternalBmod.g:4289:7: ( ( ruleJvmFormalParameter ) )
        // InternalBmod.g:4290:8: ( ruleJvmFormalParameter )
        {
        // InternalBmod.g:4290:8: ( ruleJvmFormalParameter )
        // InternalBmod.g:4291:9: ruleJvmFormalParameter
        {
        pushFollow(FOLLOW_16);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalBmod

    // $ANTLR start synpred27_InternalBmod
    public final void synpred27_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:4354:6: ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )
        // InternalBmod.g:4354:7: ( ( ( ruleJvmFormalParameter ) ) ':' )
        {
        // InternalBmod.g:4354:7: ( ( ( ruleJvmFormalParameter ) ) ':' )
        // InternalBmod.g:4355:7: ( ( ruleJvmFormalParameter ) ) ':'
        {
        // InternalBmod.g:4355:7: ( ( ruleJvmFormalParameter ) )
        // InternalBmod.g:4356:8: ( ruleJvmFormalParameter )
        {
        // InternalBmod.g:4356:8: ( ruleJvmFormalParameter )
        // InternalBmod.g:4357:9: ruleJvmFormalParameter
        {
        pushFollow(FOLLOW_16);
        ruleJvmFormalParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred27_InternalBmod

    // $ANTLR start synpred29_InternalBmod
    public final void synpred29_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:5172:5: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // InternalBmod.g:5172:6: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // InternalBmod.g:5172:6: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // InternalBmod.g:5173:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // InternalBmod.g:5173:6: ( ( ruleJvmTypeReference ) )
        // InternalBmod.g:5174:7: ( ruleJvmTypeReference )
        {
        // InternalBmod.g:5174:7: ( ruleJvmTypeReference )
        // InternalBmod.g:5175:8: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_77);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalBmod.g:5178:6: ( ( ruleValidID ) )
        // InternalBmod.g:5179:7: ( ruleValidID )
        {
        // InternalBmod.g:5179:7: ( ruleValidID )
        // InternalBmod.g:5180:8: ruleValidID
        {
        pushFollow(FOLLOW_2);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred29_InternalBmod

    // $ANTLR start synpred30_InternalBmod
    public final void synpred30_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:5484:5: ( ( '(' ) )
        // InternalBmod.g:5484:6: ( '(' )
        {
        // InternalBmod.g:5484:6: ( '(' )
        // InternalBmod.g:5485:6: '('
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_InternalBmod

    // $ANTLR start synpred31_InternalBmod
    public final void synpred31_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:5503:6: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // InternalBmod.g:5503:7: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // InternalBmod.g:5503:7: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // InternalBmod.g:5504:7: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // InternalBmod.g:5504:7: ()
        // InternalBmod.g:5505:7: 
        {
        }

        // InternalBmod.g:5506:7: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt129=2;
        int LA129_0 = input.LA(1);

        if ( (LA129_0==RULE_ID||LA129_0==21||LA129_0==53) ) {
            alt129=1;
        }
        switch (alt129) {
            case 1 :
                // InternalBmod.g:5507:8: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // InternalBmod.g:5507:8: ( ( ruleJvmFormalParameter ) )
                // InternalBmod.g:5508:9: ( ruleJvmFormalParameter )
                {
                // InternalBmod.g:5508:9: ( ruleJvmFormalParameter )
                // InternalBmod.g:5509:10: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_57);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalBmod.g:5512:8: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop128:
                do {
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==22) ) {
                        alt128=1;
                    }


                    switch (alt128) {
                	case 1 :
                	    // InternalBmod.g:5513:9: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_33); if (state.failed) return ;
                	    // InternalBmod.g:5514:9: ( ( ruleJvmFormalParameter ) )
                	    // InternalBmod.g:5515:10: ( ruleJvmFormalParameter )
                	    {
                	    // InternalBmod.g:5515:10: ( ruleJvmFormalParameter )
                	    // InternalBmod.g:5516:11: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_57);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop128;
                    }
                } while (true);


                }
                break;

        }

        // InternalBmod.g:5521:7: ( ( '|' ) )
        // InternalBmod.g:5522:8: ( '|' )
        {
        // InternalBmod.g:5522:8: ( '|' )
        // InternalBmod.g:5523:9: '|'
        {
        match(input,74,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalBmod

    // $ANTLR start synpred32_InternalBmod
    public final void synpred32_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:5600:4: ( ( () '[' ) )
        // InternalBmod.g:5600:5: ( () '[' )
        {
        // InternalBmod.g:5600:5: ( () '[' )
        // InternalBmod.g:5601:5: () '['
        {
        // InternalBmod.g:5601:5: ()
        // InternalBmod.g:5602:5: 
        {
        }

        match(input,72,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalBmod

    // $ANTLR start synpred33_InternalBmod
    public final void synpred33_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:5760:5: ( '<' )
        // InternalBmod.g:5760:6: '<'
        {
        match(input,40,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalBmod

    // $ANTLR start synpred34_InternalBmod
    public final void synpred34_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:5817:5: ( ( '(' ) )
        // InternalBmod.g:5817:6: ( '(' )
        {
        // InternalBmod.g:5817:6: ( '(' )
        // InternalBmod.g:5818:6: '('
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalBmod

    // $ANTLR start synpred35_InternalBmod
    public final void synpred35_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:5836:6: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // InternalBmod.g:5836:7: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // InternalBmod.g:5836:7: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // InternalBmod.g:5837:7: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // InternalBmod.g:5837:7: ()
        // InternalBmod.g:5838:7: 
        {
        }

        // InternalBmod.g:5839:7: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt131=2;
        int LA131_0 = input.LA(1);

        if ( (LA131_0==RULE_ID||LA131_0==21||LA131_0==53) ) {
            alt131=1;
        }
        switch (alt131) {
            case 1 :
                // InternalBmod.g:5840:8: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // InternalBmod.g:5840:8: ( ( ruleJvmFormalParameter ) )
                // InternalBmod.g:5841:9: ( ruleJvmFormalParameter )
                {
                // InternalBmod.g:5841:9: ( ruleJvmFormalParameter )
                // InternalBmod.g:5842:10: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_57);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalBmod.g:5845:8: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop130:
                do {
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==22) ) {
                        alt130=1;
                    }


                    switch (alt130) {
                	case 1 :
                	    // InternalBmod.g:5846:9: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_33); if (state.failed) return ;
                	    // InternalBmod.g:5847:9: ( ( ruleJvmFormalParameter ) )
                	    // InternalBmod.g:5848:10: ( ruleJvmFormalParameter )
                	    {
                	    // InternalBmod.g:5848:10: ( ruleJvmFormalParameter )
                	    // InternalBmod.g:5849:11: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_57);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop130;
                    }
                } while (true);


                }
                break;

        }

        // InternalBmod.g:5854:7: ( ( '|' ) )
        // InternalBmod.g:5855:8: ( '|' )
        {
        // InternalBmod.g:5855:8: ( '|' )
        // InternalBmod.g:5856:9: '|'
        {
        match(input,74,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred35_InternalBmod

    // $ANTLR start synpred36_InternalBmod
    public final void synpred36_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:5933:4: ( ( () '[' ) )
        // InternalBmod.g:5933:5: ( () '[' )
        {
        // InternalBmod.g:5933:5: ( () '[' )
        // InternalBmod.g:5934:5: () '['
        {
        // InternalBmod.g:5934:5: ()
        // InternalBmod.g:5935:5: 
        {
        }

        match(input,72,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred36_InternalBmod

    // $ANTLR start synpred37_InternalBmod
    public final void synpred37_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:6276:4: ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )
        // InternalBmod.g:
        {
        if ( (input.LA(1)>=RULE_STRING && input.LA(1)<=RULE_ID)||input.LA(1)==21||input.LA(1)==40||(input.LA(1)>=56 && input.LA(1)<=57)||input.LA(1)==62||(input.LA(1)>=69 && input.LA(1)<=70)||input.LA(1)==72||input.LA(1)==76||input.LA(1)==78||(input.LA(1)>=81 && input.LA(1)<=83)||(input.LA(1)>=86 && input.LA(1)<=98)||input.LA(1)==100 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred37_InternalBmod

    // $ANTLR start synpred38_InternalBmod
    public final void synpred38_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:6347:6: ( 'catch' )
        // InternalBmod.g:6347:7: 'catch'
        {
        match(input,101,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalBmod

    // $ANTLR start synpred39_InternalBmod
    public final void synpred39_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:6368:7: ( 'finally' )
        // InternalBmod.g:6368:8: 'finally'
        {
        match(input,99,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalBmod

    // $ANTLR start synpred42_InternalBmod
    public final void synpred42_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:6612:5: ( '.' )
        // InternalBmod.g:6612:6: '.'
        {
        match(input,66,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalBmod

    // $ANTLR start synpred43_InternalBmod
    public final void synpred43_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:6738:5: ( ( () ruleArrayBrackets ) )
        // InternalBmod.g:6738:6: ( () ruleArrayBrackets )
        {
        // InternalBmod.g:6738:6: ( () ruleArrayBrackets )
        // InternalBmod.g:6739:6: () ruleArrayBrackets
        {
        // InternalBmod.g:6739:6: ()
        // InternalBmod.g:6740:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred43_InternalBmod

    // $ANTLR start synpred44_InternalBmod
    public final void synpred44_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:6935:5: ( '<' )
        // InternalBmod.g:6935:6: '<'
        {
        match(input,40,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalBmod

    // $ANTLR start synpred45_InternalBmod
    public final void synpred45_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:6991:6: ( ( () '.' ) )
        // InternalBmod.g:6991:7: ( () '.' )
        {
        // InternalBmod.g:6991:7: ( () '.' )
        // InternalBmod.g:6992:7: () '.'
        {
        // InternalBmod.g:6992:7: ()
        // InternalBmod.g:6993:7: 
        {
        }

        match(input,66,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred45_InternalBmod

    // $ANTLR start synpred46_InternalBmod
    public final void synpred46_InternalBmod_fragment() throws RecognitionException {   
        // InternalBmod.g:7029:7: ( '<' )
        // InternalBmod.g:7029:8: '<'
        {
        match(input,40,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalBmod

    // Delegated rules

    public final boolean synpred23_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalBmod() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalBmod_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA108 dfa108 = new DFA108(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA115 dfa115 = new DFA115(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\10\11\uffff";
    static final String dfa_3s = "\1\5\7\0\2\uffff";
    static final String dfa_4s = "\1\145\7\0\2\uffff";
    static final String dfa_5s = "\10\uffff\1\2\1\1";
    static final String dfa_6s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] dfa_7s = {
            "\5\10\13\uffff\3\10\3\uffff\1\10\7\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\40\10\1\uffff\33\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1473:4: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalBmod()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalBmod()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalBmod()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalBmod()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalBmod()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalBmod()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalBmod()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\1\12\uffff";
    static final String dfa_10s = "\1\5\1\uffff\10\0\1\uffff";
    static final String dfa_11s = "\1\145\1\uffff\10\0\1\uffff";
    static final String dfa_12s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_13s = "\2\uffff\1\0\1\4\1\6\1\7\1\5\1\3\1\1\1\2\1\uffff}>";
    static final String[] dfa_14s = {
            "\5\1\13\uffff\3\1\3\uffff\1\1\7\uffff\5\1\1\2\1\3\10\1\1\4\1\5\1\6\1\7\1\10\1\11\22\1\1\uffff\33\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 2187:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBmod()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBmod()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBmod()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBmod()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBmod()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBmod()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBmod()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBmod()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\1\50\2\uffff\1\51\7\uffff";
    static final String dfa_16s = "\1\67\2\uffff\1\64\7\uffff";
    static final String dfa_17s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\1\11\1\3\1\6";
    static final String dfa_18s = "\13\uffff}>";
    static final String[] dfa_19s = {
            "\1\6\1\3\10\uffff\1\1\1\2\1\4\1\5\1\7\1\10",
            "",
            "",
            "\1\12\12\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2263:2: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' | kw= '=>' ) ) | kw= '<>' | kw= '?:' )";
        }
    }
    static final String dfa_20s = "\116\uffff";
    static final String dfa_21s = "\1\2\115\uffff";
    static final String dfa_22s = "\1\5\1\0\114\uffff";
    static final String dfa_23s = "\1\145\1\0\114\uffff";
    static final String dfa_24s = "\2\uffff\1\2\112\uffff\1\1";
    static final String dfa_25s = "\1\uffff\1\0\114\uffff}>";
    static final String[] dfa_26s = {
            "\5\2\13\uffff\1\1\2\2\3\uffff\1\2\7\uffff\47\2\1\uffff\33\2",
            "\1\uffff",
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
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "3164:5: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_17_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )? otherlv_22= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\44\uffff";
    static final String dfa_28s = "\1\5\2\0\41\uffff";
    static final String dfa_29s = "\1\144\2\0\41\uffff";
    static final String dfa_30s = "\3\uffff\2\1\1\2\35\uffff\1\3";
    static final String dfa_31s = "\1\0\1\1\1\2\41\uffff}>";
    static final String[] dfa_32s = {
            "\4\5\1\1\13\uffff\1\2\1\uffff\1\43\20\uffff\1\5\14\uffff\1\3\2\uffff\2\5\4\uffff\1\5\6\uffff\2\5\1\uffff\1\5\1\uffff\1\4\1\uffff\1\5\1\uffff\1\5\2\uffff\3\5\2\uffff\15\5\1\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "3183:6: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_18_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_19_0= ruleXExpression ) ) (otherlv_20= ',' ( (lv_memberCallArguments_21_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_0 = input.LA(1);

                         
                        int index36_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA36_0==RULE_ID) ) {s = 1;}

                        else if ( (LA36_0==21) ) {s = 2;}

                        else if ( (LA36_0==53) && (synpred17_InternalBmod())) {s = 3;}

                        else if ( (LA36_0==74) && (synpred17_InternalBmod())) {s = 4;}

                        else if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_DECIMAL)||LA36_0==40||(LA36_0>=56 && LA36_0<=57)||LA36_0==62||(LA36_0>=69 && LA36_0<=70)||LA36_0==72||LA36_0==76||LA36_0==78||(LA36_0>=81 && LA36_0<=83)||(LA36_0>=86 && LA36_0<=98)||LA36_0==100) ) {s = 5;}

                        else if ( (LA36_0==23) ) {s = 35;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalBmod()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalBmod()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_33s = {
            "\5\2\13\uffff\3\2\3\uffff\1\2\7\uffff\45\2\1\1\1\2\1\uffff\33\2",
            "\1\uffff",
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
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "3281:5: ( ( ( () '[' ) )=> (lv_memberCallArguments_23_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\40\uffff";
    static final String dfa_35s = "\1\5\26\uffff\1\0\10\uffff";
    static final String dfa_36s = "\1\144\26\uffff\1\0\10\uffff";
    static final String dfa_37s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\6\uffff\1\6\11\uffff\1\7\1\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\10\1\11";
    static final String dfa_38s = "\1\0\26\uffff\1\1\10\uffff}>";
    static final String[] dfa_39s = {
            "\4\14\1\5\13\uffff\1\35\22\uffff\1\5\34\uffff\1\14\1\2\1\uffff\1\14\3\uffff\1\26\1\uffff\1\3\2\uffff\1\27\1\30\1\31\2\uffff\5\5\1\1\4\14\1\32\1\33\1\34\1\uffff\1\4",
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
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_34;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "3326:2: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | ( ( ( () 'synchronized' '(' ) )=>this_XSynchronizedExpression_3= ruleXSynchronizedExpression ) | this_XFeatureCall_4= ruleXFeatureCall | this_XLiteral_5= ruleXLiteral | this_XIfExpression_6= ruleXIfExpression | ( ( ( () 'for' '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=>this_XForLoopExpression_7= ruleXForLoopExpression ) | this_XBasicForLoopExpression_8= ruleXBasicForLoopExpression | this_XWhileExpression_9= ruleXWhileExpression | this_XDoWhileExpression_10= ruleXDoWhileExpression | this_XThrowExpression_11= ruleXThrowExpression | this_XReturnExpression_12= ruleXReturnExpression | this_XTryCatchFinallyExpression_13= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_14= ruleXParenthesizedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_0 = input.LA(1);

                         
                        int index40_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA40_0==91) ) {s = 1;}

                        else if ( (LA40_0==70) ) {s = 2;}

                        else if ( (LA40_0==78) ) {s = 3;}

                        else if ( (LA40_0==100) && (synpred19_InternalBmod())) {s = 4;}

                        else if ( (LA40_0==RULE_ID||LA40_0==40||(LA40_0>=86 && LA40_0<=90)) ) {s = 5;}

                        else if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_DECIMAL)||LA40_0==69||LA40_0==72||(LA40_0>=92 && LA40_0<=95)) ) {s = 12;}

                        else if ( (LA40_0==76) ) {s = 22;}

                        else if ( (LA40_0==81) ) {s = 23;}

                        else if ( (LA40_0==82) ) {s = 24;}

                        else if ( (LA40_0==83) ) {s = 25;}

                        else if ( (LA40_0==96) ) {s = 26;}

                        else if ( (LA40_0==97) ) {s = 27;}

                        else if ( (LA40_0==98) ) {s = 28;}

                        else if ( (LA40_0==21) ) {s = 29;}

                         
                        input.seek(index40_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_23 = input.LA(1);

                         
                        int index40_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalBmod()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index40_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_40s = "\46\uffff";
    static final String dfa_41s = "\1\5\2\0\43\uffff";
    static final String dfa_42s = "\1\144\2\0\43\uffff";
    static final String dfa_43s = "\3\uffff\2\1\1\2\40\uffff";
    static final String dfa_44s = "\1\0\1\1\1\2\43\uffff}>";
    static final String[] dfa_45s = {
            "\4\5\1\1\13\uffff\1\2\22\uffff\1\5\14\uffff\1\3\2\uffff\2\5\4\uffff\1\5\6\uffff\2\5\1\uffff\2\5\1\4\1\uffff\1\5\1\uffff\1\5\2\uffff\22\5\1\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_40;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "3818:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_0 = input.LA(1);

                         
                        int index49_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_0==RULE_ID) ) {s = 1;}

                        else if ( (LA49_0==21) ) {s = 2;}

                        else if ( (LA49_0==53) && (synpred23_InternalBmod())) {s = 3;}

                        else if ( (LA49_0==74) && (synpred23_InternalBmod())) {s = 4;}

                        else if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_DECIMAL)||LA49_0==40||(LA49_0>=56 && LA49_0<=57)||LA49_0==62||(LA49_0>=69 && LA49_0<=70)||(LA49_0>=72 && LA49_0<=73)||LA49_0==76||LA49_0==78||(LA49_0>=81 && LA49_0<=98)||LA49_0==100) ) {s = 5;}

                         
                        input.seek(index49_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_1 = input.LA(1);

                         
                        int index49_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalBmod()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index49_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_2 = input.LA(1);

                         
                        int index49_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalBmod()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index49_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_46s = "\43\uffff";
    static final String dfa_47s = "\1\5\1\0\41\uffff";
    static final String dfa_48s = "\1\144\1\0\41\uffff";
    static final String dfa_49s = "\2\uffff\1\2\37\uffff\1\1";
    static final String dfa_50s = "\1\uffff\1\0\41\uffff}>";
    static final String[] dfa_51s = {
            "\5\2\13\uffff\1\1\22\uffff\1\2\14\uffff\1\2\2\uffff\2\2\4\uffff\1\2\6\uffff\2\2\1\uffff\1\2\3\uffff\1\2\1\uffff\1\2\2\uffff\3\2\2\uffff\15\2\1\uffff\1\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_46;
            this.eof = dfa_46;
            this.min = dfa_47;
            this.max = dfa_48;
            this.accept = dfa_49;
            this.special = dfa_50;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "4284:3: ( ( ( ( ( '(' ( ( ruleJvmFormalParameter ) ) ':' ) )=> (otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ) ) ( (lv_switch_5_0= ruleXExpression ) ) otherlv_6= ')' ) | ( ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )? ( (lv_switch_9_0= ruleXExpression ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalBmod()) ) {s = 34;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_52s = "\42\uffff";
    static final String dfa_53s = "\1\5\2\0\37\uffff";
    static final String dfa_54s = "\1\144\2\0\37\uffff";
    static final String dfa_55s = "\3\uffff\1\1\1\2\35\uffff";
    static final String dfa_56s = "\1\0\1\1\1\2\37\uffff}>";
    static final String[] dfa_57s = {
            "\4\4\1\1\13\uffff\1\2\22\uffff\1\4\14\uffff\1\3\2\uffff\2\4\4\uffff\1\4\6\uffff\2\4\1\uffff\1\4\3\uffff\1\4\1\uffff\1\4\2\uffff\3\4\2\uffff\15\4\1\uffff\1\4",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[][] dfa_57 = unpackEncodedStringArray(dfa_57s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_52;
            this.eof = dfa_52;
            this.min = dfa_53;
            this.max = dfa_54;
            this.accept = dfa_55;
            this.special = dfa_56;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "4353:5: ( ( ( ( ( ruleJvmFormalParameter ) ) ':' ) )=> ( ( (lv_declaredParam_7_0= ruleJvmFormalParameter ) ) otherlv_8= ':' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_0 = input.LA(1);

                         
                        int index55_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA55_0==RULE_ID) ) {s = 1;}

                        else if ( (LA55_0==21) ) {s = 2;}

                        else if ( (LA55_0==53) && (synpred27_InternalBmod())) {s = 3;}

                        else if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_DECIMAL)||LA55_0==40||(LA55_0>=56 && LA55_0<=57)||LA55_0==62||(LA55_0>=69 && LA55_0<=70)||LA55_0==72||LA55_0==76||LA55_0==78||(LA55_0>=81 && LA55_0<=83)||(LA55_0>=86 && LA55_0<=98)||LA55_0==100) ) {s = 4;}

                         
                        input.seek(index55_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalBmod()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_2 = input.LA(1);

                         
                        int index55_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalBmod()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index55_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "5482:3: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_7_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )? otherlv_12= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "5501:4: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_8_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_9_0= ruleXExpression ) ) (otherlv_10= ',' ( (lv_featureCallArguments_11_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_0 = input.LA(1);

                         
                        int index77_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA77_0==RULE_ID) ) {s = 1;}

                        else if ( (LA77_0==21) ) {s = 2;}

                        else if ( (LA77_0==53) && (synpred31_InternalBmod())) {s = 3;}

                        else if ( (LA77_0==74) && (synpred31_InternalBmod())) {s = 4;}

                        else if ( ((LA77_0>=RULE_STRING && LA77_0<=RULE_DECIMAL)||LA77_0==40||(LA77_0>=56 && LA77_0<=57)||LA77_0==62||(LA77_0>=69 && LA77_0<=70)||LA77_0==72||LA77_0==76||LA77_0==78||(LA77_0>=81 && LA77_0<=83)||(LA77_0>=86 && LA77_0<=98)||LA77_0==100) ) {s = 5;}

                        else if ( (LA77_0==23) ) {s = 35;}

                         
                        input.seek(index77_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalBmod()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA77_2 = input.LA(1);

                         
                        int index77_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalBmod()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index77_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "5599:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_13_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_58s = {
            "\5\2\13\uffff\3\2\3\uffff\1\2\7\uffff\5\2\1\1\41\2\1\uffff\33\2",
            "\1\uffff",
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
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "5758:3: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_1 = input.LA(1);

                         
                        int index83_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index83_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "5815:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index86_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "5834:4: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_0 = input.LA(1);

                         
                        int index85_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA85_0==RULE_ID) ) {s = 1;}

                        else if ( (LA85_0==21) ) {s = 2;}

                        else if ( (LA85_0==53) && (synpred35_InternalBmod())) {s = 3;}

                        else if ( (LA85_0==74) && (synpred35_InternalBmod())) {s = 4;}

                        else if ( ((LA85_0>=RULE_STRING && LA85_0<=RULE_DECIMAL)||LA85_0==40||(LA85_0>=56 && LA85_0<=57)||LA85_0==62||(LA85_0>=69 && LA85_0<=70)||LA85_0==72||LA85_0==76||LA85_0==78||(LA85_0>=81 && LA85_0<=83)||(LA85_0>=86 && LA85_0<=98)||LA85_0==100) ) {s = 5;}

                        else if ( (LA85_0==23) ) {s = 35;}

                         
                        input.seek(index85_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA85_1 = input.LA(1);

                         
                        int index85_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalBmod()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index85_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA85_2 = input.LA(1);

                         
                        int index85_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalBmod()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index85_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "5932:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA87_1 = input.LA(1);

                         
                        int index87_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index87_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 87, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_59s = "\1\41\115\uffff";
    static final String dfa_60s = "\1\5\40\0\55\uffff";
    static final String dfa_61s = "\1\145\40\0\55\uffff";
    static final String dfa_62s = "\41\uffff\1\2\53\uffff\1\1";
    static final String dfa_63s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\55\uffff}>";
    static final String[] dfa_64s = {
            "\1\27\1\24\1\23\1\25\1\1\13\uffff\1\40\2\41\3\uffff\1\41\7\uffff\5\41\1\15\17\41\1\10\1\7\4\41\1\6\6\41\1\17\1\12\1\41\1\20\1\41\1\uffff\1\41\1\31\1\41\1\13\2\41\1\32\1\33\1\34\2\41\1\2\1\3\1\4\1\5\1\16\1\11\1\21\1\22\1\26\1\30\1\35\1\36\1\37\1\41\1\14\1\41",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = dfa_20;
            this.eof = dfa_59;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_63;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "6275:3: ( ( 'extends' | 'static' | 'import' | 'extension' | '!' | '-' | '+' | 'new' | '{' | 'switch' | 'synchronized' | '<' | 'super' | '#' | '[' | 'false' | 'true' | 'null' | 'typeof' | 'if' | 'for' | 'while' | 'do' | 'throw' | 'return' | 'try' | '(' | RULE_ID | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA90_1 = input.LA(1);

                         
                        int index90_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA90_2 = input.LA(1);

                         
                        int index90_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA90_3 = input.LA(1);

                         
                        int index90_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA90_4 = input.LA(1);

                         
                        int index90_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA90_5 = input.LA(1);

                         
                        int index90_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA90_6 = input.LA(1);

                         
                        int index90_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA90_7 = input.LA(1);

                         
                        int index90_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA90_8 = input.LA(1);

                         
                        int index90_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA90_9 = input.LA(1);

                         
                        int index90_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA90_10 = input.LA(1);

                         
                        int index90_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA90_11 = input.LA(1);

                         
                        int index90_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA90_12 = input.LA(1);

                         
                        int index90_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA90_13 = input.LA(1);

                         
                        int index90_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA90_14 = input.LA(1);

                         
                        int index90_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA90_15 = input.LA(1);

                         
                        int index90_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA90_16 = input.LA(1);

                         
                        int index90_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA90_17 = input.LA(1);

                         
                        int index90_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA90_18 = input.LA(1);

                         
                        int index90_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA90_19 = input.LA(1);

                         
                        int index90_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA90_20 = input.LA(1);

                         
                        int index90_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA90_21 = input.LA(1);

                         
                        int index90_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA90_22 = input.LA(1);

                         
                        int index90_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA90_23 = input.LA(1);

                         
                        int index90_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA90_24 = input.LA(1);

                         
                        int index90_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA90_25 = input.LA(1);

                         
                        int index90_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA90_26 = input.LA(1);

                         
                        int index90_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA90_27 = input.LA(1);

                         
                        int index90_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA90_28 = input.LA(1);

                         
                        int index90_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA90_29 = input.LA(1);

                         
                        int index90_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA90_30 = input.LA(1);

                         
                        int index90_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA90_31 = input.LA(1);

                         
                        int index90_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA90_32 = input.LA(1);

                         
                        int index90_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalBmod()) ) {s = 77;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index90_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 90, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_65s = "\117\uffff";
    static final String dfa_66s = "\1\2\116\uffff";
    static final String dfa_67s = "\1\5\1\0\115\uffff";
    static final String dfa_68s = "\1\147\1\0\115\uffff";
    static final String dfa_69s = "\2\uffff\1\2\113\uffff\1\1";
    static final String dfa_70s = "\1\uffff\1\0\115\uffff}>";
    static final String[] dfa_71s = {
            "\5\2\13\uffff\3\2\3\uffff\1\2\7\uffff\5\2\1\1\41\2\1\uffff\33\2\1\uffff\1\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[][] dfa_71 = unpackEncodedStringArray(dfa_71s);

    class DFA108 extends DFA {

        public DFA108(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 108;
            this.eot = dfa_65;
            this.eof = dfa_66;
            this.min = dfa_67;
            this.max = dfa_68;
            this.accept = dfa_69;
            this.special = dfa_70;
            this.transition = dfa_71;
        }
        public String getDescription() {
            return "6933:3: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA108_1 = input.LA(1);

                         
                        int index108_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalBmod()) ) {s = 78;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index108_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 108, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = dfa_65;
            this.eof = dfa_66;
            this.min = dfa_67;
            this.max = dfa_68;
            this.accept = dfa_69;
            this.special = dfa_70;
            this.transition = dfa_71;
        }
        public String getDescription() {
            return "7027:5: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA106_1 = input.LA(1);

                         
                        int index106_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalBmod()) ) {s = 78;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index106_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 106, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_72s = "\7\uffff";
    static final String dfa_73s = "\2\uffff\1\4\2\uffff\1\4\1\uffff";
    static final String dfa_74s = "\1\11\1\uffff\1\102\1\11\1\uffff\1\102\1\uffff";
    static final String dfa_75s = "\1\127\1\uffff\1\113\1\72\1\uffff\1\113\1\uffff";
    static final String dfa_76s = "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3";
    static final String dfa_77s = "\7\uffff}>";
    static final String[] dfa_78s = {
            "\1\2\115\uffff\1\1",
            "",
            "\1\3\10\uffff\1\4",
            "\1\5\60\uffff\1\6",
            "",
            "\1\3\10\uffff\1\4",
            ""
    };

    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final char[] dfa_74 = DFA.unpackEncodedStringToUnsignedChars(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[][] dfa_78 = unpackEncodedStringArray(dfa_78s);

    class DFA115 extends DFA {

        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = dfa_72;
            this.eof = dfa_73;
            this.min = dfa_74;
            this.max = dfa_75;
            this.accept = dfa_76;
            this.special = dfa_77;
            this.transition = dfa_78;
        }
        public String getDescription() {
            return "7489:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000173124002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L,0x00000F0000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L,0x0000700000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x43000100002003E0L,0x00000017FFCE5160L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000003F800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002070000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000200200L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00FC030000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x3C00000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000200L,0x0000000003C00000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000010000000200L,0x0000000007C00000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000200200L,0x0000004000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000400000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000200002L,0x000000000000011CL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4320010000A003E0L,0x00000017FFCE5560L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x000000000000011CL});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x43000100002003E0L,0x00000017FFCE51E0L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000080L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x43000100002003E0L,0x00000017FFCE5360L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000200L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x43200100002003E0L,0x00000017FFFE5760L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000400L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x43000100002003E0L,0x00000017FFFE5360L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x43000100002003E2L,0x00000017FFFE5960L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x43000100002003E2L,0x00000017FFFE5160L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x43200100002003E0L,0x00000017FFCE5160L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0020000008600200L,0x0000000000018080L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000008400000L,0x0000000000010000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x43000100002003E0L,0x00000017FFFE5960L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000800L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x43000100002003E0L,0x00000017FFFE5160L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x43000100002003E0L,0x00000017FFCE5960L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x4300010000A003E0L,0x00000017FFCE5160L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x43000100002003E0L,0x00000017FFFE51E0L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x43000100002003E0L,0x00000017FFFE59E0L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000100L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000010000200002L,0x0000000000000100L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000100L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x43000100002003E2L,0x00000017FFCE5160L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000002800000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x0000002800000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0020000000A00200L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x0000000004400000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000200L,0x0000000000800000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000200L,0x0000000002000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0400000000000200L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000202L});

}