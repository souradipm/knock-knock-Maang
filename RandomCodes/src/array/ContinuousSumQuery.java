package array;

public class ContinuousSumQuery {

	//TC:O(B+A) || SC:O(1)
	public int[] solve(int A, int[][] B) {

		int arr[] = new int[A];

		for (int i = 0; i < B.length; i++) {

			int l = B[i][0] - 1;
			int r = B[i][1] - 1;
			int p = B[i][2];

			arr[l] += p;

			if (r + 1 < A) {
				arr[r + 1] -= p;
			}

		}

		for (int j = 1; j < arr.length; j++) {

			arr[j] += arr[j - 1];

		}

		return arr;

	}

	public int[] solveBrute(int A, int[][] B) {

		int arr[] = new int[A];

		for (int i = 0; i < B.length; i++) {

			int l = B[i][0] - 1;
			int r = B[i][1] - 1;
			int p = B[i][2];

			for (int j = l; j <= r; j++) {

				arr[j] += p;

			}

		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContinuousSumQuery c = new ContinuousSumQuery();
		int arr[] = c.solve(5, new int[][] { { 1, 2, 10 }, { 2, 3, 20 }, { 2, 5, 25 } });

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
