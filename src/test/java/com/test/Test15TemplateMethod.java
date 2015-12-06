package com.test;

import org.junit.Test;

import pattern15.template.method.Author;

/**
 * 模板方法模式
 */

public class Test15TemplateMethod {

	@Test
	public void testTemplateMethod() {
		Author author = new Author();
		author.signature();
	}

}
