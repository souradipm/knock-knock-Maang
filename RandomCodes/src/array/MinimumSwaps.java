package array;

public class MinimumSwaps {

	/**
	 * Given an array of integers A and an integer B, find and return the minimum
	 * number of swaps required to bring all the numbers less than or equal to B
	 * together.
	 * 
	 * Note: It is possible to swap any two elements, not necessarily consecutive.
	 * 
	 */

	public int solve(int[] A, int B) {

		int minSwap = 0;
		int window = countNumberLessThanEqualtoB(A, B);
		if (window <= 1) {
			return 0;
		} else {

			int l = 0, r = 0, count = 0;
			while (r < window) {
				if (A[r] > B) {
					count++;
				}
				r++;
			}
			minSwap = count;
			while (r < A.length) {

				if (A[r] > B) {
					count++;
				}
				if (A[l] > B) {
					count--;
				}
				minSwap = Math.min(minSwap, count);
				l++;
				r++;
			}

		}
		return minSwap;

	}

	public int countNumberLessThanEqualtoB(int[] A, int B) {

		int count = 0;
		for (int a : A) {
			if (a <= B) {
				count++;
			}
		}
		return count;
	}

//	public int solve1(int[] A, int B) {
//
//		int window = countNumberLessThanEqualtoB(A, B);
//		int i = 0;
//		int j = i + window;
//		int swapCount = Integer.MAX_VALUE;
//		while (j <= A.length) {
//
//			int count = countNumberGreaterThanEqualtoB(A, i, j, B);
//			swapCount = Math.min(swapCount, count);
//			i++;
//			j++;
//
//		}
//
//		return swapCount;
//	}
//
//	public int countNumberGreaterThanEqualtoB(int[] A, int l, int r, int B) {
//
//		int count = 0;
//		for (int i = l; i < r; i++) {
//			if (A[i] > B) {
//				count++;
//			}
//		}
//		return count;
//
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumSwaps m = new MinimumSwaps();
		System.out.println(m.solve(new int[] { 5, 17, 100, 11 }, 20));
		System.out.println(m.solve(new int[] { 1, 12, 10, 3, 14, 10, 5 }, 8));

	}

}
