//import java.util.Scanner;
//public class A4Q_11_3 {
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for (int i = 1; i<=n; i++) {
//			for ( int j = 1; j<=n; j++) {
//				if ( j<=n-i )
//					System.out.print(" ");
//				else
//					System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//		sc.close();
//	}
//}
import java.util.Scanner;
public class A4Q_11_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i<=n; i++) {
			int j;
			for (j = n-1; j>=i; j--) {
				System.out.print(" ");
			}
			for ( j = 1; j<=i; j++) {
				System.out.print(i+" ");
			}
				
			System.out.println();
		}
		sc.close();
	}

}
