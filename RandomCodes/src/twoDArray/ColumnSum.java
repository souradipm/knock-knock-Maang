package twoDArray;

public class ColumnSum {

	public int[] solve(int[][] A) {

		int arr[] = new int[A[0].length];

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {

				if (arr[j] == 0) {
					arr[j] = A[i][j];
				} else {
					arr[j] += A[i][j];
				}

			}

		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColumnSum c = new ColumnSum();
		int arr [] = c.solve(new int[][] {{1,2,3,4},{5,6,7,8},{9,2,3,4}});
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}
