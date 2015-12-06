package com.test;

import org.junit.Test;

import pattern20.memo.Button;
import pattern20.memo.ButtonTranscriptRepository;

/**
 * 备忘录模式
 */

public class Test20Memo {

	@Test
	public void testMementoSingle() {
		Button button = new Button("电源", "红色", "关闭");
		ButtonTranscriptRepository repository = new ButtonTranscriptRepository(button);
		repository.create();
		System.out.println(button);
		button.setColor("绿色");
		button.setStatus("开启");
		System.out.println(button);
		repository.restore();
		System.out.println(button);
	}

	@Test
	public void testMementoMultiple() {
		Button button = new Button("电源", "红色", "关闭");
		ButtonTranscriptRepository repository = new ButtonTranscriptRepository(button);
		repository.create();
		button.setColor("绿色1");
		button.setStatus("开启1");
		repository.create();
		button.setColor("绿色2");
		button.setStatus("开启2");
		repository.create();
		button.setColor("红色");
		button.setStatus("关闭");
		repository.create();
		System.out.println(button);
		repository.restorePrevious();
		System.out.println(button);
		repository.restorePrevious();
		System.out.println(button);
		repository.restorePrevious();
		System.out.println(button);
		repository.restoreNext();
		System.out.println(button);
		repository.restoreNext();
		System.out.println(button);
		repository.restoreNext();
		System.out.println(button);
	}

}
