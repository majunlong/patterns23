package pattern12.decorator;

/**
 * 老和尚2
 */

public class OldMonk2 extends AbstractSpeaker {

	private int counter;

	public OldMonk2(ActionSpeaker speak, int counter) {
		super(speak);
		this.counter = counter;
	}

	@Override
	public void tellStory() {
		super.tellStory();
		System.out.println(this.counter + ".从前有座山，山上有座庙，庙里有个老和尚给小和尚讲故事，讲的是什么呢？");
	}

}
