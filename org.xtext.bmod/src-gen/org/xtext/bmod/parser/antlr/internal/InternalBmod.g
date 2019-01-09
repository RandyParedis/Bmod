/*
 * generated by Xtext 2.16.0
 */
grammar InternalBmod;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.bmod.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getModelAccess().getFloorplanParserRuleCall());
	}
	this_Floorplan_0=ruleFloorplan
	{
		$current = $this_Floorplan_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleFloorplan
entryRuleFloorplan returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFloorplanRule()); }
	iv_ruleFloorplan=ruleFloorplan
	{ $current=$iv_ruleFloorplan.current; }
	EOF;

// Rule Floorplan
ruleFloorplan returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFloorplanAccess().getFloorplanAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFloorplanAccess().getPerceptionsPerceptionLevelParserRuleCall_1_0_0());
					}
					lv_perceptions_1_0=rulePerceptionLevel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFloorplanRule());
						}
						add(
							$current,
							"perceptions",
							lv_perceptions_1_0,
							"org.xtext.bmod.Bmod.PerceptionLevel");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFloorplanAccess().getActionsActionProfileParserRuleCall_1_1_0());
					}
					lv_actions_2_0=ruleActionProfile
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFloorplanRule());
						}
						add(
							$current,
							"actions",
							lv_actions_2_0,
							"org.xtext.bmod.Bmod.ActionProfile");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFloorplanAccess().getRoomsRoomParserRuleCall_1_2_0());
					}
					lv_rooms_3_0=ruleRoom
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFloorplanRule());
						}
						add(
							$current,
							"rooms",
							lv_rooms_3_0,
							"org.xtext.bmod.Bmod.Room");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFloorplanAccess().getDoorsDoorParserRuleCall_1_3_0());
					}
					lv_doors_4_0=ruleDoor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFloorplanRule());
						}
						add(
							$current,
							"doors",
							lv_doors_4_0,
							"org.xtext.bmod.Bmod.Door");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFloorplanAccess().getPersonsPersonParserRuleCall_1_4_0());
					}
					lv_persons_5_0=rulePerson
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFloorplanRule());
						}
						add(
							$current,
							"persons",
							lv_persons_5_0,
							"org.xtext.bmod.Bmod.Person");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFloorplanAccess().getExitsExitParserRuleCall_1_5_0());
					}
					lv_exits_6_0=ruleExit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFloorplanRule());
						}
						add(
							$current,
							"exits",
							lv_exits_6_0,
							"org.xtext.bmod.Bmod.Exit");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFloorplanAccess().getFiresFireParserRuleCall_1_6_0());
					}
					lv_fires_7_0=ruleFire
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFloorplanRule());
						}
						add(
							$current,
							"fires",
							lv_fires_7_0,
							"org.xtext.bmod.Bmod.Fire");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFloorplanAccess().getSignsEmergencySignParserRuleCall_1_7_0());
					}
					lv_signs_8_0=ruleEmergencySign
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFloorplanRule());
						}
						add(
							$current,
							"signs",
							lv_signs_8_0,
							"org.xtext.bmod.Bmod.EmergencySign");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFloorplanAccess().getDanconsDangerousConditionParserRuleCall_1_8_0());
					}
					lv_dancons_9_0=ruleDangerousCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFloorplanRule());
						}
						add(
							$current,
							"dancons",
							lv_dancons_9_0,
							"org.xtext.bmod.Bmod.DangerousCondition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleRoom
entryRuleRoom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoomRule()); }
	iv_ruleRoom=ruleRoom
	{ $current=$iv_ruleRoom.current; }
	EOF;

// Rule Room
ruleRoom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Room'
		{
			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_VARNAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRoomAccess().getNameVARNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRoomRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.bmod.Bmod.VARNAME");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_2_0());
				}
				lv_areas_2_0=ruleArea
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRoomRule());
					}
					add(
						$current,
						"areas",
						lv_areas_2_0,
						"org.xtext.bmod.Bmod.Area");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='and'
			{
				newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getAndKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRoomAccess().getAreasAreaParserRuleCall_3_1_0());
					}
					lv_areas_4_0=ruleArea
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRoomRule());
						}
						add(
							$current,
							"areas",
							lv_areas_4_0,
							"org.xtext.bmod.Bmod.Area");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleDoor
entryRuleDoor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDoorRule()); }
	iv_ruleDoor=ruleDoor
	{ $current=$iv_ruleDoor.current; }
	EOF;

// Rule Door
ruleDoor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Door'
		{
			newLeafNode(otherlv_0, grammarAccess.getDoorAccess().getDoorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_VARNAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDoorAccess().getNameVARNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDoorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.bmod.Bmod.VARNAME");
				}
			)
		)
		otherlv_2='from'
		{
			newLeafNode(otherlv_2, grammarAccess.getDoorAccess().getFromKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDoorAccess().getFromCoordinateParserRuleCall_3_0());
				}
				lv_from_3_0=ruleCoordinate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDoorRule());
					}
					set(
						$current,
						"from",
						lv_from_3_0,
						"org.xtext.bmod.Bmod.Coordinate");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='to'
		{
			newLeafNode(otherlv_4, grammarAccess.getDoorAccess().getToKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDoorAccess().getToCoordinateParserRuleCall_5_0());
				}
				lv_to_5_0=ruleCoordinate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDoorRule());
					}
					set(
						$current,
						"to",
						lv_to_5_0,
						"org.xtext.bmod.Bmod.Coordinate");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePerception
entryRulePerception returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPerceptionRule()); }
	iv_rulePerception=rulePerception
	{ $current=$iv_rulePerception.current; }
	EOF;

// Rule Perception
rulePerception returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPerceptionAccess().getExistingPerceptionEnumEnumRuleCall_0_0());
				}
				lv_existing_0_0=rulePerceptionEnum
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPerceptionRule());
					}
					set(
						$current,
						"existing",
						lv_existing_0_0,
						"org.xtext.bmod.Bmod.PerceptionEnum");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPerceptionRule());
					}
				}
				otherlv_1=RULE_VARNAME
				{
					newLeafNode(otherlv_1, grammarAccess.getPerceptionAccess().getCustomPerceptionLevelCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getActionAccess().getExistingActionEnumEnumRuleCall_0_0());
				}
				lv_existing_0_0=ruleActionEnum
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionRule());
					}
					set(
						$current,
						"existing",
						lv_existing_0_0,
						"org.xtext.bmod.Bmod.ActionEnum");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionRule());
					}
				}
				otherlv_1=RULE_VARNAME
				{
					newLeafNode(otherlv_1, grammarAccess.getActionAccess().getCustomActionProfileCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRulePerceptionLevel
entryRulePerceptionLevel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPerceptionLevelRule()); }
	iv_rulePerceptionLevel=rulePerceptionLevel
	{ $current=$iv_rulePerceptionLevel.current; }
	EOF;

// Rule PerceptionLevel
rulePerceptionLevel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='PerceptionLevel'
		{
			newLeafNode(otherlv_0, grammarAccess.getPerceptionLevelAccess().getPerceptionLevelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_VARNAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPerceptionLevelAccess().getNameVARNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPerceptionLevelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.bmod.Bmod.VARNAME");
				}
			)
		)
	)
;

// Entry rule entryRuleActionProfile
entryRuleActionProfile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionProfileRule()); }
	iv_ruleActionProfile=ruleActionProfile
	{ $current=$iv_ruleActionProfile.current; }
	EOF;

// Rule ActionProfile
ruleActionProfile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ActionProfile'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionProfileAccess().getActionProfileKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_VARNAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getActionProfileAccess().getNameVARNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionProfileRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.bmod.Bmod.VARNAME");
				}
			)
		)
	)
;

// Entry rule entryRulePerson
entryRulePerson returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPersonRule()); }
	iv_rulePerson=rulePerson
	{ $current=$iv_rulePerson.current; }
	EOF;

// Rule Person
rulePerson returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Person'
		{
			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_VARNAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameVARNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPersonRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.bmod.Bmod.VARNAME");
				}
			)
		)
		otherlv_2='in'
		{
			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getInKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPersonAccess().getLocationCoordinateParserRuleCall_3_0());
				}
				lv_location_3_0=ruleCoordinate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPersonRule());
					}
					set(
						$current,
						"location",
						lv_location_3_0,
						"org.xtext.bmod.Bmod.Coordinate");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getColonKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPersonAccess().getPerceptionPerceptionParserRuleCall_5_0());
				}
				lv_perception_5_0=rulePerception
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPersonRule());
					}
					set(
						$current,
						"perception",
						lv_perception_5_0,
						"org.xtext.bmod.Bmod.Perception");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=','
		{
			newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getCommaKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPersonAccess().getActionActionParserRuleCall_7_0());
				}
				lv_action_7_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPersonRule());
					}
					set(
						$current,
						"action",
						lv_action_7_0,
						"org.xtext.bmod.Bmod.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExit
entryRuleExit returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExitRule()); }
	iv_ruleExit=ruleExit
	{ $current=$iv_ruleExit.current; }
	EOF;

// Rule Exit
ruleExit returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Exit'
		{
			newLeafNode(otherlv_0, grammarAccess.getExitAccess().getExitKeyword_0());
		}
		otherlv_1='in'
		{
			newLeafNode(otherlv_1, grammarAccess.getExitAccess().getInKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExitAccess().getLocationCoordinateParserRuleCall_2_0());
				}
				lv_location_2_0=ruleCoordinate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExitRule());
					}
					set(
						$current,
						"location",
						lv_location_2_0,
						"org.xtext.bmod.Bmod.Coordinate");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFire
entryRuleFire returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFireRule()); }
	iv_ruleFire=ruleFire
	{ $current=$iv_ruleFire.current; }
	EOF;

// Rule Fire
ruleFire returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Fire'
		{
			newLeafNode(otherlv_0, grammarAccess.getFireAccess().getFireKeyword_0());
		}
		otherlv_1='in'
		{
			newLeafNode(otherlv_1, grammarAccess.getFireAccess().getInKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFireAccess().getLocationCoordinateParserRuleCall_2_0());
				}
				lv_location_2_0=ruleCoordinate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFireRule());
					}
					set(
						$current,
						"location",
						lv_location_2_0,
						"org.xtext.bmod.Bmod.Coordinate");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEmergencySign
entryRuleEmergencySign returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEmergencySignRule()); }
	iv_ruleEmergencySign=ruleEmergencySign
	{ $current=$iv_ruleEmergencySign.current; }
	EOF;

// Rule EmergencySign
ruleEmergencySign returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Sign'
		{
			newLeafNode(otherlv_0, grammarAccess.getEmergencySignAccess().getSignKeyword_0());
		}
		otherlv_1='on'
		{
			newLeafNode(otherlv_1, grammarAccess.getEmergencySignAccess().getOnKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEmergencySignRule());
					}
				}
				otherlv_2=RULE_VARNAME
				{
					newLeafNode(otherlv_2, grammarAccess.getEmergencySignAccess().getOnDoorCrossReference_2_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEmergencySignAccess().getToDoorRefParserRuleCall_3_0());
				}
				lv_to_3_0=ruleDoorRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEmergencySignRule());
					}
					set(
						$current,
						"to",
						lv_to_3_0,
						"org.xtext.bmod.Bmod.DoorRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDoorRef
entryRuleDoorRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDoorRefRule()); }
	iv_ruleDoorRef=ruleDoorRef
	{ $current=$iv_ruleDoorRef.current; }
	EOF;

// Rule DoorRef
ruleDoorRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='to'
		{
			newLeafNode(otherlv_0, grammarAccess.getDoorRefAccess().getToKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDoorRefRule());
					}
				}
				otherlv_1=RULE_VARNAME
				{
					newLeafNode(otherlv_1, grammarAccess.getDoorRefAccess().getRefDoorCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleDangerousCondition
entryRuleDangerousCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDangerousConditionRule()); }
	iv_ruleDangerousCondition=ruleDangerousCondition
	{ $current=$iv_ruleDangerousCondition.current; }
	EOF;

// Rule DangerousCondition
ruleDangerousCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Condition'
		{
			newLeafNode(otherlv_0, grammarAccess.getDangerousConditionAccess().getConditionKeyword_0());
		}
		otherlv_1='on'
		{
			newLeafNode(otherlv_1, grammarAccess.getDangerousConditionAccess().getOnKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDangerousConditionRule());
					}
				}
				otherlv_2=RULE_VARNAME
				{
					newLeafNode(otherlv_2, grammarAccess.getDangerousConditionAccess().getOnRoomCrossReference_2_0());
				}
			)
		)
		(
			(
				lv_amount_3_0=RULE_INT
				{
					newLeafNode(lv_amount_3_0, grammarAccess.getDangerousConditionAccess().getAmountINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDangerousConditionRule());
					}
					setWithLastConsumed(
						$current,
						"amount",
						lv_amount_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleCoordinate
entryRuleCoordinate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoordinateRule()); }
	iv_ruleCoordinate=ruleCoordinate
	{ $current=$iv_ruleCoordinate.current; }
	EOF;

// Rule Coordinate
ruleCoordinate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				lv_x_1_0=RULE_INT
				{
					newLeafNode(lv_x_1_0, grammarAccess.getCoordinateAccess().getXINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinateRule());
					}
					setWithLastConsumed(
						$current,
						"x",
						lv_x_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getCoordinateAccess().getCommaKeyword_2());
		}
		(
			(
				lv_y_3_0=RULE_INT
				{
					newLeafNode(lv_y_3_0, grammarAccess.getCoordinateAccess().getYINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoordinateRule());
					}
					setWithLastConsumed(
						$current,
						"y",
						lv_y_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleArea
entryRuleArea returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAreaRule()); }
	iv_ruleArea=ruleArea
	{ $current=$iv_ruleArea.current; }
	EOF;

// Rule Area
ruleArea returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='from'
		{
			newLeafNode(otherlv_0, grammarAccess.getAreaAccess().getFromKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAreaAccess().getFromCoordinateParserRuleCall_1_0());
				}
				lv_from_1_0=ruleCoordinate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAreaRule());
					}
					set(
						$current,
						"from",
						lv_from_1_0,
						"org.xtext.bmod.Bmod.Coordinate");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='to'
		{
			newLeafNode(otherlv_2, grammarAccess.getAreaAccess().getToKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAreaAccess().getToCoordinateParserRuleCall_3_0());
				}
				lv_to_3_0=ruleCoordinate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAreaRule());
					}
					set(
						$current,
						"to",
						lv_to_3_0,
						"org.xtext.bmod.Bmod.Coordinate");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='without'
			{
				newLeafNode(otherlv_4, grammarAccess.getAreaAccess().getWithoutKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_1_0());
					}
					lv_without_5_0=ruleCoordinate
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAreaRule());
						}
						add(
							$current,
							"without",
							lv_without_5_0,
							"org.xtext.bmod.Bmod.Coordinate");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getAreaAccess().getCommaKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAreaAccess().getWithoutCoordinateParserRuleCall_4_2_1_0());
						}
						lv_without_7_0=ruleCoordinate
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAreaRule());
							}
							add(
								$current,
								"without",
								lv_without_7_0,
								"org.xtext.bmod.Bmod.Coordinate");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Rule PerceptionEnum
rulePerceptionEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='attentive'
			{
				$current = grammarAccess.getPerceptionEnumAccess().getAttentiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPerceptionEnumAccess().getAttentiveEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='relaxed'
			{
				$current = grammarAccess.getPerceptionEnumAccess().getRelaxedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPerceptionEnumAccess().getRelaxedEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='optimistic'
			{
				$current = grammarAccess.getPerceptionEnumAccess().getOptimisticEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getPerceptionEnumAccess().getOptimisticEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='sceptic'
			{
				$current = grammarAccess.getPerceptionEnumAccess().getScepticEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getPerceptionEnumAccess().getScepticEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule ActionEnum
ruleActionEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='newcomer'
			{
				$current = grammarAccess.getActionEnumAccess().getNewcomerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActionEnumAccess().getNewcomerEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='experienced'
			{
				$current = grammarAccess.getActionEnumAccess().getExperiencedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getActionEnumAccess().getExperiencedEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='panic'
			{
				$current = grammarAccess.getActionEnumAccess().getPanicEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getActionEnumAccess().getPanicEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_VARNAME : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
