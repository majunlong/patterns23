package pattern23.mediator;

import java.util.List;

/**
 * 客户B
 */

public class CustomerB extends AbstractCustomer {

	private List<String> nameList;;

	public CustomerB(ActionMediator mediator) {
		super(mediator);
	}

	@Override
	public void requestService() {
		this.getMediator().service(this);
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public List<String> getNameList() {
		return this.nameList;
	}

}
