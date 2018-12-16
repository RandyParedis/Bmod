/**
 * @Generated
 */
package org.xtext.ha.web.editor.widget;

import java.util.ArrayList;
import java.util.List;

import org.dslforge.styledtext.BasicText;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.RemoteObject;
import org.eclipse.swt.widgets.Composite;

public class Rules extends BasicText {
	
	private static final long serialVersionUID = 1L;
	
	private static final String REMOTE_TYPE = "org.xtext.ha.web.editor.widget.Rules";
	
	public Rules(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected RemoteObject createRemoteObject(Connection connection) {
		return connection.createRemoteObject(REMOTE_TYPE);
	}
	
	@Override 
	protected void setupClient() {
		super.setupClient();
		List<IPath> languageResources = new ArrayList<IPath>();
		languageResources.add(new Path("src-js/org/xtext/ha/web/ace/theme-rules.js"));
		languageResources.add(new Path("src-js/org/xtext/ha/web/ace/mode-rules.js"));
		languageResources.add(new Path("src-js/org/xtext/ha/web/ace/worker-rules.js"));
		languageResources.add(new Path("src-js/org/xtext/ha/web/ace/snippets/rules.js"));
		languageResources.add(new Path("src-js/org/xtext/ha/web/parser/antlr-all-min.js"));
		languageResources.add(new Path("src-js/org/xtext/ha/web/parser/RulesParser.js"));
		languageResources.add(new Path("src-js/org/xtext/ha/web/parser/RulesLexer.js"));
		registerJsResources(languageResources, getClassLoader());
		loadJsResources(languageResources);
	}

	@Override
	protected ClassLoader getClassLoader() {
		ClassLoader classLoader = Rules.class.getClassLoader();
		return classLoader;
	}
}
