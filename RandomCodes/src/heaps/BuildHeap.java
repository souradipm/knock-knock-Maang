package heaps;

public class BuildHeap {

	// 5, 13, -2, 11, 27, 31, 0, 19
	public int[] buildHeap(int[] A) {
		// code here
		int n = A.length;
		for (int i = (n / 2) - 1; i >= 0; i--) {
			heapify(A, i);
		}

		return A;
	}

	public void heapify(int[] A, int i) {

		int n = A.length;

		while (i < n) {

			int leftChild = (2 * i) + 1;
			int rightChild = (2 * i) + 2;
			int x = A[i];

			if (leftChild < n) {
				x = Math.min(x, A[leftChild]);
			}

			if (rightChild < n) {
				x = Math.min(x, A[rightChild]);
			}

			if (x == A[i]) {
				return;
			}

			if (leftChild < n && x == A[leftChild]) {
				swap(A, i, leftChild);
				i = leftChild;
			}

			if (rightChild < n && x == A[rightChild]) {
				swap(A, i, rightChild);
				i = rightChild;
			}

		}

	}

	public void swap(int[] A, int x, int y) {
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuildHeap b = new BuildHeap();
		int min[] = b.buildHeap(new int[] { 5, 13, -2, 11, 27, 31, 0, 19 });

		for (int m : min) {
			System.out.print(m + " ");
		}

	}

}
