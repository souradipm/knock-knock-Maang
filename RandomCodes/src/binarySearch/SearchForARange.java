package binarySearch;

import java.util.ArrayList;
import java.util.List;

public class SearchForARange {

	public ArrayList<Integer> searchRange(final List<Integer> A, int B) {

		int len = A.size();
		int l = 0, r = len - 1;
		ArrayList<Integer> ans = new ArrayList<>();
		
		if (len == 1) {
			ans.add(0);
			ans.add(0);
			return ans;
		}
		
		ans.add(0,-1);
		ans.add(1,-1);

		// find the 1st occurence
		while (l <= r) {

			int mid = l + (r - l) / 2;

			if (A.get(mid) == B) {

//				ans.add(0, mid);
				ans.set(0, mid);
				r = mid - 1;

			} else if (B > A.get(mid)) {

				l = mid + 1;

			} else {
				r = mid - 1;
			}

		}

		// find the last occurence
		l = 0;
		r = len - 1;
		while (l <= r) {

			int mid = l + (r - l) / 2;

			if (A.get(mid) == B) {

//				ans.add(1, mid);
				ans.set(1, mid);
				l = mid + 1;

			} else if (B > A.get(mid)) {

				l = mid + 1;

			} else {
				r = mid - 1;
			}

		}

		if (ans.isEmpty()) {
			ans.add(-1);
			ans.add(-1);
		}
		

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchForARange s = new SearchForARange();

		ArrayList<Integer> A = new ArrayList<>();
		A.add(5);
		A.add(7);
		A.add(7);
		A.add(8);
		A.add(8);
		A.add(10);

//		ArrayList<Integer> B = new ArrayList<>();
//		B.add(5);
//		B.add(17);
//		B.add(100);
//		B.add(111);
		
		ArrayList<Integer> B = new ArrayList<>();
		B.add(1);

//		System.out.println(s.searchRange(A, 8));
		System.out.println(s.searchRange(B, 1));

	}

}
