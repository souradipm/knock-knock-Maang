package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DistinctElements {

	public int solve(ArrayList<Integer> A) {

		Set<Integer> set = new HashSet<>();

		for (Integer a : A) {

			set.add(a);

		}

		return set.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DistinctElements d = new DistinctElements();

		ArrayList<Integer> A = new ArrayList<>();
		A.add(3);
		A.add(3);
		A.add(3);
		A.add(9);
		A.add(0);
		A.add(1);
		A.add(0);

		System.out.println(d.solve(A));

	}

}
