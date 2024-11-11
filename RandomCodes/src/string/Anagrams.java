package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

	public int solve(String A, String B) {

		Map<Character, Integer> mapA = getFrq(A);
		Map<Character, Integer> mapB = getFrq(B);

		for (Map.Entry<Character, Integer> entry : mapA.entrySet()) {

			if (!entry.getValue().equals(mapB.get(entry.getKey()))) {
				return 0;
			}
		}
		
		for (Map.Entry<Character, Integer> entry : mapB.entrySet()) {

			if (!entry.getValue().equals(mapA.get(entry.getKey()))) {
				return 0;
			}
		}

		return 1;

	}

	public Map<Character, Integer> getFrq(String str) {

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}

		}
		return map;

	}

	public int solve1(String A, String B) {

		String newStringA = sortString(A);
		String newStringB = sortString(B);

		if (newStringA.equals(newStringB)) {
			return 1;
		}

		return 0;
	}

	public String sortString(String str) {

		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);

	}

	// O(wn) space | O(wnlog(n)) time
	// w - number of words | n - length of longest word
	public List<List<String>> getGrpAnagrams(String[] words) {

		Map<String, List<String>> anagrams = new HashMap<>();

		for (String word : words) {

			// we convert the string to array to sort it and we
			// convert it back to string after sorting
			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);
			String sortedWord = new String(charArray);

			if (anagrams.containsKey(sortedWord)) {
				anagrams.get(sortedWord).add(word);
			} else {
				List<String> newWord = new ArrayList<>();
				newWord.add(word);
				anagrams.put(sortedWord, newWord);
			}
		}
		return new ArrayList<>(anagrams.values());
	}

	public static void main(String[] args) {

		Anagrams anagrams = new Anagrams();
		System.out.println(anagrams.solve("ccaa", "caac"));
//		System.out.println(
//				"The anagrams are -> " + anagrams.getGrpAnagrams(new String[] { "act", "god", "cat", "dog", "tac" }));
	}

}
