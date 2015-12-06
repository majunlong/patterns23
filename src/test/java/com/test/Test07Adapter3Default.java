package com.test;

import org.junit.Test;

import pattern07.adapter3.defaults.ActionPlane;
import pattern07.adapter3.defaults.Fighter;
import pattern07.adapter3.defaults.Helicopter;

/**
 * 缺省适配模式
 */

public class Test07Adapter3Default {

	@Test
	public void testAdapter() {
		ActionPlane fighter = new Fighter();
		ActionPlane helicopter = new Helicopter();
		fighter.fly();
		fighter.run();
		System.out.println();
		helicopter.fly();
		helicopter.run();
	}

}
