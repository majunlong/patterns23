package pattern18.chain1;

/**
 * 抽象处理程序
 */

public abstract class AbstractHandler {

	private AbstractHandler handler;

	/**
	 * 追加处理程序
	 * 
	 * @param handler 处理程序
	 * @return 处理程序
	 */
	public AbstractHandler append(AbstractHandler handler) {
		this.handler = handler;
		return handler;
	}

	/**
	 * 处理分数
	 * 
	 * @param score 分数
	 * @return 成绩
	 */
	public String handleScore(int score) {
		if (this.handler != null) {
			return this.handler.handleScore(score);
		}
		return null;
	}

}
