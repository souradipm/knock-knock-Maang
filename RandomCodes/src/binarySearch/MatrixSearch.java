package binarySearch;

public class MatrixSearch {

	public int searchMatrix(int[][] A, int B) {

		int r = 0, c = A[0].length - 1;

		while (r < A.length && c >= 0) {

			if (A[r][c] == B) {
				return 1;
			} else if (A[r][c] > B) {
				c--;
			} else {
				r++;
			}

		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixSearch m = new MatrixSearch();
//		System.out.println(m.searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } }, 100));
		System.out.println(m.searchMatrix(new int[][] {{1}}, 2));

	}

}
