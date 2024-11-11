package array;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {

//	O(N) space | O(N) time
	public int[] twoNumberSum(int[] array, int target) {

		Set<Integer> nums = new HashSet<>();
		for (int num : array) {
			int match = target - num;
			if (nums.contains(match)) {
				return new int[] { match, num };
			} else {
				nums.add(num);
			}
		}
		return new int[0];
	}

	public static void main(String[] args) {

		TwoNumberSum tnsum = new TwoNumberSum();
		int [] output = new int[2];
		output = tnsum.twoNumberSum(new int[] { 3, 5, -4, 8, 11, 1, -1, 6 }, 10);
		System.out.print("[");
		for(int n : output) {
			System.out.print(n+" ");
		}
		System.out.print("]");
	}
}
