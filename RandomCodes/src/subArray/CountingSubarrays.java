package subArray;

public class CountingSubarrays {

	public int solve(int[] A, int B) {

		int count = 0;
		int[] ps = new int[A.length];
		ps[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			ps[i] = ps[i - 1] + A[i];
		}

		for (int i = 0; i < A.length; i++) {

			for (int j = i; j < A.length; j++) {

				int sum = i==0?ps[j]:ps[j] - ps[i - 1];
				if (sum < B) {
					count++;
				}

			}

		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountingSubarrays c = new CountingSubarrays();
		System.out.println(c.solve(new int[] {1, 11, 2, 3, 15}, 10));

	}

}
