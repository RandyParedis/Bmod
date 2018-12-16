/**
 * @Generated
 */
package org.xtext.ha.web.module;

import org.dslforge.xtext.common.shared.SharedModule;
import com.google.inject.Binder;
import org.xtext.ha.web.contentassist.RulesProposalProvider;
import org.xtext.ha.web.contentassist.antlr.RulesParser;
import org.xtext.ha.web.contentassist.antlr.internal.InternalRulesLexer;
import org.dslforge.styledtext.jface.IContentAssistProcessor;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.LexerUIBindings;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;

public abstract class AbstractWebRulesRuntimeModule extends SharedModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.IContentAssistParser.class).to(RulesParser.class);
		binder.bind(InternalRulesLexer.class).toProvider(org.eclipse.xtext.parser.antlr.LexerProvider.create(InternalRulesLexer.class));
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer.class).annotatedWith(com.google.inject.name.Names.named(LexerUIBindings.CONTENT_ASSIST)).to(InternalRulesLexer.class);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider.class).to(RulesProposalProvider.class);
		binder.bind(IContentAssistProcessor.class).to(XtextContentAssistProcessor.class);
		binder.bind(ContentAssistContext.Factory.class).to(org.eclipse.xtext.ui.editor.contentassist.ParserBasedContentAssistContextFactory.class);
		binder.bind(org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher.class).to(org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher.IgnoreCase.class);
	}
}
