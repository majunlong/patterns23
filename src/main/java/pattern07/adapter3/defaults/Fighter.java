package pattern07.adapter3.defaults;

/**
 * 战斗机
 */

public class Fighter extends AbstractPlane {

	@Override
	public void fly() {
		System.out.println("战斗机可以飞");
	}

	@Override
	public void run() {
		System.out.println("战斗机可以跑");
	}

}
