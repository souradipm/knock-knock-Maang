package string;

public class StringOperations {

	public String solve(String A) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < A.length(); i++) {

			if (A.charAt(i) >= 'A' && A.charAt(i) <= 'Z') {
				continue;
			} else if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o'
					|| A.charAt(i) == 'u') {
				sb = sb.append("#");
			} else {
				sb = sb.append(A.charAt(i));
			}

		}

		sb = sb.append(sb);
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperations s = new StringOperations();
		System.out.println(s.solve("aeiOUz"));

	}

}
