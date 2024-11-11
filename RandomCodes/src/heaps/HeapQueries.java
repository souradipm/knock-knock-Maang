package heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HeapQueries {

	public int[] solve(int[][] A) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < A.length; i++) {

			if (A[i][0] == 1 && A[i][1] == -1) {

				if (pq.size() < 1) {
					arr.add(-1);
				} else {
					arr.add(pq.poll());
				}

			} else if (A[i][0] == 2) {
				pq.add(A[i][1]);
			}

		}

		return arr.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HeapQueries h = new HeapQueries();
//		int arr[] = h.solve(new int[][] {{1,-1},{2,2},{2,1},{1,-1}});
		int arr[] = h.solve(new int[][] { { 2, 5 }, { 2, 3 }, { 2, 1 }, { 1, -1 }, { 1, -1 } });
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
