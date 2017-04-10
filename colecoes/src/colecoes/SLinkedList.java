package colecoes;

public class SLinkedList<T> {

	private Node<T> first;
	private Node<T> last;
	private long size = 0;

	public Node<T> getFirst() {
		return first;
	}

	public void setFirst(Node<T> first) {
		this.first = first;
	}

	public Node<T> getLast() {
		return last;
	}

	public void setLast(Node<T> last) {
		this.last = last;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public void add(Node<T> node) {
		if (first == null) {
			size++;
			first = node;
			last = node;
		} else {
			size++;
			last.setNext(node);
			last = node;
		}

	}

}
