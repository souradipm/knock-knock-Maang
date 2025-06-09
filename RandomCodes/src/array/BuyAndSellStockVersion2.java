package array;

public class BuyAndSellStockVersion2 {

	/**
	 * Given stock prices, return when to buy and sell the stock for max profit
	 * return array [i,j] where i is buy and j is sell
	 * 
	 * @param arr
	 */
	public int[] solve(int[] arr) {

		if (arr == null || arr.length < 2) {
			return new int[] {};
		}

		int ans[] = new int[2];

		int maxProfit = 0;
		int minPrice = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < minPrice) {
				minPrice = arr[i];
				ans[0] = minPrice;
			} else {

				if (arr[i] - minPrice > maxProfit) {
					maxProfit = arr[i] - minPrice;
					ans[1] = arr[i];
				}

				maxProfit = Math.max(maxProfit, arr[i] - minPrice);

			}

		}

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
