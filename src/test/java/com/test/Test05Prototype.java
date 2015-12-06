package com.test;

import org.junit.Test;

import pattern05.prototype.User;

/**
 * 原型模式
 */

public class Test05Prototype {

	@Test
	public void testPrototype() {
		User user1 = new User("z3", "z3@qq.com", "z3@126.com");
		User user2 = user1.clone();
		user2.setUsername("l4");
		user1.getEmailList().add("z3@163.com");
		user2.getEmailList().add("l4@163.com");
		System.out.println(user1);
		System.out.println();
		System.out.println(user2);
	}

}
