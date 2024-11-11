package array;

/**
 * Given an array A of N integers and also given two integers B and C. Reverse
 * the elements of the array A within the given inclusive range [B, C].
 * 
 */
public class ReverseInARange {

	public int[] solve(int[] A, int B, int C) {

		int i = B;
		int j = C;
		while (i < j) {

			int t = A[i];
			A[i] = A[j];
			A[j] = t;
			i++;
			j--;

		}

		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInARange r = new ReverseInARange();
		int arr[] = r.solve(new int[] { 2, 5, 6 }, 0, 2);
		for (int i : arr) {
			System.out.print(i);
		}
//		System.out.println(r.solve(new int[] {1,2,3,4}, 2, 3));

	}

}
