package Java8;

public class Pyramid {
//	
//	input - 1
//           222
//          33333 
//         4444444
	
	
	public void display() {
		
		int n = 4;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=2*i-1;j++) {
				
				System.out.print(i);
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pyramid p = new Pyramid();
		p.display();

	}

}
