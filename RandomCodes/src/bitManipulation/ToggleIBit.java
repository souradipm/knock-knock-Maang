package bitManipulation;

public class ToggleIBit {
	
	public int solve(int A, int B) {
    
		A = (A^(1<<B));
		
		
	
		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToggleIBit t = new ToggleIBit();
		System.out.println(t.solve(4, 1));

	}

}
