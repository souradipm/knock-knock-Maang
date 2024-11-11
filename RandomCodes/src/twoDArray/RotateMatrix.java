package twoDArray;

public class RotateMatrix {

//	Rotate = Transpose + ReverseRow
	public int[][] solve(int[][] A) {

		int temp[][] = transpose(A);
		int rotate[][] = reverseRow(temp);

		return rotate;

	}

	public int[][] transpose(int[][] A) {

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;

			}
		}

		return A;
	}

	public int[][] reverseRow(int[][] A) {

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length / 2; j++) {

				int temp = A[i][j];
				A[i][j] = A[i][A.length - 1 - j];
				A[i][A.length - 1 - j] = temp;

			}

		}

		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateMatrix r = new RotateMatrix();
		int arr[][] = r.solve(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
