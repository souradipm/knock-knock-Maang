package bitManipulation;

public class UnsetBit {

	public Long solve(Long A, int B) {

		long ans = A;
		for (int i = 0; i < B; i++) {

			if ((A & (1 << i)) != 0) {
				ans -= 1 << i;
			}

		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnsetBit u = new UnsetBit();
		System.out.println(u.solve(37L, 3));

	}

}
