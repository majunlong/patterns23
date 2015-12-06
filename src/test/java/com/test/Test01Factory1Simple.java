package com.test;

import org.junit.Test;

import pattern01.factory1.simple.ActionPet;
import pattern01.factory1.simple.PetFactory;

/**
 * 简单工厂模式
 */

public class Test01Factory1Simple {

	@Test
	public void testFactory() {
		ActionPet cat = PetFactory.newInstance("PetCat");
		ActionPet dog = PetFactory.newInstance("PetDog");
		cat.eat();
		System.out.println();
		dog.eat();
	}

}
