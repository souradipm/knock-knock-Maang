package heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumLargestElement {

	class Pair {
		int val;
		int idx;

		Pair(int x, int y) {
			val = x;
			idx = y;
		}
	}

	public int solve(int[] A, int B) {

		int arr[] = new int[A.length];

		PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() { //O(logN)
			@Override
			public int compare(Pair o1, Pair o2) {
				return o1.val - o2.val;
			}
		});

		for (int i = 0; i < A.length; i++) { //O(n)

			pq.add(new Pair(2*A[i], i));
			arr[i] = A[i];
		}

		for (int i = 0; i < B; i++) {  //O(B)

			int val = pq.peek().val;
			int index = pq.peek().idx;
			pq.remove();
			arr[index] = val;
			pq.add(new Pair(val + A[index], index));

		}

		int max = Integer.MIN_VALUE;

		for (int a : arr) { //O(N)
			max = Math.max(max, a);
		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumLargestElement m = new MinimumLargestElement();
//		System.out.println(m.solve(new int[] { 1, 2, 3, 4 }, 3));
//		System.out.println(m.solve(new int[] { 5, 1, 4, 2 }, 5));
		System.out.println(m.solve(new int[] { 5,7,8 }, 9));

	}

}
