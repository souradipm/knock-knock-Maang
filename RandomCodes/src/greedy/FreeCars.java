package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FreeCars {

	class Pair {
		int time;
		int profit;

		Pair(int time, int profit) {
			this.time = time;
			this.profit = profit;
		}
	}

	public int solve(int[] A, int[] B) {

		ArrayList<Pair> cars = new ArrayList<Pair>();

		for (int i = 0; i < A.length; ++i) {
			cars.add(new Pair(A[i], B[i]));
		}

		Collections.sort(cars, new Comparator<Pair>() {
			public int compare(Pair p1, Pair p2) {
				if (p1.time == p2.time) {
					return Integer.compare(p2.profit, p1.profit);
				}
				return Integer.compare(p1.time, p2.time);
			}
		});

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int t = 0;

		for (int i = 0; i < cars.size(); i++) {

			if (t < cars.get(i).time) {
				pq.add(cars.get(i).profit);
				t++;
			} else {

				int min = pq.peek();
				if (cars.get(i).profit > min) {
					pq.poll();
					pq.add(cars.get(i).profit);
				}

			}

		}

		int sum = 0;
		while (!pq.isEmpty()) {
			sum = (sum + pq.poll()) % 1000000007;
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreeCars f = new FreeCars();
		System.out.println(f.solve(new int[] { 1, 3, 2, 3, 3 }, new int[] { 5, 6, 1, 3, 9 }));
		System.out.println(f.solve(new int[] { 3, 8, 7, 5 }, new int[] { 3, 1, 7, 19 }));

	}

}
