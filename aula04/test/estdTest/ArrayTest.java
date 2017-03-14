package estdTest;

import org.junit.Assert;
import org.junit.Test;

import estd.Array;

public class ArrayTest {
	@Test
	public void countEvenTest(){
		Array a = new Array();
		int[] nums = {5,6,8,7,1,5,6,3,4,1,1,2,8};
		
		int result = a.countEvens(nums);
		
		Assert.assertTrue(result == 6);
	}
}
