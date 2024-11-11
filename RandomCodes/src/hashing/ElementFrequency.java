package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {

	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

		Map<Integer, Integer> map = new HashMap<>();
		for (Integer a : A) {

			if (map.containsKey(a)) {
				int val = map.get(a);
				map.put(a, val + 1);
			} else {
				map.put(a, 1);
			}

		}

		ArrayList<Integer> arr = new ArrayList<>();

		for (Integer b : B) {

			if (map.containsKey(b)) {
				arr.add(map.get(b));
			}else {
				arr.add(0);
			}

		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElementFrequency e = new ElementFrequency();

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(1);
		A.add(1);

		ArrayList<Integer> B = new ArrayList<>();
		B.add(1);
		B.add(2);

		ArrayList<Integer> arr = e.solve(A, B);
		for (Integer a : arr) {
			System.out.print(a + " ");
		}

	}

}
