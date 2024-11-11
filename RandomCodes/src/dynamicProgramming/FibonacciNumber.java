package dynamicProgramming;

import java.util.Scanner;

public class FibonacciNumber {
	
	
	public int fibo(int A, int []arr) {
		
		
		if(A<=1) {
			return A;
		}
		
		if(arr[A]!=-1) {
			return arr[A];
		}
		
		arr[A] = fibo(A-1,arr) + fibo(A-2,arr);
		
		
		
		return arr[A];
		
	}

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int A=sc.nextInt();
		int arr[] = new int[A+1];
		
		for(int i=0;i<=6;i++) {
			arr[i] = -1;
		}
		
		FibonacciNumber f = new FibonacciNumber();
		System.out.println(f.fibo(A,arr));
		
		

	}

}
