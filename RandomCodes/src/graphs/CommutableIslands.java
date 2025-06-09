package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class CommutableIslands {

	int ans = 0;

	class Pair {

		int dist;
		int next;

		public Pair(int x, int y) {
			dist = x;
			next = y;
		}
	}

	public int solve(int A, int[][] B) {

		ArrayList<Pair>[] g = createAdjList(A, B);

		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);

		boolean[] v = new boolean[A + 1];
		Arrays.fill(v, false);

		int dist = 0;
		int count = 1;

		int startingNode = B[0][0];

		int ans = findDistFromNode(startingNode, dist, count, A, g, pq, v, true);

		return ans;

	}

	public int findDistFromNode(int s, int dist, int count, int A, ArrayList<Pair>[] g, PriorityQueue<Pair> pq,
			boolean[] v, boolean flag) {

		if (count == A) {
			ans = dist;
			return ans;
		}

		v[s] = true;

		for (int j = 0; j < g[s].size(); j++) {

			pq.add(g[s].get(j));

		}

		Pair nPair = null;
		int neighbor;

		while (!pq.isEmpty()) {

			nPair = pq.poll();
			neighbor = nPair.next;
			if (v[neighbor]) {
				continue;
			}

			count++;
			v[neighbor] = true;
			dist += nPair.dist;

			findDistFromNode(neighbor, dist, count, A, g, pq, v, true);

		}

		return ans;

	}

	public ArrayList<Pair>[] createAdjList(int A, int[][] B) {

		ArrayList<Pair>[] g = new ArrayList[A + 1];

		for (int i = 0; i <= A; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < B.length; i++) {

			g[B[i][0]].add(new Pair(B[i][2], B[i][1]));
			g[B[i][1]].add(new Pair(B[i][2], B[i][0]));

		}

		return g;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommutableIslands c = new CommutableIslands();
		System.out
				.println(c.solve(4, new int[][] { { 1, 2, 1 }, { 2, 3, 4 }, { 1, 4, 3 }, { 4, 3, 2 }, { 1, 3, 10 } }));
		System.out.println(c.solve(4, new int[][] { { 1, 2, 1 }, { 2, 3, 2 }, { 3, 4, 4 }, { 1, 4, 3 } }));

	}

}
