/*
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.bmod.parser.antlr.internal.InternalBReactParser;
import org.xtext.bmod.services.BReactGrammarAccess;

public class BReactParser extends AbstractAntlrParser {

	@Inject
	private BReactGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBReactParser createParser(XtextTokenStream stream) {
		return new InternalBReactParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "React";
	}

	public BReactGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BReactGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
