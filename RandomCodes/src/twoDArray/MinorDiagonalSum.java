package twoDArray;

public class MinorDiagonalSum {

	public int solve(final int[][] A) {

		int M = A.length;
		int sum = 0;

		for (int i = 0; i < M; i++) {

			for (int j = 0; j < A[i].length; j++) {

				if ((i + 1) + (j + 1) == M + 1) {
					sum += A[i][j];
				}

			}

		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinorDiagonalSum m = new MinorDiagonalSum();
		System.out.println(m.solve(new int[][] { { 1, -2, -3 }, { -4, 5, -6 }, { -7, -8, 9 } }));
		System.out.println(m.solve(new int[][] { { 3, 2 }, { 2, 3 } }));

	}

}
