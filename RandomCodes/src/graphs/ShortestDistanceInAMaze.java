package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceInAMaze {

	class Point {
		int x;
		int y;
		int steps;

		public Point(int r, int c, int step) {
			x = r;
			y = c;
			steps = step;
		}
	}

	public int solve(int[][] A, int[] B, int[] C) {

		int n = A.length;
		int m = A[0].length;

		boolean visited[][] = new boolean[n][m];

		Queue<Point> q = new LinkedList<>();
		int dir[] = new int[] { 0, 1, 0, -1, 0 };

		q.add(new Point(B[0], B[1], 0));

		while (!q.isEmpty()) {

			Point currP = q.poll();
			int currR = currP.x;
			int currC = currP.y;

			if (currR == C[0] && currC == C[1]) {
				return currP.steps;
			}

			for (int i = 0; i < dir.length - 1; i++) {

				int nRow = currR;
				int nCol = currC;
				int step = currP.steps;

				while (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && A[nRow][nCol] == 0) {

					nRow += dir[i];
					nCol += dir[i + 1];
					step++;

				}

				nRow -= dir[i];
				nCol -= dir[i + 1];
				step--;

				if (!visited[nRow][nCol]) {
					q.add(new Point(nRow, nCol, step));
					visited[nRow][nCol] = true;
				}

			}

		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShortestDistanceInAMaze s = new ShortestDistanceInAMaze();
		System.out.println(s.solve(new int[][] { { 0, 0 }, { 0, 0 } }, new int[] { 0, 0 }, new int[] { 0, 1 }));
		System.out.println(s.solve(new int[][] { { 0, 1 }, { 1, 0 } }, new int[] { 0, 0 }, new int[] { 1, 1 }));

	}

}
