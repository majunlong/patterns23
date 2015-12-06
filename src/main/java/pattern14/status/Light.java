package pattern14.status;

/**
 * 电灯
 */

public class Light {

	private int workTimeLength;
	private int tempWorkTimeLength = 0;
	private ActionPower power;
	private ActionPower tempPower;

	public Light(int workTimeLength, ActionPower power) {
		this.workTimeLength = workTimeLength + 1;
		this.power = power;
		this.tempPower = power;
	}

	/**
	 * 工作
	 */
	public void work() {
		if (this.tempPower != null) {
			this.tempPower.press();
			this.tempPower = null;
		}
		if (this.tempWorkTimeLength > 0 && this.tempWorkTimeLength < this.workTimeLength) {
			System.out.println("电灯工作了" + this.tempWorkTimeLength + "分钟");
		} else if (this.tempWorkTimeLength == this.workTimeLength) {
			this.power = new PowerOff();
			this.tempPower = this.power;
		}
		this.tempWorkTimeLength += 1;
	}

}
