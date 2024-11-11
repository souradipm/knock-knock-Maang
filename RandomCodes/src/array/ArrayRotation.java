package array;

public class ArrayRotation {

	public int[] reverseArray(int arr[], int lIdx, int rIdx) {

		int i = lIdx;
		int j = rIdx;
		while (i < j) {
			int t = arr[j];
			arr[j] = arr[i];
			arr[i] = t;
			i++;
			j--;

		}
		return arr;
	}

	/**
	 * Method to rotate a given array k times
	 * 
	 * @param arr
	 * @param k
	 * @return
	 */
	public int[] rotateArray(int arr[], int k) {
		
		int len = arr.length;
		if(k>len) {
			k = k%len;
		}

		arr = reverseArray(arr, 0, arr.length - 1);
		arr = reverseArray(arr, 0, k - 1);
		arr = reverseArray(arr, k, arr.length - 1);

		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRotation a = new ArrayRotation();
		a.reverseArray(new int[] { 1, 2, 3, 4, 5, 6 }, 0, 5);
		int arr[] = a.rotateArray(new int[] { 1, 2, 3, 4, 5, 6 }, 10);
//		int arr[] = a.rotateArray(new int[] { 88, 17, 36, 79, 60, 11, 69, 49, 93, 63, 86, 59, 15, 92, 66, 9, 70, 72, 92,
//				83, 45, 5, 21, 66, 66, 68, 9, 74, 16, 89, 30, 54, 68, 49, 57, 99, 68, 39, 67, 69, 31, 88, 46, 64, 100,
//				27, 81, 44, 70, 45, 59, 19, 45, 18, 57, 37, 32, 94, 35, 47, 29, 9, 91, 17, 24, 39, 46, 42, 36, 45, 69,
//				99, 93, 83, 42, 60, 56 }, 84);
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]);
		}
	}
}
