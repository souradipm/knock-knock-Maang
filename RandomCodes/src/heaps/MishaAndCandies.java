package heaps;

import java.util.PriorityQueue;

public class MishaAndCandies {

	public int solve(int[] A, int B) {

		PriorityQueue<Integer> boxes = new PriorityQueue<>();
		for (int box = 0; box < A.length; box++) {
			boxes.add(A[box]);
		}

		int candies_eaten = 0;

		while (boxes.size() > 0 && boxes.peek() <= B) {
			int candies = boxes.poll();
			int candies_pick = candies / 2;
			candies_eaten += candies_pick;
			if (boxes.size() != 0) {
				int min_candies = boxes.poll();
				min_candies += candies - candies_pick;
				boxes.add(min_candies);
			}
		}

		return candies_eaten;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MishaAndCandies m = new MishaAndCandies();
		System.out.println(m.solve(
				new int[] { 324, 458, 481, 167, 939, 444, 388, 612, 943, 890, 953, 403, 653, 136, 168, 163, 186, 471 },
				231));

		System.out.println(m.solve(new int[] { 3, 2, 3 }, 4));

	}

}
