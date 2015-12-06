package com.test;

import org.junit.Test;

import pattern18.chain2.ActionHandlerChain;
import pattern18.chain2.HandlerA;
import pattern18.chain2.HandlerB;
import pattern18.chain2.HandlerInvalid;
import pattern18.chain2.ListHandlerChain;

/**
 * 集合责任链模式
 */

public class Test18ResponsibilityChain2 {

	@Test
	public void testChain() {
		ActionHandlerChain handlerChain = new ListHandlerChain();
		handlerChain.add(new HandlerInvalid());
		handlerChain.add(new HandlerA());
		handlerChain.add(new HandlerB());
		System.out.println(handlerChain.handleScore(100));
		System.out.println(handlerChain.handleScore(50));
		System.out.println(handlerChain.handleScore(0));
	}

}
