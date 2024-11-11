package binarySearch;

import java.util.Arrays;

public class MinimumDifference {

	public int solve(int A, int B, int[][] C) {

		int ans = Integer.MAX_VALUE;

		// Sort each row of the matrix.
		for (int i = 0; i < A; i++) {
			Arrays.sort(C[i]);
		}

		// For each matrix element
		for (int i = 0; i < A - 1; i++) {
			for (int j = 0; j < B; j++) {
				// Search smallest element in the
				// next row which is greater than
				// or equal to the current element
				int p = bsearch(0, B - 1, C[i][j], C[i + 1]);
				ans = Math.min(ans, Math.abs(C[i + 1][p] - C[i][j]));

				// largest element which is smaller than the current
				// element in the next row must be just before
				// smallest element which is greater than or equal
				// to the current element because rows are sorted.
				if (p - 1 >= 0) {
					ans = Math.min(ans, Math.abs(C[i][j] - C[i + 1][p - 1]));
				}
			}
		}
		return ans;
	}

	// Return smallest element greater than
	// or equal to the current element.
	public int bsearch(int l, int r, int n, int[] A) {
		int ans = -1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (A[mid] == n) {
				return mid;
			} else if (A[mid] < n) {
				l = mid + 1;
			} else {
				ans = mid;
				r = mid - 1;
			}
		}
		// If the target n, is greater than all the array elements, the last element
		// in the sorted array is the closest element to n. Only in this case, ans is
		// unchanged. In this case, l gets incremented till length of array.
		return ans == -1 ? l - 1 : ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumDifference m = new MinimumDifference();
		System.out.println(m.solve(2, 2, new int[][] { { 8, 4 }, { 6, 8 } }));

	}

}
