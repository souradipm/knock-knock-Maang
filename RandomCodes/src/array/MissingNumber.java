package array;

public class MissingNumber {

	// [1,4,3]
	public int[] missingNumbers(int[] nums) {

		int len = nums.length;
		int actualLen = len + 2;

		int totalSum = actualLen * (actualLen + 1) / 2;
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}

		int diff = totalSum - sum;
		int ave = diff / 2;
		int leftVal = 0, rightVal = 0;

		for (int i : nums) {

			if (i <= ave) {
				leftVal += i;
			} else {
				rightVal += i;
			}

		}

		int sumOfLeftHalf = ave * (ave + 1) / 2;
		int sumOfRightHalf = totalSum - sumOfLeftHalf;

		int arr[] = new int[2];
		arr[0] = sumOfLeftHalf - leftVal;
		arr[1] = sumOfRightHalf - rightVal;

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumber m = new MissingNumber();
		int arr[] = m.missingNumbers(new int[] { 1, 4, 3 });
		for (int i : arr) {
			System.out.println(i + " ");
		}

	}

}
