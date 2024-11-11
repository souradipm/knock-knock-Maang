package twoDArray;

public class RowToColZero {

	public int[][] solve(int[][] A) {

		// go through the rows
		for (int row = 0; row < A.length; row++) {

			int flag = 0;
			for (int col = 0; col < A[row].length; col++) {

				if (A[row][col] == 0) {
					flag = 1;
				}
			}

			if (flag == 1) {

				for (int col = 0; col < A[row].length; col++) {
					if (A[row][col] != 0) {
						A[row][col] = -1;
					}
				}
			}
		}

		// go through the columns

		for (int col = 0; col < A[0].length; col++) {

			int flag = 0;
			for (int row = 0; row < A.length; row++) {

				if (A[row][col] == 0) {
					flag = 1;
				}

			}
			if (flag == 1) {
				for (int row = 0; row < A.length; row++) {
					if (A[row][col] != 0) {
						A[row][col] = -1;
					}
				}
			}
		}

		// go through the entire matrix and replace -1 with 0

		for (int row = 0; row < A.length; row++) {
			for (int col = 0; col < A[row].length; col++) {

				if (A[row][col] == -1) {
					A[row][col] = 0;
				}
			}
		}
		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RowToColZero r = new RowToColZero();
		int arr[][] = r.solve(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 0 }, { 9, 2, 0, 4 } });

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {

				System.out.print(arr[row][col]+" ");

			}
			System.out.println();

		}

	}

}
