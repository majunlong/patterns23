package pattern08.composite2.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * 磁盘
 */

public class Disk extends AbstractFile {

	private String name;
	private List<AbstractFile> fileList = new ArrayList<AbstractFile>();

	public Disk(String name) {
		this.name = name;
	}

	@Override
	public void open() {
		System.out.println("打开<" + name + ">");
		for (AbstractFile file : this.fileList) {
			file.open();
		}
	}

	@Override
	public void add(AbstractFile file) {
		this.fileList.add(file);
	}

}
