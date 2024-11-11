package sortingSearching;

import java.util.Arrays;

public class NobelInteger {

	public int solve(int[] A) {

			Arrays.sort(A);
	
			int len = A.length;
	
			for (int i = 0; i < len-1; i++) {
	
				if (A[i] == len - i - 1 && A[i] != A[i + 1]) {
					return 1;
				}
	
			}
			if(A[len-1] == 0) {
				return 1;
			}
	
			return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NobelInteger n = new NobelInteger();
//		System.out.println(n.solve(new int[] { 3, 2, 1, 3 }));
		System.out.println(n.solve(new int[] { -2,-1,0,0,0,-3 }));

	}

}
