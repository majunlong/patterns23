package pattern16.observer1.property;

import java.util.Observable;
import java.util.Observer;

/**
 * 文章观察者
 */

public class ArticleObserver implements Observer {

	public void update(Observable partTarget, Object target) {
		Article article = (Article) partTarget;
		if (article != null && article.getContent() != null) {
			System.out.println("博客标题为：" + article.getTitle());
			System.out.println("博客内容为：" + article.getContent());
		}
	}

}
