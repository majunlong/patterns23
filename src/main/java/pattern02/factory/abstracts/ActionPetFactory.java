package pattern02.factory.abstracts;

/**
 * 宠物工厂接口
 */

public interface ActionPetFactory {

	/**
	 * 创建宠物猫实例
	 * 
	 * @return 宠物猫实例
	 */
	public ActionPetCat petCatInstance();

	/**
	 * 创建宠物狗实例
	 * 
	 * @return 宠物狗实例
	 */
	public ActionPetDog petDogInstance();

}
