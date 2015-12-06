package pattern04.builder;

/**
 * 石屋建造者
 */

public class StoneHouseBuilder implements ActionHouseBuilder {

	@Override
	public void buildFloor(House house) {
		System.out.println("建造石屋地板");
		house.setFloor("石屋地板");
	}

	@Override
	public void buildWall(House house) {
		System.out.println("建造石屋墙壁");
		house.setWall("石屋墙壁");
	}

	@Override
	public void buildRoof(House house) {
		System.out.println("建造石屋屋顶");
		house.setRoof("石屋屋顶");
	}

}
