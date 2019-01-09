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

@SuppressWarnings("all")
public class InternalBmodParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARNAME", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Room'", "'and'", "'Door'", "'from'", "'to'", "'PerceptionLevel'", "'ActionProfile'", "'Person'", "'in'", "':'", "','", "'Exit'", "'Fire'", "'Sign'", "'on'", "'Condition'", "'('", "')'", "'without'", "'attentive'", "'relaxed'", "'optimistic'", "'sceptic'", "'newcomer'", "'experienced'", "'panic'"
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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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

            		newCompositeNode(grammarAccess.getModelAccess().getFloorplanParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Floorplan_0=ruleFloorplan();

            state._fsp--;


            		current = this_Floorplan_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getFloorplanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloorplan=ruleFloorplan();

            state._fsp--;

             current =iv_ruleFloorplan; 
            match(input,EOF,FOLLOW_2); 

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

            				current = forceCreateModelElement(
            					grammarAccess.getFloorplanAccess().getFloorplanAction_0(),
            					current);
            			

            }

            // InternalBmod.g:112:3: ( ( (lv_perceptions_1_0= rulePerceptionLevel ) ) | ( (lv_actions_2_0= ruleActionProfile ) ) | ( (lv_rooms_3_0= ruleRoom ) ) | ( (lv_doors_4_0= ruleDoor ) ) | ( (lv_persons_5_0= rulePerson ) ) | ( (lv_exits_6_0= ruleExit ) ) | ( (lv_fires_7_0= ruleFire ) ) | ( (lv_signs_8_0= ruleEmergencySign ) ) | ( (lv_dancons_9_0= ruleDangerousCondition ) ) )*
            loop1:
            do {
                int alt1=10;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    alt1=1;
                    }
                    break;
                case 18:
                    {
                    alt1=2;
                    }
                    break;
                case 12:
                    {
                    alt1=3;
                    }
                    break;
                case 14:
                    {
                    alt1=4;
                    }
                    break;
                case 19:
                    {
                    alt1=5;
                    }
                    break;
                case 23:
                    {
                    alt1=6;
                    }
                    break;
                case 24:
                    {
                    alt1=7;
                    }
                    break;
                case 25:
                    {
                    alt1=8;
                    }
                    break;
                case 27:
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

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getPerceptionsPerceptionLevelParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_perceptions_1_0=rulePerceptionLevel();

            	    state._fsp--;


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

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getActionsActionProfileParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_actions_2_0=ruleActionProfile();

            	    state._fsp--;


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

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getRoomsRoomParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_rooms_3_0=ruleRoom();

            	    state._fsp--;


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

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getDoorsDoorParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_doors_4_0=ruleDoor();

            	    state._fsp--;


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

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getPersonsPersonParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_persons_5_0=rulePerson();

            	    state._fsp--;


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

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getExitsExitParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_exits_6_0=ruleExit();

            	    state._fsp--;


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

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getFiresFireParserRuleCall_1_6_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_fires_7_0=ruleFire();

            	    state._fsp--;


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

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getSignsEmergencySignParserRuleCall_1_7_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_signs_8_0=ruleEmergencySign();

            	    state._fsp--;


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

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getDanconsDangerousConditionParserRuleCall_1_8_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_dancons_9_0=ruleDangerousCondition();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:304:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) ( (lv_areas_2_0= ruleArea ) ) (otherlv_3= 'and' ( (lv_areas_4_0= ruleArea ) ) )* ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_areas_2_0 = null;

        EObject lv_areas_4_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:310:2: ( (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) ( (lv_areas_2_0= ruleArea ) ) (otherlv_3= 'and' ( (lv_areas_4_0= ruleArea ) ) )* ) )
            // InternalBmod.g:311:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) ( (lv_areas_2_0= ruleArea ) ) (otherlv_3= 'and' ( (lv_areas_4_0= ruleArea ) ) )* )
            {
            // InternalBmod.g:311:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) ( (lv_areas_2_0= ruleArea ) ) (otherlv_3= 'and' ( (lv_areas_4_0= ruleArea ) ) )* )
            // InternalBmod.g:312:3: otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) ( (lv_areas_2_0= ruleArea ) ) (otherlv_3= 'and' ( (lv_areas_4_0= ruleArea ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalBmod.g:316:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:317:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:317:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:318:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoomAccess().getNameVARNAMETerminalRuleCall_1_0());
            				

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

            // InternalBmod.g:334:3: ( (lv_areas_2_0= ruleArea ) )
            // InternalBmod.g:335:4: (lv_areas_2_0= ruleArea )
            {
            // InternalBmod.g:335:4: (lv_areas_2_0= ruleArea )
            // InternalBmod.g:336:5: lv_areas_2_0= ruleArea
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_areas_2_0=ruleArea();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					add(
            						current,
            						"areas",
            						lv_areas_2_0,
            						"org.xtext.bmod.Bmod.Area");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBmod.g:353:3: (otherlv_3= 'and' ( (lv_areas_4_0= ruleArea ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBmod.g:354:4: otherlv_3= 'and' ( (lv_areas_4_0= ruleArea ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getAndKeyword_3_0());
            	    			
            	    // InternalBmod.g:358:4: ( (lv_areas_4_0= ruleArea ) )
            	    // InternalBmod.g:359:5: (lv_areas_4_0= ruleArea )
            	    {
            	    // InternalBmod.g:359:5: (lv_areas_4_0= ruleArea )
            	    // InternalBmod.g:360:6: lv_areas_4_0= ruleArea
            	    {

            	    						newCompositeNode(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_areas_4_0=ruleArea();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalBmod.g:382:1: entryRuleDoor returns [EObject current=null] : iv_ruleDoor= ruleDoor EOF ;
    public final EObject entryRuleDoor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoor = null;


        try {
            // InternalBmod.g:382:45: (iv_ruleDoor= ruleDoor EOF )
            // InternalBmod.g:383:2: iv_ruleDoor= ruleDoor EOF
            {
             newCompositeNode(grammarAccess.getDoorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoor=ruleDoor();

            state._fsp--;

             current =iv_ruleDoor; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:389:1: ruleDoor returns [EObject current=null] : (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) ) ;
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
            // InternalBmod.g:395:2: ( (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) ) )
            // InternalBmod.g:396:2: (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) )
            {
            // InternalBmod.g:396:2: (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) )
            // InternalBmod.g:397:3: otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDoorAccess().getDoorKeyword_0());
            		
            // InternalBmod.g:401:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:402:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:402:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:403:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDoorAccess().getNameVARNAMETerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDoorAccess().getFromKeyword_2());
            		
            // InternalBmod.g:423:3: ( (lv_from_3_0= ruleCoordinate ) )
            // InternalBmod.g:424:4: (lv_from_3_0= ruleCoordinate )
            {
            // InternalBmod.g:424:4: (lv_from_3_0= ruleCoordinate )
            // InternalBmod.g:425:5: lv_from_3_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getDoorAccess().getFromCoordinateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_from_3_0=ruleCoordinate();

            state._fsp--;


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

            otherlv_4=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDoorAccess().getToKeyword_4());
            		
            // InternalBmod.g:446:3: ( (lv_to_5_0= ruleCoordinate ) )
            // InternalBmod.g:447:4: (lv_to_5_0= ruleCoordinate )
            {
            // InternalBmod.g:447:4: (lv_to_5_0= ruleCoordinate )
            // InternalBmod.g:448:5: lv_to_5_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getDoorAccess().getToCoordinateParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_to_5_0=ruleCoordinate();

            state._fsp--;


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


            	leaveRule();

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


    // $ANTLR start "entryRulePerception"
    // InternalBmod.g:469:1: entryRulePerception returns [EObject current=null] : iv_rulePerception= rulePerception EOF ;
    public final EObject entryRulePerception() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerception = null;


        try {
            // InternalBmod.g:469:51: (iv_rulePerception= rulePerception EOF )
            // InternalBmod.g:470:2: iv_rulePerception= rulePerception EOF
            {
             newCompositeNode(grammarAccess.getPerceptionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerception=rulePerception();

            state._fsp--;

             current =iv_rulePerception; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:476:1: rulePerception returns [EObject current=null] : ( ( (lv_existing_0_0= rulePerceptionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) ) ;
    public final EObject rulePerception() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_existing_0_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:482:2: ( ( ( (lv_existing_0_0= rulePerceptionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) ) )
            // InternalBmod.g:483:2: ( ( (lv_existing_0_0= rulePerceptionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) )
            {
            // InternalBmod.g:483:2: ( ( (lv_existing_0_0= rulePerceptionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=31 && LA3_0<=34)) ) {
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
                    // InternalBmod.g:484:3: ( (lv_existing_0_0= rulePerceptionEnum ) )
                    {
                    // InternalBmod.g:484:3: ( (lv_existing_0_0= rulePerceptionEnum ) )
                    // InternalBmod.g:485:4: (lv_existing_0_0= rulePerceptionEnum )
                    {
                    // InternalBmod.g:485:4: (lv_existing_0_0= rulePerceptionEnum )
                    // InternalBmod.g:486:5: lv_existing_0_0= rulePerceptionEnum
                    {

                    					newCompositeNode(grammarAccess.getPerceptionAccess().getExistingPerceptionEnumEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_existing_0_0=rulePerceptionEnum();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalBmod.g:504:3: ( (otherlv_1= RULE_VARNAME ) )
                    {
                    // InternalBmod.g:504:3: ( (otherlv_1= RULE_VARNAME ) )
                    // InternalBmod.g:505:4: (otherlv_1= RULE_VARNAME )
                    {
                    // InternalBmod.g:505:4: (otherlv_1= RULE_VARNAME )
                    // InternalBmod.g:506:5: otherlv_1= RULE_VARNAME
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPerceptionRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_VARNAME,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getPerceptionAccess().getCustomPerceptionLevelCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalBmod.g:521:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalBmod.g:521:47: (iv_ruleAction= ruleAction EOF )
            // InternalBmod.g:522:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:528:1: ruleAction returns [EObject current=null] : ( ( (lv_existing_0_0= ruleActionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_existing_0_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:534:2: ( ( ( (lv_existing_0_0= ruleActionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) ) )
            // InternalBmod.g:535:2: ( ( (lv_existing_0_0= ruleActionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) )
            {
            // InternalBmod.g:535:2: ( ( (lv_existing_0_0= ruleActionEnum ) ) | ( (otherlv_1= RULE_VARNAME ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=35 && LA4_0<=37)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_VARNAME) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBmod.g:536:3: ( (lv_existing_0_0= ruleActionEnum ) )
                    {
                    // InternalBmod.g:536:3: ( (lv_existing_0_0= ruleActionEnum ) )
                    // InternalBmod.g:537:4: (lv_existing_0_0= ruleActionEnum )
                    {
                    // InternalBmod.g:537:4: (lv_existing_0_0= ruleActionEnum )
                    // InternalBmod.g:538:5: lv_existing_0_0= ruleActionEnum
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getExistingActionEnumEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_existing_0_0=ruleActionEnum();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalBmod.g:556:3: ( (otherlv_1= RULE_VARNAME ) )
                    {
                    // InternalBmod.g:556:3: ( (otherlv_1= RULE_VARNAME ) )
                    // InternalBmod.g:557:4: (otherlv_1= RULE_VARNAME )
                    {
                    // InternalBmod.g:557:4: (otherlv_1= RULE_VARNAME )
                    // InternalBmod.g:558:5: otherlv_1= RULE_VARNAME
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_VARNAME,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getActionAccess().getCustomActionProfileCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRulePerceptionLevel"
    // InternalBmod.g:573:1: entryRulePerceptionLevel returns [EObject current=null] : iv_rulePerceptionLevel= rulePerceptionLevel EOF ;
    public final EObject entryRulePerceptionLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerceptionLevel = null;


        try {
            // InternalBmod.g:573:56: (iv_rulePerceptionLevel= rulePerceptionLevel EOF )
            // InternalBmod.g:574:2: iv_rulePerceptionLevel= rulePerceptionLevel EOF
            {
             newCompositeNode(grammarAccess.getPerceptionLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerceptionLevel=rulePerceptionLevel();

            state._fsp--;

             current =iv_rulePerceptionLevel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:580:1: rulePerceptionLevel returns [EObject current=null] : (otherlv_0= 'PerceptionLevel' ( (lv_name_1_0= RULE_VARNAME ) ) ) ;
    public final EObject rulePerceptionLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBmod.g:586:2: ( (otherlv_0= 'PerceptionLevel' ( (lv_name_1_0= RULE_VARNAME ) ) ) )
            // InternalBmod.g:587:2: (otherlv_0= 'PerceptionLevel' ( (lv_name_1_0= RULE_VARNAME ) ) )
            {
            // InternalBmod.g:587:2: (otherlv_0= 'PerceptionLevel' ( (lv_name_1_0= RULE_VARNAME ) ) )
            // InternalBmod.g:588:3: otherlv_0= 'PerceptionLevel' ( (lv_name_1_0= RULE_VARNAME ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPerceptionLevelAccess().getPerceptionLevelKeyword_0());
            		
            // InternalBmod.g:592:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:593:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:593:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:594:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPerceptionLevelAccess().getNameVARNAMETerminalRuleCall_1_0());
            				

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


            }


            	leaveRule();

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
    // InternalBmod.g:614:1: entryRuleActionProfile returns [EObject current=null] : iv_ruleActionProfile= ruleActionProfile EOF ;
    public final EObject entryRuleActionProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionProfile = null;


        try {
            // InternalBmod.g:614:54: (iv_ruleActionProfile= ruleActionProfile EOF )
            // InternalBmod.g:615:2: iv_ruleActionProfile= ruleActionProfile EOF
            {
             newCompositeNode(grammarAccess.getActionProfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionProfile=ruleActionProfile();

            state._fsp--;

             current =iv_ruleActionProfile; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:621:1: ruleActionProfile returns [EObject current=null] : (otherlv_0= 'ActionProfile' ( (lv_name_1_0= RULE_VARNAME ) ) ) ;
    public final EObject ruleActionProfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBmod.g:627:2: ( (otherlv_0= 'ActionProfile' ( (lv_name_1_0= RULE_VARNAME ) ) ) )
            // InternalBmod.g:628:2: (otherlv_0= 'ActionProfile' ( (lv_name_1_0= RULE_VARNAME ) ) )
            {
            // InternalBmod.g:628:2: (otherlv_0= 'ActionProfile' ( (lv_name_1_0= RULE_VARNAME ) ) )
            // InternalBmod.g:629:3: otherlv_0= 'ActionProfile' ( (lv_name_1_0= RULE_VARNAME ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionProfileAccess().getActionProfileKeyword_0());
            		
            // InternalBmod.g:633:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:634:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:634:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:635:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionProfileAccess().getNameVARNAMETerminalRuleCall_1_0());
            				

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


            }


            	leaveRule();

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


    // $ANTLR start "entryRulePerson"
    // InternalBmod.g:655:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalBmod.g:655:47: (iv_rulePerson= rulePerson EOF )
            // InternalBmod.g:656:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:662:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'in' ( (lv_location_3_0= ruleCoordinate ) ) otherlv_4= ':' ( (lv_perception_5_0= rulePerception ) ) otherlv_6= ',' ( (lv_action_7_0= ruleAction ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_location_3_0 = null;

        EObject lv_perception_5_0 = null;

        EObject lv_action_7_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:668:2: ( (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'in' ( (lv_location_3_0= ruleCoordinate ) ) otherlv_4= ':' ( (lv_perception_5_0= rulePerception ) ) otherlv_6= ',' ( (lv_action_7_0= ruleAction ) ) ) )
            // InternalBmod.g:669:2: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'in' ( (lv_location_3_0= ruleCoordinate ) ) otherlv_4= ':' ( (lv_perception_5_0= rulePerception ) ) otherlv_6= ',' ( (lv_action_7_0= ruleAction ) ) )
            {
            // InternalBmod.g:669:2: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'in' ( (lv_location_3_0= ruleCoordinate ) ) otherlv_4= ':' ( (lv_perception_5_0= rulePerception ) ) otherlv_6= ',' ( (lv_action_7_0= ruleAction ) ) )
            // InternalBmod.g:670:3: otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'in' ( (lv_location_3_0= ruleCoordinate ) ) otherlv_4= ':' ( (lv_perception_5_0= rulePerception ) ) otherlv_6= ',' ( (lv_action_7_0= ruleAction ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalBmod.g:674:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:675:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:675:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:676:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameVARNAMETerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getInKeyword_2());
            		
            // InternalBmod.g:696:3: ( (lv_location_3_0= ruleCoordinate ) )
            // InternalBmod.g:697:4: (lv_location_3_0= ruleCoordinate )
            {
            // InternalBmod.g:697:4: (lv_location_3_0= ruleCoordinate )
            // InternalBmod.g:698:5: lv_location_3_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getLocationCoordinateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_location_3_0=ruleCoordinate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_3_0,
            						"org.xtext.bmod.Bmod.Coordinate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getColonKeyword_4());
            		
            // InternalBmod.g:719:3: ( (lv_perception_5_0= rulePerception ) )
            // InternalBmod.g:720:4: (lv_perception_5_0= rulePerception )
            {
            // InternalBmod.g:720:4: (lv_perception_5_0= rulePerception )
            // InternalBmod.g:721:5: lv_perception_5_0= rulePerception
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getPerceptionPerceptionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_perception_5_0=rulePerception();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"perception",
            						lv_perception_5_0,
            						"org.xtext.bmod.Bmod.Perception");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getCommaKeyword_6());
            		
            // InternalBmod.g:742:3: ( (lv_action_7_0= ruleAction ) )
            // InternalBmod.g:743:4: (lv_action_7_0= ruleAction )
            {
            // InternalBmod.g:743:4: (lv_action_7_0= ruleAction )
            // InternalBmod.g:744:5: lv_action_7_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getActionActionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_7_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_7_0,
            						"org.xtext.bmod.Bmod.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalBmod.g:765:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // InternalBmod.g:765:45: (iv_ruleExit= ruleExit EOF )
            // InternalBmod.g:766:2: iv_ruleExit= ruleExit EOF
            {
             newCompositeNode(grammarAccess.getExitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExit=ruleExit();

            state._fsp--;

             current =iv_ruleExit; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:772:1: ruleExit returns [EObject current=null] : (otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_location_2_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:778:2: ( (otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) ) )
            // InternalBmod.g:779:2: (otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) )
            {
            // InternalBmod.g:779:2: (otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) )
            // InternalBmod.g:780:3: otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getExitAccess().getExitKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExitAccess().getInKeyword_1());
            		
            // InternalBmod.g:788:3: ( (lv_location_2_0= ruleCoordinate ) )
            // InternalBmod.g:789:4: (lv_location_2_0= ruleCoordinate )
            {
            // InternalBmod.g:789:4: (lv_location_2_0= ruleCoordinate )
            // InternalBmod.g:790:5: lv_location_2_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getExitAccess().getLocationCoordinateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_location_2_0=ruleCoordinate();

            state._fsp--;


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


            	leaveRule();

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
    // InternalBmod.g:811:1: entryRuleFire returns [EObject current=null] : iv_ruleFire= ruleFire EOF ;
    public final EObject entryRuleFire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFire = null;


        try {
            // InternalBmod.g:811:45: (iv_ruleFire= ruleFire EOF )
            // InternalBmod.g:812:2: iv_ruleFire= ruleFire EOF
            {
             newCompositeNode(grammarAccess.getFireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFire=ruleFire();

            state._fsp--;

             current =iv_ruleFire; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:818:1: ruleFire returns [EObject current=null] : (otherlv_0= 'Fire' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) ) ;
    public final EObject ruleFire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_location_2_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:824:2: ( (otherlv_0= 'Fire' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) ) )
            // InternalBmod.g:825:2: (otherlv_0= 'Fire' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) )
            {
            // InternalBmod.g:825:2: (otherlv_0= 'Fire' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) )
            // InternalBmod.g:826:3: otherlv_0= 'Fire' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFireAccess().getFireKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFireAccess().getInKeyword_1());
            		
            // InternalBmod.g:834:3: ( (lv_location_2_0= ruleCoordinate ) )
            // InternalBmod.g:835:4: (lv_location_2_0= ruleCoordinate )
            {
            // InternalBmod.g:835:4: (lv_location_2_0= ruleCoordinate )
            // InternalBmod.g:836:5: lv_location_2_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getFireAccess().getLocationCoordinateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_location_2_0=ruleCoordinate();

            state._fsp--;


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


            	leaveRule();

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
    // InternalBmod.g:857:1: entryRuleEmergencySign returns [EObject current=null] : iv_ruleEmergencySign= ruleEmergencySign EOF ;
    public final EObject entryRuleEmergencySign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmergencySign = null;


        try {
            // InternalBmod.g:857:54: (iv_ruleEmergencySign= ruleEmergencySign EOF )
            // InternalBmod.g:858:2: iv_ruleEmergencySign= ruleEmergencySign EOF
            {
             newCompositeNode(grammarAccess.getEmergencySignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmergencySign=ruleEmergencySign();

            state._fsp--;

             current =iv_ruleEmergencySign; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:864:1: ruleEmergencySign returns [EObject current=null] : (otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_to_3_0= ruleDoorRef ) ) ) ;
    public final EObject ruleEmergencySign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_to_3_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:870:2: ( (otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_to_3_0= ruleDoorRef ) ) ) )
            // InternalBmod.g:871:2: (otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_to_3_0= ruleDoorRef ) ) )
            {
            // InternalBmod.g:871:2: (otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_to_3_0= ruleDoorRef ) ) )
            // InternalBmod.g:872:3: otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_to_3_0= ruleDoorRef ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEmergencySignAccess().getSignKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEmergencySignAccess().getOnKeyword_1());
            		
            // InternalBmod.g:880:3: ( (otherlv_2= RULE_VARNAME ) )
            // InternalBmod.g:881:4: (otherlv_2= RULE_VARNAME )
            {
            // InternalBmod.g:881:4: (otherlv_2= RULE_VARNAME )
            // InternalBmod.g:882:5: otherlv_2= RULE_VARNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmergencySignRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_VARNAME,FOLLOW_8); 

            					newLeafNode(otherlv_2, grammarAccess.getEmergencySignAccess().getOnDoorCrossReference_2_0());
            				

            }


            }

            // InternalBmod.g:893:3: ( (lv_to_3_0= ruleDoorRef ) )
            // InternalBmod.g:894:4: (lv_to_3_0= ruleDoorRef )
            {
            // InternalBmod.g:894:4: (lv_to_3_0= ruleDoorRef )
            // InternalBmod.g:895:5: lv_to_3_0= ruleDoorRef
            {

            					newCompositeNode(grammarAccess.getEmergencySignAccess().getToDoorRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_to_3_0=ruleDoorRef();

            state._fsp--;


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


            	leaveRule();

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
    // InternalBmod.g:916:1: entryRuleDoorRef returns [EObject current=null] : iv_ruleDoorRef= ruleDoorRef EOF ;
    public final EObject entryRuleDoorRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoorRef = null;


        try {
            // InternalBmod.g:916:48: (iv_ruleDoorRef= ruleDoorRef EOF )
            // InternalBmod.g:917:2: iv_ruleDoorRef= ruleDoorRef EOF
            {
             newCompositeNode(grammarAccess.getDoorRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoorRef=ruleDoorRef();

            state._fsp--;

             current =iv_ruleDoorRef; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:923:1: ruleDoorRef returns [EObject current=null] : (otherlv_0= 'to' ( (otherlv_1= RULE_VARNAME ) ) ) ;
    public final EObject ruleDoorRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBmod.g:929:2: ( (otherlv_0= 'to' ( (otherlv_1= RULE_VARNAME ) ) ) )
            // InternalBmod.g:930:2: (otherlv_0= 'to' ( (otherlv_1= RULE_VARNAME ) ) )
            {
            // InternalBmod.g:930:2: (otherlv_0= 'to' ( (otherlv_1= RULE_VARNAME ) ) )
            // InternalBmod.g:931:3: otherlv_0= 'to' ( (otherlv_1= RULE_VARNAME ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDoorRefAccess().getToKeyword_0());
            		
            // InternalBmod.g:935:3: ( (otherlv_1= RULE_VARNAME ) )
            // InternalBmod.g:936:4: (otherlv_1= RULE_VARNAME )
            {
            // InternalBmod.g:936:4: (otherlv_1= RULE_VARNAME )
            // InternalBmod.g:937:5: otherlv_1= RULE_VARNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoorRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_VARNAME,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getDoorRefAccess().getRefDoorCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalBmod.g:952:1: entryRuleDangerousCondition returns [EObject current=null] : iv_ruleDangerousCondition= ruleDangerousCondition EOF ;
    public final EObject entryRuleDangerousCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDangerousCondition = null;


        try {
            // InternalBmod.g:952:59: (iv_ruleDangerousCondition= ruleDangerousCondition EOF )
            // InternalBmod.g:953:2: iv_ruleDangerousCondition= ruleDangerousCondition EOF
            {
             newCompositeNode(grammarAccess.getDangerousConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDangerousCondition=ruleDangerousCondition();

            state._fsp--;

             current =iv_ruleDangerousCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:959:1: ruleDangerousCondition returns [EObject current=null] : (otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) ) ) ;
    public final EObject ruleDangerousCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_amount_3_0=null;


        	enterRule();

        try {
            // InternalBmod.g:965:2: ( (otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) ) ) )
            // InternalBmod.g:966:2: (otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) ) )
            {
            // InternalBmod.g:966:2: (otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) ) )
            // InternalBmod.g:967:3: otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDangerousConditionAccess().getConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDangerousConditionAccess().getOnKeyword_1());
            		
            // InternalBmod.g:975:3: ( (otherlv_2= RULE_VARNAME ) )
            // InternalBmod.g:976:4: (otherlv_2= RULE_VARNAME )
            {
            // InternalBmod.g:976:4: (otherlv_2= RULE_VARNAME )
            // InternalBmod.g:977:5: otherlv_2= RULE_VARNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDangerousConditionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_VARNAME,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getDangerousConditionAccess().getOnRoomCrossReference_2_0());
            				

            }


            }

            // InternalBmod.g:988:3: ( (lv_amount_3_0= RULE_INT ) )
            // InternalBmod.g:989:4: (lv_amount_3_0= RULE_INT )
            {
            // InternalBmod.g:989:4: (lv_amount_3_0= RULE_INT )
            // InternalBmod.g:990:5: lv_amount_3_0= RULE_INT
            {
            lv_amount_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_amount_3_0, grammarAccess.getDangerousConditionAccess().getAmountINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDangerousConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalBmod.g:1010:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalBmod.g:1010:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalBmod.g:1011:2: iv_ruleCoordinate= ruleCoordinate EOF
            {
             newCompositeNode(grammarAccess.getCoordinateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinate=ruleCoordinate();

            state._fsp--;

             current =iv_ruleCoordinate; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:1017:1: ruleCoordinate returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBmod.g:1023:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalBmod.g:1024:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalBmod.g:1024:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalBmod.g:1025:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBmod.g:1029:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalBmod.g:1030:4: (lv_x_1_0= RULE_INT )
            {
            // InternalBmod.g:1030:4: (lv_x_1_0= RULE_INT )
            // InternalBmod.g:1031:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_x_1_0, grammarAccess.getCoordinateAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinateAccess().getCommaKeyword_2());
            		
            // InternalBmod.g:1051:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalBmod.g:1052:4: (lv_y_3_0= RULE_INT )
            {
            // InternalBmod.g:1052:4: (lv_y_3_0= RULE_INT )
            // InternalBmod.g:1053:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_y_3_0, grammarAccess.getCoordinateAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalBmod.g:1077:1: entryRuleArea returns [EObject current=null] : iv_ruleArea= ruleArea EOF ;
    public final EObject entryRuleArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArea = null;


        try {
            // InternalBmod.g:1077:45: (iv_ruleArea= ruleArea EOF )
            // InternalBmod.g:1078:2: iv_ruleArea= ruleArea EOF
            {
             newCompositeNode(grammarAccess.getAreaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArea=ruleArea();

            state._fsp--;

             current =iv_ruleArea; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBmod.g:1084:1: ruleArea returns [EObject current=null] : (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? ) ;
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
            // InternalBmod.g:1090:2: ( (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? ) )
            // InternalBmod.g:1091:2: (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? )
            {
            // InternalBmod.g:1091:2: (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? )
            // InternalBmod.g:1092:3: otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAreaAccess().getFromKeyword_0());
            		
            // InternalBmod.g:1096:3: ( (lv_from_1_0= ruleCoordinate ) )
            // InternalBmod.g:1097:4: (lv_from_1_0= ruleCoordinate )
            {
            // InternalBmod.g:1097:4: (lv_from_1_0= ruleCoordinate )
            // InternalBmod.g:1098:5: lv_from_1_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getAreaAccess().getFromCoordinateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_from_1_0=ruleCoordinate();

            state._fsp--;


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

            otherlv_2=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAreaAccess().getToKeyword_2());
            		
            // InternalBmod.g:1119:3: ( (lv_to_3_0= ruleCoordinate ) )
            // InternalBmod.g:1120:4: (lv_to_3_0= ruleCoordinate )
            {
            // InternalBmod.g:1120:4: (lv_to_3_0= ruleCoordinate )
            // InternalBmod.g:1121:5: lv_to_3_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getAreaAccess().getToCoordinateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_to_3_0=ruleCoordinate();

            state._fsp--;


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

            // InternalBmod.g:1138:3: (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBmod.g:1139:4: otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )*
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getAreaAccess().getWithoutKeyword_4_0());
                    			
                    // InternalBmod.g:1143:4: ( (lv_without_5_0= ruleCoordinate ) )
                    // InternalBmod.g:1144:5: (lv_without_5_0= ruleCoordinate )
                    {
                    // InternalBmod.g:1144:5: (lv_without_5_0= ruleCoordinate )
                    // InternalBmod.g:1145:6: lv_without_5_0= ruleCoordinate
                    {

                    						newCompositeNode(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_without_5_0=ruleCoordinate();

                    state._fsp--;


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

                    // InternalBmod.g:1162:4: (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==22) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBmod.g:1163:5: otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_7); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAreaAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalBmod.g:1167:5: ( (lv_without_7_0= ruleCoordinate ) )
                    	    // InternalBmod.g:1168:6: (lv_without_7_0= ruleCoordinate )
                    	    {
                    	    // InternalBmod.g:1168:6: (lv_without_7_0= ruleCoordinate )
                    	    // InternalBmod.g:1169:7: lv_without_7_0= ruleCoordinate
                    	    {

                    	    							newCompositeNode(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_without_7_0=ruleCoordinate();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "rulePerceptionEnum"
    // InternalBmod.g:1192:1: rulePerceptionEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'attentive' ) | (enumLiteral_1= 'relaxed' ) | (enumLiteral_2= 'optimistic' ) | (enumLiteral_3= 'sceptic' ) ) ;
    public final Enumerator rulePerceptionEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBmod.g:1198:2: ( ( (enumLiteral_0= 'attentive' ) | (enumLiteral_1= 'relaxed' ) | (enumLiteral_2= 'optimistic' ) | (enumLiteral_3= 'sceptic' ) ) )
            // InternalBmod.g:1199:2: ( (enumLiteral_0= 'attentive' ) | (enumLiteral_1= 'relaxed' ) | (enumLiteral_2= 'optimistic' ) | (enumLiteral_3= 'sceptic' ) )
            {
            // InternalBmod.g:1199:2: ( (enumLiteral_0= 'attentive' ) | (enumLiteral_1= 'relaxed' ) | (enumLiteral_2= 'optimistic' ) | (enumLiteral_3= 'sceptic' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBmod.g:1200:3: (enumLiteral_0= 'attentive' )
                    {
                    // InternalBmod.g:1200:3: (enumLiteral_0= 'attentive' )
                    // InternalBmod.g:1201:4: enumLiteral_0= 'attentive'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getPerceptionEnumAccess().getAttentiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPerceptionEnumAccess().getAttentiveEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:1208:3: (enumLiteral_1= 'relaxed' )
                    {
                    // InternalBmod.g:1208:3: (enumLiteral_1= 'relaxed' )
                    // InternalBmod.g:1209:4: enumLiteral_1= 'relaxed'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPerceptionEnumAccess().getRelaxedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPerceptionEnumAccess().getRelaxedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:1216:3: (enumLiteral_2= 'optimistic' )
                    {
                    // InternalBmod.g:1216:3: (enumLiteral_2= 'optimistic' )
                    // InternalBmod.g:1217:4: enumLiteral_2= 'optimistic'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getPerceptionEnumAccess().getOptimisticEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPerceptionEnumAccess().getOptimisticEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBmod.g:1224:3: (enumLiteral_3= 'sceptic' )
                    {
                    // InternalBmod.g:1224:3: (enumLiteral_3= 'sceptic' )
                    // InternalBmod.g:1225:4: enumLiteral_3= 'sceptic'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPerceptionEnumAccess().getScepticEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPerceptionEnumAccess().getScepticEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalBmod.g:1235:1: ruleActionEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'newcomer' ) | (enumLiteral_1= 'experienced' ) | (enumLiteral_2= 'panic' ) ) ;
    public final Enumerator ruleActionEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBmod.g:1241:2: ( ( (enumLiteral_0= 'newcomer' ) | (enumLiteral_1= 'experienced' ) | (enumLiteral_2= 'panic' ) ) )
            // InternalBmod.g:1242:2: ( (enumLiteral_0= 'newcomer' ) | (enumLiteral_1= 'experienced' ) | (enumLiteral_2= 'panic' ) )
            {
            // InternalBmod.g:1242:2: ( (enumLiteral_0= 'newcomer' ) | (enumLiteral_1= 'experienced' ) | (enumLiteral_2= 'panic' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case 36:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBmod.g:1243:3: (enumLiteral_0= 'newcomer' )
                    {
                    // InternalBmod.g:1243:3: (enumLiteral_0= 'newcomer' )
                    // InternalBmod.g:1244:4: enumLiteral_0= 'newcomer'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getActionEnumAccess().getNewcomerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionEnumAccess().getNewcomerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:1251:3: (enumLiteral_1= 'experienced' )
                    {
                    // InternalBmod.g:1251:3: (enumLiteral_1= 'experienced' )
                    // InternalBmod.g:1252:4: enumLiteral_1= 'experienced'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getActionEnumAccess().getExperiencedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionEnumAccess().getExperiencedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:1259:3: (enumLiteral_2= 'panic' )
                    {
                    // InternalBmod.g:1259:3: (enumLiteral_2= 'panic' )
                    // InternalBmod.g:1260:4: enumLiteral_2= 'panic'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getActionEnumAccess().getPanicEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionEnumAccess().getPanicEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000B8E5002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000780000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003800000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});

}