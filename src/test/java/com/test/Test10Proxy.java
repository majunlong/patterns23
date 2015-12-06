package com.test;

import org.junit.Test;

import pattern10.proxy.ActionSendMessage;
import pattern10.proxy.ActionSendVoice;
import pattern10.proxy.ProxyHandler;
import pattern10.proxy.QQ;

/**
 * 代理模式
 */

public class Test10Proxy {

	@Test
	public void testProxy() {
		ActionSendVoice voice = ProxyHandler.instanceProxy(QQ.class);
		ActionSendMessage message = ProxyHandler.createProxy(QQ.class);
		voice.sendVoice("张三");
		System.out.println();
		message.sendMessage("李四");
	}

	@Test
	public void testProxyFile() {
		ProxyHandler.createProxyFile("C:\\Users\\Administrator\\Desktop\\", QQ.class);
	}

}
