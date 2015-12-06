package pattern18.chain1;

/**
 * 无效成绩处理程序
 */

public class HandlerInvalid extends AbstractHandler {

	@Override
	public String handleScore(int score) {
		if (score > 100 || score <= 0) {
			return "无效成绩";
		}
		return super.handleScore(score);
	}

}
