package string;

public class test {

	public int b(String str) {

		int[] letterCounts = new int[26];

		for (char c : str.toCharArray()) {
			letterCounts[c - 'a']++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (letterCounts[str.charAt(i) - 'a'] == 1) {
				return i;
			}	
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
		System.out.println(t.b("abcd"));

	}

}
