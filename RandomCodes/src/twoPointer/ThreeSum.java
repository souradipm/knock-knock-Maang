package twoPointer;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeSum {

	public int threeSumClosest(ArrayList<Integer> A, int B) {

		int n = A.size();
		int ans = 0;
		int min = Integer.MAX_VALUE;

		int p1 = 0, p2 = 1, p3 = n - 1;

		Collections.sort(A);
		while (p1 < n - 2) {
			while (p2 < p3) {
				int sum = A.get(p1) + A.get(p2) + A.get(p3);
				if (sum == B) {
					return B;
				} else if (sum < B) {
					p2++;
				} else {
					p3--;
				}

				int diff = sum - B;
				if (diff < 0) {
					diff = diff * -1;
				}
				if (diff < min) {
					min = diff;
					ans = sum;
				}
			}
			p1++;
			p2 = p1 + 1;
			p3 = n - 1;
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSum t = new ThreeSum();

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		System.out.println(t.threeSumClosest(A, 6));

	}

}
