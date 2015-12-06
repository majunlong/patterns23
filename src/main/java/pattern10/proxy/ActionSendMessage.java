package pattern10.proxy;

/**
 * 发送短信接口
 */

public interface ActionSendMessage {

	/**
	 * 发送消息
	 * 
	 * @param name 姓名
	 */
	public void sendMessage(String name);

}
