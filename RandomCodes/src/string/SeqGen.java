package string;

import java.util.ArrayList;
import java.util.List;

public class SeqGen {

	public List<String> getSeq(String str, int len) {

//		Write a java program to generate the sequences based on the length passed as an input, from 
//		the given input string.
//		For example, if the input string is “abc”, and input length is 2, then the output must be {ab,bc} 
//		only (only the consecutive sequences allowed)
//		If the input is “abcde” and length is 3, then output must be {abc, bcd, cde}

		String temp = "";
		List<String> list = new ArrayList<>();

		for (int i = 0; i < str.length() - len + 1; i++) {

			for (int j = i; j < str.length(); j++) {

				temp = temp + str.charAt(j);
				if (temp.length() == len) {
					list.add(temp);
					temp = "";
					break;
				}

			}

		}

		return list;
	}
	
	
	public List<String> generateConsecutiveSequences(String input, int sequenceLength) {
        List<String> sequences = new ArrayList<>();
        
        if (input.length() < sequenceLength) {
            System.out.println("Input string length is smaller than sequence length.");
            return sequences;
        }
        
        for (int i = 0; i <= input.length() - sequenceLength; i++) {
            sequences.add(input.substring(i, i + sequenceLength));
        }
        
        return sequences;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeqGen s = new SeqGen();
//		System.out.println(s.getSeq("abcde", 2));
		System.out.println(s.generateConsecutiveSequences("abcde", 3));

	}

}
