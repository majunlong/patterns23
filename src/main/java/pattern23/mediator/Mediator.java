package pattern23.mediator;

import java.util.List;

/**
 * 中介者
 */

public class Mediator implements ActionMediator {

	private CustomerA customerA;
	private CustomerB customerB;

	public void setCustomerA(CustomerA cumstomerA) {
		this.customerA = cumstomerA;
	}

	public void setCustomerB(CustomerB customerB) {
		this.customerB = customerB;
	}

	@Override
	public void service(AbstractCustomer customer) {
		if (customer instanceof CustomerA) {
			CustomerA customerA = (CustomerA) customer;
			List<String> names = customerA.getNames();
			names.removeAll(this.customerB.getNameList());
			System.out.println("客户A与客户B差集：" + names);
		} else if (customer instanceof CustomerB) {
			CustomerB customerB = (CustomerB) customer;
			List<String> nameList = customerB.getNameList();
			nameList.removeAll(this.customerA.getNames());
			System.out.println("客户B与客户A差集：" + nameList);
		}
	}

}
