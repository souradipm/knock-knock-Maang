package sortingSearching;

import java.util.Arrays;

public class ArithmaticProgression {

	public int solve(int[] A) {

		Arrays.sort(A);
		int diff = A[1] - A[0];
		for (int i = 1; i < A.length - 1; i++) {
			if (diff != A[i + 1] - A[i]) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticProgression a = new ArithmaticProgression();
		System.out.println(a.solve(new int[] { 2, 4, 1 }));
		System.out.println(a.solve(new int[] { 3, 5, 1 }));

	}

}
