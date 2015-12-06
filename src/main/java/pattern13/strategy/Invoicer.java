package pattern13.strategy;

/**
 * 结算人
 */

public class Invoicer {

	private double price;
	private ActionMembers members;

	public Invoicer(double price) {
		this.price = price;
	}

	public void setDiscountStrategy(ActionMembers discount) {
		this.members = discount;
	}

	/**
	 * 报价
	 * 
	 * @return 折扣价
	 */
	
	public double quote() {
		double price = this.members.discount(this.price);
		return price;
	}

}
