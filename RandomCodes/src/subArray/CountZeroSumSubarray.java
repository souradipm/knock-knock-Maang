package subArray;

import java.util.ArrayList;
import java.util.HashMap;

public class CountZeroSumSubarray {
	
	public int solve(ArrayList<Integer> A) {
		
		int count=0;
		long[] ps = new long[A.size()];
		ps[0] = A.get(0);
		for(int i=1;i<A.size();i++){
			ps[i] = ps[i-1]+A.get(i);
		}
		
		HashMap<Long,Integer> map = new HashMap<>();
		map.put(Long.valueOf(0),1);
		for(int i=0;i<ps.length;i++){
			if(map.containsKey(ps[i])){
					
				int val = map.get(ps[i]);
				count+= val;
				map.put(ps[i],val+1);
			}else{
				map.put(ps[i],1);	
			}
		}
		return count%1000000007;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountZeroSumSubarray c = new CountZeroSumSubarray();
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(-1);
		A.add(2);
		A.add(-2);
		System.out.println(c.solve(A));

	}

}
