package array;

public class PrefixSum {

	public long[] rangeSum(int[] A, int[][] B) {

		long pf[] = new long[A.length];

		pf[0] = A[0];
		for (int i = 1; i < A.length; i++) {

			pf[i] = pf[i - 1] + A[i];

		}

		long arr[] = new long[B.length];
		for (int j = 0; j < B.length; j++) {

			int l = B[j][0];
			int r = B[j][1];
			long sum = 0;
			if (l == 0) {
				sum += pf[r];
			} else {
				sum += pf[r] - pf[l - 1];
			}
			arr[j] = sum;

		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrefixSum p = new PrefixSum();
//		long [] arr = p.rangeSum(new int[] {1,2,3,4,5}, new int[][] {{0,3},{1,2}});
		long[] arr = p.rangeSum(new int[] { 2, 2, 2 }, new int[][] { { 0, 0 }, { 1, 2 } });
		for (long l : arr) {
			System.out.println(l);
		}

	}

}
