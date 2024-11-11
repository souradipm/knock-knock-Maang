package string;

public class StringCompress {

	// input : aabbbaa
	// output : a2b3a2
	public String charCount(String str) {
		
		if(str.isEmpty()) {
			return str;
		}
		
		StringBuilder sb = new StringBuilder();
		char currentChar = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == currentChar) {
				count++;
			} else {
				sb.append(currentChar);
				sb.append(count);

				currentChar = str.charAt(i);
				count = 1;
			}
		}
		sb.append(currentChar);
		sb.append(count);

		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompress ss = new StringCompress();
		System.out.println(ss.charCount(""));

	}

}
