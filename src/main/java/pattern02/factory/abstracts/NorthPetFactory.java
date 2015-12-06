package pattern02.factory.abstracts;

/**
 * 北方宠物工厂
 */

public class NorthPetFactory implements ActionPetFactory {

	@Override
	public ActionPetCat petCatInstance() {
		return new NorthPetCat();
	}

	@Override
	public ActionPetDog petDogInstance() {
		return new NorthPetDog();
	}

}
