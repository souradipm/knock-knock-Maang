package array;

public class SecondSmallestElement {

	/**
	 *  Second Smallest element in an array
	 * @param input
	 * @return
	 */
	public int secElement(int input[]) {

		int arr[] = new int[2];
		arr[0] = input[0];
		arr[1] = input[1];

		for (int i = 2; i < input.length; i++) {

			if (input[i] < arr[1]) {
				if (input[i] < arr[0]) {
					arr[1] = arr[0];
					arr[0] = input[i];

				} else {
					arr[1] = input[i];
				}
			}

		}

		return arr[1];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondSmallestElement s = new SecondSmallestElement();
		System.out.println(s.secElement(new int[] { 2, 3, 4, 5, 6, 0, 1 }));

	}

}
