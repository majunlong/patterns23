package com.test;

import org.junit.Test;

import pattern16.observer2.object.Article;
import pattern16.observer2.object.ArticleObserver;
import pattern16.observer2.object.Article.ArticleObservable;

/**
 * 对象观察者模式
 */

public class Test16Observer2Object {

	@Test
	public void testObserver() {
		ArticleObservable articleObservable = new ArticleObservable();
		articleObservable.addObserver(new ArticleObserver());
		articleObservable.observ(new Article("哈哈，博客上线了", "大家多来访问"));
	}

}
