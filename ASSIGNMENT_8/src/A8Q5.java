
//import java.util.Scanner;
//public class A8Q5 {
//	public static double max(double[] array) {   // Largest number
//		
//		double max = array[0];
//		int i;
//		for( i = 0; i < array.length; i++ ) {
//			if( array[i] > max )
//				max = array[i];
//		}
//		return max;
//		
//	}
//public static double SecondL(double[] array) {    //Second largest number
//		double m = max(array);
//		double sm = array[0];
//		System.out.println(m);
//		for( int i = 0; i < array.length; i++ ) {
//			if( array[i] == m )
//				continue;
//			if( array[i] > sm )
//				sm = array[i];
//		}
//		return sm;
//		
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		double array[] = new double[10];
//		System.out.print("Enter 10 elements: ");
//		for( int i = 0; i < array.length; i++ ) {
//			double element = sc.nextDouble();
//			array[i] = element;
//		}
//		
//		System.out.println("Second largest number in array is: "+(SecondL(array)));
//		sc.close();
//	}
//
//}

import java.util.Scanner;
public class A8Q5 {
	public static void Sorting(double[] array) {   
		int l = array.length - 1;
		double c = 0;
		for( int i = 0; i < l; i++ ) {
			for( int j = 0; j < l - i; j++ ) {
				if( array[j] > array[j+1] ) {
					c = array[j];
					array[j] = array[j+1];
					array[j+1] = c;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of desired element: ");
		int n = sc.nextInt();
		double array[] = new double[n];
		System.out.print("Enter "+n+" elements: ");
		for( int i = 0; i < n; i++ ) {
			double element = sc.nextDouble();
			array[i] = element;
		}
		Sorting(array);
		
		System.out.println("Second largest number in array is: "+array[n-2]);
		sc.close();
	}

}
