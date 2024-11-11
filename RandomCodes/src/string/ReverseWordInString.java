package string;

import java.util.Stack;

public class ReverseWordInString {

	public String reverseWordsInString(String string) {

		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for (int i = string.length() - 1; i >= 0; i--) {

			if (string.charAt(i) == ' ') {

				while (!st.isEmpty()) {

					sb.append(st.pop());

				}
				sb.append(' ');

			} else {
				st.add(string.charAt(i));
			}
		}

		while (!st.isEmpty()) {

			sb.append(st.pop());
		}

		return sb.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordInString r = new ReverseWordInString();
		System.out.println(r.reverseWordsInString("I go               to school!            "));

	}

}
