package pattern01.factory1.simple;

/**
 * 宠物狗
 */

public class PetDog implements ActionPet {

	@Override
	public void eat() {
		System.out.println("今天吃了一根骨头");
	}

}
