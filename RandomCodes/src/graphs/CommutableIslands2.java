package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class CommutableIslands2 {

	class Pair {

		int dist;
		int next;

		public Pair(int x, int y) {
			dist = x;
			next = y;
		}
	}

	public int solve(int A, int[][] B) {

		int ans = 0;
		ArrayList<Pair>[] g = createAdjList(A, B);

		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);

		boolean[] v = new boolean[A + 1];
		Arrays.fill(v, false);

		int source = B[0][0];
		Pair p = new Pair(B[0][2], B[0][1]);
		pq.add(p);
		v[source] = true;

		for (int i = 0; i < g[source].size(); i++) {
			pq.add(new Pair(g[source].get(i).dist, g[source].get(i).next));
		}

		while (!pq.isEmpty()) {

			Pair p1 = pq.poll();
			int neighbor = p1.next;
			if (v[neighbor]) {
				continue;
			}

			v[neighbor] = true;
			ans += p1.dist;

			for (int i = 0; i < g[neighbor].size(); i++) {

				int nextNode = g[neighbor].get(i).next;
				if (!v[nextNode]) {
					pq.add(g[neighbor].get(i));
				}

			}

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

		CommutableIslands2 c = new CommutableIslands2();
		System.out
				.println(c.solve(4, new int[][] { { 1, 2, 1 }, { 2, 3, 4 }, { 1, 4, 3 }, { 4, 3, 2 }, { 1, 3, 10 } }));
		System.out.println(c.solve(4, new int[][] { { 1, 2, 1 }, { 2, 3, 2 }, { 3, 4, 4 }, { 1, 4, 3 } }));

	}

}
