package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingCharacter {

	public static String findMissingAlphabets(String sentence) {
		// Convert the sentence to lowercase to make it case-insensitive
		sentence = sentence.toLowerCase();

		// Create a set to store the unique alphabets in the sentence
		Set<Character> alphabetSet = new HashSet<>();
		for (char c : sentence.toCharArray()) {
			if (Character.isLetter(c)) {
				alphabetSet.add(c);
			}
		}

		// Create a set containing all lowercase English alphabets
		Set<Character> allAlphabets = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

		// Find the missing alphabets by subtracting alphabetSet from allAlphabets
		allAlphabets.removeAll(alphabetSet);

		// Convert the missing alphabets to a sorted string
		char[] missingAlphabetsArray = new char[allAlphabets.size()];
		int index = 0;
		for (char c : allAlphabets) {
			missingAlphabetsArray[index++] = c;
		}
		Arrays.sort(missingAlphabetsArray);

		return new String(missingAlphabetsArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "The fox jumps over the lazy dog";

		String missingAlphabets = findMissingAlphabets(sentence);
		System.out.println("Missing alphabets: " + missingAlphabets);

	}

}
