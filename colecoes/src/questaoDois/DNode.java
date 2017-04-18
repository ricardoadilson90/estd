package questaoDois;

public class DNode <T> {

	private DNode<T> next;
	private DNode<T> previous;
	private T value;
	
	public DNode<T> getNext() {
		return next;
	}
	public void setNext(DNode<T> next) {
		this.next = next;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public DNode<T> getPrevious() {
		return previous;
	}
	public void setPrevious(DNode<T> previous) {
		this.previous = previous;
	}
	
	
	
	
	
}
