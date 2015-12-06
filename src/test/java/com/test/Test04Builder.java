package com.test;

import org.junit.Test;

import pattern04.builder.House;
import pattern04.builder.HouseBuilderDirector;
import pattern04.builder.StoneHouseBuilder;
import pattern04.builder.WoodenHouseBuilder;

/**
 * 建造者模式
 */

public class Test04Builder {

	@Test
	public void testBuilder() {
		House stoneHouse = HouseBuilderDirector.guide(new StoneHouseBuilder());
		System.out.println(stoneHouse);

		System.out.println();

		House woodenHouse = HouseBuilderDirector.guide(new WoodenHouseBuilder());
		System.out.println(woodenHouse);
	}

}
