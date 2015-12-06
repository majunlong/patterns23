package com.test;

import org.junit.Test;

import pattern17.iterator.Iterator;
import pattern17.iterator.List;
import pattern17.iterator.ListArray;

/**
 * 迭代模式
 */

public class Test17Iterator {

	@Test
	public void testIterator() {
		String[] names = new String[] { "张三", "李四", "王五", "赵六" };
		List<String> list = new ListArray<String>(names);
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println("\n");
		while (iterator.hasPrevious()) {
			System.out.print(iterator.previous() + "\t");
		}
	}

}
