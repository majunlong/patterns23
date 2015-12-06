package pattern18.chain2;

/**
 * A成绩处理程序
 */

public class HandlerA implements ActionHandler {

	@Override
	public String handleScore(int score) {
		if (score > 50) {
			return "A成绩";
		}
		return null;
	}

}
