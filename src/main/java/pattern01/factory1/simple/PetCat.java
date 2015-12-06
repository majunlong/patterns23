package pattern01.factory1.simple;

/**
 * 宠物猫
 */

public class PetCat implements ActionPet {

	@Override
	public void eat() {
		System.out.println("今天吃了一条鱼");
	}
	
}
