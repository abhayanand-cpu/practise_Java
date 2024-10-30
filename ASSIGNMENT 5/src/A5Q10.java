//import java.util.*;
//public class A5Q10 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double x = sc.nextInt(); 
//		int n = sc.nextInt();
//		
//		x = (int)Math.pow(x,n);
//		int product = 1;
//		
//		for(int i = 1; i<=n; i++) {
//			product *= i;
//		}
//		double comp = x/product;
//		System.out.println("Computation is "+comp);
//		sc.close();
//	}
//
//}
import java.util.*;
public class A5Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		double x = sc.nextDouble();
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		
		x = (int)Math.pow(x,n);
		
		double comp = x/factorial(n);
		System.out.println("Computation is "+comp);
		sc.close();
	}


	public static int factorial(int n){
	int factorial = 1;
	
		for(int i = 1; i<=n; i++) {
			factorial *= i;
			
		}
		return factorial;
	}
}