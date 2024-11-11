package array;

public class CountElements {

	public int solve(int[] A) {

		int max = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < A.length; i++) {

			if (A[i] > max) {
				max = A[i];
			}
		}

		for (int i = 0; i < A.length; i++) {

			if (A[i] < max) {
				count++;
			}

		}

		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountElements c = new CountElements();
//		System.out.println(c.solve(new int[] { 5, 5, 3 }));

		int arr[] = new int[] { 10, 20, 30, 40, 50 };
		arr[3] = 98;
		System.out.println(arr[3]);

	}

}
