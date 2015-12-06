package pattern11.bridge;

/**
 * 抽象电脑
 */

public abstract class AbstractComputer {

	private ActionDevice device;

	public AbstractComputer(ActionDevice device) {
		this.device = device;
	}

	/**
	 * 驱动设备
	 */
	protected abstract void drive();

	/**
	 * 工作
	 */
	public void work() {
		this.drive();
		this.device.work();
	}

}
