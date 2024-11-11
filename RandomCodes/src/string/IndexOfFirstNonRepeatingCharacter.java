package string;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IndexOfFirstNonRepeatingCharacter {

//	O(N) space | O(N) time
	public int firstNonRepeatingCharacter(String string) {

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < string.length(); i++) {
			map.put(string.charAt(i), map.getOrDefault(string.charAt(i), 0) + 1);
		}
		for (int i = 0; i < string.length(); i++) {
			if (map.get(string.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
	
	
	public int firstNonRepeatingCharacterJava8(String string) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		string.chars().forEach(c->map.put((char)c, map.getOrDefault((char)c, 0)+1));
		
		OptionalInt idx = IntStream.range(0, string.length()).filter(i->map.get(string.charAt(i))==1).findFirst();
		
		return idx.orElse(-1);
		
	}

	public static void main(String[] args) {

		IndexOfFirstNonRepeatingCharacter rep = new IndexOfFirstNonRepeatingCharacter();
		System.out.println(rep.firstNonRepeatingCharacterJava8	("aaa"));
	}

}
