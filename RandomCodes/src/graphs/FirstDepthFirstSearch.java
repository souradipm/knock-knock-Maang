package graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDepthFirstSearch {

	public int solve(int[] A, final int B, final int C) {

		ArrayList<Integer>[] graph = createGraph(A);

		boolean[] visited = new boolean[A.length + 1];
		Arrays.fill(visited, false);

		boolean ans = checkPath(B, C, visited, graph);

		return ans ? 1 : 0;
	}

	public boolean checkPath(int b, int c, boolean[] visited, ArrayList<Integer>[] graph) {

		visited[c] = true;
		if (b == c) {
			return true;
		}

		if (!graph[c].isEmpty()) {

			for (int i = 0; i < graph[c].size(); i++) {

				int newTown = graph[c].get(i);
				if (!visited[newTown]) {
					if (checkPath(b, newTown, visited, graph)) {
						return true;
					}
				}

				if (newTown == b) {
					return true;
				}

			}

		}

		return false;
	}

	public ArrayList<Integer>[] createGraph(int[] A) {

		int N = A.length;
		ArrayList<Integer>[] g = new ArrayList[N + 1];

		for (int i = 0; i <= N; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 1; i < N; i++) {
			int from = A[i];
			int to = i + 1;
			g[from].add(to);
		}

		return g;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
