package com.test;

import org.junit.Test;

import pattern21.visitor.ActionChildren;
import pattern21.visitor.ActionParents;
import pattern21.visitor.ChildrenDaughter;
import pattern21.visitor.ChildrenSon;
import pattern21.visitor.ParentsFather;
import pattern21.visitor.ParentsMother;
import pattern21.visitor.Phone;

/**
 * 访问者模式
 */

public class Test21Visitor {

	@Test
	public void test1Visitor() {
		ActionParents father = new ParentsFather();
		ActionParents mother = new ParentsMother();
		ActionChildren son = new ChildrenSon();
		ActionChildren daugther = new ChildrenDaughter();
		son.callParents(father);
		son.callParents(mother);
		System.out.println();
		daugther.callParents(father);
		daugther.callParents(mother);
	}

	@Test
	public void test2Visitor() {
		ActionParents father = new ParentsFather();
		ActionParents mother = new ParentsMother();
		ActionChildren son = new ChildrenSon();
		ActionChildren daugther = new ChildrenDaughter();
		Phone phone = new Phone();
		phone.add(son);
		phone.add(daugther);
		phone.call(father);
		System.out.println();
		phone.call(mother);
	}

}
