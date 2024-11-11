package heaps;

import java.util.PriorityQueue;

public class MinHeapPriorityQueue {
	
	static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	
	public static void view() {
		for (Integer x : minHeap) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		minHeap.add(3);
		System.out.print("minHeap.add(3) = ");
		view();
		minHeap.add(13);
		minHeap.add(7);
		minHeap.add(16);
		minHeap.add(21);
		minHeap.add(12);
		minHeap.add(9);
		
		System.out.print("minHeap.view() = ");
		view();
		
		System.out.println("minHeap.peek() = " + minHeap.peek());
//		minHeap.poll();
//		System.out.println("minHeap.peek() = " + minHeap.peek());
		
		int x = minHeap.poll();
		int y = minHeap.poll();
		int z = x+y;
		minHeap.add(z);
		view();

	}

}
