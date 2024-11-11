package subArray;

public class MaxSubArraySum {

	/**
	 * You are given an integer array C of size A. Now you need to find a subarray
	 * (contiguous elements) so that the sum of contiguous elements is maximum. But
	 * the sum must not exceed B.
	 * 
	 */
	public int maxSubarrayKadens(int A, int B, int[] C) {

		int sum = C[0];
		int max = C[0];

		for(int i = 1; i < C.length; i++) {

			sum = Math.max(C[i], sum + C[i]);
			if(sum<=B) {
				max = Math.max(max, sum);
			}
			
		}

		return max;
	}
	

	public int maxSubarray(int A, int B, int[] C) {

		int tmax = Integer.MIN_VALUE;
		for (int i = 0; i < A; i++) {
			for (int j = i; j < A; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += C[k];
					if (sum <= B) {
						tmax = Math.max(tmax, sum);
					}
				}
			}
		}
		return tmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSubArraySum m = new MaxSubArraySum();
		System.out.println(m.maxSubarrayKadens(5, 12, new int[] { 2, 1, 3, 4, 5 }));
		System.out.println(m.maxSubarray(5, 12, new int[] { 2, 1, 3, 4, 5 }));

	}

}
