package heaps;

import java.util.PriorityQueue;

public class ConnectRopes {

	public int solve(int[] A) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int i = 0; i < A.length; i++) {
			minHeap.add(A[i]);
		}

		int ans = 0;

		while (minHeap.size() > 1) {

			int x = minHeap.poll();
			int y = minHeap.poll();
			int z = x + y;
			ans += z;
			minHeap.add(z);

		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectRopes c = new ConnectRopes();
//		System.out.println(c.solve(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(c.solve(new int[] { 5,17,100,11 }));

	}

}
