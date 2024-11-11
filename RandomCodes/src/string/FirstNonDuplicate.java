package string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonDuplicate {

	public char findIt(String str) {

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {
				int val = map.get(str.charAt(i));
				map.put(str.charAt(i), val + 1);
			} else {
				map.put(str.charAt(i), 1);
			}

		}

		for (int i = 0; i < str.length(); i++) {

			if (map.get(str.charAt(i)) == 1) {
				return str.charAt(i);
			}

		}

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstNonDuplicate f = new FirstNonDuplicate();
		System.out.println(f.findIt("racecars"));

	}

}
