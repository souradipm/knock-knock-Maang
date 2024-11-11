package subArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

	public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

		ArrayList<Integer> arr = new ArrayList<>();
		
		Map<Long, Integer> map = new HashMap<>();
		long sum = 0;
		
		map.put(0L, -1);
		
		for(int i=0;i<A.size();i++) {
			
			sum+=A.get(i);
			long target = sum-B;
			
			if(map.containsKey(target)) {
				
				int idx1 = map.get(target)+1;
				int idx2 = i;
				for(int j=idx1;j<=idx2;j++) {
					arr.add(A.get(j));
					
				}
				return arr;
				
			}else {
				map.put(sum,i);
			}
			
			
		}
		
		arr.add(-1);

		return arr;

	}

	public ArrayList<Integer> solve2(ArrayList<Integer> A, int B) {

		ArrayList<Integer> arr = new ArrayList<>();
		int idx1 = -1, idx2 = -1;

		int ps[] = new int[A.size()];
		ps[0] = A.get(0);

		for (int i = 1; i < A.size(); i++) {

			ps[i] = ps[i - 1] + A.get(i);

		}

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);

		for (int i = 0; i < ps.length; i++) {

			if (ps[i] == B) {
				idx1 = 0;
				idx2 = i;
				break;
			}

			int target = ps[i] - B;
			if (map.containsKey(target)) {

				idx1 = map.get(target) + 1;
				idx2 = i;
				break;

			} else {
				map.put(ps[i], i);
			}

		}

		if (idx1 == -1 && idx2 == -1) {
			arr.add(-1);
		} else {
			for (int i = idx1; i <= idx2; i++) {
				arr.add(A.get(i));
			}
		}

		return arr;
	}

	public int solve1(ArrayList<Integer> A, int B) {

		int psum = 0;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for (Integer num : A) {
			psum = psum + num;
			int sum2 = psum - B;
			if (map.containsKey(sum2)) {
				count += map.get(sum2);
			}
			if (map.containsKey(psum)) {
				map.put(psum, map.get(psum) + 1);
			} else {
				map.put(psum, 1);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarraySumEqualsK s = new SubarraySumEqualsK();

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);

//		A.add(5);
//		A.add(10);
//		A.add(20);
//		A.add(100);
//		A.add(105);

		System.out.println(s.solve2(A, 6));
//		System.out.println(s.solve(A, 110));

	}

}
