package other;

public class CountFactor {
	
	 public int solve(int A) {

	        int count = 0;
			int num = (int) Math.sqrt(A);
	        for(int i=1;i<=num;i++){

	            if(A%i==0){
	                if(i!=A/i){
	                    count+=2;
	                }else{
	                    count+=1;
	                }
	                
	            }
	        }
	        return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountFactor c = new CountFactor();
		System.out.println(c.solve(100));

	}

}
