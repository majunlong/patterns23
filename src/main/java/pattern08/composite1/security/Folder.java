package pattern08.composite1.security;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹
 */

public class Folder implements ActionFile {

	private String name;
	private List<ActionFile> children = new ArrayList<ActionFile>();

	public Folder(String name) {
		this.name = name;
	}

	@Override
	public void open() {
		System.out.println("打开<" + name + ">");
		for (ActionFile file : this.children) {
			file.open();
		}
	}

	@Override
	public void add(ActionFile file) {
		this.children.add(file);
	}

}
