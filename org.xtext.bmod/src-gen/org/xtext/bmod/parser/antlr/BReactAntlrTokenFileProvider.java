/*
 * generated by Xtext 2.16.0
 */
package org.xtext.bmod.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BReactAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/bmod/parser/antlr/internal/InternalBReactParser.tokens");
	}
}