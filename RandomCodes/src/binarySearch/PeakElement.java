package binarySearch;

import java.util.ArrayList;

public class PeakElement {

	public int solve(ArrayList<Integer> A) {

		int len = A.size();

		if (len == 1) {
			return A.get(0);
		}
		if (A.get(0) >= A.get(1)) {
			return A.get(0);
		}
		if (A.get(len - 1) >= A.get(len - 2)) {
			return A.get(len - 1);
		}

		int l = 1, h = len - 2;

		while (l <= h) {

			int mid = l + (h - l) / 2;

			if (A.get(mid) > A.get(mid - 1) && A.get(mid) > A.get(mid + 1)) {
				return A.get(mid);
			}

			if (A.get(mid) > A.get(mid - 1) && A.get(mid) < A.get(mid + 1)) {
				l = mid + 1;
			} else if (A.get(mid) < A.get(mid - 1) && A.get(mid) > A.get(mid + 1)) {
				h = mid - 1;
			}

		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeakElement p = new PeakElement();
		ArrayList<Integer> A = new ArrayList<>();
//		A.add(5);
//		A.add(17);
//		A.add(100);
//		A.add(11);

//		A.add(1);
//		A.add(2);
//		A.add(3);
//		A.add(4);
		A.add(5);

		System.out.println(p.solve(A));

	}

}
