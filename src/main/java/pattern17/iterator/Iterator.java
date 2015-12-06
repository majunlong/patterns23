package pattern17.iterator;

/**
 * 迭代器
 */

public interface Iterator<T> {

	/**
	 * 是否存在上一个元素
	 * 
	 * @return 是否存在
	 */
	public boolean hasPrevious();

	/**
	 * 是否存在下一个元素
	 * 
	 * @return 是否存在
	 */
	public boolean hasNext();

	/**
	 * 上一个元素
	 * 
	 * @return 元素
	 */
	public T previous();

	/**
	 * 下一个元素
	 * 
	 * @return 元素
	 */
	public T next();

}
