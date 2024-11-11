package other;

public class NumberOfOne {

	public int solve(int A) {

		int ans = 0;
		int temp = A;
		int i = 1;
		while (temp / i > 0) {

			int num = (A / (i * 10)) * i + Math.min(Math.max((A % (i * 10) - (i - 1)), 0), i);
			ans += num;
			i *= 10;

		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfOne n = new NumberOfOne();
		System.out.println(n.solve(10));

	}

}
