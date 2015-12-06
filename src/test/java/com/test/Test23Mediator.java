package com.test;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import pattern23.mediator.CustomerA;
import pattern23.mediator.CustomerB;
import pattern23.mediator.Mediator;

/**
 * 中介者模式
 */

public class Test23Mediator {

	private CustomerA customerA;
	private CustomerB customerB;

	@Before
	public void init() {
		Mediator mediator = new Mediator();
		this.customerA = new CustomerA(mediator);
		this.customerB = new CustomerB(mediator);
		mediator.setCustomerA(this.customerA);
		mediator.setCustomerB(this.customerB);
		this.customerA.setNames(new ArrayList<String>());
		this.customerA.getNames().add("张三");
		this.customerA.getNames().add("李四");
		this.customerA.getNames().add("王五");
		this.customerB.setNameList(new ArrayList<String>());
		this.customerB.getNameList().add("张3");
		this.customerB.getNameList().add("李4");
		this.customerB.getNameList().add("王五");
	}

	@Test
	public void testMediator1() {
		this.customerA.requestService();
	}

	@Test
	public void testMediator2() {
		this.customerB.requestService();
	}

}
