package pattern01.factory2.method;

/**
 * 宠物工厂接口
 */

public interface ActionPetFactory {

	/**
	 * 创建宠物实例
	 * 
	 * @return 宠物实例
	 */
	public ActionPet newInstance();

}
