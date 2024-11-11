package other;

public class PrimeNumberCount {

	/**
	 * You will be given an integer n. You need to return the count of prime numbers
	 * less than or equal to n.
	 */
	public int solve(int A) {
		int primeCount = 0;
		for (int num = 1; num <= A; num++) {
			int rootOfNum = (int) Math.sqrt(num);
			int count = 0;
			for (int i = 1; i <= rootOfNum; i++) {
				if (num % i == 0) {

					if (i != num / i) {
						count += 2;
					} else {
						count += 1;
					}
				}
			}
			if (count == 2) {
				primeCount += 1;
			}
		}
		return primeCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberCount p = new PrimeNumberCount();
		System.out.println(p.solve(20));

	}

}
