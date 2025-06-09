package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MaxDepth {

	public int[] solve(int A, int[] B, int[] C, int[] D, int[] E, int[] F) {

		ArrayList<Integer>[] adjList = createAdjList(A, B, C); // create the adjacency list

		int[] ans = new int[E.length]; // this is the answer array

		boolean[] v = new boolean[A + 1]; // visited array
		Arrays.fill(v, false);

		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		v[1] = true;

		int depth = 0;
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(D[0]);
		map.put(depth, list);

		while (!q.isEmpty()) {

			int pNode = q.poll();
			ArrayList<Integer> neighbor = adjList[pNode];
			ArrayList<Integer> list1 = new ArrayList<>();

			for (Integer i : neighbor) {

				if (!v[i]) {

					q.add(i);
					v[i] = true;

					list1.add(D[i - 1]);

				}

			}
			Collections.sort(list1);
			if (!list1.isEmpty()) {
				depth += 1;
				map.put(depth, list1);
			}

		}

		int maxD = getMaxKey(map.keySet());

		for (int i = 0; i < E.length; i++) {

			int L = E[i];
			int X = F[i];

			int level = L % (maxD + 1);

			ArrayList<Integer> list2 = map.get(level);

			int val = search(list2, X);

			ans[i] = val;

		}

		return ans;

	}

	public int search(ArrayList<Integer> list, int X) {

		int left = 0;
		int right = list.size() - 1;
		int ans = -1;

		while (left <= right) {

			int mid = (left + right) / 2;
			if (list.get(mid) >= X) {
				ans = list.get(mid);
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return ans;
	}

	public int getMaxKey(Set<Integer> set) {

		int maxD = Integer.MIN_VALUE;
		for (Integer i : set) {

			if (i > maxD) {
				maxD = i;
			}

		}

		return maxD;

	}

	public ArrayList<Integer>[] createAdjList(int A, int[] B, int[] C) {

		ArrayList<Integer>[] adjList = new ArrayList[A + 1];
		for (int i = 0; i <= A; i++) {

			adjList[i] = new ArrayList<Integer>();

		}

		for (int i = 0; i < B.length; i++) {

			adjList[B[i]].add(C[i]);
			adjList[C[i]].add(B[i]);

		}

		return adjList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] B = new int[] { 1, 4, 3, 1 };
		int[] C = new int[] { 5, 2, 4, 4 };
		int[] D = new int[] { 7, 38, 27, 37, 1 };
		int[] E = new int[] { 1, 1, 2 };
		int[] F = new int[] { 32, 18, 26 };

		MaxDepth m = new MaxDepth();

		int arr[] = m.solve(5, B, C, D, E, F);

		for (int i : arr) {
			System.out.print(i + ",");
		}

	}

}
