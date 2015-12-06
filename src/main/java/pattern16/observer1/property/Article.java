package pattern16.observer1.property;

import java.util.Observable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 文章
 */

@Data
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Article extends Observable {

	private String title;
	private String content;

	public void setTitle(String title) {
		this.title = title;
		this.setChanged();
		this.notifyObservers();
	}

	public void setContent(String content) {
		this.content = content;
		this.setChanged();
		this.notifyObservers();
	}

}
