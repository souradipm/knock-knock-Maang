package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dijkstra {

	class Pair {
		int wt;
		int next;

		public Pair(int x, int y) {
			wt = x;
			next = y;
		}
	}

	public int[] solve(int A, int[][] B, int C) {

		ArrayList<Pair>[] g = createAdjList(A, B);

		int ans[] = new int[A];
		Arrays.fill(ans, Integer.MAX_VALUE);
		ans[C] = 0;

		Queue<Pair> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);

		for (int i = 0; i < g[C].size(); i++) {
			pq.add(new Pair(g[C].get(i).wt, g[C].get(i).next));
		}

		while (!pq.isEmpty()) {

			Pair pNode = pq.poll();
			int wt = pNode.wt;
			int next = pNode.next;

			if (ans[next] > wt) {
				ans[next] = wt;
			} else {
				continue;
			}

			for (int i = 0; i < g[next].size(); i++) {
				pq.add(new Pair(g[next].get(i).wt + ans[next], g[next].get(i).next));
			}

		}
		
		for(int i=0;i<ans.length;i++) {
			if(ans[i]==Integer.MAX_VALUE) {
				ans[i] = -1;
			}
		}

		return ans;
	}

	public ArrayList<Pair>[] createAdjList(int A, int[][] B) {

		ArrayList<Pair>[] g = new ArrayList[A];

		for (int i = 0; i < A; i++) {

			g[i] = new ArrayList<Pair>();

		}

		for (int i = 0; i < B.length; i++) {

			g[B[i][0]].add(new Pair(B[i][2], B[i][1]));
			g[B[i][1]].add(new Pair(B[i][2], B[i][0]));

		}

		return g;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dijkstra d = new Dijkstra();
//		int ans[] = d.solve(6, new int[][] { { 0, 4, 9 }, { 3, 4, 6 }, { 1, 2, 1 }, { 2, 5, 1 }, { 2, 4, 5 },
//				{ 0, 3, 7 }, { 0, 1, 1 }, { 4, 5, 7 }, { 0, 5, 1 } }, 4);
		
		int ans[] = d.solve(7, new int[][] { { 2, 4, 10 }, { 3, 4, 1 }, { 3, 6, 1 }, { 1, 2, 4 },{4,5,6} }, 2);

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		

	}

}
