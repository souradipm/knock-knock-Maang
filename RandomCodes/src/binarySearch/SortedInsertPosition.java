package binarySearch;

import java.util.ArrayList;

public class SortedInsertPosition {

	public int searchInsert(ArrayList<Integer> A, int B) {

		int l = 0, r = A.size() - 1;
		int idx = -1;
		int max = Integer.MIN_VALUE;

		while (l <= r) {

			int mid = l + (r - l) / 2;

			if (A.get(mid) == B) {
				return mid;

			} else if (A.get(mid) < B) {

				int num = A.get(mid);
				if (num > max) {
					max = num;
					idx = mid;
				}

				l = mid + 1;
			} else {

				r = mid - 1;
			}

		}

		return idx + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedInsertPosition s = new SortedInsertPosition();

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(6);

		System.out.println(s.searchInsert(list, 7));

	}

}
