package com.test;

import org.junit.Test;

import pattern01.factory2.method.ActionPet;
import pattern01.factory2.method.ActionPetFactory;
import pattern01.factory2.method.PetCatFactory;
import pattern01.factory2.method.PetDogFactory;

/**
 * 方法工厂模式
 */

public class Test01Factory2Method {

	@Test
	public void testFactory() {
		ActionPetFactory catFactory = new PetCatFactory();
		ActionPetFactory dogFactory = new PetDogFactory();
		ActionPet cat = catFactory.newInstance();
		ActionPet dog = dogFactory.newInstance();
		cat.eat();
		System.out.println();
		dog.eat();
	}

}
