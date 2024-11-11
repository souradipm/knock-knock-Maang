package dynamicProgramming;

public class DungeonPrincess {

	public int calculateMinimumHP(int[][] A) {

		int row = A.length;
		int col = A[0].length;
		int dp[][] = new int[row][col];

		for (int i = row - 1; i >= 0; i--) {

			for (int j = col - 1; j >= 0; j--) {

				if (i == row - 1 && j == col - 1) {

					if (A[i][j] < 0) {
						dp[i][j] = Math.abs(A[i][j]) + 1;
					} else {
						dp[i][j] = 1;
					}

				} else if (i == row - 1) {
					dp[i][j] = (dp[i][j + 1] - A[i][j]) > 0 ? (dp[i][j + 1] - A[i][j]) : 1;

				} else if (j == col - 1) {

					dp[i][j] = (dp[i + 1][j] - A[i][j]) > 0 ? (dp[i + 1][j] - A[i][j]) : 1;
				} else {

					dp[i][j] = (Math.min(dp[i + 1][j], dp[i][j + 1]) - A[i][j]) > 0
							? (Math.min(dp[i + 1][j], dp[i][j + 1]) - A[i][j])
							: 1;
				}

			}

		}

		return dp[0][0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DungeonPrincess d = new DungeonPrincess();
//		System.out.println(d.calculateMinimumHP(new int[][] { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } }));
//		System.out.println(d.calculateMinimumHP(new int[][] { { 1, -1, 0 }, { -1, 1, -1 }, { 1, 0, -1 } }));

		System.out.println(d.calculateMinimumHP(
				new int[][] { { -3, 2, 4, -5 }, { -6, 5, -4, 6 }, { -15, -7, 5, -2 }, { 2, 10, -3, -4 } }));

	}

}
