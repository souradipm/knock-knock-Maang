package sortingSearching;

import java.util.Arrays;
import java.util.Collections;

public class ElementRemoval {
	
	//TC:O(N) || SC:O(N)
		public int solveoptimal(int[] A) {
		
			int sum=0;
			Integer[] arr = new Integer[A.length];
			for(int i=0;i<A.length;i++) {
				arr[i] = A[i];
			}
			Arrays.sort(arr, Collections.reverseOrder());
			
			for(int i=0;i<arr.length;i++) {
				
				sum+=(i+1)*arr[i];
				
			}
		
			return sum;
		}

	//TC:O(N) || SC:O(N)
	public int solve(int[] A) {
	
		int sum=0;
		Arrays.sort(A);
		int ps[] = new int[A.length];
		ps[0] = A[0];
		for(int i=1;i<A.length;i++) {
			
			ps[i] = ps[i-1]+A[i];
		}
		
		for(int j=0;j<ps.length;j++) {
			sum+=ps[j];
		}
	
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElementRemoval e = new ElementRemoval();
		System.out.println(e.solveoptimal(new int[] {2,1}));
		System.out.println(e.solveoptimal(new int[] {5}));

	}

}
