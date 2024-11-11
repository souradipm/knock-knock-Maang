package subArray;

public class SubArrayMaxSum {
	
	//Kadens Algo
	//TC:O(N) || SC : O(1)
	public int maxSubarrayKadens(final int[] C) {

		int sum = C[0];
		int max = C[0];

		for(int i = 1; i < C.length; i++) {

			sum = Math.max(C[i], sum + C[i]);
			max = Math.max(max, sum);
		}

		return max;
	}

	public int maxSubArray(final int[] A) {

		int cSum = 0;
		int mSum = Integer.MIN_VALUE;

		for (int i = 0; i < A.length; i++) {

			cSum += A[i];
			mSum = Math.max(mSum, cSum);
			if (cSum < 0) {
				cSum = 0;
			}

		}

		return mSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArrayMaxSum s = new SubArrayMaxSum();
//		System.out.println(s.maxSubArray(new int[] { 1, 2, 3, 4, -10 }));
//		System.out.println(s.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
		System.out.println(s.maxSubArray(new int[] { 3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4 }));
		
//		System.out.println(s.maxSubarrayKadens(new int[] { 1, 2, 3, 4, -10 }));
//		System.out.println(s.maxSubarrayKadens(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
		System.out.println(s.maxSubarrayKadens(new int[] { 3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4 }));

	}

}
