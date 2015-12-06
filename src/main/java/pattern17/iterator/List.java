package pattern17.iterator;

/**
 * 列表接口
 */

public interface List<T> {

	/**
	 * 迭代器
	 * 
	 * @return 迭代器
	 */
	public Iterator<T> iterator();

	/**
	 * 获取元素
	 * 
	 * @param i 元素下标
	 * @return 元素
	 */
	public T get(int i);

	/**
	 * 计算容量
	 * 
	 * @return 容量
	 */
	public int size();

}
