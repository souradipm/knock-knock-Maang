package subArray;

public class AllSubArraySum {

	/**
	 * You are given an integer array A of length N. You have to find the sum of all
	 * subarray sums of A. More formally, a subarray is defined as a contiguous part
	 * of an array which we can obtain by deleting zero or more elements from either
	 * end of the array. A subarray sum denotes the sum of all the elements of that
	 * subarray.
	 * 
	 * CONTRIBUTION TECHNIQUE
	 * 
	 */
	public long subarraySum(int[] A) {

		int len = A.length;
		long ans = 0;
		for (int i = 0; i < len; i++) {

			ans = ans + (long) A[i] * (i + 1) * (len - i);

		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllSubArraySum a = new AllSubArraySum();
		System.out.println(a.subarraySum(new int[] { 1, 2, 3 }));

	}

}
