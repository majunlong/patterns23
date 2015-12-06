package com.test;

import org.junit.Test;

import pattern03.singleton1.eager.Leader;

/**
 * 立即加载单例模式
 */

public class Test03Singleton1Eager {

	@Test
	public void testSingleton() {
		if (Leader.isLoading()) {
			System.out.println(Leader.get() == Leader.get());
		}
	}

}
