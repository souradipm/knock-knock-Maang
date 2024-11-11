package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubarray2 {

	public int solve(ArrayList<Integer> A) {

		long sum = 0;
		Set<Long> set = new HashSet<>();

		for (Integer a : A) {

			sum += a;
			if(sum == 0) {
				return 1;
			}
			if (set.contains(sum)) {
				return 1;
			} else {
				set.add(sum);
			}

		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A = new ArrayList<>();
		A.add(4);
		A.add(-1);
		A.add(1);
		A.add(9);
		A.add(0);
		A.add(1);
		A.add(0);

		ZeroSumSubarray2 z = new ZeroSumSubarray2();
		System.out.println(z.solve(A));

	}

}
