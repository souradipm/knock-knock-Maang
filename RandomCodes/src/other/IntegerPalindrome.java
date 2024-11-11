package other;

public class IntegerPalindrome {

	public boolean isPalindrome(int x) {

		int num = x;
		int rev = 0;

		while (num > 0) {

			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}

		return rev == x ? true : false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerPalindrome p = new IntegerPalindrome();
		System.out.println(p.isPalindrome(121));

	}

}
