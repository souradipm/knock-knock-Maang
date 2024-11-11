package subArray;

public class SubarrayWithGivenSumAndLength {

	/**
	 * Given an array A of length N. Also given are integers B and C.
	 * 
	 * Return 1 if there exists a subarray with length B having sum C and 0
	 * otherwise
	 * 
	 */
	public int solve(int[] A, int B, int C) {
		
		int i=0;
		int j=i+B;
		
		while(j<=A.length) {
			int sum = sum(A,i,j);
			if(sum == C) {
				return 1;
			}
			i++;
			j++;
		}

		return 0;
	}
	
	public int sum(int A[], int l, int r) {
		
		int sum = 0;
		for(int i=l;i<r;i++) {
			sum+=A[i];
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarrayWithGivenSumAndLength s = new SubarrayWithGivenSumAndLength();
		System.out.println(s.solve(new int[] {4,3,2,6,1}, 3, 11));
		System.out.println(s.solve(new int[] {4,2,2,5,1}, 4, 6));
		System.out.println(s.solve(new int[] {6}, 1, 6));

	}

}
