package com.test;

import org.junit.Test;

import pattern18.chain1.AbstractHandler;
import pattern18.chain1.HandlerA;
import pattern18.chain1.HandlerB;
import pattern18.chain1.HandlerInvalid;

/**
 * 链式责任链模式
 */

public class Test18ResponsibilityChain1 {

	@Test
	public void testChain() {
		AbstractHandler handler = new HandlerInvalid();
		handler.append(new HandlerA()).append(new HandlerB());
		System.out.println(handler.handleScore(100));
		System.out.println(handler.handleScore(50));
		System.out.println(handler.handleScore(0));
	}

}
