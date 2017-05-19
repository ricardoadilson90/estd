package estd;

import java.util.List;

public interface Stack<E> {
	void push(E e);

	E pop();

	E top();

	int getSize();

	boolean isEmpty();
	
	List<E> pop(int n);
	
	List<E> clear();

	Stack<E> cloneStack();
}
