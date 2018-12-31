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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARNAME", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Room'", "'named'", "'and'", "'Door'", "'from'", "'to'", "'Person'", "'in'", "':'", "','", "'Exit'", "'Sign'", "'on'", "'Condition'", "'('", "')'", "'without'", "'attentive'", "'relaxed'", "'optimistic'", "'sceptic'", "'newcomer'", "'experienced'", "'panic'"
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
    // InternalBmod.g:97:1: ruleFloorplan returns [EObject current=null] : ( () ( ( (lv_rooms_1_0= ruleRoom ) ) | ( (lv_doors_2_0= ruleDoor ) ) | ( (lv_persons_3_0= rulePerson ) ) | ( (lv_exits_4_0= ruleExit ) ) | ( (lv_signs_5_0= ruleEmergencySign ) ) | ( (lv_dancons_6_0= ruleDangerousCondition ) ) )* ) ;
    public final EObject ruleFloorplan() throws RecognitionException {
        EObject current = null;

        EObject lv_rooms_1_0 = null;

        EObject lv_doors_2_0 = null;

        EObject lv_persons_3_0 = null;

        EObject lv_exits_4_0 = null;

        EObject lv_signs_5_0 = null;

        EObject lv_dancons_6_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:103:2: ( ( () ( ( (lv_rooms_1_0= ruleRoom ) ) | ( (lv_doors_2_0= ruleDoor ) ) | ( (lv_persons_3_0= rulePerson ) ) | ( (lv_exits_4_0= ruleExit ) ) | ( (lv_signs_5_0= ruleEmergencySign ) ) | ( (lv_dancons_6_0= ruleDangerousCondition ) ) )* ) )
            // InternalBmod.g:104:2: ( () ( ( (lv_rooms_1_0= ruleRoom ) ) | ( (lv_doors_2_0= ruleDoor ) ) | ( (lv_persons_3_0= rulePerson ) ) | ( (lv_exits_4_0= ruleExit ) ) | ( (lv_signs_5_0= ruleEmergencySign ) ) | ( (lv_dancons_6_0= ruleDangerousCondition ) ) )* )
            {
            // InternalBmod.g:104:2: ( () ( ( (lv_rooms_1_0= ruleRoom ) ) | ( (lv_doors_2_0= ruleDoor ) ) | ( (lv_persons_3_0= rulePerson ) ) | ( (lv_exits_4_0= ruleExit ) ) | ( (lv_signs_5_0= ruleEmergencySign ) ) | ( (lv_dancons_6_0= ruleDangerousCondition ) ) )* )
            // InternalBmod.g:105:3: () ( ( (lv_rooms_1_0= ruleRoom ) ) | ( (lv_doors_2_0= ruleDoor ) ) | ( (lv_persons_3_0= rulePerson ) ) | ( (lv_exits_4_0= ruleExit ) ) | ( (lv_signs_5_0= ruleEmergencySign ) ) | ( (lv_dancons_6_0= ruleDangerousCondition ) ) )*
            {
            // InternalBmod.g:105:3: ()
            // InternalBmod.g:106:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloorplanAccess().getFloorplanAction_0(),
            					current);
            			

            }

            // InternalBmod.g:112:3: ( ( (lv_rooms_1_0= ruleRoom ) ) | ( (lv_doors_2_0= ruleDoor ) ) | ( (lv_persons_3_0= rulePerson ) ) | ( (lv_exits_4_0= ruleExit ) ) | ( (lv_signs_5_0= ruleEmergencySign ) ) | ( (lv_dancons_6_0= ruleDangerousCondition ) ) )*
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt1=1;
                    }
                    break;
                case 15:
                    {
                    alt1=2;
                    }
                    break;
                case 18:
                    {
                    alt1=3;
                    }
                    break;
                case 22:
                    {
                    alt1=4;
                    }
                    break;
                case 23:
                    {
                    alt1=5;
                    }
                    break;
                case 25:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalBmod.g:113:4: ( (lv_rooms_1_0= ruleRoom ) )
            	    {
            	    // InternalBmod.g:113:4: ( (lv_rooms_1_0= ruleRoom ) )
            	    // InternalBmod.g:114:5: (lv_rooms_1_0= ruleRoom )
            	    {
            	    // InternalBmod.g:114:5: (lv_rooms_1_0= ruleRoom )
            	    // InternalBmod.g:115:6: lv_rooms_1_0= ruleRoom
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getRoomsRoomParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_rooms_1_0=ruleRoom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rooms",
            	    							lv_rooms_1_0,
            	    							"org.xtext.bmod.Bmod.Room");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBmod.g:133:4: ( (lv_doors_2_0= ruleDoor ) )
            	    {
            	    // InternalBmod.g:133:4: ( (lv_doors_2_0= ruleDoor ) )
            	    // InternalBmod.g:134:5: (lv_doors_2_0= ruleDoor )
            	    {
            	    // InternalBmod.g:134:5: (lv_doors_2_0= ruleDoor )
            	    // InternalBmod.g:135:6: lv_doors_2_0= ruleDoor
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getDoorsDoorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_doors_2_0=ruleDoor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"doors",
            	    							lv_doors_2_0,
            	    							"org.xtext.bmod.Bmod.Door");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBmod.g:153:4: ( (lv_persons_3_0= rulePerson ) )
            	    {
            	    // InternalBmod.g:153:4: ( (lv_persons_3_0= rulePerson ) )
            	    // InternalBmod.g:154:5: (lv_persons_3_0= rulePerson )
            	    {
            	    // InternalBmod.g:154:5: (lv_persons_3_0= rulePerson )
            	    // InternalBmod.g:155:6: lv_persons_3_0= rulePerson
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getPersonsPersonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_persons_3_0=rulePerson();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"persons",
            	    							lv_persons_3_0,
            	    							"org.xtext.bmod.Bmod.Person");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBmod.g:173:4: ( (lv_exits_4_0= ruleExit ) )
            	    {
            	    // InternalBmod.g:173:4: ( (lv_exits_4_0= ruleExit ) )
            	    // InternalBmod.g:174:5: (lv_exits_4_0= ruleExit )
            	    {
            	    // InternalBmod.g:174:5: (lv_exits_4_0= ruleExit )
            	    // InternalBmod.g:175:6: lv_exits_4_0= ruleExit
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getExitsExitParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_exits_4_0=ruleExit();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exits",
            	    							lv_exits_4_0,
            	    							"org.xtext.bmod.Bmod.Exit");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalBmod.g:193:4: ( (lv_signs_5_0= ruleEmergencySign ) )
            	    {
            	    // InternalBmod.g:193:4: ( (lv_signs_5_0= ruleEmergencySign ) )
            	    // InternalBmod.g:194:5: (lv_signs_5_0= ruleEmergencySign )
            	    {
            	    // InternalBmod.g:194:5: (lv_signs_5_0= ruleEmergencySign )
            	    // InternalBmod.g:195:6: lv_signs_5_0= ruleEmergencySign
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getSignsEmergencySignParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_signs_5_0=ruleEmergencySign();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"signs",
            	    							lv_signs_5_0,
            	    							"org.xtext.bmod.Bmod.EmergencySign");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalBmod.g:213:4: ( (lv_dancons_6_0= ruleDangerousCondition ) )
            	    {
            	    // InternalBmod.g:213:4: ( (lv_dancons_6_0= ruleDangerousCondition ) )
            	    // InternalBmod.g:214:5: (lv_dancons_6_0= ruleDangerousCondition )
            	    {
            	    // InternalBmod.g:214:5: (lv_dancons_6_0= ruleDangerousCondition )
            	    // InternalBmod.g:215:6: lv_dancons_6_0= ruleDangerousCondition
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getDanconsDangerousConditionParserRuleCall_1_5_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_dancons_6_0=ruleDangerousCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dancons",
            	    							lv_dancons_6_0,
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
    // InternalBmod.g:237:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalBmod.g:237:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalBmod.g:238:2: iv_ruleRoom= ruleRoom EOF
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
    // InternalBmod.g:244:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) ( (lv_areas_4_0= ruleArea ) ) (otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) ) )* ) ;
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
            // InternalBmod.g:250:2: ( (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) ( (lv_areas_4_0= ruleArea ) ) (otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) ) )* ) )
            // InternalBmod.g:251:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) ( (lv_areas_4_0= ruleArea ) ) (otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) ) )* )
            {
            // InternalBmod.g:251:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) ( (lv_areas_4_0= ruleArea ) ) (otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) ) )* )
            // InternalBmod.g:252:3: otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) ( (lv_areas_4_0= ruleArea ) ) (otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalBmod.g:256:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:257:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:257:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:258:5: lv_name_1_0= RULE_VARNAME
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

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getNamedKeyword_2());
            		
            // InternalBmod.g:278:3: ( (lv_named_3_0= RULE_STRING ) )
            // InternalBmod.g:279:4: (lv_named_3_0= RULE_STRING )
            {
            // InternalBmod.g:279:4: (lv_named_3_0= RULE_STRING )
            // InternalBmod.g:280:5: lv_named_3_0= RULE_STRING
            {
            lv_named_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_named_3_0, grammarAccess.getRoomAccess().getNamedSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"named",
            						lv_named_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBmod.g:296:3: ( (lv_areas_4_0= ruleArea ) )
            // InternalBmod.g:297:4: (lv_areas_4_0= ruleArea )
            {
            // InternalBmod.g:297:4: (lv_areas_4_0= ruleArea )
            // InternalBmod.g:298:5: lv_areas_4_0= ruleArea
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalBmod.g:315:3: (otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBmod.g:316:4: otherlv_5= 'and' ( (lv_areas_6_0= ruleArea ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getAndKeyword_5_0());
            	    			
            	    // InternalBmod.g:320:4: ( (lv_areas_6_0= ruleArea ) )
            	    // InternalBmod.g:321:5: (lv_areas_6_0= ruleArea )
            	    {
            	    // InternalBmod.g:321:5: (lv_areas_6_0= ruleArea )
            	    // InternalBmod.g:322:6: lv_areas_6_0= ruleArea
            	    {

            	    						newCompositeNode(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_areas_6_0=ruleArea();

            	    state._fsp--;


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
    // InternalBmod.g:344:1: entryRuleDoor returns [EObject current=null] : iv_ruleDoor= ruleDoor EOF ;
    public final EObject entryRuleDoor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoor = null;


        try {
            // InternalBmod.g:344:45: (iv_ruleDoor= ruleDoor EOF )
            // InternalBmod.g:345:2: iv_ruleDoor= ruleDoor EOF
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
    // InternalBmod.g:351:1: ruleDoor returns [EObject current=null] : (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) ) ;
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
            // InternalBmod.g:357:2: ( (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) ) )
            // InternalBmod.g:358:2: (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) )
            {
            // InternalBmod.g:358:2: (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) )
            // InternalBmod.g:359:3: otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDoorAccess().getDoorKeyword_0());
            		
            // InternalBmod.g:363:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:364:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:364:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:365:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDoorAccess().getFromKeyword_2());
            		
            // InternalBmod.g:385:3: ( (lv_from_3_0= ruleCoordinate ) )
            // InternalBmod.g:386:4: (lv_from_3_0= ruleCoordinate )
            {
            // InternalBmod.g:386:4: (lv_from_3_0= ruleCoordinate )
            // InternalBmod.g:387:5: lv_from_3_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getDoorAccess().getFromCoordinateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_4=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getDoorAccess().getToKeyword_4());
            		
            // InternalBmod.g:408:3: ( (lv_to_5_0= ruleCoordinate ) )
            // InternalBmod.g:409:4: (lv_to_5_0= ruleCoordinate )
            {
            // InternalBmod.g:409:4: (lv_to_5_0= ruleCoordinate )
            // InternalBmod.g:410:5: lv_to_5_0= ruleCoordinate
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


    // $ANTLR start "entryRulePerson"
    // InternalBmod.g:431:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalBmod.g:431:47: (iv_rulePerson= rulePerson EOF )
            // InternalBmod.g:432:2: iv_rulePerson= rulePerson EOF
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
    // InternalBmod.g:438:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) otherlv_6= ':' ( ( ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) ) ) | ( ( (lv_action_10_0= ruleAction ) ) otherlv_11= ',' ( (lv_perception_12_0= rulePerception ) ) ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_named_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_location_5_0 = null;

        Enumerator lv_perception_7_0 = null;

        Enumerator lv_action_9_0 = null;

        Enumerator lv_action_10_0 = null;

        Enumerator lv_perception_12_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:444:2: ( (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) otherlv_6= ':' ( ( ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) ) ) | ( ( (lv_action_10_0= ruleAction ) ) otherlv_11= ',' ( (lv_perception_12_0= rulePerception ) ) ) ) ) )
            // InternalBmod.g:445:2: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) otherlv_6= ':' ( ( ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) ) ) | ( ( (lv_action_10_0= ruleAction ) ) otherlv_11= ',' ( (lv_perception_12_0= rulePerception ) ) ) ) )
            {
            // InternalBmod.g:445:2: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) otherlv_6= ':' ( ( ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) ) ) | ( ( (lv_action_10_0= ruleAction ) ) otherlv_11= ',' ( (lv_perception_12_0= rulePerception ) ) ) ) )
            // InternalBmod.g:446:3: otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) otherlv_6= ':' ( ( ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) ) ) | ( ( (lv_action_10_0= ruleAction ) ) otherlv_11= ',' ( (lv_perception_12_0= rulePerception ) ) ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalBmod.g:450:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:451:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:451:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:452:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getNamedKeyword_2());
            		
            // InternalBmod.g:472:3: ( (lv_named_3_0= RULE_STRING ) )
            // InternalBmod.g:473:4: (lv_named_3_0= RULE_STRING )
            {
            // InternalBmod.g:473:4: (lv_named_3_0= RULE_STRING )
            // InternalBmod.g:474:5: lv_named_3_0= RULE_STRING
            {
            lv_named_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_named_3_0, grammarAccess.getPersonAccess().getNamedSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"named",
            						lv_named_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getInKeyword_4());
            		
            // InternalBmod.g:494:3: ( (lv_location_5_0= ruleCoordinate ) )
            // InternalBmod.g:495:4: (lv_location_5_0= ruleCoordinate )
            {
            // InternalBmod.g:495:4: (lv_location_5_0= ruleCoordinate )
            // InternalBmod.g:496:5: lv_location_5_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getLocationCoordinateParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_location_5_0=ruleCoordinate();

            state._fsp--;


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

            otherlv_6=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getColonKeyword_6());
            		
            // InternalBmod.g:517:3: ( ( ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) ) ) | ( ( (lv_action_10_0= ruleAction ) ) otherlv_11= ',' ( (lv_perception_12_0= rulePerception ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=29 && LA3_0<=32)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=33 && LA3_0<=35)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBmod.g:518:4: ( ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) ) )
                    {
                    // InternalBmod.g:518:4: ( ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) ) )
                    // InternalBmod.g:519:5: ( (lv_perception_7_0= rulePerception ) ) otherlv_8= ',' ( (lv_action_9_0= ruleAction ) )
                    {
                    // InternalBmod.g:519:5: ( (lv_perception_7_0= rulePerception ) )
                    // InternalBmod.g:520:6: (lv_perception_7_0= rulePerception )
                    {
                    // InternalBmod.g:520:6: (lv_perception_7_0= rulePerception )
                    // InternalBmod.g:521:7: lv_perception_7_0= rulePerception
                    {

                    							newCompositeNode(grammarAccess.getPersonAccess().getPerceptionPerceptionEnumRuleCall_7_0_0_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_perception_7_0=rulePerception();

                    state._fsp--;


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

                    otherlv_8=(Token)match(input,21,FOLLOW_13); 

                    					newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getCommaKeyword_7_0_1());
                    				
                    // InternalBmod.g:542:5: ( (lv_action_9_0= ruleAction ) )
                    // InternalBmod.g:543:6: (lv_action_9_0= ruleAction )
                    {
                    // InternalBmod.g:543:6: (lv_action_9_0= ruleAction )
                    // InternalBmod.g:544:7: lv_action_9_0= ruleAction
                    {

                    							newCompositeNode(grammarAccess.getPersonAccess().getActionActionEnumRuleCall_7_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_action_9_0=ruleAction();

                    state._fsp--;


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
                    break;
                case 2 :
                    // InternalBmod.g:563:4: ( ( (lv_action_10_0= ruleAction ) ) otherlv_11= ',' ( (lv_perception_12_0= rulePerception ) ) )
                    {
                    // InternalBmod.g:563:4: ( ( (lv_action_10_0= ruleAction ) ) otherlv_11= ',' ( (lv_perception_12_0= rulePerception ) ) )
                    // InternalBmod.g:564:5: ( (lv_action_10_0= ruleAction ) ) otherlv_11= ',' ( (lv_perception_12_0= rulePerception ) )
                    {
                    // InternalBmod.g:564:5: ( (lv_action_10_0= ruleAction ) )
                    // InternalBmod.g:565:6: (lv_action_10_0= ruleAction )
                    {
                    // InternalBmod.g:565:6: (lv_action_10_0= ruleAction )
                    // InternalBmod.g:566:7: lv_action_10_0= ruleAction
                    {

                    							newCompositeNode(grammarAccess.getPersonAccess().getActionActionEnumRuleCall_7_1_0_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_action_10_0=ruleAction();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    							}
                    							set(
                    								current,
                    								"action",
                    								lv_action_10_0,
                    								"org.xtext.bmod.Bmod.Action");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,21,FOLLOW_15); 

                    					newLeafNode(otherlv_11, grammarAccess.getPersonAccess().getCommaKeyword_7_1_1());
                    				
                    // InternalBmod.g:587:5: ( (lv_perception_12_0= rulePerception ) )
                    // InternalBmod.g:588:6: (lv_perception_12_0= rulePerception )
                    {
                    // InternalBmod.g:588:6: (lv_perception_12_0= rulePerception )
                    // InternalBmod.g:589:7: lv_perception_12_0= rulePerception
                    {

                    							newCompositeNode(grammarAccess.getPersonAccess().getPerceptionPerceptionEnumRuleCall_7_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_perception_12_0=rulePerception();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    							}
                    							set(
                    								current,
                    								"perception",
                    								lv_perception_12_0,
                    								"org.xtext.bmod.Bmod.Perception");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleExit"
    // InternalBmod.g:612:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // InternalBmod.g:612:45: (iv_ruleExit= ruleExit EOF )
            // InternalBmod.g:613:2: iv_ruleExit= ruleExit EOF
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
    // InternalBmod.g:619:1: ruleExit returns [EObject current=null] : (otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_location_2_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:625:2: ( (otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) ) )
            // InternalBmod.g:626:2: (otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) )
            {
            // InternalBmod.g:626:2: (otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) ) )
            // InternalBmod.g:627:3: otherlv_0= 'Exit' otherlv_1= 'in' ( (lv_location_2_0= ruleCoordinate ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getExitAccess().getExitKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getExitAccess().getInKeyword_1());
            		
            // InternalBmod.g:635:3: ( (lv_location_2_0= ruleCoordinate ) )
            // InternalBmod.g:636:4: (lv_location_2_0= ruleCoordinate )
            {
            // InternalBmod.g:636:4: (lv_location_2_0= ruleCoordinate )
            // InternalBmod.g:637:5: lv_location_2_0= ruleCoordinate
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


    // $ANTLR start "entryRuleEmergencySign"
    // InternalBmod.g:658:1: entryRuleEmergencySign returns [EObject current=null] : iv_ruleEmergencySign= ruleEmergencySign EOF ;
    public final EObject entryRuleEmergencySign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmergencySign = null;


        try {
            // InternalBmod.g:658:54: (iv_ruleEmergencySign= ruleEmergencySign EOF )
            // InternalBmod.g:659:2: iv_ruleEmergencySign= ruleEmergencySign EOF
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
    // InternalBmod.g:665:1: ruleEmergencySign returns [EObject current=null] : (otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) otherlv_3= 'to' ( (otherlv_4= RULE_VARNAME ) ) ) ;
    public final EObject ruleEmergencySign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBmod.g:671:2: ( (otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) otherlv_3= 'to' ( (otherlv_4= RULE_VARNAME ) ) ) )
            // InternalBmod.g:672:2: (otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) otherlv_3= 'to' ( (otherlv_4= RULE_VARNAME ) ) )
            {
            // InternalBmod.g:672:2: (otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) otherlv_3= 'to' ( (otherlv_4= RULE_VARNAME ) ) )
            // InternalBmod.g:673:3: otherlv_0= 'Sign' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) otherlv_3= 'to' ( (otherlv_4= RULE_VARNAME ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEmergencySignAccess().getSignKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEmergencySignAccess().getOnKeyword_1());
            		
            // InternalBmod.g:681:3: ( (otherlv_2= RULE_VARNAME ) )
            // InternalBmod.g:682:4: (otherlv_2= RULE_VARNAME )
            {
            // InternalBmod.g:682:4: (otherlv_2= RULE_VARNAME )
            // InternalBmod.g:683:5: otherlv_2= RULE_VARNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmergencySignRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_VARNAME,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getEmergencySignAccess().getOnDoorCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getEmergencySignAccess().getToKeyword_3());
            		
            // InternalBmod.g:698:3: ( (otherlv_4= RULE_VARNAME ) )
            // InternalBmod.g:699:4: (otherlv_4= RULE_VARNAME )
            {
            // InternalBmod.g:699:4: (otherlv_4= RULE_VARNAME )
            // InternalBmod.g:700:5: otherlv_4= RULE_VARNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmergencySignRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_VARNAME,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getEmergencySignAccess().getToDoorCrossReference_4_0());
            				

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


    // $ANTLR start "entryRuleDangerousCondition"
    // InternalBmod.g:715:1: entryRuleDangerousCondition returns [EObject current=null] : iv_ruleDangerousCondition= ruleDangerousCondition EOF ;
    public final EObject entryRuleDangerousCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDangerousCondition = null;


        try {
            // InternalBmod.g:715:59: (iv_ruleDangerousCondition= ruleDangerousCondition EOF )
            // InternalBmod.g:716:2: iv_ruleDangerousCondition= ruleDangerousCondition EOF
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
    // InternalBmod.g:722:1: ruleDangerousCondition returns [EObject current=null] : (otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) ) ) ;
    public final EObject ruleDangerousCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_amount_3_0=null;


        	enterRule();

        try {
            // InternalBmod.g:728:2: ( (otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) ) ) )
            // InternalBmod.g:729:2: (otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) ) )
            {
            // InternalBmod.g:729:2: (otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) ) )
            // InternalBmod.g:730:3: otherlv_0= 'Condition' otherlv_1= 'on' ( (otherlv_2= RULE_VARNAME ) ) ( (lv_amount_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDangerousConditionAccess().getConditionKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDangerousConditionAccess().getOnKeyword_1());
            		
            // InternalBmod.g:738:3: ( (otherlv_2= RULE_VARNAME ) )
            // InternalBmod.g:739:4: (otherlv_2= RULE_VARNAME )
            {
            // InternalBmod.g:739:4: (otherlv_2= RULE_VARNAME )
            // InternalBmod.g:740:5: otherlv_2= RULE_VARNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDangerousConditionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_VARNAME,FOLLOW_17); 

            					newLeafNode(otherlv_2, grammarAccess.getDangerousConditionAccess().getOnRoomCrossReference_2_0());
            				

            }


            }

            // InternalBmod.g:751:3: ( (lv_amount_3_0= RULE_INT ) )
            // InternalBmod.g:752:4: (lv_amount_3_0= RULE_INT )
            {
            // InternalBmod.g:752:4: (lv_amount_3_0= RULE_INT )
            // InternalBmod.g:753:5: lv_amount_3_0= RULE_INT
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
    // InternalBmod.g:773:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalBmod.g:773:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalBmod.g:774:2: iv_ruleCoordinate= ruleCoordinate EOF
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
    // InternalBmod.g:780:1: ruleCoordinate returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBmod.g:786:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalBmod.g:787:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalBmod.g:787:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalBmod.g:788:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBmod.g:792:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalBmod.g:793:4: (lv_x_1_0= RULE_INT )
            {
            // InternalBmod.g:793:4: (lv_x_1_0= RULE_INT )
            // InternalBmod.g:794:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinateAccess().getCommaKeyword_2());
            		
            // InternalBmod.g:814:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalBmod.g:815:4: (lv_y_3_0= RULE_INT )
            {
            // InternalBmod.g:815:4: (lv_y_3_0= RULE_INT )
            // InternalBmod.g:816:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

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
    // InternalBmod.g:840:1: entryRuleArea returns [EObject current=null] : iv_ruleArea= ruleArea EOF ;
    public final EObject entryRuleArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArea = null;


        try {
            // InternalBmod.g:840:45: (iv_ruleArea= ruleArea EOF )
            // InternalBmod.g:841:2: iv_ruleArea= ruleArea EOF
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
    // InternalBmod.g:847:1: ruleArea returns [EObject current=null] : (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? ) ;
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
            // InternalBmod.g:853:2: ( (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? ) )
            // InternalBmod.g:854:2: (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? )
            {
            // InternalBmod.g:854:2: (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? )
            // InternalBmod.g:855:3: otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAreaAccess().getFromKeyword_0());
            		
            // InternalBmod.g:859:3: ( (lv_from_1_0= ruleCoordinate ) )
            // InternalBmod.g:860:4: (lv_from_1_0= ruleCoordinate )
            {
            // InternalBmod.g:860:4: (lv_from_1_0= ruleCoordinate )
            // InternalBmod.g:861:5: lv_from_1_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getAreaAccess().getFromCoordinateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAreaAccess().getToKeyword_2());
            		
            // InternalBmod.g:882:3: ( (lv_to_3_0= ruleCoordinate ) )
            // InternalBmod.g:883:4: (lv_to_3_0= ruleCoordinate )
            {
            // InternalBmod.g:883:4: (lv_to_3_0= ruleCoordinate )
            // InternalBmod.g:884:5: lv_to_3_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getAreaAccess().getToCoordinateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalBmod.g:901:3: (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBmod.g:902:4: otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )*
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getAreaAccess().getWithoutKeyword_4_0());
                    			
                    // InternalBmod.g:906:4: ( (lv_without_5_0= ruleCoordinate ) )
                    // InternalBmod.g:907:5: (lv_without_5_0= ruleCoordinate )
                    {
                    // InternalBmod.g:907:5: (lv_without_5_0= ruleCoordinate )
                    // InternalBmod.g:908:6: lv_without_5_0= ruleCoordinate
                    {

                    						newCompositeNode(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    // InternalBmod.g:925:4: (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalBmod.g:926:5: otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAreaAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalBmod.g:930:5: ( (lv_without_7_0= ruleCoordinate ) )
                    	    // InternalBmod.g:931:6: (lv_without_7_0= ruleCoordinate )
                    	    {
                    	    // InternalBmod.g:931:6: (lv_without_7_0= ruleCoordinate )
                    	    // InternalBmod.g:932:7: lv_without_7_0= ruleCoordinate
                    	    {

                    	    							newCompositeNode(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop4;
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


    // $ANTLR start "rulePerception"
    // InternalBmod.g:955:1: rulePerception returns [Enumerator current=null] : ( (enumLiteral_0= 'attentive' ) | (enumLiteral_1= 'relaxed' ) | (enumLiteral_2= 'optimistic' ) | (enumLiteral_3= 'sceptic' ) ) ;
    public final Enumerator rulePerception() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBmod.g:961:2: ( ( (enumLiteral_0= 'attentive' ) | (enumLiteral_1= 'relaxed' ) | (enumLiteral_2= 'optimistic' ) | (enumLiteral_3= 'sceptic' ) ) )
            // InternalBmod.g:962:2: ( (enumLiteral_0= 'attentive' ) | (enumLiteral_1= 'relaxed' ) | (enumLiteral_2= 'optimistic' ) | (enumLiteral_3= 'sceptic' ) )
            {
            // InternalBmod.g:962:2: ( (enumLiteral_0= 'attentive' ) | (enumLiteral_1= 'relaxed' ) | (enumLiteral_2= 'optimistic' ) | (enumLiteral_3= 'sceptic' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            case 32:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBmod.g:963:3: (enumLiteral_0= 'attentive' )
                    {
                    // InternalBmod.g:963:3: (enumLiteral_0= 'attentive' )
                    // InternalBmod.g:964:4: enumLiteral_0= 'attentive'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getPerceptionAccess().getATTENTIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPerceptionAccess().getATTENTIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:971:3: (enumLiteral_1= 'relaxed' )
                    {
                    // InternalBmod.g:971:3: (enumLiteral_1= 'relaxed' )
                    // InternalBmod.g:972:4: enumLiteral_1= 'relaxed'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getPerceptionAccess().getRELAXEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPerceptionAccess().getRELAXEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:979:3: (enumLiteral_2= 'optimistic' )
                    {
                    // InternalBmod.g:979:3: (enumLiteral_2= 'optimistic' )
                    // InternalBmod.g:980:4: enumLiteral_2= 'optimistic'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getPerceptionAccess().getOPTIMISTICEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPerceptionAccess().getOPTIMISTICEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBmod.g:987:3: (enumLiteral_3= 'sceptic' )
                    {
                    // InternalBmod.g:987:3: (enumLiteral_3= 'sceptic' )
                    // InternalBmod.g:988:4: enumLiteral_3= 'sceptic'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPerceptionAccess().getSCEPTICEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPerceptionAccess().getSCEPTICEnumLiteralDeclaration_3());
                    			

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


    // $ANTLR start "ruleAction"
    // InternalBmod.g:998:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'newcomer' ) | (enumLiteral_1= 'experienced' ) | (enumLiteral_2= 'panic' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBmod.g:1004:2: ( ( (enumLiteral_0= 'newcomer' ) | (enumLiteral_1= 'experienced' ) | (enumLiteral_2= 'panic' ) ) )
            // InternalBmod.g:1005:2: ( (enumLiteral_0= 'newcomer' ) | (enumLiteral_1= 'experienced' ) | (enumLiteral_2= 'panic' ) )
            {
            // InternalBmod.g:1005:2: ( (enumLiteral_0= 'newcomer' ) | (enumLiteral_1= 'experienced' ) | (enumLiteral_2= 'panic' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 35:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBmod.g:1006:3: (enumLiteral_0= 'newcomer' )
                    {
                    // InternalBmod.g:1006:3: (enumLiteral_0= 'newcomer' )
                    // InternalBmod.g:1007:4: enumLiteral_0= 'newcomer'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getNEWCOMEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getNEWCOMEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:1014:3: (enumLiteral_1= 'experienced' )
                    {
                    // InternalBmod.g:1014:3: (enumLiteral_1= 'experienced' )
                    // InternalBmod.g:1015:4: enumLiteral_1= 'experienced'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getEXPERIENCEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getEXPERIENCEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBmod.g:1022:3: (enumLiteral_2= 'panic' )
                    {
                    // InternalBmod.g:1022:3: (enumLiteral_2= 'panic' )
                    // InternalBmod.g:1023:4: enumLiteral_2= 'panic'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getPANICEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getPANICEnumLiteralDeclaration_2());
                    			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002C49002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000FE0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200002L});

}