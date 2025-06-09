package graphs;

public class NumberOfIslands {

	public int solve(int[][] A) {

		int row = A.length;
		int col = A[0].length;

		int count = 0;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				if (A[i][j] == 1) {

					count++;
					dfs(A, i, j);

				}

			}

		}

		return count;
	}

	public void dfs(int[][] A, int i, int j) {

		if (i < 0 || i > A.length - 1 || j < 0 || j > A[0].length - 1 || A[i][j] == 2 || A[i][j] == 0) {
			return;
		}
		A[i][j] = 2;
		dfs(A, i + 1, j);
		dfs(A, i - 1, j);
		dfs(A, i, j + 1);
		dfs(A, i, j - 1);
		dfs(A, i + 1, j + 1);
		dfs(A, i + 1, j - 1);
		dfs(A, i - 1, j + 1);
		dfs(A, i - 1, j - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
