package pattern08.composite2.transparent;

/**
 * 抽象文件
 */

public abstract class AbstractFile {

	/**
	 * 打开
	 */
	public abstract void open();

	/**
	 * 添加文件
	 * 
	 * @param file 文件
	 */
	public void add(AbstractFile file) {
		throw new UnsupportedOperationException("该对象不支持此操作");
	}

}
