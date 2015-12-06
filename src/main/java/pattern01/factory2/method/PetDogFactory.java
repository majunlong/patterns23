package pattern01.factory2.method;

/**
 * 宠物狗工厂
 */

public class PetDogFactory implements ActionPetFactory {

	@Override
	public ActionPet newInstance() {
		return new PetDog();
	}

}
