package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountPairSum {
	
	public int solve(ArrayList<Integer> A, int B) {
    
		int ans=0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for(Integer a : A) {
			
			int target = B-a;
			if(map.containsKey(target)) {
				ans+=map.get(target);
			}
			
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else {
				map.put(a,1);
			}
			
		}
		
		
	
		return ans%1000000007;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPairSum c = new CountPairSum();
		
		ArrayList<Integer> A  = new ArrayList<>();
//		A.add(3);
//		A.add(5);
//		A.add(1);
//		A.add(2);
		
		A.add(1);
		A.add(2);
		A.add(1);
		A.add(2);
		
//		System.out.println(c.solve(A, 8));
		System.out.println(c.solve(A, 3));

	}

}
