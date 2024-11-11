package heaps;

import java.util.PriorityQueue;

public class Productof3 {

	public int[] solve(int[] A) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		int mul = 1;
		int ans[] = new int[A.length];

		for (int i = 0; i < 3; i++) {
			minHeap.add(A[i]);
			mul *= A[i];
			ans[i] = -1;
			if (i == 2) {
				ans[i] = mul;
			}
		}

		for (int i = 3; i < A.length; i++) {

			if (A[i] < minHeap.peek()) {
				ans[i] = mul;
			} else {
				int min = minHeap.poll();
				if (min != 0) {
					mul = mul / min;
				}
				minHeap.add(A[i]);
				mul *= A[i];
				ans[i] = mul;
			}

		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productof3 p = new Productof3();
		int ans[] = p.solve(new int[] { 10, 2, 13, 4 });
		for (int a : ans) {
			System.out.print(a + " ");
		}

	}

}
