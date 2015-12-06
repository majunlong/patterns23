package com.test;

import org.junit.Test;

import pattern11.bridge.AbstractComputer;
import pattern11.bridge.ComputerNew;
import pattern11.bridge.ComputerOld;
import pattern11.bridge.DeviceKeyboard;
import pattern11.bridge.DeviceMouse;

/**
 * 桥接模式
 */

public class Test11Bridge {

	@Test
	public void testBridge() {
		AbstractComputer newComputer = new ComputerNew(new DeviceMouse());
		AbstractComputer oldComputer = new ComputerOld(new DeviceKeyboard());
		newComputer.work();
		System.out.println();
		oldComputer.work();
	}

}
