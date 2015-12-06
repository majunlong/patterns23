package com.test;

import org.junit.Test;

import pattern06.flyweight.FilmType;
import pattern06.flyweight.FilmTypeRepository;

/**
 * 享元模式
 */

public class Test06Flyweight {

	@Test
	public void testFlyweight() {
		FilmType type1 = FilmTypeRepository.get("动作");
		FilmType type2 = FilmTypeRepository.get("战争");
		FilmType type3 = FilmTypeRepository.get("科幻");
		FilmType type4 = FilmTypeRepository.get("动作");
		FilmType type5 = FilmTypeRepository.get("战争");
		FilmType type6 = FilmTypeRepository.get("科幻");
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		System.out.println(type4);
		System.out.println(type5);
		System.out.println(type6);
		System.out.println("电影类型存储库容量：" + FilmTypeRepository.size());
	}

}
