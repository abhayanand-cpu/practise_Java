//import java.util.Scanner;
//public class A4Q_9 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int i=1;
//		int num = sc.nextInt();
//		while ( i<=num) {
//			i = i*2;
//		}
//		i = i/2;
//		System.out.println(i);
//		
//	}
//	
//
//}

import java.util.Scanner;
public class A4Q_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int i=1;
		for ( i = 1; i<=n; i++) {
			if ( ((int)(Math.pow(2, i)) > n)) 
				break;
		}
		System.out.println((int)(Math.pow(2, --i)));
		sc.close();
	}
	
	
}