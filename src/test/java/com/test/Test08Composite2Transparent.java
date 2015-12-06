package com.test;

import org.junit.Before;
import org.junit.Test;

import pattern08.composite2.transparent.AbstractFile;
import pattern08.composite2.transparent.Disk;
import pattern08.composite2.transparent.Folder;
import pattern08.composite2.transparent.Text;

/**
 * 透明合成模式
 */

public class Test08Composite2Transparent {

	AbstractFile file;

	@Before
	public void init() {
		this.file = new Disk("C盘");
		AbstractFile folderA = new Folder("文件夹A");
		AbstractFile folderB = new Folder("文件夹B");
		AbstractFile textA1 = new Text("文本文件A1.txt");
		AbstractFile textA2 = new Text("文本文件A2.txt");
		AbstractFile textB1 = new Text("文本文件B1.txt");
		AbstractFile textB2 = new Text("文本文件B2.txt");
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
