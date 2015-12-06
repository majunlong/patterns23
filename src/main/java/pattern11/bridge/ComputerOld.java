package pattern11.bridge;

/**
 * 旧电脑
 */

public class ComputerOld extends AbstractComputer {

	public ComputerOld(ActionDevice device) {
		super(device);
	}

	@Override
	protected void drive() {
		System.out.println("旧电脑开始驱动设备");
	}

}
