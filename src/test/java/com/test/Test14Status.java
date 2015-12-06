package com.test;

import org.junit.Test;

import pattern14.status.Light;
import pattern14.status.PowerOn;

/**
 * 状态模式
 */

public class Test14Status {

	@Test
	public void testStatus() {
		Light light = new Light(5, new PowerOn());
		for (int i = 0; i < 10; i++) {
			light.work();
		}
	}

}
