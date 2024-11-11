package subArray;

public class GenerateAllSubArray {

	public int[][] solve(int[] A) {

		int n = A.length;
		int row = n * (n + 1) / 2;
		int arr[][] = new int[row][];
		int idx = 0;
		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {

				int len = j - i + 1;
				arr[idx] = new int[len];

				for (int k = i, l = 0; k <= j; k++, l++) {

					arr[idx][l] = A[k];
				}
				idx++;

			}
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateAllSubArray g = new GenerateAllSubArray();

		int B[][] = g.solve(new int[] { 3562,42160,37854,48802,71740,61054,54878,20487 });
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}

//		System.out.println(g.solve(new int[] {1,2,3}));

	}

}
