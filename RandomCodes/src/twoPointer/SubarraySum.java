package twoPointer;

import java.util.ArrayList;

public class SubarraySum {

	/**
	 * Given an array of positive integers A and an integer B, find and return first
	 * continuous subarray which adds to B.
	 * 
	 * If the answer does not exist return an array with a single integer "-1".
	 * 
	 * First sub-array means the sub-array for which starting index in minimum.
	 */
	public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

		ArrayList<Integer> arr = new ArrayList<>();

		int l = 0, r = 0;
		int sum = A.get(l);

		while (r < A.size()) {

			if (sum < B) {
				r++;
				if (r < A.size()) {
					sum += A.get(r);
				}

			} else if (sum > B) {

				sum = sum - A.get(l);
				l++;
			} else if (sum == B) {
				for (int i = l; i <= r; i++) {
					arr.add(A.get(i));
				}
				break;
			}

		}

		if (arr.size() == 0) {
			arr.add(-1);
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarraySum s = new SubarraySum();

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(15);
		arr.add(2);
		arr.add(5);
		arr.add(7);
		arr.add(9);

		System.out.println(s.solve(arr, 7));

	}

}
