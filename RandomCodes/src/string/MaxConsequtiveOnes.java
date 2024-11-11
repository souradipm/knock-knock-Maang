package string;

public class MaxConsequtiveOnes {

	public int solve(String A) {

		// 1 1 1 0 1 1 1 0 1
		int len = A.length();

		// count total number of 1
		int count_1 = 0;
		for (int i = 0; i < len; i++) {
			if (A.charAt(i) == '1') {
				count_1++;
			}
		}

		// have 2 arrays, left and right and get the 1s to the left and right of idx
		int[] left = new int[len];
		int[] right = new int[len];

		if (A.charAt(0) == '1') {
			left[0] = 1;
		}

		if (A.charAt(len - 1) == '1') {
			right[len - 1] = 1;
		}

		for (int i = 1; i < len; i++) {

			if (A.charAt(i) == '1') {
				left[i] = left[i - 1] + 1;
			}

		}

		for (int i = len - 2; i >= 0; i--) {

			if (A.charAt(i) == '1') {
				right[i] = right[i + 1] + 1;
			}

		}

		// find max 1 to the left and right of each idx
		int maxCount = 0;
		for (int i = 0; i < len; i++) {

			maxCount = Math.max(maxCount, Math.max(left[i], right[i]));

		}

		// get the max count

		for (int i = 1; i < len - 1; i++) {

			if (A.charAt(i) == '0') {
				int count = left[i - 1] + right[i + 1];
				if (count < count_1) {
					count++;
				}
				maxCount = Math.max(maxCount, count);
			}

		}

		return maxCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxConsequtiveOnes m = new MaxConsequtiveOnes();
		System.out.println(m.solve("111011101"));

	}

}
