package string;

public class ReverseByWord {

	public String solve(String A) {

//		A = "the sky is blue "

		StringBuffer sb = new StringBuffer();
		int i = A.length() - 1;
		int j = A.length() - 1;

		while (i >= 0 && j >= 0) {

			if (A.charAt(j) == ' ') {

				for (int a = j + 1; a <= i; a++) {
					sb.append(A.charAt(a));
				}
//				sb.append(" ");
				sb.append("*");

				j--;
				i = j;

			} else {
				j--;
			}

		}

		for (int a = j + 1; a <= i; a++) {
			sb.append(A.charAt(a));
		}
//		sb.append("");

		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseByWord r = new ReverseByWord();
//		System.out.println(r.solve("the sky is blue   "));

		System.out.println(r.solve("crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv"));
	}

}
