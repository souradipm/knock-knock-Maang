package subArray;

public class AmazingSubarray {

	public int solve(String A) {

		// ABEC
		int count = 0;
		int len = A.length();
		int mod = 10003;

		for (int i = 0; i < A.length(); i++) {

			if (A.charAt(i) == 'u' || A.charAt(i) == 'o' || A.charAt(i) == 'i' || A.charAt(i) == 'e'
					|| A.charAt(i) == 'a' || A.charAt(i) == 'U' || A.charAt(i) == 'O' || A.charAt(i) == 'I'
					|| A.charAt(i) == 'E' || A.charAt(i) == 'A') {

				//(a+b)%m = (a%m + b%m)%m
				int sub = (len - i)%mod;
				count = (count + sub)%mod;

			}

		}

		return count % 10003;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazingSubarray a = new AmazingSubarray();
		System.out.println(a.solve("ABEIC"));

	}

}
