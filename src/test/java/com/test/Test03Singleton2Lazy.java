package com.test;

import org.junit.Test;

import pattern03.singleton2.lazy.Leader;

/**
 * 延迟加载单例模式
 */

public class Test03Singleton2Lazy {

	@Test
	public void testSingleton() {
		Leader.load();
		if (Leader.isLoading()) {
			System.out.println(Leader.load() == Leader.load());
		}
	}

}
