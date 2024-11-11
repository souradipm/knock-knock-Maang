package heaps;

import java.util.PriorityQueue;

public class MaximumArraySumAfterBNegations {

	public int solve(int[] A, int B) {

		PriorityQueue<Integer> p = new PriorityQueue<>();

		for (int a : A) {

			p.add(a);

		}

		int i = 0;
		while (i < B) {

			int x = p.poll();
			x = ~(x - 1);
			p.add(x);
			i++;

		}

		int sum = 0;
		while (p.size() > 0) {
			sum += p.poll();
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumArraySumAfterBNegations m = new MaximumArraySumAfterBNegations();
		System.out.println(m.solve(new int[] { 57, 3, -14, -87, 42, 38, 31, -7, -28, -61 }, 10));

	}

}
