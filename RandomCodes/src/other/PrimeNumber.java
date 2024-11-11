package other;

import java.math.BigInteger;

public class PrimeNumber {

	public boolean isPrimeOptimal(BigInteger A) {

		int count = 0;
		int B = A.intValue();
		int num = (int) Math.sqrt(B);
		for (int i = 1; i <= num; i++) {

			if (B % i == 0) {
				if (i != B / i) {
					count += 2;
				} else {
					count += 1;
				}
			}
		}
		return count == 2;
	}
	
	
	public boolean isPrime(int num) {

		if (num == 1 || num == 2) {
			return true;
		} else {

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					return false;
				}

			}

		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber p = new PrimeNumber();
//		System.out.println(p.isPrime(1));
//		System.out.println(p.isPrimeOptimal(new BigInteger(500000000000000000000)));

	}

}
