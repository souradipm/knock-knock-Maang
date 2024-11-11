package array;

public class PickFromBothSides {

	public int solve(int[] A, int B) {

		int ans = 0;

		int ps[] = new int[A.length];
		int ss[] = new int[A.length];

		ps[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			ps[i] = ps[i - 1] + A[i];
		}
		ss[A.length - 1] = A[A.length - 1];
		for (int j = A.length - 2; j >= 0; j--) {
			ss[j] = ss[j + 1] + A[j];
		}

		ans = Math.max(ps[B - 1], ss[A.length - B]);
		int sum = 0;
		for (int i = 1; i < B; i++) {

			sum = ps[i - 1] + ss[A.length - B + i];
			ans = Math.max(ans, sum);

		}

		return ans;
	}

	public int solve1(int[] A, int B) {

		int max = Integer.MIN_VALUE;
		int left = 0;
		int right = A.length - B;

		while (left < B) {
			int sum = 0;
			int i;
			for (i = 0; i < left; i++) {
				sum += A[i];
			}
			for (int j = A.length - 1; j >= right; j--) {
				sum += A[j];
			}
			if (sum > max) {
				max = sum;
			}

			left++;
			right++;

		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PickFromBothSides p = new PickFromBothSides();
//		System.out.println(p.solve(new int[] { 5, -2, 3, 1, 2 }, 3));
//		System.out.println(p.solve(new int[] { 2, 3, -1, 4, 2, 1 }, 4));

		System.out.println(p.solve(new int[] { 2, 3, 4, 3, 4, 4, 1 }, 6));

	}

}
