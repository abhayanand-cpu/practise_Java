//import java.util.Scanner;
//public class A5Q21 {
//	public static void oddNumber(int n){
//		for(int i = 2; i <= n; i++) {
//			if( n % i == 0 && n != i ) {
//				System.out.println(n+" is not a prime number.");
//				break;
//			}
//			else if( n == i )
//				System.out.println(n+" is a prime number.");
//		}
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		oddNumber(n);
//		sc.close();
//	}
//
//}
import java.util.Scanner;
public class A5Q21 {
	public static void oddNumber(int n){
		int i;
		for( i = 2; i < n; i++) {
			if( n % i == 0 ) {
				System.out.println(n+" is not a prime number.");
				break;
			}
		}
		if( n == i )
		System.out.println(n+" is a prime number.");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		oddNumber(n);
		sc.close();
	}

}

