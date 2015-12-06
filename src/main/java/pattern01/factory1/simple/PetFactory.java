package pattern01.factory1.simple;

/**
 * 宠物工厂
 */

public class PetFactory {

	/**
	 * 创建宠物实例
	 * 
	 * @param type 宠物实例全类名
	 * @return 宠物实例
	 */
	public static ActionPet newInstance(String type) {
		if ("PetCat".equals(type)) {
			return new PetCat();
		} else if ("PetDog".equals(type)) {
			return new PetDog();
		}
		throw new IllegalArgumentException(type + " : 找不到以此为依据相关联的类");
	}

}
