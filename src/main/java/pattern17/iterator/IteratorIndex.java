package pattern17.iterator;

/**
 * 下标迭代器
 */

public class IteratorIndex<T> implements Iterator<T> {

	private int index = -1;
	private List<T> collection;

	public IteratorIndex(List<T> collection) {
		this.collection = collection;
	}

	@Override
	public boolean hasPrevious() {
		if (this.index > 0) {
			return true;
		} else if (this.index == -1) {
			this.index = this.collection.size();
			return true;
		}
		this.index = -1;
		return false;
	}

	@Override
	public boolean hasNext() {
		if (this.index < this.collection.size() - 1) {
			return true;
		}
		this.index = this.collection.size();
		return false;
	}

	@Override
	public T previous() {
		if (this.index > 0) {
			this.index -= 1;
		}
		return this.collection.get(this.index);
	}

	@Override
	public T next() {
		if (this.index < this.collection.size() - 1) {
			this.index += 1;
		}
		return this.collection.get(this.index);
	}

}
