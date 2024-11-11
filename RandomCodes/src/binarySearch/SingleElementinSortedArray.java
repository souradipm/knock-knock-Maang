package binarySearch;

import java.util.ArrayList;

public class SingleElementinSortedArray {

	public int solve(ArrayList<Integer> A) {

		int len = A.size();
		if (len == 1) {
			return A.get(0);
		}
		if (!A.get(0).equals(A.get(1))) {
			return A.get(0);
		}
		if (!A.get(len - 1).equals(A.get(len - 2))) {
			return A.get(len - 1);
		}

		int low = 0, high = A.size() - 1;

		while (low < high) {

			int mid = low + (high - low) / 2;

			if (mid % 2 == 0) {

				if (A.get(mid).equals(A.get(mid + 1))) {

					low = mid + 2;

				} else {

					high = mid;

				}

			} else {

				if (A.get(mid).equals(A.get(mid - 1))) {

					low = mid + 1;

				} else {

					high = mid;

				}

			}

		}

		return A.get(low);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleElementinSortedArray s = new SingleElementinSortedArray();

		ArrayList<Integer> aa = new ArrayList<>();
		aa.add(13);
		aa.add(13);
		aa.add(21);
		aa.add(21);
		aa.add(27);
		aa.add(50);
		aa.add(50);

//		[13,13,21,21,27,50,50,102,102,108,108,110,110,117,117,120,120,123,123,124,124,132,132,164,164,166,166,190,190,200,200,212,212,217,217,225,225,238,238,261,261,276,276,347,347,348,348,386,386,394,394,405,405,426,426,435,435,474,474,493,493]

		System.out.println(s.solve(aa));

	}

}
