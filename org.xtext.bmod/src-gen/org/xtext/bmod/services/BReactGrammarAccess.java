/*
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class BReactGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ReactElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.bmod.BReact.React");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cReactAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cActionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cActionsActionDescParserRuleCall_1_0 = (RuleCall)cActionsAssignment_1.eContents().get(0);
		
		//React:
		//	{React} actions+=ActionDesc*;
		@Override public ParserRule getRule() { return rule; }
		
		//{React} actions+=ActionDesc*
		public Group getGroup() { return cGroup; }
		
		//{React}
		public Action getReactAction_0() { return cReactAction_0; }
		
		//actions+=ActionDesc*
		public Assignment getActionsAssignment_1() { return cActionsAssignment_1; }
		
		//ActionDesc
		public RuleCall getActionsActionDescParserRuleCall_1_0() { return cActionsActionDescParserRuleCall_1_0; }
	}
	public class ActionDescElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.bmod.BReact.ActionDesc");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSharedAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cSharedSharedKeyword_0_0 = (Keyword)cSharedAssignment_0.eContents().get(0);
		private final Keyword cActionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameVARNAMETerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFindsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFindsFindParserRuleCall_4_0 = (RuleCall)cFindsAssignment_4.eContents().get(0);
		
		//ActionDesc:
		//	shared?='shared'? 'action' name=VARNAME ':'
		//	finds+=Find+;
		@Override public ParserRule getRule() { return rule; }
		
		//shared?='shared'? 'action' name=VARNAME ':' finds+=Find+
		public Group getGroup() { return cGroup; }
		
		//shared?='shared'?
		public Assignment getSharedAssignment_0() { return cSharedAssignment_0; }
		
		//'shared'
		public Keyword getSharedSharedKeyword_0_0() { return cSharedSharedKeyword_0_0; }
		
		//'action'
		public Keyword getActionKeyword_1() { return cActionKeyword_1; }
		
		//name=VARNAME
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//VARNAME
		public RuleCall getNameVARNAMETerminalRuleCall_2_0() { return cNameVARNAMETerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//finds+=Find+
		public Assignment getFindsAssignment_4() { return cFindsAssignment_4; }
		
		//Find
		public RuleCall getFindsFindParserRuleCall_4_0() { return cFindsFindParserRuleCall_4_0; }
	}
	public class FindElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.bmod.BReact.Find");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cGlobalAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cGlobalGlobalKeyword_0_0 = (Keyword)cGlobalAssignment_0.eContents().get(0);
		private final Keyword cFindKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDistanceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDistanceDistanceEnumRuleCall_2_0 = (RuleCall)cDistanceAssignment_2.eContents().get(0);
		private final Assignment cFromAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cFromFromKeyword_3_0 = (Keyword)cFromAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cBurningAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final Keyword cBurningBurningKeyword_4_0_0 = (Keyword)cBurningAssignment_4_0.eContents().get(0);
		private final Assignment cNormalAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final Keyword cNormalNormalKeyword_4_1_0 = (Keyword)cNormalAssignment_4_1.eContents().get(0);
		private final Assignment cLocatableAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cLocatableLocatableEnumRuleCall_5_0 = (RuleCall)cLocatableAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Find:
		//	global?='global'? 'find' distance=Distance from?='from'? (burning?='burning' | normal?='normal')? locatable=Locatable
		//	';';
		@Override public ParserRule getRule() { return rule; }
		
		//global?='global'? 'find' distance=Distance from?='from'? (burning?='burning' | normal?='normal')? locatable=Locatable
		//';'
		public Group getGroup() { return cGroup; }
		
		//global?='global'?
		public Assignment getGlobalAssignment_0() { return cGlobalAssignment_0; }
		
		//'global'
		public Keyword getGlobalGlobalKeyword_0_0() { return cGlobalGlobalKeyword_0_0; }
		
		//'find'
		public Keyword getFindKeyword_1() { return cFindKeyword_1; }
		
		//distance=Distance
		public Assignment getDistanceAssignment_2() { return cDistanceAssignment_2; }
		
		//Distance
		public RuleCall getDistanceDistanceEnumRuleCall_2_0() { return cDistanceDistanceEnumRuleCall_2_0; }
		
		//from?='from'?
		public Assignment getFromAssignment_3() { return cFromAssignment_3; }
		
		//'from'
		public Keyword getFromFromKeyword_3_0() { return cFromFromKeyword_3_0; }
		
		//(burning?='burning' | normal?='normal')?
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//burning?='burning'
		public Assignment getBurningAssignment_4_0() { return cBurningAssignment_4_0; }
		
		//'burning'
		public Keyword getBurningBurningKeyword_4_0_0() { return cBurningBurningKeyword_4_0_0; }
		
		//normal?='normal'
		public Assignment getNormalAssignment_4_1() { return cNormalAssignment_4_1; }
		
		//'normal'
		public Keyword getNormalNormalKeyword_4_1_0() { return cNormalNormalKeyword_4_1_0; }
		
		//locatable=Locatable
		public Assignment getLocatableAssignment_5() { return cLocatableAssignment_5; }
		
		//Locatable
		public RuleCall getLocatableLocatableEnumRuleCall_5_0() { return cLocatableLocatableEnumRuleCall_5_0; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	
	public class DistanceElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.bmod.BReact.Distance");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNearestEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNearestNearestKeyword_0_0 = (Keyword)cNearestEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFarthestEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFarthestFarthestKeyword_1_0 = (Keyword)cFarthestEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cFirstEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cFirstFirstKeyword_2_0 = (Keyword)cFirstEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cLastEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cLastLastKeyword_3_0 = (Keyword)cLastEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Distance:
		//	nearest | farthest | first | last;
		public EnumRule getRule() { return rule; }
		
		//nearest | farthest | first | last
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//nearest
		public EnumLiteralDeclaration getNearestEnumLiteralDeclaration_0() { return cNearestEnumLiteralDeclaration_0; }
		
		//'nearest'
		public Keyword getNearestNearestKeyword_0_0() { return cNearestNearestKeyword_0_0; }
		
		//farthest
		public EnumLiteralDeclaration getFarthestEnumLiteralDeclaration_1() { return cFarthestEnumLiteralDeclaration_1; }
		
		//'farthest'
		public Keyword getFarthestFarthestKeyword_1_0() { return cFarthestFarthestKeyword_1_0; }
		
		//first
		public EnumLiteralDeclaration getFirstEnumLiteralDeclaration_2() { return cFirstEnumLiteralDeclaration_2; }
		
		//'first'
		public Keyword getFirstFirstKeyword_2_0() { return cFirstFirstKeyword_2_0; }
		
		//last
		public EnumLiteralDeclaration getLastEnumLiteralDeclaration_3() { return cLastEnumLiteralDeclaration_3; }
		
		//'last'
		public Keyword getLastLastKeyword_3_0() { return cLastLastKeyword_3_0; }
	}
	public class LocatableElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.bmod.BReact.Locatable");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCellEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCellCellKeyword_0_0 = (Keyword)cCellEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDoorEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDoorDoorKeyword_1_0 = (Keyword)cDoorEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cExitEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cExitExitKeyword_2_0 = (Keyword)cExitEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cFireEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cFireFireKeyword_3_0 = (Keyword)cFireEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cPersonEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cPersonPersonKeyword_4_0 = (Keyword)cPersonEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum Locatable:
		//	Cell | Door | Exit | Fire | Person;
		public EnumRule getRule() { return rule; }
		
		//Cell | Door | Exit | Fire | Person
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Cell
		public EnumLiteralDeclaration getCellEnumLiteralDeclaration_0() { return cCellEnumLiteralDeclaration_0; }
		
		//'Cell'
		public Keyword getCellCellKeyword_0_0() { return cCellCellKeyword_0_0; }
		
		//Door
		public EnumLiteralDeclaration getDoorEnumLiteralDeclaration_1() { return cDoorEnumLiteralDeclaration_1; }
		
		//'Door'
		public Keyword getDoorDoorKeyword_1_0() { return cDoorDoorKeyword_1_0; }
		
		//Exit
		public EnumLiteralDeclaration getExitEnumLiteralDeclaration_2() { return cExitEnumLiteralDeclaration_2; }
		
		//'Exit'
		public Keyword getExitExitKeyword_2_0() { return cExitExitKeyword_2_0; }
		
		//Fire
		public EnumLiteralDeclaration getFireEnumLiteralDeclaration_3() { return cFireEnumLiteralDeclaration_3; }
		
		//'Fire'
		public Keyword getFireFireKeyword_3_0() { return cFireFireKeyword_3_0; }
		
		//Person
		public EnumLiteralDeclaration getPersonEnumLiteralDeclaration_4() { return cPersonEnumLiteralDeclaration_4; }
		
		//'Person'
		public Keyword getPersonPersonKeyword_4_0() { return cPersonPersonKeyword_4_0; }
	}
	
	private final ReactElements pReact;
	private final ActionDescElements pActionDesc;
	private final FindElements pFind;
	private final DistanceElements eDistance;
	private final LocatableElements eLocatable;
	private final TerminalRule tVARNAME;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BReactGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pReact = new ReactElements();
		this.pActionDesc = new ActionDescElements();
		this.pFind = new FindElements();
		this.eDistance = new DistanceElements();
		this.eLocatable = new LocatableElements();
		this.tVARNAME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.bmod.BReact.VARNAME");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.bmod.BReact".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//React:
	//	{React} actions+=ActionDesc*;
	public ReactElements getReactAccess() {
		return pReact;
	}
	
	public ParserRule getReactRule() {
		return getReactAccess().getRule();
	}
	
	//ActionDesc:
	//	shared?='shared'? 'action' name=VARNAME ':'
	//	finds+=Find+;
	public ActionDescElements getActionDescAccess() {
		return pActionDesc;
	}
	
	public ParserRule getActionDescRule() {
		return getActionDescAccess().getRule();
	}
	
	//Find:
	//	global?='global'? 'find' distance=Distance from?='from'? (burning?='burning' | normal?='normal')? locatable=Locatable
	//	';';
	public FindElements getFindAccess() {
		return pFind;
	}
	
	public ParserRule getFindRule() {
		return getFindAccess().getRule();
	}
	
	//enum Distance:
	//	nearest | farthest | first | last;
	public DistanceElements getDistanceAccess() {
		return eDistance;
	}
	
	public EnumRule getDistanceRule() {
		return getDistanceAccess().getRule();
	}
	
	//enum Locatable:
	//	Cell | Door | Exit | Fire | Person;
	public LocatableElements getLocatableAccess() {
		return eLocatable;
	}
	
	public EnumRule getLocatableRule() {
		return getLocatableAccess().getRule();
	}
	
	//terminal VARNAME:
	//	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getVARNAMERule() {
		return tVARNAME;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
