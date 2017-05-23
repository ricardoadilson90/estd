package estd;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack<E> implements Stack<E> {

	private int size;
	private E[] array;
	private int position;

	@SuppressWarnings("unchecked")
	public ArrayStack() {
		size = 20;
		array = (E[]) new Object[size];
		position = 0;
	}

	@SuppressWarnings("unchecked")
	public ArrayStack(int size) {
		this.size = size;
		array = (E[]) new Object[size];
		position = 0;
	}

	@Override
	public void push(E e) {
		if (isFull()) {
			doubleArraySize();
		}
		array[position++] = e;
	}

	@Override
	public E pop() {
		E aux = this.top();
		if (!isEmpty()) {
			aux = array[position - 1];
			array[position--] = null;
		}
		return aux;
	}

	@Override
	public List<E> pop(int n) {
		List<E> aux = new ArrayList<E>();
		for (int i = 0; i < n; i++) {
			if (isEmpty()) {
				break;
			} else {
				aux.add(this.pop());
			}
		}
		return aux;
	}

	@Override
	public List<E> clear() {
		return this.pop(this.getSize());
	}

	@Override
	public Stack<E> cloneStack() {
		Stack<E> clone = new ArrayStack<E>();
		for (int i = 0; i < position; i++) {
			clone.push(array[i]);
		}
		return clone;
	}

	@Override
	public E top() {
		if (!isEmpty()) {
			return array[position - 1];
		} else {
			return array[position];
		}
	}

	@Override
	public int getSize() {
		return position;
	}

	@Override
	public boolean isEmpty() {
		return position == 0;
	}

	// ----------------- Sessão de métodos privados -------------------
	private boolean isFull() {
		return position == (size - 1);
	}

	private void doubleArraySize() {
		size = size * 2;
		@SuppressWarnings("unchecked")
		E[] array = (E[]) new Object[size];
		System.arraycopy(this.array, 0, array, 0, this.array.length);
		this.array = array;
	}

}
