package greedy;

import java.util.Arrays;

public class AssignMictoHoles {

	public int mice(int[] A, int[] B) {

		Arrays.sort(A);
		Arrays.sort(B);
		int total = 0;

		for (int i = 0; i < A.length; i++) {

			int x = Math.abs(A[i] - B[i]);
			total = Math.max(total, x);

		}

		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignMictoHoles a = new AssignMictoHoles();
		System.out.println(a.mice(new int[] { -4, 2, 3 }, new int[] { 0, -2, 4 }));
		System.out.println(a.mice(new int[] { -2 }, new int[] { -6 }));

	}

}
