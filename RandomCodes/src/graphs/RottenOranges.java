package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

	public int solve(int[][] A) {

		int n = A.length;
		int m = A[0].length;

		Queue<int[]> q = new LinkedList<>();
		int dir[] = new int[] { 0, 1, 0, -1, 0 };

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[0].length; j++) {

				if (A[i][j] == 2) {
					q.add(new int[] { i, j, 0 });
				}

			}

		}

		int time = 0;

		while (!q.isEmpty()) {

			int[] cell = q.poll();
			int r = cell[0];
			int c = cell[1];
			time = Math.max(time, cell[2]);

			for (int i = 0; i < dir.length - 1; i++) {

				int nR = r + dir[i];
				int nC = c + dir[i + 1];
				if (nR >= 0 && nR < n && nC >= 0 && nC < m && A[nR][nC] == 1) {
					A[nR][nC] = 2;
					q.add(new int[] { nR, nC, time + 1 });
				}

			}

		}

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[0].length; j++) {

				if (A[i][j] == 1) {
					return -1;
				}

			}

		}

		return time;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RottenOranges r = new RottenOranges();
		System.out.println(r.solve(new int[][] {{2,1,1},{1,1,0},{0,1,1}}));
		System.out.println(r.solve(new int[][] {{2,1,1},{0,1,1},{1,0,1}}));

	}

}
