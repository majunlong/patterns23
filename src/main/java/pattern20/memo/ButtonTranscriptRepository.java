package pattern20.memo;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 按钮副本存储
 */

public class ButtonTranscriptRepository implements ActionTranscriptRepository {

	private Button button;
	private int currentIndex = 0;
	private ButtonTranscript buttonTranscriptLast;
	private List<ButtonTranscript> buttonTranscriptList;

	public ButtonTranscriptRepository(Button button) {
		this.button = button;
		this.buttonTranscriptList = new ArrayList<ButtonTranscript>();
	}

	@Override
	public int size() {
		return this.buttonTranscriptList.size();
	}

	@Override
	public void create() {
		ButtonTranscript buttonTranscript = new ButtonTranscript();
		buttonTranscript.setColor(this.button.getColor());
		buttonTranscript.setStatus(this.button.getStatus());
		this.buttonTranscriptLast = buttonTranscript;
		this.buttonTranscriptList.add(buttonTranscript);
		this.currentIndex = this.buttonTranscriptList.size() - 1;
	}
	
	@Override
	public void restore() {
		this.button.setColor(this.buttonTranscriptLast.getColor());
		this.button.setStatus(this.buttonTranscriptLast.getStatus());
	}

	@Override
	public void restore(int index) {
		if (index >= 0 && index < this.buttonTranscriptList.size()) {
			ButtonTranscript buttonTranscript = this.buttonTranscriptList.get(index);
			this.button.setColor(buttonTranscript.getColor());
			this.button.setStatus(buttonTranscript.getStatus());
		}
	}

	@Override
	public void restorePrevious() {
		if (this.currentIndex > 0) {
			this.currentIndex -= 1;
			this.restore(this.currentIndex);
		}
	}

	@Override
	public void restoreNext() {
		if (this.currentIndex < this.buttonTranscriptList.size() - 1) {
			this.currentIndex += 1;
			this.restore(this.currentIndex);
		}
	}

	@Data
	@ToString
	@EqualsAndHashCode
	@NoArgsConstructor
	@AllArgsConstructor
	private class ButtonTranscript {

		private String color;
		private String status;

	}

}
