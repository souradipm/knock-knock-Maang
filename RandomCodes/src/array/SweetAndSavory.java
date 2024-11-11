package array;

import java.util.Arrays;

public class SweetAndSavory {

	public int[] sweetAndSavory(int[] dishes, int target) {

		Arrays.sort(dishes);

//		[-102, -90, 12, 16, 17, 37, 49, 49, 52, 53, 102]

		int sweet = 0, savory = dishes.length - 1;
		int bestPair[] = new int[] { 0, 0 };
		int maxSum = Integer.MIN_VALUE;

		while (sweet < savory && dishes[sweet] < 0 && dishes[savory] > 0) {

			int sum = dishes[sweet] + dishes[savory];

			if (sum > target) {
				savory--;
			} else {

				if (sum > maxSum) {
					maxSum = sum;
					bestPair[0] = dishes[sweet];
					bestPair[1] = dishes[savory];

				}
				sweet++;

			}

		}
		return bestPair;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SweetAndSavory s = new SweetAndSavory();
		int arr[] = s.sweetAndSavory(new int[] {-3,-5,1,7}, 8);
//		int arr[] = s.sweetAndSavory(new int[] { 17, 37, 12, -102, 53, 49, -90, 102, 49, 16, 52 }, 11);
		for (int a : arr) {
			System.out.print(a + ",");
		}
	}
}
