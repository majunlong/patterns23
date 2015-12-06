package pattern18.chain2;

/**
 * B成绩处理程序
 */

public class HandlerB implements ActionHandler {

	@Override
	public String handleScore(int score) {
		if (score > 0) {
			return "B成绩";
		}
		return null;
	}

}
