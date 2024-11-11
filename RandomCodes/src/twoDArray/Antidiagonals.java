package twoDArray;

public class Antidiagonals {

//	Give a N * N square matrix A, return an array of its anti-diagonals.
	public int[][] diagonal(int[][] A) {

		int totalRows = A[0].length + A.length - 1;
		int arr[][] = new int[totalRows][A[0].length];
		int ROW = 0;

		// looping over the 1st row
		for (int col = 0; col < A[0].length; col++) {

			int r = 0, c = col, i = 0;

			while (r < A.length && c >= 0) {

				arr[ROW][i] = A[r][c];
				r++;
				c--;
				i++;
			}
			ROW++;

		}

		// looping over the last column
		for (int row = 1; row < A.length; row++) {

			int r = row, c = A[0].length - 1, i = 0;

			while (r < A.length && c >= 0) {

				arr[ROW][i] = A[r][c];
				r++;
				c--;
				i++;
			}
			ROW++;

		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Antidiagonals a = new Antidiagonals();
		int arr[][] = a.diagonal(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j]);
			}
			System.out.println();

		}

	}

}
