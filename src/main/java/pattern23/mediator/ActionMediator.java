package pattern23.mediator;

/**
 * 中介者接口
 */

public interface ActionMediator {

	/**
	 * 服务
	 * 
	 * @param customer 客户
	 */
	public void service(AbstractCustomer customer);

}
