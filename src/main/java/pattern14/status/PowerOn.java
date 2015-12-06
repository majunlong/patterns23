package pattern14.status;

/**
 * 通电状态
 */

public class PowerOn implements ActionPower {

	@Override
	public void press() {
		System.out.println("通电状态");
	}

}
