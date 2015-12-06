package com.test;

import org.junit.Test;

import pattern07.adapter2.objects.ActionPlan;
import pattern07.adapter2.objects.Fighter;
import pattern07.adapter2.objects.Helicopter;

/**
 * 对象适配模式
 */

public class Test07Adapter2Object {

	@Test
	public void testAdapter() {
		ActionPlan fighter = new Fighter(new Helicopter());
		fighter.fly();
		fighter.run();
	}

}
