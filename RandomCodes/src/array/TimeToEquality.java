package array;

public class TimeToEquality {

	public int solve(int[] A) {

		int max = findMax(A);
		int count = 0;

		for (int i = 0; i < A.length; i++) {

			count += (max - A[i]);

		}

		return count;
	}

	public int findMax(int[] A) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {

			if (A[i] > max) {
				max = A[i];
			}

		}
		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeToEquality t = new TimeToEquality();
		System.out.println(t.solve(new int[] {2,4,1,3,2}));

	}

}
