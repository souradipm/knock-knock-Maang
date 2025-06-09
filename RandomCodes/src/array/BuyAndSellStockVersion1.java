package array;

public class BuyAndSellStockVersion1 {

	/*
	 * Return the max profit after buying and selling a stock
	 */
	public int solve(int[] arr) {
		
		if(arr==null || arr.length<2) {
			return 0;
		}

		int maxP = 0;
		int minPrice = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < minPrice) {
				minPrice = arr[i];
			} else {

				maxP = Math.max(maxP, arr[i] - minPrice);

			}

		}

		return maxP;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BuyAndSellStockVersion1 b = new BuyAndSellStockVersion1();
		System.out.println(b.solve(new int[] { 7, 1, 5, 3, 6, 4 }));

	}

}
