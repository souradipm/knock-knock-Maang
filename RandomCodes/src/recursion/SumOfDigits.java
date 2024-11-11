package recursion;

public class SumOfDigits {
	
	public int digitSum(int A, int sum) {
		
		if(A<1) {
			return sum;
		}
		int s = sum;
		int t = A%10;
		s+=t;
		A = A/10;
		return digitSum(A,s);
		
		
	}
	
	
	public int solve(int A) {
		
		return digitSum(A,0);
		
	}
	

	public int solve1(int A) {

		int sum = 0;
		while (A > 0) {

			int t = A % 10;
			sum += t;
			A = A / 10;

		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigits s = new SumOfDigits();
		System.out.println(s.solve(12));

	}

}
