package string;

public class OneEdit {

	/**
	 * Return true if two strings can be made equal with single edit by
	 * replace/remove/add 1 char, false otherwise
	 *
	 */
	
	//O(n) time || O(1) space
	public boolean oneEdit(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();

		if (Math.abs(len1 - len2) > 1) {
			return false;
		}

		int l1 = 0, l2 = 0;
		boolean match = false;

		while (l1 < len1 && l2 < len2) {

			if (s1.charAt(l1) != s2.charAt(l2)) {

				if (match) {
					return false;
				} else {
					match = true;
				}

				if (len1 > len2) {
					l1++;
				} else if (len1 < len2) {
					l2++;
				} else if (len1 == len2) {
					l1++;
					l2++;
				}

			} else {
				l1++;
				l2++;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneEdit o = new OneEdit();
		System.out.println(o.oneEdit("hello", "hollo"));

	}

}
