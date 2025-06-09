package graphs;

public class KnightOnChessBoard {

	int count = -1;
	int maxC = Integer.MAX_VALUE;

	public int knight(int A, int B, int C, int D, int E, int F) {

		boolean v[][] = new boolean[A + 1][B + 1];
//		Arrays.fill(v, false);

		if (C == E && D == F) {
			return count;
		}

		findNext(C, D, A, B, E, F, v, count);

		return maxC == Integer.MAX_VALUE ? -1 : maxC;
	}

	public void findNext(int row, int col, int A, int B, int E, int F, boolean[][] v, int count) {

		if (row < 1 || row > A || col < 1 || col > B || v[row][col]) {
			count--;
			return;
		}


		if (row == E && col == F) {

			maxC = Math.min(maxC, count);
			return;

		}

		v[row][col] = true;

		findNext(row + 1, col + 2, A, B, E, F, v, count+1);
		findNext(row + 2, col + 1, A, B, E, F, v, count+1);
		findNext(row - 1, col + 2, A, B, E, F, v, count+1);
		findNext(row - 2, col + 1, A, B, E, F, v, count+1);
		findNext(row - 2, col - 1, A, B, E, F, v, count+1);
		findNext(row - 1, col - 2, A, B, E, F, v, count+1);
		findNext(row + 1, col - 2, A, B, E, F, v, count+1);
		findNext(row + 2, col - 1, A, B, E, F, v, count+1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KnightOnChessBoard k = new KnightOnChessBoard();
		System.out.println(k.knight(8, 8, 1, 1, 8, 8));
//		System.out.println(k.knight(2, 4, 2, 1, 4, 4));

	}

}
