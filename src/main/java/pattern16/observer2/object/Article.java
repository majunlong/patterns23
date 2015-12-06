package pattern16.observer2.object;

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
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Article {

	private String title;
	private String content;
	
	public static class ArticleObservable extends Observable {

		public void observ(Article article) {
			this.setChanged();
			this.notifyObservers(article);
		}

	}

}
