package ASSIGNMENT_2;
import java.util.Scanner;

public class nth_fibbonaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		
		for( int i = 2; i <= n; i++ ) {
			c = a + b;
			a = b;
			b = c;
		}
		
		System.out.println(n+"th fibonacci number is "+c);
		
		sc.close();
	}

}
