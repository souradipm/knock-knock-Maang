package string;

import java.util.HashSet;
import java.util.Set;

public class StringTest {
	
	public int longestSubString(String A) {
		
		int max = Integer.MIN_VALUE;
		if(A.length()==0) {
			return 0;
		}else if(A.length()==1) {
			return 1;
		}else {
			
			Set<Character> set = new HashSet<>();
			
			int count = 0;
			
			for(int i=0;i<A.length();i++) {
				
				if(!set.contains(A.charAt(i))) {
					
					count++;
					set.add(A.charAt(i));
					max = Math.max(max, count);
					
				}else {
					
					
					
				}
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
