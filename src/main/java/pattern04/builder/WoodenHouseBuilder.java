package pattern04.builder;

/**
 * 木屋建造者
 */

public class WoodenHouseBuilder implements ActionHouseBuilder {

	@Override
	public void buildFloor(House house) {
		System.out.println("建造木屋地板");
		house.setFloor("木屋地板");
	}

	@Override
	public void buildWall(House house) {
		System.out.println("建造木屋墙壁");
		house.setWall("木屋墙壁");
	}

	@Override
	public void buildRoof(House house) {
		System.out.println("建造木屋屋顶");
		house.setRoof("木屋屋顶");
	}

}
