package array;

public class NextPermutation {

	public int[] nextPermutation(int[] A) {

		// [1,2,3] => [1,3,2]
		// [3,2,1]
		// [2,3,1]

		// find x such that A[i] < A[i+1]
		int nums[] = A;
		int ind1 = -1;
		int ind2 = -1;
		// step 1 find breaking point
		for (int i = A.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				ind1 = i;
				break;
			}
		}
		// if there is no breaking point
		if (ind1 == -1) {
			return reverse(nums, 0);
		}

		else {
			// step 2 find next greater element and swap with ind2
			for (int i = nums.length - 1; i >= 0; i--) {
				if (nums[i] > nums[ind1]) {
					ind2 = i;
					break;
				}
			}

			nums = swap(nums, ind1, ind2);
			// step 3 reverse the rest right half
			return reverse(nums, ind1 + 1);
		}
	}

	int[] swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
		return nums;
	}

	int[] reverse(int[] nums, int start) {
		int i = start;
		int j = nums.length - 1;
		while (i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextPermutation n = new NextPermutation();
//		int arr[] = n.nextPermutation(new int[] { 1, 2, 3 });
		int arr[] = n.nextPermutation(new int[] { 3, 2, 1 });

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
