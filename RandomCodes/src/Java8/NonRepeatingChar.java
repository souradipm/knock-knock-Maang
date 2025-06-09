package Java8;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {

	// input - abcac. Output - b

	public void solve(String str) {

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {

				int val = str.charAt(i);
				map.put(str.charAt(i), val + 1);
			} else {
				map.put(str.charAt(i), 1);
			}

		}

		int flag = 0;

		for (int i = 0; i < str.length(); i++) {

			if (map.get(str.charAt(i)) == 1) {
				System.out.println(str.charAt(i));
				flag = 1;
				break;
			}

		}

		if (flag == 0) {
			System.out.println("No char found");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonRepeatingChar n = new NonRepeatingChar();
		n.solve("abcazzzzzzzzzzzzzzzzaaaaaaaaaaaa");

	}
	
	
	

}
