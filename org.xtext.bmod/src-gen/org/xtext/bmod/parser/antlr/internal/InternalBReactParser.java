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
import org.xtext.bmod.services.BReactGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBReactParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Farthest", "Burning", "Nearest", "Person", "Action", "Global", "Normal", "Shared", "First", "Cell", "Door", "Exit", "Fire", "Find", "From", "Last", "Colon", "Semicolon", "RULE_VARNAME", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Action=8;
    public static final int RULE_STRING=25;
    public static final int Shared=11;
    public static final int Global=9;
    public static final int RULE_SL_COMMENT=27;
    public static final int Farthest=4;
    public static final int Last=19;
    public static final int First=12;
    public static final int Colon=20;
    public static final int EOF=-1;
    public static final int Cell=13;
    public static final int Exit=15;
    public static final int RULE_VARNAME=22;
    public static final int RULE_ID=23;
    public static final int RULE_WS=28;
    public static final int From=18;
    public static final int RULE_ANY_OTHER=29;
    public static final int Normal=10;
    public static final int Door=14;
    public static final int Burning=5;
    public static final int Semicolon=21;
    public static final int Nearest=6;
    public static final int RULE_INT=24;
    public static final int Fire=16;
    public static final int Find=17;
    public static final int RULE_ML_COMMENT=26;
    public static final int Person=7;

    // delegates
    // delegators


        public InternalBReactParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBReactParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBReactParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBReactParser.g"; }



     	private BReactGrammarAccess grammarAccess;

        public InternalBReactParser(TokenStream input, BReactGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "React";
       	}

       	@Override
       	protected BReactGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleReact"
    // InternalBReactParser.g:58:1: entryRuleReact returns [EObject current=null] : iv_ruleReact= ruleReact EOF ;
    public final EObject entryRuleReact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReact = null;


        try {
            // InternalBReactParser.g:58:46: (iv_ruleReact= ruleReact EOF )
            // InternalBReactParser.g:59:2: iv_ruleReact= ruleReact EOF
            {
             newCompositeNode(grammarAccess.getReactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReact=ruleReact();

            state._fsp--;

             current =iv_ruleReact; 
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
    // $ANTLR end "entryRuleReact"


    // $ANTLR start "ruleReact"
    // InternalBReactParser.g:65:1: ruleReact returns [EObject current=null] : ( () ( (lv_actions_1_0= ruleActionDesc ) )* ) ;
    public final EObject ruleReact() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_1_0 = null;



        	enterRule();

        try {
            // InternalBReactParser.g:71:2: ( ( () ( (lv_actions_1_0= ruleActionDesc ) )* ) )
            // InternalBReactParser.g:72:2: ( () ( (lv_actions_1_0= ruleActionDesc ) )* )
            {
            // InternalBReactParser.g:72:2: ( () ( (lv_actions_1_0= ruleActionDesc ) )* )
            // InternalBReactParser.g:73:3: () ( (lv_actions_1_0= ruleActionDesc ) )*
            {
            // InternalBReactParser.g:73:3: ()
            // InternalBReactParser.g:74:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReactAccess().getReactAction_0(),
            					current);
            			

            }

            // InternalBReactParser.g:80:3: ( (lv_actions_1_0= ruleActionDesc ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Action||LA1_0==Shared) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBReactParser.g:81:4: (lv_actions_1_0= ruleActionDesc )
            	    {
            	    // InternalBReactParser.g:81:4: (lv_actions_1_0= ruleActionDesc )
            	    // InternalBReactParser.g:82:5: lv_actions_1_0= ruleActionDesc
            	    {

            	    					newCompositeNode(grammarAccess.getReactAccess().getActionsActionDescParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_actions_1_0=ruleActionDesc();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReactRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_1_0,
            	    						"org.xtext.bmod.BReact.ActionDesc");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleReact"


    // $ANTLR start "entryRuleActionDesc"
    // InternalBReactParser.g:103:1: entryRuleActionDesc returns [EObject current=null] : iv_ruleActionDesc= ruleActionDesc EOF ;
    public final EObject entryRuleActionDesc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDesc = null;


        try {
            // InternalBReactParser.g:103:51: (iv_ruleActionDesc= ruleActionDesc EOF )
            // InternalBReactParser.g:104:2: iv_ruleActionDesc= ruleActionDesc EOF
            {
             newCompositeNode(grammarAccess.getActionDescRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionDesc=ruleActionDesc();

            state._fsp--;

             current =iv_ruleActionDesc; 
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
    // $ANTLR end "entryRuleActionDesc"


    // $ANTLR start "ruleActionDesc"
    // InternalBReactParser.g:110:1: ruleActionDesc returns [EObject current=null] : ( ( (lv_shared_0_0= Shared ) )? otherlv_1= Action ( (lv_name_2_0= RULE_VARNAME ) ) otherlv_3= Colon ( (lv_finds_4_0= ruleFind ) )+ ) ;
    public final EObject ruleActionDesc() throws RecognitionException {
        EObject current = null;

        Token lv_shared_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_finds_4_0 = null;



        	enterRule();

        try {
            // InternalBReactParser.g:116:2: ( ( ( (lv_shared_0_0= Shared ) )? otherlv_1= Action ( (lv_name_2_0= RULE_VARNAME ) ) otherlv_3= Colon ( (lv_finds_4_0= ruleFind ) )+ ) )
            // InternalBReactParser.g:117:2: ( ( (lv_shared_0_0= Shared ) )? otherlv_1= Action ( (lv_name_2_0= RULE_VARNAME ) ) otherlv_3= Colon ( (lv_finds_4_0= ruleFind ) )+ )
            {
            // InternalBReactParser.g:117:2: ( ( (lv_shared_0_0= Shared ) )? otherlv_1= Action ( (lv_name_2_0= RULE_VARNAME ) ) otherlv_3= Colon ( (lv_finds_4_0= ruleFind ) )+ )
            // InternalBReactParser.g:118:3: ( (lv_shared_0_0= Shared ) )? otherlv_1= Action ( (lv_name_2_0= RULE_VARNAME ) ) otherlv_3= Colon ( (lv_finds_4_0= ruleFind ) )+
            {
            // InternalBReactParser.g:118:3: ( (lv_shared_0_0= Shared ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Shared) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBReactParser.g:119:4: (lv_shared_0_0= Shared )
                    {
                    // InternalBReactParser.g:119:4: (lv_shared_0_0= Shared )
                    // InternalBReactParser.g:120:5: lv_shared_0_0= Shared
                    {
                    lv_shared_0_0=(Token)match(input,Shared,FOLLOW_4); 

                    					newLeafNode(lv_shared_0_0, grammarAccess.getActionDescAccess().getSharedSharedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionDescRule());
                    					}
                    					setWithLastConsumed(current, "shared", true, "shared");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,Action,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getActionDescAccess().getActionKeyword_1());
            		
            // InternalBReactParser.g:136:3: ( (lv_name_2_0= RULE_VARNAME ) )
            // InternalBReactParser.g:137:4: (lv_name_2_0= RULE_VARNAME )
            {
            // InternalBReactParser.g:137:4: (lv_name_2_0= RULE_VARNAME )
            // InternalBReactParser.g:138:5: lv_name_2_0= RULE_VARNAME
            {
            lv_name_2_0=(Token)match(input,RULE_VARNAME,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getActionDescAccess().getNameVARNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionDescRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.bmod.BReact.VARNAME");
            				

            }


            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getActionDescAccess().getColonKeyword_3());
            		
            // InternalBReactParser.g:158:3: ( (lv_finds_4_0= ruleFind ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Global||LA3_0==Find) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBReactParser.g:159:4: (lv_finds_4_0= ruleFind )
            	    {
            	    // InternalBReactParser.g:159:4: (lv_finds_4_0= ruleFind )
            	    // InternalBReactParser.g:160:5: lv_finds_4_0= ruleFind
            	    {

            	    					newCompositeNode(grammarAccess.getActionDescAccess().getFindsFindParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_finds_4_0=ruleFind();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionDescRule());
            	    					}
            	    					add(
            	    						current,
            	    						"finds",
            	    						lv_finds_4_0,
            	    						"org.xtext.bmod.BReact.Find");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleActionDesc"


    // $ANTLR start "entryRuleFind"
    // InternalBReactParser.g:181:1: entryRuleFind returns [EObject current=null] : iv_ruleFind= ruleFind EOF ;
    public final EObject entryRuleFind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFind = null;


        try {
            // InternalBReactParser.g:181:45: (iv_ruleFind= ruleFind EOF )
            // InternalBReactParser.g:182:2: iv_ruleFind= ruleFind EOF
            {
             newCompositeNode(grammarAccess.getFindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFind=ruleFind();

            state._fsp--;

             current =iv_ruleFind; 
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
    // $ANTLR end "entryRuleFind"


    // $ANTLR start "ruleFind"
    // InternalBReactParser.g:188:1: ruleFind returns [EObject current=null] : ( ( (lv_global_0_0= Global ) )? otherlv_1= Find ( (lv_distance_2_0= ruleDistance ) ) ( (lv_from_3_0= From ) )? ( ( (lv_burning_4_0= Burning ) ) | ( (lv_normal_5_0= Normal ) ) )? ( (lv_locatable_6_0= ruleLocatable ) ) otherlv_7= Semicolon ) ;
    public final EObject ruleFind() throws RecognitionException {
        EObject current = null;

        Token lv_global_0_0=null;
        Token otherlv_1=null;
        Token lv_from_3_0=null;
        Token lv_burning_4_0=null;
        Token lv_normal_5_0=null;
        Token otherlv_7=null;
        Enumerator lv_distance_2_0 = null;

        Enumerator lv_locatable_6_0 = null;



        	enterRule();

        try {
            // InternalBReactParser.g:194:2: ( ( ( (lv_global_0_0= Global ) )? otherlv_1= Find ( (lv_distance_2_0= ruleDistance ) ) ( (lv_from_3_0= From ) )? ( ( (lv_burning_4_0= Burning ) ) | ( (lv_normal_5_0= Normal ) ) )? ( (lv_locatable_6_0= ruleLocatable ) ) otherlv_7= Semicolon ) )
            // InternalBReactParser.g:195:2: ( ( (lv_global_0_0= Global ) )? otherlv_1= Find ( (lv_distance_2_0= ruleDistance ) ) ( (lv_from_3_0= From ) )? ( ( (lv_burning_4_0= Burning ) ) | ( (lv_normal_5_0= Normal ) ) )? ( (lv_locatable_6_0= ruleLocatable ) ) otherlv_7= Semicolon )
            {
            // InternalBReactParser.g:195:2: ( ( (lv_global_0_0= Global ) )? otherlv_1= Find ( (lv_distance_2_0= ruleDistance ) ) ( (lv_from_3_0= From ) )? ( ( (lv_burning_4_0= Burning ) ) | ( (lv_normal_5_0= Normal ) ) )? ( (lv_locatable_6_0= ruleLocatable ) ) otherlv_7= Semicolon )
            // InternalBReactParser.g:196:3: ( (lv_global_0_0= Global ) )? otherlv_1= Find ( (lv_distance_2_0= ruleDistance ) ) ( (lv_from_3_0= From ) )? ( ( (lv_burning_4_0= Burning ) ) | ( (lv_normal_5_0= Normal ) ) )? ( (lv_locatable_6_0= ruleLocatable ) ) otherlv_7= Semicolon
            {
            // InternalBReactParser.g:196:3: ( (lv_global_0_0= Global ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Global) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBReactParser.g:197:4: (lv_global_0_0= Global )
                    {
                    // InternalBReactParser.g:197:4: (lv_global_0_0= Global )
                    // InternalBReactParser.g:198:5: lv_global_0_0= Global
                    {
                    lv_global_0_0=(Token)match(input,Global,FOLLOW_9); 

                    					newLeafNode(lv_global_0_0, grammarAccess.getFindAccess().getGlobalGlobalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFindRule());
                    					}
                    					setWithLastConsumed(current, "global", true, "global");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,Find,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getFindAccess().getFindKeyword_1());
            		
            // InternalBReactParser.g:214:3: ( (lv_distance_2_0= ruleDistance ) )
            // InternalBReactParser.g:215:4: (lv_distance_2_0= ruleDistance )
            {
            // InternalBReactParser.g:215:4: (lv_distance_2_0= ruleDistance )
            // InternalBReactParser.g:216:5: lv_distance_2_0= ruleDistance
            {

            					newCompositeNode(grammarAccess.getFindAccess().getDistanceDistanceEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_distance_2_0=ruleDistance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"org.xtext.bmod.BReact.Distance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBReactParser.g:233:3: ( (lv_from_3_0= From ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==From) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBReactParser.g:234:4: (lv_from_3_0= From )
                    {
                    // InternalBReactParser.g:234:4: (lv_from_3_0= From )
                    // InternalBReactParser.g:235:5: lv_from_3_0= From
                    {
                    lv_from_3_0=(Token)match(input,From,FOLLOW_11); 

                    					newLeafNode(lv_from_3_0, grammarAccess.getFindAccess().getFromFromKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFindRule());
                    					}
                    					setWithLastConsumed(current, "from", true, "from");
                    				

                    }


                    }
                    break;

            }

            // InternalBReactParser.g:247:3: ( ( (lv_burning_4_0= Burning ) ) | ( (lv_normal_5_0= Normal ) ) )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Burning) ) {
                alt6=1;
            }
            else if ( (LA6_0==Normal) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // InternalBReactParser.g:248:4: ( (lv_burning_4_0= Burning ) )
                    {
                    // InternalBReactParser.g:248:4: ( (lv_burning_4_0= Burning ) )
                    // InternalBReactParser.g:249:5: (lv_burning_4_0= Burning )
                    {
                    // InternalBReactParser.g:249:5: (lv_burning_4_0= Burning )
                    // InternalBReactParser.g:250:6: lv_burning_4_0= Burning
                    {
                    lv_burning_4_0=(Token)match(input,Burning,FOLLOW_11); 

                    						newLeafNode(lv_burning_4_0, grammarAccess.getFindAccess().getBurningBurningKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFindRule());
                    						}
                    						setWithLastConsumed(current, "burning", true, "burning");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBReactParser.g:263:4: ( (lv_normal_5_0= Normal ) )
                    {
                    // InternalBReactParser.g:263:4: ( (lv_normal_5_0= Normal ) )
                    // InternalBReactParser.g:264:5: (lv_normal_5_0= Normal )
                    {
                    // InternalBReactParser.g:264:5: (lv_normal_5_0= Normal )
                    // InternalBReactParser.g:265:6: lv_normal_5_0= Normal
                    {
                    lv_normal_5_0=(Token)match(input,Normal,FOLLOW_11); 

                    						newLeafNode(lv_normal_5_0, grammarAccess.getFindAccess().getNormalNormalKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFindRule());
                    						}
                    						setWithLastConsumed(current, "normal", true, "normal");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBReactParser.g:278:3: ( (lv_locatable_6_0= ruleLocatable ) )
            // InternalBReactParser.g:279:4: (lv_locatable_6_0= ruleLocatable )
            {
            // InternalBReactParser.g:279:4: (lv_locatable_6_0= ruleLocatable )
            // InternalBReactParser.g:280:5: lv_locatable_6_0= ruleLocatable
            {

            					newCompositeNode(grammarAccess.getFindAccess().getLocatableLocatableEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_locatable_6_0=ruleLocatable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindRule());
            					}
            					set(
            						current,
            						"locatable",
            						lv_locatable_6_0,
            						"org.xtext.bmod.BReact.Locatable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFindAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleFind"


    // $ANTLR start "ruleDistance"
    // InternalBReactParser.g:305:1: ruleDistance returns [Enumerator current=null] : ( (enumLiteral_0= Nearest ) | (enumLiteral_1= Farthest ) | (enumLiteral_2= First ) | (enumLiteral_3= Last ) ) ;
    public final Enumerator ruleDistance() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBReactParser.g:311:2: ( ( (enumLiteral_0= Nearest ) | (enumLiteral_1= Farthest ) | (enumLiteral_2= First ) | (enumLiteral_3= Last ) ) )
            // InternalBReactParser.g:312:2: ( (enumLiteral_0= Nearest ) | (enumLiteral_1= Farthest ) | (enumLiteral_2= First ) | (enumLiteral_3= Last ) )
            {
            // InternalBReactParser.g:312:2: ( (enumLiteral_0= Nearest ) | (enumLiteral_1= Farthest ) | (enumLiteral_2= First ) | (enumLiteral_3= Last ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case Nearest:
                {
                alt7=1;
                }
                break;
            case Farthest:
                {
                alt7=2;
                }
                break;
            case First:
                {
                alt7=3;
                }
                break;
            case Last:
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
                    // InternalBReactParser.g:313:3: (enumLiteral_0= Nearest )
                    {
                    // InternalBReactParser.g:313:3: (enumLiteral_0= Nearest )
                    // InternalBReactParser.g:314:4: enumLiteral_0= Nearest
                    {
                    enumLiteral_0=(Token)match(input,Nearest,FOLLOW_2); 

                    				current = grammarAccess.getDistanceAccess().getNearestEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDistanceAccess().getNearestEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBReactParser.g:321:3: (enumLiteral_1= Farthest )
                    {
                    // InternalBReactParser.g:321:3: (enumLiteral_1= Farthest )
                    // InternalBReactParser.g:322:4: enumLiteral_1= Farthest
                    {
                    enumLiteral_1=(Token)match(input,Farthest,FOLLOW_2); 

                    				current = grammarAccess.getDistanceAccess().getFarthestEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDistanceAccess().getFarthestEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBReactParser.g:329:3: (enumLiteral_2= First )
                    {
                    // InternalBReactParser.g:329:3: (enumLiteral_2= First )
                    // InternalBReactParser.g:330:4: enumLiteral_2= First
                    {
                    enumLiteral_2=(Token)match(input,First,FOLLOW_2); 

                    				current = grammarAccess.getDistanceAccess().getFirstEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDistanceAccess().getFirstEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBReactParser.g:337:3: (enumLiteral_3= Last )
                    {
                    // InternalBReactParser.g:337:3: (enumLiteral_3= Last )
                    // InternalBReactParser.g:338:4: enumLiteral_3= Last
                    {
                    enumLiteral_3=(Token)match(input,Last,FOLLOW_2); 

                    				current = grammarAccess.getDistanceAccess().getLastEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDistanceAccess().getLastEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleDistance"


    // $ANTLR start "ruleLocatable"
    // InternalBReactParser.g:348:1: ruleLocatable returns [Enumerator current=null] : ( (enumLiteral_0= Cell ) | (enumLiteral_1= Door ) | (enumLiteral_2= Exit ) | (enumLiteral_3= Fire ) | (enumLiteral_4= Person ) ) ;
    public final Enumerator ruleLocatable() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalBReactParser.g:354:2: ( ( (enumLiteral_0= Cell ) | (enumLiteral_1= Door ) | (enumLiteral_2= Exit ) | (enumLiteral_3= Fire ) | (enumLiteral_4= Person ) ) )
            // InternalBReactParser.g:355:2: ( (enumLiteral_0= Cell ) | (enumLiteral_1= Door ) | (enumLiteral_2= Exit ) | (enumLiteral_3= Fire ) | (enumLiteral_4= Person ) )
            {
            // InternalBReactParser.g:355:2: ( (enumLiteral_0= Cell ) | (enumLiteral_1= Door ) | (enumLiteral_2= Exit ) | (enumLiteral_3= Fire ) | (enumLiteral_4= Person ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case Cell:
                {
                alt8=1;
                }
                break;
            case Door:
                {
                alt8=2;
                }
                break;
            case Exit:
                {
                alt8=3;
                }
                break;
            case Fire:
                {
                alt8=4;
                }
                break;
            case Person:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBReactParser.g:356:3: (enumLiteral_0= Cell )
                    {
                    // InternalBReactParser.g:356:3: (enumLiteral_0= Cell )
                    // InternalBReactParser.g:357:4: enumLiteral_0= Cell
                    {
                    enumLiteral_0=(Token)match(input,Cell,FOLLOW_2); 

                    				current = grammarAccess.getLocatableAccess().getCellEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLocatableAccess().getCellEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBReactParser.g:364:3: (enumLiteral_1= Door )
                    {
                    // InternalBReactParser.g:364:3: (enumLiteral_1= Door )
                    // InternalBReactParser.g:365:4: enumLiteral_1= Door
                    {
                    enumLiteral_1=(Token)match(input,Door,FOLLOW_2); 

                    				current = grammarAccess.getLocatableAccess().getDoorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLocatableAccess().getDoorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBReactParser.g:372:3: (enumLiteral_2= Exit )
                    {
                    // InternalBReactParser.g:372:3: (enumLiteral_2= Exit )
                    // InternalBReactParser.g:373:4: enumLiteral_2= Exit
                    {
                    enumLiteral_2=(Token)match(input,Exit,FOLLOW_2); 

                    				current = grammarAccess.getLocatableAccess().getExitEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLocatableAccess().getExitEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBReactParser.g:380:3: (enumLiteral_3= Fire )
                    {
                    // InternalBReactParser.g:380:3: (enumLiteral_3= Fire )
                    // InternalBReactParser.g:381:4: enumLiteral_3= Fire
                    {
                    enumLiteral_3=(Token)match(input,Fire,FOLLOW_2); 

                    				current = grammarAccess.getLocatableAccess().getFireEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLocatableAccess().getFireEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBReactParser.g:388:3: (enumLiteral_4= Person )
                    {
                    // InternalBReactParser.g:388:3: (enumLiteral_4= Person )
                    // InternalBReactParser.g:389:4: enumLiteral_4= Person
                    {
                    enumLiteral_4=(Token)match(input,Person,FOLLOW_2); 

                    				current = grammarAccess.getLocatableAccess().getPersonEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLocatableAccess().getPersonEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleLocatable"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020202L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000081050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000005E4A0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});

}