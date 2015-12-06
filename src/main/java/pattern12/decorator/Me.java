package pattern12.decorator;

/**
 * 我
 */

public class Me implements ActionSpeaker {

	private int counter;

	public Me(int counter) {
		this.counter = counter;
	}

	@Override
	public void tellStory() {
		System.out.println(this.counter + ".从前有座山，山上有座庙，庙里有个老和尚给小和尚讲故事，讲的是什么呢？");
	}

}
