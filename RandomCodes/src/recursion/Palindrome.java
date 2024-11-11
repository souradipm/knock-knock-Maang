package recursion;

public class Palindrome {

	public int isPalCheck(String A, int s, int e) {

		if (s == e) {
			return 1;
		}
		if (A.charAt(s) != A.charAt(e)) {
			return 0;
		}
		if (s < e + 1) {
			return isPalCheck(A, s + 1, e - 1);
		}
		return 1;
	}

	public int solve(String A) {

		int n = A.length();
		if (n == 0) {
			return 1;
		}

		return isPalCheck(A, 0, n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p = new Palindrome();
		System.out.println(p.solve("madam"));
		System.out.println(p.solve("strings"));

	}

}
