package array;

public class BuySellStock {

	public int maxProfit(final int[] A) {

		if (A.length < 1) {
			return 0;
		}
		
		int maxProfit = 0;
		int max = A[A.length - 1];

		for (int i = A.length - 2; i >= 0; i--) {

			max = Math.max(max, A[i]);
			maxProfit = Math.max(maxProfit, max - A[i]);

		}
		return maxProfit;

	}

	public int maxProfit1(final int[] A) {

		if (A.length < 1) {
			return 0;
		}

		int min = A[0];
		int idx = 0;
		int maxDiff = Integer.MIN_VALUE;
		for (int i = 1; i < A.length; i++) {
			if (A[i] < min) {
				min = A[i];
				idx = i;
			}
		}

		for (int i = idx; i < A.length; i++) {

			int diff = A[i] - min;
			maxDiff = Math.max(maxDiff, diff);

		}

		return maxDiff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuySellStock b = new BuySellStock();
		System.out.println(b.maxProfit(new int[] { 1, 4, 5, 2, 4 }));
		System.out.println(b.maxProfit(new int[] { 1, 2 }));

	}

}
