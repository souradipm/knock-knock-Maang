package string;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] A) {

		StringBuilder sb = new StringBuilder();

		String common = A[0];

		for (int i = 1; i < A.length; i++) {

			String temp = A[i];
			int j = 0;

			if (common.isEmpty()) {
				return common;
			}

			while (j < common.length() && j < temp.length()) {

				if (temp.charAt(j) == common.charAt(j)) {
					sb.append(temp.charAt(j));
					j++;
				} else {
					break;
				}
			}

			common = sb.toString();
			sb = new StringBuilder();

		}

		return common;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonPrefix l = new LongestCommonPrefix();
		System.out.println(l.longestCommonPrefix(new String[] { "abcd", "abab", "ab" }));

	}

}
