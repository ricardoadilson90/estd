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
	//Questão 1
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
	//Questão 2
	public long getNodeHeight(DNode <T> node){
		DNode<T> aux = getFirst();
		long counter = 1;
		while(!aux.equals(node)){
			counter++;
			aux.getNext();
		}
		return  getSize()-counter;
	}
	//Questão 2
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
	//Questão 3
	public long getNodeDepth(T value){
		DNode<T> node = search(value);
		DNode<T> aux = getFirst();
		long counter = 1;
		while(!aux.equals(node)){
			counter++;
			aux.getNext();
		}
		return  counter;
	}
	//Questão 6
	public DLinkedList<String> invert (DLinkedList<String> list) {
		DLinkedList<String> result = new DLinkedList<>();
		
		DNode<String> aux = list.getFirst();
		while(aux != null){
			DNode<String> node = new DNode<String>(aux.getValue());
			result.addFirst(node);
			aux = aux.getNext();
		}
		
		
		return result;
	}
	//questão 5
	public DLinkedList<T> copy(DLinkedList<T> list){
		DLinkedList<String> copied = new DLinkedList<>();
		DNode<String> aux = list.getFirst();
		while(aux!=null){
			DNode<T> node = new Dnode<T>();
			node.setValue(aux.getValue());
			copied.addLast(node);
			aux = aux.getNext();
		}
		return copied;
	}
	//Questão 7
	public static SLinkedList<String> copyArrayToList(String[] array) {
		SLinkedList<String> result = new SLinkedList<>();
		for (String s : array) {
			Node<String> node = new Node<String>(s);
			result.add(node);
		}
		return result;
	}
	//Questão 8
	public static String[] copyListToArray(SLinkedList<String> list) {
		int counter = 0;
		String[] result = new String[(int) list.getSize()];
		Node<String> aux = list.getFirst();
		while (aux != null) {
			result[counter] = aux.getValue();
			aux = aux.getNext();
			counter++;
		}

		return result;

	}
	//Questão 9
	public DLinkedList<T> join(DLinkedList<T> list1, DlinkedList<T> list2){
		DLinkedList<String> joined = new DLinkedList<>();
		DNode<String> aux1 = list1.getFirst();
		DNode<String> aux2 = list2.getFirst();
		while(aux1!=null){
			DNode<T> node = new Dnode<T>();
			node.setValue(aux1.getValue());
			joined.addLast(node);
			aux1 = aux1.getNext();
		}
		while(aux2=!null){
			DNode<T> node = new Dnode<T>();
			node.setValue(aux2.getValue());
			joined.addLast(node);
			aux2 = aux2.getNext();
		}
		return joined;
	}
	//Questão 4
	@Override
	public boolean equals(Object obj){
		boolean equals = true;
		if (obj instanceof DLinkedList){
			DLinkedList list = obj;
			if(this.size == list.getSize()){
				DNode aux1 = list.getFirst();
				DNode aux2 = first;
				while(aux1!=null){
					if(aux1.getValue().equals(aux2.getValue())){
						aux1 = aux1.getNext();
						aux2 = aux2.getNext();
					}else{
						equals = false;
						break;
					}
				}
			}else{
				equals = false;
			}
		}else{
			equals = false;
		}
		
		return equals;
	}
	//Questão 10
	public void remove(T value){
		DNode<T> aux = this.getFirst();
		while (aux != null) {
			if(aux.getValue().equals(value)) {
				aux.getPrevious.setNext(aux.getNext());
				aux.getNext.setPrevious(aux.getPrevious());
				aux.setNext(null);
				aux.setPrevious(null);
			}
			aux = aux.getNext();
		}
	}
}
