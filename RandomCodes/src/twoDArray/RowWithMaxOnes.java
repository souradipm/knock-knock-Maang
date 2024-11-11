package twoDArray;

public class RowWithMaxOnes {

	public int solve(int[][] A) {

//		int row = 0, col = A[0].length - 1;
//		int ans = 0;
//		int count = 0;
//		int max = Integer.MIN_VALUE;
//		while (row < A.length && col >= 0) {
//
//			if (A[row][col] == 1) {
//				col--;
//				count++;
//				if (count > max) {
//					max = count;
//					ans = row;
//				}
//			} else {
//				row++;
//			}
//
//		}

		int row = 0, col = A[0].length - 1;
		int ans = 0;
		while (row < A.length && col >= 0) {

			while (col >= 0 && A[row][col] == 1) {
				col--;
				ans = row;
			}
			row++;

		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RowWithMaxOnes r = new RowWithMaxOnes();
		System.out.println(r.solve(new int[][] { { 0, 1, 1 }, { 0, 0, 1 }, { 1, 1, 1 } }));
		System.out.println(r.solve(new int[][] { { 0, 0, 0, 0 }, { 0, 0, 0, 1 }, { 0, 0, 1, 1 }, { 0, 1, 1, 1 } }));
	}

}
