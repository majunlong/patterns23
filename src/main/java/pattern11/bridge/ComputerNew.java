package pattern11.bridge;

/**
 * 新电脑
 */

public class ComputerNew extends AbstractComputer {

	public ComputerNew(ActionDevice device) {
		super(device);
	}

	@Override
	protected void drive() {
		System.out.println("新电脑开始驱动设备");
	}

}
