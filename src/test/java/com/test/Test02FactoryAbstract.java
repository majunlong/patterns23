package com.test;

import org.junit.Test;

import pattern02.factory.abstracts.ActionPetCat;
import pattern02.factory.abstracts.ActionPetDog;
import pattern02.factory.abstracts.ActionPetFactory;
import pattern02.factory.abstracts.NorthPetFactory;
import pattern02.factory.abstracts.SouthPetFactory;

/**
 * 抽象工厂模式
 */

public class Test02FactoryAbstract {

	@Test
	public void testFactory() {
		ActionPetFactory northPetFactory = new NorthPetFactory();
		ActionPetFactory southPetFactory = new SouthPetFactory();
		ActionPetCat northCat = northPetFactory.petCatInstance();
		ActionPetCat southCat = southPetFactory.petCatInstance();
		ActionPetDog northDog = northPetFactory.petDogInstance();
		ActionPetDog southDog = southPetFactory.petDogInstance();
		northCat.eat();
		southCat.eat();
		System.out.println();
		northDog.eat();
		southDog.eat();
	}

}
