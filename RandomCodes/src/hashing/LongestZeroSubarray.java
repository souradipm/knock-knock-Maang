package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestZeroSubarray {
	
	public int solve(ArrayList<Integer> A) {
    
		long sum = 0;
		int len = 0;
		long maxLen = Integer.MIN_VALUE;
		Map<Long, Integer> map = new HashMap<>();
		
		for(int i=0;i<A.size();i++) {
			
			sum+=A.get(i);
			if(sum == 0) {
				len = i+1;
				maxLen = Math.max(maxLen, len);
			}
			
			if(map.containsKey(sum)) {
				len = i-map.get(sum);
				maxLen = Math.max(maxLen, len);
			}else {
				map.put(sum, i);
			}
			
		}
		
		
	
	
		return (int) (maxLen<0?0:maxLen);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestZeroSubarray l = new LongestZeroSubarray();
		ArrayList<Integer> arr = new ArrayList<>();
//		arr.add(1);
//		arr.add(-2);
//		arr.add(1);
//		arr.add(2);
		
		arr.add(9);
		arr.add(-20);
		arr.add(-11);
		arr.add(-8);
		arr.add(-4);
		arr.add(2);
		arr.add(-12);
		arr.add(14);
		arr.add(1);
		System.out.println(l.solve(arr));

	}

}
