package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {

	static PriorityQueue<Integer> max_heap;
	static PriorityQueue<Integer> min_heap;

	public int[] solve(int[] A) {

		min_heap = new PriorityQueue<>();
		max_heap = new PriorityQueue<>(Collections.reverseOrder());

		int n = A.length;
		int ans[] = new int[n];

		for (int i = 0; i < n; ++i) {
			add(A[i]);
			ans[i] = get_median();
		}

		return ans;
	}

	public static int get_median() {
		int total = min_heap.size() + max_heap.size();
		int ret;
		if (total % 2 == 1) {
			if (max_heap.size() > min_heap.size())
				ret = max_heap.peek();
			else
				ret = min_heap.peek();
		} else {
			ret = Integer.MAX_VALUE;
			if (max_heap.size() != 0)
				ret = Math.min(ret, max_heap.peek());
			if (min_heap.size() != 0)
				ret = Math.min(ret, min_heap.peek());
		}
		return ret;
	}

	public static void add(int a) {
		if (max_heap.size() != 0 && (a >= max_heap.peek()))
			min_heap.offer(a);
		else
			max_heap.offer(a);

		if (Math.abs(max_heap.size() - min_heap.size()) > 1) {
			if (max_heap.size() > min_heap.size()) {
				int temp = max_heap.peek();
				max_heap.poll();
				min_heap.offer(temp);
			} else {
				int temp = min_heap.peek();
				min_heap.poll();
				max_heap.offer(temp);
			}
		}
	}

	public int[] solve3(int[] A) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		int ans[] = new int[A.length];

		for (int i = 0; i < A.length; i++) {

			if (maxHeap.size() > minHeap.size()) {

				if (A[i] < ans[i - 1]) {

					int x = maxHeap.poll();
					minHeap.add(x);
					maxHeap.add(A[i]);

				} else {
					minHeap.add(A[i]);
				}

				int median = (minHeap.peek() + maxHeap.peek()) / 2;
				ans[i] = median;

			} else if (maxHeap.size() < minHeap.size()) {

				if (A[i] > ans[i - 1]) {

					int x = minHeap.poll();
					maxHeap.add(x);
					minHeap.add(A[i]);

				} else {
					maxHeap.add(A[i]);
				}

				int median = (minHeap.peek() + maxHeap.peek()) / 2;
				ans[i] = median;

			} else { // size equal

				if (i == 0) {

					maxHeap.add(A[i]);
					ans[i] = maxHeap.peek();

				} else {

					if (A[i] < ans[i - 1]) {

						maxHeap.add(A[i]);
						ans[i] = maxHeap.peek();

					} else {

						minHeap.add(A[i]);
						ans[i] = minHeap.peek();

					}

				}

			}

		}

		return ans;
	}

	public int[] solve2(int[] A) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		int ans[] = new int[A.length];

		for (int i = 0; i < A.length; i++) {

			if (maxHeap.isEmpty()) {
				maxHeap.add(A[i]);
			} else {

				if (A[i] < maxHeap.peek()) {
					maxHeap.add(A[i]);
				} else {
					minHeap.add(A[i]);
				}

			}

			if (maxHeap.size() - minHeap.size() > 1) {

				reBalance(minHeap, maxHeap);

			}

			if (minHeap.size() > maxHeap.size()) {
				ans[i] = minHeap.peek();
			} else if (minHeap.size() < maxHeap.size()) {
				ans[i] = maxHeap.peek();
			} else {
				int x = (minHeap.peek() + maxHeap.peek()) / 2;
				ans[i] = x;
			}

		}

		return ans;
	}

	public void reBalance(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {

		if (minHeap.size() > maxHeap.size()) {
			int x = minHeap.poll();
			maxHeap.add(x);
		} else {
			int x = maxHeap.poll();
			minHeap.add(x);
		}

	}

	public int[] solve1(int[] A) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		int ans[] = new int[A.length];

		for (int i = 0; i < A.length; i++) {

			if (minHeap.size() > maxHeap.size()) {

				if (A[i] < minHeap.peek()) {
					int x = minHeap.poll();
					minHeap.add(A[i]);
					maxHeap.add(x);
				} else {
					maxHeap.add(A[i]);
				}
				int median = (minHeap.peek() + maxHeap.peek()) / 2;
				ans[i] = median;

			} else if (minHeap.size() < maxHeap.size()) {

				if (A[i] < maxHeap.peek()) {
					int x = maxHeap.poll();
					maxHeap.add(A[i]);
					minHeap.add(x);
				} else {
					minHeap.add(A[i]);
				}
				int median = (minHeap.peek() + maxHeap.peek()) / 2;
				ans[i] = median;

			} else {

				if (minHeap.size() == 0 && maxHeap.size() == 0) {
					maxHeap.add(A[i]);
					ans[i] = maxHeap.peek();
				} else {

					int pMedian = (minHeap.peek() + maxHeap.peek()) / 2;
					if (A[i] > pMedian) {

						maxHeap.add(A[i]);
						ans[i] = maxHeap.peek();

					} else {
						minHeap.add(A[i]);
						ans[i] = minHeap.peek();
					}

				}
			}

		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunningMedian r = new RunningMedian();
//		int arr[] = r.solve(new int[] { 1, 2, 5, 4, 3 });
		int arr[] = r.solve(new int[] { 5, 17, 100, 11 });
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
