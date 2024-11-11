package bitManipulation;

public class AddBinaryStrings {

	public String addBinary(String A, String B) {

		int i = A.length() - 1;
		int j = B.length() - 1;
		int carry = 0;
		String ans = "";

		while (i >= 0 || j >= 0 || carry > 0) {

			int sum = 0;
			int bit;
			if (i >= 0) {
				sum += A.charAt(i)-'0';
				i--;
			}
			if (j >= 0) {
				sum += B.charAt(j)-'0';
				j--;
			}
			sum += carry;
			bit = sum % 2;
			carry = sum / 2;
//			ans += (bit);
			ans += (bit + '0');
//			ans += (char)(bit + '0');

		}
		
		ans = rev(ans);

		return ans;
	}
	
	public String rev(String str) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		return sb.toString();
		
	}
	
//	public void test() {
////		
//
//		String s = "a00";
//		char c = s.charAt(0);
//		
////		String sum = (char)(c+'0');
//		
//		System.out.println(c);
//		System.out.println(sum);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddBinaryStrings a = new AddBinaryStrings();
		System.out.println(a.addBinary("110", "10"));
//		a.test();

	}

}
