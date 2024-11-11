package subArray;

public class SubarrayWithLeastAverage {

	/**
	 * Given an array of size N, find the starting index of the subarray of size K
	 * with the least average.
	 * 
	 */
	public int solve(int[] A, int B) {

		int left = 0, right = B - 1;
		float min = Integer.MAX_VALUE;
		float sum = 0;
		int idx = -1;
		for (int i = left; i <= right; i++) {

			sum += A[i];

		}
		float ave = sum / B;
		if (ave < min) {
			min = ave;
			idx = left;
		}
		left++;
		right++;
		while (right < A.length) {

			sum = sum + A[right] - A[left - 1];
			ave = sum / B;

			if (ave < min) {
				min = ave;
				idx = left;
			}

			left++;
			right++;
		}

		return idx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarrayWithLeastAverage s = new SubarrayWithLeastAverage();
		System.out.println(s.solve(new int[] { 20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 }, 9));
//		System.out.println(s.solve(new int[] { 3, 7, 5, 20, -10, 0, 12 }, 2));

	}

}
