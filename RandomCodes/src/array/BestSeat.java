package array;

public class BestSeat {

	public int bestSeat(int[] seats) {
		// Write your code here.

//		[1,0,1,0,0,1]

		int space = 0;
		int idx = -1;

		int l = 0, r = 1;

		while (r < seats.length) {

			if (seats[r] == 1) {

				int tempSpace = r - l - 1;
				int tempIdx = (r + l) / 2;
				if (tempSpace > space) {
					space = tempSpace;
					idx = tempIdx;
				}
				l = r;
				r++;

			} else {
				r++;
			}

		}

		return idx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestSeat b = new BestSeat();
		System.out.println(b.bestSeat(new int[] {1,0,1,0,0,0,1}));

	}

}
