package string;

public class ReverseString {

	public String solve(String A) {

		StringBuffer sb = new StringBuffer();
		int j = 0;
		for (int i = A.length() - 1; i >= 0; i--) {
			sb.insert(j++, A.charAt(i));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString s = new ReverseString();
		System.out.println(s.solve("Scaler"));

	}

}
