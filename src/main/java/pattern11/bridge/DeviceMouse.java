package pattern11.bridge;

/**
 * 鼠标
 */

public class DeviceMouse implements ActionDevice {

	@Override
	public void work() {
		System.out.println("鼠标开始工作");
	}

}
