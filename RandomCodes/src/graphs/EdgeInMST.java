package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class EdgeInMST {

	class Pair {

		int wt;
		int from;
		int to;

		public Pair(int z, int x, int y) {

			wt = z;
			from = x;
			to = y;

		}

	}

	public int[] solve(int A, int[][] B) {

		ArrayList<Pair>[] g = createAdjList(A, B);
		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);
		boolean v[] = new boolean[A + 1];
		Arrays.fill(v, false);
		int ans[] = new int[B.length];
		Arrays.fill(ans, 0);
		
		int startNode = B[0][0];
		
		for(int i=0;i<g[startNode].size();i++) {
			
			pq.add(g[startNode].get(i));
			
		}

		v[startNode] = true;

		while (!pq.isEmpty()) {

			Pair p1 = pq.poll();
			int toNode = p1.to;

			if (!v[toNode]) {

				v[toNode] = true;

				int fromNode = p1.from;

				for (int i = 0; i < B.length; i++) {

					if (B[i][0] == fromNode && B[i][1] == toNode) {
						ans[i] = 1;
						break;
					}

				}

				for (int i = 0; i < g[toNode].size(); i++) {

					pq.add(g[toNode].get(i));

				}

			} else {
				continue;
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

			g[B[i][0]].add(new Pair(B[i][2], B[i][0], B[i][1]));
			g[B[i][1]].add(new Pair(B[i][2], B[i][1], B[i][0]));

		}

		return g;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeInMST e = new EdgeInMST();
//		int ans[] = e.solve(3, new int[][] { { 1, 2, 2 }, { 1, 3, 2 }, { 2, 3, 3 } });
//		int ans[] = e.solve(2, new int[][] { { 1, 2, 42 } });
		
//		int ans[] = e.solve(7, new int[][] {{1,2,468},{2,3,335},{3,1,501},{2,4,170},{2,5,725},{2,7,479},{4,6,359},{5,6,963}});

		int ans[] = e.solve(5, new int[][] {{1,2,282},{1,3,828},{2,3,962},{1,4,492},{4,3,996},{4,5,943},{3,5,828}} );

		
		for (int i : ans) {

			System.out.print(i + " ");
		}

	}

}
