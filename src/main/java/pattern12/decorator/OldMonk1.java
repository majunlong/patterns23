package pattern12.decorator;

/**
 * 老和尚1
 */

public class OldMonk1 extends AbstractSpeaker {

	private int counter;

	public OldMonk1(ActionSpeaker speak, int counter) {
		super(speak);
		this.counter = counter;
	}

	@Override
	public void tellStory() {
		super.tellStory();
		System.out.println(this.counter + ".从前有座山，山上有座庙，庙里有个老和尚给小和尚讲故事，讲的是什么呢？");
	}

}
