package trees;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestDistanceBetweenNodesOfATree {

	class Pair {
		int dist;
		int node;

		public Pair(int x, int y) {
			dist = x;
			node = y;
		}
	}

	int root = 0;
	Pair ans;

	public int solve(int[] A) {

		ArrayList<Integer>[] g = createAdjList(A);
		boolean v[] = new boolean[A.length];

		ans = new Pair(-1, -1);

		dfs(root, 0, g, v);

		Arrays.fill(v, false);

		dfs(ans.node, 0, g, v);

		return ans.dist;
	}

	public void dfs(int src, int dist, ArrayList<Integer>[] g, boolean v[]) {

		v[src] = true;

		if (dist > ans.dist) {
			ans.dist = dist;
			ans.node = src;
		}

		for (int i : g[src]) {

			if (!v[i]) {

				dfs(i, dist + 1, g, v);

			}

		}

	}

	public ArrayList<Integer>[] createAdjList(int[] A) {

		ArrayList<Integer>[] g = new ArrayList[A.length];

		for (int i = 0; i < A.length; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < A.length; i++) {

			if (A[i] != -1) {

				g[i].add(A[i]);
				g[A[i]].add(i);

			} else {
				root = i;
			}

		}

		return g;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LargestDistanceBetweenNodesOfATree l = new LargestDistanceBetweenNodesOfATree();
		System.out.println(l.solve(new int[] { -1, 0 }));

	}

}
