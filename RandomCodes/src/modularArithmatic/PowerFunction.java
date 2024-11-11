package modularArithmatic;

public class PowerFunction {

//	public int pow(int A, int B, int C) {
		// Just write your code below to complete the function. Required input is
		// available to you as the function arguments.
		// Do not print the result or any output. Just return the result via this
		// function.

		public int pow(int A, int B, int C) {
			  long ans = power(A, B, C);
		        // For handling negative cases, if a < 0 => (a % m + m) %m
		     ans = (ans % C + C ) % C;
		       
		      return (int)ans;
		     
		    }

		    public static long power(int A, int B, int C){
		        if(A == 0){
		        return 0;
		        }

		        if(A != 0 && B == 0){
		            return 1;
		        }

		        long t = power(A, B/2, C);

		        if(B % 2 == 0){
		            return (long) (t  * t )% C;
		        }else{
		            return (long)((t  * t )% C * A% C) % C;
		        }
		    
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
