package string;

public class Flip {

	/*
	 * You are given a binary string A(i.e., with characters 0 and 1) consisting of
	 * characters A1, A2, ..., AN. In a single operation, you can choose two
	 * indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1,
	 * ..., AR. By flipping, we mean changing character 0 to 1 and vice-versa. Your
	 * aim is to perform ATMOST one operation such that in the final string number
	 * of 1s is maximized. If you don't want to perform the operation, return an
	 * empty array. Else, return an array consisting of two elements denoting L and
	 * R. If there are multiple solutions, return the lexicographically smallest
	 * pair of L and R. NOTE: Pair (a, b) is lexicographically smaller than pair (c,
	 * d) if a < c or, if a == c and b < d.
	 */
	public int[] flip(String A) {  //Follow Kadens Algo

		int l = 0, r = 0, cSum = 0, mSum = 0;
		int[] ans = new int[2];

		for (int i = 0; i < A.length(); i++) {

			char ch = A.charAt(i);
			if (ch == '1') {
				cSum--;
			} else {
				cSum++;
			}
			
			if (cSum > mSum) {

				mSum = cSum;
				ans[0] = l + 1;
				ans[1] = r + 1;

			} else if (cSum < 0) {

				cSum = 0;
				l = i + 1;
				r = i + 1;

			} else {
				r++;
			}

		}

		return mSum == 0?new int[] {}:ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flip f = new Flip();
		int arr[] = f.flip("0011101");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
