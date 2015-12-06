package com.test;

import org.junit.Before;
import org.junit.Test;

import pattern08.composite1.security.ActionFile;
import pattern08.composite1.security.Disk;
import pattern08.composite1.security.Folder;
import pattern08.composite1.security.Text;

/**
 * 安全合成模式
 */

public class Test08Composite1Security {

	ActionFile file;

	@Before
	public void init() {
		this.file = new Disk("C盘");
		ActionFile folderA = new Folder("文件夹A");
		ActionFile folderB = new Folder("文件夹B");
		ActionFile textA1 = new Text("文本文件A1.txt");
		ActionFile textA2 = new Text("文本文件A2.txt");
		ActionFile textB1 = new Text("文本文件B1.txt");
		ActionFile textB2 = new Text("文本文件B2.txt");
		this.file.add(folderA);
		this.file.add(folderB);
		folderA.add(textA1);
		folderA.add(textA2);
		folderB.add(textB1);
		folderB.add(textB2);
	}

	@Test
	public void testComposite() {
		this.file.open();
	}

}
