package questaoQuatro;

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
			if (aux.getValue().equals(value)) {
				return aux;
			}
			aux = aux.getNext();
		}

		return null;
	}

	public long getNodeHeight(DNode<T> node) {
		DNode<T> aux = getFirst();
		long counter = 1;
		while (!aux.equals(node)) {
			counter++;
			aux = aux.getNext();
		}
		return getSize() - counter;
	}

	public long getNodeHeight(T value) {
		DNode<T> node = search(value);
		DNode<T> aux = getFirst();
		long counter = 1;
		while (!aux.equals(node)) {
			counter++;
			aux = aux.getNext();
		}
		return getSize() - counter;
	}

	public long getNodeDepth(DNode<T> node) {
		DNode<T> aux = getFirst();
		long counter = 0;
		while (!aux.equals(node)) {
			counter++;
			aux = aux.getNext();
		}
		return counter;
	}

	public long getNodeDepth(T value) {
		DNode<T> node = search(value);
		DNode<T> aux = getFirst();
		long counter = 0;
		while (!aux.equals(node)) {
			counter++;
			aux = aux.getNext();
		}
		return counter;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean equals(Object obj) {

		boolean verifier = true; // boolean verificador
		if (obj instanceof DLinkedList) {//se objeto pertence ao tipo DLinkedList
			DLinkedList aux = (DLinkedList) obj;//transforma obj em DLinkedList
			DLinkedList aux2 = this; //cria obj auxiliar para verificar se o objeto que chama o método é igual ao objeto alvo do método
			if (aux2.getSize() == aux.getSize()) { // verifica se o tamanho de ambos são iguais
				while (!(aux2.getFirst() == null)) { // laço de repetição que para quando o primeiro for nulo
					if (aux2.getFirst().getValue().equals(aux.getFirst().getValue())) { // verifica se o valor de ambos são iguais 
						aux2.removeFirst(); //se valor for igual, remove-se os primeiros de ambas as listas
						aux.removeFirst();
					} else {
						verifier = false; //senão for igual, verificador falso.
					}
				}
			} else {
				verifier = false; //se o tamanho de ambas listas for diferente, verificador = falso

			}
		} else {
			verifier = false; // se objeto não for instancia de DLinkedList, verificador = falso
		}
		
		return verifier; //retorna boolean verificador
	}

}
