package pattern18.chain2;

/**
 * 处理程序链接口
 */

public interface ActionHandlerChain extends ActionHandler {

	/**
	 * 添加处理程序
	 * 
	 * @param handler 处理程序
	 */
	public void add(ActionHandler handler);

}
