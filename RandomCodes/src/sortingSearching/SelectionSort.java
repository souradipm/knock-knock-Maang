package sortingSearching;

public class SelectionSort {

	public int[] sSort(int A[]) {

		for (int i = 0; i < A.length; i++) {

			for (int j = i + 1; j < A.length; j++) {

				if (A[i] > A[j]) {
					int t = A[i];
					A[i] = A[j];
					A[j] = t;
				}
			}
		}
		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort s = new SelectionSort();
		int A[] = s.sSort(new int[] { 25, 35, 45, 12, 65, 10 });
		for (int a : A) {
			System.out.print(a + " ");
		}
		System.out.println();

	}

}
