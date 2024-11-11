package array;

public class SpecialIndex {

//	TC:O(N) || SC : O(N)
	public int solve(int[] A) {

		int[] pfe = new int[A.length];
		int[] pfo = new int[A.length];

		pfe[0] = A[0];
		for (int i = 1; i < A.length; i++) {

			if (i % 2 == 0) {
				pfe[i] = pfe[i - 1] + A[i];
			} else {
				pfe[i] = pfe[i - 1];
			}

		}

		pfo[0] = 0;
		for (int i = 1; i < A.length; i++) {

			if (i % 2 != 0) {
				pfo[i] = pfo[i - 1] + A[i];
			} else {
				pfo[i] = pfo[i - 1];
			}

		}

		int se, so;
		int count = 0;

		for (int i = 0; i < A.length; i++) {

			if (i == 0) {
				se = pfe[A.length - 1] - pfe[i];
				so = pfo[A.length - 1] - pfo[i];
			} else {

				se = pfe[i - 1] + pfo[A.length - 1] - pfo[i];
				so = pfo[i - 1] + pfe[A.length - 1] - pfe[i];

			}

			if (se == so) {
				count += 1;
			}

		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecialIndex s = new SpecialIndex();
		System.out.println(s.solve(new int[] { 2, 1, 6, 4 }));
		System.out.println(s.solve(new int[] { 1, 1, 1 }));

	}

}
