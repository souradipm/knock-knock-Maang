package string;

public class CountOccurences {

	public int solve(String A) {

		int count = 0;
		int i = 0, j = 2;

		while (j < A.length()) {

			if (A.substring(i, j + 1).equals("bob")) {
				count++;
			}
			i++;
			j++;

		}

		return count;
	}

	public int solve1(String A) {

		// abobc
		int l = 0;
		int r = 2;
		int count = 0;
		StringBuilder sb = new StringBuilder();
		StringBuilder bob = new StringBuilder("bob");

		for (int i = l; i <= r; i++) {
			sb.append(A.charAt(i));
			if (sb.compareTo(bob) == 0) {
				count++;
			}
		}

		while (r < A.length()) {

			r++;
			sb.deleteCharAt(0);
			sb.append(A.charAt(r));
			if (sb.compareTo(bob) == 0) {
				count++;
			}

		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOccurences c = new CountOccurences();
		System.out.println(c.solve("abobo"));
		System.out.println(c.solve("bobob"));

	}

}
