package estd;

public class Issues {

	
	public static Stack<Integer> toStack(int[] n) {
		Stack<Integer> aux = new ArrayStack<Integer>(n.length);
		for (int i = 0; i < n.length; i++) {
			aux.push(n[i]);
		}
		return aux;
	}
	 
	public static Stack<Object> toStack(Object[] n) {
		Stack<Object> aux = new ArrayStack<Object>(n.length);
		for (int i = 0; i < n.length; i++) {
			aux.push(n[i]);
		}
		return aux;
	}

	public static int[] toArray(Stack<Integer> stack) {
		int i[] = new int[stack.getSize()];
		for (int j = 0; j < i.length; j++) {
			i[j] = stack.pop();
		}

		return i;
	}

	public static int[] returnEvens(Stack<Integer> stack) {
		int i[] = new int[stack.getSize()];
		for (int j = 0; j < i.length; j++) {
			int aux = stack.top();
			if (aux % 2 == 0)
				i[j] = stack.pop();
		}

		return i;
	}

}
