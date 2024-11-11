package array;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

	public int[] plusOne(int[] A) {

		// [9,9,9]
		A = removeLeadingZeros(A);
		int i = A.length - 1;
		int[] B = new int[A.length];
		B[A.length - 1] = 1;
		int j = B.length - 1;
		int carry = 0;

		List<Integer> list = new ArrayList<>();

		while (i >= 0 || j >= 0 || carry > 0) {

			int sum = 0;
			int digit;
			if (i >= 0) {
				sum += A[i];
				i--;
			}

			if (j >= 0) {
				sum += B[j];
				j--;
			}

			sum += carry;
			digit = sum % 10;
			carry = sum / 10;
			list.add(digit);

		}

		int arr[] = new int[list.size()];
		int k = 0;
		for (int ii = list.size() - 1; ii >= 0; ii--) {
			
			arr[k] = list.get(ii);
			k++;
		}
		

		return arr;
	}
	
	
	public int[] removeLeadingZeros(int[]A) {
		
		int idx = -1;
		for(int i=0;i<A.length;i++) {
			if(A[i]!=0) {
				idx = i;
				break;
			}
		}
		
		if(idx==-1) {
			return new int[] {0};
		}
		
		int B[] = new int[A.length-(idx)];
		int k=0;
		for(int i=idx;i<A.length;i++) {
			
			B[k] = A[i];
			k++;
			
		}
		return B;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOne p = new PlusOne();
//		int arr[] = p.plusOne(new int[] { 1, 1, 1, 3, 2, 1, 1, 2, 5, 9, 6, 5 });
		int arr[] = p.plusOne(new int[] { 0,0,0,9,9 });
//		int arr[] = p.plusOne(new int[] { 0,0,0,0,0,0,0 });
//		int arr[] = p.removeLeadingZeros(new int[] { 0,0 });
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
