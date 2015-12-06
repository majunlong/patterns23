package pattern07.adapter3.defaults;

/**
 * 直升机
 */

public class Helicopter extends AbstractPlane {

	public void fly() {
		System.out.println("直升机只能飞");
	}

}
