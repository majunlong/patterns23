package pattern02.factory.abstracts;

/**
 * 北方宠物狗
 */

public class NorthPetDog implements ActionPetDog {

	@Override
	public void eat() {
		System.out.println("今天吃了一根北方骨头");
	}

}
