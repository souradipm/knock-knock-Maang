package string;

public class SpecialSubsequence {

	// ABCGAG
	public int solve(String A) {

		long ans = 0;
		long countA = 0;
		for (int i = 0; i < A.length(); i++) {

			if (A.charAt(i) == 'A') {
				countA++;
			}
			if (A.charAt(i) == 'G') {
				ans += countA;
//				ans = ans % 10 ^ 9 ;
			}

		}
		ans = ans % (10 ^ 9 + 7);

		return (int) ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecialSubsequence s = new SpecialSubsequence();
		System.out.println(s.solve("ABCGAG"));

	}

}
