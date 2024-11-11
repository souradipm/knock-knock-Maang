package array;

public class MinMaxSum {

	public int solve(int[] A) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i : A) {

			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}

		}

		return max + min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinMaxSum m = new MinMaxSum();
		System.out.println(m.solve(new int[] {1,2,4,1}));
		System.out.println(m.solve(new int[] {-2,1,-4,5,3}));

	}

}
