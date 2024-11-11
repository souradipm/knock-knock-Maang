package bitManipulation;

public class SetBit {

	public int solve(int A, int B) {

		int n = 0;

		n = (n | (1 << A));

		n = (n | (1 << B));

		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetBit s = new SetBit();
		System.out.println(s.solve(3, 5));

	}

}
