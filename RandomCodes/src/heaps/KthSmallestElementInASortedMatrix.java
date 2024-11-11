package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix {

	public int solve(int[][] A, int B) {

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		int count = 0;

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {

				if (count < B) {
					maxHeap.add(A[i][j]);
					count++;
				} else if (count == B) {
					if (maxHeap.peek() > A[i][j]) {
						maxHeap.poll();
						maxHeap.add(A[i][j]);
					}
				}

			}

		}

		return maxHeap.peek();
	}

	public int solve1(int[][] A, int B) {

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		int count = 0;
		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {

				count++;
				maxHeap.add(A[i][j]);
				if (count == B) {
					return A[i][j];
				}
			}

		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthSmallestElementInASortedMatrix k = new KthSmallestElementInASortedMatrix();
//		[[6,9,13,14,18,21,25],[9,11,15,18,22,24,26],[10,13,18,21,25,28,31],[12,15,22,24,26,31,32],[16,17,25,28,32,34,35]]

//		[[3,5,7,9],[4,6,9,12],[5,9,12,16],[6,10,14,19]]
		System.out.println(
				k.solve(new int[][] { { 3, 5, 7, 9 }, { 4, 6, 9, 12 }, { 5, 9, 12, 16 }, { 6, 10, 14, 19 } }, 15));

	}

}
