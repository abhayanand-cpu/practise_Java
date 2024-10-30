//import java.util.*;
//public class A5Q11 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number of itration: ");
//		int n = sc.nextInt();
//		System.out.print("Enter the value of sin: ");
//		double x = sc.nextDouble();
//		int count = 1;
//		double Final2 = 0;
//		for(int i = 0; i<n; i++) {
//			double sign = Math.pow(-1, i);
//			
//			double cal = Math.pow(x, count)*sign;
//			double fact = 1;
//			for(int j=1; j<=count; j++) {
//				fact *= j;
//			}
//			
//			double Final = cal/fact;
//			 Final2 = Final+Final2;
//			count += 2;
//		}
//		
//		System.out.println("sin"+"("+x+") = "+Math.sin(Final2));
//		sc.close();
//	}
//
//}

import java.util.*;
public class A5Q11 {
	public static int factorial(int count) {
		int fact = 1;
		for(int j=1; j<=count; j++) {
			fact *= j;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		float x = sc.nextFloat();
		x = (float)Math.toRadians(x);
		
		int sign = -1;
	    float error = 0.000001f,series = 0,Final = 0,countFact;
		int count = 1;
		while( error <= Math.abs( Math.sin(x) - Final )) {
			countFact = factorial(count);
			sign *= -1;
			series = sign*(float)(Math.pow(x, count)/countFact);
			Final += series;
			count += 2;
		}
		System.out.println(Final);

		sc.close();
	}

}

