package pattern13.strategy;

/**
 * 普通会员
 */

public class MembersRegular implements ActionMembers {

	@Override
	public double discount(double price) {
		return price * 0.95;
	}

}
