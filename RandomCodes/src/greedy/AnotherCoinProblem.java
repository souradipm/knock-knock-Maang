package greedy;

public class AnotherCoinProblem {

	public int solve(int A) {

		int total = 0;
		int num = A;
		while (num > 0) {

			int n = num % 5;
			total += n;

			num = num / 5;

		}

		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnotherCoinProblem a = new AnotherCoinProblem();
		System.out.println(a.solve(5));

	}

}
