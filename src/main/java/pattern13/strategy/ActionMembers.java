package pattern13.strategy;

/**
 * 会员接口
 */

public interface ActionMembers {

	/**
	 * 打折
	 * 
	 * @param price 原价
	 * @return 折扣价
	 */
	public double discount(double price);

}
