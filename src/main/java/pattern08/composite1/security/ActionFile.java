package pattern08.composite1.security;

/**
 * 文件接口
 */

public interface ActionFile {

	/**
	 * 打开
	 */
	public void open();

	/**
	 * 添加文件
	 * 
	 * @param file 文件
	 */
	public void add(ActionFile file);

}
