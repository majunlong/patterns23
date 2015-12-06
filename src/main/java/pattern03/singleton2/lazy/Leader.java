package pattern03.singleton2.lazy;

/**
 * 领导人
 */

public class Leader {

	private static boolean isLoading = false;

	private static class SingtonGenerator {
		private static final Leader singleton = new Leader();
	}

	private Leader() {
		isLoading = true;
	}

	/**
	 * 加载单例领导人
	 *
	 * @return 领导人
	 */
	public static Leader load() {
		return Leader.SingtonGenerator.singleton;
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
