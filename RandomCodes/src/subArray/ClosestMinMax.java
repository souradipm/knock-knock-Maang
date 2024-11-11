package subArray;

/**
 * Given an array A, find the size of the smallest subarray such that it
 * contains at least one occurrence of the maximum value of the array
 * and at least one occurrence of the minimum value of the array.
 * 
 *
 */
public class ClosestMinMax {

	public int solve(int[] A) {

		int max = maxValue(A);
		int min = minValue(A);
		if(max == min) {
			return 1;
		}
		int minIdx = -1;
		int maxIdx = -1;
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == max) {
				
				maxIdx = i;
				if (minIdx != -1) {
					int len = i - minIdx + 1;
					if (ans > len) {
						ans = len;
					}
				}
			} else if (A[i] == min) {

				minIdx = i;
				if (maxIdx != -1) {
					int len = i - maxIdx + 1;
					if (ans > len) {
						ans = len;
					}
				}
			}
		}
		return ans;
	}

	public int maxValue(int[] A) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= max) {
				max = A[i];
			}
		}
		return max;
	}

	public int minValue(int[] A) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= min) {
				min = A[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClosestMinMax c = new ClosestMinMax();
//		System.out.println(c.solve(new int[] { 1, 3, 2 }));
//		System.out.println(c.solve(new int[] { 2, 6, 1, 6, 9 }));
		System.out.println(c.solve(new int[] { 4,4,4,4 }));
	}

}
