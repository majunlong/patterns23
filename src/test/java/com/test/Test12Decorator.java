
package com.test;

import org.junit.Test;

import pattern12.decorator.Me;
import pattern12.decorator.OldMonk1;
import pattern12.decorator.OldMonk2;

/**
 * 装饰模式
 */

public class Test12Decorator {

	@Test
	public void testDecorator() {
		new OldMonk2(new OldMonk1(new Me(1), 2), 3).tellStory();
	}

}
