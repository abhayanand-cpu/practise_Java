//import java.util.*;
//public class A5Q7 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number of term: ");
//		int n = sc.nextInt();
//		int sum = 0;
//		
//		for( int i = 1; i<=n; i++) {
//			int num = sc.nextInt();
//			sum += num;
//		}
//		System.out.println("The resultant sum of a number is "+sum);
//		System.out.println("The Average of a number is "+sum/(double)n);
//		sc.close();
//	}
//
//}
import java.util.*;
public class A5Q7 {
	public static void add(int n) {
		Scanner sc1 = new Scanner(System.in); //we can use same object here also
		int sum = 0;
		for( int i = 1; i<=n; i++) {
			int num = sc1.nextInt();
			sum += num;
			
		}
		avg(sum,n);
		sc1.close();
	}
	public static void avg(int sum, int n) {
		System.out.println("Sum = "+sum);
		System.out.println("Avg = "+sum/(double)n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of term: ");
		int n = sc.nextInt();
		add(n);
		
		
		sc.close();
		}
		
		
	}


