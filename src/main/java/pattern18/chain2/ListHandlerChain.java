package pattern18.chain2;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链
 */

public class ListHandlerChain implements ActionHandlerChain {

	private List<ActionHandler> handlerList = new ArrayList<ActionHandler>();

	@Override
	public void add(ActionHandler handler) {
		this.handlerList.add(handler);
	}

	@Override
	public String handleScore(int score) {
		for (ActionHandler handler : this.handlerList) {
			String result = handler.handleScore(score);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

}
