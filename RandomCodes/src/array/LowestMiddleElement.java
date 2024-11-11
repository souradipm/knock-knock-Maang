package array;

public class LowestMiddleElement {

	/**
	 * N length of array is given. All the elements are unique (No duplicate). You
	 * need to find out such element, that is lesser than its immediate right
	 * element as well as immediate left element and return that element, if found.
	 * For first element you should only check for its immediate right element and
	 * for last element you should only check for its immediate left element. If
	 * there is no such element, then return 0. Solve this in optimal way.
	 * 
	 */
	public int findSpecialElement(int[] arr) {

		int n = arr.length;
		if (n < 2) {
			return 0;
		} else if (arr[0] < arr[1]) {
			return arr[0];
		} else if (arr[n - 1] < arr[n - 2]) {
			return arr[n - 1];
		} else {
			for (int i = 1; i < n - 1; i++) {
				if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
					return arr[i];
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {

		LowestMiddleElement l = new LowestMiddleElement();
		System.out.println(l.findSpecialElement(new int[] { 10, 8, 7, 11, 6, 9, -2 }));
		System.out.println(l.findSpecialElement(new int[] { 1, 2, 3, 4, 5, 6, 8 }));
		System.out.println(l.findSpecialElement(new int[] { 1 }));
	}

}
