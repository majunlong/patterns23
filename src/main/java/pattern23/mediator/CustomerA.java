package pattern23.mediator;

import java.util.List;

/**
 * 客户A
 */

public class CustomerA extends AbstractCustomer {

	private List<String> names;

	public CustomerA(ActionMediator mediator) {
		super(mediator);
	}

	@Override
	public void requestService() {
		this.getMediator().service(this);
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<String> getNames() {
		return this.names;
	}

}
