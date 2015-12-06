package pattern02.factory.abstracts;

/**
 * 南方宠物猫
 */

public class SouthPetCat implements ActionPetCat {

	@Override
	public void eat() {
		System.out.println("今天吃了一条南方鱼");
	}

}
