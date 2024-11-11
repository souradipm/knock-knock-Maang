package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DistinctNumberInWindow {
	
	 public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
	    
		 Map<Integer,Integer> map = new HashMap<>();
		 ArrayList<Integer> arr = new ArrayList<>();
		 for(int i=0;i<B;i++) {
			 
			map.put(A.get(i), map.getOrDefault(A.get(i), 0)+1);
			 
		 }
		 arr.add(map.size());
		 
		 int l=1, r = B;
		 while(r<A.size()) {
			 int remove = A.get(l-1);
			 map.put(remove, map.getOrDefault(remove, 0)-1);
			 if(map.get(remove)<1) {
				 map.remove(remove);
			 }
			 map.put(A.get(r), map.getOrDefault(A.get(r), 0)+1);
			 arr.add(map.size());
			 l++;
			 r++;
			 
		 }
		 
		 
	 
	 
		 return arr;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistinctNumberInWindow d = new DistinctNumberInWindow();
		
		ArrayList<Integer> A = new ArrayList<>();
//		A.add(1);
//		A.add(2);
//		A.add(1);
//		A.add(3);
//		A.add(4);
//		A.add(3);
//		System.out.println(d.dNums(A, 3));
		
		A.add(1);
		A.add(1);
		A.add(2);
		A.add(2);
		System.out.println(d.dNums(A, 1));

	}

}
