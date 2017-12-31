package feilongzhu.algorithm;

import junit.framework.TestCase;

public class MaxSubArraySumTest extends TestCase {

	public void testGetMaxSubArraySum() {
		int[] arr1 = {0,0,0,0,0,0,0,0};
		assertEquals(0, MaxSubArraySum.getMaxSubArraySum(arr1));
		int[] arr2 = {-1,-1,-1,-1,-1,-1,-1,-1};
		assertEquals(-1, MaxSubArraySum.getMaxSubArraySum(arr2));
		int[] arr3 = {-1,3,-1,-1,3,-1,2,-1};
		assertEquals(5, MaxSubArraySum.getMaxSubArraySum(arr3));
		int[] arr4 = {-1,-1,-1,0,-1,-1,-1,-1};
		assertEquals(0, MaxSubArraySum.getMaxSubArraySum(arr4));
	}

}
