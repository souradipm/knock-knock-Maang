package string;

public class AlphaNumeric {

	public int solve(char[] A) {

		for (int i = 0; i < A.length; i++) {

			if (!(A[i] >= 'A' && A[i] <= 'Z' || A[i] >= 'a' && A[i] <= 'z' || A[i] >= '0' && A[i] <= '9')) {
				return 0;
			}

		}

		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlphaNumeric a = new AlphaNumeric();
		System.out.println(a.solve(new char[] { 'S', 'c', 'a', '%' }));

	}

}
