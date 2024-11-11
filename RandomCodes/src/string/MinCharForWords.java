package string;

import java.util.HashMap;
import java.util.Map;

public class MinCharForWords {

	/**
	 * Function that takes in an array of words and returns the smallest array of
	 * characters needed to form all the words
	 */
	public char[] minimumCharactersForWords(String[] words) {

		// Master map to hold freqency of max number of characters per word in the input
		// array.
		Map<Character, Integer> maxMap = new HashMap<>();

		// We loop through each word and find the frequency of each character.
		for (int i = 0; i < words.length; i++) {

			Map<Character, Integer> map = new HashMap<>();

			String word = words[i];

			for (int j = 0; j < word.length(); j++) {

				if (map.containsKey(word.charAt(j))) {
					int val = map.get(word.charAt(j));
					map.put(word.charAt(j), val + 1);
				} else {
					map.put(word.charAt(j), 1);
				}
			}

			// We loop through both the maps and find the max count per character
			for (int j = 0; j < word.length(); j++) {

				if (maxMap.containsKey(word.charAt(j))) {
					int maxVal = maxMap.get(word.charAt(j));
					int val = map.get(word.charAt(j));
					maxVal = Math.max(maxVal, val);
					maxMap.put(word.charAt(j), maxVal);
				} else {
					maxMap.put(word.charAt(j), map.get(word.charAt(j)));
				}

			}

		}

		// We convert maxmap to Stringbuilder and append the character max number of
		// times as per the maxmap
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : maxMap.entrySet()) {

			int val = entry.getValue();
			char ch = entry.getKey();
			int j = 0;
			while (j < val) {
				sb.append(ch);
				j++;
			}

		}

		// we convert stringbuilder to char array and return the result
		int i = 0;
		char[] arr = new char[sb.length()];
		for (int k = 0; k < sb.length(); k++) {
			arr[i++] = sb.charAt(k);
		}

		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinCharForWords m = new MinCharForWords();
		char[] arr = m.minimumCharactersForWords(new String[] { "this", "that", "did", "deed", "them!", "a" });
		for (char s : arr) {
			System.out.print(s + " ");
		}

	}

}
