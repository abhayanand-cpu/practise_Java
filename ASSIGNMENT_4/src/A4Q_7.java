public class A4Q_7 {

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i=1; i<=100; i++) {
			sum1 = sum1+(int)(Math.pow(i, 2));
			sum2 = (sum2+i);
		}
		sum2 = (int)(Math.pow(sum2, 2));
		System.out.println("The sum of the squares of the first one hundered natural numbers is,");
		System.out.println(sum1);
		System.out.println("The square of the sum of the first one hundered natural numbers is,");
		System.out.println(sum2);
		System.out.println("Hence the difference between the sum of the squares of the first one hundered natural numbers\n"
				+ "and the squares of the sum is "+(sum2)+" - "+(sum1)+" = "+(sum2-sum1)+".");
	}

}



//import java.util.Scanner;
//public class A4Q_7 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		
//		int i=Integer.parseInt(s); 
//		System.out.println(i);
//		sc.close();
//	}
//
//}
//import java.util.Scanner;
//public class A4Q_7 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for (int i = 1; i<n; i++) {
//			if(i!=1)
//			System.out.println();
//			for( int j = 1; j<=i; j++) {
//				System.out.print("1");
//		
//			}
//		}
//		for (int i = n; i>=1; i--) {
//			System.out.println();
//			for( int j = 1; j<=i; j++) {
//				System.out.print("1");
//				
//			}
//		}
//		sc.close();
//	}
//
//}
