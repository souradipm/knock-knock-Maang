package Java8;

import java.util.HashSet;
import java.util.Set;

public class Deadlock {

//	[-1, 1, 1, 2, 6, 4, 6, 7] sum =  9.

//	TC:O(n)  | SC O(N)
	public int[] solve(int[] arr, int sum) {

		Set<Integer> set = new HashSet<>();

		for (int num : arr) {

			int match = sum - num;

			if (set.contains(match)) {

				return new int[] { match, num };
			} else {

				set.add(num);

			}

		}

		return new int[] {};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deadlock d = new Deadlock();
		int arr[] = d.solve(new int[] {-1, 1, 1, 2, 6, 4, 6, 7}, 9);
		
		for(int a:arr) {
			System.out.print(a+",");
		}
		

	}

}
