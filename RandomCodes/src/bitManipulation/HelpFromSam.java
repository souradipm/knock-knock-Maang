package bitManipulation;

public class HelpFromSam {
	
public int solve(int A) {
	    
		int ans = 0;
		
		for(int i=0;i<32;i++) {
			
			if((A&(1<<i))!=0) {
				ans = (int) (ans + Math.pow(5, i+1));
			}
			
		}
		
		return ans;
		
	}
	
	public int solve2(int A) {
	    
		int count = 0;
		
		for(int i=0;i<32;i++) {
			
			if((A&(1<<i))!=0) {
				count++;
			}
			
		}
		
		return count;
		
	}
	
	public int solve1(int A) {
    
		int count = 0;
		
		while(A>0) {
			if(A%2==0) {
				A = A/2;
			}else {
				A = A-1;
				count++;
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelpFromSam h = new HelpFromSam();
		System.out.println(h.solve(4));

	}

}
