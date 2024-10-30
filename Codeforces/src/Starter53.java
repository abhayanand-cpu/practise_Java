import java.util.Scanner;
public class Starter53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		for( int i = 0; i < t; i++ ) {
//			int d = sc.nextInt();
//			if( d <= 300 )
//				System.out.println(300*10);
//			else
//				System.out.println(d*10);
//		}
		
//		int t = sc.nextInt();
//		for( int i = 0; i < t; i++ ) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			int c = sc.nextInt();
//			double e = (a + b) / 2.0;
//			if( e > c )
//				System.out.println("YES");
//			else
//				System.out.println("NO");
//		}
//		sc.close();
		
		int t = sc.nextInt();
		for( int i = 0; i < t; i++ ) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			
			double bc = b + c;
			double bd = b + d;
			double cd = c + d;
			
			if( a == bc || a == bd || a == cd || a == b || a == c || a == d )
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
