package string;

public class LongestPalindromicSubstring {

	public String longestPalindromicSubstring(String A) {
		int[] currentLongest = { 0, 1 };
		for (int i = 1; i < A.length(); i++) {

			int[] odd = getLongestPalindrome(A, i - 1, i + 1);
			int[] even = getLongestPalindrome(A, i - 1, i);
			int[] longest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
			
			if(currentLongest[1] - currentLongest[0] < longest[1] - longest[0]) {
				currentLongest = longest;
			}else if(currentLongest[1] - currentLongest[0] == longest[1] - longest[0] && currentLongest[0]>longest[0]) {
					currentLongest = longest;
			}
		}
		return A.substring(currentLongest[0], currentLongest[1]);
	}

	public int[] getLongestPalindrome(String str, int lIdx, int rIdx) {

		while (lIdx >= 0 && rIdx < str.length()) {
			if (str.charAt(lIdx) != str.charAt(rIdx)) {
				break;
			}
			lIdx--;
			rIdx++;
		}
		return new int[] { lIdx + 1, rIdx };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubstring l = new LongestPalindromicSubstring();
//		System.out.println(l.longestPalindromicSubstring("abbcccbbbcaaccbababcbcabca"));
		System.out.println(l.longestPalindromicSubstring("aaaabaaa"));

	}

}
