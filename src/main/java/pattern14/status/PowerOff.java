package pattern14.status;

/**
 * 断电状态
 */

public class PowerOff implements ActionPower {

	@Override
	public void press() {
		System.out.println("断电状态");
	}

}
