package array;

import java.util.ArrayList;
import java.util.HashMap;

public class CountPairDifference {

	public int solve(ArrayList<Integer> A, int B) {

		int ans = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (Integer num : A) {
			ans += map.getOrDefault(num - B, 0);
			ans += map.getOrDefault(num + B, 0);
			ans %= 1000000007;

			map.put(num, map.getOrDefault(num, 0) + 1);

		}

		return ans;
	}

	public int solve1(int[] A, int B) {

		int n = A.length;
		int mod = 1000000007;
		HashMap<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		for (int i = 0; i < n; i++) {

			int ele1 = A[i] - B;
			if (map.containsKey(ele1)) {
				ans += map.get(ele1);
				map.put(A[i], map.get(A[i]) + 1);
			}

			int ele2 = A[i] + B;
			if (map.containsKey(ele2)) {
				ans += map.get(ele2);
				map.put(A[i], map.get(A[i]) + 1);
			}

			ans %= mod;
			map.put(A[i], 1);

//			map.put(A[i] , map.getOrDefault(A[i] , 0) + 1);

//		ans += map.getOrDefault(A[i] - B , 0);
//		ans += map.getOrDefault(A[i] + B , 0);
//		ans %= mod;
//		map.put(A[i] , map.getOrDefault(A[i] , 0) + 1);

		}
		return ans;
	}

//		Map<Integer, Integer> map  = new HashMap<>();
//		int count = 0;
//		
//		for(Integer num : A) {
//			
//			int ele1 = num+B;
//			if(map.containsKey(ele1)) {
//				count+=map.get(ele1);
//			}
//			
//			int ele2 = num-B;
//			if(map.containsKey(ele2)) {
//				count+=map.get(ele2);
//			}
//			
//			count = count%1000000007;
//			
//			map.put(num, map.get(num)+1);
//			
//			
//		}
//		
//		
//    
//		
//		return count;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPairDifference c = new CountPairDifference();
//		System.out.println(c.solve(new int[] {1,2,1,2}, 1));

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(1);
		A.add(2);

		System.out.println(c.solve(A, 1));

	}

}
