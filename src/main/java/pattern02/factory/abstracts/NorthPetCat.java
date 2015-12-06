package pattern02.factory.abstracts;

/**
 * 北方宠物猫
 */

public class NorthPetCat implements ActionPetCat {

	@Override
	public void eat() {
		System.out.println("今天吃了一条北方鱼");
	}

}
