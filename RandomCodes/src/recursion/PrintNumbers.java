package recursion;

public class PrintNumbers {

	public void solve(int A) {

		if (A < 1) {
			return;
		}

		System.out.print(A+" ");
		solve(A - 1);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumbers p = new PrintNumbers();
		p.solve(9);
//		System.out.println();

	}

}
