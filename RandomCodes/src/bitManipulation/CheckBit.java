package bitManipulation;

public class CheckBit {
	
	 public int solve(int A, int B) {
	    
		 
		 if((A & (1<<B))!=0) {
			 return 1;
		 }
		 
	 
	 
		 return 0;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBit c = new CheckBit();
		System.out.println(c.solve(5, 2));

	}

}
