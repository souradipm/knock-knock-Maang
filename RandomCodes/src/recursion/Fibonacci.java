package recursion;

public class Fibonacci {

	public int findAthFibonacci1(int A) {

		if (A == 0) {
			return 0;
		} else if (A == 1) {
			return 1;
		} else {
			int x = 0, y = 1;
			int fibo = 0;

			for (int i = 2; i <= A; i++) {

				fibo = x + y;
				x = y;
				y = fibo;

			}
			return fibo;
		}
	}

	public int findAthFibonacci(int A) {

		if (A == 0) {
			return 0;
		} else if (A == 1) {
			return 1;
		}

		return findAthFibonacci(A - 1) + findAthFibonacci(A - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		System.out.println(f.findAthFibonacci(9));
	}

}
