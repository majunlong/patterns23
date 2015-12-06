package pattern04.builder;

/**
 * 房子建造者接口
 */

public interface ActionHouseBuilder {

	/**
	 * 建造地板
	 * 
	 * @param house 房子
	 */
	public void buildFloor(House house);

	/**
	 * 建造墙壁
	 * 
	 * @param house 房子
	 */
	public void buildWall(House house);

	/**
	 * 建造屋顶
	 * 
	 * @param house 房子
	 */
	public void buildRoof(House house);

}
