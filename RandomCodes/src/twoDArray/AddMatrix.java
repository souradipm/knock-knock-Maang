package twoDArray;

public class AddMatrix {

	public int[][] solve(int[][] A, int[][] B) {

		int arr[][] = new int[A.length][A[0].length];
		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {

				arr[i][j] = A[i][j] + B[i][j];

			}

		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddMatrix a = new AddMatrix();
		int A[][] = a.solve(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
				new int[][] { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } });
		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {

				System.out.print(A[i][j] + " ");

			}
			System.out.println();

		}

	}

}
