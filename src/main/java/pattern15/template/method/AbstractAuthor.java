package pattern15.template.method;

/**
 * 抽象作者
 */

public abstract class AbstractAuthor {

	/**
	 * 获取姓名
	 * 
	 * @return 姓名
	 */
	public abstract String getName();

	/**
	 * 签名
	 */
	public void signature() {
		System.out.println("签名：" + this.getName());
	}

}
