//import java.util.ArrayList;
import java.util.Scanner;
public class Resurssion{
	
	static int factorial( int n ) {
		if( n <= 1 )
			return 1;
		else
			return n * factorial(n-1);
	}
	
	static void pattern( int n ) {
		
		if( n == 0 )
			return;
		
		for( int i = 1; i <= n; i++ ) {
			System.out.print(i);
		}
		System.out.println();
		pattern( n - 1 );
		
	}
	
	static int Fibonacci( int n ) {
		
		if( n == 1 ) {
			return 0;
		}
		
		if ( n == 2 )
			return 1;
		
		return (Fibonacci( n - 2 ) + Fibonacci( n - 1 ));
		
	}
	
	static void Pattern1( int  n ) {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
		pattern(n);
		System.out.println(Fibonacci( n ));
		sc.close();
	}
}