//import java.util.Scanner;
//public class A4Q_5 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter range: ");
//		int n = sc.nextInt();
//		int sum = 0;
//		for (int i = 1; i<=n; i++) {
//			if ( i%2==0 ) {
//				System.out.print(i);
//				if ((i!=n) && (i!=n-1))
//				System.out.print(" + ");
//				sum = sum+i;
//			}
//			
//		}
//		System.out.print(" = "+sum);
//		System.out.println();
//		int product = 1;
//		for (int i = 1; i<=n; i++) {
//			if ( i%2!=0) {
//				System.out.print(i);
//				if ((i!=n) && (i!=n-1))
//				System.out.print(" * ");
//				product = product*i;
//			}
//		}
//		System.out.print(" = "+product);
//		sc.close();
//	}
//
//}







import java.util.Scanner;
public class A4Q_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i<=n; i++) {
			
			if ( i%2==0 ) 
				sum = sum+i;
		}
		System.out.print("sum of all even number upto range =  "+sum);
		System.out.println();
		int product = 1;
		for (int i = 1; i<=n; i++) {
			
			if ( i%2!=0) 
			product = product*i;
		}
		System.out.print("product of all odd number upto range =  "+product);
		sc.close();
	}

}