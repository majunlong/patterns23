package pattern07.adapter3.defaults;

/**
 * 抽象飞机
 */

public class AbstractPlane implements ActionPlane {

	@Override
	public void fly() {
		throw new UnsupportedOperationException("该对象不支持此操作");
	}

	@Override
	public void run() {
		throw new UnsupportedOperationException("该对象不支持此操作");
	}

}
