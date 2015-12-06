package com.test;

import org.junit.Test;

import pattern13.strategy.Invoicer;
import pattern13.strategy.MembersRegular;
import pattern13.strategy.MembersVIP;

/**
 * 策略模式
 */

public class Test13Strategy {

	@Test
	public void testStrategy() {
		Invoicer invoicer = new Invoicer(100);
		invoicer.setDiscountStrategy(new MembersRegular());
		double price1 = invoicer.quote();
		invoicer.setDiscountStrategy(new MembersVIP());
		double price2 = invoicer.quote();
		System.out.println("普通会员折扣价：" + price1);
		System.out.println();
		System.out.println("VIP会员折扣价：" + price2);
	}

}
