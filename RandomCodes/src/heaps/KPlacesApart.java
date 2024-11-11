package heaps;

import java.util.PriorityQueue;

public class KPlacesApart {

	public int[] solve(int[] A, int B) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i <= B; i++) {

			pq.add(A[i]);

		}

		int ans[] = new int[A.length];

		ans[0] = pq.poll();
		int idx = 1;

		for (int i = B + 1; i < A.length; i++) {

			pq.add(A[i]);
			ans[idx++] = pq.poll();

		}

		while (pq.size() > 0) {
			ans[idx++] = pq.poll();
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KPlacesApart k = new KPlacesApart();
		int arr[] = k.solve(new int[] { 2, 1, 17, 10, 21, 95 }, 1);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
