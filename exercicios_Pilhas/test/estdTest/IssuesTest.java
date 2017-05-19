package estdTest;

import org.junit.Assert;
import org.junit.Test;

import estd.Issues;
import estd.Stack;


public class IssuesTest {
	@Test
	public void toStackTest(){
		Issues a = new Issues();
		Stack<Integer> stack;
		int[] n = {10,5,11,12,15};
		stack = a.toStack(n);
		Assert.assertTrue(stack.getSize()==5);
		Assert.assertTrue(stack.top()==15);
		int x = stack.pop();
		Assert.assertTrue(stack.getSize() == 4);
		Assert.assertTrue(stack.pop()==12);
		Assert.assertTrue(stack.getSize() == 3);
		System.out.println(x);
		//Assert.assertTrue(stack.pop()==12);
		Assert.assertTrue(x == 15);
	}
}
