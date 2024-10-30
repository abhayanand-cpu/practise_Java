//import java.util.Arrays;
//import java.util.Scanner;
//public class A1Q8 {
//	
//	static double[] dotProduct( int a[][], int b[][], int n ) {
//		double c[] = new double[n];
//		
//		for( int i = 0; i < n; i++ ) {
//			for( int j = 0; j < 1; j++ ) {
//				c[i] = ( a[i][j] * b[i][j] ) + ( a[i][j+1] * b[i][j+1] );
//			}
//		}
//		return c;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter no. of integer you wanna store: ");
//		int n = sc.nextInt();
//		int a[][] = new int[n][2];
//		int b[][] = new int[n][2];
//		
//		for( int i = 0; i < n; i++ ) {
//			for( int j = 0; j < 2; j++ ) {
//				System.out.print("Enter value of a"+(j+1)+": ");
//				a[i][j] = sc.nextInt();
//				System.out.print("Enter value of b"+(j+1)+": ");
//				b[i][j] = sc.nextInt();
//			}
//			
//		}
//		System.out.println( Arrays.toString(dotProduct(a,b,n)) );
//		
//		sc.close();
//	}
//
//}
import java.util.Arrays;
import java.util.Scanner;
public class A1Q8 {
	
	static double[] dotProduct( int a[], int b[], int n ) {
		double c[] = new double[n];
		
		for( int i = 0; i < n; i++ ) {
			c[i] = a[i] * b[i] ;
		}
		
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of integer you wanna store: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		for( int i = 0; i < n; i++ ) {
			System.out.print("Enter value of a"+(i+1)+": ");
			a[i] = sc.nextInt();
			System.out.print("Enter value of b"+(i+1)+": ");
			b[i] = sc.nextInt();
		}
		System.out.println( Arrays.toString(dotProduct(a,b,n)) );
		
		sc.close();
	}

}