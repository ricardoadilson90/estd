package questaoDois;

import org.junit.Assert;
import org.junit.Test;

public class DLinkedList<T> {

	private DNode<T> first;
	private DNode<T> last;
	private long size;

	public DNode<T> getFirst() {
		return first;
	}

	public DNode<T> getLast() {
		return last;
	}

	public long getSize() {
		return size;
	}

	public void addLast(DNode<T> node) {
		if (isEmpty()) {
			first = node;
			last = node;
		} else {
			last.setNext(node);
			node.setPrevious(last);
			last = node;

		}
		size++;
	}

	public void addFirst(DNode<T> node) {
		if (isEmpty()) {
			first = node;
			last = node;
		} else {
			first.setPrevious(node);
			node.setNext(first);
			first = node;

		}
		size++;
	}

	public void removeFirst() {
		if (!isEmpty()) {

			first = first.getNext();
			size--;
			if (isEmpty()) {
				last = null;
			}
		}

	}

	public DNode<T> search(T value) {
		DNode<T> aux = this.getFirst();
		while (aux != null) {
			if(aux.getValue().equals(value)) {
				return aux;
			}
			aux = aux.getNext();
		}
		
		return null;
}
	
	public long getNodeHeight(DNode <T> node){
		DNode<T> aux = getFirst();
		long counter = 1;
		while(!aux.equals(node)){
			counter++;
			aux.getNext();
		}
		return  getSize()-counter;
	}
	
	public long getNodeHeight(T value){
		DNode<T> node = search(value);
		DNode<T> aux = getFirst();
		long counter = 1;
		while(!aux.equals(node)){
			counter++;
			aux.getNext();
		}
		return  getSize()-counter;
	}
		
	public boolean isEmpty() {
		return size == 0;
	}

}
