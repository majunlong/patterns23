package pattern03.singleton1.eager;

/**
 * 领导人
 */

public class Leader {

	private static boolean isLoading = false;

	private static final Leader singleton = new Leader();

	private Leader() {
		isLoading = true;
	}

	/**
	 * 获取单例领导人
	 *
	 * @return 单例领导人
	 */
	public static Leader get() {
		return singleton;
	}

	/**
	 * 判断单例领导人是否加载
	 * 
	 * @return 是否加载
	 */
	public static boolean isLoading() {
		return isLoading;
	}

}
