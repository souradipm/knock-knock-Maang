package dynamicProgramming;

public class UniquePathsinAGrid {
	
	 public int uniquePathsWithObstacles(int[][] A) {
	    
		 int dp[][] = new int[A.length][A[0].length];
		 
		 for(int i=0;i<A.length;i++) {
			 
			 for(int j=0;j<A[i].length;j++) {
				 
				
				 if(A[i][j] == 1) {
					 dp[i][j] = 0;
				 }else {
					 
					 if(i==0) {
						 dp[i][j] = j==0?1:dp[i][j-1];
					 }else if(j==0) {
						 dp[i][j] = i==0?1:dp[i-1][j];
					 }else {
						 dp[i][j] = dp[i][j-1] + dp[i-1][j];
					 }
				 }
			 }
		 }
		 return dp[A.length-1][A[0].length-1];
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePathsinAGrid u = new UniquePathsinAGrid();
		System.out.println(u.uniquePathsWithObstacles(new int[][] {{0,0,0},{0,0,0},{0,0,0}}));

	}

}
