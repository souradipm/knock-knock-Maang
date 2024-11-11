package dynamicProgramming;

public class MaxSumWithoutAdjacentElements {

	public int adjacent(int[][] A) {

		int arr[] = new int[A[0].length];
		int max = Integer.MIN_VALUE;

//		Since we know we have only 2 row, so it can be safe to say, from one column,
//		only the max value can be considered. SO we convert the 2D array to 1D array containing
//		the max value of all the columns

		for (int j = 0; j < A[0].length; j++) {
			max = Math.max(A[0][j], A[1][j]);
			arr[j] = max;
		}

//		From the 1D array created, the max value till a position i can be either
//		1. the max value till the last position (i-1) 
//		OR
//		2. the max value till i-2 poition + the current value.
//		Once we find the max value for all positions i, the value at the last position
//		will the max value that can be created from the array and hence the output.
		int maxV[] = new int[A[0].length];
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				maxV[i] = arr[i];
			} else if (i == 1) {
				maxV[i] = Math.max(arr[i - 1], arr[i]);
			} else {
				maxV[i] = Math.max(maxV[i - 1], maxV[i - 2] + arr[i]);
			}
		}
		return maxV[A[0].length - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSumWithoutAdjacentElements m = new MaxSumWithoutAdjacentElements();
		System.out.println(m.adjacent(new int[][] { { 14, 87, 36, 23 }, { 37, 59, 21, 68 } }));

	}

}
