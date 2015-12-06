package pattern08.composite1.security;

/**
 * 文本文件
 */

public class Text implements ActionFile {

	private String name;

	public Text(String name) {
		this.name = name;
	}

	@Override
	public void open() {
		System.out.println("打开<" + name + ">");
	}

	@Override
	public void add(ActionFile file) {
		throw new UnsupportedOperationException("该对象不支持此操作");
	}

}
