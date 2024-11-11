package array;

public class InPlacePrefixSum {

	public int[] solve(int[] A) {

		for (int i = 1; i < A.length; i++) {

			A[i] = A[i - 1] + A[i];

		}

		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InPlacePrefixSum p = new InPlacePrefixSum();
		int aa[] = p.solve(new int[] { 4, 3, 2 });
		for (int a : aa) {
			System.out.print(a + " ");
		}

	}

}
