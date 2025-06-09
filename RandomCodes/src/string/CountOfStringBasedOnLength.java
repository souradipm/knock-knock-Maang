package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOfStringBasedOnLength {
//	 Write a program to group list of strings based on their lengths. Count number of strings 
//	in each group
//    * Example: input {“dog”, “cat”, “rabbit”,”zebra”,”fox”}
//    * output {“3”: dog,cat,fox,  5: “rabbit”, 6: “fox”} 
//    * no of strings with length 3 = 3
//    * no of strings with length 5 = 1
//    * no of strings with length 6 = 1

	public Map<Integer, List<String>> solve(List<String> str) {

		Map<Integer, List<String>> map = new HashMap<>();

		for (String a : str) {

			int count = a.length();

			if (map.containsKey(count)) {

				List<String> list = map.get(count);
				list.add(a);
				map.put(count, list);

			} else {
				List<String> list = new ArrayList<>();
				list.add(a);
				map.put(count, list);
			}

		}

		return map;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfStringBasedOnLength a = new CountOfStringBasedOnLength();

		List<String> str = new ArrayList<>();
		str.add("cat");
		str.add("dog");
		str.add("zebra");
		str.add("fox");
		str.add("lion");

		Map<Integer, List<String>> map = a.solve(str);

		for (Map.Entry<Integer, List<String>> set : map.entrySet()) {

			System.out.println(set.getKey() + " = " + set.getValue());

		}

	}

}
