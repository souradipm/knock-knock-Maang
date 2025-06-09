package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Test {

	/**
	 * Take character and string as input and give the frequency of the character in
	 * the string as output
	 * 
	 * @param ch
	 * @param str
	 * @return
	 */
	public int charCount(char ch, String str) {

		int count = (int) str.chars().filter(c -> c == ch).count();

		return count;
	}

	/**
	 * method to take in an array of numbers and return second highest number
	 * @param nums
	 * @return
	 */
	public int secondHightestNumber(int[] nums) {

		OptionalInt x = Arrays.stream(nums).distinct().sorted().skip(nums.length - 2).findFirst();

		return x.getAsInt();
	}
	
	
//	public char firstNonRepeatingCharacter(String str) {
//		
//		
//		str.chars().mapToObj(c->(char)c)
//		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//		
//		
//		
//		
//		return 0;
//	}
	
	public int getCountOfNames(List<String> arrL) {
		
		int x = (int) arrL.stream().distinct().count();
		
		
		return x;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		System.out.println(t.charCount('a', "Souradip"));

		System.out.println(t.secondHightestNumber(new int[] { 1, 2, 11, 12, 99, 89 }));
		
		List<String> list = new ArrayList<>();
		list.add("Souradip");
		list.add("Souradip");
		list.add("Souradip");
		list.add("Souradip");
		list.add("Arkadip");
		
		System.out.println(t.getCountOfNames(list));

	}

}
