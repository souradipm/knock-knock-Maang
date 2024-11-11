package bitManipulation;

public class UnsetIBit {

	public int solve(int A, int B) {

		if ((A & (1 << B)) != 0) {
			A = A ^ (1 << B);
			return A;
		}

		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnsetIBit u = new UnsetIBit();
		System.out.println(u.solve(5, 2));

	}

}
