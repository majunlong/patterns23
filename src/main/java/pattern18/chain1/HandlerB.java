package pattern18.chain1;

/**
 * B成绩处理程序
 */

public class HandlerB extends AbstractHandler {

	@Override
	public String handleScore(int score) {
		if (score > 0) {
			return "B成绩";
		}
		return super.handleScore(score);
	}

}
