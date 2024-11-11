package sortingSearching;

import java.util.Arrays;

public class KSmallestElement {

	public int kthsmallest(final int[] A, int B) {

		Arrays.sort(A);

		return A[B - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KSmallestElement k = new KSmallestElement();
		System.out.println(k.kthsmallest(new int[] { 2, 1, 4, 3, 2 }, 3));

	}

}
