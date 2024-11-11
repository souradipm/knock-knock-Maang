package subArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ZeroSumSubarray {

	public int[] findZeroSumSubarray(int[] nums) {

		if (nums.length == 0) {
			return new int[] {};
		}

		int ps[] = new int[nums.length];
		ps[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == 0) {
				return new int[] { i };
			}
			ps[i] = ps[i - 1] + nums[i];
		}

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 0);

		for (int i = 0; i < ps.length; i++) {

			if (map.containsKey(ps[i])) {
				int val = map.get(ps[i]);
				return new int[] { val + 1, i };
			} else {
				map.put(ps[i], i);
			}

		}

		return new int[] {};
	}

	public boolean zeroSumSubarray(int[] nums) {

		if (nums.length == 0) {
			return false;
		}

		int ps[] = new int[nums.length];
		ps[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == 0) {
				return true;
			}
			ps[i] = ps[i - 1] + nums[i];
		}

		Set<Integer> set = new HashSet<>();
		set.add(0);

		for (int a : ps) {

			if (set.contains(a)) {
				return true;
			} else {
				set.add(a);
			}

		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroSumSubarray z = new ZeroSumSubarray();
//		System.out.println(z.zeroSumSubarray(new int[] { -5, -5, 2, 3, -2 }));
//		System.out.println(z.zeroSumSubarray(new int[] { 2, -2 }));
//		System.out.println(z.zeroSumSubarray(new int[] {}));
		
		int arr[] = z.findZeroSumSubarray(new int[] { -5, -5, 2, 3, -2 });
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
	}

}
