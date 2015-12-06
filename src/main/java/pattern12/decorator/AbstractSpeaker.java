package pattern12.decorator;

/**
 * 抽象演讲人
 */

public class AbstractSpeaker implements ActionSpeaker {

	private ActionSpeaker speak;

	public AbstractSpeaker(ActionSpeaker speak) {
		this.speak = speak;
	}

	@Override
	public void tellStory() {
		this.speak.tellStory();
	}

}
