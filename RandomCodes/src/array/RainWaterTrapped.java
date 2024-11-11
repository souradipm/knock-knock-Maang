package array;

public class RainWaterTrapped {

	// TC:O(N) || SC:O(1)
	public int trapSpaceOptimised(final int[] A) {

		int l = 0, r = A.length - 1;
		int lMax = A[0];
		int rMax = A[A.length - 1];
		int ans = 0;

		while (l < r) {

			int water = 0;
			if (lMax < rMax) {

				l++;
				water = lMax - A[l];
				lMax = Math.max(lMax, A[l]);

			} else {
				r--;
				water = rMax - A[r];
				rMax = Math.max(rMax, A[r]);
			}

			if (water > 0) {
				ans += water;
			}

		}

		return ans;
	}

	// TC:O(N) || SC:O(N)
	public int trapTimeOptimised(final int[] A) {

		int ans = 0;
		int lMax[] = new int[A.length];
		lMax[0] = 0;
		int rMax[] = new int[A.length];
		rMax[A.length-1] = 0;

		for (int i = 1; i < A.length - 1; i++) {

			lMax[i] = Math.max(lMax[i - 1], A[i - 1]);

		}

		for (int i = A.length - 2; i >= 0; i--) {

			rMax[i] = Math.max(rMax[i + 1], A[i + 1]);

		}

		for (int i = 1; i < A.length - 1; i++) {

			int water = Math.min(lMax[i], rMax[i]) - A[i];
			if (water > 0) {
				ans += water;
			}

		}

		return ans;
	}

	// TC:O(N^2) || SC:O(1)
	public int trapBrute(final int[] A) {

		int ans = 0;
		for (int i = 1; i < A.length - 1; i++) {

			int maxL = findMax(A, 0, i - 1);
			int maxR = findMax(A, i + 1, A.length - 1);
			int water = Math.min(maxL, maxR) - A[i];
			if (water > 0) {
				ans += water;
			}

		}

		return ans;
	}

	public int findMax(int[] A, int s, int e) {

		int max = Integer.MIN_VALUE;
		for (int i = s; i <= e; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}
		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RainWaterTrapped r = new RainWaterTrapped();
//		System.out.println(r.trapBrute(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
//		System.out.println(r.trapTimeOptimised(new int[] { 0, 1, 0, 2 }));
//		System.out.println(r.trapTimeOptimised(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
		System.out.println(r.trapSpaceOptimised(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));

	}

}
