package org.xtext.bmod.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
    // InternalBmod.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBmod.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBmod.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalBmod.g:71:1: ruleModel returns [EObject current=null] : this_Floorplan_0= ruleFloorplan ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Floorplan_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:77:2: (this_Floorplan_0= ruleFloorplan )
            // InternalBmod.g:78:2: this_Floorplan_0= ruleFloorplan
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
    // InternalBmod.g:89:1: entryRuleFloorplan returns [EObject current=null] : iv_ruleFloorplan= ruleFloorplan EOF ;
    public final EObject entryRuleFloorplan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloorplan = null;


        try {
            // InternalBmod.g:89:50: (iv_ruleFloorplan= ruleFloorplan EOF )
            // InternalBmod.g:90:2: iv_ruleFloorplan= ruleFloorplan EOF
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
    // InternalBmod.g:96:1: ruleFloorplan returns [EObject current=null] : ( () ( ( (lv_rooms_1_0= ruleRoom ) ) | ( (lv_doors_2_0= ruleDoor ) ) | ( (lv_persons_3_0= rulePerson ) ) | ( (lv_profiles_4_0= ruleProfile ) ) | ( (lv_levels_5_0= ruleLevel ) ) )* ) ;
    public final EObject ruleFloorplan() throws RecognitionException {
        EObject current = null;

        EObject lv_rooms_1_0 = null;

        EObject lv_doors_2_0 = null;

        EObject lv_persons_3_0 = null;

        EObject lv_profiles_4_0 = null;

        EObject lv_levels_5_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:102:2: ( ( () ( ( (lv_rooms_1_0= ruleRoom ) ) | ( (lv_doors_2_0= ruleDoor ) ) | ( (lv_persons_3_0= rulePerson ) ) | ( (lv_profiles_4_0= ruleProfile ) ) | ( (lv_levels_5_0= ruleLevel ) ) )* ) )
            // InternalBmod.g:103:2: ( () ( ( (lv_rooms_1_0= ruleRoom ) ) | ( (lv_doors_2_0= ruleDoor ) ) | ( (lv_persons_3_0= rulePerson ) ) | ( (lv_profiles_4_0= ruleProfile ) ) | ( (lv_levels_5_0= ruleLevel ) ) )* )
            {
            // InternalBmod.g:103:2: ( () ( ( (lv_rooms_1_0= ruleRoom ) ) | ( (lv_doors_2_0= ruleDoor ) ) | ( (lv_persons_3_0= rulePerson ) ) | ( (lv_profiles_4_0= ruleProfile ) ) | ( (lv_levels_5_0= ruleLevel ) ) )* )
            // InternalBmod.g:104:3: () ( ( (lv_rooms_1_0= ruleRoom ) ) | ( (lv_doors_2_0= ruleDoor ) ) | ( (lv_persons_3_0= rulePerson ) ) | ( (lv_profiles_4_0= ruleProfile ) ) | ( (lv_levels_5_0= ruleLevel ) ) )*
            {
            // InternalBmod.g:104:3: ()
            // InternalBmod.g:105:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloorplanAccess().getFloorplanAction_0(),
            					current);
            			

            }

            // InternalBmod.g:111:3: ( ( (lv_rooms_1_0= ruleRoom ) ) | ( (lv_doors_2_0= ruleDoor ) ) | ( (lv_persons_3_0= rulePerson ) ) | ( (lv_profiles_4_0= ruleProfile ) ) | ( (lv_levels_5_0= ruleLevel ) ) )*
            loop1:
            do {
                int alt1=6;
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

                }

                switch (alt1) {
            	case 1 :
            	    // InternalBmod.g:112:4: ( (lv_rooms_1_0= ruleRoom ) )
            	    {
            	    // InternalBmod.g:112:4: ( (lv_rooms_1_0= ruleRoom ) )
            	    // InternalBmod.g:113:5: (lv_rooms_1_0= ruleRoom )
            	    {
            	    // InternalBmod.g:113:5: (lv_rooms_1_0= ruleRoom )
            	    // InternalBmod.g:114:6: lv_rooms_1_0= ruleRoom
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
            	    // InternalBmod.g:132:4: ( (lv_doors_2_0= ruleDoor ) )
            	    {
            	    // InternalBmod.g:132:4: ( (lv_doors_2_0= ruleDoor ) )
            	    // InternalBmod.g:133:5: (lv_doors_2_0= ruleDoor )
            	    {
            	    // InternalBmod.g:133:5: (lv_doors_2_0= ruleDoor )
            	    // InternalBmod.g:134:6: lv_doors_2_0= ruleDoor
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
            	    // InternalBmod.g:152:4: ( (lv_persons_3_0= rulePerson ) )
            	    {
            	    // InternalBmod.g:152:4: ( (lv_persons_3_0= rulePerson ) )
            	    // InternalBmod.g:153:5: (lv_persons_3_0= rulePerson )
            	    {
            	    // InternalBmod.g:153:5: (lv_persons_3_0= rulePerson )
            	    // InternalBmod.g:154:6: lv_persons_3_0= rulePerson
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
            	    // InternalBmod.g:172:4: ( (lv_profiles_4_0= ruleProfile ) )
            	    {
            	    // InternalBmod.g:172:4: ( (lv_profiles_4_0= ruleProfile ) )
            	    // InternalBmod.g:173:5: (lv_profiles_4_0= ruleProfile )
            	    {
            	    // InternalBmod.g:173:5: (lv_profiles_4_0= ruleProfile )
            	    // InternalBmod.g:174:6: lv_profiles_4_0= ruleProfile
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getProfilesProfileParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_profiles_4_0=ruleProfile();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"profiles",
            	    							lv_profiles_4_0,
            	    							"org.xtext.bmod.Bmod.Profile");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalBmod.g:192:4: ( (lv_levels_5_0= ruleLevel ) )
            	    {
            	    // InternalBmod.g:192:4: ( (lv_levels_5_0= ruleLevel ) )
            	    // InternalBmod.g:193:5: (lv_levels_5_0= ruleLevel )
            	    {
            	    // InternalBmod.g:193:5: (lv_levels_5_0= ruleLevel )
            	    // InternalBmod.g:194:6: lv_levels_5_0= ruleLevel
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getLevelsLevelParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_levels_5_0=ruleLevel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"levels",
            	    							lv_levels_5_0,
            	    							"org.xtext.bmod.Bmod.Level");
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
    // InternalBmod.g:216:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalBmod.g:216:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalBmod.g:217:2: iv_ruleRoom= ruleRoom EOF
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
    // InternalBmod.g:223:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) ( (lv_area_4_0= ruleArea ) ) ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_named_3_0=null;
        EObject lv_area_4_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:229:2: ( (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) ( (lv_area_4_0= ruleArea ) ) ) )
            // InternalBmod.g:230:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) ( (lv_area_4_0= ruleArea ) ) )
            {
            // InternalBmod.g:230:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) ( (lv_area_4_0= ruleArea ) ) )
            // InternalBmod.g:231:3: otherlv_0= 'Room' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) ( (lv_area_4_0= ruleArea ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalBmod.g:235:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:236:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:236:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:237:5: lv_name_1_0= RULE_VARNAME
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
            		
            // InternalBmod.g:257:3: ( (lv_named_3_0= RULE_STRING ) )
            // InternalBmod.g:258:4: (lv_named_3_0= RULE_STRING )
            {
            // InternalBmod.g:258:4: (lv_named_3_0= RULE_STRING )
            // InternalBmod.g:259:5: lv_named_3_0= RULE_STRING
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

            // InternalBmod.g:275:3: ( (lv_area_4_0= ruleArea ) )
            // InternalBmod.g:276:4: (lv_area_4_0= ruleArea )
            {
            // InternalBmod.g:276:4: (lv_area_4_0= ruleArea )
            // InternalBmod.g:277:5: lv_area_4_0= ruleArea
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getAreaAreaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_area_4_0=ruleArea();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"area",
            						lv_area_4_0,
            						"org.xtext.bmod.Bmod.Area");
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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleDoor"
    // InternalBmod.g:298:1: entryRuleDoor returns [EObject current=null] : iv_ruleDoor= ruleDoor EOF ;
    public final EObject entryRuleDoor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoor = null;


        try {
            // InternalBmod.g:298:45: (iv_ruleDoor= ruleDoor EOF )
            // InternalBmod.g:299:2: iv_ruleDoor= ruleDoor EOF
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
    // InternalBmod.g:305:1: ruleDoor returns [EObject current=null] : (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) ) ;
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
            // InternalBmod.g:311:2: ( (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) ) )
            // InternalBmod.g:312:2: (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) )
            {
            // InternalBmod.g:312:2: (otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) ) )
            // InternalBmod.g:313:3: otherlv_0= 'Door' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'from' ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleCoordinate ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDoorAccess().getDoorKeyword_0());
            		
            // InternalBmod.g:317:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:318:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:318:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:319:5: lv_name_1_0= RULE_VARNAME
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

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDoorAccess().getFromKeyword_2());
            		
            // InternalBmod.g:339:3: ( (lv_from_3_0= ruleCoordinate ) )
            // InternalBmod.g:340:4: (lv_from_3_0= ruleCoordinate )
            {
            // InternalBmod.g:340:4: (lv_from_3_0= ruleCoordinate )
            // InternalBmod.g:341:5: lv_from_3_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getDoorAccess().getFromCoordinateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getDoorAccess().getToKeyword_4());
            		
            // InternalBmod.g:362:3: ( (lv_to_5_0= ruleCoordinate ) )
            // InternalBmod.g:363:4: (lv_to_5_0= ruleCoordinate )
            {
            // InternalBmod.g:363:4: (lv_to_5_0= ruleCoordinate )
            // InternalBmod.g:364:5: lv_to_5_0= ruleCoordinate
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


    // $ANTLR start "entryRuleProfile"
    // InternalBmod.g:385:1: entryRuleProfile returns [EObject current=null] : iv_ruleProfile= ruleProfile EOF ;
    public final EObject entryRuleProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfile = null;


        try {
            // InternalBmod.g:385:48: (iv_ruleProfile= ruleProfile EOF )
            // InternalBmod.g:386:2: iv_ruleProfile= ruleProfile EOF
            {
             newCompositeNode(grammarAccess.getProfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfile=ruleProfile();

            state._fsp--;

             current =iv_ruleProfile; 
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
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalBmod.g:392:1: ruleProfile returns [EObject current=null] : (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_VARNAME ) ) ) ;
    public final EObject ruleProfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBmod.g:398:2: ( (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_VARNAME ) ) ) )
            // InternalBmod.g:399:2: (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_VARNAME ) ) )
            {
            // InternalBmod.g:399:2: (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_VARNAME ) ) )
            // InternalBmod.g:400:3: otherlv_0= 'Profile' ( (lv_name_1_0= RULE_VARNAME ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProfileAccess().getProfileKeyword_0());
            		
            // InternalBmod.g:404:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:405:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:405:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:406:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProfileAccess().getNameVARNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProfileRule());
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
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleLevel"
    // InternalBmod.g:426:1: entryRuleLevel returns [EObject current=null] : iv_ruleLevel= ruleLevel EOF ;
    public final EObject entryRuleLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevel = null;


        try {
            // InternalBmod.g:426:46: (iv_ruleLevel= ruleLevel EOF )
            // InternalBmod.g:427:2: iv_ruleLevel= ruleLevel EOF
            {
             newCompositeNode(grammarAccess.getLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLevel=ruleLevel();

            state._fsp--;

             current =iv_ruleLevel; 
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
    // $ANTLR end "entryRuleLevel"


    // $ANTLR start "ruleLevel"
    // InternalBmod.g:433:1: ruleLevel returns [EObject current=null] : (otherlv_0= 'Level' ( (lv_name_1_0= RULE_VARNAME ) ) ) ;
    public final EObject ruleLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBmod.g:439:2: ( (otherlv_0= 'Level' ( (lv_name_1_0= RULE_VARNAME ) ) ) )
            // InternalBmod.g:440:2: (otherlv_0= 'Level' ( (lv_name_1_0= RULE_VARNAME ) ) )
            {
            // InternalBmod.g:440:2: (otherlv_0= 'Level' ( (lv_name_1_0= RULE_VARNAME ) ) )
            // InternalBmod.g:441:3: otherlv_0= 'Level' ( (lv_name_1_0= RULE_VARNAME ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLevelAccess().getLevelKeyword_0());
            		
            // InternalBmod.g:445:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:446:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:446:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:447:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLevelAccess().getNameVARNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLevelRule());
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
    // $ANTLR end "ruleLevel"


    // $ANTLR start "entryRulePerson"
    // InternalBmod.g:467:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalBmod.g:467:47: (iv_rulePerson= rulePerson EOF )
            // InternalBmod.g:468:2: iv_rulePerson= rulePerson EOF
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
    // InternalBmod.g:474:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) ( (otherlv_6= 'Profile' otherlv_7= ':' ( (otherlv_8= RULE_VARNAME ) ) otherlv_9= ',' otherlv_10= 'Level' otherlv_11= ':' ( (otherlv_12= RULE_VARNAME ) ) ) | (otherlv_13= 'Level' otherlv_14= ':' ( (otherlv_15= RULE_VARNAME ) ) otherlv_16= ',' otherlv_17= 'Profile' otherlv_18= ':' ( (otherlv_19= RULE_VARNAME ) ) ) )? ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_named_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_location_5_0 = null;



        	enterRule();

        try {
            // InternalBmod.g:480:2: ( (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) ( (otherlv_6= 'Profile' otherlv_7= ':' ( (otherlv_8= RULE_VARNAME ) ) otherlv_9= ',' otherlv_10= 'Level' otherlv_11= ':' ( (otherlv_12= RULE_VARNAME ) ) ) | (otherlv_13= 'Level' otherlv_14= ':' ( (otherlv_15= RULE_VARNAME ) ) otherlv_16= ',' otherlv_17= 'Profile' otherlv_18= ':' ( (otherlv_19= RULE_VARNAME ) ) ) )? ) )
            // InternalBmod.g:481:2: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) ( (otherlv_6= 'Profile' otherlv_7= ':' ( (otherlv_8= RULE_VARNAME ) ) otherlv_9= ',' otherlv_10= 'Level' otherlv_11= ':' ( (otherlv_12= RULE_VARNAME ) ) ) | (otherlv_13= 'Level' otherlv_14= ':' ( (otherlv_15= RULE_VARNAME ) ) otherlv_16= ',' otherlv_17= 'Profile' otherlv_18= ':' ( (otherlv_19= RULE_VARNAME ) ) ) )? )
            {
            // InternalBmod.g:481:2: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) ( (otherlv_6= 'Profile' otherlv_7= ':' ( (otherlv_8= RULE_VARNAME ) ) otherlv_9= ',' otherlv_10= 'Level' otherlv_11= ':' ( (otherlv_12= RULE_VARNAME ) ) ) | (otherlv_13= 'Level' otherlv_14= ':' ( (otherlv_15= RULE_VARNAME ) ) otherlv_16= ',' otherlv_17= 'Profile' otherlv_18= ':' ( (otherlv_19= RULE_VARNAME ) ) ) )? )
            // InternalBmod.g:482:3: otherlv_0= 'Person' ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= 'named' ( (lv_named_3_0= RULE_STRING ) ) otherlv_4= 'in' ( (lv_location_5_0= ruleCoordinate ) ) ( (otherlv_6= 'Profile' otherlv_7= ':' ( (otherlv_8= RULE_VARNAME ) ) otherlv_9= ',' otherlv_10= 'Level' otherlv_11= ':' ( (otherlv_12= RULE_VARNAME ) ) ) | (otherlv_13= 'Level' otherlv_14= ':' ( (otherlv_15= RULE_VARNAME ) ) otherlv_16= ',' otherlv_17= 'Profile' otherlv_18= ':' ( (otherlv_19= RULE_VARNAME ) ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalBmod.g:486:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmod.g:487:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmod.g:487:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmod.g:488:5: lv_name_1_0= RULE_VARNAME
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
            		
            // InternalBmod.g:508:3: ( (lv_named_3_0= RULE_STRING ) )
            // InternalBmod.g:509:4: (lv_named_3_0= RULE_STRING )
            {
            // InternalBmod.g:509:4: (lv_named_3_0= RULE_STRING )
            // InternalBmod.g:510:5: lv_named_3_0= RULE_STRING
            {
            lv_named_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            otherlv_4=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getInKeyword_4());
            		
            // InternalBmod.g:530:3: ( (lv_location_5_0= ruleCoordinate ) )
            // InternalBmod.g:531:4: (lv_location_5_0= ruleCoordinate )
            {
            // InternalBmod.g:531:4: (lv_location_5_0= ruleCoordinate )
            // InternalBmod.g:532:5: lv_location_5_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getLocationCoordinateParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalBmod.g:549:3: ( (otherlv_6= 'Profile' otherlv_7= ':' ( (otherlv_8= RULE_VARNAME ) ) otherlv_9= ',' otherlv_10= 'Level' otherlv_11= ':' ( (otherlv_12= RULE_VARNAME ) ) ) | (otherlv_13= 'Level' otherlv_14= ':' ( (otherlv_15= RULE_VARNAME ) ) otherlv_16= ',' otherlv_17= 'Profile' otherlv_18= ':' ( (otherlv_19= RULE_VARNAME ) ) ) )?
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==21) ) {
                    alt2=1;
                }
            }
            else if ( (LA2_0==18) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==21) ) {
                    alt2=2;
                }
            }
            switch (alt2) {
                case 1 :
                    // InternalBmod.g:550:4: (otherlv_6= 'Profile' otherlv_7= ':' ( (otherlv_8= RULE_VARNAME ) ) otherlv_9= ',' otherlv_10= 'Level' otherlv_11= ':' ( (otherlv_12= RULE_VARNAME ) ) )
                    {
                    // InternalBmod.g:550:4: (otherlv_6= 'Profile' otherlv_7= ':' ( (otherlv_8= RULE_VARNAME ) ) otherlv_9= ',' otherlv_10= 'Level' otherlv_11= ':' ( (otherlv_12= RULE_VARNAME ) ) )
                    // InternalBmod.g:551:5: otherlv_6= 'Profile' otherlv_7= ':' ( (otherlv_8= RULE_VARNAME ) ) otherlv_9= ',' otherlv_10= 'Level' otherlv_11= ':' ( (otherlv_12= RULE_VARNAME ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getProfileKeyword_6_0_0());
                    				
                    otherlv_7=(Token)match(input,21,FOLLOW_4); 

                    					newLeafNode(otherlv_7, grammarAccess.getPersonAccess().getColonKeyword_6_0_1());
                    				
                    // InternalBmod.g:559:5: ( (otherlv_8= RULE_VARNAME ) )
                    // InternalBmod.g:560:6: (otherlv_8= RULE_VARNAME )
                    {
                    // InternalBmod.g:560:6: (otherlv_8= RULE_VARNAME )
                    // InternalBmod.g:561:7: otherlv_8= RULE_VARNAME
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPersonRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_VARNAME,FOLLOW_13); 

                    							newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getProfileProfileCrossReference_6_0_2_0());
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_14); 

                    					newLeafNode(otherlv_9, grammarAccess.getPersonAccess().getCommaKeyword_6_0_3());
                    				
                    otherlv_10=(Token)match(input,18,FOLLOW_12); 

                    					newLeafNode(otherlv_10, grammarAccess.getPersonAccess().getLevelKeyword_6_0_4());
                    				
                    otherlv_11=(Token)match(input,21,FOLLOW_4); 

                    					newLeafNode(otherlv_11, grammarAccess.getPersonAccess().getColonKeyword_6_0_5());
                    				
                    // InternalBmod.g:584:5: ( (otherlv_12= RULE_VARNAME ) )
                    // InternalBmod.g:585:6: (otherlv_12= RULE_VARNAME )
                    {
                    // InternalBmod.g:585:6: (otherlv_12= RULE_VARNAME )
                    // InternalBmod.g:586:7: otherlv_12= RULE_VARNAME
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPersonRule());
                    							}
                    						
                    otherlv_12=(Token)match(input,RULE_VARNAME,FOLLOW_2); 

                    							newLeafNode(otherlv_12, grammarAccess.getPersonAccess().getLevelLevelCrossReference_6_0_6_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBmod.g:599:4: (otherlv_13= 'Level' otherlv_14= ':' ( (otherlv_15= RULE_VARNAME ) ) otherlv_16= ',' otherlv_17= 'Profile' otherlv_18= ':' ( (otherlv_19= RULE_VARNAME ) ) )
                    {
                    // InternalBmod.g:599:4: (otherlv_13= 'Level' otherlv_14= ':' ( (otherlv_15= RULE_VARNAME ) ) otherlv_16= ',' otherlv_17= 'Profile' otherlv_18= ':' ( (otherlv_19= RULE_VARNAME ) ) )
                    // InternalBmod.g:600:5: otherlv_13= 'Level' otherlv_14= ':' ( (otherlv_15= RULE_VARNAME ) ) otherlv_16= ',' otherlv_17= 'Profile' otherlv_18= ':' ( (otherlv_19= RULE_VARNAME ) )
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_12); 

                    					newLeafNode(otherlv_13, grammarAccess.getPersonAccess().getLevelKeyword_6_1_0());
                    				
                    otherlv_14=(Token)match(input,21,FOLLOW_4); 

                    					newLeafNode(otherlv_14, grammarAccess.getPersonAccess().getColonKeyword_6_1_1());
                    				
                    // InternalBmod.g:608:5: ( (otherlv_15= RULE_VARNAME ) )
                    // InternalBmod.g:609:6: (otherlv_15= RULE_VARNAME )
                    {
                    // InternalBmod.g:609:6: (otherlv_15= RULE_VARNAME )
                    // InternalBmod.g:610:7: otherlv_15= RULE_VARNAME
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPersonRule());
                    							}
                    						
                    otherlv_15=(Token)match(input,RULE_VARNAME,FOLLOW_13); 

                    							newLeafNode(otherlv_15, grammarAccess.getPersonAccess().getProfileLevelCrossReference_6_1_2_0());
                    						

                    }


                    }

                    otherlv_16=(Token)match(input,22,FOLLOW_15); 

                    					newLeafNode(otherlv_16, grammarAccess.getPersonAccess().getCommaKeyword_6_1_3());
                    				
                    otherlv_17=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(otherlv_17, grammarAccess.getPersonAccess().getProfileKeyword_6_1_4());
                    				
                    otherlv_18=(Token)match(input,21,FOLLOW_4); 

                    					newLeafNode(otherlv_18, grammarAccess.getPersonAccess().getColonKeyword_6_1_5());
                    				
                    // InternalBmod.g:633:5: ( (otherlv_19= RULE_VARNAME ) )
                    // InternalBmod.g:634:6: (otherlv_19= RULE_VARNAME )
                    {
                    // InternalBmod.g:634:6: (otherlv_19= RULE_VARNAME )
                    // InternalBmod.g:635:7: otherlv_19= RULE_VARNAME
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPersonRule());
                    							}
                    						
                    otherlv_19=(Token)match(input,RULE_VARNAME,FOLLOW_2); 

                    							newLeafNode(otherlv_19, grammarAccess.getPersonAccess().getLevelProfileCrossReference_6_1_6_0());
                    						

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


    // $ANTLR start "entryRuleCoordinate"
    // InternalBmod.g:652:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalBmod.g:652:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalBmod.g:653:2: iv_ruleCoordinate= ruleCoordinate EOF
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
    // InternalBmod.g:659:1: ruleCoordinate returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBmod.g:665:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalBmod.g:666:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalBmod.g:666:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalBmod.g:667:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBmod.g:671:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalBmod.g:672:4: (lv_x_1_0= RULE_INT )
            {
            // InternalBmod.g:672:4: (lv_x_1_0= RULE_INT )
            // InternalBmod.g:673:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinateAccess().getCommaKeyword_2());
            		
            // InternalBmod.g:693:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalBmod.g:694:4: (lv_y_3_0= RULE_INT )
            {
            // InternalBmod.g:694:4: (lv_y_3_0= RULE_INT )
            // InternalBmod.g:695:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_17); 

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

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

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
    // InternalBmod.g:719:1: entryRuleArea returns [EObject current=null] : iv_ruleArea= ruleArea EOF ;
    public final EObject entryRuleArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArea = null;


        try {
            // InternalBmod.g:719:45: (iv_ruleArea= ruleArea EOF )
            // InternalBmod.g:720:2: iv_ruleArea= ruleArea EOF
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
    // InternalBmod.g:726:1: ruleArea returns [EObject current=null] : (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? ) ;
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
            // InternalBmod.g:732:2: ( (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? ) )
            // InternalBmod.g:733:2: (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? )
            {
            // InternalBmod.g:733:2: (otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )? )
            // InternalBmod.g:734:3: otherlv_0= 'from' ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAreaAccess().getFromKeyword_0());
            		
            // InternalBmod.g:738:3: ( (lv_from_1_0= ruleCoordinate ) )
            // InternalBmod.g:739:4: (lv_from_1_0= ruleCoordinate )
            {
            // InternalBmod.g:739:4: (lv_from_1_0= ruleCoordinate )
            // InternalBmod.g:740:5: lv_from_1_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getAreaAccess().getFromCoordinateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAreaAccess().getToKeyword_2());
            		
            // InternalBmod.g:761:3: ( (lv_to_3_0= ruleCoordinate ) )
            // InternalBmod.g:762:4: (lv_to_3_0= ruleCoordinate )
            {
            // InternalBmod.g:762:4: (lv_to_3_0= ruleCoordinate )
            // InternalBmod.g:763:5: lv_to_3_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getAreaAccess().getToCoordinateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalBmod.g:780:3: (otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBmod.g:781:4: otherlv_4= 'without' ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getAreaAccess().getWithoutKeyword_4_0());
                    			
                    // InternalBmod.g:785:4: ( (lv_without_5_0= ruleCoordinate ) )
                    // InternalBmod.g:786:5: (lv_without_5_0= ruleCoordinate )
                    {
                    // InternalBmod.g:786:5: (lv_without_5_0= ruleCoordinate )
                    // InternalBmod.g:787:6: lv_without_5_0= ruleCoordinate
                    {

                    						newCompositeNode(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalBmod.g:804:4: (otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==22) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalBmod.g:805:5: otherlv_6= ',' ( (lv_without_7_0= ruleCoordinate ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAreaAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalBmod.g:809:5: ( (lv_without_7_0= ruleCoordinate ) )
                    	    // InternalBmod.g:810:6: (lv_without_7_0= ruleCoordinate )
                    	    {
                    	    // InternalBmod.g:810:6: (lv_without_7_0= ruleCoordinate )
                    	    // InternalBmod.g:811:7: lv_without_7_0= ruleCoordinate
                    	    {

                    	    							newCompositeNode(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop3;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000E5002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400002L});

}