package estdTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import estd.ArrayStack;
import estd.Stack;

public class ArrayStackTest {
	@Test
	public void popNTest() {
		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");

		List<String> result = stack.pop(2);
		Assert.assertTrue(result.size() == 2);
		Assert.assertEquals(result.get(0), "C");

		stack.push("B");
		stack.push("C");
		result = stack.pop(4);
		Assert.assertTrue(result.size() == 3);
		Assert.assertEquals(result.get(2), "A");
	}

	@Test
	public void clearTest() {
		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		List<String> result = stack.clear();
		Assert.assertTrue(stack.isEmpty());
		Assert.assertTrue(result.size() == 3);

	}
	@Test
	public void cloneStackTest(){
		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Stack<String> clone = stack.cloneStack();
		Assert.assertTrue(stack.getSize()==3);
		Assert.assertTrue(clone.getSize() == stack.getSize());
		for (int i = 0; i < stack.getSize(); i++) {
			Assert.assertEquals(clone.pop(), stack.pop());	
		}
		
		
		
	}
}
