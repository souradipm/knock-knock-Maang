package graphs;

/*
 * Similar to the Number of Island Problem
 */
public class BlackShapes {

	public int black(String[] A) {

		int row = A.length;
		int col = A[0].length();
		int count = 0;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				if (A[i].charAt(j) == 'X') {
					count++;
					dfs(A, i, j);
				}
			}
		}

		return count;
	}

	public void dfs(String[] A, int i, int j) {

		if (i < 0 || i > A.length - 1 || j < 0 || j > A[0].length() - 1 || A[i].charAt(j) == 'O'
				|| A[i].charAt(j) == 'Z') {
			return;
		}

		String str = A[i];
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(j, 'Z');
		A[i] = sb.toString();

		dfs(A, i + 1, j);
		dfs(A, i - 1, j);
		dfs(A, i, j + 1);
		dfs(A, i, j - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String []A = new String[] {"XXX","XXX","XXX"};
		String[] A = new String[] { "XO", "OX" };
		BlackShapes b = new BlackShapes();
		System.out.println(b.black(A));

	}

}
