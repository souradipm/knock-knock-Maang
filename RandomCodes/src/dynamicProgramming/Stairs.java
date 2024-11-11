package dynamicProgramming;

public class Stairs {

	public int climbStairs(int A) {

		int prev = 1, prevToPrev = 1;
		if (A < 2) {
			return 1;
		}

		int curr = 0;

		for (int i = 2; i <= A; i++) {
			curr = (prev + prevToPrev) % 1000000007;
			prevToPrev = prev;
			prev = curr;
		}

		return curr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stairs s = new Stairs();
		System.out.println(s.climbStairs(4));
	}

}
