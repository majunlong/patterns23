package pattern11.bridge;

/**
 * 键盘
 */

public class DeviceKeyboard implements ActionDevice {

	@Override
	public void work() {
		System.out.println("键盘开始工作");
	}

}
