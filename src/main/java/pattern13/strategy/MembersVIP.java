package pattern13.strategy;

/**
 * VIP会员
 */

public class MembersVIP implements ActionMembers {

	@Override
	public double discount(double price) {
		return price * 0.8;
	}

}
