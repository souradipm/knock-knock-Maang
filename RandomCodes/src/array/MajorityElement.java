package array;

import java.util.List;

public class MajorityElement {

	// N/3 majority element
	public int N3majorityElement(final List<Integer> a) {

		if (a.size() == 0) {
			return -1;
		} else if (a.size() == 1) {
			return a.get(0);
		} else if (a.size() == 2) {
			return a.get(0);
		} else {

			int first = a.get(0), second = a.get(1);
			int count1 = 1, count2 = 1;

			for (int i = 2; i < a.size(); i++) {

				if (a.get(i) == first) {
					count1++;
				} else if (a.get(i) == second) {
					count2++;
				} else if (count1 == 0) {
					first = a.get(i);
				} else if (count2 == 0) {
					second = a.get(i);
				} else {
					count1--;
					count2--;
				}

			}

			count1 = 0;
			count2 = 0;
			for (int i = 0; i < a.size(); i++) {

				if (first == a.get(i)) {
					count1++;
				} else if (second == a.get(i)) {
					count2++;
				}

			}

			if (count1 > a.size() / 3) {
				return first;
			} else if (count2 > a.size() / 3) {
				return second;
			} else {
				return -1;
			}
		}

	}

	public int majorityElementoptimal(int[] array) {

		int count = 0;
		int val = 0;

		for (int i : array) {

			if (count == 0) {
				val = i;
			}

			if (i == val) {
				count++;
			} else {
				count--;
			}

		}

		return val;

	}

	public int majorityElement(int[] array) {
		// Write your code here.

		int totalElements = array.length;

		for (int i = 0; i < totalElements; i++) {

			int count = 1;

			for (int j = i + 1; j < totalElements; j++) {

				if (array[j] == array[i]) {
					count++;
				}
			}
			if (count > totalElements / 2) {
				return array[i];
			}

		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MajorityElement m = new MajorityElement();
//		System.out.println(m.majorityElementoptimal(new int[] { 1, 2, 3, 2, 2, 1, 2 }));
//		System.out.println(m.majorityElementoptimal(new int[] { 1,2,3,1,1,2 }));
//		System.out.println(m.majorityElementoptimal(new int[] { 1,2,3,1,1 }));

//		System.out.println(m.N3majorityElement(new int[] { 1, 2, 3, 1 }));

	}

}
