package pattern08.composite2.transparent;

/**
 * 文本文件
 */

public class Text extends AbstractFile {

	private String name;

	public Text(String name) {
		this.name = name;
	}

	@Override
	public void open() {
		System.out.println("打开<" + name + ">");
	}

}
