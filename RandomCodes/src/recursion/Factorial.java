package recursion;

public class Factorial {
	
	public int fact(int A) {
		
		if(A==1) {
			return 1;
		}
		else {
			return A * fact(A-1);
		}
		
	}
	
	 public int solve(int A) {
	    
		 int fact =1;
		 for(int i=1;i<=A;i++) {
			 fact = fact*i;
		 }
		 
		 return fact;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = new Factorial();
//		System.out.println(f.solve(4));
		System.out.println(f.fact(4));

	}

}
