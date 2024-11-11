package twoDArray;

public class SpiralOrderMatrix {

	public int[][] generateMatrix(int A) {

		int val = 1;
		int r = 0, c = 0;
		int arr[][] = new int[A][A];

		while (A > 1) {

			for (int i = 0; i < A - 1; i++) {
				arr[r][c] = val++;
				c++;
			}

			for (int i = 0; i < A - 1; i++) {
				arr[r][c] = val++;
				r++;
			}

			for (int i = 0; i < A - 1; i++) {
				arr[r][c] = val++;
				c--;
			}

			for (int i = 0; i < A - 1; i++) {
				arr[r][c] = val++;
				r--;
			}

			r++;
			c++;
			A -= 2;

		}
		if (A == 1) {
			arr[r][c] = val;
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpiralOrderMatrix s = new SpiralOrderMatrix();
		int arr[][] = s.generateMatrix(5);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
