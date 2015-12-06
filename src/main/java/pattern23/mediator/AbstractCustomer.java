package pattern23.mediator;

/**
 * 抽象客户
 */

public abstract class AbstractCustomer {

	private ActionMediator mediator;

	public AbstractCustomer(ActionMediator mediator) {
		this.mediator = mediator;
	}

	/**
	 * 获取中介者
	 * 
	 * @return 中介者
	 */
	public ActionMediator getMediator() {
		return this.mediator;
	}

	/**
	 * 请求服务
	 */
	public abstract void requestService();

}
