package pattern07.adapter2.objects;

/**
 * 战斗机
 */

public class Fighter implements ActionPlan {

	private Helicopter helicopter;

	public Fighter(Helicopter helicopter) {
		this.helicopter = helicopter;
	}

	@Override
	public void fly() {
		this.helicopter.fly();
	}

	@Override
	public void run() {
		System.out.println("可以跑的飞机");
	}

}
