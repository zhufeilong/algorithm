package feilongzhu.algorithm;

public class MaxSubArraySum {
	/* Add one element , if currentSum > maxSum then update maxSum = currentSum
	 * if currentSum < 0 then reset currentSum = 0
	 * This works because that 
	 * it is unable to get a sub-array that its start element is the left point of the largest sub-array and it's sum is negative.
	 */ 
	public static int getMaxSubArraySum(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		for(int i : arr) {
			currentSum = currentSum+i;
			if(maxSum<currentSum) {
				maxSum=currentSum;
			}
			if(currentSum<0) {
				currentSum=0;
			}
		}
		return maxSum;
	}
}
