package com.test;

import org.junit.Test;

import pattern16.observer1.property.Article;
import pattern16.observer1.property.ArticleObserver;

/**
 * 属性观察者模式
 */

public class Test16Observer1Property {

	@Test
	public void testObserver() {
		Article article = new Article();
		article.addObserver(new ArticleObserver());
		article.setTitle("哈哈，博客上线了");
		article.setContent("大家多来访问");
	}

}
