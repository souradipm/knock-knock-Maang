package twoDArray;

public class MatrixProduct {

	public int[][] solve(int[][] A, int B) {

		int arr[][] = new int[A.length][A[0].length];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				arr[i][j] = A[i][j] * B;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MatrixProduct m = new MatrixProduct();
		int A[][] = m.solve(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, 2);
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

	}

}
