package estdTest;

import org.junit.Assert;
import org.junit.Test;

import estd.Issues;
import estd.Stack;


public class IssuesTest {
	@Test
	public void toStackTest(){
		Stack<Integer> stack;
		int[] n = {10,5,11,12,15};
		stack = Issues.toStack(n);
		Assert.assertTrue(stack.getSize()==5);
		Assert.assertTrue(stack.top()==15);
		int x = stack.pop();
		Assert.assertTrue(stack.getSize() == 4);
		Assert.assertTrue(stack.pop()==12);
		Assert.assertTrue(stack.getSize() == 3);
		System.out.println(x);
		Assert.assertTrue(stack.pop()==11);
		Assert.assertTrue(x == 15);
	}
	
	public void returnEvensTest(){
		int[] n = {1,2,3,4,5,6,7,8,9,10};
		Stack<Integer> stack = Issues.toStack(n);
		n = Issues.returnEvens(stack);
		int x = 2;
		for (int i = 0; i < n.length; i++) {
			Assert.assertTrue(n[i] == x);
			x = x+2;
		}
		
	}
}
