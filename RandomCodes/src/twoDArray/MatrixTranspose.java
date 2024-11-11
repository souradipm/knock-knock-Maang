package twoDArray;

public class MatrixTranspose {

	public int[][] solve(int[][] A) {
		
		 int tx[][] = new int[A[0].length][A.length];	
			for (int i = 0; i < tx.length; i++) {
				for (int j = 0; j < tx[i].length; j++) {		
					tx[i][j] = A[j][i];				
				}
			}
			return tx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixTranspose m = new MatrixTranspose();
		int [][]arr = m.solve(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j]);

			}
			System.out.println();

		}

	}

}
