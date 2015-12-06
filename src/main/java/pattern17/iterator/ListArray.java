package pattern17.iterator;

/**
 * 数组列表
 */

public class ListArray<T> implements List<T> {

	private T[] array;

	public ListArray(T[] array) {
		this.array = array;
	}

	@Override
	public Iterator<T> iterator() {
		return new IteratorIndex<T>(this);
	}

	@Override
	public T get(int i) {
		return this.array[i];
	}

	@Override
	public int size() {
		return this.array.length;
	}

}
