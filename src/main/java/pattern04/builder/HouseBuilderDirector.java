package pattern04.builder;

/**
 * 房子建造者导演
 */

public class HouseBuilderDirector {

	/**
	 * 指导建造者
	 * 
	 * @param builder 房子建造者
	 * @return 房子
	 */
	public static House guide(ActionHouseBuilder builder) {
		House house = new House();
		builder.buildFloor(house);
		builder.buildWall(house);
		builder.buildRoof(house);
		return house;
	}

}
