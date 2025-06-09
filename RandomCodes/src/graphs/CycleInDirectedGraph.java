package graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class CycleInDirectedGraph {

	public int solve(int A, int[][] B) {

		ArrayList<Integer>[] g = createAdjList(A, B);

		boolean[] v = new boolean[A + 1];
		Arrays.fill(v, false);

		int[] st = new int[A + 1];
		Arrays.fill(st, 0);

		boolean ans = detectCycle(g, A, v, st);

		return ans ? 1 : 0;
	}

	public boolean detectCycle(ArrayList<Integer>[] g,int A, boolean[] v, int[] st) {

		for (int i = 1; i < g.length; i++) {
			
			if (!v[i] && dfs(i, A, v, g, st)) {

				return true;

			}

		}
		
		return false;

	}

	public boolean dfs(int s, int A, boolean[] v, ArrayList<Integer>[] g, int[] st) {

		v[s] = true;
		st[s] = 1;

		for (int i = 0; i < g[s].size(); i++) {

			int neighbor = g[s].get(i);

			if (!v[neighbor] && dfs(neighbor, A, v, g, st)) {

				return true;

			}

			if (st[neighbor] == 1) {
				return true;
			}

		}

		st[s] = 0;

		return false;

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

	}

}
