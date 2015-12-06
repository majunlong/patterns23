package com.test;

import org.junit.Test;

import pattern09.facade.PC;

/**
 * 外观模式
 */

public class Test09Facade {

	@Test
	public void testFacade() {
		PC pc = new PC();
		pc.startup();
		System.out.println();
		pc.shutdown();
	}

}
