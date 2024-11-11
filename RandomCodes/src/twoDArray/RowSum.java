package twoDArray;

public class RowSum {

	public int[] solve(int[][] A) {

		int arr[] = new int[A.length];

		for (int i = 0; i < A.length; i++) {

			int t = 0;

			for (int j = 0; j < A[i].length; j++) {

				t += A[i][j];

			}
			arr[i] = t;
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RowSum r = new RowSum();
		int arr[] = r.solve(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 2, 3, 4 } });
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
