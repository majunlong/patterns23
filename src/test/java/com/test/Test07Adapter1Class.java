package com.test;

import org.junit.Test;

import pattern07.adapter1.classes.ActionPlan;
import pattern07.adapter1.classes.Fighter;

/**
 * 类适配模式
 */

public class Test07Adapter1Class {

	@Test
	public void testAdapter() {
		ActionPlan fighter = new Fighter();
		fighter.fly();
		fighter.run();
	}

}
