package dynamicProgramming;

/**
 * Asked in GS
 */
public class OptimalPathInA2DMatrix {
	
	//TC:O(M x N) || SC:O(M x N)
	public int findOptimal(int [][]grid) {
		
		
		int row = grid.length;
		int col = grid[0].length;
		
		int dp[][] = new int[row][col];
		
		dp[row-1][0] = grid[row-1][0];
		
		for(int j=1;j<col;j++) {
			dp[row-1][j] = dp[row-1][j-1] + grid[row-1][j];
		}
		
		for(int i=row-2;i>=0;i--) {
			dp[i][0] = dp[i+1][0] + grid[i][0];
		}
		
		for(int i=row-2;i>=0;i--) {
			for(int j=1;j<col;j++) {
				dp[i][j] = grid[i][j] + Math.max(dp[i+1][j], dp[i][j-1]);
			}
		}
		
		
		
		return dp[0][col-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		0 0 0 5
//		0 1 1 1
//		2 0 0 0
		
		int grid[][] = new int[][] {{0,0,0,4},{0,1,1,1},{2,0,0,0}};
		
		OptimalPathInA2DMatrix o = new OptimalPathInA2DMatrix();
		System.out.println(o.findOptimal(grid));
		

	}

}
