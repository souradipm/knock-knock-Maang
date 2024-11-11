package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {

	public int solve(ArrayList<Integer> A) {

		Map<Integer, Integer> map = new HashMap<>();
		for (Integer a : A) {

			if (map.containsKey(a)) {
				int val = map.get(a);
				map.put(a, val + 1);
			} else {
				map.put(a, 1);
			}

		}

		for (Integer a : A) {

			if (map.get(a) > 1) {
				return a;
			}

		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
