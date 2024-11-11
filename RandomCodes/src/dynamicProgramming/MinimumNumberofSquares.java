package dynamicProgramming;

public class MinimumNumberofSquares {

	public int countMinSquares(int A) {

		int arr[] = new int[A + 1];
		arr[0] = 0;
		for (int i = 1; i <= A; i++) {
			arr[i] = i;
			for (int j = 1; j * j <= i; j++) {
				arr[i] = Math.min(arr[i], 1 + arr[i - j * j]);
			}
		}

		return arr[A];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumNumberofSquares m = new MinimumNumberofSquares();
		System.out.println(m.countMinSquares(6));

	}

}
