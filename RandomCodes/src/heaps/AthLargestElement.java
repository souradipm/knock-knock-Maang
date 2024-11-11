package heaps;

import java.util.PriorityQueue;

public class AthLargestElement {

	public int[] solve(int A, int[] B) {

		int arr[] = new int[B.length];
		for (int i = 0; i < B.length; i++) {
			arr[i] = -1;
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < A; i++) {
			pq.add(B[i]);
		}
		arr[A - 1] = pq.peek();

		for (int i = A; i < B.length; i++) {

			int minInHeap = pq.peek();
			int nextElement = B[i];

			if (nextElement > minInHeap) {
				pq.poll();
				pq.add(B[i]);
				arr[i] = pq.peek();
			} else {
				arr[i] = pq.peek();
			}

		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AthLargestElement a = new AthLargestElement();
//		int arr[] = a.solve(4, new int [] {1,2,3,4,5,6});
		int arr[] = a.solve(2, new int[] { 15, 20, 99, 1 });
		for (int aa : arr) {
			System.out.print(aa + " ");
		}

	}

}
