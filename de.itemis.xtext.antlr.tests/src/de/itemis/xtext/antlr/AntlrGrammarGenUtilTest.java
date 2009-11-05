/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.itemis.xtext.antlr;

import de.itemis.xtext.antlr.AntlrGrammarGenUtil;
import junit.framework.TestCase;


/**
 * @author Heiko Behrens - Initial contribution and API
 */
public class AntlrGrammarGenUtilTest extends TestCase {

	public void testToAntlrString() throws Exception {
		assertEquals("a\\'b\\u00D6", AntlrGrammarGenUtil.toAntlrString("a'b�"));
	}

	public void testToAntlrStringIgnoreCaseSimple() throws Exception {
		assertEquals("('A'|'a')", AntlrGrammarGenUtil.toAntlrStringIgnoreCase("a"));
		assertEquals("('A'|'a')", AntlrGrammarGenUtil.toAntlrStringIgnoreCase("A"));
		assertEquals("('A'|'a')('B'|'b')", AntlrGrammarGenUtil.toAntlrStringIgnoreCase("ab"));
		assertEquals("('A'|'a')('B'|'b')", AntlrGrammarGenUtil.toAntlrStringIgnoreCase("aB"));
		assertEquals("('A'|'a')('B'|'b')", AntlrGrammarGenUtil.toAntlrStringIgnoreCase("Ab"));
		assertEquals("('A'|'a')('B'|'b')", AntlrGrammarGenUtil.toAntlrStringIgnoreCase("AB"));
	}
	
	public void testToAntlrStringIgnoreCaseUmlauts() throws Exception {
		assertEquals("\u00D6", "�");
		assertEquals("\u00F6", "�");
		assertEquals("('\\u00D6'|'\\u00F6')", AntlrGrammarGenUtil.toAntlrStringIgnoreCase("�"));
	}
	
	public void testToAntlrStringIgnoreNoCases() throws Exception {
		assertEquals("\u00DF", "�");
		//I know, eszett will have a dedicated uppercase version in future.
		//But for now...
		assertEquals(Character.toLowerCase('�'), Character.toUpperCase('�'));
		
		assertEquals("('A'|'a')'\\u00DF'('C'|'c')", AntlrGrammarGenUtil.toAntlrStringIgnoreCase("A�C"));
		assertEquals("('A'|'a')'\\u00DF''\\u00DF'('C'|'c')", AntlrGrammarGenUtil.toAntlrStringIgnoreCase("A��C"));
	}
	
	
}
