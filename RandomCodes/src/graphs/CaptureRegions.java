package graphs;

import java.util.ArrayList;

public class CaptureRegions {

	public void solve(ArrayList<ArrayList<Character>> a) {

		int r = a.size();
		int c = a.get(0).size();

		for (int i = 0; i < r; i++) {
			if (a.get(i).get(0) == 'O') {
				dfs(a, i, 0, r, c);
			}
			if (a.get(i).get(c - 1) == 'O') {
				dfs(a, i, c - 1, r, c);
			}

		}

		for (int j = 0; j < c; j++) {

			if (a.get(0).get(j) == 'O') {
				dfs(a, 0, j, r, c);
			}

			if (a.get(r - 1).get(j) == 'O') {
				dfs(a, r - 1, j, r, c);
			}

		}

		for (int i = 0; i < r; i++) {

			for (int j = 0; j < c; j++) {

				if (a.get(i).get(j) == 'O') {
					a.get(i).set(j, 'X');
				}

				if (a.get(i).get(j) == 'S') {
					a.get(i).set(j, 'O');
				}

			}
		}

	}

	public void dfs(ArrayList<ArrayList<Character>> a, int i, int j, int row, int col) {

		if (i < 0 || i > row - 1 || j < 0 || j > col - 1 || a.get(i).get(j) != 'O') {
			return;
		}

		a.get(i).set(j, 'S');
		dfs(a, i + 1, j, row, col);
		dfs(a, i - 1, j, row, col);
		dfs(a, i, j + 1, row, col);
		dfs(a, i, j - 1, row, col);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
