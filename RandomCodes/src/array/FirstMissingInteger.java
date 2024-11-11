package array;

public class FirstMissingInteger {

	public int firstMissingPositive(int[] A) {

		int ans = 1;
		if (A.length == 1) {
			if (A[0] == 1) {
				return ans + 1;
			}
			return ans;
		}

		ans = A.length + 1;
		for (int i = 0; i < A.length; i++) {

			while (A[i] != i + 1 && A[i] < A.length && A[i] > 0 && A[i] != A[A[i] - 1]) {

				int t = A[i];
				A[i] = A[t - 1];
				A[t - 1] = t;

			}

		}

		for (int i = 0; i < A.length; i++) {

			if (A[i] != i + 1) {
				ans = i + 1;
				break;
			}

		}

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstMissingInteger f = new FirstMissingInteger();
		System.out.println(f.firstMissingPositive(new int[] { 3, 4, -1, 1 }));

	}

}
