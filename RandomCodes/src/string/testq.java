package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class testq {

	public int findFirstNonRepeatingCharacterIndex(String input) {
		
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Build a map of character counts while preserving order
        input.chars()
             .mapToObj(c -> (char) c)
             .forEach(ch -> charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1));

        // Find the first non-repeating character and its index
        for (int i = 0; i < input.length(); i++) {
            if (charCountMap.get(input.charAt(i)) == 1) {
                return i;
            }
        }

        // No non-repeating character found
        return -1;
		
//		int output = input.indexOf(input.chars().mapToObj(e -> (char) e).collectors
//				.groupingBy(Function.identity(), LinkedHashmap::new, collectors.counting()).stream()
//				.sorted(Map.Entry.comparingByValue()).map(a -> a.getKey).findFirst().get());
//		
//		
//		if (output != -1) {
//
//			return output;
//		}
//
//		else {
//
//			return -1;
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testq t = new testq();
		String input = "abcdcaf";
        int result = t.findFirstNonRepeatingCharacterIndex(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);

	}

}
