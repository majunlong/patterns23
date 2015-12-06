package pattern07.adapter1.classes;

/**
 * 战斗机
 */

public class Fighter extends Helicopter implements ActionPlan {

	@Override
	public void run() {
		System.out.println("可以跑的飞机");
	}

}
