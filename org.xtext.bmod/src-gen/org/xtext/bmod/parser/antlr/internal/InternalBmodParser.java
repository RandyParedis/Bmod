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
    // InternalBmodParser.g:57:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBmodParser.g:57:46: (iv_ruleModel= ruleModel EOF )
            // InternalBmodParser.g:58:2: iv_ruleModel= ruleModel EOF
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
    // InternalBmodParser.g:64:1: ruleModel returns [EObject current=null] : this_Floorplan_0= ruleFloorplan ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Floorplan_0 = null;



        	enterRule();

        try {
            // InternalBmodParser.g:70:2: (this_Floorplan_0= ruleFloorplan )
            // InternalBmodParser.g:71:2: this_Floorplan_0= ruleFloorplan
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
    // InternalBmodParser.g:82:1: entryRuleFloorplan returns [EObject current=null] : iv_ruleFloorplan= ruleFloorplan EOF ;
    public final EObject entryRuleFloorplan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloorplan = null;


        try {
            // InternalBmodParser.g:82:50: (iv_ruleFloorplan= ruleFloorplan EOF )
            // InternalBmodParser.g:83:2: iv_ruleFloorplan= ruleFloorplan EOF
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
    // InternalBmodParser.g:89:1: ruleFloorplan returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_rooms_2_0= ruleRoom ) ) | ( (lv_doors_3_0= ruleDoor ) ) | ( (lv_persons_4_0= rulePerson ) ) | ( (lv_exits_5_0= ruleExit ) ) | ( (lv_fires_6_0= ruleFire ) ) | ( (lv_signs_7_0= ruleEmergencySign ) ) )* ) ;
    public final EObject ruleFloorplan() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_rooms_2_0 = null;

        EObject lv_doors_3_0 = null;

        EObject lv_persons_4_0 = null;

        EObject lv_exits_5_0 = null;

        EObject lv_fires_6_0 = null;

        EObject lv_signs_7_0 = null;



        	enterRule();

        try {
            // InternalBmodParser.g:95:2: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_rooms_2_0= ruleRoom ) ) | ( (lv_doors_3_0= ruleDoor ) ) | ( (lv_persons_4_0= rulePerson ) ) | ( (lv_exits_5_0= ruleExit ) ) | ( (lv_fires_6_0= ruleFire ) ) | ( (lv_signs_7_0= ruleEmergencySign ) ) )* ) )
            // InternalBmodParser.g:96:2: ( () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_rooms_2_0= ruleRoom ) ) | ( (lv_doors_3_0= ruleDoor ) ) | ( (lv_persons_4_0= rulePerson ) ) | ( (lv_exits_5_0= ruleExit ) ) | ( (lv_fires_6_0= ruleFire ) ) | ( (lv_signs_7_0= ruleEmergencySign ) ) )* )
            {
            // InternalBmodParser.g:96:2: ( () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_rooms_2_0= ruleRoom ) ) | ( (lv_doors_3_0= ruleDoor ) ) | ( (lv_persons_4_0= rulePerson ) ) | ( (lv_exits_5_0= ruleExit ) ) | ( (lv_fires_6_0= ruleFire ) ) | ( (lv_signs_7_0= ruleEmergencySign ) ) )* )
            // InternalBmodParser.g:97:3: () ( (lv_imports_1_0= ruleImport ) )* ( ( (lv_rooms_2_0= ruleRoom ) ) | ( (lv_doors_3_0= ruleDoor ) ) | ( (lv_persons_4_0= rulePerson ) ) | ( (lv_exits_5_0= ruleExit ) ) | ( (lv_fires_6_0= ruleFire ) ) | ( (lv_signs_7_0= ruleEmergencySign ) ) )*
            {
            // InternalBmodParser.g:97:3: ()
            // InternalBmodParser.g:98:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloorplanAccess().getFloorplanAction_0(),
            					current);
            			

            }

            // InternalBmodParser.g:104:3: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Import) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBmodParser.g:105:4: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalBmodParser.g:105:4: (lv_imports_1_0= ruleImport )
            	    // InternalBmodParser.g:106:5: lv_imports_1_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getFloorplanAccess().getImportsImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"org.xtext.bmod.Bmod.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalBmodParser.g:123:3: ( ( (lv_rooms_2_0= ruleRoom ) ) | ( (lv_doors_3_0= ruleDoor ) ) | ( (lv_persons_4_0= rulePerson ) ) | ( (lv_exits_5_0= ruleExit ) ) | ( (lv_fires_6_0= ruleFire ) ) | ( (lv_signs_7_0= ruleEmergencySign ) ) )*
            loop2:
            do {
                int alt2=7;
                switch ( input.LA(1) ) {
                case Room:
                    {
                    alt2=1;
                    }
                    break;
                case Door:
                    {
                    alt2=2;
                    }
                    break;
                case Person:
                    {
                    alt2=3;
                    }
                    break;
                case Exit:
                    {
                    alt2=4;
                    }
                    break;
                case Fire:
                    {
                    alt2=5;
                    }
                    break;
                case EmergencySign:
                    {
                    alt2=6;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalBmodParser.g:124:4: ( (lv_rooms_2_0= ruleRoom ) )
            	    {
            	    // InternalBmodParser.g:124:4: ( (lv_rooms_2_0= ruleRoom ) )
            	    // InternalBmodParser.g:125:5: (lv_rooms_2_0= ruleRoom )
            	    {
            	    // InternalBmodParser.g:125:5: (lv_rooms_2_0= ruleRoom )
            	    // InternalBmodParser.g:126:6: lv_rooms_2_0= ruleRoom
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getRoomsRoomParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_rooms_2_0=ruleRoom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rooms",
            	    							lv_rooms_2_0,
            	    							"org.xtext.bmod.Bmod.Room");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBmodParser.g:144:4: ( (lv_doors_3_0= ruleDoor ) )
            	    {
            	    // InternalBmodParser.g:144:4: ( (lv_doors_3_0= ruleDoor ) )
            	    // InternalBmodParser.g:145:5: (lv_doors_3_0= ruleDoor )
            	    {
            	    // InternalBmodParser.g:145:5: (lv_doors_3_0= ruleDoor )
            	    // InternalBmodParser.g:146:6: lv_doors_3_0= ruleDoor
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getDoorsDoorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_doors_3_0=ruleDoor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"doors",
            	    							lv_doors_3_0,
            	    							"org.xtext.bmod.Bmod.Door");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBmodParser.g:164:4: ( (lv_persons_4_0= rulePerson ) )
            	    {
            	    // InternalBmodParser.g:164:4: ( (lv_persons_4_0= rulePerson ) )
            	    // InternalBmodParser.g:165:5: (lv_persons_4_0= rulePerson )
            	    {
            	    // InternalBmodParser.g:165:5: (lv_persons_4_0= rulePerson )
            	    // InternalBmodParser.g:166:6: lv_persons_4_0= rulePerson
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getPersonsPersonParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_persons_4_0=rulePerson();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"persons",
            	    							lv_persons_4_0,
            	    							"org.xtext.bmod.Bmod.Person");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBmodParser.g:184:4: ( (lv_exits_5_0= ruleExit ) )
            	    {
            	    // InternalBmodParser.g:184:4: ( (lv_exits_5_0= ruleExit ) )
            	    // InternalBmodParser.g:185:5: (lv_exits_5_0= ruleExit )
            	    {
            	    // InternalBmodParser.g:185:5: (lv_exits_5_0= ruleExit )
            	    // InternalBmodParser.g:186:6: lv_exits_5_0= ruleExit
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getExitsExitParserRuleCall_2_3_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_exits_5_0=ruleExit();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exits",
            	    							lv_exits_5_0,
            	    							"org.xtext.bmod.Bmod.Exit");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalBmodParser.g:204:4: ( (lv_fires_6_0= ruleFire ) )
            	    {
            	    // InternalBmodParser.g:204:4: ( (lv_fires_6_0= ruleFire ) )
            	    // InternalBmodParser.g:205:5: (lv_fires_6_0= ruleFire )
            	    {
            	    // InternalBmodParser.g:205:5: (lv_fires_6_0= ruleFire )
            	    // InternalBmodParser.g:206:6: lv_fires_6_0= ruleFire
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getFiresFireParserRuleCall_2_4_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_fires_6_0=ruleFire();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fires",
            	    							lv_fires_6_0,
            	    							"org.xtext.bmod.Bmod.Fire");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalBmodParser.g:224:4: ( (lv_signs_7_0= ruleEmergencySign ) )
            	    {
            	    // InternalBmodParser.g:224:4: ( (lv_signs_7_0= ruleEmergencySign ) )
            	    // InternalBmodParser.g:225:5: (lv_signs_7_0= ruleEmergencySign )
            	    {
            	    // InternalBmodParser.g:225:5: (lv_signs_7_0= ruleEmergencySign )
            	    // InternalBmodParser.g:226:6: lv_signs_7_0= ruleEmergencySign
            	    {

            	    						newCompositeNode(grammarAccess.getFloorplanAccess().getSignsEmergencySignParserRuleCall_2_5_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_signs_7_0=ruleEmergencySign();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorplanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"signs",
            	    							lv_signs_7_0,
            	    							"org.xtext.bmod.Bmod.EmergencySign");
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
    // $ANTLR end "ruleFloorplan"


    // $ANTLR start "entryRuleImport"
    // InternalBmodParser.g:248:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalBmodParser.g:248:47: (iv_ruleImport= ruleImport EOF )
            // InternalBmodParser.g:249:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalBmodParser.g:255:1: ruleImport returns [EObject current=null] : (otherlv_0= Import ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalBmodParser.g:261:2: ( (otherlv_0= Import ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalBmodParser.g:262:2: (otherlv_0= Import ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalBmodParser.g:262:2: (otherlv_0= Import ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalBmodParser.g:263:3: otherlv_0= Import ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Import,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalBmodParser.g:267:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalBmodParser.g:268:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalBmodParser.g:268:4: (lv_importURI_1_0= RULE_STRING )
            // InternalBmodParser.g:269:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleRoom"
    // InternalBmodParser.g:289:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalBmodParser.g:289:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalBmodParser.g:290:2: iv_ruleRoom= ruleRoom EOF
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
    // InternalBmodParser.g:296:1: ruleRoom returns [EObject current=null] : (otherlv_0= Room ( (lv_name_1_0= RULE_VARNAME ) ) ( ( (lv_hasCapacity_2_0= LeftSquareBracket ) ) ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket )? ( (lv_areas_5_0= ruleArea ) ) (otherlv_6= And ( (lv_areas_7_0= ruleArea ) ) )* ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_hasCapacity_2_0=null;
        Token lv_capacity_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_areas_5_0 = null;

        EObject lv_areas_7_0 = null;



        	enterRule();

        try {
            // InternalBmodParser.g:302:2: ( (otherlv_0= Room ( (lv_name_1_0= RULE_VARNAME ) ) ( ( (lv_hasCapacity_2_0= LeftSquareBracket ) ) ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket )? ( (lv_areas_5_0= ruleArea ) ) (otherlv_6= And ( (lv_areas_7_0= ruleArea ) ) )* ) )
            // InternalBmodParser.g:303:2: (otherlv_0= Room ( (lv_name_1_0= RULE_VARNAME ) ) ( ( (lv_hasCapacity_2_0= LeftSquareBracket ) ) ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket )? ( (lv_areas_5_0= ruleArea ) ) (otherlv_6= And ( (lv_areas_7_0= ruleArea ) ) )* )
            {
            // InternalBmodParser.g:303:2: (otherlv_0= Room ( (lv_name_1_0= RULE_VARNAME ) ) ( ( (lv_hasCapacity_2_0= LeftSquareBracket ) ) ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket )? ( (lv_areas_5_0= ruleArea ) ) (otherlv_6= And ( (lv_areas_7_0= ruleArea ) ) )* )
            // InternalBmodParser.g:304:3: otherlv_0= Room ( (lv_name_1_0= RULE_VARNAME ) ) ( ( (lv_hasCapacity_2_0= LeftSquareBracket ) ) ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket )? ( (lv_areas_5_0= ruleArea ) ) (otherlv_6= And ( (lv_areas_7_0= ruleArea ) ) )*
            {
            otherlv_0=(Token)match(input,Room,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalBmodParser.g:308:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmodParser.g:309:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmodParser.g:309:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmodParser.g:310:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_7); 

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

            // InternalBmodParser.g:326:3: ( ( (lv_hasCapacity_2_0= LeftSquareBracket ) ) ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==LeftSquareBracket) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBmodParser.g:327:4: ( (lv_hasCapacity_2_0= LeftSquareBracket ) ) ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= RightSquareBracket
                    {
                    // InternalBmodParser.g:327:4: ( (lv_hasCapacity_2_0= LeftSquareBracket ) )
                    // InternalBmodParser.g:328:5: (lv_hasCapacity_2_0= LeftSquareBracket )
                    {
                    // InternalBmodParser.g:328:5: (lv_hasCapacity_2_0= LeftSquareBracket )
                    // InternalBmodParser.g:329:6: lv_hasCapacity_2_0= LeftSquareBracket
                    {
                    lv_hasCapacity_2_0=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

                    						newLeafNode(lv_hasCapacity_2_0, grammarAccess.getRoomAccess().getHasCapacityLeftSquareBracketKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoomRule());
                    						}
                    						setWithLastConsumed(current, "hasCapacity", true, "[");
                    					

                    }


                    }

                    // InternalBmodParser.g:341:4: ( (lv_capacity_3_0= RULE_INT ) )
                    // InternalBmodParser.g:342:5: (lv_capacity_3_0= RULE_INT )
                    {
                    // InternalBmodParser.g:342:5: (lv_capacity_3_0= RULE_INT )
                    // InternalBmodParser.g:343:6: lv_capacity_3_0= RULE_INT
                    {
                    lv_capacity_3_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                    						newLeafNode(lv_capacity_3_0, grammarAccess.getRoomAccess().getCapacityINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoomRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"capacity",
                    							lv_capacity_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoomAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalBmodParser.g:364:3: ( (lv_areas_5_0= ruleArea ) )
            // InternalBmodParser.g:365:4: (lv_areas_5_0= ruleArea )
            {
            // InternalBmodParser.g:365:4: (lv_areas_5_0= ruleArea )
            // InternalBmodParser.g:366:5: lv_areas_5_0= ruleArea
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_areas_5_0=ruleArea();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					add(
            						current,
            						"areas",
            						lv_areas_5_0,
            						"org.xtext.bmod.Bmod.Area");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBmodParser.g:383:3: (otherlv_6= And ( (lv_areas_7_0= ruleArea ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==And) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBmodParser.g:384:4: otherlv_6= And ( (lv_areas_7_0= ruleArea ) )
            	    {
            	    otherlv_6=(Token)match(input,And,FOLLOW_7); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRoomAccess().getAndKeyword_4_0());
            	    			
            	    // InternalBmodParser.g:388:4: ( (lv_areas_7_0= ruleArea ) )
            	    // InternalBmodParser.g:389:5: (lv_areas_7_0= ruleArea )
            	    {
            	    // InternalBmodParser.g:389:5: (lv_areas_7_0= ruleArea )
            	    // InternalBmodParser.g:390:6: lv_areas_7_0= ruleArea
            	    {

            	    						newCompositeNode(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_areas_7_0=ruleArea();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRoomRule());
            	    						}
            	    						add(
            	    							current,
            	    							"areas",
            	    							lv_areas_7_0,
            	    							"org.xtext.bmod.Bmod.Area");
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
    // InternalBmodParser.g:412:1: entryRuleDoor returns [EObject current=null] : iv_ruleDoor= ruleDoor EOF ;
    public final EObject entryRuleDoor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoor = null;


        try {
            // InternalBmodParser.g:412:45: (iv_ruleDoor= ruleDoor EOF )
            // InternalBmodParser.g:413:2: iv_ruleDoor= ruleDoor EOF
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
    // InternalBmodParser.g:419:1: ruleDoor returns [EObject current=null] : (otherlv_0= Door ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= From ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= To ( (lv_to_5_0= ruleCoordinate ) ) ) ;
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
            // InternalBmodParser.g:425:2: ( (otherlv_0= Door ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= From ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= To ( (lv_to_5_0= ruleCoordinate ) ) ) )
            // InternalBmodParser.g:426:2: (otherlv_0= Door ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= From ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= To ( (lv_to_5_0= ruleCoordinate ) ) )
            {
            // InternalBmodParser.g:426:2: (otherlv_0= Door ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= From ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= To ( (lv_to_5_0= ruleCoordinate ) ) )
            // InternalBmodParser.g:427:3: otherlv_0= Door ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= From ( (lv_from_3_0= ruleCoordinate ) ) otherlv_4= To ( (lv_to_5_0= ruleCoordinate ) )
            {
            otherlv_0=(Token)match(input,Door,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDoorAccess().getDoorKeyword_0());
            		
            // InternalBmodParser.g:431:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmodParser.g:432:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmodParser.g:432:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmodParser.g:433:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,From,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDoorAccess().getFromKeyword_2());
            		
            // InternalBmodParser.g:453:3: ( (lv_from_3_0= ruleCoordinate ) )
            // InternalBmodParser.g:454:4: (lv_from_3_0= ruleCoordinate )
            {
            // InternalBmodParser.g:454:4: (lv_from_3_0= ruleCoordinate )
            // InternalBmodParser.g:455:5: lv_from_3_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getDoorAccess().getFromCoordinateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,To,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getDoorAccess().getToKeyword_4());
            		
            // InternalBmodParser.g:476:3: ( (lv_to_5_0= ruleCoordinate ) )
            // InternalBmodParser.g:477:4: (lv_to_5_0= ruleCoordinate )
            {
            // InternalBmodParser.g:477:4: (lv_to_5_0= ruleCoordinate )
            // InternalBmodParser.g:478:5: lv_to_5_0= ruleCoordinate
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
    // InternalBmodParser.g:499:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalBmodParser.g:499:47: (iv_rulePerson= rulePerson EOF )
            // InternalBmodParser.g:500:2: iv_rulePerson= rulePerson EOF
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
    // InternalBmodParser.g:506:1: rulePerson returns [EObject current=null] : (otherlv_0= Person ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= In ( (lv_location_3_0= ruleCoordinate ) ) otherlv_4= Colon ( (otherlv_5= RULE_VARNAME ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_location_3_0 = null;



        	enterRule();

        try {
            // InternalBmodParser.g:512:2: ( (otherlv_0= Person ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= In ( (lv_location_3_0= ruleCoordinate ) ) otherlv_4= Colon ( (otherlv_5= RULE_VARNAME ) ) ) )
            // InternalBmodParser.g:513:2: (otherlv_0= Person ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= In ( (lv_location_3_0= ruleCoordinate ) ) otherlv_4= Colon ( (otherlv_5= RULE_VARNAME ) ) )
            {
            // InternalBmodParser.g:513:2: (otherlv_0= Person ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= In ( (lv_location_3_0= ruleCoordinate ) ) otherlv_4= Colon ( (otherlv_5= RULE_VARNAME ) ) )
            // InternalBmodParser.g:514:3: otherlv_0= Person ( (lv_name_1_0= RULE_VARNAME ) ) otherlv_2= In ( (lv_location_3_0= ruleCoordinate ) ) otherlv_4= Colon ( (otherlv_5= RULE_VARNAME ) )
            {
            otherlv_0=(Token)match(input,Person,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalBmodParser.g:518:3: ( (lv_name_1_0= RULE_VARNAME ) )
            // InternalBmodParser.g:519:4: (lv_name_1_0= RULE_VARNAME )
            {
            // InternalBmodParser.g:519:4: (lv_name_1_0= RULE_VARNAME )
            // InternalBmodParser.g:520:5: lv_name_1_0= RULE_VARNAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARNAME,FOLLOW_14); 

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

            otherlv_2=(Token)match(input,In,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getInKeyword_2());
            		
            // InternalBmodParser.g:540:3: ( (lv_location_3_0= ruleCoordinate ) )
            // InternalBmodParser.g:541:4: (lv_location_3_0= ruleCoordinate )
            {
            // InternalBmodParser.g:541:4: (lv_location_3_0= ruleCoordinate )
            // InternalBmodParser.g:542:5: lv_location_3_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getLocationCoordinateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_4=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getColonKeyword_4());
            		
            // InternalBmodParser.g:563:3: ( (otherlv_5= RULE_VARNAME ) )
            // InternalBmodParser.g:564:4: (otherlv_5= RULE_VARNAME )
            {
            // InternalBmodParser.g:564:4: (otherlv_5= RULE_VARNAME )
            // InternalBmodParser.g:565:5: otherlv_5= RULE_VARNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_VARNAME,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getActionActionDescCrossReference_5_0());
            				

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
    // InternalBmodParser.g:580:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // InternalBmodParser.g:580:45: (iv_ruleExit= ruleExit EOF )
            // InternalBmodParser.g:581:2: iv_ruleExit= ruleExit EOF
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
    // InternalBmodParser.g:587:1: ruleExit returns [EObject current=null] : (otherlv_0= Exit otherlv_1= In ( (lv_location_2_0= ruleCoordinate ) ) ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_location_2_0 = null;



        	enterRule();

        try {
            // InternalBmodParser.g:593:2: ( (otherlv_0= Exit otherlv_1= In ( (lv_location_2_0= ruleCoordinate ) ) ) )
            // InternalBmodParser.g:594:2: (otherlv_0= Exit otherlv_1= In ( (lv_location_2_0= ruleCoordinate ) ) )
            {
            // InternalBmodParser.g:594:2: (otherlv_0= Exit otherlv_1= In ( (lv_location_2_0= ruleCoordinate ) ) )
            // InternalBmodParser.g:595:3: otherlv_0= Exit otherlv_1= In ( (lv_location_2_0= ruleCoordinate ) )
            {
            otherlv_0=(Token)match(input,Exit,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getExitAccess().getExitKeyword_0());
            		
            otherlv_1=(Token)match(input,In,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getExitAccess().getInKeyword_1());
            		
            // InternalBmodParser.g:603:3: ( (lv_location_2_0= ruleCoordinate ) )
            // InternalBmodParser.g:604:4: (lv_location_2_0= ruleCoordinate )
            {
            // InternalBmodParser.g:604:4: (lv_location_2_0= ruleCoordinate )
            // InternalBmodParser.g:605:5: lv_location_2_0= ruleCoordinate
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
    // InternalBmodParser.g:626:1: entryRuleFire returns [EObject current=null] : iv_ruleFire= ruleFire EOF ;
    public final EObject entryRuleFire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFire = null;


        try {
            // InternalBmodParser.g:626:45: (iv_ruleFire= ruleFire EOF )
            // InternalBmodParser.g:627:2: iv_ruleFire= ruleFire EOF
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
    // InternalBmodParser.g:633:1: ruleFire returns [EObject current=null] : (otherlv_0= Fire otherlv_1= In ( (lv_location_2_0= ruleCoordinate ) ) ) ;
    public final EObject ruleFire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_location_2_0 = null;



        	enterRule();

        try {
            // InternalBmodParser.g:639:2: ( (otherlv_0= Fire otherlv_1= In ( (lv_location_2_0= ruleCoordinate ) ) ) )
            // InternalBmodParser.g:640:2: (otherlv_0= Fire otherlv_1= In ( (lv_location_2_0= ruleCoordinate ) ) )
            {
            // InternalBmodParser.g:640:2: (otherlv_0= Fire otherlv_1= In ( (lv_location_2_0= ruleCoordinate ) ) )
            // InternalBmodParser.g:641:3: otherlv_0= Fire otherlv_1= In ( (lv_location_2_0= ruleCoordinate ) )
            {
            otherlv_0=(Token)match(input,Fire,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getFireAccess().getFireKeyword_0());
            		
            otherlv_1=(Token)match(input,In,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFireAccess().getInKeyword_1());
            		
            // InternalBmodParser.g:649:3: ( (lv_location_2_0= ruleCoordinate ) )
            // InternalBmodParser.g:650:4: (lv_location_2_0= ruleCoordinate )
            {
            // InternalBmodParser.g:650:4: (lv_location_2_0= ruleCoordinate )
            // InternalBmodParser.g:651:5: lv_location_2_0= ruleCoordinate
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
    // InternalBmodParser.g:672:1: entryRuleEmergencySign returns [EObject current=null] : iv_ruleEmergencySign= ruleEmergencySign EOF ;
    public final EObject entryRuleEmergencySign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmergencySign = null;


        try {
            // InternalBmodParser.g:672:54: (iv_ruleEmergencySign= ruleEmergencySign EOF )
            // InternalBmodParser.g:673:2: iv_ruleEmergencySign= ruleEmergencySign EOF
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
    // InternalBmodParser.g:679:1: ruleEmergencySign returns [EObject current=null] : (otherlv_0= EmergencySign otherlv_1= From ( (otherlv_2= RULE_VARNAME ) ) ( (lv_ref_3_0= ruleDoorRef ) ) ) ;
    public final EObject ruleEmergencySign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ref_3_0 = null;



        	enterRule();

        try {
            // InternalBmodParser.g:685:2: ( (otherlv_0= EmergencySign otherlv_1= From ( (otherlv_2= RULE_VARNAME ) ) ( (lv_ref_3_0= ruleDoorRef ) ) ) )
            // InternalBmodParser.g:686:2: (otherlv_0= EmergencySign otherlv_1= From ( (otherlv_2= RULE_VARNAME ) ) ( (lv_ref_3_0= ruleDoorRef ) ) )
            {
            // InternalBmodParser.g:686:2: (otherlv_0= EmergencySign otherlv_1= From ( (otherlv_2= RULE_VARNAME ) ) ( (lv_ref_3_0= ruleDoorRef ) ) )
            // InternalBmodParser.g:687:3: otherlv_0= EmergencySign otherlv_1= From ( (otherlv_2= RULE_VARNAME ) ) ( (lv_ref_3_0= ruleDoorRef ) )
            {
            otherlv_0=(Token)match(input,EmergencySign,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEmergencySignAccess().getEmergencySignKeyword_0());
            		
            otherlv_1=(Token)match(input,From,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEmergencySignAccess().getFromKeyword_1());
            		
            // InternalBmodParser.g:695:3: ( (otherlv_2= RULE_VARNAME ) )
            // InternalBmodParser.g:696:4: (otherlv_2= RULE_VARNAME )
            {
            // InternalBmodParser.g:696:4: (otherlv_2= RULE_VARNAME )
            // InternalBmodParser.g:697:5: otherlv_2= RULE_VARNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmergencySignRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_VARNAME,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getEmergencySignAccess().getFromDoorCrossReference_2_0());
            				

            }


            }

            // InternalBmodParser.g:708:3: ( (lv_ref_3_0= ruleDoorRef ) )
            // InternalBmodParser.g:709:4: (lv_ref_3_0= ruleDoorRef )
            {
            // InternalBmodParser.g:709:4: (lv_ref_3_0= ruleDoorRef )
            // InternalBmodParser.g:710:5: lv_ref_3_0= ruleDoorRef
            {

            					newCompositeNode(grammarAccess.getEmergencySignAccess().getRefDoorRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_ref_3_0=ruleDoorRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmergencySignRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_3_0,
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
    // InternalBmodParser.g:731:1: entryRuleDoorRef returns [EObject current=null] : iv_ruleDoorRef= ruleDoorRef EOF ;
    public final EObject entryRuleDoorRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoorRef = null;


        try {
            // InternalBmodParser.g:731:48: (iv_ruleDoorRef= ruleDoorRef EOF )
            // InternalBmodParser.g:732:2: iv_ruleDoorRef= ruleDoorRef EOF
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
    // InternalBmodParser.g:738:1: ruleDoorRef returns [EObject current=null] : (otherlv_0= To ( (otherlv_1= RULE_VARNAME ) ) ) ;
    public final EObject ruleDoorRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBmodParser.g:744:2: ( (otherlv_0= To ( (otherlv_1= RULE_VARNAME ) ) ) )
            // InternalBmodParser.g:745:2: (otherlv_0= To ( (otherlv_1= RULE_VARNAME ) ) )
            {
            // InternalBmodParser.g:745:2: (otherlv_0= To ( (otherlv_1= RULE_VARNAME ) ) )
            // InternalBmodParser.g:746:3: otherlv_0= To ( (otherlv_1= RULE_VARNAME ) )
            {
            otherlv_0=(Token)match(input,To,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDoorRefAccess().getToKeyword_0());
            		
            // InternalBmodParser.g:750:3: ( (otherlv_1= RULE_VARNAME ) )
            // InternalBmodParser.g:751:4: (otherlv_1= RULE_VARNAME )
            {
            // InternalBmodParser.g:751:4: (otherlv_1= RULE_VARNAME )
            // InternalBmodParser.g:752:5: otherlv_1= RULE_VARNAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoorRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_VARNAME,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getDoorRefAccess().getToDoorCrossReference_1_0());
            				

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


    // $ANTLR start "entryRuleCoordinate"
    // InternalBmodParser.g:767:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalBmodParser.g:767:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalBmodParser.g:768:2: iv_ruleCoordinate= ruleCoordinate EOF
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
    // InternalBmodParser.g:774:1: ruleCoordinate returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_x_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_y_3_0= RULE_INT ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBmodParser.g:780:2: ( (otherlv_0= LeftParenthesis ( (lv_x_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_y_3_0= RULE_INT ) ) otherlv_4= RightParenthesis ) )
            // InternalBmodParser.g:781:2: (otherlv_0= LeftParenthesis ( (lv_x_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_y_3_0= RULE_INT ) ) otherlv_4= RightParenthesis )
            {
            // InternalBmodParser.g:781:2: (otherlv_0= LeftParenthesis ( (lv_x_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_y_3_0= RULE_INT ) ) otherlv_4= RightParenthesis )
            // InternalBmodParser.g:782:3: otherlv_0= LeftParenthesis ( (lv_x_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_y_3_0= RULE_INT ) ) otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0());
            		
            // InternalBmodParser.g:786:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalBmodParser.g:787:4: (lv_x_1_0= RULE_INT )
            {
            // InternalBmodParser.g:787:4: (lv_x_1_0= RULE_INT )
            // InternalBmodParser.g:788:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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

            otherlv_2=(Token)match(input,Comma,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinateAccess().getCommaKeyword_2());
            		
            // InternalBmodParser.g:808:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalBmodParser.g:809:4: (lv_y_3_0= RULE_INT )
            {
            // InternalBmodParser.g:809:4: (lv_y_3_0= RULE_INT )
            // InternalBmodParser.g:810:5: lv_y_3_0= RULE_INT
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

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); 

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
    // InternalBmodParser.g:834:1: entryRuleArea returns [EObject current=null] : iv_ruleArea= ruleArea EOF ;
    public final EObject entryRuleArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArea = null;


        try {
            // InternalBmodParser.g:834:45: (iv_ruleArea= ruleArea EOF )
            // InternalBmodParser.g:835:2: iv_ruleArea= ruleArea EOF
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
    // InternalBmodParser.g:841:1: ruleArea returns [EObject current=null] : (otherlv_0= From ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= To ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= Without ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= Comma ( (lv_without_7_0= ruleCoordinate ) ) )* )? ) ;
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
            // InternalBmodParser.g:847:2: ( (otherlv_0= From ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= To ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= Without ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= Comma ( (lv_without_7_0= ruleCoordinate ) ) )* )? ) )
            // InternalBmodParser.g:848:2: (otherlv_0= From ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= To ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= Without ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= Comma ( (lv_without_7_0= ruleCoordinate ) ) )* )? )
            {
            // InternalBmodParser.g:848:2: (otherlv_0= From ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= To ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= Without ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= Comma ( (lv_without_7_0= ruleCoordinate ) ) )* )? )
            // InternalBmodParser.g:849:3: otherlv_0= From ( (lv_from_1_0= ruleCoordinate ) ) otherlv_2= To ( (lv_to_3_0= ruleCoordinate ) ) (otherlv_4= Without ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= Comma ( (lv_without_7_0= ruleCoordinate ) ) )* )?
            {
            otherlv_0=(Token)match(input,From,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAreaAccess().getFromKeyword_0());
            		
            // InternalBmodParser.g:853:3: ( (lv_from_1_0= ruleCoordinate ) )
            // InternalBmodParser.g:854:4: (lv_from_1_0= ruleCoordinate )
            {
            // InternalBmodParser.g:854:4: (lv_from_1_0= ruleCoordinate )
            // InternalBmodParser.g:855:5: lv_from_1_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getAreaAccess().getFromCoordinateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,To,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAreaAccess().getToKeyword_2());
            		
            // InternalBmodParser.g:876:3: ( (lv_to_3_0= ruleCoordinate ) )
            // InternalBmodParser.g:877:4: (lv_to_3_0= ruleCoordinate )
            {
            // InternalBmodParser.g:877:4: (lv_to_3_0= ruleCoordinate )
            // InternalBmodParser.g:878:5: lv_to_3_0= ruleCoordinate
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

            // InternalBmodParser.g:895:3: (otherlv_4= Without ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= Comma ( (lv_without_7_0= ruleCoordinate ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Without) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBmodParser.g:896:4: otherlv_4= Without ( (lv_without_5_0= ruleCoordinate ) ) (otherlv_6= Comma ( (lv_without_7_0= ruleCoordinate ) ) )*
                    {
                    otherlv_4=(Token)match(input,Without,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getAreaAccess().getWithoutKeyword_4_0());
                    			
                    // InternalBmodParser.g:900:4: ( (lv_without_5_0= ruleCoordinate ) )
                    // InternalBmodParser.g:901:5: (lv_without_5_0= ruleCoordinate )
                    {
                    // InternalBmodParser.g:901:5: (lv_without_5_0= ruleCoordinate )
                    // InternalBmodParser.g:902:6: lv_without_5_0= ruleCoordinate
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

                    // InternalBmodParser.g:919:4: (otherlv_6= Comma ( (lv_without_7_0= ruleCoordinate ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Comma) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBmodParser.g:920:5: otherlv_6= Comma ( (lv_without_7_0= ruleCoordinate ) )
                    	    {
                    	    otherlv_6=(Token)match(input,Comma,FOLLOW_12); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAreaAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalBmodParser.g:924:5: ( (lv_without_7_0= ruleCoordinate ) )
                    	    // InternalBmodParser.g:925:6: (lv_without_7_0= ruleCoordinate )
                    	    {
                    	    // InternalBmodParser.g:925:6: (lv_without_7_0= ruleCoordinate )
                    	    // InternalBmodParser.g:926:7: lv_without_7_0= ruleCoordinate
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000FD2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000F52L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040002L});

}