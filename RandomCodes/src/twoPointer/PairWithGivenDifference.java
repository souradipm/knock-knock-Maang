package twoPointer;

import java.util.ArrayList;
import java.util.Collections;

public class PairWithGivenDifference {

	/**
	 * Given an one-dimensional integer array A of size N and an integer B.
	 * 
	 * Count all distinct pairs with difference equal to B.
	 * 
	 * Here a pair is defined as an integer pair (x, y), where x and y are both
	 * numbers in the array and their absolute difference is B.
	 * 
	 */
	public int solve(ArrayList<Integer> A, int B) {
		
		
		Collections.sort(A);
		int count = 0;
		int l = 0, r = 1;
		
		while(r<A.size()) {
			
			int diff = A.get(r) - A.get(l);
			
			
			if(l==r) {
				r++;
			}else if(diff == B) {
				count++;
				r++;
				while(r<A.size() && A.get(r).equals(A.get(r-1))) {
					r++;
				}
			}
			
			else if(diff>B) {
				l++;
			}else {
				r++;
			}
			
			
		}
		
		

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairWithGivenDifference p = new PairWithGivenDifference();
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(8);
		a.add(12);
		a.add(16);
		a.add(4);
		a.add(0);
		a.add(20);
		
		System.out.println(p.solve(a, 8));

	}

}
