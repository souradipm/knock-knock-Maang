package bitManipulation;

public class NumberOf1Bits {
	
	 public int numSetBits(int A) {
	    
		 int ans = 0;
		 
		 while(A>0) {
			 if((A & 1)==1) {
				 ans++;
			 }
			 A = A>>1;
		 }
		 
		 
	 
	 
		 return ans;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOf1Bits n = new NumberOf1Bits();
		System.out.println(n.numSetBits(5));

	}

}
