package string;

public class ToggleCase {
	
	public String solve(String A) {
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<A.length();i++) {
			
			if(A.charAt(i)>='A' && A.charAt(i)<='Z') {
				
				char c = A.charAt(i);
				char d = (char) (c+32);
				sb.insert(i, d);
			}else {
				
				char c = A.charAt(i);
				char d = (char) (c-32);
				sb.insert(i, d);
				
			}
			
		}
    
	
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToggleCase t = new ToggleCase();
		System.out.println(t.solve("heLLo"));

	}

}
