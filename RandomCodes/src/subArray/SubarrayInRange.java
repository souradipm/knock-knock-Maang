package subArray;

public class SubarrayInRange {

	public int[] solve(int[] A, int B, int C) {

		int arr[] = new int[C - B + 1];
		int count = 0;
		for (int i = B; i <= C; i++) {

			arr[count++] = A[i];
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarrayInRange s = new SubarrayInRange();
//		int arr[] = s.solve(new int[] { 4, 3, 2, 6 }, 1, 3);
		int arr[] = s.solve(new int[] { 4, 2, 2 }, 0, 1);
		for (int a : arr) {
			System.out.print(a);
		}
	}

}
