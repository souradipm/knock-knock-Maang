package graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class PathInDirectedGraph {
	
	//1.Build adj list
	//2.create visited array
	//3.Check every neighbor and do dfs on each unvisited neighbor

	public int solve(int A, int[][] B) {

		ArrayList<Integer>[] g = createAdjList(A, B);

		boolean[] v = new boolean[A + 1];

		Arrays.fill(v, false);

		return dfs(1, A, g, v);

	}

	public int dfs(int s, int A, ArrayList<Integer>[] g, boolean[] v) {

		v[s] = true;

		if (s == A) {
			return 1;
		}

		for (int i = 0; i < g[s].size(); i++) {

			int neighbor = g[s].get(i);

			if (!v[neighbor]) {

				if (dfs(neighbor, A, g, v) == 1) {
					return 1;
				}

			}

		}

		return 0;

	}

	public ArrayList<Integer>[] createAdjList(int A, int[][] B) {

		ArrayList<Integer>[] g = new ArrayList[A + 1];
		for (int i = 0; i <= A; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < B.length; i++) {

			int from = B[i][0];
			int to = B[i][1];

			g[from].add(to);

		}

		return g;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PathInDirectedGraph p = new PathInDirectedGraph();

		int[][] B = new int[][] { { 1, 2 }, { 4, 1 }, { 2, 4 }, { 3, 4 }, { 5, 2 }, { 1, 3 } };

		System.out.println(p.solve(5, B));

	}

}
