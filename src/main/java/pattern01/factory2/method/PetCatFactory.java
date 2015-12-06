package pattern01.factory2.method;

/**
 * 宠物猫工厂
 */

public class PetCatFactory implements ActionPetFactory {

	@Override
	public ActionPet newInstance() {
		return new PetCat();
	}

}
