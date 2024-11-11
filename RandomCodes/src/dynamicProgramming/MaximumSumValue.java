package dynamicProgramming;

public class MaximumSumValue {

	/*
	 * Efficient approach - For every element find left max * b & right max d then
	 * find the ans will be Max of leftmax b + rightmax d + a[i] c
	 */
	public int solve(int[] A, int B, int C, int D) {

		int n = A.length;
		int l[] = new int[n];
		l[0] = B * A[0];
		for (int i = 1; i < n; i++) {
			l[i] = Math.max(l[i - 1], B * A[i]);
		}

		int r[] = new int[n];
		r[n - 1] = D * A[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			r[i] = Math.max(r[i + 1], D * A[i]);
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, l[i] + r[i] + C * A[i]);
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSumValue m = new MaximumSumValue();
		System.out.println(m.solve(new int[] { 1, 5, -3, 4, -2 }, 2, 1, -1));

	}

}
