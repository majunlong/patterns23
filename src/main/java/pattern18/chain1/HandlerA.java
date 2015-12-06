package pattern18.chain1;

/**
 * A成绩处理程序
 */

public class HandlerA extends AbstractHandler {

	@Override
	public String handleScore(int score) {
		if (score > 50) {
			return "A成绩";
		}
		return super.handleScore(score);
	}

}
