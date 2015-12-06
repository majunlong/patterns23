package pattern02.factory.abstracts;

/**
 * 南方宠物工厂
 */

public class SouthPetFactory implements ActionPetFactory {

	@Override
	public ActionPetCat petCatInstance() {
		return new SouthPetCat();
	}

	@Override
	public ActionPetDog petDogInstance() {
		return new SouthPetDog();
	}

}
