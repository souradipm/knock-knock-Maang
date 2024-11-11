package string;

import java.util.HashSet;
import java.util.Set;

public class FindAllUniqueSubstring {
	
	public static Set<String> findAllUniqueSubstrings(String input) {
        Set<String> uniqueSubstrings = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                uniqueSubstrings.add(substring);
            }
        }

        return uniqueSubstrings;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcd";

        Set<String> uniqueSubstrings = findAllUniqueSubstrings(input);

        System.out.println("Unique Substrings:");
        for (String substring : uniqueSubstrings) {
            System.out.println(substring);
        }

	}

}
