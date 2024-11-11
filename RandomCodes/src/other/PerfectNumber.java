package other;

/**
 * You are given an integer A. You have to tell whether it is a perfect number
 * or not Perfect number is a positive integer which is equal to the sum of its
 * proper positive divisors.
 * 
 * A proper divisor of a natural number is the divisor that is strictly less
 * than the number.
 *
 */
public class PerfectNumber {

	public int solve(int A) {

		if(A==1) {
			return 0;
		}
		int num = (int) Math.sqrt(A);
		int sum = 1;
		for (int i = 2; i <= num; i++) {

			if (A % i == 0) {
				int div = A / i;
				sum = sum + i + div;
			}

		}

		return A == sum ? 1 : 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumber p = new PerfectNumber();
		System.out.println(p.solve(4));

	}

}
