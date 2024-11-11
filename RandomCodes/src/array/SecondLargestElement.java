package array;

public class SecondLargestElement {

	public int solve1(int[] A) {

		if (A.length < 2) {
			return -1;
		}

		int arr[] = new int[2];

		for (int i = 0; i < A.length; i++) {

			// when number is greater than the greatest
			if (A[i] > arr[0]) {
				arr[1] = arr[0];
				arr[0] = A[i];
			} else if (A[i] > arr[1] && A[i] <= arr[0]) {
				arr[1] = A[i];
			}

		}

		if (arr[1] == arr[0]) {
			return -1;
		}

		return arr[1];
	}

	public int solve(int[] A) {

		if (A.length < 2) {
			return -1;
		}
		
		int max = -1;
		int sMax = -1;

		for (int i = 0; i < A.length; i++) {

			if (A[i] > max) {
				max = A[i];
			}

		}

		for (int i = 0; i < A.length; i++) {

			if (A[i] > sMax && A[i] < max) {
				sMax = A[i];
			}

		}

		return sMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondLargestElement s = new SecondLargestElement();
		System.out.println(s.solve(new int[] { 13, 7, 16, 18, 14, 17, 18, 8, 10 }));

	}

}
