package twoDArray;

public class MatrixSearch {

	public int solve(int[][] A, int B) {

		int r = 0, c = A[0].length - 1;
		int val = -1;

		while (r < A.length && c >= 0) {

			if (B < A[r][c]) {
				c--;
			} else if (B > A[r][c]) {
				r++;
			} else if (B == A[r][c]) {
				int tVal = (r + 1) * 1009 + (c + 1);
				val = val == -1 ? tVal : Math.min(tVal, val);
				c--;
			}

		}

		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixSearch m = new MatrixSearch();
		System.out.println(m.solve(new int[][] {{1,2,3},{4,5,6},{7,8,9}}, 2));
		System.out.println(m.solve(new int[][] { { 1, 2 }, { 3, 3 } }, 3));

	}

}
