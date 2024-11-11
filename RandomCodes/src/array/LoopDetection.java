package array;

import java.util.ArrayList;
import java.util.List;

public class LoopDetection {

	public int loopLen(int arr[]) {

		List<Integer> list = new ArrayList<>();
		int i = 0;
		list.add(i);
		int val = arr[i];
		while (list.size() != arr.length) {

			list.add(val);
			val = arr[val];
			if (list.contains(val)) {
				return list.size() + 1;
			}

		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopDetection l = new LoopDetection();
		System.out.println(l.loopLen(new int[] { 2, 4, 3, 0, 1 }));
		System.out.println(l.loopLen(new int[] { 1, 2, 3, 4, 5 }));
	}

}
