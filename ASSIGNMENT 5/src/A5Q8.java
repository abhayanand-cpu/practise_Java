//import java.util.*;
//public class A5Q8 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number of terms: ");
//		int num = sc.nextInt();
//		double sum = 0,n;
//		for(int i = 0; i<num; i++) {
//			System.out.print("Enter The terms: ");
//			int a = sc.nextInt();
//			n = (1/(double)a);
//			sum += n;
//		}
//		System.out.println("The harmonic mean of the given series is "+num/sum);
//		sc.close();
//	}
//
//}
import java.util.*;  // same question solve using methods.
public class A5Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int num = sc.nextInt();
		double sum = 0,n;
		for(int i = 0; i<num; i++) {
			System.out.print("Enter The terms: ");
			int a = sc.nextInt();
			n = (1/(double)a);
			sum += n;
		}
		System.out.println("The harmonic mean of the given series is "+num/sum);
		sc.close();
	}

}