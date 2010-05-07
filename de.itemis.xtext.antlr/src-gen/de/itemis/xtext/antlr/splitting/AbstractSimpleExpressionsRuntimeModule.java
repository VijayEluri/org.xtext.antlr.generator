
/*
 * generated by Xtext
 */
package de.itemis.xtext.antlr.splitting;

import org.eclipse.xtext.Constants;
import org.eclipse.xtext.service.DefaultRuntimeModule;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Manual modifications go to {de.itemis.xtext.antlr.splitting.SimpleExpressionsRuntimeModule}
 */
 @SuppressWarnings("all")
public abstract class AbstractSimpleExpressionsRuntimeModule extends DefaultRuntimeModule {
	
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance(
			"de.itemis.xtext.antlr.splitting.SimpleExpressions");
		bindProperties(binder);
	}
	
	protected void bindProperties(Binder binder) {
		bindProperties(binder, "de/itemis/xtext/antlr/splitting/SimpleExpressions.properties");
	}
	
	
	// contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
	public Class<? extends org.eclipse.xtext.IGrammarAccess> bindIGrammarAccess() {
		return de.itemis.xtext.antlr.splitting.services.SimpleExpressionsGrammarAccess.class;
	}

	// contributed by org.eclipse.xtext.generator.parseTreeConstructor.ParseTreeConstructorFragment
	public Class<? extends org.eclipse.xtext.parsetree.reconstr.IParseTreeConstructor> bindIParseTreeConstructor() {
		return de.itemis.xtext.antlr.splitting.parseTreeConstruction.SimpleExpressionsParsetreeConstructor.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrParser> bindIAntlrParser() {
		return de.itemis.xtext.antlr.splitting.parser.antlr.SimpleExpressionsParser.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.ITokenToStringConverter> bindITokenToStringConverter() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return de.itemis.xtext.antlr.splitting.parser.antlr.SimpleExpressionsAntlrTokenFileProvider.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.Lexer> bindLexer() {
		return de.itemis.xtext.antlr.splitting.parser.antlr.internal.InternalSimpleExpressionsLexer.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public com.google.inject.Provider<de.itemis.xtext.antlr.splitting.parser.antlr.internal.InternalSimpleExpressionsLexer> provideInternalSimpleExpressionsLexer() {
		return org.eclipse.xtext.parser.antlr.LexerProvider.create(de.itemis.xtext.antlr.splitting.parser.antlr.internal.InternalSimpleExpressionsLexer.class);
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public void configureRuntimeLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME)).to(de.itemis.xtext.antlr.splitting.parser.antlr.internal.InternalSimpleExpressionsLexer.class);
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.ITokenDefProvider> bindITokenDefProvider() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.validation.JavaValidatorFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends de.itemis.xtext.antlr.splitting.validation.SimpleExpressionsJavaValidator> bindSimpleExpressionsJavaValidator() {
		return de.itemis.xtext.antlr.splitting.validation.SimpleExpressionsJavaValidator.class;
	}

	// contributed by org.eclipse.xtext.generator.formatting.FormatterFragment
	public Class<? extends org.eclipse.xtext.formatting.IFormatter> bindIFormatter() {
		return de.itemis.xtext.antlr.splitting.formatting.SimpleExpressionsFormatter.class;
	}

}
