package interviewTestedQuestions;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] arr = { 10, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(arr));
		System.out.println(maxSubArrayEfficientWay(arr));
		
		
	}

	public static int maxSubArray(int[] nums) {
		int res = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int currSum = 0;

			for (int j = i; j < nums.length; j++) {
				currSum = currSum + nums[j];
				res = Math.max(res, currSum);
			}

		}
		return res;
	}
	

	public static int maxSubArrayEfficientWay(int[] nums) {
		int n = nums.length;
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		for (int i = 0; i <= n - 1; i++) {
			currSum += nums[i];

			if (currSum > maxSum) {
				maxSum = currSum;
			}
			
	//		maxSum = Math.max(maxSum, currSum);

			if (currSum < 0) {
				currSum = 0;
			}
		}

		return maxSum;
	}
}
