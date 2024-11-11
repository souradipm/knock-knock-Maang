package array;

public class CountOccurences {

	public int solve(int[] A, int B) {

		int count = 0;
		for (int i = 0; i < A.length; i++) {

			if (A[i] == B) {
				count++;
			}

		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOccurences c = new CountOccurences();
		System.out.println(c.solve(new int[] {1,2,2}, 2));

	}

}
