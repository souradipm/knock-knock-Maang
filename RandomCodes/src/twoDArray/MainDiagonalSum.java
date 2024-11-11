package twoDArray;

public class MainDiagonalSum {

	public int solve(final int[][] A) {

		int sum = 0;
		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {

				if (i == j) {
					sum += A[i][j];
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
