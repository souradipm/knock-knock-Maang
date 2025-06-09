package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AnotherBFS {

	class Pair {
		int node;
		int dist;

		public Pair(int x, int y) {
			node = x;
			dist = y;
		}
	}

	public int solve(int A, int[][] B, int C, int D) {
		
		if(C==D) {
			return 0;
		}

		ArrayList<ArrayList<Integer>> g = createAdjList(A, B);

		boolean v[] = new boolean[g.size()];
		Arrays.fill(v, false);

		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(C, 0));
		v[C] = true;

		while (!q.isEmpty()) {

			Pair p = q.poll();
			int cNode = p.node;
			int d = p.dist;

			for (int i = 0; i < g.get(cNode).size(); i++) {

				int neighbor = g.get(cNode).get(i);

				if (!v[neighbor]) {

					if (neighbor == D) {
						return d + 1;
					}

					q.add(new Pair(neighbor, d + 1));
					v[neighbor] = true;

				}

			}

		}

		return -1;
	}

	public ArrayList<ArrayList<Integer>> createAdjList(int A, int[][] B) {

		ArrayList<ArrayList<Integer>> g = new ArrayList<>();

		for (int i = 0; i < A; i++) {
			g.add(i, new ArrayList<Integer>());
		}

		int size = A;

		for (int i = 0; i < B.length; i++) {

			int from = B[i][0];
			int to = B[i][1];
			int wt = B[i][2];

			if (wt == 2) {

				int dummy = size;
				g.add(dummy, new ArrayList<Integer>());

				g.get(from).add(dummy);
				g.get(dummy).add(from);
				g.get(dummy).add(to);
				g.get(to).add(dummy);

				size++;

			} else {

				g.get(from).add(to);
				g.get(to).add(from);

			}

		}

		return g;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
