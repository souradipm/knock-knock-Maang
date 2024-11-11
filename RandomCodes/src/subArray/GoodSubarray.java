package subArray;

public class GoodSubarray {

	/**
	 * Given an array of integers A, a subarray of an array is said to be good if it
	 * fulfills any one of the criteria: 1. Length of the subarray is be even, and
	 * the sum of all the elements of the subarray must be less than B. 2. Length of
	 * the subarray is be odd, and the sum of all the elements of the subarray must
	 * be greater than B. Your task is to find the count of good subarrays in A.
	 * 
	 */
	public int solve(int[] A, int B) {

		int count = 0;

		int ps[] = new int[A.length];
		ps[0] = A[0];
		for (int i = 1; i < A.length; i++) {

			ps[i] = ps[i - 1] + A[i];
		}

		for (int i = 0; i < A.length; i++) {

			for (int j = i; j < A.length; j++) {

				int size = j - i + 1;
				int sum = i == 0 ? ps[j] : ps[j] - ps[i - 1];

				if (size % 2 == 0 && sum < B) {
					count++;
				} else if (size % 2 != 0 && sum > B) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodSubarray g = new GoodSubarray();
		System.out.println(g.solve(new int[] { 1, 2, 3, 4, 5 }, 4));

	}

}
