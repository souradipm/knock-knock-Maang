package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class ConstructionCost {

	class Pair {
		int dist;
		int next;

		public Pair(int x, int y) {
			dist = x;
			next = y;
		}
	}

	public int solve(int A, int[][] B) {

		if (B.length < 1) {
			return 0;
		}

		ArrayList<Pair>[] g = createAdjList(A, B);

		Queue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);

		boolean v[] = new boolean[A + 1];
		Arrays.fill(v, false);

		int startingNode = B[0][0];
		v[startingNode] = true;
		
		for (int i = 0; i < g[startingNode].size(); i++) {
			pq.add(new Pair(g[startingNode].get(i).dist, g[startingNode].get(i).next));
		}


		long total = 0;

		while (!pq.isEmpty()) {

			Pair p1 = pq.poll();
			int neighbor = p1.next;

			if (!v[neighbor]) {

				total += p1.dist;
				v[neighbor] = true;

				for (int i = 0; i < g[neighbor].size(); i++) {
					pq.add(new Pair(g[neighbor].get(i).dist, g[neighbor].get(i).next));
				}

			}else {
				continue;
			}

		}

		total = total%1000000007;
		return (int)total;

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

		ConstructionCost c = new ConstructionCost();
		System.out.println(c.solve(3, new int[][] {{1,2,14},{2,3,7},{3,1,2}}));
//		System.out.println(c.solve(4, new int[][] {{1,2,1},{2,3,2},{3,4,1},{1,4,12}}));
//		System.out.println(c.solve(3, new int[][] {{1,2,14},{2,3,7},{3,1,2}}));
//		System.out
//				.println(c.solve(4, new int[][] { { 1, 2, 3 }, { 1, 3, 6 }, { 3, 4, 16 }, { 4, 2, 12 }, { 1, 4, 8 } }));
//		System.out.println(c.solve(1, new int[][] {}));

//		[[1,2,1],[2,3,2],[3,4,1],[1,3,8],[1,4,12]]

//		[[1,2,3],[1,3,6],[3,4,16],[4,2,12],[1,4,8]]

	}

}
