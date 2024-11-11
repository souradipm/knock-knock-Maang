package other;

import java.util.Scanner;

public class FractionSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
//		Scanner sc = new Scanner(System.in);
//        int Fraction1[] = new int[2];
//        int Fraction2[] = new int[2];
//        int Fraction[] = new int[2];
//        
//        System.out.println("enter numerator for fraction 1: ");
//
//		Fraction1[0] = sc.nextInt();
//
//		System.out.println("enter denominator for fraction 1: ");
//
//		Fraction1[1] = sc.nextInt();
//
//		System.out.println("enter numerator for fraction 2: ");
//
//		Fraction2[0] = sc.nextInt();
//
//		System.out.println("enter denominator for fraction 2: ");
//
//		Fraction2[1] = sc.nextInt();
//
//		Fraction[0] = Fraction1[0] * Fraction2[1] + Fraction1[1] * Fraction2[0];
//
//		Fraction[1] = Fraction1[1] * Fraction2[1];
//
//		System.out.println("final result: " + "[" + Fraction[0] + "," + Fraction[1] + "]");
		
		
		int a[][]= {{2,3},{1,2}};

		int c[]= new int[2];

		c[0]=((a[0][0]*a[1][1])+(a[0][1]*a[1][0]));

		c[1]=(a[0][1]*a[1][1]);

		System.out.println("["+c[0]+","+c[1]+"]");

	}

}
