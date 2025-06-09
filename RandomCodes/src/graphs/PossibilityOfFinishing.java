package graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class PossibilityOfFinishing {

	public int solve(int A, int[] B, int[] C) {

		ArrayList<Integer>[] g = createAdjList(A, B, C);

		boolean[] v = new boolean[A + 1];
		Arrays.fill(v, false);

		int[] st = new int[A + 1];
		Arrays.fill(st, 0);

		return detectCycle(g, v, st) ? 0 : 1;
	}

	public boolean detectCycle(ArrayList<Integer>[] g, boolean[] v, int[] st) {

		for (int i = 1; i <= g.length; i++) {

			if (!v[i] && dfs(i, g, v, st)) {
				return true;
			}

		}

		return false;

	}

	public boolean dfs(int s, ArrayList<Integer>[] g, boolean[] v, int[] st) {

		v[s] = true;
		st[s] = 1;

		for (int i = 0; i < g[s].size(); i++) {

			int neighbor = g[s].get(i);

			if (!v[neighbor] && dfs(neighbor, g, v, st)) {
				return true;
			}

			if (st[neighbor] == 1) {
				return true;
			}

		}

		st[s] = 0;

		return false;

	}

	public ArrayList<Integer>[] createAdjList(int A, int[] B, int[] C) {

		ArrayList<Integer>[] g = new ArrayList[A + 1];

		for (int i = 0; i <= A; i++) {

			g[i] = new ArrayList<Integer>();

		}

		for (int i = 0; i < B.length; i++) {

			int from = B[i];
			int to = C[i];
			g[from].add(to);

		}

		return g;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PossibilityOfFinishing p = new PossibilityOfFinishing();
		System.out.println(p.solve(3, new int[] {1,2,3}, new int [] {2,3,1}));

	}

}
