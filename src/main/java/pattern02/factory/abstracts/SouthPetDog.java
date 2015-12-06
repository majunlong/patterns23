package pattern02.factory.abstracts;

/**
 * 南方宠物狗
 */

public class SouthPetDog implements ActionPetDog {

	@Override
	public void eat() {
		System.out.println("今天吃了一根南方骨头");
	}

}
